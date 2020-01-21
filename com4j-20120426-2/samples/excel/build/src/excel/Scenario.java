package excel  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface Scenario extends Com4jObject {
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
   * @param changingCells Mandatory java.lang.Object parameter.
   * @param values Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(912)
  java.lang.Object changeScenario(
    java.lang.Object changingCells,
    @Optional java.lang.Object values);


  /**
   * <p>
   * Getter method for the COM property "ChangingCells"
   * </p>
   */

  @DISPID(911)
  @PropGet
  excel.Range getChangingCells();


  /**
   * <p>
   * Getter method for the COM property "Comment"
   * </p>
   */

  @DISPID(910)
  @PropGet
  java.lang.String getComment();


  /**
   * <p>
   * Setter method for the COM property "Comment"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(910)
  @PropPut
  void setComment(
    java.lang.String rhs);


  /**
   */

  @DISPID(117)
  java.lang.Object delete();


  /**
   * <p>
   * Getter method for the COM property "Hidden"
   * </p>
   */

  @DISPID(268)
  @PropGet
  boolean getHidden();


  /**
   * <p>
   * Setter method for the COM property "Hidden"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(268)
  @PropPut
  void setHidden(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "Index"
   * </p>
   */

  @DISPID(486)
  @PropGet
  int getIndex();


  /**
   * <p>
   * Getter method for the COM property "Locked"
   * </p>
   */

  @DISPID(269)
  @PropGet
  boolean getLocked();


  /**
   * <p>
   * Setter method for the COM property "Locked"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(269)
  @PropPut
  void setLocked(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   */

  @DISPID(110)
  @PropGet
  java.lang.String getName();


  /**
   * <p>
   * Setter method for the COM property "Name"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(110)
  @PropPut
  void setName(
    java.lang.String rhs);


  /**
   */

  @DISPID(496)
  java.lang.Object show();


  /**
   * <p>
   * Getter method for the COM property "Values"
   * </p>
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(164)
  @PropGet
  java.lang.Object getValues(
    @Optional java.lang.Object index);


  // Properties:
}
