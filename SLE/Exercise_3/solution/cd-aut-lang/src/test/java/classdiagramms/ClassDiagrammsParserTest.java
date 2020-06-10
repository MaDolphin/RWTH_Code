package classdiagramms;// (c) https://github.com/MontiCore/monticore
/*
 * Copyright (c) 2017, MontiCore. All rights reserved.
 *
 * http://www.se-rwth.de/
 */

import classdiagrams._ast.ASTCDCompilationUnit;
import classdiagrams._parser.ClassDiagramsParser;
import de.se_rwth.commons.logging.Log;
import org.junit.BeforeClass;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.io.IOException;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

public class ClassDiagrammsParserTest {

  @BeforeClass
  public static void disableFailQuick() {
    Log.enableFailQuick(false);
  }

  @ParameterizedTest
  @CsvSource({ "src/test/resources/PingPongCD.cd",
      "src/test/resources/FootballGameCD.cd"})
  public void testParsePingPongCD(String modelFilePath) throws IOException {
    ClassDiagramsParser parser = new ClassDiagramsParser();
    Optional<ASTCDCompilationUnit> result = parser.parse(modelFilePath);
    assertThat(result).isPresent();
  }

}
