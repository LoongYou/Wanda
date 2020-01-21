package ppt  ;

import com4j.*;

/**
 */
public enum PpViewType implements ComEnum {
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  ppViewSlide(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  ppViewSlideMaster(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  ppViewNotesPage(3),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  ppViewHandoutMaster(4),
  /**
   * <p>
   * The value of this constant is 5
   * </p>
   */
  ppViewNotesMaster(5),
  /**
   * <p>
   * The value of this constant is 6
   * </p>
   */
  ppViewOutline(6),
  /**
   * <p>
   * The value of this constant is 7
   * </p>
   */
  ppViewSlideSorter(7),
  /**
   * <p>
   * The value of this constant is 8
   * </p>
   */
  ppViewTitleMaster(8),
  /**
   * <p>
   * The value of this constant is 9
   * </p>
   */
  ppViewNormal(9),
  /**
   * <p>
   * The value of this constant is 10
   * </p>
   */
  ppViewPrintPreview(10),
  /**
   * <p>
   * The value of this constant is 11
   * </p>
   */
  ppViewThumbnails(11),
  /**
   * <p>
   * The value of this constant is 12
   * </p>
   */
  ppViewMasterThumbnails(12),
  ;

  private final int value;
  PpViewType(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
