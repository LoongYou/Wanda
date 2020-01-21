package speech.types  ;

import com4j.*;

/**
 */
public enum DISPID_SpeechFileStream implements ComEnum {
  /**
   * <p>
   * The value of this constant is 100
   * </p>
   */
  DISPID_SFSOpen(100),
  /**
   * <p>
   * The value of this constant is 101
   * </p>
   */
  DISPID_SFSClose(101),
  ;

  private final int value;
  DISPID_SpeechFileStream(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
