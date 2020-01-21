package word  ;

import com4j.*;

/**
 */
public enum WdFieldType implements ComEnum {
  /**
   * <p>
   * The value of this constant is -1
   * </p>
   */
  wdFieldEmpty(-1),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  wdFieldRef(3),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  wdFieldIndexEntry(4),
  /**
   * <p>
   * The value of this constant is 5
   * </p>
   */
  wdFieldFootnoteRef(5),
  /**
   * <p>
   * The value of this constant is 6
   * </p>
   */
  wdFieldSet(6),
  /**
   * <p>
   * The value of this constant is 7
   * </p>
   */
  wdFieldIf(7),
  /**
   * <p>
   * The value of this constant is 8
   * </p>
   */
  wdFieldIndex(8),
  /**
   * <p>
   * The value of this constant is 9
   * </p>
   */
  wdFieldTOCEntry(9),
  /**
   * <p>
   * The value of this constant is 10
   * </p>
   */
  wdFieldStyleRef(10),
  /**
   * <p>
   * The value of this constant is 11
   * </p>
   */
  wdFieldRefDoc(11),
  /**
   * <p>
   * The value of this constant is 12
   * </p>
   */
  wdFieldSequence(12),
  /**
   * <p>
   * The value of this constant is 13
   * </p>
   */
  wdFieldTOC(13),
  /**
   * <p>
   * The value of this constant is 14
   * </p>
   */
  wdFieldInfo(14),
  /**
   * <p>
   * The value of this constant is 15
   * </p>
   */
  wdFieldTitle(15),
  /**
   * <p>
   * The value of this constant is 16
   * </p>
   */
  wdFieldSubject(16),
  /**
   * <p>
   * The value of this constant is 17
   * </p>
   */
  wdFieldAuthor(17),
  /**
   * <p>
   * The value of this constant is 18
   * </p>
   */
  wdFieldKeyWord(18),
  /**
   * <p>
   * The value of this constant is 19
   * </p>
   */
  wdFieldComments(19),
  /**
   * <p>
   * The value of this constant is 20
   * </p>
   */
  wdFieldLastSavedBy(20),
  /**
   * <p>
   * The value of this constant is 21
   * </p>
   */
  wdFieldCreateDate(21),
  /**
   * <p>
   * The value of this constant is 22
   * </p>
   */
  wdFieldSaveDate(22),
  /**
   * <p>
   * The value of this constant is 23
   * </p>
   */
  wdFieldPrintDate(23),
  /**
   * <p>
   * The value of this constant is 24
   * </p>
   */
  wdFieldRevisionNum(24),
  /**
   * <p>
   * The value of this constant is 25
   * </p>
   */
  wdFieldEditTime(25),
  /**
   * <p>
   * The value of this constant is 26
   * </p>
   */
  wdFieldNumPages(26),
  /**
   * <p>
   * The value of this constant is 27
   * </p>
   */
  wdFieldNumWords(27),
  /**
   * <p>
   * The value of this constant is 28
   * </p>
   */
  wdFieldNumChars(28),
  /**
   * <p>
   * The value of this constant is 29
   * </p>
   */
  wdFieldFileName(29),
  /**
   * <p>
   * The value of this constant is 30
   * </p>
   */
  wdFieldTemplate(30),
  /**
   * <p>
   * The value of this constant is 31
   * </p>
   */
  wdFieldDate(31),
  /**
   * <p>
   * The value of this constant is 32
   * </p>
   */
  wdFieldTime(32),
  /**
   * <p>
   * The value of this constant is 33
   * </p>
   */
  wdFieldPage(33),
  /**
   * <p>
   * The value of this constant is 34
   * </p>
   */
  wdFieldExpression(34),
  /**
   * <p>
   * The value of this constant is 35
   * </p>
   */
  wdFieldQuote(35),
  /**
   * <p>
   * The value of this constant is 36
   * </p>
   */
  wdFieldInclude(36),
  /**
   * <p>
   * The value of this constant is 37
   * </p>
   */
  wdFieldPageRef(37),
  /**
   * <p>
   * The value of this constant is 38
   * </p>
   */
  wdFieldAsk(38),
  /**
   * <p>
   * The value of this constant is 39
   * </p>
   */
  wdFieldFillIn(39),
  /**
   * <p>
   * The value of this constant is 40
   * </p>
   */
  wdFieldData(40),
  /**
   * <p>
   * The value of this constant is 41
   * </p>
   */
  wdFieldNext(41),
  /**
   * <p>
   * The value of this constant is 42
   * </p>
   */
  wdFieldNextIf(42),
  /**
   * <p>
   * The value of this constant is 43
   * </p>
   */
  wdFieldSkipIf(43),
  /**
   * <p>
   * The value of this constant is 44
   * </p>
   */
  wdFieldMergeRec(44),
  /**
   * <p>
   * The value of this constant is 45
   * </p>
   */
  wdFieldDDE(45),
  /**
   * <p>
   * The value of this constant is 46
   * </p>
   */
  wdFieldDDEAuto(46),
  /**
   * <p>
   * The value of this constant is 47
   * </p>
   */
  wdFieldGlossary(47),
  /**
   * <p>
   * The value of this constant is 48
   * </p>
   */
  wdFieldPrint(48),
  /**
   * <p>
   * The value of this constant is 49
   * </p>
   */
  wdFieldFormula(49),
  /**
   * <p>
   * The value of this constant is 50
   * </p>
   */
  wdFieldGoToButton(50),
  /**
   * <p>
   * The value of this constant is 51
   * </p>
   */
  wdFieldMacroButton(51),
  /**
   * <p>
   * The value of this constant is 52
   * </p>
   */
  wdFieldAutoNumOutline(52),
  /**
   * <p>
   * The value of this constant is 53
   * </p>
   */
  wdFieldAutoNumLegal(53),
  /**
   * <p>
   * The value of this constant is 54
   * </p>
   */
  wdFieldAutoNum(54),
  /**
   * <p>
   * The value of this constant is 55
   * </p>
   */
  wdFieldImport(55),
  /**
   * <p>
   * The value of this constant is 56
   * </p>
   */
  wdFieldLink(56),
  /**
   * <p>
   * The value of this constant is 57
   * </p>
   */
  wdFieldSymbol(57),
  /**
   * <p>
   * The value of this constant is 58
   * </p>
   */
  wdFieldEmbed(58),
  /**
   * <p>
   * The value of this constant is 59
   * </p>
   */
  wdFieldMergeField(59),
  /**
   * <p>
   * The value of this constant is 60
   * </p>
   */
  wdFieldUserName(60),
  /**
   * <p>
   * The value of this constant is 61
   * </p>
   */
  wdFieldUserInitials(61),
  /**
   * <p>
   * The value of this constant is 62
   * </p>
   */
  wdFieldUserAddress(62),
  /**
   * <p>
   * The value of this constant is 63
   * </p>
   */
  wdFieldBarCode(63),
  /**
   * <p>
   * The value of this constant is 64
   * </p>
   */
  wdFieldDocVariable(64),
  /**
   * <p>
   * The value of this constant is 65
   * </p>
   */
  wdFieldSection(65),
  /**
   * <p>
   * The value of this constant is 66
   * </p>
   */
  wdFieldSectionPages(66),
  /**
   * <p>
   * The value of this constant is 67
   * </p>
   */
  wdFieldIncludePicture(67),
  /**
   * <p>
   * The value of this constant is 68
   * </p>
   */
  wdFieldIncludeText(68),
  /**
   * <p>
   * The value of this constant is 69
   * </p>
   */
  wdFieldFileSize(69),
  /**
   * <p>
   * The value of this constant is 70
   * </p>
   */
  wdFieldFormTextInput(70),
  /**
   * <p>
   * The value of this constant is 71
   * </p>
   */
  wdFieldFormCheckBox(71),
  /**
   * <p>
   * The value of this constant is 72
   * </p>
   */
  wdFieldNoteRef(72),
  /**
   * <p>
   * The value of this constant is 73
   * </p>
   */
  wdFieldTOA(73),
  /**
   * <p>
   * The value of this constant is 74
   * </p>
   */
  wdFieldTOAEntry(74),
  /**
   * <p>
   * The value of this constant is 75
   * </p>
   */
  wdFieldMergeSeq(75),
  /**
   * <p>
   * The value of this constant is 77
   * </p>
   */
  wdFieldPrivate(77),
  /**
   * <p>
   * The value of this constant is 78
   * </p>
   */
  wdFieldDatabase(78),
  /**
   * <p>
   * The value of this constant is 79
   * </p>
   */
  wdFieldAutoText(79),
  /**
   * <p>
   * The value of this constant is 80
   * </p>
   */
  wdFieldCompare(80),
  /**
   * <p>
   * The value of this constant is 81
   * </p>
   */
  wdFieldAddin(81),
  /**
   * <p>
   * The value of this constant is 82
   * </p>
   */
  wdFieldSubscriber(82),
  /**
   * <p>
   * The value of this constant is 83
   * </p>
   */
  wdFieldFormDropDown(83),
  /**
   * <p>
   * The value of this constant is 84
   * </p>
   */
  wdFieldAdvance(84),
  /**
   * <p>
   * The value of this constant is 85
   * </p>
   */
  wdFieldDocProperty(85),
  /**
   * <p>
   * The value of this constant is 87
   * </p>
   */
  wdFieldOCX(87),
  /**
   * <p>
   * The value of this constant is 88
   * </p>
   */
  wdFieldHyperlink(88),
  /**
   * <p>
   * The value of this constant is 89
   * </p>
   */
  wdFieldAutoTextList(89),
  /**
   * <p>
   * The value of this constant is 90
   * </p>
   */
  wdFieldListNum(90),
  /**
   * <p>
   * The value of this constant is 91
   * </p>
   */
  wdFieldHTMLActiveX(91),
  /**
   * <p>
   * The value of this constant is 92
   * </p>
   */
  wdFieldBidiOutline(92),
  /**
   * <p>
   * The value of this constant is 93
   * </p>
   */
  wdFieldAddressBlock(93),
  /**
   * <p>
   * The value of this constant is 94
   * </p>
   */
  wdFieldGreetingLine(94),
  /**
   * <p>
   * The value of this constant is 95
   * </p>
   */
  wdFieldShape(95),
  /**
   * <p>
   * The value of this constant is 96
   * </p>
   */
  wdFieldCitation(96),
  /**
   * <p>
   * The value of this constant is 97
   * </p>
   */
  wdFieldBibliography(97),
  ;

  private final int value;
  WdFieldType(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
