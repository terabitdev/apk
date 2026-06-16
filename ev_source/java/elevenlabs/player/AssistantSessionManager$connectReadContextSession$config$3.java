package io.elevenlabs.player;

import ho.l;
import io.elevenlabs.models.ConversationMode;
import kotlin.Metadata;
import kotlin.jvm.internal.j;
import livekit.LivekitInternal$NodeStats;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final /* synthetic */ class AssistantSessionManager$connectReadContextSession$config$3 extends j implements l {
    public AssistantSessionManager$connectReadContextSession$config$3(Object obj) {
        super(1, 0, AssistantSessionManager.class, obj, "onSdkModeChange", "onSdkModeChange(Lio/elevenlabs/models/ConversationMode;)V");
    }

    public final void invoke(ConversationMode conversationMode) {
        conversationMode.getClass();
        ((AssistantSessionManager) this.receiver).onSdkModeChange(conversationMode);
    }

    @Override // ho.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((ConversationMode) obj);
        return z.f31622a;
    }
}
