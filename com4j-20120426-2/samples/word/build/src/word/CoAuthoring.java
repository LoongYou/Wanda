package word  ;

import com4j.*;

@IID("{65DF9F31-B1E3-4651-87E8-51D55F302161}")
public interface CoAuthoring extends Com4jObject {
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
   * Getter method for the COM property "Authors"
   * </p>
   * @return  Returns a value of type word.CoAuthors
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(10)
  word.CoAuthors authors();


  @VTID(10)
  @ReturnValue(defaultPropertyThrough={word.CoAuthors.class})
  word.CoAuthor authors(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);

  /**
   * <p>
   * Getter method for the COM property "Me"
   * </p>
   * @return  Returns a value of type word.CoAuthor
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(11)
  word.CoAuthor me();


  /**
   * <p>
   * Getter method for the COM property "PendingUpdates"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(12)
  boolean pendingUpdates();


  /**
   * <p>
   * Getter method for the COM property "Locks"
   * </p>
   * @return  Returns a value of type word.CoAuthLocks
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(13)
  word.CoAuthLocks locks();


  @VTID(13)
  @ReturnValue(defaultPropertyThrough={word.CoAuthLocks.class})
  word.CoAuthLock locks(
    int index);

  /**
   * <p>
   * Getter method for the COM property "Updates"
   * </p>
   * @return  Returns a value of type word.CoAuthUpdates
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(14)
  word.CoAuthUpdates updates();


  @VTID(14)
  @ReturnValue(defaultPropertyThrough={word.CoAuthUpdates.class})
  word.CoAuthUpdate updates(
    int index);

  /**
   * <p>
   * Getter method for the COM property "Conflicts"
   * </p>
   * @return  Returns a value of type word.Conflicts
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(15)
  word.Conflicts conflicts();


  @VTID(15)
  @ReturnValue(defaultPropertyThrough={word.Conflicts.class})
  word.Conflict conflicts(
    int index);

  /**
   * <p>
   * Getter method for the COM property "CanShare"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(16)
  boolean canShare();


  /**
   * <p>
   * Getter method for the COM property "CanMerge"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(17)
  boolean canMerge();


  // Properties:
}
