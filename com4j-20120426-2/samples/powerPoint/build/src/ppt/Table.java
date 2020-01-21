package ppt  ;

import com4j.*;

@IID("{914934C3-5A91-11CF-8700-00AA0060263B}")
public interface Table extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of type ppt._Application
   */

  @DISPID(2001) //= 0x7d1. The runtime will prefer the VTID if present
  @VTID(7)
  ppt._Application application();


  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(2002) //= 0x7d2. The runtime will prefer the VTID if present
  @VTID(8)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject parent();


  /**
   * <p>
   * Getter method for the COM property "Columns"
   * </p>
   * @return  Returns a value of type ppt.Columns
   */

  @DISPID(2003) //= 0x7d3. The runtime will prefer the VTID if present
  @VTID(9)
  ppt.Columns columns();


  @VTID(9)
  @ReturnValue(defaultPropertyThrough={ppt.Columns.class})
  ppt.Column columns(
    int index);

  /**
   * <p>
   * Getter method for the COM property "Rows"
   * </p>
   * @return  Returns a value of type ppt.Rows
   */

  @DISPID(2004) //= 0x7d4. The runtime will prefer the VTID if present
  @VTID(10)
  ppt.Rows rows();


  @VTID(10)
  @ReturnValue(defaultPropertyThrough={ppt.Rows.class})
  ppt.Row rows(
    int index);

  /**
   * @param row Mandatory int parameter.
   * @param column Mandatory int parameter.
   * @return  Returns a value of type ppt.Cell
   */

  @DISPID(2005) //= 0x7d5. The runtime will prefer the VTID if present
  @VTID(11)
  ppt.Cell cell(
    int row,
    int column);


  /**
   * <p>
   * Getter method for the COM property "TableDirection"
   * </p>
   * @return  Returns a value of type ppt.PpDirection
   */

  @DISPID(2006) //= 0x7d6. The runtime will prefer the VTID if present
  @VTID(12)
  ppt.PpDirection tableDirection();


  /**
   * <p>
   * Setter method for the COM property "TableDirection"
   * </p>
   * @param tableDirection Mandatory ppt.PpDirection parameter.
   */

  @DISPID(2006) //= 0x7d6. The runtime will prefer the VTID if present
  @VTID(13)
  void tableDirection(
    ppt.PpDirection tableDirection);


  /**
   */

  @DISPID(2007) //= 0x7d7. The runtime will prefer the VTID if present
  @VTID(14)
  void mergeBorders();


  /**
   * <p>
   * Getter method for the COM property "FirstRow"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(2008) //= 0x7d8. The runtime will prefer the VTID if present
  @VTID(15)
  boolean firstRow();


  /**
   * <p>
   * Setter method for the COM property "FirstRow"
   * </p>
   * @param firstRow Mandatory boolean parameter.
   */

  @DISPID(2008) //= 0x7d8. The runtime will prefer the VTID if present
  @VTID(16)
  void firstRow(
    boolean firstRow);


  /**
   * <p>
   * Getter method for the COM property "LastRow"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(2009) //= 0x7d9. The runtime will prefer the VTID if present
  @VTID(17)
  boolean lastRow();


  /**
   * <p>
   * Setter method for the COM property "LastRow"
   * </p>
   * @param lastRow Mandatory boolean parameter.
   */

  @DISPID(2009) //= 0x7d9. The runtime will prefer the VTID if present
  @VTID(18)
  void lastRow(
    boolean lastRow);


  /**
   * <p>
   * Getter method for the COM property "FirstCol"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(2010) //= 0x7da. The runtime will prefer the VTID if present
  @VTID(19)
  boolean firstCol();


  /**
   * <p>
   * Setter method for the COM property "FirstCol"
   * </p>
   * @param firstCol Mandatory boolean parameter.
   */

  @DISPID(2010) //= 0x7da. The runtime will prefer the VTID if present
  @VTID(20)
  void firstCol(
    boolean firstCol);


  /**
   * <p>
   * Getter method for the COM property "LastCol"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(2011) //= 0x7db. The runtime will prefer the VTID if present
  @VTID(21)
  boolean lastCol();


  /**
   * <p>
   * Setter method for the COM property "LastCol"
   * </p>
   * @param lastCol Mandatory boolean parameter.
   */

  @DISPID(2011) //= 0x7db. The runtime will prefer the VTID if present
  @VTID(22)
  void lastCol(
    boolean lastCol);


  /**
   * <p>
   * Getter method for the COM property "HorizBanding"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(2012) //= 0x7dc. The runtime will prefer the VTID if present
  @VTID(23)
  boolean horizBanding();


  /**
   * <p>
   * Setter method for the COM property "HorizBanding"
   * </p>
   * @param horizBanding Mandatory boolean parameter.
   */

  @DISPID(2012) //= 0x7dc. The runtime will prefer the VTID if present
  @VTID(24)
  void horizBanding(
    boolean horizBanding);


  /**
   * <p>
   * Getter method for the COM property "VertBanding"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(2013) //= 0x7dd. The runtime will prefer the VTID if present
  @VTID(25)
  boolean vertBanding();


  /**
   * <p>
   * Setter method for the COM property "VertBanding"
   * </p>
   * @param vertBanding Mandatory boolean parameter.
   */

  @DISPID(2013) //= 0x7dd. The runtime will prefer the VTID if present
  @VTID(26)
  void vertBanding(
    boolean vertBanding);


  /**
   * <p>
   * Getter method for the COM property "Style"
   * </p>
   * @return  Returns a value of type ppt.TableStyle
   */

  @DISPID(2014) //= 0x7de. The runtime will prefer the VTID if present
  @VTID(27)
  ppt.TableStyle style();


  /**
   * <p>
   * Getter method for the COM property "Background"
   * </p>
   * @return  Returns a value of type ppt.TableBackground
   */

  @DISPID(2015) //= 0x7df. The runtime will prefer the VTID if present
  @VTID(28)
  ppt.TableBackground background();


  /**
   * @param scale Mandatory float parameter.
   */

  @DISPID(2016) //= 0x7e0. The runtime will prefer the VTID if present
  @VTID(29)
  void scaleProportionally(
    float scale);


  /**
   * @param styleID Optional parameter. Default value is ""
   * @param saveFormatting Optional parameter. Default value is false
   */

  @DISPID(2017) //= 0x7e1. The runtime will prefer the VTID if present
  @VTID(30)
  void applyStyle(
    @Optional @DefaultValue("") java.lang.String styleID,
    @Optional @DefaultValue("0") boolean saveFormatting);


  /**
   * <p>
   * Getter method for the COM property "AlternativeText"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(2018) //= 0x7e2. The runtime will prefer the VTID if present
  @VTID(31)
  java.lang.String alternativeText();


  /**
   * <p>
   * Setter method for the COM property "AlternativeText"
   * </p>
   * @param alternativeText Mandatory java.lang.String parameter.
   */

  @DISPID(2018) //= 0x7e2. The runtime will prefer the VTID if present
  @VTID(32)
  void alternativeText(
    java.lang.String alternativeText);


  /**
   * <p>
   * Getter method for the COM property "Title"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(2019) //= 0x7e3. The runtime will prefer the VTID if present
  @VTID(33)
  java.lang.String title();


  /**
   * <p>
   * Setter method for the COM property "Title"
   * </p>
   * @param title Mandatory java.lang.String parameter.
   */

  @DISPID(2019) //= 0x7e3. The runtime will prefer the VTID if present
  @VTID(34)
  void title(
    java.lang.String title);


  // Properties:
}
