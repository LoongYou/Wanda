package word  ;

import com4j.*;

@IID("{3834F60F-EE8C-455D-A441-D766675D6D3B}")
public interface Bibliography extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of type word._Application
   */

  @DISPID(100) //= 0x64. The runtime will prefer the VTID if present
  @VTID(7)
  word._Application application();


  /**
   * <p>
   * Getter method for the COM property "Creator"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(101) //= 0x65. The runtime will prefer the VTID if present
  @VTID(8)
  int creator();


  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(102) //= 0x66. The runtime will prefer the VTID if present
  @VTID(9)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject parent();


  /**
   * <p>
   * Getter method for the COM property "Sources"
   * </p>
   * @return  Returns a value of type word.Sources
   */

  @DISPID(103) //= 0x67. The runtime will prefer the VTID if present
  @VTID(10)
  word.Sources sources();


  @VTID(10)
  @ReturnValue(defaultPropertyThrough={word.Sources.class})
  word.Source sources(
    int index);

  /**
   * <p>
   * Getter method for the COM property "BibliographyStyle"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(105) //= 0x69. The runtime will prefer the VTID if present
  @VTID(11)
  java.lang.String bibliographyStyle();


  /**
   * <p>
   * Setter method for the COM property "BibliographyStyle"
   * </p>
   * @param prop Mandatory java.lang.String parameter.
   */

  @DISPID(105) //= 0x69. The runtime will prefer the VTID if present
  @VTID(12)
  void bibliographyStyle(
    java.lang.String prop);


  /**
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(104) //= 0x68. The runtime will prefer the VTID if present
  @VTID(13)
  java.lang.String generateUniqueTag();


  // Properties:
}
