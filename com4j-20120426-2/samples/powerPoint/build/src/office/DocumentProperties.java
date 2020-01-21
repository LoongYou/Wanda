package office  ;

import com4j.*;

@IID("{2DF8D04D-5BFA-101B-BDE5-00AA0044DE52}")
public interface DocumentProperties extends Com4jObject,Iterable<Com4jObject> {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   */

  @VTID(7)
  void parent();


  /**
   * <p>
   * Getter method for the COM property "Item"
   * </p>
   * @param index Mandatory java.lang.Object parameter.
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type office.DocumentProperty
   */

  @VTID(8)
  @DefaultMethod
  office.DocumentProperty item(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index,
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "Count"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(9)
  int count();


  /**
   * @param name Mandatory java.lang.String parameter.
   * @param linkToContent Mandatory boolean parameter.
   * @param type Optional parameter. Default value is com4j.Variant.getMissing()
   * @param value Optional parameter. Default value is com4j.Variant.getMissing()
   * @param linkSource Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type office.DocumentProperty
   */

  @VTID(10)
  office.DocumentProperty add(
    java.lang.String name,
    boolean linkToContent,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object type,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object value,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object linkSource,
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "_NewEnum"
   * </p>
   */

  @VTID(11)
  java.util.Iterator<Com4jObject> iterator();

  /**
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @VTID(12)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject application();


  /**
   * <p>
   * Getter method for the COM property "Creator"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(13)
  int creator();


  // Properties:
}
