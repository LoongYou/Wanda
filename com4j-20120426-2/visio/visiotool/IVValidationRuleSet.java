package visiotool  ;

import com4j.*;

@IID("{000D073C-0000-0000-C000-000000000046}")
public interface IVValidationRuleSet extends Com4jObject {
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
   * Getter method for the COM property "Name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(12)
  @DefaultMethod
  java.lang.String name();


  /**
   * <p>
   * Setter method for the COM property "Name"
   * </p>
   * @param name Mandatory java.lang.String parameter.
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(13)
  @DefaultMethod
  void name(
    java.lang.String name);


  /**
   * <p>
   * Getter method for the COM property "NameU"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610743815) //= 0x60020007. The runtime will prefer the VTID if present
  @VTID(14)
  java.lang.String nameU();


  /**
   * <p>
   * Setter method for the COM property "NameU"
   * </p>
   * @param nameU Mandatory java.lang.String parameter.
   */

  @DISPID(1610743815) //= 0x60020007. The runtime will prefer the VTID if present
  @VTID(15)
  void nameU(
    java.lang.String nameU);


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
   * Getter method for the COM property "Enabled"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610743819) //= 0x6002000b. The runtime will prefer the VTID if present
  @VTID(18)
  boolean enabled();


  /**
   * <p>
   * Setter method for the COM property "Enabled"
   * </p>
   * @param isEnabled Mandatory boolean parameter.
   */

  @DISPID(1610743819) //= 0x6002000b. The runtime will prefer the VTID if present
  @VTID(19)
  void enabled(
    boolean isEnabled);


  /**
   * <p>
   * Getter method for the COM property "RuleSetFlags"
   * </p>
   * @return  Returns a value of type visiotool.VisRuleSetFlags
   */

  @DISPID(1610743821) //= 0x6002000d. The runtime will prefer the VTID if present
  @VTID(20)
  visiotool.VisRuleSetFlags ruleSetFlags();


  /**
   * <p>
   * Setter method for the COM property "RuleSetFlags"
   * </p>
   * @param ruleSetFlags Mandatory visiotool.VisRuleSetFlags parameter.
   */

  @DISPID(1610743821) //= 0x6002000d. The runtime will prefer the VTID if present
  @VTID(21)
  void ruleSetFlags(
    visiotool.VisRuleSetFlags ruleSetFlags);


  /**
   * <p>
   * Getter method for the COM property "Rules"
   * </p>
   * @return  Returns a value of type visiotool.IVValidationRules
   */

  @DISPID(1610743823) //= 0x6002000f. The runtime will prefer the VTID if present
  @VTID(22)
  visiotool.IVValidationRules rules();


  @VTID(22)
  @ReturnValue(defaultPropertyThrough={visiotool.IVValidationRules.class})
  visiotool.IVValidationRule rules(
    @MarshalAs(NativeType.VARIANT) java.lang.Object nameUOrIndex);

  /**
   */

  @DISPID(1610743824) //= 0x60020010. The runtime will prefer the VTID if present
  @VTID(23)
  void delete();


  // Properties:
}
