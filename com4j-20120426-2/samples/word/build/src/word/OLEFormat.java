package word  ;

import com4j.*;

@IID("{00020933-0000-0000-C000-000000000046}")
public interface OLEFormat extends Com4jObject {
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
   * Getter method for the COM property "ClassType"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(10)
  java.lang.String classType();


  /**
   * <p>
   * Setter method for the COM property "ClassType"
   * </p>
   * @param prop Mandatory java.lang.String parameter.
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(11)
  void classType(
    java.lang.String prop);


  /**
   * <p>
   * Getter method for the COM property "DisplayAsIcon"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(12)
  boolean displayAsIcon();


  /**
   * <p>
   * Setter method for the COM property "DisplayAsIcon"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(13)
  void displayAsIcon(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "IconName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(14)
  java.lang.String iconName();


  /**
   * <p>
   * Setter method for the COM property "IconName"
   * </p>
   * @param prop Mandatory java.lang.String parameter.
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(15)
  void iconName(
    java.lang.String prop);


  /**
   * <p>
   * Getter method for the COM property "IconPath"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(16)
  java.lang.String iconPath();


  /**
   * <p>
   * Getter method for the COM property "IconIndex"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(17)
  int iconIndex();


  /**
   * <p>
   * Setter method for the COM property "IconIndex"
   * </p>
   * @param prop Mandatory int parameter.
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(18)
  void iconIndex(
    int prop);


  /**
   * <p>
   * Getter method for the COM property "IconLabel"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(19)
  java.lang.String iconLabel();


  /**
   * <p>
   * Setter method for the COM property "IconLabel"
   * </p>
   * @param prop Mandatory java.lang.String parameter.
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(20)
  void iconLabel(
    java.lang.String prop);


  /**
   * <p>
   * Getter method for the COM property "Label"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(21)
  java.lang.String label();


  /**
   * <p>
   * Getter method for the COM property "Object"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(14) //= 0xe. The runtime will prefer the VTID if present
  @VTID(22)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject object();


  /**
   * <p>
   * Getter method for the COM property "ProgID"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(22) //= 0x16. The runtime will prefer the VTID if present
  @VTID(23)
  java.lang.String progID();


  /**
   */

  @DISPID(104) //= 0x68. The runtime will prefer the VTID if present
  @VTID(24)
  void activate();


  /**
   */

  @DISPID(106) //= 0x6a. The runtime will prefer the VTID if present
  @VTID(25)
  void edit();


  /**
   */

  @DISPID(107) //= 0x6b. The runtime will prefer the VTID if present
  @VTID(26)
  void open();


  /**
   * @param verbIndex Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(109) //= 0x6d. The runtime will prefer the VTID if present
  @VTID(27)
  void doVerb(
    @Optional java.lang.Object verbIndex);


  /**
   * @param classType Optional parameter. Default value is com4j.Variant.getMissing()
   * @param displayAsIcon Optional parameter. Default value is com4j.Variant.getMissing()
   * @param iconFileName Optional parameter. Default value is com4j.Variant.getMissing()
   * @param iconIndex Optional parameter. Default value is com4j.Variant.getMissing()
   * @param iconLabel Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(110) //= 0x6e. The runtime will prefer the VTID if present
  @VTID(28)
  void convertTo(
    @Optional java.lang.Object classType,
    @Optional java.lang.Object displayAsIcon,
    @Optional java.lang.Object iconFileName,
    @Optional java.lang.Object iconIndex,
    @Optional java.lang.Object iconLabel);


  /**
   * @param classType Mandatory java.lang.String parameter.
   */

  @DISPID(111) //= 0x6f. The runtime will prefer the VTID if present
  @VTID(29)
  void activateAs(
    java.lang.String classType);


  /**
   * <p>
   * Getter method for the COM property "PreserveFormattingOnUpdate"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(112) //= 0x70. The runtime will prefer the VTID if present
  @VTID(30)
  boolean preserveFormattingOnUpdate();


  /**
   * <p>
   * Setter method for the COM property "PreserveFormattingOnUpdate"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(112) //= 0x70. The runtime will prefer the VTID if present
  @VTID(31)
  void preserveFormattingOnUpdate(
    boolean prop);


  // Properties:
}
