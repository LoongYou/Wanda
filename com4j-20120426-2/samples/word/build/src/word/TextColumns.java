package word  ;

import com4j.*;

@IID("{00020973-0000-0000-C000-000000000046}")
public interface TextColumns extends Com4jObject,Iterable<Com4jObject> {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "_NewEnum"
   * </p>
   */

  @DISPID(-4) //= 0xfffffffc. The runtime will prefer the VTID if present
  @VTID(7)
  java.util.Iterator<Com4jObject> iterator();

  /**
   * <p>
   * Getter method for the COM property "Count"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(8)
  int count();


  /**
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of type word._Application
   */

  @DISPID(1000) //= 0x3e8. The runtime will prefer the VTID if present
  @VTID(9)
  word._Application application();


  /**
   * <p>
   * Getter method for the COM property "Creator"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1001) //= 0x3e9. The runtime will prefer the VTID if present
  @VTID(10)
  int creator();


  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(1002) //= 0x3ea. The runtime will prefer the VTID if present
  @VTID(11)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject parent();


  /**
   * <p>
   * Getter method for the COM property "EvenlySpaced"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(100) //= 0x64. The runtime will prefer the VTID if present
  @VTID(12)
  int evenlySpaced();


  /**
   * <p>
   * Setter method for the COM property "EvenlySpaced"
   * </p>
   * @param prop Mandatory int parameter.
   */

  @DISPID(100) //= 0x64. The runtime will prefer the VTID if present
  @VTID(13)
  void evenlySpaced(
    int prop);


  /**
   * <p>
   * Getter method for the COM property "LineBetween"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(101) //= 0x65. The runtime will prefer the VTID if present
  @VTID(14)
  int lineBetween();


  /**
   * <p>
   * Setter method for the COM property "LineBetween"
   * </p>
   * @param prop Mandatory int parameter.
   */

  @DISPID(101) //= 0x65. The runtime will prefer the VTID if present
  @VTID(15)
  void lineBetween(
    int prop);


  /**
   * <p>
   * Getter method for the COM property "Width"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(102) //= 0x66. The runtime will prefer the VTID if present
  @VTID(16)
  float width();


  /**
   * <p>
   * Setter method for the COM property "Width"
   * </p>
   * @param prop Mandatory float parameter.
   */

  @DISPID(102) //= 0x66. The runtime will prefer the VTID if present
  @VTID(17)
  void width(
    float prop);


  /**
   * <p>
   * Getter method for the COM property "Spacing"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(103) //= 0x67. The runtime will prefer the VTID if present
  @VTID(18)
  float spacing();


  /**
   * <p>
   * Setter method for the COM property "Spacing"
   * </p>
   * @param prop Mandatory float parameter.
   */

  @DISPID(103) //= 0x67. The runtime will prefer the VTID if present
  @VTID(19)
  void spacing(
    float prop);


  /**
   * @param index Mandatory int parameter.
   * @return  Returns a value of type word.TextColumn
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(20)
  @DefaultMethod
  word.TextColumn item(
    int index);


  /**
   * @param width Optional parameter. Default value is com4j.Variant.getMissing()
   * @param spacing Optional parameter. Default value is com4j.Variant.getMissing()
   * @param evenlySpaced Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type word.TextColumn
   */

  @DISPID(201) //= 0xc9. The runtime will prefer the VTID if present
  @VTID(21)
  word.TextColumn add(
    @Optional java.lang.Object width,
    @Optional java.lang.Object spacing,
    @Optional java.lang.Object evenlySpaced);


  /**
   * @param numColumns Mandatory int parameter.
   */

  @DISPID(202) //= 0xca. The runtime will prefer the VTID if present
  @VTID(22)
  void setCount(
    int numColumns);


  /**
   * <p>
   * Getter method for the COM property "FlowDirection"
   * </p>
   * @return  Returns a value of type word.WdFlowDirection
   */

  @DISPID(104) //= 0x68. The runtime will prefer the VTID if present
  @VTID(23)
  word.WdFlowDirection flowDirection();


  /**
   * <p>
   * Setter method for the COM property "FlowDirection"
   * </p>
   * @param prop Mandatory word.WdFlowDirection parameter.
   */

  @DISPID(104) //= 0x68. The runtime will prefer the VTID if present
  @VTID(24)
  void flowDirection(
    word.WdFlowDirection prop);


  // Properties:
}
