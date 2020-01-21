package speech.types  ;

import com4j.*;

/**
 * Defines methods to create COM objects
 */
public abstract class ClassFactory {
  private ClassFactory() {} // instanciation is not allowed


  /**
   * SpNotify
   */
  public static speech.types.ISpNotifyTranslator createSpNotifyTranslator() {
    return COM4J.createInstance( speech.types.ISpNotifyTranslator.class, "{E2AE5372-5D40-11D2-960E-00C04F8EE628}" );
  }

  /**
   * SpObjectTokenCategory Class
   */
  public static speech.types.ISpeechObjectTokenCategory createSpObjectTokenCategory() {
    return COM4J.createInstance( speech.types.ISpeechObjectTokenCategory.class, "{A910187F-0C7A-45AC-92CC-59EDAFB77B53}" );
  }

  /**
   * SpObjectToken Class
   */
  public static speech.types.ISpeechObjectToken createSpObjectToken() {
    return COM4J.createInstance( speech.types.ISpeechObjectToken.class, "{EF411752-3736-4CB4-9C8C-8EF4CCB58EFE}" );
  }

  /**
   * SpResourceManger
   */
  public static speech.types.ISpResourceManager createSpResourceManager() {
    return COM4J.createInstance( speech.types.ISpResourceManager.class, "{96749373-3391-11D2-9EE3-00C04F797396}" );
  }

  /**
   * FormatConverter Class
   */
  public static speech.types.ISpStreamFormatConverter createSpStreamFormatConverter() {
    return COM4J.createInstance( speech.types.ISpStreamFormatConverter.class, "{7013943A-E2EC-11D2-A086-00C04F8EF9B5}" );
  }

  /**
   * SpMMAudioEnum Class
   */
  public static speech.types.IEnumSpObjectTokens createSpMMAudioEnum() {
    return COM4J.createInstance( speech.types.IEnumSpObjectTokens.class, "{AB1890A0-E91F-11D2-BB91-00C04F8EE6C0}" );
  }

  /**
   * SpMMAudioIn Class
   */
  public static speech.types.ISpeechMMSysAudio createSpMMAudioIn() {
    return COM4J.createInstance( speech.types.ISpeechMMSysAudio.class, "{CF3D2E50-53F2-11D2-960C-00C04F8EE628}" );
  }

  /**
   * SpMMAudioOut Class
   */
  public static speech.types.ISpeechMMSysAudio createSpMMAudioOut() {
    return COM4J.createInstance( speech.types.ISpeechMMSysAudio.class, "{A8C680EB-3D32-11D2-9EE7-00C04F797396}" );
  }

  /**
   * SpRecPlayAudio Class
   */
  public static speech.types.ISpObjectWithToken createSpRecPlayAudio() {
    return COM4J.createInstance( speech.types.ISpObjectWithToken.class, "{FEE225FC-7AFD-45E9-95D0-5A318079D911}" );
  }

  /**
   * SpStream Class
   */
  public static speech.types.ISpStream createSpStream() {
    return COM4J.createInstance( speech.types.ISpStream.class, "{715D9C59-4442-11D2-9605-00C04F8EE628}" );
  }

  /**
   * SpVoice Class
   */
  public static speech.types.ISpeechVoice createSpVoice() {
    return COM4J.createInstance( speech.types.ISpeechVoice.class, "{96749377-3391-11D2-9EE3-00C04F797396}" );
  }

  /**
   * SpSharedRecoContext Class
   */
  public static speech.types.ISpeechRecoContext createSpSharedRecoContext() {
    return COM4J.createInstance( speech.types.ISpeechRecoContext.class, "{47206204-5ECA-11D2-960F-00C04F8EE628}" );
  }

  /**
   * SpInprocRecognizer Class
   */
  public static speech.types.ISpeechRecognizer createSpInprocRecognizer() {
    return COM4J.createInstance( speech.types.ISpeechRecognizer.class, "{41B89B6B-9399-11D2-9623-00C04F8EE628}" );
  }

  /**
   * SpSharedRecognizer Class
   */
  public static speech.types.ISpeechRecognizer createSpSharedRecognizer() {
    return COM4J.createInstance( speech.types.ISpeechRecognizer.class, "{3BEE4890-4FE9-4A37-8C1E-5E7E12791C1F}" );
  }

  /**
   * SpLexicon Class
   */
  public static speech.types.ISpeechLexicon createSpLexicon() {
    return COM4J.createInstance( speech.types.ISpeechLexicon.class, "{0655E396-25D0-11D3-9C26-00C04F8EF87C}" );
  }

  /**
   * SpUnCompressedLexicon Class
   */
  public static speech.types.ISpeechLexicon createSpUnCompressedLexicon() {
    return COM4J.createInstance( speech.types.ISpeechLexicon.class, "{C9E37C15-DF92-4727-85D6-72E5EEB6995A}" );
  }

  /**
   * SpCompressedLexicon Class
   */
  public static speech.types.ISpLexicon createSpCompressedLexicon() {
    return COM4J.createInstance( speech.types.ISpLexicon.class, "{90903716-2F42-11D3-9C26-00C04F8EF87C}" );
  }

  /**
   * SpPhoneConverter Class
   */
  public static speech.types.ISpeechPhoneConverter createSpPhoneConverter() {
    return COM4J.createInstance( speech.types.ISpeechPhoneConverter.class, "{9185F743-1143-4C28-86B5-BFF14F20E5C8}" );
  }

  /**
   * SpNullPhoneConverter Class
   */
  public static speech.types.ISpPhoneConverter createSpNullPhoneConverter() {
    return COM4J.createInstance( speech.types.ISpPhoneConverter.class, "{455F24E9-7396-4A16-9715-7C0FDBE3EFE3}" );
  }

  /**
   * SpTextSelectionInformation Class
   */
  public static speech.types.ISpeechTextSelectionInformation createSpTextSelectionInformation() {
    return COM4J.createInstance( speech.types.ISpeechTextSelectionInformation.class, "{0F92030A-CBFD-4AB8-A164-FF5985547FF6}" );
  }

  /**
   * SpPhraseInfoBuilder Class
   */
  public static speech.types.ISpeechPhraseInfoBuilder createSpPhraseInfoBuilder() {
    return COM4J.createInstance( speech.types.ISpeechPhraseInfoBuilder.class, "{C23FC28D-C55F-4720-8B32-91F73C2BD5D1}" );
  }

  /**
   * SpAudioFormat Class
   */
  public static speech.types.ISpeechAudioFormat createSpAudioFormat() {
    return COM4J.createInstance( speech.types.ISpeechAudioFormat.class, "{9EF96870-E160-4792-820D-48CF0649E4EC}" );
  }

  /**
   * SpWaveFormatEx Class
   */
  public static speech.types.ISpeechWaveFormatEx createSpWaveFormatEx() {
    return COM4J.createInstance( speech.types.ISpeechWaveFormatEx.class, "{C79A574C-63BE-44B9-801F-283F87F898BE}" );
  }

  /**
   * SpInProcRecoContext Class
   */
  public static speech.types.ISpeechRecoContext createSpInProcRecoContext() {
    return COM4J.createInstance( speech.types.ISpeechRecoContext.class, "{73AD6842-ACE0-45E8-A4DD-8795881A2C2A}" );
  }

  /**
   * SpCustomStream Class
   */
  public static speech.types.ISpeechCustomStream createSpCustomStream() {
    return COM4J.createInstance( speech.types.ISpeechCustomStream.class, "{8DBEF13F-1948-4AA8-8CF0-048EEBED95D8}" );
  }

  /**
   * SpFileStream Class
   */
  public static speech.types.ISpeechFileStream createSpFileStream() {
    return COM4J.createInstance( speech.types.ISpeechFileStream.class, "{947812B3-2AE1-4644-BA86-9E90DED7EC91}" );
  }

  /**
   * SpMemoryStream Class
   */
  public static speech.types.ISpeechMemoryStream createSpMemoryStream() {
    return COM4J.createInstance( speech.types.ISpeechMemoryStream.class, "{5FB7EF7D-DFF4-468A-B6B7-2FCBD188F994}" );
  }
}
