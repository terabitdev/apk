package io.elevenlabs.ui.components.headers;

import c3.o;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import f4.f1;
import h4.e;
import h4.f;
import h4.g;
import h4.h;
import ho.q;
import i3.d;
import i3.k;
import i3.t;
import ib.i;
import io.elevenlabs.ui.R;
import io.elevenlabs.ui.components.u1;
import io.elevenlabs.ui.echo.EchoTheme;
import io.elevenlabs.ui.theme.ElevenLabsTheme;
import io.livekit.android.rpc.RpcError;
import java.util.WeakHashMap;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import q2.j7;
import q2.y2;
import r1.c3;
import r1.i2;
import r1.j;
import r1.k2;
import r1.l2;
import r1.m2;
import r1.p;
import r1.p2;
import r1.s;
import r1.u0;
import r1.w;
import r1.x;
import sn.z;
import u2.m;
import u2.r;
import u2.r1;
import u3.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aS\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00042\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\t\u0010\n\u001aY\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000e\u001ag\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00060\u00042\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00042\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00042\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\r\u0010\u0010\u001a\u000f\u0010\u0011\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Li3/t;", "modifier", "", "title", "Lkotlin/Function1;", "Lr1/l2;", "Lsn/z;", "actionLeft", "actionRight", "EchoThemeHeaderActions", "(Li3/t;Ljava/lang/String;Lho/q;Lho/q;Lu2/m;II)V", "Li3/f;", "alignment", "HeaderActions", "(Li3/t;Ljava/lang/String;Lho/q;Lho/q;Li3/f;Lu2/m;II)V", "Lr1/s;", "(Li3/t;Lho/q;Lho/q;Lho/q;Li3/f;Lu2/m;II)V", "Preview_HeaderActions", "(Lu2/m;I)V", "ui_release"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class HeaderActionsKt {
    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void EchoThemeHeaderActions(t tVar, String str, q qVar, q qVar2, m mVar, int i10, int i11) {
        t tVar2;
        int i12;
        int i13;
        String str2;
        int i14;
        int i15;
        q qVar3;
        int i16;
        int i17;
        q qVar4;
        int i18;
        boolean z6;
        u2.q qVar5;
        t tVar3;
        q qVar6;
        r1 r10;
        q qVar7;
        boolean z10;
        u2.q qVar8 = (u2.q) mVar;
        qVar8.Z(-366339369);
        int i19 = i11 & 1;
        if (i19 != 0) {
            i12 = i10 | 6;
            tVar2 = tVar;
        } else if ((i10 & 6) == 0) {
            tVar2 = tVar;
            if (qVar8.f(tVar2)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i12 = i13 | i10;
        } else {
            tVar2 = tVar;
            i12 = i10;
        }
        int i20 = i11 & 2;
        if (i20 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            str2 = str;
            if (qVar8.f(str2)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
            i15 = i11 & 4;
            if (i15 == 0) {
                i12 |= 384;
            } else if ((i10 & 384) == 0) {
                qVar3 = qVar;
                if (qVar8.h(qVar3)) {
                    i16 = RpcError.MAX_MESSAGE_BYTES;
                } else {
                    i16 = 128;
                }
                i12 |= i16;
                i17 = i11 & 8;
                if (i17 != 0) {
                    i12 |= 3072;
                } else if ((i10 & 3072) == 0) {
                    qVar4 = qVar2;
                    if (qVar8.h(qVar4)) {
                        i18 = 2048;
                    } else {
                        i18 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                    }
                    i12 |= i18;
                    if ((i12 & 1171) == 1170) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if (!qVar8.O(i12 & 1, z6)) {
                        i3.q qVar9 = i3.q.f13017a;
                        if (i19 != 0) {
                            tVar2 = qVar9;
                        }
                        if (i20 != 0) {
                            str2 = "";
                        }
                        q qVar10 = null;
                        if (i15 != 0) {
                            qVar7 = null;
                        } else {
                            qVar7 = qVar3;
                        }
                        if (i17 == 0) {
                            qVar10 = qVar4;
                        }
                        x a10 = w.a(j.f29230c, d.B0, qVar8, 0);
                        int hashCode = Long.hashCode(qVar8.T);
                        o l4 = qVar8.l();
                        t c5 = i3.a.c(tVar2, qVar8);
                        h.f11920i.getClass();
                        f fVar = g.f11903b;
                        qVar8.b0();
                        if (qVar8.S) {
                            qVar8.k(fVar);
                        } else {
                            qVar8.k0();
                        }
                        e eVar = g.f11907f;
                        r.J(eVar, a10, qVar8);
                        e eVar2 = g.f11906e;
                        r.J(eVar2, l4, qVar8);
                        Integer valueOf = Integer.valueOf(hashCode);
                        e eVar3 = g.f11908g;
                        r.y(qVar8, valueOf, eVar3);
                        h4.d dVar = g.f11909h;
                        r.F(dVar, qVar8);
                        e eVar4 = g.f11905d;
                        r.J(eVar4, c5, qVar8);
                        WeakHashMap weakHashMap = c3.f29142x;
                        r1.d.g(r1.d.p(r1.d.Q(u0.e(qVar8).f29149g), u0.e(qVar8).f29149g), qVar8);
                        EchoTheme echoTheme = EchoTheme.INSTANCE;
                        t tVar4 = tVar2;
                        int i21 = i12;
                        t H = r1.d.H(qVar9, echoTheme.getSpacings(qVar8, 6).getX2(), echoTheme.getSpacings(qVar8, 6).getX4(), echoTheme.getSpacings(qVar8, 6).getX5(), echoTheme.getSpacings(qVar8, 6).getX4());
                        k kVar = d.f13005z0;
                        k2 a11 = i2.a(j.f29228a, kVar, qVar8, 48);
                        int hashCode2 = Long.hashCode(qVar8.T);
                        o l7 = qVar8.l();
                        t c10 = i3.a.c(H, qVar8);
                        qVar8.b0();
                        String str3 = str2;
                        if (qVar8.S) {
                            qVar8.k(fVar);
                        } else {
                            qVar8.k0();
                        }
                        r.J(eVar, a11, qVar8);
                        r.J(eVar2, l7, qVar8);
                        defpackage.f.u(hashCode2, qVar8, eVar3, qVar8, dVar);
                        r.J(eVar4, c10, qVar8);
                        m2 m2Var = m2.f29267a;
                        if (qVar7 != null) {
                            qVar8.X(-1121616059);
                            qVar7.invoke(m2Var, qVar8, Integer.valueOf(6 | ((i21 >> 3) & 112)));
                            z10 = false;
                            qVar8.p(false);
                        } else {
                            z10 = false;
                            qVar8.X(-1121565436);
                            r1.d.g(p2.s(qVar9, echoTheme.getSpacings(qVar8, 6).getX5()), qVar8);
                            qVar8.p(false);
                        }
                        q qVar11 = qVar7;
                        t b10 = m2Var.b(qVar9, 1.0f, true);
                        f1 d10 = p.d(d.f12997a, z10);
                        int hashCode3 = Long.hashCode(qVar8.T);
                        o l10 = qVar8.l();
                        t c11 = i3.a.c(b10, qVar8);
                        qVar8.b0();
                        if (qVar8.S) {
                            qVar8.k(fVar);
                        } else {
                            qVar8.k0();
                        }
                        r.J(eVar, d10, qVar8);
                        r.J(eVar2, l10, qVar8);
                        defpackage.f.u(hashCode3, qVar8, eVar3, qVar8, dVar);
                        r.J(eVar4, c11, qVar8);
                        str2 = str3;
                        q qVar12 = qVar10;
                        j7.d(str2, p2.e(qVar9, 1.0f), i.v(6, 0, echoTheme, qVar8, qVar8), 0L, null, 0L, new e5.k(5), 0L, 0, false, 0, 0, null, echoTheme.getTypography(qVar8, 6).getLgCompact500(qVar8, 0), qVar8, ((i21 >> 3) & 14) | 48, 0, 130040);
                        qVar5 = qVar8;
                        qVar5.p(true);
                        if (qVar12 != null) {
                            qVar5.X(-1121081216);
                            r1.d.g(p2.s(qVar9, echoTheme.getSpacings(qVar5, 6).getX5()), qVar5);
                            k2 a12 = i2.a(j.g(echoTheme.getSpacings(qVar5, 6).getX3()), kVar, qVar5, 48);
                            int hashCode4 = Long.hashCode(qVar5.T);
                            o l11 = qVar5.l();
                            t c12 = i3.a.c(qVar9, qVar5);
                            qVar5.b0();
                            if (qVar5.S) {
                                qVar5.k(fVar);
                            } else {
                                qVar5.k0();
                            }
                            r.J(eVar, a12, qVar5);
                            r.J(eVar2, l11, qVar5);
                            defpackage.f.u(hashCode4, qVar5, eVar3, qVar5, dVar);
                            r.J(eVar4, c12, qVar5);
                            qVar4 = qVar12;
                            qVar4.invoke(m2Var, qVar5, Integer.valueOf(((i21 >> 6) & 112) | 6));
                            qVar5.p(true);
                            qVar5.p(false);
                        } else {
                            qVar4 = qVar12;
                            qVar5.X(-1120757359);
                            qVar5.p(false);
                        }
                        qVar5.p(true);
                        qVar5.p(true);
                        tVar3 = tVar4;
                        qVar6 = qVar11;
                    } else {
                        qVar5 = qVar8;
                        qVar5.R();
                        tVar3 = tVar2;
                        qVar6 = qVar3;
                    }
                    String str4 = str2;
                    q qVar13 = qVar4;
                    r10 = qVar5.r();
                    if (r10 == null) {
                        r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.voices.f(tVar3, str4, qVar6, qVar13, i10, i11, 9, false);
                        return;
                    }
                    return;
                }
                qVar4 = qVar2;
                if ((i12 & 1171) == 1170) {
                }
                if (!qVar8.O(i12 & 1, z6)) {
                }
                String str42 = str2;
                q qVar132 = qVar4;
                r10 = qVar5.r();
                if (r10 == null) {
                }
            }
            qVar3 = qVar;
            i17 = i11 & 8;
            if (i17 != 0) {
            }
            qVar4 = qVar2;
            if ((i12 & 1171) == 1170) {
            }
            if (!qVar8.O(i12 & 1, z6)) {
            }
            String str422 = str2;
            q qVar1322 = qVar4;
            r10 = qVar5.r();
            if (r10 == null) {
            }
        }
        str2 = str;
        i15 = i11 & 4;
        if (i15 == 0) {
        }
        qVar3 = qVar;
        i17 = i11 & 8;
        if (i17 != 0) {
        }
        qVar4 = qVar2;
        if ((i12 & 1171) == 1170) {
        }
        if (!qVar8.O(i12 & 1, z6)) {
        }
        String str4222 = str2;
        q qVar13222 = qVar4;
        r10 = qVar5.r();
        if (r10 == null) {
        }
    }

    public static final z EchoThemeHeaderActions$lambda$1(t tVar, String str, q qVar, q qVar2, int i10, int i11, m mVar, int i12) {
        EchoThemeHeaderActions(tVar, str, qVar, qVar2, mVar, r.M(i10 | 1), i11);
        return z.f31622a;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void HeaderActions(t tVar, q qVar, q qVar2, q qVar3, i3.f fVar, m mVar, int i10, int i11) {
        t tVar2;
        int i12;
        int i13;
        int i14;
        q qVar4;
        int i15;
        int i16;
        q qVar5;
        int i17;
        i3.f fVar2;
        int i18;
        boolean z6;
        t tVar3;
        q qVar6;
        q qVar7;
        r1 r10;
        i3.q qVar8;
        boolean z10;
        q qVar9;
        boolean z11;
        int i19;
        qVar.getClass();
        u2.q qVar10 = (u2.q) mVar;
        qVar10.Z(-975521942);
        int i20 = i11 & 1;
        if (i20 != 0) {
            i12 = i10 | 6;
            tVar2 = tVar;
        } else if ((i10 & 6) == 0) {
            tVar2 = tVar;
            if (qVar10.f(tVar2)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i12 = i13 | i10;
        } else {
            tVar2 = tVar;
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar10.h(qVar)) {
                i19 = 32;
            } else {
                i19 = 16;
            }
            i12 |= i19;
        }
        int i21 = i11 & 4;
        if (i21 != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            q qVar11 = qVar2;
            if (qVar10.h(qVar11)) {
                i14 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i14 = 128;
            }
            i12 |= i14;
            qVar4 = qVar11;
            i15 = i11 & 8;
            if (i15 == 0) {
                i12 |= 3072;
            } else if ((i10 & 3072) == 0) {
                q qVar12 = qVar3;
                if (qVar10.h(qVar12)) {
                    i16 = 2048;
                } else {
                    i16 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                }
                i12 |= i16;
                qVar5 = qVar12;
                i17 = i11 & 16;
                if (i17 != 0) {
                    i12 |= 24576;
                } else if ((i10 & 24576) == 0) {
                    fVar2 = fVar;
                    if (qVar10.f(fVar2)) {
                        i18 = 16384;
                    } else {
                        i18 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                    }
                    i12 |= i18;
                    if ((i12 & 9363) == 9362) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if (!qVar10.O(i12 & 1, z6)) {
                        i3.q qVar13 = i3.q.f13017a;
                        if (i20 != 0) {
                            tVar2 = qVar13;
                        }
                        q qVar14 = qVar4;
                        if (i21 != 0) {
                            qVar14 = null;
                        }
                        if (i15 != 0) {
                            qVar5 = null;
                        }
                        if (i17 != 0) {
                            fVar2 = d.f13005z0;
                        }
                        x a10 = w.a(j.f29230c, d.B0, qVar10, 0);
                        int hashCode = Long.hashCode(qVar10.T);
                        o l4 = qVar10.l();
                        t c5 = i3.a.c(tVar2, qVar10);
                        h.f11920i.getClass();
                        f fVar3 = g.f11903b;
                        qVar10.b0();
                        if (qVar10.S) {
                            qVar10.k(fVar3);
                        } else {
                            qVar10.k0();
                        }
                        e eVar = g.f11907f;
                        r.J(eVar, a10, qVar10);
                        e eVar2 = g.f11906e;
                        r.J(eVar2, l4, qVar10);
                        Integer valueOf = Integer.valueOf(hashCode);
                        e eVar3 = g.f11908g;
                        r.y(qVar10, valueOf, eVar3);
                        h4.d dVar = g.f11909h;
                        r.F(dVar, qVar10);
                        e eVar4 = g.f11905d;
                        r.J(eVar4, c5, qVar10);
                        WeakHashMap weakHashMap = c3.f29142x;
                        t tVar4 = tVar2;
                        r1.d.g(r1.d.p(r1.d.Q(u0.e(qVar10).f29149g), u0.e(qVar10).f29149g), qVar10);
                        ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
                        int i22 = i12;
                        t F = r1.d.F(qVar13, elevenLabsTheme.getSpacings(qVar10, 6).m2357getX5D9Ej5fM(), elevenLabsTheme.getSpacings(qVar10, 6).m2356getX4D9Ej5fM());
                        int i23 = i22 >> 6;
                        int i24 = ((i23 & 896) >> 3) & 112;
                        k2 a11 = i2.a(j.f29228a, fVar2, qVar10, i24);
                        i3.f fVar4 = fVar2;
                        int hashCode2 = Long.hashCode(qVar10.T);
                        o l7 = qVar10.l();
                        t c10 = i3.a.c(F, qVar10);
                        qVar10.b0();
                        q qVar15 = qVar5;
                        if (qVar10.S) {
                            qVar10.k(fVar3);
                        } else {
                            qVar10.k0();
                        }
                        r.J(eVar, a11, qVar10);
                        r.J(eVar2, l7, qVar10);
                        defpackage.f.u(hashCode2, qVar10, eVar3, qVar10, dVar);
                        r.J(eVar4, c10, qVar10);
                        m2 m2Var = m2.f29267a;
                        if (qVar14 != null) {
                            qVar10.X(-1727734953);
                            qVar14.invoke(m2Var, qVar10, Integer.valueOf(6 | ((i22 >> 3) & 112)));
                            qVar8 = qVar13;
                            r1.d.g(p2.s(qVar8, elevenLabsTheme.getSpacings(qVar10, 6).m2357getX5D9Ej5fM()), qVar10);
                            z10 = false;
                            qVar10.p(false);
                        } else {
                            qVar8 = qVar13;
                            z10 = false;
                            qVar10.X(-1727616750);
                            qVar10.p(false);
                        }
                        t b10 = m2Var.b(qVar8, 1.0f, true);
                        f1 d10 = p.d(d.f12997a, z10);
                        q qVar16 = qVar14;
                        int hashCode3 = Long.hashCode(qVar10.T);
                        o l10 = qVar10.l();
                        t c11 = i3.a.c(b10, qVar10);
                        qVar10.b0();
                        if (qVar10.S) {
                            qVar10.k(fVar3);
                        } else {
                            qVar10.k0();
                        }
                        r.J(eVar, d10, qVar10);
                        r.J(eVar2, l10, qVar10);
                        defpackage.f.u(hashCode3, qVar10, eVar3, qVar10, dVar);
                        r.J(eVar4, c11, qVar10);
                        qVar.invoke(r1.t.f29349a, qVar10, Integer.valueOf((i22 & 112) | 6));
                        qVar10.p(true);
                        if (qVar15 != null) {
                            qVar10.X(-1727481466);
                            r1.d.g(p2.s(qVar8, elevenLabsTheme.getSpacings(qVar10, 6).m2357getX5D9Ej5fM()), qVar10);
                            fVar2 = fVar4;
                            k2 a12 = i2.a(j.g(elevenLabsTheme.getSpacings(qVar10, 6).m2355getX3D9Ej5fM()), fVar2, qVar10, i24);
                            int hashCode4 = Long.hashCode(qVar10.T);
                            o l11 = qVar10.l();
                            t c12 = i3.a.c(qVar8, qVar10);
                            qVar10.b0();
                            if (qVar10.S) {
                                qVar10.k(fVar3);
                            } else {
                                qVar10.k0();
                            }
                            r.J(eVar, a12, qVar10);
                            r.J(eVar2, l11, qVar10);
                            defpackage.f.u(hashCode4, qVar10, eVar3, qVar10, dVar);
                            r.J(eVar4, c12, qVar10);
                            q qVar17 = qVar15;
                            qVar17.invoke(m2Var, qVar10, Integer.valueOf((i23 & 112) | 6));
                            z11 = true;
                            qVar10.p(true);
                            qVar10.p(false);
                            qVar9 = qVar17;
                        } else {
                            fVar2 = fVar4;
                            qVar9 = qVar15;
                            z11 = true;
                            qVar10.X(-1727162414);
                            qVar10.p(false);
                        }
                        qVar10.p(z11);
                        qVar10.p(z11);
                        tVar3 = tVar4;
                        qVar6 = qVar16;
                        qVar7 = qVar9;
                    } else {
                        qVar10.R();
                        tVar3 = tVar2;
                        qVar6 = qVar4;
                        qVar7 = qVar5;
                    }
                    q qVar18 = qVar7;
                    i3.f fVar5 = fVar2;
                    r10 = qVar10.r();
                    if (r10 == null) {
                        r10.f34012d = new io.elevenlabs.readerapp.ui.components.explore.p(tVar3, qVar, qVar6, qVar18, fVar5, i10, i11);
                        return;
                    }
                    return;
                }
                fVar2 = fVar;
                if ((i12 & 9363) == 9362) {
                }
                if (!qVar10.O(i12 & 1, z6)) {
                }
                q qVar182 = qVar7;
                i3.f fVar52 = fVar2;
                r10 = qVar10.r();
                if (r10 == null) {
                }
            }
            qVar5 = qVar3;
            i17 = i11 & 16;
            if (i17 != 0) {
            }
            fVar2 = fVar;
            if ((i12 & 9363) == 9362) {
            }
            if (!qVar10.O(i12 & 1, z6)) {
            }
            q qVar1822 = qVar7;
            i3.f fVar522 = fVar2;
            r10 = qVar10.r();
            if (r10 == null) {
            }
        }
        qVar4 = qVar2;
        i15 = i11 & 8;
        if (i15 == 0) {
        }
        qVar5 = qVar3;
        i17 = i11 & 16;
        if (i17 != 0) {
        }
        fVar2 = fVar;
        if ((i12 & 9363) == 9362) {
        }
        if (!qVar10.O(i12 & 1, z6)) {
        }
        q qVar18222 = qVar7;
        i3.f fVar5222 = fVar2;
        r10 = qVar10.r();
        if (r10 == null) {
        }
    }

    public static final z HeaderActions$lambda$0(String str, s sVar, m mVar, int i10) {
        boolean z6;
        sVar.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            j7.d(str, p2.e(i3.q.f13017a, 1.0f), 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, ElevenLabsTheme.INSTANCE.getTypo(qVar, 6).getTitleMedium700(), qVar, 48, 24960, 110588);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z HeaderActions$lambda$1(t tVar, String str, q qVar, q qVar2, i3.f fVar, int i10, int i11, m mVar, int i12) {
        HeaderActions(tVar, str, qVar, qVar2, fVar, mVar, r.M(i10 | 1), i11);
        return z.f31622a;
    }

    public static final z HeaderActions$lambda$3(t tVar, q qVar, q qVar2, q qVar3, i3.f fVar, int i10, int i11, m mVar, int i12) {
        HeaderActions(tVar, qVar, qVar2, qVar3, fVar, mVar, r.M(i10 | 1), i11);
        return z.f31622a;
    }

    public static final void Preview_HeaderActions(m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(3171730);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            x a10 = w.a(j.f29230c, d.B0, qVar, 0);
            int hashCode = Long.hashCode(qVar.T);
            o l4 = qVar.l();
            t c5 = i3.a.c(i3.q.f13017a, qVar);
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
            HeaderActions((t) null, "HeaderActions", (q) null, (q) null, (i3.f) null, qVar, 48, 29);
            HeaderActions((t) null, "HeaderActions with very long title that won't fix the screen", (q) null, (q) null, (i3.f) null, qVar, 48, 29);
            ComposableSingletons$HeaderActionsKt composableSingletons$HeaderActionsKt = ComposableSingletons$HeaderActionsKt.INSTANCE;
            HeaderActions((t) null, "HeaderActions", (q) null, composableSingletons$HeaderActionsKt.getLambda$1961583226$ui_release(), (i3.f) null, qVar, 3120, 21);
            HeaderActions((t) null, "HeaderActions with very long title that won't fix the screen", (q) null, composableSingletons$HeaderActionsKt.m1890getLambda$1367821253$ui_release(), (i3.f) null, qVar, 3120, 21);
            HeaderActions((t) null, "HeaderActions", c3.k.d(-57342691, false, new a(2), qVar), (q) null, (i3.f) null, qVar, 432, 25);
            HeaderActions((t) null, "HeaderActions with very long title that won't fix the screen", c3.k.d(908220126, false, new a(3), qVar), (q) null, (i3.f) null, qVar, 432, 25);
            HeaderActions((t) null, "HeaderActions", c3.k.d(1873782943, false, new a(4), qVar), composableSingletons$HeaderActionsKt.getLambda$1528867198$ui_release(), (i3.f) null, qVar, 3504, 17);
            HeaderActions((t) null, "HeaderActions with very long title that won't fix the screen", c3.k.d(-1455621536, false, new a(5), qVar), composableSingletons$HeaderActionsKt.m1892getLambda$1800537281$ui_release(), (i3.f) null, qVar, 3504, 17);
            qVar.p(true);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new u1(i10, 24);
        }
    }

    private static final void Preview_HeaderActions$actionLeft(m mVar, int i10) {
        y2.a(kd.a.M(R.drawable.chevron_left, mVar, 0), "Back", null, 0L, mVar, c.$stable | 48, 12);
    }

    public static final z Preview_HeaderActions$lambda$0$0(l2 l2Var, m mVar, int i10) {
        boolean z6;
        l2Var.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            Preview_HeaderActions$actionLeft(qVar, 0);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z Preview_HeaderActions$lambda$0$1(l2 l2Var, m mVar, int i10) {
        boolean z6;
        l2Var.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            Preview_HeaderActions$actionLeft(qVar, 0);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z Preview_HeaderActions$lambda$0$2(l2 l2Var, m mVar, int i10) {
        boolean z6;
        l2Var.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            Preview_HeaderActions$actionLeft(qVar, 0);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z Preview_HeaderActions$lambda$0$3(l2 l2Var, m mVar, int i10) {
        boolean z6;
        l2Var.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            Preview_HeaderActions$actionLeft(qVar, 0);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z Preview_HeaderActions$lambda$1(int i10, m mVar, int i11) {
        Preview_HeaderActions(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void HeaderActions(t tVar, String str, q qVar, q qVar2, i3.f fVar, m mVar, int i10, int i11) {
        t tVar2;
        int i12;
        String str2;
        int i13;
        int i14;
        int i15;
        i3.f fVar2;
        q qVar3;
        String str3;
        q qVar4;
        r1 r10;
        int i16;
        q qVar5;
        u2.q qVar6 = (u2.q) mVar;
        qVar6.Z(1772886253);
        int i17 = i11 & 1;
        if (i17 != 0) {
            i12 = i10 | 6;
            tVar2 = tVar;
        } else if ((i10 & 6) == 0) {
            tVar2 = tVar;
            i12 = (qVar6.f(tVar2) ? 4 : 2) | i10;
        } else {
            tVar2 = tVar;
            i12 = i10;
        }
        int i18 = i11 & 2;
        if (i18 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            str2 = str;
            i12 |= qVar6.f(str2) ? 32 : 16;
            i13 = i11 & 4;
            if (i13 == 0) {
                i12 |= 384;
            } else if ((i10 & 384) == 0) {
                i12 |= qVar6.h(qVar) ? RpcError.MAX_MESSAGE_BYTES : 128;
                i14 = i11 & 8;
                if (i14 != 0) {
                    i12 |= 3072;
                } else if ((i10 & 3072) == 0) {
                    i12 |= qVar6.h(qVar2) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
                    i15 = i11 & 16;
                    if (i15 == 0) {
                        i12 |= 24576;
                    } else if ((i10 & 24576) == 0) {
                        fVar2 = fVar;
                        i12 |= qVar6.f(fVar2) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE;
                        if (qVar6.O(i12 & 1, (i12 & 9363) != 9362)) {
                            t tVar3 = i17 != 0 ? i3.q.f13017a : tVar2;
                            String str4 = i18 != 0 ? "" : str2;
                            q lambda$1283681648$ui_release = i13 != 0 ? ComposableSingletons$HeaderActionsKt.INSTANCE.getLambda$1283681648$ui_release() : qVar;
                            if (i14 != 0) {
                                qVar5 = ComposableSingletons$HeaderActionsKt.INSTANCE.m1891getLambda$1631919601$ui_release();
                                i16 = i15;
                            } else {
                                i16 = i15;
                                qVar5 = qVar2;
                            }
                            if (i16 != 0) {
                                fVar2 = d.f13005z0;
                            }
                            HeaderActions(tVar3, c3.k.d(-783009702, true, new io.elevenlabs.readerapp.ui.screens.authenticated.assistant.components.b(str4, 1), qVar6), lambda$1283681648$ui_release, qVar5, fVar2, qVar6, (i12 & 14) | 48 | (i12 & 896) | (i12 & 7168) | (i12 & 57344), 0);
                            str3 = str4;
                            tVar2 = tVar3;
                            qVar3 = lambda$1283681648$ui_release;
                            qVar4 = qVar5;
                        } else {
                            qVar6.R();
                            qVar3 = qVar;
                            str3 = str2;
                            qVar4 = qVar2;
                        }
                        i3.f fVar3 = fVar2;
                        r10 = qVar6.r();
                        if (r10 != null) {
                            r10.f34012d = new io.elevenlabs.readerapp.ui.components.explore.p(tVar2, str3, qVar3, qVar4, fVar3, i10, i11);
                            return;
                        }
                        return;
                    }
                    fVar2 = fVar;
                    if (qVar6.O(i12 & 1, (i12 & 9363) != 9362)) {
                    }
                    i3.f fVar32 = fVar2;
                    r10 = qVar6.r();
                    if (r10 != null) {
                    }
                }
                i15 = i11 & 16;
                if (i15 == 0) {
                }
                fVar2 = fVar;
                if (qVar6.O(i12 & 1, (i12 & 9363) != 9362)) {
                }
                i3.f fVar322 = fVar2;
                r10 = qVar6.r();
                if (r10 != null) {
                }
            }
            i14 = i11 & 8;
            if (i14 != 0) {
            }
            i15 = i11 & 16;
            if (i15 == 0) {
            }
            fVar2 = fVar;
            if (qVar6.O(i12 & 1, (i12 & 9363) != 9362)) {
            }
            i3.f fVar3222 = fVar2;
            r10 = qVar6.r();
            if (r10 != null) {
            }
        }
        str2 = str;
        i13 = i11 & 4;
        if (i13 == 0) {
        }
        i14 = i11 & 8;
        if (i14 != 0) {
        }
        i15 = i11 & 16;
        if (i15 == 0) {
        }
        fVar2 = fVar;
        if (qVar6.O(i12 & 1, (i12 & 9363) != 9362)) {
        }
        i3.f fVar32222 = fVar2;
        r10 = qVar6.r();
        if (r10 != null) {
        }
    }
}
