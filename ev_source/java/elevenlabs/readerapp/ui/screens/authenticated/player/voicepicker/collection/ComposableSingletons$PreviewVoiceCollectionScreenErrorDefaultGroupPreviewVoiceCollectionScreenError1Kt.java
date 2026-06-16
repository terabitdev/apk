package io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.collection;

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
public final class ComposableSingletons$PreviewVoiceCollectionScreenErrorDefaultGroupPreviewVoiceCollectionScreenError1Kt {
    public static final ComposableSingletons$PreviewVoiceCollectionScreenErrorDefaultGroupPreviewVoiceCollectionScreenError1Kt INSTANCE = new ComposableSingletons$PreviewVoiceCollectionScreenErrorDefaultGroupPreviewVoiceCollectionScreenError1Kt();

    /* renamed from: lambda$-1112754114 */
    private static p f464lambda$1112754114 = new j(new a(2), false, -1112754114);

    public static final z lambda__1112754114$lambda$0(m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            VoicePickerCollectionScreenKt.Preview_VoiceCollectionScreen_Error(qVar, 0);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    /* renamed from: getLambda$-1112754114$app_productionRelease */
    public final p m1544getLambda$1112754114$app_productionRelease() {
        return f464lambda$1112754114;
    }
}
