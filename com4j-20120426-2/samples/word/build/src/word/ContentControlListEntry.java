package word  ;

import com4j.*;

@IID("{0C6FA8CA-E65F-4FC7-AB8F-20729EECBB14}")
public interface ContentControlListEntry extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of type word._Application
   */

  @DISPID(100) //= 0x64. The runtime will prefer the VTID if present
  @VTID(7)
  word._Application application();


  /**
   * <p>
   * Getter method for the COM property "Creator"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(101) //= 0x65. The runtime will prefer the VTID if present
  @VTID(8)
  int creator();


  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(102) //= 0x66. The runtime will prefer the VTID if present
  @VTID(9)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject parent();


  /**
   * <p>
   * Getter method for the COM property "Text"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(10)
  @DefaultMethod
  java.lang.String text();


  /**
   * <p>
   * Setter method for the COM property "Text"
   * </p>
   * @param prop Mandatory java.lang.String parameter.
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(11)
  @DefaultMethod
  void text(
    java.lang.String prop);


  /**
   * <p>
   * Getter method for the COM property "Value"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(104) //= 0x68. The runtime will prefer the VTID if present
  @VTID(12)
  java.lang.String value();


  /**
   * <p>
   * Setter method for the COM property "Value"
   * </p>
   * @param prop Mandatory java.lang.String parameter.
   */

  @DISPID(104) //= 0x68. The runtime will prefer the VTID if present
  @VTID(13)
  void value(
    java.lang.String prop);


  /**
   * <p>
   * Getter method for the COM property "Index"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(105) //= 0x69. The runtime will prefer the VTID if present
  @VTID(14)
  int index();


  /**
   * <p>
   * Setter method for the COM property "Index"
   * </p>
   * @param prop Mandatory int parameter.
   */

  @DISPID(105) //= 0x69. The runtime will prefer the VTID if present
  @VTID(15)
  void index(
    int prop);


  /**
   */

  @DISPID(106) //= 0x6a. The runtime will prefer the VTID if present
  @VTID(16)
  void delete();


  /**
   */

  @DISPID(107) //= 0x6b. The runtime will prefer the VTID if present
  @VTID(17)
  void moveUp();


  /**
   */

  @DISPID(108) //= 0x6c. The runtime will prefer the VTID if present
  @VTID(18)
  void moveDown();


  /**
   */

  @DISPID(109) //= 0x6d. The runtime will prefer the VTID if present
  @VTID(19)
  void select();


  // Properties:
}
