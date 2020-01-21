package word  ;

import com4j.*;

/**
 */
public enum WdStylisticSet implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  wdStylisticSetDefault(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  wdStylisticSet01(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  wdStylisticSet02(2),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  wdStylisticSet03(4),
  /**
   * <p>
   * The value of this constant is 8
   * </p>
   */
  wdStylisticSet04(8),
  /**
   * <p>
   * The value of this constant is 16
   * </p>
   */
  wdStylisticSet05(16),
  /**
   * <p>
   * The value of this constant is 32
   * </p>
   */
  wdStylisticSet06(32),
  /**
   * <p>
   * The value of this constant is 64
   * </p>
   */
  wdStylisticSet07(64),
  /**
   * <p>
   * The value of this constant is 128
   * </p>
   */
  wdStylisticSet08(128),
  /**
   * <p>
   * The value of this constant is 256
   * </p>
   */
  wdStylisticSet09(256),
  /**
   * <p>
   * The value of this constant is 512
   * </p>
   */
  wdStylisticSet10(512),
  /**
   * <p>
   * The value of this constant is 1024
   * </p>
   */
  wdStylisticSet11(1024),
  /**
   * <p>
   * The value of this constant is 2048
   * </p>
   */
  wdStylisticSet12(2048),
  /**
   * <p>
   * The value of this constant is 4096
   * </p>
   */
  wdStylisticSet13(4096),
  /**
   * <p>
   * The value of this constant is 8192
   * </p>
   */
  wdStylisticSet14(8192),
  /**
   * <p>
   * The value of this constant is 16384
   * </p>
   */
  wdStylisticSet15(16384),
  /**
   * <p>
   * The value of this constant is 32768
   * </p>
   */
  wdStylisticSet16(32768),
  /**
   * <p>
   * The value of this constant is 65536
   * </p>
   */
  wdStylisticSet17(65536),
  /**
   * <p>
   * The value of this constant is 131072
   * </p>
   */
  wdStylisticSet18(131072),
  /**
   * <p>
   * The value of this constant is 262144
   * </p>
   */
  wdStylisticSet19(262144),
  /**
   * <p>
   * The value of this constant is 524288
   * </p>
   */
  wdStylisticSet20(524288),
  ;

  private final int value;
  WdStylisticSet(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
