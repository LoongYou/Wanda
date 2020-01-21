package excel  ;

import com4j.*;

@IID("{0002086D-0001-0000-C000-000000000046}")
public interface ICharts extends Com4jObject,Iterable<Com4jObject> {
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
   * @param before Optional parameter. Default value is com4j.Variant.getMissing()
   * @param after Optional parameter. Default value is com4j.Variant.getMissing()
   * @param count Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type excel._Chart
   */

  @VTID(10)
  excel._Chart add(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object before,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object after,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object count);


  /**
   * @param before Optional parameter. Default value is com4j.Variant.getMissing()
   * @param after Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   */

  @VTID(11)
  void copy(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object before,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object after,
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "Count"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(12)
  int getCount();


  /**
   * @param lcid Mandatory int parameter.
   */

  @VTID(13)
  void delete(
    @LCID int lcid);


  /**
   */

  @VTID(14)
  void _Dummy7();


  /**
   * <p>
   * Getter method for the COM property "Item"
   * </p>
   * @param index Mandatory java.lang.Object parameter.
   * @return  Returns a value of type com4j.Com4jObject
   */

  @VTID(15)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject getItem(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);


  /**
   * @param before Optional parameter. Default value is com4j.Variant.getMissing()
   * @param after Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   */

  @VTID(16)
  void move(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object before,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object after,
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "_NewEnum"
   * </p>
   */

  @VTID(17)
  java.util.Iterator<Com4jObject> iterator();

  /**
   * @param from Optional parameter. Default value is com4j.Variant.getMissing()
   * @param to Optional parameter. Default value is com4j.Variant.getMissing()
   * @param copies Optional parameter. Default value is com4j.Variant.getMissing()
   * @param preview Optional parameter. Default value is com4j.Variant.getMissing()
   * @param activePrinter Optional parameter. Default value is com4j.Variant.getMissing()
   * @param printToFile Optional parameter. Default value is com4j.Variant.getMissing()
   * @param collate Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   */

  @VTID(18)
  void __PrintOut(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object from,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object to,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object copies,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object preview,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object activePrinter,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object printToFile,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object collate,
    @LCID int lcid);


  /**
   * @param enableChanges Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   */

  @VTID(19)
  void printPreview(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object enableChanges,
    @LCID int lcid);


  /**
   * @param replace Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   */

  @VTID(20)
  void select(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object replace,
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "HPageBreaks"
   * </p>
   * @return  Returns a value of type excel.HPageBreaks
   */

  @VTID(21)
  excel.HPageBreaks getHPageBreaks();


  /**
   * <p>
   * Getter method for the COM property "VPageBreaks"
   * </p>
   * @return  Returns a value of type excel.VPageBreaks
   */

  @VTID(22)
  excel.VPageBreaks getVPageBreaks();


  /**
   * <p>
   * Getter method for the COM property "Visible"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(23)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object getVisible(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "Visible"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @VTID(24)
  void setVisible(
    @LCID int lcid,
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "_Default"
   * </p>
   * @param index Mandatory java.lang.Object parameter.
   * @return  Returns a value of type com4j.Com4jObject
   */

  @VTID(25)
  @DefaultMethod
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject get_Default(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);


  /**
   * @param from Optional parameter. Default value is com4j.Variant.getMissing()
   * @param to Optional parameter. Default value is com4j.Variant.getMissing()
   * @param copies Optional parameter. Default value is com4j.Variant.getMissing()
   * @param preview Optional parameter. Default value is com4j.Variant.getMissing()
   * @param activePrinter Optional parameter. Default value is com4j.Variant.getMissing()
   * @param printToFile Optional parameter. Default value is com4j.Variant.getMissing()
   * @param collate Optional parameter. Default value is com4j.Variant.getMissing()
   * @param prToFileName Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   */

  @VTID(26)
  void _PrintOut(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object from,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object to,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object copies,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object preview,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object activePrinter,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object printToFile,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object collate,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object prToFileName,
    @LCID int lcid);


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

  @VTID(27)
  void printOut(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object from,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object to,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object copies,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object preview,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object activePrinter,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object printToFile,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object collate,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object prToFileName);


  // Properties:
}
