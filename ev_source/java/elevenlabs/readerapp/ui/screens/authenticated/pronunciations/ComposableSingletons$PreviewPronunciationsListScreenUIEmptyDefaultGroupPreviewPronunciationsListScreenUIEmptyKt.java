package io.elevenlabs.readerapp.ui.screens.authenticated.pronunciations;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ComposableSingletons$PreviewPronunciationsListScreenUIEmptyDefaultGroupPreviewPronunciationsListScreenUIEmptyKt {
    public static final ComposableSingletons$PreviewPronunciationsListScreenUIEmptyDefaultGroupPreviewPronunciationsListScreenUIEmptyKt INSTANCE = new ComposableSingletons$PreviewPronunciationsListScreenUIEmptyDefaultGroupPreviewPronunciationsListScreenUIEmptyKt();

    /* renamed from: lambda$-1794901365 */
    private static ho.p f523lambda$1794901365 = new c3.j(new a(4), false, -1794901365);

    public static final z lambda__1794901365$lambda$0(u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            PronunciationsListScreenKt.Preview_PronunciationsListScreenUI_Empty(qVar, 0);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    /* renamed from: getLambda$-1794901365$app_productionRelease */
    public final ho.p m1624getLambda$1794901365$app_productionRelease() {
        return f523lambda$1794901365;
    }
}
