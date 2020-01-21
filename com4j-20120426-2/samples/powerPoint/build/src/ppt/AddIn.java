package ppt  ;

import com4j.*;

@IID("{91493461-5A91-11CF-8700-00AA0060263B}")
public interface AddIn extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of type ppt._Application
   */

  @DISPID(2001) //= 0x7d1. The runtime will prefer the VTID if present
  @VTID(7)
  ppt._Application application();


  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(2002) //= 0x7d2. The runtime will prefer the VTID if present
  @VTID(8)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject parent();


  /**
   * <p>
   * Getter method for the COM property "FullName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(2003) //= 0x7d3. The runtime will prefer the VTID if present
  @VTID(9)
  java.lang.String fullName();


  /**
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(2004) //= 0x7d4. The runtime will prefer the VTID if present
  @VTID(10)
  java.lang.String name();


  /**
   * <p>
   * Getter method for the COM property "Path"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(2005) //= 0x7d5. The runtime will prefer the VTID if present
  @VTID(11)
  java.lang.String path();


  /**
   * <p>
   * Getter method for the COM property "Registered"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @DISPID(2006) //= 0x7d6. The runtime will prefer the VTID if present
  @VTID(12)
  office.MsoTriState registered();


  /**
   * <p>
   * Setter method for the COM property "Registered"
   * </p>
   * @param registered Mandatory office.MsoTriState parameter.
   */

  @DISPID(2006) //= 0x7d6. The runtime will prefer the VTID if present
  @VTID(13)
  void registered(
    office.MsoTriState registered);


  /**
   * <p>
   * Getter method for the COM property "AutoLoad"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @DISPID(2007) //= 0x7d7. The runtime will prefer the VTID if present
  @VTID(14)
  office.MsoTriState autoLoad();


  /**
   * <p>
   * Setter method for the COM property "AutoLoad"
   * </p>
   * @param autoLoad Mandatory office.MsoTriState parameter.
   */

  @DISPID(2007) //= 0x7d7. The runtime will prefer the VTID if present
  @VTID(15)
  void autoLoad(
    office.MsoTriState autoLoad);


  /**
   * <p>
   * Getter method for the COM property "Loaded"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @DISPID(2008) //= 0x7d8. The runtime will prefer the VTID if present
  @VTID(16)
  office.MsoTriState loaded();


  /**
   * <p>
   * Setter method for the COM property "Loaded"
   * </p>
   * @param loaded Mandatory office.MsoTriState parameter.
   */

  @DISPID(2008) //= 0x7d8. The runtime will prefer the VTID if present
  @VTID(17)
  void loaded(
    office.MsoTriState loaded);


  /**
   * <p>
   * Getter method for the COM property "DisplayAlerts"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @DISPID(2009) //= 0x7d9. The runtime will prefer the VTID if present
  @VTID(18)
  office.MsoTriState displayAlerts();


  /**
   * <p>
   * Setter method for the COM property "DisplayAlerts"
   * </p>
   * @param displayAlerts Mandatory office.MsoTriState parameter.
   */

  @DISPID(2009) //= 0x7d9. The runtime will prefer the VTID if present
  @VTID(19)
  void displayAlerts(
    office.MsoTriState displayAlerts);


  /**
   * <p>
   * Getter method for the COM property "RegisteredInHKLM"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @DISPID(2010) //= 0x7da. The runtime will prefer the VTID if present
  @VTID(20)
  office.MsoTriState registeredInHKLM();


  // Properties:
}
