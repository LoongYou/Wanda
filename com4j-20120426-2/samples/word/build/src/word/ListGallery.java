package word  ;

import com4j.*;

@IID("{00020994-0000-0000-C000-000000000046}")
public interface ListGallery extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "ListTemplates"
   * </p>
   * @return  Returns a value of type word.ListTemplates
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(7)
  word.ListTemplates listTemplates();


  @VTID(7)
  @ReturnValue(defaultPropertyThrough={word.ListTemplates.class})
  word.ListTemplate listTemplates(
    java.lang.Object index);

  /**
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of type word._Application
   */

  @DISPID(1000) //= 0x3e8. The runtime will prefer the VTID if present
  @VTID(8)
  word._Application application();


  /**
   * <p>
   * Getter method for the COM property "Creator"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1001) //= 0x3e9. The runtime will prefer the VTID if present
  @VTID(9)
  int creator();


  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(1002) //= 0x3ea. The runtime will prefer the VTID if present
  @VTID(10)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject parent();


  /**
   * <p>
   * Getter method for the COM property "Modified"
   * </p>
   * @param index Mandatory int parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(101) //= 0x65. The runtime will prefer the VTID if present
  @VTID(11)
  boolean modified(
    int index);


  /**
   * @param index Mandatory int parameter.
   */

  @DISPID(100) //= 0x64. The runtime will prefer the VTID if present
  @VTID(12)
  void reset(
    int index);


  // Properties:
}
