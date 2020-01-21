package excel  ;

import com4j.*;

@IID("{000244C4-0001-0000-C000-000000000046}")
public interface ISlicerCache extends Com4jObject {
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
   * <p>
   * Getter method for the COM property "Index"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(10)
  int getIndex();


  /**
   * <p>
   * Getter method for the COM property "OLAP"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(11)
  boolean getOLAP();


  /**
   * <p>
   * Getter method for the COM property "SourceType"
   * </p>
   * @return  Returns a value of type excel.XlPivotTableSourceType
   */

  @VTID(12)
  excel.XlPivotTableSourceType getSourceType();


  /**
   * <p>
   * Getter method for the COM property "WorkbookConnection"
   * </p>
   * @return  Returns a value of type excel.WorkbookConnection
   */

  @VTID(13)
  excel.WorkbookConnection getWorkbookConnection();


  /**
   * <p>
   * Getter method for the COM property "Slicers"
   * </p>
   * @return  Returns a value of type excel.Slicers
   */

  @VTID(14)
  excel.Slicers getSlicers();


  /**
   * <p>
   * Getter method for the COM property "PivotTables"
   * </p>
   * @return  Returns a value of type excel.SlicerPivotTables
   */

  @VTID(15)
  excel.SlicerPivotTables getPivotTables();


  /**
   * <p>
   * Getter method for the COM property "SlicerCacheLevels"
   * </p>
   * @return  Returns a value of type excel.SlicerCacheLevels
   */

  @VTID(16)
  excel.SlicerCacheLevels getSlicerCacheLevels();


  /**
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(17)
  java.lang.String getName();


  /**
   * <p>
   * Setter method for the COM property "Name"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(18)
  void setName(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "VisibleSlicerItems"
   * </p>
   * @return  Returns a value of type excel.SlicerItems
   */

  @VTID(19)
  excel.SlicerItems getVisibleSlicerItems();


  /**
   * <p>
   * Getter method for the COM property "VisibleSlicerItemsList"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(20)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object getVisibleSlicerItemsList();


  /**
   * <p>
   * Setter method for the COM property "VisibleSlicerItemsList"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @VTID(21)
  void setVisibleSlicerItemsList(
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "SlicerItems"
   * </p>
   * @return  Returns a value of type excel.SlicerItems
   */

  @VTID(22)
  excel.SlicerItems getSlicerItems();


  /**
   * <p>
   * Getter method for the COM property "CrossFilterType"
   * </p>
   * @return  Returns a value of type excel.XlSlicerCrossFilterType
   */

  @VTID(23)
  excel.XlSlicerCrossFilterType getCrossFilterType();


  /**
   * <p>
   * Setter method for the COM property "CrossFilterType"
   * </p>
   * @param rhs Mandatory excel.XlSlicerCrossFilterType parameter.
   */

  @VTID(24)
  void setCrossFilterType(
    excel.XlSlicerCrossFilterType rhs);


  /**
   * <p>
   * Getter method for the COM property "SortItems"
   * </p>
   * @return  Returns a value of type excel.XlSlicerSort
   */

  @VTID(25)
  excel.XlSlicerSort getSortItems();


  /**
   * <p>
   * Setter method for the COM property "SortItems"
   * </p>
   * @param rhs Mandatory excel.XlSlicerSort parameter.
   */

  @VTID(26)
  void setSortItems(
    excel.XlSlicerSort rhs);


  /**
   * <p>
   * Getter method for the COM property "SourceName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(27)
  java.lang.String getSourceName();


  /**
   * <p>
   * Getter method for the COM property "SortUsingCustomLists"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(28)
  boolean getSortUsingCustomLists();


  /**
   * <p>
   * Setter method for the COM property "SortUsingCustomLists"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(29)
  void setSortUsingCustomLists(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "ShowAllItems"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(30)
  boolean getShowAllItems();


  /**
   * <p>
   * Setter method for the COM property "ShowAllItems"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(31)
  void setShowAllItems(
    boolean rhs);


  /**
   */

  @VTID(32)
  void clearManualFilter();


  /**
   */

  @VTID(33)
  void delete();


  // Properties:
}
