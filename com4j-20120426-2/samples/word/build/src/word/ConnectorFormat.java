package word  ;

import com4j.*;

@IID("{000209C7-0000-0000-C000-000000000046}")
public interface ConnectorFormat extends Com4jObject {
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
   * Getter method for the COM property "BeginConnected"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @DISPID(100) //= 0x64. The runtime will prefer the VTID if present
  @VTID(9)
  office.MsoTriState beginConnected();


  /**
   * <p>
   * Getter method for the COM property "BeginConnectedShape"
   * </p>
   * @return  Returns a value of type word.Shape
   */

  @DISPID(101) //= 0x65. The runtime will prefer the VTID if present
  @VTID(10)
  word.Shape beginConnectedShape();


  /**
   * <p>
   * Getter method for the COM property "BeginConnectionSite"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(102) //= 0x66. The runtime will prefer the VTID if present
  @VTID(11)
  int beginConnectionSite();


  /**
   * <p>
   * Getter method for the COM property "EndConnected"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @DISPID(103) //= 0x67. The runtime will prefer the VTID if present
  @VTID(12)
  office.MsoTriState endConnected();


  /**
   * <p>
   * Getter method for the COM property "EndConnectedShape"
   * </p>
   * @return  Returns a value of type word.Shape
   */

  @DISPID(104) //= 0x68. The runtime will prefer the VTID if present
  @VTID(13)
  word.Shape endConnectedShape();


  /**
   * <p>
   * Getter method for the COM property "EndConnectionSite"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(105) //= 0x69. The runtime will prefer the VTID if present
  @VTID(14)
  int endConnectionSite();


  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(15)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject parent();


  /**
   * <p>
   * Getter method for the COM property "Type"
   * </p>
   * @return  Returns a value of type office.MsoConnectorType
   */

  @DISPID(106) //= 0x6a. The runtime will prefer the VTID if present
  @VTID(16)
  office.MsoConnectorType type();


  /**
   * <p>
   * Setter method for the COM property "Type"
   * </p>
   * @param prop Mandatory office.MsoConnectorType parameter.
   */

  @DISPID(106) //= 0x6a. The runtime will prefer the VTID if present
  @VTID(17)
  void type(
    office.MsoConnectorType prop);


  /**
   * @param connectionSite Mandatory int parameter.
   * @return  Returns a value of type word.Shape
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(18)
  @ReturnValue(index=0)
  word.Shape beginConnect(
    int connectionSite);


  /**
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(19)
  void beginDisconnect();


  /**
   * @param connectionSite Mandatory int parameter.
   * @return  Returns a value of type word.Shape
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(20)
  @ReturnValue(index=0)
  word.Shape endConnect(
    int connectionSite);


  /**
   */

  @DISPID(13) //= 0xd. The runtime will prefer the VTID if present
  @VTID(21)
  void endDisconnect();


  // Properties:
}
