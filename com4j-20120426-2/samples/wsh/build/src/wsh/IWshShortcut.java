package wsh  ;

import com4j.*;

/**
 * Shortcut Object
 */
@IID("{F935DC23-1CF0-11D0-ADB9-00C04FD58A0B}")
public interface IWshShortcut extends Com4jObject {
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
   * Getter method for the COM property "Arguments"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1000) //= 0x3e8. The runtime will prefer the VTID if present
  @VTID(8)
  java.lang.String arguments();


  /**
   * <p>
   * Setter method for the COM property "Arguments"
   * </p>
   * @param out_Arguments Mandatory java.lang.String parameter.
   */

  @DISPID(1000) //= 0x3e8. The runtime will prefer the VTID if present
  @VTID(9)
  void arguments(
    java.lang.String out_Arguments);


  /**
   * <p>
   * Getter method for the COM property "Description"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1001) //= 0x3e9. The runtime will prefer the VTID if present
  @VTID(10)
  java.lang.String description();


  /**
   * <p>
   * Setter method for the COM property "Description"
   * </p>
   * @param out_Description Mandatory java.lang.String parameter.
   */

  @DISPID(1001) //= 0x3e9. The runtime will prefer the VTID if present
  @VTID(11)
  void description(
    java.lang.String out_Description);


  /**
   * <p>
   * Getter method for the COM property "Hotkey"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1002) //= 0x3ea. The runtime will prefer the VTID if present
  @VTID(12)
  java.lang.String hotkey();


  /**
   * <p>
   * Setter method for the COM property "Hotkey"
   * </p>
   * @param out_HotKey Mandatory java.lang.String parameter.
   */

  @DISPID(1002) //= 0x3ea. The runtime will prefer the VTID if present
  @VTID(13)
  void hotkey(
    java.lang.String out_HotKey);


  /**
   * <p>
   * Getter method for the COM property "IconLocation"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1003) //= 0x3eb. The runtime will prefer the VTID if present
  @VTID(14)
  java.lang.String iconLocation();


  /**
   * <p>
   * Setter method for the COM property "IconLocation"
   * </p>
   * @param out_IconPath Mandatory java.lang.String parameter.
   */

  @DISPID(1003) //= 0x3eb. The runtime will prefer the VTID if present
  @VTID(15)
  void iconLocation(
    java.lang.String out_IconPath);


  /**
   * <p>
   * Setter method for the COM property "RelativePath"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(1004) //= 0x3ec. The runtime will prefer the VTID if present
  @VTID(16)
  void relativePath(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "TargetPath"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1005) //= 0x3ed. The runtime will prefer the VTID if present
  @VTID(17)
  java.lang.String targetPath();


  /**
   * <p>
   * Setter method for the COM property "TargetPath"
   * </p>
   * @param out_Path Mandatory java.lang.String parameter.
   */

  @DISPID(1005) //= 0x3ed. The runtime will prefer the VTID if present
  @VTID(18)
  void targetPath(
    java.lang.String out_Path);


  /**
   * <p>
   * Getter method for the COM property "WindowStyle"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1006) //= 0x3ee. The runtime will prefer the VTID if present
  @VTID(19)
  int windowStyle();


  /**
   * <p>
   * Setter method for the COM property "WindowStyle"
   * </p>
   * @param out_ShowCmd Mandatory int parameter.
   */

  @DISPID(1006) //= 0x3ee. The runtime will prefer the VTID if present
  @VTID(20)
  void windowStyle(
    int out_ShowCmd);


  /**
   * <p>
   * Getter method for the COM property "WorkingDirectory"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1007) //= 0x3ef. The runtime will prefer the VTID if present
  @VTID(21)
  java.lang.String workingDirectory();


  /**
   * <p>
   * Setter method for the COM property "WorkingDirectory"
   * </p>
   * @param out_WorkingDirectory Mandatory java.lang.String parameter.
   */

  @DISPID(1007) //= 0x3ef. The runtime will prefer the VTID if present
  @VTID(22)
  void workingDirectory(
    java.lang.String out_WorkingDirectory);


  /**
   * @param pathLink Mandatory java.lang.String parameter.
   */

  @DISPID(2000) //= 0x7d0. The runtime will prefer the VTID if present
  @VTID(23)
  void load(
    java.lang.String pathLink);


  /**
   */

  @DISPID(2001) //= 0x7d1. The runtime will prefer the VTID if present
  @VTID(24)
  void save();


  // Properties:
}
