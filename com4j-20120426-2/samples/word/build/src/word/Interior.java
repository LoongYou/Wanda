package word  ;

import com4j.*;

@IID("{B184502B-587A-4C6A-8DC4-ECE4354883C6}")
public interface Interior extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Color"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(1610743808) //= 0x60020000. The runtime will prefer the VTID if present
  @VTID(7)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object color();


  /**
   * <p>
   * Setter method for the COM property "Color"
   * </p>
   * @param prop Mandatory java.lang.Object parameter.
   */

  @DISPID(1610743808) //= 0x60020000. The runtime will prefer the VTID if present
  @VTID(8)
  void color(
    @MarshalAs(NativeType.VARIANT) java.lang.Object prop);


  /**
   * <p>
   * Getter method for the COM property "ColorIndex"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(1610743810) //= 0x60020002. The runtime will prefer the VTID if present
  @VTID(9)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object colorIndex();


  /**
   * <p>
   * Setter method for the COM property "ColorIndex"
   * </p>
   * @param prop Mandatory java.lang.Object parameter.
   */

  @DISPID(1610743810) //= 0x60020002. The runtime will prefer the VTID if present
  @VTID(10)
  void colorIndex(
    @MarshalAs(NativeType.VARIANT) java.lang.Object prop);


  /**
   * <p>
   * Getter method for the COM property "InvertIfNegative"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(1610743812) //= 0x60020004. The runtime will prefer the VTID if present
  @VTID(11)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object invertIfNegative();


  /**
   * <p>
   * Setter method for the COM property "InvertIfNegative"
   * </p>
   * @param prop Mandatory java.lang.Object parameter.
   */

  @DISPID(1610743812) //= 0x60020004. The runtime will prefer the VTID if present
  @VTID(12)
  void invertIfNegative(
    @MarshalAs(NativeType.VARIANT) java.lang.Object prop);


  /**
   * <p>
   * Getter method for the COM property "Pattern"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(1610743814) //= 0x60020006. The runtime will prefer the VTID if present
  @VTID(13)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object pattern();


  /**
   * <p>
   * Setter method for the COM property "Pattern"
   * </p>
   * @param prop Mandatory java.lang.Object parameter.
   */

  @DISPID(1610743814) //= 0x60020006. The runtime will prefer the VTID if present
  @VTID(14)
  void pattern(
    @MarshalAs(NativeType.VARIANT) java.lang.Object prop);


  /**
   * <p>
   * Getter method for the COM property "PatternColor"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(1610743816) //= 0x60020008. The runtime will prefer the VTID if present
  @VTID(15)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object patternColor();


  /**
   * <p>
   * Setter method for the COM property "PatternColor"
   * </p>
   * @param prop Mandatory java.lang.Object parameter.
   */

  @DISPID(1610743816) //= 0x60020008. The runtime will prefer the VTID if present
  @VTID(16)
  void patternColor(
    @MarshalAs(NativeType.VARIANT) java.lang.Object prop);


  /**
   * <p>
   * Getter method for the COM property "PatternColorIndex"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(1610743818) //= 0x6002000a. The runtime will prefer the VTID if present
  @VTID(17)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object patternColorIndex();


  /**
   * <p>
   * Setter method for the COM property "PatternColorIndex"
   * </p>
   * @param prop Mandatory java.lang.Object parameter.
   */

  @DISPID(1610743818) //= 0x6002000a. The runtime will prefer the VTID if present
  @VTID(18)
  void patternColorIndex(
    @MarshalAs(NativeType.VARIANT) java.lang.Object prop);


  /**
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(148) //= 0x94. The runtime will prefer the VTID if present
  @VTID(19)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject application();


  /**
   * <p>
   * Getter method for the COM property "Creator"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(149) //= 0x95. The runtime will prefer the VTID if present
  @VTID(20)
  int creator();


  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(150) //= 0x96. The runtime will prefer the VTID if present
  @VTID(21)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject parent();


  // Properties:
}
