package word  ;

import com4j.*;

@IID("{873E774B-926A-4CB1-878D-635A45187595}")
public interface OMaths extends Com4jObject,Iterable<Com4jObject> {
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
   * @param index Mandatory int parameter.
   * @return  Returns a value of type word.OMath
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(12)
  @DefaultMethod
  word.OMath item(
    int index);


  /**
   */

  @DISPID(200) //= 0xc8. The runtime will prefer the VTID if present
  @VTID(13)
  void linearize();


  /**
   */

  @DISPID(201) //= 0xc9. The runtime will prefer the VTID if present
  @VTID(14)
  void buildUp();


  /**
   * @param range Mandatory word.Range parameter.
   * @return  Returns a value of type word.Range
   */

  @DISPID(202) //= 0xca. The runtime will prefer the VTID if present
  @VTID(15)
  word.Range add(
    word.Range range);


  // Properties:
}
