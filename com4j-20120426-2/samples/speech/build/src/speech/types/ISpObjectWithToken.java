package speech.types  ;

import com4j.*;

/**
 * ISpObjectWithToken Interface
 */
@IID("{5B559F40-E952-11D2-BB91-00C04F8EE6C0}")
public interface ISpObjectWithToken extends Com4jObject {
  // Methods:
  /**
   * @param pToken Mandatory speech.types.ISpObjectToken parameter.
   */

  @VTID(3)
  void setObjectToken(
    speech.types.ISpObjectToken pToken);


  /**
   * @param ppToken Mandatory Holder<speech.types.ISpObjectToken> parameter.
   */

  @VTID(4)
  void getObjectToken(
    Holder<speech.types.ISpObjectToken> ppToken);


  // Properties:
}
