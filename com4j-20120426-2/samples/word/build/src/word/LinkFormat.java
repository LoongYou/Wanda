package word  ;

import com4j.*;

@IID("{00020931-0000-0000-C000-000000000046}")
public interface LinkFormat extends Com4jObject {
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
   * Getter method for the COM property "AutoUpdate"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(10)
  boolean autoUpdate();


  /**
   * <p>
   * Setter method for the COM property "AutoUpdate"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(11)
  void autoUpdate(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "SourceName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(12)
  java.lang.String sourceName();


  /**
   * <p>
   * Getter method for the COM property "SourcePath"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(13)
  java.lang.String sourcePath();


  /**
   * <p>
   * Getter method for the COM property "Locked"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(13) //= 0xd. The runtime will prefer the VTID if present
  @VTID(14)
  boolean locked();


  /**
   * <p>
   * Setter method for the COM property "Locked"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(13) //= 0xd. The runtime will prefer the VTID if present
  @VTID(15)
  void locked(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "Type"
   * </p>
   * @return  Returns a value of type word.WdLinkType
   */

  @DISPID(16) //= 0x10. The runtime will prefer the VTID if present
  @VTID(16)
  word.WdLinkType type();


  /**
   * <p>
   * Getter method for the COM property "SourceFullName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(21) //= 0x15. The runtime will prefer the VTID if present
  @VTID(17)
  java.lang.String sourceFullName();


  /**
   * <p>
   * Setter method for the COM property "SourceFullName"
   * </p>
   * @param prop Mandatory java.lang.String parameter.
   */

  @DISPID(21) //= 0x15. The runtime will prefer the VTID if present
  @VTID(18)
  void sourceFullName(
    java.lang.String prop);


  /**
   * <p>
   * Getter method for the COM property "SavePictureWithDocument"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(22) //= 0x16. The runtime will prefer the VTID if present
  @VTID(19)
  boolean savePictureWithDocument();


  /**
   * <p>
   * Setter method for the COM property "SavePictureWithDocument"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(22) //= 0x16. The runtime will prefer the VTID if present
  @VTID(20)
  void savePictureWithDocument(
    boolean prop);


  /**
   */

  @DISPID(104) //= 0x68. The runtime will prefer the VTID if present
  @VTID(21)
  void breakLink();


  /**
   */

  @DISPID(105) //= 0x69. The runtime will prefer the VTID if present
  @VTID(22)
  void update();


  // Properties:
}
