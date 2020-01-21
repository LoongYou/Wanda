package office  ;

import com4j.*;

@IID("{000C0362-0000-0000-C000-000000000046}")
public interface FileDialog extends office._IMsoDispObj {
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
   * Getter method for the COM property "Filters"
   * </p>
   * @return  Returns a value of type office.FileDialogFilters
   */

  @DISPID(1610809345) //= 0x60030001. The runtime will prefer the VTID if present
  @VTID(10)
  office.FileDialogFilters filters();


  @VTID(10)
  @ReturnValue(defaultPropertyThrough={office.FileDialogFilters.class})
  office.FileDialogFilter filters(
    int index);

  /**
   * <p>
   * Getter method for the COM property "FilterIndex"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610809346) //= 0x60030002. The runtime will prefer the VTID if present
  @VTID(11)
  int filterIndex();


  /**
   * <p>
   * Setter method for the COM property "FilterIndex"
   * </p>
   * @param filterIndex Mandatory int parameter.
   */

  @DISPID(1610809346) //= 0x60030002. The runtime will prefer the VTID if present
  @VTID(12)
  void filterIndex(
    int filterIndex);


  /**
   * <p>
   * Getter method for the COM property "Title"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610809348) //= 0x60030004. The runtime will prefer the VTID if present
  @VTID(13)
  java.lang.String title();


  /**
   * <p>
   * Setter method for the COM property "Title"
   * </p>
   * @param title Mandatory java.lang.String parameter.
   */

  @DISPID(1610809348) //= 0x60030004. The runtime will prefer the VTID if present
  @VTID(14)
  void title(
    java.lang.String title);


  /**
   * <p>
   * Getter method for the COM property "ButtonName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610809350) //= 0x60030006. The runtime will prefer the VTID if present
  @VTID(15)
  java.lang.String buttonName();


  /**
   * <p>
   * Setter method for the COM property "ButtonName"
   * </p>
   * @param buttonName Mandatory java.lang.String parameter.
   */

  @DISPID(1610809350) //= 0x60030006. The runtime will prefer the VTID if present
  @VTID(16)
  void buttonName(
    java.lang.String buttonName);


  /**
   * <p>
   * Getter method for the COM property "AllowMultiSelect"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610809352) //= 0x60030008. The runtime will prefer the VTID if present
  @VTID(17)
  boolean allowMultiSelect();


  /**
   * <p>
   * Setter method for the COM property "AllowMultiSelect"
   * </p>
   * @param pvarfAllowMultiSelect Mandatory boolean parameter.
   */

  @DISPID(1610809352) //= 0x60030008. The runtime will prefer the VTID if present
  @VTID(18)
  void allowMultiSelect(
    boolean pvarfAllowMultiSelect);


  /**
   * <p>
   * Getter method for the COM property "InitialView"
   * </p>
   * @return  Returns a value of type office.MsoFileDialogView
   */

  @DISPID(1610809354) //= 0x6003000a. The runtime will prefer the VTID if present
  @VTID(19)
  office.MsoFileDialogView initialView();


  /**
   * <p>
   * Setter method for the COM property "InitialView"
   * </p>
   * @param pinitialview Mandatory office.MsoFileDialogView parameter.
   */

  @DISPID(1610809354) //= 0x6003000a. The runtime will prefer the VTID if present
  @VTID(20)
  void initialView(
    office.MsoFileDialogView pinitialview);


  /**
   * <p>
   * Getter method for the COM property "InitialFileName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610809356) //= 0x6003000c. The runtime will prefer the VTID if present
  @VTID(21)
  java.lang.String initialFileName();


  /**
   * <p>
   * Setter method for the COM property "InitialFileName"
   * </p>
   * @param initialFileName Mandatory java.lang.String parameter.
   */

  @DISPID(1610809356) //= 0x6003000c. The runtime will prefer the VTID if present
  @VTID(22)
  void initialFileName(
    java.lang.String initialFileName);


  /**
   * <p>
   * Getter method for the COM property "SelectedItems"
   * </p>
   * @return  Returns a value of type office.FileDialogSelectedItems
   */

  @DISPID(1610809358) //= 0x6003000e. The runtime will prefer the VTID if present
  @VTID(23)
  office.FileDialogSelectedItems selectedItems();


  @VTID(23)
  @ReturnValue(defaultPropertyThrough={office.FileDialogSelectedItems.class})
  java.lang.String selectedItems(
    int index);

  /**
   * <p>
   * Getter method for the COM property "DialogType"
   * </p>
   * @return  Returns a value of type office.MsoFileDialogType
   */

  @DISPID(1610809359) //= 0x6003000f. The runtime will prefer the VTID if present
  @VTID(24)
  office.MsoFileDialogType dialogType();


  /**
   * <p>
   * Getter method for the COM property "Item"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(25)
  @DefaultMethod
  java.lang.String item();


  /**
   * @return  Returns a value of type int
   */

  @DISPID(1610809361) //= 0x60030011. The runtime will prefer the VTID if present
  @VTID(26)
  int show();


  /**
   */

  @DISPID(1610809362) //= 0x60030012. The runtime will prefer the VTID if present
  @VTID(27)
  void execute();


  // Properties:
}
