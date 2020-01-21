package vba  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface _dispVBComponentsEvents extends Com4jObject {
  // Methods:
  /**
   * @param vbComponent Mandatory vba._VBComponent parameter.
   */

  @DISPID(1)
  void itemAdded(
    vba._VBComponent vbComponent);


  /**
   * @param vbComponent Mandatory vba._VBComponent parameter.
   */

  @DISPID(2)
  void itemRemoved(
    vba._VBComponent vbComponent);


  /**
   * @param vbComponent Mandatory vba._VBComponent parameter.
   * @param oldName Mandatory java.lang.String parameter.
   */

  @DISPID(3)
  void itemRenamed(
    vba._VBComponent vbComponent,
    java.lang.String oldName);


  /**
   * @param vbComponent Mandatory vba._VBComponent parameter.
   */

  @DISPID(4)
  void itemSelected(
    vba._VBComponent vbComponent);


  /**
   * @param vbComponent Mandatory vba._VBComponent parameter.
   */

  @DISPID(5)
  void itemActivated(
    vba._VBComponent vbComponent);


  /**
   * @param vbComponent Mandatory vba._VBComponent parameter.
   */

  @DISPID(6)
  void itemReloaded(
    vba._VBComponent vbComponent);


  // Properties:
}
