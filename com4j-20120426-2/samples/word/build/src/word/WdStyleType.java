package word  ;

import com4j.*;

/**
 */
public enum WdStyleType implements ComEnum {
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  wdStyleTypeParagraph(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  wdStyleTypeCharacter(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  wdStyleTypeTable(3),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  wdStyleTypeList(4),
  /**
   * <p>
   * The value of this constant is 5
   * </p>
   */
  wdStyleTypeParagraphOnly(5),
  /**
   * <p>
   * The value of this constant is 6
   * </p>
   */
  wdStyleTypeLinked(6),
  ;

  private final int value;
  WdStyleType(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
