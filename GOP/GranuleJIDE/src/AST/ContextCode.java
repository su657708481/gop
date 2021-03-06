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
 * @declaredat Granule.ast:5
 */
public class ContextCode extends ASTNode<ASTNode> implements Cloneable {
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
  public ContextCode clone() throws CloneNotSupportedException {
    ContextCode node = (ContextCode)super.clone();
    node.in$Circle(false);
    node.is$Final(false);
    return node;
  }
  /**
   * @apilvl internal
   */
  @SuppressWarnings({"unchecked", "cast"})
  public ContextCode copy() {
      try {
        ContextCode node = (ContextCode)clone();
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
  public ContextCode fullCopy() {
    ContextCode res = (ContextCode)copy();
    for(int i = 0; i < getNumChildNoTransform(); i++) {
      ASTNode node = getChildNoTransform(i);
      if(node != null) node = node.fullCopy();
      res.setChild(node, i);
    }
    return res;
    }
  /**
   * @ast method 
   * @aspect PrettyPrint
   * @declaredat D:\zhh\JastAddJ\Java1.4Frontend\PrettyPrint.jadd:171
   */
  public void toString(StringBuffer s)
   {
     getBlock().toString(s);
    }
  /**
   * @ast method 
   * @declaredat Granule.ast:1
   */
  public ContextCode() {
    super();


  }
  /**
   * @ast method 
   * @declaredat Granule.ast:7
   */
  public ContextCode(Block p0) {
    setChild(p0, 0);
  }
  /**
   * @apilvl low-level
   * @ast method 
   * @declaredat Granule.ast:13
   */
  protected int numChildren() {
    return 1;
  }
  /**
   * @apilvl internal
   * @ast method 
   * @declaredat Granule.ast:19
   */
  public boolean mayHaveRewrite() {
    return false;
  }
  /**
   * Setter for Block
   * @apilvl high-level
   * @ast method 
   * @declaredat Granule.ast:5
   */
  public void setBlock(Block node) {
    setChild(node, 0);
  }
  /**
   * Getter for Block
   * @apilvl high-level
   * @ast method 
   * @declaredat Granule.ast:12
   */
  public Block getBlock() {
    return (Block)getChild(0);
  }
  /**
   * @apilvl low-level
   * @ast method 
   * @declaredat Granule.ast:18
   */
  public Block getBlockNoTransform() {
    return (Block)getChildNoTransform(0);
  }
  /**
   * @attribute syn
   * @aspect Modifiers
   * @declaredat D:\zhh\JastAddJ\Java1.4Frontend\Modifiers.jrag:236
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean isStatic() {
      ASTNode$State state = state();
    boolean isStatic_value = isStatic_compute();
    return isStatic_value;
  }
  /**
   * @apilvl internal
   */
  private boolean isStatic_compute() {  return false;  }
  /**
   * @attribute inh
   * @aspect GOP
   * @declaredat D:\zhh\JastAddJ\Java1.4Frontend\GOP.jrag:1139
   */
  @SuppressWarnings({"unchecked", "cast"})
  public TypeDecl typeBoolean() {
      ASTNode$State state = state();
    TypeDecl typeBoolean_value = getParent().Define_TypeDecl_typeBoolean(this, null);
    return typeBoolean_value;
  }
  /**
   * @declaredat D:\zhh\JastAddJ\Java1.4Frontend\GOP.jrag:1012
   * @apilvl internal
   */
  public boolean Define_boolean_reachable(ASTNode caller, ASTNode child) {
    if(caller == getBlockNoTransform()) {
      return true;
    }
    return getParent().Define_boolean_reachable(this, caller);
  }
  /**
   * @declaredat D:\zhh\JastAddJ\Java1.4Frontend\GOP.jrag:1140
   * @apilvl internal
   */
  public TypeDecl Define_TypeDecl_returnType(ASTNode caller, ASTNode child) {
    if(caller == getBlockNoTransform()) {
      return typeBoolean();
    }
    return getParent().Define_TypeDecl_returnType(this, caller);
  }
  /**
   * @apilvl internal
   */
  public ASTNode rewriteTo() {
    return super.rewriteTo();
  }
}
