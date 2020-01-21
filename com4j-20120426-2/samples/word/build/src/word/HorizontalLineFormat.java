package word  ;

import com4j.*;

@IID("{000209DE-0000-0000-C000-000000000046}")
public interface HorizontalLineFormat extends Com4jObject {
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
   * Getter method for the COM property "PercentWidth"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(10)
  float percentWidth();


  /**
   * <p>
   * Setter method for the COM property "PercentWidth"
   * </p>
   * @param prop Mandatory float parameter.
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(11)
  void percentWidth(
    float prop);


  /**
   * <p>
   * Getter method for the COM property "NoShade"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(12)
  boolean noShade();


  /**
   * <p>
   * Setter method for the COM property "NoShade"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(13)
  void noShade(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "Alignment"
   * </p>
   * @return  Returns a value of type word.WdHorizontalLineAlignment
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(14)
  word.WdHorizontalLineAlignment alignment();


  /**
   * <p>
   * Setter method for the COM property "Alignment"
   * </p>
   * @param prop Mandatory word.WdHorizontalLineAlignment parameter.
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(15)
  void alignment(
    word.WdHorizontalLineAlignment prop);


  /**
   * <p>
   * Getter method for the COM property "WidthType"
   * </p>
   * @return  Returns a value of type word.WdHorizontalLineWidthType
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(16)
  word.WdHorizontalLineWidthType widthType();


  /**
   * <p>
   * Setter method for the COM property "WidthType"
   * </p>
   * @param prop Mandatory word.WdHorizontalLineWidthType parameter.
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(17)
  void widthType(
    word.WdHorizontalLineWidthType prop);


  // Properties:
}
