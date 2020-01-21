package wsh  ;

import com4j.*;

@IID("{53BAD8C1-E718-11CF-893D-00A0C9054228}")
public interface ITextStream extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Line"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(10000) //= 0x2710. The runtime will prefer the VTID if present
  @VTID(7)
  int line();


  /**
   * <p>
   * Getter method for the COM property "Column"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(-529) //= 0xfffffdef. The runtime will prefer the VTID if present
  @VTID(8)
  int column();


  /**
   * <p>
   * Getter method for the COM property "AtEndOfStream"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(10002) //= 0x2712. The runtime will prefer the VTID if present
  @VTID(9)
  boolean atEndOfStream();


  /**
   * <p>
   * Getter method for the COM property "AtEndOfLine"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(10003) //= 0x2713. The runtime will prefer the VTID if present
  @VTID(10)
  boolean atEndOfLine();


  /**
   * @param characters Mandatory int parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(10004) //= 0x2714. The runtime will prefer the VTID if present
  @VTID(11)
  java.lang.String read(
    int characters);


  /**
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(10005) //= 0x2715. The runtime will prefer the VTID if present
  @VTID(12)
  java.lang.String readLine();


  /**
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(10006) //= 0x2716. The runtime will prefer the VTID if present
  @VTID(13)
  java.lang.String readAll();


  /**
   * @param text Mandatory java.lang.String parameter.
   */

  @DISPID(10007) //= 0x2717. The runtime will prefer the VTID if present
  @VTID(14)
  void write(
    java.lang.String text);


  /**
   * @param text Optional parameter. Default value is ""
   */

  @DISPID(10008) //= 0x2718. The runtime will prefer the VTID if present
  @VTID(15)
  void writeLine(
    @Optional @DefaultValue("") java.lang.String text);


  /**
   * @param lines Mandatory int parameter.
   */

  @DISPID(10009) //= 0x2719. The runtime will prefer the VTID if present
  @VTID(16)
  void writeBlankLines(
    int lines);


  /**
   * @param characters Mandatory int parameter.
   */

  @DISPID(10010) //= 0x271a. The runtime will prefer the VTID if present
  @VTID(17)
  void skip(
    int characters);


  /**
   */

  @DISPID(10011) //= 0x271b. The runtime will prefer the VTID if present
  @VTID(18)
  void skipLine();


  /**
   */

  @DISPID(10012) //= 0x271c. The runtime will prefer the VTID if present
  @VTID(19)
  void close();


  // Properties:
}
