package io.elevenlabs.ui.components;

import android.gov.nist.javax.sip.header.ParameterNames;
import android.gov.nist.javax.sip.parser.TokenNames;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import io.elevenlabs.ui.R;
import io.elevenlabs.ui.theme.ElevenLabsTheme;
import io.livekit.android.rpc.RpcError;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import q2.j7;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001c\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\u001aY\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\u0014\u0010\f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000e\u001a\u0017\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001aO\u0010\u001a\u001a\u00020\u00032\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0019\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u001a\u0010\u001b\u001aI\u0010$\u001a\u00020\u00032\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00000\u001c2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00030!H\u0003¢\u0006\u0004\b$\u0010%\u001a\u001f\u0010)\u001a\u00020\u001f2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020&H\u0002¢\u0006\u0004\b)\u0010*\u001a\u000f\u0010+\u001a\u00020\u0003H\u0007¢\u0006\u0004\b+\u0010,\"\u0014\u0010-\u001a\u00020\u00168\u0002X\u0082T¢\u0006\u0006\n\u0004\b-\u0010.\"\u0014\u0010/\u001a\u00020\u00168\u0002X\u0082T¢\u0006\u0006\n\u0004\b/\u0010.\"\u0014\u00101\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102\"\u0014\u00103\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00102¨\u00067²\u0006\f\u00105\u001a\u0002048\nX\u008a\u0084\u0002²\u0006\f\u00106\u001a\u0002048\nX\u008a\u0084\u0002"}, d2 = {"", "expanded", "Lkotlin/Function0;", "Lsn/z;", "onDismissRequest", "Li3/t;", "modifier", "Lh5/g;", "offset", "Ll5/b0;", DiagnosticsEntry.PROPERTIES_KEY, "", "children", "Menu-ILWXrKs", "(ZLho/a;Li3/t;JLl5/b0;Ljava/lang/Iterable;Lu2/m;II)V", "Menu", "", ParameterNames.TEXT, "MenuTitle", "(Ljava/lang/String;Lu2/m;I)V", "onClick", "enabled", "", ParameterNames.ICON, "tintIcon", "isDestructive", "MenuItem", "(Lho/a;ZLjava/lang/String;Ljava/lang/Integer;ZZLu2/m;II)V", "Lj1/l0;", "expandedStates", "Lu2/z0;", "Lp3/e1;", "transformOriginState", "Lkotlin/Function1;", "Lr1/y;", FirebaseAnalytics.Param.CONTENT, "DropdownMenuContent", "(Lj1/l0;Lu2/z0;Li3/t;Lho/q;Lu2/m;II)V", "Lh5/k;", "parentBounds", "menuBounds", "calculateTransformOrigin", "(Lh5/k;Lh5/k;)J", "Preview_MenuItem", "(Lu2/m;I)V", "IN_TRANSITION_DURATION", TokenNames.I, "OUT_TRANSITION_DURATION", "Lh5/f;", "MenuElevation", TokenNames.F, "MenuVerticalMargin", "", "scale", "alpha", "ui_release"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class MenuKt {
    private static final int IN_TRANSITION_DURATION = 120;
    private static final float MenuElevation = 10;
    private static final float MenuVerticalMargin = 48;
    private static final int OUT_TRANSITION_DURATION = 75;

    /* JADX WARN: Removed duplicated region for block: B:131:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void DropdownMenuContent(j1.l0 l0Var, u2.z0 z0Var, i3.t tVar, ho.q qVar, u2.m mVar, int i10, int i11) {
        int i12;
        i3.t tVar2;
        int i13;
        boolean z6;
        i3.t tVar3;
        u2.r1 r10;
        Object j02;
        float f10;
        float f11;
        boolean z10;
        Object j03;
        float f12;
        boolean z11;
        ho.l lVar;
        int i14;
        int i15;
        boolean h10;
        int i16;
        u2.q qVar2 = (u2.q) mVar;
        qVar2.Z(-1291146505);
        if ((i10 & 6) == 0) {
            if ((i10 & 8) == 0) {
                h10 = qVar2.f(l0Var);
            } else {
                h10 = qVar2.h(l0Var);
            }
            if (h10) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i12 = i16 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar2.f(z0Var)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i12 |= i15;
        }
        int i17 = i11 & 4;
        if (i17 != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            tVar2 = tVar;
            if (qVar2.f(tVar2)) {
                i13 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i13 = 128;
            }
            i12 |= i13;
            if ((i10 & 3072) == 0) {
                if (qVar2.h(qVar)) {
                    i14 = 2048;
                } else {
                    i14 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                }
                i12 |= i14;
            }
            boolean z12 = false;
            if ((i12 & 1171) == 1170) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (!qVar2.O(i12 & 1, z6)) {
                i3.q qVar3 = i3.q.f13017a;
                if (i17 != 0) {
                    tVar3 = qVar3;
                } else {
                    tVar3 = tVar2;
                }
                final j1.u1 e10 = j1.z1.e(l0Var, "DropDownMenu", qVar2, (i12 & 14) | 48, 0);
                j1.b2 b2Var = j1.e.f18214j;
                boolean g10 = e10.g();
                f9.e eVar = e10.f18411a;
                ho.l lVar2 = null;
                u2.e eVar2 = u2.l.f33918a;
                if (!g10) {
                    qVar2.X(1666573488);
                    boolean f13 = qVar2.f(e10);
                    j02 = qVar2.L();
                    if (f13 || j02 == eVar2) {
                        g3.g f14 = g3.t.f();
                        if (f14 != null) {
                            lVar = f14.e();
                        } else {
                            lVar = null;
                        }
                        g3.g j4 = g3.t.j(f14);
                        try {
                            Object j04 = eVar.j0();
                            g3.t.m(f14, j4, lVar);
                            qVar2.h0(j04);
                            j02 = j04;
                            z12 = false;
                        } catch (Throwable th) {
                            g3.t.m(f14, j4, lVar);
                            throw th;
                        }
                    }
                    qVar2.p(z12);
                } else {
                    qVar2.X(1666827533);
                    qVar2.p(false);
                    j02 = eVar.j0();
                }
                boolean booleanValue = ((Boolean) j02).booleanValue();
                qVar2.X(-73661421);
                float f15 = 1.0f;
                if (booleanValue) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.8f;
                }
                qVar2.p(false);
                Float valueOf = Float.valueOf(f10);
                boolean f16 = qVar2.f(e10);
                Object L = qVar2.L();
                if (f16 || L == eVar2) {
                    L = u2.r.s(new ho.a() { // from class: io.elevenlabs.ui.components.MenuKt$DropdownMenuContent$$inlined$animateFloat$1
                        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Boolean, java.lang.Object] */
                        @Override // ho.a
                        public final Boolean invoke() {
                            return j1.u1.this.f18414d.getValue();
                        }
                    });
                    qVar2.h0(L);
                }
                boolean booleanValue2 = ((Boolean) ((u2.s2) L).getValue()).booleanValue();
                qVar2.X(-73661421);
                if (booleanValue2) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.8f;
                }
                qVar2.p(false);
                Float valueOf2 = Float.valueOf(f11);
                boolean f17 = qVar2.f(e10);
                Object L2 = qVar2.L();
                if (f17 || L2 == eVar2) {
                    L2 = u2.r.s(new ho.a() { // from class: io.elevenlabs.ui.components.MenuKt$DropdownMenuContent$$inlined$animateFloat$2
                        @Override // ho.a
                        public final j1.p1 invoke() {
                            return j1.u1.this.f();
                        }
                    });
                    qVar2.h0(L2);
                }
                j1.r1 d10 = j1.z1.d(e10, valueOf, valueOf2, DropdownMenuContent$lambda$0((j1.p1) ((u2.s2) L2).getValue(), qVar2, 0), b2Var, qVar2, 196608);
                if (!e10.g()) {
                    qVar2.X(1666573488);
                    boolean f18 = qVar2.f(e10);
                    Object L3 = qVar2.L();
                    if (f18 || L3 == eVar2) {
                        g3.g f19 = g3.t.f();
                        if (f19 != null) {
                            lVar2 = f19.e();
                        }
                        ho.l lVar3 = lVar2;
                        g3.g j10 = g3.t.j(f19);
                        try {
                            Object j05 = eVar.j0();
                            g3.t.m(f19, j10, lVar3);
                            qVar2.h0(j05);
                            L3 = j05;
                        } catch (Throwable th2) {
                            g3.t.m(f19, j10, lVar3);
                            throw th2;
                        }
                    }
                    qVar2.p(false);
                    j03 = L3;
                    z10 = false;
                } else {
                    z10 = false;
                    qVar2.X(1666827533);
                    qVar2.p(false);
                    j03 = eVar.j0();
                }
                boolean booleanValue3 = ((Boolean) j03).booleanValue();
                qVar2.X(-1338205657);
                if (booleanValue3) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                qVar2.p(z10);
                Float valueOf3 = Float.valueOf(f12);
                boolean f20 = qVar2.f(e10);
                Object L4 = qVar2.L();
                if (f20 || L4 == eVar2) {
                    L4 = u2.r.s(new ho.a() { // from class: io.elevenlabs.ui.components.MenuKt$DropdownMenuContent$$inlined$animateFloat$3
                        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Boolean, java.lang.Object] */
                        @Override // ho.a
                        public final Boolean invoke() {
                            return j1.u1.this.f18414d.getValue();
                        }
                    });
                    qVar2.h0(L4);
                }
                boolean booleanValue4 = ((Boolean) ((u2.s2) L4).getValue()).booleanValue();
                qVar2.X(-1338205657);
                if (!booleanValue4) {
                    f15 = 0.0f;
                }
                qVar2.p(false);
                Float valueOf4 = Float.valueOf(f15);
                boolean f21 = qVar2.f(e10);
                Object L5 = qVar2.L();
                if (f21 || L5 == eVar2) {
                    L5 = u2.r.s(new ho.a() { // from class: io.elevenlabs.ui.components.MenuKt$DropdownMenuContent$$inlined$animateFloat$4
                        @Override // ho.a
                        public final j1.p1 invoke() {
                            return j1.u1.this.f();
                        }
                    });
                    qVar2.h0(L5);
                }
                j1.r1 d11 = j1.z1.d(e10, valueOf3, valueOf4, DropdownMenuContent$lambda$3((j1.p1) ((u2.s2) L5).getValue(), qVar2, 0), b2Var, qVar2, 196608);
                boolean f22 = qVar2.f(d10) | qVar2.f(d11);
                if ((i12 & 112) == 32) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                boolean z13 = f22 | z11;
                Object L6 = qVar2.L();
                if (z13 || L6 == eVar2) {
                    L6 = new io.elevenlabs.readerapp.ui.screens.authenticated.pronunciations.o(z0Var, d10, d11, 7);
                    qVar2.h0(L6);
                }
                i3.t r11 = p3.h0.r(qVar3, (ho.l) L6);
                ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
                i3.t h11 = l1.n.h(m3.h.c(m3.h.k(r1.d.I(r11, t2.u.P, elevenLabsTheme.getSpacings(qVar2, 6).m2353getX2D9Ej5fM(), t2.u.P, t2.u.P, 13), MenuElevation, elevenLabsTheme.getShapes(qVar2, 6).getMd(), 0L, 0L, 28), elevenLabsTheme.getShapes(qVar2, 6).getMd()), ib.i.d(elevenLabsTheme, qVar2, 6), p3.h0.f26395b);
                f4.f1 d12 = r1.p.d(i3.d.f12997a, false);
                int hashCode = Long.hashCode(qVar2.T);
                c3.o l4 = qVar2.l();
                i3.t c5 = i3.a.c(h11, qVar2);
                h4.h.f11920i.getClass();
                h4.f fVar = h4.g.f11903b;
                qVar2.b0();
                if (qVar2.S) {
                    qVar2.k(fVar);
                } else {
                    qVar2.k0();
                }
                h4.e eVar3 = h4.g.f11907f;
                u2.r.J(eVar3, d12, qVar2);
                h4.e eVar4 = h4.g.f11906e;
                u2.r.J(eVar4, l4, qVar2);
                Integer valueOf5 = Integer.valueOf(hashCode);
                h4.e eVar5 = h4.g.f11908g;
                u2.r.y(qVar2, valueOf5, eVar5);
                h4.d dVar = h4.g.f11909h;
                u2.r.F(dVar, qVar2);
                h4.e eVar6 = h4.g.f11905d;
                u2.r.J(eVar6, c5, qVar2);
                i3.t y10 = l1.n.y(r1.d.M(tVar3, r1.i1.f29225b), l1.n.x(qVar2), true, true);
                int i18 = i12 & 7168;
                r1.x a10 = r1.w.a(r1.j.f29230c, i3.d.B0, qVar2, 0);
                int hashCode2 = Long.hashCode(qVar2.T);
                c3.o l7 = qVar2.l();
                i3.t c10 = i3.a.c(y10, qVar2);
                qVar2.b0();
                if (qVar2.S) {
                    qVar2.k(fVar);
                } else {
                    qVar2.k0();
                }
                u2.r.J(eVar3, a10, qVar2);
                u2.r.J(eVar4, l7, qVar2);
                defpackage.f.u(hashCode2, qVar2, eVar5, qVar2, dVar);
                u2.r.J(eVar6, c10, qVar2);
                qVar.invoke(r1.z.f29398a, qVar2, Integer.valueOf(((i18 >> 6) & 112) | 6));
                qVar2.p(true);
                qVar2.p(true);
            } else {
                qVar2.R();
                tVar3 = tVar2;
            }
            r10 = qVar2.r();
            if (r10 == null) {
                r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.voices.f(l0Var, z0Var, tVar3, qVar, i10, i11, 6);
                return;
            }
            return;
        }
        tVar2 = tVar;
        if ((i10 & 3072) == 0) {
        }
        boolean z122 = false;
        if ((i12 & 1171) == 1170) {
        }
        if (!qVar2.O(i12 & 1, z6)) {
        }
        r10 = qVar2.r();
        if (r10 == null) {
        }
    }

    private static final j1.z DropdownMenuContent$lambda$0(j1.p1 p1Var, u2.m mVar, int i10) {
        j1.a2 s10;
        p1Var.getClass();
        u2.q qVar = (u2.q) mVar;
        qVar.X(1767760878);
        if (p1Var.c(Boolean.FALSE, Boolean.TRUE)) {
            s10 = j1.e.s(IN_TRANSITION_DURATION, 0, j1.y.f18445b, 2);
        } else {
            s10 = j1.e.s(1, 74, null, 4);
        }
        qVar.p(false);
        return s10;
    }

    private static final float DropdownMenuContent$lambda$2(u2.s2 s2Var) {
        return ((Number) s2Var.getValue()).floatValue();
    }

    private static final j1.z DropdownMenuContent$lambda$3(j1.p1 p1Var, u2.m mVar, int i10) {
        j1.a2 s10;
        p1Var.getClass();
        u2.q qVar = (u2.q) mVar;
        qVar.X(503216642);
        if (p1Var.c(Boolean.FALSE, Boolean.TRUE)) {
            s10 = j1.e.s(30, 0, null, 6);
        } else {
            s10 = j1.e.s(OUT_TRANSITION_DURATION, 0, null, 6);
        }
        qVar.p(false);
        return s10;
    }

    private static final float DropdownMenuContent$lambda$5(u2.s2 s2Var) {
        return ((Number) s2Var.getValue()).floatValue();
    }

    public static final sn.z DropdownMenuContent$lambda$6$0(u2.z0 z0Var, u2.s2 s2Var, u2.s2 s2Var2, p3.i0 i0Var) {
        i0Var.getClass();
        p3.y0 y0Var = (p3.y0) i0Var;
        y0Var.r(DropdownMenuContent$lambda$2(s2Var));
        y0Var.s(DropdownMenuContent$lambda$2(s2Var));
        y0Var.c(DropdownMenuContent$lambda$5(s2Var2));
        y0Var.z(((p3.e1) z0Var.getValue()).f26375a);
        return sn.z.f31622a;
    }

    public static final sn.z DropdownMenuContent$lambda$8(j1.l0 l0Var, u2.z0 z0Var, i3.t tVar, ho.q qVar, int i10, int i11, u2.m mVar, int i12) {
        DropdownMenuContent(l0Var, z0Var, tVar, qVar, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x005f  */
    /* renamed from: Menu-ILWXrKs */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1842MenuILWXrKs(final boolean z6, final ho.a aVar, i3.t tVar, long j4, l5.b0 b0Var, final Iterable<? extends ho.p> iterable, u2.m mVar, final int i10, final int i11) {
        int i12;
        ho.a aVar2;
        i3.t tVar2;
        int i13;
        int i14;
        long j10;
        int i15;
        int i16;
        l5.b0 b0Var2;
        int i17;
        boolean z10;
        u2.q qVar;
        final i3.t tVar3;
        final long j11;
        final l5.b0 b0Var3;
        u2.r1 r10;
        i3.t tVar4;
        long j12;
        l5.b0 b0Var4;
        int i18;
        int i19;
        int i20;
        aVar.getClass();
        iterable.getClass();
        u2.q qVar2 = (u2.q) mVar;
        qVar2.Z(-1466056366);
        if ((i10 & 6) == 0) {
            if (qVar2.g(z6)) {
                i20 = 4;
            } else {
                i20 = 2;
            }
            i12 = i20 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            aVar2 = aVar;
            if (qVar2.h(aVar2)) {
                i19 = 32;
            } else {
                i19 = 16;
            }
            i12 |= i19;
        } else {
            aVar2 = aVar;
        }
        int i21 = i11 & 4;
        if (i21 != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            tVar2 = tVar;
            if (qVar2.f(tVar2)) {
                i13 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i13 = 128;
            }
            i12 |= i13;
            i14 = i11 & 8;
            if (i14 == 0) {
                i12 |= 3072;
            } else if ((i10 & 3072) == 0) {
                j10 = j4;
                if (qVar2.e(j10)) {
                    i15 = 2048;
                } else {
                    i15 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                }
                i12 |= i15;
                i16 = i11 & 16;
                if (i16 != 0) {
                    i12 |= 24576;
                } else if ((i10 & 24576) == 0) {
                    b0Var2 = b0Var;
                    if (qVar2.f(b0Var2)) {
                        i17 = 16384;
                    } else {
                        i17 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                    }
                    i12 |= i17;
                    if ((196608 & i10) == 0) {
                        if (qVar2.h(iterable)) {
                            i18 = 131072;
                        } else {
                            i18 = 65536;
                        }
                        i12 |= i18;
                    }
                    if ((74899 & i12) == 74898) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!qVar2.O(i12 & 1, z10)) {
                        if (i21 != 0) {
                            tVar4 = i3.q.f13017a;
                        } else {
                            tVar4 = tVar2;
                        }
                        if (i14 != 0) {
                            j12 = (Float.floatToRawIntBits(r3) & 4294967295L) | (Float.floatToRawIntBits(0) << 32);
                        } else {
                            j12 = j10;
                        }
                        if (i16 != 0) {
                            b0Var4 = new l5.b0(false, 15);
                        } else {
                            b0Var4 = b0Var2;
                        }
                        Object L = qVar2.L();
                        u2.e eVar = u2.l.f33918a;
                        if (L == eVar) {
                            L = new j1.l0(Boolean.FALSE);
                            qVar2.h0(L);
                        }
                        j1.l0 l0Var = (j1.l0) L;
                        l0Var.f18312c.setValue(Boolean.valueOf(z6));
                        if (!((Boolean) l0Var.f18311b.getValue()).booleanValue() && !((Boolean) l0Var.f18312c.getValue()).booleanValue()) {
                            qVar2.X(238682832);
                            qVar2.p(false);
                        } else {
                            qVar2.X(237694924);
                            Object L2 = qVar2.L();
                            if (L2 == eVar) {
                                L2 = u2.r.A(new p3.e1(p3.e1.f26373b));
                                qVar2.h0(L2);
                            }
                            u2.z0 z0Var = (u2.z0) L2;
                            h5.c cVar = (h5.c) qVar2.j(i4.j1.f13129h);
                            Object L3 = qVar2.L();
                            if (L3 == eVar) {
                                L3 = new n1(z0Var, 0);
                                qVar2.h0(L3);
                            }
                            l5.l.a(new DropdownMenuPositionProvider(j12, cVar, (ho.p) L3, null), aVar2, b0Var4, c3.k.d(1022086667, true, new c2(l0Var, z0Var, tVar4, iterable), qVar2), qVar2, (i12 & 112) | 3072 | ((i12 >> 6) & 896), 0);
                            qVar2.p(false);
                        }
                        b0Var3 = b0Var4;
                        qVar = qVar2;
                        tVar3 = tVar4;
                        j11 = j12;
                    } else {
                        qVar2.R();
                        qVar = qVar2;
                        tVar3 = tVar2;
                        j11 = j10;
                        b0Var3 = b0Var2;
                    }
                    r10 = qVar.r();
                    if (r10 == null) {
                        r10.f34012d = new ho.p() { // from class: io.elevenlabs.ui.components.o1
                            @Override // ho.p
                            public final Object invoke(Object obj, Object obj2) {
                                sn.z Menu_ILWXrKs$lambda$4;
                                int intValue = ((Integer) obj2).intValue();
                                Menu_ILWXrKs$lambda$4 = MenuKt.Menu_ILWXrKs$lambda$4(z6, aVar, tVar3, j11, b0Var3, iterable, i10, i11, (u2.m) obj, intValue);
                                return Menu_ILWXrKs$lambda$4;
                            }
                        };
                        return;
                    }
                    return;
                }
                b0Var2 = b0Var;
                if ((196608 & i10) == 0) {
                }
                if ((74899 & i12) == 74898) {
                }
                if (!qVar2.O(i12 & 1, z10)) {
                }
                r10 = qVar.r();
                if (r10 == null) {
                }
            }
            j10 = j4;
            i16 = i11 & 16;
            if (i16 != 0) {
            }
            b0Var2 = b0Var;
            if ((196608 & i10) == 0) {
            }
            if ((74899 & i12) == 74898) {
            }
            if (!qVar2.O(i12 & 1, z10)) {
            }
            r10 = qVar.r();
            if (r10 == null) {
            }
        }
        tVar2 = tVar;
        i14 = i11 & 8;
        if (i14 == 0) {
        }
        j10 = j4;
        i16 = i11 & 16;
        if (i16 != 0) {
        }
        b0Var2 = b0Var;
        if ((196608 & i10) == 0) {
        }
        if ((74899 & i12) == 74898) {
        }
        if (!qVar2.O(i12 & 1, z10)) {
        }
        r10 = qVar.r();
        if (r10 == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void MenuItem(final ho.a aVar, boolean z6, final String str, Integer num, boolean z10, boolean z11, u2.m mVar, final int i10, final int i11) {
        int i12;
        boolean z12;
        int i13;
        int i14;
        Integer num2;
        int i15;
        int i16;
        boolean z13;
        int i17;
        int i18;
        int i19;
        boolean z14;
        u2.q qVar;
        final boolean z15;
        final Integer num3;
        final boolean z16;
        final boolean z17;
        u2.r1 r10;
        boolean z18;
        final Integer num4;
        final boolean z19;
        boolean z20;
        boolean z21;
        final long m2185getPrimary0d7_KjU;
        float f10;
        int i20;
        int i21;
        aVar.getClass();
        str.getClass();
        u2.q qVar2 = (u2.q) mVar;
        qVar2.Z(427579028);
        if ((i10 & 6) == 0) {
            if (qVar2.h(aVar)) {
                i21 = 4;
            } else {
                i21 = 2;
            }
            i12 = i21 | i10;
        } else {
            i12 = i10;
        }
        int i22 = i11 & 2;
        if (i22 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            z12 = z6;
            if (qVar2.g(z12)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i12 |= i13;
            if ((i10 & 384) == 0) {
                if (qVar2.f(str)) {
                    i20 = RpcError.MAX_MESSAGE_BYTES;
                } else {
                    i20 = 128;
                }
                i12 |= i20;
            }
            i14 = i11 & 8;
            if (i14 == 0) {
                i12 |= 3072;
            } else if ((i10 & 3072) == 0) {
                num2 = num;
                if (qVar2.f(num2)) {
                    i15 = 2048;
                } else {
                    i15 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                }
                i12 |= i15;
                i16 = i11 & 16;
                if (i16 != 0) {
                    i12 |= 24576;
                } else if ((i10 & 24576) == 0) {
                    z13 = z10;
                    if (qVar2.g(z13)) {
                        i17 = 16384;
                    } else {
                        i17 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                    }
                    i12 |= i17;
                    i18 = i11 & 32;
                    if (i18 == 0) {
                        i12 |= 196608;
                    } else if ((196608 & i10) == 0) {
                        if (qVar2.g(z11)) {
                            i19 = 131072;
                        } else {
                            i19 = 65536;
                        }
                        i12 |= i19;
                        if ((74899 & i12) != 74898) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (qVar2.O(i12 & 1, z14)) {
                            if (i22 != 0) {
                                z18 = true;
                            } else {
                                z18 = z12;
                            }
                            if (i14 != 0) {
                                num4 = null;
                            } else {
                                num4 = num2;
                            }
                            if (i16 != 0) {
                                z19 = true;
                            } else {
                                z19 = z13;
                            }
                            if (i18 != 0) {
                                z20 = false;
                            } else {
                                z20 = z11;
                            }
                            if (z20) {
                                qVar2.X(-1413406081);
                                m2185getPrimary0d7_KjU = ElevenLabsTheme.INSTANCE.getColor(qVar2, 6).getButtonText().m2040getDangerLight0d7_KjU();
                                z21 = false;
                                qVar2.p(false);
                            } else {
                                z21 = false;
                                qVar2.X(-1413404549);
                                m2185getPrimary0d7_KjU = ElevenLabsTheme.INSTANCE.getColor(qVar2, 6).getText().m2185getPrimary0d7_KjU();
                                qVar2.p(false);
                            }
                            i3.t t10 = r1.p2.t(i3.q.f13017a, 200, 250);
                            if (z18) {
                                f10 = 1.0f;
                            } else {
                                f10 = 0.3f;
                            }
                            i3.t a10 = m3.h.a(t10, f10);
                            c3.j d10 = c3.k.d(-564968860, true, new a2.c(str, m2185getPrimary0d7_KjU), qVar2);
                            if ((i12 & 14) == 4) {
                                z21 = true;
                            }
                            Object L = qVar2.L();
                            if (z21 || L == u2.l.f33918a) {
                                L = new o(6, aVar);
                                qVar2.h0(L);
                            }
                            qVar = qVar2;
                            q2.l.b(d10, (ho.a) L, a10, null, c3.k.d(-1654714008, true, new ho.p() { // from class: io.elevenlabs.ui.components.p1
                                @Override // ho.p
                                public final Object invoke(Object obj, Object obj2) {
                                    sn.z MenuItem$lambda$2;
                                    int intValue = ((Integer) obj2).intValue();
                                    MenuItem$lambda$2 = MenuKt.MenuItem$lambda$2(num4, z19, m2185getPrimary0d7_KjU, (u2.m) obj, intValue);
                                    return MenuItem$lambda$2;
                                }
                            }, qVar2), z18, null, null, qVar, ((i12 << 12) & 458752) | 24582, 456);
                            num3 = num4;
                            z16 = z19;
                            z15 = z18;
                            z17 = z20;
                        } else {
                            qVar = qVar2;
                            qVar.R();
                            z15 = z12;
                            num3 = num2;
                            z16 = z13;
                            z17 = z11;
                        }
                        r10 = qVar.r();
                        if (r10 != null) {
                            r10.f34012d = new ho.p() { // from class: io.elevenlabs.ui.components.m1
                                @Override // ho.p
                                public final Object invoke(Object obj, Object obj2) {
                                    sn.z MenuItem$lambda$3;
                                    int intValue = ((Integer) obj2).intValue();
                                    MenuItem$lambda$3 = MenuKt.MenuItem$lambda$3(ho.a.this, z15, str, num3, z16, z17, i10, i11, (u2.m) obj, intValue);
                                    return MenuItem$lambda$3;
                                }
                            };
                            return;
                        }
                        return;
                    }
                    if ((74899 & i12) != 74898) {
                    }
                    if (qVar2.O(i12 & 1, z14)) {
                    }
                    r10 = qVar.r();
                    if (r10 != null) {
                    }
                }
                z13 = z10;
                i18 = i11 & 32;
                if (i18 == 0) {
                }
                if ((74899 & i12) != 74898) {
                }
                if (qVar2.O(i12 & 1, z14)) {
                }
                r10 = qVar.r();
                if (r10 != null) {
                }
            }
            num2 = num;
            i16 = i11 & 16;
            if (i16 != 0) {
            }
            z13 = z10;
            i18 = i11 & 32;
            if (i18 == 0) {
            }
            if ((74899 & i12) != 74898) {
            }
            if (qVar2.O(i12 & 1, z14)) {
            }
            r10 = qVar.r();
            if (r10 != null) {
            }
        }
        z12 = z6;
        if ((i10 & 384) == 0) {
        }
        i14 = i11 & 8;
        if (i14 == 0) {
        }
        num2 = num;
        i16 = i11 & 16;
        if (i16 != 0) {
        }
        z13 = z10;
        i18 = i11 & 32;
        if (i18 == 0) {
        }
        if ((74899 & i12) != 74898) {
        }
        if (qVar2.O(i12 & 1, z14)) {
        }
        r10 = qVar.r();
        if (r10 != null) {
        }
    }

    public static final sn.z MenuItem$lambda$0(String str, long j4, u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
            j7.d(str, r1.d.G(i3.q.f13017a, t2.u.P, elevenLabsTheme.getSpacings(qVar, 6).m2353getX2D9Ej5fM(), 1), j4, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar, 6).getSubtitleMedium500(), qVar, 0, 0, 131064);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z MenuItem$lambda$1$0(ho.a aVar) {
        aVar.invoke();
        return sn.z.f31622a;
    }

    public static final sn.z MenuItem$lambda$2(Integer num, boolean z6, long j4, u2.m mVar, int i10) {
        boolean z10;
        p3.n nVar;
        if ((i10 & 3) != 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z10)) {
            if (num != null) {
                qVar.X(2049650563);
                u3.c M = kd.a.M(num.intValue(), qVar, 0);
                if (z6) {
                    nVar = new p3.n(j4, 5);
                } else {
                    nVar = null;
                }
                l1.n.c(M, null, null, null, null, t2.u.P, nVar, qVar, u3.c.$stable | 48, 60);
                qVar.p(false);
            } else {
                qVar.X(2049887930);
                qVar.p(false);
            }
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z MenuItem$lambda$3(ho.a aVar, boolean z6, String str, Integer num, boolean z10, boolean z11, int i10, int i11, u2.m mVar, int i12) {
        MenuItem(aVar, z6, str, num, z10, z11, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }

    public static final void MenuTitle(String str, u2.m mVar, int i10) {
        int i11;
        boolean z6;
        u2.q qVar;
        int i12;
        str.getClass();
        u2.q qVar2 = (u2.q) mVar;
        qVar2.Z(745456310);
        if ((i10 & 6) == 0) {
            if (qVar2.f(str)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i11 = i10 | i12;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar2.O(i11 & 1, z6)) {
            ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
            qVar = qVar2;
            j7.d(str, r1.d.F(i3.q.f13017a, elevenLabsTheme.getSpacings(qVar2, 6).m2356getX4D9Ej5fM(), elevenLabsTheme.getSpacings(qVar2, 6).m2353getX2D9Ej5fM()), ib.i.w(elevenLabsTheme, qVar2, 6), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar2, 6).getSubtitleSmall500(), qVar, i11 & 14, 0, 131064);
        } else {
            qVar = qVar2;
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.components.q0(str, i10, 7);
        }
    }

    public static final sn.z MenuTitle$lambda$0(String str, int i10, u2.m mVar, int i11) {
        MenuTitle(str, mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final sn.z Menu_ILWXrKs$lambda$2$0(u2.z0 z0Var, h5.k kVar, h5.k kVar2) {
        kVar.getClass();
        kVar2.getClass();
        z0Var.setValue(new p3.e1(calculateTransformOrigin(kVar, kVar2)));
        return sn.z.f31622a;
    }

    public static final sn.z Menu_ILWXrKs$lambda$3(j1.l0 l0Var, u2.z0 z0Var, i3.t tVar, Iterable iterable, u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            DropdownMenuContent(l0Var, z0Var, tVar, c3.k.d(-1834081664, true, new c1(iterable, 2), qVar), qVar, 3120, 0);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z Menu_ILWXrKs$lambda$3$0(Iterable iterable, r1.y yVar, u2.m mVar, int i10) {
        boolean z6;
        yVar.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            int i11 = 0;
            for (Object obj : iterable) {
                int i12 = i11 + 1;
                if (i11 >= 0) {
                    ho.p pVar = (ho.p) obj;
                    if (i11 != 0) {
                        qVar.X(2145342164);
                        DividerKt.m1827DivideriJQMabo(null, ElevenLabsTheme.INSTANCE.getColor(qVar, 6).getDivider().m2058getLightLine0d7_KjU(), qVar, 0, 1);
                    } else {
                        qVar.X(2081151462);
                    }
                    qVar.p(false);
                    if (pVar == null) {
                        qVar.X(2081183453);
                    } else {
                        qVar.X(2145344932);
                        pVar.invoke(qVar, 0);
                    }
                    qVar.p(false);
                    i11 = i12;
                } else {
                    ig.f.U();
                    throw null;
                }
            }
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z Menu_ILWXrKs$lambda$4(boolean z6, ho.a aVar, i3.t tVar, long j4, l5.b0 b0Var, Iterable iterable, int i10, int i11, u2.m mVar, int i12) {
        m1842MenuILWXrKs(z6, aVar, tVar, j4, b0Var, iterable, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }

    public static final void Preview_MenuItem(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-680164903);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            r1.x a10 = r1.w.a(r1.j.f29230c, i3.d.B0, qVar, 0);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.t c5 = i3.a.c(i3.q.f13017a, qVar);
            h4.h.f11920i.getClass();
            h4.f fVar = h4.g.f11903b;
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            u2.r.J(h4.g.f11907f, a10, qVar);
            u2.r.J(h4.g.f11906e, l4, qVar);
            u2.r.y(qVar, Integer.valueOf(hashCode), h4.g.f11908g);
            u2.r.F(h4.g.f11909h, qVar);
            u2.r.J(h4.g.f11905d, c5, qVar);
            Object L = qVar.L();
            u2.e eVar = u2.l.f33918a;
            if (L == eVar) {
                L = new u0(7);
                qVar.h0(L);
            }
            MenuItem((ho.a) L, false, "MenuItem", Integer.valueOf(R.drawable.apple), false, false, qVar, 390, 50);
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new u0(8);
                qVar.h0(L2);
            }
            MenuItem((ho.a) L2, false, "MenuItem with very long text that wont fit in one line", Integer.valueOf(R.drawable.apple), false, false, qVar, 390, 50);
            int i11 = R.drawable.apple;
            Object L3 = qVar.L();
            if (L3 == eVar) {
                L3 = new u0(9);
                qVar.h0(L3);
            }
            MenuItem((ho.a) L3, false, "MenuItem disabled", Integer.valueOf(i11), false, false, qVar, 438, 48);
            qVar.p(true);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new y0(i10, 20);
        }
    }

    public static final sn.z Preview_MenuItem$lambda$1(int i10, u2.m mVar, int i11) {
        Preview_MenuItem(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final long calculateTransformOrigin(h5.k kVar, h5.k kVar2) {
        float min;
        int i10 = kVar2.f12088a;
        int i11 = kVar2.f12091d;
        int i12 = kVar2.f12088a;
        int i13 = kVar2.f12090c;
        int i14 = kVar2.f12089b;
        int i15 = kVar.f12090c;
        int i16 = kVar.f12089b;
        int i17 = kVar.f12091d;
        int i18 = kVar.f12088a;
        float f10 = 1.0f;
        if (i10 < i15) {
            if (i13 <= i18) {
                min = 1.0f;
            } else if (kVar2.d() != 0) {
                min = (((Math.min(kVar.f12090c, i13) + Math.max(i18, i12)) / 2) - i12) / kVar2.d();
            }
            if (i14 < i17) {
                if (i11 > i16) {
                    if (kVar2.b() != 0) {
                        f10 = (((Math.min(i17, i11) + Math.max(i16, i14)) / 2) - i14) / kVar2.b();
                    }
                }
                return p3.h0.j(min, f10);
            }
            f10 = 0.0f;
            return p3.h0.j(min, f10);
        }
        min = 0.0f;
        if (i14 < i17) {
        }
        f10 = 0.0f;
        return p3.h0.j(min, f10);
    }
}
