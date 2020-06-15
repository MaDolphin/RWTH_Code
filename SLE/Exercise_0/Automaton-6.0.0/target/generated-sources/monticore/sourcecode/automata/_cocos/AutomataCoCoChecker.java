/* generated from model Automata */
/* generated by template core.Class*/

/* (c) https://github.com/MontiCore/monticore */
package automata._cocos;

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

/* generated by template core.Annotations*/
// empty template

 public  class AutomataCoCoChecker  implements automata._visitor.AutomataInheritanceVisitor {

    /* generated by template core.Attribute*/
 private  automata._visitor.AutomataVisitor realThis = this;

    /* generated by template core.Attribute*/
 private  List<automata._cocos.AutomataCoCoChecker> automata__cocos_AutomataCoCoChecker = new ArrayList<>();

    /* generated by template core.Attribute*/
 private  Collection<automata._cocos.AutomataASTAutomatonCoCo> automata__ast_ASTAutomatonCoCos = new LinkedHashSet<>();

    /* generated by template core.Attribute*/
 private  Collection<automata._cocos.AutomataASTStateCoCo> automata__ast_ASTStateCoCos = new LinkedHashSet<>();

    /* generated by template core.Attribute*/
 private  Collection<automata._cocos.AutomataASTTransitionCoCo> automata__ast_ASTTransitionCoCos = new LinkedHashSet<>();

    /* generated by template core.Attribute*/
 private  Collection<automata._cocos.AutomataASTAutomataNodeCoCo> automata__ast_ASTAutomataNodeCoCos = new LinkedHashSet<>();

    /* generated by template core.Attribute*/
 private  List<de.monticore.mcbasics._cocos.MCBasicsCoCoChecker> de_monticore_mcbasics__cocos_MCBasicsCoCoChecker = new ArrayList<>(Arrays.asList(new de.monticore.mcbasics._cocos.MCBasicsCoCoChecker()));


    /* generated by template core.Constructor*/
 public  AutomataCoCoChecker()  {
    /* generated by template core.EmptyBody*/
// empty body

}


    /* generated by template core.Method*/
 public  automata._visitor.AutomataVisitor getRealThis ()  {
      /* generated by template methods.Get*/

return this.realThis;

}

    /* generated by template core.Method*/
 public  void setRealThis (automata._visitor.AutomataVisitor realThis)  {
      /* generated by template methods.Set*/

this.realThis = realThis;

}

    /* generated by template core.Method*/
 public  void addChecker (automata._cocos.AutomataCoCoChecker checker)  {
      this.automata__cocos_AutomataCoCoChecker.add(checker);
}

    /* generated by template core.Method*/
 public  void checkAll (automata._ast.ASTAutomataNode node)  {
      node.accept(getRealThis());
}

    /* generated by template core.Method*/
 public  automata._cocos.AutomataCoCoChecker addCoCo (automata._cocos.AutomataASTAutomatonCoCo coco)  {
      automata__ast_ASTAutomatonCoCos.add(coco);
return this;
}

    /* generated by template core.Method*/
 public  void visit (automata._ast.ASTAutomaton node)  {
      for (automata._cocos.AutomataASTAutomatonCoCo coco : automata__ast_ASTAutomatonCoCos) {
coco.check(node);
}
// and delegate to all registered checkers of the same language as well
automata__cocos_AutomataCoCoChecker.stream().forEach(c -> c.visit(node));
}

    /* generated by template core.Method*/
 public  automata._cocos.AutomataCoCoChecker addCoCo (automata._cocos.AutomataASTStateCoCo coco)  {
      automata__ast_ASTStateCoCos.add(coco);
return this;
}

    /* generated by template core.Method*/
 public  void visit (automata._ast.ASTState node)  {
      for (automata._cocos.AutomataASTStateCoCo coco : automata__ast_ASTStateCoCos) {
coco.check(node);
}
// and delegate to all registered checkers of the same language as well
automata__cocos_AutomataCoCoChecker.stream().forEach(c -> c.visit(node));
}

    /* generated by template core.Method*/
 public  automata._cocos.AutomataCoCoChecker addCoCo (automata._cocos.AutomataASTTransitionCoCo coco)  {
      automata__ast_ASTTransitionCoCos.add(coco);
return this;
}

    /* generated by template core.Method*/
 public  void visit (automata._ast.ASTTransition node)  {
      for (automata._cocos.AutomataASTTransitionCoCo coco : automata__ast_ASTTransitionCoCos) {
coco.check(node);
}
// and delegate to all registered checkers of the same language as well
automata__cocos_AutomataCoCoChecker.stream().forEach(c -> c.visit(node));
}

    /* generated by template core.Method*/
 public  automata._cocos.AutomataCoCoChecker addCoCo (automata._cocos.AutomataASTAutomataNodeCoCo coco)  {
      automata__ast_ASTAutomataNodeCoCos.add(coco);
return this;
}

    /* generated by template core.Method*/
 public  void visit (automata._ast.ASTAutomataNode node)  {
      for (automata._cocos.AutomataASTAutomataNodeCoCo coco : automata__ast_ASTAutomataNodeCoCos) {
coco.check(node);
}
// and delegate to all registered checkers of the same language as well
automata__cocos_AutomataCoCoChecker.stream().forEach(c -> c.visit(node));
}

    /* generated by template core.Method*/
 public  void addChecker (de.monticore.mcbasics._cocos.MCBasicsCoCoChecker checker)  {
      this.de_monticore_mcbasics__cocos_MCBasicsCoCoChecker.add(checker);
}

    /* generated by template core.Method*/
 public  void checkAll (de.monticore.mcbasics._ast.ASTMCBasicsNode node)  {
      node.accept(getRealThis());
}

    /* generated by template core.Method*/
 public  automata._cocos.AutomataCoCoChecker addCoCo (de.monticore.mcbasics._cocos.MCBasicsASTMCBasicsNodeCoCo coco)  {
      de_monticore_mcbasics__cocos_MCBasicsCoCoChecker.stream().findFirst().get().addCoCo(coco);
return this;
}

    /* generated by template core.Method*/
 public  void visit (de.monticore.mcbasics._ast.ASTMCBasicsNode node)  {
      de_monticore_mcbasics__cocos_MCBasicsCoCoChecker.stream().forEach(c -> c.visit(node));
}

}