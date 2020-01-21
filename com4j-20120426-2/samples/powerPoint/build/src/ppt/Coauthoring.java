package ppt  ;

import com4j.*;

@IID("{BA72E557-4FF5-48F4-8215-5505F990966F}")
public interface Coauthoring extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of type ppt._Application
   */

  @DISPID(2001) //= 0x7d1. The runtime will prefer the VTID if present
  @VTID(7)
  ppt._Application application();


  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(2002) //= 0x7d2. The runtime will prefer the VTID if present
  @VTID(8)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject parent();


  /**
   * <p>
   * Getter method for the COM property "MergeMode"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(2003) //= 0x7d3. The runtime will prefer the VTID if present
  @VTID(9)
  boolean mergeMode();


  /**
   * <p>
   * Getter method for the COM property "FavorServerEditsDuringMerge"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(2004) //= 0x7d4. The runtime will prefer the VTID if present
  @VTID(10)
  boolean favorServerEditsDuringMerge();


  /**
   * <p>
   * Setter method for the COM property "FavorServerEditsDuringMerge"
   * </p>
   * @param favorServerEditsDuringMerge Mandatory boolean parameter.
   */

  @DISPID(2004) //= 0x7d4. The runtime will prefer the VTID if present
  @VTID(11)
  void favorServerEditsDuringMerge(
    boolean favorServerEditsDuringMerge);


  /**
   */

  @DISPID(2005) //= 0x7d5. The runtime will prefer the VTID if present
  @VTID(12)
  void endReview();


  /**
   * <p>
   * Getter method for the COM property "PendingUpdates"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(2006) //= 0x7d6. The runtime will prefer the VTID if present
  @VTID(13)
  boolean pendingUpdates();


  /**
   * <p>
   * Getter method for the COM property "CoauthorCount"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(2007) //= 0x7d7. The runtime will prefer the VTID if present
  @VTID(14)
  int coauthorCount();


  // Properties:
}
