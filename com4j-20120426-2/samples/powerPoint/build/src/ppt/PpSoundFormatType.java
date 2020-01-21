package ppt  ;

import com4j.*;

/**
 */
public enum PpSoundFormatType implements ComEnum {
  /**
   * <p>
   * The value of this constant is -2
   * </p>
   */
  ppSoundFormatMixed(-2),
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  ppSoundFormatNone(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  ppSoundFormatWAV(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  ppSoundFormatMIDI(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  ppSoundFormatCDAudio(3),
  ;

  private final int value;
  PpSoundFormatType(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
