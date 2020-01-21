package word  ;

import com4j.*;

/**
 */
public enum WdSmartTagControlType implements ComEnum {
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  wdControlSmartTag(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  wdControlLink(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  wdControlHelp(3),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  wdControlHelpURL(4),
  /**
   * <p>
   * The value of this constant is 5
   * </p>
   */
  wdControlSeparator(5),
  /**
   * <p>
   * The value of this constant is 6
   * </p>
   */
  wdControlButton(6),
  /**
   * <p>
   * The value of this constant is 7
   * </p>
   */
  wdControlLabel(7),
  /**
   * <p>
   * The value of this constant is 8
   * </p>
   */
  wdControlImage(8),
  /**
   * <p>
   * The value of this constant is 9
   * </p>
   */
  wdControlCheckbox(9),
  /**
   * <p>
   * The value of this constant is 10
   * </p>
   */
  wdControlTextbox(10),
  /**
   * <p>
   * The value of this constant is 11
   * </p>
   */
  wdControlListbox(11),
  /**
   * <p>
   * The value of this constant is 12
   * </p>
   */
  wdControlCombo(12),
  /**
   * <p>
   * The value of this constant is 13
   * </p>
   */
  wdControlActiveX(13),
  /**
   * <p>
   * The value of this constant is 14
   * </p>
   */
  wdControlDocumentFragment(14),
  /**
   * <p>
   * The value of this constant is 15
   * </p>
   */
  wdControlDocumentFragmentURL(15),
  /**
   * <p>
   * The value of this constant is 16
   * </p>
   */
  wdControlRadioGroup(16),
  ;

  private final int value;
  WdSmartTagControlType(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
