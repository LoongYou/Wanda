package word  ;

import com4j.*;

/**
 */
public enum WdOpenFormat implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  wdOpenFormatAuto(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  wdOpenFormatDocument(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  wdOpenFormatTemplate(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  wdOpenFormatRTF(3),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  wdOpenFormatText(4),
  /**
   * <p>
   * The value of this constant is 5
   * </p>
   */
  wdOpenFormatUnicodeText(5),
  /**
   * <p>
   * The value of this constant is 5
   * </p>
   */
  wdOpenFormatEncodedText(5),
  /**
   * <p>
   * The value of this constant is 6
   * </p>
   */
  wdOpenFormatAllWord(6),
  /**
   * <p>
   * The value of this constant is 7
   * </p>
   */
  wdOpenFormatWebPages(7),
  /**
   * <p>
   * The value of this constant is 8
   * </p>
   */
  wdOpenFormatXML(8),
  /**
   * <p>
   * The value of this constant is 9
   * </p>
   */
  wdOpenFormatXMLDocument(9),
  /**
   * <p>
   * The value of this constant is 10
   * </p>
   */
  wdOpenFormatXMLDocumentMacroEnabled(10),
  /**
   * <p>
   * The value of this constant is 11
   * </p>
   */
  wdOpenFormatXMLTemplate(11),
  /**
   * <p>
   * The value of this constant is 12
   * </p>
   */
  wdOpenFormatXMLTemplateMacroEnabled(12),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  wdOpenFormatDocument97(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  wdOpenFormatTemplate97(2),
  /**
   * <p>
   * The value of this constant is 13
   * </p>
   */
  wdOpenFormatAllWordTemplates(13),
  /**
   * <p>
   * The value of this constant is 14
   * </p>
   */
  wdOpenFormatXMLDocumentSerialized(14),
  /**
   * <p>
   * The value of this constant is 15
   * </p>
   */
  wdOpenFormatXMLDocumentMacroEnabledSerialized(15),
  /**
   * <p>
   * The value of this constant is 16
   * </p>
   */
  wdOpenFormatXMLTemplateSerialized(16),
  /**
   * <p>
   * The value of this constant is 17
   * </p>
   */
  wdOpenFormatXMLTemplateMacroEnabledSerialized(17),
  /**
   * <p>
   * The value of this constant is 18
   * </p>
   */
  wdOpenFormatOpenDocumentText(18),
  ;

  private final int value;
  WdOpenFormat(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
