package word  ;

import com4j.*;

@IID("{00020928-0000-0000-C000-000000000046}")
public interface FormField extends Com4jObject {
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
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(1002) //= 0x3ea. The runtime will prefer the VTID if present
  @VTID(9)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject parent();


  /**
   * <p>
   * Getter method for the COM property "Type"
   * </p>
   * @return  Returns a value of type word.WdFieldType
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(10)
  @DefaultMethod
  word.WdFieldType type();


  /**
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(11)
  java.lang.String name();


  /**
   * <p>
   * Setter method for the COM property "Name"
   * </p>
   * @param prop Mandatory java.lang.String parameter.
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(12)
  void name(
    java.lang.String prop);


  /**
   * <p>
   * Getter method for the COM property "EntryMacro"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(13)
  java.lang.String entryMacro();


  /**
   * <p>
   * Setter method for the COM property "EntryMacro"
   * </p>
   * @param prop Mandatory java.lang.String parameter.
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(14)
  void entryMacro(
    java.lang.String prop);


  /**
   * <p>
   * Getter method for the COM property "ExitMacro"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(15)
  java.lang.String exitMacro();


  /**
   * <p>
   * Setter method for the COM property "ExitMacro"
   * </p>
   * @param prop Mandatory java.lang.String parameter.
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(16)
  void exitMacro(
    java.lang.String prop);


  /**
   * <p>
   * Getter method for the COM property "OwnHelp"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(17)
  boolean ownHelp();


  /**
   * <p>
   * Setter method for the COM property "OwnHelp"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(18)
  void ownHelp(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "OwnStatus"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(19)
  boolean ownStatus();


  /**
   * <p>
   * Setter method for the COM property "OwnStatus"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(20)
  void ownStatus(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "HelpText"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(21)
  java.lang.String helpText();


  /**
   * <p>
   * Setter method for the COM property "HelpText"
   * </p>
   * @param prop Mandatory java.lang.String parameter.
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(22)
  void helpText(
    java.lang.String prop);


  /**
   * <p>
   * Getter method for the COM property "StatusText"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(23)
  java.lang.String statusText();


  /**
   * <p>
   * Setter method for the COM property "StatusText"
   * </p>
   * @param prop Mandatory java.lang.String parameter.
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(24)
  void statusText(
    java.lang.String prop);


  /**
   * <p>
   * Getter method for the COM property "Enabled"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(25)
  boolean enabled();


  /**
   * <p>
   * Setter method for the COM property "Enabled"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(26)
  void enabled(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "Result"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(27)
  java.lang.String result();


  /**
   * <p>
   * Setter method for the COM property "Result"
   * </p>
   * @param prop Mandatory java.lang.String parameter.
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(28)
  void result(
    java.lang.String prop);


  /**
   * <p>
   * Getter method for the COM property "TextInput"
   * </p>
   * @return  Returns a value of type word.TextInput
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(29)
  word.TextInput textInput();


  /**
   * <p>
   * Getter method for the COM property "CheckBox"
   * </p>
   * @return  Returns a value of type word.CheckBox
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(30)
  word.CheckBox checkBox();


  /**
   * <p>
   * Getter method for the COM property "DropDown"
   * </p>
   * @return  Returns a value of type word.DropDown
   */

  @DISPID(13) //= 0xd. The runtime will prefer the VTID if present
  @VTID(31)
  word.DropDown dropDown();


  /**
   * <p>
   * Getter method for the COM property "Next"
   * </p>
   * @return  Returns a value of type word.FormField
   */

  @DISPID(14) //= 0xe. The runtime will prefer the VTID if present
  @VTID(32)
  word.FormField next();


  /**
   * <p>
   * Getter method for the COM property "Previous"
   * </p>
   * @return  Returns a value of type word.FormField
   */

  @DISPID(15) //= 0xf. The runtime will prefer the VTID if present
  @VTID(33)
  word.FormField previous();


  /**
   * <p>
   * Getter method for the COM property "CalculateOnExit"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(16) //= 0x10. The runtime will prefer the VTID if present
  @VTID(34)
  boolean calculateOnExit();


  /**
   * <p>
   * Setter method for the COM property "CalculateOnExit"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(16) //= 0x10. The runtime will prefer the VTID if present
  @VTID(35)
  void calculateOnExit(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "Range"
   * </p>
   * @return  Returns a value of type word.Range
   */

  @DISPID(17) //= 0x11. The runtime will prefer the VTID if present
  @VTID(36)
  word.Range range();


  /**
   */

  @DISPID(65535) //= 0xffff. The runtime will prefer the VTID if present
  @VTID(37)
  void select();


  /**
   */

  @DISPID(101) //= 0x65. The runtime will prefer the VTID if present
  @VTID(38)
  void copy();


  /**
   */

  @DISPID(102) //= 0x66. The runtime will prefer the VTID if present
  @VTID(39)
  void cut();


  /**
   */

  @DISPID(103) //= 0x67. The runtime will prefer the VTID if present
  @VTID(40)
  void delete();


  // Properties:
}
