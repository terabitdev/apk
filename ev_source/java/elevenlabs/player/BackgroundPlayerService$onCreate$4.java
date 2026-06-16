package io.elevenlabs.player;

import kotlin.Metadata;
import kotlin.jvm.internal.j;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final /* synthetic */ class BackgroundPlayerService$onCreate$4 extends j implements ho.a {
    public BackgroundPlayerService$onCreate$4(Object obj) {
        super(0, 0, BackgroundPlayerService.class, obj, "getPlaybackSpeed", "getPlaybackSpeed()F");
    }

    @Override // ho.a
    public final Float invoke() {
        float playbackSpeed;
        playbackSpeed = ((BackgroundPlayerService) this.receiver).getPlaybackSpeed();
        return Float.valueOf(playbackSpeed);
    }
}
