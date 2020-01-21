package office  ;

import com4j.*;

@IID("{000C03F1-0000-0000-C000-000000000046}")
public interface ContactCard extends office._IMsoDispObj {
  // Methods:
  /**
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(9)
  void close();


  /**
   * @param cardStyle Mandatory office.MsoContactCardStyle parameter.
   * @param rectangleLeft Mandatory int parameter.
   * @param rectangleRight Mandatory int parameter.
   * @param rectangleTop Mandatory int parameter.
   * @param rectangleBottom Mandatory int parameter.
   * @param horizontalPosition Mandatory int parameter.
   * @param showWithDelay Optional parameter. Default value is false
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(10)
  void show(
    office.MsoContactCardStyle cardStyle,
    int rectangleLeft,
    int rectangleRight,
    int rectangleTop,
    int rectangleBottom,
    int horizontalPosition,
    @Optional @DefaultValue("0") boolean showWithDelay);


  // Properties:
}
