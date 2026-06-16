package io.elevenlabs.readerapp.ui.screens.anonymous.signin;

import android.content.Context;
import android.os.Bundle;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.o;
import androidx.lifecycle.r1;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.protobuf.c6;
import fr.d0;
import fr.g0;
import ho.p;
import i4.w1;
import io.elevenlabs.domain.Analytics;
import io.elevenlabs.domain.model.PasswordValidationResult;
import io.elevenlabs.readerapp.R;
import io.elevenlabs.readerapp.ui.components.u0;
import io.elevenlabs.ui.components.ConfirmationDialogKt;
import io.elevenlabs.ui.components.FullScreenLoaderKt;
import io.livekit.android.rpc.RpcError;
import kotlin.Metadata;
import kotlin.jvm.internal.e0;
import livekit.LivekitInternal$NodeStats;
import q6.t;
import sn.z;
import u2.q;
import u2.r;
import u2.z0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\u001am\u0010\r\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000e\u001a\u001f\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u001ay\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00132 \b\u0002\u0010\u0015\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0004\u0012\u00020\u00040\u00022\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006H\u0003¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u000f\u0010\u001b\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u000f\u0010\u001d\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001d\u0010\u001c\u001a\u000f\u0010\u001e\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001e\u0010\u001c\u001a\u000f\u0010\u001f\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001f\u0010\u001c¨\u0006\"²\u0006\u000e\u0010!\u001a\u00020 8\n@\nX\u008a\u008e\u0002"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/anonymous/signin/SignInMode;", "signInMode", "Lkotlin/Function1;", "", "Lsn/z;", "onNavigateToVerifyEmail", "Lkotlin/Function0;", "onNavigateToEmailSignIn", "onNavigateToEmailSignUp", "onNavigateToMfaVerification", "onGoBack", "Lio/elevenlabs/readerapp/ui/screens/anonymous/signin/AuthViewModel;", "vm", "AuthScreen", "(Lio/elevenlabs/readerapp/ui/screens/anonymous/signin/SignInMode;Lho/l;Lho/a;Lho/a;Lho/a;Lho/a;Lio/elevenlabs/readerapp/ui/screens/anonymous/signin/AuthViewModel;Lu2/m;II)V", "Lq6/t;", "result", "handleCredentialResult", "(Lq6/t;Lio/elevenlabs/readerapp/ui/screens/anonymous/signin/AuthViewModel;)V", "Lio/elevenlabs/readerapp/ui/screens/anonymous/signin/SignInState;", RemoteConfigConstants.ResponseFieldKey.STATE, "action", "onSignInWithGoogleClick", "onLoginClick", "onSignUpWithEmailClick", "AuthScreenUI", "(Lio/elevenlabs/readerapp/ui/screens/anonymous/signin/SignInState;Lho/l;Lho/a;Lho/a;Lho/a;Lho/a;Lu2/m;II)V", "Preview_SignInScreen_Intro", "(Lu2/m;I)V", "Preview_SignInScreen_EmailSignUp", "Preview_SignInScreen_EmailSignUp_PasswordRequirements", "Preview_SignInScreen_EmailSignIn", "", "showTerms", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class AuthScreenKt {

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SignInMode.values().length];
            try {
                iArr[SignInMode.INTRO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SignInMode.SIGN_IN_EMAIL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SignInMode.SIGN_UP_EMAIL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x023a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AuthScreen(SignInMode signInMode, ho.l lVar, final ho.a aVar, final ho.a aVar2, ho.a aVar3, ho.a aVar4, AuthViewModel authViewModel, u2.m mVar, int i10, int i11) {
        int i12;
        AuthViewModel authViewModel2;
        boolean z6;
        AuthViewModel authViewModel3;
        q7.c cVar;
        AuthViewModel authViewModel4;
        SignInState signInState;
        Context context;
        Object L;
        u2.e eVar;
        d0 d0Var;
        boolean f10;
        Object L2;
        boolean z10;
        boolean z11;
        Object L3;
        boolean h10;
        Object L4;
        d0 d0Var2;
        Context context2;
        SignInState signInState2;
        final AuthViewModel authViewModel5;
        boolean z12;
        boolean h11;
        Object L5;
        boolean z13;
        boolean h12;
        Object L6;
        Object L7;
        final z0 z0Var;
        boolean h13;
        Object L8;
        boolean h14;
        Object L9;
        boolean z14;
        boolean z15;
        Object L10;
        boolean z16;
        Object L11;
        AuthViewModel authViewModel6;
        q qVar;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        signInMode.getClass();
        lVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        aVar3.getClass();
        aVar4.getClass();
        q qVar2 = (q) mVar;
        qVar2.Z(-965079705);
        if ((i10 & 6) == 0) {
            if (qVar2.d(signInMode.ordinal())) {
                i19 = 4;
            } else {
                i19 = 2;
            }
            i12 = i19 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar2.h(lVar)) {
                i18 = 32;
            } else {
                i18 = 16;
            }
            i12 |= i18;
        }
        if ((i10 & 384) == 0) {
            if (qVar2.h(aVar)) {
                i17 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i17 = 128;
            }
            i12 |= i17;
        }
        if ((i10 & 3072) == 0) {
            if (qVar2.h(aVar2)) {
                i16 = 2048;
            } else {
                i16 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i12 |= i16;
        }
        if ((i10 & 24576) == 0) {
            if (qVar2.h(aVar3)) {
                i15 = 16384;
            } else {
                i15 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
            }
            i12 |= i15;
        }
        if ((196608 & i10) == 0) {
            if (qVar2.h(aVar4)) {
                i14 = 131072;
            } else {
                i14 = 65536;
            }
            i12 |= i14;
        }
        if ((1572864 & i10) == 0) {
            if ((i11 & 64) == 0) {
                authViewModel2 = authViewModel;
                if (qVar2.h(authViewModel2)) {
                    i13 = 1048576;
                    i12 |= i13;
                }
            } else {
                authViewModel2 = authViewModel;
            }
            i13 = 524288;
            i12 |= i13;
        } else {
            authViewModel2 = authViewModel;
        }
        boolean z17 = true;
        if ((599187 & i12) != 599186) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar2.O(i12 & 1, z6)) {
            qVar2.T();
            if ((i10 & 1) != 0 && !qVar2.y()) {
                qVar2.R();
                if ((i11 & 64) != 0) {
                    i12 &= -3670017;
                }
            } else if ((i11 & 64) != 0) {
                r1 a10 = r7.a.a(qVar2);
                if (a10 != null) {
                    pl.f o6 = tb.a.o(a10, qVar2);
                    if (a10 instanceof o) {
                        cVar = ((o) a10).getDefaultViewModelCreationExtras();
                    } else {
                        cVar = q7.a.f28123b;
                    }
                    i12 &= -3670017;
                    authViewModel4 = (AuthViewModel) gg.b.j0(e0.f20562a.b(AuthViewModel.class), a10, null, o6, cVar, qVar2);
                    qVar2.q();
                    signInState = (SignInState) r.o(authViewModel4.getStateFlow(), qVar2, 0).getValue();
                    context = (Context) qVar2.j(AndroidCompositionLocals_androidKt.f2291b);
                    L = qVar2.L();
                    eVar = u2.l.f33918a;
                    if (L == eVar) {
                        L = r.q(qVar2);
                        qVar2.h0(L);
                    }
                    d0Var = (d0) L;
                    f10 = qVar2.f(context);
                    L2 = qVar2.L();
                    if (!f10 || L2 == eVar) {
                        context.getClass();
                        L2 = new Object();
                        qVar2.h0(L2);
                    }
                    q6.j jVar = (q6.j) L2;
                    boolean h15 = qVar2.h(authViewModel4);
                    if ((i12 & 14) != 4) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    z11 = h15 | z10;
                    L3 = qVar2.L();
                    if (!z11 || L3 == eVar) {
                        L3 = new AuthScreenKt$AuthScreen$1$1(authViewModel4, signInMode, null);
                        qVar2.h0(L3);
                    }
                    r.f((p) L3, signInMode, qVar2);
                    Boolean valueOf = Boolean.valueOf(signInState.getShowHCaptcha());
                    h10 = qVar2.h(signInState) | qVar2.h(d0Var) | qVar2.h(context) | qVar2.h(authViewModel4);
                    L4 = qVar2.L();
                    if (h10 && L4 != eVar) {
                        AuthViewModel authViewModel7 = authViewModel4;
                        signInState2 = signInState;
                        authViewModel5 = authViewModel7;
                        d0Var2 = d0Var;
                        context2 = context;
                    } else {
                        AuthViewModel authViewModel8 = authViewModel4;
                        d0Var2 = d0Var;
                        context2 = context;
                        L4 = new AuthScreenKt$AuthScreen$2$1(signInState, d0Var2, context2, authViewModel8, null);
                        signInState2 = signInState;
                        authViewModel5 = authViewModel8;
                        qVar2.h0(L4);
                    }
                    r.f((p) L4, valueOf, qVar2);
                    String navigateToEmailVerification = signInState2.getNavigateToEmailVerification();
                    boolean h16 = qVar2.h(signInState2);
                    if ((i12 & 112) != 32) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    h11 = h16 | z12 | qVar2.h(authViewModel5);
                    L5 = qVar2.L();
                    if (!h11 || L5 == eVar) {
                        L5 = new AuthScreenKt$AuthScreen$3$1(signInState2, lVar, authViewModel5, null);
                        qVar2.h0(L5);
                    }
                    r.f((p) L5, navigateToEmailVerification, qVar2);
                    Boolean valueOf2 = Boolean.valueOf(signInState2.getNavigateToMfaVerification());
                    boolean h17 = qVar2.h(signInState2);
                    if ((57344 & i12) != 16384) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    h12 = h17 | z13 | qVar2.h(authViewModel5);
                    L6 = qVar2.L();
                    if (!h12 || L6 == eVar) {
                        L6 = new AuthScreenKt$AuthScreen$4$1(signInState2, aVar3, authViewModel5, null);
                        qVar2.h0(L6);
                    }
                    r.f((p) L6, valueOf2, qVar2);
                    L7 = qVar2.L();
                    if (L7 == eVar) {
                        L7 = r.A(Boolean.FALSE);
                        qVar2.h0(L7);
                    }
                    z0Var = (z0) L7;
                    h13 = qVar2.h(authViewModel5);
                    L8 = qVar2.L();
                    if (!h13 || L8 == eVar) {
                        L8 = new a(authViewModel5, 0);
                        qVar2.h0(L8);
                    }
                    ho.l lVar2 = (ho.l) L8;
                    h14 = qVar2.h(authViewModel5);
                    L9 = qVar2.L();
                    if (!h14 || L9 == eVar) {
                        final int i20 = 0;
                        L9 = new ho.a() { // from class: io.elevenlabs.readerapp.ui.screens.anonymous.signin.b
                            @Override // ho.a
                            public final Object invoke() {
                                z AuthScreen$lambda$9$0;
                                z AuthScreen$lambda$12$0;
                                switch (i20) {
                                    case 0:
                                        AuthScreen$lambda$9$0 = AuthScreenKt.AuthScreen$lambda$9$0(authViewModel5, z0Var);
                                        return AuthScreen$lambda$9$0;
                                    default:
                                        AuthScreen$lambda$12$0 = AuthScreenKt.AuthScreen$lambda$12$0(authViewModel5, z0Var);
                                        return AuthScreen$lambda$12$0;
                                }
                            }
                        };
                        qVar2.h0(L9);
                    }
                    ho.a aVar5 = (ho.a) L9;
                    boolean h18 = qVar2.h(authViewModel5);
                    if ((i12 & 896) != 256) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    z15 = z14 | h18;
                    L10 = qVar2.L();
                    if (!z15 || L10 == eVar) {
                        final int i21 = 0;
                        L10 = new ho.a() { // from class: io.elevenlabs.readerapp.ui.screens.anonymous.signin.c
                            @Override // ho.a
                            public final Object invoke() {
                                z AuthScreen$lambda$10$0;
                                z AuthScreen$lambda$11$0;
                                switch (i21) {
                                    case 0:
                                        AuthScreen$lambda$10$0 = AuthScreenKt.AuthScreen$lambda$10$0(authViewModel5, aVar);
                                        return AuthScreen$lambda$10$0;
                                    default:
                                        AuthScreen$lambda$11$0 = AuthScreenKt.AuthScreen$lambda$11$0(authViewModel5, aVar);
                                        return AuthScreen$lambda$11$0;
                                }
                            }
                        };
                        qVar2.h0(L10);
                    }
                    ho.a aVar6 = (ho.a) L10;
                    boolean h19 = qVar2.h(authViewModel5);
                    int i22 = i12;
                    if ((i12 & 7168) != 2048) {
                        z17 = false;
                    }
                    z16 = h19 | z17;
                    L11 = qVar2.L();
                    if (!z16 || L11 == eVar) {
                        final int i23 = 1;
                        L11 = new ho.a() { // from class: io.elevenlabs.readerapp.ui.screens.anonymous.signin.c
                            @Override // ho.a
                            public final Object invoke() {
                                z AuthScreen$lambda$10$0;
                                z AuthScreen$lambda$11$0;
                                switch (i23) {
                                    case 0:
                                        AuthScreen$lambda$10$0 = AuthScreenKt.AuthScreen$lambda$10$0(authViewModel5, aVar2);
                                        return AuthScreen$lambda$10$0;
                                    default:
                                        AuthScreen$lambda$11$0 = AuthScreenKt.AuthScreen$lambda$11$0(authViewModel5, aVar2);
                                        return AuthScreen$lambda$11$0;
                                }
                            }
                        };
                        qVar2.h0(L11);
                    }
                    final AuthViewModel authViewModel9 = authViewModel5;
                    d0 d0Var3 = d0Var2;
                    Context context3 = context2;
                    AuthScreenUI(signInState2, lVar2, aVar5, aVar6, (ho.a) L11, aVar4, qVar2, i22 & 458752, 0);
                    if (!AuthScreen$lambda$6(z0Var)) {
                        qVar2.X(-176404483);
                        String R = kj.c.R(qVar2, R.string.signin_continue_with_title);
                        String R2 = kj.c.R(qVar2, R.string.signin_continue_with_google_text);
                        String R3 = kj.c.R(qVar2, R.string.common_cancel);
                        String R4 = kj.c.R(qVar2, R.string.signin_continue_with_agree_with_terms);
                        boolean h20 = qVar2.h(authViewModel9);
                        Object L12 = qVar2.L();
                        if (h20 || L12 == eVar) {
                            final int i24 = 1;
                            L12 = new ho.a() { // from class: io.elevenlabs.readerapp.ui.screens.anonymous.signin.b
                                @Override // ho.a
                                public final Object invoke() {
                                    z AuthScreen$lambda$9$0;
                                    z AuthScreen$lambda$12$0;
                                    switch (i24) {
                                        case 0:
                                            AuthScreen$lambda$9$0 = AuthScreenKt.AuthScreen$lambda$9$0(authViewModel9, z0Var);
                                            return AuthScreen$lambda$9$0;
                                        default:
                                            AuthScreen$lambda$12$0 = AuthScreenKt.AuthScreen$lambda$12$0(authViewModel9, z0Var);
                                            return AuthScreen$lambda$12$0;
                                    }
                                }
                            };
                            qVar2.h0(L12);
                        }
                        ho.a aVar7 = (ho.a) L12;
                        boolean h21 = qVar2.h(authViewModel9) | qVar2.h(d0Var3) | qVar2.h(context3) | qVar2.h(jVar);
                        Object L13 = qVar2.L();
                        if (!h21 && L13 != eVar) {
                            authViewModel6 = authViewModel9;
                            qVar = qVar2;
                        } else {
                            qVar = qVar2;
                            d dVar = new d(authViewModel9, d0Var3, z0Var, context3, jVar, 0);
                            authViewModel6 = authViewModel9;
                            qVar.h0(dVar);
                            L13 = dVar;
                        }
                        q qVar3 = qVar;
                        ConfirmationDialogKt.ConfirmationDialog(aVar7, (ho.a) L13, R, R2, R3, R4, false, qVar3, 1572864, 0);
                        qVar2 = qVar3;
                        qVar2.p(false);
                    } else {
                        authViewModel6 = authViewModel9;
                        qVar2 = qVar2;
                        qVar2.X(-174709093);
                        qVar2.p(false);
                    }
                    authViewModel3 = authViewModel6;
                } else {
                    c6.x("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
            }
            authViewModel4 = authViewModel2;
            qVar2.q();
            signInState = (SignInState) r.o(authViewModel4.getStateFlow(), qVar2, 0).getValue();
            context = (Context) qVar2.j(AndroidCompositionLocals_androidKt.f2291b);
            L = qVar2.L();
            eVar = u2.l.f33918a;
            if (L == eVar) {
            }
            d0Var = (d0) L;
            f10 = qVar2.f(context);
            L2 = qVar2.L();
            if (!f10) {
            }
            context.getClass();
            L2 = new Object();
            qVar2.h0(L2);
            q6.j jVar2 = (q6.j) L2;
            boolean h152 = qVar2.h(authViewModel4);
            if ((i12 & 14) != 4) {
            }
            z11 = h152 | z10;
            L3 = qVar2.L();
            if (!z11) {
            }
            L3 = new AuthScreenKt$AuthScreen$1$1(authViewModel4, signInMode, null);
            qVar2.h0(L3);
            r.f((p) L3, signInMode, qVar2);
            Boolean valueOf3 = Boolean.valueOf(signInState.getShowHCaptcha());
            h10 = qVar2.h(signInState) | qVar2.h(d0Var) | qVar2.h(context) | qVar2.h(authViewModel4);
            L4 = qVar2.L();
            if (h10) {
            }
            AuthViewModel authViewModel82 = authViewModel4;
            d0Var2 = d0Var;
            context2 = context;
            L4 = new AuthScreenKt$AuthScreen$2$1(signInState, d0Var2, context2, authViewModel82, null);
            signInState2 = signInState;
            authViewModel5 = authViewModel82;
            qVar2.h0(L4);
            r.f((p) L4, valueOf3, qVar2);
            String navigateToEmailVerification2 = signInState2.getNavigateToEmailVerification();
            boolean h162 = qVar2.h(signInState2);
            if ((i12 & 112) != 32) {
            }
            h11 = h162 | z12 | qVar2.h(authViewModel5);
            L5 = qVar2.L();
            if (!h11) {
            }
            L5 = new AuthScreenKt$AuthScreen$3$1(signInState2, lVar, authViewModel5, null);
            qVar2.h0(L5);
            r.f((p) L5, navigateToEmailVerification2, qVar2);
            Boolean valueOf22 = Boolean.valueOf(signInState2.getNavigateToMfaVerification());
            boolean h172 = qVar2.h(signInState2);
            if ((57344 & i12) != 16384) {
            }
            h12 = h172 | z13 | qVar2.h(authViewModel5);
            L6 = qVar2.L();
            if (!h12) {
            }
            L6 = new AuthScreenKt$AuthScreen$4$1(signInState2, aVar3, authViewModel5, null);
            qVar2.h0(L6);
            r.f((p) L6, valueOf22, qVar2);
            L7 = qVar2.L();
            if (L7 == eVar) {
            }
            z0Var = (z0) L7;
            h13 = qVar2.h(authViewModel5);
            L8 = qVar2.L();
            if (!h13) {
            }
            L8 = new a(authViewModel5, 0);
            qVar2.h0(L8);
            ho.l lVar22 = (ho.l) L8;
            h14 = qVar2.h(authViewModel5);
            L9 = qVar2.L();
            if (!h14) {
            }
            final int i202 = 0;
            L9 = new ho.a() { // from class: io.elevenlabs.readerapp.ui.screens.anonymous.signin.b
                @Override // ho.a
                public final Object invoke() {
                    z AuthScreen$lambda$9$0;
                    z AuthScreen$lambda$12$0;
                    switch (i202) {
                        case 0:
                            AuthScreen$lambda$9$0 = AuthScreenKt.AuthScreen$lambda$9$0(authViewModel5, z0Var);
                            return AuthScreen$lambda$9$0;
                        default:
                            AuthScreen$lambda$12$0 = AuthScreenKt.AuthScreen$lambda$12$0(authViewModel5, z0Var);
                            return AuthScreen$lambda$12$0;
                    }
                }
            };
            qVar2.h0(L9);
            ho.a aVar52 = (ho.a) L9;
            boolean h182 = qVar2.h(authViewModel5);
            if ((i12 & 896) != 256) {
            }
            z15 = z14 | h182;
            L10 = qVar2.L();
            if (!z15) {
            }
            final int i212 = 0;
            L10 = new ho.a() { // from class: io.elevenlabs.readerapp.ui.screens.anonymous.signin.c
                @Override // ho.a
                public final Object invoke() {
                    z AuthScreen$lambda$10$0;
                    z AuthScreen$lambda$11$0;
                    switch (i212) {
                        case 0:
                            AuthScreen$lambda$10$0 = AuthScreenKt.AuthScreen$lambda$10$0(authViewModel5, aVar);
                            return AuthScreen$lambda$10$0;
                        default:
                            AuthScreen$lambda$11$0 = AuthScreenKt.AuthScreen$lambda$11$0(authViewModel5, aVar);
                            return AuthScreen$lambda$11$0;
                    }
                }
            };
            qVar2.h0(L10);
            ho.a aVar62 = (ho.a) L10;
            boolean h192 = qVar2.h(authViewModel5);
            int i222 = i12;
            if ((i12 & 7168) != 2048) {
            }
            z16 = h192 | z17;
            L11 = qVar2.L();
            if (!z16) {
            }
            final int i232 = 1;
            L11 = new ho.a() { // from class: io.elevenlabs.readerapp.ui.screens.anonymous.signin.c
                @Override // ho.a
                public final Object invoke() {
                    z AuthScreen$lambda$10$0;
                    z AuthScreen$lambda$11$0;
                    switch (i232) {
                        case 0:
                            AuthScreen$lambda$10$0 = AuthScreenKt.AuthScreen$lambda$10$0(authViewModel5, aVar2);
                            return AuthScreen$lambda$10$0;
                        default:
                            AuthScreen$lambda$11$0 = AuthScreenKt.AuthScreen$lambda$11$0(authViewModel5, aVar2);
                            return AuthScreen$lambda$11$0;
                    }
                }
            };
            qVar2.h0(L11);
            final AuthViewModel authViewModel92 = authViewModel5;
            d0 d0Var32 = d0Var2;
            Context context32 = context2;
            AuthScreenUI(signInState2, lVar22, aVar52, aVar62, (ho.a) L11, aVar4, qVar2, i222 & 458752, 0);
            if (!AuthScreen$lambda$6(z0Var)) {
            }
            authViewModel3 = authViewModel6;
        } else {
            qVar2.R();
            authViewModel3 = authViewModel2;
        }
        u2.r1 r10 = qVar2.r();
        if (r10 != null) {
            r10.f34012d = new fm.c(signInMode, lVar, aVar, aVar2, aVar3, aVar4, authViewModel3, i10, i11);
        }
    }

    public static final z AuthScreen$lambda$10$0(AuthViewModel authViewModel, ho.a aVar) {
        authViewModel.getAnalytics().log(Analytics.Event.SignupClickedLoginWithEmail.INSTANCE);
        aVar.invoke();
        return z.f31622a;
    }

    public static final z AuthScreen$lambda$11$0(AuthViewModel authViewModel, ho.a aVar) {
        authViewModel.getAnalytics().log(Analytics.Event.SignupClickedSignupWithEmail.INSTANCE);
        aVar.invoke();
        return z.f31622a;
    }

    public static final z AuthScreen$lambda$12$0(AuthViewModel authViewModel, z0 z0Var) {
        authViewModel.getAnalytics().log(Analytics.Event.LoginWithGoogleTermsCanceled.INSTANCE);
        AuthScreen$lambda$7(z0Var, false);
        return z.f31622a;
    }

    public static final z AuthScreen$lambda$13$0(AuthViewModel authViewModel, d0 d0Var, z0 z0Var, Context context, q6.j jVar) {
        AuthScreen$lambda$7(z0Var, false);
        authViewModel.onGoogleSignInStarted();
        g0.D(d0Var, null, null, new AuthScreenKt$AuthScreen$10$1$1(context, jVar, authViewModel, null), 3);
        return z.f31622a;
    }

    public static final z AuthScreen$lambda$14(SignInMode signInMode, ho.l lVar, ho.a aVar, ho.a aVar2, ho.a aVar3, ho.a aVar4, AuthViewModel authViewModel, int i10, int i11, u2.m mVar, int i12) {
        AuthScreen(signInMode, lVar, aVar, aVar2, aVar3, aVar4, authViewModel, mVar, r.M(i10 | 1), i11);
        return z.f31622a;
    }

    private static final boolean AuthScreen$lambda$6(z0 z0Var) {
        return ((Boolean) z0Var.getValue()).booleanValue();
    }

    private static final void AuthScreen$lambda$7(z0 z0Var, boolean z6) {
        z0Var.setValue(Boolean.valueOf(z6));
    }

    public static final z AuthScreen$lambda$8$0(AuthViewModel authViewModel, ho.l lVar) {
        lVar.getClass();
        lVar.invoke(authViewModel);
        return z.f31622a;
    }

    public static final z AuthScreen$lambda$9$0(AuthViewModel authViewModel, z0 z0Var) {
        authViewModel.getAnalytics().log(Analytics.Event.SignupClickedLoginWithGoogle.INSTANCE);
        AuthScreen$lambda$7(z0Var, true);
        return z.f31622a;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AuthScreenUI(SignInState signInState, ho.l lVar, ho.a aVar, ho.a aVar2, ho.a aVar3, ho.a aVar4, u2.m mVar, int i10, int i11) {
        SignInState signInState2;
        int i12;
        ho.l lVar2;
        int i13;
        int i14;
        ho.a aVar5;
        int i15;
        int i16;
        ho.a aVar6;
        int i17;
        int i18;
        ho.a aVar7;
        int i19;
        int i20;
        ho.a aVar8;
        int i21;
        boolean z6;
        ho.l lVar3;
        ho.a aVar9;
        ho.a aVar10;
        ho.a aVar11;
        ho.a aVar12;
        u2.r1 r10;
        ho.l lVar4;
        ho.l lVar5;
        ho.a aVar13;
        ho.a aVar14;
        ho.a aVar15;
        ho.a aVar16;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        int i22;
        q qVar = (q) mVar;
        qVar.Z(1861534697);
        if ((i10 & 6) == 0) {
            signInState2 = signInState;
            if (qVar.h(signInState2)) {
                i22 = 4;
            } else {
                i22 = 2;
            }
            i12 = i22 | i10;
        } else {
            signInState2 = signInState;
            i12 = i10;
        }
        int i23 = i11 & 2;
        if (i23 != 0) {
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
                aVar5 = aVar;
                if (qVar.h(aVar5)) {
                    i15 = RpcError.MAX_MESSAGE_BYTES;
                } else {
                    i15 = 128;
                }
                i12 |= i15;
                i16 = i11 & 8;
                if (i16 != 0) {
                    i12 |= 3072;
                } else if ((i10 & 3072) == 0) {
                    aVar6 = aVar2;
                    if (qVar.h(aVar6)) {
                        i17 = 2048;
                    } else {
                        i17 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                    }
                    i12 |= i17;
                    i18 = i11 & 16;
                    if (i18 == 0) {
                        i12 |= 24576;
                    } else if ((i10 & 24576) == 0) {
                        aVar7 = aVar3;
                        if (qVar.h(aVar7)) {
                            i19 = 16384;
                        } else {
                            i19 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                        }
                        i12 |= i19;
                        i20 = i11 & 32;
                        if (i20 != 0) {
                            i12 |= 196608;
                        } else if ((196608 & i10) == 0) {
                            aVar8 = aVar4;
                            if (qVar.h(aVar8)) {
                                i21 = 131072;
                            } else {
                                i21 = 65536;
                            }
                            i12 |= i21;
                            if ((i12 & 74899) == 74898) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            if (!qVar.O(i12 & 1, z6)) {
                                u2.e eVar = u2.l.f33918a;
                                if (i23 != 0) {
                                    Object L = qVar.L();
                                    if (L == eVar) {
                                        L = new g(1);
                                        qVar.h0(L);
                                    }
                                    lVar4 = (ho.l) L;
                                } else {
                                    lVar4 = lVar2;
                                }
                                if (i14 != 0) {
                                    Object L2 = qVar.L();
                                    if (L2 == eVar) {
                                        L2 = new e(3);
                                        qVar.h0(L2);
                                    }
                                    aVar5 = (ho.a) L2;
                                }
                                if (i16 != 0) {
                                    Object L3 = qVar.L();
                                    if (L3 == eVar) {
                                        L3 = new e(4);
                                        qVar.h0(L3);
                                    }
                                    aVar6 = (ho.a) L3;
                                }
                                if (i18 != 0) {
                                    Object L4 = qVar.L();
                                    if (L4 == eVar) {
                                        L4 = new e(5);
                                        qVar.h0(L4);
                                    }
                                    aVar7 = (ho.a) L4;
                                }
                                if (i20 != 0) {
                                    Object L5 = qVar.L();
                                    if (L5 == eVar) {
                                        L5 = new e(6);
                                        qVar.h0(L5);
                                    }
                                    aVar8 = (ho.a) L5;
                                }
                                int i24 = WhenMappings.$EnumSwitchMapping$0[signInState2.getMode().ordinal()];
                                if (i24 != 1) {
                                    if (i24 != 2) {
                                        if (i24 == 3) {
                                            qVar.X(364739676);
                                            EmailSignUpFormUIKt.EmailSignUpFormUI(signInState2, lVar4, aVar8, qVar, (i12 & 126) | ((i12 >> 9) & 896), 0);
                                            qVar.p(false);
                                            lVar5 = lVar4;
                                            aVar14 = aVar5;
                                            aVar16 = aVar6;
                                            z10 = true;
                                            aVar15 = aVar7;
                                            z11 = false;
                                            aVar13 = aVar8;
                                        } else {
                                            throw com.google.android.gms.internal.play_billing.b.h(-2066508071, qVar, false);
                                        }
                                    } else {
                                        qVar.X(364546236);
                                        ho.l lVar6 = lVar4;
                                        ho.a aVar17 = aVar8;
                                        EmailSignInFormUIKt.EmailSignInFormUI(signInState, lVar6, aVar17, qVar, (i12 & 126) | ((i12 >> 9) & 896), 0);
                                        lVar5 = lVar6;
                                        aVar13 = aVar17;
                                        qVar.p(false);
                                        aVar14 = aVar5;
                                        aVar16 = aVar6;
                                        z10 = true;
                                        aVar15 = aVar7;
                                        z11 = false;
                                    }
                                } else {
                                    lVar5 = lVar4;
                                    aVar13 = aVar8;
                                    qVar.X(362793093);
                                    ho.a aVar18 = aVar5;
                                    ho.a aVar19 = aVar6;
                                    ho.a aVar20 = aVar7;
                                    SignInIntroUIKt.SignInIntroUI(aVar18, aVar20, aVar19, qVar, ((i12 >> 6) & 14) | ((i12 >> 9) & 112) | ((i12 >> 3) & 896), 0);
                                    aVar14 = aVar18;
                                    aVar15 = aVar20;
                                    aVar16 = aVar19;
                                    if (signInState.isAccountBanned()) {
                                        qVar.X(363034521);
                                        String R = kj.c.R(qVar, R.string.common_ok);
                                        int i25 = i12 & 112;
                                        if (i25 == 32) {
                                            z16 = true;
                                        } else {
                                            z16 = false;
                                        }
                                        Object L6 = qVar.L();
                                        if (z16 || L6 == eVar) {
                                            L6 = new id.z(lVar5, 12);
                                            qVar.h0(L6);
                                        }
                                        ho.a aVar21 = (ho.a) L6;
                                        if (i25 == 32) {
                                            z17 = true;
                                        } else {
                                            z17 = false;
                                        }
                                        Object L7 = qVar.L();
                                        if (z17 || L7 == eVar) {
                                            L7 = new id.z(lVar5, 13);
                                            qVar.h0(L7);
                                        }
                                        z10 = true;
                                        z11 = false;
                                        ConfirmationDialogKt.ConfirmationDialog(aVar21, (ho.a) L7, ComposableSingletons$AuthScreenKt.INSTANCE.m1174getLambda$121414390$app_productionRelease(), null, R, false, qVar, 200064, 0);
                                        qVar = qVar;
                                        qVar.p(false);
                                    } else {
                                        z10 = true;
                                        z11 = false;
                                        if (signInState.isAccountDeleted()) {
                                            qVar.X(363696991);
                                            String R2 = kj.c.R(qVar, R.string.signin_error_account_deleted);
                                            String R3 = kj.c.R(qVar, R.string.common_ok);
                                            int i26 = i12 & 112;
                                            if (i26 == 32) {
                                                z14 = true;
                                            } else {
                                                z14 = false;
                                            }
                                            Object L8 = qVar.L();
                                            if (z14 || L8 == eVar) {
                                                L8 = new id.z(lVar5, 14);
                                                qVar.h0(L8);
                                            }
                                            ho.a aVar22 = (ho.a) L8;
                                            if (i26 == 32) {
                                                z15 = true;
                                            } else {
                                                z15 = false;
                                            }
                                            Object L9 = qVar.L();
                                            if (z15 || L9 == eVar) {
                                                L9 = new id.z(lVar5, 9);
                                                qVar.h0(L9);
                                            }
                                            ConfirmationDialogKt.ConfirmationDialog(aVar22, (ho.a) L9, null, R2, null, R3, false, qVar, 1597440, 4);
                                            qVar.p(false);
                                        } else if (!wq.n.m0(signInState.getError())) {
                                            qVar.X(364168501);
                                            String error = signInState.getError();
                                            String R4 = kj.c.R(qVar, R.string.common_ok);
                                            int i27 = i12 & 112;
                                            if (i27 == 32) {
                                                z12 = true;
                                            } else {
                                                z12 = false;
                                            }
                                            Object L10 = qVar.L();
                                            if (z12 || L10 == eVar) {
                                                L10 = new id.z(lVar5, 10);
                                                qVar.h0(L10);
                                            }
                                            ho.a aVar23 = (ho.a) L10;
                                            if (i27 == 32) {
                                                z13 = true;
                                            } else {
                                                z13 = false;
                                            }
                                            Object L11 = qVar.L();
                                            if (z13 || L11 == eVar) {
                                                L11 = new id.z(lVar5, 11);
                                                qVar.h0(L11);
                                            }
                                            ConfirmationDialogKt.ConfirmationDialog(aVar23, (ho.a) L11, null, error, null, R4, false, qVar, 24576, 68);
                                            qVar.p(false);
                                        } else {
                                            qVar.X(364493753);
                                            qVar.p(false);
                                        }
                                    }
                                    qVar.p(z11);
                                }
                                if (!signInState.isLoadingPasswordReset() && !signInState.isLoadingAuth()) {
                                    z18 = z11;
                                } else {
                                    z18 = z10;
                                }
                                FullScreenLoaderKt.m1838FullScreenLoaderFNF3uiM(z18, null, 0L, qVar, 0, 6);
                                lVar3 = lVar5;
                                aVar12 = aVar13;
                                aVar9 = aVar14;
                                aVar10 = aVar16;
                                aVar11 = aVar15;
                            } else {
                                qVar.R();
                                lVar3 = lVar2;
                                aVar9 = aVar5;
                                aVar10 = aVar6;
                                aVar11 = aVar7;
                                aVar12 = aVar8;
                            }
                            r10 = qVar.r();
                            if (r10 == null) {
                                r10.f34012d = new u0(signInState, lVar3, aVar9, aVar10, aVar11, aVar12, i10, i11, 1);
                                return;
                            }
                            return;
                        }
                        aVar8 = aVar4;
                        if ((i12 & 74899) == 74898) {
                        }
                        if (!qVar.O(i12 & 1, z6)) {
                        }
                        r10 = qVar.r();
                        if (r10 == null) {
                        }
                    }
                    aVar7 = aVar3;
                    i20 = i11 & 32;
                    if (i20 != 0) {
                    }
                    aVar8 = aVar4;
                    if ((i12 & 74899) == 74898) {
                    }
                    if (!qVar.O(i12 & 1, z6)) {
                    }
                    r10 = qVar.r();
                    if (r10 == null) {
                    }
                }
                aVar6 = aVar2;
                i18 = i11 & 16;
                if (i18 == 0) {
                }
                aVar7 = aVar3;
                i20 = i11 & 32;
                if (i20 != 0) {
                }
                aVar8 = aVar4;
                if ((i12 & 74899) == 74898) {
                }
                if (!qVar.O(i12 & 1, z6)) {
                }
                r10 = qVar.r();
                if (r10 == null) {
                }
            }
            aVar5 = aVar;
            i16 = i11 & 8;
            if (i16 != 0) {
            }
            aVar6 = aVar2;
            i18 = i11 & 16;
            if (i18 == 0) {
            }
            aVar7 = aVar3;
            i20 = i11 & 32;
            if (i20 != 0) {
            }
            aVar8 = aVar4;
            if ((i12 & 74899) == 74898) {
            }
            if (!qVar.O(i12 & 1, z6)) {
            }
            r10 = qVar.r();
            if (r10 == null) {
            }
        }
        lVar2 = lVar;
        i14 = i11 & 4;
        if (i14 == 0) {
        }
        aVar5 = aVar;
        i16 = i11 & 8;
        if (i16 != 0) {
        }
        aVar6 = aVar2;
        i18 = i11 & 16;
        if (i18 == 0) {
        }
        aVar7 = aVar3;
        i20 = i11 & 32;
        if (i20 != 0) {
        }
        aVar8 = aVar4;
        if ((i12 & 74899) == 74898) {
        }
        if (!qVar.O(i12 & 1, z6)) {
        }
        r10 = qVar.r();
        if (r10 == null) {
        }
    }

    public static final z AuthScreenUI$lambda$0$0(ho.l lVar) {
        lVar.getClass();
        return z.f31622a;
    }

    public static final z AuthScreenUI$lambda$10$0(ho.l lVar) {
        lVar.invoke(new g(5));
        return z.f31622a;
    }

    public static final z AuthScreenUI$lambda$10$0$0(AuthViewModel authViewModel) {
        authViewModel.getClass();
        authViewModel.onErrorDismiss();
        return z.f31622a;
    }

    public static final z AuthScreenUI$lambda$11(SignInState signInState, ho.l lVar, ho.a aVar, ho.a aVar2, ho.a aVar3, ho.a aVar4, int i10, int i11, u2.m mVar, int i12) {
        AuthScreenUI(signInState, lVar, aVar, aVar2, aVar3, aVar4, mVar, r.M(i10 | 1), i11);
        return z.f31622a;
    }

    public static final z AuthScreenUI$lambda$5$0(ho.l lVar) {
        lVar.invoke(new g(8));
        return z.f31622a;
    }

    public static final z AuthScreenUI$lambda$5$0$0(AuthViewModel authViewModel) {
        authViewModel.getClass();
        authViewModel.onErrorDismiss();
        return z.f31622a;
    }

    public static final z AuthScreenUI$lambda$6$0(ho.l lVar) {
        lVar.invoke(new g(2));
        return z.f31622a;
    }

    public static final z AuthScreenUI$lambda$6$0$0(AuthViewModel authViewModel) {
        authViewModel.getClass();
        authViewModel.onErrorDismiss();
        return z.f31622a;
    }

    public static final z AuthScreenUI$lambda$7$0(ho.l lVar) {
        lVar.invoke(new g(4));
        return z.f31622a;
    }

    public static final z AuthScreenUI$lambda$7$0$0(AuthViewModel authViewModel) {
        authViewModel.getClass();
        authViewModel.onErrorDismiss();
        return z.f31622a;
    }

    public static final z AuthScreenUI$lambda$8$0(ho.l lVar) {
        lVar.invoke(new g(7));
        return z.f31622a;
    }

    public static final z AuthScreenUI$lambda$8$0$0(AuthViewModel authViewModel) {
        authViewModel.getClass();
        authViewModel.onErrorDismiss();
        return z.f31622a;
    }

    public static final z AuthScreenUI$lambda$9$0(ho.l lVar) {
        lVar.invoke(new g(10));
        return z.f31622a;
    }

    public static final z AuthScreenUI$lambda$9$0$0(AuthViewModel authViewModel) {
        authViewModel.getClass();
        authViewModel.onErrorDismiss();
        return z.f31622a;
    }

    public static final void Preview_SignInScreen_EmailSignIn(u2.m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(-1437414683);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            SignInState signInState = new SignInState(null, false, false, false, false, SignInMode.SIGN_IN_EMAIL, null, null, null, null, false, false, null, false, false, 32735, null);
            Object L = qVar.L();
            u2.e eVar = u2.l.f33918a;
            if (L == eVar) {
                L = new g(3);
                qVar.h0(L);
            }
            ho.l lVar = (ho.l) L;
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new e(0);
                qVar.h0(L2);
            }
            AuthScreenUI(signInState, lVar, (ho.a) L2, null, null, null, qVar, 432, 56);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.components.explore.g(i10, 25);
        }
    }

    public static final z Preview_SignInScreen_EmailSignIn$lambda$0$0(ho.l lVar) {
        lVar.getClass();
        return z.f31622a;
    }

    public static final z Preview_SignInScreen_EmailSignIn$lambda$2(int i10, u2.m mVar, int i11) {
        Preview_SignInScreen_EmailSignIn(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_SignInScreen_EmailSignUp(u2.m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(-511454161);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            SignInState signInState = new SignInState(null, false, false, false, false, SignInMode.SIGN_UP_EMAIL, null, null, null, null, false, false, null, false, false, 32735, null);
            Object L = qVar.L();
            u2.e eVar = u2.l.f33918a;
            if (L == eVar) {
                L = new g(6);
                qVar.h0(L);
            }
            ho.l lVar = (ho.l) L;
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new e(1);
                qVar.h0(L2);
            }
            AuthScreenUI(signInState, lVar, (ho.a) L2, null, null, null, qVar, 432, 56);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.components.explore.g(i10, 26);
        }
    }

    public static final z Preview_SignInScreen_EmailSignUp$lambda$0$0(ho.l lVar) {
        lVar.getClass();
        return z.f31622a;
    }

    public static final z Preview_SignInScreen_EmailSignUp$lambda$2(int i10, u2.m mVar, int i11) {
        Preview_SignInScreen_EmailSignUp(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_SignInScreen_EmailSignUp_PasswordRequirements(u2.m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(-747655371);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            SignInState signInState = new SignInState(null, false, false, false, false, SignInMode.SIGN_UP_EMAIL, null, null, "foobar1", new PasswordValidationResult(false, true, false), false, false, null, false, false, 31967, null);
            Object L = qVar.L();
            u2.e eVar = u2.l.f33918a;
            if (L == eVar) {
                L = new g(9);
                qVar.h0(L);
            }
            ho.l lVar = (ho.l) L;
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new e(2);
                qVar.h0(L2);
            }
            AuthScreenUI(signInState, lVar, (ho.a) L2, null, null, null, qVar, 432, 56);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.components.explore.g(i10, 27);
        }
    }

    public static final z Preview_SignInScreen_EmailSignUp_PasswordRequirements$lambda$0$0(ho.l lVar) {
        lVar.getClass();
        return z.f31622a;
    }

    public static final z Preview_SignInScreen_EmailSignUp_PasswordRequirements$lambda$2(int i10, u2.m mVar, int i11) {
        Preview_SignInScreen_EmailSignUp_PasswordRequirements(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_SignInScreen_Intro(u2.m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(-1684980297);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            r.a(w1.f13252a.a(Boolean.TRUE), ComposableSingletons$AuthScreenKt.INSTANCE.m1175getLambda$1228332425$app_productionRelease(), qVar, 56);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.components.explore.g(i10, 28);
        }
    }

    public static final z Preview_SignInScreen_Intro$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_SignInScreen_Intro(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void handleCredentialResult(t tVar, AuthViewModel authViewModel) {
        String str;
        f9.e eVar = tVar.f28122a;
        if (eVar instanceof xg.c) {
            str = ((xg.c) eVar).f37963b;
        } else {
            try {
                str = android.support.v4.media.session.b.k((Bundle) eVar.f9212a).f37963b;
            } catch (Exception e10) {
                authViewModel.onGoogleSignInError(new IllegalStateException("Unexpected credential type: ".concat(eVar.getClass().getSimpleName()), e10));
                return;
            }
        }
        authViewModel.onGoogleIdTokenReceived(str);
    }
}
