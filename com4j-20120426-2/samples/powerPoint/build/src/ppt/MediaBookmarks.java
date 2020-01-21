package ppt  ;

import com4j.*;

@IID("{BA72E556-4FF5-48F4-8215-5505F990966F}")
public interface MediaBookmarks extends ppt.Collection {
  // Methods:
  /**
   * @param index Mandatory int parameter.
   * @return  Returns a value of type ppt.MediaBookmark
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(10)
  @DefaultMethod
  ppt.MediaBookmark item(
    int index);


  /**
   * @param position Mandatory int parameter.
   * @param name Mandatory java.lang.String parameter.
   * @return  Returns a value of type ppt.MediaBookmark
   */

  @DISPID(2001) //= 0x7d1. The runtime will prefer the VTID if present
  @VTID(11)
  ppt.MediaBookmark add(
    int position,
    java.lang.String name);


  // Properties:
}
