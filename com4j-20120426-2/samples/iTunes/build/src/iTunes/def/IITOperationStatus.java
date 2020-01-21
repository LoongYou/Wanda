package iTunes.def  ;

import com4j.*;

/**
 * IITOperationStatus Interface
 */
@IID("{206479C9-FE32-4F9B-A18A-475AC939B479}")
public interface IITOperationStatus extends Com4jObject {
  // Methods:
  /**
   * <p>
   * True if the operation is still in progress.
   * </p>
   * <p>
   * Getter method for the COM property "InProgress"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610743808) //= 0x60020000. The runtime will prefer the VTID if present
  @VTID(7)
  boolean inProgress();


  /**
   * <p>
   * Returns a collection containing the tracks that were generated by the operation.
   * </p>
   * <p>
   * Getter method for the COM property "Tracks"
   * </p>
   * @return  Returns a value of type iTunes.def.IITTrackCollection
   */

  @DISPID(1610743809) //= 0x60020001. The runtime will prefer the VTID if present
  @VTID(8)
  iTunes.def.IITTrackCollection tracks();


  @VTID(8)
  @ReturnValue(defaultPropertyThrough={iTunes.def.IITTrackCollection.class})
  iTunes.def.IITTrack tracks(
    int index);

  // Properties:
}
