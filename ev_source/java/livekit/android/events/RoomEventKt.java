package io.livekit.android.events;

import as.h7;
import com.google.protobuf.c6;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Las/h7;", "Lio/livekit/android/events/DisconnectReason;", "convert", "(Las/h7;)Lio/livekit/android/events/DisconnectReason;", "livekit-android-sdk_release"}, k = 2, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class RoomEventKt {

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[h7.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[4] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[5] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[6] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[7] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[8] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[9] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[10] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[11] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[12] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[13] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[14] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[15] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[0] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[16] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final DisconnectReason convert(h7 h7Var) {
        int i10;
        if (h7Var == null) {
            i10 = -1;
        } else {
            i10 = WhenMappings.$EnumSwitchMapping$0[h7Var.ordinal()];
        }
        switch (i10) {
            case -1:
            case 16:
            case 17:
                return DisconnectReason.UNKNOWN_REASON;
            case 0:
            default:
                c6.p();
                return null;
            case 1:
                return DisconnectReason.CLIENT_INITIATED;
            case 2:
                return DisconnectReason.DUPLICATE_IDENTITY;
            case 3:
                return DisconnectReason.SERVER_SHUTDOWN;
            case 4:
                return DisconnectReason.PARTICIPANT_REMOVED;
            case 5:
                return DisconnectReason.ROOM_DELETED;
            case 6:
                return DisconnectReason.STATE_MISMATCH;
            case 7:
                return DisconnectReason.JOIN_FAILURE;
            case 8:
                return DisconnectReason.MIGRATION;
            case 9:
                return DisconnectReason.SIGNAL_CLOSE;
            case 10:
                return DisconnectReason.ROOM_CLOSED;
            case 11:
                return DisconnectReason.USER_UNAVAILABLE;
            case 12:
                return DisconnectReason.USER_REJECTED;
            case 13:
                return DisconnectReason.SIP_TRUNK_FAILURE;
            case 14:
                return DisconnectReason.CONNECTION_TIMEOUT;
            case 15:
                return DisconnectReason.MEDIA_FAILURE;
        }
    }
}
