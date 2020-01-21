package word  ;

import com4j.*;

/**
 */
public enum WdRemoveDocInfoType implements ComEnum {
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  wdRDIComments(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  wdRDIRevisions(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  wdRDIVersions(3),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  wdRDIRemovePersonalInformation(4),
  /**
   * <p>
   * The value of this constant is 5
   * </p>
   */
  wdRDIEmailHeader(5),
  /**
   * <p>
   * The value of this constant is 6
   * </p>
   */
  wdRDIRoutingSlip(6),
  /**
   * <p>
   * The value of this constant is 7
   * </p>
   */
  wdRDISendForReview(7),
  /**
   * <p>
   * The value of this constant is 8
   * </p>
   */
  wdRDIDocumentProperties(8),
  /**
   * <p>
   * The value of this constant is 9
   * </p>
   */
  wdRDITemplate(9),
  /**
   * <p>
   * The value of this constant is 10
   * </p>
   */
  wdRDIDocumentWorkspace(10),
  /**
   * <p>
   * The value of this constant is 11
   * </p>
   */
  wdRDIInkAnnotations(11),
  /**
   * <p>
   * The value of this constant is 14
   * </p>
   */
  wdRDIDocumentServerProperties(14),
  /**
   * <p>
   * The value of this constant is 15
   * </p>
   */
  wdRDIDocumentManagementPolicy(15),
  /**
   * <p>
   * The value of this constant is 16
   * </p>
   */
  wdRDIContentType(16),
  /**
   * <p>
   * The value of this constant is 99
   * </p>
   */
  wdRDIAll(99),
  ;

  private final int value;
  WdRemoveDocInfoType(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
