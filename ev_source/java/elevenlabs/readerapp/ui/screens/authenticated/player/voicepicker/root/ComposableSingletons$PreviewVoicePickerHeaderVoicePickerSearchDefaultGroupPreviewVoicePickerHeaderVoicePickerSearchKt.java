package io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.root;

import ho.p;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;
import u2.q;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ComposableSingletons$PreviewVoicePickerHeaderVoicePickerSearchDefaultGroupPreviewVoicePickerHeaderVoicePickerSearchKt {
    public static final ComposableSingletons$PreviewVoicePickerHeaderVoicePickerSearchDefaultGroupPreviewVoicePickerHeaderVoicePickerSearchKt INSTANCE = new ComposableSingletons$PreviewVoicePickerHeaderVoicePickerSearchDefaultGroupPreviewVoicePickerHeaderVoicePickerSearchKt();

    /* renamed from: lambda$-251769436 */
    private static p f497lambda$251769436 = new c3.j(new a(9), false, -251769436);

    public static final z lambda__251769436$lambda$0(u2.m mVar, int i10) {
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

    /* renamed from: getLambda$-251769436$app_productionRelease */
    public final p m1592getLambda$251769436$app_productionRelease() {
        return f497lambda$251769436;
    }
}
