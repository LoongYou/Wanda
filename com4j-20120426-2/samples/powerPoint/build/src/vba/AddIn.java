package vba  ;

import com4j.*;

@IID("{DA936B64-AC8B-11D1-B6E5-00A0C90F2744}")
public interface AddIn extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Description"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(7)
  @DefaultMethod
  java.lang.String description();


  /**
   * <p>
   * Setter method for the COM property "Description"
   * </p>
   * @param lpbstr Mandatory java.lang.String parameter.
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(8)
  @DefaultMethod
  void description(
    java.lang.String lpbstr);


  /**
   * <p>
   * Getter method for the COM property "VBE"
   * </p>
   * @return  Returns a value of type vba.VBE
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(9)
  vba.VBE vbe();


  /**
   * <p>
   * Getter method for the COM property "Collection"
   * </p>
   * @return  Returns a value of type vba._AddIns
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(10)
  vba._AddIns collection();


  /**
   * <p>
   * Getter method for the COM property "ProgId"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(11)
  java.lang.String progId();


  /**
   * <p>
   * Getter method for the COM property "Guid"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(12)
  java.lang.String guid();


  /**
   * <p>
   * Getter method for the COM property "Connect"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(13)
  boolean connect();


  /**
   * <p>
   * Setter method for the COM property "Connect"
   * </p>
   * @param lpfConnect Mandatory boolean parameter.
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(14)
  void connect(
    boolean lpfConnect);


  /**
   * <p>
   * Getter method for the COM property "Object"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(15)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject object();


  /**
   * <p>
   * Setter method for the COM property "Object"
   * </p>
   * @param lppdisp Mandatory com4j.Com4jObject parameter.
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(16)
  void object(
    @MarshalAs(NativeType.Dispatch) com4j.Com4jObject lppdisp);


  // Properties:
}
