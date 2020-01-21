package speech.types  ;

import com4j.*;

/**
 * ISpObjectTokenCategory
 */
@IID("{2D3D3845-39AF-4850-BBF9-40B49780011D}")
public interface ISpObjectTokenCategory extends speech.types.ISpDataKey {
  // Methods:
  /**
   * @param pszCategoryId Mandatory java.lang.String parameter.
   * @param fCreateIfNotExist Mandatory int parameter.
   */

  @VTID(15)
  void setId(
    @MarshalAs(NativeType.Unicode) java.lang.String pszCategoryId,
    int fCreateIfNotExist);


  /**
   * @return  Returns a value of type Holder<Short>
   */

  @VTID(16)
  Holder<Short> getId();


  /**
   * @param spdkl Mandatory speech.types.SPDATAKEYLOCATION parameter.
   * @param ppDataKey Mandatory Holder<speech.types.ISpDataKey> parameter.
   */

  @VTID(17)
  void getDataKey(
    speech.types.SPDATAKEYLOCATION spdkl,
    Holder<speech.types.ISpDataKey> ppDataKey);


  /**
   * @param pzsReqAttribs Mandatory java.lang.String parameter.
   * @param pszOptAttribs Mandatory java.lang.String parameter.
   * @return  Returns a value of type speech.types.IEnumSpObjectTokens
   */

  @VTID(18)
  speech.types.IEnumSpObjectTokens enumTokens(
    @MarshalAs(NativeType.Unicode) java.lang.String pzsReqAttribs,
    @MarshalAs(NativeType.Unicode) java.lang.String pszOptAttribs);


  /**
   * @param pszTokenId Mandatory java.lang.String parameter.
   */

  @VTID(19)
  void setDefaultTokenId(
    @MarshalAs(NativeType.Unicode) java.lang.String pszTokenId);


  /**
   * @return  Returns a value of type Holder<Short>
   */

  @VTID(20)
  Holder<Short> getDefaultTokenId();


  // Properties:
}
