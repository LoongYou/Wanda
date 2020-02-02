package visiotool  ;

import com4j.*;

@IID("{000D072F-0000-0000-C000-000000000046}")
public interface IVDataRecordset extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of type visiotool.IVApplication
   */

  @DISPID(1610743808) //= 0x60020000. The runtime will prefer the VTID if present
  @VTID(7)
  visiotool.IVApplication application();


  /**
   * <p>
   * Getter method for the COM property "Stat"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(1610743809) //= 0x60020001. The runtime will prefer the VTID if present
  @VTID(8)
  short stat();


  /**
   * <p>
   * Getter method for the COM property "Document"
   * </p>
   * @return  Returns a value of type visiotool.IVDocument
   */

  @DISPID(1610743810) //= 0x60020002. The runtime will prefer the VTID if present
  @VTID(9)
  visiotool.IVDocument document();


  /**
   * <p>
   * Getter method for the COM property "ObjectType"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(1610743811) //= 0x60020003. The runtime will prefer the VTID if present
  @VTID(10)
  short objectType();


  /**
   * <p>
   * Getter method for the COM property "ID"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(11)
  @DefaultMethod
  int id();


  /**
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610743813) //= 0x60020005. The runtime will prefer the VTID if present
  @VTID(12)
  java.lang.String name();


  /**
   * <p>
   * Setter method for the COM property "Name"
   * </p>
   * @param name Mandatory java.lang.String parameter.
   */

  @DISPID(1610743813) //= 0x60020005. The runtime will prefer the VTID if present
  @VTID(13)
  void name(
    java.lang.String name);


  /**
   * <p>
   * Getter method for the COM property "LinkReplaceBehavior"
   * </p>
   * @return  Returns a value of type visiotool.VisLinkReplaceBehavior
   */

  @DISPID(1610743815) //= 0x60020007. The runtime will prefer the VTID if present
  @VTID(14)
  visiotool.VisLinkReplaceBehavior linkReplaceBehavior();


  /**
   * <p>
   * Setter method for the COM property "LinkReplaceBehavior"
   * </p>
   * @param property Mandatory visiotool.VisLinkReplaceBehavior parameter.
   */

  @DISPID(1610743815) //= 0x60020007. The runtime will prefer the VTID if present
  @VTID(15)
  void linkReplaceBehavior(
    visiotool.VisLinkReplaceBehavior property);


  /**
   * <p>
   * Getter method for the COM property "DataConnection"
   * </p>
   * @return  Returns a value of type visiotool.IVDataConnection
   */

  @DISPID(1610743817) //= 0x60020009. The runtime will prefer the VTID if present
  @VTID(16)
  visiotool.IVDataConnection dataConnection();


  /**
   * <p>
   * Getter method for the COM property "DataColumns"
   * </p>
   * @return  Returns a value of type visiotool.IVDataColumns
   */

  @DISPID(1610743818) //= 0x6002000a. The runtime will prefer the VTID if present
  @VTID(17)
  visiotool.IVDataColumns dataColumns();


  @VTID(17)
  @ReturnValue(defaultPropertyThrough={visiotool.IVDataColumns.class})
  visiotool.IVDataColumn dataColumns(
    @MarshalAs(NativeType.VARIANT) java.lang.Object indexOrName);

      /**
       * <p>
       * Getter method for the COM property "CommandString"
       * </p>
       * @return  Returns a value of type java.lang.String
       */

      @DISPID(1610743821) //= 0x6002000d. The runtime will prefer the VTID if present
      @VTID(20)
      java.lang.String commandString();


      /**
       * <p>
       * Setter method for the COM property "CommandString"
       * </p>
       * @param commandString Mandatory java.lang.String parameter.
       */

      @DISPID(1610743821) //= 0x6002000d. The runtime will prefer the VTID if present
      @VTID(21)
      void commandString(
        java.lang.String commandString);


      /**
       * <p>
       * Getter method for the COM property "DataAsXML"
       * </p>
       * @return  Returns a value of type java.lang.String
       */

      @DISPID(1610743823) //= 0x6002000f. The runtime will prefer the VTID if present
      @VTID(22)
      java.lang.String dataAsXML();


      /**
       * @param criteriaString Mandatory java.lang.String parameter.
       * @return  Returns a value of type int[]
       */

      @DISPID(1610743824) //= 0x60020010. The runtime will prefer the VTID if present
      @VTID(23)
      int[] getDataRowIDs(
        java.lang.String criteriaString);


      /**
       * @param dataRowID Mandatory int parameter.
       * @return  Returns a value of type java.lang.Object[]
       */

      @DISPID(1610743825) //= 0x60020011. The runtime will prefer the VTID if present
      @VTID(24)
      java.lang.Object[] getRowData(
        int dataRowID);


      /**
       */

      @DISPID(1610743826) //= 0x60020012. The runtime will prefer the VTID if present
      @VTID(25)
      void delete();


      /**
       */

      @DISPID(1610743827) //= 0x60020013. The runtime will prefer the VTID if present
      @VTID(26)
      void refresh();


      /**
       * @param newDataAsXML Mandatory java.lang.String parameter.
       */

      @DISPID(1610743828) //= 0x60020014. The runtime will prefer the VTID if present
      @VTID(27)
      void refreshUsingXML(
        java.lang.String newDataAsXML);


      /**
       * <p>
       * Getter method for the COM property "TimeRefreshed"
       * </p>
       * @return  Returns a value of type java.util.Date
       */

      @DISPID(1610743829) //= 0x60020015. The runtime will prefer the VTID if present
      @VTID(28)
      java.util.Date timeRefreshed();


      /**
       * <p>
       * Getter method for the COM property "RefreshInterval"
       * </p>
       * @return  Returns a value of type int
       */

      @DISPID(1610743830) //= 0x60020016. The runtime will prefer the VTID if present
      @VTID(29)
      int refreshInterval();


      /**
       * <p>
       * Setter method for the COM property "RefreshInterval"
       * </p>
       * @param refreshInterval Mandatory int parameter.
       */

      @DISPID(1610743830) //= 0x60020016. The runtime will prefer the VTID if present
      @VTID(30)
      void refreshInterval(
        int refreshInterval);


      /**
       * <p>
       * Getter method for the COM property "RefreshSettings"
       * </p>
       * @return  Returns a value of type int
       */

      @DISPID(1610743832) //= 0x60020018. The runtime will prefer the VTID if present
      @VTID(31)
      int refreshSettings();


      /**
       * <p>
       * Setter method for the COM property "RefreshSettings"
       * </p>
       * @param settings Mandatory int parameter.
       */

      @DISPID(1610743832) //= 0x60020018. The runtime will prefer the VTID if present
      @VTID(32)
      void refreshSettings(
        int settings);


      /**
       * <p>
       * Getter method for the COM property "EventList"
       * </p>
       * @return  Returns a value of type visiotool.IVEventList
       */

      @DISPID(1610743834) //= 0x6002001a. The runtime will prefer the VTID if present
      @VTID(33)
      visiotool.IVEventList eventList();


      @VTID(33)
      @ReturnValue(defaultPropertyThrough={visiotool.IVEventList.class})
      visiotool.IVEvent eventList(
        short index);

      /**
       * @param shapeInConflict Mandatory visiotool.IVShape parameter.
       */

      @DISPID(1610743836) //= 0x6002001c. The runtime will prefer the VTID if present
      @VTID(35)
      void removeRefreshConflict(
        visiotool.IVShape shapeInConflict);


      /**
       * @param shapeInConflict Mandatory visiotool.IVShape parameter.
       * @return  Returns a value of type int[]
       */

      @DISPID(1610743837) //= 0x6002001d. The runtime will prefer the VTID if present
      @VTID(36)
      int[] getMatchingRowsForRefreshConflict(
        visiotool.IVShape shapeInConflict);


      // Properties:
    }
