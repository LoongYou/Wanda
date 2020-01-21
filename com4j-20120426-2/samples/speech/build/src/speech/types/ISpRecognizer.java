package speech.types  ;

import com4j.*;

/**
 * ISpRecognizer Interface
 */
@IID("{C2B5F241-DAA0-4507-9E16-5A1EAA2B7A5C}")
public interface ISpRecognizer extends speech.types.ISpProperties {
  // Methods:
  /**
   * @param pRecognizer Mandatory speech.types.ISpObjectToken parameter.
   */

  @VTID(7)
  void setRecognizer(
    speech.types.ISpObjectToken pRecognizer);


  /**
   * @return  Returns a value of type speech.types.ISpObjectToken
   */

  @VTID(8)
  speech.types.ISpObjectToken getRecognizer();


  /**
   * @param pUnkInput Mandatory com4j.Com4jObject parameter.
   * @param fAllowFormatChanges Mandatory int parameter.
   */

  @VTID(9)
  void setInput(
    com4j.Com4jObject pUnkInput,
    int fAllowFormatChanges);


  /**
   * @return  Returns a value of type speech.types.ISpObjectToken
   */

  @VTID(10)
  speech.types.ISpObjectToken getInputObjectToken();


  /**
   * @return  Returns a value of type speech.types.ISpStreamFormat
   */

  @VTID(11)
  speech.types.ISpStreamFormat getInputStream();


  /**
   * @return  Returns a value of type speech.types.ISpRecoContext
   */

  @VTID(12)
  speech.types.ISpRecoContext createRecoContext();


  /**
   * @return  Returns a value of type speech.types.ISpObjectToken
   */

  @VTID(13)
  speech.types.ISpObjectToken getRecoProfile();


  /**
   * @param pToken Mandatory speech.types.ISpObjectToken parameter.
   */

  @VTID(14)
  void setRecoProfile(
    speech.types.ISpObjectToken pToken);


  /**
   */

  @VTID(15)
  void isSharedInstance();


  /**
   * @return  Returns a value of type speech.types.SPRECOSTATE
   */

  @VTID(16)
  speech.types.SPRECOSTATE getRecoState();


  /**
   * @param newState Mandatory speech.types.SPRECOSTATE parameter.
   */

  @VTID(17)
  void setRecoState(
    speech.types.SPRECOSTATE newState);


    /**
     * @param pszTypeOfUI Mandatory java.lang.String parameter.
     * @param pvExtraData Mandatory java.nio.Buffer parameter.
     * @param cbExtraData Mandatory int parameter.
     * @return  Returns a value of type int
     */

    @VTID(20)
    int isUISupported(
      @MarshalAs(NativeType.Unicode) java.lang.String pszTypeOfUI,
      java.nio.Buffer pvExtraData,
      int cbExtraData);


    /**
     * @param hWndParent Mandatory int parameter.
     * @param pszTitle Mandatory java.lang.String parameter.
     * @param pszTypeOfUI Mandatory java.lang.String parameter.
     * @param pvExtraData Mandatory java.nio.Buffer parameter.
     * @param cbExtraData Mandatory int parameter.
     */

    @VTID(21)
    void displayUI(
      int hWndParent,
      @MarshalAs(NativeType.Unicode) java.lang.String pszTitle,
      @MarshalAs(NativeType.Unicode) java.lang.String pszTypeOfUI,
      java.nio.Buffer pvExtraData,
      int cbExtraData);


    /**
     * @param pPhrase Mandatory speech.types.ISpPhrase parameter.
     */

    @VTID(22)
    void emulateRecognition(
      speech.types.ISpPhrase pPhrase);


    // Properties:
  }
