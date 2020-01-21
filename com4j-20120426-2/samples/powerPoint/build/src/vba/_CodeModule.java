package vba  ;

import com4j.*;

@IID("{0002E16E-0000-0000-C000-000000000046}")
public interface _CodeModule extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type vba._VBComponent
   */

  @DISPID(1610743808) //= 0x60020000. The runtime will prefer the VTID if present
  @VTID(7)
  vba._VBComponent parent();


  /**
   * <p>
   * Getter method for the COM property "VBE"
   * </p>
   * @return  Returns a value of type vba.VBE
   */

  @DISPID(1610743809) //= 0x60020001. The runtime will prefer the VTID if present
  @VTID(8)
  vba.VBE vbe();


  /**
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(9)
  @DefaultMethod
  java.lang.String name();


  /**
   * <p>
   * Setter method for the COM property "Name"
   * </p>
   * @param pbstrName Mandatory java.lang.String parameter.
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(10)
  @DefaultMethod
  void name(
    java.lang.String pbstrName);


  /**
   * @param string Mandatory java.lang.String parameter.
   */

  @DISPID(1610743812) //= 0x60020004. The runtime will prefer the VTID if present
  @VTID(11)
  void addFromString(
    java.lang.String string);


  /**
   * @param fileName Mandatory java.lang.String parameter.
   */

  @DISPID(1610743813) //= 0x60020005. The runtime will prefer the VTID if present
  @VTID(12)
  void addFromFile(
    java.lang.String fileName);


  /**
   * <p>
   * Getter method for the COM property "Lines"
   * </p>
   * @param startLine Mandatory int parameter.
   * @param count Mandatory int parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610743814) //= 0x60020006. The runtime will prefer the VTID if present
  @VTID(13)
  java.lang.String lines(
    int startLine,
    int count);


  /**
   * <p>
   * Getter method for the COM property "CountOfLines"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610743815) //= 0x60020007. The runtime will prefer the VTID if present
  @VTID(14)
  int countOfLines();


  /**
   * @param line Mandatory int parameter.
   * @param string Mandatory java.lang.String parameter.
   */

  @DISPID(1610743816) //= 0x60020008. The runtime will prefer the VTID if present
  @VTID(15)
  void insertLines(
    int line,
    java.lang.String string);


  /**
   * @param startLine Mandatory int parameter.
   * @param count Optional parameter. Default value is 1
   */

  @DISPID(1610743817) //= 0x60020009. The runtime will prefer the VTID if present
  @VTID(16)
  void deleteLines(
    int startLine,
    @Optional @DefaultValue("1") int count);


  /**
   * @param line Mandatory int parameter.
   * @param string Mandatory java.lang.String parameter.
   */

  @DISPID(1610743818) //= 0x6002000a. The runtime will prefer the VTID if present
  @VTID(17)
  void replaceLine(
    int line,
    java.lang.String string);


  /**
   * <p>
   * Getter method for the COM property "ProcStartLine"
   * </p>
   * @param procName Mandatory java.lang.String parameter.
   * @param procKind Mandatory vba.vbext_ProcKind parameter.
   * @return  Returns a value of type int
   */

  @DISPID(1610743819) //= 0x6002000b. The runtime will prefer the VTID if present
  @VTID(18)
  int procStartLine(
    java.lang.String procName,
    vba.vbext_ProcKind procKind);


  /**
   * <p>
   * Getter method for the COM property "ProcCountLines"
   * </p>
   * @param procName Mandatory java.lang.String parameter.
   * @param procKind Mandatory vba.vbext_ProcKind parameter.
   * @return  Returns a value of type int
   */

  @DISPID(1610743820) //= 0x6002000c. The runtime will prefer the VTID if present
  @VTID(19)
  int procCountLines(
    java.lang.String procName,
    vba.vbext_ProcKind procKind);


  /**
   * <p>
   * Getter method for the COM property "ProcBodyLine"
   * </p>
   * @param procName Mandatory java.lang.String parameter.
   * @param procKind Mandatory vba.vbext_ProcKind parameter.
   * @return  Returns a value of type int
   */

  @DISPID(1610743821) //= 0x6002000d. The runtime will prefer the VTID if present
  @VTID(20)
  int procBodyLine(
    java.lang.String procName,
    vba.vbext_ProcKind procKind);


  /**
   * <p>
   * Getter method for the COM property "ProcOfLine"
   * </p>
   * @param line Mandatory int parameter.
   * @param procKind Mandatory Holder<vba.vbext_ProcKind> parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610743822) //= 0x6002000e. The runtime will prefer the VTID if present
  @VTID(21)
  java.lang.String procOfLine(
    int line,
    Holder<vba.vbext_ProcKind> procKind);


  /**
   * <p>
   * Getter method for the COM property "CountOfDeclarationLines"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610743823) //= 0x6002000f. The runtime will prefer the VTID if present
  @VTID(22)
  int countOfDeclarationLines();


  /**
   * @param eventName Mandatory java.lang.String parameter.
   * @param objectName Mandatory java.lang.String parameter.
   * @return  Returns a value of type int
   */

  @DISPID(1610743824) //= 0x60020010. The runtime will prefer the VTID if present
  @VTID(23)
  int createEventProc(
    java.lang.String eventName,
    java.lang.String objectName);


  /**
   * @param target Mandatory java.lang.String parameter.
   * @param startLine Mandatory Holder<Integer> parameter.
   * @param startColumn Mandatory Holder<Integer> parameter.
   * @param endLine Mandatory Holder<Integer> parameter.
   * @param endColumn Mandatory Holder<Integer> parameter.
   * @param wholeWord Optional parameter. Default value is false
   * @param matchCase Optional parameter. Default value is false
   * @param patternSearch Optional parameter. Default value is false
   * @return  Returns a value of type boolean
   */

  @DISPID(1610743825) //= 0x60020011. The runtime will prefer the VTID if present
  @VTID(24)
  boolean find(
    java.lang.String target,
    Holder<Integer> startLine,
    Holder<Integer> startColumn,
    Holder<Integer> endLine,
    Holder<Integer> endColumn,
    @Optional @DefaultValue("0") boolean wholeWord,
    @Optional @DefaultValue("0") boolean matchCase,
    @Optional @DefaultValue("0") boolean patternSearch);


  /**
   * <p>
   * Getter method for the COM property "CodePane"
   * </p>
   * @return  Returns a value of type vba._CodePane
   */

  @DISPID(1610743826) //= 0x60020012. The runtime will prefer the VTID if present
  @VTID(25)
  vba._CodePane codePane();


  // Properties:
}
