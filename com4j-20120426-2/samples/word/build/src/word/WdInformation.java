package word  ;

import com4j.*;

/**
 */
public enum WdInformation implements ComEnum {
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  wdActiveEndAdjustedPageNumber(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  wdActiveEndSectionNumber(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  wdActiveEndPageNumber(3),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  wdNumberOfPagesInDocument(4),
  /**
   * <p>
   * The value of this constant is 5
   * </p>
   */
  wdHorizontalPositionRelativeToPage(5),
  /**
   * <p>
   * The value of this constant is 6
   * </p>
   */
  wdVerticalPositionRelativeToPage(6),
  /**
   * <p>
   * The value of this constant is 7
   * </p>
   */
  wdHorizontalPositionRelativeToTextBoundary(7),
  /**
   * <p>
   * The value of this constant is 8
   * </p>
   */
  wdVerticalPositionRelativeToTextBoundary(8),
  /**
   * <p>
   * The value of this constant is 9
   * </p>
   */
  wdFirstCharacterColumnNumber(9),
  /**
   * <p>
   * The value of this constant is 10
   * </p>
   */
  wdFirstCharacterLineNumber(10),
  /**
   * <p>
   * The value of this constant is 11
   * </p>
   */
  wdFrameIsSelected(11),
  /**
   * <p>
   * The value of this constant is 12
   * </p>
   */
  wdWithInTable(12),
  /**
   * <p>
   * The value of this constant is 13
   * </p>
   */
  wdStartOfRangeRowNumber(13),
  /**
   * <p>
   * The value of this constant is 14
   * </p>
   */
  wdEndOfRangeRowNumber(14),
  /**
   * <p>
   * The value of this constant is 15
   * </p>
   */
  wdMaximumNumberOfRows(15),
  /**
   * <p>
   * The value of this constant is 16
   * </p>
   */
  wdStartOfRangeColumnNumber(16),
  /**
   * <p>
   * The value of this constant is 17
   * </p>
   */
  wdEndOfRangeColumnNumber(17),
  /**
   * <p>
   * The value of this constant is 18
   * </p>
   */
  wdMaximumNumberOfColumns(18),
  /**
   * <p>
   * The value of this constant is 19
   * </p>
   */
  wdZoomPercentage(19),
  /**
   * <p>
   * The value of this constant is 20
   * </p>
   */
  wdSelectionMode(20),
  /**
   * <p>
   * The value of this constant is 21
   * </p>
   */
  wdCapsLock(21),
  /**
   * <p>
   * The value of this constant is 22
   * </p>
   */
  wdNumLock(22),
  /**
   * <p>
   * The value of this constant is 23
   * </p>
   */
  wdOverType(23),
  /**
   * <p>
   * The value of this constant is 24
   * </p>
   */
  wdRevisionMarking(24),
  /**
   * <p>
   * The value of this constant is 25
   * </p>
   */
  wdInFootnoteEndnotePane(25),
  /**
   * <p>
   * The value of this constant is 26
   * </p>
   */
  wdInCommentPane(26),
  /**
   * <p>
   * The value of this constant is 28
   * </p>
   */
  wdInHeaderFooter(28),
  /**
   * <p>
   * The value of this constant is 31
   * </p>
   */
  wdAtEndOfRowMarker(31),
  /**
   * <p>
   * The value of this constant is 32
   * </p>
   */
  wdReferenceOfType(32),
  /**
   * <p>
   * The value of this constant is 33
   * </p>
   */
  wdHeaderFooterType(33),
  /**
   * <p>
   * The value of this constant is 34
   * </p>
   */
  wdInMasterDocument(34),
  /**
   * <p>
   * The value of this constant is 35
   * </p>
   */
  wdInFootnote(35),
  /**
   * <p>
   * The value of this constant is 36
   * </p>
   */
  wdInEndnote(36),
  /**
   * <p>
   * The value of this constant is 37
   * </p>
   */
  wdInWordMail(37),
  /**
   * <p>
   * The value of this constant is 38
   * </p>
   */
  wdInClipboard(38),
  ;

  private final int value;
  WdInformation(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
