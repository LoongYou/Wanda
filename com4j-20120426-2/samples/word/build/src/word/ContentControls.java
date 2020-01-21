package word  ;

import com4j.*;

@IID("{804CD967-F83B-432D-9446-C61A45CFEFF0}")
public interface ContentControls extends Com4jObject,Iterable<Com4jObject> {
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
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of type word._Application
   */

  @DISPID(100) //= 0x64. The runtime will prefer the VTID if present
  @VTID(8)
  word._Application application();


  /**
   * <p>
   * Getter method for the COM property "Creator"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(101) //= 0x65. The runtime will prefer the VTID if present
  @VTID(9)
  int creator();


  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(102) //= 0x66. The runtime will prefer the VTID if present
  @VTID(10)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject parent();


  /**
   * <p>
   * Getter method for the COM property "Count"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(103) //= 0x67. The runtime will prefer the VTID if present
  @VTID(11)
  int count();


  /**
   * @param index Mandatory java.lang.Object parameter.
   * @return  Returns a value of type word.ContentControl
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(12)
  @DefaultMethod
  word.ContentControl item(
    java.lang.Object index);


  /**
   * @param type Optional parameter. Default value is 0
   * @param range Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type word.ContentControl
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(13)
  word.ContentControl add(
    @Optional @DefaultValue("0") word.WdContentControlType type,
    @Optional java.lang.Object range);


  // Properties:
}
