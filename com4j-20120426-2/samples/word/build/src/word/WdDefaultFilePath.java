package word  ;

import com4j.*;

/**
 */
public enum WdDefaultFilePath implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  wdDocumentsPath(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  wdPicturesPath(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  wdUserTemplatesPath(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  wdWorkgroupTemplatesPath(3),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  wdUserOptionsPath(4),
  /**
   * <p>
   * The value of this constant is 5
   * </p>
   */
  wdAutoRecoverPath(5),
  /**
   * <p>
   * The value of this constant is 6
   * </p>
   */
  wdToolsPath(6),
  /**
   * <p>
   * The value of this constant is 7
   * </p>
   */
  wdTutorialPath(7),
  /**
   * <p>
   * The value of this constant is 8
   * </p>
   */
  wdStartupPath(8),
  /**
   * <p>
   * The value of this constant is 9
   * </p>
   */
  wdProgramPath(9),
  /**
   * <p>
   * The value of this constant is 10
   * </p>
   */
  wdGraphicsFiltersPath(10),
  /**
   * <p>
   * The value of this constant is 11
   * </p>
   */
  wdTextConvertersPath(11),
  /**
   * <p>
   * The value of this constant is 12
   * </p>
   */
  wdProofingToolsPath(12),
  /**
   * <p>
   * The value of this constant is 13
   * </p>
   */
  wdTempFilePath(13),
  /**
   * <p>
   * The value of this constant is 14
   * </p>
   */
  wdCurrentFolderPath(14),
  /**
   * <p>
   * The value of this constant is 15
   * </p>
   */
  wdStyleGalleryPath(15),
  /**
   * <p>
   * The value of this constant is 19
   * </p>
   */
  wdBorderArtPath(19),
  ;

  private final int value;
  WdDefaultFilePath(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
