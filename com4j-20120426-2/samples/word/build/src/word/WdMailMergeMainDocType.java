package word  ;

import com4j.*;

/**
 */
public enum WdMailMergeMainDocType implements ComEnum {
  /**
   * <p>
   * The value of this constant is -1
   * </p>
   */
  wdNotAMergeDocument(-1),
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  wdFormLetters(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  wdMailingLabels(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  wdEnvelopes(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  wdCatalog(3),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  wdEMail(4),
  /**
   * <p>
   * The value of this constant is 5
   * </p>
   */
  wdFax(5),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  wdDirectory(3),
  ;

  private final int value;
  WdMailMergeMainDocType(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
