package wsh  ;

import com4j.*;

@IID("{2A0B9D10-4B87-11D3-A97A-00104B365C9F}")
public interface IFileSystem3 extends wsh.IFileSystem {
  // Methods:
  /**
   * @param standardStreamType Mandatory wsh.StandardStreamTypes parameter.
   * @param unicode Optional parameter. Default value is false
   * @return  Returns a value of type wsh.ITextStream
   */

  @DISPID(20000) //= 0x4e20. The runtime will prefer the VTID if present
  @VTID(32)
  wsh.ITextStream getStandardStream(
    wsh.StandardStreamTypes standardStreamType,
    @Optional @DefaultValue("0") boolean unicode);


  /**
   * @param fileName Mandatory java.lang.String parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(20010) //= 0x4e2a. The runtime will prefer the VTID if present
  @VTID(33)
  java.lang.String getFileVersion(
    java.lang.String fileName);


  // Properties:
}
