package office  ;

import com4j.*;

@IID("{000C0410-0000-0000-C000-000000000046}")
public interface SignatureSet extends office._IMsoDispObj,Iterable<Com4jObject> {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "_NewEnum"
   * </p>
   */

  @DISPID(-4) //= 0xfffffffc. The runtime will prefer the VTID if present
  @VTID(9)
  java.util.Iterator<Com4jObject> iterator();

  /**
   * <p>
   * Getter method for the COM property "Count"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610809345) //= 0x60030001. The runtime will prefer the VTID if present
  @VTID(10)
  int count();


  /**
   * <p>
   * Getter method for the COM property "Item"
   * </p>
   * @param iSig Mandatory int parameter.
   * @return  Returns a value of type office.Signature
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(11)
  @DefaultMethod
  office.Signature item(
    int iSig);


  /**
   * @return  Returns a value of type office.Signature
   */

  @DISPID(1610809347) //= 0x60030003. The runtime will prefer the VTID if present
  @VTID(12)
  office.Signature add();


  /**
   */

  @DISPID(1610809348) //= 0x60030004. The runtime will prefer the VTID if present
  @VTID(13)
  void commit();


  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(1610809349) //= 0x60030005. The runtime will prefer the VTID if present
  @VTID(14)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject parent();


  /**
   * @param varSigProv Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type office.Signature
   */

  @DISPID(1610809350) //= 0x60030006. The runtime will prefer the VTID if present
  @VTID(15)
  office.Signature addNonVisibleSignature(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object varSigProv);


  /**
   * <p>
   * Getter method for the COM property "CanAddSignatureLine"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610809351) //= 0x60030007. The runtime will prefer the VTID if present
  @VTID(16)
  boolean canAddSignatureLine();


  /**
   * @param varSigProv Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type office.Signature
   */

  @DISPID(1610809352) //= 0x60030008. The runtime will prefer the VTID if present
  @VTID(17)
  office.Signature addSignatureLine(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object varSigProv);


  /**
   * <p>
   * Getter method for the COM property "Subset"
   * </p>
   * @return  Returns a value of type office.MsoSignatureSubset
   */

  @DISPID(1610809353) //= 0x60030009. The runtime will prefer the VTID if present
  @VTID(18)
  office.MsoSignatureSubset subset();


  /**
   * <p>
   * Setter method for the COM property "Subset"
   * </p>
   * @param psubset Mandatory office.MsoSignatureSubset parameter.
   */

  @DISPID(1610809353) //= 0x60030009. The runtime will prefer the VTID if present
  @VTID(19)
  void subset(
    office.MsoSignatureSubset psubset);


  /**
   * <p>
   * Setter method for the COM property "ShowSignaturesPane"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1610809355) //= 0x6003000b. The runtime will prefer the VTID if present
  @VTID(20)
  void showSignaturesPane(
    boolean rhs);


  // Properties:
}
