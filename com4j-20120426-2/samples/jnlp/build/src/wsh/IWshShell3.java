package wsh  ;

import com4j.*;

/**
 * Shell Object Interface
 */
@IID("{41904400-BE18-11D3-A28B-00104BD35090}")
public interface IWshShell3 extends wsh.IWshShell2 {
  // Methods:
  /**
   * @param command Mandatory java.lang.String parameter.
   * @return  Returns a value of type wsh.IWshExec
   */

  @DISPID(3012) //= 0xbc4. The runtime will prefer the VTID if present
  @VTID(19)
  wsh.IWshExec exec(
    java.lang.String command);


  /**
   * <p>
   * Getter method for the COM property "CurrentDirectory"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(3013) //= 0xbc5. The runtime will prefer the VTID if present
  @VTID(20)
  java.lang.String currentDirectory();


  /**
   * <p>
   * Setter method for the COM property "CurrentDirectory"
   * </p>
   * @param out_Directory Mandatory java.lang.String parameter.
   */

  @DISPID(3013) //= 0xbc5. The runtime will prefer the VTID if present
  @VTID(21)
  void currentDirectory(
    java.lang.String out_Directory);


  // Properties:
}
