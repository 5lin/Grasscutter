// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: KDHIAEFLGFM.proto

package emu.grasscutter.net.proto;

public final class KDHIAEFLGFMOuterClass {
  private KDHIAEFLGFMOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code KDHIAEFLGFM}
   */
  public enum KDHIAEFLGFM
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>KDHIAEFLGFM_GalleryStopNone = 0;</code>
     */
    KDHIAEFLGFM_GalleryStopNone(0),
    /**
     * <code>KDHIAEFLGFM_GalleryStopTimeup = 1;</code>
     */
    KDHIAEFLGFM_GalleryStopTimeup(1),
    /**
     * <code>KDHIAEFLGFM_GalleryStopClientInterrupt = 2;</code>
     */
    KDHIAEFLGFM_GalleryStopClientInterrupt(2),
    /**
     * <code>KDHIAEFLGFM_GalleryStopLuaInterruptSuccess = 3;</code>
     */
    KDHIAEFLGFM_GalleryStopLuaInterruptSuccess(3),
    /**
     * <code>KDHIAEFLGFM_GalleryStopLuaInterruptFail = 4;</code>
     */
    KDHIAEFLGFM_GalleryStopLuaInterruptFail(4),
    /**
     * <code>KDHIAEFLGFM_GalleryStopOwnerLeaveScene = 5;</code>
     */
    KDHIAEFLGFM_GalleryStopOwnerLeaveScene(5),
    /**
     * <code>KDHIAEFLGFM_GalleryStopPlayInitFailed = 6;</code>
     */
    KDHIAEFLGFM_GalleryStopPlayInitFailed(6),
    /**
     * <code>KDHIAEFLGFM_GalleryStopOtherPlayerEnter = 7;</code>
     */
    KDHIAEFLGFM_GalleryStopOtherPlayerEnter(7),
    /**
     * <code>KDHIAEFLGFM_GalleryStopAvatarDie = 8;</code>
     */
    KDHIAEFLGFM_GalleryStopAvatarDie(8),
    /**
     * <code>KDHIAEFLGFM_GalleryStopFinished = 9;</code>
     */
    KDHIAEFLGFM_GalleryStopFinished(9),
    /**
     * <code>KDHIAEFLGFM_GalleryStopFungusAllDie = 10;</code>
     */
    KDHIAEFLGFM_GalleryStopFungusAllDie(10),
    /**
     * <code>KDHIAEFLGFM_GalleryStopLifeCountZero = 11;</code>
     */
    KDHIAEFLGFM_GalleryStopLifeCountZero(11),
    /**
     * <code>KDHIAEFLGFM_GalleryStopActivityClosed = 12;</code>
     */
    KDHIAEFLGFM_GalleryStopActivityClosed(12),
    /**
     * <code>KDHIAEFLGFM_GalleryStopLeaveRegionFail = 13;</code>
     */
    KDHIAEFLGFM_GalleryStopLeaveRegionFail(13),
    /**
     * <code>KDHIAEFLGFM_GalleryStopHeartBloodUsedOut = 14;</code>
     */
    KDHIAEFLGFM_GalleryStopHeartBloodUsedOut(14),
    /**
     * <code>KDHIAEFLGFM_GalleryStopGuardianStoneDie = 15;</code>
     */
    KDHIAEFLGFM_GalleryStopGuardianStoneDie(15),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>KDHIAEFLGFM_GalleryStopNone = 0;</code>
     */
    public static final int KDHIAEFLGFM_GalleryStopNone_VALUE = 0;
    /**
     * <code>KDHIAEFLGFM_GalleryStopTimeup = 1;</code>
     */
    public static final int KDHIAEFLGFM_GalleryStopTimeup_VALUE = 1;
    /**
     * <code>KDHIAEFLGFM_GalleryStopClientInterrupt = 2;</code>
     */
    public static final int KDHIAEFLGFM_GalleryStopClientInterrupt_VALUE = 2;
    /**
     * <code>KDHIAEFLGFM_GalleryStopLuaInterruptSuccess = 3;</code>
     */
    public static final int KDHIAEFLGFM_GalleryStopLuaInterruptSuccess_VALUE = 3;
    /**
     * <code>KDHIAEFLGFM_GalleryStopLuaInterruptFail = 4;</code>
     */
    public static final int KDHIAEFLGFM_GalleryStopLuaInterruptFail_VALUE = 4;
    /**
     * <code>KDHIAEFLGFM_GalleryStopOwnerLeaveScene = 5;</code>
     */
    public static final int KDHIAEFLGFM_GalleryStopOwnerLeaveScene_VALUE = 5;
    /**
     * <code>KDHIAEFLGFM_GalleryStopPlayInitFailed = 6;</code>
     */
    public static final int KDHIAEFLGFM_GalleryStopPlayInitFailed_VALUE = 6;
    /**
     * <code>KDHIAEFLGFM_GalleryStopOtherPlayerEnter = 7;</code>
     */
    public static final int KDHIAEFLGFM_GalleryStopOtherPlayerEnter_VALUE = 7;
    /**
     * <code>KDHIAEFLGFM_GalleryStopAvatarDie = 8;</code>
     */
    public static final int KDHIAEFLGFM_GalleryStopAvatarDie_VALUE = 8;
    /**
     * <code>KDHIAEFLGFM_GalleryStopFinished = 9;</code>
     */
    public static final int KDHIAEFLGFM_GalleryStopFinished_VALUE = 9;
    /**
     * <code>KDHIAEFLGFM_GalleryStopFungusAllDie = 10;</code>
     */
    public static final int KDHIAEFLGFM_GalleryStopFungusAllDie_VALUE = 10;
    /**
     * <code>KDHIAEFLGFM_GalleryStopLifeCountZero = 11;</code>
     */
    public static final int KDHIAEFLGFM_GalleryStopLifeCountZero_VALUE = 11;
    /**
     * <code>KDHIAEFLGFM_GalleryStopActivityClosed = 12;</code>
     */
    public static final int KDHIAEFLGFM_GalleryStopActivityClosed_VALUE = 12;
    /**
     * <code>KDHIAEFLGFM_GalleryStopLeaveRegionFail = 13;</code>
     */
    public static final int KDHIAEFLGFM_GalleryStopLeaveRegionFail_VALUE = 13;
    /**
     * <code>KDHIAEFLGFM_GalleryStopHeartBloodUsedOut = 14;</code>
     */
    public static final int KDHIAEFLGFM_GalleryStopHeartBloodUsedOut_VALUE = 14;
    /**
     * <code>KDHIAEFLGFM_GalleryStopGuardianStoneDie = 15;</code>
     */
    public static final int KDHIAEFLGFM_GalleryStopGuardianStoneDie_VALUE = 15;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static KDHIAEFLGFM valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static KDHIAEFLGFM forNumber(int value) {
      switch (value) {
        case 0: return KDHIAEFLGFM_GalleryStopNone;
        case 1: return KDHIAEFLGFM_GalleryStopTimeup;
        case 2: return KDHIAEFLGFM_GalleryStopClientInterrupt;
        case 3: return KDHIAEFLGFM_GalleryStopLuaInterruptSuccess;
        case 4: return KDHIAEFLGFM_GalleryStopLuaInterruptFail;
        case 5: return KDHIAEFLGFM_GalleryStopOwnerLeaveScene;
        case 6: return KDHIAEFLGFM_GalleryStopPlayInitFailed;
        case 7: return KDHIAEFLGFM_GalleryStopOtherPlayerEnter;
        case 8: return KDHIAEFLGFM_GalleryStopAvatarDie;
        case 9: return KDHIAEFLGFM_GalleryStopFinished;
        case 10: return KDHIAEFLGFM_GalleryStopFungusAllDie;
        case 11: return KDHIAEFLGFM_GalleryStopLifeCountZero;
        case 12: return KDHIAEFLGFM_GalleryStopActivityClosed;
        case 13: return KDHIAEFLGFM_GalleryStopLeaveRegionFail;
        case 14: return KDHIAEFLGFM_GalleryStopHeartBloodUsedOut;
        case 15: return KDHIAEFLGFM_GalleryStopGuardianStoneDie;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<KDHIAEFLGFM>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        KDHIAEFLGFM> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<KDHIAEFLGFM>() {
            public KDHIAEFLGFM findValueByNumber(int number) {
              return KDHIAEFLGFM.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.KDHIAEFLGFMOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final KDHIAEFLGFM[] VALUES = values();

    public static KDHIAEFLGFM valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private KDHIAEFLGFM(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:KDHIAEFLGFM)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021KDHIAEFLGFM.proto*\256\005\n\013KDHIAEFLGFM\022\037\n\033K" +
      "DHIAEFLGFM_GalleryStopNone\020\000\022!\n\035KDHIAEFL" +
      "GFM_GalleryStopTimeup\020\001\022*\n&KDHIAEFLGFM_G" +
      "alleryStopClientInterrupt\020\002\022.\n*KDHIAEFLG" +
      "FM_GalleryStopLuaInterruptSuccess\020\003\022+\n\'K" +
      "DHIAEFLGFM_GalleryStopLuaInterruptFail\020\004" +
      "\022*\n&KDHIAEFLGFM_GalleryStopOwnerLeaveSce" +
      "ne\020\005\022)\n%KDHIAEFLGFM_GalleryStopPlayInitF" +
      "ailed\020\006\022+\n\'KDHIAEFLGFM_GalleryStopOtherP" +
      "layerEnter\020\007\022$\n KDHIAEFLGFM_GalleryStopA" +
      "vatarDie\020\010\022#\n\037KDHIAEFLGFM_GalleryStopFin" +
      "ished\020\t\022\'\n#KDHIAEFLGFM_GalleryStopFungus" +
      "AllDie\020\n\022(\n$KDHIAEFLGFM_GalleryStopLifeC" +
      "ountZero\020\013\022)\n%KDHIAEFLGFM_GalleryStopAct" +
      "ivityClosed\020\014\022*\n&KDHIAEFLGFM_GalleryStop" +
      "LeaveRegionFail\020\r\022,\n(KDHIAEFLGFM_Gallery" +
      "StopHeartBloodUsedOut\020\016\022+\n\'KDHIAEFLGFM_G" +
      "alleryStopGuardianStoneDie\020\017B\033\n\031emu.gras" +
      "scutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}