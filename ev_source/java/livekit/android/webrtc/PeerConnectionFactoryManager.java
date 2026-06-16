package io.livekit.android.webrtc;

import com.google.protobuf.c6;
import ib.i;
import io.livekit.android.util.LKLog;
import io.livekit.android.util.LoggingLevel;
import io.livekit.android.webrtc.peerconnection.RTCThreadUtilsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;
import livekit.org.webrtc.PeerConnectionFactory;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\nR$\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u00148\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001c¨\u0006\u001d"}, d2 = {"Lio/livekit/android/webrtc/PeerConnectionFactoryManager;", "", "Llivekit/org/webrtc/PeerConnectionFactory;", "peerConnectionFactory", "<init>", "(Llivekit/org/webrtc/PeerConnectionFactory;)V", "Lsn/z;", "dispose", "()V", "component1", "()Llivekit/org/webrtc/PeerConnectionFactory;", "copy", "(Llivekit/org/webrtc/PeerConnectionFactory;)Lio/livekit/android/webrtc/PeerConnectionFactoryManager;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Llivekit/org/webrtc/PeerConnectionFactory;", "getPeerConnectionFactory", "<set-?>", "isDisposed", "Z", "()Z", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final /* data */ class PeerConnectionFactoryManager {
    private boolean isDisposed;
    private final PeerConnectionFactory peerConnectionFactory;

    public PeerConnectionFactoryManager(PeerConnectionFactory peerConnectionFactory) {
        peerConnectionFactory.getClass();
        this.peerConnectionFactory = peerConnectionFactory;
    }

    public static /* synthetic */ PeerConnectionFactoryManager copy$default(PeerConnectionFactoryManager peerConnectionFactoryManager, PeerConnectionFactory peerConnectionFactory, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            peerConnectionFactory = peerConnectionFactoryManager.peerConnectionFactory;
        }
        return peerConnectionFactoryManager.copy(peerConnectionFactory);
    }

    /* renamed from: component1, reason: from getter */
    public final PeerConnectionFactory getPeerConnectionFactory() {
        return this.peerConnectionFactory;
    }

    public final PeerConnectionFactoryManager copy(PeerConnectionFactory peerConnectionFactory) {
        peerConnectionFactory.getClass();
        return new PeerConnectionFactoryManager(peerConnectionFactory);
    }

    public final void dispose() {
        if (this.isDisposed) {
            LKLog.Companion companion = LKLog.INSTANCE;
            if (LoggingLevel.WARN.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && et.d.d() > 0) {
                et.d.f(null, "Calling dispose multiple times on PeerConnectionFactory?", new Object[0]);
                return;
            }
            return;
        }
        if (i.u(RTCThreadUtilsKt.RTC_EXECUTOR_THREADNAME_PREFIX, false)) {
            this.isDisposed = true;
            this.peerConnectionFactory.dispose();
        } else {
            c6.x("PeerConnectionFactory must be disposed on the RTC thread!");
        }
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if ((other instanceof PeerConnectionFactoryManager) && m.c(this.peerConnectionFactory, ((PeerConnectionFactoryManager) other).peerConnectionFactory)) {
            return true;
        }
        return false;
    }

    public final PeerConnectionFactory getPeerConnectionFactory() {
        return this.peerConnectionFactory;
    }

    public int hashCode() {
        return this.peerConnectionFactory.hashCode();
    }

    /* renamed from: isDisposed, reason: from getter */
    public final boolean getIsDisposed() {
        return this.isDisposed;
    }

    public String toString() {
        return "PeerConnectionFactoryManager(peerConnectionFactory=" + this.peerConnectionFactory + ')';
    }
}
