package excel  ;

import com4j.*;

@IID("{0002443E-0001-0000-C000-000000000046}")
public interface IConnectorFormat extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of type excel._Application
   */

  @VTID(7)
  excel._Application getApplication();


  /**
   * <p>
   * Getter method for the COM property "Creator"
   * </p>
   * @return  Returns a value of type excel.XlCreator
   */

  @VTID(8)
  excel.XlCreator getCreator();


  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @VTID(9)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject getParent();


  /**
   * @param connectedShape Mandatory excel.Shape parameter.
   * @param connectionSite Mandatory int parameter.
   */

  @VTID(10)
  void beginConnect(
    excel.Shape connectedShape,
    int connectionSite);


  /**
   */

  @VTID(11)
  void beginDisconnect();


  /**
   * @param connectedShape Mandatory excel.Shape parameter.
   * @param connectionSite Mandatory int parameter.
   */

  @VTID(12)
  void endConnect(
    excel.Shape connectedShape,
    int connectionSite);


  /**
   */

  @VTID(13)
  void endDisconnect();


  /**
   * <p>
   * Getter method for the COM property "BeginConnected"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @VTID(14)
  office.MsoTriState getBeginConnected();


  /**
   * <p>
   * Getter method for the COM property "BeginConnectedShape"
   * </p>
   * @return  Returns a value of type excel.Shape
   */

  @VTID(15)
  excel.Shape getBeginConnectedShape();


  /**
   * <p>
   * Getter method for the COM property "BeginConnectionSite"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(16)
  int getBeginConnectionSite();


  /**
   * <p>
   * Getter method for the COM property "EndConnected"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @VTID(17)
  office.MsoTriState getEndConnected();


  /**
   * <p>
   * Getter method for the COM property "EndConnectedShape"
   * </p>
   * @return  Returns a value of type excel.Shape
   */

  @VTID(18)
  excel.Shape getEndConnectedShape();


  /**
   * <p>
   * Getter method for the COM property "EndConnectionSite"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(19)
  int getEndConnectionSite();


  /**
   * <p>
   * Getter method for the COM property "Type"
   * </p>
   * @return  Returns a value of type office.MsoConnectorType
   */

  @VTID(20)
  office.MsoConnectorType getType();


  /**
   * <p>
   * Setter method for the COM property "Type"
   * </p>
   * @param rhs Mandatory office.MsoConnectorType parameter.
   */

  @VTID(21)
  void setType(
    office.MsoConnectorType rhs);


  // Properties:
}
