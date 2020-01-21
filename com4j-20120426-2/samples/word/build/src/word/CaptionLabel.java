package word  ;

import com4j.*;

@IID("{00020979-0000-0000-C000-000000000046}")
public interface CaptionLabel extends Com4jObject {
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
   * Getter method for the COM property "Name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(10)
  @DefaultMethod
  java.lang.String name();


  /**
   * <p>
   * Getter method for the COM property "BuiltIn"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(11)
  boolean builtIn();


  /**
   * <p>
   * Getter method for the COM property "ID"
   * </p>
   * @return  Returns a value of type word.WdCaptionLabelID
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(12)
  word.WdCaptionLabelID id();


  /**
   * <p>
   * Getter method for the COM property "IncludeChapterNumber"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(13)
  boolean includeChapterNumber();


  /**
   * <p>
   * Setter method for the COM property "IncludeChapterNumber"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(14)
  void includeChapterNumber(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "NumberStyle"
   * </p>
   * @return  Returns a value of type word.WdCaptionNumberStyle
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(15)
  word.WdCaptionNumberStyle numberStyle();


  /**
   * <p>
   * Setter method for the COM property "NumberStyle"
   * </p>
   * @param prop Mandatory word.WdCaptionNumberStyle parameter.
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(16)
  void numberStyle(
    word.WdCaptionNumberStyle prop);


  /**
   * <p>
   * Getter method for the COM property "ChapterStyleLevel"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(17)
  int chapterStyleLevel();


  /**
   * <p>
   * Setter method for the COM property "ChapterStyleLevel"
   * </p>
   * @param prop Mandatory int parameter.
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(18)
  void chapterStyleLevel(
    int prop);


  /**
   * <p>
   * Getter method for the COM property "Separator"
   * </p>
   * @return  Returns a value of type word.WdSeparatorType
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(19)
  word.WdSeparatorType separator();


  /**
   * <p>
   * Setter method for the COM property "Separator"
   * </p>
   * @param prop Mandatory word.WdSeparatorType parameter.
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(20)
  void separator(
    word.WdSeparatorType prop);


  /**
   * <p>
   * Getter method for the COM property "Position"
   * </p>
   * @return  Returns a value of type word.WdCaptionPosition
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(21)
  word.WdCaptionPosition position();


  /**
   * <p>
   * Setter method for the COM property "Position"
   * </p>
   * @param prop Mandatory word.WdCaptionPosition parameter.
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(22)
  void position(
    word.WdCaptionPosition prop);


  /**
   */

  @DISPID(100) //= 0x64. The runtime will prefer the VTID if present
  @VTID(23)
  void delete();


  // Properties:
}
