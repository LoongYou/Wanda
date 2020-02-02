package visiotool  ;

import com4j.*;

@IID("{000D073E-0000-0000-C000-000000000046}")
public interface IVValidationRule extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of type visiotool.IVApplication
   */

  @DISPID(1610743808) //= 0x60020000. The runtime will prefer the VTID if present
  @VTID(7)
  visiotool.IVApplication application();


  /**
   * <p>
   * Getter method for the COM property "Stat"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(1610743809) //= 0x60020001. The runtime will prefer the VTID if present
  @VTID(8)
  short stat();


  /**
   * <p>
   * Getter method for the COM property "Document"
   * </p>
   * @return  Returns a value of type visiotool.IVDocument
   */

  @DISPID(1610743810) //= 0x60020002. The runtime will prefer the VTID if present
  @VTID(9)
  visiotool.IVDocument document();


  /**
   * <p>
   * Getter method for the COM property "ObjectType"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(1610743811) //= 0x60020003. The runtime will prefer the VTID if present
  @VTID(10)
  short objectType();


  /**
   * <p>
   * Getter method for the COM property "ID"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610743812) //= 0x60020004. The runtime will prefer the VTID if present
  @VTID(11)
  int id();


  /**
   * <p>
   * Getter method for the COM property "NameU"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(12)
  @DefaultMethod
  java.lang.String nameU();


  /**
   * <p>
   * Setter method for the COM property "NameU"
   * </p>
   * @param nameU Mandatory java.lang.String parameter.
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(13)
  @DefaultMethod
  void nameU(
    java.lang.String nameU);


  /**
   * <p>
   * Getter method for the COM property "Category"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610743815) //= 0x60020007. The runtime will prefer the VTID if present
  @VTID(14)
  java.lang.String category();


  /**
   * <p>
   * Setter method for the COM property "Category"
   * </p>
   * @param category Mandatory java.lang.String parameter.
   */

  @DISPID(1610743815) //= 0x60020007. The runtime will prefer the VTID if present
  @VTID(15)
  void category(
    java.lang.String category);


  /**
   * <p>
   * Getter method for the COM property "Description"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610743817) //= 0x60020009. The runtime will prefer the VTID if present
  @VTID(16)
  java.lang.String description();


  /**
   * <p>
   * Setter method for the COM property "Description"
   * </p>
   * @param description Mandatory java.lang.String parameter.
   */

  @DISPID(1610743817) //= 0x60020009. The runtime will prefer the VTID if present
  @VTID(17)
  void description(
    java.lang.String description);


  /**
   * <p>
   * Getter method for the COM property "Ignored"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610743819) //= 0x6002000b. The runtime will prefer the VTID if present
  @VTID(18)
  boolean ignored();


  /**
   * <p>
   * Setter method for the COM property "Ignored"
   * </p>
   * @param isIgnored Mandatory boolean parameter.
   */

  @DISPID(1610743819) //= 0x6002000b. The runtime will prefer the VTID if present
  @VTID(19)
  void ignored(
    boolean isIgnored);


  /**
   * <p>
   * Getter method for the COM property "FilterExpression"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610743821) //= 0x6002000d. The runtime will prefer the VTID if present
  @VTID(20)
  java.lang.String filterExpression();


  /**
   * <p>
   * Setter method for the COM property "FilterExpression"
   * </p>
   * @param filterExpression Mandatory java.lang.String parameter.
   */

  @DISPID(1610743821) //= 0x6002000d. The runtime will prefer the VTID if present
  @VTID(21)
  void filterExpression(
    java.lang.String filterExpression);


  /**
   * <p>
   * Getter method for the COM property "TargetType"
   * </p>
   * @return  Returns a value of type visiotool.VisRuleTargets
   */

  @DISPID(1610743823) //= 0x6002000f. The runtime will prefer the VTID if present
  @VTID(22)
  visiotool.VisRuleTargets targetType();


  /**
   * <p>
   * Setter method for the COM property "TargetType"
   * </p>
   * @param targetType Mandatory visiotool.VisRuleTargets parameter.
   */

  @DISPID(1610743823) //= 0x6002000f. The runtime will prefer the VTID if present
  @VTID(23)
  void targetType(
    visiotool.VisRuleTargets targetType);


  /**
   * <p>
   * Getter method for the COM property "TestExpression"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610743825) //= 0x60020011. The runtime will prefer the VTID if present
  @VTID(24)
  java.lang.String testExpression();


  /**
   * <p>
   * Setter method for the COM property "TestExpression"
   * </p>
   * @param testExpression Mandatory java.lang.String parameter.
   */

  @DISPID(1610743825) //= 0x60020011. The runtime will prefer the VTID if present
  @VTID(25)
  void testExpression(
    java.lang.String testExpression);


  /**
   * <p>
   * Getter method for the COM property "RuleSet"
   * </p>
   * @return  Returns a value of type visiotool.IVValidationRuleSet
   */

  @DISPID(1610743827) //= 0x60020013. The runtime will prefer the VTID if present
  @VTID(26)
  visiotool.IVValidationRuleSet ruleSet();


  /**
   */

  @DISPID(1610743828) //= 0x60020014. The runtime will prefer the VTID if present
  @VTID(27)
  void delete();


  /**
   * @param targetPage Optional parameter. Default value is unprintable.
   * @param targetShape Optional parameter. Default value is unprintable.
   * @return  Returns a value of type visiotool.IVValidationIssue
   */

  @DISPID(1610743829) //= 0x60020015. The runtime will prefer the VTID if present
  @VTID(28)
  visiotool.IVValidationIssue addIssue(
    @Optional visiotool.IVPage targetPage,
    @Optional visiotool.IVShape targetShape);


  // Properties:
}
