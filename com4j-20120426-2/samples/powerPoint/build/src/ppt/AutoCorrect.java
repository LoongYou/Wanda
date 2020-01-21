package ppt  ;

import com4j.*;

@IID("{914934ED-5A91-11CF-8700-00AA0060263B}")
public interface AutoCorrect extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "DisplayAutoCorrectOptions"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(2001) //= 0x7d1. The runtime will prefer the VTID if present
  @VTID(7)
  boolean displayAutoCorrectOptions();


  /**
   * <p>
   * Setter method for the COM property "DisplayAutoCorrectOptions"
   * </p>
   * @param displayAutoCorrectOptions Mandatory boolean parameter.
   */

  @DISPID(2001) //= 0x7d1. The runtime will prefer the VTID if present
  @VTID(8)
  void displayAutoCorrectOptions(
    boolean displayAutoCorrectOptions);


  /**
   * <p>
   * Getter method for the COM property "DisplayAutoLayoutOptions"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(2002) //= 0x7d2. The runtime will prefer the VTID if present
  @VTID(9)
  boolean displayAutoLayoutOptions();


  /**
   * <p>
   * Setter method for the COM property "DisplayAutoLayoutOptions"
   * </p>
   * @param displayAutoLayoutOptions Mandatory boolean parameter.
   */

  @DISPID(2002) //= 0x7d2. The runtime will prefer the VTID if present
  @VTID(10)
  void displayAutoLayoutOptions(
    boolean displayAutoLayoutOptions);


  // Properties:
}
