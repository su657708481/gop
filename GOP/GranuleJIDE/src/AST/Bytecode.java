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
public class Bytecode extends java.lang.Object {

    public final static byte NOP = 0;


    public final static byte ACONST_NULL = 1;


    public final static byte ICONST_M1 = 2;


    public final static byte ICONST_0 = 3;


    public final static byte ICONST_1 = 4;


    public final static byte ICONST_2 = 5;


    public final static byte ICONST_3 = 6;


    public final static byte ICONST_4 = 7;


    public final static byte ICONST_5 = 8;


    public final static byte LCONST_0 = 9;


    public final static byte LCONST_1 = 10;


    public final static byte FCONST_0 = 11;


    public final static byte FCONST_1 = 12;


    public final static byte FCONST_2 = 13;


    public final static byte DCONST_0 = 14;


    public final static byte DCONST_1 = 15;


    public final static byte BIPUSH = 16;


    public final static byte SIPUSH = 17;


    public final static byte LDC = 18;


    public final static byte LDC_W = 19;


    public final static byte LDC2_W = 20;


    public final static byte ILOAD = 21;


    public final static byte LLOAD = 22;


    public final static byte FLOAD = 23;


    public final static byte DLOAD = 24;


    public final static byte ALOAD = 25;


    public final static byte ILOAD_0 = 26;


    public final static byte ILOAD_1 = 27;


    public final static byte ILOAD_2 = 28;


    public final static byte ILOAD_3 = 29;


    public final static byte LLOAD_0 = 30;


    public final static byte LLOAD_1 = 31;


    public final static byte LLOAD_2 = 32;


    public final static byte LLOAD_3 = 33;


    public final static byte FLOAD_0 = 34;


    public final static byte FLOAD_1 = 35;


    public final static byte FLOAD_2 = 36;


    public final static byte FLOAD_3 = 37;


    public final static byte DLOAD_0 = 38;


    public final static byte DLOAD_1 = 39;


    public final static byte DLOAD_2 = 40;


    public final static byte DLOAD_3 = 41;


    public final static byte ALOAD_0 = 42;


    public final static byte ALOAD_1 = 43;


    public final static byte ALOAD_2 = 44;


    public final static byte ALOAD_3 = 45;


    public final static byte IALOAD = 46;


    public final static byte LALOAD = 47;


    public final static byte FALOAD = 48;


    public final static byte DALOAD = 49;


    public final static byte AALOAD = 50;


    public final static byte BALOAD = 51;


    public final static byte CALOAD = 52;


    public final static byte SALOAD = 53;


    public final static byte ISTORE = 54;


    public final static byte LSTORE = 55;


    public final static byte FSTORE = 56;


    public final static byte DSTORE = 57;


    public final static byte ASTORE = 58;


    public final static byte ISTORE_0 = 59;


    public final static byte ISTORE_1 = 60;


    public final static byte ISTORE_2 = 61;


    public final static byte ISTORE_3 = 62;


    public final static byte LSTORE_0 = 63;


    public final static byte LSTORE_1 = 64;


    public final static byte LSTORE_2 = 65;


    public final static byte LSTORE_3 = 66;


    public final static byte FSTORE_0 = 67;


    public final static byte FSTORE_1 = 68;


    public final static byte FSTORE_2 = 69;


    public final static byte FSTORE_3 = 70;


    public final static byte DSTORE_0 = 71;


    public final static byte DSTORE_1 = 72;


    public final static byte DSTORE_2 = 73;


    public final static byte DSTORE_3 = 74;


    public final static byte ASTORE_0 = 75;


    public final static byte ASTORE_1 = 76;


    public final static byte ASTORE_2 = 77;


    public final static byte ASTORE_3 = 78;


    public final static byte IASTORE = 79;


    public final static byte LASTORE = 80;


    public final static byte FASTORE = 81;


    public final static byte DASTORE = 82;


    public final static byte AASTORE = 83;


    public final static byte BASTORE = 84;


    public final static byte CASTORE = 85;


    public final static byte SASTORE = 86;


    public final static byte POP = 87;


    public final static byte POP2 = 88;


    public final static byte DUP = 89;


    public final static byte DUP_X1 = 90;


    public final static byte DUP_X2 = 91;


    public final static byte DUP2 = 92;


    public final static byte DUP2_X1 = 93;


    public final static byte DUP2_X2 = 94 ;


    public final static byte SWAP = 95;


    public final static byte IADD = 96;


    public final static byte LADD = 97;


    public final static byte FADD = 98;


    public final static byte DADD = 99;


    public final static byte ISUB = 100;


    public final static byte LSUB = 101;


    public final static byte FSUB = 102;


    public final static byte DSUB = 103;


    public final static byte IMUL = 104;


    public final static byte LMUL = 105;


    public final static byte FMUL = 106;


    public final static byte DMUL = 107;


    public final static byte IDIV = 108;


    public final static byte LDIV = 109;


    public final static byte FDIV = 110;


    public final static byte DDIV = 111;


    public final static byte IREM = 112;


    public final static byte LREM = 113;


    public final static byte FREM = 114;


    public final static byte DREM = 115;


    public final static byte INEG = 116;


    public final static byte LNEG = 117;


    public final static byte FNEG = 118;


    public final static byte DNEG = 119;


    public final static byte ISHL = 120;


    public final static byte LSHL = 121;


    public final static byte ISHR = 122;


    public final static byte LSHR = 123;


    public final static byte IUSHR = 124;


    public final static byte LUSHR = 125;


    public final static byte IAND = 126;


    public final static byte LAND = 127;


    public final static byte IOR = -256+128;


    public final static byte LOR = -256+129;


    public final static byte IXOR = -256+130;


    public final static byte LXOR = -256+131;


    public final static byte IINC = -256+132;


    public final static byte I2L = -256+133;


    public final static byte I2F = -256+134;


    public final static byte I2D = -256+135;


    public final static byte L2I = -256+136;


    public final static byte L2F = -256+137;


    public final static byte L2D = -256+138;


    public final static byte F2I = -256+139;


    public final static byte F2L = -256+140;


    public final static byte F2D = -256+141;


    public final static byte D2I = -256+142;


    public final static byte D2L = -256+143;


    public final static byte D2F = -256+144;


    public final static byte I2B = -256+145;


    public final static byte I2C = -256+146;


    public final static byte I2S = -256+147;


    public final static byte LCMP = -256+148;


    public final static byte FCMPL = -256+149;


    public final static byte FCMPG = -256+150;


    public final static byte DCMPL = -256+151;


    public final static byte DCMPG = -256+152;


    public final static byte IFEQ = -256+153;


    public final static byte IFNE = -256+154;


    public final static byte IFLT = -256+155;


    public final static byte IFGE = -256+156;


    public final static byte IFGT = -256+157;


    public final static byte IFLE = -256+158;


    public final static byte IF_ICMPEQ = -256+159;


    public final static byte IF_ICMPNE = -256+160;


    public final static byte IF_ICMPLT = -256+161;


    public final static byte IF_ICMPGE = -256+162;


    public final static byte IF_ICMPGT = -256+163;


    public final static byte IF_ICMPLE = -256+164;


    public final static byte IF_ACMPEQ = -256+165;


    public final static byte IF_ACMPNE = -256+166;


    public final static byte GOTO = -256+167;


    public final static byte JSR = -256+168;


    public final static byte RET = -256+169;


    public final static byte TABLESWITCH = -256+170;


    public final static byte LOOKUPSWITCH = -256+171;


    public final static byte IRETURN = -256+172;


    public final static byte LRETURN = -256+173;


    public final static byte FRETURN = -256+174 ;


    public final static byte DRETURN = -256+175;


    public final static byte ARETURN = -256+176;


    public final static byte RETURN = -256+177;


    public final static byte GETSTATIC = -256+178 ;


    public final static byte PUTSTATIC = -256+179;


    public final static byte GETFIELD = -256+180;


    public final static byte PUTFIELD = -256+181;


    public final static byte INVOKEVIRTUAL = -256+182;


    public final static byte INVOKESPECIAL = -256+183;


    public final static byte INVOKESTATIC = -256+184;


    public final static byte INVOKEINTERFACE = -256+185;


    //Opcode 186 is unused
    public final static byte NEW = -256+187;


    public final static byte NEWARRAY = -256+188;


    public final static byte ANEWARRAY = -256+189;


    public final static byte ARRAYLENGTH = -256+190;


    public final static byte ATHROW = -256+191;


    public final static byte CHECKCAST = -256+192;


    public final static byte INSTANCEOF = -256+193;


    public final static byte MONITORENTER = -256+194;


    public final static byte MONITOREXIT = -256+195;


    public final static byte WIDE = -256+196;


    public final static byte MULTIANEWARRAY = -256+197;


    public final static byte IFNULL = -256+198;


    public final static byte IFNONNULL = -256+199;


    public final static byte GOTO_W = -256+200;


    public final static byte JSR_W = -256+201;


    public final static byte BREAKPOINT = -256+202;


    public final static byte IMPDEP1 = -256+254;


    public final static byte IMPDEP2 = -256+255;


}
