package ppt  ;

import com4j.*;

@IID("{91493466-5A91-11CF-8700-00AA0060263B}")
public interface PageSetup extends Com4jObject {
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
   * Getter method for the COM property "FirstSlideNumber"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(2003) //= 0x7d3. The runtime will prefer the VTID if present
  @VTID(9)
  int firstSlideNumber();


  /**
   * <p>
   * Setter method for the COM property "FirstSlideNumber"
   * </p>
   * @param firstSlideNumber Mandatory int parameter.
   */

  @DISPID(2003) //= 0x7d3. The runtime will prefer the VTID if present
  @VTID(10)
  void firstSlideNumber(
    int firstSlideNumber);


  /**
   * <p>
   * Getter method for the COM property "SlideHeight"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(2004) //= 0x7d4. The runtime will prefer the VTID if present
  @VTID(11)
  float slideHeight();


  /**
   * <p>
   * Setter method for the COM property "SlideHeight"
   * </p>
   * @param slideHeight Mandatory float parameter.
   */

  @DISPID(2004) //= 0x7d4. The runtime will prefer the VTID if present
  @VTID(12)
  void slideHeight(
    float slideHeight);


  /**
   * <p>
   * Getter method for the COM property "SlideWidth"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(2005) //= 0x7d5. The runtime will prefer the VTID if present
  @VTID(13)
  float slideWidth();


  /**
   * <p>
   * Setter method for the COM property "SlideWidth"
   * </p>
   * @param slideWidth Mandatory float parameter.
   */

  @DISPID(2005) //= 0x7d5. The runtime will prefer the VTID if present
  @VTID(14)
  void slideWidth(
    float slideWidth);


  /**
   * <p>
   * Getter method for the COM property "SlideSize"
   * </p>
   * @return  Returns a value of type ppt.PpSlideSizeType
   */

  @DISPID(2006) //= 0x7d6. The runtime will prefer the VTID if present
  @VTID(15)
  ppt.PpSlideSizeType slideSize();


  /**
   * <p>
   * Setter method for the COM property "SlideSize"
   * </p>
   * @param slideSize Mandatory ppt.PpSlideSizeType parameter.
   */

  @DISPID(2006) //= 0x7d6. The runtime will prefer the VTID if present
  @VTID(16)
  void slideSize(
    ppt.PpSlideSizeType slideSize);


  /**
   * <p>
   * Getter method for the COM property "NotesOrientation"
   * </p>
   * @return  Returns a value of type office.MsoOrientation
   */

  @DISPID(2007) //= 0x7d7. The runtime will prefer the VTID if present
  @VTID(17)
  office.MsoOrientation notesOrientation();


  /**
   * <p>
   * Setter method for the COM property "NotesOrientation"
   * </p>
   * @param notesOrientation Mandatory office.MsoOrientation parameter.
   */

  @DISPID(2007) //= 0x7d7. The runtime will prefer the VTID if present
  @VTID(18)
  void notesOrientation(
    office.MsoOrientation notesOrientation);


  /**
   * <p>
   * Getter method for the COM property "SlideOrientation"
   * </p>
   * @return  Returns a value of type office.MsoOrientation
   */

  @DISPID(2008) //= 0x7d8. The runtime will prefer the VTID if present
  @VTID(19)
  office.MsoOrientation slideOrientation();


  /**
   * <p>
   * Setter method for the COM property "SlideOrientation"
   * </p>
   * @param slideOrientation Mandatory office.MsoOrientation parameter.
   */

  @DISPID(2008) //= 0x7d8. The runtime will prefer the VTID if present
  @VTID(20)
  void slideOrientation(
    office.MsoOrientation slideOrientation);


  // Properties:
}
