package office  ;

import com4j.*;

@IID("{000C03B9-0000-0000-C000-000000000046}")
public interface BulletFormat2 extends office._IMsoDispObj {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(9)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject parent();


  /**
   * <p>
   * Getter method for the COM property "Character"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(10)
  int character();


  /**
   * <p>
   * Setter method for the COM property "Character"
   * </p>
   * @param character Mandatory int parameter.
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(11)
  void character(
    int character);


  /**
   * <p>
   * Getter method for the COM property "Font"
   * </p>
   * @return  Returns a value of type office.Font2
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(12)
  office.Font2 font();


  /**
   * <p>
   * Getter method for the COM property "Number"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(13)
  int number();


  /**
   * @param fileName Mandatory java.lang.String parameter.
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(14)
  void picture(
    java.lang.String fileName);


  /**
   * <p>
   * Getter method for the COM property "RelativeSize"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(15)
  float relativeSize();


  /**
   * <p>
   * Setter method for the COM property "RelativeSize"
   * </p>
   * @param size Mandatory float parameter.
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(16)
  void relativeSize(
    float size);


  /**
   * <p>
   * Getter method for the COM property "StartValue"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(17)
  int startValue();


  /**
   * <p>
   * Setter method for the COM property "StartValue"
   * </p>
   * @param start Mandatory int parameter.
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(18)
  void startValue(
    int start);


  /**
   * <p>
   * Getter method for the COM property "Style"
   * </p>
   * @return  Returns a value of type office.MsoNumberedBulletStyle
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(19)
  office.MsoNumberedBulletStyle style();


  /**
   * <p>
   * Setter method for the COM property "Style"
   * </p>
   * @param style Mandatory office.MsoNumberedBulletStyle parameter.
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(20)
  void style(
    office.MsoNumberedBulletStyle style);


  /**
   * <p>
   * Getter method for the COM property "Type"
   * </p>
   * @return  Returns a value of type office.MsoBulletType
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(21)
  office.MsoBulletType type();


  /**
   * <p>
   * Setter method for the COM property "Type"
   * </p>
   * @param type Mandatory office.MsoBulletType parameter.
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(22)
  void type(
    office.MsoBulletType type);


  /**
   * <p>
   * Getter method for the COM property "UseTextColor"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(23)
  office.MsoTriState useTextColor();


  /**
   * <p>
   * Setter method for the COM property "UseTextColor"
   * </p>
   * @param useTextColor Mandatory office.MsoTriState parameter.
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(24)
  void useTextColor(
    office.MsoTriState useTextColor);


  /**
   * <p>
   * Getter method for the COM property "UseTextFont"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(25)
  office.MsoTriState useTextFont();


  /**
   * <p>
   * Setter method for the COM property "UseTextFont"
   * </p>
   * @param useTextFont Mandatory office.MsoTriState parameter.
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(26)
  void useTextFont(
    office.MsoTriState useTextFont);


  /**
   * <p>
   * Getter method for the COM property "Visible"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(27)
  office.MsoTriState visible();


  /**
   * <p>
   * Setter method for the COM property "Visible"
   * </p>
   * @param visible Mandatory office.MsoTriState parameter.
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(28)
  void visible(
    office.MsoTriState visible);


  // Properties:
}
