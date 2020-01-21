package ppt  ;

import com4j.*;

@IID("{91493479-5A91-11CF-8700-00AA0060263B}")
public interface Shape extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(2001) //= 0x7d1. The runtime will prefer the VTID if present
  @VTID(7)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject application();


  /**
   * <p>
   * Getter method for the COM property "Creator"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(2002) //= 0x7d2. The runtime will prefer the VTID if present
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
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(10)
  void apply();


  /**
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(11)
  void delete();


  /**
   * @param flipCmd Mandatory office.MsoFlipCmd parameter.
   */

  @DISPID(13) //= 0xd. The runtime will prefer the VTID if present
  @VTID(12)
  void flip(
    office.MsoFlipCmd flipCmd);


  /**
   * @param increment Mandatory float parameter.
   */

  @DISPID(14) //= 0xe. The runtime will prefer the VTID if present
  @VTID(13)
  void incrementLeft(
    float increment);


  /**
   * @param increment Mandatory float parameter.
   */

  @DISPID(15) //= 0xf. The runtime will prefer the VTID if present
  @VTID(14)
  void incrementRotation(
    float increment);


  /**
   * @param increment Mandatory float parameter.
   */

  @DISPID(16) //= 0x10. The runtime will prefer the VTID if present
  @VTID(15)
  void incrementTop(
    float increment);


  /**
   */

  @DISPID(17) //= 0x11. The runtime will prefer the VTID if present
  @VTID(16)
  void pickUp();


  /**
   */

  @DISPID(18) //= 0x12. The runtime will prefer the VTID if present
  @VTID(17)
  void rerouteConnections();


  /**
   * @param factor Mandatory float parameter.
   * @param relativeToOriginalSize Mandatory office.MsoTriState parameter.
   * @param fScale Optional parameter. Default value is 0
   */

  @DISPID(19) //= 0x13. The runtime will prefer the VTID if present
  @VTID(18)
  void scaleHeight(
    float factor,
    office.MsoTriState relativeToOriginalSize,
    @Optional @DefaultValue("0") office.MsoScaleFrom fScale);


  /**
   * @param factor Mandatory float parameter.
   * @param relativeToOriginalSize Mandatory office.MsoTriState parameter.
   * @param fScale Optional parameter. Default value is 0
   */

  @DISPID(20) //= 0x14. The runtime will prefer the VTID if present
  @VTID(19)
  void scaleWidth(
    float factor,
    office.MsoTriState relativeToOriginalSize,
    @Optional @DefaultValue("0") office.MsoScaleFrom fScale);


  /**
   */

  @DISPID(22) //= 0x16. The runtime will prefer the VTID if present
  @VTID(20)
  void setShapesDefaultProperties();


  /**
   * @return  Returns a value of type ppt.ShapeRange
   */

  @DISPID(23) //= 0x17. The runtime will prefer the VTID if present
  @VTID(21)
  ppt.ShapeRange ungroup();


  @VTID(21)
  @ReturnValue(defaultPropertyThrough={ppt.ShapeRange.class})
  ppt.Shape ungroup(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);

  /**
   * @param zOrderCmd Mandatory office.MsoZOrderCmd parameter.
   */

  @DISPID(24) //= 0x18. The runtime will prefer the VTID if present
  @VTID(22)
  void zOrder(
    office.MsoZOrderCmd zOrderCmd);


  /**
   * <p>
   * Getter method for the COM property "Adjustments"
   * </p>
   * @return  Returns a value of type ppt.Adjustments
   */

  @DISPID(100) //= 0x64. The runtime will prefer the VTID if present
  @VTID(23)
  ppt.Adjustments adjustments();


  @VTID(23)
  @ReturnValue(defaultPropertyThrough={ppt.Adjustments.class})
  float adjustments(
    int index);

  /**
   * <p>
   * Getter method for the COM property "AutoShapeType"
   * </p>
   * @return  Returns a value of type office.MsoAutoShapeType
   */

  @DISPID(101) //= 0x65. The runtime will prefer the VTID if present
  @VTID(24)
  office.MsoAutoShapeType autoShapeType();


  /**
   * <p>
   * Setter method for the COM property "AutoShapeType"
   * </p>
   * @param autoShapeType Mandatory office.MsoAutoShapeType parameter.
   */

  @DISPID(101) //= 0x65. The runtime will prefer the VTID if present
  @VTID(25)
  void autoShapeType(
    office.MsoAutoShapeType autoShapeType);


  /**
   * <p>
   * Getter method for the COM property "BlackWhiteMode"
   * </p>
   * @return  Returns a value of type office.MsoBlackWhiteMode
   */

  @DISPID(102) //= 0x66. The runtime will prefer the VTID if present
  @VTID(26)
  office.MsoBlackWhiteMode blackWhiteMode();


  /**
   * <p>
   * Setter method for the COM property "BlackWhiteMode"
   * </p>
   * @param blackWhiteMode Mandatory office.MsoBlackWhiteMode parameter.
   */

  @DISPID(102) //= 0x66. The runtime will prefer the VTID if present
  @VTID(27)
  void blackWhiteMode(
    office.MsoBlackWhiteMode blackWhiteMode);


  /**
   * <p>
   * Getter method for the COM property "Callout"
   * </p>
   * @return  Returns a value of type ppt.CalloutFormat
   */

  @DISPID(103) //= 0x67. The runtime will prefer the VTID if present
  @VTID(28)
  ppt.CalloutFormat callout();


  /**
   * <p>
   * Getter method for the COM property "ConnectionSiteCount"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(104) //= 0x68. The runtime will prefer the VTID if present
  @VTID(29)
  int connectionSiteCount();


  /**
   * <p>
   * Getter method for the COM property "Connector"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @DISPID(105) //= 0x69. The runtime will prefer the VTID if present
  @VTID(30)
  office.MsoTriState connector();


  /**
   * <p>
   * Getter method for the COM property "ConnectorFormat"
   * </p>
   * @return  Returns a value of type ppt.ConnectorFormat
   */

  @DISPID(106) //= 0x6a. The runtime will prefer the VTID if present
  @VTID(31)
  ppt.ConnectorFormat connectorFormat();


  /**
   * <p>
   * Getter method for the COM property "Fill"
   * </p>
   * @return  Returns a value of type ppt.FillFormat
   */

  @DISPID(107) //= 0x6b. The runtime will prefer the VTID if present
  @VTID(32)
  ppt.FillFormat fill();


  /**
   * <p>
   * Getter method for the COM property "GroupItems"
   * </p>
   * @return  Returns a value of type ppt.GroupShapes
   */

  @DISPID(108) //= 0x6c. The runtime will prefer the VTID if present
  @VTID(33)
  ppt.GroupShapes groupItems();


  @VTID(33)
  @ReturnValue(defaultPropertyThrough={ppt.GroupShapes.class})
  ppt.Shape groupItems(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);

  /**
   * <p>
   * Getter method for the COM property "Height"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(109) //= 0x6d. The runtime will prefer the VTID if present
  @VTID(34)
  float height();


  /**
   * <p>
   * Setter method for the COM property "Height"
   * </p>
   * @param height Mandatory float parameter.
   */

  @DISPID(109) //= 0x6d. The runtime will prefer the VTID if present
  @VTID(35)
  void height(
    float height);


  /**
   * <p>
   * Getter method for the COM property "HorizontalFlip"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @DISPID(110) //= 0x6e. The runtime will prefer the VTID if present
  @VTID(36)
  office.MsoTriState horizontalFlip();


  /**
   * <p>
   * Getter method for the COM property "Left"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(111) //= 0x6f. The runtime will prefer the VTID if present
  @VTID(37)
  float left();


  /**
   * <p>
   * Setter method for the COM property "Left"
   * </p>
   * @param left Mandatory float parameter.
   */

  @DISPID(111) //= 0x6f. The runtime will prefer the VTID if present
  @VTID(38)
  void left(
    float left);


  /**
   * <p>
   * Getter method for the COM property "Line"
   * </p>
   * @return  Returns a value of type ppt.LineFormat
   */

  @DISPID(112) //= 0x70. The runtime will prefer the VTID if present
  @VTID(39)
  ppt.LineFormat line();


  /**
   * <p>
   * Getter method for the COM property "LockAspectRatio"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @DISPID(113) //= 0x71. The runtime will prefer the VTID if present
  @VTID(40)
  office.MsoTriState lockAspectRatio();


  /**
   * <p>
   * Setter method for the COM property "LockAspectRatio"
   * </p>
   * @param lockAspectRatio Mandatory office.MsoTriState parameter.
   */

  @DISPID(113) //= 0x71. The runtime will prefer the VTID if present
  @VTID(41)
  void lockAspectRatio(
    office.MsoTriState lockAspectRatio);


  /**
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(115) //= 0x73. The runtime will prefer the VTID if present
  @VTID(42)
  java.lang.String name();


  /**
   * <p>
   * Setter method for the COM property "Name"
   * </p>
   * @param name Mandatory java.lang.String parameter.
   */

  @DISPID(115) //= 0x73. The runtime will prefer the VTID if present
  @VTID(43)
  void name(
    java.lang.String name);


  /**
   * <p>
   * Getter method for the COM property "Nodes"
   * </p>
   * @return  Returns a value of type ppt.ShapeNodes
   */

  @DISPID(116) //= 0x74. The runtime will prefer the VTID if present
  @VTID(44)
  ppt.ShapeNodes nodes();


  @VTID(44)
  @ReturnValue(defaultPropertyThrough={ppt.ShapeNodes.class})
  ppt.ShapeNode nodes(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);

  /**
   * <p>
   * Getter method for the COM property "Rotation"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(117) //= 0x75. The runtime will prefer the VTID if present
  @VTID(45)
  float rotation();


  /**
   * <p>
   * Setter method for the COM property "Rotation"
   * </p>
   * @param rotation Mandatory float parameter.
   */

  @DISPID(117) //= 0x75. The runtime will prefer the VTID if present
  @VTID(46)
  void rotation(
    float rotation);


  /**
   * <p>
   * Getter method for the COM property "PictureFormat"
   * </p>
   * @return  Returns a value of type ppt.PictureFormat
   */

  @DISPID(118) //= 0x76. The runtime will prefer the VTID if present
  @VTID(47)
  ppt.PictureFormat pictureFormat();


  /**
   * <p>
   * Getter method for the COM property "Shadow"
   * </p>
   * @return  Returns a value of type ppt.ShadowFormat
   */

  @DISPID(119) //= 0x77. The runtime will prefer the VTID if present
  @VTID(48)
  ppt.ShadowFormat shadow();


  /**
   * <p>
   * Getter method for the COM property "TextEffect"
   * </p>
   * @return  Returns a value of type ppt.TextEffectFormat
   */

  @DISPID(120) //= 0x78. The runtime will prefer the VTID if present
  @VTID(49)
  ppt.TextEffectFormat textEffect();


  /**
   * <p>
   * Getter method for the COM property "TextFrame"
   * </p>
   * @return  Returns a value of type ppt.TextFrame
   */

  @DISPID(121) //= 0x79. The runtime will prefer the VTID if present
  @VTID(50)
  ppt.TextFrame textFrame();


  /**
   * <p>
   * Getter method for the COM property "ThreeD"
   * </p>
   * @return  Returns a value of type ppt.ThreeDFormat
   */

  @DISPID(122) //= 0x7a. The runtime will prefer the VTID if present
  @VTID(51)
  ppt.ThreeDFormat threeD();


  /**
   * <p>
   * Getter method for the COM property "Top"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(123) //= 0x7b. The runtime will prefer the VTID if present
  @VTID(52)
  float top();


  /**
   * <p>
   * Setter method for the COM property "Top"
   * </p>
   * @param top Mandatory float parameter.
   */

  @DISPID(123) //= 0x7b. The runtime will prefer the VTID if present
  @VTID(53)
  void top(
    float top);


  /**
   * <p>
   * Getter method for the COM property "Type"
   * </p>
   * @return  Returns a value of type office.MsoShapeType
   */

  @DISPID(124) //= 0x7c. The runtime will prefer the VTID if present
  @VTID(54)
  office.MsoShapeType type();


  /**
   * <p>
   * Getter method for the COM property "VerticalFlip"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @DISPID(125) //= 0x7d. The runtime will prefer the VTID if present
  @VTID(55)
  office.MsoTriState verticalFlip();


  /**
   * <p>
   * Getter method for the COM property "Vertices"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(126) //= 0x7e. The runtime will prefer the VTID if present
  @VTID(56)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object vertices();


  /**
   * <p>
   * Getter method for the COM property "Visible"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @DISPID(127) //= 0x7f. The runtime will prefer the VTID if present
  @VTID(57)
  office.MsoTriState visible();


  /**
   * <p>
   * Setter method for the COM property "Visible"
   * </p>
   * @param visible Mandatory office.MsoTriState parameter.
   */

  @DISPID(127) //= 0x7f. The runtime will prefer the VTID if present
  @VTID(58)
  void visible(
    office.MsoTriState visible);


  /**
   * <p>
   * Getter method for the COM property "Width"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(128) //= 0x80. The runtime will prefer the VTID if present
  @VTID(59)
  float width();


  /**
   * <p>
   * Setter method for the COM property "Width"
   * </p>
   * @param width Mandatory float parameter.
   */

  @DISPID(128) //= 0x80. The runtime will prefer the VTID if present
  @VTID(60)
  void width(
    float width);


  /**
   * <p>
   * Getter method for the COM property "ZOrderPosition"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(129) //= 0x81. The runtime will prefer the VTID if present
  @VTID(61)
  int zOrderPosition();


  /**
   * <p>
   * Getter method for the COM property "OLEFormat"
   * </p>
   * @return  Returns a value of type ppt.OLEFormat
   */

  @DISPID(2003) //= 0x7d3. The runtime will prefer the VTID if present
  @VTID(62)
  ppt.OLEFormat oleFormat();


  /**
   * <p>
   * Getter method for the COM property "LinkFormat"
   * </p>
   * @return  Returns a value of type ppt.LinkFormat
   */

  @DISPID(2004) //= 0x7d4. The runtime will prefer the VTID if present
  @VTID(63)
  ppt.LinkFormat linkFormat();


  /**
   * <p>
   * Getter method for the COM property "PlaceholderFormat"
   * </p>
   * @return  Returns a value of type ppt.PlaceholderFormat
   */

  @DISPID(2005) //= 0x7d5. The runtime will prefer the VTID if present
  @VTID(64)
  ppt.PlaceholderFormat placeholderFormat();


  /**
   * <p>
   * Getter method for the COM property "AnimationSettings"
   * </p>
   * @return  Returns a value of type ppt.AnimationSettings
   */

  @DISPID(2006) //= 0x7d6. The runtime will prefer the VTID if present
  @VTID(65)
  ppt.AnimationSettings animationSettings();


  /**
   * <p>
   * Getter method for the COM property "ActionSettings"
   * </p>
   * @return  Returns a value of type ppt.ActionSettings
   */

  @DISPID(2007) //= 0x7d7. The runtime will prefer the VTID if present
  @VTID(66)
  ppt.ActionSettings actionSettings();


  @VTID(66)
  @ReturnValue(defaultPropertyThrough={ppt.ActionSettings.class})
  ppt.ActionSetting actionSettings(
    ppt.PpMouseActivation index);

  /**
   * <p>
   * Getter method for the COM property "Tags"
   * </p>
   * @return  Returns a value of type ppt.Tags
   */

  @DISPID(2008) //= 0x7d8. The runtime will prefer the VTID if present
  @VTID(67)
  ppt.Tags tags();


  @VTID(67)
  @ReturnValue(defaultPropertyThrough={ppt.Tags.class})
  java.lang.String tags(
    java.lang.String name);

  /**
   */

  @DISPID(2009) //= 0x7d9. The runtime will prefer the VTID if present
  @VTID(68)
  void cut();


  /**
   */

  @DISPID(2010) //= 0x7da. The runtime will prefer the VTID if present
  @VTID(69)
  void copy();


  /**
   * @param replace Optional parameter. Default value is -1
   */

  @DISPID(2011) //= 0x7db. The runtime will prefer the VTID if present
  @VTID(70)
  void select(
    @Optional @DefaultValue("-1") office.MsoTriState replace);


  /**
   * @return  Returns a value of type ppt.ShapeRange
   */

  @DISPID(2012) //= 0x7dc. The runtime will prefer the VTID if present
  @VTID(71)
  ppt.ShapeRange duplicate();


  @VTID(71)
  @ReturnValue(defaultPropertyThrough={ppt.ShapeRange.class})
  ppt.Shape duplicate(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);

  /**
   * <p>
   * Getter method for the COM property "MediaType"
   * </p>
   * @return  Returns a value of type ppt.PpMediaType
   */

  @DISPID(2013) //= 0x7dd. The runtime will prefer the VTID if present
  @VTID(72)
  ppt.PpMediaType mediaType();


  /**
   * <p>
   * Getter method for the COM property "HasTextFrame"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @DISPID(2014) //= 0x7de. The runtime will prefer the VTID if present
  @VTID(73)
  office.MsoTriState hasTextFrame();


  /**
   * <p>
   * Getter method for the COM property "SoundFormat"
   * </p>
   * @return  Returns a value of type ppt.SoundFormat
   */

  @DISPID(2015) //= 0x7df. The runtime will prefer the VTID if present
  @VTID(74)
  ppt.SoundFormat soundFormat();


  /**
   * <p>
   * Getter method for the COM property "Script"
   * </p>
   * @return  Returns a value of type office.Script
   */

  @DISPID(130) //= 0x82. The runtime will prefer the VTID if present
  @VTID(75)
  office.Script script();


  /**
   * <p>
   * Getter method for the COM property "AlternativeText"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(131) //= 0x83. The runtime will prefer the VTID if present
  @VTID(76)
  java.lang.String alternativeText();


  /**
   * <p>
   * Setter method for the COM property "AlternativeText"
   * </p>
   * @param alternativeText Mandatory java.lang.String parameter.
   */

  @DISPID(131) //= 0x83. The runtime will prefer the VTID if present
  @VTID(77)
  void alternativeText(
    java.lang.String alternativeText);


  /**
   * <p>
   * Getter method for the COM property "HasTable"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @DISPID(2016) //= 0x7e0. The runtime will prefer the VTID if present
  @VTID(78)
  office.MsoTriState hasTable();


  /**
   * <p>
   * Getter method for the COM property "Table"
   * </p>
   * @return  Returns a value of type ppt.Table
   */

  @DISPID(2017) //= 0x7e1. The runtime will prefer the VTID if present
  @VTID(79)
  ppt.Table table();


  /**
   * @param pathName Mandatory java.lang.String parameter.
   * @param filter Mandatory ppt.PpShapeFormat parameter.
   * @param scaleWidth Optional parameter. Default value is 0
   * @param scaleHeight Optional parameter. Default value is 0
   * @param exportMode Optional parameter. Default value is 1
   */

  @DISPID(2018) //= 0x7e2. The runtime will prefer the VTID if present
  @VTID(80)
  void export(
    java.lang.String pathName,
    ppt.PpShapeFormat filter,
    @Optional @DefaultValue("0") int scaleWidth,
    @Optional @DefaultValue("0") int scaleHeight,
    @Optional @DefaultValue("1") ppt.PpExportMode exportMode);


  /**
   * <p>
   * Getter method for the COM property "HasDiagram"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @DISPID(132) //= 0x84. The runtime will prefer the VTID if present
  @VTID(81)
  office.MsoTriState hasDiagram();


  /**
   * <p>
   * Getter method for the COM property "Diagram"
   * </p>
   * @return  Returns a value of type ppt.Diagram
   */

  @DISPID(133) //= 0x85. The runtime will prefer the VTID if present
  @VTID(82)
  ppt.Diagram diagram();


  /**
   * <p>
   * Getter method for the COM property "HasDiagramNode"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @DISPID(134) //= 0x86. The runtime will prefer the VTID if present
  @VTID(83)
  office.MsoTriState hasDiagramNode();


  /**
   * <p>
   * Getter method for the COM property "DiagramNode"
   * </p>
   * @return  Returns a value of type ppt.DiagramNode
   */

  @DISPID(135) //= 0x87. The runtime will prefer the VTID if present
  @VTID(84)
  ppt.DiagramNode diagramNode();


  /**
   * <p>
   * Getter method for the COM property "Child"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @DISPID(136) //= 0x88. The runtime will prefer the VTID if present
  @VTID(85)
  office.MsoTriState child();


  /**
   * <p>
   * Getter method for the COM property "ParentGroup"
   * </p>
   * @return  Returns a value of type ppt.Shape
   */

  @DISPID(137) //= 0x89. The runtime will prefer the VTID if present
  @VTID(86)
  ppt.Shape parentGroup();


  /**
   * <p>
   * Getter method for the COM property "CanvasItems"
   * </p>
   * @return  Returns a value of type ppt.CanvasShapes
   */

  @DISPID(138) //= 0x8a. The runtime will prefer the VTID if present
  @VTID(87)
  ppt.CanvasShapes canvasItems();


  @VTID(87)
  @ReturnValue(defaultPropertyThrough={ppt.CanvasShapes.class})
  ppt.Shape canvasItems(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);

  /**
   * <p>
   * Getter method for the COM property "Id"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(139) //= 0x8b. The runtime will prefer the VTID if present
  @VTID(88)
  int id();


  /**
   * @param increment Mandatory float parameter.
   */

  @DISPID(140) //= 0x8c. The runtime will prefer the VTID if present
  @VTID(89)
  void canvasCropLeft(
    float increment);


  /**
   * @param increment Mandatory float parameter.
   */

  @DISPID(141) //= 0x8d. The runtime will prefer the VTID if present
  @VTID(90)
  void canvasCropTop(
    float increment);


  /**
   * @param increment Mandatory float parameter.
   */

  @DISPID(142) //= 0x8e. The runtime will prefer the VTID if present
  @VTID(91)
  void canvasCropRight(
    float increment);


  /**
   * @param increment Mandatory float parameter.
   */

  @DISPID(143) //= 0x8f. The runtime will prefer the VTID if present
  @VTID(92)
  void canvasCropBottom(
    float increment);


  /**
   * <p>
   * Setter method for the COM property "RTF"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(144) //= 0x90. The runtime will prefer the VTID if present
  @VTID(93)
  void rtf(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "CustomerData"
   * </p>
   * @return  Returns a value of type ppt.CustomerData
   */

  @DISPID(2020) //= 0x7e4. The runtime will prefer the VTID if present
  @VTID(94)
  ppt.CustomerData customerData();


  @VTID(94)
  @ReturnValue(defaultPropertyThrough={ppt.CustomerData.class})
  office._CustomXMLPart customerData(
    java.lang.String id);

  /**
   * <p>
   * Getter method for the COM property "TextFrame2"
   * </p>
   * @return  Returns a value of type ppt.TextFrame2
   */

  @DISPID(145) //= 0x91. The runtime will prefer the VTID if present
  @VTID(95)
  ppt.TextFrame2 textFrame2();


  /**
   * <p>
   * Getter method for the COM property "HasChart"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @DISPID(148) //= 0x94. The runtime will prefer the VTID if present
  @VTID(96)
  office.MsoTriState hasChart();


  /**
   * <p>
   * Getter method for the COM property "ShapeStyle"
   * </p>
   * @return  Returns a value of type office.MsoShapeStyleIndex
   */

  @DISPID(150) //= 0x96. The runtime will prefer the VTID if present
  @VTID(97)
  office.MsoShapeStyleIndex shapeStyle();


  /**
   * <p>
   * Setter method for the COM property "ShapeStyle"
   * </p>
   * @param shapeStyle Mandatory office.MsoShapeStyleIndex parameter.
   */

  @DISPID(150) //= 0x96. The runtime will prefer the VTID if present
  @VTID(98)
  void shapeStyle(
    office.MsoShapeStyleIndex shapeStyle);


  /**
   * <p>
   * Getter method for the COM property "BackgroundStyle"
   * </p>
   * @return  Returns a value of type office.MsoBackgroundStyleIndex
   */

  @DISPID(151) //= 0x97. The runtime will prefer the VTID if present
  @VTID(99)
  office.MsoBackgroundStyleIndex backgroundStyle();


  /**
   * <p>
   * Setter method for the COM property "BackgroundStyle"
   * </p>
   * @param backgroundStyle Mandatory office.MsoBackgroundStyleIndex parameter.
   */

  @DISPID(151) //= 0x97. The runtime will prefer the VTID if present
  @VTID(100)
  void backgroundStyle(
    office.MsoBackgroundStyleIndex backgroundStyle);


  /**
   * <p>
   * Getter method for the COM property "SoftEdge"
   * </p>
   * @return  Returns a value of type office.SoftEdgeFormat
   */

  @DISPID(152) //= 0x98. The runtime will prefer the VTID if present
  @VTID(101)
  office.SoftEdgeFormat softEdge();


  /**
   * <p>
   * Getter method for the COM property "Glow"
   * </p>
   * @return  Returns a value of type office.GlowFormat
   */

  @DISPID(153) //= 0x99. The runtime will prefer the VTID if present
  @VTID(102)
  office.GlowFormat glow();


  /**
   * <p>
   * Getter method for the COM property "Reflection"
   * </p>
   * @return  Returns a value of type office.ReflectionFormat
   */

  @DISPID(154) //= 0x9a. The runtime will prefer the VTID if present
  @VTID(103)
  office.ReflectionFormat reflection();


  /**
   * <p>
   * Getter method for the COM property "Chart"
   * </p>
   * @return  Returns a value of type ppt.Chart
   */

  @DISPID(2021) //= 0x7e5. The runtime will prefer the VTID if present
  @VTID(104)
  ppt.Chart chart();


  /**
   * <p>
   * Getter method for the COM property "HasSmartArt"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @DISPID(155) //= 0x9b. The runtime will prefer the VTID if present
  @VTID(105)
  office.MsoTriState hasSmartArt();


  /**
   * <p>
   * Getter method for the COM property "SmartArt"
   * </p>
   * @return  Returns a value of type office.SmartArt
   */

  @DISPID(156) //= 0x9c. The runtime will prefer the VTID if present
  @VTID(106)
  office.SmartArt smartArt();


  /**
   * @param layout Mandatory office.SmartArtLayout parameter.
   */

  @DISPID(157) //= 0x9d. The runtime will prefer the VTID if present
  @VTID(107)
  void convertTextToSmartArt(
    office.SmartArtLayout layout);


  /**
   * <p>
   * Getter method for the COM property "Title"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(158) //= 0x9e. The runtime will prefer the VTID if present
  @VTID(108)
  java.lang.String title();


  /**
   * <p>
   * Setter method for the COM property "Title"
   * </p>
   * @param title Mandatory java.lang.String parameter.
   */

  @DISPID(158) //= 0x9e. The runtime will prefer the VTID if present
  @VTID(109)
  void title(
    java.lang.String title);


  /**
   * <p>
   * Getter method for the COM property "MediaFormat"
   * </p>
   * @return  Returns a value of type ppt.MediaFormat
   */

  @DISPID(2022) //= 0x7e6. The runtime will prefer the VTID if present
  @VTID(110)
  ppt.MediaFormat mediaFormat();


  /**
   */

  @DISPID(2023) //= 0x7e7. The runtime will prefer the VTID if present
  @VTID(111)
  void pickupAnimation();


  /**
   */

  @DISPID(2024) //= 0x7e8. The runtime will prefer the VTID if present
  @VTID(112)
  void applyAnimation();


  /**
   */

  @DISPID(2025) //= 0x7e9. The runtime will prefer the VTID if present
  @VTID(113)
  void upgradeMedia();


  // Properties:
}
