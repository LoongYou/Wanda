package office  ;

import com4j.*;

@IID("{000C03A0-0000-0000-C000-000000000046}")
public interface OfficeTheme extends office._IMsoDispObj {
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
  com4j.Com4jObject parent();


  /**
   * <p>
   * Getter method for the COM property "ThemeColorScheme"
   * </p>
   * @return  Returns a value of type office.ThemeColorScheme
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(10)
  office.ThemeColorScheme themeColorScheme();


  @VTID(10)
  @ReturnValue(defaultPropertyThrough={office.ThemeColorScheme.class})
  office.ThemeColor themeColorScheme(
    office.MsoThemeColorSchemeIndex index);

  /**
   * <p>
   * Getter method for the COM property "ThemeFontScheme"
   * </p>
   * @return  Returns a value of type office.ThemeFontScheme
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(11)
  office.ThemeFontScheme themeFontScheme();


  /**
   * <p>
   * Getter method for the COM property "ThemeEffectScheme"
   * </p>
   * @return  Returns a value of type office.ThemeEffectScheme
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(12)
  office.ThemeEffectScheme themeEffectScheme();


  // Properties:
}
