package ppt  ;

import com4j.*;

@IID("{91493474-5A91-11CF-8700-00AA0060263B}")
public interface HeadersFooters extends Com4jObject {
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
   * Getter method for the COM property "DateAndTime"
   * </p>
   * @return  Returns a value of type ppt.HeaderFooter
   */

  @DISPID(2003) //= 0x7d3. The runtime will prefer the VTID if present
  @VTID(9)
  ppt.HeaderFooter dateAndTime();


  /**
   * <p>
   * Getter method for the COM property "SlideNumber"
   * </p>
   * @return  Returns a value of type ppt.HeaderFooter
   */

  @DISPID(2004) //= 0x7d4. The runtime will prefer the VTID if present
  @VTID(10)
  ppt.HeaderFooter slideNumber();


  /**
   * <p>
   * Getter method for the COM property "Header"
   * </p>
   * @return  Returns a value of type ppt.HeaderFooter
   */

  @DISPID(2005) //= 0x7d5. The runtime will prefer the VTID if present
  @VTID(11)
  ppt.HeaderFooter header();


  /**
   * <p>
   * Getter method for the COM property "Footer"
   * </p>
   * @return  Returns a value of type ppt.HeaderFooter
   */

  @DISPID(2006) //= 0x7d6. The runtime will prefer the VTID if present
  @VTID(12)
  ppt.HeaderFooter footer();


  /**
   * <p>
   * Getter method for the COM property "DisplayOnTitleSlide"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @DISPID(2007) //= 0x7d7. The runtime will prefer the VTID if present
  @VTID(13)
  office.MsoTriState displayOnTitleSlide();


  /**
   * <p>
   * Setter method for the COM property "DisplayOnTitleSlide"
   * </p>
   * @param displayOnTitleSlide Mandatory office.MsoTriState parameter.
   */

  @DISPID(2007) //= 0x7d7. The runtime will prefer the VTID if present
  @VTID(14)
  void displayOnTitleSlide(
    office.MsoTriState displayOnTitleSlide);


  /**
   */

  @DISPID(2008) //= 0x7d8. The runtime will prefer the VTID if present
  @VTID(15)
  void clear();


  // Properties:
}
