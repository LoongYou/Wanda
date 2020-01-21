package speech.types  ;

import com4j.*;

/**
 * ISpRecoGrammar Interface
 */
@IID("{2177DB29-7F45-47D0-8554-067E91C80502}")
public interface ISpRecoGrammar extends speech.types.ISpGrammarBuilder {
  // Methods:
  /**
   * @return  Returns a value of type long
   */

  @VTID(11)
  long getGrammarId();


  /**
   * @return  Returns a value of type speech.types.ISpRecoContext
   */

  @VTID(12)
  speech.types.ISpRecoContext getRecoContext();


  /**
   * @param pszFileName Mandatory java.lang.String parameter.
   * @param options Mandatory speech.types.SPLOADOPTIONS parameter.
   */

  @VTID(13)
  void loadCmdFromFile(
    @MarshalAs(NativeType.Unicode) java.lang.String pszFileName,
    speech.types.SPLOADOPTIONS options);


  /**
   * @param rcid Mandatory GUID parameter.
   * @param pszGrammarName Mandatory java.lang.String parameter.
   * @param options Mandatory speech.types.SPLOADOPTIONS parameter.
   */

  @VTID(14)
  void loadCmdFromObject(
    GUID rcid,
    @MarshalAs(NativeType.Unicode) java.lang.String pszGrammarName,
    speech.types.SPLOADOPTIONS options);


  /**
   * @param hModule Mandatory java.nio.Buffer parameter.
   * @param pszResourceName Mandatory java.lang.String parameter.
   * @param pszResourceType Mandatory java.lang.String parameter.
   * @param wLanguage Mandatory short parameter.
   * @param options Mandatory speech.types.SPLOADOPTIONS parameter.
   */

  @VTID(15)
  void loadCmdFromResource(
    java.nio.Buffer hModule,
    @MarshalAs(NativeType.Unicode) java.lang.String pszResourceName,
    @MarshalAs(NativeType.Unicode) java.lang.String pszResourceType,
    short wLanguage,
    speech.types.SPLOADOPTIONS options);


    /**
     * @param rguidParam Mandatory GUID parameter.
     * @param pszStringParam Mandatory java.lang.String parameter.
     * @param pvDataPrarm Mandatory java.nio.Buffer parameter.
     * @param cbDataSize Mandatory int parameter.
     * @param options Mandatory speech.types.SPLOADOPTIONS parameter.
     */

    @VTID(17)
    void loadCmdFromProprietaryGrammar(
      GUID rguidParam,
      @MarshalAs(NativeType.Unicode) java.lang.String pszStringParam,
      java.nio.Buffer pvDataPrarm,
      int cbDataSize,
      speech.types.SPLOADOPTIONS options);


    /**
     * @param pszName Mandatory java.lang.String parameter.
     * @param pReserved Mandatory java.nio.Buffer parameter.
     * @param newState Mandatory speech.types.SPRULESTATE parameter.
     */

    @VTID(18)
    void setRuleState(
      @MarshalAs(NativeType.Unicode) java.lang.String pszName,
      java.nio.Buffer pReserved,
      speech.types.SPRULESTATE newState);


    /**
     * @param ulRuleId Mandatory int parameter.
     * @param newState Mandatory speech.types.SPRULESTATE parameter.
     */

    @VTID(19)
    void setRuleIdState(
      int ulRuleId,
      speech.types.SPRULESTATE newState);


    /**
     * @param pszTopicName Mandatory java.lang.String parameter.
     * @param options Mandatory speech.types.SPLOADOPTIONS parameter.
     */

    @VTID(20)
    void loadDictation(
      @MarshalAs(NativeType.Unicode) java.lang.String pszTopicName,
      speech.types.SPLOADOPTIONS options);


    /**
     */

    @VTID(21)
    void unloadDictation();


    /**
     * @param newState Mandatory speech.types.SPRULESTATE parameter.
     */

    @VTID(22)
    void setDictationState(
      speech.types.SPRULESTATE newState);


        /**
         * @param pszWord Mandatory java.lang.String parameter.
         * @return  Returns a value of type speech.types.SPWORDPRONOUNCEABLE
         */

        @VTID(25)
        speech.types.SPWORDPRONOUNCEABLE isPronounceable(
          @MarshalAs(NativeType.Unicode) java.lang.String pszWord);


        /**
         * @param eGrammarState Mandatory speech.types.SPGRAMMARSTATE parameter.
         */

        @VTID(26)
        void setGrammarState(
          speech.types.SPGRAMMARSTATE eGrammarState);


        /**
         * @param pStream Mandatory speech.types.IStream parameter.
         * @return  Returns a value of type Holder<Short>
         */

        @VTID(27)
        Holder<Short> saveCmd(
          speech.types.IStream pStream);


        /**
         * @return  Returns a value of type speech.types.SPGRAMMARSTATE
         */

        @VTID(28)
        speech.types.SPGRAMMARSTATE getGrammarState();


        // Properties:
      }
