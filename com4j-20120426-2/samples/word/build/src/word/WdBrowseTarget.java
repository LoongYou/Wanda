package word  ;

import com4j.*;

/**
 */
public enum WdBrowseTarget implements ComEnum {
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  wdBrowsePage(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  wdBrowseSection(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  wdBrowseComment(3),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  wdBrowseFootnote(4),
  /**
   * <p>
   * The value of this constant is 5
   * </p>
   */
  wdBrowseEndnote(5),
  /**
   * <p>
   * The value of this constant is 6
   * </p>
   */
  wdBrowseField(6),
  /**
   * <p>
   * The value of this constant is 7
   * </p>
   */
  wdBrowseTable(7),
  /**
   * <p>
   * The value of this constant is 8
   * </p>
   */
  wdBrowseGraphic(8),
  /**
   * <p>
   * The value of this constant is 9
   * </p>
   */
  wdBrowseHeading(9),
  /**
   * <p>
   * The value of this constant is 10
   * </p>
   */
  wdBrowseEdit(10),
  /**
   * <p>
   * The value of this constant is 11
   * </p>
   */
  wdBrowseFind(11),
  /**
   * <p>
   * The value of this constant is 12
   * </p>
   */
  wdBrowseGoTo(12),
  ;

  private final int value;
  WdBrowseTarget(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
