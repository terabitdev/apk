package io.elevenlabs.readerapp.ui.screens.anonymous.signin;

import a2.a2;
import a2.h3;
import a2.l0;
import a2.o0;
import a2.q0;
import a2.y1;
import a2.z1;
import android.gov.nist.javax.sip.header.ParameterNames;
import androidx.room.m0;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import f2.o;
import h4.f2;
import ho.p;
import i1.e2;
import i1.g0;
import i3.t;
import i4.j1;
import i4.q2;
import io.elevenlabs.domain.model.PasswordValidationResult;
import io.elevenlabs.readerapp.BuildConfig;
import io.elevenlabs.readerapp.R;
import io.elevenlabs.ui.components.BackButtonWithBackgroundKt;
import io.elevenlabs.ui.components.CheckboxKt;
import io.elevenlabs.ui.components.ErrorContainerKt;
import io.elevenlabs.ui.components.FullWidthButtonKt;
import io.elevenlabs.ui.components.InputKt;
import io.elevenlabs.ui.components.InputState;
import io.elevenlabs.ui.components.headers.HeaderActionsKt;
import io.elevenlabs.ui.components.input.VisualTransformationsKt;
import io.elevenlabs.ui.components.scaffolds.CenteredContentScaffoldKt;
import io.elevenlabs.ui.extensions.AnnotatedStringExtensionsKt;
import io.elevenlabs.ui.extensions.AutofillExtensionsKt;
import io.elevenlabs.ui.theme.ElevenLabsTheme;
import io.livekit.android.rpc.RpcError;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import p3.d1;
import q2.j7;
import q2.y2;
import r1.c3;
import r1.i2;
import r1.k2;
import r1.l2;
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
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\u001aI\u0010\b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002 \b\u0002\u0010\u0005\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0004\u0012\u00020\u00040\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006H\u0007¢\u0006\u0004\b\b\u0010\t\u001a\u001f\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0003¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0013²\u0006\u000e\u0010\u0010\u001a\u00020\n8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0011\u001a\u00020\n8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0012\u001a\u00020\n8\n@\nX\u008a\u008e\u0002"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/anonymous/signin/SignInState;", RemoteConfigConstants.ResponseFieldKey.STATE, "Lkotlin/Function1;", "Lio/elevenlabs/readerapp/ui/screens/anonymous/signin/AuthViewModel;", "Lsn/z;", "action", "Lkotlin/Function0;", "onGoBack", "EmailSignUpFormUI", "(Lio/elevenlabs/readerapp/ui/screens/anonymous/signin/SignInState;Lho/l;Lho/a;Lu2/m;II)V", "", ParameterNames.TEXT, "", "isMet", "PasswordRequirementItem", "(Ljava/lang/String;ZLu2/m;I)V", DiagnosticsEntry.NAME_KEY, "email", "password", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class EmailSignUpFormUIKt {
    /* JADX WARN: Removed duplicated region for block: B:13:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void EmailSignUpFormUI(SignInState signInState, ho.l lVar, ho.a aVar, u2.m mVar, int i10, int i11) {
        int i12;
        ho.l lVar2;
        int i13;
        int i14;
        ho.a aVar2;
        int i15;
        boolean z6;
        ho.l lVar3;
        ho.a aVar3;
        r1 r10;
        ho.l lVar4;
        ho.a aVar4;
        int i16;
        signInState.getClass();
        q qVar = (q) mVar;
        qVar.Z(-1724219263);
        if ((i10 & 6) == 0) {
            if (qVar.h(signInState)) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i12 = i16 | i10;
        } else {
            i12 = i10;
        }
        int i17 = i11 & 2;
        if (i17 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            lVar2 = lVar;
            if (qVar.h(lVar2)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i12 |= i13;
            i14 = i11 & 4;
            if (i14 == 0) {
                i12 |= 384;
            } else if ((i10 & 384) == 0) {
                aVar2 = aVar;
                if (qVar.h(aVar2)) {
                    i15 = RpcError.MAX_MESSAGE_BYTES;
                } else {
                    i15 = 128;
                }
                i12 |= i15;
                if ((i12 & 147) != 146) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (qVar.O(i12 & 1, z6)) {
                    u2.e eVar = u2.l.f33918a;
                    if (i17 != 0) {
                        Object L = qVar.L();
                        if (L == eVar) {
                            L = new n(3);
                            qVar.h0(L);
                        }
                        lVar4 = (ho.l) L;
                    } else {
                        lVar4 = lVar2;
                    }
                    if (i14 != 0) {
                        Object L2 = qVar.L();
                        if (L2 == eVar) {
                            L2 = new e(9);
                            qVar.h0(L2);
                        }
                        aVar4 = (ho.a) L2;
                    } else {
                        aVar4 = aVar2;
                    }
                    Object L3 = qVar.L();
                    if (L3 == eVar) {
                        L3 = r.A(signInState.getName());
                        qVar.h0(L3);
                    }
                    z0 z0Var = (z0) L3;
                    Object L4 = qVar.L();
                    if (L4 == eVar) {
                        L4 = r.A(signInState.getEmail());
                        qVar.h0(L4);
                    }
                    z0 z0Var2 = (z0) L4;
                    Object L5 = qVar.L();
                    if (L5 == eVar) {
                        L5 = r.A(signInState.getPassword());
                        qVar.h0(L5);
                    }
                    WeakHashMap weakHashMap = c3.f29142x;
                    CenteredContentScaffoldKt.CenteredContentScaffold(null, c3.k.d(-2132622542, true, new hm.a(2, aVar4), qVar), u0.e(qVar).f29154l, c3.k.d(-1484029772, true, new o(lVar4, signInState, z0Var, z0Var2, (z0) L5), qVar), qVar, 3120, 1);
                    aVar3 = aVar4;
                    lVar3 = lVar4;
                } else {
                    qVar.R();
                    lVar3 = lVar2;
                    aVar3 = aVar2;
                }
                r10 = qVar.r();
                if (r10 != null) {
                    r10.f34012d = new k(signInState, lVar3, aVar3, i10, i11, 1);
                    return;
                }
                return;
            }
            aVar2 = aVar;
            if ((i12 & 147) != 146) {
            }
            if (qVar.O(i12 & 1, z6)) {
            }
            r10 = qVar.r();
            if (r10 != null) {
            }
        }
        lVar2 = lVar;
        i14 = i11 & 4;
        if (i14 == 0) {
        }
        aVar2 = aVar;
        if ((i12 & 147) != 146) {
        }
        if (qVar.O(i12 & 1, z6)) {
        }
        r10 = qVar.r();
        if (r10 != null) {
        }
    }

    public static final z EmailSignUpFormUI$lambda$0$0(ho.l lVar) {
        lVar.getClass();
        return z.f31622a;
    }

    public static final z EmailSignUpFormUI$lambda$11(ho.a aVar, u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            HeaderActionsKt.HeaderActions((t) null, (String) null, c3.k.d(593080973, true, new defpackage.d(3, aVar), qVar), (ho.q) null, (i3.f) null, qVar, 384, 27);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z EmailSignUpFormUI$lambda$11$0(ho.a aVar, l2 l2Var, u2.m mVar, int i10) {
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

    public static final z EmailSignUpFormUI$lambda$12(ho.l lVar, SignInState signInState, z0 z0Var, z0 z0Var2, z0 z0Var3, u2.m mVar, int i10) {
        boolean z6;
        z0 z0Var4;
        r1.z zVar;
        z0 z0Var5;
        boolean z10;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            i3.q qVar2 = i3.q.f13017a;
            t d10 = p2.d(qVar2, 1.0f);
            r1.e eVar = r1.j.f29230c;
            i3.j jVar = i3.d.B0;
            x a10 = w.a(eVar, jVar, qVar, 0);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            t c5 = i3.a.c(d10, qVar);
            h4.h.f11920i.getClass();
            h4.f fVar = h4.g.f11903b;
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            h4.e eVar2 = h4.g.f11907f;
            r.J(eVar2, a10, qVar);
            h4.e eVar3 = h4.g.f11906e;
            r.J(eVar3, l4, qVar);
            Integer valueOf = Integer.valueOf(hashCode);
            h4.e eVar4 = h4.g.f11908g;
            r.y(qVar, valueOf, eVar4);
            h4.d dVar = h4.g.f11909h;
            r.F(dVar, qVar);
            h4.e eVar5 = h4.g.f11905d;
            r.J(eVar5, c5, qVar);
            r1.z zVar2 = r1.z.f29398a;
            t y10 = l1.n.y(zVar2.c(qVar2, 1.0f, true), l1.n.x(qVar), true, true);
            ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
            int i11 = ElevenLabsTheme.$stable;
            t f10 = ib.i.f(elevenLabsTheme, qVar, i11, y10);
            x a11 = w.a(eVar, jVar, qVar, 0);
            int hashCode2 = Long.hashCode(qVar.T);
            c3.o l7 = qVar.l();
            t c10 = i3.a.c(f10, qVar);
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            r.J(eVar2, a11, qVar);
            r.J(eVar3, l7, qVar);
            defpackage.f.u(hashCode2, qVar, eVar4, qVar, dVar);
            r.J(eVar5, c10, qVar);
            j7.d(kj.c.R(qVar, R.string.signup_get_started), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar, i11).getTitleLarge700Inter(), qVar, 0, 0, 131070);
            ib.i.C(elevenLabsTheme, qVar, i11, qVar2, qVar);
            String R = kj.c.R(qVar, R.string.signin_name);
            String EmailSignUpFormUI$lambda$3 = EmailSignUpFormUI$lambda$3(z0Var);
            String R2 = kj.c.R(qVar, R.string.signin_name_placeholder);
            a2 a2Var = new a2(1, 6, 114);
            List H = ig.f.H(j3.n.I0);
            boolean f11 = qVar.f(lVar);
            Object L = qVar.L();
            u2.e eVar6 = u2.l.f33918a;
            if (f11 || L == eVar6) {
                L = new l(lVar, z0Var, 4);
                qVar.h0(L);
            }
            t autofill = AutofillExtensionsKt.autofill(qVar2, H, (ho.l) L);
            boolean f12 = qVar.f(lVar);
            Object L2 = qVar.L();
            if (f12 || L2 == eVar6) {
                L2 = new l(lVar, z0Var, 5);
                qVar.h0(L2);
            }
            InputKt.Input(EmailSignUpFormUI$lambda$3, (ho.l) L2, autofill, (t) null, (InputState) null, R, (String) null, R2, (p) null, a2Var, (z1) null, (d0) null, false, 0, (u2.m) qVar, 0, 0, 15704);
            ib.i.C(elevenLabsTheme, qVar, i11, qVar2, qVar);
            String R3 = kj.c.R(qVar, R.string.signin_email);
            String EmailSignUpFormUI$lambda$6 = EmailSignUpFormUI$lambda$6(z0Var2);
            String R4 = kj.c.R(qVar, R.string.signin_email_placeholder);
            a2 a2Var2 = new a2(6, 6, 115);
            List H2 = ig.f.H(j3.n.f18568a);
            boolean f13 = qVar.f(lVar);
            Object L3 = qVar.L();
            if (!f13 && L3 != eVar6) {
                z0Var4 = z0Var2;
            } else {
                z0Var4 = z0Var2;
                L3 = new l(lVar, z0Var4, 6);
                qVar.h0(L3);
            }
            t autofill2 = AutofillExtensionsKt.autofill(qVar2, H2, (ho.l) L3);
            boolean f14 = qVar.f(lVar);
            Object L4 = qVar.L();
            if (f14 || L4 == eVar6) {
                L4 = new l(lVar, z0Var4, 7);
                qVar.h0(L4);
            }
            InputKt.Input(EmailSignUpFormUI$lambda$6, (ho.l) L4, autofill2, (t) null, (InputState) null, R3, (String) null, R4, (p) null, a2Var2, (z1) null, (d0) null, false, 0, (u2.m) qVar, 805306368, 0, 15704);
            ib.i.C(elevenLabsTheme, qVar, i11, qVar2, qVar);
            String R5 = kj.c.R(qVar, R.string.signin_password);
            String EmailSignUpFormUI$lambda$9 = EmailSignUpFormUI$lambda$9(z0Var3);
            String R6 = kj.c.R(qVar, R.string.signin_password_placeholder);
            a2 a2Var3 = new a2(7, 4, 113);
            boolean h10 = qVar.h(signInState) | qVar.f(lVar);
            Object L5 = qVar.L();
            if (h10 || L5 == eVar6) {
                L5 = new h(signInState, lVar, 2);
                qVar.h0(L5);
            }
            z1 z1Var = new z1(null, null, (ho.l) L5, 31);
            EmailSignUpFormUIKt$sam$androidx_compose_ui_text_input_VisualTransformation$0 emailSignUpFormUIKt$sam$androidx_compose_ui_text_input_VisualTransformation$0 = new EmailSignUpFormUIKt$sam$androidx_compose_ui_text_input_VisualTransformation$0(VisualTransformationsKt.getVisualTransformationPassword());
            List H3 = ig.f.H(j3.n.f18572e);
            boolean f15 = qVar.f(lVar);
            Object L6 = qVar.L();
            if (!f15 && L6 != eVar6) {
                zVar = zVar2;
                z0Var5 = z0Var3;
            } else {
                zVar = zVar2;
                z0Var5 = z0Var3;
                L6 = new l(lVar, z0Var5, 8);
                qVar.h0(L6);
            }
            t autofill3 = AutofillExtensionsKt.autofill(qVar2, H3, (ho.l) L6);
            boolean f16 = qVar.f(lVar);
            Object L7 = qVar.L();
            if (f16 || L7 == eVar6) {
                L7 = new l(lVar, z0Var5, 9);
                qVar.h0(L7);
            }
            InputKt.Input(EmailSignUpFormUI$lambda$9, (ho.l) L7, autofill3, (t) null, (InputState) null, R5, (String) null, R6, (p) null, a2Var3, z1Var, (d0) emailSignUpFormUIKt$sam$androidx_compose_ui_text_input_VisualTransformation$0, false, 0, (u2.m) qVar, 805306368, 0, 12632);
            ib.i.A(elevenLabsTheme, qVar, i11, qVar2, qVar);
            if (signInState.getPasswordValidationResult() != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            r1.z zVar3 = zVar;
            e2.b(zVar3, z10, null, null, null, null, c3.k.d(418190200, true, new h3(signInState, 5), qVar), qVar, 1572870, 30);
            if (signInState.isAccountBanned()) {
                qVar.X(-157388325);
                r1.d.g(p2.f(qVar2, elevenLabsTheme.getSpacings(qVar, i11).m2357getX5D9Ej5fM()), qVar);
                ErrorContainerKt.ErrorContainer(null, ComposableSingletons$EmailSignUpFormUIKt.INSTANCE.m1177getLambda$210787318$app_productionRelease(), qVar, 48, 1);
                qVar.p(false);
            } else if (!wq.n.m0(signInState.getError())) {
                qVar.X(-157094972);
                r1.d.g(p2.f(qVar2, elevenLabsTheme.getSpacings(qVar, i11).m2357getX5D9Ej5fM()), qVar);
                ErrorContainerKt.ErrorContainer(signInState.getError(), qVar, 0);
                qVar.p(false);
            } else {
                qVar.X(-156943134);
                qVar.p(false);
            }
            ib.i.C(elevenLabsTheme, qVar, i11, qVar2, qVar);
            boolean agreesToProductUpdates = signInState.getAgreesToProductUpdates();
            String R7 = kj.c.R(qVar, R.string.signup_consent_to_receive_product_updates);
            i3.k kVar = i3.d.f13004y0;
            boolean f17 = qVar.f(lVar);
            Object L8 = qVar.L();
            if (f17 || L8 == eVar6) {
                L8 = new id.z(lVar, 18);
                qVar.h0(L8);
            }
            CheckboxKt.Checkbox(agreesToProductUpdates, (ho.a) L8, R7, null, kVar, ComposableSingletons$EmailSignUpFormUIKt.INSTANCE.getLambda$1475846261$app_productionRelease(), qVar, 221184, 8);
            ib.i.A(elevenLabsTheme, qVar, i11, qVar2, qVar);
            q2 q2Var = (q2) qVar.j(j1.f13138r);
            s4.h parseHtmlLinks = AnnotatedStringExtensionsKt.parseHtmlLinks(kj.c.R(qVar, R.string.signup_agree_to_terms), qVar, 0);
            boolean agreeToTerms = signInState.getAgreeToTerms();
            String str = parseHtmlLinks.f31041b;
            boolean f18 = qVar.f(lVar);
            Object L9 = qVar.L();
            if (f18 || L9 == eVar6) {
                L9 = new id.z(lVar, 19);
                qVar.h0(L9);
            }
            CheckboxKt.Checkbox(agreeToTerms, (ho.a) L9, str, null, kVar, c3.k.d(-1840257428, true, new q0(parseHtmlLinks, q2Var, lVar, 4), qVar), qVar, 221184, 8);
            ib.i.C(elevenLabsTheme, qVar, i11, qVar2, qVar);
            r1.d.g(zVar3.c(qVar2, 1.0f, true), qVar);
            boolean canSubmitSignUp = signInState.getCanSubmitSignUp();
            String R8 = kj.c.R(qVar, R.string.signup_sign_up);
            t e10 = p2.e(qVar2, 1.0f);
            boolean f19 = qVar.f(lVar);
            Object L10 = qVar.L();
            if (f19 || L10 == eVar6) {
                L10 = new id.z(lVar, 17);
                qVar.h0(L10);
            }
            FullWidthButtonKt.EchoThemeFullWidthButton(R8, (ho.a) L10, e10, null, null, null, false, canSubmitSignUp, false, qVar, 384, BuildConfig.VERSION_CODE);
            r1.d.g(p2.f(qVar2, elevenLabsTheme.getSpacings(qVar, i11).m2355getX3D9Ej5fM()), qVar);
            qVar.p(true);
            qVar.p(true);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z EmailSignUpFormUI$lambda$12$0$0$0$0(ho.l lVar, z0 z0Var, String str) {
        str.getClass();
        z0Var.setValue(str);
        lVar.invoke(new am.c(str, 15));
        return z.f31622a;
    }

    public static final z EmailSignUpFormUI$lambda$12$0$0$0$0$0(String str, AuthViewModel authViewModel) {
        authViewModel.getClass();
        authViewModel.onNameChanged(str);
        return z.f31622a;
    }

    public static final z EmailSignUpFormUI$lambda$12$0$0$1$0(ho.l lVar, z0 z0Var, String str) {
        str.getClass();
        z0Var.setValue(str);
        lVar.invoke(new am.c(str, 12));
        return z.f31622a;
    }

    public static final z EmailSignUpFormUI$lambda$12$0$0$1$0$0(String str, AuthViewModel authViewModel) {
        authViewModel.getClass();
        authViewModel.onNameChanged(str);
        return z.f31622a;
    }

    public static final z EmailSignUpFormUI$lambda$12$0$0$10(s4.h hVar, q2 q2Var, ho.l lVar, u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
            int i11 = ElevenLabsTheme.$stable;
            y0 a10 = y0.a(elevenLabsTheme.getTypo(qVar, i11).getBodySmall500(), defpackage.f.A(elevenLabsTheme, qVar, i11), 0L, null, null, null, 0L, 0, 0L, null, null, 16777214);
            boolean f10 = qVar.f(hVar) | qVar.h(q2Var) | qVar.f(lVar);
            Object L = qVar.L();
            if (f10 || L == u2.l.f33918a) {
                L = new o0(hVar, q2Var, lVar, 13);
                qVar.h0(L);
            }
            l0.c(hVar, null, a10, false, 0, 0, null, (ho.l) L, qVar, 0, 122);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z EmailSignUpFormUI$lambda$12$0$0$10$0$0(s4.h hVar, q2 q2Var, ho.l lVar, int i10) {
        s4.f fVar = (s4.f) tn.o.y0(hVar.b(i10, i10, "href"));
        if (fVar != null) {
            q2Var.openUri((String) fVar.f31030a);
        } else {
            lVar.invoke(new n(0));
        }
        return z.f31622a;
    }

    public static final z EmailSignUpFormUI$lambda$12$0$0$10$0$0$0(AuthViewModel authViewModel) {
        authViewModel.getClass();
        authViewModel.onAgreeToTermsToggled();
        return z.f31622a;
    }

    public static final z EmailSignUpFormUI$lambda$12$0$0$11$0(ho.l lVar) {
        lVar.invoke(new g(28));
        return z.f31622a;
    }

    public static final z EmailSignUpFormUI$lambda$12$0$0$11$0$0(AuthViewModel authViewModel) {
        authViewModel.getClass();
        authViewModel.onSignInClick();
        return z.f31622a;
    }

    public static final z EmailSignUpFormUI$lambda$12$0$0$2$0(ho.l lVar, z0 z0Var, String str) {
        str.getClass();
        z0Var.setValue(str);
        lVar.invoke(new am.c(str, 14));
        return z.f31622a;
    }

    public static final z EmailSignUpFormUI$lambda$12$0$0$2$0$0(String str, AuthViewModel authViewModel) {
        authViewModel.getClass();
        authViewModel.onEmailChanged(str);
        return z.f31622a;
    }

    public static final z EmailSignUpFormUI$lambda$12$0$0$3$0(ho.l lVar, z0 z0Var, String str) {
        str.getClass();
        z0Var.setValue(str);
        lVar.invoke(new am.c(str, 11));
        return z.f31622a;
    }

    public static final z EmailSignUpFormUI$lambda$12$0$0$3$0$0(String str, AuthViewModel authViewModel) {
        authViewModel.getClass();
        authViewModel.onEmailChanged(str);
        return z.f31622a;
    }

    public static final z EmailSignUpFormUI$lambda$12$0$0$4$0(SignInState signInState, ho.l lVar, y1 y1Var) {
        y1Var.getClass();
        if (signInState.getCanSubmitSignUp()) {
            lVar.invoke(new g(29));
        }
        return z.f31622a;
    }

    public static final z EmailSignUpFormUI$lambda$12$0$0$4$0$0(AuthViewModel authViewModel) {
        authViewModel.getClass();
        authViewModel.onSignInClick();
        return z.f31622a;
    }

    public static final z EmailSignUpFormUI$lambda$12$0$0$5$0(ho.l lVar, z0 z0Var, String str) {
        str.getClass();
        z0Var.setValue(str);
        lVar.invoke(new am.c(str, 13));
        return z.f31622a;
    }

    public static final z EmailSignUpFormUI$lambda$12$0$0$5$0$0(String str, AuthViewModel authViewModel) {
        authViewModel.getClass();
        authViewModel.onPasswordChanged(str);
        return z.f31622a;
    }

    public static final z EmailSignUpFormUI$lambda$12$0$0$6$0(ho.l lVar, z0 z0Var, String str) {
        str.getClass();
        z0Var.setValue(str);
        lVar.invoke(new am.c(str, 16));
        return z.f31622a;
    }

    public static final z EmailSignUpFormUI$lambda$12$0$0$6$0$0(String str, AuthViewModel authViewModel) {
        authViewModel.getClass();
        authViewModel.onPasswordChanged(str);
        return z.f31622a;
    }

    public static final z EmailSignUpFormUI$lambda$12$0$0$7(SignInState signInState, g0 g0Var, u2.m mVar, int i10) {
        boolean z6;
        boolean z10;
        boolean z11;
        g0Var.getClass();
        u0 u0Var = r1.j.f29228a;
        ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
        int i11 = ElevenLabsTheme.$stable;
        x a10 = w.a(r1.j.g(elevenLabsTheme.getSpacings(mVar, i11).m2353getX2D9Ej5fM()), i3.d.B0, mVar, 0);
        q qVar = (q) mVar;
        int hashCode = Long.hashCode(qVar.T);
        c3.o l4 = qVar.l();
        i3.q qVar2 = i3.q.f13017a;
        t c5 = i3.a.c(qVar2, mVar);
        h4.h.f11920i.getClass();
        h4.f fVar = h4.g.f11903b;
        f2 f2Var = qVar.f33969a;
        qVar.b0();
        if (qVar.S) {
            qVar.k(fVar);
        } else {
            qVar.k0();
        }
        r.J(h4.g.f11907f, a10, mVar);
        r.J(h4.g.f11906e, l4, mVar);
        r.y(mVar, Integer.valueOf(hashCode), h4.g.f11908g);
        r.F(h4.g.f11909h, mVar);
        r.J(h4.g.f11905d, c5, mVar);
        String R = kj.c.R(mVar, R.string.signup_password_requirements_min_characters);
        PasswordValidationResult passwordValidationResult = signInState.getPasswordValidationResult();
        if (passwordValidationResult != null && passwordValidationResult.getHasMinLengthAndLetter()) {
            z6 = true;
        } else {
            z6 = false;
        }
        PasswordRequirementItem(R, z6, mVar, 0);
        String R2 = kj.c.R(mVar, R.string.signup_password_requirements_number);
        PasswordValidationResult passwordValidationResult2 = signInState.getPasswordValidationResult();
        if (passwordValidationResult2 != null && passwordValidationResult2.getHasDigit()) {
            z10 = true;
        } else {
            z10 = false;
        }
        PasswordRequirementItem(R2, z10, mVar, 0);
        String R3 = kj.c.R(mVar, R.string.signup_password_requirements_special_character);
        PasswordValidationResult passwordValidationResult3 = signInState.getPasswordValidationResult();
        if (passwordValidationResult3 != null && passwordValidationResult3.getHasSpecial()) {
            z11 = true;
        } else {
            z11 = false;
        }
        PasswordRequirementItem(R3, z11, mVar, 0);
        qVar.p(true);
        r1.d.g(p2.f(qVar2, elevenLabsTheme.getSpacings(mVar, i11).m2353getX2D9Ej5fM()), mVar);
        return z.f31622a;
    }

    public static final z EmailSignUpFormUI$lambda$12$0$0$8$0(ho.l lVar) {
        lVar.invoke(new n(2));
        return z.f31622a;
    }

    public static final z EmailSignUpFormUI$lambda$12$0$0$8$0$0(AuthViewModel authViewModel) {
        authViewModel.getClass();
        authViewModel.onAgreeToProductUpdatesToggled();
        return z.f31622a;
    }

    public static final z EmailSignUpFormUI$lambda$12$0$0$9$0(ho.l lVar) {
        lVar.invoke(new n(1));
        return z.f31622a;
    }

    public static final z EmailSignUpFormUI$lambda$12$0$0$9$0$0(AuthViewModel authViewModel) {
        authViewModel.getClass();
        authViewModel.onAgreeToTermsToggled();
        return z.f31622a;
    }

    public static final z EmailSignUpFormUI$lambda$13(SignInState signInState, ho.l lVar, ho.a aVar, int i10, int i11, u2.m mVar, int i12) {
        EmailSignUpFormUI(signInState, lVar, aVar, mVar, r.M(i10 | 1), i11);
        return z.f31622a;
    }

    private static final String EmailSignUpFormUI$lambda$3(z0 z0Var) {
        return (String) z0Var.getValue();
    }

    private static final String EmailSignUpFormUI$lambda$6(z0 z0Var) {
        return (String) z0Var.getValue();
    }

    private static final String EmailSignUpFormUI$lambda$9(z0 z0Var) {
        return (String) z0Var.getValue();
    }

    private static final void PasswordRequirementItem(String str, boolean z6, u2.m mVar, int i10) {
        int i11;
        boolean z10;
        v3.f x10;
        long m2186getSecondary0d7_KjU;
        int i12;
        int i13;
        q qVar = (q) mVar;
        qVar.Z(46034711);
        if ((i10 & 6) == 0) {
            if (qVar.f(str)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i11 = i10 | i13;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.g(z6)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i11 |= i12;
        }
        int i14 = i11;
        if ((i14 & 19) != 18) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (qVar.O(i14 & 1, z10)) {
            k2 a10 = i2.a(r1.j.f29228a, i3.d.f13005z0, qVar, 48);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.q qVar2 = i3.q.f13017a;
            t c5 = i3.a.c(qVar2, qVar);
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
            t o6 = p2.o(qVar2, 16);
            if (z6) {
                x10 = m0.f3170a;
                if (x10 == null) {
                    v3.e eVar = new v3.e("Filled.Check", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                    int i15 = v3.g0.f35111a;
                    d1 d1Var = new d1(p3.x.f26427b);
                    ArrayList arrayList = new ArrayList(32);
                    arrayList.add(new v3.n(9.0f, 16.17f));
                    arrayList.add(new v3.m(4.83f, 12.0f));
                    arrayList.add(new v3.u(-1.42f, 1.41f));
                    arrayList.add(new v3.m(9.0f, 19.0f));
                    arrayList.add(new v3.m(21.0f, 7.0f));
                    arrayList.add(new v3.u(-1.41f, -1.41f));
                    arrayList.add(v3.j.f35144c);
                    v3.e.a(eVar, arrayList, d1Var, 2);
                    x10 = eVar.b();
                    m0.f3170a = x10;
                }
            } else {
                x10 = ec.t.x();
            }
            if (z6) {
                qVar.X(-1799459318);
                m2186getSecondary0d7_KjU = ElevenLabsTheme.INSTANCE.getColors(qVar, ElevenLabsTheme.$stable).getIconSuccessTint();
            } else {
                qVar.X(-1799457788);
                m2186getSecondary0d7_KjU = ElevenLabsTheme.INSTANCE.getColor(qVar, ElevenLabsTheme.$stable).getText().m2186getSecondary0d7_KjU();
            }
            qVar.p(false);
            y2.b(x10, null, o6, m2186getSecondary0d7_KjU, qVar, 432, 0);
            ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
            int i16 = ElevenLabsTheme.$stable;
            r1.d.g(p2.s(qVar2, elevenLabsTheme.getSpacings(qVar, i16).m2353getX2D9Ej5fM()), qVar);
            j7.d(str, null, defpackage.f.A(elevenLabsTheme, qVar, i16), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar, i16).getBodySmall500(), qVar, i14 & 14, 0, 131066);
            qVar = qVar;
            qVar.p(true);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new m(i10, z6, 0, str);
        }
    }

    public static final z PasswordRequirementItem$lambda$1(String str, boolean z6, int i10, u2.m mVar, int i11) {
        PasswordRequirementItem(str, z6, mVar, r.M(i10 | 1));
        return z.f31622a;
    }
}
