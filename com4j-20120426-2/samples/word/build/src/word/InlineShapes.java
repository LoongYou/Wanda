package word  ;

import com4j.*;

@IID("{000209A9-0000-0000-C000-000000000046}")
public interface InlineShapes extends Com4jObject,Iterable<Com4jObject> {
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
   * Getter method for the COM property "Count"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(10)
  int count();


  /**
   * <p>
   * Getter method for the COM property "_NewEnum"
   * </p>
   */

  @DISPID(-4) //= 0xfffffffc. The runtime will prefer the VTID if present
  @VTID(11)
  java.util.Iterator<Com4jObject> iterator();

  /**
   * @param index Mandatory int parameter.
   * @return  Returns a value of type word.InlineShape
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(12)
  @DefaultMethod
  word.InlineShape item(
    int index);


  /**
   * @param fileName Mandatory java.lang.String parameter.
   * @param linkToFile Optional parameter. Default value is com4j.Variant.getMissing()
   * @param saveWithDocument Optional parameter. Default value is com4j.Variant.getMissing()
   * @param range Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type word.InlineShape
   */

  @DISPID(100) //= 0x64. The runtime will prefer the VTID if present
  @VTID(13)
  word.InlineShape addPicture(
    java.lang.String fileName,
    @Optional java.lang.Object linkToFile,
    @Optional java.lang.Object saveWithDocument,
    @Optional java.lang.Object range);


  /**
   * @param classType Optional parameter. Default value is com4j.Variant.getMissing()
   * @param fileName Optional parameter. Default value is com4j.Variant.getMissing()
   * @param linkToFile Optional parameter. Default value is com4j.Variant.getMissing()
   * @param displayAsIcon Optional parameter. Default value is com4j.Variant.getMissing()
   * @param iconFileName Optional parameter. Default value is com4j.Variant.getMissing()
   * @param iconIndex Optional parameter. Default value is com4j.Variant.getMissing()
   * @param iconLabel Optional parameter. Default value is com4j.Variant.getMissing()
   * @param range Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type word.InlineShape
   */

  @DISPID(24) //= 0x18. The runtime will prefer the VTID if present
  @VTID(14)
  word.InlineShape addOLEObject(
    @Optional java.lang.Object classType,
    @Optional java.lang.Object fileName,
    @Optional java.lang.Object linkToFile,
    @Optional java.lang.Object displayAsIcon,
    @Optional java.lang.Object iconFileName,
    @Optional java.lang.Object iconIndex,
    @Optional java.lang.Object iconLabel,
    @Optional java.lang.Object range);


  /**
   * @param classType Optional parameter. Default value is com4j.Variant.getMissing()
   * @param range Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type word.InlineShape
   */

  @DISPID(102) //= 0x66. The runtime will prefer the VTID if present
  @VTID(15)
  word.InlineShape addOLEControl(
    @Optional java.lang.Object classType,
    @Optional java.lang.Object range);


  /**
   * @param range Mandatory word.Range parameter.
   * @return  Returns a value of type word.InlineShape
   */

  @DISPID(200) //= 0xc8. The runtime will prefer the VTID if present
  @VTID(16)
  word.InlineShape _new(
    word.Range range);


  /**
   * @param fileName Mandatory java.lang.String parameter.
   * @param range Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type word.InlineShape
   */

  @DISPID(104) //= 0x68. The runtime will prefer the VTID if present
  @VTID(17)
  word.InlineShape addHorizontalLine(
    java.lang.String fileName,
    @Optional java.lang.Object range);


  /**
   * @param range Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type word.InlineShape
   */

  @DISPID(105) //= 0x69. The runtime will prefer the VTID if present
  @VTID(18)
  word.InlineShape addHorizontalLineStandard(
    @Optional java.lang.Object range);


  /**
   * @param fileName Mandatory java.lang.String parameter.
   * @param range Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type word.InlineShape
   */

  @DISPID(106) //= 0x6a. The runtime will prefer the VTID if present
  @VTID(19)
  word.InlineShape addPictureBullet(
    java.lang.String fileName,
    @Optional java.lang.Object range);


  /**
   * @param type Optional parameter. Default value is -1
   * @param range Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type word.InlineShape
   */

  @DISPID(107) //= 0x6b. The runtime will prefer the VTID if present
  @VTID(20)
  word.InlineShape addChart(
    @Optional @DefaultValue("-1") office.XlChartType type,
    @Optional java.lang.Object range);


  /**
   * @param layout Mandatory office.SmartArtLayout parameter.
   * @param range Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type word.InlineShape
   */

  @DISPID(108) //= 0x6c. The runtime will prefer the VTID if present
  @VTID(21)
  word.InlineShape addSmartArt(
    office.SmartArtLayout layout,
    @Optional java.lang.Object range);


  // Properties:
}
