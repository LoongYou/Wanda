package office  ;

import com4j.*;

@IID("{000C033A-0000-0000-C000-000000000046}")
public interface COMAddIn extends office._IMsoDispObj {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Description"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(9)
  @DefaultMethod
  java.lang.String description();


  /**
   * <p>
   * Setter method for the COM property "Description"
   * </p>
   * @param retValue Mandatory java.lang.String parameter.
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(10)
  @DefaultMethod
  void description(
    java.lang.String retValue);


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
   * @param retValue Mandatory boolean parameter.
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(14)
  void connect(
    boolean retValue);


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
   * @param retValue Mandatory com4j.Com4jObject parameter.
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(16)
  void object(
    @MarshalAs(NativeType.Dispatch) com4j.Com4jObject retValue);


  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(17)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject parent();


  // Properties:
}
