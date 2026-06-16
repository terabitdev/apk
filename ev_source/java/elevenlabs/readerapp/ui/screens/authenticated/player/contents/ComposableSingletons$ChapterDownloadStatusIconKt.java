package io.elevenlabs.readerapp.ui.screens.authenticated.player.contents;

import c3.o;
import f4.f1;
import ho.p;
import i3.t;
import io.elevenlabs.domain.model.ChapterOfflineDownloadStatus;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;
import u2.m;
import u2.q;
import u2.r;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ComposableSingletons$ChapterDownloadStatusIconKt {
    public static final ComposableSingletons$ChapterDownloadStatusIconKt INSTANCE = new ComposableSingletons$ChapterDownloadStatusIconKt();

    /* renamed from: lambda$-1704353767 */
    private static p f422lambda$1704353767 = new c3.j(new e(0), false, -1704353767);
    private static p lambda$414108030 = new c3.j(new e(1), false, 414108030);
    private static p lambda$1418536190 = new c3.j(new e(2), false, 1418536190);

    public static final z lambda_1418536190$lambda$0(m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            f1 d10 = r1.p.d(i3.d.f12997a, false);
            int hashCode = Long.hashCode(qVar.T);
            o l4 = qVar.l();
            t c5 = i3.a.c(i3.q.f13017a, qVar);
            h4.h.f11920i.getClass();
            h4.f fVar = h4.g.f11903b;
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            r.J(h4.g.f11907f, d10, qVar);
            r.J(h4.g.f11906e, l4, qVar);
            r.y(qVar, Integer.valueOf(hashCode), h4.g.f11908g);
            r.F(h4.g.f11909h, qVar);
            r.J(h4.g.f11905d, c5, qVar);
            ChapterOfflineDownloadStatus.Downloading downloading = new ChapterOfflineDownloadStatus.Downloading(45);
            Object L = qVar.L();
            if (L == u2.l.f33918a) {
                L = new a(8);
                qVar.h0(L);
            }
            ChapterDownloadStatusIconKt.ChapterDownloadStatusIcon(downloading, (ho.a) L, qVar, 48);
            qVar.p(true);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z lambda_414108030$lambda$0(m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            f1 d10 = r1.p.d(i3.d.f12997a, false);
            int hashCode = Long.hashCode(qVar.T);
            o l4 = qVar.l();
            t c5 = i3.a.c(i3.q.f13017a, qVar);
            h4.h.f11920i.getClass();
            h4.f fVar = h4.g.f11903b;
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            r.J(h4.g.f11907f, d10, qVar);
            r.J(h4.g.f11906e, l4, qVar);
            r.y(qVar, Integer.valueOf(hashCode), h4.g.f11908g);
            r.F(h4.g.f11909h, qVar);
            r.J(h4.g.f11905d, c5, qVar);
            ChapterOfflineDownloadStatus.NotDownloaded notDownloaded = ChapterOfflineDownloadStatus.NotDownloaded.INSTANCE;
            Object L = qVar.L();
            if (L == u2.l.f33918a) {
                L = new a(9);
                qVar.h0(L);
            }
            ChapterDownloadStatusIconKt.ChapterDownloadStatusIcon(notDownloaded, (ho.a) L, qVar, 48);
            qVar.p(true);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z lambda__1704353767$lambda$0(m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            f1 d10 = r1.p.d(i3.d.f12997a, false);
            int hashCode = Long.hashCode(qVar.T);
            o l4 = qVar.l();
            t c5 = i3.a.c(i3.q.f13017a, qVar);
            h4.h.f11920i.getClass();
            h4.f fVar = h4.g.f11903b;
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            r.J(h4.g.f11907f, d10, qVar);
            r.J(h4.g.f11906e, l4, qVar);
            r.y(qVar, Integer.valueOf(hashCode), h4.g.f11908g);
            r.F(h4.g.f11909h, qVar);
            r.J(h4.g.f11905d, c5, qVar);
            ChapterOfflineDownloadStatus.Downloaded downloaded = ChapterOfflineDownloadStatus.Downloaded.INSTANCE;
            Object L = qVar.L();
            if (L == u2.l.f33918a) {
                L = new a(10);
                qVar.h0(L);
            }
            ChapterDownloadStatusIconKt.ChapterDownloadStatusIcon(downloaded, (ho.a) L, qVar, 48);
            qVar.p(true);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    /* renamed from: getLambda$-1704353767$app_productionRelease */
    public final p m1484getLambda$1704353767$app_productionRelease() {
        return f422lambda$1704353767;
    }

    public final p getLambda$1418536190$app_productionRelease() {
        return lambda$1418536190;
    }

    public final p getLambda$414108030$app_productionRelease() {
        return lambda$414108030;
    }
}
