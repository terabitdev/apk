package io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.shared;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.shared.VoicePickerSharedRepository", f = "VoicePickerSharedRepository.kt", l = {429}, m = "resolvePreviewUrl", v = 2)
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class VoicePickerSharedRepository$resolvePreviewUrl$1 extends yn.c {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ VoicePickerSharedRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoicePickerSharedRepository$resolvePreviewUrl$1(VoicePickerSharedRepository voicePickerSharedRepository, wn.c<? super VoicePickerSharedRepository$resolvePreviewUrl$1> cVar) {
        super(cVar);
        this.this$0 = voicePickerSharedRepository;
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        Object resolvePreviewUrl;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        resolvePreviewUrl = this.this$0.resolvePreviewUrl(null, this);
        return resolvePreviewUrl;
    }
}
