package word  ;

import com4j.*;

@IID("{00020941-0000-0000-C000-000000000046}")
public interface Endnotes extends Com4jObject,Iterable<Com4jObject> {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "_NewEnum"
   * </p>
   */

  @DISPID(-4) //= 0xfffffffc. The runtime will prefer the VTID if present
  @VTID(7)
  java.util.Iterator<Com4jObject> iterator();

  /**
   * <p>
   * Getter method for the COM property "Count"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(8)
  int count();


  /**
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of type word._Application
   */

  @DISPID(1000) //= 0x3e8. The runtime will prefer the VTID if present
  @VTID(9)
  word._Application application();


  /**
   * <p>
   * Getter method for the COM property "Creator"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1001) //= 0x3e9. The runtime will prefer the VTID if present
  @VTID(10)
  int creator();


  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(1002) //= 0x3ea. The runtime will prefer the VTID if present
  @VTID(11)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject parent();


  /**
   * <p>
   * Getter method for the COM property "Location"
   * </p>
   * @return  Returns a value of type word.WdEndnoteLocation
   */

  @DISPID(100) //= 0x64. The runtime will prefer the VTID if present
  @VTID(12)
  word.WdEndnoteLocation location();


  /**
   * <p>
   * Setter method for the COM property "Location"
   * </p>
   * @param prop Mandatory word.WdEndnoteLocation parameter.
   */

  @DISPID(100) //= 0x64. The runtime will prefer the VTID if present
  @VTID(13)
  void location(
    word.WdEndnoteLocation prop);


  /**
   * <p>
   * Getter method for the COM property "NumberStyle"
   * </p>
   * @return  Returns a value of type word.WdNoteNumberStyle
   */

  @DISPID(101) //= 0x65. The runtime will prefer the VTID if present
  @VTID(14)
  word.WdNoteNumberStyle numberStyle();


  /**
   * <p>
   * Setter method for the COM property "NumberStyle"
   * </p>
   * @param prop Mandatory word.WdNoteNumberStyle parameter.
   */

  @DISPID(101) //= 0x65. The runtime will prefer the VTID if present
  @VTID(15)
  void numberStyle(
    word.WdNoteNumberStyle prop);


  /**
   * <p>
   * Getter method for the COM property "StartingNumber"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(102) //= 0x66. The runtime will prefer the VTID if present
  @VTID(16)
  int startingNumber();


  /**
   * <p>
   * Setter method for the COM property "StartingNumber"
   * </p>
   * @param prop Mandatory int parameter.
   */

  @DISPID(102) //= 0x66. The runtime will prefer the VTID if present
  @VTID(17)
  void startingNumber(
    int prop);


  /**
   * <p>
   * Getter method for the COM property "NumberingRule"
   * </p>
   * @return  Returns a value of type word.WdNumberingRule
   */

  @DISPID(103) //= 0x67. The runtime will prefer the VTID if present
  @VTID(18)
  word.WdNumberingRule numberingRule();


  /**
   * <p>
   * Setter method for the COM property "NumberingRule"
   * </p>
   * @param prop Mandatory word.WdNumberingRule parameter.
   */

  @DISPID(103) //= 0x67. The runtime will prefer the VTID if present
  @VTID(19)
  void numberingRule(
    word.WdNumberingRule prop);


  /**
   * <p>
   * Getter method for the COM property "Separator"
   * </p>
   * @return  Returns a value of type word.Range
   */

  @DISPID(104) //= 0x68. The runtime will prefer the VTID if present
  @VTID(20)
  word.Range separator();


  /**
   * <p>
   * Getter method for the COM property "ContinuationSeparator"
   * </p>
   * @return  Returns a value of type word.Range
   */

  @DISPID(105) //= 0x69. The runtime will prefer the VTID if present
  @VTID(21)
  word.Range continuationSeparator();


  /**
   * <p>
   * Getter method for the COM property "ContinuationNotice"
   * </p>
   * @return  Returns a value of type word.Range
   */

  @DISPID(106) //= 0x6a. The runtime will prefer the VTID if present
  @VTID(22)
  word.Range continuationNotice();


  /**
   * @param index Mandatory int parameter.
   * @return  Returns a value of type word.Endnote
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(23)
  @DefaultMethod
  word.Endnote item(
    int index);


  /**
   * @param range Mandatory word.Range parameter.
   * @param reference Optional parameter. Default value is com4j.Variant.getMissing()
   * @param text Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type word.Endnote
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(24)
  word.Endnote add(
    word.Range range,
    @Optional java.lang.Object reference,
    @Optional java.lang.Object text);


  /**
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(25)
  void convert();


  /**
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(26)
  void swapWithFootnotes();


  /**
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(27)
  void resetSeparator();


  /**
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(28)
  void resetContinuationSeparator();


  /**
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(29)
  void resetContinuationNotice();


  // Properties:
}
