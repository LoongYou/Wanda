package office  ;

import com4j.*;

@IID("{000C0411-0000-0000-C000-000000000046}")
public interface Signature extends office._IMsoDispObj {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Signer"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610809344) //= 0x60030000. The runtime will prefer the VTID if present
  @VTID(9)
  java.lang.String signer();


  /**
   * <p>
   * Getter method for the COM property "Issuer"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610809345) //= 0x60030001. The runtime will prefer the VTID if present
  @VTID(10)
  java.lang.String issuer();


  /**
   * <p>
   * Getter method for the COM property "ExpireDate"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(1610809346) //= 0x60030002. The runtime will prefer the VTID if present
  @VTID(11)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object expireDate();


  /**
   * <p>
   * Getter method for the COM property "IsValid"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610809347) //= 0x60030003. The runtime will prefer the VTID if present
  @VTID(12)
  boolean isValid();


  /**
   * <p>
   * Getter method for the COM property "AttachCertificate"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610809348) //= 0x60030004. The runtime will prefer the VTID if present
  @VTID(13)
  boolean attachCertificate();


  /**
   * <p>
   * Setter method for the COM property "AttachCertificate"
   * </p>
   * @param pvarfAttach Mandatory boolean parameter.
   */

  @DISPID(1610809348) //= 0x60030004. The runtime will prefer the VTID if present
  @VTID(14)
  void attachCertificate(
    boolean pvarfAttach);


  /**
   */

  @DISPID(1610809350) //= 0x60030006. The runtime will prefer the VTID if present
  @VTID(15)
  void delete();


  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(1610809351) //= 0x60030007. The runtime will prefer the VTID if present
  @VTID(16)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject parent();


  /**
   * <p>
   * Getter method for the COM property "IsCertificateExpired"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610809352) //= 0x60030008. The runtime will prefer the VTID if present
  @VTID(17)
  boolean isCertificateExpired();


  /**
   * <p>
   * Getter method for the COM property "IsCertificateRevoked"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610809353) //= 0x60030009. The runtime will prefer the VTID if present
  @VTID(18)
  boolean isCertificateRevoked();


  /**
   * <p>
   * Getter method for the COM property "SignDate"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(1610809354) //= 0x6003000a. The runtime will prefer the VTID if present
  @VTID(19)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object signDate();


  /**
   * <p>
   * Getter method for the COM property "IsSigned"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610809355) //= 0x6003000b. The runtime will prefer the VTID if present
  @VTID(20)
  boolean isSigned();


  /**
   * @param varSigImg Optional parameter. Default value is com4j.Variant.getMissing()
   * @param varDelSuggSigner Optional parameter. Default value is com4j.Variant.getMissing()
   * @param varDelSuggSignerLine2 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param varDelSuggSignerEmail Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(1610809356) //= 0x6003000c. The runtime will prefer the VTID if present
  @VTID(21)
  void sign(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object varSigImg,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object varDelSuggSigner,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object varDelSuggSignerLine2,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object varDelSuggSignerEmail);


  /**
   * <p>
   * Getter method for the COM property "Details"
   * </p>
   * @return  Returns a value of type office.SignatureInfo
   */

  @DISPID(1610809357) //= 0x6003000d. The runtime will prefer the VTID if present
  @VTID(22)
  office.SignatureInfo details();


  /**
   */

  @DISPID(1610809358) //= 0x6003000e. The runtime will prefer the VTID if present
  @VTID(23)
  void showDetails();


  /**
   * <p>
   * Getter method for the COM property "CanSetup"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610809359) //= 0x6003000f. The runtime will prefer the VTID if present
  @VTID(24)
  boolean canSetup();


  /**
   * <p>
   * Getter method for the COM property "Setup"
   * </p>
   * @return  Returns a value of type office.SignatureSetup
   */

  @DISPID(1610809360) //= 0x60030010. The runtime will prefer the VTID if present
  @VTID(25)
  office.SignatureSetup setup();


  /**
   * <p>
   * Getter method for the COM property "IsSignatureLine"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610809361) //= 0x60030011. The runtime will prefer the VTID if present
  @VTID(26)
  boolean isSignatureLine();


  /**
   * <p>
   * Getter method for the COM property "SignatureLineShape"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(1610809362) //= 0x60030012. The runtime will prefer the VTID if present
  @VTID(27)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject signatureLineShape();


  /**
   * <p>
   * Getter method for the COM property "SortHint"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610809363) //= 0x60030013. The runtime will prefer the VTID if present
  @VTID(28)
  int sortHint();


  // Properties:
}
