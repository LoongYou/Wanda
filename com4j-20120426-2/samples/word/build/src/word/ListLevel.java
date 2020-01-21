package word  ;

import com4j.*;

@IID("{0002098D-0000-0000-C000-000000000046}")
public interface ListLevel extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Index"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(7)
  int index();


  /**
   * <p>
   * Getter method for the COM property "NumberFormat"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(8)
  java.lang.String numberFormat();


  /**
   * <p>
   * Setter method for the COM property "NumberFormat"
   * </p>
   * @param prop Mandatory java.lang.String parameter.
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(9)
  void numberFormat(
    java.lang.String prop);


  /**
   * <p>
   * Getter method for the COM property "TrailingCharacter"
   * </p>
   * @return  Returns a value of type word.WdTrailingCharacter
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(10)
  word.WdTrailingCharacter trailingCharacter();


  /**
   * <p>
   * Setter method for the COM property "TrailingCharacter"
   * </p>
   * @param prop Mandatory word.WdTrailingCharacter parameter.
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(11)
  void trailingCharacter(
    word.WdTrailingCharacter prop);


  /**
   * <p>
   * Getter method for the COM property "NumberStyle"
   * </p>
   * @return  Returns a value of type word.WdListNumberStyle
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(12)
  word.WdListNumberStyle numberStyle();


  /**
   * <p>
   * Setter method for the COM property "NumberStyle"
   * </p>
   * @param prop Mandatory word.WdListNumberStyle parameter.
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(13)
  void numberStyle(
    word.WdListNumberStyle prop);


  /**
   * <p>
   * Getter method for the COM property "NumberPosition"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(14)
  float numberPosition();


  /**
   * <p>
   * Setter method for the COM property "NumberPosition"
   * </p>
   * @param prop Mandatory float parameter.
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(15)
  void numberPosition(
    float prop);


  /**
   * <p>
   * Getter method for the COM property "Alignment"
   * </p>
   * @return  Returns a value of type word.WdListLevelAlignment
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(16)
  word.WdListLevelAlignment alignment();


  /**
   * <p>
   * Setter method for the COM property "Alignment"
   * </p>
   * @param prop Mandatory word.WdListLevelAlignment parameter.
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(17)
  void alignment(
    word.WdListLevelAlignment prop);


  /**
   * <p>
   * Getter method for the COM property "TextPosition"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(18)
  float textPosition();


  /**
   * <p>
   * Setter method for the COM property "TextPosition"
   * </p>
   * @param prop Mandatory float parameter.
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(19)
  void textPosition(
    float prop);


  /**
   * <p>
   * Getter method for the COM property "TabPosition"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(20)
  float tabPosition();


  /**
   * <p>
   * Setter method for the COM property "TabPosition"
   * </p>
   * @param prop Mandatory float parameter.
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(21)
  void tabPosition(
    float prop);


  /**
   * <p>
   * Getter method for the COM property "ResetOnHigherOld"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(22)
  boolean resetOnHigherOld();


  /**
   * <p>
   * Setter method for the COM property "ResetOnHigherOld"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(23)
  void resetOnHigherOld(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "StartAt"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(24)
  int startAt();


  /**
   * <p>
   * Setter method for the COM property "StartAt"
   * </p>
   * @param prop Mandatory int parameter.
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(25)
  void startAt(
    int prop);


  /**
   * <p>
   * Getter method for the COM property "LinkedStyle"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(26)
  java.lang.String linkedStyle();


  /**
   * <p>
   * Setter method for the COM property "LinkedStyle"
   * </p>
   * @param prop Mandatory java.lang.String parameter.
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(27)
  void linkedStyle(
    java.lang.String prop);


  /**
   * <p>
   * Getter method for the COM property "Font"
   * </p>
   * @return  Returns a value of type word._Font
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(28)
  word._Font font();


  /**
   * <p>
   * Setter method for the COM property "Font"
   * </p>
   * @param prop Mandatory word._Font parameter.
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(29)
  void font(
    word._Font prop);


  /**
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of type word._Application
   */

  @DISPID(1000) //= 0x3e8. The runtime will prefer the VTID if present
  @VTID(30)
  word._Application application();


  /**
   * <p>
   * Getter method for the COM property "Creator"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1001) //= 0x3e9. The runtime will prefer the VTID if present
  @VTID(31)
  int creator();


  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(1002) //= 0x3ea. The runtime will prefer the VTID if present
  @VTID(32)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject parent();


  /**
   * <p>
   * Getter method for the COM property "ResetOnHigher"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(13) //= 0xd. The runtime will prefer the VTID if present
  @VTID(33)
  int resetOnHigher();


  /**
   * <p>
   * Setter method for the COM property "ResetOnHigher"
   * </p>
   * @param prop Mandatory int parameter.
   */

  @DISPID(13) //= 0xd. The runtime will prefer the VTID if present
  @VTID(34)
  void resetOnHigher(
    int prop);


  /**
   * <p>
   * Getter method for the COM property "PictureBullet"
   * </p>
   * @return  Returns a value of type word.InlineShape
   */

  @DISPID(14) //= 0xe. The runtime will prefer the VTID if present
  @VTID(35)
  word.InlineShape pictureBullet();


  /**
   * @param fileName Mandatory java.lang.String parameter.
   * @return  Returns a value of type word.InlineShape
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(36)
  @DefaultMethod
  word.InlineShape applyPictureBullet(
    java.lang.String fileName);


  // Properties:
}
