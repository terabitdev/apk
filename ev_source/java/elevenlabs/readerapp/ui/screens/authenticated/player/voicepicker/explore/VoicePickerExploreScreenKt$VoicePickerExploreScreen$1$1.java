package io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.explore;

import ho.l;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.explore.VoicePickerExploreContract;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final /* synthetic */ class VoicePickerExploreScreenKt$VoicePickerExploreScreen$1$1 extends kotlin.jvm.internal.j implements l {
    public VoicePickerExploreScreenKt$VoicePickerExploreScreen$1$1(Object obj) {
        super(1, 0, VoicePickerExploreViewModel.class, obj, "onEvent", "onEvent(Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/explore/VoicePickerExploreContract$Event;)V");
    }

    public final void invoke(VoicePickerExploreContract.Event event) {
        event.getClass();
        ((VoicePickerExploreViewModel) this.receiver).onEvent(event);
    }

    @Override // ho.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((VoicePickerExploreContract.Event) obj);
        return z.f31622a;
    }
}
