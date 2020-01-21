package excel  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface ConnectorFormat extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   */

  @DISPID(148)
  @PropGet
  excel._Application getApplication();


  /**
   * <p>
   * Getter method for the COM property "Creator"
   * </p>
   */

  @DISPID(149)
  @PropGet
  excel.XlCreator getCreator();


  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   */

  @DISPID(150)
  @PropGet
  com4j.Com4jObject getParent();


  /**
   * @param connectedShape Mandatory excel.Shape parameter.
   * @param connectionSite Mandatory int parameter.
   */

  @DISPID(1750)
  void beginConnect(
    excel.Shape connectedShape,
    int connectionSite);


  /**
   */

  @DISPID(1753)
  void beginDisconnect();


  /**
   * @param connectedShape Mandatory excel.Shape parameter.
   * @param connectionSite Mandatory int parameter.
   */

  @DISPID(1754)
  void endConnect(
    excel.Shape connectedShape,
    int connectionSite);


  /**
   */

  @DISPID(1755)
  void endDisconnect();


  /**
   * <p>
   * Getter method for the COM property "BeginConnected"
   * </p>
   */

  @DISPID(1756)
  @PropGet
  office.MsoTriState getBeginConnected();


  /**
   * <p>
   * Getter method for the COM property "BeginConnectedShape"
   * </p>
   */

  @DISPID(1757)
  @PropGet
  excel.Shape getBeginConnectedShape();


  /**
   * <p>
   * Getter method for the COM property "BeginConnectionSite"
   * </p>
   */

  @DISPID(1758)
  @PropGet
  int getBeginConnectionSite();


  /**
   * <p>
   * Getter method for the COM property "EndConnected"
   * </p>
   */

  @DISPID(1759)
  @PropGet
  office.MsoTriState getEndConnected();


  /**
   * <p>
   * Getter method for the COM property "EndConnectedShape"
   * </p>
   */

  @DISPID(1760)
  @PropGet
  excel.Shape getEndConnectedShape();


  /**
   * <p>
   * Getter method for the COM property "EndConnectionSite"
   * </p>
   */

  @DISPID(1761)
  @PropGet
  int getEndConnectionSite();


  /**
   * <p>
   * Getter method for the COM property "Type"
   * </p>
   */

  @DISPID(108)
  @PropGet
  office.MsoConnectorType getType();


  /**
   * <p>
   * Setter method for the COM property "Type"
   * </p>
   * @param rhs Mandatory office.MsoConnectorType parameter.
   */

  @DISPID(108)
  @PropPut
  void setType(
    office.MsoConnectorType rhs);


  // Properties:
}
