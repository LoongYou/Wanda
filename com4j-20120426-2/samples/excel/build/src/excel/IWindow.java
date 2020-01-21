package excel  ;

import com4j.*;

@IID("{00020893-0001-0000-C000-000000000046}")
public interface IWindow extends Com4jObject {
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
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(10)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object activate();


  /**
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(11)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object activateNext();


  /**
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(12)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object activatePrevious();


  /**
   * <p>
   * Getter method for the COM property "ActiveCell"
   * </p>
   * @return  Returns a value of type excel.Range
   */

  @VTID(13)
  excel.Range getActiveCell();


  /**
   * <p>
   * Getter method for the COM property "ActiveChart"
   * </p>
   * @return  Returns a value of type excel._Chart
   */

  @VTID(14)
  excel._Chart getActiveChart();


  /**
   * <p>
   * Getter method for the COM property "ActivePane"
   * </p>
   * @return  Returns a value of type excel.Pane
   */

  @VTID(15)
  excel.Pane getActivePane();


  /**
   * <p>
   * Getter method for the COM property "ActiveSheet"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @VTID(16)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject getActiveSheet();


  /**
   * <p>
   * Getter method for the COM property "Caption"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(17)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object getCaption();


  /**
   * <p>
   * Setter method for the COM property "Caption"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @VTID(18)
  void setCaption(
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   * @param saveChanges Optional parameter. Default value is com4j.Variant.getMissing()
   * @param filename Optional parameter. Default value is com4j.Variant.getMissing()
   * @param routeWorkbook Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type boolean
   */

  @VTID(19)
  boolean close(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object saveChanges,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object filename,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object routeWorkbook);


  /**
   * <p>
   * Getter method for the COM property "DisplayFormulas"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(20)
  boolean getDisplayFormulas();


  /**
   * <p>
   * Setter method for the COM property "DisplayFormulas"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(21)
  void setDisplayFormulas(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "DisplayGridlines"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(22)
  boolean getDisplayGridlines();


  /**
   * <p>
   * Setter method for the COM property "DisplayGridlines"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(23)
  void setDisplayGridlines(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "DisplayHeadings"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(24)
  boolean getDisplayHeadings();


  /**
   * <p>
   * Setter method for the COM property "DisplayHeadings"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(25)
  void setDisplayHeadings(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "DisplayHorizontalScrollBar"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(26)
  boolean getDisplayHorizontalScrollBar();


  /**
   * <p>
   * Setter method for the COM property "DisplayHorizontalScrollBar"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(27)
  void setDisplayHorizontalScrollBar(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "DisplayOutline"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(28)
  boolean getDisplayOutline();


  /**
   * <p>
   * Setter method for the COM property "DisplayOutline"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(29)
  void setDisplayOutline(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "_DisplayRightToLeft"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(30)
  boolean get_DisplayRightToLeft();


  /**
   * <p>
   * Setter method for the COM property "_DisplayRightToLeft"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(31)
  void set_DisplayRightToLeft(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "DisplayVerticalScrollBar"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(32)
  boolean getDisplayVerticalScrollBar();


  /**
   * <p>
   * Setter method for the COM property "DisplayVerticalScrollBar"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(33)
  void setDisplayVerticalScrollBar(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "DisplayWorkbookTabs"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(34)
  boolean getDisplayWorkbookTabs();


  /**
   * <p>
   * Setter method for the COM property "DisplayWorkbookTabs"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(35)
  void setDisplayWorkbookTabs(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "DisplayZeros"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(36)
  boolean getDisplayZeros();


  /**
   * <p>
   * Setter method for the COM property "DisplayZeros"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(37)
  void setDisplayZeros(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "EnableResize"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(38)
  boolean getEnableResize();


  /**
   * <p>
   * Setter method for the COM property "EnableResize"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(39)
  void setEnableResize(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "FreezePanes"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(40)
  boolean getFreezePanes();


  /**
   * <p>
   * Setter method for the COM property "FreezePanes"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(41)
  void setFreezePanes(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "GridlineColor"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(42)
  int getGridlineColor();


  /**
   * <p>
   * Setter method for the COM property "GridlineColor"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @VTID(43)
  void setGridlineColor(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "GridlineColorIndex"
   * </p>
   * @return  Returns a value of type excel.XlColorIndex
   */

  @VTID(44)
  excel.XlColorIndex getGridlineColorIndex();


  /**
   * <p>
   * Setter method for the COM property "GridlineColorIndex"
   * </p>
   * @param rhs Mandatory excel.XlColorIndex parameter.
   */

  @VTID(45)
  void setGridlineColorIndex(
    excel.XlColorIndex rhs);


  /**
   * <p>
   * Getter method for the COM property "Height"
   * </p>
   * @return  Returns a value of type double
   */

  @VTID(46)
  double getHeight();


  /**
   * <p>
   * Setter method for the COM property "Height"
   * </p>
   * @param rhs Mandatory double parameter.
   */

  @VTID(47)
  void setHeight(
    double rhs);


  /**
   * <p>
   * Getter method for the COM property "Index"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(48)
  int getIndex();


  /**
   * @param down Optional parameter. Default value is com4j.Variant.getMissing()
   * @param up Optional parameter. Default value is com4j.Variant.getMissing()
   * @param toRight Optional parameter. Default value is com4j.Variant.getMissing()
   * @param toLeft Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(49)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object largeScroll(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object down,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object up,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object toRight,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object toLeft);


  /**
   * <p>
   * Getter method for the COM property "Left"
   * </p>
   * @return  Returns a value of type double
   */

  @VTID(50)
  double getLeft();


  /**
   * <p>
   * Setter method for the COM property "Left"
   * </p>
   * @param rhs Mandatory double parameter.
   */

  @VTID(51)
  void setLeft(
    double rhs);


  /**
   * @return  Returns a value of type excel.Window
   */

  @VTID(52)
  excel.Window newWindow();


  /**
   * <p>
   * Getter method for the COM property "OnWindow"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(53)
  java.lang.String getOnWindow();


  /**
   * <p>
   * Setter method for the COM property "OnWindow"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(54)
  void setOnWindow(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "Panes"
   * </p>
   * @return  Returns a value of type excel.Panes
   */

  @VTID(55)
  excel.Panes getPanes();


  /**
   * @param from Optional parameter. Default value is com4j.Variant.getMissing()
   * @param to Optional parameter. Default value is com4j.Variant.getMissing()
   * @param copies Optional parameter. Default value is com4j.Variant.getMissing()
   * @param preview Optional parameter. Default value is com4j.Variant.getMissing()
   * @param activePrinter Optional parameter. Default value is com4j.Variant.getMissing()
   * @param printToFile Optional parameter. Default value is com4j.Variant.getMissing()
   * @param collate Optional parameter. Default value is com4j.Variant.getMissing()
   * @param prToFileName Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(56)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object _PrintOut(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object from,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object to,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object copies,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object preview,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object activePrinter,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object printToFile,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object collate,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object prToFileName);


  /**
   * @param enableChanges Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(57)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object printPreview(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object enableChanges);


  /**
   * <p>
   * Getter method for the COM property "RangeSelection"
   * </p>
   * @return  Returns a value of type excel.Range
   */

  @VTID(58)
  excel.Range getRangeSelection();


  /**
   * <p>
   * Getter method for the COM property "ScrollColumn"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(59)
  int getScrollColumn();


  /**
   * <p>
   * Setter method for the COM property "ScrollColumn"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @VTID(60)
  void setScrollColumn(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "ScrollRow"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(61)
  int getScrollRow();


  /**
   * <p>
   * Setter method for the COM property "ScrollRow"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @VTID(62)
  void setScrollRow(
    int rhs);


  /**
   * @param sheets Optional parameter. Default value is com4j.Variant.getMissing()
   * @param position Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(63)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object scrollWorkbookTabs(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object sheets,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object position);


  /**
   * <p>
   * Getter method for the COM property "SelectedSheets"
   * </p>
   * @return  Returns a value of type excel.Sheets
   */

  @VTID(64)
  excel.Sheets getSelectedSheets();


  @VTID(64)
  @ReturnValue(type=NativeType.Dispatch,defaultPropertyThrough={excel.Sheets.class})
  com4j.Com4jObject getSelectedSheets(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);

  /**
   * <p>
   * Getter method for the COM property "Selection"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @VTID(65)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject getSelection();


  /**
   * @param down Optional parameter. Default value is com4j.Variant.getMissing()
   * @param up Optional parameter. Default value is com4j.Variant.getMissing()
   * @param toRight Optional parameter. Default value is com4j.Variant.getMissing()
   * @param toLeft Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(66)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object smallScroll(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object down,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object up,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object toRight,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object toLeft);


  /**
   * <p>
   * Getter method for the COM property "Split"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(67)
  boolean getSplit();


  /**
   * <p>
   * Setter method for the COM property "Split"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(68)
  void setSplit(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "SplitColumn"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(69)
  int getSplitColumn();


  /**
   * <p>
   * Setter method for the COM property "SplitColumn"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @VTID(70)
  void setSplitColumn(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "SplitHorizontal"
   * </p>
   * @return  Returns a value of type double
   */

  @VTID(71)
  double getSplitHorizontal();


  /**
   * <p>
   * Setter method for the COM property "SplitHorizontal"
   * </p>
   * @param rhs Mandatory double parameter.
   */

  @VTID(72)
  void setSplitHorizontal(
    double rhs);


  /**
   * <p>
   * Getter method for the COM property "SplitRow"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(73)
  int getSplitRow();


  /**
   * <p>
   * Setter method for the COM property "SplitRow"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @VTID(74)
  void setSplitRow(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "SplitVertical"
   * </p>
   * @return  Returns a value of type double
   */

  @VTID(75)
  double getSplitVertical();


  /**
   * <p>
   * Setter method for the COM property "SplitVertical"
   * </p>
   * @param rhs Mandatory double parameter.
   */

  @VTID(76)
  void setSplitVertical(
    double rhs);


  /**
   * <p>
   * Getter method for the COM property "TabRatio"
   * </p>
   * @return  Returns a value of type double
   */

  @VTID(77)
  double getTabRatio();


  /**
   * <p>
   * Setter method for the COM property "TabRatio"
   * </p>
   * @param rhs Mandatory double parameter.
   */

  @VTID(78)
  void setTabRatio(
    double rhs);


  /**
   * <p>
   * Getter method for the COM property "Top"
   * </p>
   * @return  Returns a value of type double
   */

  @VTID(79)
  double getTop();


  /**
   * <p>
   * Setter method for the COM property "Top"
   * </p>
   * @param rhs Mandatory double parameter.
   */

  @VTID(80)
  void setTop(
    double rhs);


  /**
   * <p>
   * Getter method for the COM property "Type"
   * </p>
   * @return  Returns a value of type excel.XlWindowType
   */

  @VTID(81)
  excel.XlWindowType getType();


  /**
   * <p>
   * Getter method for the COM property "UsableHeight"
   * </p>
   * @return  Returns a value of type double
   */

  @VTID(82)
  double getUsableHeight();


  /**
   * <p>
   * Getter method for the COM property "UsableWidth"
   * </p>
   * @return  Returns a value of type double
   */

  @VTID(83)
  double getUsableWidth();


  /**
   * <p>
   * Getter method for the COM property "Visible"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(84)
  boolean getVisible();


  /**
   * <p>
   * Setter method for the COM property "Visible"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(85)
  void setVisible(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "VisibleRange"
   * </p>
   * @return  Returns a value of type excel.Range
   */

  @VTID(86)
  excel.Range getVisibleRange();


  /**
   * <p>
   * Getter method for the COM property "Width"
   * </p>
   * @return  Returns a value of type double
   */

  @VTID(87)
  double getWidth();


  /**
   * <p>
   * Setter method for the COM property "Width"
   * </p>
   * @param rhs Mandatory double parameter.
   */

  @VTID(88)
  void setWidth(
    double rhs);


  /**
   * <p>
   * Getter method for the COM property "WindowNumber"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(89)
  int getWindowNumber();


  /**
   * <p>
   * Getter method for the COM property "WindowState"
   * </p>
   * @return  Returns a value of type excel.XlWindowState
   */

  @VTID(90)
  excel.XlWindowState getWindowState();


  /**
   * <p>
   * Setter method for the COM property "WindowState"
   * </p>
   * @param rhs Mandatory excel.XlWindowState parameter.
   */

  @VTID(91)
  void setWindowState(
    excel.XlWindowState rhs);


  /**
   * <p>
   * Getter method for the COM property "Zoom"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(92)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object getZoom();


  /**
   * <p>
   * Setter method for the COM property "Zoom"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @VTID(93)
  void setZoom(
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "View"
   * </p>
   * @return  Returns a value of type excel.XlWindowView
   */

  @VTID(94)
  excel.XlWindowView getView();


  /**
   * <p>
   * Setter method for the COM property "View"
   * </p>
   * @param rhs Mandatory excel.XlWindowView parameter.
   */

  @VTID(95)
  void setView(
    excel.XlWindowView rhs);


  /**
   * <p>
   * Getter method for the COM property "DisplayRightToLeft"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(96)
  boolean getDisplayRightToLeft();


  /**
   * <p>
   * Setter method for the COM property "DisplayRightToLeft"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(97)
  void setDisplayRightToLeft(
    boolean rhs);


  /**
   * @param points Mandatory int parameter.
   * @return  Returns a value of type int
   */

  @VTID(98)
  int pointsToScreenPixelsX(
    int points);


  /**
   * @param points Mandatory int parameter.
   * @return  Returns a value of type int
   */

  @VTID(99)
  int pointsToScreenPixelsY(
    int points);


  /**
   * @param x Mandatory int parameter.
   * @param y Mandatory int parameter.
   * @return  Returns a value of type com4j.Com4jObject
   */

  @VTID(100)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject rangeFromPoint(
    int x,
    int y);


  /**
   * @param left Mandatory int parameter.
   * @param top Mandatory int parameter.
   * @param width Mandatory int parameter.
   * @param height Mandatory int parameter.
   * @param start Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @VTID(101)
  void scrollIntoView(
    int left,
    int top,
    int width,
    int height,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object start);


  /**
   * <p>
   * Getter method for the COM property "SheetViews"
   * </p>
   * @return  Returns a value of type excel.SheetViews
   */

  @VTID(102)
  excel.SheetViews getSheetViews();


  /**
   * <p>
   * Getter method for the COM property "ActiveSheetView"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @VTID(103)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject getActiveSheetView();


  /**
   * @param from Optional parameter. Default value is com4j.Variant.getMissing()
   * @param to Optional parameter. Default value is com4j.Variant.getMissing()
   * @param copies Optional parameter. Default value is com4j.Variant.getMissing()
   * @param preview Optional parameter. Default value is com4j.Variant.getMissing()
   * @param activePrinter Optional parameter. Default value is com4j.Variant.getMissing()
   * @param printToFile Optional parameter. Default value is com4j.Variant.getMissing()
   * @param collate Optional parameter. Default value is com4j.Variant.getMissing()
   * @param prToFileName Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(104)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object printOut(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object from,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object to,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object copies,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object preview,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object activePrinter,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object printToFile,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object collate,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object prToFileName);


  /**
   * <p>
   * Getter method for the COM property "DisplayRuler"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(105)
  boolean getDisplayRuler();


  /**
   * <p>
   * Setter method for the COM property "DisplayRuler"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(106)
  void setDisplayRuler(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "AutoFilterDateGrouping"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(107)
  boolean getAutoFilterDateGrouping();


  /**
   * <p>
   * Setter method for the COM property "AutoFilterDateGrouping"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(108)
  void setAutoFilterDateGrouping(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "DisplayWhitespace"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(109)
  boolean getDisplayWhitespace();


  /**
   * <p>
   * Setter method for the COM property "DisplayWhitespace"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(110)
  void setDisplayWhitespace(
    boolean rhs);


  // Properties:
}
