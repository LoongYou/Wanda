package ppt  ;

import com4j.*;

@IID("{91493451-5A91-11CF-8700-00AA0060263B}")
public interface _Global extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "ActivePresentation"
   * </p>
   * @return  Returns a value of type ppt._Presentation
   */

  @DISPID(2001) //= 0x7d1. The runtime will prefer the VTID if present
  @VTID(7)
  ppt._Presentation activePresentation();


  /**
   * <p>
   * Getter method for the COM property "ActiveWindow"
   * </p>
   * @return  Returns a value of type ppt.DocumentWindow
   */

  @DISPID(2002) //= 0x7d2. The runtime will prefer the VTID if present
  @VTID(8)
  ppt.DocumentWindow activeWindow();


  /**
   * <p>
   * Getter method for the COM property "AddIns"
   * </p>
   * @return  Returns a value of type ppt.AddIns
   */

  @DISPID(2003) //= 0x7d3. The runtime will prefer the VTID if present
  @VTID(9)
  ppt.AddIns addIns();


  @VTID(9)
  @ReturnValue(defaultPropertyThrough={ppt.AddIns.class})
  ppt.AddIn addIns(
    java.lang.Object index);

  /**
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of type ppt._Application
   */

  @DISPID(2004) //= 0x7d4. The runtime will prefer the VTID if present
  @VTID(10)
  ppt._Application application();


  /**
   * <p>
   * Getter method for the COM property "Assistant"
   * </p>
   * @return  Returns a value of type office.Assistant
   */

  @DISPID(2005) //= 0x7d5. The runtime will prefer the VTID if present
  @VTID(11)
  office.Assistant assistant();


  /**
   * <p>
   * Getter method for the COM property "Dialogs"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(2006) //= 0x7d6. The runtime will prefer the VTID if present
  @VTID(12)
  com4j.Com4jObject dialogs();


  /**
   * <p>
   * Getter method for the COM property "Presentations"
   * </p>
   * @return  Returns a value of type ppt.Presentations
   */

  @DISPID(2007) //= 0x7d7. The runtime will prefer the VTID if present
  @VTID(13)
  ppt.Presentations presentations();


  @VTID(13)
  @ReturnValue(defaultPropertyThrough={ppt.Presentations.class})
  ppt._Presentation presentations(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);

  /**
   * <p>
   * Getter method for the COM property "SlideShowWindows"
   * </p>
   * @return  Returns a value of type ppt.SlideShowWindows
   */

  @DISPID(2008) //= 0x7d8. The runtime will prefer the VTID if present
  @VTID(14)
  ppt.SlideShowWindows slideShowWindows();


  @VTID(14)
  @ReturnValue(defaultPropertyThrough={ppt.SlideShowWindows.class})
  ppt.SlideShowWindow slideShowWindows(
    int index);

  /**
   * <p>
   * Getter method for the COM property "Windows"
   * </p>
   * @return  Returns a value of type ppt.DocumentWindows
   */

  @DISPID(2009) //= 0x7d9. The runtime will prefer the VTID if present
  @VTID(15)
  ppt.DocumentWindows windows();


  @VTID(15)
  @ReturnValue(defaultPropertyThrough={ppt.DocumentWindows.class})
  ppt.DocumentWindow windows(
    int index);

  /**
   * <p>
   * Getter method for the COM property "CommandBars"
   * </p>
   * @return  Returns a value of type office._CommandBars
   */

  @DISPID(2010) //= 0x7da. The runtime will prefer the VTID if present
  @VTID(16)
  office._CommandBars commandBars();


  /**
   * <p>
   * Getter method for the COM property "AnswerWizard"
   * </p>
   * @return  Returns a value of type office.AnswerWizard
   */

  @DISPID(2011) //= 0x7db. The runtime will prefer the VTID if present
  @VTID(17)
  office.AnswerWizard answerWizard();


  /**
   * <p>
   * Getter method for the COM property "FileConverters"
   * </p>
   * @return  Returns a value of type ppt.FileConverters
   */

  @DISPID(2012) //= 0x7dc. The runtime will prefer the VTID if present
  @VTID(18)
  ppt.FileConverters fileConverters();


  @VTID(18)
  @ReturnValue(defaultPropertyThrough={ppt.FileConverters.class})
  ppt.FileConverter fileConverters(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);

  /**
   * <p>
   * Getter method for the COM property "ProtectedViewWindows"
   * </p>
   * @return  Returns a value of type ppt.ProtectedViewWindows
   */

  @DISPID(2013) //= 0x7dd. The runtime will prefer the VTID if present
  @VTID(19)
  ppt.ProtectedViewWindows protectedViewWindows();


  @VTID(19)
  @ReturnValue(defaultPropertyThrough={ppt.ProtectedViewWindows.class})
  ppt.ProtectedViewWindow protectedViewWindows(
    int index);

  /**
   * <p>
   * Getter method for the COM property "ActiveProtectedViewWindow"
   * </p>
   * @return  Returns a value of type ppt.ProtectedViewWindow
   */

  @DISPID(2014) //= 0x7de. The runtime will prefer the VTID if present
  @VTID(20)
  ppt.ProtectedViewWindow activeProtectedViewWindow();


  /**
   * <p>
   * Getter method for the COM property "IsSandboxed"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(2015) //= 0x7df. The runtime will prefer the VTID if present
  @VTID(21)
  boolean isSandboxed();


  // Properties:
}
