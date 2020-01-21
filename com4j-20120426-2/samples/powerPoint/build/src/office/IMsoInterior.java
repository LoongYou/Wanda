package office  ;

import com4j.*;

@IID("{000C171B-0000-0000-C000-000000000046}")
public interface IMsoInterior extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Setter method for the COM property "Color"
   * </p>
   * @param pval Mandatory java.lang.Object parameter.
   */

  @DISPID(1610743808) //= 0x60020000. The runtime will prefer the VTID if present
  @VTID(7)
  void color(
    @MarshalAs(NativeType.VARIANT) java.lang.Object pval);


  /**
   * <p>
   * Getter method for the COM property "Color"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(1610743808) //= 0x60020000. The runtime will prefer the VTID if present
  @VTID(8)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object color();


  /**
   * <p>
   * Setter method for the COM property "ColorIndex"
   * </p>
   * @param pval Mandatory java.lang.Object parameter.
   */

  @DISPID(1610743810) //= 0x60020002. The runtime will prefer the VTID if present
  @VTID(9)
  void colorIndex(
    @MarshalAs(NativeType.VARIANT) java.lang.Object pval);


  /**
   * <p>
   * Getter method for the COM property "ColorIndex"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(1610743810) //= 0x60020002. The runtime will prefer the VTID if present
  @VTID(10)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object colorIndex();


  /**
   * <p>
   * Setter method for the COM property "InvertIfNegative"
   * </p>
   * @param pval Mandatory java.lang.Object parameter.
   */

  @DISPID(1610743812) //= 0x60020004. The runtime will prefer the VTID if present
  @VTID(11)
  void invertIfNegative(
    @MarshalAs(NativeType.VARIANT) java.lang.Object pval);


  /**
   * <p>
   * Getter method for the COM property "InvertIfNegative"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(1610743812) //= 0x60020004. The runtime will prefer the VTID if present
  @VTID(12)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object invertIfNegative();


  /**
   * <p>
   * Setter method for the COM property "Pattern"
   * </p>
   * @param pval Mandatory java.lang.Object parameter.
   */

  @DISPID(1610743814) //= 0x60020006. The runtime will prefer the VTID if present
  @VTID(13)
  void pattern(
    @MarshalAs(NativeType.VARIANT) java.lang.Object pval);


  /**
   * <p>
   * Getter method for the COM property "Pattern"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(1610743814) //= 0x60020006. The runtime will prefer the VTID if present
  @VTID(14)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object pattern();


  /**
   * <p>
   * Setter method for the COM property "PatternColor"
   * </p>
   * @param pval Mandatory java.lang.Object parameter.
   */

  @DISPID(1610743816) //= 0x60020008. The runtime will prefer the VTID if present
  @VTID(15)
  void patternColor(
    @MarshalAs(NativeType.VARIANT) java.lang.Object pval);


  /**
   * <p>
   * Getter method for the COM property "PatternColor"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(1610743816) //= 0x60020008. The runtime will prefer the VTID if present
  @VTID(16)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object patternColor();


  /**
   * <p>
   * Setter method for the COM property "PatternColorIndex"
   * </p>
   * @param pval Mandatory java.lang.Object parameter.
   */

  @DISPID(1610743818) //= 0x6002000a. The runtime will prefer the VTID if present
  @VTID(17)
  void patternColorIndex(
    @MarshalAs(NativeType.VARIANT) java.lang.Object pval);


  /**
   * <p>
   * Getter method for the COM property "PatternColorIndex"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(1610743818) //= 0x6002000a. The runtime will prefer the VTID if present
  @VTID(18)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object patternColorIndex();


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
