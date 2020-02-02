package visiotool  ;

import com4j.*;

@IID("{000D070B-0000-0000-C000-000000000046}")
public interface IVSelection extends Com4jObject,Iterable<Com4jObject> {
  // Methods:
  /**
   * <p>
   * Returns Visio Application instance hosting the object.
   * </p>
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of type visiotool.IVApplication
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(7)
  visiotool.IVApplication application();


  /**
   * <p>
   * Getter method for the COM property "Stat"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(8)
  short stat();


  /**
   * <p>
   * Returns visObjTypeSelection (16).
   * </p>
   * <p>
   * Getter method for the COM property "ObjectType"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(9)
  short objectType();


  /**
   * <p>
   * Getter method for the COM property "Item16"
   * </p>
   * @param index Mandatory short parameter.
   * @return  Returns a value of type visiotool.IVShape
   */

  @DISPID(999) //= 0x3e7. The runtime will prefer the VTID if present
  @VTID(10)
  visiotool.IVShape item16(
    short index);


  /**
   * <p>
   * Getter method for the COM property "Count16"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(11)
  short count16();


  /**
   * @param fileName Mandatory java.lang.String parameter.
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(12)
  void export(
    java.lang.String fileName);


  /**
   * <p>
   * Getter method for the COM property "Document"
   * </p>
   * @return  Returns a value of type visiotool.IVDocument
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(13)
  visiotool.IVDocument document();


  /**
   * <p>
   * Getter method for the COM property "ContainingPage"
   * </p>
   * @return  Returns a value of type visiotool.IVPage
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(14)
  visiotool.IVPage containingPage();


  /**
   * <p>
   * Getter method for the COM property "ContainingMaster"
   * </p>
   * @return  Returns a value of type visiotool.IVMaster
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(15)
  visiotool.IVMaster containingMaster();


  /**
   * <p>
   * Getter method for the COM property "ContainingShape"
   * </p>
   * @return  Returns a value of type visiotool.IVShape
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(16)
  visiotool.IVShape containingShape();


  /**
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(17)
  void bringForward();


  /**
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(18)
  void bringToFront();


  /**
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(19)
  void sendBackward();


  /**
   */

  @DISPID(13) //= 0xd. The runtime will prefer the VTID if present
  @VTID(20)
  void sendToBack();


  /**
   * <p>
   * Locale specific name of style applied to this selection.
   * </p>
   * <p>
   * Getter method for the COM property "Style"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(14) //= 0xe. The runtime will prefer the VTID if present
  @VTID(21)
  java.lang.String style();


  /**
   * <p>
   * Locale specific name of style applied to this selection.
   * </p>
   * <p>
   * Setter method for the COM property "Style"
   * </p>
   * @param lpLocaleSpecificStyleName Mandatory java.lang.String parameter.
   */

  @DISPID(14) //= 0xe. The runtime will prefer the VTID if present
  @VTID(22)
  void style(
    java.lang.String lpLocaleSpecificStyleName);


  /**
   * <p>
   * Locale specific name of style to apply to this selection while keeping local overrides.
   * </p>
   * <p>
   * Setter method for the COM property "StyleKeepFmt"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(15) //= 0xf. The runtime will prefer the VTID if present
  @VTID(23)
  void styleKeepFmt(
    java.lang.String rhs);


  /**
   * <p>
   * Locale specific name of line style applied to this selection.
   * </p>
   * <p>
   * Getter method for the COM property "LineStyle"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(16) //= 0x10. The runtime will prefer the VTID if present
  @VTID(24)
  java.lang.String lineStyle();


  /**
   * <p>
   * Locale specific name of line style applied to this selection.
   * </p>
   * <p>
   * Setter method for the COM property "LineStyle"
   * </p>
   * @param lpLocaleSpecificStyleName Mandatory java.lang.String parameter.
   */

  @DISPID(16) //= 0x10. The runtime will prefer the VTID if present
  @VTID(25)
  void lineStyle(
    java.lang.String lpLocaleSpecificStyleName);


  /**
   * <p>
   * Locale specific name of line style to apply to this selection while keeping local overrides.
   * </p>
   * <p>
   * Setter method for the COM property "LineStyleKeepFmt"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(17) //= 0x11. The runtime will prefer the VTID if present
  @VTID(26)
  void lineStyleKeepFmt(
    java.lang.String rhs);


  /**
   * <p>
   * Locale specific name of fill style applied to this selection.
   * </p>
   * <p>
   * Getter method for the COM property "FillStyle"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(18) //= 0x12. The runtime will prefer the VTID if present
  @VTID(27)
  java.lang.String fillStyle();


  /**
   * <p>
   * Locale specific name of fill style applied to this selection.
   * </p>
   * <p>
   * Setter method for the COM property "FillStyle"
   * </p>
   * @param lpLocaleSpecificStyleName Mandatory java.lang.String parameter.
   */

  @DISPID(18) //= 0x12. The runtime will prefer the VTID if present
  @VTID(28)
  void fillStyle(
    java.lang.String lpLocaleSpecificStyleName);


  /**
   * <p>
   * Locale specific name of fill style to apply to this selection while keeping local overrides.
   * </p>
   * <p>
   * Setter method for the COM property "FillStyleKeepFmt"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(19) //= 0x13. The runtime will prefer the VTID if present
  @VTID(29)
  void fillStyleKeepFmt(
    java.lang.String rhs);


  /**
   * <p>
   * Locale specific name of text style applied to this selection.
   * </p>
   * <p>
   * Getter method for the COM property "TextStyle"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(20) //= 0x14. The runtime will prefer the VTID if present
  @VTID(30)
  java.lang.String textStyle();


  /**
   * <p>
   * Locale specific name of text style applied to this selection.
   * </p>
   * <p>
   * Setter method for the COM property "TextStyle"
   * </p>
   * @param lpLocaleSpecificStyleName Mandatory java.lang.String parameter.
   */

  @DISPID(20) //= 0x14. The runtime will prefer the VTID if present
  @VTID(31)
  void textStyle(
    java.lang.String lpLocaleSpecificStyleName);


  /**
   * <p>
   * Locale specific name of text style to apply to this selection while keeping local overrides.
   * </p>
   * <p>
   * Setter method for the COM property "TextStyleKeepFmt"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(21) //= 0x15. The runtime will prefer the VTID if present
  @VTID(32)
  void textStyleKeepFmt(
    java.lang.String rhs);


  /**
   */

  @DISPID(22) //= 0x16. The runtime will prefer the VTID if present
  @VTID(33)
  void combine();


  /**
   */

  @DISPID(23) //= 0x17. The runtime will prefer the VTID if present
  @VTID(34)
  void fragment();


  /**
   */

  @DISPID(24) //= 0x18. The runtime will prefer the VTID if present
  @VTID(35)
  void intersect();


  /**
   */

  @DISPID(25) //= 0x19. The runtime will prefer the VTID if present
  @VTID(36)
  void subtract();


  /**
   */

  @DISPID(26) //= 0x1a. The runtime will prefer the VTID if present
  @VTID(37)
  void union();


  /**
   */

  @DISPID(27) //= 0x1b. The runtime will prefer the VTID if present
  @VTID(38)
  void flipHorizontal();


  /**
   */

  @DISPID(28) //= 0x1c. The runtime will prefer the VTID if present
  @VTID(39)
  void flipVertical();


  /**
   */

  @DISPID(29) //= 0x1d. The runtime will prefer the VTID if present
  @VTID(40)
  void reverseEnds();


  /**
   */

  @DISPID(30) //= 0x1e. The runtime will prefer the VTID if present
  @VTID(41)
  void rotate90();


  /**
   */

  @DISPID(31) //= 0x1f. The runtime will prefer the VTID if present
  @VTID(42)
  void old_Copy();


  /**
   */

  @DISPID(32) //= 0x20. The runtime will prefer the VTID if present
  @VTID(43)
  void old_Cut();


  /**
   */

  @DISPID(33) //= 0x21. The runtime will prefer the VTID if present
  @VTID(44)
  void delete();


  /**
   */

  @DISPID(34) //= 0x22. The runtime will prefer the VTID if present
  @VTID(45)
  void voidDuplicate();


  /**
   */

  @DISPID(35) //= 0x23. The runtime will prefer the VTID if present
  @VTID(46)
  void voidGroup();


  /**
   */

  @DISPID(36) //= 0x24. The runtime will prefer the VTID if present
  @VTID(47)
  void convertToGroup();


  /**
   */

  @DISPID(37) //= 0x25. The runtime will prefer the VTID if present
  @VTID(48)
  void ungroup();


  /**
   */

  @DISPID(38) //= 0x26. The runtime will prefer the VTID if present
  @VTID(49)
  void selectAll();


  /**
   */

  @DISPID(39) //= 0x27. The runtime will prefer the VTID if present
  @VTID(50)
  void deselectAll();


  /**
   * @param sheetObject Mandatory visiotool.IVShape parameter.
   * @param selectAction Mandatory short parameter.
   */

  @DISPID(40) //= 0x28. The runtime will prefer the VTID if present
  @VTID(51)
  void select(
    visiotool.IVShape sheetObject,
    short selectAction);


  /**
   * <p>
   * Getter method for the COM property "EventList"
   * </p>
   * @return  Returns a value of type visiotool.IVEventList
   */

  @DISPID(41) //= 0x29. The runtime will prefer the VTID if present
  @VTID(52)
  visiotool.IVEventList eventList();


  @VTID(52)
  @ReturnValue(defaultPropertyThrough={visiotool.IVEventList.class})
  visiotool.IVEvent eventList(
    short index);

  /**
   * <p>
   * Getter method for the COM property "PersistsEvents"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(42) //= 0x2a. The runtime will prefer the VTID if present
  @VTID(53)
  short persistsEvents();


  /**
   */

  @DISPID(43) //= 0x2b. The runtime will prefer the VTID if present
  @VTID(54)
  void trim();


  /**
   */

  @DISPID(44) //= 0x2c. The runtime will prefer the VTID if present
  @VTID(55)
  void join();


  /**
   * @param tolerance Mandatory double parameter.
   * @param flags Mandatory short parameter.
   */

  @DISPID(45) //= 0x2d. The runtime will prefer the VTID if present
  @VTID(56)
  void fitCurve(
    double tolerance,
    short flags);


  /**
   */

  @DISPID(46) //= 0x2e. The runtime will prefer the VTID if present
  @VTID(57)
  void layout();


  /**
   * @param flags Mandatory short parameter.
   * @param lpr8Left Mandatory Holder<Double> parameter.
   * @param lpr8Bottom Mandatory Holder<Double> parameter.
   * @param lpr8Right Mandatory Holder<Double> parameter.
   * @param lpr8Top Mandatory Holder<Double> parameter.
   */

  @DISPID(47) //= 0x2f. The runtime will prefer the VTID if present
  @VTID(58)
  void boundingBox(
    short flags,
    Holder<Double> lpr8Left,
    Holder<Double> lpr8Bottom,
    Holder<Double> lpr8Right,
    Holder<Double> lpr8Top);


  /**
   * <p>
   * The first item in a Selection is item 1.
   * </p>
   * <p>
   * Getter method for the COM property "Item"
   * </p>
   * @param index Mandatory int parameter.
   * @return  Returns a value of type visiotool.IVShape
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(59)
  @DefaultMethod
  visiotool.IVShape item(
    int index);


  /**
   * <p>
   * Getter method for the COM property "Count"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(48) //= 0x30. The runtime will prefer the VTID if present
  @VTID(60)
  int count();


  /**
   * @param tolerance Mandatory double parameter.
   * @param flags Mandatory short parameter.
   * @param x Optional parameter. Default value is com4j.Variant.getMissing()
   * @param y Optional parameter. Default value is com4j.Variant.getMissing()
   * @param resultsMaster Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type visiotool.IVShape
   */

  @DISPID(49) //= 0x31. The runtime will prefer the VTID if present
  @VTID(61)
  visiotool.IVShape drawRegion(
    double tolerance,
    short flags,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object x,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object y,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object resultsMaster);


  /**
   * <p>
   * Getter method for the COM property "_NewEnum"
   * </p>
   */

  @DISPID(-4) //= 0xfffffffc. The runtime will prefer the VTID if present
  @VTID(62)
  java.util.Iterator<Com4jObject> iterator();

  /**
   * <p>
   * Include/Exclude items that are sub/super selected.
   * </p>
   * <p>
   * Getter method for the COM property "IterationMode"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(50) //= 0x32. The runtime will prefer the VTID if present
  @VTID(63)
  int iterationMode();


  /**
   * <p>
   * Include/Exclude items that are sub/super selected.
   * </p>
   * <p>
   * Setter method for the COM property "IterationMode"
   * </p>
   * @param lpi4Ret Mandatory int parameter.
   */

  @DISPID(50) //= 0x32. The runtime will prefer the VTID if present
  @VTID(64)
  void iterationMode(
    int lpi4Ret);


  /**
   * <p>
   * Is Item(i) sub-selection, super-selection, etc.
   * </p>
   * <p>
   * Getter method for the COM property "ItemStatus"
   * </p>
   * @param index Mandatory int parameter.
   * @return  Returns a value of type short
   */

  @DISPID(51) //= 0x33. The runtime will prefer the VTID if present
  @VTID(65)
  short itemStatus(
    int index);


  /**
   * <p>
   * Returns primary selected shape or nothing.
   * </p>
   * <p>
   * Getter method for the COM property "PrimaryItem"
   * </p>
   * @return  Returns a value of type visiotool.IVShape
   */

  @DISPID(52) //= 0x34. The runtime will prefer the VTID if present
  @VTID(66)
  visiotool.IVShape primaryItem();


  /**
   * <p>
   * Getter method for the COM property "Picture"
   * </p>
   * @return  Returns a value of type Holder<com4j.stdole.IPictureDisp>
   */

  @DISPID(1610743868) //= 0x6002003c. The runtime will prefer the VTID if present
  @VTID(67)
  Holder<com4j.stdole.IPictureDisp> picture();


  /**
   * <p>
   * Returns the created group shape
   * </p>
   * @return  Returns a value of type visiotool.IVShape
   */

  @DISPID(1610743869) //= 0x6002003d. The runtime will prefer the VTID if present
  @VTID(68)
  visiotool.IVShape group();


  /**
   * <p>
   * Performs end point and glue swapping on 1D shapes
   * </p>
   */

  @DISPID(1610743870) //= 0x6002003e. The runtime will prefer the VTID if present
  @VTID(69)
  void swapEnds();


  /**
   */

  @DISPID(1610743871) //= 0x6002003f. The runtime will prefer the VTID if present
  @VTID(70)
  void addToGroup();


  /**
   */

  @DISPID(1610743872) //= 0x60020040. The runtime will prefer the VTID if present
  @VTID(71)
  void removeFromGroup();


  /**
   * <p>
   * Returns a Selection containing all the duplicated shapes.
   * </p>
   * @return  Returns a value of type visiotool.IVSelection
   */

  @DISPID(1610743873) //= 0x60020041. The runtime will prefer the VTID if present
  @VTID(72)
  visiotool.IVSelection duplicate();


  @VTID(72)
  @ReturnValue(defaultPropertyThrough={visiotool.IVSelection.class})
  visiotool.IVShape duplicate(
    int index);

  /**
   * @param flags Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(1610743874) //= 0x60020042. The runtime will prefer the VTID if present
  @VTID(73)
  void copy(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object flags);


  /**
   * @param flags Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(1610743875) //= 0x60020043. The runtime will prefer the VTID if present
  @VTID(74)
  void cut(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object flags);


  /**
   * <p>
   * Move selection by dx in the X-direction and dy in the Y-direction.
   * </p>
   * @param dx Mandatory double parameter.
   * @param dy Mandatory double parameter.
   * @param unitsNameOrCode Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(1610743876) //= 0x60020044. The runtime will prefer the VTID if present
  @VTID(75)
  void move(
    double dx,
    double dy,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object unitsNameOrCode);


  /**
   * @param angle Mandatory double parameter.
   * @param angleUnitsNameOrCode Optional parameter. Default value is com4j.Variant.getMissing()
   * @param blastGuards Optional parameter. Default value is false
   * @param rotationType Optional parameter. Default value is 0
   * @param pinX Optional parameter. Default value is 0.0
   * @param pinY Optional parameter. Default value is 0.0
   * @param pinUnitsNameOrCode Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(1610743877) //= 0x60020045. The runtime will prefer the VTID if present
  @VTID(76)
  void rotate(
    double angle,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object angleUnitsNameOrCode,
    @Optional @DefaultValue("0") boolean blastGuards,
    @Optional @DefaultValue("0") visiotool.VisRotationTypes rotationType,
    @Optional @DefaultValue("0") double pinX,
    @Optional @DefaultValue("0") double pinY,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object pinUnitsNameOrCode);


  /**
   * @param alignHorizontal Mandatory visiotool.VisHorizontalAlignTypes parameter.
   * @param alignVertical Mandatory visiotool.VisVerticalAlignTypes parameter.
   * @param glueToGuide Optional parameter. Default value is false
   */

  @DISPID(1610743878) //= 0x60020046. The runtime will prefer the VTID if present
  @VTID(77)
  void align(
    visiotool.VisHorizontalAlignTypes alignHorizontal,
    visiotool.VisVerticalAlignTypes alignVertical,
    @Optional @DefaultValue("0") boolean glueToGuide);


  /**
   * @param distribute Mandatory visiotool.VisDistributeTypes parameter.
   * @param glueToGuide Optional parameter. Default value is false
   */

  @DISPID(1610743879) //= 0x60020047. The runtime will prefer the VTID if present
  @VTID(78)
  void distribute(
    visiotool.VisDistributeTypes distribute,
    @Optional @DefaultValue("0") boolean glueToGuide);


  /**
   */

  @DISPID(1610743880) //= 0x60020048. The runtime will prefer the VTID if present
  @VTID(79)
  void updateAlignmentBox();


  /**
   * @param distance Mandatory double parameter.
   */

  @DISPID(1610743881) //= 0x60020049. The runtime will prefer the VTID if present
  @VTID(80)
  void offset(
    double distance);


  /**
   */

  @DISPID(1610743882) //= 0x6002004a. The runtime will prefer the VTID if present
  @VTID(81)
  void connectShapes();


  /**
   * @param flipDirection Mandatory visiotool.VisFlipDirection parameter.
   * @param flipType Optional parameter. Default value is 0
   * @param blastGuards Optional parameter. Default value is false
   * @param pinX Optional parameter. Default value is 0.0
   * @param pinY Optional parameter. Default value is 0.0
   * @param pinUnitsNameOrCode Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(1610743883) //= 0x6002004b. The runtime will prefer the VTID if present
  @VTID(82)
  void flip(
    visiotool.VisFlipDirection flipDirection,
    @Optional @DefaultValue("0") visiotool.VisFlipTypes flipType,
    @Optional @DefaultValue("0") boolean blastGuards,
    @Optional @DefaultValue("0") double pinX,
    @Optional @DefaultValue("0") double pinY,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object pinUnitsNameOrCode);


  /**
   * <p>
   * Getter method for the COM property "ContainingPageID"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610743884) //= 0x6002004c. The runtime will prefer the VTID if present
  @VTID(83)
  int containingPageID();


  /**
   * <p>
   * Getter method for the COM property "ContainingMasterID"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610743885) //= 0x6002004d. The runtime will prefer the VTID if present
  @VTID(84)
  int containingMasterID();


  /**
   * @param dataRecordsetID Mandatory int parameter.
   * @param dataRowID Mandatory int parameter.
   * @param applyDataGraphicAfterLink Optional parameter. Default value is false
   */

  @DISPID(1610743886) //= 0x6002004e. The runtime will prefer the VTID if present
  @VTID(85)
  void linkToData(
    int dataRecordsetID,
    int dataRowID,
    @Optional @DefaultValue("-1") boolean applyDataGraphicAfterLink);


  /**
   * @param dataRecordsetID Mandatory int parameter.
   */

  @DISPID(1610743887) //= 0x6002004f. The runtime will prefer the VTID if present
  @VTID(86)
  void breakLinkToData(
    int dataRecordsetID);


  /**
   * @return  Returns a value of type int[]
   */

  @DISPID(1610743888) //= 0x60020050. The runtime will prefer the VTID if present
  @VTID(87)
  int[] getIDs();


    /**
     * <p>
     * Getter method for the COM property "DataGraphic"
     * </p>
     * @return  Returns a value of type visiotool.IVMaster
     */

    @DISPID(1610743890) //= 0x60020052. The runtime will prefer the VTID if present
    @VTID(89)
    visiotool.IVMaster dataGraphic();


    /**
     * <p>
     * Setter method for the COM property "DataGraphic"
     * </p>
     * @param dataGraphic Mandatory visiotool.IVMaster parameter.
     */

    @DISPID(1610743890) //= 0x60020052. The runtime will prefer the VTID if present
    @VTID(90)
    void dataGraphic(
      visiotool.IVMaster dataGraphic);


    /**
     * @param alignOrSpace Mandatory visiotool.VisLayoutIncrementalType parameter.
     * @param alignHorizontal Mandatory visiotool.VisLayoutHorzAlignType parameter.
     * @param alignVertical Mandatory visiotool.VisLayoutVertAlignType parameter.
     * @param spaceHorizontal Mandatory double parameter.
     * @param spaceVertical Mandatory double parameter.
     * @param unitCode Mandatory visiotool.tagVisUnitCodes parameter.
     */

    @DISPID(1610743892) //= 0x60020054. The runtime will prefer the VTID if present
    @VTID(91)
    void layoutIncremental(
      visiotool.VisLayoutIncrementalType alignOrSpace,
      visiotool.VisLayoutHorzAlignType alignHorizontal,
      visiotool.VisLayoutVertAlignType alignVertical,
      double spaceHorizontal,
      double spaceVertical,
      visiotool.tagVisUnitCodes unitCode);


    /**
     * @param direction Mandatory visiotool.VisLayoutDirection parameter.
     */

    @DISPID(1610743893) //= 0x60020055. The runtime will prefer the VTID if present
    @VTID(92)
    void layoutChangeDirection(
      visiotool.VisLayoutDirection direction);


    /**
     */

    @DISPID(1610743894) //= 0x60020056. The runtime will prefer the VTID if present
    @VTID(93)
    void avoidPageBreaks();


    /**
     * @param direction Mandatory visiotool.VisResizeDirection parameter.
     * @param distance Mandatory double parameter.
     * @param unitCode Mandatory visiotool.tagVisUnitCodes parameter.
     */

    @DISPID(1610743895) //= 0x60020057. The runtime will prefer the VTID if present
    @VTID(94)
    void resize(
      visiotool.VisResizeDirection direction,
      double distance,
      visiotool.tagVisUnitCodes unitCode);


    /**
     */

    @DISPID(1610743896) //= 0x60020058. The runtime will prefer the VTID if present
    @VTID(95)
    void addToContainers();


    /**
     */

    @DISPID(1610743897) //= 0x60020059. The runtime will prefer the VTID if present
    @VTID(96)
    void removeFromContainers();


    /**
     * @param page Mandatory visiotool.IVPage parameter.
     * @param objectToDrop Mandatory com4j.Com4jObject parameter.
     * @param newShape Optional parameter. Default value is 0
     * @return  Returns a value of type visiotool.IVSelection
     */

    @DISPID(1610743898) //= 0x6002005a. The runtime will prefer the VTID if present
    @VTID(97)
    visiotool.IVSelection moveToSubprocess(
      visiotool.IVPage page,
      com4j.Com4jObject objectToDrop,
      @Optional @DefaultValue("0") Holder<visiotool.IVShape> newShape);


    /**
     * <p>
     * Getter method for the COM property "SelectionForDragCopy"
     * </p>
     * @return  Returns a value of type visiotool.IVSelection
     */

    @DISPID(1610743899) //= 0x6002005b. The runtime will prefer the VTID if present
    @VTID(98)
    visiotool.IVSelection selectionForDragCopy();


    @VTID(98)
    @ReturnValue(defaultPropertyThrough={visiotool.IVSelection.class})
    visiotool.IVShape selectionForDragCopy(
      int index);

    /**
     * @param delFlags Mandatory int parameter.
     */

    @DISPID(1610743900) //= 0x6002005c. The runtime will prefer the VTID if present
    @VTID(99)
    void deleteEx(
      int delFlags);


    /**
     * @param nestedOptions Mandatory visiotool.VisContainerNested parameter.
     * @return  Returns a value of type int[]
     */

    @DISPID(1610743901) //= 0x6002005d. The runtime will prefer the VTID if present
    @VTID(100)
    int[] getContainers(
      visiotool.VisContainerNested nestedOptions);


    /**
     * @param nestedOptions Mandatory visiotool.VisContainerNested parameter.
     * @return  Returns a value of type int[]
     */

    @DISPID(1610743902) //= 0x6002005e. The runtime will prefer the VTID if present
    @VTID(101)
    int[] getCallouts(
      visiotool.VisContainerNested nestedOptions);


    /**
     * @return  Returns a value of type int[]
     */

    @DISPID(1610743903) //= 0x6002005f. The runtime will prefer the VTID if present
    @VTID(102)
    int[] memberOfContainersUnion();


    /**
     * @return  Returns a value of type int[]
     */

    @DISPID(1610743904) //= 0x60020060. The runtime will prefer the VTID if present
    @VTID(103)
    int[] memberOfContainersIntersection();


    /**
     * @param formatType Mandatory visiotool.VisContainerFormatType parameter.
     * @param formatValue Optional parameter. Default value is 0
     * @return  Returns a value of type int[]
     */

    @DISPID(1610743905) //= 0x60020061. The runtime will prefer the VTID if present
    @VTID(104)
    int[] setContainerFormat(
      visiotool.VisContainerFormatType formatType,
      @Optional @DefaultValue("0") @MarshalAs(NativeType.VARIANT) java.lang.Object formatValue);


    /**
     * @param lineMatrix Mandatory visiotool.VisQuickStyleMatrixIndices parameter.
     * @param fillMatrix Mandatory visiotool.VisQuickStyleMatrixIndices parameter.
     * @param effectsMatrix Mandatory visiotool.VisQuickStyleMatrixIndices parameter.
     * @param fontMatrix Mandatory visiotool.VisQuickStyleMatrixIndices parameter.
     * @param lineColor Mandatory visiotool.VisQuickStyleColors parameter.
     * @param fillColor Mandatory visiotool.VisQuickStyleColors parameter.
     * @param shadowColor Mandatory visiotool.VisQuickStyleColors parameter.
     * @param fontColor Mandatory visiotool.VisQuickStyleColors parameter.
     */

    @DISPID(1610743907) //= 0x60020063. The runtime will prefer the VTID if present
    @VTID(106)
    void setQuickStyle(
      visiotool.VisQuickStyleMatrixIndices lineMatrix,
      visiotool.VisQuickStyleMatrixIndices fillMatrix,
      visiotool.VisQuickStyleMatrixIndices effectsMatrix,
      visiotool.VisQuickStyleMatrixIndices fontMatrix,
      visiotool.VisQuickStyleColors lineColor,
      visiotool.VisQuickStyleColors fillColor,
      visiotool.VisQuickStyleColors shadowColor,
      visiotool.VisQuickStyleColors fontColor);


    /**
     * @param flags Mandatory short parameter.
     * @param lpr8Left Mandatory Holder<Double> parameter.
     * @param lpr8Bottom Mandatory Holder<Double> parameter.
     * @param lpr8Right Mandatory Holder<Double> parameter.
     * @param lpr8Top Mandatory Holder<Double> parameter.
     */

    @DISPID(1610743908) //= 0x60020064. The runtime will prefer the VTID if present
    @VTID(107)
    void visualBoundingBox(
      short flags,
      Holder<Double> lpr8Left,
      Holder<Double> lpr8Bottom,
      Holder<Double> lpr8Right,
      Holder<Double> lpr8Top);


    // Properties:
  }
