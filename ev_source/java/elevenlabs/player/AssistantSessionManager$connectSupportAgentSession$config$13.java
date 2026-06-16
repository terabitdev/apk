package io.elevenlabs.player;

import ho.q;
import ib.i;
import kotlin.Metadata;
import kotlin.jvm.internal.j;
import livekit.LivekitInternal$NodeStats;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final /* synthetic */ class AssistantSessionManager$connectSupportAgentSession$config$13 extends j implements q {
    public AssistantSessionManager$connectSupportAgentSession$config$13(Object obj) {
        super(3, 0, AssistantSessionManager.class, obj, "onSdkConversationInitiationMetadata", "onSdkConversationInitiationMetadata(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V");
    }

    @Override // ho.q
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((String) obj, (String) obj2, (String) obj3);
        return z.f31622a;
    }

    public final void invoke(String str, String str2, String str3) {
        i.s(str, str2, str3);
        ((AssistantSessionManager) this.receiver).onSdkConversationInitiationMetadata(str, str2, str3);
    }
}
