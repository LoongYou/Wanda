package excel  ;

import com4j.*;

@IID("{00024450-0001-0000-C000-000000000046}")
public interface ICellFormat extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of type excel._Application
   */

  @VTID(7)
  excel._Application getApplication();


  /**
   * <p>
   * Getter method for the COM property "Creator"
   * </p>
   * @return  Returns a value of type excel.XlCreator
   */

  @VTID(8)
  excel.XlCreator getCreator();


  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @VTID(9)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject getParent();


  /**
   * <p>
   * Getter method for the COM property "Borders"
   * </p>
   * @return  Returns a value of type excel.Borders
   */

  @VTID(10)
  excel.Borders getBorders();


  /**
   * <p>
   * Setter method for the COM property "Borders"
   * </p>
   * @param rhs Mandatory excel.Borders parameter.
   */

  @VTID(11)
  void setBorders(
    excel.Borders rhs);


  /**
   * <p>
   * Getter method for the COM property "Font"
   * </p>
   * @return  Returns a value of type excel.Font
   */

  @VTID(12)
  excel.Font getFont();


  /**
   * <p>
   * Setter method for the COM property "Font"
   * </p>
   * @param rhs Mandatory excel.Font parameter.
   */

  @VTID(13)
  void setFont(
    excel.Font rhs);


  /**
   * <p>
   * Getter method for the COM property "Interior"
   * </p>
   * @return  Returns a value of type excel.Interior
   */

  @VTID(14)
  excel.Interior getInterior();


  /**
   * <p>
   * Setter method for the COM property "Interior"
   * </p>
   * @param rhs Mandatory excel.Interior parameter.
   */

  @VTID(15)
  void setInterior(
    excel.Interior rhs);


  /**
   * <p>
   * Getter method for the COM property "NumberFormat"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(16)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object getNumberFormat(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "NumberFormat"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @VTID(17)
  void setNumberFormat(
    @LCID int lcid,
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "NumberFormatLocal"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(18)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object getNumberFormatLocal();


  /**
   * <p>
   * Setter method for the COM property "NumberFormatLocal"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @VTID(19)
  void setNumberFormatLocal(
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "AddIndent"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(20)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object getAddIndent();


  /**
   * <p>
   * Setter method for the COM property "AddIndent"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @VTID(21)
  void setAddIndent(
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "IndentLevel"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(22)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object getIndentLevel();


  /**
   * <p>
   * Setter method for the COM property "IndentLevel"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @VTID(23)
  void setIndentLevel(
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "HorizontalAlignment"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(24)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object getHorizontalAlignment();


  /**
   * <p>
   * Setter method for the COM property "HorizontalAlignment"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @VTID(25)
  void setHorizontalAlignment(
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "VerticalAlignment"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(26)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object getVerticalAlignment();


  /**
   * <p>
   * Setter method for the COM property "VerticalAlignment"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @VTID(27)
  void setVerticalAlignment(
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "Orientation"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(28)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object getOrientation();


  /**
   * <p>
   * Setter method for the COM property "Orientation"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @VTID(29)
  void setOrientation(
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "ShrinkToFit"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(30)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object getShrinkToFit();


  /**
   * <p>
   * Setter method for the COM property "ShrinkToFit"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @VTID(31)
  void setShrinkToFit(
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "WrapText"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(32)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object getWrapText();


  /**
   * <p>
   * Setter method for the COM property "WrapText"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @VTID(33)
  void setWrapText(
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "Locked"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(34)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object getLocked();


  /**
   * <p>
   * Setter method for the COM property "Locked"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @VTID(35)
  void setLocked(
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "FormulaHidden"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(36)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object getFormulaHidden();


  /**
   * <p>
   * Setter method for the COM property "FormulaHidden"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @VTID(37)
  void setFormulaHidden(
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "MergeCells"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(38)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object getMergeCells();


  /**
   * <p>
   * Setter method for the COM property "MergeCells"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @VTID(39)
  void setMergeCells(
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   */

  @VTID(40)
  void clear();


  // Properties:
}
