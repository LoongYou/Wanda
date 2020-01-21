package word  ;

import com4j.*;

/**
 */
public enum WdWordDialogTab implements ComEnum {
  /**
   * <p>
   * The value of this constant is 204
   * </p>
   */
  wdDialogToolsOptionsTabView(204),
  /**
   * <p>
   * The value of this constant is 203
   * </p>
   */
  wdDialogToolsOptionsTabGeneral(203),
  /**
   * <p>
   * The value of this constant is 224
   * </p>
   */
  wdDialogToolsOptionsTabEdit(224),
  /**
   * <p>
   * The value of this constant is 208
   * </p>
   */
  wdDialogToolsOptionsTabPrint(208),
  /**
   * <p>
   * The value of this constant is 209
   * </p>
   */
  wdDialogToolsOptionsTabSave(209),
  /**
   * <p>
   * The value of this constant is 211
   * </p>
   */
  wdDialogToolsOptionsTabProofread(211),
  /**
   * <p>
   * The value of this constant is 386
   * </p>
   */
  wdDialogToolsOptionsTabTrackChanges(386),
  /**
   * <p>
   * The value of this constant is 213
   * </p>
   */
  wdDialogToolsOptionsTabUserInfo(213),
  /**
   * <p>
   * The value of this constant is 525
   * </p>
   */
  wdDialogToolsOptionsTabCompatibility(525),
  /**
   * <p>
   * The value of this constant is 739
   * </p>
   */
  wdDialogToolsOptionsTabTypography(739),
  /**
   * <p>
   * The value of this constant is 225
   * </p>
   */
  wdDialogToolsOptionsTabFileLocations(225),
  /**
   * <p>
   * The value of this constant is 790
   * </p>
   */
  wdDialogToolsOptionsTabFuzzy(790),
  /**
   * <p>
   * The value of this constant is 786
   * </p>
   */
  wdDialogToolsOptionsTabHangulHanjaConversion(786),
  /**
   * <p>
   * The value of this constant is 1029
   * </p>
   */
  wdDialogToolsOptionsTabBidi(1029),
  /**
   * <p>
   * The value of this constant is 1361
   * </p>
   */
  wdDialogToolsOptionsTabSecurity(1361),
  /**
   * <p>
   * The value of this constant is 150000
   * </p>
   */
  wdDialogFilePageSetupTabMargins(150000),
  /**
   * <p>
   * The value of this constant is 150001
   * </p>
   */
  wdDialogFilePageSetupTabPaper(150001),
  /**
   * <p>
   * The value of this constant is 150003
   * </p>
   */
  wdDialogFilePageSetupTabLayout(150003),
  /**
   * <p>
   * The value of this constant is 150004
   * </p>
   */
  wdDialogFilePageSetupTabCharsLines(150004),
  /**
   * <p>
   * The value of this constant is 200000
   * </p>
   */
  wdDialogInsertSymbolTabSymbols(200000),
  /**
   * <p>
   * The value of this constant is 200001
   * </p>
   */
  wdDialogInsertSymbolTabSpecialCharacters(200001),
  /**
   * <p>
   * The value of this constant is 300000
   * </p>
   */
  wdDialogNoteOptionsTabAllFootnotes(300000),
  /**
   * <p>
   * The value of this constant is 300001
   * </p>
   */
  wdDialogNoteOptionsTabAllEndnotes(300001),
  /**
   * <p>
   * The value of this constant is 400000
   * </p>
   */
  wdDialogInsertIndexAndTablesTabIndex(400000),
  /**
   * <p>
   * The value of this constant is 400001
   * </p>
   */
  wdDialogInsertIndexAndTablesTabTableOfContents(400001),
  /**
   * <p>
   * The value of this constant is 400002
   * </p>
   */
  wdDialogInsertIndexAndTablesTabTableOfFigures(400002),
  /**
   * <p>
   * The value of this constant is 400003
   * </p>
   */
  wdDialogInsertIndexAndTablesTabTableOfAuthorities(400003),
  /**
   * <p>
   * The value of this constant is 500000
   * </p>
   */
  wdDialogOrganizerTabStyles(500000),
  /**
   * <p>
   * The value of this constant is 500001
   * </p>
   */
  wdDialogOrganizerTabAutoText(500001),
  /**
   * <p>
   * The value of this constant is 500002
   * </p>
   */
  wdDialogOrganizerTabCommandBars(500002),
  /**
   * <p>
   * The value of this constant is 500003
   * </p>
   */
  wdDialogOrganizerTabMacros(500003),
  /**
   * <p>
   * The value of this constant is 600000
   * </p>
   */
  wdDialogFormatFontTabFont(600000),
  /**
   * <p>
   * The value of this constant is 600001
   * </p>
   */
  wdDialogFormatFontTabCharacterSpacing(600001),
  /**
   * <p>
   * The value of this constant is 600002
   * </p>
   */
  wdDialogFormatFontTabAnimation(600002),
  /**
   * <p>
   * The value of this constant is 700000
   * </p>
   */
  wdDialogFormatBordersAndShadingTabBorders(700000),
  /**
   * <p>
   * The value of this constant is 700001
   * </p>
   */
  wdDialogFormatBordersAndShadingTabPageBorder(700001),
  /**
   * <p>
   * The value of this constant is 700002
   * </p>
   */
  wdDialogFormatBordersAndShadingTabShading(700002),
  /**
   * <p>
   * The value of this constant is 800000
   * </p>
   */
  wdDialogToolsEnvelopesAndLabelsTabEnvelopes(800000),
  /**
   * <p>
   * The value of this constant is 800001
   * </p>
   */
  wdDialogToolsEnvelopesAndLabelsTabLabels(800001),
  /**
   * <p>
   * The value of this constant is 1000000
   * </p>
   */
  wdDialogFormatParagraphTabIndentsAndSpacing(1000000),
  /**
   * <p>
   * The value of this constant is 1000001
   * </p>
   */
  wdDialogFormatParagraphTabTextFlow(1000001),
  /**
   * <p>
   * The value of this constant is 1000002
   * </p>
   */
  wdDialogFormatParagraphTabTeisai(1000002),
  /**
   * <p>
   * The value of this constant is 1200000
   * </p>
   */
  wdDialogFormatDrawingObjectTabColorsAndLines(1200000),
  /**
   * <p>
   * The value of this constant is 1200001
   * </p>
   */
  wdDialogFormatDrawingObjectTabSize(1200001),
  /**
   * <p>
   * The value of this constant is 1200002
   * </p>
   */
  wdDialogFormatDrawingObjectTabPosition(1200002),
  /**
   * <p>
   * The value of this constant is 1200003
   * </p>
   */
  wdDialogFormatDrawingObjectTabWrapping(1200003),
  /**
   * <p>
   * The value of this constant is 1200004
   * </p>
   */
  wdDialogFormatDrawingObjectTabPicture(1200004),
  /**
   * <p>
   * The value of this constant is 1200005
   * </p>
   */
  wdDialogFormatDrawingObjectTabTextbox(1200005),
  /**
   * <p>
   * The value of this constant is 1200006
   * </p>
   */
  wdDialogFormatDrawingObjectTabWeb(1200006),
  /**
   * <p>
   * The value of this constant is 1200007
   * </p>
   */
  wdDialogFormatDrawingObjectTabHR(1200007),
  /**
   * <p>
   * The value of this constant is 1400000
   * </p>
   */
  wdDialogToolsAutoCorrectExceptionsTabFirstLetter(1400000),
  /**
   * <p>
   * The value of this constant is 1400001
   * </p>
   */
  wdDialogToolsAutoCorrectExceptionsTabInitialCaps(1400001),
  /**
   * <p>
   * The value of this constant is 1400002
   * </p>
   */
  wdDialogToolsAutoCorrectExceptionsTabHangulAndAlphabet(1400002),
  /**
   * <p>
   * The value of this constant is 1400003
   * </p>
   */
  wdDialogToolsAutoCorrectExceptionsTabIac(1400003),
  /**
   * <p>
   * The value of this constant is 1500000
   * </p>
   */
  wdDialogFormatBulletsAndNumberingTabBulleted(1500000),
  /**
   * <p>
   * The value of this constant is 1500001
   * </p>
   */
  wdDialogFormatBulletsAndNumberingTabNumbered(1500001),
  /**
   * <p>
   * The value of this constant is 1500002
   * </p>
   */
  wdDialogFormatBulletsAndNumberingTabOutlineNumbered(1500002),
  /**
   * <p>
   * The value of this constant is 1600000
   * </p>
   */
  wdDialogLetterWizardTabLetterFormat(1600000),
  /**
   * <p>
   * The value of this constant is 1600001
   * </p>
   */
  wdDialogLetterWizardTabRecipientInfo(1600001),
  /**
   * <p>
   * The value of this constant is 1600002
   * </p>
   */
  wdDialogLetterWizardTabOtherElements(1600002),
  /**
   * <p>
   * The value of this constant is 1600003
   * </p>
   */
  wdDialogLetterWizardTabSenderInfo(1600003),
  /**
   * <p>
   * The value of this constant is 1700000
   * </p>
   */
  wdDialogToolsAutoManagerTabAutoCorrect(1700000),
  /**
   * <p>
   * The value of this constant is 1700001
   * </p>
   */
  wdDialogToolsAutoManagerTabAutoFormatAsYouType(1700001),
  /**
   * <p>
   * The value of this constant is 1700002
   * </p>
   */
  wdDialogToolsAutoManagerTabAutoText(1700002),
  /**
   * <p>
   * The value of this constant is 1700003
   * </p>
   */
  wdDialogToolsAutoManagerTabAutoFormat(1700003),
  /**
   * <p>
   * The value of this constant is 1700004
   * </p>
   */
  wdDialogToolsAutoManagerTabSmartTags(1700004),
  /**
   * <p>
   * The value of this constant is 1800000
   * </p>
   */
  wdDialogTablePropertiesTabTable(1800000),
  /**
   * <p>
   * The value of this constant is 1800001
   * </p>
   */
  wdDialogTablePropertiesTabRow(1800001),
  /**
   * <p>
   * The value of this constant is 1800002
   * </p>
   */
  wdDialogTablePropertiesTabColumn(1800002),
  /**
   * <p>
   * The value of this constant is 1800003
   * </p>
   */
  wdDialogTablePropertiesTabCell(1800003),
  /**
   * <p>
   * The value of this constant is 1900000
   * </p>
   */
  wdDialogEmailOptionsTabSignature(1900000),
  /**
   * <p>
   * The value of this constant is 1900001
   * </p>
   */
  wdDialogEmailOptionsTabStationary(1900001),
  /**
   * <p>
   * The value of this constant is 1900002
   * </p>
   */
  wdDialogEmailOptionsTabQuoting(1900002),
  /**
   * <p>
   * The value of this constant is 2000000
   * </p>
   */
  wdDialogWebOptionsBrowsers(2000000),
  /**
   * <p>
   * The value of this constant is 2000000
   * </p>
   */
  wdDialogWebOptionsGeneral(2000000),
  /**
   * <p>
   * The value of this constant is 2000001
   * </p>
   */
  wdDialogWebOptionsFiles(2000001),
  /**
   * <p>
   * The value of this constant is 2000002
   * </p>
   */
  wdDialogWebOptionsPictures(2000002),
  /**
   * <p>
   * The value of this constant is 2000003
   * </p>
   */
  wdDialogWebOptionsEncoding(2000003),
  /**
   * <p>
   * The value of this constant is 2000004
   * </p>
   */
  wdDialogWebOptionsFonts(2000004),
  /**
   * <p>
   * The value of this constant is 1266
   * </p>
   */
  wdDialogToolsOptionsTabAcetate(1266),
  /**
   * <p>
   * The value of this constant is 2100000
   * </p>
   */
  wdDialogTemplates(2100000),
  /**
   * <p>
   * The value of this constant is 2100001
   * </p>
   */
  wdDialogTemplatesXMLSchema(2100001),
  /**
   * <p>
   * The value of this constant is 2100002
   * </p>
   */
  wdDialogTemplatesXMLExpansionPacks(2100002),
  /**
   * <p>
   * The value of this constant is 2100003
   * </p>
   */
  wdDialogTemplatesLinkedCSS(2100003),
  /**
   * <p>
   * The value of this constant is 2200000
   * </p>
   */
  wdDialogStyleManagementTabEdit(2200000),
  /**
   * <p>
   * The value of this constant is 2200001
   * </p>
   */
  wdDialogStyleManagementTabRecommend(2200001),
  /**
   * <p>
   * The value of this constant is 2200002
   * </p>
   */
  wdDialogStyleManagementTabRestrict(2200002),
  ;

  private final int value;
  WdWordDialogTab(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
