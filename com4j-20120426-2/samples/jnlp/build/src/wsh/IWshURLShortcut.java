package wsh  ;

import com4j.*;

/**
 * URLShortcut Object
 */
@IID("{F935DC2B-1CF0-11D0-ADB9-00C04FD58A0B}")
public interface IWshURLShortcut extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "FullName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(7)
  @DefaultMethod
  java.lang.String fullName();


  /**
   * <p>
   * Getter method for the COM property "TargetPath"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1005) //= 0x3ed. The runtime will prefer the VTID if present
  @VTID(8)
  java.lang.String targetPath();


  /**
   * <p>
   * Setter method for the COM property "TargetPath"
   * </p>
   * @param out_Path Mandatory java.lang.String parameter.
   */

  @DISPID(1005) //= 0x3ed. The runtime will prefer the VTID if present
  @VTID(9)
  void targetPath(
    java.lang.String out_Path);


  /**
   * @param pathLink Mandatory java.lang.String parameter.
   */

  @DISPID(2000) //= 0x7d0. The runtime will prefer the VTID if present
  @VTID(10)
  void load(
    java.lang.String pathLink);


  /**
   */

  @DISPID(2001) //= 0x7d1. The runtime will prefer the VTID if present
  @VTID(11)
  void save();


  // Properties:
}
