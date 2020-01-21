package word  ;

import com4j.*;

@IID("{0002093C-0000-0000-C000-000000000046}")
public interface Borders extends Com4jObject,Iterable<Com4jObject> {
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
   * Getter method for the COM property "_NewEnum"
   * </p>
   */

  @DISPID(-4) //= 0xfffffffc. The runtime will prefer the VTID if present
  @VTID(10)
  java.util.Iterator<Com4jObject> iterator();

  /**
   * <p>
   * Getter method for the COM property "Count"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(11)
  int count();


  /**
   * <p>
   * Getter method for the COM property "Enable"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(12)
  int enable();


  /**
   * <p>
   * Setter method for the COM property "Enable"
   * </p>
   * @param prop Mandatory int parameter.
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(13)
  void enable(
    int prop);


  /**
   * <p>
   * Getter method for the COM property "DistanceFromTop"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(14)
  int distanceFromTop();


  /**
   * <p>
   * Setter method for the COM property "DistanceFromTop"
   * </p>
   * @param prop Mandatory int parameter.
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(15)
  void distanceFromTop(
    int prop);


  /**
   * <p>
   * Getter method for the COM property "Shadow"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(16)
  boolean shadow();


  /**
   * <p>
   * Setter method for the COM property "Shadow"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(17)
  void shadow(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "InsideLineStyle"
   * </p>
   * @return  Returns a value of type word.WdLineStyle
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(18)
  word.WdLineStyle insideLineStyle();


  /**
   * <p>
   * Setter method for the COM property "InsideLineStyle"
   * </p>
   * @param prop Mandatory word.WdLineStyle parameter.
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(19)
  void insideLineStyle(
    word.WdLineStyle prop);


  /**
   * <p>
   * Getter method for the COM property "OutsideLineStyle"
   * </p>
   * @return  Returns a value of type word.WdLineStyle
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(20)
  word.WdLineStyle outsideLineStyle();


  /**
   * <p>
   * Setter method for the COM property "OutsideLineStyle"
   * </p>
   * @param prop Mandatory word.WdLineStyle parameter.
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(21)
  void outsideLineStyle(
    word.WdLineStyle prop);


  /**
   * <p>
   * Getter method for the COM property "InsideLineWidth"
   * </p>
   * @return  Returns a value of type word.WdLineWidth
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(22)
  word.WdLineWidth insideLineWidth();


  /**
   * <p>
   * Setter method for the COM property "InsideLineWidth"
   * </p>
   * @param prop Mandatory word.WdLineWidth parameter.
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(23)
  void insideLineWidth(
    word.WdLineWidth prop);


  /**
   * <p>
   * Getter method for the COM property "OutsideLineWidth"
   * </p>
   * @return  Returns a value of type word.WdLineWidth
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(24)
  word.WdLineWidth outsideLineWidth();


  /**
   * <p>
   * Setter method for the COM property "OutsideLineWidth"
   * </p>
   * @param prop Mandatory word.WdLineWidth parameter.
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(25)
  void outsideLineWidth(
    word.WdLineWidth prop);


  /**
   * <p>
   * Getter method for the COM property "InsideColorIndex"
   * </p>
   * @return  Returns a value of type word.WdColorIndex
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(26)
  word.WdColorIndex insideColorIndex();


  /**
   * <p>
   * Setter method for the COM property "InsideColorIndex"
   * </p>
   * @param prop Mandatory word.WdColorIndex parameter.
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(27)
  void insideColorIndex(
    word.WdColorIndex prop);


  /**
   * <p>
   * Getter method for the COM property "OutsideColorIndex"
   * </p>
   * @return  Returns a value of type word.WdColorIndex
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(28)
  word.WdColorIndex outsideColorIndex();


  /**
   * <p>
   * Setter method for the COM property "OutsideColorIndex"
   * </p>
   * @param prop Mandatory word.WdColorIndex parameter.
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(29)
  void outsideColorIndex(
    word.WdColorIndex prop);


  /**
   * <p>
   * Getter method for the COM property "DistanceFromLeft"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(20) //= 0x14. The runtime will prefer the VTID if present
  @VTID(30)
  int distanceFromLeft();


  /**
   * <p>
   * Setter method for the COM property "DistanceFromLeft"
   * </p>
   * @param prop Mandatory int parameter.
   */

  @DISPID(20) //= 0x14. The runtime will prefer the VTID if present
  @VTID(31)
  void distanceFromLeft(
    int prop);


  /**
   * <p>
   * Getter method for the COM property "DistanceFromBottom"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(21) //= 0x15. The runtime will prefer the VTID if present
  @VTID(32)
  int distanceFromBottom();


  /**
   * <p>
   * Setter method for the COM property "DistanceFromBottom"
   * </p>
   * @param prop Mandatory int parameter.
   */

  @DISPID(21) //= 0x15. The runtime will prefer the VTID if present
  @VTID(33)
  void distanceFromBottom(
    int prop);


  /**
   * <p>
   * Getter method for the COM property "DistanceFromRight"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(22) //= 0x16. The runtime will prefer the VTID if present
  @VTID(34)
  int distanceFromRight();


  /**
   * <p>
   * Setter method for the COM property "DistanceFromRight"
   * </p>
   * @param prop Mandatory int parameter.
   */

  @DISPID(22) //= 0x16. The runtime will prefer the VTID if present
  @VTID(35)
  void distanceFromRight(
    int prop);


  /**
   * <p>
   * Getter method for the COM property "AlwaysInFront"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(23) //= 0x17. The runtime will prefer the VTID if present
  @VTID(36)
  boolean alwaysInFront();


  /**
   * <p>
   * Setter method for the COM property "AlwaysInFront"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(23) //= 0x17. The runtime will prefer the VTID if present
  @VTID(37)
  void alwaysInFront(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "SurroundHeader"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(24) //= 0x18. The runtime will prefer the VTID if present
  @VTID(38)
  boolean surroundHeader();


  /**
   * <p>
   * Setter method for the COM property "SurroundHeader"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(24) //= 0x18. The runtime will prefer the VTID if present
  @VTID(39)
  void surroundHeader(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "SurroundFooter"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(25) //= 0x19. The runtime will prefer the VTID if present
  @VTID(40)
  boolean surroundFooter();


  /**
   * <p>
   * Setter method for the COM property "SurroundFooter"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(25) //= 0x19. The runtime will prefer the VTID if present
  @VTID(41)
  void surroundFooter(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "JoinBorders"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(26) //= 0x1a. The runtime will prefer the VTID if present
  @VTID(42)
  boolean joinBorders();


  /**
   * <p>
   * Setter method for the COM property "JoinBorders"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(26) //= 0x1a. The runtime will prefer the VTID if present
  @VTID(43)
  void joinBorders(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "HasHorizontal"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(27) //= 0x1b. The runtime will prefer the VTID if present
  @VTID(44)
  boolean hasHorizontal();


  /**
   * <p>
   * Getter method for the COM property "HasVertical"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(28) //= 0x1c. The runtime will prefer the VTID if present
  @VTID(45)
  boolean hasVertical();


  /**
   * <p>
   * Getter method for the COM property "DistanceFrom"
   * </p>
   * @return  Returns a value of type word.WdBorderDistanceFrom
   */

  @DISPID(29) //= 0x1d. The runtime will prefer the VTID if present
  @VTID(46)
  word.WdBorderDistanceFrom distanceFrom();


  /**
   * <p>
   * Setter method for the COM property "DistanceFrom"
   * </p>
   * @param prop Mandatory word.WdBorderDistanceFrom parameter.
   */

  @DISPID(29) //= 0x1d. The runtime will prefer the VTID if present
  @VTID(47)
  void distanceFrom(
    word.WdBorderDistanceFrom prop);


  /**
   * <p>
   * Getter method for the COM property "EnableFirstPageInSection"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(30) //= 0x1e. The runtime will prefer the VTID if present
  @VTID(48)
  boolean enableFirstPageInSection();


  /**
   * <p>
   * Setter method for the COM property "EnableFirstPageInSection"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(30) //= 0x1e. The runtime will prefer the VTID if present
  @VTID(49)
  void enableFirstPageInSection(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "EnableOtherPagesInSection"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(31) //= 0x1f. The runtime will prefer the VTID if present
  @VTID(50)
  boolean enableOtherPagesInSection();


  /**
   * <p>
   * Setter method for the COM property "EnableOtherPagesInSection"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(31) //= 0x1f. The runtime will prefer the VTID if present
  @VTID(51)
  void enableOtherPagesInSection(
    boolean prop);


  /**
   * @param index Mandatory word.WdBorderType parameter.
   * @return  Returns a value of type word.Border
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(52)
  @DefaultMethod
  word.Border item(
    word.WdBorderType index);


  /**
   */

  @DISPID(2000) //= 0x7d0. The runtime will prefer the VTID if present
  @VTID(53)
  void applyPageBordersToAllSections();


  /**
   * <p>
   * Getter method for the COM property "InsideColor"
   * </p>
   * @return  Returns a value of type word.WdColor
   */

  @DISPID(32) //= 0x20. The runtime will prefer the VTID if present
  @VTID(54)
  word.WdColor insideColor();


  /**
   * <p>
   * Setter method for the COM property "InsideColor"
   * </p>
   * @param prop Mandatory word.WdColor parameter.
   */

  @DISPID(32) //= 0x20. The runtime will prefer the VTID if present
  @VTID(55)
  void insideColor(
    word.WdColor prop);


  /**
   * <p>
   * Getter method for the COM property "OutsideColor"
   * </p>
   * @return  Returns a value of type word.WdColor
   */

  @DISPID(33) //= 0x21. The runtime will prefer the VTID if present
  @VTID(56)
  word.WdColor outsideColor();


  /**
   * <p>
   * Setter method for the COM property "OutsideColor"
   * </p>
   * @param prop Mandatory word.WdColor parameter.
   */

  @DISPID(33) //= 0x21. The runtime will prefer the VTID if present
  @VTID(57)
  void outsideColor(
    word.WdColor prop);


  // Properties:
}
