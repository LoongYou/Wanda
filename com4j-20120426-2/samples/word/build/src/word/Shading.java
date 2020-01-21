package word  ;

import com4j.*;

@IID("{0002093A-0000-0000-C000-000000000046}")
public interface Shading extends Com4jObject {
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
   * Getter method for the COM property "ForegroundPatternColorIndex"
   * </p>
   * @return  Returns a value of type word.WdColorIndex
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(10)
  word.WdColorIndex foregroundPatternColorIndex();


  /**
   * <p>
   * Setter method for the COM property "ForegroundPatternColorIndex"
   * </p>
   * @param prop Mandatory word.WdColorIndex parameter.
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(11)
  void foregroundPatternColorIndex(
    word.WdColorIndex prop);


  /**
   * <p>
   * Getter method for the COM property "BackgroundPatternColorIndex"
   * </p>
   * @return  Returns a value of type word.WdColorIndex
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(12)
  word.WdColorIndex backgroundPatternColorIndex();


  /**
   * <p>
   * Setter method for the COM property "BackgroundPatternColorIndex"
   * </p>
   * @param prop Mandatory word.WdColorIndex parameter.
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(13)
  void backgroundPatternColorIndex(
    word.WdColorIndex prop);


  /**
   * <p>
   * Getter method for the COM property "Texture"
   * </p>
   * @return  Returns a value of type word.WdTextureIndex
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(14)
  word.WdTextureIndex texture();


  /**
   * <p>
   * Setter method for the COM property "Texture"
   * </p>
   * @param prop Mandatory word.WdTextureIndex parameter.
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(15)
  void texture(
    word.WdTextureIndex prop);


  /**
   * <p>
   * Getter method for the COM property "ForegroundPatternColor"
   * </p>
   * @return  Returns a value of type word.WdColor
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(16)
  word.WdColor foregroundPatternColor();


  /**
   * <p>
   * Setter method for the COM property "ForegroundPatternColor"
   * </p>
   * @param prop Mandatory word.WdColor parameter.
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(17)
  void foregroundPatternColor(
    word.WdColor prop);


  /**
   * <p>
   * Getter method for the COM property "BackgroundPatternColor"
   * </p>
   * @return  Returns a value of type word.WdColor
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(18)
  word.WdColor backgroundPatternColor();


  /**
   * <p>
   * Setter method for the COM property "BackgroundPatternColor"
   * </p>
   * @param prop Mandatory word.WdColor parameter.
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(19)
  void backgroundPatternColor(
    word.WdColor prop);


  // Properties:
}
