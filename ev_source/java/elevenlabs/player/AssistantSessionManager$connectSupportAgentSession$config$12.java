package io.elevenlabs.player;

import ho.r;
import ib.i;
import kotlin.Metadata;
import kotlin.jvm.internal.j;
import livekit.LivekitInternal$NodeStats;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final /* synthetic */ class AssistantSessionManager$connectSupportAgentSession$config$12 extends j implements r {
    public AssistantSessionManager$connectSupportAgentSession$config$12(Object obj) {
        super(4, 0, AssistantSessionManager.class, obj, "onSdkAgentToolResponse", "onSdkAgentToolResponse(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V");
    }

    @Override // ho.r
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        invoke((String) obj, (String) obj2, (String) obj3, ((Boolean) obj4).booleanValue());
        return z.f31622a;
    }

    public final void invoke(String str, String str2, String str3, boolean z6) {
        i.s(str, str2, str3);
        ((AssistantSessionManager) this.receiver).onSdkAgentToolResponse(str, str2, str3, z6);
    }
}
