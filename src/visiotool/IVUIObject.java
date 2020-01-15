package visiotool  ;

import com4j.*;

@IID("{000D0202-0000-0000-C000-000000000046}")
public interface IVUIObject extends Com4jObject {
  // Methods:
  /**
   */

  @DISPID(1610743808) //= 0x60020000. The runtime will prefer the VTID if present
  @VTID(7)
  void delete();


  /**
   * <p>
   * Getter method for the COM property "Default"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610743809) //= 0x60020001. The runtime will prefer the VTID if present
  @VTID(8)
  java.lang.String _default();


  /**
   * <p>
   * Setter method for the COM property "Name"
   * </p>
   * @param pName Mandatory java.lang.String parameter.
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(9)
  @DefaultMethod
  void name(
    java.lang.String pName);


  /**
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(10)
  @DefaultMethod
  java.lang.String name();


  /**
   * <p>
   * Visio versions 5.0 and later no longer support UIObject flavors.
   * </p>
   * <p>
   * Setter method for the COM property "Flavor"
   * </p>
   * @param pFlavor Mandatory short parameter.
   */

  @DISPID(1610743812) //= 0x60020004. The runtime will prefer the VTID if present
  @VTID(11)
  void flavor(
    short pFlavor);


  /**
   * <p>
   * Visio versions 5.0 and later no longer support UIObject flavors.
   * </p>
   * <p>
   * Getter method for the COM property "Flavor"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(1610743812) //= 0x60020004. The runtime will prefer the VTID if present
  @VTID(12)
  short flavor();


  /**
   * <p>
   * Getter method for the COM property "MenuSets"
   * </p>
   * @return  Returns a value of type VisioTool.IVMenuSets
   */

  @DISPID(1610743814) //= 0x60020006. The runtime will prefer the VTID if present
  @VTID(13)
  visiotool.IVMenuSets menuSets();


  @VTID(13)
  @ReturnValue(defaultPropertyThrough={visiotool.IVMenuSets.class})
  visiotool.IVMenuSet menuSets(
    int lIndex);

  /**
   * <p>
   * Getter method for the COM property "ToolbarSets"
   * </p>
   * @return  Returns a value of type VisioTool.IVToolbarSets
   */

  @DISPID(1610743815) //= 0x60020007. The runtime will prefer the VTID if present
  @VTID(14)
  visiotool.IVToolbarSets toolbarSets();


  @VTID(14)
  @ReturnValue(defaultPropertyThrough={visiotool.IVToolbarSets.class})
  visiotool.IVToolbarSet toolbarSets(
    int lIndex);

  /**
   * <p>
   * StatusBars is obsolete as of Visio 2002.
   * </p>
   * <p>
   * Getter method for the COM property "StatusBars"
   * </p>
   * @return  Returns a value of type VisioTool.IVStatusBars
   */

  @DISPID(1610743816) //= 0x60020008. The runtime will prefer the VTID if present
  @VTID(15)
  visiotool.IVStatusBars statusBars();


  @VTID(15)
  @ReturnValue(defaultPropertyThrough={visiotool.IVStatusBars.class})
  visiotool.IVStatusBar statusBars(
    int lIndex);

  /**
   * <p>
   * Getter method for the COM property "AccelTables"
   * </p>
   * @return  Returns a value of type VisioTool.IVAccelTables
   */

  @DISPID(1610743817) //= 0x60020009. The runtime will prefer the VTID if present
  @VTID(16)
  visiotool.IVAccelTables accelTables();


  @VTID(16)
  @ReturnValue(defaultPropertyThrough={visiotool.IVAccelTables.class})
  visiotool.IVAccelTable accelTables(
    int lIndex);

  /**
   * @param fileName Mandatory java.lang.String parameter.
   */

  @DISPID(1610743818) //= 0x6002000a. The runtime will prefer the VTID if present
  @VTID(17)
  void saveToFile(
    java.lang.String fileName);


  /**
   * @param fileName Mandatory java.lang.String parameter.
   */

  @DISPID(1610743819) //= 0x6002000b. The runtime will prefer the VTID if present
  @VTID(18)
  void loadFromFile(
    java.lang.String fileName);


  /**
   */

  @DISPID(1610743820) //= 0x6002000c. The runtime will prefer the VTID if present
  @VTID(19)
  void updateUI();


  /**
   * <p>
   * Getter method for the COM property "DisplayKeysInTooltips"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610743821) //= 0x6002000d. The runtime will prefer the VTID if present
  @VTID(20)
  boolean displayKeysInTooltips();


  /**
   * <p>
   * Setter method for the COM property "DisplayKeysInTooltips"
   * </p>
   * @param pbShow Mandatory boolean parameter.
   */

  @DISPID(1610743821) //= 0x6002000d. The runtime will prefer the VTID if present
  @VTID(21)
  void displayKeysInTooltips(
    boolean pbShow);


  /**
   * <p>
   * Getter method for the COM property "DisplayTooltips"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610743823) //= 0x6002000f. The runtime will prefer the VTID if present
  @VTID(22)
  boolean displayTooltips();


  /**
   * <p>
   * Setter method for the COM property "DisplayTooltips"
   * </p>
   * @param pbShow Mandatory boolean parameter.
   */

  @DISPID(1610743823) //= 0x6002000f. The runtime will prefer the VTID if present
  @VTID(23)
  void displayTooltips(
    boolean pbShow);


  /**
   * <p>
   * Getter method for the COM property "LargeButtons"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610743825) //= 0x60020011. The runtime will prefer the VTID if present
  @VTID(24)
  boolean largeButtons();


  /**
   * <p>
   * Setter method for the COM property "LargeButtons"
   * </p>
   * @param pbLarge Mandatory boolean parameter.
   */

  @DISPID(1610743825) //= 0x60020011. The runtime will prefer the VTID if present
  @VTID(25)
  void largeButtons(
    boolean pbLarge);


  /**
   * <p>
   * Getter method for the COM property "MenuAnimationStyle"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(1610743827) //= 0x60020013. The runtime will prefer the VTID if present
  @VTID(26)
  short menuAnimationStyle();


  /**
   * <p>
   * Setter method for the COM property "MenuAnimationStyle"
   * </p>
   * @param pAnim Mandatory short parameter.
   */

  @DISPID(1610743827) //= 0x60020013. The runtime will prefer the VTID if present
  @VTID(27)
  void menuAnimationStyle(
    short pAnim);


  /**
   * <p>
   * Getter method for the COM property "Clone"
   * </p>
   * @return  Returns a value of type VisioTool.IVUIObject
   */

  @DISPID(1610743829) //= 0x60020015. The runtime will prefer the VTID if present
  @VTID(28)
  visiotool.IVUIObject clone();


  // Properties:
}
