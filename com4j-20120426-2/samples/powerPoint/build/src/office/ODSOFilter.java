package office  ;

import com4j.*;

@IID("{000C1533-0000-0000-C000-000000000046}")
public interface ODSOFilter extends office._IMsoDispObj {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Index"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(9)
  int index();


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
   * <p>
   * Getter method for the COM property "Column"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(11)
  java.lang.String column();


  /**
   * <p>
   * Setter method for the COM property "Column"
   * </p>
   * @param pbstrCol Mandatory java.lang.String parameter.
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(12)
  void column(
    java.lang.String pbstrCol);


  /**
   * <p>
   * Getter method for the COM property "Comparison"
   * </p>
   * @return  Returns a value of type office.MsoFilterComparison
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(13)
  office.MsoFilterComparison comparison();


  /**
   * <p>
   * Setter method for the COM property "Comparison"
   * </p>
   * @param pComparison Mandatory office.MsoFilterComparison parameter.
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(14)
  void comparison(
    office.MsoFilterComparison pComparison);


  /**
   * <p>
   * Getter method for the COM property "CompareTo"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(15)
  java.lang.String compareTo();


  /**
   * <p>
   * Setter method for the COM property "CompareTo"
   * </p>
   * @param pbstrCompareTo Mandatory java.lang.String parameter.
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(16)
  void compareTo(
    java.lang.String pbstrCompareTo);


  /**
   * <p>
   * Getter method for the COM property "Conjunction"
   * </p>
   * @return  Returns a value of type office.MsoFilterConjunction
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(17)
  office.MsoFilterConjunction conjunction();


  /**
   * <p>
   * Setter method for the COM property "Conjunction"
   * </p>
   * @param pConjunction Mandatory office.MsoFilterConjunction parameter.
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(18)
  void conjunction(
    office.MsoFilterConjunction pConjunction);


  // Properties:
}
