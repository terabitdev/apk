package io.elevenlabs.readerapp.ui.screens.authenticated.explore.components;

import c3.o;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import i3.t;
import io.elevenlabs.readerapp.ui.screens.authenticated.author.p;
import io.elevenlabs.readerapp.ui.screens.authenticated.collections.x;
import io.elevenlabs.ui.R;
import io.elevenlabs.ui.echo.EchoTheme;
import io.elevenlabs.ui.echo.EchoThemeColors;
import io.elevenlabs.ui.echo.EchoThemeTypography;
import io.livekit.android.rpc.RpcError;
import kotlin.Metadata;
import l1.n;
import livekit.LivekitInternal$NodeStats;
import p4.k;
import q2.j7;
import q2.y2;
import r1.i2;
import r1.k2;
import r1.m1;
import r1.p2;
import s4.y0;
import sn.z;
import u2.l;
import u2.m;
import u2.q;
import u2.r;
import u2.r1;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a9\u0010\b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\b\u0010\t\u001a\u000f\u0010\n\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u000f\u0010\f\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\f\u0010\u000b¨\u0006\r"}, d2 = {"", "title", "value", "Lkotlin/Function0;", "Lsn/z;", "onClick", "Li3/t;", "modifier", "FilterRow", "(Ljava/lang/String;Ljava/lang/String;Lho/a;Li3/t;Lu2/m;II)V", "Preview_FilterRow", "(Lu2/m;I)V", "Preview_FilterRow_NoValue", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class FilterRowKt {
    /* JADX WARN: Removed duplicated region for block: B:27:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FilterRow(String str, String str2, ho.a aVar, t tVar, m mVar, int i10, int i11) {
        String str3;
        int i12;
        t tVar2;
        int i13;
        boolean z6;
        t tVar3;
        r1 r10;
        t tVar4;
        int i14;
        boolean z10;
        int i15;
        int i16;
        int i17;
        str.getClass();
        aVar.getClass();
        q qVar = (q) mVar;
        qVar.Z(100262487);
        if ((i10 & 6) == 0) {
            str3 = str;
            if (qVar.f(str3)) {
                i17 = 4;
            } else {
                i17 = 2;
            }
            i12 = i17 | i10;
        } else {
            str3 = str;
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.f(str2)) {
                i16 = 32;
            } else {
                i16 = 16;
            }
            i12 |= i16;
        }
        if ((i10 & 384) == 0) {
            if (qVar.h(aVar)) {
                i15 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i15 = 128;
            }
            i12 |= i15;
        }
        int i18 = i11 & 8;
        if (i18 != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            tVar2 = tVar;
            if (qVar.f(tVar2)) {
                i13 = 2048;
            } else {
                i13 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i12 |= i13;
            if ((i12 & 1171) == 1170) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (!qVar.O(i12 & 1, z6)) {
                i3.q qVar2 = i3.q.f13017a;
                if (i18 != 0) {
                    tVar4 = qVar2;
                } else {
                    tVar4 = tVar2;
                }
                t p10 = n.p(p2.e(tVar4, 1.0f), false, null, new k(0), null, aVar, 11);
                EchoTheme echoTheme = EchoTheme.INSTANCE;
                int i19 = EchoTheme.$stable;
                t F = r1.d.F(p10, echoTheme.getSpacings(qVar, i19).getX5(), echoTheme.getSpacings(qVar, i19).getX4());
                k2 a10 = i2.a(r1.j.f29228a, i3.d.f13005z0, qVar, 48);
                int hashCode = Long.hashCode(qVar.T);
                o l4 = qVar.l();
                t c5 = i3.a.c(F, qVar);
                h4.h.f11920i.getClass();
                h4.f fVar = h4.g.f11903b;
                qVar.b0();
                if (qVar.S) {
                    qVar.k(fVar);
                } else {
                    qVar.k0();
                }
                r.J(h4.g.f11907f, a10, qVar);
                r.J(h4.g.f11906e, l4, qVar);
                r.y(qVar, Integer.valueOf(hashCode), h4.g.f11908g);
                r.F(h4.g.f11909h, qVar);
                r.J(h4.g.f11905d, c5, qVar);
                EchoThemeTypography typography = echoTheme.getTypography(qVar, i19);
                int i20 = EchoThemeTypography.$stable;
                y0 baseRegular500 = typography.getBaseRegular500(qVar, i20);
                EchoThemeColors.Text text = echoTheme.getColors(qVar, i19).getText();
                int i21 = EchoThemeColors.Text.$stable;
                int i22 = i12;
                t tVar5 = tVar4;
                EchoTheme echoTheme2 = echoTheme;
                int i23 = i19;
                j7.d(str3, null, text.getPrimary(qVar, i21), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, baseRegular500, qVar, i12 & 14, 0, 131066);
                qVar = qVar;
                i3.q qVar3 = qVar2;
                r1.d.g(p2.s(qVar3, echoTheme2.getSpacings(qVar, i23).getX4()), qVar);
                float f10 = Float.MAX_VALUE;
                if (str2 != null) {
                    qVar.X(1636026965);
                    y0 baseRegular5002 = echoTheme2.getTypography(qVar, i23).getBaseRegular500(qVar, i20);
                    long v9 = ib.i.v(i23, i21, echoTheme2, qVar, qVar);
                    if (1.0f <= 0.0d) {
                        s1.a.a("invalid weight; must be greater than zero");
                    }
                    if (1.0f <= Float.MAX_VALUE) {
                        f10 = 1.0f;
                    }
                    j7.d(str2, new m1(f10, true), v9, 0L, null, 0L, new e5.k(6), 0L, 5, false, 1, 0, null, baseRegular5002, qVar, (i22 >> 3) & 14, 24960, 109560);
                    qVar = qVar;
                    echoTheme2 = echoTheme2;
                    i23 = i23;
                    qVar3 = qVar3;
                    r1.d.g(p2.s(qVar3, echoTheme2.getSpacings(qVar, i23).getX2()), qVar);
                    i14 = 0;
                    qVar.p(false);
                    z10 = true;
                } else {
                    i14 = 0;
                    qVar.X(1636451913);
                    if (1.0f <= 0.0d) {
                        s1.a.a("invalid weight; must be greater than zero");
                    }
                    if (1.0f <= Float.MAX_VALUE) {
                        f10 = 1.0f;
                    }
                    z10 = true;
                    r1.d.g(new m1(f10, true), qVar);
                    qVar.p(false);
                }
                y2.a(kd.a.M(R.drawable.chevron_right_rounded, qVar, i14), null, p2.o(qVar3, 24), echoTheme2.getColors(qVar, i23).getIcon().getPrimary(qVar, EchoThemeColors.Icon.$stable), qVar, u3.c.$stable | 432, 0);
                qVar.p(z10);
                tVar3 = tVar5;
            } else {
                qVar.R();
                tVar3 = tVar2;
            }
            r10 = qVar.r();
            if (r10 == null) {
                r10.f34012d = new io.elevenlabs.readerapp.ui.components.explore.q(str, str2, aVar, tVar3, i10, i11, 1);
                return;
            }
            return;
        }
        tVar2 = tVar;
        if ((i12 & 1171) == 1170) {
        }
        if (!qVar.O(i12 & 1, z6)) {
        }
        r10 = qVar.r();
        if (r10 == null) {
        }
    }

    public static final z FilterRow$lambda$1(String str, String str2, ho.a aVar, t tVar, int i10, int i11, m mVar, int i12) {
        FilterRow(str, str2, aVar, tVar, mVar, r.M(i10 | 1), i11);
        return z.f31622a;
    }

    public static final void Preview_FilterRow(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(-44787605);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            Object L = qVar.L();
            if (L == l.f33918a) {
                L = new p(18);
                qVar.h0(L);
            }
            FilterRow("Price", "Under £10", (ho.a) L, null, qVar, 438, 8);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new x(i10, 28);
        }
    }

    public static final z Preview_FilterRow$lambda$1(int i10, m mVar, int i11) {
        Preview_FilterRow(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_FilterRow_NoValue(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(-1876196804);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            Object L = qVar.L();
            if (L == l.f33918a) {
                L = new p(19);
                qVar.h0(L);
            }
            FilterRow("Genre", null, (ho.a) L, null, qVar, 438, 8);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new x(i10, 29);
        }
    }

    public static final z Preview_FilterRow_NoValue$lambda$1(int i10, m mVar, int i11) {
        Preview_FilterRow_NoValue(mVar, r.M(i10 | 1));
        return z.f31622a;
    }
}
