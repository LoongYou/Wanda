package word  ;

import com4j.*;

@IID("{5E9A888C-E5DC-4DCB-8308-3C91FB61E6F4}")
public interface SmartTagType extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(7)
  @DefaultMethod
  java.lang.String name();


  /**
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of type word._Application
   */

  @DISPID(1000) //= 0x3e8. The runtime will prefer the VTID if present
  @VTID(8)
  word._Application application();


  /**
   * <p>
   * Getter method for the COM property "Creator"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1001) //= 0x3e9. The runtime will prefer the VTID if present
  @VTID(9)
  int creator();


  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(1002) //= 0x3ea. The runtime will prefer the VTID if present
  @VTID(10)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject parent();


  /**
   * <p>
   * Getter method for the COM property "SmartTagActions"
   * </p>
   * @return  Returns a value of type word.SmartTagActions
   */

  @DISPID(1003) //= 0x3eb. The runtime will prefer the VTID if present
  @VTID(11)
  word.SmartTagActions smartTagActions();


  @VTID(11)
  @ReturnValue(defaultPropertyThrough={word.SmartTagActions.class})
  word.SmartTagAction smartTagActions(
    java.lang.Object index);

  /**
   * <p>
   * Getter method for the COM property "SmartTagRecognizers"
   * </p>
   * @return  Returns a value of type word.SmartTagRecognizers
   */

  @DISPID(1004) //= 0x3ec. The runtime will prefer the VTID if present
  @VTID(12)
  word.SmartTagRecognizers smartTagRecognizers();


  @VTID(12)
  @ReturnValue(defaultPropertyThrough={word.SmartTagRecognizers.class})
  word.SmartTagRecognizer smartTagRecognizers(
    java.lang.Object index);

  /**
   * <p>
   * Getter method for the COM property "FriendlyName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1005) //= 0x3ed. The runtime will prefer the VTID if present
  @VTID(13)
  java.lang.String friendlyName();


  // Properties:
}
