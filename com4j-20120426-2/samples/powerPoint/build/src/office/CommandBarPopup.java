package office  ;

import com4j.*;

@IID("{000C030A-0000-0000-C000-000000000046}")
public interface CommandBarPopup extends office.CommandBarControl {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "CommandBar"
   * </p>
   * @return  Returns a value of type office.CommandBar
   */

  @DISPID(1610940416) //= 0x60050000. The runtime will prefer the VTID if present
  @VTID(83)
  office.CommandBar commandBar();


  /**
   * <p>
   * Getter method for the COM property "Controls"
   * </p>
   * @return  Returns a value of type office.CommandBarControls
   */

  @DISPID(1610940417) //= 0x60050001. The runtime will prefer the VTID if present
  @VTID(84)
  office.CommandBarControls controls();


  @VTID(84)
  @ReturnValue(defaultPropertyThrough={office.CommandBarControls.class})
  office.CommandBarControl controls(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);

  /**
   * <p>
   * Getter method for the COM property "OLEMenuGroup"
   * </p>
   * @return  Returns a value of type office.MsoOLEMenuGroup
   */

  @DISPID(1610940418) //= 0x60050002. The runtime will prefer the VTID if present
  @VTID(85)
  office.MsoOLEMenuGroup oleMenuGroup();


  /**
   * <p>
   * Setter method for the COM property "OLEMenuGroup"
   * </p>
   * @param pomg Mandatory office.MsoOLEMenuGroup parameter.
   */

  @DISPID(1610940418) //= 0x60050002. The runtime will prefer the VTID if present
  @VTID(86)
  void oleMenuGroup(
    office.MsoOLEMenuGroup pomg);


  /**
   * <p>
   * Getter method for the COM property "InstanceIdPtr"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(1610940420) //= 0x60050004. The runtime will prefer the VTID if present
  @VTID(87)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object instanceIdPtr();


  // Properties:
}
