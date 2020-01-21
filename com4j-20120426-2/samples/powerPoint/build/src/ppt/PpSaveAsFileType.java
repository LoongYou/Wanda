package ppt  ;

import com4j.*;

/**
 */
public enum PpSaveAsFileType implements ComEnum {
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  ppSaveAsPresentation(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  ppSaveAsPowerPoint7(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  ppSaveAsPowerPoint4(3),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  ppSaveAsPowerPoint3(4),
  /**
   * <p>
   * The value of this constant is 5
   * </p>
   */
  ppSaveAsTemplate(5),
  /**
   * <p>
   * The value of this constant is 6
   * </p>
   */
  ppSaveAsRTF(6),
  /**
   * <p>
   * The value of this constant is 7
   * </p>
   */
  ppSaveAsShow(7),
  /**
   * <p>
   * The value of this constant is 8
   * </p>
   */
  ppSaveAsAddIn(8),
  /**
   * <p>
   * The value of this constant is 10
   * </p>
   */
  ppSaveAsPowerPoint4FarEast(10),
  /**
   * <p>
   * The value of this constant is 11
   * </p>
   */
  ppSaveAsDefault(11),
  /**
   * <p>
   * The value of this constant is 12
   * </p>
   */
  ppSaveAsHTML(12),
  /**
   * <p>
   * The value of this constant is 13
   * </p>
   */
  ppSaveAsHTMLv3(13),
  /**
   * <p>
   * The value of this constant is 14
   * </p>
   */
  ppSaveAsHTMLDual(14),
  /**
   * <p>
   * The value of this constant is 15
   * </p>
   */
  ppSaveAsMetaFile(15),
  /**
   * <p>
   * The value of this constant is 16
   * </p>
   */
  ppSaveAsGIF(16),
  /**
   * <p>
   * The value of this constant is 17
   * </p>
   */
  ppSaveAsJPG(17),
  /**
   * <p>
   * The value of this constant is 18
   * </p>
   */
  ppSaveAsPNG(18),
  /**
   * <p>
   * The value of this constant is 19
   * </p>
   */
  ppSaveAsBMP(19),
  /**
   * <p>
   * The value of this constant is 20
   * </p>
   */
  ppSaveAsWebArchive(20),
  /**
   * <p>
   * The value of this constant is 21
   * </p>
   */
  ppSaveAsTIF(21),
  /**
   * <p>
   * The value of this constant is 22
   * </p>
   */
  ppSaveAsPresForReview(22),
  /**
   * <p>
   * The value of this constant is 23
   * </p>
   */
  ppSaveAsEMF(23),
  /**
   * <p>
   * The value of this constant is 24
   * </p>
   */
  ppSaveAsOpenXMLPresentation(24),
  /**
   * <p>
   * The value of this constant is 25
   * </p>
   */
  ppSaveAsOpenXMLPresentationMacroEnabled(25),
  /**
   * <p>
   * The value of this constant is 26
   * </p>
   */
  ppSaveAsOpenXMLTemplate(26),
  /**
   * <p>
   * The value of this constant is 27
   * </p>
   */
  ppSaveAsOpenXMLTemplateMacroEnabled(27),
  /**
   * <p>
   * The value of this constant is 28
   * </p>
   */
  ppSaveAsOpenXMLShow(28),
  /**
   * <p>
   * The value of this constant is 29
   * </p>
   */
  ppSaveAsOpenXMLShowMacroEnabled(29),
  /**
   * <p>
   * The value of this constant is 30
   * </p>
   */
  ppSaveAsOpenXMLAddin(30),
  /**
   * <p>
   * The value of this constant is 31
   * </p>
   */
  ppSaveAsOpenXMLTheme(31),
  /**
   * <p>
   * The value of this constant is 32
   * </p>
   */
  ppSaveAsPDF(32),
  /**
   * <p>
   * The value of this constant is 33
   * </p>
   */
  ppSaveAsXPS(33),
  /**
   * <p>
   * The value of this constant is 34
   * </p>
   */
  ppSaveAsXMLPresentation(34),
  /**
   * <p>
   * The value of this constant is 35
   * </p>
   */
  ppSaveAsOpenDocumentPresentation(35),
  /**
   * <p>
   * The value of this constant is 36
   * </p>
   */
  ppSaveAsOpenXMLPicturePresentation(36),
  /**
   * <p>
   * The value of this constant is 37
   * </p>
   */
  ppSaveAsWMV(37),
  /**
   * <p>
   * The value of this constant is 64000
   * </p>
   */
  ppSaveAsExternalConverter(64000),
  ;

  private final int value;
  PpSaveAsFileType(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
