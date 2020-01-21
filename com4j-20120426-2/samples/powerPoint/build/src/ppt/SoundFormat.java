package ppt  ;

import com4j.*;

@IID("{91493473-5A91-11CF-8700-00AA0060263B}")
public interface SoundFormat extends Com4jObject {
  // Methods:
  /**
   */

  @DISPID(2000) //= 0x7d0. The runtime will prefer the VTID if present
  @VTID(7)
  void play();


  /**
   * @param fileName Mandatory java.lang.String parameter.
   */

  @DISPID(2001) //= 0x7d1. The runtime will prefer the VTID if present
  @VTID(8)
  void _import(
    java.lang.String fileName);


  /**
   * @param fileName Mandatory java.lang.String parameter.
   * @return  Returns a value of type ppt.PpSoundFormatType
   */

  @DISPID(2002) //= 0x7d2. The runtime will prefer the VTID if present
  @VTID(9)
  ppt.PpSoundFormatType export(
    java.lang.String fileName);


  /**
   * <p>
   * Getter method for the COM property "Type"
   * </p>
   * @return  Returns a value of type ppt.PpSoundFormatType
   */

  @DISPID(2003) //= 0x7d3. The runtime will prefer the VTID if present
  @VTID(10)
  ppt.PpSoundFormatType type();


  /**
   * <p>
   * Getter method for the COM property "SourceFullName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(2004) //= 0x7d4. The runtime will prefer the VTID if present
  @VTID(11)
  java.lang.String sourceFullName();


  // Properties:
}
