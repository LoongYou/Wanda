package visiotool  ;

import com4j.*;

/**
 */
public enum VisDataRecordsetAddOptions implements ComEnum {
  /**
   * <p>
   * Add data recordset to be hidden from data explorer.
   * </p>
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visDataRecordsetNoExternalDataUI(1),
  /**
   * <p>
   * Add data recordset to be hidden from refresh.
   * </p>
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visDataRecordsetNoRefreshUI(2),
  /**
   * <p>
   * Add data recordset to be hidden from the advanced refresh configuration dialog.
   * </p>
   * <p>
   * The value of this constant is 4
   * </p>
   */
  visDataRecordsetNoAdvConfig(4),
  /**
   * <p>
   * Add data recordset with delayed query.
   * </p>
   * <p>
   * The value of this constant is 8
   * </p>
   */
  visDataRecordsetDelayQuery(8),
  /**
   * <p>
   * Add data recordset which will not be included in cut or copy of linked shapes.
   * </p>
   * <p>
   * The value of this constant is 16
   * </p>
   */
  visDataRecordsetDontCopyLinks(16),
  ;

  private final int value;
  VisDataRecordsetAddOptions(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
