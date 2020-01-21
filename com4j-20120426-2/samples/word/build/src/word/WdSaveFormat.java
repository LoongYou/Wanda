package word  ;

import com4j.*;

/**
 */
public enum WdSaveFormat implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  wdFormatDocument(0),
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  wdFormatDocument97(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  wdFormatTemplate(1),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  wdFormatTemplate97(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  wdFormatText(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  wdFormatTextLineBreaks(3),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  wdFormatDOSText(4),
  /**
   * <p>
   * The value of this constant is 5
   * </p>
   */
  wdFormatDOSTextLineBreaks(5),
  /**
   * <p>
   * The value of this constant is 6
   * </p>
   */
  wdFormatRTF(6),
  /**
   * <p>
   * The value of this constant is 7
   * </p>
   */
  wdFormatUnicodeText(7),
  /**
   * <p>
   * The value of this constant is 7
   * </p>
   */
  wdFormatEncodedText(7),
  /**
   * <p>
   * The value of this constant is 8
   * </p>
   */
  wdFormatHTML(8),
  /**
   * <p>
   * The value of this constant is 9
   * </p>
   */
  wdFormatWebArchive(9),
  /**
   * <p>
   * The value of this constant is 10
   * </p>
   */
  wdFormatFilteredHTML(10),
  /**
   * <p>
   * The value of this constant is 11
   * </p>
   */
  wdFormatXML(11),
  /**
   * <p>
   * The value of this constant is 12
   * </p>
   */
  wdFormatXMLDocument(12),
  /**
   * <p>
   * The value of this constant is 13
   * </p>
   */
  wdFormatXMLDocumentMacroEnabled(13),
  /**
   * <p>
   * The value of this constant is 14
   * </p>
   */
  wdFormatXMLTemplate(14),
  /**
   * <p>
   * The value of this constant is 15
   * </p>
   */
  wdFormatXMLTemplateMacroEnabled(15),
  /**
   * <p>
   * The value of this constant is 16
   * </p>
   */
  wdFormatDocumentDefault(16),
  /**
   * <p>
   * The value of this constant is 17
   * </p>
   */
  wdFormatPDF(17),
  /**
   * <p>
   * The value of this constant is 18
   * </p>
   */
  wdFormatXPS(18),
  /**
   * <p>
   * The value of this constant is 19
   * </p>
   */
  wdFormatFlatXML(19),
  /**
   * <p>
   * The value of this constant is 20
   * </p>
   */
  wdFormatFlatXMLMacroEnabled(20),
  /**
   * <p>
   * The value of this constant is 21
   * </p>
   */
  wdFormatFlatXMLTemplate(21),
  /**
   * <p>
   * The value of this constant is 22
   * </p>
   */
  wdFormatFlatXMLTemplateMacroEnabled(22),
  /**
   * <p>
   * The value of this constant is 23
   * </p>
   */
  wdFormatOpenDocumentText(23),
  ;

  private final int value;
  WdSaveFormat(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
