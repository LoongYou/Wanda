package word  ;

import com4j.*;

@IID("{BF043168-F4DE-4E7C-B206-741A8B3EF71A}")
public interface EndnoteOptions extends Com4jObject {
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
   * Getter method for the COM property "Location"
   * </p>
   * @return  Returns a value of type word.WdEndnoteLocation
   */

  @DISPID(100) //= 0x64. The runtime will prefer the VTID if present
  @VTID(10)
  word.WdEndnoteLocation location();


  /**
   * <p>
   * Setter method for the COM property "Location"
   * </p>
   * @param prop Mandatory word.WdEndnoteLocation parameter.
   */

  @DISPID(100) //= 0x64. The runtime will prefer the VTID if present
  @VTID(11)
  void location(
    word.WdEndnoteLocation prop);


  /**
   * <p>
   * Getter method for the COM property "NumberStyle"
   * </p>
   * @return  Returns a value of type word.WdNoteNumberStyle
   */

  @DISPID(101) //= 0x65. The runtime will prefer the VTID if present
  @VTID(12)
  word.WdNoteNumberStyle numberStyle();


  /**
   * <p>
   * Setter method for the COM property "NumberStyle"
   * </p>
   * @param prop Mandatory word.WdNoteNumberStyle parameter.
   */

  @DISPID(101) //= 0x65. The runtime will prefer the VTID if present
  @VTID(13)
  void numberStyle(
    word.WdNoteNumberStyle prop);


  /**
   * <p>
   * Getter method for the COM property "StartingNumber"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(102) //= 0x66. The runtime will prefer the VTID if present
  @VTID(14)
  int startingNumber();


  /**
   * <p>
   * Setter method for the COM property "StartingNumber"
   * </p>
   * @param prop Mandatory int parameter.
   */

  @DISPID(102) //= 0x66. The runtime will prefer the VTID if present
  @VTID(15)
  void startingNumber(
    int prop);


  /**
   * <p>
   * Getter method for the COM property "NumberingRule"
   * </p>
   * @return  Returns a value of type word.WdNumberingRule
   */

  @DISPID(103) //= 0x67. The runtime will prefer the VTID if present
  @VTID(16)
  word.WdNumberingRule numberingRule();


  /**
   * <p>
   * Setter method for the COM property "NumberingRule"
   * </p>
   * @param prop Mandatory word.WdNumberingRule parameter.
   */

  @DISPID(103) //= 0x67. The runtime will prefer the VTID if present
  @VTID(17)
  void numberingRule(
    word.WdNumberingRule prop);


  // Properties:
}
