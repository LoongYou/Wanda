package word  ;

import com4j.*;

@IID("{00020992-0000-0000-C000-000000000046}")
public interface List extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Range"
   * </p>
   * @return  Returns a value of type word.Range
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(7)
  word.Range range();


  /**
   * <p>
   * Getter method for the COM property "ListParagraphs"
   * </p>
   * @return  Returns a value of type word.ListParagraphs
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(8)
  word.ListParagraphs listParagraphs();


  @VTID(8)
  @ReturnValue(defaultPropertyThrough={word.ListParagraphs.class})
  word.Paragraph listParagraphs(
    int index);

  /**
   * <p>
   * Getter method for the COM property "SingleListTemplate"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(9)
  boolean singleListTemplate();


  /**
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of type word._Application
   */

  @DISPID(1000) //= 0x3e8. The runtime will prefer the VTID if present
  @VTID(10)
  word._Application application();


  /**
   * <p>
   * Getter method for the COM property "Creator"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1001) //= 0x3e9. The runtime will prefer the VTID if present
  @VTID(11)
  int creator();


  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(1002) //= 0x3ea. The runtime will prefer the VTID if present
  @VTID(12)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject parent();


  /**
   * @param numberType Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(101) //= 0x65. The runtime will prefer the VTID if present
  @VTID(13)
  void convertNumbersToText(
    @Optional java.lang.Object numberType);


  /**
   * @param numberType Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(102) //= 0x66. The runtime will prefer the VTID if present
  @VTID(14)
  void removeNumbers(
    @Optional java.lang.Object numberType);


  /**
   * @param numberType Optional parameter. Default value is com4j.Variant.getMissing()
   * @param level Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type int
   */

  @DISPID(103) //= 0x67. The runtime will prefer the VTID if present
  @VTID(15)
  int countNumberedItems(
    @Optional java.lang.Object numberType,
    @Optional java.lang.Object level);


  /**
   * @param listTemplate Mandatory word.ListTemplate parameter.
   * @param continuePreviousList Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(104) //= 0x68. The runtime will prefer the VTID if present
  @VTID(16)
  void applyListTemplateOld(
    word.ListTemplate listTemplate,
    @Optional java.lang.Object continuePreviousList);


  /**
   * @param listTemplate Mandatory word.ListTemplate parameter.
   * @return  Returns a value of type word.WdContinue
   */

  @DISPID(105) //= 0x69. The runtime will prefer the VTID if present
  @VTID(17)
  word.WdContinue canContinuePreviousList(
    word.ListTemplate listTemplate);


  /**
   * @param listTemplate Mandatory word.ListTemplate parameter.
   * @param continuePreviousList Optional parameter. Default value is com4j.Variant.getMissing()
   * @param defaultListBehavior Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(106) //= 0x6a. The runtime will prefer the VTID if present
  @VTID(18)
  void applyListTemplate(
    word.ListTemplate listTemplate,
    @Optional java.lang.Object continuePreviousList,
    @Optional java.lang.Object defaultListBehavior);


  /**
   * <p>
   * Getter method for the COM property "StyleName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(19)
  java.lang.String styleName();


  /**
   * @param listTemplate Mandatory word.ListTemplate parameter.
   * @param continuePreviousList Optional parameter. Default value is com4j.Variant.getMissing()
   * @param defaultListBehavior Optional parameter. Default value is com4j.Variant.getMissing()
   * @param applyLevel Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(107) //= 0x6b. The runtime will prefer the VTID if present
  @VTID(20)
  void applyListTemplateWithLevel(
    word.ListTemplate listTemplate,
    @Optional java.lang.Object continuePreviousList,
    @Optional java.lang.Object defaultListBehavior,
    @Optional java.lang.Object applyLevel);


  // Properties:
}
