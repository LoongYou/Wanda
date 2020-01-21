package word  ;

import com4j.*;

/**
 */
public enum WdMappedDataFields implements ComEnum {
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  wdUniqueIdentifier(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  wdCourtesyTitle(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  wdFirstName(3),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  wdMiddleName(4),
  /**
   * <p>
   * The value of this constant is 5
   * </p>
   */
  wdLastName(5),
  /**
   * <p>
   * The value of this constant is 6
   * </p>
   */
  wdSuffix(6),
  /**
   * <p>
   * The value of this constant is 7
   * </p>
   */
  wdNickname(7),
  /**
   * <p>
   * The value of this constant is 8
   * </p>
   */
  wdJobTitle(8),
  /**
   * <p>
   * The value of this constant is 9
   * </p>
   */
  wdCompany(9),
  /**
   * <p>
   * The value of this constant is 10
   * </p>
   */
  wdAddress1(10),
  /**
   * <p>
   * The value of this constant is 11
   * </p>
   */
  wdAddress2(11),
  /**
   * <p>
   * The value of this constant is 12
   * </p>
   */
  wdCity(12),
  /**
   * <p>
   * The value of this constant is 13
   * </p>
   */
  wdState(13),
  /**
   * <p>
   * The value of this constant is 14
   * </p>
   */
  wdPostalCode(14),
  /**
   * <p>
   * The value of this constant is 15
   * </p>
   */
  wdCountryRegion(15),
  /**
   * <p>
   * The value of this constant is 16
   * </p>
   */
  wdBusinessPhone(16),
  /**
   * <p>
   * The value of this constant is 17
   * </p>
   */
  wdBusinessFax(17),
  /**
   * <p>
   * The value of this constant is 18
   * </p>
   */
  wdHomePhone(18),
  /**
   * <p>
   * The value of this constant is 19
   * </p>
   */
  wdHomeFax(19),
  /**
   * <p>
   * The value of this constant is 20
   * </p>
   */
  wdEmailAddress(20),
  /**
   * <p>
   * The value of this constant is 21
   * </p>
   */
  wdWebPageURL(21),
  /**
   * <p>
   * The value of this constant is 22
   * </p>
   */
  wdSpouseCourtesyTitle(22),
  /**
   * <p>
   * The value of this constant is 23
   * </p>
   */
  wdSpouseFirstName(23),
  /**
   * <p>
   * The value of this constant is 24
   * </p>
   */
  wdSpouseMiddleName(24),
  /**
   * <p>
   * The value of this constant is 25
   * </p>
   */
  wdSpouseLastName(25),
  /**
   * <p>
   * The value of this constant is 26
   * </p>
   */
  wdSpouseNickname(26),
  /**
   * <p>
   * The value of this constant is 27
   * </p>
   */
  wdRubyFirstName(27),
  /**
   * <p>
   * The value of this constant is 28
   * </p>
   */
  wdRubyLastName(28),
  /**
   * <p>
   * The value of this constant is 29
   * </p>
   */
  wdAddress3(29),
  /**
   * <p>
   * The value of this constant is 30
   * </p>
   */
  wdDepartment(30),
  ;

  private final int value;
  WdMappedDataFields(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
