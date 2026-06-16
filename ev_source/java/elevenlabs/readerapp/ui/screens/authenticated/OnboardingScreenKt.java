package io.elevenlabs.readerapp.ui.screens.authenticated;

import a2.k3;
import a2.n2;
import android.content.res.Configuration;
import android.gov.nist.javax.sip.header.ParameterNames;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.j1;
import androidx.lifecycle.r1;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.protobuf.c6;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import io.elevenlabs.domain.model.OnboardingSurvey;
import io.elevenlabs.domain.model.Voice;
import io.elevenlabs.domain.model.VoiceCategory;
import io.elevenlabs.readerapp.R;
import io.elevenlabs.readerapp.ui.components.VoiceRowKt;
import io.elevenlabs.readerapp.ui.previews.VoicesFactoryKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.OnboardingPage;
import io.elevenlabs.ui.components.ConfirmationDialogKt;
import io.elevenlabs.ui.components.ErrorScreenKt;
import io.elevenlabs.ui.components.FullWidthButtonKt;
import io.elevenlabs.ui.components.FullWidthButtonSize;
import io.elevenlabs.ui.components.FullWidthButtonVariant;
import io.elevenlabs.ui.components.LoaderKt;
import io.elevenlabs.ui.components.RemoteIconKt;
import io.elevenlabs.ui.components.SelectableCardKt;
import io.elevenlabs.ui.components.ShadowKt;
import io.elevenlabs.ui.components.primitives.VerticalGradientKt;
import io.elevenlabs.ui.components.scaffolds.CenteredContentScaffoldKt;
import io.elevenlabs.ui.theme.ElevenLabsTheme;
import io.livekit.android.room.SignalClient;
import io.livekit.android.rpc.RpcError;
import j1.v1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.WeakHashMap;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import q2.b2;
import q2.c2;
import q2.d2;
import q2.i4;
import q2.j7;
import q2.k5;
import r1.c3;
import r1.m1;
import r1.o1;
import r1.p2;
import r1.z1;
import u2.f2;
import u2.j2;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u001a!\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001aM\u0010\u000f\u001a\u00020\u00042\u001e\u0010\b\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0007\u0012\u0004\u0012\u00020\u00040\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0003¢\u0006\u0004\b\u000f\u0010\u0010\u001a-\u0010\u0017\u001a\u00020\u00042\b\b\u0002\u0010\u0012\u001a\u00020\u00112\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00040\u0007H\u0003¢\u0006\u0004\b\u0015\u0010\u0016\u001aQ\u0010\u001a\u001a\u00020\u00042\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\u00182\u001e\u0010\b\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0007\u0012\u0004\u0012\u00020\u00040\u00072\u0006\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0003¢\u0006\u0004\b\u001a\u0010\u001b\u001aE\u0010\u001c\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u001e\u0010\b\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0007\u0012\u0004\u0012\u00020\u00040\u00072\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\u0018H\u0003¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u0017\u0010 \u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u001eH\u0003¢\u0006\u0004\b \u0010!\u001aM\u0010$\u001a\u00020\u00042\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\u00182\u001e\u0010\b\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0007\u0012\u0004\u0012\u00020\u00040\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020\"H\u0003¢\u0006\u0004\b$\u0010%\u001a\u000f\u0010&\u001a\u00020\u0004H\u0007¢\u0006\u0004\b&\u0010'\u001a\u000f\u0010(\u001a\u00020\u0004H\u0007¢\u0006\u0004\b(\u0010'\u001a\u000f\u0010)\u001a\u00020\u0004H\u0007¢\u0006\u0004\b)\u0010'\u001a\u000f\u0010*\u001a\u00020\u0004H\u0007¢\u0006\u0004\b*\u0010'\u001a\u000f\u0010+\u001a\u00020\u0004H\u0007¢\u0006\u0004\b+\u0010'\u001a\u000f\u0010,\u001a\u00020\u0004H\u0007¢\u0006\u0004\b,\u0010'\u001a\u000f\u0010-\u001a\u00020\u0004H\u0007¢\u0006\u0004\b-\u0010'\u001a\u000f\u0010.\u001a\u00020\u0004H\u0007¢\u0006\u0004\b.\u0010'\"\u001d\u00101\u001a\b\u0012\u0004\u0012\u0002000/8\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104¨\u00065"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/OnboardingViewModel;", "vm", "Lio/elevenlabs/readerapp/ui/screens/authenticated/OnboardingType;", "onboardingType", "Lsn/z;", "OnboardingScreen", "(Lio/elevenlabs/readerapp/ui/screens/authenticated/OnboardingViewModel;Lio/elevenlabs/readerapp/ui/screens/authenticated/OnboardingType;Lu2/m;II)V", "Lkotlin/Function1;", "action", "", "initialPage", "Lio/elevenlabs/readerapp/ui/screens/authenticated/OnboardingState;", RemoteConfigConstants.ResponseFieldKey.STATE, "", "initialSelectedDateMillis", "OnboardingScreenUI", "(Lho/l;ILio/elevenlabs/readerapp/ui/screens/authenticated/OnboardingState;Ljava/lang/Long;Lu2/m;II)V", "Lh5/f;", "horizontalPadding", "Lr1/y;", FirebaseAnalytics.Param.CONTENT, "QuestionPageScaffold--orJrPs", "(FLho/q;Lu2/m;II)V", "QuestionPageScaffold", "Lkotlin/Function0;", "goNext", "QuestionAgePage", "(Lho/a;Lho/l;Lio/elevenlabs/readerapp/ui/screens/authenticated/OnboardingState;Ljava/lang/Long;Lu2/m;II)V", "SuggestedVoices", "(Lio/elevenlabs/readerapp/ui/screens/authenticated/OnboardingState;Lho/l;Lho/a;Lu2/m;I)V", "", ParameterNames.TEXT, "SectionHeader", "(Ljava/lang/String;Lu2/m;I)V", "Lio/elevenlabs/readerapp/ui/screens/authenticated/OnboardingPage$SurveyPage;", "page", "QuestionContent", "(Lho/a;Lho/l;Lio/elevenlabs/readerapp/ui/screens/authenticated/OnboardingState;Lio/elevenlabs/readerapp/ui/screens/authenticated/OnboardingPage$SurveyPage;Lu2/m;I)V", "Preview_OnboardingScreen_0_loading", "(Lu2/m;I)V", "Preview_OnboardingScreen_0_loaded", "Preview_OnboardingScreen_1", "Preview_OnboardingScreen_2", "Preview_OnboardingScreen_AgePage_Warning", "Preview_OnboardingScreen_3_selected", "Preview_OnboardingScreen_3_empty", "Preview_OnboardingScreen_3_long", "", "Lio/elevenlabs/readerapp/ui/screens/authenticated/OnboardingPage;", "defaultPages", "Ljava/util/List;", "getDefaultPages", "()Ljava/util/List;", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class OnboardingScreenKt {
    private static final List<OnboardingPage> defaultPages = ig.f.I(OnboardingPage.Age.INSTANCE, OnboardingPage.Voices.INSTANCE);

    /* JADX WARN: Code restructure failed: missing block: B:26:0x005b, code lost:
    
        if ((r15 & 1) != 0) goto L96;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OnboardingScreen(OnboardingViewModel onboardingViewModel, OnboardingType onboardingType, u2.m mVar, int i10, int i11) {
        int i12;
        boolean z6;
        q7.c cVar;
        int i13;
        int i14;
        onboardingType.getClass();
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-357033245);
        if ((i10 & 6) == 0) {
            if ((i11 & 1) == 0 && qVar.h(onboardingViewModel)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i12 = i14 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.d(onboardingType.ordinal())) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i12 |= i13;
        }
        boolean z10 = true;
        if ((i12 & 19) != 18) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i12 & 1, z6)) {
            qVar.T();
            if ((i10 & 1) != 0 && !qVar.y()) {
                qVar.R();
            } else {
                if ((i11 & 1) != 0) {
                    r1 a10 = r7.a.a(qVar);
                    if (a10 != null) {
                        pl.f o6 = tb.a.o(a10, qVar);
                        if (a10 instanceof androidx.lifecycle.o) {
                            cVar = ((androidx.lifecycle.o) a10).getDefaultViewModelCreationExtras();
                        } else {
                            cVar = q7.a.f28123b;
                        }
                        j1 j02 = gg.b.j0(kotlin.jvm.internal.e0.f20562a.b(OnboardingViewModel.class), a10, null, o6, cVar, qVar);
                        qVar = qVar;
                        onboardingViewModel = (OnboardingViewModel) j02;
                        i12 &= -15;
                    } else {
                        c6.x("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        return;
                    }
                }
                qVar.q();
                boolean h10 = qVar.h(onboardingViewModel);
                if ((i12 & 112) != 32) {
                    z10 = false;
                }
                boolean z11 = h10 | z10;
                Object L = qVar.L();
                u2.e eVar = u2.l.f33918a;
                if (z11 || L == eVar) {
                    L = new OnboardingScreenKt$OnboardingScreen$1$1(onboardingViewModel, onboardingType, null);
                    qVar.h0(L);
                }
                u2.r.f((ho.p) L, onboardingType, qVar);
                boolean h11 = qVar.h(onboardingViewModel);
                Object L2 = qVar.L();
                if (h11 || L2 == eVar) {
                    L2 = new w0(onboardingViewModel, 0);
                    qVar.h0(L2);
                }
                OnboardingScreenUI((ho.l) L2, 0, (OnboardingState) u2.r.o(onboardingViewModel.getStateFlow(), qVar, 0).getValue(), null, qVar, 0, 10);
            }
        } else {
            qVar.R();
        }
        OnboardingViewModel onboardingViewModel2 = onboardingViewModel;
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.core.p(onboardingViewModel2, onboardingType, i10, i11, 6);
        }
    }

    public static final sn.z OnboardingScreen$lambda$1$0(OnboardingViewModel onboardingViewModel, ho.l lVar) {
        lVar.getClass();
        lVar.invoke(onboardingViewModel);
        return sn.z.f31622a;
    }

    public static final sn.z OnboardingScreen$lambda$2(OnboardingViewModel onboardingViewModel, OnboardingType onboardingType, int i10, int i11, u2.m mVar, int i12) {
        OnboardingScreen(onboardingViewModel, onboardingType, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void OnboardingScreenUI(ho.l lVar, int i10, OnboardingState onboardingState, Long l4, u2.m mVar, int i11, int i12) {
        int i13;
        int i14;
        int i15;
        int i16;
        Long l7;
        int i17;
        boolean z6;
        u2.q qVar;
        int i18;
        Long l10;
        u2.r1 r10;
        int i19;
        int i20;
        u2.q qVar2 = (u2.q) mVar;
        qVar2.Z(-2020866739);
        if ((i11 & 6) == 0) {
            if (qVar2.h(lVar)) {
                i20 = 4;
            } else {
                i20 = 2;
            }
            i13 = i20 | i11;
        } else {
            i13 = i11;
        }
        int i21 = i12 & 2;
        if (i21 != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i14 = i10;
            if (qVar2.d(i14)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i13 |= i15;
            if ((i11 & 384) == 0) {
                if (qVar2.h(onboardingState)) {
                    i19 = RpcError.MAX_MESSAGE_BYTES;
                } else {
                    i19 = 128;
                }
                i13 |= i19;
            }
            i16 = i12 & 8;
            if (i16 == 0) {
                i13 |= 3072;
            } else if ((i11 & 3072) == 0) {
                l7 = l4;
                if (qVar2.f(l7)) {
                    i17 = 2048;
                } else {
                    i17 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                }
                i13 |= i17;
                if ((i13 & 1171) != 1170) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (qVar2.O(i13 & 1, z6)) {
                    if (i21 != 0) {
                        i18 = 0;
                    } else {
                        i18 = i14;
                    }
                    if (i16 != 0) {
                        l10 = null;
                    } else {
                        l10 = l7;
                    }
                    qVar = qVar2;
                    k5.a(null, null, null, null, null, 0, 0L, 0L, null, c3.k.d(1088705118, true, new e1(onboardingState, i18, lVar, l10), qVar2), qVar, 805306368, 511);
                } else {
                    qVar = qVar2;
                    qVar.R();
                    i18 = i14;
                    l10 = l7;
                }
                r10 = qVar.r();
                if (r10 != null) {
                    r10.f34012d = new f1(lVar, i18, onboardingState, l10, i11, i12, 0);
                    return;
                }
                return;
            }
            l7 = l4;
            if ((i13 & 1171) != 1170) {
            }
            if (qVar2.O(i13 & 1, z6)) {
            }
            r10 = qVar.r();
            if (r10 != null) {
            }
        }
        i14 = i10;
        if ((i11 & 384) == 0) {
        }
        i16 = i12 & 8;
        if (i16 == 0) {
        }
        l7 = l4;
        if ((i13 & 1171) != 1170) {
        }
        if (qVar2.O(i13 & 1, z6)) {
        }
        r10 = qVar.r();
        if (r10 != null) {
        }
    }

    public static final sn.z OnboardingScreenUI$lambda$0(OnboardingState onboardingState, int i10, ho.l lVar, Long l4, z1 z1Var, u2.m mVar, int i11) {
        int i12;
        int i13;
        boolean z6;
        OnboardingState onboardingState2;
        Object cVar;
        boolean z10;
        int i14;
        z1Var.getClass();
        u2.q qVar = (u2.q) mVar;
        if (qVar.S) {
            i12 = -qVar.I.f33901v;
        } else {
            i12 = qVar.G.f33842i;
        }
        if ((i11 & 6) == 0) {
            if (qVar.f(z1Var)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i13 = i11 | i14;
        } else {
            i13 = i11;
        }
        if ((i13 & 19) != 18) {
            z6 = true;
        } else {
            z6 = false;
        }
        boolean O = qVar.O(i13 & 1, z6);
        sn.z zVar = sn.z.f31622a;
        if (O) {
            i3.t D = r1.d.D(p2.d(i3.q.f13017a, 1.0f), z1Var);
            r1.x a10 = r1.w.a(r1.j.f29230c, i3.d.B0, mVar, 0);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l7 = qVar.l();
            i3.t c5 = i3.a.c(D, mVar);
            h4.h.f11920i.getClass();
            h4.f fVar = h4.g.f11903b;
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            u2.r.J(h4.g.f11907f, a10, mVar);
            u2.r.J(h4.g.f11906e, l7, mVar);
            u2.r.y(mVar, Integer.valueOf(hashCode), h4.g.f11908g);
            u2.r.F(h4.g.f11909h, mVar);
            u2.r.J(h4.g.f11905d, c5, mVar);
            qVar.X(-1617977395);
            boolean d10 = qVar.d(onboardingState.getPages().size()) | qVar.d(i10);
            Object L = qVar.L();
            u2.e eVar = u2.l.f33918a;
            if (!d10 && L != eVar) {
                cVar = L;
                onboardingState2 = onboardingState;
            } else {
                onboardingState2 = onboardingState;
                i0 i0Var = new i0(onboardingState2, 2);
                float f10 = w1.h0.f35998a;
                cVar = new w1.c(i10, t2.u.P, i0Var);
                qVar.h0(cVar);
            }
            w1.e0 e0Var = (w1.e0) cVar;
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = u2.r.q(mVar);
                qVar.h0(L2);
            }
            fr.d0 d0Var = (fr.d0) L2;
            if (onboardingState2.getOnboardingType() == OnboardingType.AgeOnly && onboardingState2.isAgeOnboardingCompleted()) {
                if (i12 < 0) {
                    int i15 = -i12;
                    j2 j2Var = qVar.I;
                    while (true) {
                        int i16 = j2Var.f33901v;
                        if (i16 <= i15) {
                            break;
                        }
                        qVar.p(j2Var.y(i16));
                    }
                } else {
                    if (qVar.S) {
                        j2 j2Var2 = qVar.I;
                        while (qVar.S) {
                            qVar.p(j2Var2.y(j2Var2.f33901v));
                        }
                    }
                    f2 f2Var = qVar.G;
                    while (true) {
                        int i17 = f2Var.f33842i;
                        if (i17 <= i12) {
                            break;
                        }
                        qVar.p(f2Var.l(i17));
                    }
                }
                return zVar;
            }
            if (((u2.f1) e0Var.f35962d.f5294c).h() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            boolean h10 = qVar.h(d0Var) | qVar.f(e0Var);
            Object L3 = qVar.L();
            if (h10 || L3 == eVar) {
                L3 = new v(d0Var, e0Var, 3);
                qVar.h0(L3);
            }
            androidx.room.m0.a((ho.a) L3, z10, 0, mVar, 0);
            if (1.0f <= 0.0d) {
                s1.a.a("invalid weight; must be greater than zero");
            }
            gg.b.d(e0Var, new m1(1.0f, true), null, null, 0, t2.u.P, null, null, false, null, null, null, c3.k.d(-1932940523, true, new t0(onboardingState2, lVar, e0Var, d0Var, l4, 0), mVar), mVar, 100663296, 24576, 16124);
            qVar.p(false);
            qVar.p(true);
            return zVar;
        }
        qVar.R();
        return zVar;
    }

    public static final int OnboardingScreenUI$lambda$0$0$0$0(OnboardingState onboardingState) {
        return onboardingState.getPages().size();
    }

    public static final sn.z OnboardingScreenUI$lambda$0$0$2$0(fr.d0 d0Var, w1.e0 e0Var) {
        OnboardingScreenUI$lambda$0$0$goBack(d0Var, e0Var);
        return sn.z.f31622a;
    }

    public static final sn.z OnboardingScreenUI$lambda$0$0$3(OnboardingState onboardingState, ho.l lVar, w1.e0 e0Var, fr.d0 d0Var, Long l4, w1.w wVar, int i10, u2.m mVar, int i11) {
        wVar.getClass();
        OnboardingPage onboardingPage = onboardingState.getPages().get(i10);
        boolean c5 = kotlin.jvm.internal.m.c(onboardingPage, OnboardingPage.Voices.INSTANCE);
        u2.e eVar = u2.l.f33918a;
        if (c5) {
            u2.q qVar = (u2.q) mVar;
            qVar.X(-2129966230);
            boolean f10 = qVar.f(lVar) | qVar.f(e0Var) | qVar.h(d0Var);
            Object L = qVar.L();
            if (f10 || L == eVar) {
                L = new b1(lVar, e0Var, d0Var);
                qVar.h0(L);
            }
            SuggestedVoices(onboardingState, lVar, (ho.a) L, qVar, 0);
            qVar.p(false);
        } else if (kotlin.jvm.internal.m.c(onboardingPage, OnboardingPage.Age.INSTANCE)) {
            u2.q qVar2 = (u2.q) mVar;
            qVar2.X(-2129955991);
            boolean f11 = qVar2.f(e0Var) | qVar2.f(lVar) | qVar2.h(d0Var);
            Object L2 = qVar2.L();
            if (f11 || L2 == eVar) {
                L2 = new b1(e0Var, lVar, d0Var);
                qVar2.h0(L2);
            }
            QuestionAgePage((ho.a) L2, lVar, onboardingState, l4, qVar2, 0, 0);
            qVar2.p(false);
        } else if (onboardingPage instanceof OnboardingPage.SurveyPage) {
            u2.q qVar3 = (u2.q) mVar;
            qVar3.X(-2129946190);
            boolean h10 = qVar3.h(onboardingState) | qVar3.f(onboardingPage) | qVar3.f(lVar) | qVar3.f(e0Var) | qVar3.h(d0Var);
            Object L3 = qVar3.L();
            if (h10 || L3 == eVar) {
                io.elevenlabs.readerapp.ui.screens.anonymous.signin.d dVar = new io.elevenlabs.readerapp.ui.screens.anonymous.signin.d(onboardingState, (OnboardingPage.SurveyPage) onboardingPage, lVar, e0Var, d0Var);
                qVar3.h0(dVar);
                L3 = dVar;
            }
            QuestionContent((ho.a) L3, lVar, onboardingState, (OnboardingPage.SurveyPage) onboardingPage, qVar3, 0);
            qVar3.p(false);
        } else {
            throw com.google.android.gms.internal.play_billing.b.h(-2129967190, (u2.q) mVar, false);
        }
        return sn.z.f31622a;
    }

    public static final sn.z OnboardingScreenUI$lambda$0$0$3$0$0(ho.l lVar, w1.e0 e0Var, fr.d0 d0Var) {
        lVar.invoke(new y0(3));
        OnboardingScreenUI$lambda$0$0$goNext(e0Var, lVar, d0Var);
        return sn.z.f31622a;
    }

    public static final sn.z OnboardingScreenUI$lambda$0$0$3$0$0$0(OnboardingViewModel onboardingViewModel) {
        onboardingViewModel.getClass();
        onboardingViewModel.trackVoiceSelection();
        return sn.z.f31622a;
    }

    public static final sn.z OnboardingScreenUI$lambda$0$0$3$1$0(w1.e0 e0Var, ho.l lVar, fr.d0 d0Var) {
        OnboardingScreenUI$lambda$0$0$goNext(e0Var, lVar, d0Var);
        return sn.z.f31622a;
    }

    public static final sn.z OnboardingScreenUI$lambda$0$0$3$2$0(OnboardingState onboardingState, OnboardingPage onboardingPage, ho.l lVar, w1.e0 e0Var, fr.d0 d0Var) {
        List<OnboardingSurvey.Question> questions;
        OnboardingSurvey.Question question;
        OnboardingSurvey survey = onboardingState.getSurvey();
        if (survey != null && (questions = survey.getQuestions()) != null && (question = (OnboardingSurvey.Question) tn.o.z0(((OnboardingPage.SurveyPage) onboardingPage).getQuestionIndex(), questions)) != null) {
            lVar.invoke(new l0(question, 8));
        }
        OnboardingScreenUI$lambda$0$0$goNext(e0Var, lVar, d0Var);
        return sn.z.f31622a;
    }

    public static final sn.z OnboardingScreenUI$lambda$0$0$3$2$0$0$0(OnboardingSurvey.Question question, OnboardingViewModel onboardingViewModel) {
        onboardingViewModel.getClass();
        onboardingViewModel.trackSurveyQuestionAnalytics(question);
        return sn.z.f31622a;
    }

    private static final void OnboardingScreenUI$lambda$0$0$goBack(fr.d0 d0Var, w1.e0 e0Var) {
        fr.g0.D(d0Var, null, null, new OnboardingScreenKt$OnboardingScreenUI$1$1$goBack$1(e0Var, null), 3);
    }

    private static final void OnboardingScreenUI$lambda$0$0$goNext(w1.e0 e0Var, ho.l lVar, fr.d0 d0Var) {
        if (((u2.f1) e0Var.f35962d.f5294c).h() == e0Var.m() - 1) {
            lVar.invoke(new w(29));
        } else {
            fr.g0.D(d0Var, null, null, new OnboardingScreenKt$OnboardingScreenUI$1$1$goNext$2(e0Var, null), 3);
        }
    }

    public static final sn.z OnboardingScreenUI$lambda$0$0$goNext$1(OnboardingViewModel onboardingViewModel) {
        onboardingViewModel.getClass();
        onboardingViewModel.completeOnboarding();
        return sn.z.f31622a;
    }

    public static final sn.z OnboardingScreenUI$lambda$1(ho.l lVar, int i10, OnboardingState onboardingState, Long l4, int i11, int i12, u2.m mVar, int i13) {
        OnboardingScreenUI(lVar, i10, onboardingState, l4, mVar, u2.r.M(i11 | 1), i12);
        return sn.z.f31622a;
    }

    public static final void Preview_OnboardingScreen_0_loaded(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(629364397);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            Object L = qVar.L();
            if (L == u2.l.f33918a) {
                L = new y0(2);
                qVar.h0(L);
            }
            OnboardingScreenUI((ho.l) L, 0, new OnboardingState(null, false, VoicesFactoryKt.stubVoicesList(), null, null, null, false, false, defaultPages, OnboardingType.Entire, false, 1273, null), 700000L, qVar, 3126, 0);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.anonymous.signin.mfa.d(i10, 29);
        }
    }

    public static final sn.z Preview_OnboardingScreen_0_loaded$lambda$0$0(ho.l lVar) {
        lVar.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z Preview_OnboardingScreen_0_loaded$lambda$1(int i10, u2.m mVar, int i11) {
        Preview_OnboardingScreen_0_loaded(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_OnboardingScreen_0_loading(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-1815874912);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            Object L = qVar.L();
            if (L == u2.l.f33918a) {
                L = new w(28);
                qVar.h0(L);
            }
            OnboardingScreenUI((ho.l) L, 0, new OnboardingState(null, true, null, null, null, null, false, false, null, null, false, 2045, null), 700000L, qVar, 3126, 0);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.anonymous.signin.mfa.d(i10, 27);
        }
    }

    public static final sn.z Preview_OnboardingScreen_0_loading$lambda$0$0(ho.l lVar) {
        lVar.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z Preview_OnboardingScreen_0_loading$lambda$1(int i10, u2.m mVar, int i11) {
        Preview_OnboardingScreen_0_loading(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_OnboardingScreen_1(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-1936626268);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            Object L = qVar.L();
            if (L == u2.l.f33918a) {
                L = new y0(6);
                qVar.h0(L);
            }
            OnboardingScreenUI((ho.l) L, 1, new OnboardingState(null, false, null, null, null, null, false, false, defaultPages, OnboardingType.Entire, false, 1279, null), null, qVar, 54, 8);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new c1(i10, 1);
        }
    }

    public static final sn.z Preview_OnboardingScreen_1$lambda$0$0(ho.l lVar) {
        lVar.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z Preview_OnboardingScreen_1$lambda$1(int i10, u2.m mVar, int i11) {
        Preview_OnboardingScreen_1(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_OnboardingScreen_2(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(1149098789);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            Object L = qVar.L();
            if (L == u2.l.f33918a) {
                L = new y0(0);
                qVar.h0(L);
            }
            OnboardingType onboardingType = OnboardingType.Entire;
            OnboardingScreenUI((ho.l) L, 2, new OnboardingState(null, false, VoicesFactoryKt.stubVoicesList(), null, null, null, false, false, defaultPages, onboardingType, false, 1275, null), null, qVar, 54, 8);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.anonymous.signin.mfa.d(i10, 28);
        }
    }

    public static final sn.z Preview_OnboardingScreen_2$lambda$0$0(ho.l lVar) {
        lVar.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z Preview_OnboardingScreen_2$lambda$1(int i10, u2.m mVar, int i11) {
        Preview_OnboardingScreen_2(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_OnboardingScreen_3_empty(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-1875251724);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            Object L = qVar.L();
            if (L == u2.l.f33918a) {
                L = new w(23);
                qVar.h0(L);
            }
            ho.l lVar = (ho.l) L;
            ArrayList O0 = tn.o.O0(ig.f.H(new OnboardingPage.SurveyPage(0)), defaultPages);
            no.e eVar = new no.e(1, 2, 1);
            ArrayList arrayList = new ArrayList(tn.p.a0(eVar, 10));
            Iterator it = eVar.iterator();
            while (((no.f) it).f24561c) {
                int nextInt = ((tn.y) it).nextInt();
                arrayList.add(new OnboardingSurvey.Answer(defpackage.f.e(nextInt, SubscriberAttributeKt.JSON_NAME_KEY), defpackage.f.e(nextInt, "Answer "), false, null));
            }
            OnboardingScreenUI(lVar, 3, new OnboardingState(new OnboardingSurvey(null, ig.f.H(new OnboardingSurvey.Question(SubscriberAttributeKt.JSON_NAME_KEY, "Some onboarding question?", false, arrayList, false))), false, null, null, null, null, false, false, O0, null, false, 1790, null), null, qVar, 54, 8);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.anonymous.signin.mfa.d(i10, 25);
        }
    }

    public static final sn.z Preview_OnboardingScreen_3_empty$lambda$0$0(ho.l lVar) {
        lVar.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z Preview_OnboardingScreen_3_empty$lambda$2(int i10, u2.m mVar, int i11) {
        Preview_OnboardingScreen_3_empty(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_OnboardingScreen_3_long(u2.m mVar, int i10) {
        boolean z6;
        boolean z10;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(1217068417);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            Object L = qVar.L();
            if (L == u2.l.f33918a) {
                L = new w(26);
                qVar.h0(L);
            }
            ho.l lVar = (ho.l) L;
            ArrayList O0 = tn.o.O0(ig.f.H(new OnboardingPage.SurveyPage(0)), defaultPages);
            no.e eVar = new no.e(1, 20, 1);
            ArrayList arrayList = new ArrayList(tn.p.a0(eVar, 10));
            Iterator it = eVar.iterator();
            while (((no.f) it).f24561c) {
                int nextInt = ((tn.y) it).nextInt();
                String e10 = defpackage.f.e(nextInt, SubscriberAttributeKt.JSON_NAME_KEY);
                String e11 = defpackage.f.e(nextInt, "Answer ");
                if (nextInt % 2 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                arrayList.add(new OnboardingSurvey.Answer(e10, e11, z10, null));
            }
            OnboardingScreenUI(lVar, 3, new OnboardingState(new OnboardingSurvey(null, ig.f.H(new OnboardingSurvey.Question(SubscriberAttributeKt.JSON_NAME_KEY, "Some onboarding question?", true, arrayList, false))), false, null, null, null, null, false, false, O0, null, false, 1790, null), null, qVar, 54, 8);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.anonymous.signin.mfa.d(i10, 26);
        }
    }

    public static final sn.z Preview_OnboardingScreen_3_long$lambda$0$0(ho.l lVar) {
        lVar.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z Preview_OnboardingScreen_3_long$lambda$2(int i10, u2.m mVar, int i11) {
        Preview_OnboardingScreen_3_long(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_OnboardingScreen_3_selected(u2.m mVar, int i10) {
        boolean z6;
        boolean z10;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(221537440);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            Object L = qVar.L();
            if (L == u2.l.f33918a) {
                L = new w(25);
                qVar.h0(L);
            }
            ho.l lVar = (ho.l) L;
            OnboardingType onboardingType = OnboardingType.Entire;
            ArrayList O0 = tn.o.O0(ig.f.H(new OnboardingPage.SurveyPage(0)), defaultPages);
            no.e eVar = new no.e(1, 2, 1);
            ArrayList arrayList = new ArrayList(tn.p.a0(eVar, 10));
            Iterator it = eVar.iterator();
            while (((no.f) it).f24561c) {
                int nextInt = ((tn.y) it).nextInt();
                String e10 = defpackage.f.e(nextInt, SubscriberAttributeKt.JSON_NAME_KEY);
                String e11 = defpackage.f.e(nextInt, "Answer ");
                if (nextInt % 2 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                arrayList.add(new OnboardingSurvey.Answer(e10, e11, z10, null));
            }
            OnboardingScreenUI(lVar, 3, new OnboardingState(new OnboardingSurvey(null, ig.f.H(new OnboardingSurvey.Question(SubscriberAttributeKt.JSON_NAME_KEY, "Some onboarding question?", true, arrayList, false))), false, null, null, null, null, false, false, O0, onboardingType, false, 1278, null), null, qVar, 54, 8);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.anonymous.signin.mfa.d(i10, 24);
        }
    }

    public static final sn.z Preview_OnboardingScreen_3_selected$lambda$0$0(ho.l lVar) {
        lVar.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z Preview_OnboardingScreen_3_selected$lambda$2(int i10, u2.m mVar, int i11) {
        Preview_OnboardingScreen_3_selected(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_OnboardingScreen_AgePage_Warning(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-2129235458);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            Object L = qVar.L();
            if (L == u2.l.f33918a) {
                L = new y0(4);
                qVar.h0(L);
            }
            OnboardingScreenUI((ho.l) L, 0, new OnboardingState(null, false, null, null, null, null, true, false, defaultPages, OnboardingType.Entire, false, 1215, null), 700000L, qVar, 3126, 0);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new c1(i10, 0);
        }
    }

    public static final sn.z Preview_OnboardingScreen_AgePage_Warning$lambda$0$0(ho.l lVar) {
        lVar.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z Preview_OnboardingScreen_AgePage_Warning$lambda$1(int i10, u2.m mVar, int i11) {
        Preview_OnboardingScreen_AgePage_Warning(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void QuestionAgePage(ho.a aVar, ho.l lVar, OnboardingState onboardingState, Long l4, u2.m mVar, int i10, int i11) {
        int i12;
        OnboardingState onboardingState2;
        Long l7;
        int i13;
        boolean z6;
        Long l10;
        u2.r1 r10;
        Long l11;
        boolean z10;
        Object[] objArr;
        Object[] objArr2;
        int i14;
        int i15;
        int i16;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(1859377543);
        if ((i10 & 6) == 0) {
            if (qVar.h(aVar)) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i12 = i16 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.h(lVar)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i12 |= i15;
        }
        if ((i10 & 384) == 0) {
            onboardingState2 = onboardingState;
            if (qVar.h(onboardingState2)) {
                i14 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i14 = 128;
            }
            i12 |= i14;
        } else {
            onboardingState2 = onboardingState;
        }
        int i17 = i11 & 8;
        if (i17 != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            l7 = l4;
            if (qVar.f(l7)) {
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
                if (i17 != 0) {
                    l11 = null;
                } else {
                    l11 = l7;
                }
                if (onboardingState2.getShowAgeWarning()) {
                    qVar.X(523385739);
                    int i18 = i12 & 112;
                    if (i18 == 32) {
                        objArr = true;
                    } else {
                        objArr = false;
                    }
                    Object L = qVar.L();
                    u2.e eVar = u2.l.f33918a;
                    if (objArr != false || L == eVar) {
                        L = new j(lVar, 2);
                        qVar.h0(L);
                    }
                    ho.a aVar2 = (ho.a) L;
                    if (i18 == 32) {
                        objArr2 = true;
                    } else {
                        objArr2 = false;
                    }
                    Object L2 = qVar.L();
                    if (objArr2 != false || L2 == eVar) {
                        L2 = new j(lVar, 3);
                        qVar.h0(L2);
                    }
                    z10 = true;
                    ConfirmationDialogKt.ConfirmationDialog(aVar2, (ho.a) L2, kj.c.R(qVar, R.string.onboarding_page_3_error_alert_title), kj.c.R(qVar, R.string.onboarding_page_3_error_alert_description), null, kj.c.R(qVar, R.string.common_ok), false, qVar, 1597440, 0);
                    qVar.p(false);
                } else {
                    z10 = true;
                    qVar.X(523831643);
                    qVar.p(false);
                }
                boolean z11 = z10;
                m1215QuestionPageScaffoldorJrPs(t2.u.P, c3.k.d(-1666325488, z11, new n2(l11, onboardingState2, lVar, aVar, 2), qVar), qVar, 48, z11 ? 1 : 0);
                l10 = l11;
            } else {
                qVar.R();
                l10 = l7;
            }
            r10 = qVar.r();
            if (r10 == null) {
                r10.f34012d = new io.elevenlabs.readerapp.core.l(aVar, lVar, onboardingState, l10, i10, i11);
                return;
            }
            return;
        }
        l7 = l4;
        if ((i12 & 1171) == 1170) {
        }
        if (!qVar.O(i12 & 1, z6)) {
        }
        r10 = qVar.r();
        if (r10 == null) {
        }
    }

    public static final sn.z QuestionAgePage$lambda$0$0(ho.l lVar) {
        lVar.invoke(new y0(5));
        return sn.z.f31622a;
    }

    public static final sn.z QuestionAgePage$lambda$0$0$0(OnboardingViewModel onboardingViewModel) {
        onboardingViewModel.getClass();
        onboardingViewModel.hideAgeWarning();
        return sn.z.f31622a;
    }

    public static final sn.z QuestionAgePage$lambda$1$0(ho.l lVar) {
        lVar.invoke(new w(27));
        return sn.z.f31622a;
    }

    public static final sn.z QuestionAgePage$lambda$1$0$0(OnboardingViewModel onboardingViewModel) {
        onboardingViewModel.getClass();
        onboardingViewModel.hideAgeWarning();
        return sn.z.f31622a;
    }

    public static final sn.z QuestionAgePage$lambda$2(Long l4, OnboardingState onboardingState, ho.l lVar, ho.a aVar, r1.y yVar, u2.m mVar, int i10) {
        int i11;
        boolean z6;
        u2.e eVar;
        i3.t c5;
        h4.e eVar2;
        h4.e eVar3;
        long j4;
        long j10;
        long j11;
        long j12;
        long j13;
        long j14;
        long j15;
        long j16;
        long j17;
        long j18;
        long j19;
        long j20;
        long j21;
        long j22;
        long j23;
        long j24;
        long j25;
        long j26;
        long j27;
        long j28;
        long j29;
        long j30;
        long j31;
        long j32;
        long j33;
        boolean z10;
        float f10;
        ho.l lVar2;
        ho.a aVar2;
        int i12;
        yVar.getClass();
        if ((i10 & 6) == 0) {
            if (((u2.q) mVar).f(yVar)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i11 = i10 | i12;
        } else {
            i11 = i10;
        }
        if ((i11 & 19) != 18) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i11 & 1, z6)) {
            float f11 = b2.f26876a;
            no.g gVar = q2.x0.f27869b;
            q2.w0 w0Var = q2.x0.f27870c;
            qVar.X(2088426481);
            Locale locale = ((Configuration) qVar.j(AndroidCompositionLocals_androidKt.f2290a)).getLocales().get(0);
            qVar.p(false);
            Object[] objArr = new Object[0];
            ka.j0 b10 = f3.m.b(new nm.a(15), new v1(w0Var, locale, 26));
            boolean f12 = qVar.f(l4) | qVar.f(l4) | qVar.h(gVar) | qVar.d(0) | qVar.f(w0Var) | qVar.h(locale);
            Object L = qVar.L();
            u2.e eVar4 = u2.l.f33918a;
            if (!f12 && L != eVar4) {
                eVar = eVar4;
            } else {
                eVar = eVar4;
                io.elevenlabs.readerapp.ui.screens.anonymous.signin.d dVar = new io.elevenlabs.readerapp.ui.screens.anonymous.signin.d(l4, l4, gVar, w0Var, locale, 5);
                qVar.h0(dVar);
                L = dVar;
            }
            d2 d2Var = (d2) f3.m.c(objArr, b10, (ho.a) L, qVar, 0);
            d2Var.f26992d.setValue(w0Var);
            i3.q qVar2 = i3.q.f13017a;
            c5 = ((r1.z) yVar).c(p2.e(qVar2, 1.0f), 1.0f, true);
            i3.t y10 = l1.n.y(c5, l1.n.x(qVar), true, true);
            r1.e eVar5 = r1.j.f29230c;
            i3.j jVar = i3.d.B0;
            r1.x a10 = r1.w.a(eVar5, jVar, qVar, 0);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l7 = qVar.l();
            i3.t c10 = i3.a.c(y10, qVar);
            h4.h.f11920i.getClass();
            h4.f fVar = h4.g.f11903b;
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            h4.e eVar6 = h4.g.f11907f;
            u2.r.J(eVar6, a10, qVar);
            h4.e eVar7 = h4.g.f11906e;
            u2.r.J(eVar7, l7, qVar);
            Integer valueOf = Integer.valueOf(hashCode);
            h4.e eVar8 = h4.g.f11908g;
            u2.r.y(qVar, valueOf, eVar8);
            h4.d dVar2 = h4.g.f11909h;
            u2.r.F(dVar2, qVar);
            h4.e eVar9 = h4.g.f11905d;
            u2.r.J(eVar9, c10, qVar);
            String R = kj.c.R(qVar, R.string.onboarding_page_3_title);
            ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
            int i13 = ElevenLabsTheme.$stable;
            u2.e eVar10 = eVar;
            j7.d(R, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar, i13).getTitleLarge700Eleven(), qVar, 0, 0, 131070);
            ib.i.C(elevenLabsTheme, qVar, i13, qVar2, qVar);
            q2.x0 x0Var = q2.x0.f27868a;
            long d10 = ib.i.d(elevenLabsTheme, qVar, i13);
            long b11 = defpackage.f.b(elevenLabsTheme, qVar, i13);
            long b12 = defpackage.f.b(elevenLabsTheme, qVar, i13);
            long A = defpackage.f.A(elevenLabsTheme, qVar, i13);
            long A2 = defpackage.f.A(elevenLabsTheme, qVar, i13);
            long b13 = defpackage.f.b(elevenLabsTheme, qVar, i13);
            long b14 = defpackage.f.b(elevenLabsTheme, qVar, i13);
            long m2005getSecondary0d7_KjU = elevenLabsTheme.getColor(qVar, i13).getBackground().m2005getSecondary0d7_KjU();
            long m2138getActiveBg0d7_KjU = elevenLabsTheme.getColor(qVar, i13).getSelectable().m2138getActiveBg0d7_KjU();
            long b15 = defpackage.f.b(elevenLabsTheme, qVar, i13);
            long m2005getSecondary0d7_KjU2 = elevenLabsTheme.getColor(qVar, i13).getBackground().m2005getSecondary0d7_KjU();
            long m2138getActiveBg0d7_KjU2 = elevenLabsTheme.getColor(qVar, i13).getSelectable().m2138getActiveBg0d7_KjU();
            long b16 = defpackage.f.b(elevenLabsTheme, qVar, i13);
            long b17 = defpackage.f.b(elevenLabsTheme, qVar, i13);
            long j34 = p3.x.f26438m;
            q2.f0 f0Var = (q2.f0) qVar.j(q2.g0.f27130a);
            q2.u0 u0Var = f0Var.f27071b0;
            if (u0Var == null) {
                qVar.X(642416503);
                long e10 = q2.g0.e(f0Var, t2.j.f32125a);
                long e11 = q2.g0.e(f0Var, t2.j.f32140p);
                long e12 = q2.g0.e(f0Var, t2.j.f32138n);
                long e13 = q2.g0.e(f0Var, t2.j.f32144u);
                long e14 = q2.g0.e(f0Var, t2.j.f32143t);
                long j35 = f0Var.f27092s;
                t2.i iVar = t2.j.C;
                long e15 = q2.g0.e(f0Var, iVar);
                long b18 = p3.x.b(0.38f, q2.g0.e(f0Var, iVar));
                t2.i iVar2 = t2.j.f32135k;
                long e16 = q2.g0.e(f0Var, iVar2);
                t2.i iVar3 = t2.j.A;
                long e17 = q2.g0.e(f0Var, iVar3);
                eVar2 = eVar9;
                eVar3 = eVar8;
                long b19 = p3.x.b(0.38f, q2.g0.e(f0Var, iVar3));
                t2.i iVar4 = t2.j.f32149z;
                long e18 = q2.g0.e(f0Var, iVar4);
                long b20 = p3.x.b(0.38f, q2.g0.e(f0Var, iVar4));
                t2.i iVar5 = t2.j.f32136l;
                long e19 = q2.g0.e(f0Var, iVar5);
                long b21 = p3.x.b(0.38f, q2.g0.e(f0Var, iVar5));
                t2.i iVar6 = t2.j.f32132h;
                long e20 = q2.g0.e(f0Var, iVar6);
                long b22 = p3.x.b(0.38f, q2.g0.e(f0Var, iVar6));
                t2.i iVar7 = t2.j.f32131g;
                long e21 = q2.g0.e(f0Var, iVar7);
                long b23 = p3.x.b(0.38f, q2.g0.e(f0Var, iVar7));
                long e22 = q2.g0.e(f0Var, iVar2);
                long e23 = q2.g0.e(f0Var, t2.j.f32133i);
                long e24 = q2.g0.e(f0Var, t2.j.f32142s);
                long e25 = q2.g0.e(f0Var, t2.j.f32141r);
                long e26 = q2.g0.e(f0Var, t2.l.f32159a);
                i4 i4Var = i4.f27254a;
                u0Var = new q2.u0(e10, e11, e12, e13, e14, j35, e15, b18, e16, e17, b19, e18, b20, e19, b21, e20, b22, e21, b23, e22, e23, e25, e24, e26, i4.c(f0Var, qVar));
                f0Var.f27071b0 = u0Var;
                qVar.p(false);
            } else {
                eVar2 = eVar9;
                eVar3 = eVar8;
                qVar.X(642290457);
                qVar.p(false);
            }
            if (d10 != 16) {
                j4 = d10;
            } else {
                j4 = u0Var.f27714a;
            }
            if (b11 != 16) {
                j10 = b11;
            } else {
                j10 = u0Var.f27715b;
            }
            if (b12 != 16) {
                j11 = b12;
            } else {
                j11 = u0Var.f27716c;
            }
            if (A != 16) {
                j12 = A;
            } else {
                j12 = u0Var.f27717d;
            }
            if (A2 != 16) {
                j13 = A2;
            } else {
                j13 = u0Var.f27718e;
            }
            if (j34 != 16) {
                j14 = 16;
                j15 = j34;
            } else {
                j14 = 16;
                j15 = u0Var.f27719f;
            }
            if (b13 != j14) {
                j16 = b13;
            } else {
                j16 = u0Var.f27720g;
            }
            if (j34 != 16) {
                j17 = j34;
            } else {
                j17 = u0Var.f27721h;
            }
            if (b14 != j14) {
                j18 = b14;
            } else {
                j18 = u0Var.f27722i;
            }
            if (m2138getActiveBg0d7_KjU != j14) {
                j19 = m2138getActiveBg0d7_KjU;
            } else {
                j19 = u0Var.f27723j;
            }
            if (j34 != 16) {
                j20 = j34;
            } else {
                j20 = u0Var.f27724k;
            }
            if (m2005getSecondary0d7_KjU != j14) {
                j21 = m2005getSecondary0d7_KjU;
            } else {
                j21 = u0Var.f27725l;
            }
            if (j34 != 16) {
                j22 = j34;
            } else {
                j22 = u0Var.f27726m;
            }
            if (b15 != j14) {
                j23 = b15;
            } else {
                j23 = u0Var.f27727n;
            }
            if (j34 != 16) {
                j24 = j34;
            } else {
                j24 = u0Var.f27728o;
            }
            if (m2138getActiveBg0d7_KjU2 != j14) {
                j25 = m2138getActiveBg0d7_KjU2;
            } else {
                j25 = u0Var.f27729p;
            }
            if (j34 != 16) {
                j26 = j34;
            } else {
                j26 = u0Var.q;
            }
            if (m2005getSecondary0d7_KjU2 != j14) {
                j27 = m2005getSecondary0d7_KjU2;
            } else {
                j27 = u0Var.f27730r;
            }
            if (j34 != 16) {
                j28 = j34;
            } else {
                j28 = u0Var.f27731s;
            }
            if (b16 != j14) {
                j29 = b16;
            } else {
                j29 = u0Var.f27732t;
            }
            if (b17 != j14) {
                j30 = b17;
            } else {
                j30 = u0Var.f27733u;
            }
            if (j34 != 16) {
                j31 = j34;
            } else {
                j31 = u0Var.f27734v;
            }
            if (j34 != 16) {
                j32 = j34;
            } else {
                j32 = u0Var.f27735w;
            }
            if (j34 != 16) {
                j33 = j34;
            } else {
                j33 = u0Var.f27736x;
            }
            b2.b(d2Var, p2.e(qVar2, 1.0f), null, new q2.u0(j4, j10, j11, j12, j13, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, j31, j32, j33, u0Var.f27737y), null, null, false, null, qVar, 48);
            qVar.p(true);
            i3.t e27 = p2.e(qVar2, 1.0f);
            r1.x a11 = r1.w.a(eVar5, jVar, qVar, 0);
            int hashCode2 = Long.hashCode(qVar.T);
            c3.o l10 = qVar.l();
            i3.t c11 = i3.a.c(e27, qVar);
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            u2.r.J(eVar6, a11, qVar);
            u2.r.J(eVar7, l10, qVar);
            defpackage.f.u(hashCode2, qVar, eVar3, qVar, dVar2);
            u2.r.J(eVar2, c11, qVar);
            i3.t e28 = p2.e(qVar2, 1.0f);
            String R2 = kj.c.R(qVar, R.string.onboarding_next);
            FullWidthButtonSize fullWidthButtonSize = FullWidthButtonSize.Large;
            boolean isSubmitLoading = onboardingState.isSubmitLoading();
            if (d2Var.b() != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            boolean f13 = qVar.f(d2Var) | qVar.f(lVar) | qVar.h(onboardingState) | qVar.f(aVar);
            Object L2 = qVar.L();
            if (!f13 && L2 != eVar10) {
                aVar2 = aVar;
                f10 = 1.0f;
                lVar2 = lVar;
            } else {
                f10 = 1.0f;
                lVar2 = lVar;
                aVar2 = aVar;
                io.elevenlabs.readerapp.ui.screens.anonymous.signin.mfa.f fVar2 = new io.elevenlabs.readerapp.ui.screens.anonymous.signin.mfa.f((Object) d2Var, (sn.d) lVar2, (Object) onboardingState, aVar2, 3);
                qVar.h0(fVar2);
                L2 = fVar2;
            }
            FullWidthButtonKt.EchoThemeFullWidthButton(R2, (ho.a) L2, e28, fullWidthButtonSize, null, null, isSubmitLoading, z10, false, qVar, 3456, RCHTTPStatusCodes.NOT_MODIFIED);
            i3.t e29 = p2.e(qVar2, f10);
            String R3 = kj.c.R(qVar, R.string.onboarding_skip);
            boolean isSubmitLoading2 = onboardingState.isSubmitLoading();
            FullWidthButtonVariant fullWidthButtonVariant = FullWidthButtonVariant.Text;
            boolean f14 = qVar.f(lVar2) | qVar.f(aVar2);
            Object L3 = qVar.L();
            if (f14 || L3 == eVar10) {
                L3 = new v(lVar2, aVar2, 4);
                qVar.h0(L3);
            }
            FullWidthButtonKt.EchoThemeFullWidthButton(R3, (ho.a) L3, e29, fullWidthButtonSize, fullWidthButtonVariant, null, isSubmitLoading2, false, false, qVar, 28032, 416);
            ib.i.C(elevenLabsTheme, qVar, i13, qVar2, qVar);
            qVar.p(true);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z QuestionAgePage$lambda$2$1$0$0(c2 c2Var, ho.l lVar, final OnboardingState onboardingState, final ho.a aVar) {
        Long b10 = ((d2) c2Var).b();
        if (b10 != null) {
            final long longValue = b10.longValue() / SignalClient.CLOSE_REASON_NORMAL_CLOSURE;
            lVar.invoke(new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.d1
                @Override // ho.l
                public final Object invoke(Object obj) {
                    sn.z QuestionAgePage$lambda$2$1$0$0$0$0;
                    QuestionAgePage$lambda$2$1$0$0$0$0 = OnboardingScreenKt.QuestionAgePage$lambda$2$1$0$0$0$0(longValue, onboardingState, aVar, (OnboardingViewModel) obj);
                    return QuestionAgePage$lambda$2$1$0$0$0$0;
                }
            });
        }
        return sn.z.f31622a;
    }

    public static final sn.z QuestionAgePage$lambda$2$1$0$0$0$0(long j4, OnboardingState onboardingState, ho.a aVar, OnboardingViewModel onboardingViewModel) {
        onboardingViewModel.getClass();
        onboardingViewModel.validateAndProcessAge(j4, onboardingState, aVar);
        return sn.z.f31622a;
    }

    public static final sn.z QuestionAgePage$lambda$2$1$1$0(ho.l lVar, ho.a aVar) {
        lVar.invoke(new y0(1));
        aVar.invoke();
        return sn.z.f31622a;
    }

    public static final sn.z QuestionAgePage$lambda$2$1$1$0$0(OnboardingViewModel onboardingViewModel) {
        onboardingViewModel.getClass();
        onboardingViewModel.trackDOBSelection(null);
        return sn.z.f31622a;
    }

    public static final sn.z QuestionAgePage$lambda$3(ho.a aVar, ho.l lVar, OnboardingState onboardingState, Long l4, int i10, int i11, u2.m mVar, int i12) {
        QuestionAgePage(aVar, lVar, onboardingState, l4, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }

    private static final void QuestionContent(final ho.a aVar, final ho.l lVar, final OnboardingState onboardingState, final OnboardingPage.SurveyPage surveyPage, u2.m mVar, final int i10) {
        int i11;
        boolean z6;
        u2.r1 r10;
        ho.p pVar;
        OnboardingSurvey.Question question;
        List<OnboardingSurvey.Question> questions;
        int i12;
        int i13;
        int i14;
        int i15;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(1384514469);
        if ((i10 & 6) == 0) {
            if (qVar.h(aVar)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i11 = i15 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.h(lVar)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i11 |= i14;
        }
        if ((i10 & 384) == 0) {
            if (qVar.h(onboardingState)) {
                i13 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i13 = 128;
            }
            i11 |= i13;
        }
        if ((i10 & 3072) == 0) {
            if (qVar.f(surveyPage)) {
                i12 = 2048;
            } else {
                i12 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i11 |= i12;
        }
        boolean z10 = false;
        if ((i11 & 1171) != 1170) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i11 & 1, z6)) {
            OnboardingSurvey survey = onboardingState.getSurvey();
            if ((i11 & 7168) == 2048) {
                z10 = true;
            }
            boolean f10 = qVar.f(survey) | z10;
            Object L = qVar.L();
            if (f10 || L == u2.l.f33918a) {
                OnboardingSurvey survey2 = onboardingState.getSurvey();
                if (survey2 != null && (questions = survey2.getQuestions()) != null) {
                    question = (OnboardingSurvey.Question) tn.o.z0(surveyPage.getQuestionIndex(), questions);
                } else {
                    question = null;
                }
                L = question;
                qVar.h0(L);
            }
            OnboardingSurvey.Question question2 = (OnboardingSurvey.Question) L;
            if (question2 == null) {
                r10 = qVar.r();
                if (r10 != null) {
                    final int i16 = 0;
                    pVar = new ho.p() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.v0
                        @Override // ho.p
                        public final Object invoke(Object obj, Object obj2) {
                            sn.z QuestionContent$lambda$1;
                            sn.z QuestionContent$lambda$3;
                            switch (i16) {
                                case 0:
                                    int intValue = ((Integer) obj2).intValue();
                                    QuestionContent$lambda$1 = OnboardingScreenKt.QuestionContent$lambda$1(aVar, lVar, onboardingState, surveyPage, i10, (u2.m) obj, intValue);
                                    return QuestionContent$lambda$1;
                                default:
                                    int intValue2 = ((Integer) obj2).intValue();
                                    QuestionContent$lambda$3 = OnboardingScreenKt.QuestionContent$lambda$3(aVar, lVar, onboardingState, surveyPage, i10, (u2.m) obj, intValue2);
                                    return QuestionContent$lambda$3;
                            }
                        }
                    };
                    r10.f34012d = pVar;
                }
                return;
            }
            m1215QuestionPageScaffoldorJrPs(t2.u.P, c3.k.d(-2107227282, true, new a(question2, lVar, surveyPage, onboardingState, aVar, 1), qVar), qVar, 48, 1);
        } else {
            qVar.R();
        }
        r10 = qVar.r();
        if (r10 != null) {
            final int i17 = 1;
            pVar = new ho.p() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.v0
                @Override // ho.p
                public final Object invoke(Object obj, Object obj2) {
                    sn.z QuestionContent$lambda$1;
                    sn.z QuestionContent$lambda$3;
                    switch (i17) {
                        case 0:
                            int intValue = ((Integer) obj2).intValue();
                            QuestionContent$lambda$1 = OnboardingScreenKt.QuestionContent$lambda$1(aVar, lVar, onboardingState, surveyPage, i10, (u2.m) obj, intValue);
                            return QuestionContent$lambda$1;
                        default:
                            int intValue2 = ((Integer) obj2).intValue();
                            QuestionContent$lambda$3 = OnboardingScreenKt.QuestionContent$lambda$3(aVar, lVar, onboardingState, surveyPage, i10, (u2.m) obj, intValue2);
                            return QuestionContent$lambda$3;
                    }
                }
            };
            r10.f34012d = pVar;
        }
    }

    public static final sn.z QuestionContent$lambda$1(ho.a aVar, ho.l lVar, OnboardingState onboardingState, OnboardingPage.SurveyPage surveyPage, int i10, u2.m mVar, int i11) {
        QuestionContent(aVar, lVar, onboardingState, surveyPage, mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0328  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final sn.z QuestionContent$lambda$2(OnboardingSurvey.Question question, ho.l lVar, OnboardingPage.SurveyPage surveyPage, OnboardingState onboardingState, ho.a aVar, r1.y yVar, u2.m mVar, int i10) {
        boolean z6;
        boolean z10;
        i3.j jVar = i3.d.B0;
        yVar.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            i3.q qVar2 = i3.q.f13017a;
            i3.t d10 = p2.d(qVar2, 1.0f);
            r1.x a10 = r1.w.a(r1.j.f29230c, jVar, qVar, 0);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.t c5 = i3.a.c(d10, qVar);
            h4.h.f11920i.getClass();
            ho.a aVar2 = h4.g.f11903b;
            qVar.b0();
            if (qVar.S) {
                qVar.k(aVar2);
            } else {
                qVar.k0();
            }
            h4.e eVar = h4.g.f11907f;
            u2.r.J(eVar, a10, qVar);
            h4.e eVar2 = h4.g.f11906e;
            u2.r.J(eVar2, l4, qVar);
            Integer valueOf = Integer.valueOf(hashCode);
            h4.e eVar3 = h4.g.f11908g;
            u2.r.y(qVar, valueOf, eVar3);
            h4.d dVar = h4.g.f11909h;
            u2.r.F(dVar, qVar);
            h4.e eVar4 = h4.g.f11905d;
            u2.r.J(eVar4, c5, qVar);
            if (1.0f <= 0.0d) {
                s1.a.a("invalid weight; must be greater than zero");
            }
            m1 m1Var = new m1(1.0f, true);
            f4.f1 d11 = r1.p.d(i3.d.Z, false);
            int hashCode2 = Long.hashCode(qVar.T);
            c3.o l7 = qVar.l();
            i3.t c10 = i3.a.c(m1Var, qVar);
            qVar.b0();
            if (qVar.S) {
                qVar.k(aVar2);
            } else {
                qVar.k0();
            }
            u2.r.J(eVar, d11, qVar);
            u2.r.J(eVar2, l7, qVar);
            defpackage.f.u(hashCode2, qVar, eVar3, qVar, dVar);
            u2.r.J(eVar4, c10, qVar);
            i3.t y10 = l1.n.y(p2.d(qVar2, 1.0f), l1.n.x(qVar), true, true);
            r1.x a11 = r1.w.a(r1.j.f29232e, jVar, qVar, 6);
            int hashCode3 = Long.hashCode(qVar.T);
            c3.o l10 = qVar.l();
            i3.t c11 = i3.a.c(y10, qVar);
            qVar.b0();
            if (qVar.S) {
                qVar.k(aVar2);
            } else {
                qVar.k0();
            }
            u2.r.J(eVar, a11, qVar);
            u2.r.J(eVar2, l10, qVar);
            defpackage.f.u(hashCode3, qVar, eVar3, qVar, dVar);
            u2.r.J(eVar4, c11, qVar);
            String title = question.getTitle();
            ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
            int i11 = ElevenLabsTheme.$stable;
            j7.d(title, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar, i11).getTitleLarge700Eleven(), qVar, 0, 0, 131070);
            ib.i.C(elevenLabsTheme, qVar, i11, qVar2, qVar);
            r1.x a12 = r1.w.a(r1.j.g(elevenLabsTheme.getSpacings(qVar, i11).m2355getX3D9Ej5fM()), jVar, qVar, 0);
            int hashCode4 = Long.hashCode(qVar.T);
            c3.o l11 = qVar.l();
            i3.t c12 = i3.a.c(qVar2, qVar);
            qVar.b0();
            if (qVar.S) {
                qVar.k(aVar2);
            } else {
                qVar.k0();
            }
            u2.r.J(eVar, a12, qVar);
            u2.r.J(eVar2, l11, qVar);
            defpackage.f.u(hashCode4, qVar, eVar3, qVar, dVar);
            u2.r.J(eVar4, c12, qVar);
            qVar.X(862806319);
            for (final OnboardingSurvey.Answer answer : question.getAnswers()) {
                boolean selected = answer.getSelected();
                String title2 = answer.getTitle();
                c3.j d12 = c3.k.d(-428096916, true, new ho.q() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.OnboardingScreenKt$QuestionContent$1$1$1$1$1$1$1
                    @Override // ho.q
                    public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                        m1216invokeek8zF_U(((p3.x) obj).f26440a, (u2.m) obj2, ((Number) obj3).intValue());
                        return sn.z.f31622a;
                    }

                    /* renamed from: invoke-ek8zF_U, reason: not valid java name */
                    public final void m1216invokeek8zF_U(long j4, u2.m mVar2, int i12) {
                        boolean z11;
                        int i13;
                        if ((i12 & 6) == 0) {
                            if (((u2.q) mVar2).e(j4)) {
                                i13 = 4;
                            } else {
                                i13 = 2;
                            }
                            i12 |= i13;
                        }
                        if ((i12 & 19) != 18) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        u2.q qVar3 = (u2.q) mVar2;
                        if (qVar3.O(i12 & 1, z11)) {
                            String icon = OnboardingSurvey.Answer.this.getIcon();
                            if (icon != null) {
                                qVar3.X(-1677189802);
                                RemoteIconKt.m1870RemoteIconFNF3uiM(icon, p2.d(i3.q.f13017a, 1.0f), j4, qVar3, ((i12 << 6) & 896) | 48, 0);
                                qVar3.p(false);
                                return;
                            } else {
                                qVar3.X(-1676882282);
                                qVar3.p(false);
                                return;
                            }
                        }
                        qVar3.R();
                    }
                }, qVar);
                boolean f10 = qVar.f(lVar) | qVar.h(question) | qVar.h(answer);
                Object L = qVar.L();
                if (f10 || L == u2.l.f33918a) {
                    L = new c3.b(lVar, question, answer, 10);
                    qVar.h0(L);
                }
                SelectableCardKt.SelectableCard(selected, d12, title2, (String) null, (ho.a) L, (i3.t) null, qVar, 3120, 32);
            }
            qVar.p(false);
            ElevenLabsTheme elevenLabsTheme2 = ElevenLabsTheme.INSTANCE;
            int i12 = ElevenLabsTheme.$stable;
            ib.i.p(elevenLabsTheme2, qVar, i12, qVar2, qVar);
            qVar.p(true);
            qVar.p(true);
            VerticalGradientKt.VerticalGradient(p2.f(p2.e(qVar2, 1.0f), elevenLabsTheme2.getSpacings(qVar, i12).m2355getX3D9Ej5fM()), ig.f.I(new p3.x(p3.x.b(t2.u.P, elevenLabsTheme2.getColor(qVar, i12).getBackground().m2003getPrimary0d7_KjU())), new p3.x(ib.i.d(elevenLabsTheme2, qVar, i12))), qVar, 0, 0);
            qVar.p(true);
            i3.t e10 = p2.e(qVar2, 1.0f);
            r1.u0 u0Var = r1.j.f29228a;
            r1.x a13 = r1.w.a(ib.i.n(elevenLabsTheme2, qVar, i12), jVar, qVar, 0);
            int hashCode5 = Long.hashCode(qVar.T);
            c3.o l12 = qVar.l();
            i3.t c13 = i3.a.c(e10, qVar);
            h4.h.f11920i.getClass();
            ho.a aVar3 = h4.g.f11903b;
            qVar.b0();
            if (qVar.S) {
                qVar.k(aVar3);
            } else {
                qVar.k0();
            }
            u2.r.J(h4.g.f11907f, a13, qVar);
            u2.r.J(h4.g.f11906e, l12, qVar);
            u2.r.y(qVar, Integer.valueOf(hashCode5), h4.g.f11908g);
            u2.r.F(h4.g.f11909h, qVar);
            u2.r.J(h4.g.f11905d, c13, qVar);
            i3.t x10 = i4.i0.x(p2.e(qVar2, 1.0f), "continue-" + surveyPage.getQuestionIndex());
            String R = kj.c.R(qVar, R.string.onboarding_next);
            if (!question.getOptional()) {
                List<OnboardingSurvey.Answer> answers = question.getAnswers();
                if (answers == null || !answers.isEmpty()) {
                    Iterator<T> it = answers.iterator();
                    while (it.hasNext()) {
                        if (((OnboardingSurvey.Answer) it.next()).getSelected()) {
                        }
                    }
                }
                z10 = false;
                FullWidthButtonSize fullWidthButtonSize = FullWidthButtonSize.Large;
                FullWidthButtonKt.EchoThemeFullWidthButton(R, aVar, x10, fullWidthButtonSize, null, null, onboardingState.isSubmitLoading(), z10, false, qVar, 3072, RCHTTPStatusCodes.NOT_MODIFIED);
                u2.q qVar3 = qVar;
                if (!question.getOptional()) {
                    qVar3.X(-1279091472);
                    FullWidthButtonKt.EchoThemeFullWidthButton(kj.c.R(qVar3, R.string.onboarding_skip), aVar, p2.e(qVar2, 1.0f), fullWidthButtonSize, FullWidthButtonVariant.Text, null, false, false, false, qVar3, 28032, 480);
                    qVar3 = qVar3;
                    qVar3.p(false);
                } else {
                    qVar3.X(-1278743032);
                    qVar3.p(false);
                }
                qVar3.p(true);
                ib.i.C(ElevenLabsTheme.INSTANCE, qVar3, ElevenLabsTheme.$stable, qVar2, qVar3);
                qVar3.p(true);
            }
            z10 = true;
            FullWidthButtonSize fullWidthButtonSize2 = FullWidthButtonSize.Large;
            FullWidthButtonKt.EchoThemeFullWidthButton(R, aVar, x10, fullWidthButtonSize2, null, null, onboardingState.isSubmitLoading(), z10, false, qVar, 3072, RCHTTPStatusCodes.NOT_MODIFIED);
            u2.q qVar32 = qVar;
            if (!question.getOptional()) {
            }
            qVar32.p(true);
            ib.i.C(ElevenLabsTheme.INSTANCE, qVar32, ElevenLabsTheme.$stable, qVar2, qVar32);
            qVar32.p(true);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z QuestionContent$lambda$2$0$0$0$0$0$0$0(ho.l lVar, OnboardingSurvey.Question question, OnboardingSurvey.Answer answer) {
        lVar.invoke(new x0(question, answer, 0));
        return sn.z.f31622a;
    }

    public static final sn.z QuestionContent$lambda$2$0$0$0$0$0$0$0$0(OnboardingSurvey.Question question, OnboardingSurvey.Answer answer, OnboardingViewModel onboardingViewModel) {
        onboardingViewModel.getClass();
        onboardingViewModel.toggleAnswer(question, answer);
        return sn.z.f31622a;
    }

    public static final sn.z QuestionContent$lambda$3(ho.a aVar, ho.l lVar, OnboardingState onboardingState, OnboardingPage.SurveyPage surveyPage, int i10, u2.m mVar, int i11) {
        QuestionContent(aVar, lVar, onboardingState, surveyPage, mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    /* renamed from: QuestionPageScaffold--orJrPs */
    private static final void m1215QuestionPageScaffoldorJrPs(final float f10, final ho.q qVar, u2.m mVar, int i10, int i11) {
        int i12;
        boolean z6;
        int i13;
        int i14;
        u2.q qVar2 = (u2.q) mVar;
        qVar2.Z(-1994080493);
        if ((i10 & 6) == 0) {
            if ((i11 & 1) == 0 && qVar2.c(f10)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i12 = i14 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar2.h(qVar)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i12 |= i13;
        }
        if ((i12 & 19) != 18) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar2.O(i12 & 1, z6)) {
            qVar2.T();
            if ((i10 & 1) != 0 && !qVar2.y()) {
                qVar2.R();
                int i15 = i11 & 1;
            } else if ((i11 & 1) != 0) {
                f10 = ElevenLabsTheme.INSTANCE.getSpacings(qVar2, ElevenLabsTheme.$stable).m2357getX5D9Ej5fM();
            }
            qVar2.q();
            i3.q qVar3 = i3.q.f13017a;
            i3.t d10 = p2.d(qVar3, 1.0f);
            WeakHashMap weakHashMap = c3.f29142x;
            i3.t p10 = r1.d.p(d10, new o1(r1.u0.e(qVar2).f29154l, 16));
            r1.x a10 = r1.w.a(r1.j.f29230c, i3.d.C0, qVar2, 48);
            int hashCode = Long.hashCode(qVar2.T);
            c3.o l4 = qVar2.l();
            i3.t c5 = i3.a.c(p10, qVar2);
            h4.h.f11920i.getClass();
            h4.f fVar = h4.g.f11903b;
            qVar2.b0();
            if (qVar2.S) {
                qVar2.k(fVar);
            } else {
                qVar2.k0();
            }
            u2.r.J(h4.g.f11907f, a10, qVar2);
            u2.r.J(h4.g.f11906e, l4, qVar2);
            u2.r.y(qVar2, Integer.valueOf(hashCode), h4.g.f11908g);
            u2.r.F(h4.g.f11909h, qVar2);
            u2.r.J(h4.g.f11905d, c5, qVar2);
            CenteredContentScaffoldKt.CenteredContentBox(p2.d(qVar3, 1.0f), c3.k.d(1575724265, true, new ho.p() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.z0
                @Override // ho.p
                public final Object invoke(Object obj, Object obj2) {
                    sn.z QuestionPageScaffold__orJrPs$lambda$0$0;
                    int intValue = ((Integer) obj2).intValue();
                    QuestionPageScaffold__orJrPs$lambda$0$0 = OnboardingScreenKt.QuestionPageScaffold__orJrPs$lambda$0$0(f10, qVar, (u2.m) obj, intValue);
                    return QuestionPageScaffold__orJrPs$lambda$0$0;
                }
            }, qVar2), qVar2, 54, 0);
            r1.d.g(r1.d.N(r1.u0.e(qVar2).f29155m), qVar2);
            qVar2.p(true);
        } else {
            qVar2.R();
        }
        float f11 = f10;
        u2.r1 r10 = qVar2.r();
        if (r10 != null) {
            r10.f34012d = new a1(f11, qVar, i10, i11, 0);
        }
    }

    public static final sn.z QuestionPageScaffold__orJrPs$lambda$0$0(float f10, ho.q qVar, u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar2 = (u2.q) mVar;
        if (qVar2.O(i10 & 1, z6)) {
            i3.q qVar3 = i3.q.f13017a;
            i3.t d10 = p2.d(qVar3, 1.0f);
            r1.e eVar = r1.j.f29230c;
            i3.j jVar = i3.d.B0;
            r1.x a10 = r1.w.a(eVar, jVar, qVar2, 0);
            int hashCode = Long.hashCode(qVar2.T);
            c3.o l4 = qVar2.l();
            i3.t c5 = i3.a.c(d10, qVar2);
            h4.h.f11920i.getClass();
            h4.f fVar = h4.g.f11903b;
            qVar2.b0();
            if (qVar2.S) {
                qVar2.k(fVar);
            } else {
                qVar2.k0();
            }
            h4.e eVar2 = h4.g.f11907f;
            u2.r.J(eVar2, a10, qVar2);
            h4.e eVar3 = h4.g.f11906e;
            u2.r.J(eVar3, l4, qVar2);
            Integer valueOf = Integer.valueOf(hashCode);
            h4.e eVar4 = h4.g.f11908g;
            u2.r.y(qVar2, valueOf, eVar4);
            h4.d dVar = h4.g.f11909h;
            u2.r.F(dVar, qVar2);
            h4.e eVar5 = h4.g.f11905d;
            u2.r.J(eVar5, c5, qVar2);
            ib.i.C(ElevenLabsTheme.INSTANCE, qVar2, ElevenLabsTheme.$stable, qVar3, qVar2);
            i3.t G = r1.d.G(p2.d(qVar3, 1.0f), f10, t2.u.P, 2);
            r1.x a11 = r1.w.a(eVar, jVar, qVar2, 0);
            int hashCode2 = Long.hashCode(qVar2.T);
            c3.o l7 = qVar2.l();
            i3.t c10 = i3.a.c(G, qVar2);
            qVar2.b0();
            if (qVar2.S) {
                qVar2.k(fVar);
            } else {
                qVar2.k0();
            }
            u2.r.J(eVar2, a11, qVar2);
            u2.r.J(eVar3, l7, qVar2);
            defpackage.f.u(hashCode2, qVar2, eVar4, qVar2, dVar);
            u2.r.J(eVar5, c10, qVar2);
            qVar.invoke(r1.z.f29398a, qVar2, 6);
            qVar2.p(true);
            qVar2.p(true);
        } else {
            qVar2.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z QuestionPageScaffold__orJrPs$lambda$1(float f10, ho.q qVar, int i10, int i11, u2.m mVar, int i12) {
        m1215QuestionPageScaffoldorJrPs(f10, qVar, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }

    public static final void SectionHeader(String str, u2.m mVar, int i10) {
        int i11;
        boolean z6;
        u2.q qVar;
        int i12;
        u2.q qVar2 = (u2.q) mVar;
        qVar2.Z(1786926137);
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
            int i13 = ElevenLabsTheme.$stable;
            qVar = qVar2;
            j7.d(str, r1.d.F(i3.q.f13017a, elevenLabsTheme.getSpacings(qVar2, i13).m2357getX5D9Ej5fM(), elevenLabsTheme.getSpacings(qVar2, i13).m2353getX2D9Ej5fM()), ib.i.w(elevenLabsTheme, qVar2, i13), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar2, i13).getBodySmall500(), qVar, i11 & 14, 0, 131064);
        } else {
            qVar = qVar2;
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.components.q0(str, i10, 1);
        }
    }

    public static final sn.z SectionHeader$lambda$0(String str, int i10, u2.m mVar, int i11) {
        SectionHeader(str, mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    private static final void SuggestedVoices(OnboardingState onboardingState, ho.l lVar, ho.a aVar, u2.m mVar, int i10) {
        int i11;
        boolean z6;
        int i12;
        int i13;
        int i14;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(1336002641);
        if ((i10 & 6) == 0) {
            if (qVar.h(onboardingState)) {
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
            m1215QuestionPageScaffoldorJrPs(0, c3.k.d(860589096, true, new fm.o(onboardingState, aVar, lVar, 6), qVar), qVar, 54, 0);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new k3(i10, 11, lVar, (Object) onboardingState, (Object) aVar);
        }
    }

    public static final sn.z SuggestedVoices$lambda$0(OnboardingState onboardingState, ho.a aVar, ho.l lVar, r1.y yVar, u2.m mVar, int i10) {
        boolean z6;
        final OnboardingState onboardingState2;
        final ho.l lVar2;
        int i11;
        float f10;
        float f11;
        Object v0Var;
        i3.q qVar;
        float f12;
        int i12;
        u2.q qVar2;
        yVar.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar3 = (u2.q) mVar;
        if (qVar3.O(i10 & 1, z6)) {
            i3.q qVar4 = i3.q.f13017a;
            i3.t d10 = p2.d(qVar4, 1.0f);
            i3.l lVar3 = i3.d.f12997a;
            f4.f1 d11 = r1.p.d(lVar3, false);
            int hashCode = Long.hashCode(qVar3.T);
            c3.o l4 = qVar3.l();
            i3.t c5 = i3.a.c(d10, qVar3);
            h4.h.f11920i.getClass();
            h4.f fVar = h4.g.f11903b;
            qVar3.b0();
            if (qVar3.S) {
                qVar3.k(fVar);
            } else {
                qVar3.k0();
            }
            h4.e eVar = h4.g.f11907f;
            u2.r.J(eVar, d11, qVar3);
            h4.e eVar2 = h4.g.f11906e;
            u2.r.J(eVar2, l4, qVar3);
            Integer valueOf = Integer.valueOf(hashCode);
            h4.e eVar3 = h4.g.f11908g;
            u2.r.y(qVar3, valueOf, eVar3);
            h4.d dVar = h4.g.f11909h;
            u2.r.F(dVar, qVar3);
            h4.e eVar4 = h4.g.f11905d;
            u2.r.J(eVar4, c5, qVar3);
            i3.t d12 = p2.d(qVar4, 1.0f);
            r1.e eVar5 = r1.j.f29230c;
            i3.j jVar = i3.d.B0;
            r1.x a10 = r1.w.a(eVar5, jVar, qVar3, 0);
            int hashCode2 = Long.hashCode(qVar3.T);
            c3.o l7 = qVar3.l();
            i3.t c10 = i3.a.c(d12, qVar3);
            qVar3.b0();
            if (qVar3.S) {
                qVar3.k(fVar);
            } else {
                qVar3.k0();
            }
            u2.r.J(eVar, a10, qVar3);
            u2.r.J(eVar2, l7, qVar3);
            defpackage.f.u(hashCode2, qVar3, eVar3, qVar3, dVar);
            u2.r.J(eVar4, c10, qVar3);
            ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
            int i13 = ElevenLabsTheme.$stable;
            i3.t G = r1.d.G(qVar4, elevenLabsTheme.getSpacings(qVar3, i13).m2357getX5D9Ej5fM(), t2.u.P, 2);
            r1.x a11 = r1.w.a(eVar5, jVar, qVar3, 0);
            int hashCode3 = Long.hashCode(qVar3.T);
            c3.o l10 = qVar3.l();
            i3.t c11 = i3.a.c(G, qVar3);
            qVar3.b0();
            if (qVar3.S) {
                qVar3.k(fVar);
            } else {
                qVar3.k0();
            }
            u2.r.J(eVar, a11, qVar3);
            u2.r.J(eVar2, l10, qVar3);
            defpackage.f.u(hashCode3, qVar3, eVar3, qVar3, dVar);
            u2.r.J(eVar4, c11, qVar3);
            j7.d(kj.c.R(qVar3, R.string.onboarding_page_4_title), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar3, i13).getTitleLarge700Eleven(), qVar3, 0, 0, 131070);
            ib.i.C(elevenLabsTheme, qVar3, i13, qVar4, qVar3);
            j7.d(kj.c.R(qVar3, R.string.onboarding_page_4_content), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar3, i13).getBody(), qVar3, 0, 0, 131070);
            u2.q qVar5 = qVar3;
            qVar5.p(true);
            r1.d.g(p2.f(qVar4, elevenLabsTheme.getSpacings(qVar5, i13).m2358getX6D9Ej5fM()), qVar5);
            float f13 = Float.MAX_VALUE;
            if (onboardingState.getVoicesSuggestionsLoading()) {
                qVar5.X(-134055558);
                if (1.0f <= 0.0d) {
                    s1.a.a("invalid weight; must be greater than zero");
                }
                if (1.0f <= Float.MAX_VALUE) {
                    f13 = 1.0f;
                }
                m1 m1Var = new m1(f13, true);
                f4.f1 d13 = r1.p.d(lVar3, false);
                int hashCode4 = Long.hashCode(qVar5.T);
                c3.o l11 = qVar5.l();
                i3.t c12 = i3.a.c(m1Var, qVar5);
                qVar5.b0();
                if (qVar5.S) {
                    qVar5.k(fVar);
                } else {
                    qVar5.k0();
                }
                u2.r.J(eVar, d13, qVar5);
                u2.r.J(eVar2, l11, qVar5);
                defpackage.f.u(hashCode4, qVar5, eVar3, qVar5, dVar);
                u2.r.J(eVar4, c12, qVar5);
                LoaderKt.LoaderRow(qVar5, 0);
                qVar5.p(true);
                qVar5.p(false);
                onboardingState2 = onboardingState;
                lVar2 = lVar;
                i11 = 2;
                f10 = 1.0f;
                f11 = t2.u.P;
                qVar2 = qVar5;
            } else if (!onboardingState.getVoicesSuggestions().isEmpty()) {
                qVar5.X(-133783316);
                boolean f14 = qVar5.f(onboardingState.getVoicesSuggestions());
                Object L = qVar5.L();
                u2.e eVar6 = u2.l.f33918a;
                Object obj = L;
                if (f14 || L == eVar6) {
                    List<Voice> voicesSuggestions = onboardingState.getVoicesSuggestions();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : voicesSuggestions) {
                        if (((Voice) obj2).getCategory() == VoiceCategory.Famous) {
                            arrayList.add(obj2);
                        }
                    }
                    qVar5.h0(arrayList);
                    obj = arrayList;
                }
                List list = (List) obj;
                boolean f15 = qVar5.f(onboardingState.getVoicesSuggestions());
                Object L2 = qVar5.L();
                Object obj3 = L2;
                if (f15 || L2 == eVar6) {
                    List<Voice> voicesSuggestions2 = onboardingState.getVoicesSuggestions();
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj4 : voicesSuggestions2) {
                        if (((Voice) obj4).getCategory() != VoiceCategory.Famous) {
                            arrayList2.add(obj4);
                        }
                    }
                    qVar5.h0(arrayList2);
                    obj3 = arrayList2;
                }
                List list2 = (List) obj3;
                if (1.0f <= 0.0d) {
                    s1.a.a("invalid weight; must be greater than zero");
                }
                if (1.0f <= Float.MAX_VALUE) {
                    f13 = 1.0f;
                }
                m1 m1Var2 = new m1(f13, true);
                f4.f1 d14 = r1.p.d(i3.d.Z, false);
                int hashCode5 = Long.hashCode(qVar5.T);
                c3.o l12 = qVar5.l();
                i3.t c13 = i3.a.c(m1Var2, qVar5);
                h4.h.f11920i.getClass();
                h4.f fVar2 = h4.g.f11903b;
                qVar5.b0();
                if (qVar5.S) {
                    qVar5.k(fVar2);
                } else {
                    qVar5.k0();
                }
                u2.r.J(h4.g.f11907f, d14, qVar5);
                u2.r.J(h4.g.f11906e, l12, qVar5);
                u2.r.y(qVar5, Integer.valueOf(hashCode5), h4.g.f11908g);
                u2.r.F(h4.g.f11909h, qVar5);
                u2.r.J(h4.g.f11905d, c13, qVar5);
                r1.u0 u0Var = r1.j.f29228a;
                ElevenLabsTheme elevenLabsTheme2 = ElevenLabsTheme.INSTANCE;
                int i14 = ElevenLabsTheme.$stable;
                r1.h g10 = r1.j.g(elevenLabsTheme2.getSpacings(qVar5, i14).m2355getX3D9Ej5fM());
                i3.t d15 = p2.d(qVar4, 1.0f);
                r1.d2 f16 = r1.d.f(t2.u.P, t2.u.P, t2.u.P, elevenLabsTheme2.getSpacings(qVar5, i14).m2357getX5D9Ej5fM(), 7);
                boolean h10 = qVar5.h(list) | qVar5.h(onboardingState) | qVar5.f(lVar) | qVar5.h(list2);
                Object L3 = qVar5.L();
                if (!h10 && L3 != eVar6) {
                    f12 = 1.0f;
                    lVar2 = lVar;
                    onboardingState2 = onboardingState;
                    qVar = qVar4;
                    v0Var = L3;
                    i12 = 2;
                } else {
                    qVar = qVar4;
                    onboardingState2 = onboardingState;
                    f12 = 1.0f;
                    lVar2 = lVar;
                    i12 = 2;
                    v0Var = new a2.v0(list, list2, onboardingState2, lVar2, 8);
                    qVar5.h0(v0Var);
                }
                ho.l lVar4 = (ho.l) v0Var;
                qVar4 = qVar;
                f10 = f12;
                i11 = i12;
                f11 = 0.0f;
                rd.c1.c(d15, null, f16, false, g10, null, null, false, null, lVar4, qVar5, 6, 490);
                u2.q qVar6 = qVar5;
                ShadowKt.m1875BottomShadow8s8adOk(elevenLabsTheme2.getSpacings(qVar6, i14).m2357getX5D9Ej5fM(), 0L, false, qVar6, 0, 6);
                qVar6.p(true);
                qVar6.p(false);
                qVar2 = qVar6;
            } else {
                onboardingState2 = onboardingState;
                lVar2 = lVar;
                i11 = 2;
                f10 = 1.0f;
                f11 = t2.u.P;
                qVar5.X(-130513994);
                qVar5.p(false);
                qVar2 = qVar5;
            }
            i3.t e10 = p2.e(i4.i0.x(qVar4, "continue-voices"), f10);
            ElevenLabsTheme elevenLabsTheme3 = ElevenLabsTheme.INSTANCE;
            int i15 = ElevenLabsTheme.$stable;
            u2.q qVar7 = qVar2;
            FullWidthButtonKt.EchoThemeFullWidthButton(kj.c.R(qVar2, R.string.onboarding_next), aVar, r1.d.G(e10, elevenLabsTheme3.getSpacings(qVar2, i15).m2357getX5D9Ej5fM(), f11, i11), FullWidthButtonSize.Large, null, null, onboardingState2.isSubmitLoading(), false, false, qVar7, 3072, 432);
            u2.q qVar8 = qVar7;
            ib.i.C(elevenLabsTheme3, qVar8, i15, qVar4, qVar8);
            qVar8.p(true);
            if (onboardingState2.getVoicesSuggestionError() != null) {
                qVar8.X(-1733826791);
                ErrorScreenKt.m1836ErrorScreenV9fs2A(null, null, onboardingState2.getVoicesSuggestionError(), c3.k.d(1788800993, true, new ho.p() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.u0
                    @Override // ho.p
                    public final Object invoke(Object obj5, Object obj6) {
                        sn.z SuggestedVoices$lambda$0$0$1;
                        int intValue = ((Integer) obj6).intValue();
                        SuggestedVoices$lambda$0$0$1 = OnboardingScreenKt.SuggestedVoices$lambda$0$0$1(ho.l.this, onboardingState2, (u2.m) obj5, intValue);
                        return SuggestedVoices$lambda$0$0$1;
                    }
                }, qVar8), null, 0L, qVar8, 3072, 51);
                qVar8 = qVar8;
                qVar8.p(false);
            } else {
                qVar8.X(-1733389536);
                qVar8.p(false);
            }
            qVar8.p(true);
        } else {
            qVar3.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z SuggestedVoices$lambda$0$0$0$4$0$0(final List list, final List list2, final OnboardingState onboardingState, final ho.l lVar, t1.t tVar) {
        tVar.getClass();
        if (!list.isEmpty()) {
            t1.t.c(tVar, null, null, ComposableSingletons$OnboardingScreenKt.INSTANCE.m1194getLambda$1050809806$app_productionRelease(), 3);
            final OnboardingScreenKt$SuggestedVoices$lambda$0$0$0$4$0$0$$inlined$items$default$1 onboardingScreenKt$SuggestedVoices$lambda$0$0$0$4$0$0$$inlined$items$default$1 = new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.OnboardingScreenKt$SuggestedVoices$lambda$0$0$0$4$0$0$$inlined$items$default$1
                @Override // ho.l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return invoke((Voice) obj);
                }

                @Override // ho.l
                public final Void invoke(Voice voice) {
                    return null;
                }
            };
            ((t1.i) tVar).u(list.size(), null, new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.OnboardingScreenKt$SuggestedVoices$lambda$0$0$0$4$0$0$$inlined$items$default$3
                public final Object invoke(int i10) {
                    return ho.l.this.invoke(list.get(i10));
                }

                @Override // ho.l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return invoke(((Number) obj).intValue());
                }
            }, new c3.j(new ho.r() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.OnboardingScreenKt$SuggestedVoices$lambda$0$0$0$4$0$0$$inlined$items$default$4
                public final void invoke(t1.b bVar, int i10, u2.m mVar, int i11) {
                    int i12;
                    boolean z6;
                    int i13;
                    int i14;
                    if ((i11 & 6) == 0) {
                        if (((u2.q) mVar).f(bVar)) {
                            i14 = 4;
                        } else {
                            i14 = 2;
                        }
                        i12 = i11 | i14;
                    } else {
                        i12 = i11;
                    }
                    if ((i11 & 48) == 0) {
                        if (((u2.q) mVar).d(i10)) {
                            i13 = 32;
                        } else {
                            i13 = 16;
                        }
                        i12 |= i13;
                    }
                    if ((i12 & 147) != 146) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    u2.q qVar = (u2.q) mVar;
                    if (qVar.O(i12 & 1, z6)) {
                        final Voice voice = (Voice) list.get(i10);
                        qVar.X(-1392491794);
                        String voiceId = voice.getVoiceId();
                        String name = voice.getName();
                        String subtitle = voice.getSubtitle();
                        if (subtitle == null) {
                            subtitle = voice.getDescription();
                        }
                        String str = subtitle;
                        String useCase = voice.getUseCase();
                        String imageUrl = voice.getImageUrl();
                        boolean c5 = kotlin.jvm.internal.m.c(onboardingState.getSelectedVoiceId(), voice.getVoiceId());
                        boolean c10 = kotlin.jvm.internal.m.c(onboardingState.getPlayingPreviewVoiceId(), voice.getVoiceId());
                        boolean f10 = qVar.f(lVar) | qVar.h(voice);
                        Object L = qVar.L();
                        if (f10 || L == u2.l.f33918a) {
                            final ho.l lVar2 = lVar;
                            L = new ho.a() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.OnboardingScreenKt$SuggestedVoices$1$1$1$3$1$1$1$1$1
                                /* renamed from: invoke, reason: collision with other method in class */
                                public final void m1217invoke() {
                                    ho.l lVar3 = ho.l.this;
                                    final Voice voice2 = voice;
                                    lVar3.invoke(new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.OnboardingScreenKt$SuggestedVoices$1$1$1$3$1$1$1$1$1.1
                                        public final void invoke(OnboardingViewModel onboardingViewModel) {
                                            onboardingViewModel.getClass();
                                            onboardingViewModel.selectVoice(Voice.this);
                                        }

                                        @Override // ho.l
                                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                            invoke((OnboardingViewModel) obj);
                                            return sn.z.f31622a;
                                        }
                                    });
                                }

                                @Override // ho.a
                                public /* bridge */ /* synthetic */ Object invoke() {
                                    m1217invoke();
                                    return sn.z.f31622a;
                                }
                            };
                            qVar.h0(L);
                        }
                        VoiceRowKt.m1108VoiceRowLYuG0Iw(voiceId, (ho.a) L, name, str, useCase, imageUrl, false, c5, null, false, c10, null, t2.u.P, null, qVar, 806879232, 0, 14592);
                        qVar.p(false);
                        return;
                    }
                    qVar.R();
                }

                @Override // ho.r
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    invoke((t1.b) obj, ((Number) obj2).intValue(), (u2.m) obj3, ((Number) obj4).intValue());
                    return sn.z.f31622a;
                }
            }, true, 802480018));
        }
        if (!list2.isEmpty()) {
            t1.t.c(tVar, null, null, ComposableSingletons$OnboardingScreenKt.INSTANCE.getLambda$280739419$app_productionRelease(), 3);
            final OnboardingScreenKt$SuggestedVoices$lambda$0$0$0$4$0$0$$inlined$items$default$5 onboardingScreenKt$SuggestedVoices$lambda$0$0$0$4$0$0$$inlined$items$default$5 = new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.OnboardingScreenKt$SuggestedVoices$lambda$0$0$0$4$0$0$$inlined$items$default$5
                @Override // ho.l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return invoke((Voice) obj);
                }

                @Override // ho.l
                public final Void invoke(Voice voice) {
                    return null;
                }
            };
            ((t1.i) tVar).u(list2.size(), null, new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.OnboardingScreenKt$SuggestedVoices$lambda$0$0$0$4$0$0$$inlined$items$default$7
                public final Object invoke(int i10) {
                    return ho.l.this.invoke(list2.get(i10));
                }

                @Override // ho.l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return invoke(((Number) obj).intValue());
                }
            }, new c3.j(new ho.r() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.OnboardingScreenKt$SuggestedVoices$lambda$0$0$0$4$0$0$$inlined$items$default$8
                public final void invoke(t1.b bVar, int i10, u2.m mVar, int i11) {
                    int i12;
                    boolean z6;
                    int i13;
                    int i14;
                    if ((i11 & 6) == 0) {
                        if (((u2.q) mVar).f(bVar)) {
                            i14 = 4;
                        } else {
                            i14 = 2;
                        }
                        i12 = i11 | i14;
                    } else {
                        i12 = i11;
                    }
                    if ((i11 & 48) == 0) {
                        if (((u2.q) mVar).d(i10)) {
                            i13 = 32;
                        } else {
                            i13 = 16;
                        }
                        i12 |= i13;
                    }
                    if ((i12 & 147) != 146) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    u2.q qVar = (u2.q) mVar;
                    if (qVar.O(i12 & 1, z6)) {
                        final Voice voice = (Voice) list2.get(i10);
                        qVar.X(2118498920);
                        String voiceId = voice.getVoiceId();
                        String name = voice.getName();
                        String subtitle = voice.getSubtitle();
                        if (subtitle == null) {
                            subtitle = voice.getDescription();
                        }
                        String str = subtitle;
                        String useCase = voice.getUseCase();
                        String imageUrl = voice.getImageUrl();
                        boolean c5 = kotlin.jvm.internal.m.c(onboardingState.getSelectedVoiceId(), voice.getVoiceId());
                        boolean c10 = kotlin.jvm.internal.m.c(onboardingState.getPlayingPreviewVoiceId(), voice.getVoiceId());
                        boolean f10 = qVar.f(lVar) | qVar.h(voice);
                        Object L = qVar.L();
                        Object obj = u2.l.f33918a;
                        if (f10 || L == obj) {
                            final ho.l lVar2 = lVar;
                            L = new ho.a() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.OnboardingScreenKt$SuggestedVoices$1$1$1$3$1$1$2$1$1
                                /* renamed from: invoke, reason: collision with other method in class */
                                public final void m1218invoke() {
                                    ho.l lVar3 = ho.l.this;
                                    final Voice voice2 = voice;
                                    lVar3.invoke(new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.OnboardingScreenKt$SuggestedVoices$1$1$1$3$1$1$2$1$1.1
                                        public final void invoke(OnboardingViewModel onboardingViewModel) {
                                            onboardingViewModel.getClass();
                                            onboardingViewModel.selectVoice(Voice.this);
                                        }

                                        @Override // ho.l
                                        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                            invoke((OnboardingViewModel) obj2);
                                            return sn.z.f31622a;
                                        }
                                    });
                                }

                                @Override // ho.a
                                public /* bridge */ /* synthetic */ Object invoke() {
                                    m1218invoke();
                                    return sn.z.f31622a;
                                }
                            };
                            qVar.h0(L);
                        }
                        ho.a aVar = (ho.a) L;
                        boolean f11 = qVar.f(lVar) | qVar.h(voice);
                        Object L2 = qVar.L();
                        if (f11 || L2 == obj) {
                            final ho.l lVar3 = lVar;
                            L2 = new ho.a() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.OnboardingScreenKt$SuggestedVoices$1$1$1$3$1$1$2$2$1
                                /* renamed from: invoke, reason: collision with other method in class */
                                public final void m1219invoke() {
                                    ho.l lVar4 = ho.l.this;
                                    final Voice voice2 = voice;
                                    lVar4.invoke(new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.OnboardingScreenKt$SuggestedVoices$1$1$1$3$1$1$2$2$1.1
                                        public final void invoke(OnboardingViewModel onboardingViewModel) {
                                            onboardingViewModel.getClass();
                                            onboardingViewModel.togglePreview(Voice.this);
                                        }

                                        @Override // ho.l
                                        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                            invoke((OnboardingViewModel) obj2);
                                            return sn.z.f31622a;
                                        }
                                    });
                                }

                                @Override // ho.a
                                public /* bridge */ /* synthetic */ Object invoke() {
                                    m1219invoke();
                                    return sn.z.f31622a;
                                }
                            };
                            qVar.h0(L2);
                        }
                        VoiceRowKt.m1108VoiceRowLYuG0Iw(voiceId, aVar, name, str, useCase, imageUrl, false, c5, null, false, c10, (ho.a) L2, t2.u.P, null, qVar, 806879232, 0, 12544);
                        qVar.p(false);
                        return;
                    }
                    qVar.R();
                }

                @Override // ho.r
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    invoke((t1.b) obj, ((Number) obj2).intValue(), (u2.m) obj3, ((Number) obj4).intValue());
                    return sn.z.f31622a;
                }
            }, true, 802480018));
        }
        return sn.z.f31622a;
    }

    public static final sn.z SuggestedVoices$lambda$0$0$1(ho.l lVar, OnboardingState onboardingState, u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            String R = kj.c.R(qVar, R.string.common_retry);
            boolean f10 = qVar.f(lVar);
            Object L = qVar.L();
            if (f10 || L == u2.l.f33918a) {
                L = new j(lVar, 1);
                qVar.h0(L);
            }
            FullWidthButtonKt.EchoThemeFullWidthButton(R, (ho.a) L, p2.e(i3.q.f13017a, 1.0f), null, null, null, onboardingState.getVoicesSuggestionsLoading(), false, false, qVar, 384, 440);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z SuggestedVoices$lambda$0$0$1$0$0(ho.l lVar) {
        lVar.invoke(new w(24));
        return sn.z.f31622a;
    }

    public static final sn.z SuggestedVoices$lambda$0$0$1$0$0$0(OnboardingViewModel onboardingViewModel) {
        onboardingViewModel.getClass();
        onboardingViewModel.retryVoiceSuggestions();
        return sn.z.f31622a;
    }

    public static final sn.z SuggestedVoices$lambda$1(OnboardingState onboardingState, ho.l lVar, ho.a aVar, int i10, u2.m mVar, int i11) {
        SuggestedVoices(onboardingState, lVar, aVar, mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final List<OnboardingPage> getDefaultPages() {
        return defaultPages;
    }
}
