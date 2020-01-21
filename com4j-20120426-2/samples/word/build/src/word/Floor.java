package word  ;

import com4j.*;

@IID("{7E64D2BE-2818-48CB-8F8A-CC7B61D9E860}")
public interface Floor extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(110) //= 0x6e. The runtime will prefer the VTID if present
  @VTID(7)
  java.lang.String name();


  /**
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(235) //= 0xeb. The runtime will prefer the VTID if present
  @VTID(8)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object select();


  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(150) //= 0x96. The runtime will prefer the VTID if present
  @VTID(9)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject parent();


  /**
   * <p>
   * Getter method for the COM property "Border"
   * </p>
   * @return  Returns a value of type word.ChartBorder
   */

  @DISPID(128) //= 0x80. The runtime will prefer the VTID if present
  @VTID(10)
  word.ChartBorder border();


  /**
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(112) //= 0x70. The runtime will prefer the VTID if present
  @VTID(11)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object clearFormats();


  /**
   * <p>
   * Getter method for the COM property "Interior"
   * </p>
   * @return  Returns a value of type word.Interior
   */

  @DISPID(129) //= 0x81. The runtime will prefer the VTID if present
  @VTID(12)
  word.Interior interior();


  /**
   * <p>
   * Getter method for the COM property "Fill"
   * </p>
   * @return  Returns a value of type word.ChartFillFormat
   */

  @DISPID(1663) //= 0x67f. The runtime will prefer the VTID if present
  @VTID(13)
  word.ChartFillFormat fill();


  /**
   * <p>
   * Getter method for the COM property "PictureType"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(161) //= 0xa1. The runtime will prefer the VTID if present
  @VTID(14)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object pictureType();


  /**
   * <p>
   * Setter method for the COM property "PictureType"
   * </p>
   * @param prop Mandatory java.lang.Object parameter.
   */

  @DISPID(161) //= 0xa1. The runtime will prefer the VTID if present
  @VTID(15)
  void pictureType(
    @MarshalAs(NativeType.VARIANT) java.lang.Object prop);


  /**
   */

  @DISPID(211) //= 0xd3. The runtime will prefer the VTID if present
  @VTID(16)
  void paste();


  /**
   * <p>
   * Getter method for the COM property "Thickness"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(2419) //= 0x973. The runtime will prefer the VTID if present
  @VTID(17)
  int thickness();


  /**
   * <p>
   * Setter method for the COM property "Thickness"
   * </p>
   * @param prop Mandatory int parameter.
   */

  @DISPID(2419) //= 0x973. The runtime will prefer the VTID if present
  @VTID(18)
  void thickness(
    int prop);


  /**
   * <p>
   * Getter method for the COM property "Format"
   * </p>
   * @return  Returns a value of type word.ChartFormat
   */

  @DISPID(1610743820) //= 0x6002000c. The runtime will prefer the VTID if present
  @VTID(19)
  word.ChartFormat format();


  /**
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(148) //= 0x94. The runtime will prefer the VTID if present
  @VTID(20)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject application();


  /**
   * <p>
   * Getter method for the COM property "Creator"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(149) //= 0x95. The runtime will prefer the VTID if present
  @VTID(21)
  int creator();


  // Properties:
}
