package excel  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface DisplayFormat extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   */

  @DISPID(148)
  @PropGet
  excel._Application getApplication();


  /**
   * <p>
   * Getter method for the COM property "Creator"
   * </p>
   */

  @DISPID(149)
  @PropGet
  excel.XlCreator getCreator();


  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   */

  @DISPID(150)
  @PropGet
  com4j.Com4jObject getParent();


  /**
   * <p>
   * Getter method for the COM property "Borders"
   * </p>
   */

  @DISPID(435)
  @PropGet
  excel.Borders getBorders();


  /**
   * <p>
   * Getter method for the COM property "Characters"
   * </p>
   * @param start Optional parameter. Default value is com4j.Variant.getMissing()
   * @param length Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(603)
  @PropGet
  excel.Characters getCharacters(
    @Optional java.lang.Object start,
    @Optional java.lang.Object length);


  /**
   * <p>
   * Getter method for the COM property "Font"
   * </p>
   */

  @DISPID(146)
  @PropGet
  excel.Font getFont();


  /**
   * <p>
   * Getter method for the COM property "Style"
   * </p>
   */

  @DISPID(260)
  @PropGet
  java.lang.Object getStyle();


  /**
   * <p>
   * Getter method for the COM property "AddIndent"
   * </p>
   */

  @DISPID(1063)
  @PropGet
  java.lang.Object getAddIndent();


  /**
   * <p>
   * Getter method for the COM property "FormulaHidden"
   * </p>
   */

  @DISPID(262)
  @PropGet
  java.lang.Object getFormulaHidden();


  /**
   * <p>
   * Getter method for the COM property "HorizontalAlignment"
   * </p>
   */

  @DISPID(136)
  @PropGet
  java.lang.Object getHorizontalAlignment();


  /**
   * <p>
   * Getter method for the COM property "IndentLevel"
   * </p>
   */

  @DISPID(201)
  @PropGet
  java.lang.Object getIndentLevel();


  /**
   * <p>
   * Getter method for the COM property "Interior"
   * </p>
   */

  @DISPID(129)
  @PropGet
  excel.Interior getInterior();


  /**
   * <p>
   * Getter method for the COM property "Locked"
   * </p>
   */

  @DISPID(269)
  @PropGet
  java.lang.Object getLocked();


  /**
   * <p>
   * Getter method for the COM property "MergeCells"
   * </p>
   */

  @DISPID(208)
  @PropGet
  java.lang.Object getMergeCells();


  /**
   * <p>
   * Getter method for the COM property "NumberFormat"
   * </p>
   */

  @DISPID(193)
  @PropGet
  java.lang.Object getNumberFormat();


  /**
   * <p>
   * Getter method for the COM property "NumberFormatLocal"
   * </p>
   */

  @DISPID(1097)
  @PropGet
  java.lang.Object getNumberFormatLocal();


  /**
   * <p>
   * Getter method for the COM property "Orientation"
   * </p>
   */

  @DISPID(134)
  @PropGet
  java.lang.Object getOrientation();


  /**
   * <p>
   * Getter method for the COM property "ReadingOrder"
   * </p>
   */

  @DISPID(975)
  @PropGet
  int getReadingOrder();


  /**
   * <p>
   * Getter method for the COM property "ShrinkToFit"
   * </p>
   */

  @DISPID(209)
  @PropGet
  java.lang.Object getShrinkToFit();


  /**
   * <p>
   * Getter method for the COM property "VerticalAlignment"
   * </p>
   */

  @DISPID(137)
  @PropGet
  java.lang.Object getVerticalAlignment();


  /**
   * <p>
   * Getter method for the COM property "WrapText"
   * </p>
   */

  @DISPID(276)
  @PropGet
  java.lang.Object getWrapText();


  // Properties:
}
