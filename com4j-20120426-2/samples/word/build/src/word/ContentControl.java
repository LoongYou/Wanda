package word  ;

import com4j.*;

@IID("{EE95AFE3-3026-4172-B078-0E79DAB5CC3D}")
public interface ContentControl extends Com4jObject {
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
   * Getter method for the COM property "Range"
   * </p>
   * @return  Returns a value of type word.Range
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(10)
  word.Range range();


  /**
   * <p>
   * Getter method for the COM property "LockContentControl"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(11)
  boolean lockContentControl();


  /**
   * <p>
   * Setter method for the COM property "LockContentControl"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(12)
  void lockContentControl(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "LockContents"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(13)
  boolean lockContents();


  /**
   * <p>
   * Setter method for the COM property "LockContents"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(14)
  void lockContents(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "XMLMapping"
   * </p>
   * @return  Returns a value of type word.XMLMapping
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(15)
  word.XMLMapping xmlMapping();


  /**
   * <p>
   * Getter method for the COM property "Type"
   * </p>
   * @return  Returns a value of type word.WdContentControlType
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(16)
  word.WdContentControlType type();


  /**
   * <p>
   * Setter method for the COM property "Type"
   * </p>
   * @param prop Mandatory word.WdContentControlType parameter.
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(17)
  void type(
    word.WdContentControlType prop);


  /**
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(18)
  void copy();


  /**
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(19)
  void cut();


  /**
   * @param deleteContents Optional parameter. Default value is false
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(20)
  void delete(
    @Optional @DefaultValue("0") boolean deleteContents);


  /**
   * <p>
   * Getter method for the COM property "DropdownListEntries"
   * </p>
   * @return  Returns a value of type word.ContentControlListEntries
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(21)
  word.ContentControlListEntries dropdownListEntries();


  @VTID(21)
  @ReturnValue(defaultPropertyThrough={word.ContentControlListEntries.class})
  word.ContentControlListEntry dropdownListEntries(
    int index);

  /**
   * <p>
   * Getter method for the COM property "PlaceholderText"
   * </p>
   * @return  Returns a value of type word.BuildingBlock
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(22)
  word.BuildingBlock placeholderText();


  /**
   * @param buildingBlock Optional parameter. Default value is 0
   * @param range Optional parameter. Default value is 0
   * @param text Optional parameter. Default value is ""
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(23)
  void setPlaceholderText(
    @Optional @DefaultValue("0") word.BuildingBlock buildingBlock,
    @Optional @DefaultValue("0") word.Range range,
    @Optional @DefaultValue("") java.lang.String text);


  /**
   * <p>
   * Getter method for the COM property "Title"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(24)
  java.lang.String title();


  /**
   * <p>
   * Setter method for the COM property "Title"
   * </p>
   * @param prop Mandatory java.lang.String parameter.
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(25)
  void title(
    java.lang.String prop);


  /**
   * <p>
   * Getter method for the COM property "DateDisplayFormat"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(13) //= 0xd. The runtime will prefer the VTID if present
  @VTID(26)
  java.lang.String dateDisplayFormat();


  /**
   * <p>
   * Setter method for the COM property "DateDisplayFormat"
   * </p>
   * @param prop Mandatory java.lang.String parameter.
   */

  @DISPID(13) //= 0xd. The runtime will prefer the VTID if present
  @VTID(27)
  void dateDisplayFormat(
    java.lang.String prop);


  /**
   * <p>
   * Getter method for the COM property "MultiLine"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(15) //= 0xf. The runtime will prefer the VTID if present
  @VTID(28)
  boolean multiLine();


  /**
   * <p>
   * Setter method for the COM property "MultiLine"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(15) //= 0xf. The runtime will prefer the VTID if present
  @VTID(29)
  void multiLine(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "ParentContentControl"
   * </p>
   * @return  Returns a value of type word.ContentControl
   */

  @DISPID(16) //= 0x10. The runtime will prefer the VTID if present
  @VTID(30)
  word.ContentControl parentContentControl();


  /**
   * <p>
   * Getter method for the COM property "Temporary"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(17) //= 0x11. The runtime will prefer the VTID if present
  @VTID(31)
  boolean temporary();


  /**
   * <p>
   * Setter method for the COM property "Temporary"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(17) //= 0x11. The runtime will prefer the VTID if present
  @VTID(32)
  void temporary(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "ID"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(18) //= 0x12. The runtime will prefer the VTID if present
  @VTID(33)
  java.lang.String id();


  /**
   * <p>
   * Getter method for the COM property "ShowingPlaceholderText"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(19) //= 0x13. The runtime will prefer the VTID if present
  @VTID(34)
  boolean showingPlaceholderText();


  /**
   * <p>
   * Getter method for the COM property "DateStorageFormat"
   * </p>
   * @return  Returns a value of type word.WdContentControlDateStorageFormat
   */

  @DISPID(20) //= 0x14. The runtime will prefer the VTID if present
  @VTID(35)
  word.WdContentControlDateStorageFormat dateStorageFormat();


  /**
   * <p>
   * Setter method for the COM property "DateStorageFormat"
   * </p>
   * @param prop Mandatory word.WdContentControlDateStorageFormat parameter.
   */

  @DISPID(20) //= 0x14. The runtime will prefer the VTID if present
  @VTID(36)
  void dateStorageFormat(
    word.WdContentControlDateStorageFormat prop);


  /**
   * <p>
   * Getter method for the COM property "BuildingBlockType"
   * </p>
   * @return  Returns a value of type word.WdBuildingBlockTypes
   */

  @DISPID(21) //= 0x15. The runtime will prefer the VTID if present
  @VTID(37)
  word.WdBuildingBlockTypes buildingBlockType();


  /**
   * <p>
   * Setter method for the COM property "BuildingBlockType"
   * </p>
   * @param prop Mandatory word.WdBuildingBlockTypes parameter.
   */

  @DISPID(21) //= 0x15. The runtime will prefer the VTID if present
  @VTID(38)
  void buildingBlockType(
    word.WdBuildingBlockTypes prop);


  /**
   * <p>
   * Getter method for the COM property "BuildingBlockCategory"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(22) //= 0x16. The runtime will prefer the VTID if present
  @VTID(39)
  java.lang.String buildingBlockCategory();


  /**
   * <p>
   * Setter method for the COM property "BuildingBlockCategory"
   * </p>
   * @param prop Mandatory java.lang.String parameter.
   */

  @DISPID(22) //= 0x16. The runtime will prefer the VTID if present
  @VTID(40)
  void buildingBlockCategory(
    java.lang.String prop);


  /**
   * <p>
   * Getter method for the COM property "DateDisplayLocale"
   * </p>
   * @return  Returns a value of type word.WdLanguageID
   */

  @DISPID(23) //= 0x17. The runtime will prefer the VTID if present
  @VTID(41)
  word.WdLanguageID dateDisplayLocale();


  /**
   * <p>
   * Setter method for the COM property "DateDisplayLocale"
   * </p>
   * @param prop Mandatory word.WdLanguageID parameter.
   */

  @DISPID(23) //= 0x17. The runtime will prefer the VTID if present
  @VTID(42)
  void dateDisplayLocale(
    word.WdLanguageID prop);


  /**
   */

  @DISPID(24) //= 0x18. The runtime will prefer the VTID if present
  @VTID(43)
  void ungroup();


  /**
   * <p>
   * Getter method for the COM property "DefaultTextStyle"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(25) //= 0x19. The runtime will prefer the VTID if present
  @VTID(44)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object defaultTextStyle();


  /**
   * <p>
   * Setter method for the COM property "DefaultTextStyle"
   * </p>
   * @param prop Mandatory java.lang.Object parameter.
   */

  @DISPID(25) //= 0x19. The runtime will prefer the VTID if present
  @VTID(45)
  void defaultTextStyle(
    java.lang.Object prop);


  /**
   * <p>
   * Getter method for the COM property "DateCalendarType"
   * </p>
   * @return  Returns a value of type word.WdCalendarType
   */

  @DISPID(26) //= 0x1a. The runtime will prefer the VTID if present
  @VTID(46)
  word.WdCalendarType dateCalendarType();


  /**
   * <p>
   * Setter method for the COM property "DateCalendarType"
   * </p>
   * @param prop Mandatory word.WdCalendarType parameter.
   */

  @DISPID(26) //= 0x1a. The runtime will prefer the VTID if present
  @VTID(47)
  void dateCalendarType(
    word.WdCalendarType prop);


  /**
   * <p>
   * Getter method for the COM property "Tag"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(27) //= 0x1b. The runtime will prefer the VTID if present
  @VTID(48)
  java.lang.String tag();


  /**
   * <p>
   * Setter method for the COM property "Tag"
   * </p>
   * @param prop Mandatory java.lang.String parameter.
   */

  @DISPID(27) //= 0x1b. The runtime will prefer the VTID if present
  @VTID(49)
  void tag(
    java.lang.String prop);


  /**
   * <p>
   * Getter method for the COM property "Checked"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(28) //= 0x1c. The runtime will prefer the VTID if present
  @VTID(50)
  boolean checked();


  /**
   * <p>
   * Setter method for the COM property "Checked"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(28) //= 0x1c. The runtime will prefer the VTID if present
  @VTID(51)
  void checked(
    boolean prop);


  /**
   * @param characterNumber Mandatory int parameter.
   * @param font Optional parameter. Default value is ""
   */

  @DISPID(29) //= 0x1d. The runtime will prefer the VTID if present
  @VTID(52)
  void setCheckedSymbol(
    int characterNumber,
    @Optional @DefaultValue("") java.lang.String font);


  /**
   * @param characterNumber Mandatory int parameter.
   * @param font Optional parameter. Default value is ""
   */

  @DISPID(30) //= 0x1e. The runtime will prefer the VTID if present
  @VTID(53)
  void setUncheckedSymbol(
    int characterNumber,
    @Optional @DefaultValue("") java.lang.String font);


  // Properties:
}
