package ppt  ;

import com4j.*;

@IID("{91493497-5A91-11CF-8700-00AA0060263B}")
public interface BulletFormat extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of type ppt._Application
   */

  @DISPID(2001) //= 0x7d1. The runtime will prefer the VTID if present
  @VTID(7)
  ppt._Application application();


  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(2002) //= 0x7d2. The runtime will prefer the VTID if present
  @VTID(8)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject parent();


  /**
   * <p>
   * Getter method for the COM property "Visible"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(9)
  @DefaultMethod
  office.MsoTriState visible();


  /**
   * <p>
   * Setter method for the COM property "Visible"
   * </p>
   * @param visible Mandatory office.MsoTriState parameter.
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(10)
  @DefaultMethod
  void visible(
    office.MsoTriState visible);


  /**
   * <p>
   * Getter method for the COM property "Character"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(2003) //= 0x7d3. The runtime will prefer the VTID if present
  @VTID(11)
  int character();


  /**
   * <p>
   * Setter method for the COM property "Character"
   * </p>
   * @param character Mandatory int parameter.
   */

  @DISPID(2003) //= 0x7d3. The runtime will prefer the VTID if present
  @VTID(12)
  void character(
    int character);


  /**
   * <p>
   * Getter method for the COM property "RelativeSize"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(2004) //= 0x7d4. The runtime will prefer the VTID if present
  @VTID(13)
  float relativeSize();


  /**
   * <p>
   * Setter method for the COM property "RelativeSize"
   * </p>
   * @param relativeSize Mandatory float parameter.
   */

  @DISPID(2004) //= 0x7d4. The runtime will prefer the VTID if present
  @VTID(14)
  void relativeSize(
    float relativeSize);


  /**
   * <p>
   * Getter method for the COM property "UseTextColor"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @DISPID(2005) //= 0x7d5. The runtime will prefer the VTID if present
  @VTID(15)
  office.MsoTriState useTextColor();


  /**
   * <p>
   * Setter method for the COM property "UseTextColor"
   * </p>
   * @param useTextColor Mandatory office.MsoTriState parameter.
   */

  @DISPID(2005) //= 0x7d5. The runtime will prefer the VTID if present
  @VTID(16)
  void useTextColor(
    office.MsoTriState useTextColor);


  /**
   * <p>
   * Getter method for the COM property "UseTextFont"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @DISPID(2006) //= 0x7d6. The runtime will prefer the VTID if present
  @VTID(17)
  office.MsoTriState useTextFont();


  /**
   * <p>
   * Setter method for the COM property "UseTextFont"
   * </p>
   * @param useTextFont Mandatory office.MsoTriState parameter.
   */

  @DISPID(2006) //= 0x7d6. The runtime will prefer the VTID if present
  @VTID(18)
  void useTextFont(
    office.MsoTriState useTextFont);


  /**
   * <p>
   * Getter method for the COM property "Font"
   * </p>
   * @return  Returns a value of type ppt.Font
   */

  @DISPID(2007) //= 0x7d7. The runtime will prefer the VTID if present
  @VTID(19)
  ppt.Font font();


  /**
   * <p>
   * Getter method for the COM property "Type"
   * </p>
   * @return  Returns a value of type ppt.PpBulletType
   */

  @DISPID(2008) //= 0x7d8. The runtime will prefer the VTID if present
  @VTID(20)
  ppt.PpBulletType type();


  /**
   * <p>
   * Setter method for the COM property "Type"
   * </p>
   * @param type Mandatory ppt.PpBulletType parameter.
   */

  @DISPID(2008) //= 0x7d8. The runtime will prefer the VTID if present
  @VTID(21)
  void type(
    ppt.PpBulletType type);


  /**
   * <p>
   * Getter method for the COM property "Style"
   * </p>
   * @return  Returns a value of type ppt.PpNumberedBulletStyle
   */

  @DISPID(2009) //= 0x7d9. The runtime will prefer the VTID if present
  @VTID(22)
  ppt.PpNumberedBulletStyle style();


  /**
   * <p>
   * Setter method for the COM property "Style"
   * </p>
   * @param style Mandatory ppt.PpNumberedBulletStyle parameter.
   */

  @DISPID(2009) //= 0x7d9. The runtime will prefer the VTID if present
  @VTID(23)
  void style(
    ppt.PpNumberedBulletStyle style);


  /**
   * <p>
   * Getter method for the COM property "StartValue"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(2010) //= 0x7da. The runtime will prefer the VTID if present
  @VTID(24)
  int startValue();


  /**
   * <p>
   * Setter method for the COM property "StartValue"
   * </p>
   * @param startValue Mandatory int parameter.
   */

  @DISPID(2010) //= 0x7da. The runtime will prefer the VTID if present
  @VTID(25)
  void startValue(
    int startValue);


  /**
   * @param picture Mandatory java.lang.String parameter.
   */

  @DISPID(2011) //= 0x7db. The runtime will prefer the VTID if present
  @VTID(26)
  void picture(
    java.lang.String picture);


  /**
   * <p>
   * Getter method for the COM property "Number"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(2012) //= 0x7dc. The runtime will prefer the VTID if present
  @VTID(27)
  int number();


  // Properties:
}
