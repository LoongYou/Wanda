package word  ;

import com4j.*;

@IID("{000209E2-0000-0000-C000-000000000046}")
public interface Frameset extends Com4jObject,Iterable<Com4jObject> {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of type word._Application
   */

  @DISPID(1000) //= 0x3e8. The runtime will prefer the VTID if present
  @VTID(7)
  word._Application application();


  /**
   * <p>
   * Getter method for the COM property "Creator"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1001) //= 0x3e9. The runtime will prefer the VTID if present
  @VTID(8)
  int creator();


  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(1002) //= 0x3ea. The runtime will prefer the VTID if present
  @VTID(9)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject parent();


  /**
   * <p>
   * Getter method for the COM property "_NewEnum"
   * </p>
   */

  @DISPID(-4) //= 0xfffffffc. The runtime will prefer the VTID if present
  @VTID(10)
  java.util.Iterator<Com4jObject> iterator();

  /**
   * <p>
   * Getter method for the COM property "ParentFrameset"
   * </p>
   * @return  Returns a value of type word.Frameset
   */

  @DISPID(1003) //= 0x3eb. The runtime will prefer the VTID if present
  @VTID(11)
  word.Frameset parentFrameset();


  /**
   * <p>
   * Getter method for the COM property "Type"
   * </p>
   * @return  Returns a value of type word.WdFramesetType
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(12)
  @DefaultMethod
  word.WdFramesetType type();


  /**
   * <p>
   * Getter method for the COM property "WidthType"
   * </p>
   * @return  Returns a value of type word.WdFramesetSizeType
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(13)
  word.WdFramesetSizeType widthType();


  /**
   * <p>
   * Setter method for the COM property "WidthType"
   * </p>
   * @param prop Mandatory word.WdFramesetSizeType parameter.
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(14)
  void widthType(
    word.WdFramesetSizeType prop);


  /**
   * <p>
   * Getter method for the COM property "HeightType"
   * </p>
   * @return  Returns a value of type word.WdFramesetSizeType
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(15)
  word.WdFramesetSizeType heightType();


  /**
   * <p>
   * Setter method for the COM property "HeightType"
   * </p>
   * @param prop Mandatory word.WdFramesetSizeType parameter.
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(16)
  void heightType(
    word.WdFramesetSizeType prop);


  /**
   * <p>
   * Getter method for the COM property "Width"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(17)
  int width();


  /**
   * <p>
   * Setter method for the COM property "Width"
   * </p>
   * @param prop Mandatory int parameter.
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(18)
  void width(
    int prop);


  /**
   * <p>
   * Getter method for the COM property "Height"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(19)
  int height();


  /**
   * <p>
   * Setter method for the COM property "Height"
   * </p>
   * @param prop Mandatory int parameter.
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(20)
  void height(
    int prop);


  /**
   * <p>
   * Getter method for the COM property "ChildFramesetCount"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(21)
  int childFramesetCount();


  /**
   * <p>
   * Getter method for the COM property "ChildFramesetItem"
   * </p>
   * @param index Mandatory int parameter.
   * @return  Returns a value of type word.Frameset
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(22)
  word.Frameset childFramesetItem(
    int index);


  /**
   * <p>
   * Getter method for the COM property "FramesetBorderWidth"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(20) //= 0x14. The runtime will prefer the VTID if present
  @VTID(23)
  float framesetBorderWidth();


  /**
   * <p>
   * Setter method for the COM property "FramesetBorderWidth"
   * </p>
   * @param prop Mandatory float parameter.
   */

  @DISPID(20) //= 0x14. The runtime will prefer the VTID if present
  @VTID(24)
  void framesetBorderWidth(
    float prop);


  /**
   * <p>
   * Getter method for the COM property "FramesetBorderColor"
   * </p>
   * @return  Returns a value of type word.WdColor
   */

  @DISPID(21) //= 0x15. The runtime will prefer the VTID if present
  @VTID(25)
  word.WdColor framesetBorderColor();


  /**
   * <p>
   * Setter method for the COM property "FramesetBorderColor"
   * </p>
   * @param prop Mandatory word.WdColor parameter.
   */

  @DISPID(21) //= 0x15. The runtime will prefer the VTID if present
  @VTID(26)
  void framesetBorderColor(
    word.WdColor prop);


  /**
   * <p>
   * Getter method for the COM property "FrameScrollbarType"
   * </p>
   * @return  Returns a value of type word.WdScrollbarType
   */

  @DISPID(30) //= 0x1e. The runtime will prefer the VTID if present
  @VTID(27)
  word.WdScrollbarType frameScrollbarType();


  /**
   * <p>
   * Setter method for the COM property "FrameScrollbarType"
   * </p>
   * @param prop Mandatory word.WdScrollbarType parameter.
   */

  @DISPID(30) //= 0x1e. The runtime will prefer the VTID if present
  @VTID(28)
  void frameScrollbarType(
    word.WdScrollbarType prop);


  /**
   * <p>
   * Getter method for the COM property "FrameResizable"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(31) //= 0x1f. The runtime will prefer the VTID if present
  @VTID(29)
  boolean frameResizable();


  /**
   * <p>
   * Setter method for the COM property "FrameResizable"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(31) //= 0x1f. The runtime will prefer the VTID if present
  @VTID(30)
  void frameResizable(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "FrameName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(34) //= 0x22. The runtime will prefer the VTID if present
  @VTID(31)
  java.lang.String frameName();


  /**
   * <p>
   * Setter method for the COM property "FrameName"
   * </p>
   * @param prop Mandatory java.lang.String parameter.
   */

  @DISPID(34) //= 0x22. The runtime will prefer the VTID if present
  @VTID(32)
  void frameName(
    java.lang.String prop);


  /**
   * <p>
   * Getter method for the COM property "FrameDisplayBorders"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(35) //= 0x23. The runtime will prefer the VTID if present
  @VTID(33)
  boolean frameDisplayBorders();


  /**
   * <p>
   * Setter method for the COM property "FrameDisplayBorders"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(35) //= 0x23. The runtime will prefer the VTID if present
  @VTID(34)
  void frameDisplayBorders(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "FrameDefaultURL"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(36) //= 0x24. The runtime will prefer the VTID if present
  @VTID(35)
  java.lang.String frameDefaultURL();


  /**
   * <p>
   * Setter method for the COM property "FrameDefaultURL"
   * </p>
   * @param prop Mandatory java.lang.String parameter.
   */

  @DISPID(36) //= 0x24. The runtime will prefer the VTID if present
  @VTID(36)
  void frameDefaultURL(
    java.lang.String prop);


  /**
   * <p>
   * Getter method for the COM property "FrameLinkToFile"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(37) //= 0x25. The runtime will prefer the VTID if present
  @VTID(37)
  boolean frameLinkToFile();


  /**
   * <p>
   * Setter method for the COM property "FrameLinkToFile"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(37) //= 0x25. The runtime will prefer the VTID if present
  @VTID(38)
  void frameLinkToFile(
    boolean prop);


  /**
   * @param where Mandatory word.WdFramesetNewFrameLocation parameter.
   * @return  Returns a value of type word.Frameset
   */

  @DISPID(50) //= 0x32. The runtime will prefer the VTID if present
  @VTID(39)
  word.Frameset addNewFrame(
    word.WdFramesetNewFrameLocation where);


  /**
   */

  @DISPID(51) //= 0x33. The runtime will prefer the VTID if present
  @VTID(40)
  void delete();


  // Properties:
}
