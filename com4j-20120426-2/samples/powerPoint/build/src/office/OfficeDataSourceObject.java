package office  ;

import com4j.*;

@IID("{000C1530-0000-0000-C000-000000000046}")
public interface OfficeDataSourceObject extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "ConnectString"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(7)
  java.lang.String connectString();


  /**
   * <p>
   * Setter method for the COM property "ConnectString"
   * </p>
   * @param pbstrConnect Mandatory java.lang.String parameter.
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(8)
  void connectString(
    java.lang.String pbstrConnect);


  /**
   * <p>
   * Getter method for the COM property "Table"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(9)
  java.lang.String table();


  /**
   * <p>
   * Setter method for the COM property "Table"
   * </p>
   * @param pbstrTable Mandatory java.lang.String parameter.
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(10)
  void table(
    java.lang.String pbstrTable);


  /**
   * <p>
   * Getter method for the COM property "DataSource"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(11)
  java.lang.String dataSource();


  /**
   * <p>
   * Setter method for the COM property "DataSource"
   * </p>
   * @param pbstrSrc Mandatory java.lang.String parameter.
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(12)
  void dataSource(
    java.lang.String pbstrSrc);


  /**
   * <p>
   * Getter method for the COM property "Columns"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(13)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject columns();


  /**
   * <p>
   * Getter method for the COM property "RowCount"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(14)
  int rowCount();


  /**
   * <p>
   * Getter method for the COM property "Filters"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(15)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject filters();


  /**
   * @param msoMoveRow Mandatory office.MsoMoveRow parameter.
   * @param rowNbr Optional parameter. Default value is 1
   * @return  Returns a value of type int
   */

  @DISPID(1610743817) //= 0x60020009. The runtime will prefer the VTID if present
  @VTID(16)
  int move(
    office.MsoMoveRow msoMoveRow,
    @Optional @DefaultValue("1") int rowNbr);


  /**
   * @param bstrSrc Optional parameter. Default value is ""
   * @param bstrConnect Optional parameter. Default value is ""
   * @param bstrTable Optional parameter. Default value is ""
   * @param fOpenExclusive Optional parameter. Default value is 0
   * @param fNeverPrompt Optional parameter. Default value is 1
   */

  @DISPID(1610743818) //= 0x6002000a. The runtime will prefer the VTID if present
  @VTID(17)
  void open(
    @Optional @DefaultValue("") java.lang.String bstrSrc,
    @Optional @DefaultValue("") java.lang.String bstrConnect,
    @Optional @DefaultValue("") java.lang.String bstrTable,
    @Optional @DefaultValue("0") int fOpenExclusive,
    @Optional @DefaultValue("1") int fNeverPrompt);


  /**
   * @param sortField1 Mandatory java.lang.String parameter.
   * @param sortAscending1 Optional parameter. Default value is false
   * @param sortField2 Optional parameter. Default value is ""
   * @param sortAscending2 Optional parameter. Default value is false
   * @param sortField3 Optional parameter. Default value is ""
   * @param sortAscending3 Optional parameter. Default value is false
   */

  @DISPID(1610743819) //= 0x6002000b. The runtime will prefer the VTID if present
  @VTID(18)
  void setSortOrder(
    java.lang.String sortField1,
    @Optional @DefaultValue("-1") boolean sortAscending1,
    @Optional @DefaultValue("") java.lang.String sortField2,
    @Optional @DefaultValue("-1") boolean sortAscending2,
    @Optional @DefaultValue("") java.lang.String sortField3,
    @Optional @DefaultValue("-1") boolean sortAscending3);


  /**
   */

  @DISPID(1610743820) //= 0x6002000c. The runtime will prefer the VTID if present
  @VTID(19)
  void applyFilter();


  // Properties:
}
