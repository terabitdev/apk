package io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.search;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import yn.e;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.search.VoicePickerSearchListViewModel", f = "VoicePickerSearchListViewModel.kt", l = {108}, m = "loadVoices", v = 2)
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class VoicePickerSearchListViewModel$loadVoices$1 extends yn.c {
    int I$0;
    Object L$0;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ VoicePickerSearchListViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoicePickerSearchListViewModel$loadVoices$1(VoicePickerSearchListViewModel voicePickerSearchListViewModel, wn.c<? super VoicePickerSearchListViewModel$loadVoices$1> cVar) {
        super(cVar);
        this.this$0 = voicePickerSearchListViewModel;
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        Object loadVoices;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        loadVoices = this.this$0.loadVoices(0, null, false, this);
        return loadVoices;
    }
}
