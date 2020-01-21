package excel  ;

import com4j.*;

@IID("{000C0319-0000-0000-C000-000000000046}")
public interface ShapeNodes extends office._IMsoDispObj,Iterable<Com4jObject> {
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
  com4j.Com4jObject getParent();


  /**
   * <p>
   * Getter method for the COM property "Count"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(10)
  int getCount();


  /**
   * @param index Mandatory java.lang.Object parameter.
   * @return  Returns a value of type excel.ShapeNode
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(11)
  @DefaultMethod
  excel.ShapeNode item(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);


  /**
   * <p>
   * Getter method for the COM property "_NewEnum"
   * </p>
   */

  @DISPID(-4) //= 0xfffffffc. The runtime will prefer the VTID if present
  @VTID(12)
  java.util.Iterator<Com4jObject> iterator();

  /**
   * @param index Mandatory int parameter.
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(13)
  void delete(
    int index);


  /**
   * @param index Mandatory int parameter.
   * @param segmentType Mandatory office.MsoSegmentType parameter.
   * @param editingType Mandatory office.MsoEditingType parameter.
   * @param x1 Mandatory float parameter.
   * @param y1 Mandatory float parameter.
   * @param x2 Optional parameter. Default value is 0.0f
   * @param y2 Optional parameter. Default value is 0.0f
   * @param x3 Optional parameter. Default value is 0.0f
   * @param y3 Optional parameter. Default value is 0.0f
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(14)
  void insert(
    int index,
    office.MsoSegmentType segmentType,
    office.MsoEditingType editingType,
    float x1,
    float y1,
    @Optional @DefaultValue("0") float x2,
    @Optional @DefaultValue("0") float y2,
    @Optional @DefaultValue("0") float x3,
    @Optional @DefaultValue("0") float y3);


  /**
   * @param index Mandatory int parameter.
   * @param editingType Mandatory office.MsoEditingType parameter.
   */

  @DISPID(13) //= 0xd. The runtime will prefer the VTID if present
  @VTID(15)
  void setEditingType(
    int index,
    office.MsoEditingType editingType);


  /**
   * @param index Mandatory int parameter.
   * @param x1 Mandatory float parameter.
   * @param y1 Mandatory float parameter.
   */

  @DISPID(14) //= 0xe. The runtime will prefer the VTID if present
  @VTID(16)
  void setPosition(
    int index,
    float x1,
    float y1);


  /**
   * @param index Mandatory int parameter.
   * @param segmentType Mandatory office.MsoSegmentType parameter.
   */

  @DISPID(15) //= 0xf. The runtime will prefer the VTID if present
  @VTID(17)
  void setSegmentType(
    int index,
    office.MsoSegmentType segmentType);


  // Properties:
}
