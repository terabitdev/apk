package io.elevenlabs.readerapp.ui.screens.authenticated.player.contents;

import ho.p;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;
import u2.m;
import u2.q;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ComposableSingletons$PreviewChapterDownloadStatusIconNotDownloadedDefaultGroupPreviewChapterDownloadStatusIconNotDownloadedKt {
    public static final ComposableSingletons$PreviewChapterDownloadStatusIconNotDownloadedDefaultGroupPreviewChapterDownloadStatusIconNotDownloadedKt INSTANCE = new ComposableSingletons$PreviewChapterDownloadStatusIconNotDownloadedDefaultGroupPreviewChapterDownloadStatusIconNotDownloadedKt();

    /* renamed from: lambda$-1821581798 */
    private static p f424lambda$1821581798 = new c3.j(new e(6), false, -1821581798);

    public static final z lambda__1821581798$lambda$0(m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            ChapterDownloadStatusIconKt.Preview_ChapterDownloadStatusIcon_NotDownloaded(qVar, 0);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    /* renamed from: getLambda$-1821581798$app_productionRelease */
    public final p m1486getLambda$1821581798$app_productionRelease() {
        return f424lambda$1821581798;
    }
}
