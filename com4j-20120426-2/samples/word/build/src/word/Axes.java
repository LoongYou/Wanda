package word  ;

import com4j.*;

@IID("{354AB591-A217-48B4-99E4-14F58F15667D}")
public interface Axes extends Com4jObject,Iterable<Com4jObject> {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Count"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610743808) //= 0x60020000. The runtime will prefer the VTID if present
  @VTID(7)
  int count();


  /**
   * @param type Mandatory word.XlAxisType parameter.
   * @param axisGroup Optional parameter. Default value is 1
   * @return  Returns a value of type word.Axis
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(8)
  @DefaultMethod
  word.Axis item(
    word.XlAxisType type,
    @Optional @DefaultValue("1") word.XlAxisGroup axisGroup);


  /**
   */

  @DISPID(-4) //= 0xfffffffc. The runtime will prefer the VTID if present
  @VTID(9)
  java.util.Iterator<Com4jObject> iterator();

  /**
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(148) //= 0x94. The runtime will prefer the VTID if present
  @VTID(10)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject application();


  /**
   * <p>
   * Getter method for the COM property "Creator"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(149) //= 0x95. The runtime will prefer the VTID if present
  @VTID(11)
  int creator();


  /**
   * @param type Mandatory word.XlAxisType parameter.
   * @param axisGroup Optional parameter. Default value is 1
   * @return  Returns a value of type word.Axis
   */

  @DISPID(1610743813) //= 0x60020005. The runtime will prefer the VTID if present
  @VTID(12)
  word.Axis _Default(
    word.XlAxisType type,
    @Optional @DefaultValue("1") word.XlAxisGroup axisGroup);


  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(150) //= 0x96. The runtime will prefer the VTID if present
  @VTID(13)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject parent();


  // Properties:
}
