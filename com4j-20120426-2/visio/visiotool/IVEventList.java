package visiotool  ;

import com4j.*;

@IID("{000D071B-0000-0000-C000-000000000046}")
public interface IVEventList extends Com4jObject,Iterable<Com4jObject> {
  // Methods:
  /**
   * <p>
   * Returns Visio Application instance hosting the object.
   * </p>
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of type visiotool.IVApplication
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(7)
  visiotool.IVApplication application();


  /**
   * <p>
   * Returns visObjTypeEventList (34).
   * </p>
   * <p>
   * Getter method for the COM property "ObjectType"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(8)
  short objectType();


  /**
   * <p>
   * The first item in an EventList is item 1.
   * </p>
   * <p>
   * Getter method for the COM property "Item"
   * </p>
   * @param index Mandatory short parameter.
   * @return  Returns a value of type visiotool.IVEvent
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(9)
  @DefaultMethod
  visiotool.IVEvent item(
    short index);


  /**
   * <p>
   * Getter method for the COM property "Count"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(10)
  short count();


  /**
   * @param eventCode Mandatory short parameter.
   * @param action Mandatory short parameter.
   * @param target Mandatory java.lang.String parameter.
   * @param targetArgs Mandatory java.lang.String parameter.
   * @return  Returns a value of type visiotool.IVEvent
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(11)
  visiotool.IVEvent add(
    short eventCode,
    short action,
    java.lang.String target,
    java.lang.String targetArgs);


  /**
   * @param eventCode Mandatory short parameter.
   * @param sinkIUnkOrIDisp Mandatory java.lang.Object parameter.
   * @param iidSink Mandatory java.lang.String parameter.
   * @param targetArgs Mandatory java.lang.String parameter.
   * @return  Returns a value of type visiotool.IVEvent
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(12)
  visiotool.IVEvent addAdvise(
    short eventCode,
    @MarshalAs(NativeType.VARIANT) java.lang.Object sinkIUnkOrIDisp,
    java.lang.String iidSink,
    java.lang.String targetArgs);


  /**
   * <p>
   * Getter method for the COM property "ItemFromID"
   * </p>
   * @param objectID Mandatory int parameter.
   * @return  Returns a value of type visiotool.IVEvent
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(13)
  visiotool.IVEvent itemFromID(
    int objectID);


  /**
   * <p>
   * Getter method for the COM property "_NewEnum"
   * </p>
   */

  @DISPID(-4) //= 0xfffffffc. The runtime will prefer the VTID if present
  @VTID(14)
  java.util.Iterator<Com4jObject> iterator();

  // Properties:
}
