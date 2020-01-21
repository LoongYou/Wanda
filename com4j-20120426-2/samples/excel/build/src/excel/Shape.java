package excel  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface Shape extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   */

  @DISPID(148)
  @PropGet
  excel._Application getApplication();


  /**
   * <p>
   * Getter method for the COM property "Creator"
   * </p>
   */

  @DISPID(149)
  @PropGet
  excel.XlCreator getCreator();


  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   */

  @DISPID(150)
  @PropGet
  com4j.Com4jObject getParent();


  /**
   */

  @DISPID(1675)
  void apply();


  /**
   */

  @DISPID(117)
  void delete();


  /**
   */

  @DISPID(1039)
  excel.Shape duplicate();


  /**
   * @param flipCmd Mandatory office.MsoFlipCmd parameter.
   */

  @DISPID(1676)
  void flip(
    office.MsoFlipCmd flipCmd);


  /**
   * @param increment Mandatory float parameter.
   */

  @DISPID(1678)
  void incrementLeft(
    float increment);


  /**
   * @param increment Mandatory float parameter.
   */

  @DISPID(1680)
  void incrementRotation(
    float increment);


  /**
   * @param increment Mandatory float parameter.
   */

  @DISPID(1681)
  void incrementTop(
    float increment);


  /**
   */

  @DISPID(1682)
  void pickUp();


  /**
   */

  @DISPID(1683)
  void rerouteConnections();


  /**
   * @param factor Mandatory float parameter.
   * @param relativeToOriginalSize Mandatory office.MsoTriState parameter.
   * @param scale Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(1684)
  void scaleHeight(
    float factor,
    office.MsoTriState relativeToOriginalSize,
    @Optional java.lang.Object scale);


  /**
   * @param factor Mandatory float parameter.
   * @param relativeToOriginalSize Mandatory office.MsoTriState parameter.
   * @param scale Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(1688)
  void scaleWidth(
    float factor,
    office.MsoTriState relativeToOriginalSize,
    @Optional java.lang.Object scale);


  /**
   * @param replace Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(235)
  void select(
    @Optional java.lang.Object replace);


  /**
   */

  @DISPID(1689)
  void setShapesDefaultProperties();


  /**
   */

  @DISPID(244)
  excel.ShapeRange ungroup();


  /**
   * @param zOrderCmd Mandatory office.MsoZOrderCmd parameter.
   */

  @DISPID(622)
  void zOrder(
    office.MsoZOrderCmd zOrderCmd);


  /**
   * <p>
   * Getter method for the COM property "Adjustments"
   * </p>
   */

  @DISPID(1691)
  @PropGet
  excel.Adjustments getAdjustments();


  /**
   * <p>
   * Getter method for the COM property "TextFrame"
   * </p>
   */

  @DISPID(1692)
  @PropGet
  excel.TextFrame getTextFrame();


  /**
   * <p>
   * Getter method for the COM property "AutoShapeType"
   * </p>
   */

  @DISPID(1693)
  @PropGet
  office.MsoAutoShapeType getAutoShapeType();


  /**
   * <p>
   * Setter method for the COM property "AutoShapeType"
   * </p>
   * @param rhs Mandatory office.MsoAutoShapeType parameter.
   */

  @DISPID(1693)
  @PropPut
  void setAutoShapeType(
    office.MsoAutoShapeType rhs);


  /**
   * <p>
   * Getter method for the COM property "Callout"
   * </p>
   */

  @DISPID(1694)
  @PropGet
  excel.CalloutFormat getCallout();


  /**
   * <p>
   * Getter method for the COM property "ConnectionSiteCount"
   * </p>
   */

  @DISPID(1695)
  @PropGet
  int getConnectionSiteCount();


  /**
   * <p>
   * Getter method for the COM property "Connector"
   * </p>
   */

  @DISPID(1696)
  @PropGet
  office.MsoTriState getConnector();


  /**
   * <p>
   * Getter method for the COM property "ConnectorFormat"
   * </p>
   */

  @DISPID(1697)
  @PropGet
  excel.ConnectorFormat getConnectorFormat();


  /**
   * <p>
   * Getter method for the COM property "Fill"
   * </p>
   */

  @DISPID(1663)
  @PropGet
  excel.FillFormat getFill();


  /**
   * <p>
   * Getter method for the COM property "GroupItems"
   * </p>
   */

  @DISPID(1698)
  @PropGet
  excel.GroupShapes getGroupItems();


  /**
   * <p>
   * Getter method for the COM property "Height"
   * </p>
   */

  @DISPID(123)
  @PropGet
  float getHeight();


  /**
   * <p>
   * Setter method for the COM property "Height"
   * </p>
   * @param rhs Mandatory float parameter.
   */

  @DISPID(123)
  @PropPut
  void setHeight(
    float rhs);


  /**
   * <p>
   * Getter method for the COM property "HorizontalFlip"
   * </p>
   */

  @DISPID(1699)
  @PropGet
  office.MsoTriState getHorizontalFlip();


  /**
   * <p>
   * Getter method for the COM property "Left"
   * </p>
   */

  @DISPID(127)
  @PropGet
  float getLeft();


  /**
   * <p>
   * Setter method for the COM property "Left"
   * </p>
   * @param rhs Mandatory float parameter.
   */

  @DISPID(127)
  @PropPut
  void setLeft(
    float rhs);


  /**
   * <p>
   * Getter method for the COM property "Line"
   * </p>
   */

  @DISPID(817)
  @PropGet
  excel.LineFormat getLine();


  /**
   * <p>
   * Getter method for the COM property "LockAspectRatio"
   * </p>
   */

  @DISPID(1700)
  @PropGet
  office.MsoTriState getLockAspectRatio();


  /**
   * <p>
   * Setter method for the COM property "LockAspectRatio"
   * </p>
   * @param rhs Mandatory office.MsoTriState parameter.
   */

  @DISPID(1700)
  @PropPut
  void setLockAspectRatio(
    office.MsoTriState rhs);


  /**
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   */

  @DISPID(110)
  @PropGet
  java.lang.String getName();


  /**
   * <p>
   * Setter method for the COM property "Name"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(110)
  @PropPut
  void setName(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "Nodes"
   * </p>
   */

  @DISPID(1701)
  @PropGet
  excel.ShapeNodes getNodes();


  /**
   * <p>
   * Getter method for the COM property "Rotation"
   * </p>
   */

  @DISPID(59)
  @PropGet
  float getRotation();


  /**
   * <p>
   * Setter method for the COM property "Rotation"
   * </p>
   * @param rhs Mandatory float parameter.
   */

  @DISPID(59)
  @PropPut
  void setRotation(
    float rhs);


  /**
   * <p>
   * Getter method for the COM property "PictureFormat"
   * </p>
   */

  @DISPID(1631)
  @PropGet
  excel.PictureFormat getPictureFormat();


  /**
   * <p>
   * Getter method for the COM property "Shadow"
   * </p>
   */

  @DISPID(103)
  @PropGet
  excel.ShadowFormat getShadow();


  /**
   * <p>
   * Getter method for the COM property "TextEffect"
   * </p>
   */

  @DISPID(1702)
  @PropGet
  excel.TextEffectFormat getTextEffect();


  /**
   * <p>
   * Getter method for the COM property "ThreeD"
   * </p>
   */

  @DISPID(1703)
  @PropGet
  excel.ThreeDFormat getThreeD();


  /**
   * <p>
   * Getter method for the COM property "Top"
   * </p>
   */

  @DISPID(126)
  @PropGet
  float getTop();


  /**
   * <p>
   * Setter method for the COM property "Top"
   * </p>
   * @param rhs Mandatory float parameter.
   */

  @DISPID(126)
  @PropPut
  void setTop(
    float rhs);


  /**
   * <p>
   * Getter method for the COM property "Type"
   * </p>
   */

  @DISPID(108)
  @PropGet
  office.MsoShapeType getType();


  /**
   * <p>
   * Getter method for the COM property "VerticalFlip"
   * </p>
   */

  @DISPID(1704)
  @PropGet
  office.MsoTriState getVerticalFlip();


  /**
   * <p>
   * Getter method for the COM property "Vertices"
   * </p>
   */

  @DISPID(621)
  @PropGet
  java.lang.Object getVertices();


  /**
   * <p>
   * Getter method for the COM property "Visible"
   * </p>
   */

  @DISPID(558)
  @PropGet
  office.MsoTriState getVisible();


  /**
   * <p>
   * Setter method for the COM property "Visible"
   * </p>
   * @param rhs Mandatory office.MsoTriState parameter.
   */

  @DISPID(558)
  @PropPut
  void setVisible(
    office.MsoTriState rhs);


  /**
   * <p>
   * Getter method for the COM property "Width"
   * </p>
   */

  @DISPID(122)
  @PropGet
  float getWidth();


  /**
   * <p>
   * Setter method for the COM property "Width"
   * </p>
   * @param rhs Mandatory float parameter.
   */

  @DISPID(122)
  @PropPut
  void setWidth(
    float rhs);


  /**
   * <p>
   * Getter method for the COM property "ZOrderPosition"
   * </p>
   */

  @DISPID(1705)
  @PropGet
  int getZOrderPosition();


  /**
   * <p>
   * Getter method for the COM property "Hyperlink"
   * </p>
   */

  @DISPID(1706)
  @PropGet
  excel.Hyperlink getHyperlink();


  /**
   * <p>
   * Getter method for the COM property "BlackWhiteMode"
   * </p>
   */

  @DISPID(1707)
  @PropGet
  office.MsoBlackWhiteMode getBlackWhiteMode();


  /**
   * <p>
   * Setter method for the COM property "BlackWhiteMode"
   * </p>
   * @param rhs Mandatory office.MsoBlackWhiteMode parameter.
   */

  @DISPID(1707)
  @PropPut
  void setBlackWhiteMode(
    office.MsoBlackWhiteMode rhs);


  /**
   * <p>
   * Getter method for the COM property "DrawingObject"
   * </p>
   */

  @DISPID(1708)
  @PropGet
  com4j.Com4jObject getDrawingObject();


  /**
   * <p>
   * Getter method for the COM property "OnAction"
   * </p>
   */

  @DISPID(596)
  @PropGet
  java.lang.String getOnAction();


  /**
   * <p>
   * Setter method for the COM property "OnAction"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(596)
  @PropPut
  void setOnAction(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "Locked"
   * </p>
   */

  @DISPID(269)
  @PropGet
  boolean getLocked();


  /**
   * <p>
   * Setter method for the COM property "Locked"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(269)
  @PropPut
  void setLocked(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "TopLeftCell"
   * </p>
   */

  @DISPID(620)
  @PropGet
  excel.Range getTopLeftCell();


  /**
   * <p>
   * Getter method for the COM property "BottomRightCell"
   * </p>
   */

  @DISPID(615)
  @PropGet
  excel.Range getBottomRightCell();


  /**
   * <p>
   * Getter method for the COM property "Placement"
   * </p>
   */

  @DISPID(617)
  @PropGet
  excel.XlPlacement getPlacement();


  /**
   * <p>
   * Setter method for the COM property "Placement"
   * </p>
   * @param rhs Mandatory excel.XlPlacement parameter.
   */

  @DISPID(617)
  @PropPut
  void setPlacement(
    excel.XlPlacement rhs);


  /**
   */

  @DISPID(551)
  void copy();


  /**
   */

  @DISPID(565)
  void cut();


  /**
   * @param appearance Optional parameter. Default value is com4j.Variant.getMissing()
   * @param format Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(213)
  void copyPicture(
    @Optional java.lang.Object appearance,
    @Optional java.lang.Object format);


  /**
   * <p>
   * Getter method for the COM property "ControlFormat"
   * </p>
   */

  @DISPID(1709)
  @PropGet
  excel.ControlFormat getControlFormat();


  /**
   * <p>
   * Getter method for the COM property "LinkFormat"
   * </p>
   */

  @DISPID(1710)
  @PropGet
  excel.LinkFormat getLinkFormat();


  /**
   * <p>
   * Getter method for the COM property "OLEFormat"
   * </p>
   */

  @DISPID(1711)
  @PropGet
  excel.OLEFormat getOLEFormat();


  /**
   * <p>
   * Getter method for the COM property "FormControlType"
   * </p>
   */

  @DISPID(1712)
  @PropGet
  excel.XlFormControl getFormControlType();


  /**
   * <p>
   * Getter method for the COM property "AlternativeText"
   * </p>
   */

  @DISPID(1891)
  @PropGet
  java.lang.String getAlternativeText();


  /**
   * <p>
   * Setter method for the COM property "AlternativeText"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(1891)
  @PropPut
  void setAlternativeText(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "Script"
   * </p>
   */

  @DISPID(1892)
  @PropGet
  office.Script getScript();


  /**
   * <p>
   * Getter method for the COM property "DiagramNode"
   * </p>
   */

  @DISPID(2165)
  @PropGet
  excel.DiagramNode getDiagramNode();


  /**
   * <p>
   * Getter method for the COM property "HasDiagramNode"
   * </p>
   */

  @DISPID(2166)
  @PropGet
  office.MsoTriState getHasDiagramNode();


  /**
   * <p>
   * Getter method for the COM property "Diagram"
   * </p>
   */

  @DISPID(2167)
  @PropGet
  excel.Diagram getDiagram();


  /**
   * <p>
   * Getter method for the COM property "HasDiagram"
   * </p>
   */

  @DISPID(2168)
  @PropGet
  office.MsoTriState getHasDiagram();


  /**
   * <p>
   * Getter method for the COM property "Child"
   * </p>
   */

  @DISPID(2169)
  @PropGet
  office.MsoTriState getChild();


  /**
   * <p>
   * Getter method for the COM property "ParentGroup"
   * </p>
   */

  @DISPID(2170)
  @PropGet
  excel.Shape getParentGroup();


  /**
   * <p>
   * Getter method for the COM property "CanvasItems"
   * </p>
   */

  @DISPID(2171)
  @PropGet
  office.CanvasShapes getCanvasItems();


  /**
   * <p>
   * Getter method for the COM property "ID"
   * </p>
   */

  @DISPID(570)
  @PropGet
  int getID();


  /**
   * @param increment Mandatory float parameter.
   */

  @DISPID(2172)
  void canvasCropLeft(
    float increment);


  /**
   * @param increment Mandatory float parameter.
   */

  @DISPID(2173)
  void canvasCropTop(
    float increment);


  /**
   * @param increment Mandatory float parameter.
   */

  @DISPID(2174)
  void canvasCropRight(
    float increment);


  /**
   * @param increment Mandatory float parameter.
   */

  @DISPID(2175)
  void canvasCropBottom(
    float increment);


  /**
   * <p>
   * Getter method for the COM property "Chart"
   * </p>
   */

  @DISPID(7)
  @PropGet
  excel._Chart getChart();


  /**
   * <p>
   * Getter method for the COM property "HasChart"
   * </p>
   */

  @DISPID(2658)
  @PropGet
  office.MsoTriState getHasChart();


  /**
   * <p>
   * Getter method for the COM property "TextFrame2"
   * </p>
   */

  @DISPID(2659)
  @PropGet
  excel.TextFrame2 getTextFrame2();


  /**
   * <p>
   * Getter method for the COM property "ShapeStyle"
   * </p>
   */

  @DISPID(2660)
  @PropGet
  office.MsoShapeStyleIndex getShapeStyle();


  /**
   * <p>
   * Setter method for the COM property "ShapeStyle"
   * </p>
   * @param rhs Mandatory office.MsoShapeStyleIndex parameter.
   */

  @DISPID(2660)
  @PropPut
  void setShapeStyle(
    office.MsoShapeStyleIndex rhs);


  /**
   * <p>
   * Getter method for the COM property "BackgroundStyle"
   * </p>
   */

  @DISPID(2661)
  @PropGet
  office.MsoBackgroundStyleIndex getBackgroundStyle();


  /**
   * <p>
   * Setter method for the COM property "BackgroundStyle"
   * </p>
   * @param rhs Mandatory office.MsoBackgroundStyleIndex parameter.
   */

  @DISPID(2661)
  @PropPut
  void setBackgroundStyle(
    office.MsoBackgroundStyleIndex rhs);


  /**
   * <p>
   * Getter method for the COM property "SoftEdge"
   * </p>
   */

  @DISPID(2662)
  @PropGet
  office.SoftEdgeFormat getSoftEdge();


  /**
   * <p>
   * Getter method for the COM property "Glow"
   * </p>
   */

  @DISPID(2663)
  @PropGet
  office.GlowFormat getGlow();


  /**
   * <p>
   * Getter method for the COM property "Reflection"
   * </p>
   */

  @DISPID(2664)
  @PropGet
  office.ReflectionFormat getReflection();


  /**
   * <p>
   * Getter method for the COM property "HasSmartArt"
   * </p>
   */

  @DISPID(2918)
  @PropGet
  office.MsoTriState getHasSmartArt();


  /**
   * <p>
   * Getter method for the COM property "SmartArt"
   * </p>
   */

  @DISPID(2919)
  @PropGet
  office.SmartArt getSmartArt();


  /**
   * <p>
   * Getter method for the COM property "Title"
   * </p>
   */

  @DISPID(199)
  @PropGet
  java.lang.String getTitle();


  /**
   * <p>
   * Setter method for the COM property "Title"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(199)
  @PropPut
  void setTitle(
    java.lang.String rhs);


  // Properties:
}
