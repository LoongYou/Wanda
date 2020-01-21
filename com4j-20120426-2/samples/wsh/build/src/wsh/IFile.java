package wsh  ;

import com4j.*;

@IID("{C7C3F5A4-88A3-11D0-ABCB-00A0C90FFFC0}")
public interface IFile extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Path"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(7)
  @DefaultMethod
  java.lang.String path();


  /**
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1000) //= 0x3e8. The runtime will prefer the VTID if present
  @VTID(8)
  java.lang.String name();


  /**
   * <p>
   * Setter method for the COM property "Name"
   * </p>
   * @param pbstrName Mandatory java.lang.String parameter.
   */

  @DISPID(1000) //= 0x3e8. The runtime will prefer the VTID if present
  @VTID(9)
  void name(
    java.lang.String pbstrName);


  /**
   * <p>
   * Getter method for the COM property "ShortPath"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1002) //= 0x3ea. The runtime will prefer the VTID if present
  @VTID(10)
  java.lang.String shortPath();


  /**
   * <p>
   * Getter method for the COM property "ShortName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1001) //= 0x3e9. The runtime will prefer the VTID if present
  @VTID(11)
  java.lang.String shortName();


  /**
   * <p>
   * Getter method for the COM property "Drive"
   * </p>
   * @return  Returns a value of type wsh.IDrive
   */

  @DISPID(1004) //= 0x3ec. The runtime will prefer the VTID if present
  @VTID(12)
  wsh.IDrive drive();


  /**
   * <p>
   * Getter method for the COM property "ParentFolder"
   * </p>
   * @return  Returns a value of type wsh.IFolder
   */

  @DISPID(1005) //= 0x3ed. The runtime will prefer the VTID if present
  @VTID(13)
  wsh.IFolder parentFolder();


  /**
   * <p>
   * Getter method for the COM property "Attributes"
   * </p>
   * @return  Returns a value of type wsh.FileAttribute
   */

  @DISPID(1003) //= 0x3eb. The runtime will prefer the VTID if present
  @VTID(14)
  wsh.FileAttribute attributes();


  /**
   * <p>
   * Setter method for the COM property "Attributes"
   * </p>
   * @param pfa Mandatory wsh.FileAttribute parameter.
   */

  @DISPID(1003) //= 0x3eb. The runtime will prefer the VTID if present
  @VTID(15)
  void attributes(
    wsh.FileAttribute pfa);


  /**
   * <p>
   * Getter method for the COM property "DateCreated"
   * </p>
   * @return  Returns a value of type java.util.Date
   */

  @DISPID(1006) //= 0x3ee. The runtime will prefer the VTID if present
  @VTID(16)
  java.util.Date dateCreated();


  /**
   * <p>
   * Getter method for the COM property "DateLastModified"
   * </p>
   * @return  Returns a value of type java.util.Date
   */

  @DISPID(1007) //= 0x3ef. The runtime will prefer the VTID if present
  @VTID(17)
  java.util.Date dateLastModified();


  /**
   * <p>
   * Getter method for the COM property "DateLastAccessed"
   * </p>
   * @return  Returns a value of type java.util.Date
   */

  @DISPID(1008) //= 0x3f0. The runtime will prefer the VTID if present
  @VTID(18)
  java.util.Date dateLastAccessed();


  /**
   * <p>
   * Getter method for the COM property "Size"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(1009) //= 0x3f1. The runtime will prefer the VTID if present
  @VTID(19)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object size();


  /**
   * <p>
   * Getter method for the COM property "Type"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1010) //= 0x3f2. The runtime will prefer the VTID if present
  @VTID(20)
  java.lang.String type();


  /**
   * @param force Optional parameter. Default value is false
   */

  @DISPID(1200) //= 0x4b0. The runtime will prefer the VTID if present
  @VTID(21)
  void delete(
    @Optional @DefaultValue("0") boolean force);


  /**
   * @param destination Mandatory java.lang.String parameter.
   * @param overWriteFiles Optional parameter. Default value is false
   */

  @DISPID(1202) //= 0x4b2. The runtime will prefer the VTID if present
  @VTID(22)
  void copy(
    java.lang.String destination,
    @Optional @DefaultValue("-1") boolean overWriteFiles);


  /**
   * @param destination Mandatory java.lang.String parameter.
   */

  @DISPID(1204) //= 0x4b4. The runtime will prefer the VTID if present
  @VTID(23)
  void move(
    java.lang.String destination);


  /**
   * @param ioMode Optional parameter. Default value is 1
   * @param format Optional parameter. Default value is 0
   * @return  Returns a value of type wsh.ITextStream
   */

  @DISPID(1100) //= 0x44c. The runtime will prefer the VTID if present
  @VTID(24)
  wsh.ITextStream openAsTextStream(
    @Optional @DefaultValue("1") wsh.IOMode ioMode,
    @Optional @DefaultValue("0") wsh.Tristate format);


  // Properties:
}
