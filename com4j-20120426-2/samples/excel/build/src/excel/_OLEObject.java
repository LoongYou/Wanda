package excel  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface _OLEObject extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   */

  @DISPID(-2147417964)
  @PropGet
  excel._Application getApplication();


  /**
   * <p>
   * Getter method for the COM property "Creator"
   * </p>
   */

  @DISPID(-2147417963)
  @PropGet
  excel.XlCreator getCreator();


  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   */

  @DISPID(-2147417962)
  @PropGet
  com4j.Com4jObject getParent();


  /**
   * <p>
   * Getter method for the COM property "BottomRightCell"
   * </p>
   */

  @DISPID(-2147417497)
  @PropGet
  excel.Range getBottomRightCell();


  /**
   */

  @DISPID(-2147417510)
  java.lang.Object bringToFront();


  /**
   */

  @DISPID(-2147417561)
  java.lang.Object copy();


  /**
   * @param appearance Optional parameter. Default value is 2
   * @param format Optional parameter. Default value is -4147
   */

  @DISPID(-2147417899)
  java.lang.Object copyPicture(
    @Optional @DefaultValue("2") excel.XlPictureAppearance appearance,
    @Optional @DefaultValue("-4147") excel.XlCopyPictureFormat format);


  /**
   */

  @DISPID(-2147417547)
  java.lang.Object cut();


  /**
   */

  @DISPID(-2147417995)
  java.lang.Object delete();


  /**
   */

  @DISPID(-2147417073)
  com4j.Com4jObject duplicate();


  /**
   * <p>
   * Getter method for the COM property "Enabled"
   * </p>
   */

  @DISPID(-2147417512)
  @PropGet
  boolean getEnabled();


  /**
   * <p>
   * Setter method for the COM property "Enabled"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(-2147417512)
  @PropPut
  void setEnabled(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "Height"
   * </p>
   */

  @DISPID(-2147417989)
  @PropGet
  double getHeight();


  /**
   * <p>
   * Setter method for the COM property "Height"
   * </p>
   * @param rhs Mandatory double parameter.
   */

  @DISPID(-2147417989)
  @PropPut
  void setHeight(
    double rhs);


  /**
   * <p>
   * Getter method for the COM property "Index"
   * </p>
   */

  @DISPID(-2147417626)
  @PropGet
  int getIndex();


  /**
   * <p>
   * Getter method for the COM property "Left"
   * </p>
   */

  @DISPID(-2147417985)
  @PropGet
  double getLeft();


  /**
   * <p>
   * Setter method for the COM property "Left"
   * </p>
   * @param rhs Mandatory double parameter.
   */

  @DISPID(-2147417985)
  @PropPut
  void setLeft(
    double rhs);


  /**
   * <p>
   * Getter method for the COM property "Locked"
   * </p>
   */

  @DISPID(-2147417843)
  @PropGet
  boolean getLocked();


  /**
   * <p>
   * Setter method for the COM property "Locked"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(-2147417843)
  @PropPut
  void setLocked(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   */

  @DISPID(-2147418002)
  @PropGet
  java.lang.String getName();


  /**
   * <p>
   * Setter method for the COM property "Name"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(-2147418002)
  @PropPut
  void setName(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "OnAction"
   * </p>
   */

  @DISPID(-2147417516)
  @PropGet
  java.lang.String getOnAction();


  /**
   * <p>
   * Setter method for the COM property "OnAction"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(-2147417516)
  @PropPut
  void setOnAction(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "Placement"
   * </p>
   */

  @DISPID(-2147417495)
  @PropGet
  java.lang.Object getPlacement();


  /**
   * <p>
   * Setter method for the COM property "Placement"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(-2147417495)
  @PropPut
  void setPlacement(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "PrintObject"
   * </p>
   */

  @DISPID(-2147417494)
  @PropGet
  boolean getPrintObject();


  /**
   * <p>
   * Setter method for the COM property "PrintObject"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(-2147417494)
  @PropPut
  void setPrintObject(
    boolean rhs);


  /**
   * @param replace Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(-2147417877)
  java.lang.Object select(
    @Optional java.lang.Object replace);


  /**
   */

  @DISPID(-2147417507)
  java.lang.Object sendToBack();


  /**
   * <p>
   * Getter method for the COM property "Top"
   * </p>
   */

  @DISPID(-2147417986)
  @PropGet
  double getTop();


  /**
   * <p>
   * Setter method for the COM property "Top"
   * </p>
   * @param rhs Mandatory double parameter.
   */

  @DISPID(-2147417986)
  @PropPut
  void setTop(
    double rhs);


  /**
   * <p>
   * Getter method for the COM property "TopLeftCell"
   * </p>
   */

  @DISPID(-2147417492)
  @PropGet
  excel.Range getTopLeftCell();


  /**
   * <p>
   * Getter method for the COM property "Visible"
   * </p>
   */

  @DISPID(-2147417554)
  @PropGet
  boolean getVisible();


  /**
   * <p>
   * Setter method for the COM property "Visible"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(-2147417554)
  @PropPut
  void setVisible(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "Width"
   * </p>
   */

  @DISPID(-2147417990)
  @PropGet
  double getWidth();


  /**
   * <p>
   * Setter method for the COM property "Width"
   * </p>
   * @param rhs Mandatory double parameter.
   */

  @DISPID(-2147417990)
  @PropPut
  void setWidth(
    double rhs);


  /**
   * <p>
   * Getter method for the COM property "ZOrder"
   * </p>
   */

  @DISPID(-2147417490)
  @PropGet
  int getZOrder();


  /**
   * <p>
   * Getter method for the COM property "ShapeRange"
   * </p>
   */

  @DISPID(-2147416584)
  @PropGet
  excel.ShapeRange getShapeRange();


  /**
   * <p>
   * Getter method for the COM property "Border"
   * </p>
   */

  @DISPID(-2147417984)
  @PropGet
  excel.Border getBorder();


  /**
   * <p>
   * Getter method for the COM property "Interior"
   * </p>
   */

  @DISPID(-2147417983)
  @PropGet
  excel.Interior getInterior();


  /**
   * <p>
   * Getter method for the COM property "Shadow"
   * </p>
   */

  @DISPID(-2147418009)
  @PropGet
  boolean getShadow();


  /**
   * <p>
   * Setter method for the COM property "Shadow"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(-2147418009)
  @PropPut
  void setShadow(
    boolean rhs);


  /**
   */

  @DISPID(-2147417808)
  java.lang.Object activate();


  /**
   * <p>
   * Getter method for the COM property "AutoLoad"
   * </p>
   */

  @DISPID(-2147416926)
  @PropGet
  boolean getAutoLoad();


  /**
   * <p>
   * Setter method for the COM property "AutoLoad"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(-2147416926)
  @PropPut
  void setAutoLoad(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "AutoUpdate"
   * </p>
   */

  @DISPID(-2147417064)
  @PropGet
  boolean getAutoUpdate();


  /**
   * <p>
   * Setter method for the COM property "AutoUpdate"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(-2147417064)
  @PropPut
  void setAutoUpdate(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "Object"
   * </p>
   */

  @DISPID(-2147417063)
  @PropGet
  com4j.Com4jObject getObject();


  /**
   * <p>
   * Getter method for the COM property "OLEType"
   * </p>
   */

  @DISPID(-2147417058)
  @PropGet
  java.lang.Object getOLEType();


  /**
   * <p>
   * Getter method for the COM property "SourceName"
   * </p>
   */

  @DISPID(-2147417391)
  @PropGet
  java.lang.String getSourceName();


  /**
   * <p>
   * Setter method for the COM property "SourceName"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(-2147417391)
  @PropPut
  void setSourceName(
    java.lang.String rhs);


  /**
   */

  @DISPID(-2147417432)
  java.lang.Object update();


  /**
   * @param verb Optional parameter. Default value is 1
   */

  @DISPID(-2147417506)
  java.lang.Object verb(
    @Optional @DefaultValue("1") excel.XlOLEVerb verb);


  /**
   * <p>
   * Getter method for the COM property "LinkedCell"
   * </p>
   */

  @DISPID(-2147417054)
  @PropGet
  java.lang.String getLinkedCell();


  /**
   * <p>
   * Setter method for the COM property "LinkedCell"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(-2147417054)
  @PropPut
  void setLinkedCell(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "ListFillRange"
   * </p>
   */

  @DISPID(-2147417265)
  @PropGet
  java.lang.String getListFillRange();


  /**
   * <p>
   * Setter method for the COM property "ListFillRange"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(-2147417265)
  @PropPut
  void setListFillRange(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "progID"
   * </p>
   */

  @DISPID(-2147416589)
  @PropGet
  java.lang.String getProgID();


  /**
   * <p>
   * Getter method for the COM property "AltHTML"
   * </p>
   */

  @DISPID(-2147416259)
  @PropGet
  java.lang.String getAltHTML();


  /**
   * <p>
   * Setter method for the COM property "AltHTML"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(-2147416259)
  @PropPut
  void setAltHTML(
    java.lang.String rhs);


  // Properties:
}
