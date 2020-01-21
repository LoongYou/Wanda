package excel  ;

import com4j.*;

@IID("{0002444C-0000-0000-C000-000000000046}")
public interface CubeField extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of type excel._Application
   */

  @DISPID(148) //= 0x94. The runtime will prefer the VTID if present
  @VTID(7)
  excel._Application getApplication();


  /**
   * <p>
   * Getter method for the COM property "Creator"
   * </p>
   * @return  Returns a value of type excel.XlCreator
   */

  @DISPID(149) //= 0x95. The runtime will prefer the VTID if present
  @VTID(8)
  excel.XlCreator getCreator();


  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(150) //= 0x96. The runtime will prefer the VTID if present
  @VTID(9)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject getParent();


  /**
   * <p>
   * Getter method for the COM property "CubeFieldType"
   * </p>
   * @return  Returns a value of type excel.XlCubeFieldType
   */

  @DISPID(1918) //= 0x77e. The runtime will prefer the VTID if present
  @VTID(10)
  excel.XlCubeFieldType getCubeFieldType();


  /**
   * <p>
   * Getter method for the COM property "_Caption"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(2667) //= 0xa6b. The runtime will prefer the VTID if present
  @VTID(11)
  java.lang.String get_Caption();


  /**
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(110) //= 0x6e. The runtime will prefer the VTID if present
  @VTID(12)
  java.lang.String getName();


  /**
   * <p>
   * Getter method for the COM property "Value"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(13)
  java.lang.String getValue();


  /**
   * <p>
   * Getter method for the COM property "Orientation"
   * </p>
   * @return  Returns a value of type excel.XlPivotFieldOrientation
   */

  @DISPID(134) //= 0x86. The runtime will prefer the VTID if present
  @VTID(14)
  excel.XlPivotFieldOrientation getOrientation();


  /**
   * <p>
   * Setter method for the COM property "Orientation"
   * </p>
   * @param rhs Mandatory excel.XlPivotFieldOrientation parameter.
   */

  @DISPID(134) //= 0x86. The runtime will prefer the VTID if present
  @VTID(15)
  void setOrientation(
    excel.XlPivotFieldOrientation rhs);


  /**
   * <p>
   * Getter method for the COM property "Position"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(133) //= 0x85. The runtime will prefer the VTID if present
  @VTID(16)
  int getPosition();


  /**
   * <p>
   * Setter method for the COM property "Position"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(133) //= 0x85. The runtime will prefer the VTID if present
  @VTID(17)
  void setPosition(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "TreeviewControl"
   * </p>
   * @return  Returns a value of type excel.TreeviewControl
   */

  @DISPID(1919) //= 0x77f. The runtime will prefer the VTID if present
  @VTID(18)
  excel.TreeviewControl getTreeviewControl();


  /**
   * <p>
   * Getter method for the COM property "DragToColumn"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1508) //= 0x5e4. The runtime will prefer the VTID if present
  @VTID(19)
  boolean getDragToColumn();


  /**
   * <p>
   * Setter method for the COM property "DragToColumn"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1508) //= 0x5e4. The runtime will prefer the VTID if present
  @VTID(20)
  void setDragToColumn(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "DragToHide"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1509) //= 0x5e5. The runtime will prefer the VTID if present
  @VTID(21)
  boolean getDragToHide();


  /**
   * <p>
   * Setter method for the COM property "DragToHide"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1509) //= 0x5e5. The runtime will prefer the VTID if present
  @VTID(22)
  void setDragToHide(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "DragToPage"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1510) //= 0x5e6. The runtime will prefer the VTID if present
  @VTID(23)
  boolean getDragToPage();


  /**
   * <p>
   * Setter method for the COM property "DragToPage"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1510) //= 0x5e6. The runtime will prefer the VTID if present
  @VTID(24)
  void setDragToPage(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "DragToRow"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1511) //= 0x5e7. The runtime will prefer the VTID if present
  @VTID(25)
  boolean getDragToRow();


  /**
   * <p>
   * Setter method for the COM property "DragToRow"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1511) //= 0x5e7. The runtime will prefer the VTID if present
  @VTID(26)
  void setDragToRow(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "DragToData"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1844) //= 0x734. The runtime will prefer the VTID if present
  @VTID(27)
  boolean getDragToData();


  /**
   * <p>
   * Setter method for the COM property "DragToData"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1844) //= 0x734. The runtime will prefer the VTID if present
  @VTID(28)
  void setDragToData(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "HiddenLevels"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1920) //= 0x780. The runtime will prefer the VTID if present
  @VTID(29)
  int getHiddenLevels();


  /**
   * <p>
   * Setter method for the COM property "HiddenLevels"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(1920) //= 0x780. The runtime will prefer the VTID if present
  @VTID(30)
  void setHiddenLevels(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "HasMemberProperties"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(2181) //= 0x885. The runtime will prefer the VTID if present
  @VTID(31)
  boolean getHasMemberProperties();


  /**
   * <p>
   * Getter method for the COM property "LayoutForm"
   * </p>
   * @return  Returns a value of type excel.XlLayoutFormType
   */

  @DISPID(1848) //= 0x738. The runtime will prefer the VTID if present
  @VTID(32)
  excel.XlLayoutFormType getLayoutForm();


  /**
   * <p>
   * Setter method for the COM property "LayoutForm"
   * </p>
   * @param rhs Mandatory excel.XlLayoutFormType parameter.
   */

  @DISPID(1848) //= 0x738. The runtime will prefer the VTID if present
  @VTID(33)
  void setLayoutForm(
    excel.XlLayoutFormType rhs);


  /**
   * <p>
   * Getter method for the COM property "PivotFields"
   * </p>
   * @return  Returns a value of type excel.PivotFields
   */

  @DISPID(718) //= 0x2ce. The runtime will prefer the VTID if present
  @VTID(34)
  excel.PivotFields getPivotFields();


  /**
   * @param property Mandatory java.lang.String parameter.
   * @param propertyOrder Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(2182) //= 0x886. The runtime will prefer the VTID if present
  @VTID(35)
  void _AddMemberPropertyField(
    java.lang.String property,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object propertyOrder);


  /**
   * <p>
   * Getter method for the COM property "EnableMultiplePageItems"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(2184) //= 0x888. The runtime will prefer the VTID if present
  @VTID(36)
  boolean getEnableMultiplePageItems();


  /**
   * <p>
   * Setter method for the COM property "EnableMultiplePageItems"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2184) //= 0x888. The runtime will prefer the VTID if present
  @VTID(37)
  void setEnableMultiplePageItems(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "LayoutSubtotalLocation"
   * </p>
   * @return  Returns a value of type excel.XlSubtototalLocationType
   */

  @DISPID(1846) //= 0x736. The runtime will prefer the VTID if present
  @VTID(38)
  excel.XlSubtototalLocationType getLayoutSubtotalLocation();


  /**
   * <p>
   * Setter method for the COM property "LayoutSubtotalLocation"
   * </p>
   * @param rhs Mandatory excel.XlSubtototalLocationType parameter.
   */

  @DISPID(1846) //= 0x736. The runtime will prefer the VTID if present
  @VTID(39)
  void setLayoutSubtotalLocation(
    excel.XlSubtototalLocationType rhs);


  /**
   * <p>
   * Getter method for the COM property "ShowInFieldList"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(2185) //= 0x889. The runtime will prefer the VTID if present
  @VTID(40)
  boolean getShowInFieldList();


  /**
   * <p>
   * Setter method for the COM property "ShowInFieldList"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2185) //= 0x889. The runtime will prefer the VTID if present
  @VTID(41)
  void setShowInFieldList(
    boolean rhs);


  /**
   */

  @DISPID(117) //= 0x75. The runtime will prefer the VTID if present
  @VTID(42)
  void delete();


  /**
   * @param property Mandatory java.lang.String parameter.
   * @param propertyOrder Optional parameter. Default value is com4j.Variant.getMissing()
   * @param propertyDisplayedIn Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(2668) //= 0xa6c. The runtime will prefer the VTID if present
  @VTID(43)
  void addMemberPropertyField(
    java.lang.String property,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object propertyOrder,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object propertyDisplayedIn);


  /**
   * <p>
   * Getter method for the COM property "IncludeNewItemsInFilter"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(2587) //= 0xa1b. The runtime will prefer the VTID if present
  @VTID(44)
  boolean getIncludeNewItemsInFilter();


  /**
   * <p>
   * Setter method for the COM property "IncludeNewItemsInFilter"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2587) //= 0xa1b. The runtime will prefer the VTID if present
  @VTID(45)
  void setIncludeNewItemsInFilter(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "CubeFieldSubType"
   * </p>
   * @return  Returns a value of type excel.XlCubeFieldSubType
   */

  @DISPID(2670) //= 0xa6e. The runtime will prefer the VTID if present
  @VTID(46)
  excel.XlCubeFieldSubType getCubeFieldSubType();


  /**
   * <p>
   * Getter method for the COM property "AllItemsVisible"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(2593) //= 0xa21. The runtime will prefer the VTID if present
  @VTID(47)
  boolean getAllItemsVisible();


  /**
   */

  @DISPID(2594) //= 0xa22. The runtime will prefer the VTID if present
  @VTID(48)
  void clearManualFilter();


  /**
   */

  @DISPID(2671) //= 0xa6f. The runtime will prefer the VTID if present
  @VTID(49)
  void createPivotFields();


  /**
   * <p>
   * Getter method for the COM property "CurrentPageName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1852) //= 0x73c. The runtime will prefer the VTID if present
  @VTID(50)
  java.lang.String getCurrentPageName();


  /**
   * <p>
   * Setter method for the COM property "CurrentPageName"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(1852) //= 0x73c. The runtime will prefer the VTID if present
  @VTID(51)
  void setCurrentPageName(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "IsDate"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(2672) //= 0xa70. The runtime will prefer the VTID if present
  @VTID(52)
  boolean getIsDate();


  /**
   * <p>
   * Getter method for the COM property "Caption"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(139) //= 0x8b. The runtime will prefer the VTID if present
  @VTID(53)
  java.lang.String getCaption();


  /**
   * <p>
   * Setter method for the COM property "Caption"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(139) //= 0x8b. The runtime will prefer the VTID if present
  @VTID(54)
  void setCaption(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "FlattenHierarchies"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(2924) //= 0xb6c. The runtime will prefer the VTID if present
  @VTID(55)
  boolean getFlattenHierarchies();


  /**
   * <p>
   * Setter method for the COM property "FlattenHierarchies"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2924) //= 0xb6c. The runtime will prefer the VTID if present
  @VTID(56)
  void setFlattenHierarchies(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "HierarchizeDistinct"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(2925) //= 0xb6d. The runtime will prefer the VTID if present
  @VTID(57)
  boolean getHierarchizeDistinct();


  /**
   * <p>
   * Setter method for the COM property "HierarchizeDistinct"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2925) //= 0xb6d. The runtime will prefer the VTID if present
  @VTID(58)
  void setHierarchizeDistinct(
    boolean rhs);


  // Properties:
}
