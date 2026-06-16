package io.elevenlabs.readerapp.ui.screens.authenticated.player.contents;

import android.gov.nist.core.Separators;
import c3.o;
import f4.f1;
import i3.t;
import io.elevenlabs.domain.model.ChapterOfflineDownloadStatus;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.j1;
import io.elevenlabs.ui.R;
import io.elevenlabs.ui.components.LoaderKt;
import io.elevenlabs.ui.echo.EchoTheme;
import io.elevenlabs.ui.echo.EchoThemeColors;
import io.elevenlabs.ui.echo.EchoThemeShapes;
import io.elevenlabs.ui.echo.EchoThemeTypography;
import kotlin.Metadata;
import l1.n;
import livekit.LivekitInternal$NodeStats;
import q2.e5;
import q2.j7;
import q2.y2;
import r1.i2;
import r1.k2;
import r1.p;
import r1.p2;
import r1.u0;
import sn.z;
import t2.u;
import u2.m;
import u2.q;
import u2.r;
import u2.r1;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001a'\u0010\u0005\u001a\u00020\u00032\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u000f\u0010\u0007\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a\u000f\u0010\t\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\t\u0010\b\u001a\u000f\u0010\n\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\n\u0010\b¨\u0006\u000b"}, d2 = {"Lio/elevenlabs/domain/model/ChapterOfflineDownloadStatus;", "indicator", "Lkotlin/Function0;", "Lsn/z;", "onDownloadClick", "ChapterDownloadStatusIcon", "(Lio/elevenlabs/domain/model/ChapterOfflineDownloadStatus;Lho/a;Lu2/m;I)V", "Preview_ChapterDownloadStatusIcon", "(Lu2/m;I)V", "Preview_ChapterDownloadStatusIcon_NotDownloaded", "Preview_ChapterDownloadStatusIcon_Downloading", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ChapterDownloadStatusIconKt {
    public static final void ChapterDownloadStatusIcon(ChapterOfflineDownloadStatus chapterOfflineDownloadStatus, ho.a aVar, m mVar, int i10) {
        int i11;
        boolean z6;
        int i12;
        int i13;
        int i14;
        aVar.getClass();
        q qVar = (q) mVar;
        qVar.Z(-303393788);
        if ((i10 & 6) == 0) {
            if (qVar.h(chapterOfflineDownloadStatus)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i11 = i14 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.h(aVar)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i11 |= i13;
        }
        if ((i11 & 19) != 18) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i11 & 1, z6)) {
            boolean z10 = chapterOfflineDownloadStatus instanceof ChapterOfflineDownloadStatus.Downloaded;
            i3.q qVar2 = i3.q.f13017a;
            if (z10) {
                qVar.X(-1792949339);
                y2.a(kd.a.M(R.drawable.check_circle_filled, qVar, 0), null, p2.o(qVar2, 20), EchoTheme.INSTANCE.getColors(qVar, EchoTheme.$stable).getIcon().getPrimary(qVar, EchoThemeColors.Icon.$stable), qVar, u3.c.$stable | 432, 0);
                qVar.p(false);
            } else if (chapterOfflineDownloadStatus instanceof ChapterOfflineDownloadStatus.NotDownloaded) {
                qVar.X(-1792593242);
                t o6 = p2.o(qVar2, 44);
                EchoTheme echoTheme = EchoTheme.INSTANCE;
                int i15 = EchoTheme.$stable;
                t c5 = m3.h.c(o6, echoTheme.getShapes(qVar, i15).getFull(qVar, EchoThemeShapes.$stable));
                Object L = qVar.L();
                if (L == u2.l.f33918a) {
                    L = j0.c.o(qVar);
                }
                EchoThemeColors.Icon icon = echoTheme.getColors(qVar, i15).getIcon();
                int i16 = EchoThemeColors.Icon.$stable;
                t n2 = n.n(c5, (p1.l) L, e5.b(u.P, 3, icon.getQuaternary(qVar, i16), false), false, new p4.k(0), aVar, 12);
                f1 d10 = p.d(i3.d.f13002f, false);
                int hashCode = Long.hashCode(qVar.T);
                o l4 = qVar.l();
                t c10 = i3.a.c(n2, qVar);
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
                r.J(h4.g.f11905d, c10, qVar);
                y2.a(kd.a.M(R.drawable.download_circle, qVar, 0), kj.c.R(qVar, io.elevenlabs.readerapp.R.string.menu_action_download), p2.o(qVar2, 20), echoTheme.getColors(qVar, i15).getIcon().getQuaternary(qVar, i16), qVar, u3.c.$stable | 384, 0);
                qVar.p(true);
                qVar.p(false);
            } else if (chapterOfflineDownloadStatus instanceof ChapterOfflineDownloadStatus.Downloading) {
                qVar.X(-1791644673);
                i3.k kVar = i3.d.f13005z0;
                u0 u0Var = r1.j.f29228a;
                EchoTheme echoTheme2 = EchoTheme.INSTANCE;
                int i17 = EchoTheme.$stable;
                k2 a10 = i2.a(r1.j.g(echoTheme2.getSpacings(qVar, i17).getX1()), kVar, qVar, 48);
                int hashCode2 = Long.hashCode(qVar.T);
                o l7 = qVar.l();
                t c11 = i3.a.c(qVar2, qVar);
                h4.h.f11920i.getClass();
                h4.f fVar2 = h4.g.f11903b;
                qVar.b0();
                if (qVar.S) {
                    qVar.k(fVar2);
                } else {
                    qVar.k0();
                }
                r.J(h4.g.f11907f, a10, qVar);
                r.J(h4.g.f11906e, l7, qVar);
                r.y(qVar, Integer.valueOf(hashCode2), h4.g.f11908g);
                r.F(h4.g.f11909h, qVar);
                r.J(h4.g.f11905d, c11, qVar);
                ChapterOfflineDownloadStatus.Downloading downloading = (ChapterOfflineDownloadStatus.Downloading) chapterOfflineDownloadStatus;
                if (downloading.getProgressPercent() > 0) {
                    qVar.X(1244882274);
                    i12 = 20;
                    j7.d(downloading.getProgressPercent() + Separators.PERCENT, null, echoTheme2.getColors(qVar, i17).getText().getQuaternary(qVar, EchoThemeColors.Text.$stable), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, echoTheme2.getTypography(qVar, i17).getSmRegular400(qVar, EchoThemeTypography.$stable), qVar, 0, 0, 131066);
                    qVar = qVar;
                    qVar.p(false);
                } else {
                    i12 = 20;
                    qVar.X(1245115394);
                    qVar.p(false);
                }
                t o10 = p2.o(qVar2, i12);
                long quaternary = echoTheme2.getColors(qVar, i17).getIcon().getQuaternary(qVar, EchoThemeColors.Icon.$stable);
                long quaternary2 = echoTheme2.getColors(qVar, i17).getFill().getQuaternary(qVar, EchoThemeColors.Fill.$stable);
                int progressPercent = downloading.getProgressPercent();
                Integer valueOf = Integer.valueOf(progressPercent);
                if (progressPercent <= 0) {
                    valueOf = null;
                }
                q qVar3 = qVar;
                LoaderKt.m1840LoadereopBjH0(o10, quaternary, quaternary2, valueOf, qVar3, 6, 0);
                qVar = qVar3;
                qVar.p(true);
                qVar.p(false);
            } else if (chapterOfflineDownloadStatus == null) {
                qVar.X(-1790848996);
                qVar.p(false);
            } else {
                throw com.google.android.gms.internal.play_billing.b.h(496351843, qVar, false);
            }
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new a2.i(chapterOfflineDownloadStatus, aVar, i10, 15);
        }
    }

    public static final z ChapterDownloadStatusIcon$lambda$3(ChapterOfflineDownloadStatus chapterOfflineDownloadStatus, ho.a aVar, int i10, m mVar, int i11) {
        ChapterDownloadStatusIcon(chapterOfflineDownloadStatus, aVar, mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_ChapterDownloadStatusIcon(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(-990476481);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, ComposableSingletons$ChapterDownloadStatusIconKt.INSTANCE.m1484getLambda$1704353767$app_productionRelease(), qVar, (EchoTheme.$stable << 6) | 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new j1(i10, 4);
        }
    }

    public static final z Preview_ChapterDownloadStatusIcon$lambda$0(int i10, m mVar, int i11) {
        Preview_ChapterDownloadStatusIcon(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_ChapterDownloadStatusIcon_Downloading(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(-1351974108);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, ComposableSingletons$ChapterDownloadStatusIconKt.INSTANCE.getLambda$1418536190$app_productionRelease(), qVar, (EchoTheme.$stable << 6) | 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new j1(i10, 3);
        }
    }

    public static final z Preview_ChapterDownloadStatusIcon_Downloading$lambda$0(int i10, m mVar, int i11) {
        Preview_ChapterDownloadStatusIcon_Downloading(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_ChapterDownloadStatusIcon_NotDownloaded(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(833435172);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, ComposableSingletons$ChapterDownloadStatusIconKt.INSTANCE.getLambda$414108030$app_productionRelease(), qVar, (EchoTheme.$stable << 6) | 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new j1(i10, 2);
        }
    }

    public static final z Preview_ChapterDownloadStatusIcon_NotDownloaded$lambda$0(int i10, m mVar, int i11) {
        Preview_ChapterDownloadStatusIcon_NotDownloaded(mVar, r.M(i10 | 1));
        return z.f31622a;
    }
}
