package ppt  ;

import com4j.*;

/**
 */
public enum PpRemoveDocInfoType implements ComEnum {
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  ppRDIComments(1),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  ppRDIRemovePersonalInformation(4),
  /**
   * <p>
   * The value of this constant is 8
   * </p>
   */
  ppRDIDocumentProperties(8),
  /**
   * <p>
   * The value of this constant is 10
   * </p>
   */
  ppRDIDocumentWorkspace(10),
  /**
   * <p>
   * The value of this constant is 11
   * </p>
   */
  ppRDIInkAnnotations(11),
  /**
   * <p>
   * The value of this constant is 13
   * </p>
   */
  ppRDIPublishPath(13),
  /**
   * <p>
   * The value of this constant is 14
   * </p>
   */
  ppRDIDocumentServerProperties(14),
  /**
   * <p>
   * The value of this constant is 15
   * </p>
   */
  ppRDIDocumentManagementPolicy(15),
  /**
   * <p>
   * The value of this constant is 16
   * </p>
   */
  ppRDIContentType(16),
  /**
   * <p>
   * The value of this constant is 17
   * </p>
   */
  ppRDISlideUpdateInformation(17),
  /**
   * <p>
   * The value of this constant is 99
   * </p>
   */
  ppRDIAll(99),
  ;

  private final int value;
  PpRemoveDocInfoType(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
