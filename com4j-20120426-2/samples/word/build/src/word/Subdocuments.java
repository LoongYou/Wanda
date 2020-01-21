package word  ;

import com4j.*;

@IID("{00020988-0000-0000-C000-000000000046}")
public interface Subdocuments extends Com4jObject,Iterable<Com4jObject> {
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
   * <p>
   * Getter method for the COM property "Expanded"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(12)
  boolean expanded();


  /**
   * <p>
   * Setter method for the COM property "Expanded"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(13)
  void expanded(
    boolean prop);


  /**
   * @param index Mandatory int parameter.
   * @return  Returns a value of type word.Subdocument
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(14)
  @DefaultMethod
  word.Subdocument item(
    int index);


  /**
   * @param name Mandatory java.lang.Object parameter.
   * @param confirmConversions Optional parameter. Default value is com4j.Variant.getMissing()
   * @param readOnly Optional parameter. Default value is com4j.Variant.getMissing()
   * @param passwordDocument Optional parameter. Default value is com4j.Variant.getMissing()
   * @param passwordTemplate Optional parameter. Default value is com4j.Variant.getMissing()
   * @param revert Optional parameter. Default value is com4j.Variant.getMissing()
   * @param writePasswordDocument Optional parameter. Default value is com4j.Variant.getMissing()
   * @param writePasswordTemplate Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type word.Subdocument
   */

  @DISPID(100) //= 0x64. The runtime will prefer the VTID if present
  @VTID(15)
  word.Subdocument addFromFile(
    java.lang.Object name,
    @Optional java.lang.Object confirmConversions,
    @Optional java.lang.Object readOnly,
    @Optional java.lang.Object passwordDocument,
    @Optional java.lang.Object passwordTemplate,
    @Optional java.lang.Object revert,
    @Optional java.lang.Object writePasswordDocument,
    @Optional java.lang.Object writePasswordTemplate);


  /**
   * @param range Mandatory word.Range parameter.
   * @return  Returns a value of type word.Subdocument
   */

  @DISPID(101) //= 0x65. The runtime will prefer the VTID if present
  @VTID(16)
  word.Subdocument addFromRange(
    word.Range range);


  /**
   * @param firstSubdocument Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lastSubdocument Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(102) //= 0x66. The runtime will prefer the VTID if present
  @VTID(17)
  void merge(
    @Optional java.lang.Object firstSubdocument,
    @Optional java.lang.Object lastSubdocument);


  /**
   */

  @DISPID(103) //= 0x67. The runtime will prefer the VTID if present
  @VTID(18)
  void delete();


  /**
   */

  @DISPID(104) //= 0x68. The runtime will prefer the VTID if present
  @VTID(19)
  void select();


  // Properties:
}
