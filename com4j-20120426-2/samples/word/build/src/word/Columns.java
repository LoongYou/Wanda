package word  ;

import com4j.*;

@IID("{0002094B-0000-0000-C000-000000000046}")
public interface Columns extends Com4jObject,Iterable<Com4jObject> {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "_NewEnum"
   * </p>
   */

  @DISPID(-4) //= 0xfffffffc. The runtime will prefer the VTID if present
  @VTID(7)
  java.util.Iterator<Com4jObject> iterator();

  /**
   * <p>
   * Getter method for the COM property "Count"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(8)
  int count();


  /**
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of type word._Application
   */

  @DISPID(1000) //= 0x3e8. The runtime will prefer the VTID if present
  @VTID(9)
  word._Application application();


  /**
   * <p>
   * Getter method for the COM property "Creator"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1001) //= 0x3e9. The runtime will prefer the VTID if present
  @VTID(10)
  int creator();


  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(1002) //= 0x3ea. The runtime will prefer the VTID if present
  @VTID(11)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject parent();


  /**
   * <p>
   * Getter method for the COM property "First"
   * </p>
   * @return  Returns a value of type word.Column
   */

  @DISPID(100) //= 0x64. The runtime will prefer the VTID if present
  @VTID(12)
  word.Column first();


  /**
   * <p>
   * Getter method for the COM property "Last"
   * </p>
   * @return  Returns a value of type word.Column
   */

  @DISPID(101) //= 0x65. The runtime will prefer the VTID if present
  @VTID(13)
  word.Column last();


  /**
   * <p>
   * Getter method for the COM property "Width"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(14)
  float width();


  /**
   * <p>
   * Setter method for the COM property "Width"
   * </p>
   * @param prop Mandatory float parameter.
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(15)
  void width(
    float prop);


  /**
   * <p>
   * Getter method for the COM property "Borders"
   * </p>
   * @return  Returns a value of type word.Borders
   */

  @DISPID(1100) //= 0x44c. The runtime will prefer the VTID if present
  @VTID(16)
  word.Borders borders();


  @VTID(16)
  @ReturnValue(defaultPropertyThrough={word.Borders.class})
  word.Border borders(
    word.WdBorderType index);

  /**
   * <p>
   * Setter method for the COM property "Borders"
   * </p>
   * @param prop Mandatory word.Borders parameter.
   */

  @DISPID(1100) //= 0x44c. The runtime will prefer the VTID if present
  @VTID(17)
  void borders(
    word.Borders prop);


  /**
   * <p>
   * Getter method for the COM property "Shading"
   * </p>
   * @return  Returns a value of type word.Shading
   */

  @DISPID(103) //= 0x67. The runtime will prefer the VTID if present
  @VTID(18)
  word.Shading shading();


  /**
   * @param index Mandatory int parameter.
   * @return  Returns a value of type word.Column
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(19)
  @DefaultMethod
  word.Column item(
    int index);


  /**
   * @param beforeColumn Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type word.Column
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(20)
  word.Column add(
    @Optional java.lang.Object beforeColumn);


  /**
   */

  @DISPID(199) //= 0xc7. The runtime will prefer the VTID if present
  @VTID(21)
  void select();


  /**
   */

  @DISPID(200) //= 0xc8. The runtime will prefer the VTID if present
  @VTID(22)
  void delete();


  /**
   * @param columnWidth Mandatory float parameter.
   * @param rulerStyle Mandatory word.WdRulerStyle parameter.
   */

  @DISPID(201) //= 0xc9. The runtime will prefer the VTID if present
  @VTID(23)
  void setWidth(
    float columnWidth,
    word.WdRulerStyle rulerStyle);


  /**
   */

  @DISPID(202) //= 0xca. The runtime will prefer the VTID if present
  @VTID(24)
  void autoFit();


  /**
   */

  @DISPID(203) //= 0xcb. The runtime will prefer the VTID if present
  @VTID(25)
  void distributeWidth();


  /**
   * <p>
   * Getter method for the COM property "NestingLevel"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(104) //= 0x68. The runtime will prefer the VTID if present
  @VTID(26)
  int nestingLevel();


  /**
   * <p>
   * Getter method for the COM property "PreferredWidth"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(105) //= 0x69. The runtime will prefer the VTID if present
  @VTID(27)
  float preferredWidth();


  /**
   * <p>
   * Setter method for the COM property "PreferredWidth"
   * </p>
   * @param prop Mandatory float parameter.
   */

  @DISPID(105) //= 0x69. The runtime will prefer the VTID if present
  @VTID(28)
  void preferredWidth(
    float prop);


  /**
   * <p>
   * Getter method for the COM property "PreferredWidthType"
   * </p>
   * @return  Returns a value of type word.WdPreferredWidthType
   */

  @DISPID(106) //= 0x6a. The runtime will prefer the VTID if present
  @VTID(29)
  word.WdPreferredWidthType preferredWidthType();


  /**
   * <p>
   * Setter method for the COM property "PreferredWidthType"
   * </p>
   * @param prop Mandatory word.WdPreferredWidthType parameter.
   */

  @DISPID(106) //= 0x6a. The runtime will prefer the VTID if present
  @VTID(30)
  void preferredWidthType(
    word.WdPreferredWidthType prop);


  // Properties:
}
