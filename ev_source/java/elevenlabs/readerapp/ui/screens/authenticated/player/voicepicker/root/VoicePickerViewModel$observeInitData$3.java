package io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.root;

import ho.q;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.shared.VoicePickerSharedContract;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final /* synthetic */ class VoicePickerViewModel$observeInitData$3 extends kotlin.jvm.internal.a implements q {
    public static final VoicePickerViewModel$observeInitData$3 INSTANCE = new VoicePickerViewModel$observeInitData$3();

    public VoicePickerViewModel$observeInitData$3() {
        super(3, sn.k.class, "<init>", "<init>(Ljava/lang/Object;Ljava/lang/Object;)V", 4);
    }

    @Override // ho.q
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke(((Boolean) obj).booleanValue(), (VoicePickerSharedContract.State) obj2, (wn.c<? super sn.k>) obj3);
    }

    public final Object invoke(boolean z6, VoicePickerSharedContract.State state, wn.c<? super sn.k> cVar) {
        Object observeInitData$lambda$0;
        observeInitData$lambda$0 = VoicePickerViewModel.observeInitData$lambda$0(z6, state, cVar);
        return observeInitData$lambda$0;
    }
}
