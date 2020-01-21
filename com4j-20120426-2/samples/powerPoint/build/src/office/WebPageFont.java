package office  ;

import com4j.*;

@IID("{000C0913-0000-0000-C000-000000000046}")
public interface WebPageFont extends office._IMsoDispObj {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "ProportionalFont"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(9)
  java.lang.String proportionalFont();


  /**
   * <p>
   * Setter method for the COM property "ProportionalFont"
   * </p>
   * @param pstr Mandatory java.lang.String parameter.
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(10)
  void proportionalFont(
    java.lang.String pstr);


  /**
   * <p>
   * Getter method for the COM property "ProportionalFontSize"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(11)
  float proportionalFontSize();


  /**
   * <p>
   * Setter method for the COM property "ProportionalFontSize"
   * </p>
   * @param pf Mandatory float parameter.
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(12)
  void proportionalFontSize(
    float pf);


  /**
   * <p>
   * Getter method for the COM property "FixedWidthFont"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(13)
  java.lang.String fixedWidthFont();


  /**
   * <p>
   * Setter method for the COM property "FixedWidthFont"
   * </p>
   * @param pstr Mandatory java.lang.String parameter.
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(14)
  void fixedWidthFont(
    java.lang.String pstr);


  /**
   * <p>
   * Getter method for the COM property "FixedWidthFontSize"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(13) //= 0xd. The runtime will prefer the VTID if present
  @VTID(15)
  float fixedWidthFontSize();


  /**
   * <p>
   * Setter method for the COM property "FixedWidthFontSize"
   * </p>
   * @param pf Mandatory float parameter.
   */

  @DISPID(13) //= 0xd. The runtime will prefer the VTID if present
  @VTID(16)
  void fixedWidthFontSize(
    float pf);


  // Properties:
}
