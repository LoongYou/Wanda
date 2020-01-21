package office  ;

import com4j.*;

@IID("{000C0315-0000-0000-C000-000000000046}")
public interface FreeformBuilder extends office._IMsoDispObj {
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
   * @param segmentType Mandatory office.MsoSegmentType parameter.
   * @param editingType Mandatory office.MsoEditingType parameter.
   * @param x1 Mandatory float parameter.
   * @param y1 Mandatory float parameter.
   * @param x2 Optional parameter. Default value is 0.0f
   * @param y2 Optional parameter. Default value is 0.0f
   * @param x3 Optional parameter. Default value is 0.0f
   * @param y3 Optional parameter. Default value is 0.0f
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(10)
  void addNodes(
    office.MsoSegmentType segmentType,
    office.MsoEditingType editingType,
    float x1,
    float y1,
    @Optional @DefaultValue("0") float x2,
    @Optional @DefaultValue("0") float y2,
    @Optional @DefaultValue("0") float x3,
    @Optional @DefaultValue("0") float y3);


  /**
   * @return  Returns a value of type office.Shape
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(11)
  office.Shape convertToShape();


  // Properties:
}
