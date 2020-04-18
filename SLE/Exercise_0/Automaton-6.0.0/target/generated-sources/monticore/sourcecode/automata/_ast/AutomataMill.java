/* generated from model Automata */
/* generated by template core.Class*/

/* (c) https://github.com/MontiCore/monticore */
package automata._ast;

/* generated by template core.Imports*/

import java.util.*;
import java.util.function.*;
import java.util.stream.Stream;
import de.se_rwth.commons.logging.Log;
import de.monticore.ast.ASTNode;
import de.monticore.ast.Comment;
import de.se_rwth.commons.SourcePosition;
import de.monticore.symboltable.*;
import de.monticore.ast.ASTCNode;


 public  class AutomataMill  {

    /* generated by template core.Attribute*/
 protected  static  AutomataMill mill ;

    /* generated by template core.Attribute*/
 protected  static  AutomataMill millASTAutomaton ;

    /* generated by template core.Attribute*/
 protected  static  AutomataMill millASTState ;

    /* generated by template core.Attribute*/
 protected  static  AutomataMill millASTTransition ;


    /* generated by template core.Constructor*/
 protected  AutomataMill()  {
    /* generated by template core.EmptyBody*/
// empty body

}


    /* generated by template core.Method*/
 protected  static  AutomataMill getMill ()  {
      /* generated by template _ast.mill.GetMillMethod*/

  if (mill == null) {
    mill = new AutomataMill();
  }
  return mill;
}

    /* generated by template core.Method*/
 public  static  void initMe (AutomataMill a)  {
      /* generated by template _ast.mill.InitMeMethod*/

    mill = a;
    millASTAutomaton = a;
    millASTState = a;
    millASTTransition = a;

}

    /* generated by template core.Method*/
 public  static  void init ()  {
      /* generated by template _ast.mill.InitMethod*/

    mill = new AutomataMill();
    de.monticore.mcbasics._ast.MCBasicsMill.initMe(new MCBasicsMillForAutomata());

}

    /* generated by template core.Method*/
 public  static  void reset ()  {
      /* generated by template _ast.mill.ResetMethod*/

    mill = null;
    millASTAutomaton = null;
    millASTState = null;
    millASTTransition = null;
    de.monticore.mcbasics._ast.MCBasicsMill.reset();

}

    /* generated by template core.Method*/
 public  static  ASTAutomatonBuilder automatonBuilder ()  {
      /* generated by template _ast.mill.BuilderMethod*/

  if (millASTAutomaton == null) {
    millASTAutomaton = getMill();
  }
  return millASTAutomaton._automatonBuilder();

}

    /* generated by template core.Method*/
 protected  ASTAutomatonBuilder _automatonBuilder ()  {
      /* generated by template _ast.mill.ProtectedBuilderMethod*/

  return new ASTAutomatonBuilder();
}

    /* generated by template core.Method*/
 public  static  ASTStateBuilder stateBuilder ()  {
      /* generated by template _ast.mill.BuilderMethod*/

  if (millASTState == null) {
    millASTState = getMill();
  }
  return millASTState._stateBuilder();

}

    /* generated by template core.Method*/
 protected  ASTStateBuilder _stateBuilder ()  {
      /* generated by template _ast.mill.ProtectedBuilderMethod*/

  return new ASTStateBuilder();
}

    /* generated by template core.Method*/
 public  static  ASTTransitionBuilder transitionBuilder ()  {
      /* generated by template _ast.mill.BuilderMethod*/

  if (millASTTransition == null) {
    millASTTransition = getMill();
  }
  return millASTTransition._transitionBuilder();

}

    /* generated by template core.Method*/
 protected  ASTTransitionBuilder _transitionBuilder ()  {
      /* generated by template _ast.mill.ProtectedBuilderMethod*/

  return new ASTTransitionBuilder();
}

}
