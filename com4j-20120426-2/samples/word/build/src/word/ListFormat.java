package word  ;

import com4j.*;

@IID("{000209C0-0000-0000-C000-000000000046}")
public interface ListFormat extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "ListLevelNumber"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(68) //= 0x44. The runtime will prefer the VTID if present
  @VTID(7)
  int listLevelNumber();


  /**
   * <p>
   * Setter method for the COM property "ListLevelNumber"
   * </p>
   * @param prop Mandatory int parameter.
   */

  @DISPID(68) //= 0x44. The runtime will prefer the VTID if present
  @VTID(8)
  void listLevelNumber(
    int prop);


  /**
   * <p>
   * Getter method for the COM property "List"
   * </p>
   * @return  Returns a value of type word.List
   */

  @DISPID(69) //= 0x45. The runtime will prefer the VTID if present
  @VTID(9)
  word.List list();


  /**
   * <p>
   * Getter method for the COM property "ListTemplate"
   * </p>
   * @return  Returns a value of type word.ListTemplate
   */

  @DISPID(70) //= 0x46. The runtime will prefer the VTID if present
  @VTID(10)
  word.ListTemplate listTemplate();


  /**
   * <p>
   * Getter method for the COM property "ListValue"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(71) //= 0x47. The runtime will prefer the VTID if present
  @VTID(11)
  int listValue();


  /**
   * <p>
   * Getter method for the COM property "SingleList"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(72) //= 0x48. The runtime will prefer the VTID if present
  @VTID(12)
  boolean singleList();


  /**
   * <p>
   * Getter method for the COM property "SingleListTemplate"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(73) //= 0x49. The runtime will prefer the VTID if present
  @VTID(13)
  boolean singleListTemplate();


  /**
   * <p>
   * Getter method for the COM property "ListType"
   * </p>
   * @return  Returns a value of type word.WdListType
   */

  @DISPID(74) //= 0x4a. The runtime will prefer the VTID if present
  @VTID(14)
  word.WdListType listType();


  /**
   * <p>
   * Getter method for the COM property "ListString"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(75) //= 0x4b. The runtime will prefer the VTID if present
  @VTID(15)
  java.lang.String listString();


  /**
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of type word._Application
   */

  @DISPID(1000) //= 0x3e8. The runtime will prefer the VTID if present
  @VTID(16)
  word._Application application();


  /**
   * <p>
   * Getter method for the COM property "Creator"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1001) //= 0x3e9. The runtime will prefer the VTID if present
  @VTID(17)
  int creator();


  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(1002) //= 0x3ea. The runtime will prefer the VTID if present
  @VTID(18)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject parent();


  /**
   * @param listTemplate Mandatory word.ListTemplate parameter.
   * @return  Returns a value of type word.WdContinue
   */

  @DISPID(184) //= 0xb8. The runtime will prefer the VTID if present
  @VTID(19)
  word.WdContinue canContinuePreviousList(
    word.ListTemplate listTemplate);


  /**
   * @param numberType Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(185) //= 0xb9. The runtime will prefer the VTID if present
  @VTID(20)
  void removeNumbers(
    @Optional java.lang.Object numberType);


  /**
   * @param numberType Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(186) //= 0xba. The runtime will prefer the VTID if present
  @VTID(21)
  void convertNumbersToText(
    @Optional java.lang.Object numberType);


  /**
   * @param numberType Optional parameter. Default value is com4j.Variant.getMissing()
   * @param level Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type int
   */

  @DISPID(187) //= 0xbb. The runtime will prefer the VTID if present
  @VTID(22)
  int countNumberedItems(
    @Optional java.lang.Object numberType,
    @Optional java.lang.Object level);


  /**
   */

  @DISPID(188) //= 0xbc. The runtime will prefer the VTID if present
  @VTID(23)
  void applyBulletDefaultOld();


  /**
   */

  @DISPID(189) //= 0xbd. The runtime will prefer the VTID if present
  @VTID(24)
  void applyNumberDefaultOld();


  /**
   */

  @DISPID(190) //= 0xbe. The runtime will prefer the VTID if present
  @VTID(25)
  void applyOutlineNumberDefaultOld();


  /**
   * @param listTemplate Mandatory word.ListTemplate parameter.
   * @param continuePreviousList Optional parameter. Default value is com4j.Variant.getMissing()
   * @param applyTo Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(191) //= 0xbf. The runtime will prefer the VTID if present
  @VTID(26)
  void applyListTemplateOld(
    word.ListTemplate listTemplate,
    @Optional java.lang.Object continuePreviousList,
    @Optional java.lang.Object applyTo);


  /**
   */

  @DISPID(210) //= 0xd2. The runtime will prefer the VTID if present
  @VTID(27)
  void listOutdent();


  /**
   */

  @DISPID(211) //= 0xd3. The runtime will prefer the VTID if present
  @VTID(28)
  void listIndent();


  /**
   * @param defaultListBehavior Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(212) //= 0xd4. The runtime will prefer the VTID if present
  @VTID(29)
  void applyBulletDefault(
    @Optional java.lang.Object defaultListBehavior);


  /**
   * @param defaultListBehavior Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(213) //= 0xd5. The runtime will prefer the VTID if present
  @VTID(30)
  void applyNumberDefault(
    @Optional java.lang.Object defaultListBehavior);


  /**
   * @param defaultListBehavior Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(214) //= 0xd6. The runtime will prefer the VTID if present
  @VTID(31)
  void applyOutlineNumberDefault(
    @Optional java.lang.Object defaultListBehavior);


  /**
   * @param listTemplate Mandatory word.ListTemplate parameter.
   * @param continuePreviousList Optional parameter. Default value is com4j.Variant.getMissing()
   * @param applyTo Optional parameter. Default value is com4j.Variant.getMissing()
   * @param defaultListBehavior Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(215) //= 0xd7. The runtime will prefer the VTID if present
  @VTID(32)
  void applyListTemplate(
    word.ListTemplate listTemplate,
    @Optional java.lang.Object continuePreviousList,
    @Optional java.lang.Object applyTo,
    @Optional java.lang.Object defaultListBehavior);


  /**
   * <p>
   * Getter method for the COM property "ListPictureBullet"
   * </p>
   * @return  Returns a value of type word.InlineShape
   */

  @DISPID(76) //= 0x4c. The runtime will prefer the VTID if present
  @VTID(33)
  word.InlineShape listPictureBullet();


  /**
   * @param listTemplate Mandatory word.ListTemplate parameter.
   * @param continuePreviousList Optional parameter. Default value is com4j.Variant.getMissing()
   * @param applyTo Optional parameter. Default value is com4j.Variant.getMissing()
   * @param defaultListBehavior Optional parameter. Default value is com4j.Variant.getMissing()
   * @param applyLevel Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(216) //= 0xd8. The runtime will prefer the VTID if present
  @VTID(34)
  void applyListTemplateWithLevel(
    word.ListTemplate listTemplate,
    @Optional java.lang.Object continuePreviousList,
    @Optional java.lang.Object applyTo,
    @Optional java.lang.Object defaultListBehavior,
    @Optional java.lang.Object applyLevel);


  // Properties:
}
