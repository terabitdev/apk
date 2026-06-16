package io.elevenlabs.readerapp.ui.screens.anonymous.signin.mfa;

import a2.k3;
import a2.y1;
import a2.z1;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.o;
import androidx.lifecycle.r1;
import c3.k;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.protobuf.c6;
import ho.p;
import i3.t;
import i4.j1;
import i4.l1;
import i4.m2;
import io.elevenlabs.domain.model.MfaState;
import io.elevenlabs.readerapp.R;
import io.elevenlabs.ui.components.BackButtonWithBackgroundKt;
import io.elevenlabs.ui.components.ButtonKt;
import io.elevenlabs.ui.components.FullScreenLoaderKt;
import io.elevenlabs.ui.components.VerificationCodeInputKt;
import io.elevenlabs.ui.components.headers.HeaderActionsKt;
import io.elevenlabs.ui.components.scaffolds.CenteredContentScaffoldKt;
import io.elevenlabs.ui.theme.ElevenLabsTheme;
import io.elevenlabs.ui.theme.ElevenLabsThemeKt;
import io.livekit.android.rpc.RpcError;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.e0;
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
import r1.x0;
import sn.z;
import t2.u;
import u2.l;
import u2.m;
import u2.q;
import u2.r;
import u2.s2;
import u2.z0;
import wq.n;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a5\u0010\u0006\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001aE\u0010\r\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\b2\u001e\u0010\u000b\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\n\u0012\u0004\u0012\u00020\u00010\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0003¢\u0006\u0004\b\r\u0010\u000e\u001a\u000f\u0010\u000f\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0013²\u0006\f\u0010\t\u001a\u00020\b8\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u0012\u001a\u00020\u00118\n@\nX\u008a\u008e\u0002"}, d2 = {"Lkotlin/Function0;", "Lsn/z;", "onCloseSuccess", "onCloseDismiss", "Lio/elevenlabs/readerapp/ui/screens/anonymous/signin/mfa/MfaVerificationViewModel;", "vm", "MfaVerificationScreen", "(Lho/a;Lho/a;Lio/elevenlabs/readerapp/ui/screens/anonymous/signin/mfa/MfaVerificationViewModel;Lu2/m;II)V", "Lio/elevenlabs/readerapp/ui/screens/anonymous/signin/mfa/MfaVerificationState;", RemoteConfigConstants.ResponseFieldKey.STATE, "Lkotlin/Function1;", "action", "onDismiss", "MfaVerificationScreenUi", "(Lio/elevenlabs/readerapp/ui/screens/anonymous/signin/mfa/MfaVerificationState;Lho/l;Lho/a;Lu2/m;I)V", "MfaVerificationScreenPreview", "(Lu2/m;I)V", "", "code", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class MfaVerificationScreenKt {
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0074, code lost:
    
        if ((r19 & 4) != 0) goto L118;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void MfaVerificationScreen(ho.a aVar, ho.a aVar2, MfaVerificationViewModel mfaVerificationViewModel, m mVar, int i10, int i11) {
        int i12;
        MfaVerificationViewModel mfaVerificationViewModel2;
        boolean z6;
        q7.c cVar;
        int i13;
        int i14;
        int i15;
        aVar.getClass();
        aVar2.getClass();
        q qVar = (q) mVar;
        qVar.Z(-580431770);
        if ((i10 & 6) == 0) {
            if (qVar.h(aVar)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i12 = i15 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.h(aVar2)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
        }
        if ((i10 & 384) == 0) {
            if ((i11 & 4) == 0) {
                mfaVerificationViewModel2 = mfaVerificationViewModel;
                if (qVar.h(mfaVerificationViewModel2)) {
                    i13 = RpcError.MAX_MESSAGE_BYTES;
                    i12 |= i13;
                }
            } else {
                mfaVerificationViewModel2 = mfaVerificationViewModel;
            }
            i13 = 128;
            i12 |= i13;
        } else {
            mfaVerificationViewModel2 = mfaVerificationViewModel;
        }
        boolean z10 = true;
        if ((i12 & 147) != 146) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i12 & 1, z6)) {
            qVar.T();
            if ((i10 & 1) != 0 && !qVar.y()) {
                qVar.R();
            } else {
                if ((i11 & 4) != 0) {
                    r1 a10 = r7.a.a(qVar);
                    if (a10 != null) {
                        pl.f o6 = tb.a.o(a10, qVar);
                        if (a10 instanceof o) {
                            cVar = ((o) a10).getDefaultViewModelCreationExtras();
                        } else {
                            cVar = q7.a.f28123b;
                        }
                        mfaVerificationViewModel2 = (MfaVerificationViewModel) gg.b.j0(e0.f20562a.b(MfaVerificationViewModel.class), a10, null, o6, cVar, qVar);
                        i12 &= -897;
                    } else {
                        c6.x("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        return;
                    }
                }
                qVar.q();
                z0 o10 = r.o(mfaVerificationViewModel2.getStateFlow(), qVar, 0);
                Context context = (Context) qVar.j(AndroidCompositionLocals_androidKt.f2291b);
                boolean h10 = qVar.h(mfaVerificationViewModel2) | qVar.h(context);
                Object L = qVar.L();
                u2.e eVar = l.f33918a;
                if (h10 || L == eVar) {
                    L = new MfaVerificationScreenKt$MfaVerificationScreen$1$1(mfaVerificationViewModel2, context, null);
                    qVar.h0(L);
                }
                r.f((p) L, z.f31622a, qVar);
                Boolean valueOf = Boolean.valueOf(MfaVerificationScreen$lambda$0(o10).getCloseScreenOnSuccess());
                boolean f10 = qVar.f(o10) | qVar.h(mfaVerificationViewModel2);
                if ((i12 & 14) != 4) {
                    z10 = false;
                }
                boolean z11 = f10 | z10;
                Object L2 = qVar.L();
                if (z11 || L2 == eVar) {
                    L2 = new MfaVerificationScreenKt$MfaVerificationScreen$2$1(mfaVerificationViewModel2, aVar, o10, null);
                    qVar.h0(L2);
                }
                r.f((p) L2, valueOf, qVar);
                MfaVerificationState MfaVerificationScreen$lambda$0 = MfaVerificationScreen$lambda$0(o10);
                boolean h11 = qVar.h(mfaVerificationViewModel2);
                Object L3 = qVar.L();
                if (h11 || L3 == eVar) {
                    L3 = new j(mfaVerificationViewModel2, 2);
                    qVar.h0(L3);
                }
                MfaVerificationScreenUi(MfaVerificationScreen$lambda$0, (ho.l) L3, aVar2, qVar, (i12 << 3) & 896);
            }
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new fm.f(aVar, aVar2, mfaVerificationViewModel2, i10, i11, 19);
        }
    }

    public static final MfaVerificationState MfaVerificationScreen$lambda$0(s2 s2Var) {
        return (MfaVerificationState) s2Var.getValue();
    }

    public static final z MfaVerificationScreen$lambda$3$0(MfaVerificationViewModel mfaVerificationViewModel, ho.l lVar) {
        lVar.getClass();
        lVar.invoke(mfaVerificationViewModel);
        return z.f31622a;
    }

    public static final z MfaVerificationScreen$lambda$4(ho.a aVar, ho.a aVar2, MfaVerificationViewModel mfaVerificationViewModel, int i10, int i11, m mVar, int i12) {
        MfaVerificationScreen(aVar, aVar2, mfaVerificationViewModel, mVar, r.M(i10 | 1), i11);
        return z.f31622a;
    }

    public static final void MfaVerificationScreenPreview(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(195458101);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            ElevenLabsThemeKt.ElevenLabsTheme(false, ComposableSingletons$MfaVerificationScreenKt.INSTANCE.m1185getLambda$2011307041$app_productionRelease(), qVar, 48, 1);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new d(i10, 0);
        }
    }

    public static final z MfaVerificationScreenPreview$lambda$0(int i10, m mVar, int i11) {
        MfaVerificationScreenPreview(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void MfaVerificationScreenUi(MfaVerificationState mfaVerificationState, ho.l lVar, final ho.a aVar, m mVar, int i10) {
        int i11;
        boolean z6;
        int i12;
        int i13;
        int i14;
        q qVar = (q) mVar;
        qVar.Z(-1241581284);
        if ((i10 & 6) == 0) {
            if (qVar.h(mfaVerificationState)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i11 = i14 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.h(lVar)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i11 |= i13;
        }
        if ((i10 & 384) == 0) {
            if (qVar.h(aVar)) {
                i12 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i12 = 128;
            }
            i11 |= i12;
        }
        if ((i11 & 147) != 146) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i11 & 1, z6)) {
            m2 m2Var = (m2) qVar.j(j1.f13137p);
            Object L = qVar.L();
            if (L == l.f33918a) {
                L = r.A("");
                qVar.h0(L);
            }
            z0 z0Var = (z0) L;
            WeakHashMap weakHashMap = c3.f29142x;
            CenteredContentScaffoldKt.CenteredContentScaffold(null, k.d(1430273867, true, new p() { // from class: io.elevenlabs.readerapp.ui.screens.anonymous.signin.mfa.h
                @Override // ho.p
                public final Object invoke(Object obj, Object obj2) {
                    z MfaVerificationScreenUi$lambda$3;
                    int intValue = ((Integer) obj2).intValue();
                    MfaVerificationScreenUi$lambda$3 = MfaVerificationScreenKt.MfaVerificationScreenUi$lambda$3(ho.a.this, (m) obj, intValue);
                    return MfaVerificationScreenUi$lambda$3;
                }
            }, qVar), u0.e(qVar).f29154l, k.d(1356689289, true, new h2.d(3, lVar, mfaVerificationState, m2Var, z0Var), qVar), qVar, 3120, 1);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new k3(i10, 9, lVar, (Object) mfaVerificationState, (Object) aVar);
        }
    }

    private static final String MfaVerificationScreenUi$lambda$1(z0 z0Var) {
        return (String) z0Var.getValue();
    }

    public static final z MfaVerificationScreenUi$lambda$3(final ho.a aVar, m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            HeaderActionsKt.HeaderActions((t) null, (String) null, k.d(1459239312, true, new ho.q() { // from class: io.elevenlabs.readerapp.ui.screens.anonymous.signin.mfa.e
                @Override // ho.q
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    z MfaVerificationScreenUi$lambda$3$0;
                    int intValue = ((Integer) obj3).intValue();
                    MfaVerificationScreenUi$lambda$3$0 = MfaVerificationScreenKt.MfaVerificationScreenUi$lambda$3$0(ho.a.this, (l2) obj, (m) obj2, intValue);
                    return MfaVerificationScreenUi$lambda$3$0;
                }
            }, qVar), (ho.q) null, (i3.f) null, qVar, 384, 27);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z MfaVerificationScreenUi$lambda$3$0(ho.a aVar, l2 l2Var, m mVar, int i10) {
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

    public static final z MfaVerificationScreenUi$lambda$4(MfaVerificationState mfaVerificationState, final m2 m2Var, final ho.l lVar, final z0 z0Var, m mVar, int i10) {
        boolean z6;
        int i11;
        int i12;
        boolean z10;
        z zVar;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        boolean O = qVar.O(i10 & 1, z6);
        z zVar2 = z.f31622a;
        if (O) {
            if (mfaVerificationState.isInitializing()) {
                qVar.X(1488390379);
                FullScreenLoaderKt.m1838FullScreenLoaderFNF3uiM(true, null, 0L, qVar, 6, 6);
                qVar.p(false);
                return zVar2;
            }
            qVar.X(1488547022);
            i3.q qVar2 = i3.q.f13017a;
            float f10 = 20;
            t I = r1.d.I(r1.d.G(p2.e(qVar2, 1.0f), f10, u.P, 2), u.P, u.P, u.P, f10, 7);
            x a10 = w.a(r1.j.f29230c, i3.d.C0, qVar, 48);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            t c5 = i3.a.c(I, qVar);
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
            MfaState mfaState = mfaVerificationState.getMfaState();
            if (!(mfaState instanceof MfaState.PhonePending) && !(mfaState instanceof MfaState.Phone)) {
                if (mfaState instanceof MfaState.Totp) {
                    i11 = R.string.verify_authenticator;
                } else if (mfaState == null) {
                    i11 = R.string.verify_phone;
                } else {
                    c6.p();
                    return null;
                }
            } else {
                i11 = R.string.verify_phone;
            }
            String R = kj.c.R(qVar, i11);
            x0 x0Var = new x0(i3.d.B0);
            ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
            int i13 = ElevenLabsTheme.$stable;
            j7.d(R, x0Var, 0L, 0L, null, 0L, new e5.k(5), 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar, i13).getTitleLarge700Inter(), qVar, 0, 0, 130044);
            ib.i.C(elevenLabsTheme, qVar, i13, qVar2, qVar);
            MfaState mfaState2 = mfaVerificationState.getMfaState();
            if (!(mfaState2 instanceof MfaState.PhonePending) && !(mfaState2 instanceof MfaState.Phone)) {
                if (mfaState2 instanceof MfaState.Totp) {
                    i12 = R.string.verify_authenticator_subtitle;
                } else if (mfaState2 == null) {
                    i12 = R.string.verify_phone_you_will_receive_text;
                } else {
                    c6.p();
                    return null;
                }
            } else {
                i12 = R.string.verify_phone_you_will_receive_text;
            }
            j7.d(kj.c.R(qVar, i12), null, defpackage.f.A(elevenLabsTheme, qVar, i13), 0L, null, 0L, new e5.k(5), 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar, i13).getBodyLarge400(), qVar, 0, 0, 130042);
            r1.d.g(p2.f(qVar2, 48), qVar);
            Object L = qVar.L();
            u2.e eVar = l.f33918a;
            if (L == eVar) {
                L = new v();
                qVar.h0(L);
            }
            v vVar = (v) L;
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new MfaVerificationScreenKt$MfaVerificationScreenUi$2$1$1$1(vVar, null);
                qVar.h0(L2);
            }
            r.f((p) L2, zVar2, qVar);
            String MfaVerificationScreenUi$lambda$1 = MfaVerificationScreenUi$lambda$1(z0Var);
            boolean f11 = qVar.f(m2Var) | qVar.f(lVar);
            Object L3 = qVar.L();
            if (f11 || L3 == eVar) {
                final int i14 = 0;
                L3 = new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.anonymous.signin.mfa.c
                    @Override // ho.l
                    public final Object invoke(Object obj) {
                        z MfaVerificationScreenUi$lambda$4$0$2$0;
                        z MfaVerificationScreenUi$lambda$4$0$3$0;
                        switch (i14) {
                            case 0:
                                MfaVerificationScreenUi$lambda$4$0$2$0 = MfaVerificationScreenKt.MfaVerificationScreenUi$lambda$4$0$2$0(m2Var, lVar, z0Var, (y1) obj);
                                return MfaVerificationScreenUi$lambda$4$0$2$0;
                            default:
                                MfaVerificationScreenUi$lambda$4$0$3$0 = MfaVerificationScreenKt.MfaVerificationScreenUi$lambda$4$0$3$0(m2Var, lVar, z0Var, (String) obj);
                                return MfaVerificationScreenUi$lambda$4$0$3$0;
                        }
                    }
                };
                qVar.h0(L3);
            }
            z1 z1Var = new z1((ho.l) L3, null, null, 62);
            t j4 = n3.d.j(p2.e(qVar2, 1.0f), vVar);
            boolean f12 = qVar.f(m2Var) | qVar.f(lVar);
            Object L4 = qVar.L();
            if (f12 || L4 == eVar) {
                final int i15 = 1;
                L4 = new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.anonymous.signin.mfa.c
                    @Override // ho.l
                    public final Object invoke(Object obj) {
                        z MfaVerificationScreenUi$lambda$4$0$2$0;
                        z MfaVerificationScreenUi$lambda$4$0$3$0;
                        switch (i15) {
                            case 0:
                                MfaVerificationScreenUi$lambda$4$0$2$0 = MfaVerificationScreenKt.MfaVerificationScreenUi$lambda$4$0$2$0(m2Var, lVar, z0Var, (y1) obj);
                                return MfaVerificationScreenUi$lambda$4$0$2$0;
                            default:
                                MfaVerificationScreenUi$lambda$4$0$3$0 = MfaVerificationScreenKt.MfaVerificationScreenUi$lambda$4$0$3$0(m2Var, lVar, z0Var, (String) obj);
                                return MfaVerificationScreenUi$lambda$4$0$3$0;
                        }
                    }
                };
                qVar.h0(L4);
            }
            VerificationCodeInputKt.VerificationCodeInput("", MfaVerificationScreenUi$lambda$1, (ho.l) L4, 6, j4, z1Var, qVar, 3078, 0);
            if (1.0f <= 0.0d) {
                s1.a.a("invalid weight; must be greater than zero");
            }
            float f13 = Float.MAX_VALUE;
            if (1.0f <= Float.MAX_VALUE) {
                f13 = 1.0f;
            }
            r1.d.g(new m1(f13, true), qVar);
            String R2 = kj.c.R(qVar, R.string.verify_code);
            if (MfaVerificationScreenUi$lambda$1(z0Var).length() == 6) {
                z10 = true;
            } else {
                z10 = false;
            }
            boolean isLoadingVerifyingCode = mfaVerificationState.isLoadingVerifyingCode();
            t e10 = p2.e(qVar2, 1.0f);
            boolean h10 = qVar.h(mfaVerificationState) | qVar.f(m2Var) | qVar.f(lVar);
            Object L5 = qVar.L();
            if (!h10 && L5 != eVar) {
                zVar = zVar2;
            } else {
                zVar = zVar2;
                f fVar2 = new f(mfaVerificationState, m2Var, lVar, z0Var, 0);
                qVar.h0(fVar2);
                L5 = fVar2;
            }
            ButtonKt.Button(R2, (ho.a) L5, e10, null, null, null, null, isLoadingVerifyingCode, z10, false, qVar, 384, 632);
            qVar.p(true);
            qVar.p(false);
            return zVar;
        }
        qVar.R();
        return zVar2;
    }

    public static final z MfaVerificationScreenUi$lambda$4$0$2$0(m2 m2Var, ho.l lVar, z0 z0Var, y1 y1Var) {
        y1Var.getClass();
        if (m2Var != null) {
            ((l1) m2Var).a();
        }
        if (MfaVerificationScreenUi$lambda$1(z0Var).length() == 6) {
            lVar.invoke(new g(z0Var, 1));
        }
        return z.f31622a;
    }

    public static final z MfaVerificationScreenUi$lambda$4$0$2$0$0(z0 z0Var, MfaVerificationViewModel mfaVerificationViewModel) {
        mfaVerificationViewModel.getClass();
        mfaVerificationViewModel.onSubmitCode(MfaVerificationScreenUi$lambda$1(z0Var));
        return z.f31622a;
    }

    public static final z MfaVerificationScreenUi$lambda$4$0$3$0(m2 m2Var, ho.l lVar, z0 z0Var, String str) {
        str.getClass();
        z0Var.setValue(n.J0(6, str));
        if (str.length() == 6) {
            if (m2Var != null) {
                ((l1) m2Var).a();
            }
            lVar.invoke(new j(str, 1));
        }
        return z.f31622a;
    }

    public static final z MfaVerificationScreenUi$lambda$4$0$3$0$0(String str, MfaVerificationViewModel mfaVerificationViewModel) {
        mfaVerificationViewModel.getClass();
        mfaVerificationViewModel.onSubmitCode(str);
        return z.f31622a;
    }

    public static final z MfaVerificationScreenUi$lambda$4$0$4$0(MfaVerificationState mfaVerificationState, m2 m2Var, ho.l lVar, z0 z0Var) {
        if (!mfaVerificationState.isLoadingVerifyingCode()) {
            if (m2Var != null) {
                ((l1) m2Var).a();
            }
            lVar.invoke(new g(z0Var, 0));
        }
        return z.f31622a;
    }

    public static final z MfaVerificationScreenUi$lambda$4$0$4$0$0(z0 z0Var, MfaVerificationViewModel mfaVerificationViewModel) {
        mfaVerificationViewModel.getClass();
        mfaVerificationViewModel.onSubmitCode(MfaVerificationScreenUi$lambda$1(z0Var));
        return z.f31622a;
    }

    public static final z MfaVerificationScreenUi$lambda$5(MfaVerificationState mfaVerificationState, ho.l lVar, ho.a aVar, int i10, m mVar, int i11) {
        MfaVerificationScreenUi(mfaVerificationState, lVar, aVar, mVar, r.M(i10 | 1));
        return z.f31622a;
    }
}
