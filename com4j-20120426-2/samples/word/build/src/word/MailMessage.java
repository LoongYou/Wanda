package word  ;

import com4j.*;

@IID("{000209BA-0000-0000-C000-000000000046}")
public interface MailMessage extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of type word._Application
   */

  @DISPID(1000) //= 0x3e8. The runtime will prefer the VTID if present
  @VTID(7)
  word._Application application();


  /**
   * <p>
   * Getter method for the COM property "Creator"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1001) //= 0x3e9. The runtime will prefer the VTID if present
  @VTID(8)
  int creator();


  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(1002) //= 0x3ea. The runtime will prefer the VTID if present
  @VTID(9)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject parent();


  /**
   */

  @DISPID(334) //= 0x14e. The runtime will prefer the VTID if present
  @VTID(10)
  void checkName();


  /**
   */

  @DISPID(335) //= 0x14f. The runtime will prefer the VTID if present
  @VTID(11)
  void delete();


  /**
   */

  @DISPID(336) //= 0x150. The runtime will prefer the VTID if present
  @VTID(12)
  void displayMoveDialog();


  /**
   */

  @DISPID(337) //= 0x151. The runtime will prefer the VTID if present
  @VTID(13)
  void displayProperties();


  /**
   */

  @DISPID(338) //= 0x152. The runtime will prefer the VTID if present
  @VTID(14)
  void displaySelectNamesDialog();


  /**
   */

  @DISPID(339) //= 0x153. The runtime will prefer the VTID if present
  @VTID(15)
  void forward();


  /**
   */

  @DISPID(340) //= 0x154. The runtime will prefer the VTID if present
  @VTID(16)
  void goToNext();


  /**
   */

  @DISPID(341) //= 0x155. The runtime will prefer the VTID if present
  @VTID(17)
  void goToPrevious();


  /**
   */

  @DISPID(342) //= 0x156. The runtime will prefer the VTID if present
  @VTID(18)
  void reply();


  /**
   */

  @DISPID(343) //= 0x157. The runtime will prefer the VTID if present
  @VTID(19)
  void replyAll();


  /**
   */

  @DISPID(344) //= 0x158. The runtime will prefer the VTID if present
  @VTID(20)
  void toggleHeader();


  // Properties:
}
