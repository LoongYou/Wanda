package ppt  ;

import com4j.*;

@IID("{BA72E550-4FF5-48F4-8215-5505F990966F}")
public interface MediaFormat extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of type ppt._Application
   */

  @DISPID(2000) //= 0x7d0. The runtime will prefer the VTID if present
  @VTID(7)
  ppt._Application application();


  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(2001) //= 0x7d1. The runtime will prefer the VTID if present
  @VTID(8)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject parent();


  /**
   * <p>
   * Getter method for the COM property "Volume"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(2002) //= 0x7d2. The runtime will prefer the VTID if present
  @VTID(9)
  float volume();


  /**
   * <p>
   * Setter method for the COM property "Volume"
   * </p>
   * @param volume Mandatory float parameter.
   */

  @DISPID(2002) //= 0x7d2. The runtime will prefer the VTID if present
  @VTID(10)
  void volume(
    float volume);


  /**
   * <p>
   * Getter method for the COM property "Muted"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(2003) //= 0x7d3. The runtime will prefer the VTID if present
  @VTID(11)
  boolean muted();


  /**
   * <p>
   * Setter method for the COM property "Muted"
   * </p>
   * @param muted Mandatory boolean parameter.
   */

  @DISPID(2003) //= 0x7d3. The runtime will prefer the VTID if present
  @VTID(12)
  void muted(
    boolean muted);


  /**
   * <p>
   * Getter method for the COM property "Length"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(2004) //= 0x7d4. The runtime will prefer the VTID if present
  @VTID(13)
  int length();


  /**
   * <p>
   * Getter method for the COM property "StartPoint"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(2005) //= 0x7d5. The runtime will prefer the VTID if present
  @VTID(14)
  int startPoint();


  /**
   * <p>
   * Setter method for the COM property "StartPoint"
   * </p>
   * @param startPoint Mandatory int parameter.
   */

  @DISPID(2005) //= 0x7d5. The runtime will prefer the VTID if present
  @VTID(15)
  void startPoint(
    int startPoint);


  /**
   * <p>
   * Getter method for the COM property "EndPoint"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(2006) //= 0x7d6. The runtime will prefer the VTID if present
  @VTID(16)
  int endPoint();


  /**
   * <p>
   * Setter method for the COM property "EndPoint"
   * </p>
   * @param endPoint Mandatory int parameter.
   */

  @DISPID(2006) //= 0x7d6. The runtime will prefer the VTID if present
  @VTID(17)
  void endPoint(
    int endPoint);


  /**
   * <p>
   * Getter method for the COM property "FadeInDuration"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(2007) //= 0x7d7. The runtime will prefer the VTID if present
  @VTID(18)
  int fadeInDuration();


  /**
   * <p>
   * Setter method for the COM property "FadeInDuration"
   * </p>
   * @param fadeInDuration Mandatory int parameter.
   */

  @DISPID(2007) //= 0x7d7. The runtime will prefer the VTID if present
  @VTID(19)
  void fadeInDuration(
    int fadeInDuration);


  /**
   * <p>
   * Getter method for the COM property "FadeOutDuration"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(2008) //= 0x7d8. The runtime will prefer the VTID if present
  @VTID(20)
  int fadeOutDuration();


  /**
   * <p>
   * Setter method for the COM property "FadeOutDuration"
   * </p>
   * @param fadeOutDuration Mandatory int parameter.
   */

  @DISPID(2008) //= 0x7d8. The runtime will prefer the VTID if present
  @VTID(21)
  void fadeOutDuration(
    int fadeOutDuration);


  /**
   * <p>
   * Getter method for the COM property "MediaBookmarks"
   * </p>
   * @return  Returns a value of type ppt.MediaBookmarks
   */

  @DISPID(2009) //= 0x7d9. The runtime will prefer the VTID if present
  @VTID(22)
  ppt.MediaBookmarks mediaBookmarks();


  @VTID(22)
  @ReturnValue(defaultPropertyThrough={ppt.MediaBookmarks.class})
  ppt.MediaBookmark mediaBookmarks(
    int index);

  /**
   * @param position Mandatory int parameter.
   */

  @DISPID(2010) //= 0x7da. The runtime will prefer the VTID if present
  @VTID(23)
  void setDisplayPicture(
    int position);


  /**
   * @param filePath Mandatory java.lang.String parameter.
   */

  @DISPID(2011) //= 0x7db. The runtime will prefer the VTID if present
  @VTID(24)
  void setDisplayPictureFromFile(
    java.lang.String filePath);


  /**
   * @param trim Optional parameter. Default value is false
   * @param sampleHeight Optional parameter. Default value is 768
   * @param sampleWidth Optional parameter. Default value is 1280
   * @param videoFrameRate Optional parameter. Default value is 24
   * @param audioSamplingRate Optional parameter. Default value is 48000
   * @param videoBitRate Optional parameter. Default value is 7000000
   */

  @DISPID(2012) //= 0x7dc. The runtime will prefer the VTID if present
  @VTID(25)
  void resample(
    @Optional @DefaultValue("0") boolean trim,
    @Optional @DefaultValue("768") int sampleHeight,
    @Optional @DefaultValue("1280") int sampleWidth,
    @Optional @DefaultValue("24") int videoFrameRate,
    @Optional @DefaultValue("48000") int audioSamplingRate,
    @Optional @DefaultValue("7000000") int videoBitRate);


  /**
   * @param profile Optional parameter. Default value is 2
   */

  @DISPID(2013) //= 0x7dd. The runtime will prefer the VTID if present
  @VTID(26)
  void resampleFromProfile(
    @Optional @DefaultValue("2") ppt.PpResampleMediaProfile profile);


  /**
   * <p>
   * Getter method for the COM property "ResamplingStatus"
   * </p>
   * @return  Returns a value of type ppt.PpMediaTaskStatus
   */

  @DISPID(2014) //= 0x7de. The runtime will prefer the VTID if present
  @VTID(27)
  ppt.PpMediaTaskStatus resamplingStatus();


  /**
   * <p>
   * Getter method for the COM property "IsLinked"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(2015) //= 0x7df. The runtime will prefer the VTID if present
  @VTID(28)
  boolean isLinked();


  /**
   * <p>
   * Getter method for the COM property "IsEmbedded"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(2016) //= 0x7e0. The runtime will prefer the VTID if present
  @VTID(29)
  boolean isEmbedded();


  /**
   * <p>
   * Getter method for the COM property "AudioSamplingRate"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(2017) //= 0x7e1. The runtime will prefer the VTID if present
  @VTID(30)
  int audioSamplingRate();


  /**
   * <p>
   * Getter method for the COM property "VideoFrameRate"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(2018) //= 0x7e2. The runtime will prefer the VTID if present
  @VTID(31)
  int videoFrameRate();


  /**
   * <p>
   * Getter method for the COM property "SampleHeight"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(2019) //= 0x7e3. The runtime will prefer the VTID if present
  @VTID(32)
  int sampleHeight();


  /**
   * <p>
   * Getter method for the COM property "SampleWidth"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(2020) //= 0x7e4. The runtime will prefer the VTID if present
  @VTID(33)
  int sampleWidth();


  /**
   * <p>
   * Getter method for the COM property "VideoCompressionType"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(2021) //= 0x7e5. The runtime will prefer the VTID if present
  @VTID(34)
  java.lang.String videoCompressionType();


  /**
   * <p>
   * Getter method for the COM property "AudioCompressionType"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(2022) //= 0x7e6. The runtime will prefer the VTID if present
  @VTID(35)
  java.lang.String audioCompressionType();


  // Properties:
}
