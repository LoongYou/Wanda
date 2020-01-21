package wsh  ;

import com4j.*;

/**
 * WSH Exec Object
 */
@IID("{08FED190-BE19-11D3-A28B-00104BD35090}")
public interface IWshExec extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Status"
   * </p>
   * @return  Returns a value of type wsh.WshExecStatus
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(7)
  wsh.WshExecStatus status();


  /**
   * <p>
   * Getter method for the COM property "StdIn"
   * </p>
   * @return  Returns a value of type wsh.ITextStream
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(8)
  wsh.ITextStream stdIn();


  /**
   * <p>
   * Getter method for the COM property "StdOut"
   * </p>
   * @return  Returns a value of type wsh.ITextStream
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(9)
  wsh.ITextStream stdOut();


  /**
   * <p>
   * Getter method for the COM property "StdErr"
   * </p>
   * @return  Returns a value of type wsh.ITextStream
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(10)
  wsh.ITextStream stdErr();


  /**
   * <p>
   * Getter method for the COM property "ProcessID"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(11)
  int processID();


  /**
   * <p>
   * Getter method for the COM property "ExitCode"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(12)
  int exitCode();


  /**
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(13)
  void terminate();


  // Properties:
}
