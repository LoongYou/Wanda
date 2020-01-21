package speech.types  ;

import com4j.*;

@IID("{0000000C-0000-0000-C000-000000000046}")
public interface IStream extends speech.types.ISequentialStream {
  // Methods:
      /**
       * @param grfCommitFlags Mandatory int parameter.
       */

      @VTID(8)
      void commit(
        int grfCommitFlags);


      /**
       */

      @VTID(9)
      void revert();


          /**
           * @return  Returns a value of type speech.types.IStream
           */

          @VTID(13)
          speech.types.IStream clone();


          // Properties:
        }
