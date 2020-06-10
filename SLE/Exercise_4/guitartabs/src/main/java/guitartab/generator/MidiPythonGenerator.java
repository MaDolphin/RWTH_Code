// (c) https://github.com/MontiCore/monticore
package guitartab.generator;

import de.monticore.ast.ASTNode;
import de.monticore.generating.GeneratorEngine;
import de.monticore.generating.GeneratorSetup;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import freemarker.template.Configuration;
import freemarker.template.DefaultObjectWrapper;
import freemarker.template.Template;
import freemarker.template.TemplateException;


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

    //TODO: Write Me (Exercise 3.1)
    public static void main(String[] args) throws IOException, TemplateException {

        String templateName = "/MidiGenerator.ftl";
        String Path = "src/main/resources/templates";
        ASTNode astNode;

        GeneratorEngine generatorEngine = new GeneratorEngine();



        String dir = "src/main/resources/templates";
        Configuration conf = new Configuration();
        conf.setDirectoryForTemplateLoading(new File(dir));
        Template template = conf.getTemplate("/MidiGenerator.ftl");

        Map root = new HashMap();
        List<Map> maps = new ArrayList<Map>();
        Map pms1 = new HashMap();
        pms1.put("pitch", "26");
        pms1.put("time", "2");
        pms1.put("duration", "1");
        Map pms2 = new HashMap();
        pms2.put("pitch", "21");
        pms2.put("time", "9");
        pms2.put("duration", "3");
        maps.add(pms1);
        maps.add(pms2);
        root.put("guitarTabMap", maps);

        // output
        Writer out = new FileWriter(dir + "/MidiGenerator.python");
        template.process(root, out);
        System.out.println("success");
        out.flush();
        out.close();
    }
}
