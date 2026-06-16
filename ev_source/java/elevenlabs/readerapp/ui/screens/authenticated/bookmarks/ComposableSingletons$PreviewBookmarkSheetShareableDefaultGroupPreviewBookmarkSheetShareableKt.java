package io.elevenlabs.readerapp.ui.screens.authenticated.bookmarks;

import ho.p;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;
import u2.q;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ComposableSingletons$PreviewBookmarkSheetShareableDefaultGroupPreviewBookmarkSheetShareableKt {
    public static final ComposableSingletons$PreviewBookmarkSheetShareableDefaultGroupPreviewBookmarkSheetShareableKt INSTANCE = new ComposableSingletons$PreviewBookmarkSheetShareableDefaultGroupPreviewBookmarkSheetShareableKt();

    /* renamed from: lambda$-993266844 */
    private static p f285lambda$993266844 = new c3.j(new m(4), false, -993266844);

    public static final z lambda__993266844$lambda$0(u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            BookmarkSheetKt.Preview_BookmarkSheetShareable(qVar, 0);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    /* renamed from: getLambda$-993266844$app_productionRelease */
    public final p m1322getLambda$993266844$app_productionRelease() {
        return f285lambda$993266844;
    }
}
