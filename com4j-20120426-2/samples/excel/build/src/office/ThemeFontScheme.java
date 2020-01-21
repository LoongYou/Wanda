package office  ;

import com4j.*;

@IID("{000C03A5-0000-0000-C000-000000000046}")
public interface ThemeFontScheme extends office._IMsoDispObj {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(9)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject getParent();


  /**
   * @param fileName Mandatory java.lang.String parameter.
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(10)
  void load(
    java.lang.String fileName);


  /**
   * @param fileName Mandatory java.lang.String parameter.
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(11)
  void save(
    java.lang.String fileName);


  /**
   * <p>
   * Getter method for the COM property "MinorFont"
   * </p>
   * @return  Returns a value of type office.ThemeFonts
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(12)
  office.ThemeFonts getMinorFont();


  @VTID(12)
  @ReturnValue(defaultPropertyThrough={office.ThemeFonts.class})
  office.ThemeFont getMinorFont(
    office.MsoFontLanguageIndex index);

  /**
   * <p>
   * Getter method for the COM property "MajorFont"
   * </p>
   * @return  Returns a value of type office.ThemeFonts
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(13)
  office.ThemeFonts getMajorFont();


  @VTID(13)
  @ReturnValue(defaultPropertyThrough={office.ThemeFonts.class})
  office.ThemeFont getMajorFont(
    office.MsoFontLanguageIndex index);

  // Properties:
}
