package visiotool  ;

import com4j.*;

@IID("{000D070F-0000-0000-C000-000000000046}")
public interface IVStyles extends Com4jObject,Iterable<Com4jObject> {
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

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(7)
  visiotool.IVApplication application();


  /**
   * <p>
   * Returns visObjTypeStyles (20).
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
   * The first item in a Styles collection is item 1. Name treated as locale specific.
   * </p>
   * <p>
   * Getter method for the COM property "Item"
   * </p>
   * @param nameOrIndex Mandatory java.lang.Object parameter.
   * @return  Returns a value of type visiotool.IVStyle
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(9)
  @DefaultMethod
  visiotool.IVStyle item(
    @MarshalAs(NativeType.VARIANT) java.lang.Object nameOrIndex);


  /**
   * <p>
   * Getter method for the COM property "Count16"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(10)
  short count16();


  /**
   * <p>
   * Getter method for the COM property "Document"
   * </p>
   * @return  Returns a value of type visiotool.IVDocument
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(11)
  visiotool.IVDocument document();


  /**
   * @param styleName Mandatory java.lang.String parameter.
   * @param basedOn Mandatory java.lang.String parameter.
   * @param fIncludesText Mandatory short parameter.
   * @param fIncludesLine Mandatory short parameter.
   * @param fIncludesFill Mandatory short parameter.
   * @return  Returns a value of type visiotool.IVStyle
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(12)
  visiotool.IVStyle add(
    java.lang.String styleName,
    java.lang.String basedOn,
    short fIncludesText,
    short fIncludesLine,
    short fIncludesFill);


  /**
   * <p>
   * Getter method for the COM property "Stat"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(13)
  short stat();


  /**
   * <p>
   * Getter method for the COM property "EventList"
   * </p>
   * @return  Returns a value of type visiotool.IVEventList
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(14)
  visiotool.IVEventList eventList();


  @VTID(14)
  @ReturnValue(defaultPropertyThrough={visiotool.IVEventList.class})
  visiotool.IVEvent eventList(
    short index);

  /**
   * <p>
   * Getter method for the COM property "PersistsEvents"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(15)
  short persistsEvents();


  /**
   * <p>
   * Getter method for the COM property "ItemFromID16"
   * </p>
   * @param objectID Mandatory short parameter.
   * @return  Returns a value of type visiotool.IVStyle
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(16)
  visiotool.IVStyle itemFromID16(
    short objectID);


  /**
   * <p>
   * Returns locale specific names of styles.
   * </p>
   * @return  Returns a value of type java.lang.String[]
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(17)
  java.lang.String[] getNames();


  /**
   * <p>
   * Getter method for the COM property "Count"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(18)
  int count();


  /**
   * <p>
   * Getter method for the COM property "ItemFromID"
   * </p>
   * @param objectID Mandatory int parameter.
   * @return  Returns a value of type visiotool.IVStyle
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(19)
  visiotool.IVStyle itemFromID(
    int objectID);


  /**
   * <p>
   * Like Item() but names treated locale independent.
   * </p>
   * <p>
   * Getter method for the COM property "ItemU"
   * </p>
   * @param nameOrIndex Mandatory java.lang.Object parameter.
   * @return  Returns a value of type visiotool.IVStyle
   */

  @DISPID(13) //= 0xd. The runtime will prefer the VTID if present
  @VTID(20)
  visiotool.IVStyle itemU(
    @MarshalAs(NativeType.VARIANT) java.lang.Object nameOrIndex);


  /**
   * <p>
   * Returns locale independent names of styles.
   * </p>
   * @return  Returns a value of type java.lang.String[]
   */

  @DISPID(14) //= 0xe. The runtime will prefer the VTID if present
  @VTID(21)
  java.lang.String[] getNamesU();


  /**
   * <p>
   * Getter method for the COM property "_NewEnum"
   * </p>
   */

  @DISPID(-4) //= 0xfffffffc. The runtime will prefer the VTID if present
  @VTID(22)
  java.util.Iterator<Com4jObject> iterator();

  // Properties:
}
