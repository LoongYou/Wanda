package word  ;

import com4j.*;

@IID("{00020967-0000-0000-C000-000000000046}")
public interface Bookmarks extends Com4jObject,Iterable<Com4jObject> {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "_NewEnum"
   * </p>
   */

  @DISPID(-4) //= 0xfffffffc. The runtime will prefer the VTID if present
  @VTID(7)
  java.util.Iterator<Com4jObject> iterator();

  /**
   * <p>
   * Getter method for the COM property "Count"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(8)
  int count();


  /**
   * <p>
   * Getter method for the COM property "DefaultSorting"
   * </p>
   * @return  Returns a value of type word.WdBookmarkSortBy
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(9)
  word.WdBookmarkSortBy defaultSorting();


  /**
   * <p>
   * Setter method for the COM property "DefaultSorting"
   * </p>
   * @param prop Mandatory word.WdBookmarkSortBy parameter.
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(10)
  void defaultSorting(
    word.WdBookmarkSortBy prop);


  /**
   * <p>
   * Getter method for the COM property "ShowHidden"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(11)
  boolean showHidden();


  /**
   * <p>
   * Setter method for the COM property "ShowHidden"
   * </p>
   * @param prop Mandatory boolean parameter.
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(12)
  void showHidden(
    boolean prop);


  /**
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of type word._Application
   */

  @DISPID(1000) //= 0x3e8. The runtime will prefer the VTID if present
  @VTID(13)
  word._Application application();


  /**
   * <p>
   * Getter method for the COM property "Creator"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1001) //= 0x3e9. The runtime will prefer the VTID if present
  @VTID(14)
  int creator();


  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(1002) //= 0x3ea. The runtime will prefer the VTID if present
  @VTID(15)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject parent();


  /**
   * @param index Mandatory java.lang.Object parameter.
   * @return  Returns a value of type word.Bookmark
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(16)
  @DefaultMethod
  word.Bookmark item(
    java.lang.Object index);


  /**
   * @param name Mandatory java.lang.String parameter.
   * @param range Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type word.Bookmark
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(17)
  word.Bookmark add(
    java.lang.String name,
    @Optional java.lang.Object range);


  /**
   * @param name Mandatory java.lang.String parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(18)
  boolean exists(
    java.lang.String name);


  // Properties:
}
