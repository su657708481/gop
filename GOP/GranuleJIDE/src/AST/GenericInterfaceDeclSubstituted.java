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
 * @declaredat Generics.ast:36
 */
public class GenericInterfaceDeclSubstituted extends GenericInterfaceDecl implements Cloneable, MemberSubstitutor {
  /**
   * @apilvl low-level
   */
  public void flushCache() {
    super.flushCache();
    sourceTypeDecl_computed = false;
    sourceTypeDecl_value = null;
    instanceOf_TypeDecl_values = null;
    subtype_TypeDecl_values = null;
    typeDescriptor_computed = false;
    typeDescriptor_value = null;
    constantPoolName_computed = false;
    constantPoolName_value = null;
    uniqueIndex_computed = false;
    localMethodsSignatureMap_computed = false;
    localMethodsSignatureMap_value = null;
    localFields_String_values = null;
    localTypeDecls_String_values = null;
    constructors_computed = false;
    constructors_value = null;
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
  public GenericInterfaceDeclSubstituted clone() throws CloneNotSupportedException {
    GenericInterfaceDeclSubstituted node = (GenericInterfaceDeclSubstituted)super.clone();
    node.sourceTypeDecl_computed = false;
    node.sourceTypeDecl_value = null;
    node.instanceOf_TypeDecl_values = null;
    node.subtype_TypeDecl_values = null;
    node.typeDescriptor_computed = false;
    node.typeDescriptor_value = null;
    node.constantPoolName_computed = false;
    node.constantPoolName_value = null;
    node.uniqueIndex_computed = false;
    node.localMethodsSignatureMap_computed = false;
    node.localMethodsSignatureMap_value = null;
    node.localFields_String_values = null;
    node.localTypeDecls_String_values = null;
    node.constructors_computed = false;
    node.constructors_value = null;
    node.in$Circle(false);
    node.is$Final(false);
    return node;
  }
  /**
   * @apilvl internal
   */
  @SuppressWarnings({"unchecked", "cast"})
  public GenericInterfaceDeclSubstituted copy() {
      try {
        GenericInterfaceDeclSubstituted node = (GenericInterfaceDeclSubstituted)clone();
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
  public GenericInterfaceDeclSubstituted fullCopy() {
    GenericInterfaceDeclSubstituted res = (GenericInterfaceDeclSubstituted)copy();
    for(int i = 0; i < getNumChildNoTransform(); i++) {
      ASTNode node = getChildNoTransform(i);
      if(node != null) node = node.fullCopy();
      res.setChild(node, i);
    }
    return res;
    }
  /**
   * @ast method 
   * @declaredat Generics.ast:1
   */
  public GenericInterfaceDeclSubstituted() {
    super();

    setChild(new List(), 1);
    setChild(new List(), 2);
    setChild(new List(), 3);
    setChild(new List(), 4);

  }
  /**
   * @ast method 
   * @declaredat Generics.ast:11
   */
  public GenericInterfaceDeclSubstituted(Modifiers p0, String p1, List<Access> p2, List<BodyDecl> p3, List<TypeVariable> p4, TypeDecl p5) {
    setChild(p0, 0);
    setID(p1);
    setChild(p2, 1);
    setChild(p3, 2);
    setChild(p4, 3);
    setOriginal(p5);
    setChild(new List(), 4);
  }
  /**
   * @ast method 
   * @declaredat Generics.ast:20
   */
  public GenericInterfaceDeclSubstituted(Modifiers p0, beaver.Symbol p1, List<Access> p2, List<BodyDecl> p3, List<TypeVariable> p4, TypeDecl p5) {
    setChild(p0, 0);
    setID(p1);
    setChild(p2, 1);
    setChild(p3, 2);
    setChild(p4, 3);
    setOriginal(p5);
    setChild(new List(), 4);
  }
  /**
   * @apilvl low-level
   * @ast method 
   * @declaredat Generics.ast:32
   */
  protected int numChildren() {
    return 4;
  }
  /**
   * @apilvl internal
   * @ast method 
   * @declaredat Generics.ast:38
   */
  public boolean mayHaveRewrite() {
    return false;
  }
  /**
   * Setter for Modifiers
   * @apilvl high-level
   * @ast method 
   * @declaredat Generics.ast:5
   */
  public void setModifiers(Modifiers node) {
    setChild(node, 0);
  }
  /**
   * Getter for Modifiers
   * @apilvl high-level
   * @ast method 
   * @declaredat Generics.ast:12
   */
  public Modifiers getModifiers() {
    return (Modifiers)getChild(0);
  }
  /**
   * @apilvl low-level
   * @ast method 
   * @declaredat Generics.ast:18
   */
  public Modifiers getModifiersNoTransform() {
    return (Modifiers)getChildNoTransform(0);
  }
  /**
   * Setter for lexeme ID
   * @apilvl high-level
   * @ast method 
   * @declaredat Generics.ast:5
   */
  public void setID(String value) {
    tokenString_ID = value;
  }
  /**
   * @ast method 
   * @declaredat Generics.ast:8
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
   * @declaredat Generics.ast:19
   */
  public String getID() {
    return tokenString_ID != null ? tokenString_ID : "";
  }
  /**
   * Setter for SuperInterfaceIdList
   * @apilvl high-level
   * @ast method 
   * @declaredat Generics.ast:5
   */
  public void setSuperInterfaceIdList(List<Access> list) {
    setChild(list, 1);
  }
  /**
   * @return number of children in SuperInterfaceIdList
   * @apilvl high-level
   * @ast method 
   * @declaredat Generics.ast:12
   */
  public int getNumSuperInterfaceId() {
    return getSuperInterfaceIdList().getNumChild();
  }
  /**
   * Getter for child in list SuperInterfaceIdList
   * @apilvl high-level
   * @ast method 
   * @declaredat Generics.ast:19
   */
  @SuppressWarnings({"unchecked", "cast"})
  public Access getSuperInterfaceId(int i) {
    return (Access)getSuperInterfaceIdList().getChild(i);
  }
  /**
   * Add element to list SuperInterfaceIdList
   * @apilvl high-level
   * @ast method 
   * @declaredat Generics.ast:27
   */
  public void addSuperInterfaceId(Access node) {
    List<Access> list = (parent == null || state == null) ? getSuperInterfaceIdListNoTransform() : getSuperInterfaceIdList();
    list.addChild(node);
  }
  /**
   * @apilvl low-level
   * @ast method 
   * @declaredat Generics.ast:34
   */
  public void addSuperInterfaceIdNoTransform(Access node) {
    List<Access> list = getSuperInterfaceIdListNoTransform();
    list.addChild(node);
  }
  /**
   * Setter for child in list SuperInterfaceIdList
   * @apilvl high-level
   * @ast method 
   * @declaredat Generics.ast:42
   */
  public void setSuperInterfaceId(Access node, int i) {
    List<Access> list = getSuperInterfaceIdList();
    list.setChild(node, i);
  }
  /**
   * Getter for SuperInterfaceId list.
   * @apilvl high-level
   * @ast method 
   * @declaredat Generics.ast:50
   */
  public List<Access> getSuperInterfaceIds() {
    return getSuperInterfaceIdList();
  }
  /**
   * @apilvl low-level
   * @ast method 
   * @declaredat Generics.ast:56
   */
  public List<Access> getSuperInterfaceIdsNoTransform() {
    return getSuperInterfaceIdListNoTransform();
  }
  /**
   * Getter for list SuperInterfaceIdList
   * @apilvl high-level
   * @ast method 
   * @declaredat Generics.ast:63
   */
  @SuppressWarnings({"unchecked", "cast"})
  public List<Access> getSuperInterfaceIdList() {
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
  public List<Access> getSuperInterfaceIdListNoTransform() {
    return (List<Access>)getChildNoTransform(1);
  }
  /**
   * Setter for BodyDeclList
   * @apilvl high-level
   * @ast method 
   * @declaredat Generics.ast:5
   */
  public void setBodyDeclList(List<BodyDecl> list) {
    setChild(list, 2);
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
   * Getter for list BodyDeclList
   * @apilvl high-level
   * @ast method 
   * @declaredat Generics.ast:63
   */
  @SuppressWarnings({"unchecked", "cast"})
  public List<BodyDecl> getBodyDeclList() {
    List<BodyDecl> list = (List<BodyDecl>)getChild(2);
    list.getNumChild();
    return list;
  }
  /**
   * @apilvl low-level
   * @ast method 
   * @declaredat Generics.ast:72
   */
  @SuppressWarnings({"unchecked", "cast"})
  public List<BodyDecl> getBodyDeclListNoTransform() {
    return (List<BodyDecl>)getChildNoTransform(2);
  }
  /**
   * Setter for TypeParameterList
   * @apilvl high-level
   * @ast method 
   * @declaredat Generics.ast:5
   */
  public void setTypeParameterList(List<TypeVariable> list) {
    setChild(list, 3);
  }
  /**
   * @return number of children in TypeParameterList
   * @apilvl high-level
   * @ast method 
   * @declaredat Generics.ast:12
   */
  public int getNumTypeParameter() {
    return getTypeParameterList().getNumChild();
  }
  /**
   * Getter for child in list TypeParameterList
   * @apilvl high-level
   * @ast method 
   * @declaredat Generics.ast:19
   */
  @SuppressWarnings({"unchecked", "cast"})
  public TypeVariable getTypeParameter(int i) {
    return (TypeVariable)getTypeParameterList().getChild(i);
  }
  /**
   * Add element to list TypeParameterList
   * @apilvl high-level
   * @ast method 
   * @declaredat Generics.ast:27
   */
  public void addTypeParameter(TypeVariable node) {
    List<TypeVariable> list = (parent == null || state == null) ? getTypeParameterListNoTransform() : getTypeParameterList();
    list.addChild(node);
  }
  /**
   * @apilvl low-level
   * @ast method 
   * @declaredat Generics.ast:34
   */
  public void addTypeParameterNoTransform(TypeVariable node) {
    List<TypeVariable> list = getTypeParameterListNoTransform();
    list.addChild(node);
  }
  /**
   * Setter for child in list TypeParameterList
   * @apilvl high-level
   * @ast method 
   * @declaredat Generics.ast:42
   */
  public void setTypeParameter(TypeVariable node, int i) {
    List<TypeVariable> list = getTypeParameterList();
    list.setChild(node, i);
  }
  /**
   * Getter for TypeParameter list.
   * @apilvl high-level
   * @ast method 
   * @declaredat Generics.ast:50
   */
  public List<TypeVariable> getTypeParameters() {
    return getTypeParameterList();
  }
  /**
   * @apilvl low-level
   * @ast method 
   * @declaredat Generics.ast:56
   */
  public List<TypeVariable> getTypeParametersNoTransform() {
    return getTypeParameterListNoTransform();
  }
  /**
   * Getter for list TypeParameterList
   * @apilvl high-level
   * @ast method 
   * @declaredat Generics.ast:63
   */
  @SuppressWarnings({"unchecked", "cast"})
  public List<TypeVariable> getTypeParameterList() {
    List<TypeVariable> list = (List<TypeVariable>)getChild(3);
    list.getNumChild();
    return list;
  }
  /**
   * @apilvl low-level
   * @ast method 
   * @declaredat Generics.ast:72
   */
  @SuppressWarnings({"unchecked", "cast"})
  public List<TypeVariable> getTypeParameterListNoTransform() {
    return (List<TypeVariable>)getChildNoTransform(3);
  }
  /**
   * Setter for lexeme Original
   * @apilvl high-level
   * @ast method 
   * @declaredat Generics.ast:5
   */
  public void setOriginal(TypeDecl value) {
    tokenTypeDecl_Original = value;
  }
  /**   * @apilvl internal   * @ast method 
   * @declaredat Generics.ast:8
   */
  
  /**   * @apilvl internal   */  protected TypeDecl tokenTypeDecl_Original;
  /**
   * Getter for lexeme Original
   * @apilvl high-level
   * @ast method 
   * @declaredat Generics.ast:13
   */
  public TypeDecl getOriginal() {
    return tokenTypeDecl_Original;
  }
  /**
   * Setter for ParTypeDeclList
   * @apilvl high-level
   * @ast method 
   * @declaredat Generics.ast:5
   */
  public void setParTypeDeclList(List<ParInterfaceDecl> list) {
    setChild(list, 4);
  }
  /**
   * @return number of children in ParTypeDeclList
   * @apilvl high-level
   * @ast method 
   * @declaredat Generics.ast:12
   */
  public int getNumParTypeDecl() {
    return getParTypeDeclList().getNumChild();
  }
  /**
   * Getter for child in list ParTypeDeclList
   * @apilvl high-level
   * @ast method 
   * @declaredat Generics.ast:19
   */
  @SuppressWarnings({"unchecked", "cast"})
  public ParInterfaceDecl getParTypeDecl(int i) {
    return (ParInterfaceDecl)getParTypeDeclList().getChild(i);
  }
  /**
   * Add element to list ParTypeDeclList
   * @apilvl high-level
   * @ast method 
   * @declaredat Generics.ast:27
   */
  public void addParTypeDecl(ParInterfaceDecl node) {
    List<ParInterfaceDecl> list = (parent == null || state == null) ? getParTypeDeclListNoTransform() : getParTypeDeclList();
    list.addChild(node);
  }
  /**
   * @apilvl low-level
   * @ast method 
   * @declaredat Generics.ast:34
   */
  public void addParTypeDeclNoTransform(ParInterfaceDecl node) {
    List<ParInterfaceDecl> list = getParTypeDeclListNoTransform();
    list.addChild(node);
  }
  /**
   * Setter for child in list ParTypeDeclList
   * @apilvl high-level
   * @ast method 
   * @declaredat Generics.ast:42
   */
  public void setParTypeDecl(ParInterfaceDecl node, int i) {
    List<ParInterfaceDecl> list = getParTypeDeclList();
    list.setChild(node, i);
  }
  /**
   * Getter for ParTypeDecl list.
   * @apilvl high-level
   * @ast method 
   * @declaredat Generics.ast:50
   */
  public List<ParInterfaceDecl> getParTypeDecls() {
    return getParTypeDeclList();
  }
  /**
   * @apilvl low-level
   * @ast method 
   * @declaredat Generics.ast:56
   */
  public List<ParInterfaceDecl> getParTypeDeclsNoTransform() {
    return getParTypeDeclListNoTransform();
  }
  /**
   * @apilvl low-level
   * @ast method 
   * @declaredat Generics.ast:62
   */
  public List<ParInterfaceDecl> getParTypeDeclListNoTransform() {
    return (List<ParInterfaceDecl>)getChildNoTransform(4);
  }
  /**
   * @apilvl low-level
   * @ast method 
   * @declaredat Generics.ast:68
   */
  protected int getParTypeDeclListChildPosition() {
    return 4;
  }
  /**
   * @attribute syn
   * @aspect LookupParTypeDecl
   * @declaredat D:\zhh\JastAddJ\Java1.5Frontend\Generics.jrag:1073
   */
  @SuppressWarnings({"unchecked", "cast"})
  public TypeDecl original() {
      ASTNode$State state = state();
    TypeDecl original_value = original_compute();
    return original_value;
  }
  /**
   * @apilvl internal
   */
  private TypeDecl original_compute() {  return getOriginal().original();  }
  /**
   * @attribute syn
   * @aspect SourceDeclarations
   * @declaredat D:\zhh\JastAddJ\Java1.5Frontend\Generics.jrag:1273
   */
  @SuppressWarnings({"unchecked", "cast"})
  public TypeDecl sourceTypeDecl() {
    if(sourceTypeDecl_computed) {
      return sourceTypeDecl_value;
    }
      ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    sourceTypeDecl_value = sourceTypeDecl_compute();
if(isFinal && num == state().boundariesCrossed) sourceTypeDecl_computed = true;
    return sourceTypeDecl_value;
  }
  /**
   * @apilvl internal
   */
  private TypeDecl sourceTypeDecl_compute() {  return original().sourceTypeDecl();  }
  /**
   * @attribute syn
   * @aspect GenericsSubtype
   * @declaredat D:\zhh\JastAddJ\Java1.5Frontend\GenericsSubtype.jrag:489
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
   * @aspect GenericsSubtype
   * @declaredat D:\zhh\JastAddJ\Java1.5Frontend\GenericsSubtype.jrag:521
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
  private boolean subtype_compute(TypeDecl type) {  return type.supertypeGenericInterfaceDeclSubstituted(this);  }
  /**
   * @attribute syn
   * @aspect GenericsSubtype
   * @declaredat D:\zhh\JastAddJ\Java1.5Frontend\GenericsSubtype.jrag:525
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean supertypeGenericInterfaceDeclSubstituted(GenericInterfaceDeclSubstituted type) {
      ASTNode$State state = state();
    boolean supertypeGenericInterfaceDeclSubstituted_GenericInterfaceDeclSubstituted_value = supertypeGenericInterfaceDeclSubstituted_compute(type);
    return supertypeGenericInterfaceDeclSubstituted_GenericInterfaceDeclSubstituted_value;
  }
  /**
   * @apilvl internal
   */
  private boolean supertypeGenericInterfaceDeclSubstituted_compute(GenericInterfaceDeclSubstituted type) {  return original() == type.original() && type.enclosingType().subtype(enclosingType()) || super.supertypeGenericInterfaceDeclSubstituted(type);  }
  /**
   * @attribute syn
   * @aspect GenericsSubtype
   * @declaredat D:\zhh\JastAddJ\Java1.5Frontend\GenericsSubtype.jrag:527
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean supertypeGenericInterfaceDecl(GenericInterfaceDecl type) {
      ASTNode$State state = state();
    boolean supertypeGenericInterfaceDecl_GenericInterfaceDecl_value = supertypeGenericInterfaceDecl_compute(type);
    return supertypeGenericInterfaceDecl_GenericInterfaceDecl_value;
  }
  /**
   * @apilvl internal
   */
  private boolean supertypeGenericInterfaceDecl_compute(GenericInterfaceDecl type) {  return super.supertypeGenericInterfaceDecl(type) || original().supertypeGenericInterfaceDecl(type);  }
  /**
   * @attribute syn
   * @aspect GenericsCodegen
   * @declaredat D:\zhh\JastAddJ\Java1.5Backend\GenericsCodegen.jrag:20
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
  private String typeDescriptor_compute() {  return original().typeDescriptor();  }
  /**
   * @attribute syn
   * @aspect GenericsCodegen
   * @declaredat D:\zhh\JastAddJ\Java1.5Backend\GenericsCodegen.jrag:25
   */
  @SuppressWarnings({"unchecked", "cast"})
  public String constantPoolName() {
    if(constantPoolName_computed) {
      return constantPoolName_value;
    }
      ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    constantPoolName_value = constantPoolName_compute();
if(isFinal && num == state().boundariesCrossed) constantPoolName_computed = true;
    return constantPoolName_value;
  }
  /**
   * @apilvl internal
   */
  private String constantPoolName_compute() {  return original().constantPoolName();  }
  /**
   * @attribute syn
   * @aspect GenericsCodegen
   * @declaredat D:\zhh\JastAddJ\Java1.5Backend\GenericsCodegen.jrag:32
   */
  @SuppressWarnings({"unchecked", "cast"})
  public int uniqueIndex() {
    if(uniqueIndex_computed) {
      return uniqueIndex_value;
    }
      ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    uniqueIndex_value = uniqueIndex_compute();
if(isFinal && num == state().boundariesCrossed) uniqueIndex_computed = true;
    return uniqueIndex_value;
  }
  /**
   * @apilvl internal
   */
  private int uniqueIndex_compute() {  return original().uniqueIndex();  }
  /**
   * @attribute syn
   * @aspect GenericsCodegen
   * @declaredat D:\zhh\JastAddJ\Java1.5Backend\GenericsCodegen.jrag:41
   */
  @SuppressWarnings({"unchecked", "cast"})
  public String arrayTypeDescriptor() {
      ASTNode$State state = state();
    String arrayTypeDescriptor_value = arrayTypeDescriptor_compute();
    return arrayTypeDescriptor_value;
  }
  /**
   * @apilvl internal
   */
  private String arrayTypeDescriptor_compute() {  return original().arrayTypeDescriptor();  }
  /**
   * @attribute syn
   * @aspect LookupParTypeDecl
   * @declaredat D:\zhh\JastAddJ\Java1.5Frontend\Generics.jrag:929
   */
  @SuppressWarnings({"unchecked", "cast"})
  public HashMap localMethodsSignatureMap() {
    if(localMethodsSignatureMap_computed) {
      return localMethodsSignatureMap_value;
    }
      ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    localMethodsSignatureMap_value = localMethodsSignatureMap_compute();
if(true) localMethodsSignatureMap_computed = true;
    return localMethodsSignatureMap_value;
  }
  /**
   * @apilvl internal
   */
  private HashMap localMethodsSignatureMap_compute() {
    HashMap map = new HashMap();
    for(Iterator iter = original().localMethodsIterator(); iter.hasNext(); ) {
      MethodDecl decl = (MethodDecl)iter.next();
      if(!decl.isStatic() && (decl.usesTypeVariable() || isRawType())) {
        BodyDecl b = decl.p(this);
        b.is$Final = true;
        addBodyDecl(b);
        decl = (MethodDecl)b;
      }
      map.put(decl.signature(), decl);
    }
    return map;
  }
  /**
   * @attribute syn
   * @aspect LookupParTypeDecl
   * @declaredat D:\zhh\JastAddJ\Java1.5Frontend\Generics.jrag:944
   */
  @SuppressWarnings({"unchecked", "cast"})
  public SimpleSet localFields(String name) {
    Object _parameters = name;
    if(localFields_String_values == null) localFields_String_values = new java.util.HashMap(4);
    if(localFields_String_values.containsKey(_parameters)) {
      return (SimpleSet)localFields_String_values.get(_parameters);
    }
      ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    SimpleSet localFields_String_value = localFields_compute(name);
if(true) localFields_String_values.put(_parameters, localFields_String_value);
    return localFields_String_value;
  }
  /**
   * @apilvl internal
   */
  private SimpleSet localFields_compute(String name) {
    SimpleSet set = SimpleSet.emptySet;
    for(Iterator iter = original().localFields(name).iterator(); iter.hasNext(); ) {
      FieldDeclaration f = (FieldDeclaration)iter.next();
      if(!f.isStatic() && (f.usesTypeVariable() || isRawType())) {
        BodyDecl b = f.p(this);
        b.is$Final = true;
        addBodyDecl(b);
        f = (FieldDeclaration)b;
      }
      set = set.add(f);
    }
    return set;
  }
  /**
   * @attribute syn
   * @aspect LookupParTypeDecl
   * @declaredat D:\zhh\JastAddJ\Java1.5Frontend\Generics.jrag:959
   */
  @SuppressWarnings({"unchecked", "cast"})
  public SimpleSet localTypeDecls(String name) {
    Object _parameters = name;
    if(localTypeDecls_String_values == null) localTypeDecls_String_values = new java.util.HashMap(4);
    if(localTypeDecls_String_values.containsKey(_parameters)) {
      return (SimpleSet)localTypeDecls_String_values.get(_parameters);
    }
      ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    SimpleSet localTypeDecls_String_value = localTypeDecls_compute(name);
if(true) localTypeDecls_String_values.put(_parameters, localTypeDecls_String_value);
    return localTypeDecls_String_value;
  }
  /**
   * @apilvl internal
   */
  private SimpleSet localTypeDecls_compute(String name) {
    SimpleSet set = SimpleSet.emptySet;
    for(Iterator iter = original().localTypeDecls(name).iterator(); iter.hasNext(); ) {
      TypeDecl t = (TypeDecl)iter.next();
      if(t.isStatic())
        set = set.add(t);
      else {
        BodyDecl b;
        TypeDecl typeDecl;
        if(t instanceof ClassDecl) {
          ClassDecl classDecl = (ClassDecl)t;
          typeDecl = classDecl.p(this);
          b = new MemberClassDecl((ClassDecl)typeDecl);
          b.is$Final = true;
          addBodyDecl(b);
          set = set.add(typeDecl);
        }
        else if(t instanceof InterfaceDecl) {
          InterfaceDecl interfaceDecl = (InterfaceDecl)t;
          typeDecl = interfaceDecl.p(this);
          b = new MemberInterfaceDecl((InterfaceDecl)typeDecl);
          b.is$Final = true;
          addBodyDecl(b);
          set = set.add(typeDecl);
        }
      }
    }
    return set;
  }
  /**
   * @attribute syn
   * @aspect LookupParTypeDecl
   * @declaredat D:\zhh\JastAddJ\Java1.5Frontend\Generics.jrag:989
   */
  @SuppressWarnings({"unchecked", "cast"})
  public Collection constructors() {
    if(constructors_computed) {
      return constructors_value;
    }
      ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    constructors_value = constructors_compute();
if(isFinal && num == state().boundariesCrossed) constructors_computed = true;
    return constructors_value;
  }
  /**
   * @apilvl internal
   */
  private Collection constructors_compute() {
    Collection set = new ArrayList();
    for(Iterator iter = original().constructors().iterator(); iter.hasNext(); ) {
      ConstructorDecl c = (ConstructorDecl)iter.next();
      BodyDecl b = c.p(this);
      b.is$Final = true;
      addBodyDecl(b);
      set.add(b);
    }
    return set;
  }
  /**
   * @apilvl internal
   */
  public ASTNode rewriteTo() {
    return super.rewriteTo();
  }
}
