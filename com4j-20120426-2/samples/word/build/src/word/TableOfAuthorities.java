package word  ;

import com4j.*;

@IID("{00020911-0000-0000-C000-000000000046}")
public interface TableOfAuthorities extends Com4jObject {
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
   * Getter method for the COM property "Passim"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(10)
  boolean passim();


  /**
   * <p>
   * Setter method for the COM property "Passim"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(11)
  void passim(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "KeepEntryFormatting"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(12)
  boolean keepEntryFormatting();


  /**
   * <p>
   * Setter method for the COM property "KeepEntryFormatting"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(13)
  void keepEntryFormatting(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "Category"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(14)
  int category();


  /**
   * <p>
   * Setter method for the COM property "Category"
   * </p>
   * @param prop Mandatory int parameter.
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(15)
  void category(
    int prop);


  /**
   * <p>
   * Getter method for the COM property "Bookmark"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(16)
  java.lang.String bookmark();


  /**
   * <p>
   * Setter method for the COM property "Bookmark"
   * </p>
   * @param prop Mandatory java.lang.String parameter.
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(17)
  void bookmark(
    java.lang.String prop);


  /**
   * <p>
   * Getter method for the COM property "Separator"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(18)
  java.lang.String separator();


  /**
   * <p>
   * Setter method for the COM property "Separator"
   * </p>
   * @param prop Mandatory java.lang.String parameter.
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(19)
  void separator(
    java.lang.String prop);


  /**
   * <p>
   * Getter method for the COM property "IncludeSequenceName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(20)
  java.lang.String includeSequenceName();


  /**
   * <p>
   * Setter method for the COM property "IncludeSequenceName"
   * </p>
   * @param prop Mandatory java.lang.String parameter.
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(21)
  void includeSequenceName(
    java.lang.String prop);


  /**
   * <p>
   * Getter method for the COM property "EntrySeparator"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(22)
  java.lang.String entrySeparator();


  /**
   * <p>
   * Setter method for the COM property "EntrySeparator"
   * </p>
   * @param prop Mandatory java.lang.String parameter.
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(23)
  void entrySeparator(
    java.lang.String prop);


  /**
   * <p>
   * Getter method for the COM property "PageRangeSeparator"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(24)
  java.lang.String pageRangeSeparator();


  /**
   * <p>
   * Setter method for the COM property "PageRangeSeparator"
   * </p>
   * @param prop Mandatory java.lang.String parameter.
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(25)
  void pageRangeSeparator(
    java.lang.String prop);


  /**
   * <p>
   * Getter method for the COM property "IncludeCategoryHeader"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(26)
  boolean includeCategoryHeader();


  /**
   * <p>
   * Setter method for the COM property "IncludeCategoryHeader"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(27)
  void includeCategoryHeader(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "PageNumberSeparator"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(28)
  java.lang.String pageNumberSeparator();


  /**
   * <p>
   * Setter method for the COM property "PageNumberSeparator"
   * </p>
   * @param prop Mandatory java.lang.String parameter.
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(29)
  void pageNumberSeparator(
    java.lang.String prop);


  /**
   * <p>
   * Getter method for the COM property "Range"
   * </p>
   * @return  Returns a value of type word.Range
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(30)
  word.Range range();


  /**
   * <p>
   * Getter method for the COM property "TabLeader"
   * </p>
   * @return  Returns a value of type word.WdTabLeader
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(31)
  word.WdTabLeader tabLeader();


  /**
   * <p>
   * Setter method for the COM property "TabLeader"
   * </p>
   * @param prop Mandatory word.WdTabLeader parameter.
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(32)
  void tabLeader(
    word.WdTabLeader prop);


  /**
   */

  @DISPID(100) //= 0x64. The runtime will prefer the VTID if present
  @VTID(33)
  void delete();


  /**
   */

  @DISPID(101) //= 0x65. The runtime will prefer the VTID if present
  @VTID(34)
  void update();


  // Properties:
}
