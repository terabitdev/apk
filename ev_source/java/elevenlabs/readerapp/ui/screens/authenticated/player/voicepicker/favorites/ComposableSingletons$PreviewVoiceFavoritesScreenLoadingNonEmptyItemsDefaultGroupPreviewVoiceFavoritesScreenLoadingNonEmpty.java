package io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.favorites;

import c3.j;
import ho.p;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.mini.a;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;
import u2.m;
import u2.q;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ComposableSingletons$PreviewVoiceFavoritesScreenLoadingNonEmptyItemsDefaultGroupPreviewVoiceFavoritesScreenLoadingNonEmptyItems1Kt {
    public static final ComposableSingletons$PreviewVoiceFavoritesScreenLoadingNonEmptyItemsDefaultGroupPreviewVoiceFavoritesScreenLoadingNonEmptyItems1Kt INSTANCE = new ComposableSingletons$PreviewVoiceFavoritesScreenLoadingNonEmptyItemsDefaultGroupPreviewVoiceFavoritesScreenLoadingNonEmptyItems1Kt();

    /* renamed from: lambda$-377804277 */
    private static p f485lambda$377804277 = new j(new a(27), false, -377804277);

    public static final z lambda__377804277$lambda$0(m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            VoicePickerFavoritesScreenKt.Preview_VoiceFavoritesScreen_Loading_NonEmptyItems(qVar, 0);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    /* renamed from: getLambda$-377804277$app_productionRelease */
    public final p m1572getLambda$377804277$app_productionRelease() {
        return f485lambda$377804277;
    }
}
