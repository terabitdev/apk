package io.livekit.android.room;

import et.d;
import ho.a;
import io.livekit.android.room.RTCEngine;
import io.livekit.android.util.LKLog;
import io.livekit.android.util.LoggingLevel;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import livekit.org.webrtc.MediaStream;
import livekit.org.webrtc.MediaStreamTrack;
import livekit.org.webrtc.RtpReceiver;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lsn/z;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class SubscriberTransportObserver$onAddTrack$1 extends n implements a {
    final /* synthetic */ RtpReceiver $receiver;
    final /* synthetic */ MediaStream[] $streams;
    final /* synthetic */ SubscriberTransportObserver this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubscriberTransportObserver$onAddTrack$1(RtpReceiver rtpReceiver, SubscriberTransportObserver subscriberTransportObserver, MediaStream[] mediaStreamArr) {
        super(0);
        this.$receiver = rtpReceiver;
        this.this$0 = subscriberTransportObserver;
        this.$streams = mediaStreamArr;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m2550invoke() {
        RTCEngine rTCEngine;
        MediaStreamTrack track = this.$receiver.track();
        if (track != null) {
            LKLog.Companion companion = LKLog.INSTANCE;
            MediaStream[] mediaStreamArr = this.$streams;
            if (LoggingLevel.VERBOSE.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && d.d() > 0) {
                StringBuilder sb = new StringBuilder("onAddTrack: ");
                sb.append(track.kind());
                sb.append(", ");
                sb.append(track.id());
                sb.append(", ");
                String str = "";
                for (MediaStream mediaStream : mediaStreamArr) {
                    str = str + ", " + mediaStream;
                }
                sb.append(str);
                d.e(null, sb.toString(), new Object[0]);
            }
            rTCEngine = this.this$0.engine;
            RTCEngine.Listener listener = rTCEngine.getListener();
            if (listener != null) {
                listener.onAddTrack(this.$receiver, track, this.$streams);
            }
        }
    }

    @Override // ho.a
    public /* bridge */ /* synthetic */ Object invoke() {
        m2550invoke();
        return z.f31622a;
    }
}
