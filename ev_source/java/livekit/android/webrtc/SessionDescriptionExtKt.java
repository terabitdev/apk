package io.livekit.android.webrtc;

import as.pc;
import com.google.protobuf.a3;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import livekit.LivekitRtc$SessionDescription;
import livekit.org.webrtc.SessionDescription;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"toProtoSessionDescription", "Llivekit/LivekitRtc$SessionDescription;", "Llivekit/org/webrtc/SessionDescription;", "livekit-android-sdk_release"}, k = 2, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class SessionDescriptionExtKt {
    public static final LivekitRtc$SessionDescription toProtoSessionDescription(SessionDescription sessionDescription) {
        sessionDescription.getClass();
        pc newBuilder = LivekitRtc$SessionDescription.newBuilder();
        newBuilder.b(sessionDescription.description);
        newBuilder.c(sessionDescription.type.canonicalForm());
        a3 build = newBuilder.build();
        build.getClass();
        return (LivekitRtc$SessionDescription) build;
    }
}
