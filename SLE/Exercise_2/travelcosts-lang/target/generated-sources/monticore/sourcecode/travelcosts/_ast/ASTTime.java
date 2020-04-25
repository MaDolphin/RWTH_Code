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


 public  class ASTTime extends ASTCNode  implements travelcosts._ast.ASTTravelCostsNode {

    /* generated by template core.Attribute*/
 protected  Optional<de.monticore.literals.mccommonliterals._ast.ASTNatLiteral> leadingZero = Optional.empty();

    /* generated by template core.Attribute*/
 protected  de.monticore.literals.mccommonliterals._ast.ASTNatLiteral hours ;

    /* generated by template core.Attribute*/
 protected  Optional<de.monticore.literals.mccommonliterals._ast.ASTNatLiteral> minutes = Optional.empty();

    /* generated by template core.Attribute*/
 protected  travelcosts._symboltable.ITravelCostsScope enclosingScope ;


    /* generated by template core.Constructor*/
 protected  ASTTime()  {
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

      ASTTime comp;
    if ((o instanceof ASTTime)) {
      comp = (ASTTime) o;
    } else {
      return false;
    }
    if (!equalAttributes(comp)) {
      return false;
    }
    // comparing leadingZero   
    if ( this.leadingZero.isPresent() != comp.leadingZero.isPresent() ||
      (this.leadingZero.isPresent() && !this.leadingZero.get().deepEquals(comp.leadingZero.get(), forceSameOrder)) ) {
      return false;
    }
     // comparing hours
     if ( (this.hours == null && comp.hours != null) ||
        (this.hours != null && !this.hours.deepEquals(comp.hours, forceSameOrder)) ) {
        return false;
     }
    // comparing minutes   
    if ( this.minutes.isPresent() != comp.minutes.isPresent() ||
      (this.minutes.isPresent() && !this.minutes.get().deepEquals(comp.minutes.get(), forceSameOrder)) ) {
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

      ASTTime comp;
    if ((o instanceof ASTTime)) {
      comp = (ASTTime) o;
    } else {
      return false;
    }
    if (!equalsWithComments(comp)) {
      return false;
    }
    // comparing leadingZero
    if ( this.leadingZero.isPresent() != comp.leadingZero.isPresent() ||
      (this.leadingZero.isPresent() && !this.leadingZero.get().deepEqualsWithComments(comp.leadingZero.get(), forceSameOrder)) ) {
      return false;
    }
      // comparing hours
      if ( (this.hours == null && comp.hours != null) ||
        (this.hours != null && !this.hours.deepEqualsWithComments(comp.hours, forceSameOrder)) ) {
        return false;
      }
    // comparing minutes
    if ( this.minutes.isPresent() != comp.minutes.isPresent() ||
      (this.minutes.isPresent() && !this.minutes.get().deepEqualsWithComments(comp.minutes.get(), forceSameOrder)) ) {
      return false;
    }
    return true;     

}

    /* generated by template core.Method*/
 public  boolean equalAttributes (Object o)  {
      /* generated by template data.EqualAttributes*/

    return o instanceof ASTTime;


}

    /* generated by template core.Method*/
 public  boolean equalsWithComments (Object o)  {
      /* generated by template data.EqualsWithComments*/

      ASTTime comp;
    if ((o instanceof ASTTime)) {
      comp = (ASTTime) o;
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
 public  ASTTime deepClone ()  {
          return deepClone(_construct());
}

    /* generated by template core.Method*/
 public  ASTTime deepClone (ASTTime result)  {
      /* generated by template data.DeepCloneWithParameters*/

    super.deepClone(result);

    if (isPresentLeadingZero()){
      result.setLeadingZero(getLeadingZero().deepClone());
    } else {
      result.setLeadingZeroAbsent();
    }
    result.setHours(getHours().deepClone());
    if (isPresentMinutes()){
      result.setMinutes(getMinutes().deepClone());
    } else {
      result.setMinutesAbsent();
    }
      result.setEnclosingScope(getEnclosingScope());
    
    return result;

}

    /* generated by template core.Method*/
 public  de.monticore.literals.mccommonliterals._ast.ASTNatLiteral getLeadingZero ()  {
      /* generated by template methods.opt.Get*/

if (isPresentLeadingZero()) {
return this.leadingZero.get();
}
Log.error("0xA7003x129 LeadingZero can't return a value. It is empty.");
// Normally this statement is not reachable
throw new IllegalStateException();

}

    /* generated by template core.Method*/
 public  boolean isPresentLeadingZero ()  {
      /* generated by template methods.opt.IsPresent*/

return this.leadingZero.isPresent();

}

    /* generated by template core.Method*/
 public  de.monticore.literals.mccommonliterals._ast.ASTNatLiteral getHours ()  {
      /* generated by template methods.Get*/

return this.hours;

}

    /* generated by template core.Method*/
 public  de.monticore.literals.mccommonliterals._ast.ASTNatLiteral getMinutes ()  {
      /* generated by template methods.opt.Get*/

if (isPresentMinutes()) {
return this.minutes.get();
}
Log.error("0xA7003x366 Minutes can't return a value. It is empty.");
// Normally this statement is not reachable
throw new IllegalStateException();

}

    /* generated by template core.Method*/
 public  boolean isPresentMinutes ()  {
      /* generated by template methods.opt.IsPresent*/

return this.minutes.isPresent();

}

    /* generated by template core.Method*/
 public  void setLeadingZero (de.monticore.literals.mccommonliterals._ast.ASTNatLiteral leadingZero)  {
      /* generated by template methods.opt.Set*/

this.leadingZero = Optional.ofNullable(leadingZero);

}

    /* generated by template core.Method*/
 public  void setLeadingZeroAbsent ()  {
      /* generated by template methods.opt.SetAbsent*/

this.leadingZero = Optional.empty();

}

    /* generated by template core.Method*/
 public  void setHours (de.monticore.literals.mccommonliterals._ast.ASTNatLiteral hours)  {
      /* generated by template methods.Set*/

this.hours = hours;

}

    /* generated by template core.Method*/
 public  void setMinutes (de.monticore.literals.mccommonliterals._ast.ASTNatLiteral minutes)  {
      /* generated by template methods.opt.Set*/

this.minutes = Optional.ofNullable(minutes);

}

    /* generated by template core.Method*/
 public  void setMinutesAbsent ()  {
      /* generated by template methods.opt.SetAbsent*/

this.minutes = Optional.empty();

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
    de.se_rwth.commons.logging.Log.error("0xA7000x582 AST node type ASTTime expected a visitor of type travelcosts._visitor.TravelCostsVisitor, but got de.monticore.literals.mccommonliterals._visitor.MCCommonLiteralsVisitor. Visitors of a super language may not be used on ASTs containing nodes of the sub language. Use a visitor of the sub language.");
  }

}

    /* generated by template core.Method*/
 public  void accept (de.monticore.mcbasics._visitor.MCBasicsVisitor visitor)  {
      /* generated by template _ast.ast_class.AcceptSuper*/

  if (visitor instanceof travelcosts._visitor.TravelCostsVisitor) {
    accept((travelcosts._visitor.TravelCostsVisitor) visitor);
  } else {
    de.se_rwth.commons.logging.Log.error("0xA7000x582 AST node type ASTTime expected a visitor of type travelcosts._visitor.TravelCostsVisitor, but got de.monticore.mcbasics._visitor.MCBasicsVisitor. Visitors of a super language may not be used on ASTs containing nodes of the sub language. Use a visitor of the sub language.");
  }

}

    /* generated by template core.Method*/
 public  void accept (de.monticore.literals.mcliteralsbasis._visitor.MCLiteralsBasisVisitor visitor)  {
      /* generated by template _ast.ast_class.AcceptSuper*/

  if (visitor instanceof travelcosts._visitor.TravelCostsVisitor) {
    accept((travelcosts._visitor.TravelCostsVisitor) visitor);
  } else {
    de.se_rwth.commons.logging.Log.error("0xA7000x582 AST node type ASTTime expected a visitor of type travelcosts._visitor.TravelCostsVisitor, but got de.monticore.literals.mcliteralsbasis._visitor.MCLiteralsBasisVisitor. Visitors of a super language may not be used on ASTs containing nodes of the sub language. Use a visitor of the sub language.");
  }

}

    /* generated by template core.Method*/
 protected  ASTTime _construct ()  {
      return travelcosts._ast.TravelCostsNodeFactory.createASTTime();
}

    /* generated by template core.Method*/
 public  Collection<de.monticore.ast.ASTNode> get_Children ()  {
      /* generated by template _ast.ast_class.GetChildren*/

    java.util.LinkedList<de.monticore.ast.ASTNode> result = new java.util.LinkedList<de.monticore.ast.ASTNode>();
        if (isPresentLeadingZero()) {
          result.add(getLeadingZero());
        }
        if ( getHours() != null ) {
          result.add(getHours());
        }
        if (isPresentMinutes()) {
          result.add(getMinutes());
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
    de.se_rwth.commons.logging.Log.error("0xA7005x005The EnclosingScope form type de.monticore.literals.mccommonliterals._symboltable.IMCCommonLiteralsScope could not be casted to the type travelcosts._symboltable.ITravelCostsScope. Please call the Method setEnclosingScope with a parameter form type travelcosts._symboltable.ITravelCostsScope");
  }
}

    /* generated by template core.Method*/
 public  void setEnclosingScope (de.monticore.mcbasics._symboltable.IMCBasicsScope enclosingScope)  {
      /* generated by template _ast.ast_class.symboltable.InheritedSetEnclosingScope*/

  if (enclosingScope instanceof travelcosts._symboltable.ITravelCostsScope){
    this.enclosingScope = (travelcosts._symboltable.ITravelCostsScope) enclosingScope;
  }else {
    de.se_rwth.commons.logging.Log.error("0xA7005x725The EnclosingScope form type de.monticore.mcbasics._symboltable.IMCBasicsScope could not be casted to the type travelcosts._symboltable.ITravelCostsScope. Please call the Method setEnclosingScope with a parameter form type travelcosts._symboltable.ITravelCostsScope");
  }
}

    /* generated by template core.Method*/
 public  void setEnclosingScope (de.monticore.literals.mcliteralsbasis._symboltable.IMCLiteralsBasisScope enclosingScope)  {
      /* generated by template _ast.ast_class.symboltable.InheritedSetEnclosingScope*/

  if (enclosingScope instanceof travelcosts._symboltable.ITravelCostsScope){
    this.enclosingScope = (travelcosts._symboltable.ITravelCostsScope) enclosingScope;
  }else {
    de.se_rwth.commons.logging.Log.error("0xA7005x038The EnclosingScope form type de.monticore.literals.mcliteralsbasis._symboltable.IMCLiteralsBasisScope could not be casted to the type travelcosts._symboltable.ITravelCostsScope. Please call the Method setEnclosingScope with a parameter form type travelcosts._symboltable.ITravelCostsScope");
  }
}

}
