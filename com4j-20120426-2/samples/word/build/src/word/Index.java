package word  ;

import com4j.*;

@IID("{0002097D-0000-0000-C000-000000000046}")
public interface Index extends Com4jObject {
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
   * Getter method for the COM property "HeadingSeparator"
   * </p>
   * @return  Returns a value of type word.WdHeadingSeparator
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(10)
  word.WdHeadingSeparator headingSeparator();


  /**
   * <p>
   * Setter method for the COM property "HeadingSeparator"
   * </p>
   * @param prop Mandatory word.WdHeadingSeparator parameter.
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(11)
  void headingSeparator(
    word.WdHeadingSeparator prop);


  /**
   * <p>
   * Getter method for the COM property "RightAlignPageNumbers"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(12)
  boolean rightAlignPageNumbers();


  /**
   * <p>
   * Setter method for the COM property "RightAlignPageNumbers"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(13)
  void rightAlignPageNumbers(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "Type"
   * </p>
   * @return  Returns a value of type word.WdIndexType
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(14)
  word.WdIndexType type();


  /**
   * <p>
   * Setter method for the COM property "Type"
   * </p>
   * @param prop Mandatory word.WdIndexType parameter.
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(15)
  void type(
    word.WdIndexType prop);


  /**
   * <p>
   * Getter method for the COM property "NumberOfColumns"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(16)
  int numberOfColumns();


  /**
   * <p>
   * Setter method for the COM property "NumberOfColumns"
   * </p>
   * @param prop Mandatory int parameter.
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(17)
  void numberOfColumns(
    int prop);


  /**
   * <p>
   * Getter method for the COM property "Range"
   * </p>
   * @return  Returns a value of type word.Range
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(18)
  word.Range range();


  /**
   * <p>
   * Getter method for the COM property "TabLeader"
   * </p>
   * @return  Returns a value of type word.WdTabLeader
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(19)
  word.WdTabLeader tabLeader();


  /**
   * <p>
   * Setter method for the COM property "TabLeader"
   * </p>
   * @param prop Mandatory word.WdTabLeader parameter.
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(20)
  void tabLeader(
    word.WdTabLeader prop);


  /**
   * <p>
   * Getter method for the COM property "AccentedLetters"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(21)
  boolean accentedLetters();


  /**
   * <p>
   * Setter method for the COM property "AccentedLetters"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(22)
  void accentedLetters(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "SortBy"
   * </p>
   * @return  Returns a value of type word.WdIndexSortBy
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(23)
  word.WdIndexSortBy sortBy();


  /**
   * <p>
   * Setter method for the COM property "SortBy"
   * </p>
   * @param prop Mandatory word.WdIndexSortBy parameter.
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(24)
  void sortBy(
    word.WdIndexSortBy prop);


  /**
   * <p>
   * Getter method for the COM property "Filter"
   * </p>
   * @return  Returns a value of type word.WdIndexFilter
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(25)
  word.WdIndexFilter filter();


  /**
   * <p>
   * Setter method for the COM property "Filter"
   * </p>
   * @param prop Mandatory word.WdIndexFilter parameter.
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(26)
  void filter(
    word.WdIndexFilter prop);


  /**
   */

  @DISPID(100) //= 0x64. The runtime will prefer the VTID if present
  @VTID(27)
  void delete();


  /**
   */

  @DISPID(102) //= 0x66. The runtime will prefer the VTID if present
  @VTID(28)
  void update();


  /**
   * <p>
   * Getter method for the COM property "IndexLanguage"
   * </p>
   * @return  Returns a value of type word.WdLanguageID
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(29)
  word.WdLanguageID indexLanguage();


  /**
   * <p>
   * Setter method for the COM property "IndexLanguage"
   * </p>
   * @param prop Mandatory word.WdLanguageID parameter.
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(30)
  void indexLanguage(
    word.WdLanguageID prop);


  // Properties:
}
