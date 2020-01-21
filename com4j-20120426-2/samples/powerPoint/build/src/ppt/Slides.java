package ppt  ;

import com4j.*;

@IID("{91493469-5A91-11CF-8700-00AA0060263B}")
public interface Slides extends ppt.Collection {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of type ppt._Application
   */

  @DISPID(2001) //= 0x7d1. The runtime will prefer the VTID if present
  @VTID(10)
  ppt._Application application();


  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(2002) //= 0x7d2. The runtime will prefer the VTID if present
  @VTID(11)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject parent();


  /**
   * @param index Mandatory java.lang.Object parameter.
   * @return  Returns a value of type ppt._Slide
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(12)
  @DefaultMethod
  ppt._Slide item(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);


  /**
   * @param slideID Mandatory int parameter.
   * @return  Returns a value of type ppt._Slide
   */

  @DISPID(2003) //= 0x7d3. The runtime will prefer the VTID if present
  @VTID(13)
  ppt._Slide findBySlideID(
    int slideID);


  /**
   * @param index Mandatory int parameter.
   * @param layout Mandatory ppt.PpSlideLayout parameter.
   * @return  Returns a value of type ppt._Slide
   */

  @DISPID(2004) //= 0x7d4. The runtime will prefer the VTID if present
  @VTID(14)
  ppt._Slide add(
    int index,
    ppt.PpSlideLayout layout);


  /**
   * @param fileName Mandatory java.lang.String parameter.
   * @param index Mandatory int parameter.
   * @param slideStart Optional parameter. Default value is 1
   * @param slideEnd Optional parameter. Default value is -1
   * @return  Returns a value of type int
   */

  @DISPID(2005) //= 0x7d5. The runtime will prefer the VTID if present
  @VTID(15)
  int insertFromFile(
    java.lang.String fileName,
    int index,
    @Optional @DefaultValue("1") int slideStart,
    @Optional @DefaultValue("-1") int slideEnd);


  /**
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type ppt.SlideRange
   */

  @DISPID(2006) //= 0x7d6. The runtime will prefer the VTID if present
  @VTID(16)
  ppt.SlideRange range(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index);


  /**
   * @param index Optional parameter. Default value is -1
   * @return  Returns a value of type ppt.SlideRange
   */

  @DISPID(2007) //= 0x7d7. The runtime will prefer the VTID if present
  @VTID(17)
  ppt.SlideRange paste(
    @Optional @DefaultValue("-1") int index);


  /**
   * @param index Mandatory int parameter.
   * @param pCustomLayout Mandatory ppt.CustomLayout parameter.
   * @return  Returns a value of type ppt._Slide
   */

  @DISPID(2008) //= 0x7d8. The runtime will prefer the VTID if present
  @VTID(18)
  ppt._Slide addSlide(
    int index,
    ppt.CustomLayout pCustomLayout);


  // Properties:
}
