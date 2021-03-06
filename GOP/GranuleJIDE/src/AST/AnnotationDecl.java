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
 * @declaredat Annotations.ast:2
 */
public class AnnotationDecl extends InterfaceDecl implements Cloneable {
  /**
   * @apilvl low-level
   */
  public void flushCache() {
    super.flushCache();
    getSuperInterfaceIdList_computed = false;
    getSuperInterfaceIdList_value = null;
    containsElementOf_TypeDecl_values = null;
    flags_computed = false;
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
  public AnnotationDecl clone() throws CloneNotSupportedException {
    AnnotationDecl node = (AnnotationDecl)super.clone();
    node.getSuperInterfaceIdList_computed = false;
    node.getSuperInterfaceIdList_value = null;
    node.containsElementOf_TypeDecl_values = null;
    node.flags_computed = false;
    node.in$Circle(false);
    node.is$Final(false);
    return node;
  }
  /**
   * @apilvl internal
   */
  @SuppressWarnings({"unchecked", "cast"})
  public AnnotationDecl copy() {
      try {
        AnnotationDecl node = (AnnotationDecl)clone();
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
  public AnnotationDecl fullCopy() {
    AnnotationDecl res = (AnnotationDecl)copy();
    for(int i = 0; i < getNumChildNoTransform(); i++) {
      ASTNode node = getChildNoTransform(i);
      if(node != null) node = node.fullCopy();
      res.setChild(node, i);
    }
    return res;
    }
  /**
   * @ast method 
   * @aspect Annotations
   * @declaredat D:\zhh\JastAddJ\Java1.5Frontend\Annotations.jrag:103
   */
  public void typeCheck() {
    super.typeCheck();
    for(int i = 0; i < getNumBodyDecl(); i++) {
      if(getBodyDecl(i) instanceof MethodDecl) {
        MethodDecl m = (MethodDecl)getBodyDecl(i);
        if(!m.type().isValidAnnotationMethodReturnType())
          m.error("invalid type for annotation member");
        if(m.annotationMethodOverride())
          m.error("annotation method overrides " + m.signature());
      }
    }
    if(containsElementOf(this))
      error("cyclic annotation element type");
  }
  /**
   * @ast method 
   * @aspect Annotations
   * @declaredat D:\zhh\JastAddJ\Java1.5Frontend\Annotations.jrag:558
   */
  public void toString(StringBuffer s) {
    getModifiers().toString(s);
    s.append("@interface " + name());
    s.append(" {");
    for(int i=0; i < getNumBodyDecl(); i++) {
      getBodyDecl(i).toString(s);
    }
    s.append(indent() + "}");
  }
  /**
   * @ast method 
   * @declaredat Annotations.ast:1
   */
  public AnnotationDecl() {
    super();

    setChild(new List(), 1);
    setChild(new List(), 2);

  }
  /**
   * @ast method 
   * @declaredat Annotations.ast:9
   */
  public AnnotationDecl(Modifiers p0, String p1, List<BodyDecl> p2) {
    setChild(p0, 0);
    setID(p1);
    setChild(p2, 1);
    setChild(new List(), 2);
  }
  /**
   * @ast method 
   * @declaredat Annotations.ast:15
   */
  public AnnotationDecl(Modifiers p0, beaver.Symbol p1, List<BodyDecl> p2) {
    setChild(p0, 0);
    setID(p1);
    setChild(p2, 1);
    setChild(new List(), 2);
  }
  /**
   * @apilvl low-level
   * @ast method 
   * @declaredat Annotations.ast:24
   */
  protected int numChildren() {
    return 2;
  }
  /**
   * @apilvl internal
   * @ast method 
   * @declaredat Annotations.ast:30
   */
  public boolean mayHaveRewrite() {
    return false;
  }
  /**
   * Setter for Modifiers
   * @apilvl high-level
   * @ast method 
   * @declaredat java.ast:5
   */
  public void setModifiers(Modifiers node) {
    setChild(node, 0);
  }
  /**
   * Getter for Modifiers
   * @apilvl high-level
   * @ast method 
   * @declaredat java.ast:12
   */
  public Modifiers getModifiers() {
    return (Modifiers)getChild(0);
  }
  /**
   * @apilvl low-level
   * @ast method 
   * @declaredat java.ast:18
   */
  public Modifiers getModifiersNoTransform() {
    return (Modifiers)getChildNoTransform(0);
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
  /**
   * @ast method 
   * @declaredat java.ast:8
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
   * @declaredat java.ast:19
   */
  public String getID() {
    return tokenString_ID != null ? tokenString_ID : "";
  }
  /**
   * Setter for BodyDeclList
   * @apilvl high-level
   * @ast method 
   * @declaredat java.ast:5
   */
  public void setBodyDeclList(List<BodyDecl> list) {
    setChild(list, 1);
  }
  /**
   * @return number of children in BodyDeclList
   * @apilvl high-level
   * @ast method 
   * @declaredat java.ast:12
   */
  public int getNumBodyDecl() {
    return getBodyDeclList().getNumChild();
  }
  /**
   * Getter for child in list BodyDeclList
   * @apilvl high-level
   * @ast method 
   * @declaredat java.ast:19
   */
  @SuppressWarnings({"unchecked", "cast"})
  public BodyDecl getBodyDecl(int i) {
    return (BodyDecl)getBodyDeclList().getChild(i);
  }
  /**
   * Add element to list BodyDeclList
   * @apilvl high-level
   * @ast method 
   * @declaredat java.ast:27
   */
  public void addBodyDecl(BodyDecl node) {
    List<BodyDecl> list = (parent == null || state == null) ? getBodyDeclListNoTransform() : getBodyDeclList();
    list.addChild(node);
  }
  /**
   * @apilvl low-level
   * @ast method 
   * @declaredat java.ast:34
   */
  public void addBodyDeclNoTransform(BodyDecl node) {
    List<BodyDecl> list = getBodyDeclListNoTransform();
    list.addChild(node);
  }
  /**
   * Setter for child in list BodyDeclList
   * @apilvl high-level
   * @ast method 
   * @declaredat java.ast:42
   */
  public void setBodyDecl(BodyDecl node, int i) {
    List<BodyDecl> list = getBodyDeclList();
    list.setChild(node, i);
  }
  /**
   * Getter for BodyDecl list.
   * @apilvl high-level
   * @ast method 
   * @declaredat java.ast:50
   */
  public List<BodyDecl> getBodyDecls() {
    return getBodyDeclList();
  }
  /**
   * @apilvl low-level
   * @ast method 
   * @declaredat java.ast:56
   */
  public List<BodyDecl> getBodyDeclsNoTransform() {
    return getBodyDeclListNoTransform();
  }
  /**
   * Getter for list BodyDeclList
   * @apilvl high-level
   * @ast method 
   * @declaredat java.ast:63
   */
  @SuppressWarnings({"unchecked", "cast"})
  public List<BodyDecl> getBodyDeclList() {
    List<BodyDecl> list = (List<BodyDecl>)getChild(1);
    list.getNumChild();
    return list;
  }
  /**
   * @apilvl low-level
   * @ast method 
   * @declaredat java.ast:72
   */
  @SuppressWarnings({"unchecked", "cast"})
  public List<BodyDecl> getBodyDeclListNoTransform() {
    return (List<BodyDecl>)getChildNoTransform(1);
  }
  /**
   * Setter for SuperInterfaceIdList
   * @apilvl high-level
   * @ast method 
   * @declaredat Annotations.ast:5
   */
  public void setSuperInterfaceIdList(List<Access> list) {
    setChild(list, 2);
  }
  /**
   * @return number of children in SuperInterfaceIdList
   * @apilvl high-level
   * @ast method 
   * @declaredat Annotations.ast:12
   */
  public int getNumSuperInterfaceId() {
    return getSuperInterfaceIdList().getNumChild();
  }
  /**
   * Getter for child in list SuperInterfaceIdList
   * @apilvl high-level
   * @ast method 
   * @declaredat Annotations.ast:19
   */
  @SuppressWarnings({"unchecked", "cast"})
  public Access getSuperInterfaceId(int i) {
    return (Access)getSuperInterfaceIdList().getChild(i);
  }
  /**
   * Add element to list SuperInterfaceIdList
   * @apilvl high-level
   * @ast method 
   * @declaredat Annotations.ast:27
   */
  public void addSuperInterfaceId(Access node) {
    List<Access> list = (parent == null || state == null) ? getSuperInterfaceIdListNoTransform() : getSuperInterfaceIdList();
    list.addChild(node);
  }
  /**
   * @apilvl low-level
   * @ast method 
   * @declaredat Annotations.ast:34
   */
  public void addSuperInterfaceIdNoTransform(Access node) {
    List<Access> list = getSuperInterfaceIdListNoTransform();
    list.addChild(node);
  }
  /**
   * Setter for child in list SuperInterfaceIdList
   * @apilvl high-level
   * @ast method 
   * @declaredat Annotations.ast:42
   */
  public void setSuperInterfaceId(Access node, int i) {
    List<Access> list = getSuperInterfaceIdList();
    list.setChild(node, i);
  }
  /**
   * Getter for SuperInterfaceId list.
   * @apilvl high-level
   * @ast method 
   * @declaredat Annotations.ast:50
   */
  public List<Access> getSuperInterfaceIds() {
    return getSuperInterfaceIdList();
  }
  /**
   * @apilvl low-level
   * @ast method 
   * @declaredat Annotations.ast:56
   */
  public List<Access> getSuperInterfaceIdsNoTransform() {
    return getSuperInterfaceIdListNoTransform();
  }
  /**
   * @apilvl low-level
   * @ast method 
   * @declaredat Annotations.ast:62
   */
  public List<Access> getSuperInterfaceIdListNoTransform() {
    return (List<Access>)getChildNoTransform(2);
  }
  /**
   * @apilvl low-level
   * @ast method 
   * @declaredat Annotations.ast:68
   */
  protected int getSuperInterfaceIdListChildPosition() {
    return 2;
  }
  /**
   * @apilvl internal
   */
  protected boolean getSuperInterfaceIdList_computed = false;
  /**
   * @apilvl internal
   */
  protected List getSuperInterfaceIdList_value;
  /* The direct superinterface of an annotation type is always
  annotation.Annotation.* @attribute syn nta
   * @aspect Annotations
   * @declaredat D:\zhh\JastAddJ\Java1.5Frontend\Annotations.jrag:99
   */
  @SuppressWarnings({"unchecked", "cast"})
  public List getSuperInterfaceIdList() {
    if(getSuperInterfaceIdList_computed) {
      return (List)ASTNode.getChild(this, getSuperInterfaceIdListChildPosition());
    }
      ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    getSuperInterfaceIdList_value = getSuperInterfaceIdList_compute();
    setSuperInterfaceIdList(getSuperInterfaceIdList_value);
if(isFinal && num == state().boundariesCrossed) getSuperInterfaceIdList_computed = true;
    return (List)ASTNode.getChild(this, getSuperInterfaceIdListChildPosition());
  }
  /**
   * @apilvl internal
   */
  private List getSuperInterfaceIdList_compute() {
    return new List().add(new TypeAccess("java.lang.annotation", "Annotation"));
  }
  /* It is a compile-time error if the return type of a method declared in an
  annotation type is any type other than one of the following: one of the
  primitive types, String, Class and any invocation of Class, an enum type
  (\ufffd.9), an annotation type, or an array (\ufffd0) of one of the preceding types.* @attribute syn
   * @aspect Annotations
   * @declaredat D:\zhh\JastAddJ\Java1.5Frontend\Annotations.jrag:134
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean isValidAnnotationMethodReturnType() {
      ASTNode$State state = state();
    boolean isValidAnnotationMethodReturnType_value = isValidAnnotationMethodReturnType_compute();
    return isValidAnnotationMethodReturnType_value;
  }
  /**
   * @apilvl internal
   */
  private boolean isValidAnnotationMethodReturnType_compute() {  return true;  }
  protected java.util.Map containsElementOf_TypeDecl_values;
  /* It is a compile-time error if an annotation type T contains an element of
  type T, either directly or indirectly.* @attribute syn
   * @aspect Annotations
   * @declaredat D:\zhh\JastAddJ\Java1.5Frontend\Annotations.jrag:144
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean containsElementOf(TypeDecl typeDecl) {
    Object _parameters = typeDecl;
    if(containsElementOf_TypeDecl_values == null) containsElementOf_TypeDecl_values = new java.util.HashMap(4);
    ASTNode$State.CircularValue _value;
    if(containsElementOf_TypeDecl_values.containsKey(_parameters)) {
      Object _o = containsElementOf_TypeDecl_values.get(_parameters);
      if(!(_o instanceof ASTNode$State.CircularValue)) {
        return ((Boolean)_o).booleanValue();
      }
      else
        _value = (ASTNode$State.CircularValue)_o;
    }
    else {
      _value = new ASTNode$State.CircularValue();
      containsElementOf_TypeDecl_values.put(_parameters, _value);
      _value.value = Boolean.valueOf(false);
    }
    ASTNode$State state = state();
    if (!state.IN_CIRCLE) {
      state.IN_CIRCLE = true;
      int num = state.boundariesCrossed;
      boolean isFinal = this.is$Final();
      boolean new_containsElementOf_TypeDecl_value;
      do {
        _value.visited = new Integer(state.CIRCLE_INDEX);
        state.CHANGE = false;
        new_containsElementOf_TypeDecl_value = containsElementOf_compute(typeDecl);
        if (new_containsElementOf_TypeDecl_value!=((Boolean)_value.value).booleanValue()) {
          state.CHANGE = true;
          _value.value = Boolean.valueOf(new_containsElementOf_TypeDecl_value);
        }
        state.CIRCLE_INDEX++;
      } while (state.CHANGE);
      if(isFinal && num == state().boundariesCrossed) {
        containsElementOf_TypeDecl_values.put(_parameters, new_containsElementOf_TypeDecl_value);
      }
      else {
        containsElementOf_TypeDecl_values.remove(_parameters);
      state.RESET_CYCLE = true;
      containsElementOf_compute(typeDecl);
      state.RESET_CYCLE = false;
      }
      state.IN_CIRCLE = false; 
      return new_containsElementOf_TypeDecl_value;
    }
    if(!new Integer(state.CIRCLE_INDEX).equals(_value.visited)) {
      _value.visited = new Integer(state.CIRCLE_INDEX);
      boolean new_containsElementOf_TypeDecl_value = containsElementOf_compute(typeDecl);
      if (state.RESET_CYCLE) {
        containsElementOf_TypeDecl_values.remove(_parameters);
      }
      else if (new_containsElementOf_TypeDecl_value!=((Boolean)_value.value).booleanValue()) {
        state.CHANGE = true;
        _value.value = new_containsElementOf_TypeDecl_value;
      }
      return new_containsElementOf_TypeDecl_value;
    }
    return ((Boolean)_value.value).booleanValue();
  }
  /**
   * @apilvl internal
   */
  private boolean containsElementOf_compute(TypeDecl typeDecl) {
    for(int i = 0; i < getNumBodyDecl(); i++) {
      if(getBodyDecl(i) instanceof MethodDecl) {
        MethodDecl m = (MethodDecl)getBodyDecl(i);
        if(m.type() == typeDecl)
          return true;
        if(m.type() instanceof AnnotationDecl && ((AnnotationDecl)m.type()).containsElementOf(typeDecl))
          return true;
      }
    }
    return false;
  }
  /**
   * @attribute syn
   * @aspect Annotations
   * @declaredat D:\zhh\JastAddJ\Java1.5Frontend\Annotations.jrag:542
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean isAnnotationDecl() {
      ASTNode$State state = state();
    boolean isAnnotationDecl_value = isAnnotationDecl_compute();
    return isAnnotationDecl_value;
  }
  /**
   * @apilvl internal
   */
  private boolean isAnnotationDecl_compute() {  return true;  }
  /**
   * @attribute syn
   * @aspect AnnotationsCodegen
   * @declaredat D:\zhh\JastAddJ\Java1.5Backend\AnnotationsCodegen.jrag:141
   */
  @SuppressWarnings({"unchecked", "cast"})
  public int flags() {
    if(flags_computed) {
      return flags_value;
    }
      ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    flags_value = flags_compute();
if(isFinal && num == state().boundariesCrossed) flags_computed = true;
    return flags_value;
  }
  /**
   * @apilvl internal
   */
  private int flags_compute() {  return super.flags() | Modifiers.ACC_ANNOTATION;  }
  /**
   * @declaredat D:\zhh\JastAddJ\Java1.5Frontend\Annotations.jrag:77
   * @apilvl internal
   */
  public boolean Define_boolean_mayUseAnnotationTarget(ASTNode caller, ASTNode child, String name) {
    if(caller == getModifiersNoTransform()) {
      return name.equals("ANNOTATION_TYPE") || name.equals("TYPE");
    }
    return super.Define_boolean_mayUseAnnotationTarget(caller, child, name);
  }
  /**
   * @apilvl internal
   */
  public ASTNode rewriteTo() {
    return super.rewriteTo();
  }
}
