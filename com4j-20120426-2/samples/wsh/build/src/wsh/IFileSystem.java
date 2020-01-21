package wsh  ;

import com4j.*;

@IID("{0AB5A3D0-E5B6-11D0-ABF5-00A0C90FFFC0}")
public interface IFileSystem extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Drives"
   * </p>
   * @return  Returns a value of type wsh.IDriveCollection
   */

  @DISPID(10010) //= 0x271a. The runtime will prefer the VTID if present
  @VTID(7)
  wsh.IDriveCollection drives();


  @VTID(7)
  @ReturnValue(defaultPropertyThrough={wsh.IDriveCollection.class})
  wsh.IDrive drives(
    @MarshalAs(NativeType.VARIANT) java.lang.Object key);

  /**
   * @param path Mandatory java.lang.String parameter.
   * @param name Mandatory java.lang.String parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(10000) //= 0x2710. The runtime will prefer the VTID if present
  @VTID(8)
  java.lang.String buildPath(
    java.lang.String path,
    java.lang.String name);


  /**
   * @param path Mandatory java.lang.String parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(10004) //= 0x2714. The runtime will prefer the VTID if present
  @VTID(9)
  java.lang.String getDriveName(
    java.lang.String path);


  /**
   * @param path Mandatory java.lang.String parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(10005) //= 0x2715. The runtime will prefer the VTID if present
  @VTID(10)
  java.lang.String getParentFolderName(
    java.lang.String path);


  /**
   * @param path Mandatory java.lang.String parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(10006) //= 0x2716. The runtime will prefer the VTID if present
  @VTID(11)
  java.lang.String getFileName(
    java.lang.String path);


  /**
   * @param path Mandatory java.lang.String parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(10007) //= 0x2717. The runtime will prefer the VTID if present
  @VTID(12)
  java.lang.String getBaseName(
    java.lang.String path);


  /**
   * @param path Mandatory java.lang.String parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(10008) //= 0x2718. The runtime will prefer the VTID if present
  @VTID(13)
  java.lang.String getExtensionName(
    java.lang.String path);


  /**
   * @param path Mandatory java.lang.String parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(10002) //= 0x2712. The runtime will prefer the VTID if present
  @VTID(14)
  java.lang.String getAbsolutePathName(
    java.lang.String path);


  /**
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(10003) //= 0x2713. The runtime will prefer the VTID if present
  @VTID(15)
  java.lang.String getTempName();


  /**
   * @param driveSpec Mandatory java.lang.String parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(10015) //= 0x271f. The runtime will prefer the VTID if present
  @VTID(16)
  boolean driveExists(
    java.lang.String driveSpec);


  /**
   * @param fileSpec Mandatory java.lang.String parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(10016) //= 0x2720. The runtime will prefer the VTID if present
  @VTID(17)
  boolean fileExists(
    java.lang.String fileSpec);


  /**
   * @param folderSpec Mandatory java.lang.String parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(10017) //= 0x2721. The runtime will prefer the VTID if present
  @VTID(18)
  boolean folderExists(
    java.lang.String folderSpec);


  /**
   * @param driveSpec Mandatory java.lang.String parameter.
   * @return  Returns a value of type wsh.IDrive
   */

  @DISPID(10011) //= 0x271b. The runtime will prefer the VTID if present
  @VTID(19)
  wsh.IDrive getDrive(
    java.lang.String driveSpec);


  /**
   * @param filePath Mandatory java.lang.String parameter.
   * @return  Returns a value of type wsh.IFile
   */

  @DISPID(10012) //= 0x271c. The runtime will prefer the VTID if present
  @VTID(20)
  wsh.IFile getFile(
    java.lang.String filePath);


  /**
   * @param folderPath Mandatory java.lang.String parameter.
   * @return  Returns a value of type wsh.IFolder
   */

  @DISPID(10013) //= 0x271d. The runtime will prefer the VTID if present
  @VTID(21)
  wsh.IFolder getFolder(
    java.lang.String folderPath);


  /**
   * @param specialFolder Mandatory wsh.SpecialFolderConst parameter.
   * @return  Returns a value of type wsh.IFolder
   */

  @DISPID(10014) //= 0x271e. The runtime will prefer the VTID if present
  @VTID(22)
  wsh.IFolder getSpecialFolder(
    wsh.SpecialFolderConst specialFolder);


  /**
   * @param fileSpec Mandatory java.lang.String parameter.
   * @param force Optional parameter. Default value is false
   */

  @DISPID(1200) //= 0x4b0. The runtime will prefer the VTID if present
  @VTID(23)
  void deleteFile(
    java.lang.String fileSpec,
    @Optional @DefaultValue("0") boolean force);


  /**
   * @param folderSpec Mandatory java.lang.String parameter.
   * @param force Optional parameter. Default value is false
   */

  @DISPID(1201) //= 0x4b1. The runtime will prefer the VTID if present
  @VTID(24)
  void deleteFolder(
    java.lang.String folderSpec,
    @Optional @DefaultValue("0") boolean force);


  /**
   * @param source Mandatory java.lang.String parameter.
   * @param destination Mandatory java.lang.String parameter.
   */

  @DISPID(1204) //= 0x4b4. The runtime will prefer the VTID if present
  @VTID(25)
  void moveFile(
    java.lang.String source,
    java.lang.String destination);


  /**
   * @param source Mandatory java.lang.String parameter.
   * @param destination Mandatory java.lang.String parameter.
   */

  @DISPID(1205) //= 0x4b5. The runtime will prefer the VTID if present
  @VTID(26)
  void moveFolder(
    java.lang.String source,
    java.lang.String destination);


  /**
   * @param source Mandatory java.lang.String parameter.
   * @param destination Mandatory java.lang.String parameter.
   * @param overWriteFiles Optional parameter. Default value is false
   */

  @DISPID(1202) //= 0x4b2. The runtime will prefer the VTID if present
  @VTID(27)
  void copyFile(
    java.lang.String source,
    java.lang.String destination,
    @Optional @DefaultValue("-1") boolean overWriteFiles);


  /**
   * @param source Mandatory java.lang.String parameter.
   * @param destination Mandatory java.lang.String parameter.
   * @param overWriteFiles Optional parameter. Default value is false
   */

  @DISPID(1203) //= 0x4b3. The runtime will prefer the VTID if present
  @VTID(28)
  void copyFolder(
    java.lang.String source,
    java.lang.String destination,
    @Optional @DefaultValue("-1") boolean overWriteFiles);


  /**
   * @param path Mandatory java.lang.String parameter.
   * @return  Returns a value of type wsh.IFolder
   */

  @DISPID(1120) //= 0x460. The runtime will prefer the VTID if present
  @VTID(29)
  wsh.IFolder createFolder(
    java.lang.String path);


  /**
   * @param fileName Mandatory java.lang.String parameter.
   * @param overwrite Optional parameter. Default value is false
   * @param unicode Optional parameter. Default value is false
   * @return  Returns a value of type wsh.ITextStream
   */

  @DISPID(1101) //= 0x44d. The runtime will prefer the VTID if present
  @VTID(30)
  wsh.ITextStream createTextFile(
    java.lang.String fileName,
    @Optional @DefaultValue("-1") boolean overwrite,
    @Optional @DefaultValue("0") boolean unicode);


  /**
   * @param fileName Mandatory java.lang.String parameter.
   * @param ioMode Optional parameter. Default value is 1
   * @param create Optional parameter. Default value is false
   * @param format Optional parameter. Default value is 0
   * @return  Returns a value of type wsh.ITextStream
   */

  @DISPID(1100) //= 0x44c. The runtime will prefer the VTID if present
  @VTID(31)
  wsh.ITextStream openTextFile(
    java.lang.String fileName,
    @Optional @DefaultValue("1") wsh.IOMode ioMode,
    @Optional @DefaultValue("0") boolean create,
    @Optional @DefaultValue("0") wsh.Tristate format);


  // Properties:
}
