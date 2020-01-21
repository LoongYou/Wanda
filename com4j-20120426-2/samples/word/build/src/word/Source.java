package word  ;

import com4j.*;

@IID("{4A6AE865-199D-4EA3-9F6B-125BD9C40EDF}")
public interface Source extends Com4jObject {
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
   * Getter method for the COM property "Tag"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(103) //= 0x67. The runtime will prefer the VTID if present
  @VTID(10)
  java.lang.String tag();


  /**
   * <p>
   * Getter method for the COM property "Field"
   * </p>
   * @param name Mandatory java.lang.String parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(104) //= 0x68. The runtime will prefer the VTID if present
  @VTID(11)
  java.lang.String field(
    java.lang.String name);


  /**
   * <p>
   * Setter method for the COM property "Field"
   * </p>
   * @param name Mandatory java.lang.String parameter.
   * @param prop Mandatory java.lang.String parameter.
   */

  @DISPID(104) //= 0x68. The runtime will prefer the VTID if present
  @VTID(12)
  void field(
    java.lang.String name,
    java.lang.String prop);


  /**
   * <p>
   * Getter method for the COM property "XML"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(105) //= 0x69. The runtime will prefer the VTID if present
  @VTID(13)
  java.lang.String xml();


  /**
   * <p>
   * Getter method for the COM property "Cited"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(107) //= 0x6b. The runtime will prefer the VTID if present
  @VTID(14)
  boolean cited();


  /**
   */

  @DISPID(106) //= 0x6a. The runtime will prefer the VTID if present
  @VTID(15)
  void delete();


  // Properties:
}
