package io.elevenlabs.ui.echo.components;

import android.gov.nist.javax.sip.header.ParameterNames;
import c3.o;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import h4.f;
import h4.g;
import ho.a;
import i3.d;
import i3.t;
import ib.i;
import io.elevenlabs.ui.R;
import io.elevenlabs.ui.components.j2;
import io.elevenlabs.ui.echo.EchoTheme;
import io.livekit.android.rpc.RpcError;
import j0.c;
import kotlin.Metadata;
import l1.n;
import livekit.LivekitInternal$NodeStats;
import p3.h0;
import p3.x;
import p4.y;
import q2.e5;
import q2.f5;
import q2.j7;
import q2.y2;
import r1.h;
import r1.j;
import r1.p2;
import r1.u0;
import r1.w;
import s4.y0;
import sn.k;
import sn.z;
import t2.u;
import u2.b0;
import u2.e;
import u2.l;
import u2.m;
import u2.q;
import u2.r;
import u2.r1;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000&\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\u001aM\u0010\f\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0001\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\f\u0010\r\u001a\u000f\u0010\u000e\u001a\u00020\u0005H\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u000f\u0010\u0010\u001a\u00020\u0005H\u0001¢\u0006\u0004\b\u0010\u0010\u000f¨\u0006\u0011"}, d2 = {"", ParameterNames.TEXT, "", ParameterNames.ICON, "Lkotlin/Function0;", "Lsn/z;", "onClick", "Li3/t;", "modifier", "accessibilityLabel", "", "active", "Tile", "(Ljava/lang/String;ILho/a;Li3/t;Ljava/lang/String;ZLu2/m;II)V", "Preview_Tile_Active", "(Lu2/m;I)V", "Preview_Tile_Inactive", "ui_release"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class TileKt {
    public static final void Preview_Tile_Active(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(-1219319126);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            int i11 = R.drawable.ic_star;
            Object L = qVar.L();
            if (L == l.f33918a) {
                L = new b0(15);
                qVar.h0(L);
            }
            Tile("Sample Tile", i11, (a) L, null, "Sample Tile Icon", true, qVar, 221574, 8);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new tm.a(i10, 7);
        }
    }

    public static final z Preview_Tile_Active$lambda$1(int i10, m mVar, int i11) {
        Preview_Tile_Active(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_Tile_Inactive(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(-877563377);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            int i11 = R.drawable.ic_star;
            Object L = qVar.L();
            if (L == l.f33918a) {
                L = new b0(16);
                qVar.h0(L);
            }
            Tile("Sample Tile", i11, (a) L, null, "Sample Tile Icon", false, qVar, 221574, 8);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new tm.a(i10, 8);
        }
    }

    public static final z Preview_Tile_Inactive$lambda$1(int i10, m mVar, int i11) {
        Preview_Tile_Inactive(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Tile(String str, int i10, a aVar, t tVar, String str2, boolean z6, m mVar, int i11, int i12) {
        int i13;
        t tVar2;
        int i14;
        String str3;
        int i15;
        boolean z10;
        int i16;
        boolean z11;
        t tVar3;
        String str4;
        boolean z12;
        r1 r10;
        int i17;
        boolean z13;
        k kVar;
        Object L;
        e eVar;
        boolean z14;
        Object L2;
        int i18;
        int i19;
        int i20;
        int i21;
        str.getClass();
        aVar.getClass();
        q qVar = (q) mVar;
        qVar.Z(247723870);
        if ((i11 & 6) == 0) {
            if (qVar.f(str)) {
                i21 = 4;
            } else {
                i21 = 2;
            }
            i13 = i21 | i11;
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            if (qVar.d(i10)) {
                i20 = 32;
            } else {
                i20 = 16;
            }
            i13 |= i20;
        }
        if ((i11 & 384) == 0) {
            if (qVar.h(aVar)) {
                i19 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i19 = 128;
            }
            i13 |= i19;
        }
        int i22 = i12 & 8;
        if (i22 != 0) {
            i13 |= 3072;
        } else if ((i11 & 3072) == 0) {
            tVar2 = tVar;
            if (qVar.f(tVar2)) {
                i14 = 2048;
            } else {
                i14 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i13 |= i14;
            if ((i11 & 24576) != 0) {
                if ((i12 & 16) == 0) {
                    str3 = str2;
                    if (qVar.f(str3)) {
                        i18 = 16384;
                        i13 |= i18;
                    }
                } else {
                    str3 = str2;
                }
                i18 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                i13 |= i18;
            } else {
                str3 = str2;
            }
            i15 = i12 & 32;
            if (i15 == 0) {
                i13 |= 196608;
            } else if ((196608 & i11) == 0) {
                z10 = z6;
                if (qVar.g(z10)) {
                    i16 = 131072;
                } else {
                    i16 = 65536;
                }
                i13 |= i16;
                if ((74899 & i13) != 74898) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (qVar.O(i13 & 1, z11)) {
                    qVar.T();
                    int i23 = i11 & 1;
                    i3.q qVar2 = i3.q.f13017a;
                    if (i23 != 0 && !qVar.y()) {
                        qVar.R();
                        if ((i12 & 16) != 0) {
                            i13 &= -57345;
                        }
                    } else {
                        if (i22 != 0) {
                            tVar2 = qVar2;
                        }
                        if ((i12 & 16) != 0) {
                            i13 &= -57345;
                            str3 = str;
                        }
                        if (i15 != 0) {
                            i17 = i13;
                            z13 = true;
                            qVar.q();
                            if (!z13) {
                                qVar.X(1839445692);
                                EchoTheme echoTheme = EchoTheme.INSTANCE;
                                kVar = new k(new x(echoTheme.getColors(qVar, 6).getIcon().getPrimary(qVar, 0)), new x(i.v(6, 0, echoTheme, qVar, qVar)));
                                qVar.p(false);
                            } else {
                                qVar.X(1839448222);
                                EchoTheme echoTheme2 = EchoTheme.INSTANCE;
                                kVar = new k(new x(echoTheme2.getColors(qVar, 6).getIcon().getInactive(qVar, 0)), new x(echoTheme2.getColors(qVar, 6).getText().getInactive(qVar, 0)));
                                qVar.p(false);
                            }
                            long j4 = ((x) kVar.f31600a).f26440a;
                            long j10 = ((x) kVar.f31601b).f26440a;
                            u0 u0Var = j.f29228a;
                            EchoTheme echoTheme3 = EchoTheme.INSTANCE;
                            boolean z15 = z13;
                            h i24 = j.i(echoTheme3.getSpacings(qVar, 6).getX2(), d.f13005z0);
                            i3.j jVar = d.C0;
                            t tVar4 = tVar2;
                            t h10 = n.h(m3.h.c(p2.e(tVar2, 1.0f), echoTheme3.getShapes(qVar, 6).getXl(qVar, 0)), echoTheme3.getColors(qVar, 6).getFill().getDenary(qVar, 0), h0.f26395b);
                            f5 b10 = e5.b(u.P, 3, j4, false);
                            L = qVar.L();
                            eVar = l.f33918a;
                            if (L == eVar) {
                                L = c.o(qVar);
                            }
                            t E = r1.d.E(n.n(h10, (p1.l) L, b10, false, new p4.k(0), aVar, 12), echoTheme3.getSpacings(qVar, 6).getX3());
                            if ((((57344 & i17) ^ 24576) <= 16384 && qVar.f(str3)) || (i17 & 24576) == 16384) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            L2 = qVar.L();
                            if (!z14 || L2 == eVar) {
                                L2 = new lc.q(str3, 27);
                                qVar.h0(L2);
                            }
                            t c5 = p4.q.c(E, true, (ho.l) L2);
                            r1.x a10 = w.a(i24, jVar, qVar, 48);
                            int hashCode = Long.hashCode(qVar.T);
                            o l4 = qVar.l();
                            t c10 = i3.a.c(c5, qVar);
                            h4.h.f11920i.getClass();
                            f fVar = g.f11903b;
                            qVar.b0();
                            if (!qVar.S) {
                                qVar.k(fVar);
                            } else {
                                qVar.k0();
                            }
                            r.J(g.f11907f, a10, qVar);
                            r.J(g.f11906e, l4, qVar);
                            r.y(qVar, Integer.valueOf(hashCode), g.f11908g);
                            r.F(g.f11909h, qVar);
                            r.J(g.f11905d, c10, qVar);
                            y2.a(kd.a.M(i10, qVar, (i17 >> 3) & 14), null, p2.o(qVar2, 20), j4, qVar, u3.c.$stable | 432, 0);
                            j7.d(str, qVar2, 0L, 0L, null, 0L, new e5.k(3), 0L, 0, false, 0, 0, null, y0.a(echoTheme3.getTypography(qVar, 6).getSmCompact500(qVar, 0), j10, 0L, null, null, null, 0L, 0, 0L, null, null, 16777214), qVar, (i17 & 14) | 48, 0, 130044);
                            qVar = qVar;
                            qVar.p(true);
                            tVar3 = tVar4;
                            str4 = str3;
                            z12 = z15;
                        }
                    }
                    i17 = i13;
                    z13 = z10;
                    qVar.q();
                    if (!z13) {
                    }
                    long j42 = ((x) kVar.f31600a).f26440a;
                    long j102 = ((x) kVar.f31601b).f26440a;
                    u0 u0Var2 = j.f29228a;
                    EchoTheme echoTheme32 = EchoTheme.INSTANCE;
                    boolean z152 = z13;
                    h i242 = j.i(echoTheme32.getSpacings(qVar, 6).getX2(), d.f13005z0);
                    i3.j jVar2 = d.C0;
                    t tVar42 = tVar2;
                    t h102 = n.h(m3.h.c(p2.e(tVar2, 1.0f), echoTheme32.getShapes(qVar, 6).getXl(qVar, 0)), echoTheme32.getColors(qVar, 6).getFill().getDenary(qVar, 0), h0.f26395b);
                    f5 b102 = e5.b(u.P, 3, j42, false);
                    L = qVar.L();
                    eVar = l.f33918a;
                    if (L == eVar) {
                    }
                    t E2 = r1.d.E(n.n(h102, (p1.l) L, b102, false, new p4.k(0), aVar, 12), echoTheme32.getSpacings(qVar, 6).getX3());
                    if (((57344 & i17) ^ 24576) <= 16384) {
                    }
                    z14 = false;
                    L2 = qVar.L();
                    if (!z14) {
                    }
                    L2 = new lc.q(str3, 27);
                    qVar.h0(L2);
                    t c52 = p4.q.c(E2, true, (ho.l) L2);
                    r1.x a102 = w.a(i242, jVar2, qVar, 48);
                    int hashCode2 = Long.hashCode(qVar.T);
                    o l42 = qVar.l();
                    t c102 = i3.a.c(c52, qVar);
                    h4.h.f11920i.getClass();
                    f fVar2 = g.f11903b;
                    qVar.b0();
                    if (!qVar.S) {
                    }
                    r.J(g.f11907f, a102, qVar);
                    r.J(g.f11906e, l42, qVar);
                    r.y(qVar, Integer.valueOf(hashCode2), g.f11908g);
                    r.F(g.f11909h, qVar);
                    r.J(g.f11905d, c102, qVar);
                    y2.a(kd.a.M(i10, qVar, (i17 >> 3) & 14), null, p2.o(qVar2, 20), j42, qVar, u3.c.$stable | 432, 0);
                    j7.d(str, qVar2, 0L, 0L, null, 0L, new e5.k(3), 0L, 0, false, 0, 0, null, y0.a(echoTheme32.getTypography(qVar, 6).getSmCompact500(qVar, 0), j102, 0L, null, null, null, 0L, 0, 0L, null, null, 16777214), qVar, (i17 & 14) | 48, 0, 130044);
                    qVar = qVar;
                    qVar.p(true);
                    tVar3 = tVar42;
                    str4 = str3;
                    z12 = z152;
                } else {
                    qVar.R();
                    tVar3 = tVar2;
                    str4 = str3;
                    z12 = z10;
                }
                r10 = qVar.r();
                if (r10 != null) {
                    r10.f34012d = new j2(str, i10, aVar, tVar3, str4, z12, i11, i12);
                    return;
                }
                return;
            }
            z10 = z6;
            if ((74899 & i13) != 74898) {
            }
            if (qVar.O(i13 & 1, z11)) {
            }
            r10 = qVar.r();
            if (r10 != null) {
            }
        }
        tVar2 = tVar;
        if ((i11 & 24576) != 0) {
        }
        i15 = i12 & 32;
        if (i15 == 0) {
        }
        z10 = z6;
        if ((74899 & i13) != 74898) {
        }
        if (qVar.O(i13 & 1, z11)) {
        }
        r10 = qVar.r();
        if (r10 != null) {
        }
    }

    public static final z Tile$lambda$1$0(String str, p4.b0 b0Var) {
        b0Var.getClass();
        y.d(str, b0Var);
        return z.f31622a;
    }

    public static final z Tile$lambda$3(String str, int i10, a aVar, t tVar, String str2, boolean z6, int i11, int i12, m mVar, int i13) {
        Tile(str, i10, aVar, tVar, str2, z6, mVar, r.M(i11 | 1), i12);
        return z.f31622a;
    }
}
