package io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.search;

import ho.l;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.search.VoicePickerSearchListContract;
import kotlin.Metadata;
import kotlin.jvm.internal.j;
import livekit.LivekitInternal$NodeStats;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final /* synthetic */ class VoicePickerSearchListScreenKt$VoicePickerSearchListScreen$1$1 extends j implements l {
    public VoicePickerSearchListScreenKt$VoicePickerSearchListScreen$1$1(Object obj) {
        super(1, 0, VoicePickerSearchListViewModel.class, obj, "onEvent", "onEvent(Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/search/VoicePickerSearchListContract$Event;)V");
    }

    public final void invoke(VoicePickerSearchListContract.Event event) {
        event.getClass();
        ((VoicePickerSearchListViewModel) this.receiver).onEvent(event);
    }

    @Override // ho.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((VoicePickerSearchListContract.Event) obj);
        return z.f31622a;
    }
}
