package word  ;

import com4j.*;

/**
 */
public enum WdNumberStyleWordBasicBiDi implements ComEnum {
  /**
   * <p>
   * The value of this constant is 49
   * </p>
   */
  wdListNumberStyleBidi1(49),
  /**
   * <p>
   * The value of this constant is 50
   * </p>
   */
  wdListNumberStyleBidi2(50),
  /**
   * <p>
   * The value of this constant is 49
   * </p>
   */
  wdCaptionNumberStyleBidiLetter1(49),
  /**
   * <p>
   * The value of this constant is 50
   * </p>
   */
  wdCaptionNumberStyleBidiLetter2(50),
  /**
   * <p>
   * The value of this constant is 49
   * </p>
   */
  wdNoteNumberStyleBidiLetter1(49),
  /**
   * <p>
   * The value of this constant is 50
   * </p>
   */
  wdNoteNumberStyleBidiLetter2(50),
  /**
   * <p>
   * The value of this constant is 49
   * </p>
   */
  wdPageNumberStyleBidiLetter1(49),
  /**
   * <p>
   * The value of this constant is 50
   * </p>
   */
  wdPageNumberStyleBidiLetter2(50),
  ;

  private final int value;
  WdNumberStyleWordBasicBiDi(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
