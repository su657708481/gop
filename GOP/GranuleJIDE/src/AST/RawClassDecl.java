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
 * @declaredat Generics.ast:7
 */
public class RawClassDecl extends ParClassDecl implements Cloneable {
  /**
   * @apilvl low-level
   */
  public void flushCache() {
    super.flushCache();
    subtype_TypeDecl_values = null;
    instanceOf_TypeDecl_values = null;
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
  public RawClassDecl clone() throws CloneNotSupportedException {
    RawClassDecl node = (RawClassDecl)super.clone();
    node.subtype_TypeDecl_values = null;
    node.instanceOf_TypeDecl_values = null;
    node.in$Circle(false);
    node.is$Final(false);
    return node;
  }
  /**
   * @apilvl internal
   */
  @SuppressWarnings({"unchecked", "cast"})
  public RawClassDecl copy() {
      try {
        RawClassDecl node = (RawClassDecl)clone();
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
  public RawClassDecl fullCopy() {
    RawClassDecl res = (RawClassDecl)copy();
    for(int i = 0; i < getNumChildNoTransform(); i++) {
      ASTNode node = getChildNoTransform(i);
      if(node != null) node = node.fullCopy();
      res.setChild(node, i);
    }
    return res;
    }
  /**
   * @ast method 
   * @aspect LookupParTypeDecl
   * @declaredat D:\zhh\JastAddJ\Java1.5Frontend\Generics.jrag:756
   */
  public Access substitute(Parameterization parTypeDecl) { return createBoundAccess(); }
  /**
   * @ast method 
   * @aspect LookupParTypeDecl
   * @declaredat D:\zhh\JastAddJ\Java1.5Frontend\Generics.jrag:811
   */
  public Access substituteReturnType(Parameterization parTypeDecl) { return createBoundAccess(); }
  /**
   * @ast method 
   * @aspect LookupParTypeDecl
   * @declaredat D:\zhh\JastAddJ\Java1.5Frontend\Generics.jrag:831
   */
  public Access substituteParameterType(Parameterization parTypeDecl) { return createBoundAccess(); }
  /**
   * @ast method 
   * @declaredat Generics.ast:1
   */
  public RawClassDecl() {
    super();

    setChild(new List(), 1);
    setChild(new Opt(), 2);
    setChild(new List(), 3);
    setChild(new List(), 4);

  }
  /**
   * @ast method 
   * @declaredat Generics.ast:11
   */
  public RawClassDecl(Modifiers p0, String p1, List<Access> p2) {
    setChild(p0, 0);
    setID(p1);
    setChild(p2, 1);
    setChild(new Opt(), 2);
    setChild(new List(), 3);
    setChild(new List(), 4);
  }
  /**
   * @ast method 
   * @declaredat Generics.ast:19
   */
  public RawClassDecl(Modifiers p0, beaver.Symbol p1, List<Access> p2) {
    setChild(p0, 0);
    setID(p1);
    setChild(p2, 1);
    setChild(new Opt(), 2);
    setChild(new List(), 3);
    setChild(new List(), 4);
  }
  /**
   * @apilvl low-level
   * @ast method 
   * @declaredat Generics.ast:30
   */
  protected int numChildren() {
    return 2;
  }
  /**
   * @apilvl internal
   * @ast method 
   * @declaredat Generics.ast:36
   */
  public boolean mayHaveRewrite() {
    return true;
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
   * Setter for ArgumentList
   * @apilvl high-level
   * @ast method 
   * @declaredat Generics.ast:5
   */
  public void setArgumentList(List<Access> list) {
    setChild(list, 1);
  }
  /**
   * @return number of children in ArgumentList
   * @apilvl high-level
   * @ast method 
   * @declaredat Generics.ast:12
   */
  public int getNumArgument() {
    return getArgumentList().getNumChild();
  }
  /**
   * Getter for child in list ArgumentList
   * @apilvl high-level
   * @ast method 
   * @declaredat Generics.ast:19
   */
  @SuppressWarnings({"unchecked", "cast"})
  public Access getArgument(int i) {
    return (Access)getArgumentList().getChild(i);
  }
  /**
   * Add element to list ArgumentList
   * @apilvl high-level
   * @ast method 
   * @declaredat Generics.ast:27
   */
  public void addArgument(Access node) {
    List<Access> list = (parent == null || state == null) ? getArgumentListNoTransform() : getArgumentList();
    list.addChild(node);
  }
  /**
   * @apilvl low-level
   * @ast method 
   * @declaredat Generics.ast:34
   */
  public void addArgumentNoTransform(Access node) {
    List<Access> list = getArgumentListNoTransform();
    list.addChild(node);
  }
  /**
   * Setter for child in list ArgumentList
   * @apilvl high-level
   * @ast method 
   * @declaredat Generics.ast:42
   */
  public void setArgument(Access node, int i) {
    List<Access> list = getArgumentList();
    list.setChild(node, i);
  }
  /**
   * Getter for Argument list.
   * @apilvl high-level
   * @ast method 
   * @declaredat Generics.ast:50
   */
  public List<Access> getArguments() {
    return getArgumentList();
  }
  /**
   * @apilvl low-level
   * @ast method 
   * @declaredat Generics.ast:56
   */
  public List<Access> getArgumentsNoTransform() {
    return getArgumentListNoTransform();
  }
  /**
   * Getter for list ArgumentList
   * @apilvl high-level
   * @ast method 
   * @declaredat Generics.ast:63
   */
  @SuppressWarnings({"unchecked", "cast"})
  public List<Access> getArgumentList() {
    List<Access> list = (List<Access>)getChild(1);
    list.getNumChild();
    return list;
  }
  /**
   * @apilvl low-level
   * @ast method 
   * @declaredat Generics.ast:72
   */
  @SuppressWarnings({"unchecked", "cast"})
  public List<Access> getArgumentListNoTransform() {
    return (List<Access>)getChildNoTransform(1);
  }
  /**
   * Setter for SuperClassAccessOpt
   * @apilvl low-level
   * @ast method 
   * @declaredat Generics.ast:5
   */
  public void setSuperClassAccessOpt(Opt<Access> opt) {
    setChild(opt, 2);
  }
  /**
   * Does this node have a SuperClassAccess child?
   * @apilvl high-level
   * @ast method 
   * @declaredat Generics.ast:12
   */
  public boolean hasSuperClassAccess() {
    return getSuperClassAccessOpt().getNumChild() != 0;
  }
  /**
   * Getter for optional child SuperClassAccess
   * @apilvl high-level
   * @ast method 
   * @declaredat Generics.ast:19
   */
  @SuppressWarnings({"unchecked", "cast"})
  public Access getSuperClassAccess() {
    return (Access)getSuperClassAccessOpt().getChild(0);
  }
  /**
   * Setter for optional child SuperClassAccess
   * @apilvl high-level
   * @ast method 
   * @declaredat Generics.ast:27
   */
  public void setSuperClassAccess(Access node) {
    getSuperClassAccessOpt().setChild(node, 0);
  }
  /**
   * @apilvl low-level
   * @ast method 
   * @declaredat Generics.ast:33
   */
  @SuppressWarnings({"unchecked", "cast"})
  public Opt<Access> getSuperClassAccessOptNoTransform() {
    return (Opt<Access>)getChildNoTransform(2);
  }
  /**
   * @apilvl low-level
   * @ast method 
   * @declaredat Generics.ast:40
   */
  protected int getSuperClassAccessOptChildPosition() {
    return 2;
  }
  /**
   * Setter for ImplementsList
   * @apilvl high-level
   * @ast method 
   * @declaredat Generics.ast:5
   */
  public void setImplementsList(List<Access> list) {
    setChild(list, 3);
  }
  /**
   * @return number of children in ImplementsList
   * @apilvl high-level
   * @ast method 
   * @declaredat Generics.ast:12
   */
  public int getNumImplements() {
    return getImplementsList().getNumChild();
  }
  /**
   * Getter for child in list ImplementsList
   * @apilvl high-level
   * @ast method 
   * @declaredat Generics.ast:19
   */
  @SuppressWarnings({"unchecked", "cast"})
  public Access getImplements(int i) {
    return (Access)getImplementsList().getChild(i);
  }
  /**
   * Add element to list ImplementsList
   * @apilvl high-level
   * @ast method 
   * @declaredat Generics.ast:27
   */
  public void addImplements(Access node) {
    List<Access> list = (parent == null || state == null) ? getImplementsListNoTransform() : getImplementsList();
    list.addChild(node);
  }
  /**
   * @apilvl low-level
   * @ast method 
   * @declaredat Generics.ast:34
   */
  public void addImplementsNoTransform(Access node) {
    List<Access> list = getImplementsListNoTransform();
    list.addChild(node);
  }
  /**
   * Setter for child in list ImplementsList
   * @apilvl high-level
   * @ast method 
   * @declaredat Generics.ast:42
   */
  public void setImplements(Access node, int i) {
    List<Access> list = getImplementsList();
    list.setChild(node, i);
  }
  /**
   * Getter for Implements list.
   * @apilvl high-level
   * @ast method 
   * @declaredat Generics.ast:50
   */
  public List<Access> getImplementss() {
    return getImplementsList();
  }
  /**
   * @apilvl low-level
   * @ast method 
   * @declaredat Generics.ast:56
   */
  public List<Access> getImplementssNoTransform() {
    return getImplementsListNoTransform();
  }
  /**
   * @apilvl low-level
   * @ast method 
   * @declaredat Generics.ast:62
   */
  public List<Access> getImplementsListNoTransform() {
    return (List<Access>)getChildNoTransform(3);
  }
  /**
   * @apilvl low-level
   * @ast method 
   * @declaredat Generics.ast:68
   */
  protected int getImplementsListChildPosition() {
    return 3;
  }
  /**
   * Setter for BodyDeclList
   * @apilvl high-level
   * @ast method 
   * @declaredat Generics.ast:5
   */
  public void setBodyDeclList(List<BodyDecl> list) {
    setChild(list, 4);
  }
  /**
   * @return number of children in BodyDeclList
   * @apilvl high-level
   * @ast method 
   * @declaredat Generics.ast:12
   */
  public int getNumBodyDecl() {
    return getBodyDeclList().getNumChild();
  }
  /**
   * Getter for child in list BodyDeclList
   * @apilvl high-level
   * @ast method 
   * @declaredat Generics.ast:19
   */
  @SuppressWarnings({"unchecked", "cast"})
  public BodyDecl getBodyDecl(int i) {
    return (BodyDecl)getBodyDeclList().getChild(i);
  }
  /**
   * Add element to list BodyDeclList
   * @apilvl high-level
   * @ast method 
   * @declaredat Generics.ast:27
   */
  public void addBodyDecl(BodyDecl node) {
    List<BodyDecl> list = (parent == null || state == null) ? getBodyDeclListNoTransform() : getBodyDeclList();
    list.addChild(node);
  }
  /**
   * @apilvl low-level
   * @ast method 
   * @declaredat Generics.ast:34
   */
  public void addBodyDeclNoTransform(BodyDecl node) {
    List<BodyDecl> list = getBodyDeclListNoTransform();
    list.addChild(node);
  }
  /**
   * Setter for child in list BodyDeclList
   * @apilvl high-level
   * @ast method 
   * @declaredat Generics.ast:42
   */
  public void setBodyDecl(BodyDecl node, int i) {
    List<BodyDecl> list = getBodyDeclList();
    list.setChild(node, i);
  }
  /**
   * Getter for BodyDecl list.
   * @apilvl high-level
   * @ast method 
   * @declaredat Generics.ast:50
   */
  public List<BodyDecl> getBodyDecls() {
    return getBodyDeclList();
  }
  /**
   * @apilvl low-level
   * @ast method 
   * @declaredat Generics.ast:56
   */
  public List<BodyDecl> getBodyDeclsNoTransform() {
    return getBodyDeclListNoTransform();
  }
  /**
   * @apilvl low-level
   * @ast method 
   * @declaredat Generics.ast:62
   */
  public List<BodyDecl> getBodyDeclListNoTransform() {
    return (List<BodyDecl>)getChildNoTransform(4);
  }
  /**
   * @apilvl low-level
   * @ast method 
   * @declaredat Generics.ast:68
   */
  protected int getBodyDeclListChildPosition() {
    return 4;
  }
  /**
   * @attribute syn
   * @aspect Generics
   * @declaredat D:\zhh\JastAddJ\Java1.5Frontend\Generics.jrag:237
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean isRawType() {
      ASTNode$State state = state();
    boolean isRawType_value = isRawType_compute();
    return isRawType_value;
  }
  /**
   * @apilvl internal
   */
  private boolean isRawType_compute() {  return true;  }
  /**
   * @attribute syn
   * @aspect LookupParTypeDecl
   * @declaredat D:\zhh\JastAddJ\Java1.5Frontend\Generics.jrag:564
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean sameSignature(Access a) {
      ASTNode$State state = state();
    boolean sameSignature_Access_value = sameSignature_compute(a);
    return sameSignature_Access_value;
  }
  /**
   * @apilvl internal
   */
  private boolean sameSignature_compute(Access a) {  return a instanceof TypeAccess && a.type() == this;  }
  /**
   * @attribute syn
   * @aspect GenericsParTypeDecl
   * @declaredat D:\zhh\JastAddJ\Java1.5Frontend\GenericsParTypeDecl.jrag:43
   */
  @SuppressWarnings({"unchecked", "cast"})
  public String nameWithArgs() {
      ASTNode$State state = state();
    String nameWithArgs_value = nameWithArgs_compute();
    return nameWithArgs_value;
  }
  /**
   * @apilvl internal
   */
  private String nameWithArgs_compute() {  return name();  }
  /**
   * @attribute syn
   * @aspect GenericsSubtype
   * @declaredat D:\zhh\JastAddJ\Java1.5Frontend\GenericsSubtype.jrag:16
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean supertypeGenericClassDecl(GenericClassDecl type) {
      ASTNode$State state = state();
    boolean supertypeGenericClassDecl_GenericClassDecl_value = supertypeGenericClassDecl_compute(type);
    return supertypeGenericClassDecl_GenericClassDecl_value;
  }
  /**
   * @apilvl internal
   */
  private boolean supertypeGenericClassDecl_compute(GenericClassDecl type) {  return type.subtype(genericDecl().original());  }
  /**
   * @attribute syn
   * @aspect GenericsSubtype
   * @declaredat D:\zhh\JastAddJ\Java1.5Frontend\GenericsSubtype.jrag:25
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean subtype(TypeDecl type) {
    Object _parameters = type;
    if(subtype_TypeDecl_values == null) subtype_TypeDecl_values = new java.util.HashMap(4);
    ASTNode$State.CircularValue _value;
    if(subtype_TypeDecl_values.containsKey(_parameters)) {
      Object _o = subtype_TypeDecl_values.get(_parameters);
      if(!(_o instanceof ASTNode$State.CircularValue)) {
        return ((Boolean)_o).booleanValue();
      }
      else
        _value = (ASTNode$State.CircularValue)_o;
    }
    else {
      _value = new ASTNode$State.CircularValue();
      subtype_TypeDecl_values.put(_parameters, _value);
      _value.value = Boolean.valueOf(true);
    }
    ASTNode$State state = state();
    if (!state.IN_CIRCLE) {
      state.IN_CIRCLE = true;
      int num = state.boundariesCrossed;
      boolean isFinal = this.is$Final();
      boolean new_subtype_TypeDecl_value;
      do {
        _value.visited = new Integer(state.CIRCLE_INDEX);
        state.CHANGE = false;
        new_subtype_TypeDecl_value = subtype_compute(type);
        if (new_subtype_TypeDecl_value!=((Boolean)_value.value).booleanValue()) {
          state.CHANGE = true;
          _value.value = Boolean.valueOf(new_subtype_TypeDecl_value);
        }
        state.CIRCLE_INDEX++;
      } while (state.CHANGE);
      if(isFinal && num == state().boundariesCrossed) {
        subtype_TypeDecl_values.put(_parameters, new_subtype_TypeDecl_value);
      }
      else {
        subtype_TypeDecl_values.remove(_parameters);
      state.RESET_CYCLE = true;
      subtype_compute(type);
      state.RESET_CYCLE = false;
      }
      state.IN_CIRCLE = false; 
      return new_subtype_TypeDecl_value;
    }
    if(!new Integer(state.CIRCLE_INDEX).equals(_value.visited)) {
      _value.visited = new Integer(state.CIRCLE_INDEX);
      boolean new_subtype_TypeDecl_value = subtype_compute(type);
      if (state.RESET_CYCLE) {
        subtype_TypeDecl_values.remove(_parameters);
      }
      else if (new_subtype_TypeDecl_value!=((Boolean)_value.value).booleanValue()) {
        state.CHANGE = true;
        _value.value = new_subtype_TypeDecl_value;
      }
      return new_subtype_TypeDecl_value;
    }
    return ((Boolean)_value.value).booleanValue();
  }
  /**
   * @apilvl internal
   */
  private boolean subtype_compute(TypeDecl type) {  return type.supertypeRawClassDecl(this);  }
  /**
   * @attribute syn
   * @aspect GenericsSubtype
   * @declaredat D:\zhh\JastAddJ\Java1.5Frontend\GenericsSubtype.jrag:110
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean supertypeClassDecl(ClassDecl type) {
      ASTNode$State state = state();
    boolean supertypeClassDecl_ClassDecl_value = supertypeClassDecl_compute(type);
    return supertypeClassDecl_ClassDecl_value;
  }
  /**
   * @apilvl internal
   */
  private boolean supertypeClassDecl_compute(ClassDecl type) {  return type.subtype(genericDecl().original());  }
  /**
   * @attribute syn
   * @aspect GenericsSubtype
   * @declaredat D:\zhh\JastAddJ\Java1.5Frontend\GenericsSubtype.jrag:112
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean supertypeInterfaceDecl(InterfaceDecl type) {
      ASTNode$State state = state();
    boolean supertypeInterfaceDecl_InterfaceDecl_value = supertypeInterfaceDecl_compute(type);
    return supertypeInterfaceDecl_InterfaceDecl_value;
  }
  /**
   * @apilvl internal
   */
  private boolean supertypeInterfaceDecl_compute(InterfaceDecl type) {  return type.subtype(genericDecl().original());  }
  /**
   * @attribute syn
   * @aspect GenericsSubtype
   * @declaredat D:\zhh\JastAddJ\Java1.5Frontend\GenericsSubtype.jrag:114
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean supertypeParClassDecl(ParClassDecl type) {
      ASTNode$State state = state();
    boolean supertypeParClassDecl_ParClassDecl_value = supertypeParClassDecl_compute(type);
    return supertypeParClassDecl_ParClassDecl_value;
  }
  /**
   * @apilvl internal
   */
  private boolean supertypeParClassDecl_compute(ParClassDecl type) {  return type.genericDecl().original().subtype(genericDecl().original());  }
  /**
   * @attribute syn
   * @aspect GenericsSubtype
   * @declaredat D:\zhh\JastAddJ\Java1.5Frontend\GenericsSubtype.jrag:397
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean instanceOf(TypeDecl type) {
    Object _parameters = type;
    if(instanceOf_TypeDecl_values == null) instanceOf_TypeDecl_values = new java.util.HashMap(4);
    if(instanceOf_TypeDecl_values.containsKey(_parameters)) {
      return ((Boolean)instanceOf_TypeDecl_values.get(_parameters)).booleanValue();
    }
      ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    boolean instanceOf_TypeDecl_value = instanceOf_compute(type);
if(isFinal && num == state().boundariesCrossed) instanceOf_TypeDecl_values.put(_parameters, Boolean.valueOf(instanceOf_TypeDecl_value));
    return instanceOf_TypeDecl_value;
  }
  /**
   * @apilvl internal
   */
  private boolean instanceOf_compute(TypeDecl type) {  return subtype(type);  }
  /**
   * @attribute syn
   * @aspect GenericsCodegen
   * @declaredat D:\zhh\JastAddJ\Java1.5Backend\GenericsCodegen.jrag:508
   */
  @SuppressWarnings({"unchecked", "cast"})
  public String typeArgumentsOpt() {
      ASTNode$State state = state();
    String typeArgumentsOpt_value = typeArgumentsOpt_compute();
    return typeArgumentsOpt_value;
  }
  /**
   * @apilvl internal
   */
  private String typeArgumentsOpt_compute() {  return "";  }
  /**
   * @apilvl internal
   */
  public ASTNode rewriteTo() {
    return super.rewriteTo();
  }
}
