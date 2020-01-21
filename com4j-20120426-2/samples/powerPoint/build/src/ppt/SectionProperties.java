package ppt  ;

import com4j.*;

@IID("{BA72E551-4FF5-48F4-8215-5505F990966F}")
public interface SectionProperties extends Com4jObject {
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
   * Getter method for the COM property "Count"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(2003) //= 0x7d3. The runtime will prefer the VTID if present
  @VTID(9)
  int count();


  /**
   * @param sectionIndex Mandatory int parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(2004) //= 0x7d4. The runtime will prefer the VTID if present
  @VTID(10)
  java.lang.String name(
    int sectionIndex);


  /**
   * @param sectionIndex Mandatory int parameter.
   * @param sectionName Mandatory java.lang.String parameter.
   */

  @DISPID(2005) //= 0x7d5. The runtime will prefer the VTID if present
  @VTID(11)
  void rename(
    int sectionIndex,
    java.lang.String sectionName);


  /**
   * @param sectionIndex Mandatory int parameter.
   * @return  Returns a value of type int
   */

  @DISPID(2006) //= 0x7d6. The runtime will prefer the VTID if present
  @VTID(12)
  int slidesCount(
    int sectionIndex);


  /**
   * @param sectionIndex Mandatory int parameter.
   * @return  Returns a value of type int
   */

  @DISPID(2007) //= 0x7d7. The runtime will prefer the VTID if present
  @VTID(13)
  int firstSlide(
    int sectionIndex);


  /**
   * @param slideIndex Mandatory int parameter.
   * @param sectionName Mandatory java.lang.String parameter.
   * @return  Returns a value of type int
   */

  @DISPID(2008) //= 0x7d8. The runtime will prefer the VTID if present
  @VTID(14)
  int addBeforeSlide(
    int slideIndex,
    java.lang.String sectionName);


  /**
   * @param sectionIndex Mandatory int parameter.
   * @param sectionName Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type int
   */

  @DISPID(2009) //= 0x7d9. The runtime will prefer the VTID if present
  @VTID(15)
  int addSection(
    int sectionIndex,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object sectionName);


  /**
   * @param sectionIndex Mandatory int parameter.
   * @param toPos Mandatory int parameter.
   */

  @DISPID(2010) //= 0x7da. The runtime will prefer the VTID if present
  @VTID(16)
  void move(
    int sectionIndex,
    int toPos);


  /**
   * @param sectionIndex Mandatory int parameter.
   * @param deleteSlides Mandatory boolean parameter.
   */

  @DISPID(2011) //= 0x7db. The runtime will prefer the VTID if present
  @VTID(17)
  void delete(
    int sectionIndex,
    boolean deleteSlides);


  /**
   * @param sectionIndex Mandatory int parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(2012) //= 0x7dc. The runtime will prefer the VTID if present
  @VTID(18)
  java.lang.String sectionID(
    int sectionIndex);


  // Properties:
}
