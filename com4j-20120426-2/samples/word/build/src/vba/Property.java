package vba  ;

import com4j.*;

@IID("{0002E18C-0000-0000-C000-000000000046}")
public interface Property extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Value"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(7)
  @DefaultMethod
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object value();


  /**
   * <p>
   * Setter method for the COM property "Value"
   * </p>
   * @param lppvReturn Mandatory java.lang.Object parameter.
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(8)
  @DefaultMethod
  void value(
    @MarshalAs(NativeType.VARIANT) java.lang.Object lppvReturn);


  /**
   * <p>
   * Getter method for the COM property "IndexedValue"
   * </p>
   * @param index1 Mandatory java.lang.Object parameter.
   * @param index2 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param index3 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param index4 Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(9)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object indexedValue(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index1,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index2,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index3,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index4);


  /**
   * <p>
   * Setter method for the COM property "IndexedValue"
   * </p>
   * @param index1 Mandatory java.lang.Object parameter.
   * @param index2 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param index3 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param index4 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lppvReturn Mandatory java.lang.Object parameter.
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(10)
  void indexedValue(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index1,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index2,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index3,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index4,
    @MarshalAs(NativeType.VARIANT) java.lang.Object lppvReturn);


  /**
   * <p>
   * Getter method for the COM property "NumIndices"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(11)
  short numIndices();


  /**
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of type vba.Application
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(12)
  vba.Application application();


  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type vba._Properties
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(13)
  vba._Properties parent();


  /**
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(40) //= 0x28. The runtime will prefer the VTID if present
  @VTID(14)
  java.lang.String name();


  /**
   * <p>
   * Getter method for the COM property "VBE"
   * </p>
   * @return  Returns a value of type vba.VBE
   */

  @DISPID(41) //= 0x29. The runtime will prefer the VTID if present
  @VTID(15)
  vba.VBE vbe();


  /**
   * <p>
   * Getter method for the COM property "Collection"
   * </p>
   * @return  Returns a value of type vba._Properties
   */

  @DISPID(42) //= 0x2a. The runtime will prefer the VTID if present
  @VTID(16)
  vba._Properties collection();


  /**
   * <p>
   * Getter method for the COM property "Object"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(45) //= 0x2d. The runtime will prefer the VTID if present
  @VTID(17)
  com4j.Com4jObject object();


  /**
   * <p>
   * Setter method for the COM property "Object"
   * </p>
   * @param lppunk Mandatory com4j.Com4jObject parameter.
   */

  @DISPID(45) //= 0x2d. The runtime will prefer the VTID if present
  @VTID(18)
  void object(
    com4j.Com4jObject lppunk);


  // Properties:
}
