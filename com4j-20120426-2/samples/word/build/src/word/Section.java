package word  ;

import com4j.*;

@IID("{00020959-0000-0000-C000-000000000046}")
public interface Section extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Range"
   * </p>
   * @return  Returns a value of type word.Range
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(7)
  @DefaultMethod
  word.Range range();


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
   * Getter method for the COM property "PageSetup"
   * </p>
   * @return  Returns a value of type word.PageSetup
   */

  @DISPID(1101) //= 0x44d. The runtime will prefer the VTID if present
  @VTID(11)
  word.PageSetup pageSetup();


  /**
   * <p>
   * Setter method for the COM property "PageSetup"
   * </p>
   * @param prop Mandatory word.PageSetup parameter.
   */

  @DISPID(1101) //= 0x44d. The runtime will prefer the VTID if present
  @VTID(12)
  void pageSetup(
    word.PageSetup prop);


  /**
   * <p>
   * Getter method for the COM property "Headers"
   * </p>
   * @return  Returns a value of type word.HeadersFooters
   */

  @DISPID(121) //= 0x79. The runtime will prefer the VTID if present
  @VTID(13)
  word.HeadersFooters headers();


  @VTID(13)
  @ReturnValue(defaultPropertyThrough={word.HeadersFooters.class})
  word.HeaderFooter headers(
    word.WdHeaderFooterIndex index);

  /**
   * <p>
   * Getter method for the COM property "Footers"
   * </p>
   * @return  Returns a value of type word.HeadersFooters
   */

  @DISPID(122) //= 0x7a. The runtime will prefer the VTID if present
  @VTID(14)
  word.HeadersFooters footers();


  @VTID(14)
  @ReturnValue(defaultPropertyThrough={word.HeadersFooters.class})
  word.HeaderFooter footers(
    word.WdHeaderFooterIndex index);

  /**
   * <p>
   * Getter method for the COM property "ProtectedForForms"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(123) //= 0x7b. The runtime will prefer the VTID if present
  @VTID(15)
  boolean protectedForForms();


  /**
   * <p>
   * Setter method for the COM property "ProtectedForForms"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(123) //= 0x7b. The runtime will prefer the VTID if present
  @VTID(16)
  void protectedForForms(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "Index"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(124) //= 0x7c. The runtime will prefer the VTID if present
  @VTID(17)
  int index();


  /**
   * <p>
   * Getter method for the COM property "Borders"
   * </p>
   * @return  Returns a value of type word.Borders
   */

  @DISPID(1100) //= 0x44c. The runtime will prefer the VTID if present
  @VTID(18)
  word.Borders borders();


  @VTID(18)
  @ReturnValue(defaultPropertyThrough={word.Borders.class})
  word.Border borders(
    word.WdBorderType index);

  /**
   * <p>
   * Setter method for the COM property "Borders"
   * </p>
   * @param prop Mandatory word.Borders parameter.
   */

  @DISPID(1100) //= 0x44c. The runtime will prefer the VTID if present
  @VTID(19)
  void borders(
    word.Borders prop);


  // Properties:
}
