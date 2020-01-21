package ppt  ;

import com4j.*;

@IID("{914934EE-5A91-11CF-8700-00AA0060263B}")
public interface Options extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "DisplayPasteOptions"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @DISPID(2001) //= 0x7d1. The runtime will prefer the VTID if present
  @VTID(7)
  office.MsoTriState displayPasteOptions();


  /**
   * <p>
   * Setter method for the COM property "DisplayPasteOptions"
   * </p>
   * @param displayPasteOptions Mandatory office.MsoTriState parameter.
   */

  @DISPID(2001) //= 0x7d1. The runtime will prefer the VTID if present
  @VTID(8)
  void displayPasteOptions(
    office.MsoTriState displayPasteOptions);


  /**
   * <p>
   * Getter method for the COM property "DoNotPromptForConvert"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @DISPID(2002) //= 0x7d2. The runtime will prefer the VTID if present
  @VTID(9)
  office.MsoTriState doNotPromptForConvert();


  /**
   * <p>
   * Setter method for the COM property "DoNotPromptForConvert"
   * </p>
   * @param doNotPromptForConvert Mandatory office.MsoTriState parameter.
   */

  @DISPID(2002) //= 0x7d2. The runtime will prefer the VTID if present
  @VTID(10)
  void doNotPromptForConvert(
    office.MsoTriState doNotPromptForConvert);


  /**
   * <p>
   * Getter method for the COM property "ShowCoauthoringMergeChanges"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(2003) //= 0x7d3. The runtime will prefer the VTID if present
  @VTID(11)
  boolean showCoauthoringMergeChanges();


  /**
   * <p>
   * Setter method for the COM property "ShowCoauthoringMergeChanges"
   * </p>
   * @param showCoauthoringMergeChanges Mandatory boolean parameter.
   */

  @DISPID(2003) //= 0x7d3. The runtime will prefer the VTID if present
  @VTID(12)
  void showCoauthoringMergeChanges(
    boolean showCoauthoringMergeChanges);


  // Properties:
}
