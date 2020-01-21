package word  ;

import com4j.*;

@IID("{00020913-0000-0000-C000-000000000046}")
public interface TableOfContents extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of type word._Application
   */

  @DISPID(1000) //= 0x3e8. The runtime will prefer the VTID if present
  @VTID(7)
  word._Application application();


  /**
   * <p>
   * Getter method for the COM property "Creator"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1001) //= 0x3e9. The runtime will prefer the VTID if present
  @VTID(8)
  int creator();


  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(1002) //= 0x3ea. The runtime will prefer the VTID if present
  @VTID(9)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject parent();


  /**
   * <p>
   * Getter method for the COM property "UseHeadingStyles"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(10)
  boolean useHeadingStyles();


  /**
   * <p>
   * Setter method for the COM property "UseHeadingStyles"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(11)
  void useHeadingStyles(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "UseFields"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(12)
  boolean useFields();


  /**
   * <p>
   * Setter method for the COM property "UseFields"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(13)
  void useFields(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "UpperHeadingLevel"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(14)
  int upperHeadingLevel();


  /**
   * <p>
   * Setter method for the COM property "UpperHeadingLevel"
   * </p>
   * @param prop Mandatory int parameter.
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(15)
  void upperHeadingLevel(
    int prop);


  /**
   * <p>
   * Getter method for the COM property "LowerHeadingLevel"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(16)
  int lowerHeadingLevel();


  /**
   * <p>
   * Setter method for the COM property "LowerHeadingLevel"
   * </p>
   * @param prop Mandatory int parameter.
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(17)
  void lowerHeadingLevel(
    int prop);


  /**
   * <p>
   * Getter method for the COM property "TableID"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(18)
  java.lang.String tableID();


  /**
   * <p>
   * Setter method for the COM property "TableID"
   * </p>
   * @param prop Mandatory java.lang.String parameter.
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(19)
  void tableID(
    java.lang.String prop);


  /**
   * <p>
   * Getter method for the COM property "HeadingStyles"
   * </p>
   * @return  Returns a value of type word.HeadingStyles
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(20)
  word.HeadingStyles headingStyles();


  @VTID(20)
  @ReturnValue(defaultPropertyThrough={word.HeadingStyles.class})
  word.HeadingStyle headingStyles(
    int index);

  /**
   * <p>
   * Getter method for the COM property "RightAlignPageNumbers"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(21)
  boolean rightAlignPageNumbers();


  /**
   * <p>
   * Setter method for the COM property "RightAlignPageNumbers"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(22)
  void rightAlignPageNumbers(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "IncludePageNumbers"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(23)
  boolean includePageNumbers();


  /**
   * <p>
   * Setter method for the COM property "IncludePageNumbers"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(24)
  void includePageNumbers(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "Range"
   * </p>
   * @return  Returns a value of type word.Range
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(25)
  word.Range range();


  /**
   * <p>
   * Getter method for the COM property "TabLeader"
   * </p>
   * @return  Returns a value of type word.WdTabLeader
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(26)
  word.WdTabLeader tabLeader();


  /**
   * <p>
   * Setter method for the COM property "TabLeader"
   * </p>
   * @param prop Mandatory word.WdTabLeader parameter.
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(27)
  void tabLeader(
    word.WdTabLeader prop);


  /**
   */

  @DISPID(100) //= 0x64. The runtime will prefer the VTID if present
  @VTID(28)
  void delete();


  /**
   */

  @DISPID(101) //= 0x65. The runtime will prefer the VTID if present
  @VTID(29)
  void updatePageNumbers();


  /**
   */

  @DISPID(102) //= 0x66. The runtime will prefer the VTID if present
  @VTID(30)
  void update();


  /**
   * <p>
   * Getter method for the COM property "UseHyperlinks"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(31)
  boolean useHyperlinks();


  /**
   * <p>
   * Setter method for the COM property "UseHyperlinks"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(32)
  void useHyperlinks(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "HidePageNumbersInWeb"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(33)
  boolean hidePageNumbersInWeb();


  /**
   * <p>
   * Setter method for the COM property "HidePageNumbersInWeb"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(34)
  void hidePageNumbersInWeb(
    boolean prop);


  // Properties:
}
