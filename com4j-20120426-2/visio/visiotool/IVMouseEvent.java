package visiotool  ;

import com4j.*;

/**
 * Interface to enable passing relevant info about mouse messages through Visio automation events.
 */
@IID("{000D072A-0000-0000-C000-000000000046}")
public interface IVMouseEvent extends Com4jObject {
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
   * @return  Returns a value of type visiotool.IVApplication
   */

  @VTID(8)
  visiotool.IVApplication application();


  /**
   * <p>
   * Returns visObjTypeMouseEvent (49).
   * </p>
   * <p>
   * Getter method for the COM property "ObjectType"
   * </p>
   * @return  Returns a value of type visiotool.tagVisObjectTypes
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
   * @return  Returns a value of type visiotool.IVWindow
   */

  @VTID(10)
  visiotool.IVWindow window();


  /**
   * <p>
   * Which mouse button was clicked for MouseDown or MouseUp event.
   * </p>
   * <p>
   * Getter method for the COM property "Button"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(11)
  int button();


  /**
   * <p>
   * Indicates state of mouse buttons and shift and control keys for the event.
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
   * Indicates x coordinate of mouse event in Visio.Window specific coordinates.
   * </p>
   * <p>
   * Getter method for the COM property "x"
   * </p>
   * @return  Returns a value of type double
   */

  @VTID(13)
  double x();


  /**
   * <p>
   * Indicates y coordinate of mouse event in Visio.Window specific coordinates.
   * </p>
   * <p>
   * Getter method for the COM property "y"
   * </p>
   * @return  Returns a value of type double
   */

  @VTID(14)
  double y();


  /**
   * <p>
   * Indicates drag state of a mouse move operation
   * </p>
   * <p>
   * Getter method for the COM property "DragState"
   * </p>
   * @return  Returns a value of type visiotool.VisMouseMoveDragStates
   */

  @VTID(15)
  visiotool.VisMouseMoveDragStates dragState();


  /**
   * <p>
   * Getter method for the COM property "Stat"
   * </p>
   * @return  Returns a value of type short
   */

  @VTID(16)
  short stat();


  // Properties:
}
