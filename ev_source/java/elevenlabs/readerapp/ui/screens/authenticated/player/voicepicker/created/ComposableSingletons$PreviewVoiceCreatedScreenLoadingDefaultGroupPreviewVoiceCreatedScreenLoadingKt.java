package io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.created;

import c3.j;
import ho.p;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;
import u2.m;
import u2.q;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ComposableSingletons$PreviewVoiceCreatedScreenLoadingDefaultGroupPreviewVoiceCreatedScreenLoadingKt {
    public static final ComposableSingletons$PreviewVoiceCreatedScreenLoadingDefaultGroupPreviewVoiceCreatedScreenLoadingKt INSTANCE = new ComposableSingletons$PreviewVoiceCreatedScreenLoadingDefaultGroupPreviewVoiceCreatedScreenLoadingKt();

    /* renamed from: lambda$-1145156264 */
    private static p f471lambda$1145156264 = new j(new io.elevenlabs.readerapp.ui.screens.authenticated.player.mini.a(16), false, -1145156264);

    public static final z lambda__1145156264$lambda$0(m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            VoicePickerCreatedScreenKt.Preview_VoiceCreatedScreen_Loading(qVar, 0);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    /* renamed from: getLambda$-1145156264$app_productionRelease */
    public final p m1551getLambda$1145156264$app_productionRelease() {
        return f471lambda$1145156264;
    }
}
