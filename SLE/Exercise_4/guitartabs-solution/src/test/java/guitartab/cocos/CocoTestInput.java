// (c) https://github.com/MontiCore/monticore
package guitartab.cocos;

import guitartab._ast.ASTTab;
import guitartab._cocos.GuitarTabCoCoChecker;

/**
 * Wrapper for test input data
 *
 * @author (last commit) kirchhof
 * @version 1.0, 01.03.2019
 * @since 1.0
 */
public class CocoTestInput {

  /** The AST to execute the test on */
  private ASTTab ast;

  /** The checker that executes the CoCo (i.e. the system under test) */
  private GuitarTabCoCoChecker checker;

  /* ============================================================ */
  /* ====================== GENERATED CODE ====================== */
  /* ============================================================ */

  public CocoTestInput(ASTTab ast, GuitarTabCoCoChecker checker) {
    this.ast = ast;
    this.checker = checker;
  }

  public ASTTab getAst() {
    return ast;
  }

  public GuitarTabCoCoChecker getChecker() {
    return checker;
  }
}
