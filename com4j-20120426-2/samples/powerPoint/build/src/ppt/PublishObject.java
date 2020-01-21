package ppt  ;

import com4j.*;

@IID("{914934D0-5A91-11CF-8700-00AA0060263B}")
public interface PublishObject extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of type ppt._Application
   */

  @DISPID(2001) //= 0x7d1. The runtime will prefer the VTID if present
  @VTID(7)
  ppt._Application application();


  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(2002) //= 0x7d2. The runtime will prefer the VTID if present
  @VTID(8)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject parent();


  /**
   * <p>
   * Getter method for the COM property "HTMLVersion"
   * </p>
   * @return  Returns a value of type ppt.PpHTMLVersion
   */

  @DISPID(2003) //= 0x7d3. The runtime will prefer the VTID if present
  @VTID(9)
  ppt.PpHTMLVersion htmlVersion();


  /**
   * <p>
   * Setter method for the COM property "HTMLVersion"
   * </p>
   * @param htmlVersion Mandatory ppt.PpHTMLVersion parameter.
   */

  @DISPID(2003) //= 0x7d3. The runtime will prefer the VTID if present
  @VTID(10)
  void htmlVersion(
    ppt.PpHTMLVersion htmlVersion);


  /**
   * <p>
   * Getter method for the COM property "SourceType"
   * </p>
   * @return  Returns a value of type ppt.PpPublishSourceType
   */

  @DISPID(2004) //= 0x7d4. The runtime will prefer the VTID if present
  @VTID(11)
  ppt.PpPublishSourceType sourceType();


  /**
   * <p>
   * Setter method for the COM property "SourceType"
   * </p>
   * @param sourceType Mandatory ppt.PpPublishSourceType parameter.
   */

  @DISPID(2004) //= 0x7d4. The runtime will prefer the VTID if present
  @VTID(12)
  void sourceType(
    ppt.PpPublishSourceType sourceType);


  /**
   * <p>
   * Getter method for the COM property "RangeStart"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(2005) //= 0x7d5. The runtime will prefer the VTID if present
  @VTID(13)
  int rangeStart();


  /**
   * <p>
   * Setter method for the COM property "RangeStart"
   * </p>
   * @param rangeStart Mandatory int parameter.
   */

  @DISPID(2005) //= 0x7d5. The runtime will prefer the VTID if present
  @VTID(14)
  void rangeStart(
    int rangeStart);


  /**
   * <p>
   * Getter method for the COM property "RangeEnd"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(2006) //= 0x7d6. The runtime will prefer the VTID if present
  @VTID(15)
  int rangeEnd();


  /**
   * <p>
   * Setter method for the COM property "RangeEnd"
   * </p>
   * @param rangeEnd Mandatory int parameter.
   */

  @DISPID(2006) //= 0x7d6. The runtime will prefer the VTID if present
  @VTID(16)
  void rangeEnd(
    int rangeEnd);


  /**
   * <p>
   * Getter method for the COM property "SlideShowName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(2007) //= 0x7d7. The runtime will prefer the VTID if present
  @VTID(17)
  java.lang.String slideShowName();


  /**
   * <p>
   * Setter method for the COM property "SlideShowName"
   * </p>
   * @param slideShowName Mandatory java.lang.String parameter.
   */

  @DISPID(2007) //= 0x7d7. The runtime will prefer the VTID if present
  @VTID(18)
  void slideShowName(
    java.lang.String slideShowName);


  /**
   * <p>
   * Getter method for the COM property "SpeakerNotes"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @DISPID(2008) //= 0x7d8. The runtime will prefer the VTID if present
  @VTID(19)
  office.MsoTriState speakerNotes();


  /**
   * <p>
   * Setter method for the COM property "SpeakerNotes"
   * </p>
   * @param speakerNotes Mandatory office.MsoTriState parameter.
   */

  @DISPID(2008) //= 0x7d8. The runtime will prefer the VTID if present
  @VTID(20)
  void speakerNotes(
    office.MsoTriState speakerNotes);


  /**
   * <p>
   * Getter method for the COM property "FileName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(2009) //= 0x7d9. The runtime will prefer the VTID if present
  @VTID(21)
  java.lang.String fileName();


  /**
   * <p>
   * Setter method for the COM property "FileName"
   * </p>
   * @param fileName Mandatory java.lang.String parameter.
   */

  @DISPID(2009) //= 0x7d9. The runtime will prefer the VTID if present
  @VTID(22)
  void fileName(
    java.lang.String fileName);


  /**
   */

  @DISPID(2010) //= 0x7da. The runtime will prefer the VTID if present
  @VTID(23)
  void publish();


  // Properties:
}
