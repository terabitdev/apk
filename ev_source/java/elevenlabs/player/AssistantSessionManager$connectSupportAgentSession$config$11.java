package io.elevenlabs.player;

import ho.p;
import kotlin.Metadata;
import kotlin.jvm.internal.j;
import livekit.LivekitInternal$NodeStats;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final /* synthetic */ class AssistantSessionManager$connectSupportAgentSession$config$11 extends j implements p {
    public AssistantSessionManager$connectSupportAgentSession$config$11(Object obj) {
        super(2, 0, AssistantSessionManager.class, obj, "onSdkAgentResponseCorrection", "onSdkAgentResponseCorrection(Ljava/lang/String;Ljava/lang/String;)V");
    }

    public final void invoke(String str, String str2) {
        str.getClass();
        str2.getClass();
        ((AssistantSessionManager) this.receiver).onSdkAgentResponseCorrection(str, str2);
    }

    @Override // ho.p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((String) obj, (String) obj2);
        return z.f31622a;
    }
}
