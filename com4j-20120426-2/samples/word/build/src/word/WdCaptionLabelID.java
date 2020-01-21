package word  ;

import com4j.*;

/**
 */
public enum WdCaptionLabelID implements ComEnum {
  /**
   * <p>
   * The value of this constant is -1
   * </p>
   */
  wdCaptionFigure(-1),
  /**
   * <p>
   * The value of this constant is -2
   * </p>
   */
  wdCaptionTable(-2),
  /**
   * <p>
   * The value of this constant is -3
   * </p>
   */
  wdCaptionEquation(-3),
  ;

  private final int value;
  WdCaptionLabelID(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
