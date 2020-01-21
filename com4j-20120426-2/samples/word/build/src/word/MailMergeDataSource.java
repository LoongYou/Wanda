package word  ;

import com4j.*;

@IID("{0002091D-0000-0000-C000-000000000046}")
public interface MailMergeDataSource extends Com4jObject {
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

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(10)
  java.lang.String name();


  /**
   * <p>
   * Getter method for the COM property "HeaderSourceName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(11)
  java.lang.String headerSourceName();


  /**
   * <p>
   * Getter method for the COM property "Type"
   * </p>
   * @return  Returns a value of type word.WdMailMergeDataSource
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(12)
  word.WdMailMergeDataSource type();


  /**
   * <p>
   * Getter method for the COM property "HeaderSourceType"
   * </p>
   * @return  Returns a value of type word.WdMailMergeDataSource
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(13)
  word.WdMailMergeDataSource headerSourceType();


  /**
   * <p>
   * Getter method for the COM property "ConnectString"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(14)
  java.lang.String connectString();


  /**
   * <p>
   * Getter method for the COM property "QueryString"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(15)
  java.lang.String queryString();


  /**
   * <p>
   * Setter method for the COM property "QueryString"
   * </p>
   * @param prop Mandatory java.lang.String parameter.
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(16)
  void queryString(
    java.lang.String prop);


  /**
   * <p>
   * Getter method for the COM property "ActiveRecord"
   * </p>
   * @return  Returns a value of type word.WdMailMergeActiveRecord
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(17)
  word.WdMailMergeActiveRecord activeRecord();


  /**
   * <p>
   * Setter method for the COM property "ActiveRecord"
   * </p>
   * @param prop Mandatory word.WdMailMergeActiveRecord parameter.
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(18)
  void activeRecord(
    word.WdMailMergeActiveRecord prop);


  /**
   * <p>
   * Getter method for the COM property "FirstRecord"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(19)
  int firstRecord();


  /**
   * <p>
   * Setter method for the COM property "FirstRecord"
   * </p>
   * @param prop Mandatory int parameter.
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(20)
  void firstRecord(
    int prop);


  /**
   * <p>
   * Getter method for the COM property "LastRecord"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(21)
  int lastRecord();


  /**
   * <p>
   * Setter method for the COM property "LastRecord"
   * </p>
   * @param prop Mandatory int parameter.
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(22)
  void lastRecord(
    int prop);


  /**
   * <p>
   * Getter method for the COM property "FieldNames"
   * </p>
   * @return  Returns a value of type word.MailMergeFieldNames
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(23)
  word.MailMergeFieldNames fieldNames();


  @VTID(23)
  @ReturnValue(defaultPropertyThrough={word.MailMergeFieldNames.class})
  word.MailMergeFieldName fieldNames(
    java.lang.Object index);

  /**
   * <p>
   * Getter method for the COM property "DataFields"
   * </p>
   * @return  Returns a value of type word.MailMergeDataFields
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(24)
  word.MailMergeDataFields dataFields();


  @VTID(24)
  @ReturnValue(defaultPropertyThrough={word.MailMergeDataFields.class})
  word.MailMergeDataField dataFields(
    java.lang.Object index);

  /**
   * @param findText Mandatory java.lang.String parameter.
   * @param field Mandatory java.lang.String parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(101) //= 0x65. The runtime will prefer the VTID if present
  @VTID(25)
  boolean findRecord2000(
    java.lang.String findText,
    java.lang.String field);


  /**
   * <p>
   * Getter method for the COM property "RecordCount"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(26)
  int recordCount();


  /**
   * <p>
   * Getter method for the COM property "Included"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(13) //= 0xd. The runtime will prefer the VTID if present
  @VTID(27)
  boolean included();


  /**
   * <p>
   * Setter method for the COM property "Included"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(13) //= 0xd. The runtime will prefer the VTID if present
  @VTID(28)
  void included(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "InvalidAddress"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(14) //= 0xe. The runtime will prefer the VTID if present
  @VTID(29)
  boolean invalidAddress();


  /**
   * <p>
   * Setter method for the COM property "InvalidAddress"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(14) //= 0xe. The runtime will prefer the VTID if present
  @VTID(30)
  void invalidAddress(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "InvalidComments"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(15) //= 0xf. The runtime will prefer the VTID if present
  @VTID(31)
  java.lang.String invalidComments();


  /**
   * <p>
   * Setter method for the COM property "InvalidComments"
   * </p>
   * @param prop Mandatory java.lang.String parameter.
   */

  @DISPID(15) //= 0xf. The runtime will prefer the VTID if present
  @VTID(32)
  void invalidComments(
    java.lang.String prop);


  /**
   * <p>
   * Getter method for the COM property "MappedDataFields"
   * </p>
   * @return  Returns a value of type word.MappedDataFields
   */

  @DISPID(16) //= 0x10. The runtime will prefer the VTID if present
  @VTID(33)
  word.MappedDataFields mappedDataFields();


  @VTID(33)
  @ReturnValue(defaultPropertyThrough={word.MappedDataFields.class})
  word.MappedDataField mappedDataFields(
    word.WdMappedDataFields index);

  /**
   * <p>
   * Getter method for the COM property "TableName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(17) //= 0x11. The runtime will prefer the VTID if present
  @VTID(34)
  java.lang.String tableName();


  /**
   * @param findText Mandatory java.lang.String parameter.
   * @param field Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type boolean
   */

  @DISPID(102) //= 0x66. The runtime will prefer the VTID if present
  @VTID(35)
  boolean findRecord(
    java.lang.String findText,
    @Optional java.lang.Object field);


  /**
   * @param included Mandatory boolean parameter.
   */

  @DISPID(103) //= 0x67. The runtime will prefer the VTID if present
  @VTID(36)
  void setAllIncludedFlags(
    boolean included);


  /**
   * @param invalid Mandatory boolean parameter.
   * @param invalidComment Mandatory java.lang.String parameter.
   */

  @DISPID(104) //= 0x68. The runtime will prefer the VTID if present
  @VTID(37)
  void setAllErrorFlags(
    boolean invalid,
    java.lang.String invalidComment);


  /**
   */

  @DISPID(105) //= 0x69. The runtime will prefer the VTID if present
  @VTID(38)
  void close();


  // Properties:
}
