package word  ;

import com4j.*;

@IID("{00020927-0000-0000-C000-000000000046}")
public interface TextInput extends Com4jObject {
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
   * Getter method for the COM property "Valid"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(10)
  @DefaultMethod
  boolean valid();


  /**
   * <p>
   * Getter method for the COM property "Default"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(11)
  java.lang.String _default();


  /**
   * <p>
   * Setter method for the COM property "Default"
   * </p>
   * @param prop Mandatory java.lang.String parameter.
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(12)
  void _default(
    java.lang.String prop);


  /**
   * <p>
   * Getter method for the COM property "Type"
   * </p>
   * @return  Returns a value of type word.WdTextFormFieldType
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(13)
  word.WdTextFormFieldType type();


  /**
   * <p>
   * Getter method for the COM property "Format"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(14)
  java.lang.String format();


  /**
   * <p>
   * Getter method for the COM property "Width"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(15)
  int width();


  /**
   * <p>
   * Setter method for the COM property "Width"
   * </p>
   * @param prop Mandatory int parameter.
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(16)
  void width(
    int prop);


  /**
   */

  @DISPID(101) //= 0x65. The runtime will prefer the VTID if present
  @VTID(17)
  void clear();


  /**
   * @param type Mandatory word.WdTextFormFieldType parameter.
   * @param _default Optional parameter. Default value is com4j.Variant.getMissing()
   * @param format Optional parameter. Default value is com4j.Variant.getMissing()
   * @param enabled Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(102) //= 0x66. The runtime will prefer the VTID if present
  @VTID(18)
  void editType(
    word.WdTextFormFieldType type,
    @Optional java.lang.Object _default,
    @Optional java.lang.Object format,
    @Optional java.lang.Object enabled);


  // Properties:
}
