package office  ;

import com4j.*;

@IID("{000C03E6-0000-0000-C000-000000000046}")
public interface PickerDialog extends office._IMsoDispObj {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "DataHandlerId"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(9)
  java.lang.String dataHandlerId();


  /**
   * <p>
   * Setter method for the COM property "DataHandlerId"
   * </p>
   * @param id Mandatory java.lang.String parameter.
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(10)
  void dataHandlerId(
    java.lang.String id);


  /**
   * <p>
   * Getter method for the COM property "Title"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(11)
  java.lang.String title();


  /**
   * <p>
   * Setter method for the COM property "Title"
   * </p>
   * @param title Mandatory java.lang.String parameter.
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(12)
  void title(
    java.lang.String title);


  /**
   * <p>
   * Getter method for the COM property "Properties"
   * </p>
   * @return  Returns a value of type office.PickerProperties
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(13)
  office.PickerProperties properties();


  @VTID(13)
  @ReturnValue(defaultPropertyThrough={office.PickerProperties.class})
  office.PickerProperty properties(
    int index);

  /**
   * @return  Returns a value of type office.PickerResults
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(14)
  office.PickerResults createPickerResults();


  @VTID(14)
  @ReturnValue(defaultPropertyThrough={office.PickerResults.class})
  office.PickerResult createPickerResults(
    int index);

  /**
   * @param isMultiSelect Optional parameter. Default value is false
   * @param existingResults Optional parameter. Default value is 0
   * @return  Returns a value of type office.PickerResults
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(15)
  office.PickerResults show(
    @Optional @DefaultValue("-1") boolean isMultiSelect,
    @Optional @DefaultValue("0") office.PickerResults existingResults);


  /**
   * @param tokenText Mandatory java.lang.String parameter.
   * @param duplicateDlgMode Mandatory int parameter.
   * @return  Returns a value of type office.PickerResults
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(16)
  office.PickerResults resolve(
    java.lang.String tokenText,
    int duplicateDlgMode);


  // Properties:
}
