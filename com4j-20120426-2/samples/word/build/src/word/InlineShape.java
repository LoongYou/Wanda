package word  ;

import com4j.*;

@IID("{000209A8-0000-0000-C000-000000000046}")
public interface InlineShape extends Com4jObject {
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
   * Getter method for the COM property "Borders"
   * </p>
   * @return  Returns a value of type word.Borders
   */

  @DISPID(1100) //= 0x44c. The runtime will prefer the VTID if present
  @VTID(10)
  word.Borders borders();


  @VTID(10)
  @ReturnValue(defaultPropertyThrough={word.Borders.class})
  word.Border borders(
    word.WdBorderType index);

  /**
   * <p>
   * Setter method for the COM property "Borders"
   * </p>
   * @param prop Mandatory word.Borders parameter.
   */

  @DISPID(1100) //= 0x44c. The runtime will prefer the VTID if present
  @VTID(11)
  void borders(
    word.Borders prop);


  /**
   * <p>
   * Getter method for the COM property "Range"
   * </p>
   * @return  Returns a value of type word.Range
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(12)
  word.Range range();


  /**
   * <p>
   * Getter method for the COM property "LinkFormat"
   * </p>
   * @return  Returns a value of type word.LinkFormat
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(13)
  word.LinkFormat linkFormat();


  /**
   * <p>
   * Getter method for the COM property "Field"
   * </p>
   * @return  Returns a value of type word.Field
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(14)
  word.Field field();


  /**
   * <p>
   * Getter method for the COM property "OLEFormat"
   * </p>
   * @return  Returns a value of type word.OLEFormat
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(15)
  word.OLEFormat oleFormat();


  /**
   * <p>
   * Getter method for the COM property "Type"
   * </p>
   * @return  Returns a value of type word.WdInlineShapeType
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(16)
  word.WdInlineShapeType type();


  /**
   * <p>
   * Getter method for the COM property "Hyperlink"
   * </p>
   * @return  Returns a value of type word.Hyperlink
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(17)
  word.Hyperlink hyperlink();


  /**
   * <p>
   * Getter method for the COM property "Height"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(18)
  float height();


  /**
   * <p>
   * Setter method for the COM property "Height"
   * </p>
   * @param prop Mandatory float parameter.
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(19)
  void height(
    float prop);


  /**
   * <p>
   * Getter method for the COM property "Width"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(20)
  float width();


  /**
   * <p>
   * Setter method for the COM property "Width"
   * </p>
   * @param prop Mandatory float parameter.
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(21)
  void width(
    float prop);


  /**
   * <p>
   * Getter method for the COM property "ScaleHeight"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(22)
  float scaleHeight();


  /**
   * <p>
   * Setter method for the COM property "ScaleHeight"
   * </p>
   * @param prop Mandatory float parameter.
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(23)
  void scaleHeight(
    float prop);


  /**
   * <p>
   * Getter method for the COM property "ScaleWidth"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(24)
  float scaleWidth();


  /**
   * <p>
   * Setter method for the COM property "ScaleWidth"
   * </p>
   * @param prop Mandatory float parameter.
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(25)
  void scaleWidth(
    float prop);


  /**
   * <p>
   * Getter method for the COM property "LockAspectRatio"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(26)
  office.MsoTriState lockAspectRatio();


  /**
   * <p>
   * Setter method for the COM property "LockAspectRatio"
   * </p>
   * @param prop Mandatory office.MsoTriState parameter.
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(27)
  void lockAspectRatio(
    office.MsoTriState prop);


  /**
   * <p>
   * Getter method for the COM property "Line"
   * </p>
   * @return  Returns a value of type word.LineFormat
   */

  @DISPID(112) //= 0x70. The runtime will prefer the VTID if present
  @VTID(28)
  word.LineFormat line();


  /**
   * <p>
   * Getter method for the COM property "Fill"
   * </p>
   * @return  Returns a value of type word.FillFormat
   */

  @DISPID(107) //= 0x6b. The runtime will prefer the VTID if present
  @VTID(29)
  word.FillFormat fill();


  /**
   * <p>
   * Getter method for the COM property "PictureFormat"
   * </p>
   * @return  Returns a value of type word.PictureFormat
   */

  @DISPID(118) //= 0x76. The runtime will prefer the VTID if present
  @VTID(30)
  word.PictureFormat pictureFormat();


  /**
   * <p>
   * Setter method for the COM property "PictureFormat"
   * </p>
   * @param prop Mandatory word.PictureFormat parameter.
   */

  @DISPID(118) //= 0x76. The runtime will prefer the VTID if present
  @VTID(31)
  void pictureFormat(
    word.PictureFormat prop);


  /**
   */

  @DISPID(100) //= 0x64. The runtime will prefer the VTID if present
  @VTID(32)
  void activate();


  /**
   */

  @DISPID(101) //= 0x65. The runtime will prefer the VTID if present
  @VTID(33)
  void reset();


  /**
   */

  @DISPID(102) //= 0x66. The runtime will prefer the VTID if present
  @VTID(34)
  void delete();


  /**
   */

  @DISPID(65535) //= 0xffff. The runtime will prefer the VTID if present
  @VTID(35)
  void select();


  /**
   * @return  Returns a value of type word.Shape
   */

  @DISPID(104) //= 0x68. The runtime will prefer the VTID if present
  @VTID(36)
  word.Shape convertToShape();


  /**
   * <p>
   * Getter method for the COM property "HorizontalLineFormat"
   * </p>
   * @return  Returns a value of type word.HorizontalLineFormat
   */

  @DISPID(119) //= 0x77. The runtime will prefer the VTID if present
  @VTID(37)
  word.HorizontalLineFormat horizontalLineFormat();


  /**
   * <p>
   * Getter method for the COM property "Script"
   * </p>
   * @return  Returns a value of type office.Script
   */

  @DISPID(122) //= 0x7a. The runtime will prefer the VTID if present
  @VTID(38)
  office.Script script();


  /**
   * <p>
   * Getter method for the COM property "OWSAnchor"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(130) //= 0x82. The runtime will prefer the VTID if present
  @VTID(39)
  int owsAnchor();


  /**
   * <p>
   * Getter method for the COM property "TextEffect"
   * </p>
   * @return  Returns a value of type word.TextEffectFormat
   */

  @DISPID(120) //= 0x78. The runtime will prefer the VTID if present
  @VTID(40)
  word.TextEffectFormat textEffect();


  /**
   * <p>
   * Setter method for the COM property "TextEffect"
   * </p>
   * @param prop Mandatory word.TextEffectFormat parameter.
   */

  @DISPID(120) //= 0x78. The runtime will prefer the VTID if present
  @VTID(41)
  void textEffect(
    word.TextEffectFormat prop);


  /**
   * <p>
   * Getter method for the COM property "AlternativeText"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(131) //= 0x83. The runtime will prefer the VTID if present
  @VTID(42)
  java.lang.String alternativeText();


  /**
   * <p>
   * Setter method for the COM property "AlternativeText"
   * </p>
   * @param prop Mandatory java.lang.String parameter.
   */

  @DISPID(131) //= 0x83. The runtime will prefer the VTID if present
  @VTID(43)
  void alternativeText(
    java.lang.String prop);


  /**
   * <p>
   * Getter method for the COM property "IsPictureBullet"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(132) //= 0x84. The runtime will prefer the VTID if present
  @VTID(44)
  boolean isPictureBullet();


  /**
   * <p>
   * Getter method for the COM property "GroupItems"
   * </p>
   * @return  Returns a value of type word.GroupShapes
   */

  @DISPID(133) //= 0x85. The runtime will prefer the VTID if present
  @VTID(45)
  word.GroupShapes groupItems();


  @VTID(45)
  @ReturnValue(defaultPropertyThrough={word.GroupShapes.class})
  word.Shape groupItems(
    java.lang.Object index);

  /**
   * <p>
   * Getter method for the COM property "HasChart"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @DISPID(148) //= 0x94. The runtime will prefer the VTID if present
  @VTID(46)
  office.MsoTriState hasChart();


  /**
   * <p>
   * Getter method for the COM property "Chart"
   * </p>
   * @return  Returns a value of type word.Chart
   */

  @DISPID(149) //= 0x95. The runtime will prefer the VTID if present
  @VTID(47)
  word.Chart chart();


  /**
   * <p>
   * Getter method for the COM property "SoftEdge"
   * </p>
   * @return  Returns a value of type word.SoftEdgeFormat
   */

  @DISPID(152) //= 0x98. The runtime will prefer the VTID if present
  @VTID(48)
  word.SoftEdgeFormat softEdge();


  /**
   * <p>
   * Getter method for the COM property "Glow"
   * </p>
   * @return  Returns a value of type word.GlowFormat
   */

  @DISPID(153) //= 0x99. The runtime will prefer the VTID if present
  @VTID(49)
  word.GlowFormat glow();


  /**
   * <p>
   * Getter method for the COM property "Reflection"
   * </p>
   * @return  Returns a value of type word.ReflectionFormat
   */

  @DISPID(154) //= 0x9a. The runtime will prefer the VTID if present
  @VTID(50)
  word.ReflectionFormat reflection();


  /**
   * <p>
   * Getter method for the COM property "Shadow"
   * </p>
   * @return  Returns a value of type word.ShadowFormat
   */

  @DISPID(1101) //= 0x44d. The runtime will prefer the VTID if present
  @VTID(51)
  word.ShadowFormat shadow();


  /**
   * <p>
   * Getter method for the COM property "HasSmartArt"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @DISPID(155) //= 0x9b. The runtime will prefer the VTID if present
  @VTID(52)
  office.MsoTriState hasSmartArt();


  /**
   * <p>
   * Getter method for the COM property "SmartArt"
   * </p>
   * @return  Returns a value of type office.SmartArt
   */

  @DISPID(156) //= 0x9c. The runtime will prefer the VTID if present
  @VTID(53)
  office.SmartArt smartArt();


  /**
   * <p>
   * Getter method for the COM property "Title"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(158) //= 0x9e. The runtime will prefer the VTID if present
  @VTID(54)
  java.lang.String title();


  /**
   * <p>
   * Setter method for the COM property "Title"
   * </p>
   * @param prop Mandatory java.lang.String parameter.
   */

  @DISPID(158) //= 0x9e. The runtime will prefer the VTID if present
  @VTID(55)
  void title(
    java.lang.String prop);


  /**
   * <p>
   * Getter method for the COM property "AnchorID"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(207) //= 0xcf. The runtime will prefer the VTID if present
  @VTID(56)
  int anchorID();


  /**
   * <p>
   * Getter method for the COM property "EditID"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(208) //= 0xd0. The runtime will prefer the VTID if present
  @VTID(57)
  int editID();


  // Properties:
}
