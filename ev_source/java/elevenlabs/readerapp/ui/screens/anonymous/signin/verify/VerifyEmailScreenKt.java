package io.elevenlabs.readerapp.ui.screens.anonymous.signin.verify;

import a2.y1;
import a2.z1;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.lifecycle.o;
import c3.k;
import c4.l0;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.protobuf.c6;
import f4.f1;
import h4.g;
import h4.h;
import ho.p;
import i3.t;
import i4.e1;
import i4.j1;
import i4.l1;
import i4.m2;
import ib.i;
import io.elevenlabs.readerapp.R;
import io.elevenlabs.ui.components.BackButtonWithBackgroundKt;
import io.elevenlabs.ui.components.ButtonKt;
import io.elevenlabs.ui.components.ButtonVariant;
import io.elevenlabs.ui.components.FullScreenLoaderKt;
import io.elevenlabs.ui.components.VerificationCodeInputKt;
import io.elevenlabs.ui.components.headers.HeaderActionsKt;
import io.elevenlabs.ui.components.scaffolds.CenteredContentScaffoldKt;
import io.elevenlabs.ui.theme.ElevenLabsTheme;
import io.livekit.android.room.SignalClient;
import io.livekit.android.rpc.RpcError;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.e0;
import l1.n;
import livekit.LivekitInternal$NodeStats;
import n3.v;
import p3.h0;
import q2.j7;
import r1.c3;
import r1.j;
import r1.l2;
import r1.m1;
import r1.p2;
import r1.u0;
import r1.w;
import r1.x;
import sn.z;
import t2.u;
import u2.l;
import u2.m;
import u2.q;
import u2.r;
import u2.r1;
import u2.z0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u001a=\u0010\b\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¢\u0006\u0004\b\b\u0010\t\u001aI\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\n2 \b\u0002\u0010\r\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\f\u0012\u0004\u0012\u00020\u00010\f2\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0003¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u000f\u0010\u0010\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u000f\u0010\u0012\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0012\u0010\u0011\u001a\u000f\u0010\u0013\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0013\u0010\u0011\u001a\u000f\u0010\u0014\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0014\u0010\u0011¨\u0006\u0016²\u0006\u000e\u0010\u0015\u001a\u00020\u00038\n@\nX\u008a\u008e\u0002"}, d2 = {"Lkotlin/Function0;", "Lsn/z;", "onClose", "", "email", "Lio/elevenlabs/readerapp/ui/screens/anonymous/signin/verify/VerifyEmailViewModel;", "vm", "onNavigateToSignIn", "VerifyEmailScreen", "(Lho/a;Ljava/lang/String;Lio/elevenlabs/readerapp/ui/screens/anonymous/signin/verify/VerifyEmailViewModel;Lho/a;Lu2/m;II)V", "Lio/elevenlabs/readerapp/ui/screens/anonymous/signin/verify/VerifyEmailState;", RemoteConfigConstants.ResponseFieldKey.STATE, "Lkotlin/Function1;", "action", "VerifyEmailScreenUI", "(Lio/elevenlabs/readerapp/ui/screens/anonymous/signin/verify/VerifyEmailState;Lho/l;Lho/a;Lu2/m;II)V", "Preview_VerifyEmailScreen_Idle", "(Lu2/m;I)V", "Preview_VerifyEmailScreen_Filled", "Preview_VerifyEmailScreen_Submitting", "Preview_VerifyEmailScreen_Loading", "input", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class VerifyEmailScreenKt {
    public static final void Preview_VerifyEmailScreen_Filled(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(-2138531216);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            VerifyEmailScreenUI(new VerifyEmailState(false, false, null, "123456", false, 23, null), null, null, qVar, 0, 6);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.anonymous.signin.mfa.d(i10, 1);
        }
    }

    public static final z Preview_VerifyEmailScreen_Filled$lambda$0(int i10, m mVar, int i11) {
        Preview_VerifyEmailScreen_Filled(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_VerifyEmailScreen_Idle(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(-560500610);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            VerifyEmailState verifyEmailState = new VerifyEmailState(false, false, null, null, false, 31, null);
            Object L = qVar.L();
            u2.e eVar = l.f33918a;
            if (L == eVar) {
                L = new f(7);
                qVar.h0(L);
            }
            ho.l lVar = (ho.l) L;
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new b(1);
                qVar.h0(L2);
            }
            VerifyEmailScreenUI(verifyEmailState, lVar, (ho.a) L2, qVar, 432, 0);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.anonymous.signin.mfa.d(i10, 3);
        }
    }

    public static final z Preview_VerifyEmailScreen_Idle$lambda$0$0(ho.l lVar) {
        lVar.getClass();
        return z.f31622a;
    }

    public static final z Preview_VerifyEmailScreen_Idle$lambda$2(int i10, m mVar, int i11) {
        Preview_VerifyEmailScreen_Idle(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_VerifyEmailScreen_Loading(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(1045642144);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            VerifyEmailScreenUI(new VerifyEmailState(true, false, null, null, false, 30, null), null, null, qVar, 0, 6);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.anonymous.signin.mfa.d(i10, 2);
        }
    }

    public static final z Preview_VerifyEmailScreen_Loading$lambda$0(int i10, m mVar, int i11) {
        Preview_VerifyEmailScreen_Loading(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_VerifyEmailScreen_Submitting(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(-2609460);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            VerifyEmailScreenUI(new VerifyEmailState(false, true, null, "123456", false, 21, null), null, null, qVar, 0, 6);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.anonymous.signin.mfa.d(i10, 4);
        }
    }

    public static final z Preview_VerifyEmailScreen_Submitting$lambda$0(int i10, m mVar, int i11) {
        Preview_VerifyEmailScreen_Submitting(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void VerifyEmailScreen(ho.a aVar, String str, VerifyEmailViewModel verifyEmailViewModel, ho.a aVar2, m mVar, int i10, int i11) {
        int i12;
        VerifyEmailViewModel verifyEmailViewModel2;
        boolean z6;
        q qVar;
        q qVar2;
        q7.c cVar;
        boolean z10;
        boolean z11;
        Object L;
        boolean z12;
        Object L2;
        boolean h10;
        Object L3;
        int i13;
        int i14;
        int i15;
        int i16;
        aVar.getClass();
        str.getClass();
        aVar2.getClass();
        q qVar3 = (q) mVar;
        qVar3.Z(-180936084);
        if ((i10 & 6) == 0) {
            if (qVar3.h(aVar)) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i12 = i16 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar3.f(str)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i12 |= i15;
        }
        if ((i10 & 384) == 0) {
            if ((i11 & 4) == 0) {
                verifyEmailViewModel2 = verifyEmailViewModel;
                if (qVar3.h(verifyEmailViewModel2)) {
                    i14 = RpcError.MAX_MESSAGE_BYTES;
                    i12 |= i14;
                }
            } else {
                verifyEmailViewModel2 = verifyEmailViewModel;
            }
            i14 = 128;
            i12 |= i14;
        } else {
            verifyEmailViewModel2 = verifyEmailViewModel;
        }
        if ((i10 & 3072) == 0) {
            if (qVar3.h(aVar2)) {
                i13 = 2048;
            } else {
                i13 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i12 |= i13;
        }
        boolean z13 = true;
        if ((i12 & 1171) != 1170) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar3.O(i12 & 1, z6)) {
            qVar3.T();
            if ((i10 & 1) != 0 && !qVar3.y()) {
                qVar3.R();
                if ((i11 & 4) != 0) {
                    i12 &= -897;
                }
            } else if ((i11 & 4) != 0) {
                androidx.lifecycle.r1 a10 = r7.a.a(qVar3);
                if (a10 != null) {
                    qVar2 = qVar3;
                    pl.f o6 = tb.a.o(a10, qVar2);
                    if (a10 instanceof o) {
                        cVar = ((o) a10).getDefaultViewModelCreationExtras();
                    } else {
                        cVar = q7.a.f28123b;
                    }
                    verifyEmailViewModel2 = (VerifyEmailViewModel) gg.b.j0(e0.f20562a.b(VerifyEmailViewModel.class), a10, null, o6, cVar, qVar2);
                    i12 &= -897;
                    qVar2.q();
                    boolean h11 = qVar2.h(verifyEmailViewModel2);
                    if ((i12 & 112) != 32) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    z11 = h11 | z10;
                    L = qVar2.L();
                    Object obj = l.f33918a;
                    if (!z11 || L == obj) {
                        L = new VerifyEmailScreenKt$VerifyEmailScreen$1$1(verifyEmailViewModel2, str, null);
                        qVar2.h0(L);
                    }
                    r.f((p) L, str, qVar2);
                    VerifyEmailState verifyEmailState = (VerifyEmailState) r.o(verifyEmailViewModel2.getStateFlow(), qVar2, 0).getValue();
                    Boolean valueOf = Boolean.valueOf(verifyEmailState.getNavigateToSignIn());
                    boolean f10 = qVar2.f(verifyEmailState);
                    if ((i12 & 7168) != 2048) {
                        z13 = false;
                    }
                    z12 = f10 | z13;
                    L2 = qVar2.L();
                    if (!z12 || L2 == obj) {
                        L2 = new VerifyEmailScreenKt$VerifyEmailScreen$2$1(verifyEmailState, aVar2, null);
                        qVar2.h0(L2);
                    }
                    r.f((p) L2, valueOf, qVar2);
                    h10 = qVar2.h(verifyEmailViewModel2);
                    L3 = qVar2.L();
                    if (!h10 || L3 == obj) {
                        L3 = new d(verifyEmailViewModel2, 0);
                        qVar2.h0(L3);
                    }
                    q qVar4 = qVar2;
                    VerifyEmailScreenUI(verifyEmailState, (ho.l) L3, aVar, qVar4, (i12 << 6) & 896, 0);
                    qVar = qVar4;
                } else {
                    c6.x("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
            }
            qVar2 = qVar3;
            qVar2.q();
            boolean h112 = qVar2.h(verifyEmailViewModel2);
            if ((i12 & 112) != 32) {
            }
            z11 = h112 | z10;
            L = qVar2.L();
            Object obj2 = l.f33918a;
            if (!z11) {
            }
            L = new VerifyEmailScreenKt$VerifyEmailScreen$1$1(verifyEmailViewModel2, str, null);
            qVar2.h0(L);
            r.f((p) L, str, qVar2);
            VerifyEmailState verifyEmailState2 = (VerifyEmailState) r.o(verifyEmailViewModel2.getStateFlow(), qVar2, 0).getValue();
            Boolean valueOf2 = Boolean.valueOf(verifyEmailState2.getNavigateToSignIn());
            boolean f102 = qVar2.f(verifyEmailState2);
            if ((i12 & 7168) != 2048) {
            }
            z12 = f102 | z13;
            L2 = qVar2.L();
            if (!z12) {
            }
            L2 = new VerifyEmailScreenKt$VerifyEmailScreen$2$1(verifyEmailState2, aVar2, null);
            qVar2.h0(L2);
            r.f((p) L2, valueOf2, qVar2);
            h10 = qVar2.h(verifyEmailViewModel2);
            L3 = qVar2.L();
            if (!h10) {
            }
            L3 = new d(verifyEmailViewModel2, 0);
            qVar2.h0(L3);
            q qVar42 = qVar2;
            VerifyEmailScreenUI(verifyEmailState2, (ho.l) L3, aVar, qVar42, (i12 << 6) & 896, 0);
            qVar = qVar42;
        } else {
            qVar = qVar3;
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.core.l(aVar, (Object) str, (Object) verifyEmailViewModel2, (Object) aVar2, i10, i11, 3);
        }
    }

    public static final z VerifyEmailScreen$lambda$2$0(VerifyEmailViewModel verifyEmailViewModel, ho.l lVar) {
        lVar.getClass();
        lVar.invoke(verifyEmailViewModel);
        return z.f31622a;
    }

    public static final z VerifyEmailScreen$lambda$3(ho.a aVar, String str, VerifyEmailViewModel verifyEmailViewModel, ho.a aVar2, int i10, int i11, m mVar, int i12) {
        VerifyEmailScreen(aVar, str, verifyEmailViewModel, aVar2, mVar, r.M(i10 | 1), i11);
        return z.f31622a;
    }

    private static final void VerifyEmailScreenUI(final VerifyEmailState verifyEmailState, final ho.l lVar, ho.a aVar, m mVar, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        boolean z6;
        int i15;
        q qVar = (q) mVar;
        qVar.Z(669978745);
        if ((i10 & 6) == 0) {
            if (qVar.f(verifyEmailState)) {
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
            u2.e eVar = l.f33918a;
            if (i16 != 0) {
                Object L = qVar.L();
                if (L == eVar) {
                    L = new f(8);
                    qVar.h0(L);
                }
                lVar = (ho.l) L;
            }
            if (i17 != 0) {
                Object L2 = qVar.L();
                if (L2 == eVar) {
                    L2 = new b(0);
                    qVar.h0(L2);
                }
                aVar = (ho.a) L2;
            }
            WeakHashMap weakHashMap = c3.f29142x;
            CenteredContentScaffoldKt.CenteredContentScaffold(null, k.d(1001408874, true, new hm.a(3, aVar), qVar), u0.e(qVar).f29154l, k.d(993409900, true, new p() { // from class: io.elevenlabs.readerapp.ui.screens.anonymous.signin.verify.c
                @Override // ho.p
                public final Object invoke(Object obj, Object obj2) {
                    z VerifyEmailScreenUI$lambda$3;
                    int intValue = ((Integer) obj2).intValue();
                    VerifyEmailScreenUI$lambda$3 = VerifyEmailScreenKt.VerifyEmailScreenUI$lambda$3(VerifyEmailState.this, lVar, (m) obj, intValue);
                    return VerifyEmailScreenUI$lambda$3;
                }
            }, qVar), qVar, 3120, 1);
        } else {
            qVar.R();
        }
        ho.l lVar2 = lVar;
        ho.a aVar2 = aVar;
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new fm.f(verifyEmailState, lVar2, aVar2, i10, i11, 20);
        }
    }

    public static final z VerifyEmailScreenUI$lambda$0$0(ho.l lVar) {
        lVar.getClass();
        return z.f31622a;
    }

    public static final z VerifyEmailScreenUI$lambda$2(ho.a aVar, m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            HeaderActionsKt.HeaderActions((t) null, (String) null, k.d(551009669, true, new defpackage.d(4, aVar), qVar), (ho.q) null, (i3.f) null, qVar, 384, 27);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z VerifyEmailScreenUI$lambda$2$0(ho.a aVar, l2 l2Var, m mVar, int i10) {
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

    public static final z VerifyEmailScreenUI$lambda$3(VerifyEmailState verifyEmailState, ho.l lVar, m mVar, int i10) {
        boolean z6;
        float f10;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        boolean O = qVar.O(i10 & 1, z6);
        z zVar = z.f31622a;
        if (O) {
            i3.q qVar2 = i3.q.f13017a;
            float f11 = 1.0f;
            t y10 = n.y(p2.d(qVar2, 1.0f), n.x(qVar), true, true);
            r1.e eVar = j.f29230c;
            i3.j jVar = i3.d.B0;
            x a10 = w.a(eVar, jVar, qVar, 0);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            t c5 = i3.a.c(y10, qVar);
            h.f11920i.getClass();
            ho.a aVar = g.f11903b;
            qVar.b0();
            if (qVar.S) {
                qVar.k(aVar);
            } else {
                qVar.k0();
            }
            h4.e eVar2 = g.f11907f;
            r.J(eVar2, a10, qVar);
            h4.e eVar3 = g.f11906e;
            r.J(eVar3, l4, qVar);
            Integer valueOf = Integer.valueOf(hashCode);
            h4.e eVar4 = g.f11908g;
            r.y(qVar, valueOf, eVar4);
            h4.d dVar = g.f11909h;
            r.F(dVar, qVar);
            h4.e eVar5 = g.f11905d;
            r.J(eVar5, c5, qVar);
            t e10 = p2.e(qVar2, 1.0f);
            if (1.0f <= 0.0d) {
                s1.a.a("invalid weight; must be greater than zero");
            }
            if (1.0f > Float.MAX_VALUE) {
                f11 = Float.MAX_VALUE;
            }
            t then = e10.then(new m1(f11, true));
            f1 d10 = r1.p.d(i3.d.f12997a, false);
            int hashCode2 = Long.hashCode(qVar.T);
            c3.o l7 = qVar.l();
            t c10 = i3.a.c(then, qVar);
            qVar.b0();
            if (qVar.S) {
                qVar.k(aVar);
            } else {
                qVar.k0();
            }
            r.J(eVar2, d10, qVar);
            r.J(eVar3, l7, qVar);
            defpackage.f.u(hashCode2, qVar, eVar4, qVar, dVar);
            r.J(eVar5, c10, qVar);
            t d11 = p2.d(qVar2, 1.0f);
            ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
            int i11 = ElevenLabsTheme.$stable;
            t f12 = i.f(elevenLabsTheme, qVar, i11, n.h(d11, i.d(elevenLabsTheme, qVar, i11), h0.f26395b));
            x a11 = w.a(eVar, jVar, qVar, 0);
            int hashCode3 = Long.hashCode(qVar.T);
            c3.o l10 = qVar.l();
            t c11 = i3.a.c(f12, qVar);
            qVar.b0();
            if (qVar.S) {
                qVar.k(aVar);
            } else {
                qVar.k0();
            }
            r.J(eVar2, a11, qVar);
            r.J(eVar3, l10, qVar);
            defpackage.f.u(hashCode3, qVar, eVar4, qVar, dVar);
            r.J(eVar5, c11, qVar);
            j7.d(kj.c.R(qVar, R.string.verify_email_title), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar, i11).getTitleLarge700Inter(), qVar, 0, 0, 131070);
            r1.d.g(p2.f(qVar2, elevenLabsTheme.getSpacings(qVar, i11).m2358getX6D9Ej5fM()), qVar);
            j7.d(kj.c.R(qVar, R.string.verify_email_content), null, 0L, 0L, null, 0L, new e5.k(3), 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar, i11).getBodySmall500(), qVar, 0, 0, 130046);
            r1.d.g(p2.f(qVar2, elevenLabsTheme.getSpacings(qVar, i11).m2358getX6D9Ej5fM()), qVar);
            Object obj = (m2) qVar.j(j1.f13137p);
            Object L = qVar.L();
            Object obj2 = l.f33918a;
            if (L == obj2) {
                L = new v();
                qVar.h0(L);
            }
            v vVar = (v) L;
            Object L2 = qVar.L();
            if (L2 == obj2) {
                L2 = r.A(verifyEmailState.getVerificationCode());
                qVar.h0(L2);
            }
            z0 z0Var = (z0) L2;
            e1 e1Var = (e1) qVar.j(j1.f13126e);
            t j4 = n3.d.j(p2.e(qVar2, 1.0f), vVar);
            boolean h10 = qVar.h(e1Var);
            Object L3 = qVar.L();
            if (h10 || L3 == obj2) {
                L3 = new VerifyEmailScreenKt$VerifyEmailScreenUI$4$1$1$1$1$1(e1Var, z0Var);
                qVar.h0(L3);
            }
            t b10 = l0.b(j4, zVar, (PointerInputEventHandler) L3);
            String VerifyEmailScreenUI$lambda$3$0$0$0$2 = VerifyEmailScreenUI$lambda$3$0$0$0$2(z0Var);
            boolean f13 = qVar.f(obj) | qVar.f(lVar);
            Object L4 = qVar.L();
            if (f13 || L4 == obj2) {
                L4 = new e(obj, lVar, 1);
                qVar.h0(L4);
            }
            z1 z1Var = new z1((ho.l) L4, null, null, 62);
            String R = kj.c.R(qVar, R.string.verify_email_verification_code);
            boolean f14 = qVar.f(lVar);
            Object L5 = qVar.L();
            if (f14 || L5 == obj2) {
                L5 = new e(lVar, z0Var, 2);
                qVar.h0(L5);
            }
            VerificationCodeInputKt.VerificationCodeInput(R, VerifyEmailScreenUI$lambda$3$0$0$0$2, (ho.l) L5, 6, b10, z1Var, qVar, 3072, 0);
            Object L6 = qVar.L();
            if (L6 == obj2) {
                L6 = new VerifyEmailScreenKt$VerifyEmailScreenUI$4$1$1$1$4$1(vVar, null);
                qVar.h0(L6);
            }
            r.f((p) L6, zVar, qVar);
            r1.d.g(p2.f(qVar2, elevenLabsTheme.getSpacings(qVar, i11).m2358getX6D9Ej5fM()), qVar);
            if (1.0f <= 0.0d) {
                s1.a.a("invalid weight; must be greater than zero");
            }
            if (1.0f > Float.MAX_VALUE) {
                f10 = Float.MAX_VALUE;
            } else {
                f10 = 1.0f;
            }
            r1.d.g(new m1(f10, true), qVar);
            String R2 = kj.c.R(qVar, R.string.verify_email_submit);
            t e11 = p2.e(qVar2, 1.0f);
            boolean canSubmit = verifyEmailState.getCanSubmit();
            boolean isLoadingSubmit = verifyEmailState.isLoadingSubmit();
            boolean f15 = qVar.f(lVar);
            Object L7 = qVar.L();
            if (f15 || L7 == obj2) {
                L7 = new id.z(lVar, 20);
                qVar.h0(L7);
            }
            ButtonKt.Button(R2, (ho.a) L7, e11, null, null, null, null, isLoadingSubmit, canSubmit, false, qVar, 384, 632);
            String R3 = kj.c.R(qVar, R.string.verify_email_resend_email);
            boolean f16 = qVar.f(lVar);
            Object L8 = qVar.L();
            if (f16 || L8 == obj2) {
                L8 = new id.z(lVar, 21);
                qVar.h0(L8);
            }
            ButtonKt.Button(R3, (ho.a) L8, p2.e(qVar2, 1.0f), null, ButtonVariant.Quaternary, null, null, false, false, false, qVar, 24960, SignalClient.CLOSE_REASON_NORMAL_CLOSURE);
            qVar.p(true);
            FullScreenLoaderKt.m1838FullScreenLoaderFNF3uiM(verifyEmailState.isLoadingEmailSending(), null, 0L, qVar, 0, 6);
            qVar.p(true);
            qVar.p(true);
            return zVar;
        }
        qVar.R();
        return zVar;
    }

    public static final String VerifyEmailScreenUI$lambda$3$0$0$0$2(z0 z0Var) {
        return (String) z0Var.getValue();
    }

    public static final z VerifyEmailScreenUI$lambda$3$0$0$0$5$0(m2 m2Var, ho.l lVar, y1 y1Var) {
        y1Var.getClass();
        if (m2Var != null) {
            ((l1) m2Var).a();
        }
        lVar.invoke(new f(5));
        return z.f31622a;
    }

    public static final z VerifyEmailScreenUI$lambda$3$0$0$0$5$0$0(VerifyEmailViewModel verifyEmailViewModel) {
        verifyEmailViewModel.getClass();
        verifyEmailViewModel.submitVerificationCode();
        return z.f31622a;
    }

    public static final z VerifyEmailScreenUI$lambda$3$0$0$0$6$0(ho.l lVar, z0 z0Var, String str) {
        str.getClass();
        z0Var.setValue(str);
        lVar.invoke(new am.c(str, 17));
        return z.f31622a;
    }

    public static final z VerifyEmailScreenUI$lambda$3$0$0$0$6$0$0(String str, VerifyEmailViewModel verifyEmailViewModel) {
        verifyEmailViewModel.getClass();
        verifyEmailViewModel.setVerificationCode(str);
        return z.f31622a;
    }

    public static final z VerifyEmailScreenUI$lambda$3$0$0$0$8$0(ho.l lVar) {
        lVar.invoke(new f(6));
        return z.f31622a;
    }

    public static final z VerifyEmailScreenUI$lambda$3$0$0$0$8$0$0(VerifyEmailViewModel verifyEmailViewModel) {
        verifyEmailViewModel.getClass();
        verifyEmailViewModel.submitVerificationCode();
        return z.f31622a;
    }

    public static final z VerifyEmailScreenUI$lambda$3$0$0$0$9$0(ho.l lVar) {
        lVar.invoke(new f(4));
        return z.f31622a;
    }

    public static final z VerifyEmailScreenUI$lambda$3$0$0$0$9$0$0(VerifyEmailViewModel verifyEmailViewModel) {
        verifyEmailViewModel.getClass();
        verifyEmailViewModel.sendVerificationEmail();
        return z.f31622a;
    }

    public static final z VerifyEmailScreenUI$lambda$4(VerifyEmailState verifyEmailState, ho.l lVar, ho.a aVar, int i10, int i11, m mVar, int i12) {
        VerifyEmailScreenUI(verifyEmailState, lVar, aVar, mVar, r.M(i10 | 1), i11);
        return z.f31622a;
    }
}
