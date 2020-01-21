package office  ;

import com4j.*;

@IID("{000C0322-0000-0000-C000-000000000046}")
public interface Assistant extends office._IMsoDispObj {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(1610809344) //= 0x60030000. The runtime will prefer the VTID if present
  @VTID(9)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject parent();


  /**
   * @param xLeft Mandatory int parameter.
   * @param yTop Mandatory int parameter.
   */

  @DISPID(1610809345) //= 0x60030001. The runtime will prefer the VTID if present
  @VTID(10)
  void move(
    int xLeft,
    int yTop);


  /**
   * <p>
   * Setter method for the COM property "Top"
   * </p>
   * @param pyTop Mandatory int parameter.
   */

  @DISPID(1610809346) //= 0x60030002. The runtime will prefer the VTID if present
  @VTID(11)
  void top(
    int pyTop);


  /**
   * <p>
   * Getter method for the COM property "Top"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610809346) //= 0x60030002. The runtime will prefer the VTID if present
  @VTID(12)
  int top();


  /**
   * <p>
   * Setter method for the COM property "Left"
   * </p>
   * @param pxLeft Mandatory int parameter.
   */

  @DISPID(1610809348) //= 0x60030004. The runtime will prefer the VTID if present
  @VTID(13)
  void left(
    int pxLeft);


  /**
   * <p>
   * Getter method for the COM property "Left"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610809348) //= 0x60030004. The runtime will prefer the VTID if present
  @VTID(14)
  int left();


  /**
   */

  @DISPID(1610809350) //= 0x60030006. The runtime will prefer the VTID if present
  @VTID(15)
  void help();


  /**
   * @param on Mandatory boolean parameter.
   * @param callback Mandatory java.lang.String parameter.
   * @param privateX Mandatory int parameter.
   * @param animation Optional parameter. Default value is com4j.Variant.getMissing()
   * @param customTeaser Optional parameter. Default value is com4j.Variant.getMissing()
   * @param top Optional parameter. Default value is com4j.Variant.getMissing()
   * @param left Optional parameter. Default value is com4j.Variant.getMissing()
   * @param bottom Optional parameter. Default value is com4j.Variant.getMissing()
   * @param right Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type int
   */

  @DISPID(1610809351) //= 0x60030007. The runtime will prefer the VTID if present
  @VTID(16)
  int startWizard(
    boolean on,
    java.lang.String callback,
    int privateX,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object animation,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object customTeaser,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object top,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object left,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object bottom,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object right);


  /**
   * @param wizardID Mandatory int parameter.
   * @param varfSuccess Mandatory boolean parameter.
   * @param animation Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(1610809352) //= 0x60030008. The runtime will prefer the VTID if present
  @VTID(17)
  void endWizard(
    int wizardID,
    boolean varfSuccess,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object animation);


  /**
   * @param wizardID Mandatory int parameter.
   * @param act Mandatory office.MsoWizardActType parameter.
   * @param animation Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(1610809353) //= 0x60030009. The runtime will prefer the VTID if present
  @VTID(18)
  void activateWizard(
    int wizardID,
    office.MsoWizardActType act,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object animation);


  /**
   */

  @DISPID(1610809354) //= 0x6003000a. The runtime will prefer the VTID if present
  @VTID(19)
  void resetTips();


  /**
   * <p>
   * Getter method for the COM property "NewBalloon"
   * </p>
   * @return  Returns a value of type office.Balloon
   */

  @DISPID(1610809355) //= 0x6003000b. The runtime will prefer the VTID if present
  @VTID(20)
  office.Balloon newBalloon();


  /**
   * <p>
   * Getter method for the COM property "BalloonError"
   * </p>
   * @return  Returns a value of type office.MsoBalloonErrorType
   */

  @DISPID(1610809356) //= 0x6003000c. The runtime will prefer the VTID if present
  @VTID(21)
  office.MsoBalloonErrorType balloonError();


  /**
   * <p>
   * Getter method for the COM property "Visible"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610809357) //= 0x6003000d. The runtime will prefer the VTID if present
  @VTID(22)
  boolean visible();


  /**
   * <p>
   * Setter method for the COM property "Visible"
   * </p>
   * @param pvarfVisible Mandatory boolean parameter.
   */

  @DISPID(1610809357) //= 0x6003000d. The runtime will prefer the VTID if present
  @VTID(23)
  void visible(
    boolean pvarfVisible);


  /**
   * <p>
   * Getter method for the COM property "Animation"
   * </p>
   * @return  Returns a value of type office.MsoAnimationType
   */

  @DISPID(1610809359) //= 0x6003000f. The runtime will prefer the VTID if present
  @VTID(24)
  office.MsoAnimationType animation();


  /**
   * <p>
   * Setter method for the COM property "Animation"
   * </p>
   * @param pfca Mandatory office.MsoAnimationType parameter.
   */

  @DISPID(1610809359) //= 0x6003000f. The runtime will prefer the VTID if present
  @VTID(25)
  void animation(
    office.MsoAnimationType pfca);


  /**
   * <p>
   * Getter method for the COM property "Reduced"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610809361) //= 0x60030011. The runtime will prefer the VTID if present
  @VTID(26)
  boolean reduced();


  /**
   * <p>
   * Setter method for the COM property "Reduced"
   * </p>
   * @param pvarfReduced Mandatory boolean parameter.
   */

  @DISPID(1610809361) //= 0x60030011. The runtime will prefer the VTID if present
  @VTID(27)
  void reduced(
    boolean pvarfReduced);


  /**
   * <p>
   * Setter method for the COM property "AssistWithHelp"
   * </p>
   * @param pvarfAssistWithHelp Mandatory boolean parameter.
   */

  @DISPID(1610809363) //= 0x60030013. The runtime will prefer the VTID if present
  @VTID(28)
  void assistWithHelp(
    boolean pvarfAssistWithHelp);


  /**
   * <p>
   * Getter method for the COM property "AssistWithHelp"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610809363) //= 0x60030013. The runtime will prefer the VTID if present
  @VTID(29)
  boolean assistWithHelp();


  /**
   * <p>
   * Setter method for the COM property "AssistWithWizards"
   * </p>
   * @param pvarfAssistWithWizards Mandatory boolean parameter.
   */

  @DISPID(1610809365) //= 0x60030015. The runtime will prefer the VTID if present
  @VTID(30)
  void assistWithWizards(
    boolean pvarfAssistWithWizards);


  /**
   * <p>
   * Getter method for the COM property "AssistWithWizards"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610809365) //= 0x60030015. The runtime will prefer the VTID if present
  @VTID(31)
  boolean assistWithWizards();


  /**
   * <p>
   * Setter method for the COM property "AssistWithAlerts"
   * </p>
   * @param pvarfAssistWithAlerts Mandatory boolean parameter.
   */

  @DISPID(1610809367) //= 0x60030017. The runtime will prefer the VTID if present
  @VTID(32)
  void assistWithAlerts(
    boolean pvarfAssistWithAlerts);


  /**
   * <p>
   * Getter method for the COM property "AssistWithAlerts"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610809367) //= 0x60030017. The runtime will prefer the VTID if present
  @VTID(33)
  boolean assistWithAlerts();


  /**
   * <p>
   * Setter method for the COM property "MoveWhenInTheWay"
   * </p>
   * @param pvarfMove Mandatory boolean parameter.
   */

  @DISPID(1610809369) //= 0x60030019. The runtime will prefer the VTID if present
  @VTID(34)
  void moveWhenInTheWay(
    boolean pvarfMove);


  /**
   * <p>
   * Getter method for the COM property "MoveWhenInTheWay"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610809369) //= 0x60030019. The runtime will prefer the VTID if present
  @VTID(35)
  boolean moveWhenInTheWay();


  /**
   * <p>
   * Setter method for the COM property "Sounds"
   * </p>
   * @param pvarfSounds Mandatory boolean parameter.
   */

  @DISPID(1610809371) //= 0x6003001b. The runtime will prefer the VTID if present
  @VTID(36)
  void sounds(
    boolean pvarfSounds);


  /**
   * <p>
   * Getter method for the COM property "Sounds"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610809371) //= 0x6003001b. The runtime will prefer the VTID if present
  @VTID(37)
  boolean sounds();


  /**
   * <p>
   * Setter method for the COM property "FeatureTips"
   * </p>
   * @param pvarfFeatures Mandatory boolean parameter.
   */

  @DISPID(1610809373) //= 0x6003001d. The runtime will prefer the VTID if present
  @VTID(38)
  void featureTips(
    boolean pvarfFeatures);


  /**
   * <p>
   * Getter method for the COM property "FeatureTips"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610809373) //= 0x6003001d. The runtime will prefer the VTID if present
  @VTID(39)
  boolean featureTips();


  /**
   * <p>
   * Setter method for the COM property "MouseTips"
   * </p>
   * @param pvarfMouse Mandatory boolean parameter.
   */

  @DISPID(1610809375) //= 0x6003001f. The runtime will prefer the VTID if present
  @VTID(40)
  void mouseTips(
    boolean pvarfMouse);


  /**
   * <p>
   * Getter method for the COM property "MouseTips"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610809375) //= 0x6003001f. The runtime will prefer the VTID if present
  @VTID(41)
  boolean mouseTips();


  /**
   * <p>
   * Setter method for the COM property "KeyboardShortcutTips"
   * </p>
   * @param pvarfKeyboardShortcuts Mandatory boolean parameter.
   */

  @DISPID(1610809377) //= 0x60030021. The runtime will prefer the VTID if present
  @VTID(42)
  void keyboardShortcutTips(
    boolean pvarfKeyboardShortcuts);


  /**
   * <p>
   * Getter method for the COM property "KeyboardShortcutTips"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610809377) //= 0x60030021. The runtime will prefer the VTID if present
  @VTID(43)
  boolean keyboardShortcutTips();


  /**
   * <p>
   * Setter method for the COM property "HighPriorityTips"
   * </p>
   * @param pvarfHighPriorityTips Mandatory boolean parameter.
   */

  @DISPID(1610809379) //= 0x60030023. The runtime will prefer the VTID if present
  @VTID(44)
  void highPriorityTips(
    boolean pvarfHighPriorityTips);


  /**
   * <p>
   * Getter method for the COM property "HighPriorityTips"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610809379) //= 0x60030023. The runtime will prefer the VTID if present
  @VTID(45)
  boolean highPriorityTips();


  /**
   * <p>
   * Setter method for the COM property "TipOfDay"
   * </p>
   * @param pvarfTipOfDay Mandatory boolean parameter.
   */

  @DISPID(1610809381) //= 0x60030025. The runtime will prefer the VTID if present
  @VTID(46)
  void tipOfDay(
    boolean pvarfTipOfDay);


  /**
   * <p>
   * Getter method for the COM property "TipOfDay"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610809381) //= 0x60030025. The runtime will prefer the VTID if present
  @VTID(47)
  boolean tipOfDay();


  /**
   * <p>
   * Setter method for the COM property "GuessHelp"
   * </p>
   * @param pvarfGuessHelp Mandatory boolean parameter.
   */

  @DISPID(1610809383) //= 0x60030027. The runtime will prefer the VTID if present
  @VTID(48)
  void guessHelp(
    boolean pvarfGuessHelp);


  /**
   * <p>
   * Getter method for the COM property "GuessHelp"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610809383) //= 0x60030027. The runtime will prefer the VTID if present
  @VTID(49)
  boolean guessHelp();


  /**
   * <p>
   * Setter method for the COM property "SearchWhenProgramming"
   * </p>
   * @param pvarfSearchInProgram Mandatory boolean parameter.
   */

  @DISPID(1610809385) //= 0x60030029. The runtime will prefer the VTID if present
  @VTID(50)
  void searchWhenProgramming(
    boolean pvarfSearchInProgram);


  /**
   * <p>
   * Getter method for the COM property "SearchWhenProgramming"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610809385) //= 0x60030029. The runtime will prefer the VTID if present
  @VTID(51)
  boolean searchWhenProgramming();


  /**
   * <p>
   * Getter method for the COM property "Item"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(52)
  @DefaultMethod
  java.lang.String item();


  /**
   * <p>
   * Getter method for the COM property "FileName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610809388) //= 0x6003002c. The runtime will prefer the VTID if present
  @VTID(53)
  java.lang.String fileName();


  /**
   * <p>
   * Setter method for the COM property "FileName"
   * </p>
   * @param pbstr Mandatory java.lang.String parameter.
   */

  @DISPID(1610809388) //= 0x6003002c. The runtime will prefer the VTID if present
  @VTID(54)
  void fileName(
    java.lang.String pbstr);


  /**
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610809390) //= 0x6003002e. The runtime will prefer the VTID if present
  @VTID(55)
  java.lang.String name();


  /**
   * <p>
   * Getter method for the COM property "On"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610809391) //= 0x6003002f. The runtime will prefer the VTID if present
  @VTID(56)
  boolean on();


  /**
   * <p>
   * Setter method for the COM property "On"
   * </p>
   * @param pvarfOn Mandatory boolean parameter.
   */

  @DISPID(1610809391) //= 0x6003002f. The runtime will prefer the VTID if present
  @VTID(57)
  void on(
    boolean pvarfOn);


  /**
   * @param bstrAlertTitle Mandatory java.lang.String parameter.
   * @param bstrAlertText Mandatory java.lang.String parameter.
   * @param alb Mandatory office.MsoAlertButtonType parameter.
   * @param alc Mandatory office.MsoAlertIconType parameter.
   * @param ald Mandatory office.MsoAlertDefaultType parameter.
   * @param alq Mandatory office.MsoAlertCancelType parameter.
   * @param varfSysAlert Mandatory boolean parameter.
   * @return  Returns a value of type int
   */

  @DISPID(1610809393) //= 0x60030031. The runtime will prefer the VTID if present
  @VTID(58)
  int doAlert(
    java.lang.String bstrAlertTitle,
    java.lang.String bstrAlertText,
    office.MsoAlertButtonType alb,
    office.MsoAlertIconType alc,
    office.MsoAlertDefaultType ald,
    office.MsoAlertCancelType alq,
    boolean varfSysAlert);


  // Properties:
}
