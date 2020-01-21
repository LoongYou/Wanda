package office  ;

import com4j.*;

@IID("{000C0312-0000-0000-C000-000000000046}")
public interface ColorFormat extends office._IMsoDispObj {
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
   * Getter method for the COM property "RGB"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(10)
  @DefaultMethod
  int rgb();


  /**
   * <p>
   * Setter method for the COM property "RGB"
   * </p>
   * @param rgb Mandatory int parameter.
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(11)
  @DefaultMethod
  void rgb(
    int rgb);


  /**
   * <p>
   * Getter method for the COM property "SchemeColor"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(100) //= 0x64. The runtime will prefer the VTID if present
  @VTID(12)
  int schemeColor();


  /**
   * <p>
   * Setter method for the COM property "SchemeColor"
   * </p>
   * @param schemeColor Mandatory int parameter.
   */

  @DISPID(100) //= 0x64. The runtime will prefer the VTID if present
  @VTID(13)
  void schemeColor(
    int schemeColor);


  /**
   * <p>
   * Getter method for the COM property "Type"
   * </p>
   * @return  Returns a value of type office.MsoColorType
   */

  @DISPID(101) //= 0x65. The runtime will prefer the VTID if present
  @VTID(14)
  office.MsoColorType type();


  /**
   * <p>
   * Getter method for the COM property "TintAndShade"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(103) //= 0x67. The runtime will prefer the VTID if present
  @VTID(15)
  float tintAndShade();


  /**
   * <p>
   * Setter method for the COM property "TintAndShade"
   * </p>
   * @param pValue Mandatory float parameter.
   */

  @DISPID(103) //= 0x67. The runtime will prefer the VTID if present
  @VTID(16)
  void tintAndShade(
    float pValue);


  /**
   * <p>
   * Getter method for the COM property "ObjectThemeColor"
   * </p>
   * @return  Returns a value of type office.MsoThemeColorIndex
   */

  @DISPID(104) //= 0x68. The runtime will prefer the VTID if present
  @VTID(17)
  office.MsoThemeColorIndex objectThemeColor();


  /**
   * <p>
   * Setter method for the COM property "ObjectThemeColor"
   * </p>
   * @param objectThemeColor Mandatory office.MsoThemeColorIndex parameter.
   */

  @DISPID(104) //= 0x68. The runtime will prefer the VTID if present
  @VTID(18)
  void objectThemeColor(
    office.MsoThemeColorIndex objectThemeColor);


  /**
   * <p>
   * Getter method for the COM property "Brightness"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(105) //= 0x69. The runtime will prefer the VTID if present
  @VTID(19)
  float brightness();


  /**
   * <p>
   * Setter method for the COM property "Brightness"
   * </p>
   * @param brightness Mandatory float parameter.
   */

  @DISPID(105) //= 0x69. The runtime will prefer the VTID if present
  @VTID(20)
  void brightness(
    float brightness);


  // Properties:
}
