package io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.recents;

import ho.q;
import io.elevenlabs.domain.model.RecentVoice;
import io.elevenlabs.domain.model.Voice;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.k;
import wn.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final /* synthetic */ class VoicePickerRecentsViewModel$observeVoices$4 extends kotlin.jvm.internal.a implements q {
    public static final VoicePickerRecentsViewModel$observeVoices$4 INSTANCE = new VoicePickerRecentsViewModel$observeVoices$4();

    public VoicePickerRecentsViewModel$observeVoices$4() {
        super(3, k.class, "<init>", "<init>(Ljava/lang/Object;Ljava/lang/Object;)V", 4);
    }

    @Override // ho.q
    public final Object invoke(List<Voice> list, List<RecentVoice> list2, c<? super k> cVar) {
        Object observeVoices$lambda$1;
        observeVoices$lambda$1 = VoicePickerRecentsViewModel.observeVoices$lambda$1(list, list2, cVar);
        return observeVoices$lambda$1;
    }
}
