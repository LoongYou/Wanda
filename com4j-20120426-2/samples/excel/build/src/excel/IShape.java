package excel  ;

import com4j.*;

@IID("{00024439-0001-0000-C000-000000000046}")
public interface IShape extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of type excel._Application
   */

  @VTID(7)
  excel._Application getApplication();


  /**
   * <p>
   * Getter method for the COM property "Creator"
   * </p>
   * @return  Returns a value of type excel.XlCreator
   */

  @VTID(8)
  excel.XlCreator getCreator();


  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @VTID(9)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject getParent();


  /**
   */

  @VTID(10)
  void apply();


  /**
   */

  @VTID(11)
  void delete();


  /**
   * @return  Returns a value of type excel.Shape
   */

  @VTID(12)
  excel.Shape duplicate();


  /**
   * @param flipCmd Mandatory office.MsoFlipCmd parameter.
   */

  @VTID(13)
  void flip(
    office.MsoFlipCmd flipCmd);


  /**
   * @param increment Mandatory float parameter.
   */

  @VTID(14)
  void incrementLeft(
    float increment);


  /**
   * @param increment Mandatory float parameter.
   */

  @VTID(15)
  void incrementRotation(
    float increment);


  /**
   * @param increment Mandatory float parameter.
   */

  @VTID(16)
  void incrementTop(
    float increment);


  /**
   */

  @VTID(17)
  void pickUp();


  /**
   */

  @VTID(18)
  void rerouteConnections();


  /**
   * @param factor Mandatory float parameter.
   * @param relativeToOriginalSize Mandatory office.MsoTriState parameter.
   * @param scale Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @VTID(19)
  void scaleHeight(
    float factor,
    office.MsoTriState relativeToOriginalSize,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object scale);


  /**
   * @param factor Mandatory float parameter.
   * @param relativeToOriginalSize Mandatory office.MsoTriState parameter.
   * @param scale Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @VTID(20)
  void scaleWidth(
    float factor,
    office.MsoTriState relativeToOriginalSize,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object scale);


  /**
   * @param replace Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @VTID(21)
  void select(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object replace);


  /**
   */

  @VTID(22)
  void setShapesDefaultProperties();


  /**
   * @return  Returns a value of type excel.ShapeRange
   */

  @VTID(23)
  excel.ShapeRange ungroup();


  /**
   * @param zOrderCmd Mandatory office.MsoZOrderCmd parameter.
   */

  @VTID(24)
  void zOrder(
    office.MsoZOrderCmd zOrderCmd);


  /**
   * <p>
   * Getter method for the COM property "Adjustments"
   * </p>
   * @return  Returns a value of type excel.Adjustments
   */

  @VTID(25)
  excel.Adjustments getAdjustments();


  @VTID(25)
  @ReturnValue(defaultPropertyThrough={excel.Adjustments.class})
  float getAdjustments(
    int index);

  /**
   * <p>
   * Getter method for the COM property "TextFrame"
   * </p>
   * @return  Returns a value of type excel.TextFrame
   */

  @VTID(26)
  excel.TextFrame getTextFrame();


  /**
   * <p>
   * Getter method for the COM property "AutoShapeType"
   * </p>
   * @return  Returns a value of type office.MsoAutoShapeType
   */

  @VTID(27)
  office.MsoAutoShapeType getAutoShapeType();


  /**
   * <p>
   * Setter method for the COM property "AutoShapeType"
   * </p>
   * @param rhs Mandatory office.MsoAutoShapeType parameter.
   */

  @VTID(28)
  void setAutoShapeType(
    office.MsoAutoShapeType rhs);


  /**
   * <p>
   * Getter method for the COM property "Callout"
   * </p>
   * @return  Returns a value of type excel.CalloutFormat
   */

  @VTID(29)
  excel.CalloutFormat getCallout();


  /**
   * <p>
   * Getter method for the COM property "ConnectionSiteCount"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(30)
  int getConnectionSiteCount();


  /**
   * <p>
   * Getter method for the COM property "Connector"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @VTID(31)
  office.MsoTriState getConnector();


  /**
   * <p>
   * Getter method for the COM property "ConnectorFormat"
   * </p>
   * @return  Returns a value of type excel.ConnectorFormat
   */

  @VTID(32)
  excel.ConnectorFormat getConnectorFormat();


  /**
   * <p>
   * Getter method for the COM property "Fill"
   * </p>
   * @return  Returns a value of type excel.FillFormat
   */

  @VTID(33)
  excel.FillFormat getFill();


  /**
   * <p>
   * Getter method for the COM property "GroupItems"
   * </p>
   * @return  Returns a value of type excel.GroupShapes
   */

  @VTID(34)
  excel.GroupShapes getGroupItems();


  /**
   * <p>
   * Getter method for the COM property "Height"
   * </p>
   * @return  Returns a value of type float
   */

  @VTID(35)
  float getHeight();


  /**
   * <p>
   * Setter method for the COM property "Height"
   * </p>
   * @param rhs Mandatory float parameter.
   */

  @VTID(36)
  void setHeight(
    float rhs);


  /**
   * <p>
   * Getter method for the COM property "HorizontalFlip"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @VTID(37)
  office.MsoTriState getHorizontalFlip();


  /**
   * <p>
   * Getter method for the COM property "Left"
   * </p>
   * @return  Returns a value of type float
   */

  @VTID(38)
  float getLeft();


  /**
   * <p>
   * Setter method for the COM property "Left"
   * </p>
   * @param rhs Mandatory float parameter.
   */

  @VTID(39)
  void setLeft(
    float rhs);


  /**
   * <p>
   * Getter method for the COM property "Line"
   * </p>
   * @return  Returns a value of type excel.LineFormat
   */

  @VTID(40)
  excel.LineFormat getLine();


  /**
   * <p>
   * Getter method for the COM property "LockAspectRatio"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @VTID(41)
  office.MsoTriState getLockAspectRatio();


  /**
   * <p>
   * Setter method for the COM property "LockAspectRatio"
   * </p>
   * @param rhs Mandatory office.MsoTriState parameter.
   */

  @VTID(42)
  void setLockAspectRatio(
    office.MsoTriState rhs);


  /**
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(43)
  java.lang.String getName();


  /**
   * <p>
   * Setter method for the COM property "Name"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(44)
  void setName(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "Nodes"
   * </p>
   * @return  Returns a value of type excel.ShapeNodes
   */

  @VTID(45)
  excel.ShapeNodes getNodes();


  @VTID(45)
  @ReturnValue(defaultPropertyThrough={excel.ShapeNodes.class})
  excel.ShapeNode getNodes(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);

  /**
   * <p>
   * Getter method for the COM property "Rotation"
   * </p>
   * @return  Returns a value of type float
   */

  @VTID(46)
  float getRotation();


  /**
   * <p>
   * Setter method for the COM property "Rotation"
   * </p>
   * @param rhs Mandatory float parameter.
   */

  @VTID(47)
  void setRotation(
    float rhs);


  /**
   * <p>
   * Getter method for the COM property "PictureFormat"
   * </p>
   * @return  Returns a value of type excel.PictureFormat
   */

  @VTID(48)
  excel.PictureFormat getPictureFormat();


  /**
   * <p>
   * Getter method for the COM property "Shadow"
   * </p>
   * @return  Returns a value of type excel.ShadowFormat
   */

  @VTID(49)
  excel.ShadowFormat getShadow();


  /**
   * <p>
   * Getter method for the COM property "TextEffect"
   * </p>
   * @return  Returns a value of type excel.TextEffectFormat
   */

  @VTID(50)
  excel.TextEffectFormat getTextEffect();


  /**
   * <p>
   * Getter method for the COM property "ThreeD"
   * </p>
   * @return  Returns a value of type excel.ThreeDFormat
   */

  @VTID(51)
  excel.ThreeDFormat getThreeD();


  /**
   * <p>
   * Getter method for the COM property "Top"
   * </p>
   * @return  Returns a value of type float
   */

  @VTID(52)
  float getTop();


  /**
   * <p>
   * Setter method for the COM property "Top"
   * </p>
   * @param rhs Mandatory float parameter.
   */

  @VTID(53)
  void setTop(
    float rhs);


  /**
   * <p>
   * Getter method for the COM property "Type"
   * </p>
   * @return  Returns a value of type office.MsoShapeType
   */

  @VTID(54)
  office.MsoShapeType getType();


  /**
   * <p>
   * Getter method for the COM property "VerticalFlip"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @VTID(55)
  office.MsoTriState getVerticalFlip();


  /**
   * <p>
   * Getter method for the COM property "Vertices"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(56)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object getVertices();


  /**
   * <p>
   * Getter method for the COM property "Visible"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @VTID(57)
  office.MsoTriState getVisible();


  /**
   * <p>
   * Setter method for the COM property "Visible"
   * </p>
   * @param rhs Mandatory office.MsoTriState parameter.
   */

  @VTID(58)
  void setVisible(
    office.MsoTriState rhs);


  /**
   * <p>
   * Getter method for the COM property "Width"
   * </p>
   * @return  Returns a value of type float
   */

  @VTID(59)
  float getWidth();


  /**
   * <p>
   * Setter method for the COM property "Width"
   * </p>
   * @param rhs Mandatory float parameter.
   */

  @VTID(60)
  void setWidth(
    float rhs);


  /**
   * <p>
   * Getter method for the COM property "ZOrderPosition"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(61)
  int getZOrderPosition();


  /**
   * <p>
   * Getter method for the COM property "Hyperlink"
   * </p>
   * @return  Returns a value of type excel.Hyperlink
   */

  @VTID(62)
  excel.Hyperlink getHyperlink();


  /**
   * <p>
   * Getter method for the COM property "BlackWhiteMode"
   * </p>
   * @return  Returns a value of type office.MsoBlackWhiteMode
   */

  @VTID(63)
  office.MsoBlackWhiteMode getBlackWhiteMode();


  /**
   * <p>
   * Setter method for the COM property "BlackWhiteMode"
   * </p>
   * @param rhs Mandatory office.MsoBlackWhiteMode parameter.
   */

  @VTID(64)
  void setBlackWhiteMode(
    office.MsoBlackWhiteMode rhs);


  /**
   * <p>
   * Getter method for the COM property "DrawingObject"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @VTID(65)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject getDrawingObject();


  /**
   * <p>
   * Getter method for the COM property "OnAction"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(66)
  java.lang.String getOnAction();


  /**
   * <p>
   * Setter method for the COM property "OnAction"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(67)
  void setOnAction(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "Locked"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(68)
  boolean getLocked();


  /**
   * <p>
   * Setter method for the COM property "Locked"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(69)
  void setLocked(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "TopLeftCell"
   * </p>
   * @return  Returns a value of type excel.Range
   */

  @VTID(70)
  excel.Range getTopLeftCell();


  /**
   * <p>
   * Getter method for the COM property "BottomRightCell"
   * </p>
   * @return  Returns a value of type excel.Range
   */

  @VTID(71)
  excel.Range getBottomRightCell();


  /**
   * <p>
   * Getter method for the COM property "Placement"
   * </p>
   * @return  Returns a value of type excel.XlPlacement
   */

  @VTID(72)
  excel.XlPlacement getPlacement();


  /**
   * <p>
   * Setter method for the COM property "Placement"
   * </p>
   * @param rhs Mandatory excel.XlPlacement parameter.
   */

  @VTID(73)
  void setPlacement(
    excel.XlPlacement rhs);


  /**
   */

  @VTID(74)
  void copy();


  /**
   */

  @VTID(75)
  void cut();


  /**
   * @param appearance Optional parameter. Default value is com4j.Variant.getMissing()
   * @param format Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @VTID(76)
  void copyPicture(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object appearance,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object format);


  /**
   * <p>
   * Getter method for the COM property "ControlFormat"
   * </p>
   * @return  Returns a value of type excel.ControlFormat
   */

  @VTID(77)
  excel.ControlFormat getControlFormat();


  /**
   * <p>
   * Getter method for the COM property "LinkFormat"
   * </p>
   * @return  Returns a value of type excel.LinkFormat
   */

  @VTID(78)
  excel.LinkFormat getLinkFormat();


  /**
   * <p>
   * Getter method for the COM property "OLEFormat"
   * </p>
   * @return  Returns a value of type excel.OLEFormat
   */

  @VTID(79)
  excel.OLEFormat getOLEFormat();


  /**
   * <p>
   * Getter method for the COM property "FormControlType"
   * </p>
   * @return  Returns a value of type excel.XlFormControl
   */

  @VTID(80)
  excel.XlFormControl getFormControlType();


  /**
   * <p>
   * Getter method for the COM property "AlternativeText"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(81)
  java.lang.String getAlternativeText();


  /**
   * <p>
   * Setter method for the COM property "AlternativeText"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(82)
  void setAlternativeText(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "Script"
   * </p>
   * @return  Returns a value of type office.Script
   */

  @VTID(83)
  office.Script getScript();


  /**
   * <p>
   * Getter method for the COM property "DiagramNode"
   * </p>
   * @return  Returns a value of type excel.DiagramNode
   */

  @VTID(84)
  excel.DiagramNode getDiagramNode();


  /**
   * <p>
   * Getter method for the COM property "HasDiagramNode"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @VTID(85)
  office.MsoTriState getHasDiagramNode();


  /**
   * <p>
   * Getter method for the COM property "Diagram"
   * </p>
   * @return  Returns a value of type excel.Diagram
   */

  @VTID(86)
  excel.Diagram getDiagram();


  /**
   * <p>
   * Getter method for the COM property "HasDiagram"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @VTID(87)
  office.MsoTriState getHasDiagram();


  /**
   * <p>
   * Getter method for the COM property "Child"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @VTID(88)
  office.MsoTriState getChild();


  /**
   * <p>
   * Getter method for the COM property "ParentGroup"
   * </p>
   * @return  Returns a value of type excel.Shape
   */

  @VTID(89)
  excel.Shape getParentGroup();


  /**
   * <p>
   * Getter method for the COM property "CanvasItems"
   * </p>
   * @return  Returns a value of type office.CanvasShapes
   */

  @VTID(90)
  office.CanvasShapes getCanvasItems();


  @VTID(90)
  @ReturnValue(defaultPropertyThrough={office.CanvasShapes.class})
  office.Shape getCanvasItems(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);

  /**
   * <p>
   * Getter method for the COM property "ID"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(91)
  int getID();


  /**
   * @param increment Mandatory float parameter.
   */

  @VTID(92)
  void canvasCropLeft(
    float increment);


  /**
   * @param increment Mandatory float parameter.
   */

  @VTID(93)
  void canvasCropTop(
    float increment);


  /**
   * @param increment Mandatory float parameter.
   */

  @VTID(94)
  void canvasCropRight(
    float increment);


  /**
   * @param increment Mandatory float parameter.
   */

  @VTID(95)
  void canvasCropBottom(
    float increment);


  /**
   * <p>
   * Getter method for the COM property "Chart"
   * </p>
   * @return  Returns a value of type excel._Chart
   */

  @VTID(96)
  excel._Chart getChart();


  /**
   * <p>
   * Getter method for the COM property "HasChart"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @VTID(97)
  office.MsoTriState getHasChart();


  /**
   * <p>
   * Getter method for the COM property "TextFrame2"
   * </p>
   * @return  Returns a value of type excel.TextFrame2
   */

  @VTID(98)
  excel.TextFrame2 getTextFrame2();


  /**
   * <p>
   * Getter method for the COM property "ShapeStyle"
   * </p>
   * @return  Returns a value of type office.MsoShapeStyleIndex
   */

  @VTID(99)
  office.MsoShapeStyleIndex getShapeStyle();


  /**
   * <p>
   * Setter method for the COM property "ShapeStyle"
   * </p>
   * @param rhs Mandatory office.MsoShapeStyleIndex parameter.
   */

  @VTID(100)
  void setShapeStyle(
    office.MsoShapeStyleIndex rhs);


  /**
   * <p>
   * Getter method for the COM property "BackgroundStyle"
   * </p>
   * @return  Returns a value of type office.MsoBackgroundStyleIndex
   */

  @VTID(101)
  office.MsoBackgroundStyleIndex getBackgroundStyle();


  /**
   * <p>
   * Setter method for the COM property "BackgroundStyle"
   * </p>
   * @param rhs Mandatory office.MsoBackgroundStyleIndex parameter.
   */

  @VTID(102)
  void setBackgroundStyle(
    office.MsoBackgroundStyleIndex rhs);


  /**
   * <p>
   * Getter method for the COM property "SoftEdge"
   * </p>
   * @return  Returns a value of type office.SoftEdgeFormat
   */

  @VTID(103)
  office.SoftEdgeFormat getSoftEdge();


  /**
   * <p>
   * Getter method for the COM property "Glow"
   * </p>
   * @return  Returns a value of type office.GlowFormat
   */

  @VTID(104)
  office.GlowFormat getGlow();


  /**
   * <p>
   * Getter method for the COM property "Reflection"
   * </p>
   * @return  Returns a value of type office.ReflectionFormat
   */

  @VTID(105)
  office.ReflectionFormat getReflection();


  /**
   * <p>
   * Getter method for the COM property "HasSmartArt"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @VTID(106)
  office.MsoTriState getHasSmartArt();


  /**
   * <p>
   * Getter method for the COM property "SmartArt"
   * </p>
   * @return  Returns a value of type office.SmartArt
   */

  @VTID(107)
  office.SmartArt getSmartArt();


  /**
   * <p>
   * Getter method for the COM property "Title"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(108)
  java.lang.String getTitle();


  /**
   * <p>
   * Setter method for the COM property "Title"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(109)
  void setTitle(
    java.lang.String rhs);


  // Properties:
}
