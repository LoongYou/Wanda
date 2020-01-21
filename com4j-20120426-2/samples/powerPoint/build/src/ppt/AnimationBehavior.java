package ppt  ;

import com4j.*;

@IID("{914934E4-5A91-11CF-8700-00AA0060263B}")
public interface AnimationBehavior extends Com4jObject {
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
   * Getter method for the COM property "Additive"
   * </p>
   * @return  Returns a value of type ppt.MsoAnimAdditive
   */

  @DISPID(2003) //= 0x7d3. The runtime will prefer the VTID if present
  @VTID(9)
  ppt.MsoAnimAdditive additive();


  /**
   * <p>
   * Setter method for the COM property "Additive"
   * </p>
   * @param additive Mandatory ppt.MsoAnimAdditive parameter.
   */

  @DISPID(2003) //= 0x7d3. The runtime will prefer the VTID if present
  @VTID(10)
  void additive(
    ppt.MsoAnimAdditive additive);


  /**
   * <p>
   * Getter method for the COM property "Accumulate"
   * </p>
   * @return  Returns a value of type ppt.MsoAnimAccumulate
   */

  @DISPID(2004) //= 0x7d4. The runtime will prefer the VTID if present
  @VTID(11)
  ppt.MsoAnimAccumulate accumulate();


  /**
   * <p>
   * Setter method for the COM property "Accumulate"
   * </p>
   * @param accumulate Mandatory ppt.MsoAnimAccumulate parameter.
   */

  @DISPID(2004) //= 0x7d4. The runtime will prefer the VTID if present
  @VTID(12)
  void accumulate(
    ppt.MsoAnimAccumulate accumulate);


  /**
   * <p>
   * Getter method for the COM property "Type"
   * </p>
   * @return  Returns a value of type ppt.MsoAnimType
   */

  @DISPID(2005) //= 0x7d5. The runtime will prefer the VTID if present
  @VTID(13)
  ppt.MsoAnimType type();


  /**
   * <p>
   * Setter method for the COM property "Type"
   * </p>
   * @param type Mandatory ppt.MsoAnimType parameter.
   */

  @DISPID(2005) //= 0x7d5. The runtime will prefer the VTID if present
  @VTID(14)
  void type(
    ppt.MsoAnimType type);


  /**
   * <p>
   * Getter method for the COM property "MotionEffect"
   * </p>
   * @return  Returns a value of type ppt.MotionEffect
   */

  @DISPID(2006) //= 0x7d6. The runtime will prefer the VTID if present
  @VTID(15)
  ppt.MotionEffect motionEffect();


  /**
   * <p>
   * Getter method for the COM property "ColorEffect"
   * </p>
   * @return  Returns a value of type ppt.ColorEffect
   */

  @DISPID(2007) //= 0x7d7. The runtime will prefer the VTID if present
  @VTID(16)
  ppt.ColorEffect colorEffect();


  /**
   * <p>
   * Getter method for the COM property "ScaleEffect"
   * </p>
   * @return  Returns a value of type ppt.ScaleEffect
   */

  @DISPID(2008) //= 0x7d8. The runtime will prefer the VTID if present
  @VTID(17)
  ppt.ScaleEffect scaleEffect();


  /**
   * <p>
   * Getter method for the COM property "RotationEffect"
   * </p>
   * @return  Returns a value of type ppt.RotationEffect
   */

  @DISPID(2009) //= 0x7d9. The runtime will prefer the VTID if present
  @VTID(18)
  ppt.RotationEffect rotationEffect();


  /**
   * <p>
   * Getter method for the COM property "PropertyEffect"
   * </p>
   * @return  Returns a value of type ppt.PropertyEffect
   */

  @DISPID(2010) //= 0x7da. The runtime will prefer the VTID if present
  @VTID(19)
  ppt.PropertyEffect propertyEffect();


  /**
   * <p>
   * Getter method for the COM property "Timing"
   * </p>
   * @return  Returns a value of type ppt.Timing
   */

  @DISPID(2011) //= 0x7db. The runtime will prefer the VTID if present
  @VTID(20)
  ppt.Timing timing();


  /**
   */

  @DISPID(2012) //= 0x7dc. The runtime will prefer the VTID if present
  @VTID(21)
  void delete();


  /**
   * <p>
   * Getter method for the COM property "CommandEffect"
   * </p>
   * @return  Returns a value of type ppt.CommandEffect
   */

  @DISPID(2013) //= 0x7dd. The runtime will prefer the VTID if present
  @VTID(22)
  ppt.CommandEffect commandEffect();


  /**
   * <p>
   * Getter method for the COM property "FilterEffect"
   * </p>
   * @return  Returns a value of type ppt.FilterEffect
   */

  @DISPID(2014) //= 0x7de. The runtime will prefer the VTID if present
  @VTID(23)
  ppt.FilterEffect filterEffect();


  /**
   * <p>
   * Getter method for the COM property "SetEffect"
   * </p>
   * @return  Returns a value of type ppt.SetEffect
   */

  @DISPID(2015) //= 0x7df. The runtime will prefer the VTID if present
  @VTID(24)
  ppt.SetEffect setEffect();


  // Properties:
}
