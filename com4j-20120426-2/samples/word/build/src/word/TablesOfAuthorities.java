package word  ;

import com4j.*;

@IID("{00020912-0000-0000-C000-000000000046}")
public interface TablesOfAuthorities extends Com4jObject,Iterable<Com4jObject> {
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
   * @return  Returns a value of type word.WdToaFormat
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(12)
  word.WdToaFormat format();


  /**
   * <p>
   * Setter method for the COM property "Format"
   * </p>
   * @param prop Mandatory word.WdToaFormat parameter.
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(13)
  void format(
    word.WdToaFormat prop);


  /**
   * @param index Mandatory int parameter.
   * @return  Returns a value of type word.TableOfAuthorities
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(14)
  @DefaultMethod
  word.TableOfAuthorities item(
    int index);


  /**
   * @param range Mandatory word.Range parameter.
   * @param category Optional parameter. Default value is com4j.Variant.getMissing()
   * @param bookmark Optional parameter. Default value is com4j.Variant.getMissing()
   * @param passim Optional parameter. Default value is com4j.Variant.getMissing()
   * @param keepEntryFormatting Optional parameter. Default value is com4j.Variant.getMissing()
   * @param separator Optional parameter. Default value is com4j.Variant.getMissing()
   * @param includeSequenceName Optional parameter. Default value is com4j.Variant.getMissing()
   * @param entrySeparator Optional parameter. Default value is com4j.Variant.getMissing()
   * @param pageRangeSeparator Optional parameter. Default value is com4j.Variant.getMissing()
   * @param includeCategoryHeader Optional parameter. Default value is com4j.Variant.getMissing()
   * @param pageNumberSeparator Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type word.TableOfAuthorities
   */

  @DISPID(100) //= 0x64. The runtime will prefer the VTID if present
  @VTID(15)
  word.TableOfAuthorities add(
    word.Range range,
    @Optional java.lang.Object category,
    @Optional java.lang.Object bookmark,
    @Optional java.lang.Object passim,
    @Optional java.lang.Object keepEntryFormatting,
    @Optional java.lang.Object separator,
    @Optional java.lang.Object includeSequenceName,
    @Optional java.lang.Object entrySeparator,
    @Optional java.lang.Object pageRangeSeparator,
    @Optional java.lang.Object includeCategoryHeader,
    @Optional java.lang.Object pageNumberSeparator);


  /**
   * @param shortCitation Mandatory java.lang.String parameter.
   */

  @DISPID(103) //= 0x67. The runtime will prefer the VTID if present
  @VTID(16)
  void nextCitation(
    java.lang.String shortCitation);


  /**
   * @param range Mandatory word.Range parameter.
   * @param shortCitation Mandatory java.lang.String parameter.
   * @param longCitation Optional parameter. Default value is com4j.Variant.getMissing()
   * @param longCitationAutoText Optional parameter. Default value is com4j.Variant.getMissing()
   * @param category Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type word.Field
   */

  @DISPID(101) //= 0x65. The runtime will prefer the VTID if present
  @VTID(17)
  word.Field markCitation(
    word.Range range,
    java.lang.String shortCitation,
    @Optional java.lang.Object longCitation,
    @Optional java.lang.Object longCitationAutoText,
    @Optional java.lang.Object category);


  /**
   * @param shortCitation Mandatory java.lang.String parameter.
   * @param longCitation Optional parameter. Default value is com4j.Variant.getMissing()
   * @param longCitationAutoText Optional parameter. Default value is com4j.Variant.getMissing()
   * @param category Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(102) //= 0x66. The runtime will prefer the VTID if present
  @VTID(18)
  void markAllCitations(
    java.lang.String shortCitation,
    @Optional java.lang.Object longCitation,
    @Optional java.lang.Object longCitationAutoText,
    @Optional java.lang.Object category);


  // Properties:
}
