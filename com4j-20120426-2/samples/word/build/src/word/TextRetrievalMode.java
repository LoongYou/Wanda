package word  ;

import com4j.*;

@IID("{00020939-0000-0000-C000-000000000046}")
public interface TextRetrievalMode extends Com4jObject {
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
   * Getter method for the COM property "ViewType"
   * </p>
   * @return  Returns a value of type word.WdViewType
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(10)
  @DefaultMethod
  word.WdViewType viewType();


  /**
   * <p>
   * Setter method for the COM property "ViewType"
   * </p>
   * @param prop Mandatory word.WdViewType parameter.
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(11)
  @DefaultMethod
  void viewType(
    word.WdViewType prop);


  /**
   * <p>
   * Getter method for the COM property "Duplicate"
   * </p>
   * @return  Returns a value of type word.TextRetrievalMode
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(12)
  word.TextRetrievalMode duplicate();


  /**
   * <p>
   * Getter method for the COM property "IncludeHiddenText"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(13)
  boolean includeHiddenText();


  /**
   * <p>
   * Setter method for the COM property "IncludeHiddenText"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(14)
  void includeHiddenText(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "IncludeFieldCodes"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(15)
  boolean includeFieldCodes();


  /**
   * <p>
   * Setter method for the COM property "IncludeFieldCodes"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(16)
  void includeFieldCodes(
    boolean prop);


  // Properties:
}
