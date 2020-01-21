package word  ;

import com4j.*;

@IID("{000209B8-0000-0000-C000-000000000046}")
public interface Dialog extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of type word._Application
   */

  @DISPID(32003) //= 0x7d03. The runtime will prefer the VTID if present
  @VTID(7)
  word._Application application();


  /**
   * <p>
   * Getter method for the COM property "Creator"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(32004) //= 0x7d04. The runtime will prefer the VTID if present
  @VTID(8)
  int creator();


  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(32005) //= 0x7d05. The runtime will prefer the VTID if present
  @VTID(9)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject parent();


  /**
   * <p>
   * Getter method for the COM property "DefaultTab"
   * </p>
   * @return  Returns a value of type word.WdWordDialogTab
   */

  @DISPID(32002) //= 0x7d02. The runtime will prefer the VTID if present
  @VTID(10)
  word.WdWordDialogTab defaultTab();


  /**
   * <p>
   * Setter method for the COM property "DefaultTab"
   * </p>
   * @param prop Mandatory word.WdWordDialogTab parameter.
   */

  @DISPID(32002) //= 0x7d02. The runtime will prefer the VTID if present
  @VTID(11)
  void defaultTab(
    word.WdWordDialogTab prop);


  /**
   * <p>
   * Getter method for the COM property "Type"
   * </p>
   * @return  Returns a value of type word.WdWordDialog
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(12)
  @DefaultMethod
  word.WdWordDialog type();


  /**
   * @param timeOut Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type int
   */

  @DISPID(336) //= 0x150. The runtime will prefer the VTID if present
  @VTID(13)
  int show(
    @Optional java.lang.Object timeOut);


  /**
   * @param timeOut Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type int
   */

  @DISPID(338) //= 0x152. The runtime will prefer the VTID if present
  @VTID(14)
  int display(
    @Optional java.lang.Object timeOut);


  /**
   */

  @DISPID(32001) //= 0x7d01. The runtime will prefer the VTID if present
  @VTID(15)
  void execute();


  /**
   */

  @DISPID(302) //= 0x12e. The runtime will prefer the VTID if present
  @VTID(16)
  void update();


  /**
   * <p>
   * Getter method for the COM property "CommandName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(32006) //= 0x7d06. The runtime will prefer the VTID if present
  @VTID(17)
  java.lang.String commandName();


  /**
   * <p>
   * Getter method for the COM property "CommandBarId"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(32007) //= 0x7d07. The runtime will prefer the VTID if present
  @VTID(18)
  int commandBarId();


  // Properties:
}
