package io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.shared;

import ho.q;
import io.elevenlabs.domain.model.ReadMeta;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.k;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final /* synthetic */ class VoicePickerSharedRepository$observeInitData$3 extends kotlin.jvm.internal.a implements q {
    public static final VoicePickerSharedRepository$observeInitData$3 INSTANCE = new VoicePickerSharedRepository$observeInitData$3();

    public VoicePickerSharedRepository$observeInitData$3() {
        super(3, k.class, "<init>", "<init>(Ljava/lang/Object;Ljava/lang/Object;)V", 4);
    }

    @Override // ho.q
    public final Object invoke(ReadMeta readMeta, String str, wn.c<? super k> cVar) {
        Object observeInitData$lambda$0;
        observeInitData$lambda$0 = VoicePickerSharedRepository.observeInitData$lambda$0(readMeta, str, cVar);
        return observeInitData$lambda$0;
    }
}
