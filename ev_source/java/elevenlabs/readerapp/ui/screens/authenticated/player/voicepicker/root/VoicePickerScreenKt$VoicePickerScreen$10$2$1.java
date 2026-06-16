package io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.root;

import io.elevenlabs.ui.components.scaffolds.BottomSheetControl;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final /* synthetic */ class VoicePickerScreenKt$VoicePickerScreen$10$2$1 extends kotlin.jvm.internal.j implements ho.a {
    public VoicePickerScreenKt$VoicePickerScreen$10$2$1(Object obj) {
        super(0, 0, BottomSheetControl.class, obj, "close", "close()V");
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m1606invoke() {
        ((BottomSheetControl) this.receiver).close();
    }

    @Override // ho.a
    public /* bridge */ /* synthetic */ Object invoke() {
        m1606invoke();
        return z.f31622a;
    }
}
