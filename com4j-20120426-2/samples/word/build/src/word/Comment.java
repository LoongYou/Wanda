package word  ;

import com4j.*;

@IID("{0002093D-0000-0000-C000-000000000046}")
public interface Comment extends Com4jObject {
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

  @DISPID(1003) //= 0x3eb. The runtime will prefer the VTID if present
  @VTID(10)
  word.Range range();


  /**
   * <p>
   * Getter method for the COM property "Reference"
   * </p>
   * @return  Returns a value of type word.Range
   */

  @DISPID(1004) //= 0x3ec. The runtime will prefer the VTID if present
  @VTID(11)
  word.Range reference();


  /**
   * <p>
   * Getter method for the COM property "Scope"
   * </p>
   * @return  Returns a value of type word.Range
   */

  @DISPID(1005) //= 0x3ed. The runtime will prefer the VTID if present
  @VTID(12)
  word.Range scope();


  /**
   * <p>
   * Getter method for the COM property "Index"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1006) //= 0x3ee. The runtime will prefer the VTID if present
  @VTID(13)
  int index();


  /**
   * <p>
   * Getter method for the COM property "Author"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1007) //= 0x3ef. The runtime will prefer the VTID if present
  @VTID(14)
  java.lang.String author();


  /**
   * <p>
   * Setter method for the COM property "Author"
   * </p>
   * @param prop Mandatory java.lang.String parameter.
   */

  @DISPID(1007) //= 0x3ef. The runtime will prefer the VTID if present
  @VTID(15)
  void author(
    java.lang.String prop);


  /**
   * <p>
   * Getter method for the COM property "Initial"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1008) //= 0x3f0. The runtime will prefer the VTID if present
  @VTID(16)
  java.lang.String initial();


  /**
   * <p>
   * Setter method for the COM property "Initial"
   * </p>
   * @param prop Mandatory java.lang.String parameter.
   */

  @DISPID(1008) //= 0x3f0. The runtime will prefer the VTID if present
  @VTID(17)
  void initial(
    java.lang.String prop);


  /**
   * <p>
   * Getter method for the COM property "ShowTip"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1009) //= 0x3f1. The runtime will prefer the VTID if present
  @VTID(18)
  boolean showTip();


  /**
   * <p>
   * Setter method for the COM property "ShowTip"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(1009) //= 0x3f1. The runtime will prefer the VTID if present
  @VTID(19)
  void showTip(
    boolean prop);


  /**
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(20)
  void delete();


  /**
   */

  @DISPID(1011) //= 0x3f3. The runtime will prefer the VTID if present
  @VTID(21)
  void edit();


  /**
   * <p>
   * Getter method for the COM property "Date"
   * </p>
   * @return  Returns a value of type java.util.Date
   */

  @DISPID(1010) //= 0x3f2. The runtime will prefer the VTID if present
  @VTID(22)
  java.util.Date date();


  /**
   * <p>
   * Getter method for the COM property "IsInk"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1012) //= 0x3f4. The runtime will prefer the VTID if present
  @VTID(23)
  boolean isInk();


  // Properties:
}
