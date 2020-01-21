package speech.types  ;

import com4j.*;

/**
 * ISpStream Interface
 */
@IID("{12E3CCA9-7518-44C5-A5E7-BA5A79CB929E}")
public interface ISpStream extends speech.types.ISpStreamFormat {
  // Methods:
    /**
     * @param ppStream Mandatory Holder<speech.types.IStream> parameter.
     */

    @VTID(16)
    void getBaseStream(
      Holder<speech.types.IStream> ppStream);


      /**
       */

      @VTID(18)
      void close();


      // Properties:
    }
