package io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.root;

import ho.p;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;
import u2.q;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ComposableSingletons$PreviewVoicePickerHeaderVoicePickerSearchDefaultGroupPreviewVoicePickerHeaderVoicePickerSearch1Kt {
    public static final ComposableSingletons$PreviewVoicePickerHeaderVoicePickerSearchDefaultGroupPreviewVoicePickerHeaderVoicePickerSearch1Kt INSTANCE = new ComposableSingletons$PreviewVoicePickerHeaderVoicePickerSearchDefaultGroupPreviewVoicePickerHeaderVoicePickerSearch1Kt();
    private static p lambda$748726210 = new c3.j(new a(8), false, 748726210);

    public static final z lambda_748726210$lambda$0(u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            VoicePickerHeaderKt.Preview_VoicePickerHeader_VoicePicker_Search(qVar, 0);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public final p getLambda$748726210$app_productionRelease() {
        return lambda$748726210;
    }
}
