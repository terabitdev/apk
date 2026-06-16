package io.elevenlabs.player;

import android.os.Bundle;
import io.elevenlabs.domain.model.EffectivePlaybackModeKt;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;
import w7.r0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lw7/r0;", "", "isAudioTransport", "(Lw7/r0;)Z", "player_release"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class BackgroundPlayerServiceKt {
    public static final /* synthetic */ boolean access$isAudioTransport(r0 r0Var) {
        return isAudioTransport(r0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isAudioTransport(r0 r0Var) {
        String str;
        Bundle bundle = r0Var.f36581d.J;
        if (bundle != null) {
            str = ExchangeKt.getVoiceId(bundle);
        } else {
            str = null;
        }
        return m.c(str, EffectivePlaybackModeKt.ORIGINAL_AUDIO);
    }
}
