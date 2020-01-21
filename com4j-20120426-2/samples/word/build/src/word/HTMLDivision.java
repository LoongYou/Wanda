package word  ;

import com4j.*;

@IID("{000209E7-0000-0000-C000-000000000046}")
public interface HTMLDivision extends Com4jObject {
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
   * Getter method for the COM property "Borders"
   * </p>
   * @return  Returns a value of type word.Borders
   */

  @DISPID(1100) //= 0x44c. The runtime will prefer the VTID if present
  @VTID(11)
  word.Borders borders();


  @VTID(11)
  @ReturnValue(defaultPropertyThrough={word.Borders.class})
  word.Border borders(
    word.WdBorderType index);

  /**
   * <p>
   * Getter method for the COM property "LeftIndent"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(12)
  float leftIndent();


  /**
   * <p>
   * Setter method for the COM property "LeftIndent"
   * </p>
   * @param prop Mandatory float parameter.
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(13)
  void leftIndent(
    float prop);


  /**
   * <p>
   * Getter method for the COM property "RightIndent"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(14)
  float rightIndent();


  /**
   * <p>
   * Setter method for the COM property "RightIndent"
   * </p>
   * @param prop Mandatory float parameter.
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(15)
  void rightIndent(
    float prop);


  /**
   * <p>
   * Getter method for the COM property "SpaceBefore"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(16)
  float spaceBefore();


  /**
   * <p>
   * Setter method for the COM property "SpaceBefore"
   * </p>
   * @param prop Mandatory float parameter.
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(17)
  void spaceBefore(
    float prop);


  /**
   * <p>
   * Getter method for the COM property "SpaceAfter"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(18)
  float spaceAfter();


  /**
   * <p>
   * Setter method for the COM property "SpaceAfter"
   * </p>
   * @param prop Mandatory float parameter.
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(19)
  void spaceAfter(
    float prop);


  /**
   * <p>
   * Getter method for the COM property "HTMLDivisions"
   * </p>
   * @return  Returns a value of type word.HTMLDivisions
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(20)
  word.HTMLDivisions htmlDivisions();


  @VTID(20)
  @ReturnValue(defaultPropertyThrough={word.HTMLDivisions.class})
  word.HTMLDivision htmlDivisions(
    int index);

  /**
   * @param levelsUp Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type word.HTMLDivision
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(21)
  word.HTMLDivision htmlDivisionParent(
    @Optional java.lang.Object levelsUp);


  /**
   */

  @DISPID(101) //= 0x65. The runtime will prefer the VTID if present
  @VTID(22)
  void delete();


  // Properties:
}
