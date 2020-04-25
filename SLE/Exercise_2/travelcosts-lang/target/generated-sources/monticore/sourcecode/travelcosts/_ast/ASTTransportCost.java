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


 public  class ASTTransportCost extends ASTCNode  implements travelcosts._ast.ASTCost,travelcosts._ast.ASTTravelCostsNode {

    /* generated by template core.Attribute*/
 protected  travelcosts._ast.ASTTravelMeans travelMeans ;

    /* generated by template core.Attribute*/
 protected  Optional<travelcosts._ast.ASTDescription> description = Optional.empty();

    /* generated by template core.Attribute*/
 protected  travelcosts._symboltable.ITravelCostsScope enclosingScope ;


    /* generated by template core.Constructor*/
 protected  ASTTransportCost()  {
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

      ASTTransportCost comp;
    if ((o instanceof ASTTransportCost)) {
      comp = (ASTTransportCost) o;
    } else {
      return false;
    }
    if (!equalAttributes(comp)) {
      return false;
    }
    // comparing description   
    if ( this.description.isPresent() != comp.description.isPresent() ||
      (this.description.isPresent() && !this.description.get().deepEquals(comp.description.get(), forceSameOrder)) ) {
      return false;
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

      ASTTransportCost comp;
    if ((o instanceof ASTTransportCost)) {
      comp = (ASTTransportCost) o;
    } else {
      return false;
    }
    if (!equalsWithComments(comp)) {
      return false;
    }
    // comparing description
    if ( this.description.isPresent() != comp.description.isPresent() ||
      (this.description.isPresent() && !this.description.get().deepEqualsWithComments(comp.description.get(), forceSameOrder)) ) {
      return false;
    }
    return true;     

}

    /* generated by template core.Method*/
 public  boolean equalAttributes (Object o)  {
      /* generated by template data.EqualAttributes*/

      ASTTransportCost comp;
    if ((o instanceof ASTTransportCost)) {
      comp = (ASTTransportCost) o;
    } else {
      return false;
    }
	// comparing travelMeans 
    if ( (this.travelMeans == null && comp.travelMeans != null) 
      || (this.travelMeans != null && !this.travelMeans.equals(comp.travelMeans)) ) {
      return false;
    }
    return true;


}

    /* generated by template core.Method*/
 public  boolean equalsWithComments (Object o)  {
      /* generated by template data.EqualsWithComments*/

      ASTTransportCost comp;
    if ((o instanceof ASTTransportCost)) {
      comp = (ASTTransportCost) o;
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
 public  ASTTransportCost deepClone ()  {
          return deepClone(_construct());
}

    /* generated by template core.Method*/
 public  ASTTransportCost deepClone (ASTTransportCost result)  {
      /* generated by template data.DeepCloneWithParameters*/

    super.deepClone(result);

      result.setTravelMeans(getTravelMeans());
    if (isPresentDescription()){
      result.setDescription(getDescription().deepClone());
    } else {
      result.setDescriptionAbsent();
    }
      result.setEnclosingScope(getEnclosingScope());
    
    return result;

}

    /* generated by template core.Method*/
 public  travelcosts._ast.ASTTravelMeans getTravelMeans ()  {
      /* generated by template methods.Get*/

return this.travelMeans;

}

    /* generated by template core.Method*/
 public  travelcosts._ast.ASTDescription getDescription ()  {
      /* generated by template methods.opt.Get*/

if (isPresentDescription()) {
return this.description.get();
}
Log.error("0xA7003x383 Description can't return a value. It is empty.");
// Normally this statement is not reachable
throw new IllegalStateException();

}

    /* generated by template core.Method*/
 public  boolean isPresentDescription ()  {
      /* generated by template methods.opt.IsPresent*/

return this.description.isPresent();

}

    /* generated by template core.Method*/
 public  void setTravelMeans (travelcosts._ast.ASTTravelMeans travelMeans)  {
      /* generated by template methods.Set*/

this.travelMeans = travelMeans;

}

    /* generated by template core.Method*/
 public  void setDescription (travelcosts._ast.ASTDescription description)  {
      /* generated by template methods.opt.Set*/

this.description = Optional.ofNullable(description);

}

    /* generated by template core.Method*/
 public  void setDescriptionAbsent ()  {
      /* generated by template methods.opt.SetAbsent*/

this.description = Optional.empty();

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
    de.se_rwth.commons.logging.Log.error("0xA7000x429 AST node type ASTTransportCost expected a visitor of type travelcosts._visitor.TravelCostsVisitor, but got de.monticore.literals.mccommonliterals._visitor.MCCommonLiteralsVisitor. Visitors of a super language may not be used on ASTs containing nodes of the sub language. Use a visitor of the sub language.");
  }

}

    /* generated by template core.Method*/
 public  void accept (de.monticore.mcbasics._visitor.MCBasicsVisitor visitor)  {
      /* generated by template _ast.ast_class.AcceptSuper*/

  if (visitor instanceof travelcosts._visitor.TravelCostsVisitor) {
    accept((travelcosts._visitor.TravelCostsVisitor) visitor);
  } else {
    de.se_rwth.commons.logging.Log.error("0xA7000x429 AST node type ASTTransportCost expected a visitor of type travelcosts._visitor.TravelCostsVisitor, but got de.monticore.mcbasics._visitor.MCBasicsVisitor. Visitors of a super language may not be used on ASTs containing nodes of the sub language. Use a visitor of the sub language.");
  }

}

    /* generated by template core.Method*/
 public  void accept (de.monticore.literals.mcliteralsbasis._visitor.MCLiteralsBasisVisitor visitor)  {
      /* generated by template _ast.ast_class.AcceptSuper*/

  if (visitor instanceof travelcosts._visitor.TravelCostsVisitor) {
    accept((travelcosts._visitor.TravelCostsVisitor) visitor);
  } else {
    de.se_rwth.commons.logging.Log.error("0xA7000x429 AST node type ASTTransportCost expected a visitor of type travelcosts._visitor.TravelCostsVisitor, but got de.monticore.literals.mcliteralsbasis._visitor.MCLiteralsBasisVisitor. Visitors of a super language may not be used on ASTs containing nodes of the sub language. Use a visitor of the sub language.");
  }

}

    /* generated by template core.Method*/
 protected  ASTTransportCost _construct ()  {
      return travelcosts._ast.TravelCostsNodeFactory.createASTTransportCost();
}

    /* generated by template core.Method*/
 public  Collection<de.monticore.ast.ASTNode> get_Children ()  {
      /* generated by template _ast.ast_class.GetChildren*/

    java.util.LinkedList<de.monticore.ast.ASTNode> result = new java.util.LinkedList<de.monticore.ast.ASTNode>();
        if (isPresentDescription()) {
          result.add(getDescription());
        }
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
    de.se_rwth.commons.logging.Log.error("0xA7005x083The EnclosingScope form type de.monticore.literals.mccommonliterals._symboltable.IMCCommonLiteralsScope could not be casted to the type travelcosts._symboltable.ITravelCostsScope. Please call the Method setEnclosingScope with a parameter form type travelcosts._symboltable.ITravelCostsScope");
  }
}

    /* generated by template core.Method*/
 public  void setEnclosingScope (de.monticore.mcbasics._symboltable.IMCBasicsScope enclosingScope)  {
      /* generated by template _ast.ast_class.symboltable.InheritedSetEnclosingScope*/

  if (enclosingScope instanceof travelcosts._symboltable.ITravelCostsScope){
    this.enclosingScope = (travelcosts._symboltable.ITravelCostsScope) enclosingScope;
  }else {
    de.se_rwth.commons.logging.Log.error("0xA7005x646The EnclosingScope form type de.monticore.mcbasics._symboltable.IMCBasicsScope could not be casted to the type travelcosts._symboltable.ITravelCostsScope. Please call the Method setEnclosingScope with a parameter form type travelcosts._symboltable.ITravelCostsScope");
  }
}

    /* generated by template core.Method*/
 public  void setEnclosingScope (de.monticore.literals.mcliteralsbasis._symboltable.IMCLiteralsBasisScope enclosingScope)  {
      /* generated by template _ast.ast_class.symboltable.InheritedSetEnclosingScope*/

  if (enclosingScope instanceof travelcosts._symboltable.ITravelCostsScope){
    this.enclosingScope = (travelcosts._symboltable.ITravelCostsScope) enclosingScope;
  }else {
    de.se_rwth.commons.logging.Log.error("0xA7005x738The EnclosingScope form type de.monticore.literals.mcliteralsbasis._symboltable.IMCLiteralsBasisScope could not be casted to the type travelcosts._symboltable.ITravelCostsScope. Please call the Method setEnclosingScope with a parameter form type travelcosts._symboltable.ITravelCostsScope");
  }
}

}
