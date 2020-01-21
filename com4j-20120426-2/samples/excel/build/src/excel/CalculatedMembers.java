package excel  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface CalculatedMembers extends Com4jObject,Iterable<Com4jObject> {
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
   * <p>
   * Getter method for the COM property "Count"
   * </p>
   */

  @DISPID(118)
  @PropGet
  int getCount();


  /**
   * <p>
   * Getter method for the COM property "Item"
   * </p>
   * @param index Mandatory java.lang.Object parameter.
   */

  @DISPID(170)
  @PropGet
  excel.CalculatedMember getItem(
    java.lang.Object index);


  /**
   * <p>
   * Getter method for the COM property "_Default"
   * </p>
   * @param index Mandatory java.lang.Object parameter.
   */

  @DISPID(0)
  @PropGet
  @DefaultMethod
  excel.CalculatedMember get_Default(
    java.lang.Object index);


  /**
   * <p>
   * Getter method for the COM property "_NewEnum"
   * </p>
   */

  @DISPID(-4)
  @PropGet
  java.util.Iterator<Com4jObject> iterator();

  /**
   * @param name Mandatory java.lang.String parameter.
   * @param formula Mandatory java.lang.String parameter.
   * @param solveOrder Optional parameter. Default value is com4j.Variant.getMissing()
   * @param type Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(2085)
  excel.CalculatedMember _Add(
    java.lang.String name,
    java.lang.String formula,
    @Optional java.lang.Object solveOrder,
    @Optional java.lang.Object type);


  /**
   * @param name Mandatory java.lang.String parameter.
   * @param formula Mandatory java.lang.Object parameter.
   * @param solveOrder Optional parameter. Default value is com4j.Variant.getMissing()
   * @param type Optional parameter. Default value is com4j.Variant.getMissing()
   * @param dynamic Optional parameter. Default value is com4j.Variant.getMissing()
   * @param displayFolder Optional parameter. Default value is com4j.Variant.getMissing()
   * @param hierarchizeDistinct Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(181)
  excel.CalculatedMember add(
    java.lang.String name,
    java.lang.Object formula,
    @Optional java.lang.Object solveOrder,
    @Optional java.lang.Object type,
    @Optional java.lang.Object dynamic,
    @Optional java.lang.Object displayFolder,
    @Optional java.lang.Object hierarchizeDistinct);


  // Properties:
}
