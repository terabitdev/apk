package io.elevenlabs.readerapp.ui.screens.anonymous.signin;

import a2.a2;
import a2.y1;
import a2.z1;
import c3.o;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import ho.p;
import i3.t;
import io.elevenlabs.readerapp.R;
import io.elevenlabs.ui.components.BackButtonWithBackgroundKt;
import io.elevenlabs.ui.components.ErrorContainerKt;
import io.elevenlabs.ui.components.FullWidthButtonKt;
import io.elevenlabs.ui.components.FullWidthButtonVariant;
import io.elevenlabs.ui.components.InputKt;
import io.elevenlabs.ui.components.InputState;
import io.elevenlabs.ui.components.headers.HeaderActionsKt;
import io.elevenlabs.ui.components.input.VisualTransformationsKt;
import io.elevenlabs.ui.components.scaffolds.CenteredContentScaffoldKt;
import io.elevenlabs.ui.extensions.AutofillExtensionsKt;
import io.elevenlabs.ui.theme.ElevenLabsTheme;
import io.livekit.android.rpc.RpcError;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import n3.v;
import q2.j7;
import r1.c3;
import r1.l2;
import r1.m1;
import r1.p2;
import r1.u0;
import r1.w;
import r1.x;
import s4.y0;
import sn.z;
import t2.u;
import u2.q;
import u2.r;
import u2.r1;
import u2.z0;
import y4.d0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\u001aI\u0010\b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002 \b\u0002\u0010\u0005\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0004\u0012\u00020\u00040\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\r²\u0006\u000e\u0010\u000b\u001a\u00020\n8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\f\u001a\u00020\n8\n@\nX\u008a\u008e\u0002"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/anonymous/signin/SignInState;", RemoteConfigConstants.ResponseFieldKey.STATE, "Lkotlin/Function1;", "Lio/elevenlabs/readerapp/ui/screens/anonymous/signin/AuthViewModel;", "Lsn/z;", "action", "Lkotlin/Function0;", "onGoBack", "EmailSignInFormUI", "(Lio/elevenlabs/readerapp/ui/screens/anonymous/signin/SignInState;Lho/l;Lho/a;Lu2/m;II)V", "", "email", "password", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class EmailSignInFormUIKt {
    public static final void EmailSignInFormUI(SignInState signInState, ho.l lVar, ho.a aVar, u2.m mVar, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        boolean z6;
        int i15;
        signInState.getClass();
        q qVar = (q) mVar;
        qVar.Z(1794079469);
        if ((i10 & 6) == 0) {
            if (qVar.h(signInState)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i12 = i15 | i10;
        } else {
            i12 = i10;
        }
        int i16 = i11 & 2;
        if (i16 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            if (qVar.h(lVar)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i12 |= i13;
        }
        int i17 = i11 & 4;
        if (i17 != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            if (qVar.h(aVar)) {
                i14 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i14 = 128;
            }
            i12 |= i14;
        }
        if ((i12 & 147) != 146) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i12 & 1, z6)) {
            u2.e eVar = u2.l.f33918a;
            if (i16 != 0) {
                Object L = qVar.L();
                if (L == eVar) {
                    L = new g(26);
                    qVar.h0(L);
                }
                lVar = (ho.l) L;
            }
            if (i17 != 0) {
                Object L2 = qVar.L();
                if (L2 == eVar) {
                    L2 = new e(8);
                    qVar.h0(L2);
                }
                aVar = (ho.a) L2;
            }
            Object L3 = qVar.L();
            if (L3 == eVar) {
                L3 = r.A("");
                qVar.h0(L3);
            }
            z0 z0Var = (z0) L3;
            Object L4 = qVar.L();
            if (L4 == eVar) {
                L4 = r.A("");
                qVar.h0(L4);
            }
            WeakHashMap weakHashMap = c3.f29142x;
            CenteredContentScaffoldKt.CenteredContentScaffold(null, c3.k.d(1385676190, true, new hm.a(1, aVar), qVar), u0.e(qVar).f29154l, c3.k.d(2034268960, true, new h2.d(lVar, signInState, z0Var, (z0) L4), qVar), qVar, 3120, 1);
        } else {
            qVar.R();
        }
        ho.l lVar2 = lVar;
        ho.a aVar2 = aVar;
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new k(signInState, lVar2, aVar2, i10, i11, 0);
        }
    }

    public static final z EmailSignInFormUI$lambda$0$0(ho.l lVar) {
        lVar.getClass();
        return z.f31622a;
    }

    public static final z EmailSignInFormUI$lambda$10(SignInState signInState, ho.l lVar, ho.a aVar, int i10, int i11, u2.m mVar, int i12) {
        EmailSignInFormUI(signInState, lVar, aVar, mVar, r.M(i10 | 1), i11);
        return z.f31622a;
    }

    private static final String EmailSignInFormUI$lambda$3(z0 z0Var) {
        return (String) z0Var.getValue();
    }

    private static final String EmailSignInFormUI$lambda$6(z0 z0Var) {
        return (String) z0Var.getValue();
    }

    public static final z EmailSignInFormUI$lambda$8(ho.a aVar, u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            HeaderActionsKt.HeaderActions((t) null, (String) null, c3.k.d(-183587591, true, new defpackage.d(2, aVar), qVar), (ho.q) null, (i3.f) null, qVar, 384, 27);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z EmailSignInFormUI$lambda$8$0(ho.a aVar, l2 l2Var, u2.m mVar, int i10) {
        boolean z6;
        l2Var.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            BackButtonWithBackgroundKt.BackButtonWithBackground(aVar, u.P, qVar, 0, 2);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z EmailSignInFormUI$lambda$9(ho.l lVar, SignInState signInState, z0 z0Var, z0 z0Var2, u2.m mVar, int i10) {
        boolean z6;
        float f10;
        i3.q qVar;
        z0 z0Var3;
        z1 z1Var;
        String str;
        z0 z0Var4;
        float f11;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar2 = (q) mVar;
        boolean O = qVar2.O(i10 & 1, z6);
        z zVar = z.f31622a;
        if (O) {
            i3.q qVar3 = i3.q.f13017a;
            t d10 = p2.d(qVar3, 1.0f);
            r1.e eVar = r1.j.f29230c;
            i3.j jVar = i3.d.B0;
            x a10 = w.a(eVar, jVar, qVar2, 0);
            int hashCode = Long.hashCode(qVar2.T);
            o l4 = qVar2.l();
            t c5 = i3.a.c(d10, qVar2);
            h4.h.f11920i.getClass();
            h4.f fVar = h4.g.f11903b;
            qVar2.b0();
            if (qVar2.S) {
                qVar2.k(fVar);
            } else {
                qVar2.k0();
            }
            h4.e eVar2 = h4.g.f11907f;
            r.J(eVar2, a10, qVar2);
            h4.e eVar3 = h4.g.f11906e;
            r.J(eVar3, l4, qVar2);
            Integer valueOf = Integer.valueOf(hashCode);
            h4.e eVar4 = h4.g.f11908g;
            r.y(qVar2, valueOf, eVar4);
            h4.d dVar = h4.g.f11909h;
            r.F(dVar, qVar2);
            h4.e eVar5 = h4.g.f11905d;
            r.J(eVar5, c5, qVar2);
            if (1.0f <= 0.0d) {
                s1.a.a("invalid weight; must be greater than zero");
            }
            if (1.0f > Float.MAX_VALUE) {
                f10 = Float.MAX_VALUE;
            } else {
                f10 = 1.0f;
            }
            t y10 = l1.n.y(new m1(f10, true), l1.n.x(qVar2), true, true);
            ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
            int i11 = ElevenLabsTheme.$stable;
            t f12 = ib.i.f(elevenLabsTheme, qVar2, i11, y10);
            x a11 = w.a(eVar, jVar, qVar2, 0);
            int hashCode2 = Long.hashCode(qVar2.T);
            o l7 = qVar2.l();
            t c10 = i3.a.c(f12, qVar2);
            qVar2.b0();
            if (qVar2.S) {
                qVar2.k(fVar);
            } else {
                qVar2.k0();
            }
            r.J(eVar2, a11, qVar2);
            r.J(eVar3, l7, qVar2);
            defpackage.f.u(hashCode2, qVar2, eVar4, qVar2, dVar);
            r.J(eVar5, c10, qVar2);
            String R = kj.c.R(qVar2, R.string.signin_login_with_email);
            y0 titleLarge700Inter = elevenLabsTheme.getTypo(qVar2, i11).getTitleLarge700Inter();
            boolean f13 = qVar2.f(lVar);
            Object L = qVar2.L();
            u2.e eVar6 = u2.l.f33918a;
            if (f13 || L == eVar6) {
                L = new id.z(lVar, 15);
                qVar2.h0(L);
            }
            j7.d(R, l1.n.p(qVar3, false, null, null, null, (ho.a) L, 14), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, titleLarge700Inter, qVar2, 0, 0, 131068);
            r1.d.g(p2.f(qVar3, elevenLabsTheme.getSpacings(qVar2, i11).m2357getX5D9Ej5fM()), qVar2);
            Object L2 = qVar2.L();
            if (L2 == eVar6) {
                L2 = new v();
                qVar2.h0(L2);
            }
            v vVar = (v) L2;
            String R2 = kj.c.R(qVar2, R.string.signin_email);
            String EmailSignInFormUI$lambda$3 = EmailSignInFormUI$lambda$3(z0Var);
            String R3 = kj.c.R(qVar2, R.string.signin_email_placeholder);
            a2 a2Var = new a2(6, 6, 115);
            t j4 = n3.d.j(qVar3, vVar);
            List H = ig.f.H(j3.n.f18568a);
            boolean f14 = qVar2.f(lVar);
            Object L3 = qVar2.L();
            if (!f14 && L3 != eVar6) {
                qVar = qVar3;
                z0Var3 = z0Var;
            } else {
                qVar = qVar3;
                z0Var3 = z0Var;
                L3 = new l(lVar, z0Var3, 0);
                qVar2.h0(L3);
            }
            t autofill = AutofillExtensionsKt.autofill(j4, H, (ho.l) L3);
            boolean f15 = qVar2.f(lVar);
            Object L4 = qVar2.L();
            if (f15 || L4 == eVar6) {
                L4 = new l(lVar, z0Var3, 1);
                qVar2.h0(L4);
            }
            InputKt.Input(EmailSignInFormUI$lambda$3, (ho.l) L4, autofill, (t) null, (InputState) null, R2, (String) null, R3, (p) null, a2Var, (z1) null, (d0) null, false, 0, (u2.m) qVar2, 805306368, 0, 15704);
            Object L5 = qVar2.L();
            if (L5 == eVar6) {
                L5 = new EmailSignInFormUIKt$EmailSignInFormUI$4$1$1$4$1(vVar, null);
                qVar2.h0(L5);
            }
            r.f((p) L5, zVar, qVar2);
            i3.q qVar4 = qVar;
            ib.i.C(elevenLabsTheme, qVar2, i11, qVar4, qVar2);
            String R4 = kj.c.R(qVar2, R.string.signin_password);
            String EmailSignInFormUI$lambda$6 = EmailSignInFormUI$lambda$6(z0Var2);
            String R5 = kj.c.R(qVar2, R.string.signin_password_placeholder);
            a2 a2Var2 = new a2(false, 7, 113);
            boolean f16 = qVar2.f(lVar);
            Object L6 = qVar2.L();
            if (f16 || L6 == eVar6) {
                L6 = new g3.m(lVar, 3);
                qVar2.h0(L6);
            }
            z1 z1Var2 = new z1(null, null, (ho.l) L6, 31);
            EmailSignInFormUIKt$sam$androidx_compose_ui_text_input_VisualTransformation$0 emailSignInFormUIKt$sam$androidx_compose_ui_text_input_VisualTransformation$0 = new EmailSignInFormUIKt$sam$androidx_compose_ui_text_input_VisualTransformation$0(VisualTransformationsKt.getVisualTransformationPassword());
            List H2 = ig.f.H(j3.n.f18570c);
            boolean f17 = qVar2.f(lVar);
            Object L7 = qVar2.L();
            if (!f17 && L7 != eVar6) {
                z1Var = z1Var2;
                str = EmailSignInFormUI$lambda$6;
                z0Var4 = z0Var2;
            } else {
                z1Var = z1Var2;
                str = EmailSignInFormUI$lambda$6;
                z0Var4 = z0Var2;
                L7 = new l(lVar, z0Var4, 2);
                qVar2.h0(L7);
            }
            t autofill2 = AutofillExtensionsKt.autofill(qVar4, H2, (ho.l) L7);
            boolean f18 = qVar2.f(lVar);
            Object L8 = qVar2.L();
            if (f18 || L8 == eVar6) {
                L8 = new l(lVar, z0Var4, 3);
                qVar2.h0(L8);
            }
            InputKt.Input(str, (ho.l) L8, autofill2, (t) null, (InputState) null, R4, (String) null, R5, (p) null, a2Var2, z1Var, (d0) emailSignInFormUIKt$sam$androidx_compose_ui_text_input_VisualTransformation$0, false, 0, (u2.m) qVar2, 805306368, 0, 12632);
            if (signInState.isAccountBanned()) {
                qVar2.X(-903580859);
                r1.d.g(p2.f(qVar4, elevenLabsTheme.getSpacings(qVar2, i11).m2357getX5D9Ej5fM()), qVar2);
                ErrorContainerKt.ErrorContainer(null, ComposableSingletons$EmailSignInFormUIKt.INSTANCE.m1176getLambda$987455882$app_productionRelease(), qVar2, 48, 1);
                qVar2.p(false);
            } else if (!wq.n.m0(signInState.getError())) {
                qVar2.X(-903277586);
                r1.d.g(p2.f(qVar4, elevenLabsTheme.getSpacings(qVar2, i11).m2357getX5D9Ej5fM()), qVar2);
                ErrorContainerKt.ErrorContainer(signInState.getError(), qVar2, 0);
                qVar2.p(false);
            } else {
                qVar2.X(-903116138);
                qVar2.p(false);
            }
            ib.i.C(elevenLabsTheme, qVar2, i11, qVar4, qVar2);
            if (1.0f <= 0.0d) {
                s1.a.a("invalid weight; must be greater than zero");
            }
            if (1.0f > Float.MAX_VALUE) {
                f11 = Float.MAX_VALUE;
            } else {
                f11 = 1.0f;
            }
            r1.d.g(new m1(f11, true), qVar2);
            String R6 = kj.c.R(qVar2, R.string.signin_login);
            boolean f19 = qVar2.f(lVar);
            Object L9 = qVar2.L();
            if (f19 || L9 == eVar6) {
                L9 = new id.z(lVar, 16);
                qVar2.h0(L9);
            }
            FullWidthButtonKt.EchoThemeFullWidthButton(R6, (ho.a) L9, p2.e(qVar4, 1.0f), null, null, null, false, false, false, qVar2, 384, 504);
            r1.d.g(p2.f(qVar4, elevenLabsTheme.getSpacings(qVar2, i11).m2355getX3D9Ej5fM()), qVar2);
            String R7 = kj.c.R(qVar2, R.string.signin_forgot_password);
            boolean f20 = qVar2.f(lVar);
            Object L10 = qVar2.L();
            if (f20 || L10 == eVar6) {
                L10 = new c3.b(vVar, lVar, z0Var3, 8);
                qVar2.h0(L10);
            }
            FullWidthButtonKt.EchoThemeFullWidthButton(R7, (ho.a) L10, p2.e(qVar4, 1.0f), null, FullWidthButtonVariant.Text, null, false, false, false, qVar2, 24960, 488);
            qVar2.p(true);
            qVar2.p(true);
            return zVar;
        }
        qVar2.R();
        return zVar;
    }

    public static final z EmailSignInFormUI$lambda$9$0$0$0$0(ho.l lVar) {
        lVar.invoke(new g(25));
        return z.f31622a;
    }

    public static final z EmailSignInFormUI$lambda$9$0$0$0$0$0(AuthViewModel authViewModel) {
        authViewModel.getClass();
        authViewModel.signInWithDevAccount();
        return z.f31622a;
    }

    public static final z EmailSignInFormUI$lambda$9$0$0$2$0(ho.l lVar, z0 z0Var, String str) {
        str.getClass();
        z0Var.setValue(str);
        lVar.invoke(new am.c(str, 7));
        return z.f31622a;
    }

    public static final z EmailSignInFormUI$lambda$9$0$0$2$0$0(String str, AuthViewModel authViewModel) {
        authViewModel.getClass();
        authViewModel.onEmailChanged(str);
        return z.f31622a;
    }

    public static final z EmailSignInFormUI$lambda$9$0$0$3$0(ho.l lVar, z0 z0Var, String str) {
        str.getClass();
        z0Var.setValue(str);
        lVar.invoke(new am.c(str, 10));
        return z.f31622a;
    }

    public static final z EmailSignInFormUI$lambda$9$0$0$3$0$0(String str, AuthViewModel authViewModel) {
        authViewModel.getClass();
        authViewModel.onEmailChanged(str);
        return z.f31622a;
    }

    public static final z EmailSignInFormUI$lambda$9$0$0$5$0(ho.l lVar, y1 y1Var) {
        y1Var.getClass();
        lVar.invoke(new g(27));
        return z.f31622a;
    }

    public static final z EmailSignInFormUI$lambda$9$0$0$5$0$0(AuthViewModel authViewModel) {
        authViewModel.getClass();
        authViewModel.onSignInClick();
        return z.f31622a;
    }

    public static final z EmailSignInFormUI$lambda$9$0$0$6$0(ho.l lVar, z0 z0Var, String str) {
        str.getClass();
        z0Var.setValue(str);
        lVar.invoke(new am.c(str, 9));
        return z.f31622a;
    }

    public static final z EmailSignInFormUI$lambda$9$0$0$6$0$0(String str, AuthViewModel authViewModel) {
        authViewModel.getClass();
        authViewModel.onPasswordChanged(str);
        return z.f31622a;
    }

    public static final z EmailSignInFormUI$lambda$9$0$0$7$0(ho.l lVar, z0 z0Var, String str) {
        str.getClass();
        z0Var.setValue(str);
        lVar.invoke(new am.c(str, 8));
        return z.f31622a;
    }

    public static final z EmailSignInFormUI$lambda$9$0$0$7$0$0(String str, AuthViewModel authViewModel) {
        authViewModel.getClass();
        authViewModel.onPasswordChanged(str);
        return z.f31622a;
    }

    public static final z EmailSignInFormUI$lambda$9$0$0$8$0(ho.l lVar) {
        lVar.invoke(new g(23));
        return z.f31622a;
    }

    public static final z EmailSignInFormUI$lambda$9$0$0$8$0$0(AuthViewModel authViewModel) {
        authViewModel.getClass();
        authViewModel.onSignInClick();
        return z.f31622a;
    }

    public static final z EmailSignInFormUI$lambda$9$0$0$9$0(v vVar, ho.l lVar, z0 z0Var) {
        if (wq.n.m0(EmailSignInFormUI$lambda$3(z0Var))) {
            v.a(vVar);
        } else {
            lVar.invoke(new g(24));
        }
        return z.f31622a;
    }

    public static final z EmailSignInFormUI$lambda$9$0$0$9$0$0(AuthViewModel authViewModel) {
        authViewModel.getClass();
        authViewModel.onForgotPasswordClick();
        return z.f31622a;
    }
}
