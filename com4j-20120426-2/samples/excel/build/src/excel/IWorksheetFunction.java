package excel  ;

import com4j.*;

@IID("{00020845-0001-0000-C000-000000000046}")
public interface IWorksheetFunction extends Com4jObject {
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
   * @param arg1 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg2 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg3 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg4 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg5 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg6 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg7 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg8 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg9 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg10 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg11 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg12 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg13 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg14 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg15 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg16 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg17 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg18 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg19 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg20 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg21 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg22 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg23 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg24 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg25 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg26 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg27 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg28 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg29 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg30 Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(10)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object _WSFunction(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg1,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg2,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg3,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg4,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg5,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg6,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg7,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg8,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg9,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg10,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg11,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg12,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg13,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg14,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg15,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg16,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg17,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg18,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg19,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg20,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg21,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg22,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg23,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg24,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg25,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg26,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg27,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg28,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg29,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg30);


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @param arg2 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg3 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg4 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg5 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg6 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg7 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg8 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg9 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg10 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg11 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg12 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg13 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg14 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg15 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg16 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg17 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg18 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg19 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg20 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg21 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg22 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg23 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg24 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg25 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg26 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg27 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg28 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg29 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg30 Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type double
   */

  @VTID(11)
  double count(
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg1,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg2,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg3,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg4,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg5,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg6,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg7,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg8,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg9,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg10,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg11,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg12,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg13,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg14,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg15,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg16,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg17,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg18,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg19,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg20,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg21,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg22,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg23,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg24,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg25,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg26,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg27,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg28,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg29,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg30);


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @return  Returns a value of type boolean
   */

  @VTID(12)
  boolean isNA(
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg1);


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @return  Returns a value of type boolean
   */

  @VTID(13)
  boolean isError(
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg1);


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @param arg2 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg3 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg4 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg5 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg6 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg7 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg8 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg9 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg10 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg11 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg12 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg13 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg14 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg15 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg16 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg17 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg18 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg19 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg20 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg21 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg22 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg23 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg24 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg25 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg26 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg27 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg28 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg29 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg30 Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type double
   */

  @VTID(14)
  double sum(
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg1,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg2,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg3,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg4,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg5,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg6,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg7,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg8,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg9,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg10,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg11,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg12,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg13,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg14,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg15,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg16,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg17,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg18,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg19,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg20,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg21,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg22,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg23,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg24,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg25,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg26,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg27,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg28,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg29,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg30);


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @param arg2 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg3 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg4 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg5 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg6 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg7 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg8 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg9 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg10 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg11 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg12 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg13 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg14 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg15 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg16 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg17 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg18 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg19 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg20 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg21 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg22 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg23 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg24 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg25 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg26 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg27 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg28 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg29 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg30 Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type double
   */

  @VTID(15)
  double average(
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg1,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg2,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg3,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg4,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg5,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg6,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg7,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg8,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg9,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg10,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg11,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg12,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg13,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg14,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg15,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg16,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg17,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg18,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg19,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg20,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg21,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg22,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg23,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg24,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg25,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg26,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg27,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg28,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg29,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg30);


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @param arg2 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg3 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg4 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg5 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg6 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg7 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg8 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg9 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg10 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg11 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg12 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg13 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg14 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg15 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg16 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg17 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg18 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg19 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg20 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg21 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg22 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg23 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg24 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg25 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg26 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg27 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg28 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg29 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg30 Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type double
   */

  @VTID(16)
  double min(
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg1,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg2,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg3,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg4,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg5,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg6,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg7,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg8,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg9,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg10,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg11,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg12,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg13,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg14,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg15,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg16,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg17,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg18,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg19,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg20,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg21,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg22,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg23,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg24,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg25,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg26,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg27,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg28,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg29,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg30);


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @param arg2 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg3 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg4 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg5 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg6 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg7 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg8 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg9 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg10 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg11 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg12 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg13 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg14 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg15 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg16 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg17 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg18 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg19 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg20 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg21 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg22 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg23 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg24 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg25 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg26 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg27 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg28 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg29 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg30 Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type double
   */

  @VTID(17)
  double max(
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg1,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg2,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg3,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg4,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg5,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg6,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg7,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg8,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg9,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg10,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg11,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg12,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg13,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg14,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg15,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg16,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg17,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg18,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg19,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg20,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg21,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg22,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg23,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg24,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg25,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg26,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg27,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg28,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg29,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg30);


  /**
   * @param arg1 Mandatory double parameter.
   * @param arg2 Mandatory java.lang.Object parameter.
   * @param arg3 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg4 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg5 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg6 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg7 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg8 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg9 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg10 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg11 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg12 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg13 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg14 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg15 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg16 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg17 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg18 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg19 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg20 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg21 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg22 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg23 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg24 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg25 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg26 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg27 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg28 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg29 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg30 Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type double
   */

  @VTID(18)
  double npv(
    double arg1,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg2,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg3,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg4,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg5,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg6,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg7,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg8,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg9,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg10,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg11,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg12,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg13,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg14,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg15,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg16,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg17,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg18,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg19,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg20,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg21,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg22,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg23,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg24,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg25,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg26,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg27,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg28,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg29,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg30);


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @param arg2 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg3 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg4 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg5 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg6 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg7 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg8 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg9 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg10 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg11 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg12 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg13 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg14 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg15 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg16 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg17 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg18 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg19 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg20 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg21 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg22 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg23 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg24 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg25 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg26 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg27 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg28 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg29 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg30 Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type double
   */

  @VTID(19)
  double stDev(
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg1,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg2,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg3,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg4,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg5,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg6,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg7,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg8,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg9,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg10,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg11,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg12,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg13,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg14,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg15,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg16,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg17,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg18,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg19,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg20,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg21,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg22,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg23,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg24,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg25,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg26,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg27,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg28,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg29,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg30);


  /**
   * @param arg1 Mandatory double parameter.
   * @param arg2 Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type java.lang.String
   */

  @VTID(20)
  java.lang.String dollar(
    double arg1,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg2);


  /**
   * @param arg1 Mandatory double parameter.
   * @param arg2 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg3 Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type java.lang.String
   */

  @VTID(21)
  java.lang.String fixed(
    double arg1,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg2,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg3);


  /**
   * @return  Returns a value of type double
   */

  @VTID(22)
  double pi();


  /**
   * @param arg1 Mandatory double parameter.
   * @return  Returns a value of type double
   */

  @VTID(23)
  double ln(
    double arg1);


  /**
   * @param arg1 Mandatory double parameter.
   * @return  Returns a value of type double
   */

  @VTID(24)
  double log10(
    double arg1);


  /**
   * @param arg1 Mandatory double parameter.
   * @param arg2 Mandatory double parameter.
   * @return  Returns a value of type double
   */

  @VTID(25)
  double round(
    double arg1,
    double arg2);


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @param arg2 Mandatory java.lang.Object parameter.
   * @param arg3 Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(26)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object lookup(
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg1,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg2,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg3);


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @param arg2 Mandatory double parameter.
   * @param arg3 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg4 Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(27)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object index(
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg1,
    double arg2,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg3,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg4);


  /**
   * @param arg1 Mandatory java.lang.String parameter.
   * @param arg2 Mandatory double parameter.
   * @return  Returns a value of type java.lang.String
   */

  @VTID(28)
  java.lang.String rept(
    java.lang.String arg1,
    double arg2);


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @param arg2 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg3 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg4 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg5 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg6 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg7 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg8 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg9 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg10 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg11 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg12 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg13 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg14 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg15 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg16 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg17 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg18 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg19 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg20 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg21 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg22 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg23 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg24 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg25 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg26 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg27 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg28 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg29 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg30 Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type boolean
   */

  @VTID(29)
  boolean and(
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg1,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg2,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg3,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg4,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg5,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg6,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg7,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg8,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg9,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg10,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg11,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg12,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg13,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg14,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg15,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg16,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg17,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg18,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg19,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg20,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg21,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg22,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg23,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg24,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg25,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg26,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg27,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg28,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg29,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg30);


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @param arg2 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg3 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg4 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg5 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg6 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg7 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg8 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg9 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg10 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg11 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg12 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg13 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg14 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg15 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg16 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg17 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg18 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg19 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg20 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg21 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg22 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg23 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg24 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg25 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg26 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg27 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg28 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg29 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg30 Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type boolean
   */

  @VTID(30)
  boolean or(
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg1,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg2,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg3,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg4,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg5,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg6,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg7,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg8,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg9,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg10,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg11,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg12,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg13,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg14,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg15,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg16,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg17,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg18,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg19,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg20,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg21,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg22,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg23,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg24,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg25,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg26,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg27,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg28,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg29,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg30);


  /**
   * @param arg1 Mandatory excel.Range parameter.
   * @param arg2 Mandatory java.lang.Object parameter.
   * @param arg3 Mandatory java.lang.Object parameter.
   * @return  Returns a value of type double
   */

  @VTID(31)
  double dCount(
    excel.Range arg1,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg2,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg3);


  /**
   * @param arg1 Mandatory excel.Range parameter.
   * @param arg2 Mandatory java.lang.Object parameter.
   * @param arg3 Mandatory java.lang.Object parameter.
   * @return  Returns a value of type double
   */

  @VTID(32)
  double dSum(
    excel.Range arg1,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg2,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg3);


  /**
   * @param arg1 Mandatory excel.Range parameter.
   * @param arg2 Mandatory java.lang.Object parameter.
   * @param arg3 Mandatory java.lang.Object parameter.
   * @return  Returns a value of type double
   */

  @VTID(33)
  double dAverage(
    excel.Range arg1,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg2,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg3);


  /**
   * @param arg1 Mandatory excel.Range parameter.
   * @param arg2 Mandatory java.lang.Object parameter.
   * @param arg3 Mandatory java.lang.Object parameter.
   * @return  Returns a value of type double
   */

  @VTID(34)
  double dMin(
    excel.Range arg1,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg2,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg3);


  /**
   * @param arg1 Mandatory excel.Range parameter.
   * @param arg2 Mandatory java.lang.Object parameter.
   * @param arg3 Mandatory java.lang.Object parameter.
   * @return  Returns a value of type double
   */

  @VTID(35)
  double dMax(
    excel.Range arg1,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg2,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg3);


  /**
   * @param arg1 Mandatory excel.Range parameter.
   * @param arg2 Mandatory java.lang.Object parameter.
   * @param arg3 Mandatory java.lang.Object parameter.
   * @return  Returns a value of type double
   */

  @VTID(36)
  double dStDev(
    excel.Range arg1,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg2,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg3);


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @param arg2 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg3 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg4 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg5 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg6 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg7 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg8 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg9 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg10 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg11 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg12 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg13 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg14 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg15 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg16 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg17 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg18 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg19 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg20 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg21 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg22 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg23 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg24 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg25 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg26 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg27 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg28 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg29 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg30 Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type double
   */

  @VTID(37)
  double var(
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg1,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg2,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg3,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg4,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg5,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg6,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg7,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg8,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg9,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg10,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg11,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg12,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg13,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg14,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg15,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg16,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg17,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg18,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg19,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg20,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg21,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg22,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg23,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg24,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg25,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg26,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg27,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg28,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg29,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg30);


  /**
   * @param arg1 Mandatory excel.Range parameter.
   * @param arg2 Mandatory java.lang.Object parameter.
   * @param arg3 Mandatory java.lang.Object parameter.
   * @return  Returns a value of type double
   */

  @VTID(38)
  double dVar(
    excel.Range arg1,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg2,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg3);


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @param arg2 Mandatory java.lang.String parameter.
   * @return  Returns a value of type java.lang.String
   */

  @VTID(39)
  java.lang.String text(
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg1,
    java.lang.String arg2);


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @param arg2 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg3 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg4 Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(40)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object linEst(
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg1,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg2,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg3,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg4);


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @param arg2 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg3 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg4 Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(41)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object trend(
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg1,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg2,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg3,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg4);


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @param arg2 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg3 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg4 Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(42)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object logEst(
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg1,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg2,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg3,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg4);


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @param arg2 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg3 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg4 Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(43)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object growth(
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg1,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg2,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg3,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg4);


  /**
   * @param arg1 Mandatory double parameter.
   * @param arg2 Mandatory double parameter.
   * @param arg3 Mandatory double parameter.
   * @param arg4 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg5 Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type double
   */

  @VTID(44)
  double pv(
    double arg1,
    double arg2,
    double arg3,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg4,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg5);


  /**
   * @param arg1 Mandatory double parameter.
   * @param arg2 Mandatory double parameter.
   * @param arg3 Mandatory double parameter.
   * @param arg4 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg5 Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type double
   */

  @VTID(45)
  double fv(
    double arg1,
    double arg2,
    double arg3,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg4,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg5);


  /**
   * @param arg1 Mandatory double parameter.
   * @param arg2 Mandatory double parameter.
   * @param arg3 Mandatory double parameter.
   * @param arg4 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg5 Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type double
   */

  @VTID(46)
  double nPer(
    double arg1,
    double arg2,
    double arg3,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg4,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg5);


  /**
   * @param arg1 Mandatory double parameter.
   * @param arg2 Mandatory double parameter.
   * @param arg3 Mandatory double parameter.
   * @param arg4 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg5 Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type double
   */

  @VTID(47)
  double pmt(
    double arg1,
    double arg2,
    double arg3,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg4,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg5);


  /**
   * @param arg1 Mandatory double parameter.
   * @param arg2 Mandatory double parameter.
   * @param arg3 Mandatory double parameter.
   * @param arg4 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg5 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg6 Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type double
   */

  @VTID(48)
  double rate(
    double arg1,
    double arg2,
    double arg3,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg4,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg5,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg6);


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @param arg2 Mandatory double parameter.
   * @param arg3 Mandatory double parameter.
   * @return  Returns a value of type double
   */

  @VTID(49)
  double mIrr(
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg1,
    double arg2,
    double arg3);


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @param arg2 Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type double
   */

  @VTID(50)
  double irr(
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg1,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg2);


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @param arg2 Mandatory java.lang.Object parameter.
   * @param arg3 Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type double
   */

  @VTID(51)
  double match(
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg1,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg2,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg3);


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @param arg2 Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type double
   */

  @VTID(52)
  double weekday(
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg1,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg2);


  /**
   * @param arg1 Mandatory java.lang.String parameter.
   * @param arg2 Mandatory java.lang.String parameter.
   * @param arg3 Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type double
   */

  @VTID(53)
  double search(
    java.lang.String arg1,
    java.lang.String arg2,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg3);


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(54)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object transpose(
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg1);


  /**
   * @param arg1 Mandatory double parameter.
   * @param arg2 Mandatory double parameter.
   * @return  Returns a value of type double
   */

  @VTID(55)
  double atan2(
    double arg1,
    double arg2);


  /**
   * @param arg1 Mandatory double parameter.
   * @return  Returns a value of type double
   */

  @VTID(56)
  double asin(
    double arg1);


  /**
   * @param arg1 Mandatory double parameter.
   * @return  Returns a value of type double
   */

  @VTID(57)
  double acos(
    double arg1);


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @param arg2 Mandatory java.lang.Object parameter.
   * @param arg3 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg4 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg5 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg6 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg7 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg8 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg9 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg10 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg11 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg12 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg13 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg14 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg15 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg16 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg17 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg18 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg19 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg20 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg21 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg22 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg23 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg24 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg25 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg26 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg27 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg28 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg29 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg30 Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(58)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object choose(
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg1,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg2,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg3,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg4,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg5,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg6,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg7,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg8,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg9,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg10,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg11,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg12,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg13,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg14,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg15,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg16,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg17,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg18,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg19,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg20,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg21,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg22,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg23,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg24,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg25,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg26,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg27,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg28,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg29,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg30);


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @param arg2 Mandatory java.lang.Object parameter.
   * @param arg3 Mandatory java.lang.Object parameter.
   * @param arg4 Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(59)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object hLookup(
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg1,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg2,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg3,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg4);


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @param arg2 Mandatory java.lang.Object parameter.
   * @param arg3 Mandatory java.lang.Object parameter.
   * @param arg4 Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(60)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object vLookup(
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg1,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg2,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg3,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg4);


  /**
   * @param arg1 Mandatory double parameter.
   * @param arg2 Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type double
   */

  @VTID(61)
  double log(
    double arg1,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg2);


  /**
   * @param arg1 Mandatory java.lang.String parameter.
   * @return  Returns a value of type java.lang.String
   */

  @VTID(62)
  java.lang.String proper(
    java.lang.String arg1);


  /**
   * @param arg1 Mandatory java.lang.String parameter.
   * @return  Returns a value of type java.lang.String
   */

  @VTID(63)
  java.lang.String trim(
    java.lang.String arg1);


  /**
   * @param arg1 Mandatory java.lang.String parameter.
   * @param arg2 Mandatory double parameter.
   * @param arg3 Mandatory double parameter.
   * @param arg4 Mandatory java.lang.String parameter.
   * @return  Returns a value of type java.lang.String
   */

  @VTID(64)
  java.lang.String replace(
    java.lang.String arg1,
    double arg2,
    double arg3,
    java.lang.String arg4);


  /**
   * @param arg1 Mandatory java.lang.String parameter.
   * @param arg2 Mandatory java.lang.String parameter.
   * @param arg3 Mandatory java.lang.String parameter.
   * @param arg4 Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type java.lang.String
   */

  @VTID(65)
  java.lang.String substitute(
    java.lang.String arg1,
    java.lang.String arg2,
    java.lang.String arg3,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg4);


  /**
   * @param arg1 Mandatory java.lang.String parameter.
   * @param arg2 Mandatory java.lang.String parameter.
   * @param arg3 Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type double
   */

  @VTID(66)
  double find(
    java.lang.String arg1,
    java.lang.String arg2,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg3);


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @return  Returns a value of type boolean
   */

  @VTID(67)
  boolean isErr(
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg1);


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @return  Returns a value of type boolean
   */

  @VTID(68)
  boolean isText(
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg1);


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @return  Returns a value of type boolean
   */

  @VTID(69)
  boolean isNumber(
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg1);


  /**
   * @param arg1 Mandatory double parameter.
   * @param arg2 Mandatory double parameter.
   * @param arg3 Mandatory double parameter.
   * @return  Returns a value of type double
   */

  @VTID(70)
  double sln(
    double arg1,
    double arg2,
    double arg3);


  /**
   * @param arg1 Mandatory double parameter.
   * @param arg2 Mandatory double parameter.
   * @param arg3 Mandatory double parameter.
   * @param arg4 Mandatory double parameter.
   * @return  Returns a value of type double
   */

  @VTID(71)
  double syd(
    double arg1,
    double arg2,
    double arg3,
    double arg4);


  /**
   * @param arg1 Mandatory double parameter.
   * @param arg2 Mandatory double parameter.
   * @param arg3 Mandatory double parameter.
   * @param arg4 Mandatory double parameter.
   * @param arg5 Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type double
   */

  @VTID(72)
  double ddb(
    double arg1,
    double arg2,
    double arg3,
    double arg4,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg5);


  /**
   * @param arg1 Mandatory java.lang.String parameter.
   * @return  Returns a value of type java.lang.String
   */

  @VTID(73)
  java.lang.String clean(
    java.lang.String arg1);


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @return  Returns a value of type double
   */

  @VTID(74)
  double mDeterm(
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg1);


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(75)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object mInverse(
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg1);


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @param arg2 Mandatory java.lang.Object parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(76)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object mMult(
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg1,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg2);


  /**
   * @param arg1 Mandatory double parameter.
   * @param arg2 Mandatory double parameter.
   * @param arg3 Mandatory double parameter.
   * @param arg4 Mandatory double parameter.
   * @param arg5 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg6 Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type double
   */

  @VTID(77)
  double ipmt(
    double arg1,
    double arg2,
    double arg3,
    double arg4,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg5,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg6);


  /**
   * @param arg1 Mandatory double parameter.
   * @param arg2 Mandatory double parameter.
   * @param arg3 Mandatory double parameter.
   * @param arg4 Mandatory double parameter.
   * @param arg5 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg6 Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type double
   */

  @VTID(78)
  double ppmt(
    double arg1,
    double arg2,
    double arg3,
    double arg4,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg5,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg6);


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @param arg2 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg3 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg4 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg5 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg6 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg7 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg8 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg9 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg10 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg11 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg12 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg13 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg14 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg15 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg16 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg17 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg18 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg19 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg20 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg21 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg22 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg23 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg24 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg25 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg26 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg27 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg28 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg29 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg30 Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type double
   */

  @VTID(79)
  double countA(
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg1,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg2,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg3,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg4,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg5,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg6,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg7,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg8,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg9,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg10,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg11,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg12,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg13,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg14,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg15,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg16,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg17,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg18,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg19,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg20,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg21,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg22,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg23,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg24,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg25,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg26,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg27,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg28,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg29,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg30);


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @param arg2 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg3 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg4 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg5 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg6 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg7 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg8 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg9 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg10 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg11 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg12 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg13 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg14 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg15 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg16 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg17 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg18 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg19 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg20 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg21 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg22 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg23 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg24 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg25 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg26 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg27 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg28 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg29 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg30 Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type double
   */

  @VTID(80)
  double product(
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg1,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg2,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg3,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg4,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg5,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg6,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg7,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg8,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg9,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg10,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg11,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg12,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg13,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg14,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg15,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg16,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg17,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg18,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg19,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg20,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg21,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg22,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg23,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg24,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg25,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg26,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg27,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg28,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg29,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg30);


  /**
   * @param arg1 Mandatory double parameter.
   * @return  Returns a value of type double
   */

  @VTID(81)
  double fact(
    double arg1);


  /**
   * @param arg1 Mandatory excel.Range parameter.
   * @param arg2 Mandatory java.lang.Object parameter.
   * @param arg3 Mandatory java.lang.Object parameter.
   * @return  Returns a value of type double
   */

  @VTID(82)
  double dProduct(
    excel.Range arg1,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg2,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg3);


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @return  Returns a value of type boolean
   */

  @VTID(83)
  boolean isNonText(
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg1);


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @param arg2 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg3 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg4 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg5 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg6 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg7 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg8 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg9 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg10 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg11 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg12 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg13 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg14 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg15 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg16 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg17 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg18 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg19 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg20 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg21 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg22 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg23 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg24 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg25 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg26 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg27 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg28 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg29 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg30 Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type double
   */

  @VTID(84)
  double stDevP(
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg1,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg2,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg3,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg4,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg5,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg6,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg7,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg8,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg9,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg10,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg11,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg12,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg13,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg14,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg15,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg16,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg17,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg18,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg19,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg20,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg21,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg22,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg23,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg24,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg25,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg26,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg27,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg28,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg29,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg30);


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @param arg2 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg3 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg4 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg5 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg6 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg7 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg8 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg9 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg10 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg11 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg12 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg13 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg14 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg15 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg16 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg17 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg18 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg19 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg20 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg21 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg22 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg23 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg24 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg25 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg26 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg27 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg28 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg29 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg30 Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type double
   */

  @VTID(85)
  double varP(
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg1,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg2,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg3,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg4,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg5,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg6,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg7,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg8,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg9,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg10,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg11,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg12,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg13,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg14,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg15,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg16,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg17,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg18,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg19,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg20,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg21,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg22,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg23,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg24,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg25,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg26,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg27,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg28,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg29,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg30);


  /**
   * @param arg1 Mandatory excel.Range parameter.
   * @param arg2 Mandatory java.lang.Object parameter.
   * @param arg3 Mandatory java.lang.Object parameter.
   * @return  Returns a value of type double
   */

  @VTID(86)
  double dStDevP(
    excel.Range arg1,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg2,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg3);


  /**
   * @param arg1 Mandatory excel.Range parameter.
   * @param arg2 Mandatory java.lang.Object parameter.
   * @param arg3 Mandatory java.lang.Object parameter.
   * @return  Returns a value of type double
   */

  @VTID(87)
  double dVarP(
    excel.Range arg1,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg2,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg3);


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @return  Returns a value of type boolean
   */

  @VTID(88)
  boolean isLogical(
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg1);


  /**
   * @param arg1 Mandatory excel.Range parameter.
   * @param arg2 Mandatory java.lang.Object parameter.
   * @param arg3 Mandatory java.lang.Object parameter.
   * @return  Returns a value of type double
   */

  @VTID(89)
  double dCountA(
    excel.Range arg1,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg2,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg3);


  /**
   * @param arg1 Mandatory double parameter.
   * @param arg2 Mandatory double parameter.
   * @return  Returns a value of type java.lang.String
   */

  @VTID(90)
  java.lang.String usDollar(
    double arg1,
    double arg2);


  /**
   * @param arg1 Mandatory java.lang.String parameter.
   * @param arg2 Mandatory java.lang.String parameter.
   * @param arg3 Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type double
   */

  @VTID(91)
  double findB(
    java.lang.String arg1,
    java.lang.String arg2,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg3);


  /**
   * @param arg1 Mandatory java.lang.String parameter.
   * @param arg2 Mandatory java.lang.String parameter.
   * @param arg3 Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type double
   */

  @VTID(92)
  double searchB(
    java.lang.String arg1,
    java.lang.String arg2,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg3);


  /**
   * @param arg1 Mandatory java.lang.String parameter.
   * @param arg2 Mandatory double parameter.
   * @param arg3 Mandatory double parameter.
   * @param arg4 Mandatory java.lang.String parameter.
   * @return  Returns a value of type java.lang.String
   */

  @VTID(93)
  java.lang.String replaceB(
    java.lang.String arg1,
    double arg2,
    double arg3,
    java.lang.String arg4);


  /**
   * @param arg1 Mandatory double parameter.
   * @param arg2 Mandatory double parameter.
   * @return  Returns a value of type double
   */

  @VTID(94)
  double roundUp(
    double arg1,
    double arg2);


  /**
   * @param arg1 Mandatory double parameter.
   * @param arg2 Mandatory double parameter.
   * @return  Returns a value of type double
   */

  @VTID(95)
  double roundDown(
    double arg1,
    double arg2);


  /**
   * @param arg1 Mandatory double parameter.
   * @param arg2 Mandatory excel.Range parameter.
   * @param arg3 Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type double
   */

  @VTID(96)
  double rank(
    double arg1,
    excel.Range arg2,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg3);


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @param arg2 Mandatory java.lang.Object parameter.
   * @param arg3 Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type double
   */

  @VTID(97)
  double days360(
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg1,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg2,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg3);


  /**
   * @param arg1 Mandatory double parameter.
   * @param arg2 Mandatory double parameter.
   * @param arg3 Mandatory double parameter.
   * @param arg4 Mandatory double parameter.
   * @param arg5 Mandatory double parameter.
   * @param arg6 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg7 Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type double
   */

  @VTID(98)
  double vdb(
    double arg1,
    double arg2,
    double arg3,
    double arg4,
    double arg5,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg6,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg7);


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @param arg2 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg3 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg4 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg5 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg6 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg7 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg8 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg9 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg10 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg11 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg12 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg13 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg14 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg15 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg16 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg17 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg18 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg19 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg20 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg21 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg22 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg23 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg24 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg25 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg26 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg27 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg28 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg29 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg30 Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type double
   */

  @VTID(99)
  double median(
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg1,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg2,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg3,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg4,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg5,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg6,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg7,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg8,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg9,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg10,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg11,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg12,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg13,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg14,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg15,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg16,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg17,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg18,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg19,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg20,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg21,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg22,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg23,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg24,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg25,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg26,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg27,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg28,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg29,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg30);


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @param arg2 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg3 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg4 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg5 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg6 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg7 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg8 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg9 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg10 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg11 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg12 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg13 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg14 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg15 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg16 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg17 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg18 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg19 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg20 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg21 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg22 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg23 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg24 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg25 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg26 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg27 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg28 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg29 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg30 Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type double
   */

  @VTID(100)
  double sumProduct(
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg1,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg2,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg3,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg4,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg5,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg6,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg7,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg8,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg9,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg10,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg11,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg12,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg13,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg14,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg15,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg16,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg17,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg18,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg19,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg20,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg21,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg22,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg23,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg24,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg25,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg26,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg27,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg28,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg29,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg30);


  /**
   * @param arg1 Mandatory double parameter.
   * @return  Returns a value of type double
   */

  @VTID(101)
  double sinh(
    double arg1);


  /**
   * @param arg1 Mandatory double parameter.
   * @return  Returns a value of type double
   */

  @VTID(102)
  double cosh(
    double arg1);


  /**
   * @param arg1 Mandatory double parameter.
   * @return  Returns a value of type double
   */

  @VTID(103)
  double tanh(
    double arg1);


  /**
   * @param arg1 Mandatory double parameter.
   * @return  Returns a value of type double
   */

  @VTID(104)
  double asinh(
    double arg1);


  /**
   * @param arg1 Mandatory double parameter.
   * @return  Returns a value of type double
   */

  @VTID(105)
  double acosh(
    double arg1);


  /**
   * @param arg1 Mandatory double parameter.
   * @return  Returns a value of type double
   */

  @VTID(106)
  double atanh(
    double arg1);


  /**
   * @param arg1 Mandatory excel.Range parameter.
   * @param arg2 Mandatory java.lang.Object parameter.
   * @param arg3 Mandatory java.lang.Object parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(107)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object dGet(
    excel.Range arg1,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg2,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg3);


  /**
   * @param arg1 Mandatory double parameter.
   * @param arg2 Mandatory double parameter.
   * @param arg3 Mandatory double parameter.
   * @param arg4 Mandatory double parameter.
   * @param arg5 Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type double
   */

  @VTID(108)
  double db(
    double arg1,
    double arg2,
    double arg3,
    double arg4,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg5);


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @param arg2 Mandatory java.lang.Object parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(109)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object frequency(
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg1,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg2);


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @param arg2 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg3 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg4 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg5 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg6 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg7 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg8 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg9 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg10 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg11 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg12 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg13 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg14 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg15 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg16 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg17 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg18 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg19 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg20 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg21 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg22 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg23 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg24 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg25 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg26 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg27 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg28 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg29 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg30 Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type double
   */

  @VTID(110)
  double aveDev(
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg1,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg2,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg3,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg4,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg5,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg6,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg7,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg8,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg9,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg10,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg11,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg12,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg13,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg14,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg15,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg16,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg17,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg18,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg19,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg20,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg21,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg22,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg23,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg24,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg25,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg26,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg27,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg28,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg29,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg30);


  /**
   * @param arg1 Mandatory double parameter.
   * @param arg2 Mandatory double parameter.
   * @param arg3 Mandatory double parameter.
   * @param arg4 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg5 Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type double
   */

  @VTID(111)
  double betaDist(
    double arg1,
    double arg2,
    double arg3,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg4,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg5);


  /**
   * @param arg1 Mandatory double parameter.
   * @return  Returns a value of type double
   */

  @VTID(112)
  double gammaLn(
    double arg1);


  /**
   * @param arg1 Mandatory double parameter.
   * @param arg2 Mandatory double parameter.
   * @param arg3 Mandatory double parameter.
   * @param arg4 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg5 Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type double
   */

  @VTID(113)
  double betaInv(
    double arg1,
    double arg2,
    double arg3,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg4,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg5);


  /**
   * @param arg1 Mandatory double parameter.
   * @param arg2 Mandatory double parameter.
   * @param arg3 Mandatory double parameter.
   * @param arg4 Mandatory boolean parameter.
   * @return  Returns a value of type double
   */

  @VTID(114)
  double binomDist(
    double arg1,
    double arg2,
    double arg3,
    boolean arg4);


  /**
   * @param arg1 Mandatory double parameter.
   * @param arg2 Mandatory double parameter.
   * @return  Returns a value of type double
   */

  @VTID(115)
  double chiDist(
    double arg1,
    double arg2);


  /**
   * @param arg1 Mandatory double parameter.
   * @param arg2 Mandatory double parameter.
   * @return  Returns a value of type double
   */

  @VTID(116)
  double chiInv(
    double arg1,
    double arg2);


  /**
   * @param arg1 Mandatory double parameter.
   * @param arg2 Mandatory double parameter.
   * @return  Returns a value of type double
   */

  @VTID(117)
  double combin(
    double arg1,
    double arg2);


  /**
   * @param arg1 Mandatory double parameter.
   * @param arg2 Mandatory double parameter.
   * @param arg3 Mandatory double parameter.
   * @return  Returns a value of type double
   */

  @VTID(118)
  double confidence(
    double arg1,
    double arg2,
    double arg3);


  /**
   * @param arg1 Mandatory double parameter.
   * @param arg2 Mandatory double parameter.
   * @param arg3 Mandatory double parameter.
   * @return  Returns a value of type double
   */

  @VTID(119)
  double critBinom(
    double arg1,
    double arg2,
    double arg3);


  /**
   * @param arg1 Mandatory double parameter.
   * @return  Returns a value of type double
   */

  @VTID(120)
  double even(
    double arg1);


  /**
   * @param arg1 Mandatory double parameter.
   * @param arg2 Mandatory double parameter.
   * @param arg3 Mandatory boolean parameter.
   * @return  Returns a value of type double
   */

  @VTID(121)
  double exponDist(
    double arg1,
    double arg2,
    boolean arg3);


  /**
   * @param arg1 Mandatory double parameter.
   * @param arg2 Mandatory double parameter.
   * @param arg3 Mandatory double parameter.
   * @return  Returns a value of type double
   */

  @VTID(122)
  double fDist(
    double arg1,
    double arg2,
    double arg3);


  /**
   * @param arg1 Mandatory double parameter.
   * @param arg2 Mandatory double parameter.
   * @param arg3 Mandatory double parameter.
   * @return  Returns a value of type double
   */

  @VTID(123)
  double fInv(
    double arg1,
    double arg2,
    double arg3);


  /**
   * @param arg1 Mandatory double parameter.
   * @return  Returns a value of type double
   */

  @VTID(124)
  double fisher(
    double arg1);


  /**
   * @param arg1 Mandatory double parameter.
   * @return  Returns a value of type double
   */

  @VTID(125)
  double fisherInv(
    double arg1);


  /**
   * @param arg1 Mandatory double parameter.
   * @param arg2 Mandatory double parameter.
   * @return  Returns a value of type double
   */

  @VTID(126)
  double floor(
    double arg1,
    double arg2);


  /**
   * @param arg1 Mandatory double parameter.
   * @param arg2 Mandatory double parameter.
   * @param arg3 Mandatory double parameter.
   * @param arg4 Mandatory boolean parameter.
   * @return  Returns a value of type double
   */

  @VTID(127)
  double gammaDist(
    double arg1,
    double arg2,
    double arg3,
    boolean arg4);


  /**
   * @param arg1 Mandatory double parameter.
   * @param arg2 Mandatory double parameter.
   * @param arg3 Mandatory double parameter.
   * @return  Returns a value of type double
   */

  @VTID(128)
  double gammaInv(
    double arg1,
    double arg2,
    double arg3);


  /**
   * @param arg1 Mandatory double parameter.
   * @param arg2 Mandatory double parameter.
   * @return  Returns a value of type double
   */

  @VTID(129)
  double ceiling(
    double arg1,
    double arg2);


  /**
   * @param arg1 Mandatory double parameter.
   * @param arg2 Mandatory double parameter.
   * @param arg3 Mandatory double parameter.
   * @param arg4 Mandatory double parameter.
   * @return  Returns a value of type double
   */

  @VTID(130)
  double hypGeomDist(
    double arg1,
    double arg2,
    double arg3,
    double arg4);


  /**
   * @param arg1 Mandatory double parameter.
   * @param arg2 Mandatory double parameter.
   * @param arg3 Mandatory double parameter.
   * @return  Returns a value of type double
   */

  @VTID(131)
  double logNormDist(
    double arg1,
    double arg2,
    double arg3);


  /**
   * @param arg1 Mandatory double parameter.
   * @param arg2 Mandatory double parameter.
   * @param arg3 Mandatory double parameter.
   * @return  Returns a value of type double
   */

  @VTID(132)
  double logInv(
    double arg1,
    double arg2,
    double arg3);


  /**
   * @param arg1 Mandatory double parameter.
   * @param arg2 Mandatory double parameter.
   * @param arg3 Mandatory double parameter.
   * @return  Returns a value of type double
   */

  @VTID(133)
  double negBinomDist(
    double arg1,
    double arg2,
    double arg3);


  /**
   * @param arg1 Mandatory double parameter.
   * @param arg2 Mandatory double parameter.
   * @param arg3 Mandatory double parameter.
   * @param arg4 Mandatory boolean parameter.
   * @return  Returns a value of type double
   */

  @VTID(134)
  double normDist(
    double arg1,
    double arg2,
    double arg3,
    boolean arg4);


  /**
   * @param arg1 Mandatory double parameter.
   * @return  Returns a value of type double
   */

  @VTID(135)
  double normSDist(
    double arg1);


  /**
   * @param arg1 Mandatory double parameter.
   * @param arg2 Mandatory double parameter.
   * @param arg3 Mandatory double parameter.
   * @return  Returns a value of type double
   */

  @VTID(136)
  double normInv(
    double arg1,
    double arg2,
    double arg3);


  /**
   * @param arg1 Mandatory double parameter.
   * @return  Returns a value of type double
   */

  @VTID(137)
  double normSInv(
    double arg1);


  /**
   * @param arg1 Mandatory double parameter.
   * @param arg2 Mandatory double parameter.
   * @param arg3 Mandatory double parameter.
   * @return  Returns a value of type double
   */

  @VTID(138)
  double standardize(
    double arg1,
    double arg2,
    double arg3);


  /**
   * @param arg1 Mandatory double parameter.
   * @return  Returns a value of type double
   */

  @VTID(139)
  double odd(
    double arg1);


  /**
   * @param arg1 Mandatory double parameter.
   * @param arg2 Mandatory double parameter.
   * @return  Returns a value of type double
   */

  @VTID(140)
  double permut(
    double arg1,
    double arg2);


  /**
   * @param arg1 Mandatory double parameter.
   * @param arg2 Mandatory double parameter.
   * @param arg3 Mandatory boolean parameter.
   * @return  Returns a value of type double
   */

  @VTID(141)
  double poisson(
    double arg1,
    double arg2,
    boolean arg3);


  /**
   * @param arg1 Mandatory double parameter.
   * @param arg2 Mandatory double parameter.
   * @param arg3 Mandatory double parameter.
   * @return  Returns a value of type double
   */

  @VTID(142)
  double tDist(
    double arg1,
    double arg2,
    double arg3);


  /**
   * @param arg1 Mandatory double parameter.
   * @param arg2 Mandatory double parameter.
   * @param arg3 Mandatory double parameter.
   * @param arg4 Mandatory boolean parameter.
   * @return  Returns a value of type double
   */

  @VTID(143)
  double weibull(
    double arg1,
    double arg2,
    double arg3,
    boolean arg4);


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @param arg2 Mandatory java.lang.Object parameter.
   * @return  Returns a value of type double
   */

  @VTID(144)
  double sumXMY2(
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg1,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg2);


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @param arg2 Mandatory java.lang.Object parameter.
   * @return  Returns a value of type double
   */

  @VTID(145)
  double sumX2MY2(
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg1,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg2);


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @param arg2 Mandatory java.lang.Object parameter.
   * @return  Returns a value of type double
   */

  @VTID(146)
  double sumX2PY2(
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg1,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg2);


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @param arg2 Mandatory java.lang.Object parameter.
   * @return  Returns a value of type double
   */

  @VTID(147)
  double chiTest(
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg1,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg2);


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @param arg2 Mandatory java.lang.Object parameter.
   * @return  Returns a value of type double
   */

  @VTID(148)
  double correl(
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg1,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg2);


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @param arg2 Mandatory java.lang.Object parameter.
   * @return  Returns a value of type double
   */

  @VTID(149)
  double covar(
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg1,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg2);


  /**
   * @param arg1 Mandatory double parameter.
   * @param arg2 Mandatory java.lang.Object parameter.
   * @param arg3 Mandatory java.lang.Object parameter.
   * @return  Returns a value of type double
   */

  @VTID(150)
  double forecast(
    double arg1,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg2,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg3);


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @param arg2 Mandatory java.lang.Object parameter.
   * @return  Returns a value of type double
   */

  @VTID(151)
  double fTest(
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg1,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg2);


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @param arg2 Mandatory java.lang.Object parameter.
   * @return  Returns a value of type double
   */

  @VTID(152)
  double intercept(
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg1,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg2);


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @param arg2 Mandatory java.lang.Object parameter.
   * @return  Returns a value of type double
   */

  @VTID(153)
  double pearson(
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg1,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg2);


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @param arg2 Mandatory java.lang.Object parameter.
   * @return  Returns a value of type double
   */

  @VTID(154)
  double rSq(
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg1,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg2);


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @param arg2 Mandatory java.lang.Object parameter.
   * @return  Returns a value of type double
   */

  @VTID(155)
  double stEyx(
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg1,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg2);


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @param arg2 Mandatory java.lang.Object parameter.
   * @return  Returns a value of type double
   */

  @VTID(156)
  double slope(
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg1,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg2);


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @param arg2 Mandatory java.lang.Object parameter.
   * @param arg3 Mandatory double parameter.
   * @param arg4 Mandatory double parameter.
   * @return  Returns a value of type double
   */

  @VTID(157)
  double tTest(
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg1,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg2,
    double arg3,
    double arg4);


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @param arg2 Mandatory java.lang.Object parameter.
   * @param arg3 Mandatory double parameter.
   * @param arg4 Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type double
   */

  @VTID(158)
  double prob(
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg1,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg2,
    double arg3,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg4);


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @param arg2 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg3 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg4 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg5 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg6 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg7 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg8 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg9 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg10 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg11 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg12 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg13 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg14 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg15 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg16 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg17 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg18 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg19 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg20 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg21 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg22 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg23 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg24 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg25 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg26 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg27 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg28 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg29 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg30 Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type double
   */

  @VTID(159)
  double devSq(
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg1,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg2,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg3,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg4,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg5,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg6,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg7,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg8,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg9,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg10,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg11,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg12,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg13,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg14,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg15,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg16,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg17,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg18,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg19,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg20,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg21,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg22,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg23,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg24,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg25,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg26,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg27,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg28,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg29,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg30);


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @param arg2 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg3 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg4 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg5 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg6 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg7 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg8 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg9 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg10 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg11 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg12 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg13 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg14 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg15 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg16 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg17 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg18 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg19 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg20 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg21 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg22 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg23 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg24 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg25 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg26 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg27 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg28 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg29 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg30 Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type double
   */

  @VTID(160)
  double geoMean(
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg1,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg2,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg3,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg4,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg5,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg6,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg7,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg8,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg9,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg10,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg11,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg12,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg13,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg14,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg15,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg16,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg17,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg18,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg19,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg20,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg21,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg22,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg23,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg24,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg25,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg26,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg27,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg28,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg29,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg30);


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @param arg2 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg3 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg4 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg5 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg6 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg7 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg8 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg9 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg10 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg11 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg12 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg13 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg14 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg15 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg16 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg17 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg18 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg19 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg20 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg21 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg22 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg23 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg24 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg25 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg26 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg27 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg28 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg29 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg30 Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type double
   */

  @VTID(161)
  double harMean(
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg1,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg2,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg3,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg4,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg5,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg6,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg7,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg8,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg9,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg10,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg11,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg12,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg13,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg14,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg15,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg16,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg17,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg18,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg19,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg20,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg21,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg22,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg23,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg24,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg25,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg26,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg27,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg28,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg29,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg30);


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @param arg2 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg3 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg4 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg5 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg6 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg7 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg8 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg9 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg10 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg11 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg12 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg13 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg14 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg15 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg16 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg17 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg18 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg19 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg20 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg21 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg22 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg23 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg24 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg25 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg26 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg27 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg28 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg29 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg30 Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type double
   */

  @VTID(162)
  double sumSq(
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg1,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg2,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg3,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg4,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg5,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg6,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg7,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg8,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg9,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg10,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg11,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg12,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg13,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg14,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg15,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg16,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg17,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg18,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg19,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg20,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg21,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg22,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg23,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg24,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg25,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg26,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg27,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg28,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg29,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg30);


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @param arg2 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg3 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg4 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg5 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg6 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg7 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg8 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg9 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg10 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg11 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg12 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg13 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg14 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg15 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg16 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg17 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg18 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg19 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg20 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg21 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg22 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg23 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg24 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg25 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg26 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg27 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg28 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg29 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg30 Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type double
   */

  @VTID(163)
  double kurt(
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg1,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg2,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg3,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg4,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg5,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg6,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg7,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg8,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg9,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg10,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg11,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg12,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg13,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg14,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg15,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg16,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg17,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg18,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg19,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg20,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg21,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg22,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg23,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg24,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg25,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg26,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg27,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg28,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg29,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg30);


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @param arg2 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg3 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg4 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg5 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg6 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg7 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg8 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg9 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg10 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg11 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg12 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg13 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg14 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg15 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg16 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg17 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg18 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg19 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg20 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg21 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg22 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg23 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg24 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg25 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg26 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg27 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg28 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg29 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg30 Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type double
   */

  @VTID(164)
  double skew(
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg1,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg2,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg3,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg4,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg5,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg6,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg7,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg8,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg9,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg10,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg11,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg12,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg13,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg14,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg15,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg16,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg17,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg18,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg19,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg20,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg21,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg22,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg23,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg24,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg25,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg26,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg27,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg28,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg29,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg30);


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @param arg2 Mandatory double parameter.
   * @param arg3 Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type double
   */

  @VTID(165)
  double zTest(
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg1,
    double arg2,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg3);


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @param arg2 Mandatory double parameter.
   * @return  Returns a value of type double
   */

  @VTID(166)
  double large(
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg1,
    double arg2);


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @param arg2 Mandatory double parameter.
   * @return  Returns a value of type double
   */

  @VTID(167)
  double small(
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg1,
    double arg2);


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @param arg2 Mandatory double parameter.
   * @return  Returns a value of type double
   */

  @VTID(168)
  double quartile(
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg1,
    double arg2);


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @param arg2 Mandatory double parameter.
   * @return  Returns a value of type double
   */

  @VTID(169)
  double percentile(
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg1,
    double arg2);


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @param arg2 Mandatory double parameter.
   * @param arg3 Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type double
   */

  @VTID(170)
  double percentRank(
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg1,
    double arg2,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg3);


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @param arg2 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg3 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg4 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg5 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg6 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg7 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg8 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg9 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg10 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg11 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg12 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg13 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg14 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg15 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg16 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg17 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg18 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg19 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg20 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg21 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg22 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg23 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg24 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg25 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg26 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg27 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg28 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg29 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg30 Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type double
   */

  @VTID(171)
  double mode(
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg1,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg2,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg3,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg4,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg5,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg6,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg7,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg8,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg9,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg10,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg11,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg12,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg13,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg14,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg15,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg16,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg17,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg18,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg19,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg20,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg21,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg22,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg23,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg24,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg25,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg26,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg27,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg28,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg29,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg30);


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @param arg2 Mandatory double parameter.
   * @return  Returns a value of type double
   */

  @VTID(172)
  double trimMean(
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg1,
    double arg2);


  /**
   * @param arg1 Mandatory double parameter.
   * @param arg2 Mandatory double parameter.
   * @return  Returns a value of type double
   */

  @VTID(173)
  double tInv(
    double arg1,
    double arg2);


  /**
   * @param arg1 Mandatory double parameter.
   * @param arg2 Mandatory double parameter.
   * @return  Returns a value of type double
   */

  @VTID(174)
  double power(
    double arg1,
    double arg2);


  /**
   * @param arg1 Mandatory double parameter.
   * @return  Returns a value of type double
   */

  @VTID(175)
  double radians(
    double arg1);


  /**
   * @param arg1 Mandatory double parameter.
   * @return  Returns a value of type double
   */

  @VTID(176)
  double degrees(
    double arg1);


  /**
   * @param arg1 Mandatory double parameter.
   * @param arg2 Mandatory excel.Range parameter.
   * @param arg3 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg4 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg5 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg6 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg7 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg8 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg9 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg10 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg11 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg12 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg13 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg14 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg15 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg16 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg17 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg18 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg19 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg20 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg21 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg22 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg23 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg24 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg25 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg26 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg27 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg28 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg29 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg30 Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type double
   */

  @VTID(177)
  double subtotal(
    double arg1,
    excel.Range arg2,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg3,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg4,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg5,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg6,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg7,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg8,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg9,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg10,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg11,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg12,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg13,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg14,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg15,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg16,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg17,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg18,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg19,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg20,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg21,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg22,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg23,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg24,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg25,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg26,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg27,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg28,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg29,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg30);


  /**
   * @param arg1 Mandatory excel.Range parameter.
   * @param arg2 Mandatory java.lang.Object parameter.
   * @param arg3 Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type double
   */

  @VTID(178)
  double sumIf(
    excel.Range arg1,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg2,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg3);


  /**
   * @param arg1 Mandatory excel.Range parameter.
   * @param arg2 Mandatory java.lang.Object parameter.
   * @return  Returns a value of type double
   */

  @VTID(179)
  double countIf(
    excel.Range arg1,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg2);


  /**
   * @param arg1 Mandatory excel.Range parameter.
   * @return  Returns a value of type double
   */

  @VTID(180)
  double countBlank(
    excel.Range arg1);


  /**
   * @param arg1 Mandatory double parameter.
   * @param arg2 Mandatory double parameter.
   * @param arg3 Mandatory double parameter.
   * @param arg4 Mandatory double parameter.
   * @return  Returns a value of type double
   */

  @VTID(181)
  double ispmt(
    double arg1,
    double arg2,
    double arg3,
    double arg4);


  /**
   * @param arg1 Mandatory double parameter.
   * @param arg2 Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type java.lang.String
   */

  @VTID(182)
  java.lang.String roman(
    double arg1,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg2);


  /**
   * @param arg1 Mandatory java.lang.String parameter.
   * @return  Returns a value of type java.lang.String
   */

  @VTID(183)
  java.lang.String asc(
    java.lang.String arg1);


  /**
   * @param arg1 Mandatory java.lang.String parameter.
   * @return  Returns a value of type java.lang.String
   */

  @VTID(184)
  java.lang.String dbcs(
    java.lang.String arg1);


  /**
   * @param arg1 Mandatory excel.Range parameter.
   * @return  Returns a value of type java.lang.String
   */

  @VTID(185)
  java.lang.String phonetic(
    excel.Range arg1);


  /**
   * @param arg1 Mandatory double parameter.
   * @return  Returns a value of type java.lang.String
   */

  @VTID(186)
  java.lang.String bahtText(
    double arg1);


  /**
   * @param arg1 Mandatory double parameter.
   * @return  Returns a value of type java.lang.String
   */

  @VTID(187)
  java.lang.String thaiDayOfWeek(
    double arg1);


  /**
   * @param arg1 Mandatory java.lang.String parameter.
   * @return  Returns a value of type java.lang.String
   */

  @VTID(188)
  java.lang.String thaiDigit(
    java.lang.String arg1);


  /**
   * @param arg1 Mandatory double parameter.
   * @return  Returns a value of type java.lang.String
   */

  @VTID(189)
  java.lang.String thaiMonthOfYear(
    double arg1);


  /**
   * @param arg1 Mandatory double parameter.
   * @return  Returns a value of type java.lang.String
   */

  @VTID(190)
  java.lang.String thaiNumSound(
    double arg1);


  /**
   * @param arg1 Mandatory double parameter.
   * @return  Returns a value of type java.lang.String
   */

  @VTID(191)
  java.lang.String thaiNumString(
    double arg1);


  /**
   * @param arg1 Mandatory java.lang.String parameter.
   * @return  Returns a value of type double
   */

  @VTID(192)
  double thaiStringLength(
    java.lang.String arg1);


  /**
   * @param arg1 Mandatory java.lang.String parameter.
   * @return  Returns a value of type boolean
   */

  @VTID(193)
  boolean isThaiDigit(
    java.lang.String arg1);


  /**
   * @param arg1 Mandatory double parameter.
   * @return  Returns a value of type double
   */

  @VTID(194)
  double roundBahtDown(
    double arg1);


  /**
   * @param arg1 Mandatory double parameter.
   * @return  Returns a value of type double
   */

  @VTID(195)
  double roundBahtUp(
    double arg1);


  /**
   * @param arg1 Mandatory double parameter.
   * @return  Returns a value of type double
   */

  @VTID(196)
  double thaiYear(
    double arg1);


  /**
   * @param progID Mandatory java.lang.Object parameter.
   * @param server Mandatory java.lang.Object parameter.
   * @param topic1 Mandatory java.lang.Object parameter.
   * @param topic2 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param topic3 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param topic4 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param topic5 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param topic6 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param topic7 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param topic8 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param topic9 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param topic10 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param topic11 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param topic12 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param topic13 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param topic14 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param topic15 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param topic16 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param topic17 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param topic18 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param topic19 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param topic20 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param topic21 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param topic22 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param topic23 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param topic24 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param topic25 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param topic26 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param topic27 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param topic28 Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(197)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object rtd(
    @MarshalAs(NativeType.VARIANT) java.lang.Object progID,
    @MarshalAs(NativeType.VARIANT) java.lang.Object server,
    @MarshalAs(NativeType.VARIANT) java.lang.Object topic1,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object topic2,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object topic3,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object topic4,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object topic5,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object topic6,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object topic7,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object topic8,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object topic9,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object topic10,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object topic11,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object topic12,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object topic13,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object topic14,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object topic15,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object topic16,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object topic17,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object topic18,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object topic19,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object topic20,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object topic21,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object topic22,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object topic23,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object topic24,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object topic25,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object topic26,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object topic27,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object topic28);


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @param arg2 Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type java.lang.String
   */

  @VTID(198)
  java.lang.String hex2Bin(
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg1,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg2);


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @return  Returns a value of type java.lang.String
   */

  @VTID(199)
  java.lang.String hex2Dec(
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg1);


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @param arg2 Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type java.lang.String
   */

  @VTID(200)
  java.lang.String hex2Oct(
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg1,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg2);


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @param arg2 Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type java.lang.String
   */

  @VTID(201)
  java.lang.String dec2Bin(
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg1,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg2);


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @param arg2 Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type java.lang.String
   */

  @VTID(202)
  java.lang.String dec2Hex(
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg1,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg2);


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @param arg2 Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type java.lang.String
   */

  @VTID(203)
  java.lang.String dec2Oct(
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg1,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg2);


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @param arg2 Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type java.lang.String
   */

  @VTID(204)
  java.lang.String oct2Bin(
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg1,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg2);


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @param arg2 Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type java.lang.String
   */

  @VTID(205)
  java.lang.String oct2Hex(
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg1,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg2);


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @return  Returns a value of type java.lang.String
   */

  @VTID(206)
  java.lang.String oct2Dec(
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg1);


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @return  Returns a value of type java.lang.String
   */

  @VTID(207)
  java.lang.String bin2Dec(
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg1);


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @param arg2 Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type java.lang.String
   */

  @VTID(208)
  java.lang.String bin2Oct(
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg1,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg2);


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @param arg2 Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type java.lang.String
   */

  @VTID(209)
  java.lang.String bin2Hex(
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg1,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg2);


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @param arg2 Mandatory java.lang.Object parameter.
   * @return  Returns a value of type java.lang.String
   */

  @VTID(210)
  java.lang.String imSub(
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg1,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg2);


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @param arg2 Mandatory java.lang.Object parameter.
   * @return  Returns a value of type java.lang.String
   */

  @VTID(211)
  java.lang.String imDiv(
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg1,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg2);


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @param arg2 Mandatory java.lang.Object parameter.
   * @return  Returns a value of type java.lang.String
   */

  @VTID(212)
  java.lang.String imPower(
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg1,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg2);


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @return  Returns a value of type java.lang.String
   */

  @VTID(213)
  java.lang.String imAbs(
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg1);


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @return  Returns a value of type java.lang.String
   */

  @VTID(214)
  java.lang.String imSqrt(
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg1);


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @return  Returns a value of type java.lang.String
   */

  @VTID(215)
  java.lang.String imLn(
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg1);


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @return  Returns a value of type java.lang.String
   */

  @VTID(216)
  java.lang.String imLog2(
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg1);


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @return  Returns a value of type java.lang.String
   */

  @VTID(217)
  java.lang.String imLog10(
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg1);


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @return  Returns a value of type java.lang.String
   */

  @VTID(218)
  java.lang.String imSin(
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg1);


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @return  Returns a value of type java.lang.String
   */

  @VTID(219)
  java.lang.String imCos(
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg1);


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @return  Returns a value of type java.lang.String
   */

  @VTID(220)
  java.lang.String imExp(
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg1);


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @return  Returns a value of type java.lang.String
   */

  @VTID(221)
  java.lang.String imArgument(
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg1);


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @return  Returns a value of type java.lang.String
   */

  @VTID(222)
  java.lang.String imConjugate(
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg1);


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @return  Returns a value of type double
   */

  @VTID(223)
  double imaginary(
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg1);


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @return  Returns a value of type double
   */

  @VTID(224)
  double imReal(
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg1);


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @param arg2 Mandatory java.lang.Object parameter.
   * @param arg3 Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type java.lang.String
   */

  @VTID(225)
  java.lang.String complex(
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg1,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg2,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg3);


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @param arg2 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg3 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg4 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg5 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg6 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg7 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg8 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg9 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg10 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg11 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg12 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg13 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg14 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg15 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg16 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg17 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg18 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg19 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg20 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg21 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg22 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg23 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg24 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg25 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg26 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg27 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg28 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg29 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg30 Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type java.lang.String
   */

  @VTID(226)
  java.lang.String imSum(
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg1,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg2,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg3,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg4,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg5,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg6,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg7,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg8,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg9,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg10,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg11,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg12,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg13,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg14,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg15,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg16,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg17,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg18,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg19,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg20,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg21,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg22,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg23,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg24,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg25,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg26,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg27,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg28,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg29,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg30);


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @param arg2 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg3 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg4 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg5 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg6 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg7 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg8 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg9 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg10 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg11 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg12 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg13 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg14 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg15 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg16 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg17 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg18 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg19 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg20 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg21 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg22 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg23 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg24 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg25 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg26 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg27 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg28 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg29 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg30 Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type java.lang.String
   */

  @VTID(227)
  java.lang.String imProduct(
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg1,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg2,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg3,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg4,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg5,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg6,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg7,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg8,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg9,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg10,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg11,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg12,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg13,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg14,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg15,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg16,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg17,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg18,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg19,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg20,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg21,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg22,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg23,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg24,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg25,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg26,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg27,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg28,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg29,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg30);


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @param arg2 Mandatory java.lang.Object parameter.
   * @param arg3 Mandatory java.lang.Object parameter.
   * @param arg4 Mandatory java.lang.Object parameter.
   * @return  Returns a value of type double
   */

  @VTID(228)
  double seriesSum(
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg1,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg2,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg3,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg4);


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @return  Returns a value of type double
   */

  @VTID(229)
  double factDouble(
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg1);


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @return  Returns a value of type double
   */

  @VTID(230)
  double sqrtPi(
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg1);


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @param arg2 Mandatory java.lang.Object parameter.
   * @return  Returns a value of type double
   */

  @VTID(231)
  double quotient(
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg1,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg2);


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @param arg2 Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type double
   */

  @VTID(232)
  double delta(
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg1,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg2);


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @param arg2 Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type double
   */

  @VTID(233)
  double geStep(
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg1,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg2);


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @return  Returns a value of type boolean
   */

  @VTID(234)
  boolean isEven(
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg1);


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @return  Returns a value of type boolean
   */

  @VTID(235)
  boolean isOdd(
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg1);


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @param arg2 Mandatory java.lang.Object parameter.
   * @return  Returns a value of type double
   */

  @VTID(236)
  double mRound(
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg1,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg2);


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @param arg2 Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type double
   */

  @VTID(237)
  double erf(
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg1,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg2);


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @return  Returns a value of type double
   */

  @VTID(238)
  double erfC(
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg1);


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @param arg2 Mandatory java.lang.Object parameter.
   * @return  Returns a value of type double
   */

  @VTID(239)
  double besselJ(
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg1,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg2);


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @param arg2 Mandatory java.lang.Object parameter.
   * @return  Returns a value of type double
   */

  @VTID(240)
  double besselK(
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg1,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg2);


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @param arg2 Mandatory java.lang.Object parameter.
   * @return  Returns a value of type double
   */

  @VTID(241)
  double besselY(
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg1,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg2);


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @param arg2 Mandatory java.lang.Object parameter.
   * @return  Returns a value of type double
   */

  @VTID(242)
  double besselI(
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg1,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg2);


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @param arg2 Mandatory java.lang.Object parameter.
   * @param arg3 Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type double
   */

  @VTID(243)
  double xirr(
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg1,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg2,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg3);


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @param arg2 Mandatory java.lang.Object parameter.
   * @return  Returns a value of type double
   */

  @VTID(244)
  double xnpv(
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg1,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg2);


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @param arg2 Mandatory java.lang.Object parameter.
   * @param arg3 Mandatory java.lang.Object parameter.
   * @param arg4 Mandatory java.lang.Object parameter.
   * @param arg5 Mandatory java.lang.Object parameter.
   * @param arg6 Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type double
   */

  @VTID(245)
  double priceMat(
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg1,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg2,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg3,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg4,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg5,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg6);


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @param arg2 Mandatory java.lang.Object parameter.
   * @param arg3 Mandatory java.lang.Object parameter.
   * @param arg4 Mandatory java.lang.Object parameter.
   * @param arg5 Mandatory java.lang.Object parameter.
   * @param arg6 Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type double
   */

  @VTID(246)
  double yieldMat(
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg1,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg2,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg3,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg4,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg5,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg6);


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @param arg2 Mandatory java.lang.Object parameter.
   * @param arg3 Mandatory java.lang.Object parameter.
   * @param arg4 Mandatory java.lang.Object parameter.
   * @param arg5 Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type double
   */

  @VTID(247)
  double intRate(
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg1,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg2,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg3,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg4,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg5);


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @param arg2 Mandatory java.lang.Object parameter.
   * @param arg3 Mandatory java.lang.Object parameter.
   * @param arg4 Mandatory java.lang.Object parameter.
   * @param arg5 Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type double
   */

  @VTID(248)
  double received(
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg1,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg2,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg3,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg4,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg5);


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @param arg2 Mandatory java.lang.Object parameter.
   * @param arg3 Mandatory java.lang.Object parameter.
   * @param arg4 Mandatory java.lang.Object parameter.
   * @param arg5 Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type double
   */

  @VTID(249)
  double disc(
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg1,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg2,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg3,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg4,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg5);


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @param arg2 Mandatory java.lang.Object parameter.
   * @param arg3 Mandatory java.lang.Object parameter.
   * @param arg4 Mandatory java.lang.Object parameter.
   * @param arg5 Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type double
   */

  @VTID(250)
  double priceDisc(
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg1,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg2,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg3,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg4,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg5);


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @param arg2 Mandatory java.lang.Object parameter.
   * @param arg3 Mandatory java.lang.Object parameter.
   * @param arg4 Mandatory java.lang.Object parameter.
   * @param arg5 Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type double
   */

  @VTID(251)
  double yieldDisc(
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg1,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg2,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg3,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg4,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg5);


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @param arg2 Mandatory java.lang.Object parameter.
   * @param arg3 Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type double
   */

  @VTID(252)
  double tBillEq(
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg1,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg2,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg3);


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @param arg2 Mandatory java.lang.Object parameter.
   * @param arg3 Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type double
   */

  @VTID(253)
  double tBillPrice(
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg1,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg2,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg3);


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @param arg2 Mandatory java.lang.Object parameter.
   * @param arg3 Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type double
   */

  @VTID(254)
  double tBillYield(
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg1,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg2,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg3);


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @param arg2 Mandatory java.lang.Object parameter.
   * @param arg3 Mandatory java.lang.Object parameter.
   * @param arg4 Mandatory java.lang.Object parameter.
   * @param arg5 Mandatory java.lang.Object parameter.
   * @param arg6 Mandatory java.lang.Object parameter.
   * @param arg7 Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type double
   */

  @VTID(255)
  double price(
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg1,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg2,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg3,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg4,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg5,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg6,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg7);


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @param arg2 Mandatory java.lang.Object parameter.
   * @return  Returns a value of type double
   */

  @VTID(256)
  double dollarDe(
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg1,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg2);


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @param arg2 Mandatory java.lang.Object parameter.
   * @return  Returns a value of type double
   */

  @VTID(257)
  double dollarFr(
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg1,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg2);


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @param arg2 Mandatory java.lang.Object parameter.
   * @return  Returns a value of type double
   */

  @VTID(258)
  double nominal(
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg1,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg2);


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @param arg2 Mandatory java.lang.Object parameter.
   * @return  Returns a value of type double
   */

  @VTID(259)
  double effect(
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg1,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg2);


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @param arg2 Mandatory java.lang.Object parameter.
   * @param arg3 Mandatory java.lang.Object parameter.
   * @param arg4 Mandatory java.lang.Object parameter.
   * @param arg5 Mandatory java.lang.Object parameter.
   * @param arg6 Mandatory java.lang.Object parameter.
   * @return  Returns a value of type double
   */

  @VTID(260)
  double cumPrinc(
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg1,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg2,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg3,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg4,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg5,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg6);


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @param arg2 Mandatory java.lang.Object parameter.
   * @param arg3 Mandatory java.lang.Object parameter.
   * @param arg4 Mandatory java.lang.Object parameter.
   * @param arg5 Mandatory java.lang.Object parameter.
   * @param arg6 Mandatory java.lang.Object parameter.
   * @return  Returns a value of type double
   */

  @VTID(261)
  double cumIPmt(
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg1,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg2,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg3,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg4,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg5,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg6);


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @param arg2 Mandatory java.lang.Object parameter.
   * @return  Returns a value of type double
   */

  @VTID(262)
  double eDate(
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg1,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg2);


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @param arg2 Mandatory java.lang.Object parameter.
   * @return  Returns a value of type double
   */

  @VTID(263)
  double eoMonth(
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg1,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg2);


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @param arg2 Mandatory java.lang.Object parameter.
   * @param arg3 Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type double
   */

  @VTID(264)
  double yearFrac(
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg1,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg2,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg3);


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @param arg2 Mandatory java.lang.Object parameter.
   * @param arg3 Mandatory java.lang.Object parameter.
   * @param arg4 Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type double
   */

  @VTID(265)
  double coupDayBs(
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg1,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg2,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg3,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg4);


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @param arg2 Mandatory java.lang.Object parameter.
   * @param arg3 Mandatory java.lang.Object parameter.
   * @param arg4 Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type double
   */

  @VTID(266)
  double coupDays(
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg1,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg2,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg3,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg4);


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @param arg2 Mandatory java.lang.Object parameter.
   * @param arg3 Mandatory java.lang.Object parameter.
   * @param arg4 Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type double
   */

  @VTID(267)
  double coupDaysNc(
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg1,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg2,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg3,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg4);


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @param arg2 Mandatory java.lang.Object parameter.
   * @param arg3 Mandatory java.lang.Object parameter.
   * @param arg4 Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type double
   */

  @VTID(268)
  double coupNcd(
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg1,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg2,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg3,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg4);


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @param arg2 Mandatory java.lang.Object parameter.
   * @param arg3 Mandatory java.lang.Object parameter.
   * @param arg4 Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type double
   */

  @VTID(269)
  double coupNum(
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg1,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg2,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg3,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg4);


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @param arg2 Mandatory java.lang.Object parameter.
   * @param arg3 Mandatory java.lang.Object parameter.
   * @param arg4 Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type double
   */

  @VTID(270)
  double coupPcd(
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg1,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg2,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg3,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg4);


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @param arg2 Mandatory java.lang.Object parameter.
   * @param arg3 Mandatory java.lang.Object parameter.
   * @param arg4 Mandatory java.lang.Object parameter.
   * @param arg5 Mandatory java.lang.Object parameter.
   * @param arg6 Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type double
   */

  @VTID(271)
  double duration(
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg1,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg2,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg3,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg4,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg5,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg6);


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @param arg2 Mandatory java.lang.Object parameter.
   * @param arg3 Mandatory java.lang.Object parameter.
   * @param arg4 Mandatory java.lang.Object parameter.
   * @param arg5 Mandatory java.lang.Object parameter.
   * @param arg6 Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type double
   */

  @VTID(272)
  double mDuration(
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg1,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg2,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg3,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg4,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg5,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg6);


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @param arg2 Mandatory java.lang.Object parameter.
   * @param arg3 Mandatory java.lang.Object parameter.
   * @param arg4 Mandatory java.lang.Object parameter.
   * @param arg5 Mandatory java.lang.Object parameter.
   * @param arg6 Mandatory java.lang.Object parameter.
   * @param arg7 Mandatory java.lang.Object parameter.
   * @param arg8 Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type double
   */

  @VTID(273)
  double oddLPrice(
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg1,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg2,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg3,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg4,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg5,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg6,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg7,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg8);


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @param arg2 Mandatory java.lang.Object parameter.
   * @param arg3 Mandatory java.lang.Object parameter.
   * @param arg4 Mandatory java.lang.Object parameter.
   * @param arg5 Mandatory java.lang.Object parameter.
   * @param arg6 Mandatory java.lang.Object parameter.
   * @param arg7 Mandatory java.lang.Object parameter.
   * @param arg8 Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type double
   */

  @VTID(274)
  double oddLYield(
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg1,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg2,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg3,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg4,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg5,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg6,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg7,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg8);


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @param arg2 Mandatory java.lang.Object parameter.
   * @param arg3 Mandatory java.lang.Object parameter.
   * @param arg4 Mandatory java.lang.Object parameter.
   * @param arg5 Mandatory java.lang.Object parameter.
   * @param arg6 Mandatory java.lang.Object parameter.
   * @param arg7 Mandatory java.lang.Object parameter.
   * @param arg8 Mandatory java.lang.Object parameter.
   * @param arg9 Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type double
   */

  @VTID(275)
  double oddFPrice(
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg1,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg2,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg3,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg4,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg5,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg6,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg7,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg8,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg9);


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @param arg2 Mandatory java.lang.Object parameter.
   * @param arg3 Mandatory java.lang.Object parameter.
   * @param arg4 Mandatory java.lang.Object parameter.
   * @param arg5 Mandatory java.lang.Object parameter.
   * @param arg6 Mandatory java.lang.Object parameter.
   * @param arg7 Mandatory java.lang.Object parameter.
   * @param arg8 Mandatory java.lang.Object parameter.
   * @param arg9 Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type double
   */

  @VTID(276)
  double oddFYield(
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg1,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg2,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg3,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg4,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg5,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg6,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg7,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg8,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg9);


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @param arg2 Mandatory java.lang.Object parameter.
   * @return  Returns a value of type double
   */

  @VTID(277)
  double randBetween(
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg1,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg2);


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @param arg2 Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type double
   */

  @VTID(278)
  double weekNum(
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg1,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg2);


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @param arg2 Mandatory java.lang.Object parameter.
   * @param arg3 Mandatory java.lang.Object parameter.
   * @param arg4 Mandatory java.lang.Object parameter.
   * @param arg5 Mandatory java.lang.Object parameter.
   * @param arg6 Mandatory java.lang.Object parameter.
   * @param arg7 Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type double
   */

  @VTID(279)
  double amorDegrc(
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg1,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg2,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg3,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg4,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg5,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg6,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg7);


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @param arg2 Mandatory java.lang.Object parameter.
   * @param arg3 Mandatory java.lang.Object parameter.
   * @param arg4 Mandatory java.lang.Object parameter.
   * @param arg5 Mandatory java.lang.Object parameter.
   * @param arg6 Mandatory java.lang.Object parameter.
   * @param arg7 Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type double
   */

  @VTID(280)
  double amorLinc(
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg1,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg2,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg3,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg4,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg5,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg6,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg7);


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @param arg2 Mandatory java.lang.Object parameter.
   * @param arg3 Mandatory java.lang.Object parameter.
   * @return  Returns a value of type double
   */

  @VTID(281)
  double convert(
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg1,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg2,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg3);


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @param arg2 Mandatory java.lang.Object parameter.
   * @param arg3 Mandatory java.lang.Object parameter.
   * @param arg4 Mandatory java.lang.Object parameter.
   * @param arg5 Mandatory java.lang.Object parameter.
   * @param arg6 Mandatory java.lang.Object parameter.
   * @param arg7 Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type double
   */

  @VTID(282)
  double accrInt(
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg1,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg2,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg3,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg4,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg5,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg6,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg7);


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @param arg2 Mandatory java.lang.Object parameter.
   * @param arg3 Mandatory java.lang.Object parameter.
   * @param arg4 Mandatory java.lang.Object parameter.
   * @param arg5 Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type double
   */

  @VTID(283)
  double accrIntM(
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg1,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg2,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg3,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg4,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg5);


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @param arg2 Mandatory java.lang.Object parameter.
   * @param arg3 Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type double
   */

  @VTID(284)
  double workDay(
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg1,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg2,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg3);


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @param arg2 Mandatory java.lang.Object parameter.
   * @param arg3 Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type double
   */

  @VTID(285)
  double networkDays(
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg1,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg2,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg3);


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @param arg2 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg3 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg4 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg5 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg6 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg7 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg8 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg9 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg10 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg11 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg12 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg13 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg14 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg15 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg16 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg17 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg18 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg19 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg20 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg21 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg22 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg23 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg24 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg25 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg26 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg27 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg28 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg29 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg30 Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type double
   */

  @VTID(286)
  double gcd(
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg1,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg2,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg3,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg4,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg5,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg6,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg7,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg8,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg9,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg10,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg11,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg12,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg13,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg14,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg15,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg16,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg17,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg18,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg19,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg20,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg21,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg22,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg23,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg24,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg25,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg26,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg27,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg28,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg29,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg30);


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @param arg2 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg3 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg4 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg5 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg6 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg7 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg8 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg9 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg10 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg11 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg12 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg13 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg14 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg15 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg16 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg17 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg18 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg19 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg20 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg21 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg22 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg23 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg24 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg25 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg26 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg27 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg28 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg29 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg30 Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type double
   */

  @VTID(287)
  double multiNomial(
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg1,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg2,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg3,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg4,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg5,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg6,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg7,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg8,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg9,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg10,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg11,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg12,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg13,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg14,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg15,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg16,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg17,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg18,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg19,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg20,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg21,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg22,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg23,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg24,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg25,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg26,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg27,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg28,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg29,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg30);


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @param arg2 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg3 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg4 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg5 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg6 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg7 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg8 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg9 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg10 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg11 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg12 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg13 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg14 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg15 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg16 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg17 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg18 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg19 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg20 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg21 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg22 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg23 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg24 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg25 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg26 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg27 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg28 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg29 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg30 Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type double
   */

  @VTID(288)
  double lcm(
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg1,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg2,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg3,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg4,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg5,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg6,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg7,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg8,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg9,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg10,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg11,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg12,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg13,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg14,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg15,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg16,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg17,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg18,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg19,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg20,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg21,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg22,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg23,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg24,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg25,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg26,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg27,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg28,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg29,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg30);


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @param arg2 Mandatory java.lang.Object parameter.
   * @return  Returns a value of type double
   */

  @VTID(289)
  double fvSchedule(
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg1,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg2);


  /**
   * @param arg1 Mandatory excel.Range parameter.
   * @param arg2 Mandatory excel.Range parameter.
   * @param arg3 Mandatory java.lang.Object parameter.
   * @param arg4 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg5 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg6 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg7 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg8 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg9 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg10 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg11 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg12 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg13 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg14 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg15 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg16 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg17 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg18 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg19 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg20 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg21 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg22 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg23 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg24 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg25 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg26 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg27 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg28 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg29 Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type double
   */

  @VTID(290)
  double sumIfs(
    excel.Range arg1,
    excel.Range arg2,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg3,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg4,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg5,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg6,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg7,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg8,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg9,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg10,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg11,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg12,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg13,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg14,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg15,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg16,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg17,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg18,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg19,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg20,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg21,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg22,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg23,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg24,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg25,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg26,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg27,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg28,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg29);


  /**
   * @param arg1 Mandatory excel.Range parameter.
   * @param arg2 Mandatory java.lang.Object parameter.
   * @param arg3 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg4 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg5 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg6 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg7 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg8 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg9 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg10 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg11 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg12 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg13 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg14 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg15 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg16 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg17 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg18 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg19 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg20 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg21 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg22 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg23 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg24 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg25 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg26 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg27 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg28 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg29 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg30 Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type double
   */

  @VTID(291)
  double countIfs(
    excel.Range arg1,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg2,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg3,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg4,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg5,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg6,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg7,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg8,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg9,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg10,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg11,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg12,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg13,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg14,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg15,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg16,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg17,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg18,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg19,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg20,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg21,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg22,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg23,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg24,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg25,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg26,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg27,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg28,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg29,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg30);


  /**
   * @param arg1 Mandatory excel.Range parameter.
   * @param arg2 Mandatory java.lang.Object parameter.
   * @param arg3 Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type double
   */

  @VTID(292)
  double averageIf(
    excel.Range arg1,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg2,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg3);


  /**
   * @param arg1 Mandatory excel.Range parameter.
   * @param arg2 Mandatory excel.Range parameter.
   * @param arg3 Mandatory java.lang.Object parameter.
   * @param arg4 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg5 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg6 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg7 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg8 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg9 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg10 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg11 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg12 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg13 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg14 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg15 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg16 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg17 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg18 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg19 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg20 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg21 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg22 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg23 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg24 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg25 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg26 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg27 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg28 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg29 Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type double
   */

  @VTID(293)
  double averageIfs(
    excel.Range arg1,
    excel.Range arg2,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg3,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg4,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg5,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg6,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg7,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg8,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg9,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg10,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg11,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg12,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg13,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg14,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg15,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg16,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg17,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg18,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg19,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg20,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg21,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg22,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg23,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg24,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg25,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg26,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg27,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg28,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg29);


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @param arg2 Mandatory java.lang.Object parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(294)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object ifError(
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg1,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg2);


  /**
   * @param arg1 Mandatory double parameter.
   * @param arg2 Mandatory double parameter.
   * @param arg3 Mandatory excel.Range parameter.
   * @param arg4 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg5 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg6 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg7 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg8 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg9 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg10 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg11 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg12 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg13 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg14 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg15 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg16 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg17 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg18 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg19 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg20 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg21 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg22 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg23 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg24 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg25 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg26 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg27 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg28 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg29 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg30 Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type double
   */

  @VTID(295)
  double aggregate(
    double arg1,
    double arg2,
    excel.Range arg3,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg4,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg5,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg6,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg7,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg8,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg9,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg10,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg11,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg12,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg13,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg14,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg15,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg16,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg17,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg18,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg19,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg20,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg21,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg22,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg23,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg24,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg25,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg26,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg27,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg28,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg29,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg30);


  /**
   * @param arg1 Mandatory double parameter.
   * @param arg2 Mandatory double parameter.
   * @param arg3 Mandatory double parameter.
   * @return  Returns a value of type double
   */

  @VTID(296)
  double confidence_Norm(
    double arg1,
    double arg2,
    double arg3);


  /**
   * @param arg1 Mandatory double parameter.
   * @param arg2 Mandatory double parameter.
   * @param arg3 Mandatory double parameter.
   * @return  Returns a value of type double
   */

  @VTID(297)
  double confidence_T(
    double arg1,
    double arg2,
    double arg3);


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @param arg2 Mandatory java.lang.Object parameter.
   * @return  Returns a value of type double
   */

  @VTID(298)
  double chiSq_Test(
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg1,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg2);


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @param arg2 Mandatory java.lang.Object parameter.
   * @return  Returns a value of type double
   */

  @VTID(299)
  double f_Test(
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg1,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg2);


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @param arg2 Mandatory java.lang.Object parameter.
   * @return  Returns a value of type double
   */

  @VTID(300)
  double covariance_P(
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg1,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg2);


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @param arg2 Mandatory java.lang.Object parameter.
   * @return  Returns a value of type double
   */

  @VTID(301)
  double covariance_S(
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg1,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg2);


  /**
   * @param arg1 Mandatory double parameter.
   * @param arg2 Mandatory double parameter.
   * @param arg3 Mandatory boolean parameter.
   * @return  Returns a value of type double
   */

  @VTID(302)
  double expon_Dist(
    double arg1,
    double arg2,
    boolean arg3);


  /**
   * @param arg1 Mandatory double parameter.
   * @param arg2 Mandatory double parameter.
   * @param arg3 Mandatory double parameter.
   * @param arg4 Mandatory boolean parameter.
   * @return  Returns a value of type double
   */

  @VTID(303)
  double gamma_Dist(
    double arg1,
    double arg2,
    double arg3,
    boolean arg4);


  /**
   * @param arg1 Mandatory double parameter.
   * @param arg2 Mandatory double parameter.
   * @param arg3 Mandatory double parameter.
   * @return  Returns a value of type double
   */

  @VTID(304)
  double gamma_Inv(
    double arg1,
    double arg2,
    double arg3);


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @param arg2 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg3 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg4 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg5 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg6 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg7 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg8 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg9 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg10 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg11 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg12 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg13 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg14 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg15 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg16 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg17 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg18 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg19 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg20 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg21 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg22 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg23 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg24 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg25 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg26 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg27 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg28 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg29 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg30 Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(305)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object mode_Mult(
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg1,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg2,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg3,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg4,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg5,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg6,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg7,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg8,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg9,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg10,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg11,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg12,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg13,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg14,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg15,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg16,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg17,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg18,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg19,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg20,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg21,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg22,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg23,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg24,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg25,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg26,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg27,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg28,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg29,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg30);


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @param arg2 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg3 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg4 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg5 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg6 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg7 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg8 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg9 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg10 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg11 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg12 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg13 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg14 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg15 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg16 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg17 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg18 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg19 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg20 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg21 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg22 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg23 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg24 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg25 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg26 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg27 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg28 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg29 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg30 Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type double
   */

  @VTID(306)
  double mode_Sngl(
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg1,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg2,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg3,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg4,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg5,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg6,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg7,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg8,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg9,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg10,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg11,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg12,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg13,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg14,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg15,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg16,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg17,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg18,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg19,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg20,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg21,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg22,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg23,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg24,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg25,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg26,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg27,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg28,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg29,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg30);


  /**
   * @param arg1 Mandatory double parameter.
   * @param arg2 Mandatory double parameter.
   * @param arg3 Mandatory double parameter.
   * @param arg4 Mandatory boolean parameter.
   * @return  Returns a value of type double
   */

  @VTID(307)
  double norm_Dist(
    double arg1,
    double arg2,
    double arg3,
    boolean arg4);


  /**
   * @param arg1 Mandatory double parameter.
   * @param arg2 Mandatory double parameter.
   * @param arg3 Mandatory double parameter.
   * @return  Returns a value of type double
   */

  @VTID(308)
  double norm_Inv(
    double arg1,
    double arg2,
    double arg3);


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @param arg2 Mandatory double parameter.
   * @return  Returns a value of type double
   */

  @VTID(309)
  double percentile_Exc(
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg1,
    double arg2);


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @param arg2 Mandatory double parameter.
   * @return  Returns a value of type double
   */

  @VTID(310)
  double percentile_Inc(
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg1,
    double arg2);


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @param arg2 Mandatory double parameter.
   * @param arg3 Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type double
   */

  @VTID(311)
  double percentRank_Exc(
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg1,
    double arg2,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg3);


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @param arg2 Mandatory double parameter.
   * @param arg3 Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type double
   */

  @VTID(312)
  double percentRank_Inc(
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg1,
    double arg2,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg3);


  /**
   * @param arg1 Mandatory double parameter.
   * @param arg2 Mandatory double parameter.
   * @param arg3 Mandatory boolean parameter.
   * @return  Returns a value of type double
   */

  @VTID(313)
  double poisson_Dist(
    double arg1,
    double arg2,
    boolean arg3);


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @param arg2 Mandatory double parameter.
   * @return  Returns a value of type double
   */

  @VTID(314)
  double quartile_Exc(
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg1,
    double arg2);


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @param arg2 Mandatory double parameter.
   * @return  Returns a value of type double
   */

  @VTID(315)
  double quartile_Inc(
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg1,
    double arg2);


  /**
   * @param arg1 Mandatory double parameter.
   * @param arg2 Mandatory excel.Range parameter.
   * @param arg3 Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type double
   */

  @VTID(316)
  double rank_Avg(
    double arg1,
    excel.Range arg2,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg3);


  /**
   * @param arg1 Mandatory double parameter.
   * @param arg2 Mandatory excel.Range parameter.
   * @param arg3 Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type double
   */

  @VTID(317)
  double rank_Eq(
    double arg1,
    excel.Range arg2,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg3);


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @param arg2 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg3 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg4 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg5 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg6 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg7 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg8 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg9 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg10 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg11 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg12 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg13 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg14 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg15 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg16 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg17 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg18 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg19 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg20 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg21 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg22 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg23 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg24 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg25 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg26 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg27 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg28 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg29 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg30 Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type double
   */

  @VTID(318)
  double stDev_S(
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg1,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg2,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg3,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg4,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg5,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg6,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg7,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg8,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg9,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg10,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg11,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg12,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg13,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg14,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg15,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg16,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg17,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg18,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg19,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg20,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg21,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg22,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg23,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg24,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg25,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg26,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg27,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg28,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg29,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg30);


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @param arg2 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg3 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg4 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg5 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg6 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg7 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg8 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg9 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg10 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg11 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg12 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg13 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg14 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg15 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg16 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg17 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg18 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg19 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg20 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg21 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg22 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg23 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg24 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg25 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg26 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg27 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg28 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg29 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg30 Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type double
   */

  @VTID(319)
  double stDev_P(
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg1,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg2,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg3,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg4,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg5,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg6,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg7,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg8,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg9,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg10,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg11,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg12,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg13,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg14,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg15,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg16,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg17,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg18,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg19,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg20,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg21,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg22,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg23,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg24,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg25,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg26,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg27,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg28,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg29,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg30);


  /**
   * @param arg1 Mandatory double parameter.
   * @param arg2 Mandatory double parameter.
   * @param arg3 Mandatory boolean parameter.
   * @return  Returns a value of type double
   */

  @VTID(320)
  double t_Dist(
    double arg1,
    double arg2,
    boolean arg3);


  /**
   * @param arg1 Mandatory double parameter.
   * @param arg2 Mandatory double parameter.
   * @return  Returns a value of type double
   */

  @VTID(321)
  double t_Dist_2T(
    double arg1,
    double arg2);


  /**
   * @param arg1 Mandatory double parameter.
   * @param arg2 Mandatory double parameter.
   * @return  Returns a value of type double
   */

  @VTID(322)
  double t_Dist_RT(
    double arg1,
    double arg2);


  /**
   * @param arg1 Mandatory double parameter.
   * @param arg2 Mandatory double parameter.
   * @return  Returns a value of type double
   */

  @VTID(323)
  double t_Inv(
    double arg1,
    double arg2);


  /**
   * @param arg1 Mandatory double parameter.
   * @param arg2 Mandatory double parameter.
   * @return  Returns a value of type double
   */

  @VTID(324)
  double t_Inv_2T(
    double arg1,
    double arg2);


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @param arg2 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg3 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg4 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg5 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg6 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg7 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg8 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg9 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg10 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg11 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg12 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg13 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg14 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg15 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg16 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg17 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg18 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg19 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg20 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg21 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg22 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg23 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg24 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg25 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg26 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg27 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg28 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg29 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg30 Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type double
   */

  @VTID(325)
  double var_S(
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg1,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg2,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg3,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg4,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg5,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg6,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg7,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg8,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg9,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg10,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg11,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg12,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg13,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg14,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg15,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg16,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg17,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg18,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg19,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg20,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg21,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg22,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg23,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg24,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg25,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg26,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg27,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg28,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg29,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg30);


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @param arg2 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg3 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg4 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg5 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg6 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg7 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg8 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg9 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg10 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg11 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg12 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg13 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg14 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg15 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg16 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg17 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg18 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg19 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg20 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg21 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg22 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg23 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg24 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg25 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg26 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg27 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg28 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg29 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg30 Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type double
   */

  @VTID(326)
  double var_P(
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg1,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg2,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg3,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg4,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg5,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg6,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg7,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg8,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg9,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg10,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg11,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg12,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg13,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg14,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg15,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg16,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg17,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg18,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg19,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg20,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg21,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg22,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg23,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg24,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg25,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg26,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg27,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg28,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg29,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg30);


  /**
   * @param arg1 Mandatory double parameter.
   * @param arg2 Mandatory double parameter.
   * @param arg3 Mandatory double parameter.
   * @param arg4 Mandatory boolean parameter.
   * @return  Returns a value of type double
   */

  @VTID(327)
  double weibull_Dist(
    double arg1,
    double arg2,
    double arg3,
    boolean arg4);


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @param arg2 Mandatory java.lang.Object parameter.
   * @param arg3 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg4 Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type double
   */

  @VTID(328)
  double networkDays_Intl(
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg1,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg2,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg3,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg4);


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @param arg2 Mandatory java.lang.Object parameter.
   * @param arg3 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg4 Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type double
   */

  @VTID(329)
  double workDay_Intl(
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg1,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg2,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg3,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg4);


  /**
   * @param arg1 Mandatory double parameter.
   * @param arg2 Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type double
   */

  @VTID(330)
  double isO_Ceiling(
    double arg1,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg2);


  /**
   * @param arg1 Mandatory double parameter.
   * @param arg2 Mandatory double parameter.
   * @return  Returns a value of type double
   */

  @VTID(331)
  double dummy21(
    double arg1,
    double arg2);


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @param arg2 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg3 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg4 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg5 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg6 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg7 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg8 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg9 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg10 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg11 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg12 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg13 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg14 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg15 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg16 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg17 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg18 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg19 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg20 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg21 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg22 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg23 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg24 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg25 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg26 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg27 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg28 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg29 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg30 Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(332)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object dummy19(
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg1,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg2,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg3,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg4,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg5,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg6,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg7,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg8,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg9,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg10,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg11,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg12,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg13,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg14,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg15,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg16,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg17,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg18,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg19,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg20,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg21,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg22,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg23,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg24,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg25,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg26,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg27,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg28,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg29,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg30);


  /**
   * @param arg1 Mandatory double parameter.
   * @param arg2 Mandatory double parameter.
   * @param arg3 Mandatory double parameter.
   * @param arg4 Mandatory boolean parameter.
   * @param arg5 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg6 Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type double
   */

  @VTID(333)
  double beta_Dist(
    double arg1,
    double arg2,
    double arg3,
    boolean arg4,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg5,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg6);


  /**
   * @param arg1 Mandatory double parameter.
   * @param arg2 Mandatory double parameter.
   * @param arg3 Mandatory double parameter.
   * @param arg4 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg5 Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type double
   */

  @VTID(334)
  double beta_Inv(
    double arg1,
    double arg2,
    double arg3,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg4,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg5);


  /**
   * @param arg1 Mandatory double parameter.
   * @param arg2 Mandatory double parameter.
   * @param arg3 Mandatory boolean parameter.
   * @return  Returns a value of type double
   */

  @VTID(335)
  double chiSq_Dist(
    double arg1,
    double arg2,
    boolean arg3);


  /**
   * @param arg1 Mandatory double parameter.
   * @param arg2 Mandatory double parameter.
   * @return  Returns a value of type double
   */

  @VTID(336)
  double chiSq_Dist_RT(
    double arg1,
    double arg2);


  /**
   * @param arg1 Mandatory double parameter.
   * @param arg2 Mandatory double parameter.
   * @return  Returns a value of type double
   */

  @VTID(337)
  double chiSq_Inv(
    double arg1,
    double arg2);


  /**
   * @param arg1 Mandatory double parameter.
   * @param arg2 Mandatory double parameter.
   * @return  Returns a value of type double
   */

  @VTID(338)
  double chiSq_Inv_RT(
    double arg1,
    double arg2);


  /**
   * @param arg1 Mandatory double parameter.
   * @param arg2 Mandatory double parameter.
   * @param arg3 Mandatory double parameter.
   * @param arg4 Mandatory boolean parameter.
   * @return  Returns a value of type double
   */

  @VTID(339)
  double f_Dist(
    double arg1,
    double arg2,
    double arg3,
    boolean arg4);


  /**
   * @param arg1 Mandatory double parameter.
   * @param arg2 Mandatory double parameter.
   * @param arg3 Mandatory double parameter.
   * @return  Returns a value of type double
   */

  @VTID(340)
  double f_Dist_RT(
    double arg1,
    double arg2,
    double arg3);


  /**
   * @param arg1 Mandatory double parameter.
   * @param arg2 Mandatory double parameter.
   * @param arg3 Mandatory double parameter.
   * @return  Returns a value of type double
   */

  @VTID(341)
  double f_Inv(
    double arg1,
    double arg2,
    double arg3);


  /**
   * @param arg1 Mandatory double parameter.
   * @param arg2 Mandatory double parameter.
   * @param arg3 Mandatory double parameter.
   * @return  Returns a value of type double
   */

  @VTID(342)
  double f_Inv_RT(
    double arg1,
    double arg2,
    double arg3);


  /**
   * @param arg1 Mandatory double parameter.
   * @param arg2 Mandatory double parameter.
   * @param arg3 Mandatory double parameter.
   * @param arg4 Mandatory double parameter.
   * @param arg5 Mandatory boolean parameter.
   * @return  Returns a value of type double
   */

  @VTID(343)
  double hypGeom_Dist(
    double arg1,
    double arg2,
    double arg3,
    double arg4,
    boolean arg5);


  /**
   * @param arg1 Mandatory double parameter.
   * @param arg2 Mandatory double parameter.
   * @param arg3 Mandatory double parameter.
   * @param arg4 Mandatory boolean parameter.
   * @return  Returns a value of type double
   */

  @VTID(344)
  double logNorm_Dist(
    double arg1,
    double arg2,
    double arg3,
    boolean arg4);


  /**
   * @param arg1 Mandatory double parameter.
   * @param arg2 Mandatory double parameter.
   * @param arg3 Mandatory double parameter.
   * @return  Returns a value of type double
   */

  @VTID(345)
  double logNorm_Inv(
    double arg1,
    double arg2,
    double arg3);


  /**
   * @param arg1 Mandatory double parameter.
   * @param arg2 Mandatory double parameter.
   * @param arg3 Mandatory double parameter.
   * @param arg4 Mandatory boolean parameter.
   * @return  Returns a value of type double
   */

  @VTID(346)
  double negBinom_Dist(
    double arg1,
    double arg2,
    double arg3,
    boolean arg4);


  /**
   * @param arg1 Mandatory double parameter.
   * @param arg2 Mandatory boolean parameter.
   * @return  Returns a value of type double
   */

  @VTID(347)
  double norm_S_Dist(
    double arg1,
    boolean arg2);


  /**
   * @param arg1 Mandatory double parameter.
   * @return  Returns a value of type double
   */

  @VTID(348)
  double norm_S_Inv(
    double arg1);


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @param arg2 Mandatory java.lang.Object parameter.
   * @param arg3 Mandatory double parameter.
   * @param arg4 Mandatory double parameter.
   * @return  Returns a value of type double
   */

  @VTID(349)
  double t_Test(
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg1,
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg2,
    double arg3,
    double arg4);


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @param arg2 Mandatory double parameter.
   * @param arg3 Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type double
   */

  @VTID(350)
  double z_Test(
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg1,
    double arg2,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg3);


  /**
   * @param arg1 Mandatory double parameter.
   * @param arg2 Mandatory double parameter.
   * @param arg3 Mandatory double parameter.
   * @param arg4 Mandatory boolean parameter.
   * @return  Returns a value of type double
   */

  @VTID(351)
  double binom_Dist(
    double arg1,
    double arg2,
    double arg3,
    boolean arg4);


  /**
   * @param arg1 Mandatory double parameter.
   * @param arg2 Mandatory double parameter.
   * @param arg3 Mandatory double parameter.
   * @return  Returns a value of type double
   */

  @VTID(352)
  double binom_Inv(
    double arg1,
    double arg2,
    double arg3);


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @return  Returns a value of type double
   */

  @VTID(353)
  double erf_Precise(
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg1);


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @return  Returns a value of type double
   */

  @VTID(354)
  double erfC_Precise(
    @MarshalAs(NativeType.VARIANT) java.lang.Object arg1);


  /**
   * @param arg1 Mandatory double parameter.
   * @return  Returns a value of type double
   */

  @VTID(355)
  double gammaLn_Precise(
    double arg1);


  /**
   * @param arg1 Mandatory double parameter.
   * @param arg2 Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type double
   */

  @VTID(356)
  double ceiling_Precise(
    double arg1,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg2);


  /**
   * @param arg1 Mandatory double parameter.
   * @param arg2 Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type double
   */

  @VTID(357)
  double floor_Precise(
    double arg1,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object arg2);


  // Properties:
}
