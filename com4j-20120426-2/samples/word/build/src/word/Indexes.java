package word  ;

import com4j.*;

@IID("{0002097C-0000-0000-C000-000000000046}")
public interface Indexes extends Com4jObject,Iterable<Com4jObject> {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of type word._Application
   */

  @DISPID(1000) //= 0x3e8. The runtime will prefer the VTID if present
  @VTID(7)
  word._Application application();


  /**
   * <p>
   * Getter method for the COM property "Creator"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1001) //= 0x3e9. The runtime will prefer the VTID if present
  @VTID(8)
  int creator();


  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(1002) //= 0x3ea. The runtime will prefer the VTID if present
  @VTID(9)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject parent();


  /**
   * <p>
   * Getter method for the COM property "_NewEnum"
   * </p>
   */

  @DISPID(-4) //= 0xfffffffc. The runtime will prefer the VTID if present
  @VTID(10)
  java.util.Iterator<Com4jObject> iterator();

  /**
   * <p>
   * Getter method for the COM property "Count"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(11)
  int count();


  /**
   * <p>
   * Getter method for the COM property "Format"
   * </p>
   * @return  Returns a value of type word.WdIndexFormat
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(12)
  word.WdIndexFormat format();


  /**
   * <p>
   * Setter method for the COM property "Format"
   * </p>
   * @param prop Mandatory word.WdIndexFormat parameter.
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(13)
  void format(
    word.WdIndexFormat prop);


  /**
   * @param index Mandatory int parameter.
   * @return  Returns a value of type word.Index
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(14)
  @DefaultMethod
  word.Index item(
    int index);


  /**
   * @param range Mandatory word.Range parameter.
   * @param headingSeparator Optional parameter. Default value is com4j.Variant.getMissing()
   * @param rightAlignPageNumbers Optional parameter. Default value is com4j.Variant.getMissing()
   * @param type Optional parameter. Default value is com4j.Variant.getMissing()
   * @param numberOfColumns Optional parameter. Default value is com4j.Variant.getMissing()
   * @param accentedLetters Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type word.Index
   */

  @DISPID(100) //= 0x64. The runtime will prefer the VTID if present
  @VTID(15)
  word.Index addOld(
    word.Range range,
    @Optional java.lang.Object headingSeparator,
    @Optional java.lang.Object rightAlignPageNumbers,
    @Optional java.lang.Object type,
    @Optional java.lang.Object numberOfColumns,
    @Optional java.lang.Object accentedLetters);


  /**
   * @param range Mandatory word.Range parameter.
   * @param entry Optional parameter. Default value is com4j.Variant.getMissing()
   * @param entryAutoText Optional parameter. Default value is com4j.Variant.getMissing()
   * @param crossReference Optional parameter. Default value is com4j.Variant.getMissing()
   * @param crossReferenceAutoText Optional parameter. Default value is com4j.Variant.getMissing()
   * @param bookmarkName Optional parameter. Default value is com4j.Variant.getMissing()
   * @param bold Optional parameter. Default value is com4j.Variant.getMissing()
   * @param italic Optional parameter. Default value is com4j.Variant.getMissing()
   * @param reading Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type word.Field
   */

  @DISPID(101) //= 0x65. The runtime will prefer the VTID if present
  @VTID(16)
  word.Field markEntry(
    word.Range range,
    @Optional java.lang.Object entry,
    @Optional java.lang.Object entryAutoText,
    @Optional java.lang.Object crossReference,
    @Optional java.lang.Object crossReferenceAutoText,
    @Optional java.lang.Object bookmarkName,
    @Optional java.lang.Object bold,
    @Optional java.lang.Object italic,
    @Optional java.lang.Object reading);


  /**
   * @param range Mandatory word.Range parameter.
   * @param entry Optional parameter. Default value is com4j.Variant.getMissing()
   * @param entryAutoText Optional parameter. Default value is com4j.Variant.getMissing()
   * @param crossReference Optional parameter. Default value is com4j.Variant.getMissing()
   * @param crossReferenceAutoText Optional parameter. Default value is com4j.Variant.getMissing()
   * @param bookmarkName Optional parameter. Default value is com4j.Variant.getMissing()
   * @param bold Optional parameter. Default value is com4j.Variant.getMissing()
   * @param italic Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(102) //= 0x66. The runtime will prefer the VTID if present
  @VTID(17)
  void markAllEntries(
    word.Range range,
    @Optional java.lang.Object entry,
    @Optional java.lang.Object entryAutoText,
    @Optional java.lang.Object crossReference,
    @Optional java.lang.Object crossReferenceAutoText,
    @Optional java.lang.Object bookmarkName,
    @Optional java.lang.Object bold,
    @Optional java.lang.Object italic);


  /**
   * @param concordanceFileName Mandatory java.lang.String parameter.
   */

  @DISPID(103) //= 0x67. The runtime will prefer the VTID if present
  @VTID(18)
  void autoMarkEntries(
    java.lang.String concordanceFileName);


  /**
   * @param range Mandatory word.Range parameter.
   * @param headingSeparator Optional parameter. Default value is com4j.Variant.getMissing()
   * @param rightAlignPageNumbers Optional parameter. Default value is com4j.Variant.getMissing()
   * @param type Optional parameter. Default value is com4j.Variant.getMissing()
   * @param numberOfColumns Optional parameter. Default value is com4j.Variant.getMissing()
   * @param accentedLetters Optional parameter. Default value is com4j.Variant.getMissing()
   * @param sortBy Optional parameter. Default value is com4j.Variant.getMissing()
   * @param indexLanguage Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type word.Index
   */

  @DISPID(104) //= 0x68. The runtime will prefer the VTID if present
  @VTID(19)
  word.Index add(
    word.Range range,
    @Optional java.lang.Object headingSeparator,
    @Optional java.lang.Object rightAlignPageNumbers,
    @Optional java.lang.Object type,
    @Optional java.lang.Object numberOfColumns,
    @Optional java.lang.Object accentedLetters,
    @Optional java.lang.Object sortBy,
    @Optional java.lang.Object indexLanguage);


  // Properties:
}
