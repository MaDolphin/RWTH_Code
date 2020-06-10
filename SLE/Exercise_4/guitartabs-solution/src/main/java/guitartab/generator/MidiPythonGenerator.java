// (c) https://github.com/MontiCore/monticore
package guitartab.generator;

import de.monticore.generating.GeneratorEngine;
import de.monticore.generating.GeneratorSetup;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

import guitartab._ast.ASTTab;

/**
 * Generates a python file that generates a MIDI file
 * Overall generation process:
 * Tab File -> MontiCore -> Python File -> MIDI file
 *
 * @author (last commit) kirchhof
 * @version 0.1, 18.03.2019
 * @since 0.1
 */
public class MidiPythonGenerator {
  /**
   * Generate a python file for generating a MIDI file
   *
   * @param ast the ASTTab to create the music from
   */
  public static Path generate(ASTTab ast) {
    GeneratorSetup setup = new GeneratorSetup();
    setup.setTracing(false);

    GeneratorEngine engine = new GeneratorEngine(setup);

    // Generate Python file
    File outputDir = new File(System.getProperty("user.dir") + File.separator + "target");
    Path pythonOutputFile = Paths.get(outputDir.getAbsolutePath(), "Generator.py");
    engine.generate("templates/MidiGenerator.ftl", pythonOutputFile, ast);

    return pythonOutputFile;
  }
}
