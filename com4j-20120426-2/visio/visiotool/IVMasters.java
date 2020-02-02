package visiotool  ;

import com4j.*;

@IID("{000D0708-0000-0000-C000-000000000046}")
public interface IVMasters extends Com4jObject,Iterable<Com4jObject> {
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
   * Returns visObjTypeMasters (13).
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
   * The first item in a Masters collection is item 1. Name treated as locale specific.
   * </p>
   * <p>
   * Getter method for the COM property "Item"
   * </p>
   * @param nameUIDOrIndex Mandatory java.lang.Object parameter.
   * @return  Returns a value of type visiotool.IVMaster
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(9)
  @DefaultMethod
  visiotool.IVMaster item(
    @MarshalAs(NativeType.VARIANT) java.lang.Object nameUIDOrIndex);


  /**
   * <p>
   * Getter method for the COM property "Count"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(10)
  short count();


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
   * <p>
   * Getter method for the COM property "Stat"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(12)
  short stat();


  /**
   * <p>
   * Getter method for the COM property "EventList"
   * </p>
   * @return  Returns a value of type visiotool.IVEventList
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(13)
  visiotool.IVEventList eventList();


  @VTID(13)
  @ReturnValue(defaultPropertyThrough={visiotool.IVEventList.class})
  visiotool.IVEvent eventList(
    short index);

  /**
   * <p>
   * Getter method for the COM property "PersistsEvents"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(14)
  short persistsEvents();


  /**
   * @return  Returns a value of type visiotool.IVMaster
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(15)
  visiotool.IVMaster add();


  /**
   * <p>
   * Returns locale specific names of masters.
   * </p>
   * @return  Returns a value of type java.lang.String[]
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(16)
  java.lang.String[] getNames();


  /**
   * @param objectToDrop Mandatory com4j.Com4jObject parameter.
   * @param xPos Mandatory short parameter.
   * @param yPos Mandatory short parameter.
   * @return  Returns a value of type visiotool.IVMaster
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(17)
  visiotool.IVMaster drop(
    com4j.Com4jObject objectToDrop,
    short xPos,
    short yPos);


  /**
   * <p>
   * Like Item() but names treated locale independent.
   * </p>
   * <p>
   * Getter method for the COM property "ItemU"
   * </p>
   * @param nameUIDOrIndex Mandatory java.lang.Object parameter.
   * @return  Returns a value of type visiotool.IVMaster
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(18)
  visiotool.IVMaster itemU(
    @MarshalAs(NativeType.VARIANT) java.lang.Object nameUIDOrIndex);


  /**
   * <p>
   * Returns locale independent names of masters.
   * </p>
   * @return  Returns a value of type java.lang.String[]
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(19)
  java.lang.String[] getNamesU();


  /**
   * <p>
   * Getter method for the COM property "_NewEnum"
   * </p>
   */

  @DISPID(-4) //= 0xfffffffc. The runtime will prefer the VTID if present
  @VTID(20)
  java.util.Iterator<Com4jObject> iterator();

  /**
   * <p>
   * Getter method for the COM property "ItemFromID"
   * </p>
   * @param nID Mandatory int parameter.
   * @return  Returns a value of type visiotool.IVMaster
   */

  @DISPID(1610743822) //= 0x6002000e. The runtime will prefer the VTID if present
  @VTID(21)
  visiotool.IVMaster itemFromID(
    int nID);


  /**
   * @param flags Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(1610743823) //= 0x6002000f. The runtime will prefer the VTID if present
  @VTID(22)
  void paste(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object flags);


  /**
   * @param type Mandatory visiotool.VisMasterTypes parameter.
   * @return  Returns a value of type visiotool.IVMaster
   */

  @DISPID(1610743824) //= 0x60020010. The runtime will prefer the VTID if present
  @VTID(23)
  visiotool.IVMaster addEx(
    visiotool.VisMasterTypes type);


  // Properties:
}
