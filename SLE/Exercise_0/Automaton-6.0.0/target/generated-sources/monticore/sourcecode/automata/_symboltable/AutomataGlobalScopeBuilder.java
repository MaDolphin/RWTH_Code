/* generated from model Automata */
/* generated by template core.Class*/

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
import de.monticore.ast.ASTCNode;


 public  class AutomataGlobalScopeBuilder  {

    /* generated by template core.Attribute*/
 protected  AutomataGlobalScopeBuilder realBuilder ;

    /* generated by template core.Attribute*/
 protected  de.monticore.io.paths.ModelPath modelPath ;

    /* generated by template core.Attribute*/
 protected  AutomataLanguage automataLanguage ;

    /* generated by template core.Attribute*/
 protected  List<automata._symboltable.IStateSymbolResolvingDelegate> adaptedStateSymbolResolvingDelegate = new java.util.ArrayList<>();

    /* generated by template core.Attribute*/
 protected  List<automata._symboltable.IAutomatonSymbolResolvingDelegate> adaptedAutomatonSymbolResolvingDelegate = new java.util.ArrayList<>();


    /* generated by template core.Constructor*/
 protected  AutomataGlobalScopeBuilder()  {
    this.realBuilder = (AutomataGlobalScopeBuilder) this;
}


    /* generated by template core.Method*/
 public  AutomataGlobalScope build ()  {
      /* generated by template _symboltable.globalscope.Build*/

  AutomataGlobalScope scope = new AutomataGlobalScope(modelPath, automataLanguage);
  return scope;
}

    /* generated by template core.Method*/
 public  boolean isValid ()  {
      /* generated by template _ast.builder.IsValidMethod*/

        if (modelPath == null) {
            return false;
        }
        if (automataLanguage == null) {
            return false;
        }
        return true;

}

    /* generated by template core.Method*/
 public  de.monticore.io.paths.ModelPath getModelPath ()  {
      /* generated by template methods.Get*/

return this.modelPath;

}

    /* generated by template core.Method*/
 public  AutomataLanguage getAutomataLanguage ()  {
      /* generated by template methods.Get*/

return this.automataLanguage;

}

    /* generated by template core.Method*/
 public  boolean containsAdaptedStateSymbolResolvingDelegate (Object element)  {
      /* generated by template methods.MethodDelegate*/

return this.getAdaptedStateSymbolResolvingDelegateList().contains(element);

}

    /* generated by template core.Method*/
 public  boolean containsAllAdaptedStateSymbolResolvingDelegate (Collection<?> collection)  {
      /* generated by template methods.MethodDelegate*/

return this.getAdaptedStateSymbolResolvingDelegateList().containsAll(collection);

}

    /* generated by template core.Method*/
 public  boolean isEmptyAdaptedStateSymbolResolvingDelegate ()  {
      /* generated by template methods.MethodDelegate*/

return this.getAdaptedStateSymbolResolvingDelegateList().isEmpty();

}

    /* generated by template core.Method*/
 public  Iterator<automata._symboltable.IStateSymbolResolvingDelegate> iteratorAdaptedStateSymbolResolvingDelegate ()  {
      /* generated by template methods.MethodDelegate*/

return this.getAdaptedStateSymbolResolvingDelegateList().iterator();

}

    /* generated by template core.Method*/
 public  int sizeAdaptedStateSymbolResolvingDelegate ()  {
      /* generated by template methods.MethodDelegate*/

return this.getAdaptedStateSymbolResolvingDelegateList().size();

}

    /* generated by template core.Method*/
 public  automata._symboltable.IStateSymbolResolvingDelegate[] toArrayAdaptedStateSymbolResolvingDelegate (automata._symboltable.IStateSymbolResolvingDelegate[] array)  {
      /* generated by template methods.MethodDelegate*/

return this.getAdaptedStateSymbolResolvingDelegateList().toArray(array);

}

    /* generated by template core.Method*/
 public  Object[] toArrayAdaptedStateSymbolResolvingDelegate ()  {
      /* generated by template methods.MethodDelegate*/

return this.getAdaptedStateSymbolResolvingDelegateList().toArray();

}

    /* generated by template core.Method*/
 public  Spliterator<automata._symboltable.IStateSymbolResolvingDelegate> spliteratorAdaptedStateSymbolResolvingDelegate ()  {
      /* generated by template methods.MethodDelegate*/

return this.getAdaptedStateSymbolResolvingDelegateList().spliterator();

}

    /* generated by template core.Method*/
 public  Stream<automata._symboltable.IStateSymbolResolvingDelegate> streamAdaptedStateSymbolResolvingDelegate ()  {
      /* generated by template methods.MethodDelegate*/

return this.getAdaptedStateSymbolResolvingDelegateList().stream();

}

    /* generated by template core.Method*/
 public  Stream<automata._symboltable.IStateSymbolResolvingDelegate> parallelStreamAdaptedStateSymbolResolvingDelegate ()  {
      /* generated by template methods.MethodDelegate*/

return this.getAdaptedStateSymbolResolvingDelegateList().parallelStream();

}

    /* generated by template core.Method*/
 public  automata._symboltable.IStateSymbolResolvingDelegate getAdaptedStateSymbolResolvingDelegate (int index)  {
      /* generated by template methods.MethodDelegate*/

return this.getAdaptedStateSymbolResolvingDelegateList().get(index);

}

    /* generated by template core.Method*/
 public  int indexOfAdaptedStateSymbolResolvingDelegate (Object element)  {
      /* generated by template methods.MethodDelegate*/

return this.getAdaptedStateSymbolResolvingDelegateList().indexOf(element);

}

    /* generated by template core.Method*/
 public  int lastIndexOfAdaptedStateSymbolResolvingDelegate (Object element)  {
      /* generated by template methods.MethodDelegate*/

return this.getAdaptedStateSymbolResolvingDelegateList().lastIndexOf(element);

}

    /* generated by template core.Method*/
 public  boolean equalsAdaptedStateSymbolResolvingDelegate (Object o)  {
      /* generated by template methods.MethodDelegate*/

return this.getAdaptedStateSymbolResolvingDelegateList().equals(o);

}

    /* generated by template core.Method*/
 public  int hashCodeAdaptedStateSymbolResolvingDelegate ()  {
      /* generated by template methods.MethodDelegate*/

return this.getAdaptedStateSymbolResolvingDelegateList().hashCode();

}

    /* generated by template core.Method*/
 public  ListIterator<automata._symboltable.IStateSymbolResolvingDelegate> listIteratorAdaptedStateSymbolResolvingDelegate ()  {
      /* generated by template methods.MethodDelegate*/

return this.getAdaptedStateSymbolResolvingDelegateList().listIterator();

}

    /* generated by template core.Method*/
 public  ListIterator<automata._symboltable.IStateSymbolResolvingDelegate> listIteratorAdaptedStateSymbolResolvingDelegate (int index)  {
      /* generated by template methods.MethodDelegate*/

return this.getAdaptedStateSymbolResolvingDelegateList().listIterator(index);

}

    /* generated by template core.Method*/
 public  List<automata._symboltable.IStateSymbolResolvingDelegate> subListAdaptedStateSymbolResolvingDelegate (int start,int end)  {
      /* generated by template methods.MethodDelegate*/

return this.getAdaptedStateSymbolResolvingDelegateList().subList(start, end);

}

    /* generated by template core.Method*/
 public  List<automata._symboltable.IStateSymbolResolvingDelegate> getAdaptedStateSymbolResolvingDelegateList ()  {
      /* generated by template methods.Get*/

return this.adaptedStateSymbolResolvingDelegate;

}

    /* generated by template core.Method*/
 public  boolean containsAdaptedAutomatonSymbolResolvingDelegate (Object element)  {
      /* generated by template methods.MethodDelegate*/

return this.getAdaptedAutomatonSymbolResolvingDelegateList().contains(element);

}

    /* generated by template core.Method*/
 public  boolean containsAllAdaptedAutomatonSymbolResolvingDelegate (Collection<?> collection)  {
      /* generated by template methods.MethodDelegate*/

return this.getAdaptedAutomatonSymbolResolvingDelegateList().containsAll(collection);

}

    /* generated by template core.Method*/
 public  boolean isEmptyAdaptedAutomatonSymbolResolvingDelegate ()  {
      /* generated by template methods.MethodDelegate*/

return this.getAdaptedAutomatonSymbolResolvingDelegateList().isEmpty();

}

    /* generated by template core.Method*/
 public  Iterator<automata._symboltable.IAutomatonSymbolResolvingDelegate> iteratorAdaptedAutomatonSymbolResolvingDelegate ()  {
      /* generated by template methods.MethodDelegate*/

return this.getAdaptedAutomatonSymbolResolvingDelegateList().iterator();

}

    /* generated by template core.Method*/
 public  int sizeAdaptedAutomatonSymbolResolvingDelegate ()  {
      /* generated by template methods.MethodDelegate*/

return this.getAdaptedAutomatonSymbolResolvingDelegateList().size();

}

    /* generated by template core.Method*/
 public  automata._symboltable.IAutomatonSymbolResolvingDelegate[] toArrayAdaptedAutomatonSymbolResolvingDelegate (automata._symboltable.IAutomatonSymbolResolvingDelegate[] array)  {
      /* generated by template methods.MethodDelegate*/

return this.getAdaptedAutomatonSymbolResolvingDelegateList().toArray(array);

}

    /* generated by template core.Method*/
 public  Object[] toArrayAdaptedAutomatonSymbolResolvingDelegate ()  {
      /* generated by template methods.MethodDelegate*/

return this.getAdaptedAutomatonSymbolResolvingDelegateList().toArray();

}

    /* generated by template core.Method*/
 public  Spliterator<automata._symboltable.IAutomatonSymbolResolvingDelegate> spliteratorAdaptedAutomatonSymbolResolvingDelegate ()  {
      /* generated by template methods.MethodDelegate*/

return this.getAdaptedAutomatonSymbolResolvingDelegateList().spliterator();

}

    /* generated by template core.Method*/
 public  Stream<automata._symboltable.IAutomatonSymbolResolvingDelegate> streamAdaptedAutomatonSymbolResolvingDelegate ()  {
      /* generated by template methods.MethodDelegate*/

return this.getAdaptedAutomatonSymbolResolvingDelegateList().stream();

}

    /* generated by template core.Method*/
 public  Stream<automata._symboltable.IAutomatonSymbolResolvingDelegate> parallelStreamAdaptedAutomatonSymbolResolvingDelegate ()  {
      /* generated by template methods.MethodDelegate*/

return this.getAdaptedAutomatonSymbolResolvingDelegateList().parallelStream();

}

    /* generated by template core.Method*/
 public  automata._symboltable.IAutomatonSymbolResolvingDelegate getAdaptedAutomatonSymbolResolvingDelegate (int index)  {
      /* generated by template methods.MethodDelegate*/

return this.getAdaptedAutomatonSymbolResolvingDelegateList().get(index);

}

    /* generated by template core.Method*/
 public  int indexOfAdaptedAutomatonSymbolResolvingDelegate (Object element)  {
      /* generated by template methods.MethodDelegate*/

return this.getAdaptedAutomatonSymbolResolvingDelegateList().indexOf(element);

}

    /* generated by template core.Method*/
 public  int lastIndexOfAdaptedAutomatonSymbolResolvingDelegate (Object element)  {
      /* generated by template methods.MethodDelegate*/

return this.getAdaptedAutomatonSymbolResolvingDelegateList().lastIndexOf(element);

}

    /* generated by template core.Method*/
 public  boolean equalsAdaptedAutomatonSymbolResolvingDelegate (Object o)  {
      /* generated by template methods.MethodDelegate*/

return this.getAdaptedAutomatonSymbolResolvingDelegateList().equals(o);

}

    /* generated by template core.Method*/
 public  int hashCodeAdaptedAutomatonSymbolResolvingDelegate ()  {
      /* generated by template methods.MethodDelegate*/

return this.getAdaptedAutomatonSymbolResolvingDelegateList().hashCode();

}

    /* generated by template core.Method*/
 public  ListIterator<automata._symboltable.IAutomatonSymbolResolvingDelegate> listIteratorAdaptedAutomatonSymbolResolvingDelegate ()  {
      /* generated by template methods.MethodDelegate*/

return this.getAdaptedAutomatonSymbolResolvingDelegateList().listIterator();

}

    /* generated by template core.Method*/
 public  ListIterator<automata._symboltable.IAutomatonSymbolResolvingDelegate> listIteratorAdaptedAutomatonSymbolResolvingDelegate (int index)  {
      /* generated by template methods.MethodDelegate*/

return this.getAdaptedAutomatonSymbolResolvingDelegateList().listIterator(index);

}

    /* generated by template core.Method*/
 public  List<automata._symboltable.IAutomatonSymbolResolvingDelegate> subListAdaptedAutomatonSymbolResolvingDelegate (int start,int end)  {
      /* generated by template methods.MethodDelegate*/

return this.getAdaptedAutomatonSymbolResolvingDelegateList().subList(start, end);

}

    /* generated by template core.Method*/
 public  List<automata._symboltable.IAutomatonSymbolResolvingDelegate> getAdaptedAutomatonSymbolResolvingDelegateList ()  {
      /* generated by template methods.Get*/

return this.adaptedAutomatonSymbolResolvingDelegate;

}

    /* generated by template core.Method*/
 public  AutomataGlobalScopeBuilder setModelPath (de.monticore.io.paths.ModelPath modelPath)  {
      /* generated by template _ast.builder.Set*/

    this.modelPath = modelPath;
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  AutomataGlobalScopeBuilder setAutomataLanguage (AutomataLanguage automataLanguage)  {
      /* generated by template _ast.builder.Set*/

    this.automataLanguage = automataLanguage;
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  AutomataGlobalScopeBuilder clearAdaptedStateSymbolResolvingDelegate ()  {
      /* generated by template _ast.builder.MethodDelegate*/

    this.getAdaptedStateSymbolResolvingDelegateList().clear();
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  AutomataGlobalScopeBuilder addAdaptedStateSymbolResolvingDelegate (automata._symboltable.IStateSymbolResolvingDelegate element)  {
      /* generated by template _ast.builder.MethodDelegate*/

    this.getAdaptedStateSymbolResolvingDelegateList().add(element);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  AutomataGlobalScopeBuilder addAllAdaptedStateSymbolResolvingDelegate (Collection<? extends automata._symboltable.IStateSymbolResolvingDelegate> collection)  {
      /* generated by template _ast.builder.MethodDelegate*/

    this.getAdaptedStateSymbolResolvingDelegateList().addAll(collection);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  AutomataGlobalScopeBuilder removeAdaptedStateSymbolResolvingDelegate (Object element)  {
      /* generated by template _ast.builder.MethodDelegate*/

    this.getAdaptedStateSymbolResolvingDelegateList().remove(element);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  AutomataGlobalScopeBuilder removeAllAdaptedStateSymbolResolvingDelegate (Collection<?> collection)  {
      /* generated by template _ast.builder.MethodDelegate*/

    this.getAdaptedStateSymbolResolvingDelegateList().removeAll(collection);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  AutomataGlobalScopeBuilder retainAllAdaptedStateSymbolResolvingDelegate (Collection<?> collection)  {
      /* generated by template _ast.builder.MethodDelegate*/

    this.getAdaptedStateSymbolResolvingDelegateList().retainAll(collection);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  AutomataGlobalScopeBuilder removeIfAdaptedStateSymbolResolvingDelegate (Predicate<? super automata._symboltable.IStateSymbolResolvingDelegate> filter)  {
      /* generated by template _ast.builder.MethodDelegate*/

    this.getAdaptedStateSymbolResolvingDelegateList().removeIf(filter);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  AutomataGlobalScopeBuilder forEachAdaptedStateSymbolResolvingDelegate (Consumer<? super automata._symboltable.IStateSymbolResolvingDelegate> action)  {
      /* generated by template _ast.builder.MethodDelegate*/

    this.getAdaptedStateSymbolResolvingDelegateList().forEach(action);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  AutomataGlobalScopeBuilder addAdaptedStateSymbolResolvingDelegate (int index,automata._symboltable.IStateSymbolResolvingDelegate element)  {
      /* generated by template _ast.builder.MethodDelegate*/

    this.getAdaptedStateSymbolResolvingDelegateList().add(index, element);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  AutomataGlobalScopeBuilder addAllAdaptedStateSymbolResolvingDelegate (int index,Collection<? extends automata._symboltable.IStateSymbolResolvingDelegate> collection)  {
      /* generated by template _ast.builder.MethodDelegate*/

    this.getAdaptedStateSymbolResolvingDelegateList().addAll(index, collection);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  AutomataGlobalScopeBuilder removeAdaptedStateSymbolResolvingDelegate (int index)  {
      /* generated by template _ast.builder.MethodDelegate*/

    this.getAdaptedStateSymbolResolvingDelegateList().remove(index);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  AutomataGlobalScopeBuilder setAdaptedStateSymbolResolvingDelegate (int index,automata._symboltable.IStateSymbolResolvingDelegate element)  {
      /* generated by template _ast.builder.MethodDelegate*/

    this.getAdaptedStateSymbolResolvingDelegateList().set(index, element);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  AutomataGlobalScopeBuilder replaceAllAdaptedStateSymbolResolvingDelegate (UnaryOperator<automata._symboltable.IStateSymbolResolvingDelegate> operator)  {
      /* generated by template _ast.builder.MethodDelegate*/

    this.getAdaptedStateSymbolResolvingDelegateList().replaceAll(operator);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  AutomataGlobalScopeBuilder sortAdaptedStateSymbolResolvingDelegate (Comparator<? super automata._symboltable.IStateSymbolResolvingDelegate> comparator)  {
      /* generated by template _ast.builder.MethodDelegate*/

    this.getAdaptedStateSymbolResolvingDelegateList().sort(comparator);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  AutomataGlobalScopeBuilder setAdaptedStateSymbolResolvingDelegateList (List<automata._symboltable.IStateSymbolResolvingDelegate> adaptedStateSymbolResolvingDelegate)  {
      /* generated by template _ast.builder.Set*/

    this.adaptedStateSymbolResolvingDelegate = adaptedStateSymbolResolvingDelegate;
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  AutomataGlobalScopeBuilder clearAdaptedAutomatonSymbolResolvingDelegate ()  {
      /* generated by template _ast.builder.MethodDelegate*/

    this.getAdaptedAutomatonSymbolResolvingDelegateList().clear();
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  AutomataGlobalScopeBuilder addAdaptedAutomatonSymbolResolvingDelegate (automata._symboltable.IAutomatonSymbolResolvingDelegate element)  {
      /* generated by template _ast.builder.MethodDelegate*/

    this.getAdaptedAutomatonSymbolResolvingDelegateList().add(element);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  AutomataGlobalScopeBuilder addAllAdaptedAutomatonSymbolResolvingDelegate (Collection<? extends automata._symboltable.IAutomatonSymbolResolvingDelegate> collection)  {
      /* generated by template _ast.builder.MethodDelegate*/

    this.getAdaptedAutomatonSymbolResolvingDelegateList().addAll(collection);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  AutomataGlobalScopeBuilder removeAdaptedAutomatonSymbolResolvingDelegate (Object element)  {
      /* generated by template _ast.builder.MethodDelegate*/

    this.getAdaptedAutomatonSymbolResolvingDelegateList().remove(element);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  AutomataGlobalScopeBuilder removeAllAdaptedAutomatonSymbolResolvingDelegate (Collection<?> collection)  {
      /* generated by template _ast.builder.MethodDelegate*/

    this.getAdaptedAutomatonSymbolResolvingDelegateList().removeAll(collection);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  AutomataGlobalScopeBuilder retainAllAdaptedAutomatonSymbolResolvingDelegate (Collection<?> collection)  {
      /* generated by template _ast.builder.MethodDelegate*/

    this.getAdaptedAutomatonSymbolResolvingDelegateList().retainAll(collection);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  AutomataGlobalScopeBuilder removeIfAdaptedAutomatonSymbolResolvingDelegate (Predicate<? super automata._symboltable.IAutomatonSymbolResolvingDelegate> filter)  {
      /* generated by template _ast.builder.MethodDelegate*/

    this.getAdaptedAutomatonSymbolResolvingDelegateList().removeIf(filter);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  AutomataGlobalScopeBuilder forEachAdaptedAutomatonSymbolResolvingDelegate (Consumer<? super automata._symboltable.IAutomatonSymbolResolvingDelegate> action)  {
      /* generated by template _ast.builder.MethodDelegate*/

    this.getAdaptedAutomatonSymbolResolvingDelegateList().forEach(action);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  AutomataGlobalScopeBuilder addAdaptedAutomatonSymbolResolvingDelegate (int index,automata._symboltable.IAutomatonSymbolResolvingDelegate element)  {
      /* generated by template _ast.builder.MethodDelegate*/

    this.getAdaptedAutomatonSymbolResolvingDelegateList().add(index, element);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  AutomataGlobalScopeBuilder addAllAdaptedAutomatonSymbolResolvingDelegate (int index,Collection<? extends automata._symboltable.IAutomatonSymbolResolvingDelegate> collection)  {
      /* generated by template _ast.builder.MethodDelegate*/

    this.getAdaptedAutomatonSymbolResolvingDelegateList().addAll(index, collection);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  AutomataGlobalScopeBuilder removeAdaptedAutomatonSymbolResolvingDelegate (int index)  {
      /* generated by template _ast.builder.MethodDelegate*/

    this.getAdaptedAutomatonSymbolResolvingDelegateList().remove(index);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  AutomataGlobalScopeBuilder setAdaptedAutomatonSymbolResolvingDelegate (int index,automata._symboltable.IAutomatonSymbolResolvingDelegate element)  {
      /* generated by template _ast.builder.MethodDelegate*/

    this.getAdaptedAutomatonSymbolResolvingDelegateList().set(index, element);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  AutomataGlobalScopeBuilder replaceAllAdaptedAutomatonSymbolResolvingDelegate (UnaryOperator<automata._symboltable.IAutomatonSymbolResolvingDelegate> operator)  {
      /* generated by template _ast.builder.MethodDelegate*/

    this.getAdaptedAutomatonSymbolResolvingDelegateList().replaceAll(operator);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  AutomataGlobalScopeBuilder sortAdaptedAutomatonSymbolResolvingDelegate (Comparator<? super automata._symboltable.IAutomatonSymbolResolvingDelegate> comparator)  {
      /* generated by template _ast.builder.MethodDelegate*/

    this.getAdaptedAutomatonSymbolResolvingDelegateList().sort(comparator);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  AutomataGlobalScopeBuilder setAdaptedAutomatonSymbolResolvingDelegateList (List<automata._symboltable.IAutomatonSymbolResolvingDelegate> adaptedAutomatonSymbolResolvingDelegate)  {
      /* generated by template _ast.builder.Set*/

    this.adaptedAutomatonSymbolResolvingDelegate = adaptedAutomatonSymbolResolvingDelegate;
    return this.realBuilder;

}

}