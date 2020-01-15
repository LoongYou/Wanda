package visiotool  ;

import com4j.*;

@IID("{000D0709-0000-0000-C000-000000000046}")
public interface IVPage extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Document"
   * </p>
   * @return  Returns a value of type VisioTool.IVDocument
   */

  @DISPID(13) //= 0xd. The runtime will prefer the VTID if present
  @VTID(7)
  visiotool.IVDocument document();


  /**
   * <p>
   * Returns Visio Application instance hosting the object.
   * </p>
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of type VisioTool.IVApplication
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(8)
  visiotool.IVApplication application();


  /**
   * <p>
   * Getter method for the COM property "Stat"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(9)
  short stat();


  /**
   * <p>
   * Getter method for the COM property "Background"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(10)
  short background();


  /**
   * <p>
   * Setter method for the COM property "Background"
   * </p>
   * @param lpi2Ret Mandatory short parameter.
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(11)
  void background(
    short lpi2Ret);


  /**
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(12)
  void old_Paste();


  /**
   * @param format Mandatory short parameter.
   */

  @DISPID(16) //= 0x10. The runtime will prefer the VTID if present
  @VTID(13)
  void old_PasteSpecial(
    short format);


  /**
   * <p>
   * Returns visObjTypePage (14).
   * </p>
   * <p>
   * Getter method for the COM property "ObjectType"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(14)
  short objectType();


  /**
   * @param xBegin Mandatory double parameter.
   * @param yBegin Mandatory double parameter.
   * @param xEnd Mandatory double parameter.
   * @param yEnd Mandatory double parameter.
   * @return  Returns a value of type VisioTool.IVShape
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(15)
  visiotool.IVShape drawLine(
    double xBegin,
    double yBegin,
    double xEnd,
    double yEnd);


  /**
   * @param x1 Mandatory double parameter.
   * @param y1 Mandatory double parameter.
   * @param x2 Mandatory double parameter.
   * @param y2 Mandatory double parameter.
   * @return  Returns a value of type VisioTool.IVShape
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(16)
  visiotool.IVShape drawRectangle(
    double x1,
    double y1,
    double x2,
    double y2);


  /**
   * @param x1 Mandatory double parameter.
   * @param y1 Mandatory double parameter.
   * @param x2 Mandatory double parameter.
   * @param y2 Mandatory double parameter.
   * @return  Returns a value of type VisioTool.IVShape
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(17)
  visiotool.IVShape drawOval(
    double x1,
    double y1,
    double x2,
    double y2);


  /**
   * <p>
   * Getter method for the COM property "Index"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(18)
  short index();


  /**
   * <p>
   * Page's locale specific name.
   * </p>
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(19)
  @DefaultMethod
  java.lang.String name();


  /**
   * <p>
   * Page's locale specific name.
   * </p>
   * <p>
   * Setter method for the COM property "Name"
   * </p>
   * @param lpLocaleSpecificName Mandatory java.lang.String parameter.
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(20)
  @DefaultMethod
  void name(
    java.lang.String lpLocaleSpecificName);


  /**
   * <p>
   * Getter method for the COM property "Shapes"
   * </p>
   * @return  Returns a value of type VisioTool.IVShapes
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(21)
  visiotool.IVShapes shapes();


  @VTID(21)
  @ReturnValue(defaultPropertyThrough={visiotool.IVShapes.class})
  visiotool.IVShape shapes(
    @MarshalAs(NativeType.VARIANT) java.lang.Object nameUIDOrIndex);

  /**
   * @param objectToDrop Mandatory com4j.Com4jObject parameter.
   * @param xPos Mandatory double parameter.
   * @param yPos Mandatory double parameter.
   * @return  Returns a value of type VisioTool.IVShape
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(22)
  visiotool.IVShape drop(
    com4j.Com4jObject objectToDrop,
    double xPos,
    double yPos);


  /**
   * @param type Mandatory short parameter.
   * @param xPos Mandatory double parameter.
   * @param yPos Mandatory double parameter.
   * @return  Returns a value of type VisioTool.IVShape
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(23)
  visiotool.IVShape addGuide(
    short type,
    double xPos,
    double yPos);


  /**
   * <p>
   * Superseded by variant=Page.BackPage.
   * </p>
   * <p>
   * Getter method for the COM property "BackPageAsObj"
   * </p>
   * @return  Returns a value of type VisioTool.IVPage
   */

  @DISPID(14) //= 0xe. The runtime will prefer the VTID if present
  @VTID(24)
  visiotool.IVPage backPageAsObj();


  /**
   * <p>
   * Takes locale specific page name. Superseded by Page.BackPage=variant.
   * </p>
   * <p>
   * Setter method for the COM property "BackPageFromName"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(1499) //= 0x5db. The runtime will prefer the VTID if present
  @VTID(25)
  void backPageFromName(
    java.lang.String rhs);


  /**
   */

  @DISPID(15) //= 0xf. The runtime will prefer the VTID if present
  @VTID(26)
  void print();


  /**
   * @param fileName Mandatory java.lang.String parameter.
   * @return  Returns a value of type VisioTool.IVShape
   */

  @DISPID(17) //= 0x11. The runtime will prefer the VTID if present
  @VTID(27)
  visiotool.IVShape _import(
    java.lang.String fileName);


  /**
   * @param fileName Mandatory java.lang.String parameter.
   */

  @DISPID(18) //= 0x12. The runtime will prefer the VTID if present
  @VTID(28)
  void export(
    java.lang.String fileName);


  /**
   * <p>
   * Getter method for the COM property "Layers"
   * </p>
   * @return  Returns a value of type VisioTool.IVLayers
   */

  @DISPID(19) //= 0x13. The runtime will prefer the VTID if present
  @VTID(29)
  visiotool.IVLayers layers();


  @VTID(29)
  @ReturnValue(defaultPropertyThrough={visiotool.IVLayers.class})
  visiotool.IVLayer layers(
    @MarshalAs(NativeType.VARIANT) java.lang.Object nameOrIndex);

  /**
   * <p>
   * Getter method for the COM property "PageSheet"
   * </p>
   * @return  Returns a value of type VisioTool.IVShape
   */

  @DISPID(20) //= 0x14. The runtime will prefer the VTID if present
  @VTID(30)
  visiotool.IVShape pageSheet();


  /**
   * @param fRenumberPages Mandatory short parameter.
   */

  @DISPID(21) //= 0x15. The runtime will prefer the VTID if present
  @VTID(31)
  void delete(
    short fRenumberPages);


  /**
   */

  @DISPID(22) //= 0x16. The runtime will prefer the VTID if present
  @VTID(32)
  void centerDrawing();


  /**
   * <p>
   * Getter method for the COM property "EventList"
   * </p>
   * @return  Returns a value of type VisioTool.IVEventList
   */

  @DISPID(23) //= 0x17. The runtime will prefer the VTID if present
  @VTID(33)
  visiotool.IVEventList eventList();


  @VTID(33)
  @ReturnValue(defaultPropertyThrough={visiotool.IVEventList.class})
  visiotool.IVEvent eventList(
    short index);

  /**
   * <p>
   * Getter method for the COM property "PersistsEvents"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(24) //= 0x18. The runtime will prefer the VTID if present
  @VTID(34)
  short persistsEvents();


        /**
         * @param fileName Mandatory java.lang.String parameter.
         * @param flags Mandatory short parameter.
         * @return  Returns a value of type VisioTool.IVShape
         */

        @DISPID(28) //= 0x1c. The runtime will prefer the VTID if present
        @VTID(38)
        visiotool.IVShape insertFromFile(
          java.lang.String fileName,
          short flags);


        /**
         * @param classOrProgID Mandatory java.lang.String parameter.
         * @param flags Mandatory short parameter.
         * @return  Returns a value of type VisioTool.IVShape
         */

        @DISPID(29) //= 0x1d. The runtime will prefer the VTID if present
        @VTID(39)
        visiotool.IVShape insertObject(
          java.lang.String classOrProgID,
          short flags);


        /**
         * @return  Returns a value of type VisioTool.IVWindow
         */

        @DISPID(30) //= 0x1e. The runtime will prefer the VTID if present
        @VTID(40)
        visiotool.IVWindow openDrawWindow();


                  /**
                   * <p>
                   * Getter method for the COM property "Connects"
                   * </p>
                   * @return  Returns a value of type VisioTool.IVConnects
                   */

                  @DISPID(36) //= 0x24. The runtime will prefer the VTID if present
                  @VTID(46)
                  visiotool.IVConnects connects();


                  @VTID(46)
                  @ReturnValue(defaultPropertyThrough={visiotool.IVConnects.class})
                  visiotool.IVConnect connects(
                    int index);

                  /**
                   * <p>
                   * Takes locale independent page name, locale specific page name or page object. Returns page object.
                   * </p>
                   * <p>
                   * Getter method for the COM property "BackPage"
                   * </p>
                   * @return  Returns a value of type java.lang.Object
                   */

                  @DISPID(37) //= 0x25. The runtime will prefer the VTID if present
                  @VTID(47)
                  @ReturnValue(type=NativeType.VARIANT)
                  java.lang.Object backPage();


                  /**
                   * <p>
                   * Takes locale independent page name, locale specific page name or page object. Returns page object.
                   * </p>
                   * <p>
                   * Setter method for the COM property "BackPage"
                   * </p>
                   * @param lpobjRet Mandatory java.lang.Object parameter.
                   */

                  @DISPID(37) //= 0x25. The runtime will prefer the VTID if present
                  @VTID(48)
                  void backPage(
                    @MarshalAs(NativeType.VARIANT) java.lang.Object lpobjRet);


                  /**
                   */

                  @DISPID(38) //= 0x26. The runtime will prefer the VTID if present
                  @VTID(49)
                  void layout();


                  /**
                   * @param flags Mandatory short parameter.
                   * @param lpr8Left Mandatory Holder<Double> parameter.
                   * @param lpr8Bottom Mandatory Holder<Double> parameter.
                   * @param lpr8Right Mandatory Holder<Double> parameter.
                   * @param lpr8Top Mandatory Holder<Double> parameter.
                   */

                  @DISPID(39) //= 0x27. The runtime will prefer the VTID if present
                  @VTID(50)
                  void boundingBox(
                    short flags,
                    Holder<Double> lpr8Left,
                    Holder<Double> lpr8Bottom,
                    Holder<Double> lpr8Right,
                    Holder<Double> lpr8Top);


                  /**
                   * <p>
                   * Getter method for the COM property "ID16"
                   * </p>
                   * @return  Returns a value of type short
                   */

                  @DISPID(40) //= 0x28. The runtime will prefer the VTID if present
                  @VTID(51)
                  short iD16();


                  /**
                   * <p>
                   * Getter method for the COM property "OLEObjects"
                   * </p>
                   * @return  Returns a value of type VisioTool.IVOLEObjects
                   */

                  @DISPID(41) //= 0x29. The runtime will prefer the VTID if present
                  @VTID(52)
                  visiotool.IVOLEObjects oleObjects();


                  @VTID(52)
                  @ReturnValue(defaultPropertyThrough={visiotool.IVOLEObjects.class})
                  visiotool.IVOLEObject oleObjects(
                    @MarshalAs(NativeType.VARIANT) java.lang.Object nameOrIndex);

                  /**
                   * <p>
                   * Getter method for the COM property "ID"
                   * </p>
                   * @return  Returns a value of type int
                   */

                  @DISPID(42) //= 0x2a. The runtime will prefer the VTID if present
                  @VTID(53)
                  int id();


                  /**
                   * <p>
                   * Getter method for the COM property "SpatialSearch"
                   * </p>
                   * @param x Mandatory double parameter.
                   * @param y Mandatory double parameter.
                   * @param relation Mandatory short parameter.
                   * @param tolerance Mandatory double parameter.
                   * @param flags Mandatory short parameter.
                   * @return  Returns a value of type VisioTool.IVSelection
                   */

                  @DISPID(43) //= 0x2b. The runtime will prefer the VTID if present
                  @VTID(54)
                  visiotool.IVSelection spatialSearch(
                    double x,
                    double y,
                    short relation,
                    double tolerance,
                    short flags);


                  /**
                   * <p>
                   * Page's locale independent name.
                   * </p>
                   * <p>
                   * Getter method for the COM property "NameU"
                   * </p>
                   * @return  Returns a value of type java.lang.String
                   */

                  @DISPID(44) //= 0x2c. The runtime will prefer the VTID if present
                  @VTID(55)
                  java.lang.String nameU();


                  /**
                   * <p>
                   * Page's locale independent name.
                   * </p>
                   * <p>
                   * Setter method for the COM property "NameU"
                   * </p>
                   * @param lpLocaleIndependentName Mandatory java.lang.String parameter.
                   */

                  @DISPID(44) //= 0x2c. The runtime will prefer the VTID if present
                  @VTID(56)
                  void nameU(
                    java.lang.String lpLocaleIndependentName);


                        /**
                         * <p>
                         * Getter method for the COM property "Picture"
                         * </p>
                         * @return  Returns a value of type Holder<com4j.stdole.IPictureDisp>
                         */

                        @DISPID(1610743861) //= 0x60020035. The runtime will prefer the VTID if present
                        @VTID(60)
                        Holder<com4j.stdole.IPictureDisp> picture();


                        /**
                         * <p>
                         * Setter method for the COM property "Index"
                         * </p>
                         * @param lpi2Ret Mandatory short parameter.
                         */

                        @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
                        @VTID(61)
                        void index(
                          short lpi2Ret);


                        /**
                         * <p>
                         * Getter method for the COM property "PrintTileCount"
                         * </p>
                         * @return  Returns a value of type int
                         */

                        @DISPID(1610743863) //= 0x60020037. The runtime will prefer the VTID if present
                        @VTID(62)
                        int printTileCount();


                        /**
                         * @param nTile Mandatory int parameter.
                         */

                        @DISPID(1610743864) //= 0x60020038. The runtime will prefer the VTID if present
                        @VTID(63)
                        void printTile(
                          int nTile);


                        /**
                         */

                        @DISPID(1610743865) //= 0x60020039. The runtime will prefer the VTID if present
                        @VTID(64)
                        void resizeToFitContents();


                        /**
                         * @param flags Optional parameter. Default value is com4j.Variant.getMissing()
                         */

                        @DISPID(1610743866) //= 0x6002003a. The runtime will prefer the VTID if present
                        @VTID(65)
                        void paste(
                          @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object flags);


                        /**
                         * @param format Mandatory int parameter.
                         * @param link Optional parameter. Default value is com4j.Variant.getMissing()
                         * @param displayAsIcon Optional parameter. Default value is com4j.Variant.getMissing()
                         */

                        @DISPID(1610743867) //= 0x6002003b. The runtime will prefer the VTID if present
                        @VTID(66)
                        void pasteSpecial(
                          int format,
                          @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object link,
                          @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object displayAsIcon);


                        /**
                         * @param selType Mandatory VisioTool.VisSelectionTypes parameter.
                         * @param iterationMode Optional parameter. Default value is 256
                         * @param data Optional parameter. Default value is com4j.Variant.getMissing()
                         * @return  Returns a value of type VisioTool.IVSelection
                         */

                        @DISPID(1610743868) //= 0x6002003c. The runtime will prefer the VTID if present
                        @VTID(67)
                        visiotool.IVSelection createSelection(
                          visiotool.VisSelectionTypes selType,
                          @Optional @DefaultValue("256") visiotool.tagVisSelectMode iterationMode,
                          @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object data);


                        /**
                         * <p>
                         * Getter method for the COM property "Type"
                         * </p>
                         * @return  Returns a value of type VisioTool.VisPageTypes
                         */

                        @DISPID(1610743869) //= 0x6002003d. The runtime will prefer the VTID if present
                        @VTID(68)
                        visiotool.VisPageTypes type();


                        /**
                         * @param xBegin Mandatory double parameter.
                         * @param yBegin Mandatory double parameter.
                         * @param xEnd Mandatory double parameter.
                         * @param yEnd Mandatory double parameter.
                         * @param xControl Mandatory double parameter.
                         * @param yControl Mandatory double parameter.
                         * @return  Returns a value of type VisioTool.IVShape
                         */

                        @DISPID(1610743870) //= 0x6002003e. The runtime will prefer the VTID if present
                        @VTID(69)
                        visiotool.IVShape drawArcByThreePoints(
                          double xBegin,
                          double yBegin,
                          double xEnd,
                          double yEnd,
                          double xControl,
                          double yControl);


                        /**
                         * @param xBegin Mandatory double parameter.
                         * @param yBegin Mandatory double parameter.
                         * @param xEnd Mandatory double parameter.
                         * @param yEnd Mandatory double parameter.
                         * @param sweepFlag Mandatory VisioTool.VisArcSweepFlags parameter.
                         * @return  Returns a value of type VisioTool.IVShape
                         */

                        @DISPID(1610743871) //= 0x6002003f. The runtime will prefer the VTID if present
                        @VTID(70)
                        visiotool.IVShape drawQuarterArc(
                          double xBegin,
                          double yBegin,
                          double xEnd,
                          double yEnd,
                          visiotool.VisArcSweepFlags sweepFlag);


                        /**
                         * @param xCenter Mandatory double parameter.
                         * @param yCenter Mandatory double parameter.
                         * @param radius Mandatory double parameter.
                         * @param startAngle Optional parameter. Default value is 0.0
                         * @param endAngle Optional parameter. Default value is 3.1415927410125732
                         * @return  Returns a value of type VisioTool.IVShape
                         */

                        @DISPID(1610743872) //= 0x60020040. The runtime will prefer the VTID if present
                        @VTID(71)
                        visiotool.IVShape drawCircularArc(
                          double xCenter,
                          double yCenter,
                          double radius,
                          @Optional @DefaultValue("0") double startAngle,
                          @Optional @DefaultValue("3.14159274101257") double endAngle);


                        /**
                         * <p>
                         * Getter method for the COM property "ReviewerID"
                         * </p>
                         * @return  Returns a value of type int
                         */

                        @DISPID(1610743873) //= 0x60020041. The runtime will prefer the VTID if present
                        @VTID(72)
                        int reviewerID();


                        /**
                         * <p>
                         * Getter method for the COM property "OriginalPage"
                         * </p>
                         * @return  Returns a value of type VisioTool.IVPage
                         */

                        @DISPID(1610743874) //= 0x60020042. The runtime will prefer the VTID if present
                        @VTID(73)
                        visiotool.IVPage originalPage();


                        /**
                         * @param dataRecordsetID Mandatory int parameter.
                         * @return  Returns a value of type int[]
                         */

                        @DISPID(1610743875) //= 0x60020043. The runtime will prefer the VTID if present
                        @VTID(74)
                        int[] getShapesLinkedToData(
                          int dataRecordsetID);


                        /**
                         * @param dataRecordsetID Mandatory int parameter.
                         * @param dataRowID Mandatory int parameter.
                         * @return  Returns a value of type int[]
                         */

                        @DISPID(1610743876) //= 0x60020044. The runtime will prefer the VTID if present
                        @VTID(75)
                        int[] getShapesLinkedToDataRow(
                          int dataRecordsetID,
                          int dataRowID);


                              /**
                               * @param objectToDrop Mandatory com4j.Com4jObject parameter.
                               * @param x Mandatory double parameter.
                               * @param y Mandatory double parameter.
                               * @param dataRecordsetID Mandatory int parameter.
                               * @param dataRowID Mandatory int parameter.
                               * @param applyDataGraphicAfterLink Mandatory boolean parameter.
                               * @return  Returns a value of type VisioTool.IVShape
                               */

                              @DISPID(1610743880) //= 0x60020048. The runtime will prefer the VTID if present
                              @VTID(79)
                              visiotool.IVShape dropLinked(
                                com4j.Com4jObject objectToDrop,
                                double x,
                                double y,
                                int dataRecordsetID,
                                int dataRowID,
                                boolean applyDataGraphicAfterLink);


                                /**
                                 * <p>
                                 * Getter method for the COM property "ThemeColors"
                                 * </p>
                                 * @return  Returns a value of type java.lang.Object
                                 */

                                @DISPID(1610743882) //= 0x6002004a. The runtime will prefer the VTID if present
                                @VTID(81)
                                @ReturnValue(type=NativeType.VARIANT)
                                java.lang.Object themeColors();


                                /**
                                 * <p>
                                 * Setter method for the COM property "ThemeColors"
                                 * </p>
                                 * @param pVar Mandatory java.lang.Object parameter.
                                 */

                                @DISPID(1610743882) //= 0x6002004a. The runtime will prefer the VTID if present
                                @VTID(82)
                                void themeColors(
                                  @MarshalAs(NativeType.VARIANT) java.lang.Object pVar);


                                /**
                                 * <p>
                                 * Getter method for the COM property "ThemeEffects"
                                 * </p>
                                 * @return  Returns a value of type java.lang.Object
                                 */

                                @DISPID(1610743884) //= 0x6002004c. The runtime will prefer the VTID if present
                                @VTID(83)
                                @ReturnValue(type=NativeType.VARIANT)
                                java.lang.Object themeEffects();


                                /**
                                 * <p>
                                 * Setter method for the COM property "ThemeEffects"
                                 * </p>
                                 * @param pVar Mandatory java.lang.Object parameter.
                                 */

                                @DISPID(1610743884) //= 0x6002004c. The runtime will prefer the VTID if present
                                @VTID(84)
                                void themeEffects(
                                  @MarshalAs(NativeType.VARIANT) java.lang.Object pVar);


                                /**
                                 * @param objectToDrop Mandatory com4j.Com4jObject parameter.
                                 * @param targetShape Mandatory VisioTool.IVShape parameter.
                                 * @param placementDir Mandatory VisioTool.VisAutoConnectDir parameter.
                                 * @param connector Optional parameter. Default value is unprintable.
                                 * @return  Returns a value of type VisioTool.IVShape
                                 */

                                @DISPID(1610743886) //= 0x6002004e. The runtime will prefer the VTID if present
                                @VTID(85)
                                visiotool.IVShape dropConnected(
                                  com4j.Com4jObject objectToDrop,
                                  visiotool.IVShape targetShape,
                                  visiotool.VisAutoConnectDir placementDir,
                                  @Optional com4j.Com4jObject connector);


                                  /**
                                   * @param objectToDrop Mandatory com4j.Com4jObject parameter.
                                   * @param targetShapes Mandatory com4j.Com4jObject parameter.
                                   * @return  Returns a value of type VisioTool.IVShape
                                   */

                                  @DISPID(1610743888) //= 0x60020050. The runtime will prefer the VTID if present
                                  @VTID(87)
                                  visiotool.IVShape dropContainer(
                                    com4j.Com4jObject objectToDrop,
                                    com4j.Com4jObject targetShapes);


                                  /**
                                   * @param alignOrSpace Mandatory VisioTool.VisLayoutIncrementalType parameter.
                                   * @param alignHorizontal Mandatory VisioTool.VisLayoutHorzAlignType parameter.
                                   * @param alignVertical Mandatory VisioTool.VisLayoutVertAlignType parameter.
                                   * @param spaceHorizontal Mandatory double parameter.
                                   * @param spaceVertical Mandatory double parameter.
                                   * @param unitsNameOrCode Mandatory VisioTool.tagVisUnitCodes parameter.
                                   */

                                  @DISPID(1610743889) //= 0x60020051. The runtime will prefer the VTID if present
                                  @VTID(88)
                                  void layoutIncremental(
                                    visiotool.VisLayoutIncrementalType alignOrSpace,
                                    visiotool.VisLayoutHorzAlignType alignHorizontal,
                                    visiotool.VisLayoutVertAlignType alignVertical,
                                    double spaceHorizontal,
                                    double spaceVertical,
                                    visiotool.tagVisUnitCodes unitsNameOrCode);


                                  /**
                                   * @param direction Mandatory VisioTool.VisLayoutDirection parameter.
                                   */

                                  @DISPID(1610743890) //= 0x60020052. The runtime will prefer the VTID if present
                                  @VTID(89)
                                  void layoutChangeDirection(
                                    visiotool.VisLayoutDirection direction);


                                  /**
                                   */

                                  @DISPID(1610743891) //= 0x60020053. The runtime will prefer the VTID if present
                                  @VTID(90)
                                  void avoidPageBreaks();


                                  /**
                                   * @param connectorToSplit Mandatory VisioTool.IVShape parameter.
                                   * @param shape Mandatory VisioTool.IVShape parameter.
                                   * @return  Returns a value of type VisioTool.IVShape
                                   */

                                  @DISPID(1610743892) //= 0x60020054. The runtime will prefer the VTID if present
                                  @VTID(91)
                                  visiotool.IVShape splitConnector(
                                    visiotool.IVShape connectorToSplit,
                                    visiotool.IVShape shape);


                                  /**
                                   * @param objectToDrop Mandatory com4j.Com4jObject parameter.
                                   * @param targetShape Mandatory VisioTool.IVShape parameter.
                                   * @return  Returns a value of type VisioTool.IVShape
                                   */

                                  @DISPID(1610743893) //= 0x60020055. The runtime will prefer the VTID if present
                                  @VTID(92)
                                  visiotool.IVShape dropCallout(
                                    com4j.Com4jObject objectToDrop,
                                    visiotool.IVShape targetShape);


                                  /**
                                   * @param xPos Mandatory double parameter.
                                   * @param yPos Mandatory double parameter.
                                   * @param flags Mandatory int parameter.
                                   */

                                  @DISPID(1610743894) //= 0x60020056. The runtime will prefer the VTID if present
                                  @VTID(93)
                                  void pasteToLocation(
                                    double xPos,
                                    double yPos,
                                    int flags);


                                  /**
                                   * @param nestedOptions Mandatory VisioTool.VisContainerNested parameter.
                                   * @return  Returns a value of type int[]
                                   */

                                  @DISPID(1610743895) //= 0x60020057. The runtime will prefer the VTID if present
                                  @VTID(94)
                                  int[] getContainers(
                                    visiotool.VisContainerNested nestedOptions);


                                  /**
                                   * @param nestedOptions Mandatory VisioTool.VisContainerNested parameter.
                                   * @return  Returns a value of type int[]
                                   */

                                  @DISPID(1610743896) //= 0x60020058. The runtime will prefer the VTID if present
                                  @VTID(95)
                                  int[] getCallouts(
                                    visiotool.VisContainerNested nestedOptions);


                                  /**
                                   * <p>
                                   * Getter method for the COM property "LayoutRoutePassive"
                                   * </p>
                                   * @return  Returns a value of type boolean
                                   */

                                  @DISPID(1610743897) //= 0x60020059. The runtime will prefer the VTID if present
                                  @VTID(96)
                                  boolean layoutRoutePassive();


                                  /**
                                   * <p>
                                   * Setter method for the COM property "LayoutRoutePassive"
                                   * </p>
                                   * @param pbRet Mandatory boolean parameter.
                                   */

                                  @DISPID(1610743897) //= 0x60020059. The runtime will prefer the VTID if present
                                  @VTID(97)
                                  void layoutRoutePassive(
                                    boolean pbRet);


                                  /**
                                   * @param outerList Mandatory com4j.Com4jObject parameter.
                                   * @param innerContainer Mandatory com4j.Com4jObject parameter.
                                   * @param populateFlags Mandatory VisioTool.VisLegendFlags parameter.
                                   * @return  Returns a value of type VisioTool.IVShape
                                   */

                                  @DISPID(1610743899) //= 0x6002005b. The runtime will prefer the VTID if present
                                  @VTID(98)
                                  visiotool.IVShape dropLegend(
                                    com4j.Com4jObject outerList,
                                    com4j.Com4jObject innerContainer,
                                    visiotool.VisLegendFlags populateFlags);


                                  /**
                                   * @param objectToDrop Mandatory com4j.Com4jObject parameter.
                                   * @param targetList Mandatory VisioTool.IVShape parameter.
                                   * @param lPosition Mandatory int parameter.
                                   * @return  Returns a value of type VisioTool.IVShape
                                   */

                                  @DISPID(1610743900) //= 0x6002005c. The runtime will prefer the VTID if present
                                  @VTID(99)
                                  visiotool.IVShape dropIntoList(
                                    com4j.Com4jObject objectToDrop,
                                    visiotool.IVShape targetList,
                                    int lPosition);


                                  /**
                                   * <p>
                                   * Getter method for the COM property "AutoSize"
                                   * </p>
                                   * @return  Returns a value of type boolean
                                   */

                                  @DISPID(1610743901) //= 0x6002005d. The runtime will prefer the VTID if present
                                  @VTID(100)
                                  boolean autoSize();


                                  /**
                                   * <p>
                                   * Setter method for the COM property "AutoSize"
                                   * </p>
                                   * @param pbRet Mandatory boolean parameter.
                                   */

                                  @DISPID(1610743901) //= 0x6002005d. The runtime will prefer the VTID if present
                                  @VTID(101)
                                  void autoSize(
                                    boolean pbRet);


                                  /**
                                   */

                                  @DISPID(1610743903) //= 0x6002005f. The runtime will prefer the VTID if present
                                  @VTID(102)
                                  void autoSizeDrawing();


                                  /**
                                   * <p>
                                   * Returns a new page duplicated from this page.
                                   * </p>
                                   * @return  Returns a value of type VisioTool.IVPage
                                   */

                                  @DISPID(1610743904) //= 0x60020060. The runtime will prefer the VTID if present
                                  @VTID(103)
                                  visiotool.IVPage duplicate();


                                  /**
                                   * @param eThemeType Mandatory VisioTool.VisThemeTypes parameter.
                                   * @return  Returns a value of type java.lang.Object
                                   */

                                  @DISPID(1610743905) //= 0x60020061. The runtime will prefer the VTID if present
                                  @VTID(104)
                                  @ReturnValue(type=NativeType.VARIANT)
                                  java.lang.Object getTheme(
                                    visiotool.VisThemeTypes eThemeType);


                                  /**
                                   * @param varThemeIndex Mandatory java.lang.Object parameter.
                                   * @param varColorScheme Optional parameter. Default value is com4j.Variant.getMissing()
                                   * @param varEffectScheme Optional parameter. Default value is com4j.Variant.getMissing()
                                   * @param varConnectorScheme Optional parameter. Default value is com4j.Variant.getMissing()
                                   * @param varFontScheme Optional parameter. Default value is com4j.Variant.getMissing()
                                   */

                                  @DISPID(1610743906) //= 0x60020062. The runtime will prefer the VTID if present
                                  @VTID(105)
                                  void setTheme(
                                    @MarshalAs(NativeType.VARIANT) java.lang.Object varThemeIndex,
                                    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object varColorScheme,
                                    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object varEffectScheme,
                                    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object varConnectorScheme,
                                    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object varFontScheme);


                                  /**
                                   * <p>
                                   * Getter method for the COM property "Comments"
                                   * </p>
                                   * @return  Returns a value of type VisioTool.IVComments
                                   */

                                  @DISPID(1610743907) //= 0x60020063. The runtime will prefer the VTID if present
                                  @VTID(106)
                                  visiotool.IVComments comments();


                                  @VTID(106)
                                  @ReturnValue(defaultPropertyThrough={visiotool.IVComments.class})
                                  visiotool.IVComment comments(
                                    int index);

                                  /**
                                   * <p>
                                   * Getter method for the COM property "ShapeComments"
                                   * </p>
                                   * @return  Returns a value of type VisioTool.IVComments
                                   */

                                  @DISPID(1610743908) //= 0x60020064. The runtime will prefer the VTID if present
                                  @VTID(107)
                                  visiotool.IVComments shapeComments();


                                  @VTID(107)
                                  @ReturnValue(defaultPropertyThrough={visiotool.IVComments.class})
                                  visiotool.IVComment shapeComments(
                                    int index);

                                  /**
                                   * @param pVariantColor Mandatory Holder<Short> parameter.
                                   * @param pVariantStyle Mandatory Holder<Short> parameter.
                                   * @param pEmbellishment Optional parameter. Default value is 0
                                   */

                                  @DISPID(1610743909) //= 0x60020065. The runtime will prefer the VTID if present
                                  @VTID(108)
                                  void getThemeVariant(
                                    Holder<Short> pVariantColor,
                                    Holder<Short> pVariantStyle,
                                    @Optional @DefaultValue("0") Holder<Short> pEmbellishment);


                                  /**
                                   * @param variantColor Mandatory short parameter.
                                   * @param variantStyle Mandatory short parameter.
                                   * @param embellishment Optional parameter. Default value is -1
                                   */

                                  @DISPID(1610743910) //= 0x60020066. The runtime will prefer the VTID if present
                                  @VTID(109)
                                  void setThemeVariant(
                                    short variantColor,
                                    short variantStyle,
                                    @Optional @DefaultValue("-1") short embellishment);


                                  /**
                                   * @param flags Mandatory short parameter.
                                   * @param lpr8Left Mandatory Holder<Double> parameter.
                                   * @param lpr8Bottom Mandatory Holder<Double> parameter.
                                   * @param lpr8Right Mandatory Holder<Double> parameter.
                                   * @param lpr8Top Mandatory Holder<Double> parameter.
                                   */

                                  @DISPID(1610743911) //= 0x60020067. The runtime will prefer the VTID if present
                                  @VTID(110)
                                  void visualBoundingBox(
                                    short flags,
                                    Holder<Double> lpr8Left,
                                    Holder<Double> lpr8Bottom,
                                    Holder<Double> lpr8Right,
                                    Holder<Double> lpr8Top);


                                  // Properties:
                                }
