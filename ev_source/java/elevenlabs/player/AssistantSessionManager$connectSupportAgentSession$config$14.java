package io.elevenlabs.player;

import ho.l;
import kotlin.Metadata;
import kotlin.jvm.internal.j;
import livekit.LivekitInternal$NodeStats;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final /* synthetic */ class AssistantSessionManager$connectSupportAgentSession$config$14 extends j implements l {
    public AssistantSessionManager$connectSupportAgentSession$config$14(Object obj) {
        super(1, 0, AssistantSessionManager.class, obj, "onSdkInterruption", "onSdkInterruption(I)V");
    }

    @Override // ho.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Number) obj).intValue());
        return z.f31622a;
    }

    public final void invoke(int i10) {
        ((AssistantSessionManager) this.receiver).onSdkInterruption(i10);
    }
}
