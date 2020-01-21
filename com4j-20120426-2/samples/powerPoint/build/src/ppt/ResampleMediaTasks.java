package ppt  ;

import com4j.*;

@IID("{BA72E554-4FF5-48F4-8215-5505F990966F}")
public interface ResampleMediaTasks extends ppt.Collection {
  // Methods:
  /**
   * @param index Mandatory int parameter.
   * @return  Returns a value of type ppt.ResampleMediaTask
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(10)
  @DefaultMethod
  ppt.ResampleMediaTask item(
    int index);


  /**
   */

  @DISPID(2001) //= 0x7d1. The runtime will prefer the VTID if present
  @VTID(11)
  void pause();


  /**
   */

  @DISPID(2002) //= 0x7d2. The runtime will prefer the VTID if present
  @VTID(12)
  void cancel();


  /**
   */

  @DISPID(2003) //= 0x7d3. The runtime will prefer the VTID if present
  @VTID(13)
  void resume();


  /**
   * <p>
   * Getter method for the COM property "PercentComplete"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(2004) //= 0x7d4. The runtime will prefer the VTID if present
  @VTID(14)
  int percentComplete();


  // Properties:
}
