package io.elevenlabs.readerapp.ui.screens.authenticated.assistant;

import io.elevenlabs.readerapp.ui.screens.authenticated.assistant.AssistantContract;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final /* synthetic */ class AskAssistantSheetKt$AskAssistantSheet$6$1 extends kotlin.jvm.internal.j implements ho.l {
    public AskAssistantSheetKt$AskAssistantSheet$6$1(Object obj) {
        super(1, 0, AskAssistantViewModel.class, obj, "onEvent", "onEvent(Lio/elevenlabs/readerapp/ui/screens/authenticated/assistant/AssistantContract$Event;)V");
    }

    public final void invoke(AssistantContract.Event event) {
        event.getClass();
        ((AskAssistantViewModel) this.receiver).onEvent(event);
    }

    @Override // ho.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((AssistantContract.Event) obj);
        return sn.z.f31622a;
    }
}
