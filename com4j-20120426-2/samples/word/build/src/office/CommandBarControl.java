package office  ;

import com4j.*;

@IID("{000C0308-0000-0000-C000-000000000046}")
public interface CommandBarControl extends office._IMsoOleAccDispObj {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "BeginGroup"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610874880) //= 0x60040000. The runtime will prefer the VTID if present
  @VTID(30)
  boolean beginGroup();


  /**
   * <p>
   * Setter method for the COM property "BeginGroup"
   * </p>
   * @param pvarfBeginGroup Mandatory boolean parameter.
   */

  @DISPID(1610874880) //= 0x60040000. The runtime will prefer the VTID if present
  @VTID(31)
  void beginGroup(
    boolean pvarfBeginGroup);


  /**
   * <p>
   * Getter method for the COM property "BuiltIn"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610874882) //= 0x60040002. The runtime will prefer the VTID if present
  @VTID(32)
  boolean builtIn();


  /**
   * <p>
   * Getter method for the COM property "Caption"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610874883) //= 0x60040003. The runtime will prefer the VTID if present
  @VTID(33)
  java.lang.String caption();


  /**
   * <p>
   * Setter method for the COM property "Caption"
   * </p>
   * @param pbstrCaption Mandatory java.lang.String parameter.
   */

  @DISPID(1610874883) //= 0x60040003. The runtime will prefer the VTID if present
  @VTID(34)
  void caption(
    java.lang.String pbstrCaption);


  /**
   * <p>
   * Getter method for the COM property "Control"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(1610874885) //= 0x60040005. The runtime will prefer the VTID if present
  @VTID(35)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject control();


  /**
   * @param bar Optional parameter. Default value is com4j.Variant.getMissing()
   * @param before Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type office.CommandBarControl
   */

  @DISPID(1610874886) //= 0x60040006. The runtime will prefer the VTID if present
  @VTID(36)
  office.CommandBarControl copy(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object bar,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object before);


  /**
   * @param temporary Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(1610874887) //= 0x60040007. The runtime will prefer the VTID if present
  @VTID(37)
  void delete(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object temporary);


  /**
   * <p>
   * Getter method for the COM property "DescriptionText"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610874888) //= 0x60040008. The runtime will prefer the VTID if present
  @VTID(38)
  java.lang.String descriptionText();


  /**
   * <p>
   * Setter method for the COM property "DescriptionText"
   * </p>
   * @param pbstrText Mandatory java.lang.String parameter.
   */

  @DISPID(1610874888) //= 0x60040008. The runtime will prefer the VTID if present
  @VTID(39)
  void descriptionText(
    java.lang.String pbstrText);


  /**
   * <p>
   * Getter method for the COM property "Enabled"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610874890) //= 0x6004000a. The runtime will prefer the VTID if present
  @VTID(40)
  boolean enabled();


  /**
   * <p>
   * Setter method for the COM property "Enabled"
   * </p>
   * @param pvarfEnabled Mandatory boolean parameter.
   */

  @DISPID(1610874890) //= 0x6004000a. The runtime will prefer the VTID if present
  @VTID(41)
  void enabled(
    boolean pvarfEnabled);


  /**
   */

  @DISPID(1610874892) //= 0x6004000c. The runtime will prefer the VTID if present
  @VTID(42)
  void execute();


  /**
   * <p>
   * Getter method for the COM property "Height"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610874893) //= 0x6004000d. The runtime will prefer the VTID if present
  @VTID(43)
  int height();


  /**
   * <p>
   * Setter method for the COM property "Height"
   * </p>
   * @param pdy Mandatory int parameter.
   */

  @DISPID(1610874893) //= 0x6004000d. The runtime will prefer the VTID if present
  @VTID(44)
  void height(
    int pdy);


  /**
   * <p>
   * Getter method for the COM property "HelpContextId"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610874895) //= 0x6004000f. The runtime will prefer the VTID if present
  @VTID(45)
  int helpContextId();


  /**
   * <p>
   * Setter method for the COM property "HelpContextId"
   * </p>
   * @param pid Mandatory int parameter.
   */

  @DISPID(1610874895) //= 0x6004000f. The runtime will prefer the VTID if present
  @VTID(46)
  void helpContextId(
    int pid);


  /**
   * <p>
   * Getter method for the COM property "HelpFile"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610874897) //= 0x60040011. The runtime will prefer the VTID if present
  @VTID(47)
  java.lang.String helpFile();


  /**
   * <p>
   * Setter method for the COM property "HelpFile"
   * </p>
   * @param pbstrFilename Mandatory java.lang.String parameter.
   */

  @DISPID(1610874897) //= 0x60040011. The runtime will prefer the VTID if present
  @VTID(48)
  void helpFile(
    java.lang.String pbstrFilename);


  /**
   * <p>
   * Getter method for the COM property "Id"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610874899) //= 0x60040013. The runtime will prefer the VTID if present
  @VTID(49)
  int id();


  /**
   * <p>
   * Getter method for the COM property "Index"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610874900) //= 0x60040014. The runtime will prefer the VTID if present
  @VTID(50)
  int index();


  /**
   * <p>
   * Getter method for the COM property "InstanceId"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610874901) //= 0x60040015. The runtime will prefer the VTID if present
  @VTID(51)
  int instanceId();


  /**
   * @param bar Optional parameter. Default value is com4j.Variant.getMissing()
   * @param before Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type office.CommandBarControl
   */

  @DISPID(1610874902) //= 0x60040016. The runtime will prefer the VTID if present
  @VTID(52)
  office.CommandBarControl move(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object bar,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object before);


  /**
   * <p>
   * Getter method for the COM property "Left"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610874903) //= 0x60040017. The runtime will prefer the VTID if present
  @VTID(53)
  int left();


  /**
   * <p>
   * Getter method for the COM property "OLEUsage"
   * </p>
   * @return  Returns a value of type office.MsoControlOLEUsage
   */

  @DISPID(1610874904) //= 0x60040018. The runtime will prefer the VTID if present
  @VTID(54)
  office.MsoControlOLEUsage oleUsage();


  /**
   * <p>
   * Setter method for the COM property "OLEUsage"
   * </p>
   * @param pcou Mandatory office.MsoControlOLEUsage parameter.
   */

  @DISPID(1610874904) //= 0x60040018. The runtime will prefer the VTID if present
  @VTID(55)
  void oleUsage(
    office.MsoControlOLEUsage pcou);


  /**
   * <p>
   * Getter method for the COM property "OnAction"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610874906) //= 0x6004001a. The runtime will prefer the VTID if present
  @VTID(56)
  java.lang.String onAction();


  /**
   * <p>
   * Setter method for the COM property "OnAction"
   * </p>
   * @param pbstrOnAction Mandatory java.lang.String parameter.
   */

  @DISPID(1610874906) //= 0x6004001a. The runtime will prefer the VTID if present
  @VTID(57)
  void onAction(
    java.lang.String pbstrOnAction);


  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type office.CommandBar
   */

  @DISPID(1610874908) //= 0x6004001c. The runtime will prefer the VTID if present
  @VTID(58)
  office.CommandBar parent();


  /**
   * <p>
   * Getter method for the COM property "Parameter"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610874909) //= 0x6004001d. The runtime will prefer the VTID if present
  @VTID(59)
  java.lang.String parameter();


  /**
   * <p>
   * Setter method for the COM property "Parameter"
   * </p>
   * @param pbstrParam Mandatory java.lang.String parameter.
   */

  @DISPID(1610874909) //= 0x6004001d. The runtime will prefer the VTID if present
  @VTID(60)
  void parameter(
    java.lang.String pbstrParam);


  /**
   * <p>
   * Getter method for the COM property "Priority"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610874911) //= 0x6004001f. The runtime will prefer the VTID if present
  @VTID(61)
  int priority();


  /**
   * <p>
   * Setter method for the COM property "Priority"
   * </p>
   * @param pnPri Mandatory int parameter.
   */

  @DISPID(1610874911) //= 0x6004001f. The runtime will prefer the VTID if present
  @VTID(62)
  void priority(
    int pnPri);


  /**
   */

  @DISPID(1610874913) //= 0x60040021. The runtime will prefer the VTID if present
  @VTID(63)
  void reset();


  /**
   */

  @DISPID(1610874914) //= 0x60040022. The runtime will prefer the VTID if present
  @VTID(64)
  void setFocus();


  /**
   * <p>
   * Getter method for the COM property "Tag"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610874915) //= 0x60040023. The runtime will prefer the VTID if present
  @VTID(65)
  java.lang.String tag();


  /**
   * <p>
   * Setter method for the COM property "Tag"
   * </p>
   * @param pbstrTag Mandatory java.lang.String parameter.
   */

  @DISPID(1610874915) //= 0x60040023. The runtime will prefer the VTID if present
  @VTID(66)
  void tag(
    java.lang.String pbstrTag);


  /**
   * <p>
   * Getter method for the COM property "TooltipText"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610874917) //= 0x60040025. The runtime will prefer the VTID if present
  @VTID(67)
  java.lang.String tooltipText();


  /**
   * <p>
   * Setter method for the COM property "TooltipText"
   * </p>
   * @param pbstrTooltip Mandatory java.lang.String parameter.
   */

  @DISPID(1610874917) //= 0x60040025. The runtime will prefer the VTID if present
  @VTID(68)
  void tooltipText(
    java.lang.String pbstrTooltip);


  /**
   * <p>
   * Getter method for the COM property "Top"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610874919) //= 0x60040027. The runtime will prefer the VTID if present
  @VTID(69)
  int top();


  /**
   * <p>
   * Getter method for the COM property "Type"
   * </p>
   * @return  Returns a value of type office.MsoControlType
   */

  @DISPID(1610874920) //= 0x60040028. The runtime will prefer the VTID if present
  @VTID(70)
  office.MsoControlType type();


  /**
   * <p>
   * Getter method for the COM property "Visible"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610874921) //= 0x60040029. The runtime will prefer the VTID if present
  @VTID(71)
  boolean visible();


  /**
   * <p>
   * Setter method for the COM property "Visible"
   * </p>
   * @param pvarfVisible Mandatory boolean parameter.
   */

  @DISPID(1610874921) //= 0x60040029. The runtime will prefer the VTID if present
  @VTID(72)
  void visible(
    boolean pvarfVisible);


  /**
   * <p>
   * Getter method for the COM property "Width"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610874923) //= 0x6004002b. The runtime will prefer the VTID if present
  @VTID(73)
  int width();


  /**
   * <p>
   * Setter method for the COM property "Width"
   * </p>
   * @param pdx Mandatory int parameter.
   */

  @DISPID(1610874923) //= 0x6004002b. The runtime will prefer the VTID if present
  @VTID(74)
  void width(
    int pdx);


  /**
   * <p>
   * Getter method for the COM property "IsPriorityDropped"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610874925) //= 0x6004002d. The runtime will prefer the VTID if present
  @VTID(75)
  boolean isPriorityDropped();


  /**
   */

  @DISPID(1610874926) //= 0x6004002e. The runtime will prefer the VTID if present
  @VTID(76)
  void reserved1();


  /**
   */

  @DISPID(1610874927) //= 0x6004002f. The runtime will prefer the VTID if present
  @VTID(77)
  void reserved2();


  /**
   */

  @DISPID(1610874928) //= 0x60040030. The runtime will prefer the VTID if present
  @VTID(78)
  void reserved3();


  /**
   */

  @DISPID(1610874929) //= 0x60040031. The runtime will prefer the VTID if present
  @VTID(79)
  void reserved4();


  /**
   */

  @DISPID(1610874930) //= 0x60040032. The runtime will prefer the VTID if present
  @VTID(80)
  void reserved5();


  /**
   */

  @DISPID(1610874931) //= 0x60040033. The runtime will prefer the VTID if present
  @VTID(81)
  void reserved6();


  /**
   */

  @DISPID(1610874932) //= 0x60040034. The runtime will prefer the VTID if present
  @VTID(82)
  void reserved7();


  // Properties:
}
