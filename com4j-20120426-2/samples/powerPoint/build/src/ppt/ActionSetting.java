package ppt  ;

import com4j.*;

@IID("{9149348D-5A91-11CF-8700-00AA0060263B}")
public interface ActionSetting extends Com4jObject {
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
   * Getter method for the COM property "Action"
   * </p>
   * @return  Returns a value of type ppt.PpActionType
   */

  @DISPID(2003) //= 0x7d3. The runtime will prefer the VTID if present
  @VTID(9)
  ppt.PpActionType action();


  /**
   * <p>
   * Setter method for the COM property "Action"
   * </p>
   * @param action Mandatory ppt.PpActionType parameter.
   */

  @DISPID(2003) //= 0x7d3. The runtime will prefer the VTID if present
  @VTID(10)
  void action(
    ppt.PpActionType action);


  /**
   * <p>
   * Getter method for the COM property "ActionVerb"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(2004) //= 0x7d4. The runtime will prefer the VTID if present
  @VTID(11)
  java.lang.String actionVerb();


  /**
   * <p>
   * Setter method for the COM property "ActionVerb"
   * </p>
   * @param actionVerb Mandatory java.lang.String parameter.
   */

  @DISPID(2004) //= 0x7d4. The runtime will prefer the VTID if present
  @VTID(12)
  void actionVerb(
    java.lang.String actionVerb);


  /**
   * <p>
   * Getter method for the COM property "AnimateAction"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @DISPID(2005) //= 0x7d5. The runtime will prefer the VTID if present
  @VTID(13)
  office.MsoTriState animateAction();


  /**
   * <p>
   * Setter method for the COM property "AnimateAction"
   * </p>
   * @param animateAction Mandatory office.MsoTriState parameter.
   */

  @DISPID(2005) //= 0x7d5. The runtime will prefer the VTID if present
  @VTID(14)
  void animateAction(
    office.MsoTriState animateAction);


  /**
   * <p>
   * Getter method for the COM property "Run"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(2006) //= 0x7d6. The runtime will prefer the VTID if present
  @VTID(15)
  java.lang.String run();


  /**
   * <p>
   * Setter method for the COM property "Run"
   * </p>
   * @param run Mandatory java.lang.String parameter.
   */

  @DISPID(2006) //= 0x7d6. The runtime will prefer the VTID if present
  @VTID(16)
  void run(
    java.lang.String run);


  /**
   * <p>
   * Getter method for the COM property "SlideShowName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(2007) //= 0x7d7. The runtime will prefer the VTID if present
  @VTID(17)
  java.lang.String slideShowName();


  /**
   * <p>
   * Setter method for the COM property "SlideShowName"
   * </p>
   * @param slideShowName Mandatory java.lang.String parameter.
   */

  @DISPID(2007) //= 0x7d7. The runtime will prefer the VTID if present
  @VTID(18)
  void slideShowName(
    java.lang.String slideShowName);


  /**
   * <p>
   * Getter method for the COM property "Hyperlink"
   * </p>
   * @return  Returns a value of type ppt.Hyperlink
   */

  @DISPID(2008) //= 0x7d8. The runtime will prefer the VTID if present
  @VTID(19)
  ppt.Hyperlink hyperlink();


  /**
   * <p>
   * Getter method for the COM property "SoundEffect"
   * </p>
   * @return  Returns a value of type ppt.SoundEffect
   */

  @DISPID(2009) //= 0x7d9. The runtime will prefer the VTID if present
  @VTID(20)
  ppt.SoundEffect soundEffect();


  /**
   * <p>
   * Getter method for the COM property "ShowAndReturn"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @DISPID(2010) //= 0x7da. The runtime will prefer the VTID if present
  @VTID(21)
  office.MsoTriState showAndReturn();


  /**
   * <p>
   * Setter method for the COM property "ShowAndReturn"
   * </p>
   * @param showAndReturn Mandatory office.MsoTriState parameter.
   */

  @DISPID(2010) //= 0x7da. The runtime will prefer the VTID if present
  @VTID(22)
  void showAndReturn(
    office.MsoTriState showAndReturn);


  // Properties:
}
