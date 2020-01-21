package word  ;

import com4j.*;

/**
 */
public enum WdBuiltInProperty implements ComEnum {
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  wdPropertyTitle(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  wdPropertySubject(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  wdPropertyAuthor(3),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  wdPropertyKeywords(4),
  /**
   * <p>
   * The value of this constant is 5
   * </p>
   */
  wdPropertyComments(5),
  /**
   * <p>
   * The value of this constant is 6
   * </p>
   */
  wdPropertyTemplate(6),
  /**
   * <p>
   * The value of this constant is 7
   * </p>
   */
  wdPropertyLastAuthor(7),
  /**
   * <p>
   * The value of this constant is 8
   * </p>
   */
  wdPropertyRevision(8),
  /**
   * <p>
   * The value of this constant is 9
   * </p>
   */
  wdPropertyAppName(9),
  /**
   * <p>
   * The value of this constant is 10
   * </p>
   */
  wdPropertyTimeLastPrinted(10),
  /**
   * <p>
   * The value of this constant is 11
   * </p>
   */
  wdPropertyTimeCreated(11),
  /**
   * <p>
   * The value of this constant is 12
   * </p>
   */
  wdPropertyTimeLastSaved(12),
  /**
   * <p>
   * The value of this constant is 13
   * </p>
   */
  wdPropertyVBATotalEdit(13),
  /**
   * <p>
   * The value of this constant is 14
   * </p>
   */
  wdPropertyPages(14),
  /**
   * <p>
   * The value of this constant is 15
   * </p>
   */
  wdPropertyWords(15),
  /**
   * <p>
   * The value of this constant is 16
   * </p>
   */
  wdPropertyCharacters(16),
  /**
   * <p>
   * The value of this constant is 17
   * </p>
   */
  wdPropertySecurity(17),
  /**
   * <p>
   * The value of this constant is 18
   * </p>
   */
  wdPropertyCategory(18),
  /**
   * <p>
   * The value of this constant is 19
   * </p>
   */
  wdPropertyFormat(19),
  /**
   * <p>
   * The value of this constant is 20
   * </p>
   */
  wdPropertyManager(20),
  /**
   * <p>
   * The value of this constant is 21
   * </p>
   */
  wdPropertyCompany(21),
  /**
   * <p>
   * The value of this constant is 22
   * </p>
   */
  wdPropertyBytes(22),
  /**
   * <p>
   * The value of this constant is 23
   * </p>
   */
  wdPropertyLines(23),
  /**
   * <p>
   * The value of this constant is 24
   * </p>
   */
  wdPropertyParas(24),
  /**
   * <p>
   * The value of this constant is 25
   * </p>
   */
  wdPropertySlides(25),
  /**
   * <p>
   * The value of this constant is 26
   * </p>
   */
  wdPropertyNotes(26),
  /**
   * <p>
   * The value of this constant is 27
   * </p>
   */
  wdPropertyHiddenSlides(27),
  /**
   * <p>
   * The value of this constant is 28
   * </p>
   */
  wdPropertyMMClips(28),
  /**
   * <p>
   * The value of this constant is 29
   * </p>
   */
  wdPropertyHyperlinkBase(29),
  /**
   * <p>
   * The value of this constant is 30
   * </p>
   */
  wdPropertyCharsWSpaces(30),
  ;

  private final int value;
  WdBuiltInProperty(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
