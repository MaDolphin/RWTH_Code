/* generated from model Automata */
/* generated by template core.Interface*/

/* (c) https://github.com/MontiCore/monticore */
package automata._symboltable;

/* generated by template core.Imports*/

import java.util.*;
import java.util.function.*;
import java.util.stream.Stream;
import de.se_rwth.commons.logging.Log;
import de.monticore.ast.ASTNode;
import de.monticore.ast.Comment;
import de.se_rwth.commons.SourcePosition;
import de.monticore.symboltable.*;


 public  interface IStateSymbolResolvingDelegate {



  /* generated by template core.Method*/
 abstract  public  List<automata._symboltable.StateSymbol> resolveAdaptedStateSymbol (boolean foundSymbols,String name,de.monticore.symboltable.modifiers.AccessModifier modifier,java.util.function.Predicate<automata._symboltable.StateSymbol> predicate) ;
}
