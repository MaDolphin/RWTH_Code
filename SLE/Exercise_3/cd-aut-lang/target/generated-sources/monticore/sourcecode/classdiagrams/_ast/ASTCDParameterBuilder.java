/* generated from model ClassDiagrams */
/* generated by template core.Class*/

/* (c) https://github.com/MontiCore/monticore */
package classdiagrams._ast;

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


 public  class ASTCDParameterBuilder extends de.monticore.ast.ASTNodeBuilder<ASTCDParameterBuilder>  {

    /* generated by template core.Attribute*/
 protected  ASTCDParameterBuilder realBuilder ;

    /* generated by template core.Attribute*/
 protected  de.monticore.types.mcbasictypes._ast.ASTMCType mCType ;

    /* generated by template core.Attribute*/
 protected  String name ;

    /* generated by template core.Attribute*/
 protected  boolean ellipsis ;


    /* generated by template core.Constructor*/
 protected  ASTCDParameterBuilder()  {
    this.realBuilder = (ASTCDParameterBuilder) this;
}


    /* generated by template core.Method*/
 public  ASTCDParameter build ()  {
      /* generated by template _ast.builder.BuildMethod*/

        if (!isValid()) {
            if (mCType == null) {
                Log.error("0xA7222 mCType of type de.monticore.types.mcbasictypes._ast.ASTMCType must not be null");
            }
            if (name == null) {
                Log.error("0xA7222 name of type String must not be null");
            }
          throw new IllegalStateException();
        }
        ASTCDParameter value;
        /* generated by template _ast.ast_class.builder.ASTCNodeInit*/

    value = new ASTCDParameter();
    value.setMCType(this.mCType);
    value.setName(this.name);
    value.setEllipsis(this.ellipsis);
    if (this.sourcePositionEnd.isPresent()) {
      value.set_SourcePositionEnd(this.sourcePositionEnd.get());
    } else {
      value.set_SourcePositionEndAbsent();
    }
    if (this.sourcePositionStart.isPresent()) {
      value.set_SourcePositionStart(this.sourcePositionStart.get());
    } else {
      value.set_SourcePositionStartAbsent();
    }
    value.set_PreCommentList(this.precomments);
    value.set_PostCommentList(this.postcomments);

        return value;
}

    /* generated by template core.Method*/
 public  boolean isValid ()  {
      /* generated by template _ast.builder.IsValidMethod*/

        if (mCType == null) {
            return false;
        }
        if (name == null) {
            return false;
        }
        return true;

}

    /* generated by template core.Method*/
 public  de.monticore.types.mcbasictypes._ast.ASTMCType getMCType ()  {
      /* generated by template methods.Get*/

return this.mCType;

}

    /* generated by template core.Method*/
 public  String getName ()  {
      /* generated by template methods.Get*/

return this.name;

}

    /* generated by template core.Method*/
 public  boolean isEllipsis ()  {
      /* generated by template methods.Get*/

return this.ellipsis;

}

    /* generated by template core.Method*/
 public  ASTCDParameterBuilder setMCType (de.monticore.types.mcbasictypes._ast.ASTMCType mCType)  {
      /* generated by template _ast.builder.Set*/

    this.mCType = mCType;
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTCDParameterBuilder setName (String name)  {
      /* generated by template _ast.builder.Set*/

    this.name = name;
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTCDParameterBuilder setEllipsis (boolean ellipsis)  {
      /* generated by template _ast.builder.Set*/

    this.ellipsis = ellipsis;
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTCDParameterBuilder set_SourcePositionEnd (SourcePosition end)  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.set_SourcePositionEnd(end);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTCDParameterBuilder set_SourcePositionEndAbsent ()  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.set_SourcePositionEndAbsent();
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTCDParameterBuilder set_SourcePositionStart (SourcePosition start)  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.set_SourcePositionStart(start);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTCDParameterBuilder set_SourcePositionStartAbsent ()  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.set_SourcePositionStartAbsent();
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTCDParameterBuilder clear_PreComments ()  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.clear_PreComments();
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTCDParameterBuilder add_PreComment (Comment precomment)  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.add_PreComment(precomment);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTCDParameterBuilder add_PreComment (int index,Comment precomment)  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.add_PreComment(index, precomment);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTCDParameterBuilder addAll_PreComments (Collection<Comment> precomments)  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.addAll_PreComments(precomments);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTCDParameterBuilder addAll_PreComments (int index,Collection<Comment> precomments)  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.addAll_PreComments(index, precomments);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTCDParameterBuilder remove_PreComment (Object element)  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.remove_PreComment(element);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTCDParameterBuilder remove_PreComment (int index)  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.remove_PreComment(index);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTCDParameterBuilder removeAll_PreComments (Collection<?> element)  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.removeAll_PreComments(element);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTCDParameterBuilder retainAll_PreComments (Collection<?> element)  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.retainAll_PreComments(element);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTCDParameterBuilder removeIf_PreComment (Predicate<? super Comment> filter)  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.removeIf_PreComment(filter);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTCDParameterBuilder forEach_PreComments (Consumer<? super Comment> action)  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.forEach_PreComments(action);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTCDParameterBuilder replaceAll_PreComments (UnaryOperator<Comment> operator)  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.replaceAll_PreComments(operator);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTCDParameterBuilder sort_PreComments (Comparator<? super Comment> comparator)  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.sort_PreComments(comparator);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTCDParameterBuilder set_PreCommentList (List<Comment> preComments)  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.set_PreCommentList(preComments);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTCDParameterBuilder set_PreComment (int index,Comment precomment)  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.set_PreComment(index, precomment);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTCDParameterBuilder clear_PostComments ()  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.clear_PostComments();
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTCDParameterBuilder add_PostComment (Comment postcomment)  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.add_PostComment(postcomment);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTCDParameterBuilder add_PostComment (int index,Comment postcomment)  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.add_PostComment(index, postcomment);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTCDParameterBuilder addAll_PostComments (Collection<Comment> postcomments)  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.addAll_PostComments(postcomments);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTCDParameterBuilder addAll_PostComments (int index,Collection<Comment> postcomments)  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.addAll_PostComments(index, postcomments);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTCDParameterBuilder remove_PostComment (Object element)  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.remove_PostComment(element);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTCDParameterBuilder remove_PostComment (int index)  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.remove_PostComment(index);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTCDParameterBuilder removeAll_PostComments (Collection<?> element)  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.removeAll_PostComments(element);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTCDParameterBuilder retainAll_PostComments (Collection<?> element)  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.retainAll_PostComments(element);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTCDParameterBuilder removeIf_PostComment (Predicate<? super Comment> filter)  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.removeIf_PostComment(filter);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTCDParameterBuilder forEach_PostComments (Consumer<? super Comment> action)  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.forEach_PostComments(action);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTCDParameterBuilder replaceAll_PostComments (UnaryOperator<Comment> operator)  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.replaceAll_PostComments(operator);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTCDParameterBuilder sort_PostComments (Comparator<? super Comment> comparator)  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.sort_PostComments(comparator);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTCDParameterBuilder set_PostCommentList (List<Comment> postComments)  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.set_PostCommentList(postComments);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTCDParameterBuilder set_PostComment (int index,Comment postcomment)  {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.set_PostComment(index, postcomment);
    return this.realBuilder;

}

}