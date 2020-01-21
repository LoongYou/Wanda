package word  ;

import com4j.*;

@IID("{39709229-56A0-4E29-9112-B31DD067EBFD}")
public interface BuildingBlockEntries extends Com4jObject {
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
   * Getter method for the COM property "Count"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(10)
  int count();


  /**
   * @param index Mandatory java.lang.Object parameter.
   * @return  Returns a value of type word.BuildingBlock
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(11)
  @DefaultMethod
  word.BuildingBlock item(
    java.lang.Object index);


  /**
   * @param name Mandatory java.lang.String parameter.
   * @param type Mandatory word.WdBuildingBlockTypes parameter.
   * @param category Mandatory java.lang.String parameter.
   * @param range Mandatory word.Range parameter.
   * @param description Optional parameter. Default value is com4j.Variant.getMissing()
   * @param insertOptions Optional parameter. Default value is 0
   * @return  Returns a value of type word.BuildingBlock
   */

  @DISPID(101) //= 0x65. The runtime will prefer the VTID if present
  @VTID(12)
  word.BuildingBlock add(
    java.lang.String name,
    word.WdBuildingBlockTypes type,
    java.lang.String category,
    word.Range range,
    @Optional java.lang.Object description,
    @Optional @DefaultValue("0") word.WdDocPartInsertOptions insertOptions);


  // Properties:
}
