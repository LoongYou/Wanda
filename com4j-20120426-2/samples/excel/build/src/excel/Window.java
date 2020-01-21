package excel  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface Window extends Com4jObject {
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

  @DISPID(304)
  java.lang.Object activate();


  /**
   */

  @DISPID(1115)
  java.lang.Object activateNext();


  /**
   */

  @DISPID(1116)
  java.lang.Object activatePrevious();


  /**
   * <p>
   * Getter method for the COM property "ActiveCell"
   * </p>
   */

  @DISPID(305)
  @PropGet
  excel.Range getActiveCell();


  /**
   * <p>
   * Getter method for the COM property "ActiveChart"
   * </p>
   */

  @DISPID(183)
  @PropGet
  excel._Chart getActiveChart();


  /**
   * <p>
   * Getter method for the COM property "ActivePane"
   * </p>
   */

  @DISPID(642)
  @PropGet
  excel.Pane getActivePane();


  /**
   * <p>
   * Getter method for the COM property "ActiveSheet"
   * </p>
   */

  @DISPID(307)
  @PropGet
  com4j.Com4jObject getActiveSheet();


  /**
   * <p>
   * Getter method for the COM property "Caption"
   * </p>
   */

  @DISPID(139)
  @PropGet
  java.lang.Object getCaption();


  /**
   * <p>
   * Setter method for the COM property "Caption"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(139)
  @PropPut
  void setCaption(
    java.lang.Object rhs);


  /**
   * @param saveChanges Optional parameter. Default value is com4j.Variant.getMissing()
   * @param filename Optional parameter. Default value is com4j.Variant.getMissing()
   * @param routeWorkbook Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(277)
  boolean close(
    @Optional java.lang.Object saveChanges,
    @Optional java.lang.Object filename,
    @Optional java.lang.Object routeWorkbook);


  /**
   * <p>
   * Getter method for the COM property "DisplayFormulas"
   * </p>
   */

  @DISPID(644)
  @PropGet
  boolean getDisplayFormulas();


  /**
   * <p>
   * Setter method for the COM property "DisplayFormulas"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(644)
  @PropPut
  void setDisplayFormulas(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "DisplayGridlines"
   * </p>
   */

  @DISPID(645)
  @PropGet
  boolean getDisplayGridlines();


  /**
   * <p>
   * Setter method for the COM property "DisplayGridlines"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(645)
  @PropPut
  void setDisplayGridlines(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "DisplayHeadings"
   * </p>
   */

  @DISPID(646)
  @PropGet
  boolean getDisplayHeadings();


  /**
   * <p>
   * Setter method for the COM property "DisplayHeadings"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(646)
  @PropPut
  void setDisplayHeadings(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "DisplayHorizontalScrollBar"
   * </p>
   */

  @DISPID(921)
  @PropGet
  boolean getDisplayHorizontalScrollBar();


  /**
   * <p>
   * Setter method for the COM property "DisplayHorizontalScrollBar"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(921)
  @PropPut
  void setDisplayHorizontalScrollBar(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "DisplayOutline"
   * </p>
   */

  @DISPID(647)
  @PropGet
  boolean getDisplayOutline();


  /**
   * <p>
   * Setter method for the COM property "DisplayOutline"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(647)
  @PropPut
  void setDisplayOutline(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "_DisplayRightToLeft"
   * </p>
   */

  @DISPID(648)
  @PropGet
  boolean get_DisplayRightToLeft();


  /**
   * <p>
   * Setter method for the COM property "_DisplayRightToLeft"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(648)
  @PropPut
  void set_DisplayRightToLeft(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "DisplayVerticalScrollBar"
   * </p>
   */

  @DISPID(922)
  @PropGet
  boolean getDisplayVerticalScrollBar();


  /**
   * <p>
   * Setter method for the COM property "DisplayVerticalScrollBar"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(922)
  @PropPut
  void setDisplayVerticalScrollBar(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "DisplayWorkbookTabs"
   * </p>
   */

  @DISPID(923)
  @PropGet
  boolean getDisplayWorkbookTabs();


  /**
   * <p>
   * Setter method for the COM property "DisplayWorkbookTabs"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(923)
  @PropPut
  void setDisplayWorkbookTabs(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "DisplayZeros"
   * </p>
   */

  @DISPID(649)
  @PropGet
  boolean getDisplayZeros();


  /**
   * <p>
   * Setter method for the COM property "DisplayZeros"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(649)
  @PropPut
  void setDisplayZeros(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "EnableResize"
   * </p>
   */

  @DISPID(1192)
  @PropGet
  boolean getEnableResize();


  /**
   * <p>
   * Setter method for the COM property "EnableResize"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1192)
  @PropPut
  void setEnableResize(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "FreezePanes"
   * </p>
   */

  @DISPID(650)
  @PropGet
  boolean getFreezePanes();


  /**
   * <p>
   * Setter method for the COM property "FreezePanes"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(650)
  @PropPut
  void setFreezePanes(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "GridlineColor"
   * </p>
   */

  @DISPID(651)
  @PropGet
  int getGridlineColor();


  /**
   * <p>
   * Setter method for the COM property "GridlineColor"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(651)
  @PropPut
  void setGridlineColor(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "GridlineColorIndex"
   * </p>
   */

  @DISPID(652)
  @PropGet
  excel.XlColorIndex getGridlineColorIndex();


  /**
   * <p>
   * Setter method for the COM property "GridlineColorIndex"
   * </p>
   * @param rhs Mandatory excel.XlColorIndex parameter.
   */

  @DISPID(652)
  @PropPut
  void setGridlineColorIndex(
    excel.XlColorIndex rhs);


  /**
   * <p>
   * Getter method for the COM property "Height"
   * </p>
   */

  @DISPID(123)
  @PropGet
  double getHeight();


  /**
   * <p>
   * Setter method for the COM property "Height"
   * </p>
   * @param rhs Mandatory double parameter.
   */

  @DISPID(123)
  @PropPut
  void setHeight(
    double rhs);


  /**
   * <p>
   * Getter method for the COM property "Index"
   * </p>
   */

  @DISPID(486)
  @PropGet
  int getIndex();


  /**
   * @param down Optional parameter. Default value is com4j.Variant.getMissing()
   * @param up Optional parameter. Default value is com4j.Variant.getMissing()
   * @param toRight Optional parameter. Default value is com4j.Variant.getMissing()
   * @param toLeft Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(547)
  java.lang.Object largeScroll(
    @Optional java.lang.Object down,
    @Optional java.lang.Object up,
    @Optional java.lang.Object toRight,
    @Optional java.lang.Object toLeft);


  /**
   * <p>
   * Getter method for the COM property "Left"
   * </p>
   */

  @DISPID(127)
  @PropGet
  double getLeft();


  /**
   * <p>
   * Setter method for the COM property "Left"
   * </p>
   * @param rhs Mandatory double parameter.
   */

  @DISPID(127)
  @PropPut
  void setLeft(
    double rhs);


  /**
   */

  @DISPID(280)
  excel.Window newWindow();


  /**
   * <p>
   * Getter method for the COM property "OnWindow"
   * </p>
   */

  @DISPID(623)
  @PropGet
  java.lang.String getOnWindow();


  /**
   * <p>
   * Setter method for the COM property "OnWindow"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(623)
  @PropPut
  void setOnWindow(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "Panes"
   * </p>
   */

  @DISPID(653)
  @PropGet
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
   */

  @DISPID(1772)
  java.lang.Object _PrintOut(
    @Optional java.lang.Object from,
    @Optional java.lang.Object to,
    @Optional java.lang.Object copies,
    @Optional java.lang.Object preview,
    @Optional java.lang.Object activePrinter,
    @Optional java.lang.Object printToFile,
    @Optional java.lang.Object collate,
    @Optional java.lang.Object prToFileName);


  /**
   * @param enableChanges Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(281)
  java.lang.Object printPreview(
    @Optional java.lang.Object enableChanges);


  /**
   * <p>
   * Getter method for the COM property "RangeSelection"
   * </p>
   */

  @DISPID(1189)
  @PropGet
  excel.Range getRangeSelection();


  /**
   * <p>
   * Getter method for the COM property "ScrollColumn"
   * </p>
   */

  @DISPID(654)
  @PropGet
  int getScrollColumn();


  /**
   * <p>
   * Setter method for the COM property "ScrollColumn"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(654)
  @PropPut
  void setScrollColumn(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "ScrollRow"
   * </p>
   */

  @DISPID(655)
  @PropGet
  int getScrollRow();


  /**
   * <p>
   * Setter method for the COM property "ScrollRow"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(655)
  @PropPut
  void setScrollRow(
    int rhs);


  /**
   * @param sheets Optional parameter. Default value is com4j.Variant.getMissing()
   * @param position Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(662)
  java.lang.Object scrollWorkbookTabs(
    @Optional java.lang.Object sheets,
    @Optional java.lang.Object position);


  /**
   * <p>
   * Getter method for the COM property "SelectedSheets"
   * </p>
   */

  @DISPID(656)
  @PropGet
  excel.Sheets getSelectedSheets();


  /**
   * <p>
   * Getter method for the COM property "Selection"
   * </p>
   */

  @DISPID(147)
  @PropGet
  com4j.Com4jObject getSelection();


  /**
   * @param down Optional parameter. Default value is com4j.Variant.getMissing()
   * @param up Optional parameter. Default value is com4j.Variant.getMissing()
   * @param toRight Optional parameter. Default value is com4j.Variant.getMissing()
   * @param toLeft Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(548)
  java.lang.Object smallScroll(
    @Optional java.lang.Object down,
    @Optional java.lang.Object up,
    @Optional java.lang.Object toRight,
    @Optional java.lang.Object toLeft);


  /**
   * <p>
   * Getter method for the COM property "Split"
   * </p>
   */

  @DISPID(657)
  @PropGet
  boolean getSplit();


  /**
   * <p>
   * Setter method for the COM property "Split"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(657)
  @PropPut
  void setSplit(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "SplitColumn"
   * </p>
   */

  @DISPID(658)
  @PropGet
  int getSplitColumn();


  /**
   * <p>
   * Setter method for the COM property "SplitColumn"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(658)
  @PropPut
  void setSplitColumn(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "SplitHorizontal"
   * </p>
   */

  @DISPID(659)
  @PropGet
  double getSplitHorizontal();


  /**
   * <p>
   * Setter method for the COM property "SplitHorizontal"
   * </p>
   * @param rhs Mandatory double parameter.
   */

  @DISPID(659)
  @PropPut
  void setSplitHorizontal(
    double rhs);


  /**
   * <p>
   * Getter method for the COM property "SplitRow"
   * </p>
   */

  @DISPID(660)
  @PropGet
  int getSplitRow();


  /**
   * <p>
   * Setter method for the COM property "SplitRow"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(660)
  @PropPut
  void setSplitRow(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "SplitVertical"
   * </p>
   */

  @DISPID(661)
  @PropGet
  double getSplitVertical();


  /**
   * <p>
   * Setter method for the COM property "SplitVertical"
   * </p>
   * @param rhs Mandatory double parameter.
   */

  @DISPID(661)
  @PropPut
  void setSplitVertical(
    double rhs);


  /**
   * <p>
   * Getter method for the COM property "TabRatio"
   * </p>
   */

  @DISPID(673)
  @PropGet
  double getTabRatio();


  /**
   * <p>
   * Setter method for the COM property "TabRatio"
   * </p>
   * @param rhs Mandatory double parameter.
   */

  @DISPID(673)
  @PropPut
  void setTabRatio(
    double rhs);


  /**
   * <p>
   * Getter method for the COM property "Top"
   * </p>
   */

  @DISPID(126)
  @PropGet
  double getTop();


  /**
   * <p>
   * Setter method for the COM property "Top"
   * </p>
   * @param rhs Mandatory double parameter.
   */

  @DISPID(126)
  @PropPut
  void setTop(
    double rhs);


  /**
   * <p>
   * Getter method for the COM property "Type"
   * </p>
   */

  @DISPID(108)
  @PropGet
  excel.XlWindowType getType();


  /**
   * <p>
   * Getter method for the COM property "UsableHeight"
   * </p>
   */

  @DISPID(389)
  @PropGet
  double getUsableHeight();


  /**
   * <p>
   * Getter method for the COM property "UsableWidth"
   * </p>
   */

  @DISPID(390)
  @PropGet
  double getUsableWidth();


  /**
   * <p>
   * Getter method for the COM property "Visible"
   * </p>
   */

  @DISPID(558)
  @PropGet
  boolean getVisible();


  /**
   * <p>
   * Setter method for the COM property "Visible"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(558)
  @PropPut
  void setVisible(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "VisibleRange"
   * </p>
   */

  @DISPID(1118)
  @PropGet
  excel.Range getVisibleRange();


  /**
   * <p>
   * Getter method for the COM property "Width"
   * </p>
   */

  @DISPID(122)
  @PropGet
  double getWidth();


  /**
   * <p>
   * Setter method for the COM property "Width"
   * </p>
   * @param rhs Mandatory double parameter.
   */

  @DISPID(122)
  @PropPut
  void setWidth(
    double rhs);


  /**
   * <p>
   * Getter method for the COM property "WindowNumber"
   * </p>
   */

  @DISPID(1119)
  @PropGet
  int getWindowNumber();


  /**
   * <p>
   * Getter method for the COM property "WindowState"
   * </p>
   */

  @DISPID(396)
  @PropGet
  excel.XlWindowState getWindowState();


  /**
   * <p>
   * Setter method for the COM property "WindowState"
   * </p>
   * @param rhs Mandatory excel.XlWindowState parameter.
   */

  @DISPID(396)
  @PropPut
  void setWindowState(
    excel.XlWindowState rhs);


  /**
   * <p>
   * Getter method for the COM property "Zoom"
   * </p>
   */

  @DISPID(663)
  @PropGet
  java.lang.Object getZoom();


  /**
   * <p>
   * Setter method for the COM property "Zoom"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(663)
  @PropPut
  void setZoom(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "View"
   * </p>
   */

  @DISPID(1194)
  @PropGet
  excel.XlWindowView getView();


  /**
   * <p>
   * Setter method for the COM property "View"
   * </p>
   * @param rhs Mandatory excel.XlWindowView parameter.
   */

  @DISPID(1194)
  @PropPut
  void setView(
    excel.XlWindowView rhs);


  /**
   * <p>
   * Getter method for the COM property "DisplayRightToLeft"
   * </p>
   */

  @DISPID(1774)
  @PropGet
  boolean getDisplayRightToLeft();


  /**
   * <p>
   * Setter method for the COM property "DisplayRightToLeft"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1774)
  @PropPut
  void setDisplayRightToLeft(
    boolean rhs);


  /**
   * @param points Mandatory int parameter.
   */

  @DISPID(1776)
  int pointsToScreenPixelsX(
    int points);


  /**
   * @param points Mandatory int parameter.
   */

  @DISPID(1777)
  int pointsToScreenPixelsY(
    int points);


  /**
   * @param x Mandatory int parameter.
   * @param y Mandatory int parameter.
   */

  @DISPID(1778)
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

  @DISPID(1781)
  void scrollIntoView(
    int left,
    int top,
    int width,
    int height,
    @Optional java.lang.Object start);


  /**
   * <p>
   * Getter method for the COM property "SheetViews"
   * </p>
   */

  @DISPID(2368)
  @PropGet
  excel.SheetViews getSheetViews();


  /**
   * <p>
   * Getter method for the COM property "ActiveSheetView"
   * </p>
   */

  @DISPID(2369)
  @PropGet
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
   */

  @DISPID(2361)
  java.lang.Object printOut(
    @Optional java.lang.Object from,
    @Optional java.lang.Object to,
    @Optional java.lang.Object copies,
    @Optional java.lang.Object preview,
    @Optional java.lang.Object activePrinter,
    @Optional java.lang.Object printToFile,
    @Optional java.lang.Object collate,
    @Optional java.lang.Object prToFileName);


  /**
   * <p>
   * Getter method for the COM property "DisplayRuler"
   * </p>
   */

  @DISPID(2370)
  @PropGet
  boolean getDisplayRuler();


  /**
   * <p>
   * Setter method for the COM property "DisplayRuler"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2370)
  @PropPut
  void setDisplayRuler(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "AutoFilterDateGrouping"
   * </p>
   */

  @DISPID(2371)
  @PropGet
  boolean getAutoFilterDateGrouping();


  /**
   * <p>
   * Setter method for the COM property "AutoFilterDateGrouping"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2371)
  @PropPut
  void setAutoFilterDateGrouping(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "DisplayWhitespace"
   * </p>
   */

  @DISPID(2372)
  @PropGet
  boolean getDisplayWhitespace();


  /**
   * <p>
   * Setter method for the COM property "DisplayWhitespace"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2372)
  @PropPut
  void setDisplayWhitespace(
    boolean rhs);


  // Properties:
}
