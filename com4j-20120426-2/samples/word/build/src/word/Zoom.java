package word  ;

import com4j.*;

@IID("{000209A6-0000-0000-C000-000000000046}")
public interface Zoom extends Com4jObject {
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
   * Getter method for the COM property "Percentage"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(10)
  @DefaultMethod
  int percentage();


  /**
   * <p>
   * Setter method for the COM property "Percentage"
   * </p>
   * @param prop Mandatory int parameter.
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(11)
  @DefaultMethod
  void percentage(
    int prop);


  /**
   * <p>
   * Getter method for the COM property "PageFit"
   * </p>
   * @return  Returns a value of type word.WdPageFit
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(12)
  word.WdPageFit pageFit();


  /**
   * <p>
   * Setter method for the COM property "PageFit"
   * </p>
   * @param prop Mandatory word.WdPageFit parameter.
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(13)
  void pageFit(
    word.WdPageFit prop);


  /**
   * <p>
   * Getter method for the COM property "PageRows"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(14)
  int pageRows();


  /**
   * <p>
   * Setter method for the COM property "PageRows"
   * </p>
   * @param prop Mandatory int parameter.
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(15)
  void pageRows(
    int prop);


  /**
   * <p>
   * Getter method for the COM property "PageColumns"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(16)
  int pageColumns();


  /**
   * <p>
   * Setter method for the COM property "PageColumns"
   * </p>
   * @param prop Mandatory int parameter.
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(17)
  void pageColumns(
    int prop);


  // Properties:
}
