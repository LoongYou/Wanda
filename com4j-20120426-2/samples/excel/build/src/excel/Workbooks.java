package excel  ;

import com4j.*;

@IID("{000208DB-0000-0000-C000-000000000046}")
public interface Workbooks extends Com4jObject,Iterable<Com4jObject> {
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
   * @param template Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type excel._Workbook
   */

  @DISPID(181) //= 0xb5. The runtime will prefer the VTID if present
  @VTID(10)
  excel._Workbook add(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object template,
    @LCID int lcid);


  /**
   * @param lcid Mandatory int parameter.
   */

  @DISPID(277) //= 0x115. The runtime will prefer the VTID if present
  @VTID(11)
  void close(
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "Count"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(118) //= 0x76. The runtime will prefer the VTID if present
  @VTID(12)
  int getCount();


  /**
   * <p>
   * Getter method for the COM property "Item"
   * </p>
   * @param index Mandatory java.lang.Object parameter.
   * @return  Returns a value of type excel._Workbook
   */

  @DISPID(170) //= 0xaa. The runtime will prefer the VTID if present
  @VTID(13)
  excel._Workbook getItem(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);


  /**
   * <p>
   * Getter method for the COM property "_NewEnum"
   * </p>
   */

  @DISPID(-4) //= 0xfffffffc. The runtime will prefer the VTID if present
  @VTID(14)
  java.util.Iterator<Com4jObject> iterator();

  /**
   * @param filename Mandatory java.lang.String parameter.
   * @param updateLinks Optional parameter. Default value is com4j.Variant.getMissing()
   * @param readOnly Optional parameter. Default value is com4j.Variant.getMissing()
   * @param format Optional parameter. Default value is com4j.Variant.getMissing()
   * @param password Optional parameter. Default value is com4j.Variant.getMissing()
   * @param writeResPassword Optional parameter. Default value is com4j.Variant.getMissing()
   * @param ignoreReadOnlyRecommended Optional parameter. Default value is com4j.Variant.getMissing()
   * @param origin Optional parameter. Default value is com4j.Variant.getMissing()
   * @param delimiter Optional parameter. Default value is com4j.Variant.getMissing()
   * @param editable Optional parameter. Default value is com4j.Variant.getMissing()
   * @param notify Optional parameter. Default value is com4j.Variant.getMissing()
   * @param converter Optional parameter. Default value is com4j.Variant.getMissing()
   * @param addToMru Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type excel._Workbook
   */

  @DISPID(682) //= 0x2aa. The runtime will prefer the VTID if present
  @VTID(15)
  excel._Workbook _Open(
    java.lang.String filename,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object updateLinks,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object readOnly,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object format,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object password,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object writeResPassword,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object ignoreReadOnlyRecommended,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object origin,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object delimiter,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object editable,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object notify,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object converter,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object addToMru,
    @LCID int lcid);


  /**
   * @param filename Mandatory java.lang.String parameter.
   * @param origin Optional parameter. Default value is com4j.Variant.getMissing()
   * @param startRow Optional parameter. Default value is com4j.Variant.getMissing()
   * @param dataType Optional parameter. Default value is com4j.Variant.getMissing()
   * @param textQualifier Optional parameter. Default value is 1
   * @param consecutiveDelimiter Optional parameter. Default value is com4j.Variant.getMissing()
   * @param tab Optional parameter. Default value is com4j.Variant.getMissing()
   * @param semicolon Optional parameter. Default value is com4j.Variant.getMissing()
   * @param comma Optional parameter. Default value is com4j.Variant.getMissing()
   * @param space Optional parameter. Default value is com4j.Variant.getMissing()
   * @param other Optional parameter. Default value is com4j.Variant.getMissing()
   * @param otherChar Optional parameter. Default value is com4j.Variant.getMissing()
   * @param fieldInfo Optional parameter. Default value is com4j.Variant.getMissing()
   * @param textVisualLayout Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   */

  @DISPID(683) //= 0x2ab. The runtime will prefer the VTID if present
  @VTID(16)
  void __OpenText(
    java.lang.String filename,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object origin,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object startRow,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object dataType,
    @Optional @DefaultValue("1") excel.XlTextQualifier textQualifier,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object consecutiveDelimiter,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object tab,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object semicolon,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object comma,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object space,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object other,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object otherChar,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object fieldInfo,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object textVisualLayout,
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "_Default"
   * </p>
   * @param index Mandatory java.lang.Object parameter.
   * @return  Returns a value of type excel._Workbook
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(17)
  @DefaultMethod
  excel._Workbook get_Default(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);


  /**
   * @param filename Mandatory java.lang.String parameter.
   * @param origin Optional parameter. Default value is com4j.Variant.getMissing()
   * @param startRow Optional parameter. Default value is com4j.Variant.getMissing()
   * @param dataType Optional parameter. Default value is com4j.Variant.getMissing()
   * @param textQualifier Optional parameter. Default value is 1
   * @param consecutiveDelimiter Optional parameter. Default value is com4j.Variant.getMissing()
   * @param tab Optional parameter. Default value is com4j.Variant.getMissing()
   * @param semicolon Optional parameter. Default value is com4j.Variant.getMissing()
   * @param comma Optional parameter. Default value is com4j.Variant.getMissing()
   * @param space Optional parameter. Default value is com4j.Variant.getMissing()
   * @param other Optional parameter. Default value is com4j.Variant.getMissing()
   * @param otherChar Optional parameter. Default value is com4j.Variant.getMissing()
   * @param fieldInfo Optional parameter. Default value is com4j.Variant.getMissing()
   * @param textVisualLayout Optional parameter. Default value is com4j.Variant.getMissing()
   * @param decimalSeparator Optional parameter. Default value is com4j.Variant.getMissing()
   * @param thousandsSeparator Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   */

  @DISPID(1773) //= 0x6ed. The runtime will prefer the VTID if present
  @VTID(18)
  void _OpenText(
    java.lang.String filename,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object origin,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object startRow,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object dataType,
    @Optional @DefaultValue("1") excel.XlTextQualifier textQualifier,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object consecutiveDelimiter,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object tab,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object semicolon,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object comma,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object space,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object other,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object otherChar,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object fieldInfo,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object textVisualLayout,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object decimalSeparator,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object thousandsSeparator,
    @LCID int lcid);


  /**
   * @param filename Mandatory java.lang.String parameter.
   * @param updateLinks Optional parameter. Default value is com4j.Variant.getMissing()
   * @param readOnly Optional parameter. Default value is com4j.Variant.getMissing()
   * @param format Optional parameter. Default value is com4j.Variant.getMissing()
   * @param password Optional parameter. Default value is com4j.Variant.getMissing()
   * @param writeResPassword Optional parameter. Default value is com4j.Variant.getMissing()
   * @param ignoreReadOnlyRecommended Optional parameter. Default value is com4j.Variant.getMissing()
   * @param origin Optional parameter. Default value is com4j.Variant.getMissing()
   * @param delimiter Optional parameter. Default value is com4j.Variant.getMissing()
   * @param editable Optional parameter. Default value is com4j.Variant.getMissing()
   * @param notify Optional parameter. Default value is com4j.Variant.getMissing()
   * @param converter Optional parameter. Default value is com4j.Variant.getMissing()
   * @param addToMru Optional parameter. Default value is com4j.Variant.getMissing()
   * @param local Optional parameter. Default value is com4j.Variant.getMissing()
   * @param corruptLoad Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type excel._Workbook
   */

  @DISPID(1923) //= 0x783. The runtime will prefer the VTID if present
  @VTID(19)
  excel._Workbook open(
    java.lang.String filename,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object updateLinks,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object readOnly,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object format,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object password,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object writeResPassword,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object ignoreReadOnlyRecommended,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object origin,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object delimiter,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object editable,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object notify,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object converter,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object addToMru,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object local,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object corruptLoad,
    @LCID int lcid);


  /**
   * @param filename Mandatory java.lang.String parameter.
   * @param origin Optional parameter. Default value is com4j.Variant.getMissing()
   * @param startRow Optional parameter. Default value is com4j.Variant.getMissing()
   * @param dataType Optional parameter. Default value is com4j.Variant.getMissing()
   * @param textQualifier Optional parameter. Default value is 1
   * @param consecutiveDelimiter Optional parameter. Default value is com4j.Variant.getMissing()
   * @param tab Optional parameter. Default value is com4j.Variant.getMissing()
   * @param semicolon Optional parameter. Default value is com4j.Variant.getMissing()
   * @param comma Optional parameter. Default value is com4j.Variant.getMissing()
   * @param space Optional parameter. Default value is com4j.Variant.getMissing()
   * @param other Optional parameter. Default value is com4j.Variant.getMissing()
   * @param otherChar Optional parameter. Default value is com4j.Variant.getMissing()
   * @param fieldInfo Optional parameter. Default value is com4j.Variant.getMissing()
   * @param textVisualLayout Optional parameter. Default value is com4j.Variant.getMissing()
   * @param decimalSeparator Optional parameter. Default value is com4j.Variant.getMissing()
   * @param thousandsSeparator Optional parameter. Default value is com4j.Variant.getMissing()
   * @param trailingMinusNumbers Optional parameter. Default value is com4j.Variant.getMissing()
   * @param local Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   */

  @DISPID(1924) //= 0x784. The runtime will prefer the VTID if present
  @VTID(20)
  void openText(
    java.lang.String filename,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object origin,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object startRow,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object dataType,
    @Optional @DefaultValue("1") excel.XlTextQualifier textQualifier,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object consecutiveDelimiter,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object tab,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object semicolon,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object comma,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object space,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object other,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object otherChar,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object fieldInfo,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object textVisualLayout,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object decimalSeparator,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object thousandsSeparator,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object trailingMinusNumbers,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object local,
    @LCID int lcid);


  /**
   * @param filename Mandatory java.lang.String parameter.
   * @param commandText Optional parameter. Default value is com4j.Variant.getMissing()
   * @param commandType Optional parameter. Default value is com4j.Variant.getMissing()
   * @param backgroundQuery Optional parameter. Default value is com4j.Variant.getMissing()
   * @param importDataAs Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type excel._Workbook
   */

  @DISPID(2067) //= 0x813. The runtime will prefer the VTID if present
  @VTID(21)
  excel._Workbook openDatabase(
    java.lang.String filename,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object commandText,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object commandType,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object backgroundQuery,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object importDataAs);


  /**
   * @param filename Mandatory java.lang.String parameter.
   */

  @DISPID(2069) //= 0x815. The runtime will prefer the VTID if present
  @VTID(22)
  void checkOut(
    java.lang.String filename);


  /**
   * @param filename Mandatory java.lang.String parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(2070) //= 0x816. The runtime will prefer the VTID if present
  @VTID(23)
  boolean canCheckOut(
    java.lang.String filename);


  /**
   * @param filename Mandatory java.lang.String parameter.
   * @param stylesheets Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type excel._Workbook
   */

  @DISPID(2071) //= 0x817. The runtime will prefer the VTID if present
  @VTID(24)
  excel._Workbook _OpenXML(
    java.lang.String filename,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object stylesheets);


  /**
   * @param filename Mandatory java.lang.String parameter.
   * @param stylesheets Optional parameter. Default value is com4j.Variant.getMissing()
   * @param loadOption Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type excel._Workbook
   */

  @DISPID(2280) //= 0x8e8. The runtime will prefer the VTID if present
  @VTID(25)
  excel._Workbook openXML(
    java.lang.String filename,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object stylesheets,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object loadOption);


  // Properties:
}
