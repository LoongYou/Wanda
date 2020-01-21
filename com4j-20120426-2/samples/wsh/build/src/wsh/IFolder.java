package wsh  ;

import com4j.*;

@IID("{C7C3F5A2-88A3-11D0-ABCB-00A0C90FFFC0}")
public interface IFolder extends Com4jObject {
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
   * Getter method for the COM property "Type"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1010) //= 0x3f2. The runtime will prefer the VTID if present
  @VTID(19)
  java.lang.String type();


  /**
   * @param force Optional parameter. Default value is false
   */

  @DISPID(1201) //= 0x4b1. The runtime will prefer the VTID if present
  @VTID(20)
  void delete(
    @Optional @DefaultValue("0") boolean force);


  /**
   * @param destination Mandatory java.lang.String parameter.
   * @param overWriteFiles Optional parameter. Default value is false
   */

  @DISPID(1203) //= 0x4b3. The runtime will prefer the VTID if present
  @VTID(21)
  void copy(
    java.lang.String destination,
    @Optional @DefaultValue("-1") boolean overWriteFiles);


  /**
   * @param destination Mandatory java.lang.String parameter.
   */

  @DISPID(1205) //= 0x4b5. The runtime will prefer the VTID if present
  @VTID(22)
  void move(
    java.lang.String destination);


  /**
   * <p>
   * Getter method for the COM property "IsRootFolder"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(10000) //= 0x2710. The runtime will prefer the VTID if present
  @VTID(23)
  boolean isRootFolder();


  /**
   * <p>
   * Getter method for the COM property "Size"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(1009) //= 0x3f1. The runtime will prefer the VTID if present
  @VTID(24)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object size();


  /**
   * <p>
   * Getter method for the COM property "SubFolders"
   * </p>
   * @return  Returns a value of type wsh.IFolderCollection
   */

  @DISPID(10001) //= 0x2711. The runtime will prefer the VTID if present
  @VTID(25)
  wsh.IFolderCollection subFolders();


  @VTID(25)
  @ReturnValue(defaultPropertyThrough={wsh.IFolderCollection.class})
  wsh.IFolder subFolders(
    @MarshalAs(NativeType.VARIANT) java.lang.Object key);

  /**
   * <p>
   * Getter method for the COM property "Files"
   * </p>
   * @return  Returns a value of type wsh.IFileCollection
   */

  @DISPID(10002) //= 0x2712. The runtime will prefer the VTID if present
  @VTID(26)
  wsh.IFileCollection files();


  @VTID(26)
  @ReturnValue(defaultPropertyThrough={wsh.IFileCollection.class})
  wsh.IFile files(
    @MarshalAs(NativeType.VARIANT) java.lang.Object key);

  /**
   * @param fileName Mandatory java.lang.String parameter.
   * @param overwrite Optional parameter. Default value is false
   * @param unicode Optional parameter. Default value is false
   * @return  Returns a value of type wsh.ITextStream
   */

  @DISPID(1101) //= 0x44d. The runtime will prefer the VTID if present
  @VTID(27)
  wsh.ITextStream createTextFile(
    java.lang.String fileName,
    @Optional @DefaultValue("-1") boolean overwrite,
    @Optional @DefaultValue("0") boolean unicode);


  // Properties:
}
