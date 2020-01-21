package word  ;

import com4j.*;

@IID("{00020986-0000-0000-C000-000000000046}")
public interface PageNumbers extends Com4jObject,Iterable<Com4jObject> {
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
   * Getter method for the COM property "_NewEnum"
   * </p>
   */

  @DISPID(-4) //= 0xfffffffc. The runtime will prefer the VTID if present
  @VTID(10)
  java.util.Iterator<Com4jObject> iterator();

  /**
   * <p>
   * Getter method for the COM property "Count"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(11)
  int count();


  /**
   * <p>
   * Getter method for the COM property "NumberStyle"
   * </p>
   * @return  Returns a value of type word.WdPageNumberStyle
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(12)
  word.WdPageNumberStyle numberStyle();


  /**
   * <p>
   * Setter method for the COM property "NumberStyle"
   * </p>
   * @param prop Mandatory word.WdPageNumberStyle parameter.
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(13)
  void numberStyle(
    word.WdPageNumberStyle prop);


  /**
   * <p>
   * Getter method for the COM property "IncludeChapterNumber"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(14)
  boolean includeChapterNumber();


  /**
   * <p>
   * Setter method for the COM property "IncludeChapterNumber"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(15)
  void includeChapterNumber(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "HeadingLevelForChapter"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(16)
  int headingLevelForChapter();


  /**
   * <p>
   * Setter method for the COM property "HeadingLevelForChapter"
   * </p>
   * @param prop Mandatory int parameter.
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(17)
  void headingLevelForChapter(
    int prop);


  /**
   * <p>
   * Getter method for the COM property "ChapterPageSeparator"
   * </p>
   * @return  Returns a value of type word.WdSeparatorType
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(18)
  word.WdSeparatorType chapterPageSeparator();


  /**
   * <p>
   * Setter method for the COM property "ChapterPageSeparator"
   * </p>
   * @param prop Mandatory word.WdSeparatorType parameter.
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(19)
  void chapterPageSeparator(
    word.WdSeparatorType prop);


  /**
   * <p>
   * Getter method for the COM property "RestartNumberingAtSection"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(20)
  boolean restartNumberingAtSection();


  /**
   * <p>
   * Setter method for the COM property "RestartNumberingAtSection"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(21)
  void restartNumberingAtSection(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "StartingNumber"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(22)
  int startingNumber();


  /**
   * <p>
   * Setter method for the COM property "StartingNumber"
   * </p>
   * @param prop Mandatory int parameter.
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(23)
  void startingNumber(
    int prop);


  /**
   * <p>
   * Getter method for the COM property "ShowFirstPageNumber"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(24)
  boolean showFirstPageNumber();


  /**
   * <p>
   * Setter method for the COM property "ShowFirstPageNumber"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(25)
  void showFirstPageNumber(
    boolean prop);


  /**
   * @param index Mandatory int parameter.
   * @return  Returns a value of type word.PageNumber
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(26)
  @DefaultMethod
  word.PageNumber item(
    int index);


  /**
   * @param pageNumberAlignment Optional parameter. Default value is com4j.Variant.getMissing()
   * @param firstPage Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type word.PageNumber
   */

  @DISPID(101) //= 0x65. The runtime will prefer the VTID if present
  @VTID(27)
  word.PageNumber add(
    @Optional java.lang.Object pageNumberAlignment,
    @Optional java.lang.Object firstPage);


  /**
   * <p>
   * Getter method for the COM property "DoubleQuote"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(28)
  boolean doubleQuote();


  /**
   * <p>
   * Setter method for the COM property "DoubleQuote"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(29)
  void doubleQuote(
    boolean prop);


  // Properties:
}
