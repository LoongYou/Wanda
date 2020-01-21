package ppt  ;

import com4j.*;

@IID("{BA72E553-4FF5-48F4-8215-5505F990966F}")
public interface ResampleMediaTask extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "profile"
   * </p>
   * @return  Returns a value of type ppt.PpResampleMediaProfile
   */

  @DISPID(2001) //= 0x7d1. The runtime will prefer the VTID if present
  @VTID(7)
  ppt.PpResampleMediaProfile profile();


  /**
   * <p>
   * Getter method for the COM property "IsLinked"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(2002) //= 0x7d2. The runtime will prefer the VTID if present
  @VTID(8)
  boolean isLinked();


  /**
   * <p>
   * Getter method for the COM property "IsEmbedded"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(2003) //= 0x7d3. The runtime will prefer the VTID if present
  @VTID(9)
  boolean isEmbedded();


  /**
   * <p>
   * Getter method for the COM property "AudioSamplingRate"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(2004) //= 0x7d4. The runtime will prefer the VTID if present
  @VTID(10)
  int audioSamplingRate();


  /**
   * <p>
   * Getter method for the COM property "VideoFrameRate"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(2005) //= 0x7d5. The runtime will prefer the VTID if present
  @VTID(11)
  int videoFrameRate();


  /**
   * <p>
   * Getter method for the COM property "SampleHeight"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(2006) //= 0x7d6. The runtime will prefer the VTID if present
  @VTID(12)
  int sampleHeight();


  /**
   * <p>
   * Getter method for the COM property "SampleWidth"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(2007) //= 0x7d7. The runtime will prefer the VTID if present
  @VTID(13)
  int sampleWidth();


  /**
   * <p>
   * Getter method for the COM property "ContainerType"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(2008) //= 0x7d8. The runtime will prefer the VTID if present
  @VTID(14)
  java.lang.String containerType();


  /**
   * <p>
   * Getter method for the COM property "VideoCompressionType"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(2009) //= 0x7d9. The runtime will prefer the VTID if present
  @VTID(15)
  java.lang.String videoCompressionType();


  /**
   * <p>
   * Getter method for the COM property "AudioCompressionType"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(2010) //= 0x7da. The runtime will prefer the VTID if present
  @VTID(16)
  java.lang.String audioCompressionType();


  /**
   * <p>
   * Getter method for the COM property "Shape"
   * </p>
   * @return  Returns a value of type ppt.Shape
   */

  @DISPID(2011) //= 0x7db. The runtime will prefer the VTID if present
  @VTID(17)
  ppt.Shape shape();


  // Properties:
}
