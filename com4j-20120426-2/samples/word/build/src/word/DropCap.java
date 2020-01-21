package word  ;

import com4j.*;

@IID("{00020956-0000-0000-C000-000000000046}")
public interface DropCap extends Com4jObject {
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
   * Getter method for the COM property "Position"
   * </p>
   * @return  Returns a value of type word.WdDropPosition
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(10)
  word.WdDropPosition position();


  /**
   * <p>
   * Setter method for the COM property "Position"
   * </p>
   * @param prop Mandatory word.WdDropPosition parameter.
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(11)
  void position(
    word.WdDropPosition prop);


  /**
   * <p>
   * Getter method for the COM property "FontName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(12)
  java.lang.String fontName();


  /**
   * <p>
   * Setter method for the COM property "FontName"
   * </p>
   * @param prop Mandatory java.lang.String parameter.
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(13)
  void fontName(
    java.lang.String prop);


  /**
   * <p>
   * Getter method for the COM property "LinesToDrop"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(14)
  int linesToDrop();


  /**
   * <p>
   * Setter method for the COM property "LinesToDrop"
   * </p>
   * @param prop Mandatory int parameter.
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(15)
  void linesToDrop(
    int prop);


  /**
   * <p>
   * Getter method for the COM property "DistanceFromText"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(13) //= 0xd. The runtime will prefer the VTID if present
  @VTID(16)
  float distanceFromText();


  /**
   * <p>
   * Setter method for the COM property "DistanceFromText"
   * </p>
   * @param prop Mandatory float parameter.
   */

  @DISPID(13) //= 0xd. The runtime will prefer the VTID if present
  @VTID(17)
  void distanceFromText(
    float prop);


  /**
   */

  @DISPID(100) //= 0x64. The runtime will prefer the VTID if present
  @VTID(18)
  void clear();


  /**
   */

  @DISPID(101) //= 0x65. The runtime will prefer the VTID if present
  @VTID(19)
  void enable();


  // Properties:
}
