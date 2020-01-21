package word  ;

import com4j.*;

/**
 */
public enum WdMailMergeState {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  wdNormalDocument, // 0
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  wdMainDocumentOnly, // 1
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  wdMainAndDataSource, // 2
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  wdMainAndHeader, // 3
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  wdMainAndSourceAndHeader, // 4
  /**
   * <p>
   * The value of this constant is 5
   * </p>
   */
  wdDataSource, // 5
}
