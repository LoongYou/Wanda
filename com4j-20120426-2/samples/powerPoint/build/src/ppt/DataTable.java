package ppt  ;

import com4j.*;

@IID("{92D41A63-F07E-4CA4-AF6F-BEF486AA4E6F}")
public interface DataTable extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Setter method for the COM property "ShowLegendKey"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2001) //= 0x7d1. The runtime will prefer the VTID if present
  @VTID(7)
  void showLegendKey(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "ShowLegendKey"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(2001) //= 0x7d1. The runtime will prefer the VTID if present
  @VTID(8)
  boolean showLegendKey();


  /**
   * <p>
   * Setter method for the COM property "HasBorderHorizontal"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2002) //= 0x7d2. The runtime will prefer the VTID if present
  @VTID(9)
  void hasBorderHorizontal(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "HasBorderHorizontal"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(2002) //= 0x7d2. The runtime will prefer the VTID if present
  @VTID(10)
  boolean hasBorderHorizontal();


  /**
   * <p>
   * Setter method for the COM property "HasBorderVertical"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2003) //= 0x7d3. The runtime will prefer the VTID if present
  @VTID(11)
  void hasBorderVertical(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "HasBorderVertical"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(2003) //= 0x7d3. The runtime will prefer the VTID if present
  @VTID(12)
  boolean hasBorderVertical();


  /**
   * <p>
   * Setter method for the COM property "HasBorderOutline"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2004) //= 0x7d4. The runtime will prefer the VTID if present
  @VTID(13)
  void hasBorderOutline(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "HasBorderOutline"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(2004) //= 0x7d4. The runtime will prefer the VTID if present
  @VTID(14)
  boolean hasBorderOutline();


  /**
   * <p>
   * Getter method for the COM property "Border"
   * </p>
   * @return  Returns a value of type ppt.ChartBorder
   */

  @DISPID(2005) //= 0x7d5. The runtime will prefer the VTID if present
  @VTID(15)
  ppt.ChartBorder border();


  /**
   * <p>
   * Getter method for the COM property "Font"
   * </p>
   * @return  Returns a value of type ppt.ChartFont
   */

  @DISPID(2006) //= 0x7d6. The runtime will prefer the VTID if present
  @VTID(16)
  ppt.ChartFont font();


  /**
   */

  @DISPID(2007) //= 0x7d7. The runtime will prefer the VTID if present
  @VTID(17)
  void select();


  /**
   */

  @DISPID(2008) //= 0x7d8. The runtime will prefer the VTID if present
  @VTID(18)
  void delete();


  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(2009) //= 0x7d9. The runtime will prefer the VTID if present
  @VTID(19)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject parent();


  /**
   * <p>
   * Getter method for the COM property "AutoScaleFont"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(2010) //= 0x7da. The runtime will prefer the VTID if present
  @VTID(20)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object autoScaleFont();


  /**
   * <p>
   * Setter method for the COM property "AutoScaleFont"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(2010) //= 0x7da. The runtime will prefer the VTID if present
  @VTID(21)
  void autoScaleFont(
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "Format"
   * </p>
   * @return  Returns a value of type ppt.ChartFormat
   */

  @DISPID(2011) //= 0x7db. The runtime will prefer the VTID if present
  @VTID(22)
  ppt.ChartFormat format();


  /**
   * <p>
   * Getter method for the COM property "Creator"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(149) //= 0x95. The runtime will prefer the VTID if present
  @VTID(23)
  int creator();


  /**
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of type ppt._Application
   */

  @DISPID(2012) //= 0x7dc. The runtime will prefer the VTID if present
  @VTID(24)
  ppt._Application application();


  // Properties:
}
