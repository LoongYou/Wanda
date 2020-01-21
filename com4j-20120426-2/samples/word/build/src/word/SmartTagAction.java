package word  ;

import com4j.*;

@IID("{DFB6AA6C-1068-420F-969D-01280FCC1630}")
public interface SmartTagAction extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(7)
  @DefaultMethod
  java.lang.String name();


  /**
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of type word._Application
   */

  @DISPID(1000) //= 0x3e8. The runtime will prefer the VTID if present
  @VTID(8)
  word._Application application();


  /**
   * <p>
   * Getter method for the COM property "Creator"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1001) //= 0x3e9. The runtime will prefer the VTID if present
  @VTID(9)
  int creator();


  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(1002) //= 0x3ea. The runtime will prefer the VTID if present
  @VTID(10)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject parent();


  /**
   */

  @DISPID(1003) //= 0x3eb. The runtime will prefer the VTID if present
  @VTID(11)
  void execute();


  /**
   * <p>
   * Getter method for the COM property "Type"
   * </p>
   * @return  Returns a value of type word.WdSmartTagControlType
   */

  @DISPID(1004) //= 0x3ec. The runtime will prefer the VTID if present
  @VTID(12)
  word.WdSmartTagControlType type();


  /**
   * <p>
   * Getter method for the COM property "PresentInPane"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1005) //= 0x3ed. The runtime will prefer the VTID if present
  @VTID(13)
  boolean presentInPane();


  /**
   * <p>
   * Getter method for the COM property "ExpandHelp"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1006) //= 0x3ee. The runtime will prefer the VTID if present
  @VTID(14)
  boolean expandHelp();


  /**
   * <p>
   * Setter method for the COM property "ExpandHelp"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(1006) //= 0x3ee. The runtime will prefer the VTID if present
  @VTID(15)
  void expandHelp(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "CheckboxState"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1007) //= 0x3ef. The runtime will prefer the VTID if present
  @VTID(16)
  boolean checkboxState();


  /**
   * <p>
   * Setter method for the COM property "CheckboxState"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(1007) //= 0x3ef. The runtime will prefer the VTID if present
  @VTID(17)
  void checkboxState(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "TextboxText"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1008) //= 0x3f0. The runtime will prefer the VTID if present
  @VTID(18)
  java.lang.String textboxText();


  /**
   * <p>
   * Setter method for the COM property "TextboxText"
   * </p>
   * @param prop Mandatory java.lang.String parameter.
   */

  @DISPID(1008) //= 0x3f0. The runtime will prefer the VTID if present
  @VTID(19)
  void textboxText(
    java.lang.String prop);


  /**
   * <p>
   * Getter method for the COM property "ListSelection"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1009) //= 0x3f1. The runtime will prefer the VTID if present
  @VTID(20)
  int listSelection();


  /**
   * <p>
   * Setter method for the COM property "ListSelection"
   * </p>
   * @param prop Mandatory int parameter.
   */

  @DISPID(1009) //= 0x3f1. The runtime will prefer the VTID if present
  @VTID(21)
  void listSelection(
    int prop);


  /**
   * <p>
   * Getter method for the COM property "RadioGroupSelection"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1010) //= 0x3f2. The runtime will prefer the VTID if present
  @VTID(22)
  int radioGroupSelection();


  /**
   * <p>
   * Setter method for the COM property "RadioGroupSelection"
   * </p>
   * @param prop Mandatory int parameter.
   */

  @DISPID(1010) //= 0x3f2. The runtime will prefer the VTID if present
  @VTID(23)
  void radioGroupSelection(
    int prop);


  /**
   * <p>
   * Getter method for the COM property "ExpandDocumentFragment"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1011) //= 0x3f3. The runtime will prefer the VTID if present
  @VTID(24)
  boolean expandDocumentFragment();


  /**
   * <p>
   * Setter method for the COM property "ExpandDocumentFragment"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(1011) //= 0x3f3. The runtime will prefer the VTID if present
  @VTID(25)
  void expandDocumentFragment(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "ActiveXControl"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(1012) //= 0x3f4. The runtime will prefer the VTID if present
  @VTID(26)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject activeXControl();


  // Properties:
}
