package io.elevenlabs.readerapp.ui.screens.anonymous.signin;

import a2.d0;
import c3.o;
import f4.f1;
import i3.t;
import io.elevenlabs.readerapp.R;
import io.elevenlabs.ui.components.FullWidthButtonKt;
import io.elevenlabs.ui.components.FullWidthButtonVariant;
import io.elevenlabs.ui.components.VideoPlayerKt;
import io.elevenlabs.ui.theme.ElevenLabsTheme;
import io.livekit.android.rpc.RpcError;
import java.util.WeakHashMap;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import q2.j7;
import q2.y2;
import r1.c3;
import r1.m1;
import r1.o1;
import r1.p;
import r1.p2;
import r1.u0;
import r1.w;
import r1.x;
import sn.z;
import t2.u;
import u2.q;
import u2.r;
import u2.r1;
import u2.s2;
import u2.z0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u001a=\u0010\u0005\u001a\u00020\u00012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u000b²\u0006\u000e\u0010\b\u001a\u00020\u00078\n@\nX\u008a\u008e\u0002²\u0006\f\u0010\n\u001a\u00020\t8\nX\u008a\u0084\u0002"}, d2 = {"Lkotlin/Function0;", "Lsn/z;", "onContinueWithGoogleClick", "onSignUpWithEmailClick", "onLoginClick", "SignInIntroUI", "(Lho/a;Lho/a;Lho/a;Lu2/m;II)V", "", "buffering", "", "opacity", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class SignInIntroUIKt {
    /* JADX WARN: Removed duplicated region for block: B:101:0x0419  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x03ec A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0424  */
    /* JADX WARN: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x038f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SignInIntroUI(ho.a aVar, ho.a aVar2, ho.a aVar3, u2.m mVar, int i10, int i11) {
        ho.a aVar4;
        int i12;
        int i13;
        ho.a aVar5;
        int i14;
        int i15;
        boolean z6;
        ho.a aVar6;
        ho.a aVar7;
        r1 r10;
        ho.a aVar8;
        ho.a aVar9;
        float f10;
        int i16;
        long j4;
        z0 z0Var;
        boolean z10;
        u2.e eVar;
        ho.a aVar10;
        boolean z11;
        u2.e eVar2;
        ho.a aVar11;
        Object L;
        int i17;
        ho.a aVar12 = aVar3;
        aVar12.getClass();
        q qVar = (q) mVar;
        qVar.Z(-1151880203);
        int i18 = i11 & 1;
        if (i18 != 0) {
            i12 = i10 | 6;
            aVar4 = aVar;
        } else if ((i10 & 6) == 0) {
            aVar4 = aVar;
            if (qVar.h(aVar4)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i12 = i13 | i10;
        } else {
            aVar4 = aVar;
            i12 = i10;
        }
        int i19 = i11 & 2;
        if (i19 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            aVar5 = aVar2;
            if (qVar.h(aVar5)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
            if ((i10 & 384) == 0) {
                if (qVar.h(aVar12)) {
                    i17 = RpcError.MAX_MESSAGE_BYTES;
                } else {
                    i17 = 128;
                }
                i12 |= i17;
            }
            i15 = i12;
            if ((i15 & 147) == 146) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (!qVar.O(i15 & 1, z6)) {
                u2.e eVar3 = u2.l.f33918a;
                if (i18 != 0) {
                    Object L2 = qVar.L();
                    if (L2 == eVar3) {
                        L2 = new e(10);
                        qVar.h0(L2);
                    }
                    aVar8 = (ho.a) L2;
                } else {
                    aVar8 = aVar4;
                }
                if (i19 != 0) {
                    Object L3 = qVar.L();
                    if (L3 == eVar3) {
                        L3 = new e(11);
                        qVar.h0(L3);
                    }
                    aVar9 = (ho.a) L3;
                } else {
                    aVar9 = aVar5;
                }
                i3.q qVar2 = i3.q.f13017a;
                t d10 = p2.d(qVar2, 1.0f);
                r1.e eVar4 = r1.j.f29230c;
                i3.j jVar = i3.d.B0;
                x a10 = w.a(eVar4, jVar, qVar, 0);
                int hashCode = Long.hashCode(qVar.T);
                o l4 = qVar.l();
                t c5 = i3.a.c(d10, qVar);
                h4.h.f11920i.getClass();
                h4.f fVar = h4.g.f11903b;
                qVar.b0();
                if (qVar.S) {
                    qVar.k(fVar);
                } else {
                    qVar.k0();
                }
                h4.e eVar5 = h4.g.f11907f;
                r.J(eVar5, a10, qVar);
                h4.e eVar6 = h4.g.f11906e;
                r.J(eVar6, l4, qVar);
                Integer valueOf = Integer.valueOf(hashCode);
                h4.e eVar7 = h4.g.f11908g;
                r.y(qVar, valueOf, eVar7);
                h4.d dVar = h4.g.f11909h;
                r.F(dVar, qVar);
                h4.e eVar8 = h4.g.f11905d;
                r.J(eVar8, c5, qVar);
                Object L4 = qVar.L();
                if (L4 == eVar3) {
                    L4 = r.A(Boolean.TRUE);
                    qVar.h0(L4);
                }
                z0 z0Var2 = (z0) L4;
                if (SignInIntroUI$lambda$2$1(z0Var2)) {
                    f10 = u.P;
                } else {
                    f10 = 1.0f;
                }
                s2 b10 = j1.f.b(f10, null, "opacity", qVar, 3072, 22);
                t e10 = p2.e(qVar2, 1.0f);
                if (1.0f <= 0.0d) {
                    s1.a.a("invalid weight; must be greater than zero");
                }
                t c10 = p2.c(e10.then(new m1(1.0f, true)), 1.0f);
                f1 d11 = p.d(i3.d.f12997a, false);
                int hashCode2 = Long.hashCode(qVar.T);
                o l7 = qVar.l();
                t c11 = i3.a.c(c10, qVar);
                qVar.b0();
                if (qVar.S) {
                    qVar.k(fVar);
                } else {
                    qVar.k0();
                }
                r.J(eVar5, d11, qVar);
                r.J(eVar6, l7, qVar);
                defpackage.f.u(hashCode2, qVar, eVar7, qVar, dVar);
                r.J(eVar8, c11, qVar);
                t a11 = m3.h.a(p2.d(qVar2, 1.0f), SignInIntroUI$lambda$2$3(b10));
                int i20 = R.raw.sign_up_intro;
                ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
                int i21 = ElevenLabsTheme.$stable;
                long d12 = ib.i.d(elevenLabsTheme, qVar, i21);
                Object L5 = qVar.L();
                if (L5 == eVar3) {
                    i16 = i20;
                    j4 = d12;
                    z0Var = z0Var2;
                    L5 = new d0(z0Var, 9);
                    qVar.h0(L5);
                } else {
                    i16 = i20;
                    j4 = d12;
                    z0Var = z0Var2;
                }
                ho.a aVar13 = (ho.a) L5;
                Object L6 = qVar.L();
                if (L6 == eVar3) {
                    L6 = new d0(z0Var, 10);
                    qVar.h0(L6);
                }
                ho.a aVar14 = aVar9;
                ho.a aVar15 = aVar8;
                VideoPlayerKt.m1884VideoPlayer_Ogyb9c(a11, i16, j4, aVar13, (ho.a) null, (ho.a) L6, true, true, false, (Float) null, true, 0, (u2.m) qVar, 14355456, 6, 2832);
                qVar.p(true);
                WeakHashMap weakHashMap = c3.f29142x;
                t x10 = ib.i.x(elevenLabsTheme, qVar, i21, r1.d.p(r1.d.D(qVar2, r1.d.i(new o1(u0.e(qVar).f29149g, 32), qVar)), new o1(u0.e(qVar).f29149g, 32)));
                x a12 = w.a(eVar4, jVar, qVar, 0);
                int hashCode3 = Long.hashCode(qVar.T);
                o l10 = qVar.l();
                t c12 = i3.a.c(x10, qVar);
                qVar.b0();
                if (qVar.S) {
                    qVar.k(fVar);
                } else {
                    qVar.k0();
                }
                r.J(eVar5, a12, qVar);
                r.J(eVar6, l10, qVar);
                defpackage.f.u(hashCode3, qVar, eVar7, qVar, dVar);
                r.J(eVar8, c12, qVar);
                ib.i.C(elevenLabsTheme, qVar, i21, qVar2, qVar);
                y2.a(kd.a.M(R.drawable.ii_elevenreader, qVar, 0), null, p2.f(qVar2, 22), defpackage.f.b(elevenLabsTheme, qVar, i21), qVar, u3.c.$stable | 432, 0);
                r1.d.g(p2.f(qVar2, elevenLabsTheme.getSpacings(qVar, i21).m2358getX6D9Ej5fM()), qVar);
                boolean z12 = false;
                j7.d(kj.c.R(qVar, R.string.landing_intro_header), null, defpackage.f.A(elevenLabsTheme, qVar, i21), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar, i21).getBodyMedium700(), qVar, 0, 0, 131066);
                r1.d.g(p2.f(qVar2, elevenLabsTheme.getSpacings(qVar, i21).m2350getX1D9Ej5fM()), qVar);
                j7.d(kj.c.R(qVar, R.string.landing_intro), null, defpackage.f.A(elevenLabsTheme, qVar, i21), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar, i21).getBodySmall500(), qVar, 0, 0, 131066);
                qVar = qVar;
                r1.d.g(p2.f(qVar2, 50), qVar);
                String R = kj.c.R(qVar, R.string.signin_continue_with_google);
                FullWidthButtonVariant fullWidthButtonVariant = FullWidthButtonVariant.Primary;
                int i22 = io.elevenlabs.ui.R.drawable.google;
                t e11 = p2.e(qVar2, 1.0f);
                if ((i15 & 14) == 4) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                Object L7 = qVar.L();
                if (!z10) {
                    eVar = eVar3;
                    if (L7 != eVar) {
                        aVar10 = aVar15;
                        u2.e eVar9 = eVar;
                        ho.a aVar16 = aVar10;
                        FullWidthButtonKt.EchoThemeFullWidthButton(R, (ho.a) L7, e11, null, fullWidthButtonVariant, Integer.valueOf(i22), false, false, false, qVar, 100688256, 200);
                        r1.d.g(p2.f(qVar2, elevenLabsTheme.getSpacings(qVar, i21).m2355getX3D9Ej5fM()), qVar);
                        String R2 = kj.c.R(qVar, R.string.signin_sign_up_with_email);
                        FullWidthButtonVariant fullWidthButtonVariant2 = FullWidthButtonVariant.Border;
                        int i23 = io.elevenlabs.ui.R.drawable.email_1;
                        t e12 = p2.e(qVar2, 1.0f);
                        if ((i15 & 112) != 32) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        Object L8 = qVar.L();
                        if (z11) {
                            eVar2 = eVar9;
                            if (L8 != eVar2) {
                                aVar11 = aVar14;
                                ho.a aVar17 = aVar11;
                                FullWidthButtonKt.EchoThemeFullWidthButton(R2, (ho.a) L8, e12, null, fullWidthButtonVariant2, Integer.valueOf(i23), false, false, false, qVar, 24960, 456);
                                r1.d.g(p2.f(qVar2, elevenLabsTheme.getSpacings(qVar, i21).m2355getX3D9Ej5fM()), qVar);
                                String R3 = kj.c.R(qVar, R.string.signup_login);
                                FullWidthButtonVariant fullWidthButtonVariant3 = FullWidthButtonVariant.Secondary;
                                t e13 = p2.e(qVar2, 1.0f);
                                if ((i15 & 896) == 256) {
                                    z12 = true;
                                }
                                L = qVar.L();
                                if (z12 && L != eVar2) {
                                    aVar12 = aVar3;
                                } else {
                                    aVar12 = aVar3;
                                    L = new fm.g(16, aVar12);
                                    qVar.h0(L);
                                }
                                FullWidthButtonKt.EchoThemeFullWidthButton(R3, (ho.a) L, e13, null, fullWidthButtonVariant3, null, false, false, false, qVar, 24960, 488);
                                qVar.p(true);
                                qVar.p(true);
                                aVar6 = aVar16;
                                aVar7 = aVar17;
                            }
                        } else {
                            eVar2 = eVar9;
                        }
                        aVar11 = aVar14;
                        L8 = new fm.g(15, aVar11);
                        qVar.h0(L8);
                        ho.a aVar172 = aVar11;
                        FullWidthButtonKt.EchoThemeFullWidthButton(R2, (ho.a) L8, e12, null, fullWidthButtonVariant2, Integer.valueOf(i23), false, false, false, qVar, 24960, 456);
                        r1.d.g(p2.f(qVar2, elevenLabsTheme.getSpacings(qVar, i21).m2355getX3D9Ej5fM()), qVar);
                        String R32 = kj.c.R(qVar, R.string.signup_login);
                        FullWidthButtonVariant fullWidthButtonVariant32 = FullWidthButtonVariant.Secondary;
                        t e132 = p2.e(qVar2, 1.0f);
                        if ((i15 & 896) == 256) {
                        }
                        L = qVar.L();
                        if (z12) {
                        }
                        aVar12 = aVar3;
                        L = new fm.g(16, aVar12);
                        qVar.h0(L);
                        FullWidthButtonKt.EchoThemeFullWidthButton(R32, (ho.a) L, e132, null, fullWidthButtonVariant32, null, false, false, false, qVar, 24960, 488);
                        qVar.p(true);
                        qVar.p(true);
                        aVar6 = aVar16;
                        aVar7 = aVar172;
                    }
                } else {
                    eVar = eVar3;
                }
                aVar10 = aVar15;
                L7 = new fm.g(14, aVar10);
                qVar.h0(L7);
                u2.e eVar92 = eVar;
                ho.a aVar162 = aVar10;
                FullWidthButtonKt.EchoThemeFullWidthButton(R, (ho.a) L7, e11, null, fullWidthButtonVariant, Integer.valueOf(i22), false, false, false, qVar, 100688256, 200);
                r1.d.g(p2.f(qVar2, elevenLabsTheme.getSpacings(qVar, i21).m2355getX3D9Ej5fM()), qVar);
                String R22 = kj.c.R(qVar, R.string.signin_sign_up_with_email);
                FullWidthButtonVariant fullWidthButtonVariant22 = FullWidthButtonVariant.Border;
                int i232 = io.elevenlabs.ui.R.drawable.email_1;
                t e122 = p2.e(qVar2, 1.0f);
                if ((i15 & 112) != 32) {
                }
                Object L82 = qVar.L();
                if (z11) {
                }
                aVar11 = aVar14;
                L82 = new fm.g(15, aVar11);
                qVar.h0(L82);
                ho.a aVar1722 = aVar11;
                FullWidthButtonKt.EchoThemeFullWidthButton(R22, (ho.a) L82, e122, null, fullWidthButtonVariant22, Integer.valueOf(i232), false, false, false, qVar, 24960, 456);
                r1.d.g(p2.f(qVar2, elevenLabsTheme.getSpacings(qVar, i21).m2355getX3D9Ej5fM()), qVar);
                String R322 = kj.c.R(qVar, R.string.signup_login);
                FullWidthButtonVariant fullWidthButtonVariant322 = FullWidthButtonVariant.Secondary;
                t e1322 = p2.e(qVar2, 1.0f);
                if ((i15 & 896) == 256) {
                }
                L = qVar.L();
                if (z12) {
                }
                aVar12 = aVar3;
                L = new fm.g(16, aVar12);
                qVar.h0(L);
                FullWidthButtonKt.EchoThemeFullWidthButton(R322, (ho.a) L, e1322, null, fullWidthButtonVariant322, null, false, false, false, qVar, 24960, 488);
                qVar.p(true);
                qVar.p(true);
                aVar6 = aVar162;
                aVar7 = aVar1722;
            } else {
                qVar.R();
                aVar6 = aVar4;
                aVar7 = aVar5;
            }
            r10 = qVar.r();
            if (r10 == null) {
                r10.f34012d = new fm.f(aVar6, aVar7, aVar12, i10, i11, 18);
                return;
            }
            return;
        }
        aVar5 = aVar2;
        if ((i10 & 384) == 0) {
        }
        i15 = i12;
        if ((i15 & 147) == 146) {
        }
        if (!qVar.O(i15 & 1, z6)) {
        }
        r10 = qVar.r();
        if (r10 == null) {
        }
    }

    private static final boolean SignInIntroUI$lambda$2$1(z0 z0Var) {
        return ((Boolean) z0Var.getValue()).booleanValue();
    }

    private static final void SignInIntroUI$lambda$2$2(z0 z0Var, boolean z6) {
        z0Var.setValue(Boolean.valueOf(z6));
    }

    private static final float SignInIntroUI$lambda$2$3(s2 s2Var) {
        return ((Number) s2Var.getValue()).floatValue();
    }

    public static final z SignInIntroUI$lambda$2$4$0$0(z0 z0Var) {
        SignInIntroUI$lambda$2$2(z0Var, false);
        return z.f31622a;
    }

    public static final z SignInIntroUI$lambda$2$4$1$0(z0 z0Var) {
        SignInIntroUI$lambda$2$2(z0Var, true);
        return z.f31622a;
    }

    public static final z SignInIntroUI$lambda$2$5$0$0(ho.a aVar) {
        aVar.invoke();
        return z.f31622a;
    }

    public static final z SignInIntroUI$lambda$2$5$1$0(ho.a aVar) {
        aVar.invoke();
        return z.f31622a;
    }

    public static final z SignInIntroUI$lambda$2$5$2$0(ho.a aVar) {
        aVar.invoke();
        return z.f31622a;
    }

    public static final z SignInIntroUI$lambda$3(ho.a aVar, ho.a aVar2, ho.a aVar3, int i10, int i11, u2.m mVar, int i12) {
        SignInIntroUI(aVar, aVar2, aVar3, mVar, r.M(i10 | 1), i11);
        return z.f31622a;
    }
}
