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
 * @ast class
 * @declaredat :0
 */
public class InnerClassesAttribute extends Attribute {

    public InnerClassesAttribute(TypeDecl typeDecl) {    
      super(typeDecl.constantPool(), "InnerClasses");
      ConstantPool c = typeDecl.constantPool();
      Collection list = typeDecl.innerClassesAttributeEntries();
      u2(list.size());
      for(Iterator iter = list.iterator(); iter.hasNext(); ) {
        TypeDecl type = (TypeDecl)iter.next();
        u2(c.addClass(type.constantPoolName())); // inner_class_info_index
        u2(type.isMemberType() ? c.addClass(type.enclosingType().constantPoolName()) : 0); // outer_class_info_index
        u2(type.isAnonymous() ? 0 : c.addUtf8(type.name())); // inner_name_index
        u2(type.isInterfaceDecl() ? (type.flags() | Modifiers.ACC_INTERFACE) : type.flags()); // inner_class_access_flags
      }
    }


}
