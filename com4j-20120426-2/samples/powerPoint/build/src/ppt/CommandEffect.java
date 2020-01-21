package ppt  ;

import com4j.*;

@IID("{914934EF-5A91-11CF-8700-00AA0060263B}")
public interface CommandEffect extends Com4jObject {
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
   * Getter method for the COM property "Type"
   * </p>
   * @return  Returns a value of type ppt.MsoAnimCommandType
   */

  @DISPID(2003) //= 0x7d3. The runtime will prefer the VTID if present
  @VTID(9)
  ppt.MsoAnimCommandType type();


  /**
   * <p>
   * Setter method for the COM property "Type"
   * </p>
   * @param type Mandatory ppt.MsoAnimCommandType parameter.
   */

  @DISPID(2003) //= 0x7d3. The runtime will prefer the VTID if present
  @VTID(10)
  void type(
    ppt.MsoAnimCommandType type);


  /**
   * <p>
   * Getter method for the COM property "Command"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(2004) //= 0x7d4. The runtime will prefer the VTID if present
  @VTID(11)
  java.lang.String command();


  /**
   * <p>
   * Setter method for the COM property "Command"
   * </p>
   * @param command Mandatory java.lang.String parameter.
   */

  @DISPID(2004) //= 0x7d4. The runtime will prefer the VTID if present
  @VTID(12)
  void command(
    java.lang.String command);


  /**
   * <p>
   * Getter method for the COM property "bookmark"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(2005) //= 0x7d5. The runtime will prefer the VTID if present
  @VTID(13)
  java.lang.String bookmark();


  /**
   * <p>
   * Setter method for the COM property "bookmark"
   * </p>
   * @param bookmark Mandatory java.lang.String parameter.
   */

  @DISPID(2005) //= 0x7d5. The runtime will prefer the VTID if present
  @VTID(14)
  void bookmark(
    java.lang.String bookmark);


  // Properties:
}
