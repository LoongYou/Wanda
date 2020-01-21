package vba  ;

import com4j.*;

@IID("{EEE00915-E393-11D1-BB03-00C04FB6C4A6}")
public interface _VBProject extends vba._VBProject_Old {
  // Methods:
  /**
   * @param fileName Mandatory java.lang.String parameter.
   */

  @DISPID(138) //= 0x8a. The runtime will prefer the VTID if present
  @VTID(24)
  void saveAs(
    java.lang.String fileName);


  /**
   */

  @DISPID(139) //= 0x8b. The runtime will prefer the VTID if present
  @VTID(25)
  void makeCompiledFile();


  /**
   * <p>
   * Getter method for the COM property "Type"
   * </p>
   * @return  Returns a value of type vba.vbext_ProjectType
   */

  @DISPID(140) //= 0x8c. The runtime will prefer the VTID if present
  @VTID(26)
  vba.vbext_ProjectType type();


  /**
   * <p>
   * Getter method for the COM property "FileName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(141) //= 0x8d. The runtime will prefer the VTID if present
  @VTID(27)
  java.lang.String fileName();


  /**
   * <p>
   * Getter method for the COM property "BuildFileName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(142) //= 0x8e. The runtime will prefer the VTID if present
  @VTID(28)
  java.lang.String buildFileName();


  /**
   * <p>
   * Setter method for the COM property "BuildFileName"
   * </p>
   * @param lpbstrBldFName Mandatory java.lang.String parameter.
   */

  @DISPID(142) //= 0x8e. The runtime will prefer the VTID if present
  @VTID(29)
  void buildFileName(
    java.lang.String lpbstrBldFName);


  // Properties:
}
