package io.livekit.android.room.track.video;

import kotlin.Metadata;
import kotlin.jvm.internal.n;
import livekit.LivekitInternal$NodeStats;
import livekit.org.webrtc.Camera1Enumerator;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Llivekit/org/webrtc/Camera1Enumerator;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class CameraCapturerUtils$createCamera1Provider$1$enumerator$2 extends n implements ho.a {
    public static final CameraCapturerUtils$createCamera1Provider$1$enumerator$2 INSTANCE = new CameraCapturerUtils$createCamera1Provider$1$enumerator$2();

    public CameraCapturerUtils$createCamera1Provider$1$enumerator$2() {
        super(0);
    }

    @Override // ho.a
    public final Camera1Enumerator invoke() {
        return new Camera1Enumerator(true);
    }
}
