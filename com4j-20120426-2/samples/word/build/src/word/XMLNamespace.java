package word  ;

import com4j.*;

@IID("{B140A023-4850-4DA6-BC5F-CC459C4507BC}")
public interface XMLNamespace extends Com4jObject {
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
   * <p>
   * Getter method for the COM property "URI"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(10)
  java.lang.String uri();


  /**
   * <p>
   * Getter method for the COM property "Location"
   * </p>
   * @param allUsers Optional parameter. Default value is false
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(11)
  java.lang.String location(
    @Optional @DefaultValue("0") boolean allUsers);


  /**
   * <p>
   * Setter method for the COM property "Location"
   * </p>
   * @param allUsers Optional parameter. Default value is false
   * @param prop Mandatory java.lang.String parameter.
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(12)
  void location(
    @Optional @DefaultValue("0") boolean allUsers,
    java.lang.String prop);


  /**
   * <p>
   * Getter method for the COM property "Alias"
   * </p>
   * @param allUsers Optional parameter. Default value is false
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(13)
  java.lang.String alias(
    @Optional @DefaultValue("0") boolean allUsers);


  /**
   * <p>
   * Setter method for the COM property "Alias"
   * </p>
   * @param allUsers Optional parameter. Default value is false
   * @param prop Mandatory java.lang.String parameter.
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(14)
  void alias(
    @Optional @DefaultValue("0") boolean allUsers,
    java.lang.String prop);


  /**
   * <p>
   * Getter method for the COM property "XSLTransforms"
   * </p>
   * @return  Returns a value of type word.XSLTransforms
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(15)
  word.XSLTransforms xslTransforms();


  @VTID(15)
  @ReturnValue(defaultPropertyThrough={word.XSLTransforms.class})
  word.XSLTransform xslTransforms(
    java.lang.Object index);

  /**
   * <p>
   * Getter method for the COM property "DefaultTransform"
   * </p>
   * @param allUsers Optional parameter. Default value is false
   * @return  Returns a value of type word.XSLTransform
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(16)
  word.XSLTransform defaultTransform(
    @Optional @DefaultValue("0") boolean allUsers);


  /**
   * <p>
   * Setter method for the COM property "DefaultTransform"
   * </p>
   * @param allUsers Optional parameter. Default value is false
   * @param prop Mandatory word.XSLTransform parameter.
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(17)
  void defaultTransform(
    @Optional @DefaultValue("0") boolean allUsers,
    word.XSLTransform prop);


  /**
   * @param document Mandatory java.lang.Object parameter.
   */

  @DISPID(100) //= 0x64. The runtime will prefer the VTID if present
  @VTID(18)
  void attachToDocument(
    java.lang.Object document);


  /**
   */

  @DISPID(101) //= 0x65. The runtime will prefer the VTID if present
  @VTID(19)
  void delete();


  // Properties:
}
