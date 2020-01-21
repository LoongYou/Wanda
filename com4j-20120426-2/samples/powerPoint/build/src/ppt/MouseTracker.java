package ppt  ;

import com4j.*;

@IID("{914934BE-5A91-11CF-8700-00AA0060263B}")
public interface MouseTracker extends Com4jObject {
  // Methods:
  /**
   * @param x Mandatory float parameter.
   * @param y Mandatory float parameter.
   */

  @VTID(3)
  void onTrack(
    float x,
    float y);


  /**
   * @param x Mandatory float parameter.
   * @param y Mandatory float parameter.
   */

  @VTID(4)
  void endTrack(
    float x,
    float y);


  // Properties:
}
