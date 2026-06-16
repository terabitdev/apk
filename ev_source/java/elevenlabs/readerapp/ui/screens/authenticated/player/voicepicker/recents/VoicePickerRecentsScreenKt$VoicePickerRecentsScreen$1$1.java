package io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.recents;

import kotlin.Metadata;
import kotlin.jvm.internal.j;
import livekit.LivekitInternal$NodeStats;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final /* synthetic */ class VoicePickerRecentsScreenKt$VoicePickerRecentsScreen$1$1 extends j implements ho.a {
    public VoicePickerRecentsScreenKt$VoicePickerRecentsScreen$1$1(Object obj) {
        super(0, 0, VoicePickerRecentsViewModel.class, obj, "onRetry", "onRetry()V");
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m1587invoke() {
        ((VoicePickerRecentsViewModel) this.receiver).onRetry();
    }

    @Override // ho.a
    public /* bridge */ /* synthetic */ Object invoke() {
        m1587invoke();
        return z.f31622a;
    }
}
