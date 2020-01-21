package word  ;

import com4j.*;

@IID("{FF06FEF2-DA89-41C0-A0A8-5CD434E210AD}")
public interface ChartCharacters extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(150) //= 0x96. The runtime will prefer the VTID if present
  @VTID(7)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject parent();


  /**
   * <p>
   * Getter method for the COM property "Caption"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(139) //= 0x8b. The runtime will prefer the VTID if present
  @VTID(8)
  java.lang.String caption();


  /**
   * <p>
   * Setter method for the COM property "Caption"
   * </p>
   * @param prop Mandatory java.lang.String parameter.
   */

  @DISPID(139) //= 0x8b. The runtime will prefer the VTID if present
  @VTID(9)
  void caption(
    java.lang.String prop);


  /**
   * <p>
   * Getter method for the COM property "Count"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(118) //= 0x76. The runtime will prefer the VTID if present
  @VTID(10)
  int count();


  /**
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(117) //= 0x75. The runtime will prefer the VTID if present
  @VTID(11)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object delete();


  /**
   * <p>
   * Getter method for the COM property "Font"
   * </p>
   * @return  Returns a value of type word.ChartFont
   */

  @DISPID(146) //= 0x92. The runtime will prefer the VTID if present
  @VTID(12)
  word.ChartFont font();


  /**
   * @param string Mandatory java.lang.String parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(252) //= 0xfc. The runtime will prefer the VTID if present
  @VTID(13)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object insert(
    java.lang.String string);


  /**
   * <p>
   * Getter method for the COM property "Text"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(138) //= 0x8a. The runtime will prefer the VTID if present
  @VTID(14)
  java.lang.String text();


  /**
   * <p>
   * Setter method for the COM property "Text"
   * </p>
   * @param prop Mandatory java.lang.String parameter.
   */

  @DISPID(138) //= 0x8a. The runtime will prefer the VTID if present
  @VTID(15)
  void text(
    java.lang.String prop);


  /**
   * <p>
   * Getter method for the COM property "PhoneticCharacters"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1522) //= 0x5f2. The runtime will prefer the VTID if present
  @VTID(16)
  java.lang.String phoneticCharacters();


  /**
   * <p>
   * Setter method for the COM property "PhoneticCharacters"
   * </p>
   * @param prop Mandatory java.lang.String parameter.
   */

  @DISPID(1522) //= 0x5f2. The runtime will prefer the VTID if present
  @VTID(17)
  void phoneticCharacters(
    java.lang.String prop);


  /**
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(148) //= 0x94. The runtime will prefer the VTID if present
  @VTID(18)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject application();


  /**
   * <p>
   * Getter method for the COM property "Creator"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(149) //= 0x95. The runtime will prefer the VTID if present
  @VTID(19)
  int creator();


  // Properties:
}
