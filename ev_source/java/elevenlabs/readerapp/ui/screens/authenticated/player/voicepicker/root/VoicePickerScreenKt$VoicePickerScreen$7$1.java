package io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.root;

import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.shared.VoicePickerSharedContract;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final /* synthetic */ class VoicePickerScreenKt$VoicePickerScreen$7$1 extends kotlin.jvm.internal.j implements ho.l {
    public VoicePickerScreenKt$VoicePickerScreen$7$1(Object obj) {
        super(1, 0, VoicePickerViewModel.class, obj, "onSharedEvent", "onSharedEvent(Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedContract$Event;)V");
    }

    public final void invoke(VoicePickerSharedContract.Event event) {
        event.getClass();
        ((VoicePickerViewModel) this.receiver).onSharedEvent(event);
    }

    @Override // ho.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((VoicePickerSharedContract.Event) obj);
        return z.f31622a;
    }
}
