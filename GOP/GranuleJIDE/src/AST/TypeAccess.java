package AST;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.io.File;
import java.util.*;
import beaver.*;
import java.util.ArrayList;
import java.util.zip.*;
import java.io.*;
import java.util.Stack;
import java.util.regex.Pattern;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.Transformer;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Element;
import org.w3c.dom.Document;
import java.util.HashMap;
import java.util.Map.Entry;
import javax.xml.transform.TransformerException;
import javax.xml.parsers.ParserConfigurationException;
import java.util.Collection;

/**
 * @ast node
 * @declaredat java.ast:20
 */
public class TypeAccess extends Access implements Cloneable {
  /**
   * @apilvl low-level
   */
  public void flushCache() {
    super.flushCache();
    decls_computed = false;
    decls_value = null;
    decl_computed = false;
    decl_value = null;
    type_computed = false;
    type_value = null;
  }
  /**
   * @apilvl internal
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
  }
  /**
   * @apilvl internal
   */
  @SuppressWarnings({"unchecked", "cast"})
  public TypeAccess clone() throws CloneNotSupportedException {
    TypeAccess node = (TypeAccess)super.clone();
    node.decls_computed = false;
    node.decls_value = null;
    node.decl_computed = false;
    node.decl_value = null;
    node.type_computed = false;
    node.type_value = null;
    node.in$Circle(false);
    node.is$Final(false);
    return node;
  }
  /**
   * @apilvl internal
   */
  @SuppressWarnings({"unchecked", "cast"})
  public TypeAccess copy() {
      try {
        TypeAccess node = (TypeAccess)clone();
        if(children != null) node.children = (ASTNode[])children.clone();
        return node;
      } catch (CloneNotSupportedException e) {
      }
      System.err.println("Error: Could not clone node of type " + getClass().getName() + "!");
      return null;
  }
  /**
   * @apilvl low-level
   */
  @SuppressWarnings({"unchecked", "cast"})
  public TypeAccess fullCopy() {
    TypeAccess res = (TypeAccess)copy();
    for(int i = 0; i < getNumChildNoTransform(); i++) {
      ASTNode node = getChildNoTransform(i);
      if(node != null) node = node.fullCopy();
      res.setChild(node, i);
    }
    return res;
    }
  /**
   * @ast method 
   * @aspect AccessControl
   * @declaredat D:\zhh\JastAddJ\Java1.4Frontend\AccessControl.jrag:131
   */
  public void accessControl() {
    super.accessControl();
    TypeDecl hostType = hostType();
  if(hostType != null && !hostType.isUnknown() && !type().accessibleFrom(hostType) &&!hostType.isShadowClassDecl()) {
      error("" + this + " in " + hostType().fullName() + " can not access type " + type().fullName());
   }
    else if((hostType == null || hostType.isUnknown()) && !type().accessibleFromPackage(hostPackage())) {
      error("" + this + " can not access type " + type().fullName());
    }
  }
  /**
   * @ast method 
   * @aspect NameCheck
   * @declaredat D:\zhh\JastAddJ\Java1.4Frontend\NameCheck.jrag:155
   */
  public void nameCheck() {   
    if(isQualified() && !qualifier().isTypeAccess() && !qualifier().isPackageAccess())
      error("can not access the type named " + decl().typeName() + " in this context");
    if(decls().isEmpty())
      error("no visible type named " + typeName());
    if(decls().size() > 1) {
      StringBuffer s = new StringBuffer();
      s.append("several types named " + name() + ":");
      for(Iterator iter = decls().iterator(); iter.hasNext(); ) {
        TypeDecl t = (TypeDecl)iter.next();
        s.append(" " + t.typeName());
      }
      error(s.toString());
    }
  }
  /**
   * @ast method 
   * @aspect NodeConstructors
   * @declaredat D:\zhh\JastAddJ\Java1.4Frontend\NodeConstructors.jrag:23
   */
  public TypeAccess(String name, int start, int end) {
    this(name);
    this.start = start;
    this.end = end;
  }
  /**
   * @ast method 
   * @aspect NodeConstructors
   * @declaredat D:\zhh\JastAddJ\Java1.4Frontend\NodeConstructors.jrag:44
   */
  public TypeAccess(String typeName) {
    this("", typeName);
  }
  /**
   * @ast method 
   * @aspect PrettyPrint
   * @declaredat D:\zhh\JastAddJ\Java1.4Frontend\PrettyPrint.jadd:610
   */
  public void toString(StringBuffer s) {
    if(decl().isReferenceType())
      s.append(nameWithPackage());
    else
      s.append(decl().name());
  }
  /**
   * @ast method 
   * @aspect Annotations
   * @declaredat D:\zhh\JastAddJ\Java1.5Frontend\Annotations.jrag:328
   */
  public void checkModifiers() {
    if(decl().isDeprecated() &&
       !withinDeprecatedAnnotation() &&
       (hostType() == null || hostType().topLevelType() != decl().topLevelType()) &&
       !withinSuppressWarnings("deprecation"))
      warning(decl().typeName() + " has been deprecated");
  }
  /**
   * @ast method 
   * @aspect GenericsTypeAnalysis
   * @declaredat D:\zhh\JastAddJ\Java1.5Frontend\Generics.jrag:269
   */
  public boolean isRaw() {
    /*
    if(hasNextAccess())
      return false;
    */
    ASTNode parent = getParent();
    while(parent instanceof AbstractDot)
      parent = parent.getParent();
    if(parent instanceof ParTypeAccess)
      return false;
    if(parent instanceof ImportDecl)
      return false;
    /*
    Access a = this;
    while(a.isTypeAccess() && hasNextAccess())
      a = a.nextAccess();
    if(a.isThisAccess() || a.isSuperAccess())
      return false;
    */
    return true;
  }
  /**
   * @ast method 
   * @aspect GenericsTypeCheck
   * @declaredat D:\zhh\JastAddJ\Java1.5Frontend\Generics.jrag:409
   */
  public void typeCheck() {
    TypeDecl type = type();
    if(type.isRawType() && type.isNestedType() && type.enclosingType().isParameterizedType() && !type.enclosingType().isRawType())
      error("Can not access a member type of a paramterized type as a raw type");
  }
  /**
   * @ast method 
   * @declaredat java.ast:1
   */
  public TypeAccess() {
    super();


  }
  /**
   * @ast method 
   * @declaredat java.ast:7
   */
  public TypeAccess(String p0, String p1) {
    setPackage(p0);
    setID(p1);
  }
  /**
   * @ast method 
   * @declaredat java.ast:11
   */
  public TypeAccess(beaver.Symbol p0, beaver.Symbol p1) {
    setPackage(p0);
    setID(p1);
  }
  /**
   * @apilvl low-level
   * @ast method 
   * @declaredat java.ast:18
   */
  protected int numChildren() {
    return 0;
  }
  /**
   * @apilvl internal
   * @ast method 
   * @declaredat java.ast:24
   */
  public boolean mayHaveRewrite() {
    return false;
  }
  /**
   * Setter for lexeme Package
   * @apilvl high-level
   * @ast method 
   * @declaredat java.ast:5
   */
  public void setPackage(String value) {
    tokenString_Package = value;
  }
  /**   * @apilvl internal   * @ast method 
   * @declaredat java.ast:8
   */
  
  /**   * @apilvl internal   */  protected String tokenString_Package;
  /**
   * @ast method 
   * @declaredat java.ast:9
   */
  
  public int Packagestart;
  /**
   * @ast method 
   * @declaredat java.ast:10
   */
  
  public int Packageend;
  /**
   * @ast method 
   * @declaredat java.ast:11
   */
  public void setPackage(beaver.Symbol symbol) {
    if(symbol.value != null && !(symbol.value instanceof String))
      throw new UnsupportedOperationException("setPackage is only valid for String lexemes");
    tokenString_Package = (String)symbol.value;
    Packagestart = symbol.getStart();
    Packageend = symbol.getEnd();
  }
  /**
   * Getter for lexeme Package
   * @apilvl high-level
   * @ast method 
   * @declaredat java.ast:22
   */
  public String getPackage() {
    return tokenString_Package != null ? tokenString_Package : "";
  }
  /**
   * Setter for lexeme ID
   * @apilvl high-level
   * @ast method 
   * @declaredat java.ast:5
   */
  public void setID(String value) {
    tokenString_ID = value;
  }
  /**   * @apilvl internal   * @ast method 
   * @declaredat java.ast:8
   */
  
  /**   * @apilvl internal   */  protected String tokenString_ID;
  /**
   * @ast method 
   * @declaredat java.ast:9
   */
  
  public int IDstart;
  /**
   * @ast method 
   * @declaredat java.ast:10
   */
  
  public int IDend;
  /**
   * @ast method 
   * @declaredat java.ast:11
   */
  public void setID(beaver.Symbol symbol) {
    if(symbol.value != null && !(symbol.value instanceof String))
      throw new UnsupportedOperationException("setID is only valid for String lexemes");
    tokenString_ID = (String)symbol.value;
    IDstart = symbol.getStart();
    IDend = symbol.getEnd();
  }
  /**
   * Getter for lexeme ID
   * @apilvl high-level
   * @ast method 
   * @declaredat java.ast:22
   */
  public String getID() {
    return tokenString_ID != null ? tokenString_ID : "";
  }
  /**
   * @ast method 
   * @aspect GenericsCodegen
   * @declaredat D:\zhh\JastAddJ\Java1.5Backend\GenericsCodegen.jrag:332
   */
    public void transformation() {
    super.transformation();
    if(type().elementType().isNestedType() && hostType() != null)
      hostType().addUsedNestedType(type().elementType().erasure().sourceTypeDecl());
  }
  /**
   * @ast method 
   * @aspect TypeScopePropagation
   * @declaredat D:\zhh\JastAddJ\Java1.4Frontend\LookupType.jrag:154
   */
  private TypeDecl refined_TypeScopePropagation_TypeAccess_decl()
{
    SimpleSet decls = decls(); 
    if(decls.size() == 1) {
      return (TypeDecl)decls.iterator().next();
    }
    
    return unknownType();
  }
  /**
   * @apilvl internal
   */
  protected boolean decls_computed = false;
  /**
   * @apilvl internal
   */
  protected SimpleSet decls_value;
  /**
   * @attribute syn
   * @aspect TypeScopePropagation
   * @declaredat D:\zhh\JastAddJ\Java1.4Frontend\LookupType.jrag:138
   */
  @SuppressWarnings({"unchecked", "cast"})
  public SimpleSet decls() {
    if(decls_computed) {
      return decls_value;
    }
      ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    decls_value = decls_compute();
if(isFinal && num == state().boundariesCrossed) decls_computed = true;
    return decls_value;
  }
  /**
   * @apilvl internal
   */
  private SimpleSet decls_compute() {
    if(packageName().equals(""))
      return lookupType(name());
    else {
      TypeDecl typeDecl = lookupType(packageName(), name());
      if(typeDecl != null)
        return SimpleSet.emptySet.add(typeDecl);
      return SimpleSet.emptySet;
    }
  }
  /**
   * @apilvl internal
   */
  protected boolean decl_computed = false;
  /**
   * @apilvl internal
   */
  protected TypeDecl decl_value;
  /**
   * @attribute syn
   * @aspect GenericsTypeAnalysis
   * @declaredat D:\zhh\JastAddJ\Java1.5Frontend\Generics.jrag:261
   */
  @SuppressWarnings({"unchecked", "cast"})
  public TypeDecl decl() {
    if(decl_computed) {
      return decl_value;
    }
      ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    decl_value = decl_compute();
if(isFinal && num == state().boundariesCrossed) decl_computed = true;
    return decl_value;
  }
  /**
   * @apilvl internal
   */
  private TypeDecl decl_compute() {
    TypeDecl decl = refined_TypeScopePropagation_TypeAccess_decl();
    if(decl instanceof GenericTypeDecl && isRaw())
      return ((GenericTypeDecl)decl).lookupParTypeDecl(new ArrayList());
    return decl;
  }
  /**
   * @attribute syn
   * @aspect VariableScope
   * @declaredat D:\zhh\JastAddJ\Java1.4Frontend\LookupVariable.jrag:222
   */
  @SuppressWarnings({"unchecked", "cast"})
  public SimpleSet qualifiedLookupVariable(String name) {
      ASTNode$State state = state();
    SimpleSet qualifiedLookupVariable_String_value = qualifiedLookupVariable_compute(name);
    return qualifiedLookupVariable_String_value;
  }
  /**
   * @apilvl internal
   */
  private SimpleSet qualifiedLookupVariable_compute(String name) {
    if(type().accessibleFrom(hostType())) {  
      SimpleSet c = type().memberFields(name);
      c = keepAccessibleFields(c);
      if(type().isClassDecl() && c.size() == 1)
        c = removeInstanceVariables(c);
      return c;
    }
    return SimpleSet.emptySet;
  }
  /**
   * @attribute syn
   * @aspect PrettyPrint
   * @declaredat D:\zhh\JastAddJ\Java1.4Frontend\PrettyPrint.jadd:934
   */
  @SuppressWarnings({"unchecked", "cast"})
  public String dumpString() {
      ASTNode$State state = state();
    String dumpString_value = dumpString_compute();
    return dumpString_value;
  }
  /**
   * @apilvl internal
   */
  private String dumpString_compute() {  return getClass().getName() + " [" + getPackage() + ", " + getID() + "]";  }
  /**
   * @attribute syn
   * @aspect Names
   * @declaredat D:\zhh\JastAddJ\Java1.4Frontend\QualifiedNames.jrag:21
   */
  @SuppressWarnings({"unchecked", "cast"})
  public String name() {
      ASTNode$State state = state();
    String name_value = name_compute();
    return name_value;
  }
  /**
   * @apilvl internal
   */
  private String name_compute() {  return getID();  }
  /**
   * @attribute syn
   * @aspect Names
   * @declaredat D:\zhh\JastAddJ\Java1.4Frontend\QualifiedNames.jrag:28
   */
  @SuppressWarnings({"unchecked", "cast"})
  public String packageName() {
      ASTNode$State state = state();
    String packageName_value = packageName_compute();
    return packageName_value;
  }
  /**
   * @apilvl internal
   */
  private String packageName_compute() {  return getPackage();  }
  /**
   * @attribute syn
   * @aspect Names
   * @declaredat D:\zhh\JastAddJ\Java1.4Frontend\QualifiedNames.jrag:51
   */
  @SuppressWarnings({"unchecked", "cast"})
  public String nameWithPackage() {
      ASTNode$State state = state();
    String nameWithPackage_value = nameWithPackage_compute();
    return nameWithPackage_value;
  }
  /**
   * @apilvl internal
   */
  private String nameWithPackage_compute() {  return getPackage().equals("") ? name() : (getPackage() + "." + name());  }
  /**
   * @attribute syn
   * @aspect Names
   * @declaredat D:\zhh\JastAddJ\Java1.4Frontend\QualifiedNames.jrag:66
   */
  @SuppressWarnings({"unchecked", "cast"})
  public String typeName() {
      ASTNode$State state = state();
    String typeName_value = typeName_compute();
    return typeName_value;
  }
  /**
   * @apilvl internal
   */
  private String typeName_compute() {  return isQualified() ? (qualifier().typeName() + "." + name()) : nameWithPackage();  }
  /**
   * @attribute syn
   * @aspect AccessTypes
   * @declaredat D:\zhh\JastAddJ\Java1.4Frontend\ResolveAmbiguousNames.jrag:14
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean isTypeAccess() {
      ASTNode$State state = state();
    boolean isTypeAccess_value = isTypeAccess_compute();
    return isTypeAccess_value;
  }
  /**
   * @apilvl internal
   */
  private boolean isTypeAccess_compute() {  return true;  }
  /**
   * @attribute syn
   * @aspect SyntacticClassification
   * @declaredat D:\zhh\JastAddJ\Java1.4Frontend\SyntacticClassification.jrag:109
   */
  @SuppressWarnings({"unchecked", "cast"})
  public NameType predNameType() {
      ASTNode$State state = state();
    NameType predNameType_value = predNameType_compute();
    return predNameType_value;
  }
  /**
   * @apilvl internal
   */
  private NameType predNameType_compute() {  return NameType.PACKAGE_OR_TYPE_NAME;  }
  /**
   * @attribute syn
   * @aspect TypeAnalysis
   * @declaredat D:\zhh\JastAddJ\Java1.4Frontend\TypeAnalysis.jrag:281
   */
  @SuppressWarnings({"unchecked", "cast"})
  public TypeDecl type() {
    if(type_computed) {
      return type_value;
    }
      ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    type_value = type_compute();
if(isFinal && num == state().boundariesCrossed) type_computed = true;
    return type_value;
  }
  /**
   * @apilvl internal
   */
  private TypeDecl type_compute() {  return decl();  }
  /**
   * @attribute syn
   * @aspect TypeHierarchyCheck
   * @declaredat D:\zhh\JastAddJ\Java1.4Frontend\TypeHierarchyCheck.jrag:195
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean staticContextQualifier() {
      ASTNode$State state = state();
    boolean staticContextQualifier_value = staticContextQualifier_compute();
    return staticContextQualifier_value;
  }
  /**
   * @apilvl internal
   */
  private boolean staticContextQualifier_compute() {  return true;  }
  /**
   * @attribute syn
   * @aspect LookupParTypeDecl
   * @declaredat D:\zhh\JastAddJ\Java1.5Frontend\Generics.jrag:911
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean usesTypeVariable() {
      ASTNode$State state = state();
    boolean usesTypeVariable_value = usesTypeVariable_compute();
    return usesTypeVariable_value;
  }
  /**
   * @apilvl internal
   */
  private boolean usesTypeVariable_compute() {  return decl().usesTypeVariable() || super.usesTypeVariable();  }
  /**
   * @apilvl internal
   */
  public ASTNode rewriteTo() {
    return super.rewriteTo();
  }
}
