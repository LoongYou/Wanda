package office  ;

import com4j.*;

@IID("{000C0360-0000-0000-C000-000000000046}")
public interface AnswerWizard extends office._IMsoDispObj {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(1610809344) //= 0x60030000. The runtime will prefer the VTID if present
  @VTID(9)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject parent();


  /**
   * <p>
   * Getter method for the COM property "Files"
   * </p>
   * @return  Returns a value of type office.AnswerWizardFiles
   */

  @DISPID(1610809345) //= 0x60030001. The runtime will prefer the VTID if present
  @VTID(10)
  office.AnswerWizardFiles files();


  @VTID(10)
  @ReturnValue(defaultPropertyThrough={office.AnswerWizardFiles.class})
  java.lang.String files(
    int index);

  /**
   */

  @DISPID(1610809346) //= 0x60030002. The runtime will prefer the VTID if present
  @VTID(11)
  void clearFileList();


  /**
   */

  @DISPID(1610809347) //= 0x60030003. The runtime will prefer the VTID if present
  @VTID(12)
  void resetFileList();


  // Properties:
}
