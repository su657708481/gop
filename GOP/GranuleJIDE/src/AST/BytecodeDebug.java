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
public class BytecodeDebug extends Bytecode {

    public static int stackChange(byte b) {
      int change = 0;
      switch(b) {
        // no change
        case Bytecode.NOP: 
        case Bytecode.LALOAD:
        case Bytecode.DALOAD:
        case Bytecode.SWAP:
        case Bytecode.IINC:
        case Bytecode.I2F:
        case Bytecode.L2D:
        case Bytecode.F2I:
        case Bytecode.D2L:
        case Bytecode.I2B:
        case Bytecode.I2C:
        case Bytecode.I2S:
        case Bytecode.GOTO:
        case Bytecode.RET:
        case Bytecode.RETURN:
        case Bytecode.NEWARRAY:
        case Bytecode.ANEWARRAY:
        case Bytecode.ARRAYLENGTH:
        case Bytecode.CHECKCAST:
        case Bytecode.INSTANCEOF:
        case Bytecode.GOTO_W:
        case Bytecode.BREAKPOINT:
        case Bytecode.IMPDEP1:
        case Bytecode.IMPDEP2:
        case Bytecode.WIDE:
        case Bytecode.INEG:
        case Bytecode.FNEG:
        case Bytecode.LNEG:
        case Bytecode.DNEG:
        case Bytecode.JSR:
        case Bytecode.JSR_W:
          change = 0;
          break;
          // add 1
        case Bytecode.ACONST_NULL:
        case Bytecode.ICONST_M1:
        case Bytecode.ICONST_0:
        case Bytecode.ICONST_1:
        case Bytecode.ICONST_2:
        case Bytecode.ICONST_3:
        case Bytecode.ICONST_4:
        case Bytecode.ICONST_5:
        case Bytecode.FCONST_0:
        case Bytecode.FCONST_1:
        case Bytecode.FCONST_2: 
        case Bytecode.BIPUSH:
        case Bytecode.SIPUSH:
        case Bytecode.LDC:
        case Bytecode.LDC_W:
        case Bytecode.ILOAD:
        case Bytecode.FLOAD:
        case Bytecode.ALOAD:
        case Bytecode.ILOAD_0:
        case Bytecode.ILOAD_1:
        case Bytecode.ILOAD_2:
        case Bytecode.ILOAD_3:
        case Bytecode.FLOAD_0:
        case Bytecode.FLOAD_1:
        case Bytecode.FLOAD_2:
        case Bytecode.FLOAD_3:
        case Bytecode.ALOAD_0:
        case Bytecode.ALOAD_1:
        case Bytecode.ALOAD_2:
        case Bytecode.ALOAD_3:
        case Bytecode.DUP:
        case Bytecode.DUP_X1:
        case Bytecode.DUP_X2:
        case Bytecode.I2L:
        case Bytecode.I2D:
        case Bytecode.F2L:
        case Bytecode.F2D:
        case Bytecode.NEW:
          change = 1;
          break;
          // add 2
        case Bytecode.LCONST_0:
        case Bytecode.LCONST_1:
        case Bytecode.DCONST_0:
        case Bytecode.DCONST_1:
        case Bytecode.LDC2_W:
        case Bytecode.LLOAD:
        case Bytecode.DLOAD:
        case Bytecode.LLOAD_0:
        case Bytecode.LLOAD_1:
        case Bytecode.LLOAD_2:
        case Bytecode.LLOAD_3:
        case Bytecode.DLOAD_0:
        case Bytecode.DLOAD_1:
        case Bytecode.DLOAD_2:
        case Bytecode.DLOAD_3:
        case Bytecode.DUP2:
        case Bytecode.DUP2_X1:
        case Bytecode.DUP2_X2:
          change = 2;
          break;
          // sub 1
        case Bytecode.IALOAD:
        case Bytecode.FALOAD:
        case Bytecode.AALOAD:
        case Bytecode.BALOAD:
        case Bytecode.CALOAD:
        case Bytecode.SALOAD:
        case Bytecode.ISTORE:
        case Bytecode.FSTORE:
        case Bytecode.ASTORE:
        case Bytecode.ISTORE_0:
        case Bytecode.ISTORE_1:
        case Bytecode.ISTORE_2:
        case Bytecode.ISTORE_3:
        case Bytecode.FSTORE_0:
        case Bytecode.FSTORE_1:
        case Bytecode.FSTORE_2:
        case Bytecode.FSTORE_3:
        case Bytecode.ASTORE_0:
        case Bytecode.ASTORE_1:
        case Bytecode.ASTORE_2:
        case Bytecode.ASTORE_3:
        case Bytecode.POP:
        case Bytecode.IADD:
        case Bytecode.FADD:
        case Bytecode.ISUB:
        case Bytecode.FSUB:
        case Bytecode.IMUL:
        case Bytecode.FMUL:
        case Bytecode.IDIV:
        case Bytecode.FDIV:
        case Bytecode.IREM:
        case Bytecode.FREM:
        case Bytecode.ISHL:
        case Bytecode.ISHR:
        case Bytecode.IUSHR:
        case Bytecode.LSHL:
        case Bytecode.LSHR:
        case Bytecode.LUSHR:
        case Bytecode.IAND:
        case Bytecode.IOR:
        case Bytecode.IXOR:
        case Bytecode.L2I:
        case Bytecode.L2F:
        case Bytecode.D2I:
        case Bytecode.D2F:
        case Bytecode.FCMPL:
        case Bytecode.FCMPG:
        case Bytecode.IFEQ:
        case Bytecode.IFNE:
        case Bytecode.IFLT:
        case Bytecode.IFGE:
        case Bytecode.IFGT:
        case Bytecode.IFLE:
        case Bytecode.TABLESWITCH:
        case Bytecode.LOOKUPSWITCH: 
        case Bytecode.IRETURN:
        case Bytecode.FRETURN:
        case Bytecode.ARETURN:
        case Bytecode.MONITORENTER:
        case Bytecode.MONITOREXIT:
        case Bytecode.IFNULL:
        case Bytecode.IFNONNULL:
        case Bytecode.ATHROW: // remember to add one to each catch block
          change = -1;
          break;
          // sub 2
        case Bytecode.DSTORE:
        case Bytecode.LSTORE:
        case Bytecode.LSTORE_0:
        case Bytecode.LSTORE_1:
        case Bytecode.LSTORE_2:
        case Bytecode.LSTORE_3:
        case Bytecode.DSTORE_0:
        case Bytecode.DSTORE_1:
        case Bytecode.DSTORE_2:
        case Bytecode.DSTORE_3:
        case Bytecode.POP2:
        case Bytecode.LADD:
        case Bytecode.DADD:
        case Bytecode.LSUB:
        case Bytecode.DSUB:
        case Bytecode.LMUL:
        case Bytecode.DMUL:
        case Bytecode.LDIV:
        case Bytecode.DDIV:
        case Bytecode.LREM:
        case Bytecode.DREM:
        case Bytecode.LAND:
        case Bytecode.LOR:
        case Bytecode.LXOR:
        case Bytecode.IF_ICMPEQ:
        case Bytecode.IF_ICMPNE:
        case Bytecode.IF_ICMPLT:
        case Bytecode.IF_ICMPGE:
        case Bytecode.IF_ICMPGT:
        case Bytecode.IF_ICMPLE:
        case Bytecode.IF_ACMPEQ:
        case Bytecode.IF_ACMPNE:
        case Bytecode.LRETURN:
        case Bytecode.DRETURN:
          change = -2;
          break;
          // sub 3
        case Bytecode.IASTORE:
        case Bytecode.FASTORE:
        case Bytecode.AASTORE:
        case Bytecode.BASTORE:
        case Bytecode.CASTORE:
        case Bytecode.SASTORE:
        case Bytecode.LCMP:
        case Bytecode.DCMPL:
        case Bytecode.DCMPG:
          change = -3;
          break;
          // sub 4
        case Bytecode.LASTORE:
        case Bytecode.DASTORE:
          change = -4;
          break;

        case Bytecode.GETSTATIC:
        case Bytecode.PUTSTATIC:
        case Bytecode.GETFIELD:
        case Bytecode.PUTFIELD:
        case Bytecode.INVOKEVIRTUAL:
        case Bytecode.INVOKESPECIAL:
        case Bytecode.INVOKESTATIC:
        case Bytecode.INVOKEINTERFACE:

        case Bytecode.MULTIANEWARRAY:

        default:
          throw new Error("Can not compute stack change for bytecode: " + b);
      }
      return change;
    }



    public static String toString(byte code) {
      String res = "";
      switch(code) 
      {
        case NOP: res = "nop";break;
        case ACONST_NULL: res = "aconst_null";break;
        case ICONST_M1: res = "iconst_m1";break;
        case ICONST_0: res = "iconst_0";break;
        case ICONST_1: res = "iconst_1";break;
        case ICONST_2: res = "iconst_2";break;
        case ICONST_3: res = "iconst_3";break;
        case ICONST_4: res = "iconst_4";break;
        case ICONST_5: res = "iconst_5";break;
        case LCONST_0: res = "lconst_0";break;
        case LCONST_1: res = "lconst_1";break;
        case FCONST_0: res = "fconst_0";break;
        case FCONST_1: res = "fconst_1";break;
        case FCONST_2: res = "fconst_2";break;
        case DCONST_0: res = "dconst_0";break;
        case DCONST_1: res = "dconst_1";break;
        case BIPUSH: res = "bipush";break;
        case SIPUSH: res = "sipush";break;
        case LDC: res = "ldc";break;
        case LDC_W: res = "ldc_w";break;
        case LDC2_W: res = "ldc2_w";break;
        case ILOAD: res = "iload";break;
        case LLOAD: res = "lload";break;
        case FLOAD: res = "fload";break;
        case DLOAD: res = "dload";break;
        case ALOAD: res = "aload";break;
        case ILOAD_0: res = "iload_0";break;
        case ILOAD_1: res = "iload_1";break;
        case ILOAD_2: res = "iload_2";break;
        case ILOAD_3: res = "iload_3";break;
        case LLOAD_0: res = "lload_0";break;
        case LLOAD_1: res = "lload_1";break;
        case LLOAD_2: res = "lload_2";break;
        case LLOAD_3: res = "lload_3";break;
        case FLOAD_0: res = "fload_0";break;
        case FLOAD_1: res = "fload_1";break;
        case FLOAD_2: res = "fload_2";break;
        case FLOAD_3: res = "fload_3";break;
        case DLOAD_0: res = "dload_0";break;
        case DLOAD_1: res = "dload_1";break;
        case DLOAD_2: res = "dload_2";break;
        case DLOAD_3: res = "dload_3";break;
        case ALOAD_0: res = "aload_0";break;
        case ALOAD_1: res = "aload_1";break;
        case ALOAD_2: res = "aload_2";break;
        case ALOAD_3: res = "aload_3";break;
        case IALOAD: res = "iaload";break;
        case LALOAD: res = "laload";break;
        case FALOAD: res = "faload";break;
        case DALOAD: res = "daload";break;
        case AALOAD: res = "aaload";break;
        case BALOAD: res = "baload";break;
        case CALOAD: res = "caload";break;
        case SALOAD: res = "saload";break;
        case ISTORE: res = "istore";break;
        case LSTORE: res = "lstore";break;
        case FSTORE: res = "fstore";break;
        case DSTORE: res = "dstore";break;
        case ASTORE: res = "astore";break;
        case ISTORE_0: res = "istore_0";break;
        case ISTORE_1: res = "istore_1";break;
        case ISTORE_2: res = "istore_2";break;
        case ISTORE_3: res = "istore_3";break;
        case LSTORE_0: res = "lstore_0";break;
        case LSTORE_1: res = "lstore_1";break;
        case LSTORE_2: res = "lstore_2";break;
        case LSTORE_3: res = "lstore_3";break;
        case FSTORE_0: res = "fstore_0";break;
        case FSTORE_1: res = "fstore_1";break;
        case FSTORE_2: res = "fstore_2";break;
        case FSTORE_3: res = "fstore_3";break;
        case DSTORE_0: res = "dstore_0";break;
        case DSTORE_1: res = "dstore_1";break;
        case DSTORE_2: res = "dstore_2";break;
        case DSTORE_3: res = "dstore_3";break;
        case ASTORE_0: res = "astore_0";break;
        case ASTORE_1: res = "astore_1";break;
        case ASTORE_2: res = "astore_2";break;
        case ASTORE_3: res = "astore_3";break;
        case IASTORE: res = "iastore";break;
        case LASTORE: res = "lastore";break;
        case FASTORE: res = "fastore";break;
        case DASTORE: res = "dastore";break;
        case AASTORE: res = "aastore";break;
        case BASTORE: res = "bastore";break;
        case CASTORE: res = "castore";break;
        case SASTORE: res = "sastore";break;
        case POP: res = "pop";break;
        case POP2: res = "pop2";break;
        case DUP: res = "dup";break;
        case DUP_X1: res = "dup_x1";break;
        case DUP_X2: res = "dup_x2";break;
        case DUP2: res = "dup2";break;
        case DUP2_X1: res = "dup2_x1";break;
        case DUP2_X2: res = "dup2_x2" ;break;
        case SWAP: res = "swap";break;
        case IADD: res = "iadd";break;
        case LADD: res = "ladd";break;
        case FADD: res = "fadd";break;
        case DADD: res = "dadd";break;
        case ISUB: res = "isub";break;
        case LSUB: res = "lsub";break;
        case FSUB: res = "fsub";break;
        case DSUB: res = "dsub";break;
        case IMUL: res = "imul";break;
        case LMUL: res = "lmul";break;
        case FMUL: res = "fmul";break;
        case DMUL: res = "dmul";break;
        case IDIV: res = "idiv";break;
        case LDIV: res = "ldiv";break;
        case FDIV: res = "fdiv";break;
        case DDIV: res = "ddiv";break;
        case IREM: res = "irem";break;
        case LREM: res = "lrem";break;
        case FREM: res = "frem";break;
        case DREM: res = "drem";break;
        case INEG: res = "ineg";break;
        case LNEG: res = "lneg";break;
        case FNEG: res = "fneg";break;
        case DNEG: res = "dneg";break;
        case ISHL: res = "ishl";break;
        case LSHL: res = "lshl";break;
        case ISHR: res = "ishr";break;
        case LSHR: res = "lshr";break;
        case IUSHR: res = "iushr";break;
        case LUSHR: res = "lushr";break;
        case IAND: res = "iand";break;
        case LAND: res = "land";break;
        case IOR: res = "ior";break;
        case LOR: res = "lor";break;
        case IXOR: res = "ixor";break;
        case LXOR: res = "lxor";break;
        case IINC: res = "iinc";break;
        case I2L: res = "i2l";break;
        case I2F: res = "i2f";break;
        case I2D: res = "i2d";break;
        case L2I: res = "l2i";break;
        case L2F: res = "l2f";break;
        case L2D: res = "l2d";break;
        case F2I: res = "f2i";break;
        case F2L: res = "f2l";break;
        case F2D: res = "f2d";break;
        case D2I: res = "d2i";break;
        case D2L: res = "d2l";break;
        case D2F: res = "d2f";break;
        case I2B: res = "i2b";break;
        case I2C: res = "i2c";break;
        case I2S: res = "i2s";break;
        case LCMP: res = "lcmp";break;
        case FCMPL: res = "fcmpl";break;
        case FCMPG: res = "fcmpg";break;
        case DCMPL: res = "dcmpl";break;
        case DCMPG: res = "dcmpg";break;
        case IFEQ: res = "ifeq";break;
        case IFNE: res = "ifne";break;
        case IFLT: res = "iflt";break;
        case IFGE: res = "ifge";break;
        case IFGT: res = "ifgt";break;
        case IFLE: res = "ifle";break;
        case IF_ICMPEQ: res = "if_icmpeq";break;
        case IF_ICMPNE: res = "if_icmpne";break;
        case IF_ICMPLT: res = "if_icmplt";break;
        case IF_ICMPGE: res = "if_icmpge";break;
        case IF_ICMPGT: res = "if_icmpgt";break;
        case IF_ICMPLE: res = "if_icmple";break;
        case IF_ACMPEQ: res = "if_acmpeq";break;
        case IF_ACMPNE: res = "if_acmpne";break;
        case GOTO: res = "goto";break;
        case JSR: res = "jsr";break;
        case RET: res = "ret";break;
        case TABLESWITCH: res = "tableswitch";break;
        case LOOKUPSWITCH: res = "lookupswitch";break;
        case IRETURN: res = "ireturn";break;
        case LRETURN: res = "lreturn";break;
        case FRETURN: res = "freturn" ;break;
        case DRETURN: res = "dreturn";break;
        case ARETURN: res = "areturn";break;
        case RETURN: res = "return";break;
        case GETSTATIC: res = "getstatic" ;break;
        case PUTSTATIC: res = "putstatic";break;
        case GETFIELD: res = "getfield";break;
        case PUTFIELD: res = "putfield";break;
        case INVOKEVIRTUAL: res = "invokevirtual";break;
        case INVOKESPECIAL: res = "invokespecial";break;
        case INVOKESTATIC: res = "invokestatic";break;
        case INVOKEINTERFACE: res = "invokeinterface";break;
        case NEW: res = "new";break;
        case NEWARRAY: res = "newarray";break;
        case ANEWARRAY: res = "anewarray";break;
        case ARRAYLENGTH: res = "arraylength";break;
        case ATHROW: res = "athrow";break;
        case CHECKCAST: res = "checkcast";break;
        case INSTANCEOF: res = "instanceof";break;
        case MONITORENTER: res = "monitorenter";break;
        case MONITOREXIT: res = "monitorexit";break;
        case WIDE: res = "wide";break;
        case MULTIANEWARRAY: res = "multianewarray";break;
        case IFNULL: res = "ifnull";break;
        case IFNONNULL: res = "ifnonnull";break;
        case GOTO_W: res = "goto_w";break;
        case JSR_W: res = "jsr_w";break;
        case BREAKPOINT: res = "breakpoint";break;
        case IMPDEP1: res = "impdep1";break;
        case IMPDEP2: res = "impdep2";break;
        default: res = "<UNKNOWN BYTECODE:"+code+">";
      }
      return res;
    }



    private static String getByteOperand(byte[] codes, int index) {
      return Integer.toString((int)codes[index]);
    }


    
    private static String getCharOperand(byte[] codes, int index) {
      int hi = ((codes[index + 0]       ) << 8);
      int lo = ((codes[index + 1] & 0xff) << 0);
      return Integer.toString(hi + lo);
    }


    
    private static String getIntOperand(byte[] codes, int index) {
      int hh = ((codes[index + 0]       ) << 24);
      int hl = ((codes[index + 1] & 0xff) << 16);
      int lh = ((codes[index + 2] & 0xff) << 8);
      int ll = ((codes[index + 3] & 0xff) << 0);
      return Integer.toString(hh + hl + lh + ll);
    }


    
    public static String getOperands(byte[] codes, int index) {
      String res = "";
      switch(codes[index]) 
      {
        case NOP: break;
        case ACONST_NULL:break;
        case ICONST_M1:break;
        case ICONST_0: break;
        case ICONST_1: break;
        case ICONST_2: break;
        case ICONST_3: break;
        case ICONST_4: break;
        case ICONST_5: break;
        case LCONST_0: break;
        case LCONST_1: break;
        case FCONST_0: break;
        case FCONST_1: break;
        case FCONST_2: break;
        case DCONST_0: break;
        case DCONST_1: break;
        case BIPUSH: res = getByteOperand(codes, index+1);break;
        case SIPUSH: res = getCharOperand(codes, index+1);break;
        case LDC: res = getByteOperand(codes, index+1);break;
        case LDC_W: res = getCharOperand(codes, index+1);break;
        case LDC2_W: res = getCharOperand(codes, index+1);break;
        case ILOAD: res = getByteOperand(codes, index+1);break;
        case LLOAD: res = getByteOperand(codes, index+1);break;
        case FLOAD: res = getByteOperand(codes, index+1);break;
        case DLOAD: res = getByteOperand(codes, index+1);break;
        case ALOAD: res = getByteOperand(codes, index+1);break;
        case ILOAD_0: break;
        case ILOAD_1: break;
        case ILOAD_2: break;
        case ILOAD_3: break;
        case LLOAD_0: break;
        case LLOAD_1: break;
        case LLOAD_2: break;
        case LLOAD_3: break;
        case FLOAD_0: break;
        case FLOAD_1: break;
        case FLOAD_2: break;
        case FLOAD_3: break;
        case DLOAD_0: break;
        case DLOAD_1: break;
        case DLOAD_2: break;
        case DLOAD_3: break;
        case ALOAD_0: break;
        case ALOAD_1: break;
        case ALOAD_2: break;
        case ALOAD_3: break;
        case IALOAD: break;
        case LALOAD: break;
        case FALOAD: break;
        case DALOAD: break;
        case AALOAD: break;
        case BALOAD: break;
        case CALOAD: break;
        case SALOAD: break;
        case ISTORE: res = getByteOperand(codes, index+1);break;
        case LSTORE: res = getByteOperand(codes, index+1);break;
        case FSTORE: res = getByteOperand(codes, index+1);break;
        case DSTORE: res = getByteOperand(codes, index+1);break;
        case ASTORE: res = getByteOperand(codes, index+1);break;
        case ISTORE_0: break;
        case ISTORE_1: break;
        case ISTORE_2: break;
        case ISTORE_3: break;
        case LSTORE_0: break;
        case LSTORE_1: break;
        case LSTORE_2: break;
        case LSTORE_3: break;
        case FSTORE_0: break;
        case FSTORE_1: break;
        case FSTORE_2: break;
        case FSTORE_3: break;
        case DSTORE_0: break;
        case DSTORE_1: break;
        case DSTORE_2: break;
        case DSTORE_3: break;
        case ASTORE_0: break;
        case ASTORE_1: break;
        case ASTORE_2: break;
        case ASTORE_3: break;
        case IASTORE: break;
        case LASTORE: break;
        case FASTORE: break;
        case DASTORE: break;
        case AASTORE: break;
        case BASTORE: break;
        case CASTORE: break;
        case SASTORE: break;
        case POP: break;
        case POP2: break;
        case DUP: break;
        case DUP_X1: break;
        case DUP_X2: break;
        case DUP2: break;
        case DUP2_X1: break;
        case DUP2_X2:break;
        case SWAP: break;
        case IADD: break;
        case LADD: break;
        case FADD: break;
        case DADD: break;
        case ISUB: break;
        case LSUB: break;
        case FSUB: break;
        case DSUB: break;
        case IMUL: break;
        case LMUL: break;
        case FMUL: break;
        case DMUL: break;
        case IDIV: break;
        case LDIV: break;
        case FDIV: break;
        case DDIV: break;
        case IREM: break;
        case LREM: break;
        case FREM: break;
        case DREM: break;
        case INEG: break;
        case LNEG: break;
        case FNEG: break;
        case DNEG: break;
        case ISHL: break;
        case LSHL: break;
        case ISHR: break;
        case LSHR: break;
        case IUSHR: break;
        case LUSHR: break;
        case IAND: break;
        case LAND: break;
        case IOR: break;
        case LOR: break;
        case IXOR: break;
        case LXOR: break;
        case IINC: res = getByteOperand(codes, index+1) + " " + getByteOperand(codes, index+2); break;
        case I2L: break;
        case I2F: break;
        case I2D: break;
        case L2I: break;
        case L2F: break;
        case L2D: break;
        case F2I: break;
        case F2L: break;
        case F2D: break;
        case D2I: break;
        case D2L: break;
        case D2F: break;
        case I2B: break;
        case I2C: break;
        case I2S: break;
        case LCMP: break;
        case FCMPL: break;
        case FCMPG: break;
        case DCMPL: break;
        case DCMPG: break;
        case IFEQ: res = getCharOperand(codes, index+1);break;
        case IFNE: res = getCharOperand(codes, index+1);break;
        case IFLT: res = getCharOperand(codes, index+1);break;
        case IFGE: res = getCharOperand(codes, index+1);break;
        case IFGT: res = getCharOperand(codes, index+1);break;
        case IFLE: res = getCharOperand(codes, index+1);break;
        case IF_ICMPEQ: res = getCharOperand(codes, index+1);break;
        case IF_ICMPNE: res = getCharOperand(codes, index+1);break;
        case IF_ICMPLT: res = getCharOperand(codes, index+1);break;
        case IF_ICMPGE: res = getCharOperand(codes, index+1);break;
        case IF_ICMPGT: res = getCharOperand(codes, index+1);break;
        case IF_ICMPLE: res = getCharOperand(codes, index+1);break;
        case IF_ACMPEQ: res = getCharOperand(codes, index+1);break;
        case IF_ACMPNE: res = getCharOperand(codes, index+1);break;
        case GOTO: res = getCharOperand(codes, index+1);break;
        case JSR: res = getCharOperand(codes, index+1);break;
        case RET: res = getByteOperand(codes, index+1);break;
        case TABLESWITCH:
                  {
                    int db = ((index + 4) / 4) * 4; // Align-4, step to defaultbytes
                    int val = fourByteToInt(codes, db);
                    db+=4;
                    res = "defaultbytes:" + val;
                    int low = fourByteToInt(codes, db);
                    db+=4;
                    res += ", low:" + low;
                    int high = fourByteToInt(codes, db);
                    db+=4;
                    res += ", high:" + high;
                    for(int i = 0; i < (high-low+1); i++)
                      res += "\n\t" + "offset:" + fourByteToInt(codes, db + i * 4);
                  }
                  break;
        case LOOKUPSWITCH: 
                  {
                    int db = ((index + 4) / 4) * 4; // Align-4, step to defaultbytes
                    int val = fourByteToInt(codes, db);
                    db+=4;
                    res = "defaultbytes:" + val;
                    int npairs = fourByteToInt(codes, db);
                    db+=4;
                    res += ", npairs:" + npairs;
                    for(int i = 0; i < npairs; i++)
                      res += "\n\t" + "match:" + fourByteToInt(codes, db + i * 8) + ", offset:" + fourByteToInt(codes, db + i * 8 + 4);
                  }
                  break;
        case IRETURN: break;
        case LRETURN: break;
        case FRETURN: break;
        case DRETURN: break;
        case ARETURN: break;
        case RETURN: break;
        case GETSTATIC: res = getCharOperand(codes, index+1);break;
        case PUTSTATIC: res = getCharOperand(codes, index+1);break;
        case GETFIELD: res = getCharOperand(codes, index+1);break;
        case PUTFIELD: res = getCharOperand(codes, index+1);break;
        case INVOKEVIRTUAL: res = getCharOperand(codes, index+1);break;
        case INVOKESPECIAL: res = getCharOperand(codes, index+1);break;
        case INVOKESTATIC: res = getCharOperand(codes, index+1);break;
        case INVOKEINTERFACE: res = getCharOperand(codes, index+1)+" "+getByteOperand(codes, index+3);break;
        case NEW: res = getCharOperand(codes, index+1);break;
        case NEWARRAY: res = getByteOperand(codes, index+1);break;
        case ANEWARRAY: res = getCharOperand(codes, index+1);break;
        case ARRAYLENGTH: break;
        case ATHROW: break;
        case CHECKCAST: res = getCharOperand(codes, index+1);;break;
        case INSTANCEOF: res = getCharOperand(codes, index+1);;break;
        case MONITORENTER: break;
        case MONITOREXIT: break;
        case WIDE: res = "XXX";break;
        case MULTIANEWARRAY: res = getCharOperand(codes, index+1)+" "+getByteOperand(codes, index+3);break;
        case IFNULL: res = getCharOperand(codes, index+1);break;
        case IFNONNULL: res = getCharOperand(codes, index+1);break;
        case GOTO_W: res = getIntOperand(codes, index+1);break;
        case JSR_W: res = getIntOperand(codes, index+1);break;
        case BREAKPOINT: break;
        case IMPDEP1: break;
        case IMPDEP2: break;
        default: res = "<UNKNOWN BYTECODE:"+codes[index]+">";
      }
      return res;
    }



    public static int fourByteToInt(byte[] codes, int pos) {
      int b1 = (int)codes[pos + 0];
      int b2 = (int)codes[pos + 1];
      int b3 = (int)codes[pos + 2];
      int b4 = (int)codes[pos + 3];
      int val = b1 << 24 | b2 << 16 | b3 << 8 | b4; 
      return val; 
    }



    public static int stepBytecode(byte[] codes, int index)
    {
      int res = 0;

      switch (codes[index]) {
        case NOP:res++;break;
        case ACONST_NULL:res++;break;
        case LDC2_W:
        case LDC_W:res+=3;break;
        case LDC:res+=2;break;
        case DCONST_0:
        case DCONST_1:
        case LCONST_0:
        case LCONST_1:res++;break;
        case BIPUSH:res+=2;break;
        case SIPUSH:res+=3;break;
        case FCONST_1:
        case FCONST_2:
        case FCONST_0:
        case ICONST_M1:
        case ICONST_0:
        case ICONST_1:
        case ICONST_2:
        case ICONST_3:
        case ICONST_4:
        case ICONST_5:res++;break;
        case FALOAD:
        case BALOAD:
        case CALOAD:
        case SALOAD:
        case IALOAD:res++;break;
        case DALOAD:
        case LALOAD:res++;break;
        case AALOAD:res++;break;
        case FLOAD:
        case FSTORE:
        case ILOAD:
        case ISTORE:res+=2;break;
        case FLOAD_0:
        case FSTORE_0:
        case ILOAD_0:
        case ISTORE_0:res++;break;
        case FLOAD_1:
        case FSTORE_1:
        case ILOAD_1:
        case ISTORE_1:res++;break;
        case FLOAD_2:
        case FSTORE_2:
        case ILOAD_2:
        case ISTORE_2:res++;break;
        case FLOAD_3:
        case FSTORE_3:
        case ILOAD_3:
        case ISTORE_3:res++;break;
        case DLOAD:
        case DSTORE:
        case LLOAD:
        case LSTORE:res+=2;break;
        case DLOAD_0:
        case DSTORE_0:
        case LLOAD_0:
        case LSTORE_0:res++;break;
        case DLOAD_1:
        case DSTORE_1:
        case LLOAD_1:
        case LSTORE_1:res++;break;
        case DLOAD_2:
        case DSTORE_2:
        case LLOAD_2:
        case LSTORE_2:res++;break;
        case DLOAD_3:
        case DSTORE_3:
        case LLOAD_3:
        case LSTORE_3:res++;break;
        case ALOAD:
        case ASTORE:res+=2;break;
        case ALOAD_0:
        case ASTORE_0:res++;break;
        case ALOAD_1:
        case ASTORE_1:res++;break;
        case ALOAD_2:
        case ASTORE_2:res++;break;
        case ALOAD_3:
        case ASTORE_3:res++;break;
        case FASTORE:
        case IASTORE:res++;break;
        case DASTORE:
        case LASTORE:res++;break;
        case AASTORE:res++;break;
        case BASTORE:res++;break;
        case CASTORE:
        case SASTORE:res++;break;
        case POP:res++;break;
        case POP2:res++;break;
        case DUP:res++;break;
        case DUP_X1:res++;break;
        case DUP_X2:res++;break;
        case DUP2:res++;break;
        case DUP2_X1:res++;break;
        case DUP2_X2:res++;break;
        case SWAP:res++;break;
        case IADD:res++;break;
        case FADD:res++;break;
        case DADD:res++;break;
        case LADD:res++;break;
        case ISUB:res++;break;
        case FSUB:res++;break;
        case DSUB:res++;break;
        case LSUB:res++;break;
        case IMUL:res++;break;
        case LMUL:res++;break;
        case DMUL:res++;break;
        case FMUL:res++;break;
        case IDIV:res++;break;
        case LDIV:res++;break;
        case DDIV:res++;break;
        case FDIV:res++;break;
        case IREM:res++;break;
        case LREM:res++;break;
        case DREM:res++;break;
        case FREM:res++;break;
        case INEG:res++;break;
        case LNEG:res++;break;
        case DNEG:res++;break;
        case FNEG:res++;break;
        case ISHL:res++;break;
        case LSHL:res++;break;
        case ISHR:res++;break;
        case LSHR:res++;break;
        case IUSHR:res++;break;
        case LUSHR:res++;break;
        case IAND:res++;break;
        case LAND:res++;break;
        case IOR:res++;break;
        case LOR:res++;break;
        case IXOR:res++;break;
        case LXOR:res++;break;
        case IINC:res+=3;break;
        case I2L:res++;break;
        case I2F:res++;break;
        case I2D:res++;break;
        case L2I:res++;break;
        case L2F:res++;break;
        case L2D:res++;break;
        case F2I:res++;break;
        case F2L:res++;break;
        case F2D:res++;break;
        case D2I:res++;break;
        case D2L:res++;break;
        case D2F:res++;break;
        case I2B:res++;break;
        case I2C:res++;break;
        case I2S:res++;break;
        case LCMP:res++;break;
        case FCMPL:res++;break;
        case FCMPG:res++;break;
        case DCMPL:res++;break;
        case DCMPG:res++;break;
        case IFEQ:res+=3;break;
        case IFNE:res+=3;break;
        case IFLT:res+=3;break;
        case IFGE:res+=3;break;
        case IFGT:res+=3;break;
        case IFLE:res+=3;break;
        case IF_ICMPEQ:res+=3;break;
        case IF_ICMPNE:res+=3;break;
        case IF_ICMPLT:res+=3;break;
        case IF_ICMPGE:res+=3;break;
        case IF_ICMPGT:res+=3;break;
        case IF_ICMPLE:res+=3;break;
        case IF_ACMPEQ:res+=3;break;
        case IF_ACMPNE:res+=3;break;
        case GOTO:res+=3;break;
        case JSR:res+=3;break;
        case RET:res+=2;break;
        case TABLESWITCH:
                 {
                   int db = ((index + 4) / 4) * 4; // Align-4, step to defaultbytes
                   db += 4;
                   int low = fourByteToInt(codes, db);
                   db += 4;
                   int high = fourByteToInt(codes, db);
                   db += 4;
                   db += (high-low+1)*4;
                   res = db;
                 }
                 break;
        case LOOKUPSWITCH:
                 {
                   int db = ((index + 4) / 4) * 4; // Align-4, step to defaultbytes
                   db += 4;
                   int np = fourByteToInt(codes, db);
                   db += 4;
                   db += np * 8;
                   res = db;
                 }
                 break;
        case FRETURN:
        case IRETURN:res++;break;
        case LRETURN:
        case DRETURN:res++;break;
        case ARETURN:res++;break;
        case RETURN:res++;break;
        case GETSTATIC:
        case PUTSTATIC:
        case GETFIELD:
        case PUTFIELD:res+=3;break;
        case INVOKEVIRTUAL:res+=3;break;
        case INVOKESPECIAL:res+=3;break;
        case INVOKESTATIC:res+=3;break;
        case INVOKEINTERFACE:res+=5;break;
        case NEW:res+=3; break;
        case NEWARRAY:res+=2;break;
        case ANEWARRAY:res+=3;break;
        case ARRAYLENGTH:res++;break;
        case ATHROW:res++;break;
        case CHECKCAST:res+=3;break;
        case INSTANCEOF:res+=3;break;
        case MONITORENTER:res++;break;
        case MONITOREXIT:res++;break;
        case WIDE:
                         switch (codes[index+1])
                         {
                           case ILOAD:res+=4;break;
                           case FLOAD:res+=4;break;
                           case ALOAD:res+=4;break;
                           case LLOAD:res+=4;break;
                           case DLOAD:res+=4;break;
                           case ISTORE:res+=4;break;
                           case FSTORE:res+=4;break;
                           case ASTORE:res+=4;break;
                           case LSTORE:res+=4;break;
                           case DSTORE:res+=4;break;
                           case RET:res+=4;break;
                           case IINC:res+=6;break;
                           default:System.err.println("ERROR_INVALID_OPCODE in stepBytecode (wide)");break;
                         }
                         break;
        case MULTIANEWARRAY:res+=4;break;
        case IFNULL:res+=3;break;
        case IFNONNULL:res+=3;break;
        case GOTO_W:res+=5;break;
        case JSR_W:res+=5;break;
                   //        case BREAKPOINT: res++;break;
                   //        case IMPDEP1: res++;break;
                   //        case IMPDEP2: res++;break;
        default:res++;System.err.println("INVALID BYTECODE " + codes[index] + " IN stepBytecode");
      }
      return res;
    }



    public static void printBytecode(PrintStream p, byte[] codes, int index) {
      p.print(toString(codes[index])+" "+getOperands(codes, index));
    }

 

    public static void printBytecodes(PrintStream p, byte[] codes) {
      for (int i=0,cnt=1; i<codes.length; i+=stepBytecode(codes,i),cnt++) {
        p.print("\t"+i+"\t"+cnt+"\t");
        printBytecode(p, codes, i);
        p.println();
      }
    }



    public static void appendBytecodes(StringBuffer p, byte[] codes) {
      for(int i = 0, cnt = 1; i < codes.length; i += stepBytecode(codes,i), cnt++) {
        p.append(" " + i + " " + cnt + "\t");
        p.append(toString(codes[i])+" "+getOperands(codes, i));
        p.append("\n");
      }
    }


}
