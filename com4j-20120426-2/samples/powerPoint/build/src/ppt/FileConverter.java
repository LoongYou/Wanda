package ppt  ;

import com4j.*;

@IID("{92D41A51-F07E-4CA4-AF6F-BEF486AA4E6F}")
public interface FileConverter extends Com4jObject {
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
   * Getter method for the COM property "CanOpen"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(2002) //= 0x7d2. The runtime will prefer the VTID if present
  @VTID(8)
  boolean canOpen();


  /**
   * <p>
   * Getter method for the COM property "CanSave"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(2003) //= 0x7d3. The runtime will prefer the VTID if present
  @VTID(9)
  boolean canSave();


  /**
   * <p>
   * Getter method for the COM property "ClassName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(2004) //= 0x7d4. The runtime will prefer the VTID if present
  @VTID(10)
  java.lang.String className();


  /**
   * <p>
   * Getter method for the COM property "Creator"
   * </p>
   * @return  Returns a value of type ppt.FileConverters
   */

  @DISPID(2005) //= 0x7d5. The runtime will prefer the VTID if present
  @VTID(11)
  ppt.FileConverters creator();


  @VTID(11)
  @ReturnValue(defaultPropertyThrough={ppt.FileConverters.class})
  ppt.FileConverter creator(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);

  /**
   * <p>
   * Getter method for the COM property "Extensions"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(2006) //= 0x7d6. The runtime will prefer the VTID if present
  @VTID(12)
  java.lang.String extensions();


  /**
   * <p>
   * Getter method for the COM property "FormatName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(2007) //= 0x7d7. The runtime will prefer the VTID if present
  @VTID(13)
  java.lang.String formatName();


  /**
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(2008) //= 0x7d8. The runtime will prefer the VTID if present
  @VTID(14)
  java.lang.String name();


  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type ppt.FileConverters
   */

  @DISPID(2009) //= 0x7d9. The runtime will prefer the VTID if present
  @VTID(15)
  ppt.FileConverters parent();


  @VTID(15)
  @ReturnValue(defaultPropertyThrough={ppt.FileConverters.class})
  ppt.FileConverter parent(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);

  /**
   * <p>
   * Getter method for the COM property "Path"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(2010) //= 0x7da. The runtime will prefer the VTID if present
  @VTID(16)
  java.lang.String path();


  /**
   * <p>
   * Getter method for the COM property "OpenFormat"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(2011) //= 0x7db. The runtime will prefer the VTID if present
  @VTID(17)
  int openFormat();


  /**
   * <p>
   * Getter method for the COM property "SaveFormat"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(2012) //= 0x7dc. The runtime will prefer the VTID if present
  @VTID(18)
  int saveFormat();


  // Properties:
}
