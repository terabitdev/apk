package io.elevenlabs.readerapp.ui.screens.authenticated.reads.composables;

import c3.o;
import com.google.firebase.analytics.FirebaseAnalytics;
import e5.k;
import h4.f;
import h4.g;
import h4.h;
import i3.a;
import i3.d;
import i3.t;
import ib.i;
import io.elevenlabs.domain.model.DetailsItem;
import io.elevenlabs.readerapp.R;
import io.elevenlabs.readerapp.ui.screens.authenticated.series.e;
import io.elevenlabs.ui.echo.EchoTheme;
import io.elevenlabs.ui.echo.EchoThemeColors;
import io.elevenlabs.ui.echo.EchoThemeTypography;
import io.livekit.android.rpc.RpcError;
import java.util.List;
import kj.c;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import q2.j7;
import r1.i2;
import r1.j;
import r1.k2;
import r1.p2;
import r1.u0;
import r1.w;
import r1.x;
import s4.y0;
import sn.z;
import t2.u;
import u2.m;
import u2.q;
import u2.r;
import u2.r1;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000 \n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u001a'\u0010\u0006\u001a\u00020\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a)\u0010\u000b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\u000b\u0010\f\u001a\u000f\u0010\r\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"", "Lio/elevenlabs/domain/model/DetailsItem;", FirebaseAnalytics.Param.ITEMS, "Li3/t;", "modifier", "Lsn/z;", "DetailsSection", "(Ljava/util/List;Li3/t;Lu2/m;II)V", "", "title", "value", "DetailItem", "(Ljava/lang/String;Ljava/lang/String;Li3/t;Lu2/m;II)V", "Preview_DetailsSection", "(Lu2/m;I)V", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class DetailsSectionKt {
    /* JADX WARN: Removed duplicated region for block: B:19:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void DetailItem(String str, String str2, t tVar, m mVar, int i10, int i11) {
        String str3;
        int i12;
        t tVar2;
        int i13;
        boolean z6;
        q qVar;
        t tVar3;
        r1 r10;
        t tVar4;
        int i14;
        int i15;
        q qVar2 = (q) mVar;
        qVar2.Z(-682815138);
        if ((i10 & 6) == 0) {
            str3 = str;
            if (qVar2.f(str3)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i12 = i15 | i10;
        } else {
            str3 = str;
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar2.f(str2)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
        }
        int i16 = i11 & 4;
        if (i16 != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            tVar2 = tVar;
            if (qVar2.f(tVar2)) {
                i13 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i13 = 128;
            }
            i12 |= i13;
            if ((i12 & 147) == 146) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (!qVar2.O(i12 & 1, z6)) {
                i3.q qVar3 = i3.q.f13017a;
                if (i16 != 0) {
                    tVar4 = qVar3;
                } else {
                    tVar4 = tVar2;
                }
                t e10 = p2.e(tVar4, 1.0f);
                k2 a10 = i2.a(j.f29234g, d.f13004y0, qVar2, 6);
                int hashCode = Long.hashCode(qVar2.T);
                o l4 = qVar2.l();
                t c5 = a.c(e10, qVar2);
                h.f11920i.getClass();
                f fVar = g.f11903b;
                qVar2.b0();
                if (qVar2.S) {
                    qVar2.k(fVar);
                } else {
                    qVar2.k0();
                }
                r.J(g.f11907f, a10, qVar2);
                r.J(g.f11906e, l4, qVar2);
                r.y(qVar2, Integer.valueOf(hashCode), g.f11908g);
                r.F(g.f11909h, qVar2);
                r.J(g.f11905d, c5, qVar2);
                t I = r1.d.I(qVar3, u.P, u.P, 16, u.P, 11);
                EchoTheme echoTheme = EchoTheme.INSTANCE;
                int i17 = EchoTheme.$stable;
                EchoThemeTypography typography = echoTheme.getTypography(qVar2, i17);
                int i18 = EchoThemeTypography.$stable;
                y0 baseRegular500 = typography.getBaseRegular500(qVar2, i18);
                EchoThemeColors.Text text = echoTheme.getColors(qVar2, i17).getText();
                int i19 = EchoThemeColors.Text.$stable;
                j7.d(str3, I, text.getTertiary(qVar2, i19), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, baseRegular500, qVar2, (i12 & 14) | 48, 0, 131064);
                j7.d(str2, null, i.v(i17, i19, echoTheme, qVar2, qVar2), 0L, null, 0L, new k(6), 0L, 0, false, 0, 0, null, echoTheme.getTypography(qVar2, i17).getBaseRegular500(qVar2, i18), qVar2, (i12 >> 3) & 14, 0, 130042);
                qVar = qVar2;
                qVar.p(true);
                tVar3 = tVar4;
            } else {
                qVar = qVar2;
                qVar.R();
                tVar3 = tVar2;
            }
            r10 = qVar.r();
            if (r10 == null) {
                r10.f34012d = new io.elevenlabs.ui.components.r1(str, str2, tVar3, i10, i11, 3);
                return;
            }
            return;
        }
        tVar2 = tVar;
        if ((i12 & 147) == 146) {
        }
        if (!qVar2.O(i12 & 1, z6)) {
        }
        r10 = qVar.r();
        if (r10 == null) {
        }
    }

    public static final z DetailItem$lambda$1(String str, String str2, t tVar, int i10, int i11, m mVar, int i12) {
        DetailItem(str, str2, tVar, mVar, r.M(i10 | 1), i11);
        return z.f31622a;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DetailsSection(List<DetailsItem> list, t tVar, m mVar, int i10, int i11) {
        int i12;
        t tVar2;
        int i13;
        boolean z6;
        t tVar3;
        r1 r10;
        t tVar4;
        int i14;
        list.getClass();
        q qVar = (q) mVar;
        qVar.Z(-1365373347);
        if ((i10 & 6) == 0) {
            if (qVar.h(list)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i12 = i10 | i14;
        } else {
            i12 = i10;
        }
        int i15 = i11 & 2;
        if (i15 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            tVar2 = tVar;
            if (qVar.f(tVar2)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i12 |= i13;
            if ((i12 & 19) == 18) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (!qVar.O(i12 & 1, z6)) {
                if (i15 != 0) {
                    tVar4 = i3.q.f13017a;
                } else {
                    tVar4 = tVar2;
                }
                t e10 = p2.e(tVar4, 1.0f);
                EchoTheme echoTheme = EchoTheme.INSTANCE;
                int i16 = EchoTheme.$stable;
                t G = r1.d.G(e10, echoTheme.getSpacings(qVar, i16).getX5(), u.P, 2);
                u0 u0Var = j.f29228a;
                x a10 = w.a(i.y(echoTheme, qVar, i16), d.B0, qVar, 0);
                int hashCode = Long.hashCode(qVar.T);
                o l4 = qVar.l();
                t c5 = a.c(G, qVar);
                h.f11920i.getClass();
                f fVar = g.f11903b;
                qVar.b0();
                if (qVar.S) {
                    qVar.k(fVar);
                } else {
                    qVar.k0();
                }
                r.J(g.f11907f, a10, qVar);
                r.J(g.f11906e, l4, qVar);
                r.y(qVar, Integer.valueOf(hashCode), g.f11908g);
                r.F(g.f11909h, qVar);
                r.J(g.f11905d, c5, qVar);
                String R = c.R(qVar, R.string.read_details_details);
                y0 baseRegular500 = echoTheme.getTypography(qVar, i16).getBaseRegular500(qVar, EchoThemeTypography.$stable);
                long primary = echoTheme.getColors(qVar, i16).getText().getPrimary(qVar, EchoThemeColors.Text.$stable);
                t tVar5 = tVar4;
                j7.d(R, null, primary, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, baseRegular500, qVar, 0, 0, 131066);
                qVar = qVar;
                qVar.X(619820795);
                for (DetailsItem detailsItem : list) {
                    DetailItem(detailsItem.getTitle(), detailsItem.getValue(), null, qVar, 0, 4);
                }
                qVar.p(false);
                qVar.p(true);
                tVar3 = tVar5;
            } else {
                qVar.R();
                tVar3 = tVar2;
            }
            r10 = qVar.r();
            if (r10 == null) {
                r10.f34012d = new e(list, tVar3, i10, i11, 1);
                return;
            }
            return;
        }
        tVar2 = tVar;
        if ((i12 & 19) == 18) {
        }
        if (!qVar.O(i12 & 1, z6)) {
        }
        r10 = qVar.r();
        if (r10 == null) {
        }
    }

    public static final z DetailsSection$lambda$1(List list, t tVar, int i10, int i11, m mVar, int i12) {
        DetailsSection(list, tVar, mVar, r.M(i10 | 1), i11);
        return z.f31622a;
    }

    public static final void Preview_DetailsSection(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(1613022091);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            DetailsSection(ig.f.I(new DetailsItem("Author", "Matt Haig"), new DetailsItem("Published", "2020"), new DetailsItem("Language", "English"), new DetailsItem("Genre", "Fiction"), new DetailsItem("Duration", "8h 50m")), null, qVar, 0, 2);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new jm.a(i10, 24);
        }
    }

    public static final z Preview_DetailsSection$lambda$0(int i10, m mVar, int i11) {
        Preview_DetailsSection(mVar, r.M(i10 | 1));
        return z.f31622a;
    }
}
