package ppt  ;

import com4j.*;

/**
 */
public enum PpEntryEffect implements ComEnum {
  /**
   * <p>
   * The value of this constant is -2
   * </p>
   */
  ppEffectMixed(-2),
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  ppEffectNone(0),
  /**
   * <p>
   * The value of this constant is 257
   * </p>
   */
  ppEffectCut(257),
  /**
   * <p>
   * The value of this constant is 258
   * </p>
   */
  ppEffectCutThroughBlack(258),
  /**
   * <p>
   * The value of this constant is 513
   * </p>
   */
  ppEffectRandom(513),
  /**
   * <p>
   * The value of this constant is 769
   * </p>
   */
  ppEffectBlindsHorizontal(769),
  /**
   * <p>
   * The value of this constant is 770
   * </p>
   */
  ppEffectBlindsVertical(770),
  /**
   * <p>
   * The value of this constant is 1025
   * </p>
   */
  ppEffectCheckerboardAcross(1025),
  /**
   * <p>
   * The value of this constant is 1026
   * </p>
   */
  ppEffectCheckerboardDown(1026),
  /**
   * <p>
   * The value of this constant is 1281
   * </p>
   */
  ppEffectCoverLeft(1281),
  /**
   * <p>
   * The value of this constant is 1282
   * </p>
   */
  ppEffectCoverUp(1282),
  /**
   * <p>
   * The value of this constant is 1283
   * </p>
   */
  ppEffectCoverRight(1283),
  /**
   * <p>
   * The value of this constant is 1284
   * </p>
   */
  ppEffectCoverDown(1284),
  /**
   * <p>
   * The value of this constant is 1285
   * </p>
   */
  ppEffectCoverLeftUp(1285),
  /**
   * <p>
   * The value of this constant is 1286
   * </p>
   */
  ppEffectCoverRightUp(1286),
  /**
   * <p>
   * The value of this constant is 1287
   * </p>
   */
  ppEffectCoverLeftDown(1287),
  /**
   * <p>
   * The value of this constant is 1288
   * </p>
   */
  ppEffectCoverRightDown(1288),
  /**
   * <p>
   * The value of this constant is 1537
   * </p>
   */
  ppEffectDissolve(1537),
  /**
   * <p>
   * The value of this constant is 1793
   * </p>
   */
  ppEffectFade(1793),
  /**
   * <p>
   * The value of this constant is 2049
   * </p>
   */
  ppEffectUncoverLeft(2049),
  /**
   * <p>
   * The value of this constant is 2050
   * </p>
   */
  ppEffectUncoverUp(2050),
  /**
   * <p>
   * The value of this constant is 2051
   * </p>
   */
  ppEffectUncoverRight(2051),
  /**
   * <p>
   * The value of this constant is 2052
   * </p>
   */
  ppEffectUncoverDown(2052),
  /**
   * <p>
   * The value of this constant is 2053
   * </p>
   */
  ppEffectUncoverLeftUp(2053),
  /**
   * <p>
   * The value of this constant is 2054
   * </p>
   */
  ppEffectUncoverRightUp(2054),
  /**
   * <p>
   * The value of this constant is 2055
   * </p>
   */
  ppEffectUncoverLeftDown(2055),
  /**
   * <p>
   * The value of this constant is 2056
   * </p>
   */
  ppEffectUncoverRightDown(2056),
  /**
   * <p>
   * The value of this constant is 2305
   * </p>
   */
  ppEffectRandomBarsHorizontal(2305),
  /**
   * <p>
   * The value of this constant is 2306
   * </p>
   */
  ppEffectRandomBarsVertical(2306),
  /**
   * <p>
   * The value of this constant is 2561
   * </p>
   */
  ppEffectStripsUpLeft(2561),
  /**
   * <p>
   * The value of this constant is 2562
   * </p>
   */
  ppEffectStripsUpRight(2562),
  /**
   * <p>
   * The value of this constant is 2563
   * </p>
   */
  ppEffectStripsDownLeft(2563),
  /**
   * <p>
   * The value of this constant is 2564
   * </p>
   */
  ppEffectStripsDownRight(2564),
  /**
   * <p>
   * The value of this constant is 2565
   * </p>
   */
  ppEffectStripsLeftUp(2565),
  /**
   * <p>
   * The value of this constant is 2566
   * </p>
   */
  ppEffectStripsRightUp(2566),
  /**
   * <p>
   * The value of this constant is 2567
   * </p>
   */
  ppEffectStripsLeftDown(2567),
  /**
   * <p>
   * The value of this constant is 2568
   * </p>
   */
  ppEffectStripsRightDown(2568),
  /**
   * <p>
   * The value of this constant is 2817
   * </p>
   */
  ppEffectWipeLeft(2817),
  /**
   * <p>
   * The value of this constant is 2818
   * </p>
   */
  ppEffectWipeUp(2818),
  /**
   * <p>
   * The value of this constant is 2819
   * </p>
   */
  ppEffectWipeRight(2819),
  /**
   * <p>
   * The value of this constant is 2820
   * </p>
   */
  ppEffectWipeDown(2820),
  /**
   * <p>
   * The value of this constant is 3073
   * </p>
   */
  ppEffectBoxOut(3073),
  /**
   * <p>
   * The value of this constant is 3074
   * </p>
   */
  ppEffectBoxIn(3074),
  /**
   * <p>
   * The value of this constant is 3329
   * </p>
   */
  ppEffectFlyFromLeft(3329),
  /**
   * <p>
   * The value of this constant is 3330
   * </p>
   */
  ppEffectFlyFromTop(3330),
  /**
   * <p>
   * The value of this constant is 3331
   * </p>
   */
  ppEffectFlyFromRight(3331),
  /**
   * <p>
   * The value of this constant is 3332
   * </p>
   */
  ppEffectFlyFromBottom(3332),
  /**
   * <p>
   * The value of this constant is 3333
   * </p>
   */
  ppEffectFlyFromTopLeft(3333),
  /**
   * <p>
   * The value of this constant is 3334
   * </p>
   */
  ppEffectFlyFromTopRight(3334),
  /**
   * <p>
   * The value of this constant is 3335
   * </p>
   */
  ppEffectFlyFromBottomLeft(3335),
  /**
   * <p>
   * The value of this constant is 3336
   * </p>
   */
  ppEffectFlyFromBottomRight(3336),
  /**
   * <p>
   * The value of this constant is 3337
   * </p>
   */
  ppEffectPeekFromLeft(3337),
  /**
   * <p>
   * The value of this constant is 3338
   * </p>
   */
  ppEffectPeekFromDown(3338),
  /**
   * <p>
   * The value of this constant is 3339
   * </p>
   */
  ppEffectPeekFromRight(3339),
  /**
   * <p>
   * The value of this constant is 3340
   * </p>
   */
  ppEffectPeekFromUp(3340),
  /**
   * <p>
   * The value of this constant is 3341
   * </p>
   */
  ppEffectCrawlFromLeft(3341),
  /**
   * <p>
   * The value of this constant is 3342
   * </p>
   */
  ppEffectCrawlFromUp(3342),
  /**
   * <p>
   * The value of this constant is 3343
   * </p>
   */
  ppEffectCrawlFromRight(3343),
  /**
   * <p>
   * The value of this constant is 3344
   * </p>
   */
  ppEffectCrawlFromDown(3344),
  /**
   * <p>
   * The value of this constant is 3345
   * </p>
   */
  ppEffectZoomIn(3345),
  /**
   * <p>
   * The value of this constant is 3346
   * </p>
   */
  ppEffectZoomInSlightly(3346),
  /**
   * <p>
   * The value of this constant is 3347
   * </p>
   */
  ppEffectZoomOut(3347),
  /**
   * <p>
   * The value of this constant is 3348
   * </p>
   */
  ppEffectZoomOutSlightly(3348),
  /**
   * <p>
   * The value of this constant is 3349
   * </p>
   */
  ppEffectZoomCenter(3349),
  /**
   * <p>
   * The value of this constant is 3350
   * </p>
   */
  ppEffectZoomBottom(3350),
  /**
   * <p>
   * The value of this constant is 3351
   * </p>
   */
  ppEffectStretchAcross(3351),
  /**
   * <p>
   * The value of this constant is 3352
   * </p>
   */
  ppEffectStretchLeft(3352),
  /**
   * <p>
   * The value of this constant is 3353
   * </p>
   */
  ppEffectStretchUp(3353),
  /**
   * <p>
   * The value of this constant is 3354
   * </p>
   */
  ppEffectStretchRight(3354),
  /**
   * <p>
   * The value of this constant is 3355
   * </p>
   */
  ppEffectStretchDown(3355),
  /**
   * <p>
   * The value of this constant is 3356
   * </p>
   */
  ppEffectSwivel(3356),
  /**
   * <p>
   * The value of this constant is 3357
   * </p>
   */
  ppEffectSpiral(3357),
  /**
   * <p>
   * The value of this constant is 3585
   * </p>
   */
  ppEffectSplitHorizontalOut(3585),
  /**
   * <p>
   * The value of this constant is 3586
   * </p>
   */
  ppEffectSplitHorizontalIn(3586),
  /**
   * <p>
   * The value of this constant is 3587
   * </p>
   */
  ppEffectSplitVerticalOut(3587),
  /**
   * <p>
   * The value of this constant is 3588
   * </p>
   */
  ppEffectSplitVerticalIn(3588),
  /**
   * <p>
   * The value of this constant is 3841
   * </p>
   */
  ppEffectFlashOnceFast(3841),
  /**
   * <p>
   * The value of this constant is 3842
   * </p>
   */
  ppEffectFlashOnceMedium(3842),
  /**
   * <p>
   * The value of this constant is 3843
   * </p>
   */
  ppEffectFlashOnceSlow(3843),
  /**
   * <p>
   * The value of this constant is 3844
   * </p>
   */
  ppEffectAppear(3844),
  /**
   * <p>
   * The value of this constant is 3845
   * </p>
   */
  ppEffectCircleOut(3845),
  /**
   * <p>
   * The value of this constant is 3846
   * </p>
   */
  ppEffectDiamondOut(3846),
  /**
   * <p>
   * The value of this constant is 3847
   * </p>
   */
  ppEffectCombHorizontal(3847),
  /**
   * <p>
   * The value of this constant is 3848
   * </p>
   */
  ppEffectCombVertical(3848),
  /**
   * <p>
   * The value of this constant is 3849
   * </p>
   */
  ppEffectFadeSmoothly(3849),
  /**
   * <p>
   * The value of this constant is 3850
   * </p>
   */
  ppEffectNewsflash(3850),
  /**
   * <p>
   * The value of this constant is 3851
   * </p>
   */
  ppEffectPlusOut(3851),
  /**
   * <p>
   * The value of this constant is 3852
   * </p>
   */
  ppEffectPushDown(3852),
  /**
   * <p>
   * The value of this constant is 3853
   * </p>
   */
  ppEffectPushLeft(3853),
  /**
   * <p>
   * The value of this constant is 3854
   * </p>
   */
  ppEffectPushRight(3854),
  /**
   * <p>
   * The value of this constant is 3855
   * </p>
   */
  ppEffectPushUp(3855),
  /**
   * <p>
   * The value of this constant is 3856
   * </p>
   */
  ppEffectWedge(3856),
  /**
   * <p>
   * The value of this constant is 3857
   * </p>
   */
  ppEffectWheel1Spoke(3857),
  /**
   * <p>
   * The value of this constant is 3858
   * </p>
   */
  ppEffectWheel2Spokes(3858),
  /**
   * <p>
   * The value of this constant is 3859
   * </p>
   */
  ppEffectWheel3Spokes(3859),
  /**
   * <p>
   * The value of this constant is 3860
   * </p>
   */
  ppEffectWheel4Spokes(3860),
  /**
   * <p>
   * The value of this constant is 3861
   * </p>
   */
  ppEffectWheel8Spokes(3861),
  /**
   * <p>
   * The value of this constant is 3862
   * </p>
   */
  ppEffectWheelReverse1Spoke(3862),
  /**
   * <p>
   * The value of this constant is 3863
   * </p>
   */
  ppEffectVortexLeft(3863),
  /**
   * <p>
   * The value of this constant is 3864
   * </p>
   */
  ppEffectVortexUp(3864),
  /**
   * <p>
   * The value of this constant is 3865
   * </p>
   */
  ppEffectVortexRight(3865),
  /**
   * <p>
   * The value of this constant is 3866
   * </p>
   */
  ppEffectVortexDown(3866),
  /**
   * <p>
   * The value of this constant is 3867
   * </p>
   */
  ppEffectRippleCenter(3867),
  /**
   * <p>
   * The value of this constant is 3868
   * </p>
   */
  ppEffectRippleRightUp(3868),
  /**
   * <p>
   * The value of this constant is 3869
   * </p>
   */
  ppEffectRippleLeftUp(3869),
  /**
   * <p>
   * The value of this constant is 3870
   * </p>
   */
  ppEffectRippleLeftDown(3870),
  /**
   * <p>
   * The value of this constant is 3871
   * </p>
   */
  ppEffectRippleRightDown(3871),
  /**
   * <p>
   * The value of this constant is 3872
   * </p>
   */
  ppEffectGlitterDiamondLeft(3872),
  /**
   * <p>
   * The value of this constant is 3873
   * </p>
   */
  ppEffectGlitterDiamondUp(3873),
  /**
   * <p>
   * The value of this constant is 3874
   * </p>
   */
  ppEffectGlitterDiamondRight(3874),
  /**
   * <p>
   * The value of this constant is 3875
   * </p>
   */
  ppEffectGlitterDiamondDown(3875),
  /**
   * <p>
   * The value of this constant is 3876
   * </p>
   */
  ppEffectGlitterHexagonLeft(3876),
  /**
   * <p>
   * The value of this constant is 3877
   * </p>
   */
  ppEffectGlitterHexagonUp(3877),
  /**
   * <p>
   * The value of this constant is 3878
   * </p>
   */
  ppEffectGlitterHexagonRight(3878),
  /**
   * <p>
   * The value of this constant is 3879
   * </p>
   */
  ppEffectGlitterHexagonDown(3879),
  /**
   * <p>
   * The value of this constant is 3880
   * </p>
   */
  ppEffectGalleryLeft(3880),
  /**
   * <p>
   * The value of this constant is 3881
   * </p>
   */
  ppEffectGalleryRight(3881),
  /**
   * <p>
   * The value of this constant is 3882
   * </p>
   */
  ppEffectConveyorLeft(3882),
  /**
   * <p>
   * The value of this constant is 3883
   * </p>
   */
  ppEffectConveyorRight(3883),
  /**
   * <p>
   * The value of this constant is 3884
   * </p>
   */
  ppEffectDoorsVertical(3884),
  /**
   * <p>
   * The value of this constant is 3885
   * </p>
   */
  ppEffectDoorsHorizontal(3885),
  /**
   * <p>
   * The value of this constant is 3886
   * </p>
   */
  ppEffectWindowVertical(3886),
  /**
   * <p>
   * The value of this constant is 3887
   * </p>
   */
  ppEffectWindowHorizontal(3887),
  /**
   * <p>
   * The value of this constant is 3888
   * </p>
   */
  ppEffectWarpIn(3888),
  /**
   * <p>
   * The value of this constant is 3889
   * </p>
   */
  ppEffectWarpOut(3889),
  /**
   * <p>
   * The value of this constant is 3890
   * </p>
   */
  ppEffectFlyThroughIn(3890),
  /**
   * <p>
   * The value of this constant is 3891
   * </p>
   */
  ppEffectFlyThroughOut(3891),
  /**
   * <p>
   * The value of this constant is 3892
   * </p>
   */
  ppEffectFlyThroughInBounce(3892),
  /**
   * <p>
   * The value of this constant is 3893
   * </p>
   */
  ppEffectFlyThroughOutBounce(3893),
  /**
   * <p>
   * The value of this constant is 3894
   * </p>
   */
  ppEffectRevealSmoothLeft(3894),
  /**
   * <p>
   * The value of this constant is 3895
   * </p>
   */
  ppEffectRevealSmoothRight(3895),
  /**
   * <p>
   * The value of this constant is 3896
   * </p>
   */
  ppEffectRevealBlackLeft(3896),
  /**
   * <p>
   * The value of this constant is 3897
   * </p>
   */
  ppEffectRevealBlackRight(3897),
  /**
   * <p>
   * The value of this constant is 3898
   * </p>
   */
  ppEffectHoneycomb(3898),
  /**
   * <p>
   * The value of this constant is 3899
   * </p>
   */
  ppEffectFerrisWheelLeft(3899),
  /**
   * <p>
   * The value of this constant is 3900
   * </p>
   */
  ppEffectFerrisWheelRight(3900),
  /**
   * <p>
   * The value of this constant is 3901
   * </p>
   */
  ppEffectSwitchLeft(3901),
  /**
   * <p>
   * The value of this constant is 3902
   * </p>
   */
  ppEffectSwitchUp(3902),
  /**
   * <p>
   * The value of this constant is 3903
   * </p>
   */
  ppEffectSwitchRight(3903),
  /**
   * <p>
   * The value of this constant is 3904
   * </p>
   */
  ppEffectSwitchDown(3904),
  /**
   * <p>
   * The value of this constant is 3905
   * </p>
   */
  ppEffectFlipLeft(3905),
  /**
   * <p>
   * The value of this constant is 3906
   * </p>
   */
  ppEffectFlipUp(3906),
  /**
   * <p>
   * The value of this constant is 3907
   * </p>
   */
  ppEffectFlipRight(3907),
  /**
   * <p>
   * The value of this constant is 3908
   * </p>
   */
  ppEffectFlipDown(3908),
  /**
   * <p>
   * The value of this constant is 3909
   * </p>
   */
  ppEffectFlashbulb(3909),
  /**
   * <p>
   * The value of this constant is 3910
   * </p>
   */
  ppEffectShredStripsIn(3910),
  /**
   * <p>
   * The value of this constant is 3911
   * </p>
   */
  ppEffectShredStripsOut(3911),
  /**
   * <p>
   * The value of this constant is 3912
   * </p>
   */
  ppEffectShredRectangleIn(3912),
  /**
   * <p>
   * The value of this constant is 3913
   * </p>
   */
  ppEffectShredRectangleOut(3913),
  /**
   * <p>
   * The value of this constant is 3914
   * </p>
   */
  ppEffectCubeLeft(3914),
  /**
   * <p>
   * The value of this constant is 3915
   * </p>
   */
  ppEffectCubeUp(3915),
  /**
   * <p>
   * The value of this constant is 3916
   * </p>
   */
  ppEffectCubeRight(3916),
  /**
   * <p>
   * The value of this constant is 3917
   * </p>
   */
  ppEffectCubeDown(3917),
  /**
   * <p>
   * The value of this constant is 3918
   * </p>
   */
  ppEffectRotateLeft(3918),
  /**
   * <p>
   * The value of this constant is 3919
   * </p>
   */
  ppEffectRotateUp(3919),
  /**
   * <p>
   * The value of this constant is 3920
   * </p>
   */
  ppEffectRotateRight(3920),
  /**
   * <p>
   * The value of this constant is 3921
   * </p>
   */
  ppEffectRotateDown(3921),
  /**
   * <p>
   * The value of this constant is 3922
   * </p>
   */
  ppEffectBoxLeft(3922),
  /**
   * <p>
   * The value of this constant is 3923
   * </p>
   */
  ppEffectBoxUp(3923),
  /**
   * <p>
   * The value of this constant is 3924
   * </p>
   */
  ppEffectBoxRight(3924),
  /**
   * <p>
   * The value of this constant is 3925
   * </p>
   */
  ppEffectBoxDown(3925),
  /**
   * <p>
   * The value of this constant is 3926
   * </p>
   */
  ppEffectOrbitLeft(3926),
  /**
   * <p>
   * The value of this constant is 3927
   * </p>
   */
  ppEffectOrbitUp(3927),
  /**
   * <p>
   * The value of this constant is 3928
   * </p>
   */
  ppEffectOrbitRight(3928),
  /**
   * <p>
   * The value of this constant is 3929
   * </p>
   */
  ppEffectOrbitDown(3929),
  /**
   * <p>
   * The value of this constant is 3930
   * </p>
   */
  ppEffectPanLeft(3930),
  /**
   * <p>
   * The value of this constant is 3931
   * </p>
   */
  ppEffectPanUp(3931),
  /**
   * <p>
   * The value of this constant is 3932
   * </p>
   */
  ppEffectPanRight(3932),
  /**
   * <p>
   * The value of this constant is 3933
   * </p>
   */
  ppEffectPanDown(3933),
  ;

  private final int value;
  PpEntryEffect(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
