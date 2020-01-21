package office  ;

import com4j.*;

@IID("{000C0340-0000-0000-C000-000000000046}")
public interface Scripts extends office._IMsoDispObj,Iterable<Com4jObject> {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(1610809344) //= 0x60030000. The runtime will prefer the VTID if present
  @VTID(9)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject parent();


  /**
   * <p>
   * Getter method for the COM property "Count"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610809345) //= 0x60030001. The runtime will prefer the VTID if present
  @VTID(10)
  int count();


  /**
   * <p>
   * Getter method for the COM property "_NewEnum"
   * </p>
   */

  @DISPID(-4) //= 0xfffffffc. The runtime will prefer the VTID if present
  @VTID(11)
  java.util.Iterator<Com4jObject> iterator();

  /**
   * @param index Mandatory java.lang.Object parameter.
   * @return  Returns a value of type office.Script
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(12)
  @DefaultMethod
  office.Script item(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);


  /**
   * @param anchor Optional parameter. Default value is unprintable.
   * @param location Optional parameter. Default value is 2
   * @param language Optional parameter. Default value is 2
   * @param id Optional parameter. Default value is ""
   * @param extended Optional parameter. Default value is ""
   * @param scriptText Optional parameter. Default value is ""
   * @return  Returns a value of type office.Script
   */

  @DISPID(1610809348) //= 0x60030004. The runtime will prefer the VTID if present
  @VTID(13)
  office.Script add(
    @Optional @MarshalAs(NativeType.Dispatch) com4j.Com4jObject anchor,
    @Optional @DefaultValue("2") office.MsoScriptLocation location,
    @Optional @DefaultValue("2") office.MsoScriptLanguage language,
    @Optional @DefaultValue("") java.lang.String id,
    @Optional @DefaultValue("") java.lang.String extended,
    @Optional @DefaultValue("") java.lang.String scriptText);


  /**
   */

  @DISPID(1610809349) //= 0x60030005. The runtime will prefer the VTID if present
  @VTID(14)
  void delete();


  // Properties:
}
