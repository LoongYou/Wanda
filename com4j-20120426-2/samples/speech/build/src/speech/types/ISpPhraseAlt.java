package speech.types  ;

import com4j.*;

/**
 * ISpPhraseAlt Interface
 */
@IID("{8FCEBC98-4E49-4067-9C6C-D86A0E092E3D}")
public interface ISpPhraseAlt extends speech.types.ISpPhrase {
  // Methods:
  /**
   * @param ppParent Mandatory Holder<speech.types.ISpPhrase> parameter.
   * @param pulStartElementInParent Mandatory Holder<Integer> parameter.
   * @param pcElementsInParent Mandatory Holder<Integer> parameter.
   * @param pcElementsInAlt Mandatory Holder<Integer> parameter.
   */

  @VTID(7)
  void getAltInfo(
    Holder<speech.types.ISpPhrase> ppParent,
    Holder<Integer> pulStartElementInParent,
    Holder<Integer> pcElementsInParent,
    Holder<Integer> pcElementsInAlt);


  /**
   */

  @VTID(8)
  void commit();


  // Properties:
}
