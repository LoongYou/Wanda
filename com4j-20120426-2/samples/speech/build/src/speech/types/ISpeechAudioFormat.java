package speech.types  ;

import com4j.*;

/**
 * ISpeechAudioFormat Interface
 */
@IID("{E6E9C590-3E18-40E3-8299-061F98BDE7C7}")
public interface ISpeechAudioFormat extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Type
   * </p>
   * <p>
   * Getter method for the COM property "Type"
   * </p>
   * @return  Returns a value of type speech.types.SpeechAudioFormatType
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(7)
  speech.types.SpeechAudioFormatType type();


  /**
   * <p>
   * Type
   * </p>
   * <p>
   * Setter method for the COM property "Type"
   * </p>
   * @param audioFormat Mandatory speech.types.SpeechAudioFormatType parameter.
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(8)
  void type(
    speech.types.SpeechAudioFormatType audioFormat);


  /**
   * <p>
   * Guid
   * </p>
   * <p>
   * Getter method for the COM property "Guid"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(9)
  java.lang.String guid();


  /**
   * <p>
   * Guid
   * </p>
   * <p>
   * Setter method for the COM property "Guid"
   * </p>
   * @param guid Mandatory java.lang.String parameter.
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(10)
  void guid(
    java.lang.String guid);


  /**
   * <p>
   * GetWaveFormatEx
   * </p>
   * @return  Returns a value of type speech.types.ISpeechWaveFormatEx
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(11)
  speech.types.ISpeechWaveFormatEx getWaveFormatEx();


  /**
   * <p>
   * SetWaveFormatEx
   * </p>
   * @param waveFormatEx Mandatory speech.types.ISpeechWaveFormatEx parameter.
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(12)
  void setWaveFormatEx(
    speech.types.ISpeechWaveFormatEx waveFormatEx);


  // Properties:
}
