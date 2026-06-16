package io.livekit.android.room;

import as.d7;
import as.j7;
import com.google.protobuf.c6;
import et.d;
import io.livekit.android.util.LKLog;
import io.livekit.android.util.LoggingLevel;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import livekit.LivekitModels$DataPacket;
import livekit.LivekitModels$EncryptedPacketPayload;
import livekit.LivekitRtc$ICEServer;
import livekit.a;
import livekit.j;
import livekit.org.webrtc.PeerConnection;
import tn.t;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001b\u0010\u000b\u001a\u00020\n*\u00020\b2\u0006\u0010\t\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u000b\u0010\f*\"\u0010\u000f\"\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\n0\r2\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\n0\r¨\u0006\u0010"}, d2 = {"Llivekit/LivekitRtc$ICEServer;", "Llivekit/org/webrtc/PeerConnection$IceServer;", "toWebrtc", "(Llivekit/LivekitRtc$ICEServer;)Llivekit/org/webrtc/PeerConnection$IceServer;", "Llivekit/LivekitModels$DataPacket;", "Llivekit/LivekitModels$EncryptedPacketPayload;", "asEncryptedPacketPayload", "(Llivekit/LivekitModels$DataPacket;)Llivekit/LivekitModels$EncryptedPacketPayload;", "Llivekit/a;", "payload", "Lsn/z;", "setFromEncryptedPayload", "(Llivekit/a;Llivekit/LivekitModels$EncryptedPacketPayload;)V", "Lkotlin/Function1;", "Llivekit/org/webrtc/PeerConnection$PeerConnectionState;", "PeerConnectionStateListener", "livekit-android-sdk_release"}, k = 2, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class RTCEngineKt {

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[d7.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[6] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[7] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[8] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[9] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[10] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[11] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[5] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[4] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[2] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[1] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[12] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[3] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[13] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[j7.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr2[2] = 3;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr2[3] = 4;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr2[4] = 5;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr2[5] = 6;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr2[6] = 7;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr2[7] = 8;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr2[8] = 9;
            } catch (NoSuchFieldError unused23) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final LivekitModels$EncryptedPacketPayload asEncryptedPacketPayload(LivekitModels$DataPacket livekitModels$DataPacket) {
        int i10;
        livekitModels$DataPacket.getClass();
        d7 valueCase = livekitModels$DataPacket.getValueCase();
        if (valueCase == null) {
            i10 = -1;
        } else {
            i10 = WhenMappings.$EnumSwitchMapping$0[valueCase.ordinal()];
        }
        switch (i10) {
            case 1:
                j newBuilder = LivekitModels$EncryptedPacketPayload.newBuilder();
                newBuilder.i(livekitModels$DataPacket.getUser());
                return (LivekitModels$EncryptedPacketPayload) newBuilder.build();
            case 2:
                j newBuilder2 = LivekitModels$EncryptedPacketPayload.newBuilder();
                newBuilder2.d(livekitModels$DataPacket.getRpcRequest());
                return (LivekitModels$EncryptedPacketPayload) newBuilder2.build();
            case 3:
                j newBuilder3 = LivekitModels$EncryptedPacketPayload.newBuilder();
                newBuilder3.c(livekitModels$DataPacket.getRpcAck());
                return (LivekitModels$EncryptedPacketPayload) newBuilder3.build();
            case 4:
                j newBuilder4 = LivekitModels$EncryptedPacketPayload.newBuilder();
                newBuilder4.e(livekitModels$DataPacket.getRpcResponse());
                return (LivekitModels$EncryptedPacketPayload) newBuilder4.build();
            case 5:
                j newBuilder5 = LivekitModels$EncryptedPacketPayload.newBuilder();
                newBuilder5.g(livekitModels$DataPacket.getStreamHeader());
                return (LivekitModels$EncryptedPacketPayload) newBuilder5.build();
            case 6:
                j newBuilder6 = LivekitModels$EncryptedPacketPayload.newBuilder();
                newBuilder6.f(livekitModels$DataPacket.getStreamChunk());
                return (LivekitModels$EncryptedPacketPayload) newBuilder6.build();
            case 7:
                j newBuilder7 = LivekitModels$EncryptedPacketPayload.newBuilder();
                newBuilder7.h(livekitModels$DataPacket.getStreamTrailer());
                return (LivekitModels$EncryptedPacketPayload) newBuilder7.build();
            case 8:
                j newBuilder8 = LivekitModels$EncryptedPacketPayload.newBuilder();
                newBuilder8.b(livekitModels$DataPacket.getChatMessage());
                return (LivekitModels$EncryptedPacketPayload) newBuilder8.build();
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
                return null;
            default:
                c6.p();
                return null;
        }
    }

    public static final void setFromEncryptedPayload(a aVar, LivekitModels$EncryptedPacketPayload livekitModels$EncryptedPacketPayload) {
        int i10;
        aVar.getClass();
        livekitModels$EncryptedPacketPayload.getClass();
        j7 valueCase = livekitModels$EncryptedPacketPayload.getValueCase();
        if (valueCase == null) {
            i10 = -1;
        } else {
            i10 = WhenMappings.$EnumSwitchMapping$1[valueCase.ordinal()];
        }
        switch (i10) {
            case 1:
                aVar.q(livekitModels$EncryptedPacketPayload.getUser());
                return;
            case 2:
                aVar.d(livekitModels$EncryptedPacketPayload.getChatMessage());
                return;
            case 3:
                aVar.i(livekitModels$EncryptedPacketPayload.getRpcRequest());
                return;
            case 4:
                aVar.h(livekitModels$EncryptedPacketPayload.getRpcAck());
                return;
            case 5:
                aVar.j(livekitModels$EncryptedPacketPayload.getRpcResponse());
                return;
            case 6:
                aVar.n(livekitModels$EncryptedPacketPayload.getStreamHeader());
                return;
            case 7:
                aVar.m(livekitModels$EncryptedPacketPayload.getStreamChunk());
                return;
            case 8:
                aVar.o(livekitModels$EncryptedPacketPayload.getStreamTrailer());
                return;
            case 9:
                LKLog.Companion companion = LKLog.INSTANCE;
                if (LoggingLevel.WARN.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && d.d() > 0) {
                    d.f(null, "Attempting to set from non-valid payload", new Object[0]);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public static final PeerConnection.IceServer toWebrtc(LivekitRtc$ICEServer livekitRtc$ICEServer) {
        livekitRtc$ICEServer.getClass();
        PeerConnection.IceServer.Builder builder = PeerConnection.IceServer.builder(livekitRtc$ICEServer.getUrlsList());
        String username = livekitRtc$ICEServer.getUsername();
        String str = "";
        if (username == null) {
            username = "";
        }
        PeerConnection.IceServer.Builder username2 = builder.setUsername(username);
        String credential = livekitRtc$ICEServer.getCredential();
        if (credential != null) {
            str = credential;
        }
        PeerConnection.IceServer.Builder password = username2.setPassword(str);
        t tVar = t.f33547a;
        PeerConnection.IceServer createIceServer = password.setTlsAlpnProtocols(tVar).setTlsEllipticCurves(tVar).createIceServer();
        createIceServer.getClass();
        return createIceServer;
    }
}
