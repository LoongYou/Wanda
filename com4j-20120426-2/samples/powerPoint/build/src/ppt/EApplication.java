package ppt  ;

import com4j.*;

@IID("{914934C2-5A91-11CF-8700-00AA0060263B}")
public interface EApplication extends Com4jObject {
  // Methods:
  /**
   * @param sel Mandatory ppt.Selection parameter.
   */

  @VTID(7)
  void windowSelectionChange(
    ppt.Selection sel);


  /**
   * @param sel Mandatory ppt.Selection parameter.
   * @param cancel Mandatory Holder<Boolean> parameter.
   */

  @VTID(8)
  void windowBeforeRightClick(
    ppt.Selection sel,
    Holder<Boolean> cancel);


  /**
   * @param sel Mandatory ppt.Selection parameter.
   * @param cancel Mandatory Holder<Boolean> parameter.
   */

  @VTID(9)
  void windowBeforeDoubleClick(
    ppt.Selection sel,
    Holder<Boolean> cancel);


  /**
   * @param pres Mandatory ppt._Presentation parameter.
   */

  @VTID(10)
  void presentationClose(
    ppt._Presentation pres);


  /**
   * @param pres Mandatory ppt._Presentation parameter.
   */

  @VTID(11)
  void presentationSave(
    ppt._Presentation pres);


  /**
   * @param pres Mandatory ppt._Presentation parameter.
   */

  @VTID(12)
  void presentationOpen(
    ppt._Presentation pres);


  /**
   * @param pres Mandatory ppt._Presentation parameter.
   */

  @VTID(13)
  void newPresentation(
    ppt._Presentation pres);


  /**
   * @param sld Mandatory ppt._Slide parameter.
   */

  @VTID(14)
  void presentationNewSlide(
    ppt._Slide sld);


  /**
   * @param pres Mandatory ppt._Presentation parameter.
   * @param wn Mandatory ppt.DocumentWindow parameter.
   */

  @VTID(15)
  void windowActivate(
    ppt._Presentation pres,
    ppt.DocumentWindow wn);


  /**
   * @param pres Mandatory ppt._Presentation parameter.
   * @param wn Mandatory ppt.DocumentWindow parameter.
   */

  @VTID(16)
  void windowDeactivate(
    ppt._Presentation pres,
    ppt.DocumentWindow wn);


  /**
   * @param wn Mandatory ppt.SlideShowWindow parameter.
   */

  @VTID(17)
  void slideShowBegin(
    ppt.SlideShowWindow wn);


  /**
   * @param wn Mandatory ppt.SlideShowWindow parameter.
   */

  @VTID(18)
  void slideShowNextBuild(
    ppt.SlideShowWindow wn);


  /**
   * @param wn Mandatory ppt.SlideShowWindow parameter.
   */

  @VTID(19)
  void slideShowNextSlide(
    ppt.SlideShowWindow wn);


  /**
   * @param pres Mandatory ppt._Presentation parameter.
   */

  @VTID(20)
  void slideShowEnd(
    ppt._Presentation pres);


  /**
   * @param pres Mandatory ppt._Presentation parameter.
   */

  @VTID(21)
  void presentationPrint(
    ppt._Presentation pres);


  /**
   * @param sldRange Mandatory ppt.SlideRange parameter.
   */

  @VTID(22)
  void slideSelectionChanged(
    ppt.SlideRange sldRange);


  /**
   * @param sldRange Mandatory ppt.SlideRange parameter.
   */

  @VTID(23)
  void colorSchemeChanged(
    ppt.SlideRange sldRange);


  /**
   * @param pres Mandatory ppt._Presentation parameter.
   * @param cancel Mandatory Holder<Boolean> parameter.
   */

  @VTID(24)
  void presentationBeforeSave(
    ppt._Presentation pres,
    Holder<Boolean> cancel);


  /**
   * @param wn Mandatory ppt.SlideShowWindow parameter.
   * @param nEffect Mandatory ppt.Effect parameter.
   */

  @VTID(25)
  void slideShowNextClick(
    ppt.SlideShowWindow wn,
    ppt.Effect nEffect);


  /**
   * @param pres Mandatory ppt._Presentation parameter.
   */

  @VTID(26)
  void afterNewPresentation(
    ppt._Presentation pres);


  /**
   * @param pres Mandatory ppt._Presentation parameter.
   */

  @VTID(27)
  void afterPresentationOpen(
    ppt._Presentation pres);


  /**
   * @param pres Mandatory ppt._Presentation parameter.
   * @param syncEventType Mandatory office.MsoSyncEventType parameter.
   */

  @VTID(28)
  void presentationSync(
    ppt._Presentation pres,
    office.MsoSyncEventType syncEventType);


  /**
   * @param wn Mandatory ppt.SlideShowWindow parameter.
   */

  @VTID(29)
  void slideShowOnNext(
    ppt.SlideShowWindow wn);


  /**
   * @param wn Mandatory ppt.SlideShowWindow parameter.
   */

  @VTID(30)
  void slideShowOnPrevious(
    ppt.SlideShowWindow wn);


  /**
   * @param pres Mandatory ppt._Presentation parameter.
   * @param cancel Mandatory Holder<Boolean> parameter.
   */

  @VTID(31)
  void presentationBeforeClose(
    ppt._Presentation pres,
    Holder<Boolean> cancel);


  /**
   * @param protViewWindow Mandatory ppt.ProtectedViewWindow parameter.
   */

  @VTID(32)
  void protectedViewWindowOpen(
    ppt.ProtectedViewWindow protViewWindow);


  /**
   * @param protViewWindow Mandatory ppt.ProtectedViewWindow parameter.
   * @param cancel Mandatory Holder<Boolean> parameter.
   */

  @VTID(33)
  void protectedViewWindowBeforeEdit(
    ppt.ProtectedViewWindow protViewWindow,
    Holder<Boolean> cancel);


  /**
   * @param protViewWindow Mandatory ppt.ProtectedViewWindow parameter.
   * @param protectedViewCloseReason Mandatory ppt.PpProtectedViewCloseReason parameter.
   * @param cancel Mandatory Holder<Boolean> parameter.
   */

  @VTID(34)
  void protectedViewWindowBeforeClose(
    ppt.ProtectedViewWindow protViewWindow,
    ppt.PpProtectedViewCloseReason protectedViewCloseReason,
    Holder<Boolean> cancel);


  /**
   * @param protViewWindow Mandatory ppt.ProtectedViewWindow parameter.
   */

  @VTID(35)
  void protectedViewWindowActivate(
    ppt.ProtectedViewWindow protViewWindow);


  /**
   * @param protViewWindow Mandatory ppt.ProtectedViewWindow parameter.
   */

  @VTID(36)
  void protectedViewWindowDeactivate(
    ppt.ProtectedViewWindow protViewWindow);


  /**
   * @param pres Mandatory ppt._Presentation parameter.
   */

  @VTID(37)
  void presentationCloseFinal(
    ppt._Presentation pres);


  // Properties:
}
