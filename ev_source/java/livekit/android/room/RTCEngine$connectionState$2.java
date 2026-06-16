package io.livekit.android.room;

import et.d;
import ho.p;
import io.livekit.android.room.RTCEngine;
import io.livekit.android.util.LKLog;
import io.livekit.android.util.LoggingLevel;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import livekit.LivekitInternal$NodeStats;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lio/livekit/android/room/ConnectionState;", "newVal", "oldVal", "Lsn/z;", "invoke", "(Lio/livekit/android/room/ConnectionState;Lio/livekit/android/room/ConnectionState;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class RTCEngine$connectionState$2 extends n implements p {
    final /* synthetic */ RTCEngine this$0;

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ConnectionState.values().length];
            try {
                iArr[ConnectionState.CONNECTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ConnectionState.DISCONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RTCEngine$connectionState$2(RTCEngine rTCEngine) {
        super(2);
        this.this$0 = rTCEngine;
    }

    public final void invoke(ConnectionState connectionState, ConnectionState connectionState2) {
        RTCEngine.Listener listener;
        connectionState.getClass();
        connectionState2.getClass();
        if (connectionState != connectionState2) {
            int i10 = WhenMappings.$EnumSwitchMapping$0[connectionState.ordinal()];
            if (i10 != 1) {
                if (i10 == 2) {
                    LKLog.Companion companion = LKLog.INSTANCE;
                    if (LoggingLevel.DEBUG.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && d.d() > 0) {
                        d.a(null, "primary ICE disconnected", new Object[0]);
                    }
                    if (connectionState2 == ConnectionState.CONNECTED) {
                        this.this$0.reconnect();
                        return;
                    }
                    return;
                }
                return;
            }
            if (connectionState2 != ConnectionState.DISCONNECTED && connectionState2 != ConnectionState.CONNECTING) {
                if (connectionState2 == ConnectionState.RECONNECTING) {
                    LKLog.Companion companion2 = LKLog.INSTANCE;
                    if (LoggingLevel.DEBUG.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && d.d() > 0) {
                        d.a(null, "primary ICE reconnected", new Object[0]);
                    }
                    RTCEngine.Listener listener2 = this.this$0.getListener();
                    if (listener2 != null) {
                        listener2.onEngineReconnected();
                        return;
                    }
                    return;
                }
                if (connectionState2 == ConnectionState.RESUMING && (listener = this.this$0.getListener()) != null) {
                    listener.onEngineResumed();
                    return;
                }
                return;
            }
            LKLog.Companion companion3 = LKLog.INSTANCE;
            if (LoggingLevel.DEBUG.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && d.d() > 0) {
                d.a(null, "primary ICE connected", new Object[0]);
            }
            RTCEngine.Listener listener3 = this.this$0.getListener();
            if (listener3 != null) {
                listener3.onEngineConnected();
            }
        }
    }

    @Override // ho.p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((ConnectionState) obj, (ConnectionState) obj2);
        return z.f31622a;
    }
}
