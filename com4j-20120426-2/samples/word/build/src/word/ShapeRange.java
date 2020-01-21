package word  ;

import com4j.*;

@IID("{000209B5-0000-0000-C000-000000000046}")
public interface ShapeRange extends Com4jObject,Iterable<Com4jObject> {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of type word._Application
   */

  @DISPID(8000) //= 0x1f40. The runtime will prefer the VTID if present
  @VTID(7)
  word._Application application();


  /**
   * <p>
   * Getter method for the COM property "Creator"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(8001) //= 0x1f41. The runtime will prefer the VTID if present
  @VTID(8)
  int creator();


  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(9)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject parent();


  /**
   * <p>
   * Getter method for the COM property "Count"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(10)
  int count();


  /**
   * <p>
   * Getter method for the COM property "_NewEnum"
   * </p>
   */

  @DISPID(-4) //= 0xfffffffc. The runtime will prefer the VTID if present
  @VTID(11)
  java.util.Iterator<Com4jObject> iterator();

  /**
   * <p>
   * Getter method for the COM property "Adjustments"
   * </p>
   * @return  Returns a value of type word.Adjustments
   */

  @DISPID(100) //= 0x64. The runtime will prefer the VTID if present
  @VTID(12)
  word.Adjustments adjustments();


  @VTID(12)
  @ReturnValue(defaultPropertyThrough={word.Adjustments.class})
  float adjustments(
    int index);

  /**
   * <p>
   * Getter method for the COM property "AutoShapeType"
   * </p>
   * @return  Returns a value of type office.MsoAutoShapeType
   */

  @DISPID(101) //= 0x65. The runtime will prefer the VTID if present
  @VTID(13)
  office.MsoAutoShapeType autoShapeType();


  /**
   * <p>
   * Setter method for the COM property "AutoShapeType"
   * </p>
   * @param prop Mandatory office.MsoAutoShapeType parameter.
   */

  @DISPID(101) //= 0x65. The runtime will prefer the VTID if present
  @VTID(14)
  void autoShapeType(
    office.MsoAutoShapeType prop);


  /**
   * <p>
   * Getter method for the COM property "Callout"
   * </p>
   * @return  Returns a value of type word.CalloutFormat
   */

  @DISPID(103) //= 0x67. The runtime will prefer the VTID if present
  @VTID(15)
  word.CalloutFormat callout();


  /**
   * <p>
   * Getter method for the COM property "ConnectionSiteCount"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(104) //= 0x68. The runtime will prefer the VTID if present
  @VTID(16)
  int connectionSiteCount();


  /**
   * <p>
   * Getter method for the COM property "Connector"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @DISPID(105) //= 0x69. The runtime will prefer the VTID if present
  @VTID(17)
  office.MsoTriState connector();


  /**
   * <p>
   * Getter method for the COM property "ConnectorFormat"
   * </p>
   * @return  Returns a value of type word.ConnectorFormat
   */

  @DISPID(106) //= 0x6a. The runtime will prefer the VTID if present
  @VTID(18)
  word.ConnectorFormat connectorFormat();


  /**
   * <p>
   * Getter method for the COM property "Fill"
   * </p>
   * @return  Returns a value of type word.FillFormat
   */

  @DISPID(107) //= 0x6b. The runtime will prefer the VTID if present
  @VTID(19)
  word.FillFormat fill();


  /**
   * <p>
   * Getter method for the COM property "GroupItems"
   * </p>
   * @return  Returns a value of type word.GroupShapes
   */

  @DISPID(108) //= 0x6c. The runtime will prefer the VTID if present
  @VTID(20)
  word.GroupShapes groupItems();


  @VTID(20)
  @ReturnValue(defaultPropertyThrough={word.GroupShapes.class})
  word.Shape groupItems(
    java.lang.Object index);

  /**
   * <p>
   * Getter method for the COM property "Height"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(109) //= 0x6d. The runtime will prefer the VTID if present
  @VTID(21)
  float height();


  /**
   * <p>
   * Setter method for the COM property "Height"
   * </p>
   * @param prop Mandatory float parameter.
   */

  @DISPID(109) //= 0x6d. The runtime will prefer the VTID if present
  @VTID(22)
  void height(
    float prop);


  /**
   * <p>
   * Getter method for the COM property "HorizontalFlip"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @DISPID(110) //= 0x6e. The runtime will prefer the VTID if present
  @VTID(23)
  office.MsoTriState horizontalFlip();


  /**
   * <p>
   * Getter method for the COM property "Left"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(111) //= 0x6f. The runtime will prefer the VTID if present
  @VTID(24)
  float left();


  /**
   * <p>
   * Setter method for the COM property "Left"
   * </p>
   * @param prop Mandatory float parameter.
   */

  @DISPID(111) //= 0x6f. The runtime will prefer the VTID if present
  @VTID(25)
  void left(
    float prop);


  /**
   * <p>
   * Getter method for the COM property "Line"
   * </p>
   * @return  Returns a value of type word.LineFormat
   */

  @DISPID(112) //= 0x70. The runtime will prefer the VTID if present
  @VTID(26)
  word.LineFormat line();


  /**
   * <p>
   * Getter method for the COM property "LockAspectRatio"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @DISPID(113) //= 0x71. The runtime will prefer the VTID if present
  @VTID(27)
  office.MsoTriState lockAspectRatio();


  /**
   * <p>
   * Setter method for the COM property "LockAspectRatio"
   * </p>
   * @param prop Mandatory office.MsoTriState parameter.
   */

  @DISPID(113) //= 0x71. The runtime will prefer the VTID if present
  @VTID(28)
  void lockAspectRatio(
    office.MsoTriState prop);


  /**
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(115) //= 0x73. The runtime will prefer the VTID if present
  @VTID(29)
  java.lang.String name();


  /**
   * <p>
   * Setter method for the COM property "Name"
   * </p>
   * @param prop Mandatory java.lang.String parameter.
   */

  @DISPID(115) //= 0x73. The runtime will prefer the VTID if present
  @VTID(30)
  void name(
    java.lang.String prop);


  /**
   * <p>
   * Getter method for the COM property "Nodes"
   * </p>
   * @return  Returns a value of type word.ShapeNodes
   */

  @DISPID(116) //= 0x74. The runtime will prefer the VTID if present
  @VTID(31)
  word.ShapeNodes nodes();


  @VTID(31)
  @ReturnValue(defaultPropertyThrough={word.ShapeNodes.class})
  word.ShapeNode nodes(
    java.lang.Object index);

  /**
   * <p>
   * Getter method for the COM property "Rotation"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(117) //= 0x75. The runtime will prefer the VTID if present
  @VTID(32)
  float rotation();


  /**
   * <p>
   * Setter method for the COM property "Rotation"
   * </p>
   * @param prop Mandatory float parameter.
   */

  @DISPID(117) //= 0x75. The runtime will prefer the VTID if present
  @VTID(33)
  void rotation(
    float prop);


  /**
   * <p>
   * Getter method for the COM property "PictureFormat"
   * </p>
   * @return  Returns a value of type word.PictureFormat
   */

  @DISPID(118) //= 0x76. The runtime will prefer the VTID if present
  @VTID(34)
  word.PictureFormat pictureFormat();


  /**
   * <p>
   * Getter method for the COM property "Shadow"
   * </p>
   * @return  Returns a value of type word.ShadowFormat
   */

  @DISPID(119) //= 0x77. The runtime will prefer the VTID if present
  @VTID(35)
  word.ShadowFormat shadow();


  /**
   * <p>
   * Getter method for the COM property "TextEffect"
   * </p>
   * @return  Returns a value of type word.TextEffectFormat
   */

  @DISPID(120) //= 0x78. The runtime will prefer the VTID if present
  @VTID(36)
  word.TextEffectFormat textEffect();


  /**
   * <p>
   * Getter method for the COM property "TextFrame"
   * </p>
   * @return  Returns a value of type word.TextFrame
   */

  @DISPID(121) //= 0x79. The runtime will prefer the VTID if present
  @VTID(37)
  word.TextFrame textFrame();


  /**
   * <p>
   * Getter method for the COM property "ThreeD"
   * </p>
   * @return  Returns a value of type word.ThreeDFormat
   */

  @DISPID(122) //= 0x7a. The runtime will prefer the VTID if present
  @VTID(38)
  word.ThreeDFormat threeD();


  /**
   * <p>
   * Getter method for the COM property "Top"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(123) //= 0x7b. The runtime will prefer the VTID if present
  @VTID(39)
  float top();


  /**
   * <p>
   * Setter method for the COM property "Top"
   * </p>
   * @param prop Mandatory float parameter.
   */

  @DISPID(123) //= 0x7b. The runtime will prefer the VTID if present
  @VTID(40)
  void top(
    float prop);


  /**
   * <p>
   * Getter method for the COM property "Type"
   * </p>
   * @return  Returns a value of type office.MsoShapeType
   */

  @DISPID(124) //= 0x7c. The runtime will prefer the VTID if present
  @VTID(41)
  office.MsoShapeType type();


  /**
   * <p>
   * Getter method for the COM property "VerticalFlip"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @DISPID(125) //= 0x7d. The runtime will prefer the VTID if present
  @VTID(42)
  office.MsoTriState verticalFlip();


  /**
   * <p>
   * Getter method for the COM property "Vertices"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(126) //= 0x7e. The runtime will prefer the VTID if present
  @VTID(43)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object vertices();


  /**
   * <p>
   * Getter method for the COM property "Visible"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @DISPID(127) //= 0x7f. The runtime will prefer the VTID if present
  @VTID(44)
  office.MsoTriState visible();


  /**
   * <p>
   * Setter method for the COM property "Visible"
   * </p>
   * @param prop Mandatory office.MsoTriState parameter.
   */

  @DISPID(127) //= 0x7f. The runtime will prefer the VTID if present
  @VTID(45)
  void visible(
    office.MsoTriState prop);


  /**
   * <p>
   * Getter method for the COM property "Width"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(128) //= 0x80. The runtime will prefer the VTID if present
  @VTID(46)
  float width();


  /**
   * <p>
   * Setter method for the COM property "Width"
   * </p>
   * @param prop Mandatory float parameter.
   */

  @DISPID(128) //= 0x80. The runtime will prefer the VTID if present
  @VTID(47)
  void width(
    float prop);


  /**
   * <p>
   * Getter method for the COM property "ZOrderPosition"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(129) //= 0x81. The runtime will prefer the VTID if present
  @VTID(48)
  int zOrderPosition();


  /**
   * <p>
   * Getter method for the COM property "Hyperlink"
   * </p>
   * @return  Returns a value of type word.Hyperlink
   */

  @DISPID(1001) //= 0x3e9. The runtime will prefer the VTID if present
  @VTID(49)
  word.Hyperlink hyperlink();


  /**
   * <p>
   * Getter method for the COM property "RelativeHorizontalPosition"
   * </p>
   * @return  Returns a value of type word.WdRelativeHorizontalPosition
   */

  @DISPID(300) //= 0x12c. The runtime will prefer the VTID if present
  @VTID(50)
  word.WdRelativeHorizontalPosition relativeHorizontalPosition();


  /**
   * <p>
   * Setter method for the COM property "RelativeHorizontalPosition"
   * </p>
   * @param prop Mandatory word.WdRelativeHorizontalPosition parameter.
   */

  @DISPID(300) //= 0x12c. The runtime will prefer the VTID if present
  @VTID(51)
  void relativeHorizontalPosition(
    word.WdRelativeHorizontalPosition prop);


  /**
   * <p>
   * Getter method for the COM property "RelativeVerticalPosition"
   * </p>
   * @return  Returns a value of type word.WdRelativeVerticalPosition
   */

  @DISPID(301) //= 0x12d. The runtime will prefer the VTID if present
  @VTID(52)
  word.WdRelativeVerticalPosition relativeVerticalPosition();


  /**
   * <p>
   * Setter method for the COM property "RelativeVerticalPosition"
   * </p>
   * @param prop Mandatory word.WdRelativeVerticalPosition parameter.
   */

  @DISPID(301) //= 0x12d. The runtime will prefer the VTID if present
  @VTID(53)
  void relativeVerticalPosition(
    word.WdRelativeVerticalPosition prop);


  /**
   * <p>
   * Getter method for the COM property "LockAnchor"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(302) //= 0x12e. The runtime will prefer the VTID if present
  @VTID(54)
  int lockAnchor();


  /**
   * <p>
   * Setter method for the COM property "LockAnchor"
   * </p>
   * @param prop Mandatory int parameter.
   */

  @DISPID(302) //= 0x12e. The runtime will prefer the VTID if present
  @VTID(55)
  void lockAnchor(
    int prop);


  /**
   * <p>
   * Getter method for the COM property "WrapFormat"
   * </p>
   * @return  Returns a value of type word.WrapFormat
   */

  @DISPID(303) //= 0x12f. The runtime will prefer the VTID if present
  @VTID(56)
  word.WrapFormat wrapFormat();


  /**
   * <p>
   * Getter method for the COM property "Anchor"
   * </p>
   * @return  Returns a value of type word.Range
   */

  @DISPID(304) //= 0x130. The runtime will prefer the VTID if present
  @VTID(57)
  word.Range anchor();


  /**
   * @param index Mandatory java.lang.Object parameter.
   * @return  Returns a value of type word.Shape
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(58)
  @DefaultMethod
  word.Shape item(
    java.lang.Object index);


  /**
   * @param align Mandatory office.MsoAlignCmd parameter.
   * @param relativeTo Mandatory int parameter.
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(59)
  void align(
    office.MsoAlignCmd align,
    int relativeTo);


  /**
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(60)
  void apply();


  /**
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(61)
  void delete();


  /**
   * @param distribute Mandatory office.MsoDistributeCmd parameter.
   * @param relativeTo Mandatory int parameter.
   */

  @DISPID(13) //= 0xd. The runtime will prefer the VTID if present
  @VTID(62)
  void distribute(
    office.MsoDistributeCmd distribute,
    int relativeTo);


  /**
   * @return  Returns a value of type word.ShapeRange
   */

  @DISPID(14) //= 0xe. The runtime will prefer the VTID if present
  @VTID(63)
  word.ShapeRange duplicate();


  @VTID(63)
  @ReturnValue(defaultPropertyThrough={word.ShapeRange.class})
  word.Shape duplicate(
    java.lang.Object index);

  /**
   * @param flipCmd Mandatory office.MsoFlipCmd parameter.
   */

  @DISPID(15) //= 0xf. The runtime will prefer the VTID if present
  @VTID(64)
  void flip(
    office.MsoFlipCmd flipCmd);


  /**
   * @param increment Mandatory float parameter.
   */

  @DISPID(16) //= 0x10. The runtime will prefer the VTID if present
  @VTID(65)
  void incrementLeft(
    float increment);


  /**
   * @param increment Mandatory float parameter.
   */

  @DISPID(17) //= 0x11. The runtime will prefer the VTID if present
  @VTID(66)
  void incrementRotation(
    float increment);


  /**
   * @param increment Mandatory float parameter.
   */

  @DISPID(18) //= 0x12. The runtime will prefer the VTID if present
  @VTID(67)
  void incrementTop(
    float increment);


  /**
   * @return  Returns a value of type word.Shape
   */

  @DISPID(19) //= 0x13. The runtime will prefer the VTID if present
  @VTID(68)
  word.Shape group();


  /**
   */

  @DISPID(20) //= 0x14. The runtime will prefer the VTID if present
  @VTID(69)
  void pickUp();


  /**
   * @return  Returns a value of type word.Shape
   */

  @DISPID(21) //= 0x15. The runtime will prefer the VTID if present
  @VTID(70)
  word.Shape regroup();


  /**
   */

  @DISPID(22) //= 0x16. The runtime will prefer the VTID if present
  @VTID(71)
  void rerouteConnections();


  /**
   * @param factor Mandatory float parameter.
   * @param relativeToOriginalSize Mandatory office.MsoTriState parameter.
   * @param scale Optional parameter. Default value is 0
   */

  @DISPID(23) //= 0x17. The runtime will prefer the VTID if present
  @VTID(72)
  void scaleHeight(
    float factor,
    office.MsoTriState relativeToOriginalSize,
    @Optional @DefaultValue("0") office.MsoScaleFrom scale);


  /**
   * @param factor Mandatory float parameter.
   * @param relativeToOriginalSize Mandatory office.MsoTriState parameter.
   * @param scale Optional parameter. Default value is 0
   */

  @DISPID(24) //= 0x18. The runtime will prefer the VTID if present
  @VTID(73)
  void scaleWidth(
    float factor,
    office.MsoTriState relativeToOriginalSize,
    @Optional @DefaultValue("0") office.MsoScaleFrom scale);


  /**
   * @param replace Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(25) //= 0x19. The runtime will prefer the VTID if present
  @VTID(74)
  void select(
    @Optional java.lang.Object replace);


  /**
   */

  @DISPID(26) //= 0x1a. The runtime will prefer the VTID if present
  @VTID(75)
  void setShapesDefaultProperties();


  /**
   * @return  Returns a value of type word.ShapeRange
   */

  @DISPID(27) //= 0x1b. The runtime will prefer the VTID if present
  @VTID(76)
  word.ShapeRange ungroup();


  @VTID(76)
  @ReturnValue(defaultPropertyThrough={word.ShapeRange.class})
  word.Shape ungroup(
    java.lang.Object index);

  /**
   * @param zOrderCmd Mandatory office.MsoZOrderCmd parameter.
   */

  @DISPID(28) //= 0x1c. The runtime will prefer the VTID if present
  @VTID(77)
  void zOrder(
    office.MsoZOrderCmd zOrderCmd);


  /**
   * @return  Returns a value of type word.Frame
   */

  @DISPID(29) //= 0x1d. The runtime will prefer the VTID if present
  @VTID(78)
  word.Frame convertToFrame();


  /**
   * @return  Returns a value of type word.InlineShape
   */

  @DISPID(30) //= 0x1e. The runtime will prefer the VTID if present
  @VTID(79)
  word.InlineShape convertToInlineShape();


  /**
   */

  @DISPID(50) //= 0x32. The runtime will prefer the VTID if present
  @VTID(80)
  void activate();


  /**
   * <p>
   * Getter method for the COM property "AlternativeText"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(131) //= 0x83. The runtime will prefer the VTID if present
  @VTID(81)
  java.lang.String alternativeText();


  /**
   * <p>
   * Setter method for the COM property "AlternativeText"
   * </p>
   * @param prop Mandatory java.lang.String parameter.
   */

  @DISPID(131) //= 0x83. The runtime will prefer the VTID if present
  @VTID(82)
  void alternativeText(
    java.lang.String prop);


  /**
   * <p>
   * Getter method for the COM property "HasDiagram"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @DISPID(132) //= 0x84. The runtime will prefer the VTID if present
  @VTID(83)
  office.MsoTriState hasDiagram();


  /**
   * <p>
   * Getter method for the COM property "Diagram"
   * </p>
   * @return  Returns a value of type office.IMsoDiagram
   */

  @DISPID(133) //= 0x85. The runtime will prefer the VTID if present
  @VTID(84)
  office.IMsoDiagram diagram();


  /**
   * <p>
   * Getter method for the COM property "HasDiagramNode"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @DISPID(134) //= 0x86. The runtime will prefer the VTID if present
  @VTID(85)
  office.MsoTriState hasDiagramNode();


  /**
   * <p>
   * Getter method for the COM property "DiagramNode"
   * </p>
   * @return  Returns a value of type word.DiagramNode
   */

  @DISPID(135) //= 0x87. The runtime will prefer the VTID if present
  @VTID(86)
  word.DiagramNode diagramNode();


  /**
   * <p>
   * Getter method for the COM property "Child"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @DISPID(136) //= 0x88. The runtime will prefer the VTID if present
  @VTID(87)
  office.MsoTriState child();


  /**
   * <p>
   * Getter method for the COM property "ParentGroup"
   * </p>
   * @return  Returns a value of type word.Shape
   */

  @DISPID(137) //= 0x89. The runtime will prefer the VTID if present
  @VTID(88)
  word.Shape parentGroup();


  /**
   * <p>
   * Getter method for the COM property "CanvasItems"
   * </p>
   * @return  Returns a value of type word.CanvasShapes
   */

  @DISPID(138) //= 0x8a. The runtime will prefer the VTID if present
  @VTID(89)
  word.CanvasShapes canvasItems();


  @VTID(89)
  @ReturnValue(defaultPropertyThrough={word.CanvasShapes.class})
  word.Shape canvasItems(
    java.lang.Object index);

  /**
   * <p>
   * Getter method for the COM property "ID"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(139) //= 0x8b. The runtime will prefer the VTID if present
  @VTID(90)
  int id();


  /**
   * @param increment Mandatory float parameter.
   */

  @DISPID(140) //= 0x8c. The runtime will prefer the VTID if present
  @VTID(91)
  void canvasCropLeft(
    float increment);


  /**
   * @param increment Mandatory float parameter.
   */

  @DISPID(141) //= 0x8d. The runtime will prefer the VTID if present
  @VTID(92)
  void canvasCropTop(
    float increment);


  /**
   * @param increment Mandatory float parameter.
   */

  @DISPID(142) //= 0x8e. The runtime will prefer the VTID if present
  @VTID(93)
  void canvasCropRight(
    float increment);


  /**
   * @param increment Mandatory float parameter.
   */

  @DISPID(143) //= 0x8f. The runtime will prefer the VTID if present
  @VTID(94)
  void canvasCropBottom(
    float increment);


  /**
   * <p>
   * Setter method for the COM property "RTF"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(144) //= 0x90. The runtime will prefer the VTID if present
  @VTID(95)
  void rtf(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "LayoutInCell"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(145) //= 0x91. The runtime will prefer the VTID if present
  @VTID(96)
  int layoutInCell();


  /**
   * <p>
   * Setter method for the COM property "LayoutInCell"
   * </p>
   * @param prop Mandatory int parameter.
   */

  @DISPID(145) //= 0x91. The runtime will prefer the VTID if present
  @VTID(97)
  void layoutInCell(
    int prop);


  /**
   * <p>
   * Getter method for the COM property "LeftRelative"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(200) //= 0xc8. The runtime will prefer the VTID if present
  @VTID(98)
  float leftRelative();


  /**
   * <p>
   * Setter method for the COM property "LeftRelative"
   * </p>
   * @param prop Mandatory float parameter.
   */

  @DISPID(200) //= 0xc8. The runtime will prefer the VTID if present
  @VTID(99)
  void leftRelative(
    float prop);


  /**
   * <p>
   * Getter method for the COM property "TopRelative"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(201) //= 0xc9. The runtime will prefer the VTID if present
  @VTID(100)
  float topRelative();


  /**
   * <p>
   * Setter method for the COM property "TopRelative"
   * </p>
   * @param prop Mandatory float parameter.
   */

  @DISPID(201) //= 0xc9. The runtime will prefer the VTID if present
  @VTID(101)
  void topRelative(
    float prop);


  /**
   * <p>
   * Getter method for the COM property "WidthRelative"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(202) //= 0xca. The runtime will prefer the VTID if present
  @VTID(102)
  float widthRelative();


  /**
   * <p>
   * Setter method for the COM property "WidthRelative"
   * </p>
   * @param prop Mandatory float parameter.
   */

  @DISPID(202) //= 0xca. The runtime will prefer the VTID if present
  @VTID(103)
  void widthRelative(
    float prop);


  /**
   * <p>
   * Getter method for the COM property "HeightRelative"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(203) //= 0xcb. The runtime will prefer the VTID if present
  @VTID(104)
  float heightRelative();


  /**
   * <p>
   * Setter method for the COM property "HeightRelative"
   * </p>
   * @param prop Mandatory float parameter.
   */

  @DISPID(203) //= 0xcb. The runtime will prefer the VTID if present
  @VTID(105)
  void heightRelative(
    float prop);


  /**
   * <p>
   * Getter method for the COM property "RelativeHorizontalSize"
   * </p>
   * @return  Returns a value of type word.WdRelativeHorizontalSize
   */

  @DISPID(204) //= 0xcc. The runtime will prefer the VTID if present
  @VTID(106)
  word.WdRelativeHorizontalSize relativeHorizontalSize();


  /**
   * <p>
   * Setter method for the COM property "RelativeHorizontalSize"
   * </p>
   * @param prop Mandatory word.WdRelativeHorizontalSize parameter.
   */

  @DISPID(204) //= 0xcc. The runtime will prefer the VTID if present
  @VTID(107)
  void relativeHorizontalSize(
    word.WdRelativeHorizontalSize prop);


  /**
   * <p>
   * Getter method for the COM property "RelativeVerticalSize"
   * </p>
   * @return  Returns a value of type word.WdRelativeVerticalSize
   */

  @DISPID(205) //= 0xcd. The runtime will prefer the VTID if present
  @VTID(108)
  word.WdRelativeVerticalSize relativeVerticalSize();


  /**
   * <p>
   * Setter method for the COM property "RelativeVerticalSize"
   * </p>
   * @param prop Mandatory word.WdRelativeVerticalSize parameter.
   */

  @DISPID(205) //= 0xcd. The runtime will prefer the VTID if present
  @VTID(109)
  void relativeVerticalSize(
    word.WdRelativeVerticalSize prop);


  /**
   * <p>
   * Getter method for the COM property "SoftEdge"
   * </p>
   * @return  Returns a value of type word.SoftEdgeFormat
   */

  @DISPID(152) //= 0x98. The runtime will prefer the VTID if present
  @VTID(110)
  word.SoftEdgeFormat softEdge();


  /**
   * <p>
   * Getter method for the COM property "Glow"
   * </p>
   * @return  Returns a value of type word.GlowFormat
   */

  @DISPID(153) //= 0x99. The runtime will prefer the VTID if present
  @VTID(111)
  word.GlowFormat glow();


  /**
   * <p>
   * Getter method for the COM property "Reflection"
   * </p>
   * @return  Returns a value of type word.ReflectionFormat
   */

  @DISPID(154) //= 0x9a. The runtime will prefer the VTID if present
  @VTID(112)
  word.ReflectionFormat reflection();


  /**
   * <p>
   * Getter method for the COM property "TextFrame2"
   * </p>
   * @return  Returns a value of type office.TextFrame2
   */

  @DISPID(155) //= 0x9b. The runtime will prefer the VTID if present
  @VTID(113)
  office.TextFrame2 textFrame2();


  /**
   * <p>
   * Getter method for the COM property "ShapeStyle"
   * </p>
   * @return  Returns a value of type office.MsoShapeStyleIndex
   */

  @DISPID(150) //= 0x96. The runtime will prefer the VTID if present
  @VTID(114)
  office.MsoShapeStyleIndex shapeStyle();


  /**
   * <p>
   * Setter method for the COM property "ShapeStyle"
   * </p>
   * @param prop Mandatory office.MsoShapeStyleIndex parameter.
   */

  @DISPID(150) //= 0x96. The runtime will prefer the VTID if present
  @VTID(115)
  void shapeStyle(
    office.MsoShapeStyleIndex prop);


  /**
   * <p>
   * Getter method for the COM property "BackgroundStyle"
   * </p>
   * @return  Returns a value of type office.MsoBackgroundStyleIndex
   */

  @DISPID(151) //= 0x97. The runtime will prefer the VTID if present
  @VTID(116)
  office.MsoBackgroundStyleIndex backgroundStyle();


  /**
   * <p>
   * Setter method for the COM property "BackgroundStyle"
   * </p>
   * @param prop Mandatory office.MsoBackgroundStyleIndex parameter.
   */

  @DISPID(151) //= 0x97. The runtime will prefer the VTID if present
  @VTID(117)
  void backgroundStyle(
    office.MsoBackgroundStyleIndex prop);


  /**
   * <p>
   * Getter method for the COM property "Title"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(206) //= 0xce. The runtime will prefer the VTID if present
  @VTID(118)
  java.lang.String title();


  /**
   * <p>
   * Setter method for the COM property "Title"
   * </p>
   * @param prop Mandatory java.lang.String parameter.
   */

  @DISPID(206) //= 0xce. The runtime will prefer the VTID if present
  @VTID(119)
  void title(
    java.lang.String prop);


  // Properties:
}
