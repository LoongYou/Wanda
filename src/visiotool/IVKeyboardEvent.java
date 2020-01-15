package visiotool  ;

import com4j.*;

/**
 * Interface to enable passing relevant info about keyboard messages through Visio automation events.
 */
@IID("{000D072B-0000-0000-C000-000000000046}")
public interface IVKeyboardEvent extends Com4jObject {
  // Methods:
  /**
   * <p>
   * String representation of this object's properties.
   * </p>
   * <p>
   * Getter method for the COM property "ToString"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(7)
  @DefaultMethod
  java.lang.String toString_();


  /**
   * <p>
   * Returns Visio Application instance hosting the object.
   * </p>
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of type VisioTool.IVApplication
   */

  @VTID(8)
  visiotool.IVApplication application();


  /**
   * <p>
   * Returns visObjTypeKeyboardEvent (50).
   * </p>
   * <p>
   * Getter method for the COM property "ObjectType"
   * </p>
   * @return  Returns a value of type VisioTool.tagVisObjectTypes
   */

  @VTID(9)
  visiotool.tagVisObjectTypes objectType();


  /**
   * <p>
   * The Visio.Window associated with this event.
   * </p>
   * <p>
   * Getter method for the COM property "Window"
   * </p>
   * @return  Returns a value of type VisioTool.IVWindow
   */

  @VTID(10)
  visiotool.IVWindow window();


  /**
   * <p>
   * Code associated with KeyDown and KeyUp events.
   * </p>
   * <p>
   * Getter method for the COM property "KeyCode"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(11)
  int keyCode();


  /**
   * <p>
   * Indicates state of mouse buttons and shift and control keys for the KeyDown or KeyUp event.
   * </p>
   * <p>
   * Getter method for the COM property "KeyButtonState"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(12)
  int keyButtonState();


  /**
   * <p>
   * Character associated with KeyPress event.
   * </p>
   * <p>
   * Getter method for the COM property "KeyAscii"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(13)
  int keyAscii();


  /**
   * <p>
   * Getter method for the COM property "Stat"
   * </p>
   * @return  Returns a value of type short
   */

  @VTID(14)
  short stat();


  // Properties:
}
