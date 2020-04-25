/* generated from model TravelCosts */
/* generated by template core.Class*/

/* (c) https://github.com/MontiCore/monticore */
package travelcosts._ast;

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


 public  class ASTCostItems extends ASTCNode  implements travelcosts._ast.ASTTravelCostsNode {

    /* generated by template core.Attribute*/
 protected  java.util.List<travelcosts._ast.ASTCostItem> costItems = new java.util.ArrayList<>();

    /* generated by template core.Attribute*/
 protected  travelcosts._symboltable.ITravelCostsScope enclosingScope ;


    /* generated by template core.Constructor*/
 protected  ASTCostItems()  {
    /* generated by template core.EmptyBody*/
// empty body

}


    /* generated by template core.Method*/
 public  boolean deepEquals (Object o)  {
           return deepEquals(o, true);
}

    /* generated by template core.Method*/
 public  boolean deepEquals (Object o,boolean forceSameOrder)  {
      /* generated by template data.DeepEqualsWithOrder*/

      ASTCostItems comp;
    if ((o instanceof ASTCostItems)) {
      comp = (ASTCostItems) o;
    } else {
      return false;
    }
    if (!equalAttributes(comp)) {
      return false;
    }
    // comparing costItems
    if (this.costItems.size() != comp.costItems.size()) {
      return false;
    } else {
      if (forceSameOrder) {
        Iterator<travelcosts._ast.ASTCostItem> it1 = this.costItems.iterator();
        Iterator<travelcosts._ast.ASTCostItem> it2 = comp.costItems.iterator();
        while (it1.hasNext() && it2.hasNext()) {
          if (!it1.next().deepEquals(it2.next(), forceSameOrder)) {
            return false;
          }
        }
      } else {
        java.util.Iterator<travelcosts._ast.ASTCostItem> it1 = this.costItems.iterator();
        while (it1.hasNext()) {
          travelcosts._ast.ASTCostItem oneNext = it1.next();
          boolean matchFound = false;
          java.util.Iterator<travelcosts._ast.ASTCostItem> it2 = comp.costItems.iterator();
          while (it2.hasNext()) {
            if (oneNext.deepEquals(it2.next(), forceSameOrder)) {
              matchFound = true;
              break;
            }
          }
          if (!matchFound) {
            return false;
          }
        }
      }
    }
    return true;     


}

    /* generated by template core.Method*/
 public  boolean deepEqualsWithComments (Object o)  {
           return deepEqualsWithComments(o, true);
}

    /* generated by template core.Method*/
 public  boolean deepEqualsWithComments (Object o,boolean forceSameOrder)  {
      /* generated by template data.DeepEqualsWithComments*/

      ASTCostItems comp;
    if ((o instanceof ASTCostItems)) {
      comp = (ASTCostItems) o;
    } else {
      return false;
    }
    if (!equalsWithComments(comp)) {
      return false;
    }
    // comparing costItems
    if (this.costItems.size() != comp.costItems.size()) {
      return false;
    } else {
      if (forceSameOrder) {
        Iterator<travelcosts._ast.ASTCostItem> it1 = this.costItems.iterator();
        Iterator<travelcosts._ast.ASTCostItem> it2 = comp.costItems.iterator();
        while (it1.hasNext() && it2.hasNext()) {
          if (!it1.next().deepEqualsWithComments(it2.next(), forceSameOrder)) {
            return false;
          }
        }
      } else {
        java.util.Iterator<travelcosts._ast.ASTCostItem> it1 = this.costItems.iterator();
        while (it1.hasNext()) {
          travelcosts._ast.ASTCostItem oneNext = it1.next();
          boolean matchFound = false;
          java.util.Iterator<travelcosts._ast.ASTCostItem> it2 = comp.costItems.iterator();
          while (it2.hasNext()) {
            if (oneNext.deepEqualsWithComments(it2.next(), forceSameOrder)) {
              matchFound = true;
              break;
            }
          }
          if (!matchFound) {
            return false;
          }
        }
      }
    }
    return true;     

}

    /* generated by template core.Method*/
 public  boolean equalAttributes (Object o)  {
      /* generated by template data.EqualAttributes*/

    return o instanceof ASTCostItems;


}

    /* generated by template core.Method*/
 public  boolean equalsWithComments (Object o)  {
      /* generated by template data.EqualsWithComments*/

      ASTCostItems comp;
    if ((o instanceof ASTCostItems)) {
      comp = (ASTCostItems) o;
    } else {
      return false;
    }
    if (!equalAttributes(comp)) {
      return false;
    }
    // comparing comments
    if (get_PreCommentList().size() == comp.get_PreCommentList().size()) {
      java.util.Iterator<de.monticore.ast.Comment> one = get_PreCommentList().iterator();
      java.util.Iterator<de.monticore.ast.Comment> two = comp.get_PreCommentList().iterator();
      while (one.hasNext()) {
        if (!one.next().equals(two.next())) {
          return false;
        }
      }
    } else {
      return false;
    }
    
    if (get_PostCommentList().size() == comp.get_PostCommentList().size()) {
      java.util.Iterator<de.monticore.ast.Comment> one = get_PostCommentList().iterator();
      java.util.Iterator<de.monticore.ast.Comment> two = comp.get_PostCommentList().iterator();
      while (one.hasNext()) {
        if (!one.next().equals(two.next())) {
          return false;
        }
      }
    } else {
      return false;
    }
    return true;

}

    /* generated by template core.Method*/
 public  ASTCostItems deepClone ()  {
          return deepClone(_construct());
}

    /* generated by template core.Method*/
 public  ASTCostItems deepClone (ASTCostItems result)  {
      /* generated by template data.DeepCloneWithParameters*/

    super.deepClone(result);

      getCostItemList().forEach(s -> result.costItems.add(s.deepClone()));
      result.setEnclosingScope(getEnclosingScope());
    
    return result;

}

    /* generated by template core.Method*/
 public  boolean containsCostItem (Object element)  {
      /* generated by template methods.MethodDelegate*/

return this.getCostItemList().contains(element);

}

    /* generated by template core.Method*/
 public  boolean containsAllCostItems (Collection<?> collection)  {
      /* generated by template methods.MethodDelegate*/

return this.getCostItemList().containsAll(collection);

}

    /* generated by template core.Method*/
 public  boolean isEmptyCostItems ()  {
      /* generated by template methods.MethodDelegate*/

return this.getCostItemList().isEmpty();

}

    /* generated by template core.Method*/
 public  Iterator<travelcosts._ast.ASTCostItem> iteratorCostItems ()  {
      /* generated by template methods.MethodDelegate*/

return this.getCostItemList().iterator();

}

    /* generated by template core.Method*/
 public  int sizeCostItems ()  {
      /* generated by template methods.MethodDelegate*/

return this.getCostItemList().size();

}

    /* generated by template core.Method*/
 public  travelcosts._ast.ASTCostItem[] toArrayCostItems (travelcosts._ast.ASTCostItem[] array)  {
      /* generated by template methods.MethodDelegate*/

return this.getCostItemList().toArray(array);

}

    /* generated by template core.Method*/
 public  Object[] toArrayCostItems ()  {
      /* generated by template methods.MethodDelegate*/

return this.getCostItemList().toArray();

}

    /* generated by template core.Method*/
 public  Spliterator<travelcosts._ast.ASTCostItem> spliteratorCostItems ()  {
      /* generated by template methods.MethodDelegate*/

return this.getCostItemList().spliterator();

}

    /* generated by template core.Method*/
 public  Stream<travelcosts._ast.ASTCostItem> streamCostItems ()  {
      /* generated by template methods.MethodDelegate*/

return this.getCostItemList().stream();

}

    /* generated by template core.Method*/
 public  Stream<travelcosts._ast.ASTCostItem> parallelStreamCostItems ()  {
      /* generated by template methods.MethodDelegate*/

return this.getCostItemList().parallelStream();

}

    /* generated by template core.Method*/
 public  travelcosts._ast.ASTCostItem getCostItem (int index)  {
      /* generated by template methods.MethodDelegate*/

return this.getCostItemList().get(index);

}

    /* generated by template core.Method*/
 public  int indexOfCostItem (Object element)  {
      /* generated by template methods.MethodDelegate*/

return this.getCostItemList().indexOf(element);

}

    /* generated by template core.Method*/
 public  int lastIndexOfCostItem (Object element)  {
      /* generated by template methods.MethodDelegate*/

return this.getCostItemList().lastIndexOf(element);

}

    /* generated by template core.Method*/
 public  boolean equalsCostItems (Object o)  {
      /* generated by template methods.MethodDelegate*/

return this.getCostItemList().equals(o);

}

    /* generated by template core.Method*/
 public  int hashCodeCostItems ()  {
      /* generated by template methods.MethodDelegate*/

return this.getCostItemList().hashCode();

}

    /* generated by template core.Method*/
 public  ListIterator<travelcosts._ast.ASTCostItem> listIteratorCostItems ()  {
      /* generated by template methods.MethodDelegate*/

return this.getCostItemList().listIterator();

}

    /* generated by template core.Method*/
 public  ListIterator<travelcosts._ast.ASTCostItem> listIteratorCostItems (int index)  {
      /* generated by template methods.MethodDelegate*/

return this.getCostItemList().listIterator(index);

}

    /* generated by template core.Method*/
 public  List<travelcosts._ast.ASTCostItem> subListCostItems (int start,int end)  {
      /* generated by template methods.MethodDelegate*/

return this.getCostItemList().subList(start, end);

}

    /* generated by template core.Method*/
 public  List<travelcosts._ast.ASTCostItem> getCostItemList ()  {
      /* generated by template methods.Get*/

return this.costItems;

}

    /* generated by template core.Method*/
 public  void clearCostItems ()  {
      /* generated by template methods.MethodDelegate*/

this.getCostItemList().clear();

}

    /* generated by template core.Method*/
 public  boolean addCostItem (travelcosts._ast.ASTCostItem element)  {
      /* generated by template methods.MethodDelegate*/

return this.getCostItemList().add(element);

}

    /* generated by template core.Method*/
 public  boolean addAllCostItems (Collection<? extends travelcosts._ast.ASTCostItem> collection)  {
      /* generated by template methods.MethodDelegate*/

return this.getCostItemList().addAll(collection);

}

    /* generated by template core.Method*/
 public  boolean removeCostItem (Object element)  {
      /* generated by template methods.MethodDelegate*/

return this.getCostItemList().remove(element);

}

    /* generated by template core.Method*/
 public  boolean removeAllCostItems (Collection<?> collection)  {
      /* generated by template methods.MethodDelegate*/

return this.getCostItemList().removeAll(collection);

}

    /* generated by template core.Method*/
 public  boolean retainAllCostItems (Collection<?> collection)  {
      /* generated by template methods.MethodDelegate*/

return this.getCostItemList().retainAll(collection);

}

    /* generated by template core.Method*/
 public  boolean removeIfCostItem (Predicate<? super travelcosts._ast.ASTCostItem> filter)  {
      /* generated by template methods.MethodDelegate*/

return this.getCostItemList().removeIf(filter);

}

    /* generated by template core.Method*/
 public  void forEachCostItems (Consumer<? super travelcosts._ast.ASTCostItem> action)  {
      /* generated by template methods.MethodDelegate*/

this.getCostItemList().forEach(action);

}

    /* generated by template core.Method*/
 public  void addCostItem (int index,travelcosts._ast.ASTCostItem element)  {
      /* generated by template methods.MethodDelegate*/

this.getCostItemList().add(index, element);

}

    /* generated by template core.Method*/
 public  boolean addAllCostItems (int index,Collection<? extends travelcosts._ast.ASTCostItem> collection)  {
      /* generated by template methods.MethodDelegate*/

return this.getCostItemList().addAll(index, collection);

}

    /* generated by template core.Method*/
 public  travelcosts._ast.ASTCostItem removeCostItem (int index)  {
      /* generated by template methods.MethodDelegate*/

return this.getCostItemList().remove(index);

}

    /* generated by template core.Method*/
 public  travelcosts._ast.ASTCostItem setCostItem (int index,travelcosts._ast.ASTCostItem element)  {
      /* generated by template methods.MethodDelegate*/

return this.getCostItemList().set(index, element);

}

    /* generated by template core.Method*/
 public  void replaceAllCostItems (UnaryOperator<travelcosts._ast.ASTCostItem> operator)  {
      /* generated by template methods.MethodDelegate*/

this.getCostItemList().replaceAll(operator);

}

    /* generated by template core.Method*/
 public  void sortCostItems (Comparator<? super travelcosts._ast.ASTCostItem> comparator)  {
      /* generated by template methods.MethodDelegate*/

this.getCostItemList().sort(comparator);

}

    /* generated by template core.Method*/
 public  void setCostItemList (List<travelcosts._ast.ASTCostItem> costItems)  {
      /* generated by template methods.Set*/

this.costItems = costItems;

}

    /* generated by template core.Method*/
 public  void accept (travelcosts._visitor.TravelCostsVisitor visitor)  {
      /* generated by template _ast.ast_class.Accept*/

      visitor.handle(this);

}

    /* generated by template core.Method*/
 public  void accept (de.monticore.literals.mccommonliterals._visitor.MCCommonLiteralsVisitor visitor)  {
      /* generated by template _ast.ast_class.AcceptSuper*/

  if (visitor instanceof travelcosts._visitor.TravelCostsVisitor) {
    accept((travelcosts._visitor.TravelCostsVisitor) visitor);
  } else {
    de.se_rwth.commons.logging.Log.error("0xA7000x875 AST node type ASTCostItems expected a visitor of type travelcosts._visitor.TravelCostsVisitor, but got de.monticore.literals.mccommonliterals._visitor.MCCommonLiteralsVisitor. Visitors of a super language may not be used on ASTs containing nodes of the sub language. Use a visitor of the sub language.");
  }

}

    /* generated by template core.Method*/
 public  void accept (de.monticore.mcbasics._visitor.MCBasicsVisitor visitor)  {
      /* generated by template _ast.ast_class.AcceptSuper*/

  if (visitor instanceof travelcosts._visitor.TravelCostsVisitor) {
    accept((travelcosts._visitor.TravelCostsVisitor) visitor);
  } else {
    de.se_rwth.commons.logging.Log.error("0xA7000x875 AST node type ASTCostItems expected a visitor of type travelcosts._visitor.TravelCostsVisitor, but got de.monticore.mcbasics._visitor.MCBasicsVisitor. Visitors of a super language may not be used on ASTs containing nodes of the sub language. Use a visitor of the sub language.");
  }

}

    /* generated by template core.Method*/
 public  void accept (de.monticore.literals.mcliteralsbasis._visitor.MCLiteralsBasisVisitor visitor)  {
      /* generated by template _ast.ast_class.AcceptSuper*/

  if (visitor instanceof travelcosts._visitor.TravelCostsVisitor) {
    accept((travelcosts._visitor.TravelCostsVisitor) visitor);
  } else {
    de.se_rwth.commons.logging.Log.error("0xA7000x875 AST node type ASTCostItems expected a visitor of type travelcosts._visitor.TravelCostsVisitor, but got de.monticore.literals.mcliteralsbasis._visitor.MCLiteralsBasisVisitor. Visitors of a super language may not be used on ASTs containing nodes of the sub language. Use a visitor of the sub language.");
  }

}

    /* generated by template core.Method*/
 protected  ASTCostItems _construct ()  {
      return travelcosts._ast.TravelCostsNodeFactory.createASTCostItems();
}

    /* generated by template core.Method*/
 public  Collection<de.monticore.ast.ASTNode> get_Children ()  {
      /* generated by template _ast.ast_class.GetChildren*/

    java.util.LinkedList<de.monticore.ast.ASTNode> result = new java.util.LinkedList<de.monticore.ast.ASTNode>();
        result.addAll(getCostItemList());
    return result;

}

    /* generated by template core.Method*/
 public  travelcosts._symboltable.ITravelCostsScope getEnclosingScope ()  {
      /* generated by template methods.Get*/

return this.enclosingScope;

}

    /* generated by template core.Method*/
 public  void setEnclosingScope (travelcosts._symboltable.ITravelCostsScope enclosingScope)  {
      /* generated by template methods.Set*/

this.enclosingScope = enclosingScope;

}

    /* generated by template core.Method*/
 public  void setEnclosingScope (de.monticore.literals.mccommonliterals._symboltable.IMCCommonLiteralsScope enclosingScope)  {
      /* generated by template _ast.ast_class.symboltable.InheritedSetEnclosingScope*/

  if (enclosingScope instanceof travelcosts._symboltable.ITravelCostsScope){
    this.enclosingScope = (travelcosts._symboltable.ITravelCostsScope) enclosingScope;
  }else {
    de.se_rwth.commons.logging.Log.error("0xA7005x074The EnclosingScope form type de.monticore.literals.mccommonliterals._symboltable.IMCCommonLiteralsScope could not be casted to the type travelcosts._symboltable.ITravelCostsScope. Please call the Method setEnclosingScope with a parameter form type travelcosts._symboltable.ITravelCostsScope");
  }
}

    /* generated by template core.Method*/
 public  void setEnclosingScope (de.monticore.mcbasics._symboltable.IMCBasicsScope enclosingScope)  {
      /* generated by template _ast.ast_class.symboltable.InheritedSetEnclosingScope*/

  if (enclosingScope instanceof travelcosts._symboltable.ITravelCostsScope){
    this.enclosingScope = (travelcosts._symboltable.ITravelCostsScope) enclosingScope;
  }else {
    de.se_rwth.commons.logging.Log.error("0xA7005x464The EnclosingScope form type de.monticore.mcbasics._symboltable.IMCBasicsScope could not be casted to the type travelcosts._symboltable.ITravelCostsScope. Please call the Method setEnclosingScope with a parameter form type travelcosts._symboltable.ITravelCostsScope");
  }
}

    /* generated by template core.Method*/
 public  void setEnclosingScope (de.monticore.literals.mcliteralsbasis._symboltable.IMCLiteralsBasisScope enclosingScope)  {
      /* generated by template _ast.ast_class.symboltable.InheritedSetEnclosingScope*/

  if (enclosingScope instanceof travelcosts._symboltable.ITravelCostsScope){
    this.enclosingScope = (travelcosts._symboltable.ITravelCostsScope) enclosingScope;
  }else {
    de.se_rwth.commons.logging.Log.error("0xA7005x097The EnclosingScope form type de.monticore.literals.mcliteralsbasis._symboltable.IMCLiteralsBasisScope could not be casted to the type travelcosts._symboltable.ITravelCostsScope. Please call the Method setEnclosingScope with a parameter form type travelcosts._symboltable.ITravelCostsScope");
  }
}

}
