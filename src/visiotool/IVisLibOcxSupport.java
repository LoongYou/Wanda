package visiotool  ;

import com4j.*;

/**
 * Interface to enable VisOcx.DrawingControl interactions with VisLib.
 */
@IID("{000D0D21-0000-0000-C000-000000000046}")
public interface IVisLibOcxSupport extends Com4jObject {
  // Methods:
  /**
   * <p>
   * A string set by the Drawing Control's host application to qualify registry entry lookup. Recommendation: use a GUID.
   * </p>
   * <p>
   * Getter method for the COM property "HostID"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(3)
  java.lang.String hostID();


  /**
   * <p>
   * A string set by the Drawing Control's host application to qualify registry entry lookup. Recommendation: use a GUID.
   * </p>
   * <p>
   * Setter method for the COM property "HostID"
   * </p>
   * @param pbstr Mandatory java.lang.String parameter.
   */

  @VTID(4)
  void hostID(
    java.lang.String pbstr);


  /**
   * <p>
   * The Visio.Window of the inplace active control.
   * </p>
   * <p>
   * Getter method for the COM property "Window"
   * </p>
   * @return  Returns a value of type VisioTool.IVWindow
   */

  @VTID(5)
  visiotool.IVWindow window();


  /**
   * <p>
   * The Visio.Document of the control.
   * </p>
   * <p>
   * Getter method for the COM property "Document"
   * </p>
   * @return  Returns a value of type VisioTool.IVDocument
   */

  @VTID(6)
  visiotool.IVDocument document();


  /**
   * <p>
   * Name of a file to load into the control.
   * </p>
   * <p>
   * Getter method for the COM property "Src"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(7)
  java.lang.String src();


  /**
   * <p>
   * Name of a file to load into the control.
   * </p>
   * <p>
   * Setter method for the COM property "Src"
   * </p>
   * @param pbstr Mandatory java.lang.String parameter.
   */

  @VTID(8)
  void src(
    java.lang.String pbstr);


  /**
   * <p>
   * True if menu negotiation with the container is required.
   * </p>
   * <p>
   * Getter method for the COM property "NegotiateMenus"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(9)
  boolean negotiateMenus();


  /**
   * <p>
   * True if menu negotiation with the container is required.
   * </p>
   * <p>
   * Setter method for the COM property "NegotiateMenus"
   * </p>
   * @param pbVal Mandatory boolean parameter.
   */

  @VTID(10)
  void negotiateMenus(
    boolean pbVal);


  /**
   * <p>
   * True if toolbar negotiation with the container is required.
   * </p>
   * <p>
   * Getter method for the COM property "NegotiateToolbars"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(11)
  boolean negotiateToolbars();


  /**
   * <p>
   * True if toolbar negotiation with the container is required.
   * </p>
   * <p>
   * Setter method for the COM property "NegotiateToolbars"
   * </p>
   * @param pbVal Mandatory boolean parameter.
   */

  @VTID(12)
  void negotiateToolbars(
    boolean pbVal);


  /**
   * <p>
   * Custom method to display an About dialog with information about this installation of the Microsoft Visio 11.0 Drawing Control.
   * </p>
   */

  @VTID(13)
  void about();


  /**
   * <p>
   * Determines how Visio pages react when control resizes or loads a new file via Src.
   * </p>
   * <p>
   * Getter method for the COM property "PageSizingBehavior"
   * </p>
   * @return  Returns a value of type VisioTool.VisPageSizingBehaviors
   */

  @VTID(14)
  visiotool.VisPageSizingBehaviors pageSizingBehavior();


  /**
   * <p>
   * Determines how Visio pages react when control resizes or loads a new file via Src.
   * </p>
   * <p>
   * Setter method for the COM property "PageSizingBehavior"
   * </p>
   * @param peVal Mandatory VisioTool.VisPageSizingBehaviors parameter.
   */

  @VTID(15)
  void pageSizingBehavior(
    visiotool.VisPageSizingBehaviors peVal);


  /**
   * <p>
   * Detemines how the control unloads the Visio application when released.
   * </p>
   * <p>
   * Getter method for the COM property "ShutdownBehavior"
   * </p>
   * @return  Returns a value of type short
   */

  @VTID(16)
  short shutdownBehavior();


  /**
   * <p>
   * Detemines how the control unloads the Visio application when released.
   * </p>
   * <p>
   * Setter method for the COM property "ShutdownBehavior"
   * </p>
   * @param lpVal Mandatory short parameter.
   */

  @VTID(17)
  void shutdownBehavior(
    short lpVal);


  // Properties:
}
