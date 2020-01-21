package iTunes.def  ;

import com4j.*;

/**
 * IITBrowserWindow Interface
 */
@IID("{C999F455-C4D5-4AA4-8277-F99753699974}")
public interface IITBrowserWindow extends iTunes.def.IITWindow {
  // Methods:
  /**
   * <p>
   * True if window is in Mini Player mode.
   * </p>
   * <p>
   * Getter method for the COM property "MiniPlayer"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610809344) //= 0x60030000. The runtime will prefer the VTID if present
  @VTID(32)
  boolean miniPlayer();


  /**
   * <p>
   * True if window is in Mini Player mode.
   * </p>
   * <p>
   * Setter method for the COM property "MiniPlayer"
   * </p>
   * @param isMiniPlayer Mandatory boolean parameter.
   */

  @DISPID(1610809344) //= 0x60030000. The runtime will prefer the VTID if present
  @VTID(33)
  void miniPlayer(
    boolean isMiniPlayer);


  /**
   * <p>
   * Returns a collection containing the currently selected track or tracks.
   * </p>
   * <p>
   * Getter method for the COM property "SelectedTracks"
   * </p>
   * @return  Returns a value of type iTunes.def.IITTrackCollection
   */

  @DISPID(1610809346) //= 0x60030002. The runtime will prefer the VTID if present
  @VTID(34)
  iTunes.def.IITTrackCollection selectedTracks();


  @VTID(34)
  @ReturnValue(defaultPropertyThrough={iTunes.def.IITTrackCollection.class})
  iTunes.def.IITTrack selectedTracks(
    int index);

  /**
   * <p>
   * The currently selected playlist in the Source list.
   * </p>
   * <p>
   * Getter method for the COM property "SelectedPlaylist"
   * </p>
   * @return  Returns a value of type iTunes.def.IITPlaylist
   */

  @DISPID(1610809347) //= 0x60030003. The runtime will prefer the VTID if present
  @VTID(35)
  iTunes.def.IITPlaylist selectedPlaylist();


  /**
   * <p>
   * The currently selected playlist in the Source list.
   * </p>
   * <p>
   * Setter method for the COM property "SelectedPlaylist"
   * </p>
   * @param iPlaylist Mandatory java.lang.Object parameter.
   */

  @DISPID(1610809347) //= 0x60030003. The runtime will prefer the VTID if present
  @VTID(36)
  void selectedPlaylist(
    java.lang.Object iPlaylist);


  // Properties:
}
