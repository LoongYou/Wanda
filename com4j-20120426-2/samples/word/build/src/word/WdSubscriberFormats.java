package word  ;

import com4j.*;

/**
 */
public enum WdSubscriberFormats implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  wdSubscriberBestFormat(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  wdSubscriberRTF(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  wdSubscriberText(2),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  wdSubscriberPict(4),
  ;

  private final int value;
  WdSubscriberFormats(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
