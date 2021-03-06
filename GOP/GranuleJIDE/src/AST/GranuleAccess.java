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
 * @declaredat ShadowClass.ast:1
 */
public class GranuleAccess extends Access implements Cloneable {
  /**
   * @apilvl low-level
   */
  public void flushCache() {
    super.flushCache();
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
  public GranuleAccess clone() throws CloneNotSupportedException {
    GranuleAccess node = (GranuleAccess)super.clone();
    node.in$Circle(false);
    node.is$Final(false);
    return node;
  }
  /**
   * @apilvl internal
   */
  @SuppressWarnings({"unchecked", "cast"})
  public GranuleAccess copy() {
      try {
        GranuleAccess node = (GranuleAccess)clone();
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
  public GranuleAccess fullCopy() {
    GranuleAccess res = (GranuleAccess)copy();
    for(int i = 0; i < getNumChildNoTransform(); i++) {
      ASTNode node = getChildNoTransform(i);
      if(node != null) node = node.fullCopy();
      res.setChild(node, i);
    }
    return res;
    }
  /**
   * @ast method 
   * @declaredat ShadowClass.ast:1
   */
  public GranuleAccess() {
    super();


  }
  /**
   * @ast method 
   * @declaredat ShadowClass.ast:7
   */
  public GranuleAccess(String p0) {
    setID(p0);
  }
  /**
   * @ast method 
   * @declaredat ShadowClass.ast:10
   */
  public GranuleAccess(beaver.Symbol p0) {
    setID(p0);
  }
  /**
   * @apilvl low-level
   * @ast method 
   * @declaredat ShadowClass.ast:16
   */
  protected int numChildren() {
    return 0;
  }
  /**
   * @apilvl internal
   * @ast method 
   * @declaredat ShadowClass.ast:22
   */
  public boolean mayHaveRewrite() {
    return false;
  }
  /**
   * Setter for lexeme ID
   * @apilvl high-level
   * @ast method 
   * @declaredat ShadowClass.ast:5
   */
  public void setID(String value) {
    tokenString_ID = value;
  }
  /**   * @apilvl internal   * @ast method 
   * @declaredat ShadowClass.ast:8
   */
  
  /**   * @apilvl internal   */  protected String tokenString_ID;
  /**
   * @ast method 
   * @declaredat ShadowClass.ast:9
   */
  
  public int IDstart;
  /**
   * @ast method 
   * @declaredat ShadowClass.ast:10
   */
  
  public int IDend;
  /**
   * @ast method 
   * @declaredat ShadowClass.ast:11
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
   * @declaredat ShadowClass.ast:22
   */
  public String getID() {
    return tokenString_ID != null ? tokenString_ID : "";
  }
  /**
   * @attribute syn
   * @aspect GOP
   * @declaredat D:\zhh\JastAddJ\Java1.4Frontend\GOP.jrag:23
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
   * @attribute inh
   * @aspect GOP
   * @declaredat D:\zhh\JastAddJ\Java1.4Frontend\GOP.jrag:20
   */
  @SuppressWarnings({"unchecked", "cast"})
  public NameType nameType() {
      ASTNode$State state = state();
    NameType nameType_value = getParent().Define_NameType_nameType(this, null);
    return nameType_value;
  }
  /**
   * @apilvl internal
   */
  public ASTNode rewriteTo() {
    return super.rewriteTo();
  }
}
