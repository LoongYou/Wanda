package wsh  ;

import com4j.*;

/**
 */
public enum IOMode implements ComEnum {
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  ForReading(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  ForWriting(2),
  /**
   * <p>
   * The value of this constant is 8
   * </p>
   */
  ForAppending(8),
  ;

  private final int value;
  IOMode(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
