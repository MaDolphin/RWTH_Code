// (c) https://github.com/MontiCore/monticore
package guitartab.cocos;

import de.se_rwth.commons.logging.Finding;
import de.se_rwth.commons.logging.Log;
import guitartab.AbstractTest;
import guitartab._ast.ASTTab;
import guitartab._cocos.GuitarTabCoCoChecker;

import java.util.*;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Utils for tests
 *
 * @author (last commit) kirchhof
 * @version 1.0, 01.03.2019
 * @since 1.0
 */
public class AbstractCocoTest extends AbstractTest {

  /**
   * Prepare the inputs needed for executing a coco
   * @param pathToModelFile file path to a .tab file
   * @return An AST and a coco checker
   */
  public CocoTestInput prepareTest(String pathToModelFile) {
    // prepare input
    ASTTab ast = parseModel(pathToModelFile);
    GuitarTabCoCoChecker checker = new GuitarTabCoCoChecker();

    // bundle input
    return new CocoTestInput(ast, checker);
  }

  public void executeCoCo(CocoTestInput input) {
    input.getChecker().checkAll(input.getAst());
  }

  public void checkResults(String expectedError) {
    checkResults(Collections.singletonList(expectedError));
  }

  public void checkResults(Collection<String> expectedErrors) {
    Collection<Finding> findings = Log.getFindings();
    List<Finding> expectedFindings = expectedErrors.stream()
        .map(Finding::error)
        .collect(Collectors.toList());
    assertThat(findings).containsExactlyElementsOf(expectedFindings);
  }

}
