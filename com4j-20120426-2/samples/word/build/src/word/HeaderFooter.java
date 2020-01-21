package word  ;

import com4j.*;

@IID("{00020985-0000-0000-C000-000000000046}")
public interface HeaderFooter extends Com4jObject {
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
   * Getter method for the COM property "Range"
   * </p>
   * @return  Returns a value of type word.Range
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(10)
  @DefaultMethod
  word.Range range();


  /**
   * <p>
   * Getter method for the COM property "Index"
   * </p>
   * @return  Returns a value of type word.WdHeaderFooterIndex
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(11)
  word.WdHeaderFooterIndex index();


  /**
   * <p>
   * Getter method for the COM property "IsHeader"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(12)
  boolean isHeader();


  /**
   * <p>
   * Getter method for the COM property "Exists"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(13)
  boolean exists();


  /**
   * <p>
   * Setter method for the COM property "Exists"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(14)
  void exists(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "PageNumbers"
   * </p>
   * @return  Returns a value of type word.PageNumbers
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(15)
  word.PageNumbers pageNumbers();


  @VTID(15)
  @ReturnValue(defaultPropertyThrough={word.PageNumbers.class})
  word.PageNumber pageNumbers(
    int index);

  /**
   * <p>
   * Getter method for the COM property "LinkToPrevious"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(16)
  boolean linkToPrevious();


  /**
   * <p>
   * Setter method for the COM property "LinkToPrevious"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(17)
  void linkToPrevious(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "Shapes"
   * </p>
   * @return  Returns a value of type word.Shapes
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(18)
  word.Shapes shapes();


  @VTID(18)
  @ReturnValue(defaultPropertyThrough={word.Shapes.class})
  word.Shape shapes(
    java.lang.Object index);

  // Properties:
}
