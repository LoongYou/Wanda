package word  ;

import com4j.*;

/**
 */
public enum WdCompatibility implements ComEnum {
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  wdNoTabHangIndent(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  wdNoSpaceRaiseLower(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  wdPrintColBlack(3),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  wdWrapTrailSpaces(4),
  /**
   * <p>
   * The value of this constant is 5
   * </p>
   */
  wdNoColumnBalance(5),
  /**
   * <p>
   * The value of this constant is 6
   * </p>
   */
  wdConvMailMergeEsc(6),
  /**
   * <p>
   * The value of this constant is 7
   * </p>
   */
  wdSuppressSpBfAfterPgBrk(7),
  /**
   * <p>
   * The value of this constant is 8
   * </p>
   */
  wdSuppressTopSpacing(8),
  /**
   * <p>
   * The value of this constant is 9
   * </p>
   */
  wdOrigWordTableRules(9),
  /**
   * <p>
   * The value of this constant is 10
   * </p>
   */
  wdTransparentMetafiles(10),
  /**
   * <p>
   * The value of this constant is 11
   * </p>
   */
  wdShowBreaksInFrames(11),
  /**
   * <p>
   * The value of this constant is 12
   * </p>
   */
  wdSwapBordersFacingPages(12),
  /**
   * <p>
   * The value of this constant is 13
   * </p>
   */
  wdLeaveBackslashAlone(13),
  /**
   * <p>
   * The value of this constant is 14
   * </p>
   */
  wdExpandShiftReturn(14),
  /**
   * <p>
   * The value of this constant is 15
   * </p>
   */
  wdDontULTrailSpace(15),
  /**
   * <p>
   * The value of this constant is 16
   * </p>
   */
  wdDontBalanceSingleByteDoubleByteWidth(16),
  /**
   * <p>
   * The value of this constant is 17
   * </p>
   */
  wdSuppressTopSpacingMac5(17),
  /**
   * <p>
   * The value of this constant is 18
   * </p>
   */
  wdSpacingInWholePoints(18),
  /**
   * <p>
   * The value of this constant is 19
   * </p>
   */
  wdPrintBodyTextBeforeHeader(19),
  /**
   * <p>
   * The value of this constant is 20
   * </p>
   */
  wdNoLeading(20),
  /**
   * <p>
   * The value of this constant is 21
   * </p>
   */
  wdNoSpaceForUL(21),
  /**
   * <p>
   * The value of this constant is 22
   * </p>
   */
  wdMWSmallCaps(22),
  /**
   * <p>
   * The value of this constant is 23
   * </p>
   */
  wdNoExtraLineSpacing(23),
  /**
   * <p>
   * The value of this constant is 24
   * </p>
   */
  wdTruncateFontHeight(24),
  /**
   * <p>
   * The value of this constant is 25
   * </p>
   */
  wdSubFontBySize(25),
  /**
   * <p>
   * The value of this constant is 26
   * </p>
   */
  wdUsePrinterMetrics(26),
  /**
   * <p>
   * The value of this constant is 27
   * </p>
   */
  wdWW6BorderRules(27),
  /**
   * <p>
   * The value of this constant is 28
   * </p>
   */
  wdExactOnTop(28),
  /**
   * <p>
   * The value of this constant is 29
   * </p>
   */
  wdSuppressBottomSpacing(29),
  /**
   * <p>
   * The value of this constant is 30
   * </p>
   */
  wdWPSpaceWidth(30),
  /**
   * <p>
   * The value of this constant is 31
   * </p>
   */
  wdWPJustification(31),
  /**
   * <p>
   * The value of this constant is 32
   * </p>
   */
  wdLineWrapLikeWord6(32),
  /**
   * <p>
   * The value of this constant is 33
   * </p>
   */
  wdShapeLayoutLikeWW8(33),
  /**
   * <p>
   * The value of this constant is 34
   * </p>
   */
  wdFootnoteLayoutLikeWW8(34),
  /**
   * <p>
   * The value of this constant is 35
   * </p>
   */
  wdDontUseHTMLParagraphAutoSpacing(35),
  /**
   * <p>
   * The value of this constant is 36
   * </p>
   */
  wdDontAdjustLineHeightInTable(36),
  /**
   * <p>
   * The value of this constant is 37
   * </p>
   */
  wdForgetLastTabAlignment(37),
  /**
   * <p>
   * The value of this constant is 38
   * </p>
   */
  wdAutospaceLikeWW7(38),
  /**
   * <p>
   * The value of this constant is 39
   * </p>
   */
  wdAlignTablesRowByRow(39),
  /**
   * <p>
   * The value of this constant is 40
   * </p>
   */
  wdLayoutRawTableWidth(40),
  /**
   * <p>
   * The value of this constant is 41
   * </p>
   */
  wdLayoutTableRowsApart(41),
  /**
   * <p>
   * The value of this constant is 42
   * </p>
   */
  wdUseWord97LineBreakingRules(42),
  /**
   * <p>
   * The value of this constant is 43
   * </p>
   */
  wdDontBreakWrappedTables(43),
  /**
   * <p>
   * The value of this constant is 44
   * </p>
   */
  wdDontSnapTextToGridInTableWithObjects(44),
  /**
   * <p>
   * The value of this constant is 45
   * </p>
   */
  wdSelectFieldWithFirstOrLastCharacter(45),
  /**
   * <p>
   * The value of this constant is 46
   * </p>
   */
  wdApplyBreakingRules(46),
  /**
   * <p>
   * The value of this constant is 47
   * </p>
   */
  wdDontWrapTextWithPunctuation(47),
  /**
   * <p>
   * The value of this constant is 48
   * </p>
   */
  wdDontUseAsianBreakRulesInGrid(48),
  /**
   * <p>
   * The value of this constant is 49
   * </p>
   */
  wdUseWord2002TableStyleRules(49),
  /**
   * <p>
   * The value of this constant is 50
   * </p>
   */
  wdGrowAutofit(50),
  /**
   * <p>
   * The value of this constant is 51
   * </p>
   */
  wdUseNormalStyleForList(51),
  /**
   * <p>
   * The value of this constant is 52
   * </p>
   */
  wdDontUseIndentAsNumberingTabStop(52),
  /**
   * <p>
   * The value of this constant is 53
   * </p>
   */
  wdFELineBreak11(53),
  /**
   * <p>
   * The value of this constant is 54
   * </p>
   */
  wdAllowSpaceOfSameStyleInTable(54),
  /**
   * <p>
   * The value of this constant is 55
   * </p>
   */
  wdWW11IndentRules(55),
  /**
   * <p>
   * The value of this constant is 56
   * </p>
   */
  wdDontAutofitConstrainedTables(56),
  /**
   * <p>
   * The value of this constant is 57
   * </p>
   */
  wdAutofitLikeWW11(57),
  /**
   * <p>
   * The value of this constant is 58
   * </p>
   */
  wdUnderlineTabInNumList(58),
  /**
   * <p>
   * The value of this constant is 59
   * </p>
   */
  wdHangulWidthLikeWW11(59),
  /**
   * <p>
   * The value of this constant is 60
   * </p>
   */
  wdSplitPgBreakAndParaMark(60),
  /**
   * <p>
   * The value of this constant is 61
   * </p>
   */
  wdDontVertAlignCellWithShape(61),
  /**
   * <p>
   * The value of this constant is 62
   * </p>
   */
  wdDontBreakConstrainedForcedTables(62),
  /**
   * <p>
   * The value of this constant is 63
   * </p>
   */
  wdDontVertAlignInTextbox(63),
  /**
   * <p>
   * The value of this constant is 64
   * </p>
   */
  wdWord11KerningPairs(64),
  /**
   * <p>
   * The value of this constant is 65
   * </p>
   */
  wdCachedColBalance(65),
  /**
   * <p>
   * The value of this constant is 66
   * </p>
   */
  wdDisableOTKerning(66),
  /**
   * <p>
   * The value of this constant is 67
   * </p>
   */
  wdFlipMirrorIndents(67),
  /**
   * <p>
   * The value of this constant is 68
   * </p>
   */
  wdDontOverrideTableStyleFontSzAndJustification(68),
  ;

  private final int value;
  WdCompatibility(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
