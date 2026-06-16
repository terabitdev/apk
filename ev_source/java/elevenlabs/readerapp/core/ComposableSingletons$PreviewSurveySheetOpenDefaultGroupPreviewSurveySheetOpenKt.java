package io.elevenlabs.readerapp.core;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;
import u2.q;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class ComposableSingletons$PreviewSurveySheetOpenDefaultGroupPreviewSurveySheetOpenKt {
    public static final ComposableSingletons$PreviewSurveySheetOpenDefaultGroupPreviewSurveySheetOpenKt INSTANCE = new ComposableSingletons$PreviewSurveySheetOpenDefaultGroupPreviewSurveySheetOpenKt();

    /* renamed from: lambda$-1938087038 */
    private static ho.p f50lambda$1938087038 = new c3.j(new a(1), false, -1938087038);

    public static final z lambda__1938087038$lambda$0(u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            SurveySheetKt.Preview_SurveySheet_Open(qVar, 0);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    /* renamed from: getLambda$-1938087038$app_productionRelease */
    public final ho.p m1011getLambda$1938087038$app_productionRelease() {
        return f50lambda$1938087038;
    }
}
