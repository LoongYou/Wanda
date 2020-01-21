package word  ;

import com4j.*;

/**
 */
public enum WdPaperTray implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  wdPrinterDefaultBin(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  wdPrinterUpperBin(1),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  wdPrinterOnlyBin(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  wdPrinterLowerBin(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  wdPrinterMiddleBin(3),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  wdPrinterManualFeed(4),
  /**
   * <p>
   * The value of this constant is 5
   * </p>
   */
  wdPrinterEnvelopeFeed(5),
  /**
   * <p>
   * The value of this constant is 6
   * </p>
   */
  wdPrinterManualEnvelopeFeed(6),
  /**
   * <p>
   * The value of this constant is 7
   * </p>
   */
  wdPrinterAutomaticSheetFeed(7),
  /**
   * <p>
   * The value of this constant is 8
   * </p>
   */
  wdPrinterTractorFeed(8),
  /**
   * <p>
   * The value of this constant is 9
   * </p>
   */
  wdPrinterSmallFormatBin(9),
  /**
   * <p>
   * The value of this constant is 10
   * </p>
   */
  wdPrinterLargeFormatBin(10),
  /**
   * <p>
   * The value of this constant is 11
   * </p>
   */
  wdPrinterLargeCapacityBin(11),
  /**
   * <p>
   * The value of this constant is 14
   * </p>
   */
  wdPrinterPaperCassette(14),
  /**
   * <p>
   * The value of this constant is 15
   * </p>
   */
  wdPrinterFormSource(15),
  ;

  private final int value;
  WdPaperTray(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
