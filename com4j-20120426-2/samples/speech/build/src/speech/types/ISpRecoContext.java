package speech.types  ;

import com4j.*;

/**
 * ISpRecoContext Interface
 */
@IID("{F740A62F-7C15-489E-8234-940A33D9272D}")
public interface ISpRecoContext extends speech.types.ISpEventSource {
  // Methods:
  /**
   * @return  Returns a value of type speech.types.ISpRecognizer
   */

  @VTID(13)
  speech.types.ISpRecognizer getRecognizer();


  /**
   * @param ullGrammarID Mandatory long parameter.
   * @return  Returns a value of type speech.types.ISpRecoGrammar
   */

  @VTID(14)
  speech.types.ISpRecoGrammar createGrammar(
    long ullGrammarID);


  /**
   * @param pcAlternates Mandatory Holder<Integer> parameter.
   */

  @VTID(16)
  void getMaxAlternates(
    Holder<Integer> pcAlternates);


  /**
   * @param cAlternates Mandatory int parameter.
   */

  @VTID(17)
  void setMaxAlternates(
    int cAlternates);


        /**
         * @param options Mandatory speech.types.SPBOOKMARKOPTIONS parameter.
         * @param ullStreamPosition Mandatory long parameter.
         * @param lparamEvent Mandatory int parameter.
         */

        @VTID(21)
        void bookmark(
          speech.types.SPBOOKMARKOPTIONS options,
          long ullStreamPosition,
          int lparamEvent);


        /**
         * @param pAdaptationData Mandatory java.lang.String parameter.
         * @param cch Mandatory int parameter.
         */

        @VTID(22)
        void setAdaptationData(
          @MarshalAs(NativeType.Unicode) java.lang.String pAdaptationData,
          int cch);


        /**
         * @param dwReserved Mandatory int parameter.
         */

        @VTID(23)
        void pause(
          int dwReserved);


        /**
         * @param dwReserved Mandatory int parameter.
         */

        @VTID(24)
        void resume(
          int dwReserved);


        /**
         * @param pVoice Mandatory speech.types.ISpVoice parameter.
         * @param fAllowFormatChanges Mandatory int parameter.
         */

        @VTID(25)
        void setVoice(
          speech.types.ISpVoice pVoice,
          int fAllowFormatChanges);


        /**
         * @return  Returns a value of type speech.types.ISpVoice
         */

        @VTID(26)
        speech.types.ISpVoice getVoice();


        /**
         * @param ullEventInterest Mandatory long parameter.
         */

        @VTID(27)
        void setVoicePurgeEvent(
          long ullEventInterest);


        /**
         * @return  Returns a value of type long
         */

        @VTID(28)
        long getVoicePurgeEvent();


        /**
         * @param eContextState Mandatory speech.types.SPCONTEXTSTATE parameter.
         */

        @VTID(29)
        void setContextState(
          speech.types.SPCONTEXTSTATE eContextState);


        /**
         * @param peContextState Mandatory Holder<speech.types.SPCONTEXTSTATE> parameter.
         */

        @VTID(30)
        void getContextState(
          Holder<speech.types.SPCONTEXTSTATE> peContextState);


        // Properties:
      }
