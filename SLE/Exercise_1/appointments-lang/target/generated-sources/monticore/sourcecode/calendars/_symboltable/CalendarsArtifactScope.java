/* generated from model Calendars */
/* generated by template core.Class*/

/* (c) https://github.com/MontiCore/monticore */
package calendars._symboltable;

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


 public  class CalendarsArtifactScope extends calendars._symboltable.CalendarsScope  implements de.monticore.symboltable.IArtifactScope {

    /* generated by template core.Attribute*/
 private  String packageName ;

    /* generated by template core.Attribute*/
 private  List<de.monticore.symboltable.ImportStatement> imports ;


    /* generated by template core.Constructor*/
 public  CalendarsArtifactScope(String packageName,List<de.monticore.symboltable.ImportStatement> imports)  {
    this(Optional.empty(), packageName, imports);
}

    /* generated by template core.Constructor*/
 public  CalendarsArtifactScope(Optional<calendars._symboltable.ICalendarsScope> enclosingScope,String packageName,List<de.monticore.symboltable.ImportStatement> imports)  {
    /* generated by template _symboltable.artifactscope.Constructor*/
  super(true);
  if (enclosingScope.isPresent()) {
    setEnclosingScope(enclosingScope.get());
  }
  setExportingSymbols(true);
  Log.errorIfNull(packageName);
  Log.errorIfNull(imports);

  if (!packageName.isEmpty()) {
    this.packageName = packageName.endsWith(".") ? packageName.substring(0, packageName.length() - 1) : packageName;
  } else {
    // default package
    this.packageName = "";
  }

  this.imports = Collections.unmodifiableList(new ArrayList<>(imports));
}


    /* generated by template core.Method*/
 public  String getPackageName ()  {
      /* generated by template methods.Get*/

return this.packageName;

}

    /* generated by template core.Method*/
 public  void setPackageName (String packageName)  {
      /* generated by template methods.Set*/

this.packageName = packageName;

}

    /* generated by template core.Method*/
 public  boolean containsImport (Object element)  {
      /* generated by template methods.MethodDelegate*/

return this.getImportList().contains(element);

}

    /* generated by template core.Method*/
 public  boolean containsAllImports (Collection<?> collection)  {
      /* generated by template methods.MethodDelegate*/

return this.getImportList().containsAll(collection);

}

    /* generated by template core.Method*/
 public  boolean isEmptyImports ()  {
      /* generated by template methods.MethodDelegate*/

return this.getImportList().isEmpty();

}

    /* generated by template core.Method*/
 public  Iterator<de.monticore.symboltable.ImportStatement> iteratorImports ()  {
      /* generated by template methods.MethodDelegate*/

return this.getImportList().iterator();

}

    /* generated by template core.Method*/
 public  int sizeImports ()  {
      /* generated by template methods.MethodDelegate*/

return this.getImportList().size();

}

    /* generated by template core.Method*/
 public  de.monticore.symboltable.ImportStatement[] toArrayImports (de.monticore.symboltable.ImportStatement[] array)  {
      /* generated by template methods.MethodDelegate*/

return this.getImportList().toArray(array);

}

    /* generated by template core.Method*/
 public  Object[] toArrayImports ()  {
      /* generated by template methods.MethodDelegate*/

return this.getImportList().toArray();

}

    /* generated by template core.Method*/
 public  Spliterator<de.monticore.symboltable.ImportStatement> spliteratorImports ()  {
      /* generated by template methods.MethodDelegate*/

return this.getImportList().spliterator();

}

    /* generated by template core.Method*/
 public  Stream<de.monticore.symboltable.ImportStatement> streamImports ()  {
      /* generated by template methods.MethodDelegate*/

return this.getImportList().stream();

}

    /* generated by template core.Method*/
 public  Stream<de.monticore.symboltable.ImportStatement> parallelStreamImports ()  {
      /* generated by template methods.MethodDelegate*/

return this.getImportList().parallelStream();

}

    /* generated by template core.Method*/
 public  de.monticore.symboltable.ImportStatement getImport (int index)  {
      /* generated by template methods.MethodDelegate*/

return this.getImportList().get(index);

}

    /* generated by template core.Method*/
 public  int indexOfImport (Object element)  {
      /* generated by template methods.MethodDelegate*/

return this.getImportList().indexOf(element);

}

    /* generated by template core.Method*/
 public  int lastIndexOfImport (Object element)  {
      /* generated by template methods.MethodDelegate*/

return this.getImportList().lastIndexOf(element);

}

    /* generated by template core.Method*/
 public  boolean equalsImports (Object o)  {
      /* generated by template methods.MethodDelegate*/

return this.getImportList().equals(o);

}

    /* generated by template core.Method*/
 public  int hashCodeImports ()  {
      /* generated by template methods.MethodDelegate*/

return this.getImportList().hashCode();

}

    /* generated by template core.Method*/
 public  ListIterator<de.monticore.symboltable.ImportStatement> listIteratorImports ()  {
      /* generated by template methods.MethodDelegate*/

return this.getImportList().listIterator();

}

    /* generated by template core.Method*/
 public  ListIterator<de.monticore.symboltable.ImportStatement> listIteratorImports (int index)  {
      /* generated by template methods.MethodDelegate*/

return this.getImportList().listIterator(index);

}

    /* generated by template core.Method*/
 public  List<de.monticore.symboltable.ImportStatement> subListImports (int start,int end)  {
      /* generated by template methods.MethodDelegate*/

return this.getImportList().subList(start, end);

}

    /* generated by template core.Method*/
 public  List<de.monticore.symboltable.ImportStatement> getImportList ()  {
      /* generated by template methods.Get*/

return this.imports;

}

    /* generated by template core.Method*/
 public  void clearImports ()  {
      /* generated by template methods.MethodDelegate*/

this.getImportList().clear();

}

    /* generated by template core.Method*/
 public  boolean addImport (de.monticore.symboltable.ImportStatement element)  {
      /* generated by template methods.MethodDelegate*/

return this.getImportList().add(element);

}

    /* generated by template core.Method*/
 public  boolean addAllImports (Collection<? extends de.monticore.symboltable.ImportStatement> collection)  {
      /* generated by template methods.MethodDelegate*/

return this.getImportList().addAll(collection);

}

    /* generated by template core.Method*/
 public  boolean removeImport (Object element)  {
      /* generated by template methods.MethodDelegate*/

return this.getImportList().remove(element);

}

    /* generated by template core.Method*/
 public  boolean removeAllImports (Collection<?> collection)  {
      /* generated by template methods.MethodDelegate*/

return this.getImportList().removeAll(collection);

}

    /* generated by template core.Method*/
 public  boolean retainAllImports (Collection<?> collection)  {
      /* generated by template methods.MethodDelegate*/

return this.getImportList().retainAll(collection);

}

    /* generated by template core.Method*/
 public  boolean removeIfImport (Predicate<? super de.monticore.symboltable.ImportStatement> filter)  {
      /* generated by template methods.MethodDelegate*/

return this.getImportList().removeIf(filter);

}

    /* generated by template core.Method*/
 public  void forEachImports (Consumer<? super de.monticore.symboltable.ImportStatement> action)  {
      /* generated by template methods.MethodDelegate*/

this.getImportList().forEach(action);

}

    /* generated by template core.Method*/
 public  void addImport (int index,de.monticore.symboltable.ImportStatement element)  {
      /* generated by template methods.MethodDelegate*/

this.getImportList().add(index, element);

}

    /* generated by template core.Method*/
 public  boolean addAllImports (int index,Collection<? extends de.monticore.symboltable.ImportStatement> collection)  {
      /* generated by template methods.MethodDelegate*/

return this.getImportList().addAll(index, collection);

}

    /* generated by template core.Method*/
 public  de.monticore.symboltable.ImportStatement removeImport (int index)  {
      /* generated by template methods.MethodDelegate*/

return this.getImportList().remove(index);

}

    /* generated by template core.Method*/
 public  de.monticore.symboltable.ImportStatement setImport (int index,de.monticore.symboltable.ImportStatement element)  {
      /* generated by template methods.MethodDelegate*/

return this.getImportList().set(index, element);

}

    /* generated by template core.Method*/
 public  void replaceAllImports (UnaryOperator<de.monticore.symboltable.ImportStatement> operator)  {
      /* generated by template methods.MethodDelegate*/

this.getImportList().replaceAll(operator);

}

    /* generated by template core.Method*/
 public  void sortImports (Comparator<? super de.monticore.symboltable.ImportStatement> comparator)  {
      /* generated by template methods.MethodDelegate*/

this.getImportList().sort(comparator);

}

    /* generated by template core.Method*/
 public  void setImportList (List<de.monticore.symboltable.ImportStatement> imports)  {
      /* generated by template methods.Set*/

this.imports = imports;

}

    /* generated by template core.Method*/
 public  String getName ()  {
      /* generated by template _symboltable.artifactscope.GetName*/
  if (!super.isPresentName()) {
    final Optional<de.monticore.symboltable.ISymbol> topLevelSymbol = getTopLevelSymbol();
    if (topLevelSymbol.isPresent()) {
      setName(topLevelSymbol.get().getName());
    }
  }
  return super.getName();
}

    /* generated by template core.Method*/
 public  boolean isPresentName ()  {
      /* generated by template _symboltable.artifactscope.IsPresentName*/
  if (!super.isPresentName()) {
    final Optional<de.monticore.symboltable.ISymbol> topLevelSymbol = getTopLevelSymbol();
    if (topLevelSymbol.isPresent()) {
      setName(topLevelSymbol.get().getName());
    }
  }
  return this.name.isPresent();
}

    /* generated by template core.Method*/
 public  Optional<de.monticore.symboltable.ISymbol> getTopLevelSymbol ()  {
      /* generated by template _symboltable.artifactscope.GetTopLevelSymbol*/
  if (getSubScopes().size() == 1) {
    if(getSubScopes().get(0).isPresentSpanningSymbol()) {
      ISymbol scopeSpanningSymbol = getSubScopes().get(0).getSpanningSymbol();
      return Optional.of(scopeSpanningSymbol);
    }
  }
  // there is no top level symbol, if more than one sub scope exists.
  return Optional.empty();
}

    /* generated by template core.Method*/
 public  boolean checkIfContinueAsSubScope (String symbolName)  {
      /* generated by template _symboltable.artifactscope.CheckIfContinueAsSubScope*/
  if (this.isExportingSymbols()) {
    final String symbolQualifier = de.se_rwth.commons.Names.getQualifier(symbolName);

    final List<String> symbolQualifierParts = de.se_rwth.commons.Splitters.DOT.splitToList(symbolQualifier);
    final List<String> packageParts = de.se_rwth.commons.Splitters.DOT.splitToList(packageName);

    boolean symbolNameStartsWithPackage = true;

    if (packageName.isEmpty()) {
      // symbol qualifier always contains default package (i.e., empty string)
      symbolNameStartsWithPackage = true;
    } else if (symbolQualifierParts.size() >= packageParts.size()) {
      for (int i = 0; i < packageParts.size(); i++) {
        if (!packageParts.get(i).equals(symbolQualifierParts.get(i))) {
          symbolNameStartsWithPackage = false;
          break;
        }
      }
    } else {
      symbolNameStartsWithPackage = false;
    }
      return symbolNameStartsWithPackage;
  }
  return false;
}

    /* generated by template core.Method*/
 public  java.nio.file.Path getFilePath (calendars._symboltable.CalendarsLanguage lang)  {
      /* generated by template _symboltable.artifactscope.GetFilePath*/
  String fileName = (isPresentName() ? getName() : "symbols") + "." + lang.getSymbolFileExtension();
  return java.nio.file.Paths.get(de.monticore.utils.Names.getPathFromPackage(getPackageName()), fileName);
}

    /* generated by template core.Method*/
 public  String getRemainingNameForResolveDown (String symbolName)  {
      /* generated by template _symboltable.artifactscope.GetRemainingNameForResolveDown*/
  final String packageAS = this.getPackageName();
  final com.google.common.collect.FluentIterable<String> packageASNameParts = com.google.common.collect.FluentIterable
  .from(de.se_rwth.commons.Splitters.DOT.omitEmptyStrings().split(packageAS));

  final com.google.common.collect.FluentIterable<String> symbolNameParts = com.google.common.collect.FluentIterable
    .from(de.se_rwth.commons.Splitters.DOT.split(symbolName));
  String remainingSymbolName = symbolName;

  if (symbolNameParts.size() > packageASNameParts.size()) {
    remainingSymbolName = de.se_rwth.commons.Joiners.DOT.join(symbolNameParts.skip(packageASNameParts.size()));
  }

  return remainingSymbolName;
}

    /* generated by template core.Method*/
 public  void accept (calendars._visitor.CalendarsScopeVisitor visitor)  {
      visitor.handle(this);
}

}
