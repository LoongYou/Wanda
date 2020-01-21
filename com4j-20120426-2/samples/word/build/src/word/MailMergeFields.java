package word  ;

import com4j.*;

@IID("{0002091F-0000-0000-C000-000000000046}")
public interface MailMergeFields extends Com4jObject,Iterable<Com4jObject> {
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
   * @param index Mandatory int parameter.
   * @return  Returns a value of type word.MailMergeField
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(12)
  @DefaultMethod
  word.MailMergeField item(
    int index);


  /**
   * @param range Mandatory word.Range parameter.
   * @param name Mandatory java.lang.String parameter.
   * @return  Returns a value of type word.MailMergeField
   */

  @DISPID(101) //= 0x65. The runtime will prefer the VTID if present
  @VTID(13)
  word.MailMergeField add(
    word.Range range,
    java.lang.String name);


  /**
   * @param range Mandatory word.Range parameter.
   * @param name Mandatory java.lang.String parameter.
   * @param prompt Optional parameter. Default value is com4j.Variant.getMissing()
   * @param defaultAskText Optional parameter. Default value is com4j.Variant.getMissing()
   * @param askOnce Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type word.MailMergeField
   */

  @DISPID(102) //= 0x66. The runtime will prefer the VTID if present
  @VTID(14)
  word.MailMergeField addAsk(
    word.Range range,
    java.lang.String name,
    @Optional java.lang.Object prompt,
    @Optional java.lang.Object defaultAskText,
    @Optional java.lang.Object askOnce);


  /**
   * @param range Mandatory word.Range parameter.
   * @param prompt Optional parameter. Default value is com4j.Variant.getMissing()
   * @param defaultFillInText Optional parameter. Default value is com4j.Variant.getMissing()
   * @param askOnce Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type word.MailMergeField
   */

  @DISPID(103) //= 0x67. The runtime will prefer the VTID if present
  @VTID(15)
  word.MailMergeField addFillIn(
    word.Range range,
    @Optional java.lang.Object prompt,
    @Optional java.lang.Object defaultFillInText,
    @Optional java.lang.Object askOnce);


  /**
   * @param range Mandatory word.Range parameter.
   * @param mergeField Mandatory java.lang.String parameter.
   * @param comparison Mandatory word.WdMailMergeComparison parameter.
   * @param compareTo Optional parameter. Default value is com4j.Variant.getMissing()
   * @param trueAutoText Optional parameter. Default value is com4j.Variant.getMissing()
   * @param trueText Optional parameter. Default value is com4j.Variant.getMissing()
   * @param falseAutoText Optional parameter. Default value is com4j.Variant.getMissing()
   * @param falseText Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type word.MailMergeField
   */

  @DISPID(104) //= 0x68. The runtime will prefer the VTID if present
  @VTID(16)
  word.MailMergeField addIf(
    word.Range range,
    java.lang.String mergeField,
    word.WdMailMergeComparison comparison,
    @Optional java.lang.Object compareTo,
    @Optional java.lang.Object trueAutoText,
    @Optional java.lang.Object trueText,
    @Optional java.lang.Object falseAutoText,
    @Optional java.lang.Object falseText);


  /**
   * @param range Mandatory word.Range parameter.
   * @return  Returns a value of type word.MailMergeField
   */

  @DISPID(105) //= 0x69. The runtime will prefer the VTID if present
  @VTID(17)
  word.MailMergeField addMergeRec(
    word.Range range);


  /**
   * @param range Mandatory word.Range parameter.
   * @return  Returns a value of type word.MailMergeField
   */

  @DISPID(106) //= 0x6a. The runtime will prefer the VTID if present
  @VTID(18)
  word.MailMergeField addMergeSeq(
    word.Range range);


  /**
   * @param range Mandatory word.Range parameter.
   * @return  Returns a value of type word.MailMergeField
   */

  @DISPID(107) //= 0x6b. The runtime will prefer the VTID if present
  @VTID(19)
  word.MailMergeField addNext(
    word.Range range);


  /**
   * @param range Mandatory word.Range parameter.
   * @param mergeField Mandatory java.lang.String parameter.
   * @param comparison Mandatory word.WdMailMergeComparison parameter.
   * @param compareTo Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type word.MailMergeField
   */

  @DISPID(108) //= 0x6c. The runtime will prefer the VTID if present
  @VTID(20)
  word.MailMergeField addNextIf(
    word.Range range,
    java.lang.String mergeField,
    word.WdMailMergeComparison comparison,
    @Optional java.lang.Object compareTo);


  /**
   * @param range Mandatory word.Range parameter.
   * @param name Mandatory java.lang.String parameter.
   * @param valueText Optional parameter. Default value is com4j.Variant.getMissing()
   * @param valueAutoText Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type word.MailMergeField
   */

  @DISPID(109) //= 0x6d. The runtime will prefer the VTID if present
  @VTID(21)
  word.MailMergeField addSet(
    word.Range range,
    java.lang.String name,
    @Optional java.lang.Object valueText,
    @Optional java.lang.Object valueAutoText);


  /**
   * @param range Mandatory word.Range parameter.
   * @param mergeField Mandatory java.lang.String parameter.
   * @param comparison Mandatory word.WdMailMergeComparison parameter.
   * @param compareTo Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type word.MailMergeField
   */

  @DISPID(110) //= 0x6e. The runtime will prefer the VTID if present
  @VTID(22)
  word.MailMergeField addSkipIf(
    word.Range range,
    java.lang.String mergeField,
    word.WdMailMergeComparison comparison,
    @Optional java.lang.Object compareTo);


  // Properties:
}
