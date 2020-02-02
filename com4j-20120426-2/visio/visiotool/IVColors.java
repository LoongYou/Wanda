package visiotool  ;

import com4j.*;

@IID("{000D0717-0000-0000-C000-000000000046}")
public interface IVColors extends Com4jObject,Iterable<Com4jObject> {
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
   * Getter method for the COM property "Document"
   * </p>
   * @return  Returns a value of type visiotool.IVDocument
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(8)
  visiotool.IVDocument document();


  /**
   * <p>
   * Getter method for the COM property "Count16"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(9)
  short count16();


  /**
   * <p>
   * Getter method for the COM property "Item16"
   * </p>
   * @param index Mandatory short parameter.
   * @return  Returns a value of type visiotool.IVColor
   */

  @DISPID(999) //= 0x3e7. The runtime will prefer the VTID if present
  @VTID(10)
  visiotool.IVColor item16(
    short index);


  /**
   * <p>
   * Returns visObjTypeColors (30).
   * </p>
   * <p>
   * Getter method for the COM property "ObjectType"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(11)
  short objectType();


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
   * The first item in a Colors collection is item 0.
   * </p>
   * <p>
   * Getter method for the COM property "Item"
   * </p>
   * @param index Mandatory int parameter.
   * @return  Returns a value of type visiotool.IVColor
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(13)
  @DefaultMethod
  visiotool.IVColor item(
    int index);


  /**
   * <p>
   * Getter method for the COM property "Count"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(14)
  int count();


  /**
   * <p>
   * Getter method for the COM property "_NewEnum"
   * </p>
   */

  @DISPID(-4) //= 0xfffffffc. The runtime will prefer the VTID if present
  @VTID(15)
  java.util.Iterator<Com4jObject> iterator();

  // Properties:
}
