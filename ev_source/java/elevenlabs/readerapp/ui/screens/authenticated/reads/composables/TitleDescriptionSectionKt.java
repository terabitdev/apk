package io.elevenlabs.readerapp.ui.screens.authenticated.reads.composables;

import c3.o;
import h4.f;
import h4.g;
import h4.h;
import i3.t;
import ib.i;
import io.elevenlabs.ui.echo.EchoTheme;
import io.elevenlabs.ui.echo.EchoThemeColors;
import io.elevenlabs.ui.echo.EchoThemeTypography;
import io.livekit.android.rpc.RpcError;
import jm.a;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import q2.j7;
import r1.d;
import r1.j;
import r1.p2;
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
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a)\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u000f\u0010\b\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"", "title", "description", "Li3/t;", "modifier", "Lsn/z;", "TitleDescriptionSection", "(Ljava/lang/String;Ljava/lang/String;Li3/t;Lu2/m;II)V", "Preview_TitleDescriptionSection", "(Lu2/m;I)V", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class TitleDescriptionSectionKt {
    public static final void Preview_TitleDescriptionSection(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(-81590613);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            TitleDescriptionSection("The Midnight Library", "Between life and death there is a library, and within that library, the shelves go on forever. Every book provides a chance to try another life you could have lived. To see how things would be if you had made other choices. Would you have done anything different, if you had the chance to undo your regrets?", null, qVar, 54, 4);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new a(i10, 27);
        }
    }

    public static final z Preview_TitleDescriptionSection$lambda$0(int i10, m mVar, int i11) {
        Preview_TitleDescriptionSection(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TitleDescriptionSection(String str, String str2, t tVar, m mVar, int i10, int i11) {
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
        str.getClass();
        str2.getClass();
        q qVar2 = (q) mVar;
        qVar2.Z(1676803275);
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
                EchoTheme echoTheme = EchoTheme.INSTANCE;
                int i17 = EchoTheme.$stable;
                t G = d.G(e10, echoTheme.getSpacings(qVar2, i17).getX5(), u.P, 2);
                x a10 = w.a(j.f29230c, i3.d.B0, qVar2, 0);
                int hashCode = Long.hashCode(qVar2.T);
                o l4 = qVar2.l();
                t c5 = i3.a.c(G, qVar2);
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
                EchoThemeTypography typography = echoTheme.getTypography(qVar2, i17);
                int i18 = EchoThemeTypography.$stable;
                y0 baseRegular500 = typography.getBaseRegular500(qVar2, i18);
                EchoThemeColors.Text text = echoTheme.getColors(qVar2, i17).getText();
                int i19 = EchoThemeColors.Text.$stable;
                j7.d(str3, null, text.getPrimary(qVar2, i19), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, baseRegular500, qVar2, i12 & 14, 0, 131066);
                d.g(p2.f(qVar3, echoTheme.getSpacings(qVar2, i17).getX2()), qVar2);
                j7.d(str2, null, i.v(i17, i19, echoTheme, qVar2, qVar2), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, echoTheme.getTypography(qVar2, i17).getBaseRegular400(qVar2, i18), qVar2, (i12 >> 3) & 14, 0, 131066);
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
                r10.f34012d = new io.elevenlabs.ui.components.r1(str, str2, tVar3, i10, i11, 4);
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

    public static final z TitleDescriptionSection$lambda$1(String str, String str2, t tVar, int i10, int i11, m mVar, int i12) {
        TitleDescriptionSection(str, str2, tVar, mVar, r.M(i10 | 1), i11);
        return z.f31622a;
    }
}
