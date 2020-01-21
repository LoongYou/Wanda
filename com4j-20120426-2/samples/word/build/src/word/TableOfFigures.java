package word  ;

import com4j.*;

@IID("{00020921-0000-0000-C000-000000000046}")
public interface TableOfFigures extends Com4jObject {
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
   * Getter method for the COM property "Caption"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(10)
  java.lang.String caption();


  /**
   * <p>
   * Setter method for the COM property "Caption"
   * </p>
   * @param prop Mandatory java.lang.String parameter.
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(11)
  void caption(
    java.lang.String prop);


  /**
   * <p>
   * Getter method for the COM property "IncludeLabel"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(12)
  boolean includeLabel();


  /**
   * <p>
   * Setter method for the COM property "IncludeLabel"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(13)
  void includeLabel(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "RightAlignPageNumbers"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(14)
  boolean rightAlignPageNumbers();


  /**
   * <p>
   * Setter method for the COM property "RightAlignPageNumbers"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(15)
  void rightAlignPageNumbers(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "UseHeadingStyles"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(16)
  boolean useHeadingStyles();


  /**
   * <p>
   * Setter method for the COM property "UseHeadingStyles"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(17)
  void useHeadingStyles(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "LowerHeadingLevel"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(18)
  int lowerHeadingLevel();


  /**
   * <p>
   * Setter method for the COM property "LowerHeadingLevel"
   * </p>
   * @param prop Mandatory int parameter.
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(19)
  void lowerHeadingLevel(
    int prop);


  /**
   * <p>
   * Getter method for the COM property "UpperHeadingLevel"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(20)
  int upperHeadingLevel();


  /**
   * <p>
   * Setter method for the COM property "UpperHeadingLevel"
   * </p>
   * @param prop Mandatory int parameter.
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(21)
  void upperHeadingLevel(
    int prop);


  /**
   * <p>
   * Getter method for the COM property "IncludePageNumbers"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(22)
  boolean includePageNumbers();


  /**
   * <p>
   * Setter method for the COM property "IncludePageNumbers"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(23)
  void includePageNumbers(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "Range"
   * </p>
   * @return  Returns a value of type word.Range
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(24)
  word.Range range();


  /**
   * <p>
   * Getter method for the COM property "UseFields"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(25)
  boolean useFields();


  /**
   * <p>
   * Setter method for the COM property "UseFields"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(26)
  void useFields(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "TableID"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(27)
  java.lang.String tableID();


  /**
   * <p>
   * Setter method for the COM property "TableID"
   * </p>
   * @param prop Mandatory java.lang.String parameter.
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(28)
  void tableID(
    java.lang.String prop);


  /**
   * <p>
   * Getter method for the COM property "HeadingStyles"
   * </p>
   * @return  Returns a value of type word.HeadingStyles
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(29)
  word.HeadingStyles headingStyles();


  @VTID(29)
  @ReturnValue(defaultPropertyThrough={word.HeadingStyles.class})
  word.HeadingStyle headingStyles(
    int index);

  /**
   * <p>
   * Getter method for the COM property "TabLeader"
   * </p>
   * @return  Returns a value of type word.WdTabLeader
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(30)
  word.WdTabLeader tabLeader();


  /**
   * <p>
   * Setter method for the COM property "TabLeader"
   * </p>
   * @param prop Mandatory word.WdTabLeader parameter.
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(31)
  void tabLeader(
    word.WdTabLeader prop);


  /**
   */

  @DISPID(100) //= 0x64. The runtime will prefer the VTID if present
  @VTID(32)
  void delete();


  /**
   */

  @DISPID(101) //= 0x65. The runtime will prefer the VTID if present
  @VTID(33)
  void updatePageNumbers();


  /**
   */

  @DISPID(102) //= 0x66. The runtime will prefer the VTID if present
  @VTID(34)
  void update();


  /**
   * <p>
   * Getter method for the COM property "UseHyperlinks"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(13) //= 0xd. The runtime will prefer the VTID if present
  @VTID(35)
  boolean useHyperlinks();


  /**
   * <p>
   * Setter method for the COM property "UseHyperlinks"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(13) //= 0xd. The runtime will prefer the VTID if present
  @VTID(36)
  void useHyperlinks(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "HidePageNumbersInWeb"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(14) //= 0xe. The runtime will prefer the VTID if present
  @VTID(37)
  boolean hidePageNumbersInWeb();


  /**
   * <p>
   * Setter method for the COM property "HidePageNumbersInWeb"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(14) //= 0xe. The runtime will prefer the VTID if present
  @VTID(38)
  void hidePageNumbersInWeb(
    boolean prop);


  // Properties:
}
