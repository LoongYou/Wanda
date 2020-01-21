package office  ;

import com4j.*;

@IID("{000C1534-0000-0000-C000-000000000046}")
public interface ODSOFilters extends office._IMsoDispObj {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Count"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(9)
  int count();


  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(10)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject parent();


  /**
   * @param index Mandatory int parameter.
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(1610809346) //= 0x60030002. The runtime will prefer the VTID if present
  @VTID(11)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject item(
    int index);


  /**
   * @param column Mandatory java.lang.String parameter.
   * @param comparison Mandatory office.MsoFilterComparison parameter.
   * @param conjunction Mandatory office.MsoFilterConjunction parameter.
   * @param bstrCompareTo Optional parameter. Default value is ""
   * @param deferUpdate Optional parameter. Default value is false
   */

  @DISPID(1610809347) //= 0x60030003. The runtime will prefer the VTID if present
  @VTID(12)
  void add(
    java.lang.String column,
    office.MsoFilterComparison comparison,
    office.MsoFilterConjunction conjunction,
    @Optional @DefaultValue("") java.lang.String bstrCompareTo,
    @Optional @DefaultValue("0") boolean deferUpdate);


  /**
   * @param index Mandatory int parameter.
   * @param deferUpdate Optional parameter. Default value is false
   */

  @DISPID(1610809348) //= 0x60030004. The runtime will prefer the VTID if present
  @VTID(13)
  void delete(
    int index,
    @Optional @DefaultValue("0") boolean deferUpdate);


  // Properties:
}
