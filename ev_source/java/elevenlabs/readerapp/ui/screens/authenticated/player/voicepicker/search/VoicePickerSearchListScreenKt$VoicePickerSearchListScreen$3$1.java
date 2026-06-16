package io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.search;

import ho.l;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.shared.VoicePickerSharedContract;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final /* synthetic */ class VoicePickerSearchListScreenKt$VoicePickerSearchListScreen$3$1 extends kotlin.jvm.internal.a implements l {
    public VoicePickerSearchListScreenKt$VoicePickerSearchListScreen$3$1(Object obj) {
        super(1, 8, VoicePickerSearchListViewModel.class, obj, "onNavigationEvent", "onNavigationEvent-JP2dKIU(Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedContract$NavigationEvent;)Ljava/lang/Object;");
    }

    public final void invoke(VoicePickerSharedContract.NavigationEvent navigationEvent) {
        navigationEvent.getClass();
        ((VoicePickerSearchListViewModel) this.receiver).m1611onNavigationEventJP2dKIU(navigationEvent);
    }

    @Override // ho.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((VoicePickerSharedContract.NavigationEvent) obj);
        return z.f31622a;
    }
}
