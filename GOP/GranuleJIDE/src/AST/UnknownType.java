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
 * @declaredat java.ast:48
 */
public class UnknownType extends ClassDecl implements Cloneable {
  /**
   * @apilvl low-level
   */
  public void flushCache() {
    super.flushCache();
    instanceOf_TypeDecl_values = null;
    typeDescriptor_computed = false;
    typeDescriptor_value = null;
    subtype_TypeDecl_values = null;
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
  public UnknownType clone() throws CloneNotSupportedException {
    UnknownType node = (UnknownType)super.clone();
    node.instanceOf_TypeDecl_values = null;
    node.typeDescriptor_computed = false;
    node.typeDescriptor_value = null;
    node.subtype_TypeDecl_values = null;
    node.in$Circle(false);
    node.is$Final(false);
    return node;
  }
  /**
   * @apilvl internal
   */
  @SuppressWarnings({"unchecked", "cast"})
  public UnknownType copy() {
      try {
        UnknownType node = (UnknownType)clone();
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
  public UnknownType fullCopy() {
    UnknownType res = (UnknownType)copy();
    for(int i = 0; i < getNumChildNoTransform(); i++) {
      ASTNode node = getChildNoTransform(i);
      if(node != null) node = node.fullCopy();
      res.setChild(node, i);
    }
    return res;
    }
  /**
   * @ast method 
   * @declaredat java.ast:1
   */
  public UnknownType() {
    super();

    setChild(new Opt(), 1);
    setChild(new List(), 2);
    setChild(new List(), 3);

  }
  /**
   * @ast method 
   * @declaredat java.ast:10
   */
  public UnknownType(Modifiers p0, String p1, Opt<Access> p2, List<Access> p3, List<BodyDecl> p4) {
    setChild(p0, 0);
    setID(p1);
    setChild(p2, 1);
    setChild(p3, 2);
    setChild(p4, 3);
  }
  /**
   * @ast method 
   * @declaredat java.ast:17
   */
  public UnknownType(Modifiers p0, beaver.Symbol p1, Opt<Access> p2, List<Access> p3, List<BodyDecl> p4) {
    setChild(p0, 0);
    setID(p1);
    setChild(p2, 1);
    setChild(p3, 2);
    setChild(p4, 3);
  }
  /**
   * @apilvl low-level
   * @ast method 
   * @declaredat java.ast:27
   */
  protected int numChildren() {
    return 4;
  }
  /**
   * @apilvl internal
   * @ast method 
   * @declaredat java.ast:33
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
   * Setter for SuperClassAccessOpt
   * @apilvl low-level
   * @ast method 
   * @declaredat java.ast:5
   */
  public void setSuperClassAccessOpt(Opt<Access> opt) {
    setChild(opt, 1);
  }
  /**
   * Does this node have a SuperClassAccess child?
   * @apilvl high-level
   * @ast method 
   * @declaredat java.ast:12
   */
  public boolean hasSuperClassAccess() {
    return getSuperClassAccessOpt().getNumChild() != 0;
  }
  /**
   * Getter for optional child SuperClassAccess
   * @apilvl high-level
   * @ast method 
   * @declaredat java.ast:19
   */
  @SuppressWarnings({"unchecked", "cast"})
  public Access getSuperClassAccess() {
    return (Access)getSuperClassAccessOpt().getChild(0);
  }
  /**
   * Setter for optional child SuperClassAccess
   * @apilvl high-level
   * @ast method 
   * @declaredat java.ast:27
   */
  public void setSuperClassAccess(Access node) {
    getSuperClassAccessOpt().setChild(node, 0);
  }
  /**
   * @apilvl low-level
   * @ast method 
   * @declaredat java.ast:37
   */
  @SuppressWarnings({"unchecked", "cast"})
  public Opt<Access> getSuperClassAccessOpt() {
    return (Opt<Access>)getChild(1);
  }
  /**
   * @apilvl low-level
   * @ast method 
   * @declaredat java.ast:44
   */
  @SuppressWarnings({"unchecked", "cast"})
  public Opt<Access> getSuperClassAccessOptNoTransform() {
    return (Opt<Access>)getChildNoTransform(1);
  }
  /**
   * Setter for ImplementsList
   * @apilvl high-level
   * @ast method 
   * @declaredat java.ast:5
   */
  public void setImplementsList(List<Access> list) {
    setChild(list, 2);
  }
  /**
   * @return number of children in ImplementsList
   * @apilvl high-level
   * @ast method 
   * @declaredat java.ast:12
   */
  public int getNumImplements() {
    return getImplementsList().getNumChild();
  }
  /**
   * Getter for child in list ImplementsList
   * @apilvl high-level
   * @ast method 
   * @declaredat java.ast:19
   */
  @SuppressWarnings({"unchecked", "cast"})
  public Access getImplements(int i) {
    return (Access)getImplementsList().getChild(i);
  }
  /**
   * Add element to list ImplementsList
   * @apilvl high-level
   * @ast method 
   * @declaredat java.ast:27
   */
  public void addImplements(Access node) {
    List<Access> list = (parent == null || state == null) ? getImplementsListNoTransform() : getImplementsList();
    list.addChild(node);
  }
  /**
   * @apilvl low-level
   * @ast method 
   * @declaredat java.ast:34
   */
  public void addImplementsNoTransform(Access node) {
    List<Access> list = getImplementsListNoTransform();
    list.addChild(node);
  }
  /**
   * Setter for child in list ImplementsList
   * @apilvl high-level
   * @ast method 
   * @declaredat java.ast:42
   */
  public void setImplements(Access node, int i) {
    List<Access> list = getImplementsList();
    list.setChild(node, i);
  }
  /**
   * Getter for Implements list.
   * @apilvl high-level
   * @ast method 
   * @declaredat java.ast:50
   */
  public List<Access> getImplementss() {
    return getImplementsList();
  }
  /**
   * @apilvl low-level
   * @ast method 
   * @declaredat java.ast:56
   */
  public List<Access> getImplementssNoTransform() {
    return getImplementsListNoTransform();
  }
  /**
   * Getter for list ImplementsList
   * @apilvl high-level
   * @ast method 
   * @declaredat java.ast:63
   */
  @SuppressWarnings({"unchecked", "cast"})
  public List<Access> getImplementsList() {
    List<Access> list = (List<Access>)getChild(2);
    list.getNumChild();
    return list;
  }
  /**
   * @apilvl low-level
   * @ast method 
   * @declaredat java.ast:72
   */
  @SuppressWarnings({"unchecked", "cast"})
  public List<Access> getImplementsListNoTransform() {
    return (List<Access>)getChildNoTransform(2);
  }
  /**
   * Setter for BodyDeclList
   * @apilvl high-level
   * @ast method 
   * @declaredat java.ast:5
   */
  public void setBodyDeclList(List<BodyDecl> list) {
    setChild(list, 3);
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
    List<BodyDecl> list = (List<BodyDecl>)getChild(3);
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
    return (List<BodyDecl>)getChildNoTransform(3);
  }
  /**
   * @attribute syn
   * @aspect TypeAnalysis
   * @declaredat D:\zhh\JastAddJ\Java1.4Frontend\TypeAnalysis.jrag:167
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean isReferenceType() {
      ASTNode$State state = state();
    boolean isReferenceType_value = isReferenceType_compute();
    return isReferenceType_value;
  }
  /**
   * @apilvl internal
   */
  private boolean isReferenceType_compute() {  return true;  }
  /**
   * @attribute syn
   * @aspect TypeAnalysis
   * @declaredat D:\zhh\JastAddJ\Java1.4Frontend\TypeAnalysis.jrag:170
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean isPrimitiveType() {
      ASTNode$State state = state();
    boolean isPrimitiveType_value = isPrimitiveType_compute();
    return isPrimitiveType_value;
  }
  /**
   * @apilvl internal
   */
  private boolean isPrimitiveType_compute() {  return true;  }
  /**
   * @attribute syn
   * @aspect TypeAnalysis
   * @declaredat D:\zhh\JastAddJ\Java1.4Frontend\TypeAnalysis.jrag:175
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean isNumericType() {
      ASTNode$State state = state();
    boolean isNumericType_value = isNumericType_compute();
    return isNumericType_value;
  }
  /**
   * @apilvl internal
   */
  private boolean isNumericType_compute() {  return true;  }
  /**
   * @attribute syn
   * @aspect TypeAnalysis
   * @declaredat D:\zhh\JastAddJ\Java1.4Frontend\TypeAnalysis.jrag:179
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean isIntegralType() {
      ASTNode$State state = state();
    boolean isIntegralType_value = isIntegralType_compute();
    return isIntegralType_value;
  }
  /**
   * @apilvl internal
   */
  private boolean isIntegralType_compute() {  return true;  }
  /**
   * @attribute syn
   * @aspect TypeAnalysis
   * @declaredat D:\zhh\JastAddJ\Java1.4Frontend\TypeAnalysis.jrag:183
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean isBoolean() {
      ASTNode$State state = state();
    boolean isBoolean_value = isBoolean_compute();
    return isBoolean_value;
  }
  /**
   * @apilvl internal
   */
  private boolean isBoolean_compute() {  return true;  }
  /**
   * @attribute syn
   * @aspect TypeAnalysis
   * @declaredat D:\zhh\JastAddJ\Java1.4Frontend\TypeAnalysis.jrag:193
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean isInt() {
      ASTNode$State state = state();
    boolean isInt_value = isInt_compute();
    return isInt_value;
  }
  /**
   * @apilvl internal
   */
  private boolean isInt_compute() {  return true;  }
  /**
   * @attribute syn
   * @aspect TypeAnalysis
   * @declaredat D:\zhh\JastAddJ\Java1.4Frontend\TypeAnalysis.jrag:233
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean isUnknown() {
      ASTNode$State state = state();
    boolean isUnknown_value = isUnknown_compute();
    return isUnknown_value;
  }
  /**
   * @apilvl internal
   */
  private boolean isUnknown_compute() {  return true;  }
  /**
   * @attribute syn
   * @aspect GenericsSubtype
   * @declaredat D:\zhh\JastAddJ\Java1.5Frontend\GenericsSubtype.jrag:393
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
  private boolean instanceOf_compute(TypeDecl type) { return subtype(type); }
  /**
   * @attribute syn
   * @aspect TypeWideningAndIdentity
   * @declaredat D:\zhh\JastAddJ\Java1.4Frontend\TypeAnalysis.jrag:537
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean isSupertypeOfClassDecl(ClassDecl type) {
      ASTNode$State state = state();
    boolean isSupertypeOfClassDecl_ClassDecl_value = isSupertypeOfClassDecl_compute(type);
    return isSupertypeOfClassDecl_ClassDecl_value;
  }
  /**
   * @apilvl internal
   */
  private boolean isSupertypeOfClassDecl_compute(ClassDecl type) {  return true;  }
  /**
   * @attribute syn
   * @aspect TypeWideningAndIdentity
   * @declaredat D:\zhh\JastAddJ\Java1.4Frontend\TypeAnalysis.jrag:538
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean isSupertypeOfInterfaceDecl(InterfaceDecl type) {
      ASTNode$State state = state();
    boolean isSupertypeOfInterfaceDecl_InterfaceDecl_value = isSupertypeOfInterfaceDecl_compute(type);
    return isSupertypeOfInterfaceDecl_InterfaceDecl_value;
  }
  /**
   * @apilvl internal
   */
  private boolean isSupertypeOfInterfaceDecl_compute(InterfaceDecl type) {  return true;  }
  /**
   * @attribute syn
   * @aspect TypeWideningAndIdentity
   * @declaredat D:\zhh\JastAddJ\Java1.4Frontend\TypeAnalysis.jrag:539
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean isSupertypeOfArrayDecl(ArrayDecl type) {
      ASTNode$State state = state();
    boolean isSupertypeOfArrayDecl_ArrayDecl_value = isSupertypeOfArrayDecl_compute(type);
    return isSupertypeOfArrayDecl_ArrayDecl_value;
  }
  /**
   * @apilvl internal
   */
  private boolean isSupertypeOfArrayDecl_compute(ArrayDecl type) {  return true;  }
  /**
   * @attribute syn
   * @aspect TypeWideningAndIdentity
   * @declaredat D:\zhh\JastAddJ\Java1.4Frontend\TypeAnalysis.jrag:540
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean isSupertypeOfPrimitiveType(PrimitiveType type) {
      ASTNode$State state = state();
    boolean isSupertypeOfPrimitiveType_PrimitiveType_value = isSupertypeOfPrimitiveType_compute(type);
    return isSupertypeOfPrimitiveType_PrimitiveType_value;
  }
  /**
   * @apilvl internal
   */
  private boolean isSupertypeOfPrimitiveType_compute(PrimitiveType type) {  return true;  }
  /**
   * @attribute syn
   * @aspect TypeWideningAndIdentity
   * @declaredat D:\zhh\JastAddJ\Java1.4Frontend\TypeAnalysis.jrag:541
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean isSupertypeOfNullType(NullType type) {
      ASTNode$State state = state();
    boolean isSupertypeOfNullType_NullType_value = isSupertypeOfNullType_compute(type);
    return isSupertypeOfNullType_NullType_value;
  }
  /**
   * @apilvl internal
   */
  private boolean isSupertypeOfNullType_compute(NullType type) {  return true;  }
  /**
   * @attribute syn
   * @aspect ConstantPoolNames
   * @declaredat D:\zhh\JastAddJ\Java1.4Backend\ConstantPoolNames.jrag:32
   */
  @SuppressWarnings({"unchecked", "cast"})
  public String typeDescriptor() {
    if(typeDescriptor_computed) {
      return typeDescriptor_value;
    }
      ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    typeDescriptor_value = typeDescriptor_compute();
if(isFinal && num == state().boundariesCrossed) typeDescriptor_computed = true;
    return typeDescriptor_value;
  }
  /**
   * @apilvl internal
   */
  private String typeDescriptor_compute() { throw new Error("Trying to make a typeDescriptor() of Unknown"); }
  /**
   * @attribute syn
   * @aspect AutoBoxing
   * @declaredat D:\zhh\JastAddJ\Java1.5Frontend\AutoBoxing.jrag:171
   */
  @SuppressWarnings({"unchecked", "cast"})
  public TypeDecl unaryNumericPromotion() {
      ASTNode$State state = state();
    TypeDecl unaryNumericPromotion_value = unaryNumericPromotion_compute();
    return unaryNumericPromotion_value;
  }
  /**
   * @apilvl internal
   */
  private TypeDecl unaryNumericPromotion_compute() {  return this;  }
  /**
   * @attribute syn
   * @aspect AutoBoxing
   * @declaredat D:\zhh\JastAddJ\Java1.5Frontend\AutoBoxing.jrag:194
   */
  @SuppressWarnings({"unchecked", "cast"})
  public TypeDecl binaryNumericPromotion(TypeDecl type) {
      ASTNode$State state = state();
    TypeDecl binaryNumericPromotion_TypeDecl_value = binaryNumericPromotion_compute(type);
    return binaryNumericPromotion_TypeDecl_value;
  }
  /**
   * @apilvl internal
   */
  private TypeDecl binaryNumericPromotion_compute(TypeDecl type) {  return this;  }
  /**
   * @attribute syn
   * @aspect GenericsSubtype
   * @declaredat D:\zhh\JastAddJ\Java1.5Frontend\GenericsSubtype.jrag:414
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
  private boolean subtype_compute(TypeDecl type) {  return true;  }
  /**
   * @attribute syn
   * @aspect GenericsSubtype
   * @declaredat D:\zhh\JastAddJ\Java1.5Frontend\GenericsSubtype.jrag:415
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
  private boolean supertypeClassDecl_compute(ClassDecl type) {  return true;  }
  /**
   * @attribute syn
   * @aspect GenericsSubtype
   * @declaredat D:\zhh\JastAddJ\Java1.5Frontend\GenericsSubtype.jrag:416
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
  private boolean supertypeInterfaceDecl_compute(InterfaceDecl type) {  return true;  }
  /**
   * @attribute syn
   * @aspect GenericsSubtype
   * @declaredat D:\zhh\JastAddJ\Java1.5Frontend\GenericsSubtype.jrag:417
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean supertypeArrayDecl(ArrayDecl type) {
      ASTNode$State state = state();
    boolean supertypeArrayDecl_ArrayDecl_value = supertypeArrayDecl_compute(type);
    return supertypeArrayDecl_ArrayDecl_value;
  }
  /**
   * @apilvl internal
   */
  private boolean supertypeArrayDecl_compute(ArrayDecl type) {  return true;  }
  /**
   * @attribute syn
   * @aspect GenericsSubtype
   * @declaredat D:\zhh\JastAddJ\Java1.5Frontend\GenericsSubtype.jrag:418
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean supertypePrimitiveType(PrimitiveType type) {
      ASTNode$State state = state();
    boolean supertypePrimitiveType_PrimitiveType_value = supertypePrimitiveType_compute(type);
    return supertypePrimitiveType_PrimitiveType_value;
  }
  /**
   * @apilvl internal
   */
  private boolean supertypePrimitiveType_compute(PrimitiveType type) {  return true;  }
  /**
   * @attribute syn
   * @aspect GenericsSubtype
   * @declaredat D:\zhh\JastAddJ\Java1.5Frontend\GenericsSubtype.jrag:419
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean supertypeNullType(NullType type) {
      ASTNode$State state = state();
    boolean supertypeNullType_NullType_value = supertypeNullType_compute(type);
    return supertypeNullType_NullType_value;
  }
  /**
   * @apilvl internal
   */
  private boolean supertypeNullType_compute(NullType type) {  return true;  }
  /**
   * @apilvl internal
   */
  public ASTNode rewriteTo() {
    return super.rewriteTo();
  }
}
