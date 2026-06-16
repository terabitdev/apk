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
public final class ComposableSingletons$PreviewVoiceFavoritesScreenErrorDefaultGroupPreviewVoiceFavoritesScreenErrorKt {
    public static final ComposableSingletons$PreviewVoiceFavoritesScreenErrorDefaultGroupPreviewVoiceFavoritesScreenErrorKt INSTANCE = new ComposableSingletons$PreviewVoiceFavoritesScreenErrorDefaultGroupPreviewVoiceFavoritesScreenErrorKt();

    /* renamed from: lambda$-2112101995 */
    private static p f482lambda$2112101995 = new j(new a(22), false, -2112101995);

    public static final z lambda__2112101995$lambda$0(m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            VoicePickerFavoritesScreenKt.Preview_VoiceFavoritesScreen_Error(qVar, 0);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    /* renamed from: getLambda$-2112101995$app_productionRelease */
    public final p m1569getLambda$2112101995$app_productionRelease() {
        return f482lambda$2112101995;
    }
}
