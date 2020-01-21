package ppt  ;

import com4j.*;

@IID("{91493462-5A91-11CF-8700-00AA0060263B}")
public interface Presentations extends ppt.Collection {
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
   * @return  Returns a value of type ppt._Presentation
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(12)
  @DefaultMethod
  ppt._Presentation item(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);


  /**
   * @param withWindow Optional parameter. Default value is -1
   * @return  Returns a value of type ppt._Presentation
   */

  @DISPID(2003) //= 0x7d3. The runtime will prefer the VTID if present
  @VTID(13)
  ppt._Presentation add(
    @Optional @DefaultValue("-1") office.MsoTriState withWindow);


  /**
   * @param fileName Mandatory java.lang.String parameter.
   * @param readOnly Optional parameter. Default value is 0
   * @param untitled Optional parameter. Default value is 0
   * @param withWindow Optional parameter. Default value is -1
   * @return  Returns a value of type ppt._Presentation
   */

  @DISPID(2004) //= 0x7d4. The runtime will prefer the VTID if present
  @VTID(14)
  ppt._Presentation openOld(
    java.lang.String fileName,
    @Optional @DefaultValue("0") office.MsoTriState readOnly,
    @Optional @DefaultValue("0") office.MsoTriState untitled,
    @Optional @DefaultValue("-1") office.MsoTriState withWindow);


  /**
   * @param fileName Mandatory java.lang.String parameter.
   * @param readOnly Optional parameter. Default value is 0
   * @param untitled Optional parameter. Default value is 0
   * @param withWindow Optional parameter. Default value is -1
   * @return  Returns a value of type ppt._Presentation
   */

  @DISPID(2005) //= 0x7d5. The runtime will prefer the VTID if present
  @VTID(15)
  ppt._Presentation open(
    java.lang.String fileName,
    @Optional @DefaultValue("0") office.MsoTriState readOnly,
    @Optional @DefaultValue("0") office.MsoTriState untitled,
    @Optional @DefaultValue("-1") office.MsoTriState withWindow);


  /**
   * @param fileName Mandatory java.lang.String parameter.
   */

  @DISPID(2006) //= 0x7d6. The runtime will prefer the VTID if present
  @VTID(16)
  void checkOut(
    java.lang.String fileName);


  /**
   * @param fileName Mandatory java.lang.String parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(2007) //= 0x7d7. The runtime will prefer the VTID if present
  @VTID(17)
  boolean canCheckOut(
    java.lang.String fileName);


  /**
   * @param fileName Mandatory java.lang.String parameter.
   * @param readOnly Optional parameter. Default value is 0
   * @param untitled Optional parameter. Default value is 0
   * @param withWindow Optional parameter. Default value is -1
   * @param openAndRepair Optional parameter. Default value is 0
   * @return  Returns a value of type ppt._Presentation
   */

  @DISPID(2008) //= 0x7d8. The runtime will prefer the VTID if present
  @VTID(18)
  ppt._Presentation open2007(
    java.lang.String fileName,
    @Optional @DefaultValue("0") office.MsoTriState readOnly,
    @Optional @DefaultValue("0") office.MsoTriState untitled,
    @Optional @DefaultValue("-1") office.MsoTriState withWindow,
    @Optional @DefaultValue("0") office.MsoTriState openAndRepair);


  // Properties:
}
