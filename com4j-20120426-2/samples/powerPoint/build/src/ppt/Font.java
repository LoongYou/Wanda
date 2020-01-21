package ppt  ;

import com4j.*;

@IID("{91493495-5A91-11CF-8700-00AA0060263B}")
public interface Font extends Com4jObject {
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
   * Getter method for the COM property "Color"
   * </p>
   * @return  Returns a value of type ppt.ColorFormat
   */

  @DISPID(2003) //= 0x7d3. The runtime will prefer the VTID if present
  @VTID(9)
  ppt.ColorFormat color();


  /**
   * <p>
   * Getter method for the COM property "Bold"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @DISPID(2004) //= 0x7d4. The runtime will prefer the VTID if present
  @VTID(10)
  office.MsoTriState bold();


  /**
   * <p>
   * Setter method for the COM property "Bold"
   * </p>
   * @param bold Mandatory office.MsoTriState parameter.
   */

  @DISPID(2004) //= 0x7d4. The runtime will prefer the VTID if present
  @VTID(11)
  void bold(
    office.MsoTriState bold);


  /**
   * <p>
   * Getter method for the COM property "Italic"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @DISPID(2005) //= 0x7d5. The runtime will prefer the VTID if present
  @VTID(12)
  office.MsoTriState italic();


  /**
   * <p>
   * Setter method for the COM property "Italic"
   * </p>
   * @param italic Mandatory office.MsoTriState parameter.
   */

  @DISPID(2005) //= 0x7d5. The runtime will prefer the VTID if present
  @VTID(13)
  void italic(
    office.MsoTriState italic);


  /**
   * <p>
   * Getter method for the COM property "Shadow"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @DISPID(2006) //= 0x7d6. The runtime will prefer the VTID if present
  @VTID(14)
  office.MsoTriState shadow();


  /**
   * <p>
   * Setter method for the COM property "Shadow"
   * </p>
   * @param shadow Mandatory office.MsoTriState parameter.
   */

  @DISPID(2006) //= 0x7d6. The runtime will prefer the VTID if present
  @VTID(15)
  void shadow(
    office.MsoTriState shadow);


  /**
   * <p>
   * Getter method for the COM property "Emboss"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @DISPID(2007) //= 0x7d7. The runtime will prefer the VTID if present
  @VTID(16)
  office.MsoTriState emboss();


  /**
   * <p>
   * Setter method for the COM property "Emboss"
   * </p>
   * @param emboss Mandatory office.MsoTriState parameter.
   */

  @DISPID(2007) //= 0x7d7. The runtime will prefer the VTID if present
  @VTID(17)
  void emboss(
    office.MsoTriState emboss);


  /**
   * <p>
   * Getter method for the COM property "Underline"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @DISPID(2008) //= 0x7d8. The runtime will prefer the VTID if present
  @VTID(18)
  office.MsoTriState underline();


  /**
   * <p>
   * Setter method for the COM property "Underline"
   * </p>
   * @param underline Mandatory office.MsoTriState parameter.
   */

  @DISPID(2008) //= 0x7d8. The runtime will prefer the VTID if present
  @VTID(19)
  void underline(
    office.MsoTriState underline);


  /**
   * <p>
   * Getter method for the COM property "Subscript"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @DISPID(2009) //= 0x7d9. The runtime will prefer the VTID if present
  @VTID(20)
  office.MsoTriState subscript();


  /**
   * <p>
   * Setter method for the COM property "Subscript"
   * </p>
   * @param subscript Mandatory office.MsoTriState parameter.
   */

  @DISPID(2009) //= 0x7d9. The runtime will prefer the VTID if present
  @VTID(21)
  void subscript(
    office.MsoTriState subscript);


  /**
   * <p>
   * Getter method for the COM property "Superscript"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @DISPID(2010) //= 0x7da. The runtime will prefer the VTID if present
  @VTID(22)
  office.MsoTriState superscript();


  /**
   * <p>
   * Setter method for the COM property "Superscript"
   * </p>
   * @param superscript Mandatory office.MsoTriState parameter.
   */

  @DISPID(2010) //= 0x7da. The runtime will prefer the VTID if present
  @VTID(23)
  void superscript(
    office.MsoTriState superscript);


  /**
   * <p>
   * Getter method for the COM property "BaselineOffset"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(2011) //= 0x7db. The runtime will prefer the VTID if present
  @VTID(24)
  float baselineOffset();


  /**
   * <p>
   * Setter method for the COM property "BaselineOffset"
   * </p>
   * @param baselineOffset Mandatory float parameter.
   */

  @DISPID(2011) //= 0x7db. The runtime will prefer the VTID if present
  @VTID(25)
  void baselineOffset(
    float baselineOffset);


  /**
   * <p>
   * Getter method for the COM property "Embedded"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @DISPID(2012) //= 0x7dc. The runtime will prefer the VTID if present
  @VTID(26)
  office.MsoTriState embedded();


  /**
   * <p>
   * Getter method for the COM property "Embeddable"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @DISPID(2013) //= 0x7dd. The runtime will prefer the VTID if present
  @VTID(27)
  office.MsoTriState embeddable();


  /**
   * <p>
   * Getter method for the COM property "Size"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(2014) //= 0x7de. The runtime will prefer the VTID if present
  @VTID(28)
  float size();


  /**
   * <p>
   * Setter method for the COM property "Size"
   * </p>
   * @param size Mandatory float parameter.
   */

  @DISPID(2014) //= 0x7de. The runtime will prefer the VTID if present
  @VTID(29)
  void size(
    float size);


  /**
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(2015) //= 0x7df. The runtime will prefer the VTID if present
  @VTID(30)
  java.lang.String name();


  /**
   * <p>
   * Setter method for the COM property "Name"
   * </p>
   * @param name Mandatory java.lang.String parameter.
   */

  @DISPID(2015) //= 0x7df. The runtime will prefer the VTID if present
  @VTID(31)
  void name(
    java.lang.String name);


  /**
   * <p>
   * Getter method for the COM property "NameFarEast"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(2016) //= 0x7e0. The runtime will prefer the VTID if present
  @VTID(32)
  java.lang.String nameFarEast();


  /**
   * <p>
   * Setter method for the COM property "NameFarEast"
   * </p>
   * @param nameFarEast Mandatory java.lang.String parameter.
   */

  @DISPID(2016) //= 0x7e0. The runtime will prefer the VTID if present
  @VTID(33)
  void nameFarEast(
    java.lang.String nameFarEast);


  /**
   * <p>
   * Getter method for the COM property "NameAscii"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(2017) //= 0x7e1. The runtime will prefer the VTID if present
  @VTID(34)
  java.lang.String nameAscii();


  /**
   * <p>
   * Setter method for the COM property "NameAscii"
   * </p>
   * @param nameAscii Mandatory java.lang.String parameter.
   */

  @DISPID(2017) //= 0x7e1. The runtime will prefer the VTID if present
  @VTID(35)
  void nameAscii(
    java.lang.String nameAscii);


  /**
   * <p>
   * Getter method for the COM property "AutoRotateNumbers"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @DISPID(2018) //= 0x7e2. The runtime will prefer the VTID if present
  @VTID(36)
  office.MsoTriState autoRotateNumbers();


  /**
   * <p>
   * Setter method for the COM property "AutoRotateNumbers"
   * </p>
   * @param autoRotateNumbers Mandatory office.MsoTriState parameter.
   */

  @DISPID(2018) //= 0x7e2. The runtime will prefer the VTID if present
  @VTID(37)
  void autoRotateNumbers(
    office.MsoTriState autoRotateNumbers);


  /**
   * <p>
   * Getter method for the COM property "NameOther"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(2019) //= 0x7e3. The runtime will prefer the VTID if present
  @VTID(38)
  java.lang.String nameOther();


  /**
   * <p>
   * Setter method for the COM property "NameOther"
   * </p>
   * @param nameOther Mandatory java.lang.String parameter.
   */

  @DISPID(2019) //= 0x7e3. The runtime will prefer the VTID if present
  @VTID(39)
  void nameOther(
    java.lang.String nameOther);


  /**
   * <p>
   * Getter method for the COM property "NameComplexScript"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(2020) //= 0x7e4. The runtime will prefer the VTID if present
  @VTID(40)
  java.lang.String nameComplexScript();


  /**
   * <p>
   * Setter method for the COM property "NameComplexScript"
   * </p>
   * @param nameComplexScript Mandatory java.lang.String parameter.
   */

  @DISPID(2020) //= 0x7e4. The runtime will prefer the VTID if present
  @VTID(41)
  void nameComplexScript(
    java.lang.String nameComplexScript);


  // Properties:
}
