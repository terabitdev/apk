package io.elevenlabs.readerapp.ui.screens.authenticated.account.explore;

import a2.n2;
import a2.o0;
import androidx.lifecycle.j1;
import androidx.lifecycle.o;
import androidx.lifecycle.r1;
import c3.k;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.protobuf.c6;
import f4.f1;
import i3.t;
import io.elevenlabs.domain.model.KeyLabel;
import io.elevenlabs.readerapp.R;
import io.elevenlabs.readerapp.core.p;
import io.elevenlabs.ui.components.BackButtonKt;
import io.elevenlabs.ui.components.ButtonContainerKt;
import io.elevenlabs.ui.components.ButtonKt;
import io.elevenlabs.ui.components.ErrorScreenKt;
import io.elevenlabs.ui.components.ShadowKt;
import io.elevenlabs.ui.components.headers.HeaderActionsKt;
import io.elevenlabs.ui.echo.EchoTheme;
import io.elevenlabs.ui.echo.EchoThemeColors;
import io.elevenlabs.ui.theme.ElevenLabsTheme;
import io.livekit.android.rpc.RpcError;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.e0;
import l1.n;
import livekit.LivekitInternal$NodeStats;
import p3.h0;
import q2.j7;
import q2.k5;
import q2.y2;
import q2.y4;
import r1.i2;
import r1.j;
import r1.k2;
import r1.l2;
import r1.m1;
import r1.p2;
import r1.s;
import r1.w;
import r1.x;
import r1.z1;
import rd.c1;
import s4.y0;
import sn.z;
import t1.i;
import t2.u;
import u2.l;
import u2.m;
import u2.q;
import u2.r;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\u001a'\u0010\u0005\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001aG\u0010\r\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00072\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0003¢\u0006\u0004\b\r\u0010\u000e\u001a;\u0010\u0013\u001a\u00020\u00012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\tH\u0003¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u000f\u0010\u0015\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u000f\u0010\u0017\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0017\u0010\u0016\u001a\u000f\u0010\u0018\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0018\u0010\u0016¨\u0006\u0019"}, d2 = {"Lkotlin/Function0;", "Lsn/z;", "onGoBack", "Lio/elevenlabs/readerapp/ui/screens/authenticated/account/explore/ExploreLanguageSettingScreenViewModel;", "vm", "ExploreLanguageSettingScreen", "(Lho/a;Lio/elevenlabs/readerapp/ui/screens/authenticated/account/explore/ExploreLanguageSettingScreenViewModel;Lu2/m;II)V", "Lio/elevenlabs/readerapp/ui/screens/authenticated/account/explore/ExploreLanguageState;", RemoteConfigConstants.ResponseFieldKey.STATE, "Lkotlin/Function1;", "Lio/elevenlabs/domain/model/KeyLabel;", "onLanguageClick", "onRetry", "ExploreLanguageSettingScreenUI", "(Lio/elevenlabs/readerapp/ui/screens/authenticated/account/explore/ExploreLanguageState;Lho/l;Lho/a;Lho/a;Lu2/m;I)V", "", "languages", "", "activeLanguageCode", "SelectLanguageUI", "(Ljava/util/List;Ljava/lang/String;Lho/l;Lu2/m;I)V", "Preview_ExploreLanguageSettingScreen", "(Lu2/m;I)V", "Preview_ExploreLanguageSettingScreen_Loading", "Preview_ExploreLanguageSettingScreen_Error", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ExploreLanguageSettingScreenKt {
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0055, code lost:
    
        if ((r16 & 2) != 0) goto L92;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ExploreLanguageSettingScreen(ho.a aVar, final ExploreLanguageSettingScreenViewModel exploreLanguageSettingScreenViewModel, m mVar, int i10, int i11) {
        int i12;
        boolean z6;
        q7.c cVar;
        int i13;
        int i14;
        aVar.getClass();
        q qVar = (q) mVar;
        qVar.Z(-1040380342);
        if ((i10 & 6) == 0) {
            if (qVar.h(aVar)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i12 = i14 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if ((i11 & 2) == 0 && qVar.h(exploreLanguageSettingScreenViewModel)) {
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
        if (qVar.O(i12 & 1, z6)) {
            qVar.T();
            if ((i10 & 1) != 0 && !qVar.y()) {
                qVar.R();
            } else {
                if ((i11 & 2) != 0) {
                    r1 a10 = r7.a.a(qVar);
                    if (a10 != null) {
                        pl.f o6 = tb.a.o(a10, qVar);
                        if (a10 instanceof o) {
                            cVar = ((o) a10).getDefaultViewModelCreationExtras();
                        } else {
                            cVar = q7.a.f28123b;
                        }
                        j1 j02 = gg.b.j0(e0.f20562a.b(ExploreLanguageSettingScreenViewModel.class), a10, null, o6, cVar, qVar);
                        qVar = qVar;
                        exploreLanguageSettingScreenViewModel = (ExploreLanguageSettingScreenViewModel) j02;
                        i12 &= -113;
                    } else {
                        c6.x("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        return;
                    }
                }
                qVar.q();
                ExploreLanguageState exploreLanguageState = (ExploreLanguageState) c1.m(exploreLanguageSettingScreenViewModel.getStateFlow(), qVar, 0).getValue();
                boolean h10 = qVar.h(exploreLanguageSettingScreenViewModel);
                Object L = qVar.L();
                u2.e eVar = l.f33918a;
                if (h10 || L == eVar) {
                    L = new c(exploreLanguageSettingScreenViewModel, 0);
                    qVar.h0(L);
                }
                ho.l lVar = (ho.l) L;
                boolean h11 = qVar.h(exploreLanguageSettingScreenViewModel);
                Object L2 = qVar.L();
                if (h11 || L2 == eVar) {
                    L2 = new ho.a() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.account.explore.d
                        @Override // ho.a
                        public final Object invoke() {
                            z ExploreLanguageSettingScreen$lambda$1$0;
                            ExploreLanguageSettingScreen$lambda$1$0 = ExploreLanguageSettingScreenKt.ExploreLanguageSettingScreen$lambda$1$0(ExploreLanguageSettingScreenViewModel.this);
                            return ExploreLanguageSettingScreen$lambda$1$0;
                        }
                    };
                    qVar.h0(L2);
                }
                ExploreLanguageSettingScreenUI(exploreLanguageState, lVar, (ho.a) L2, aVar, qVar, (i12 << 9) & 7168);
            }
        } else {
            qVar.R();
        }
        ExploreLanguageSettingScreenViewModel exploreLanguageSettingScreenViewModel2 = exploreLanguageSettingScreenViewModel;
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new p(aVar, exploreLanguageSettingScreenViewModel2, i10, i11, 9);
        }
    }

    public static final z ExploreLanguageSettingScreen$lambda$0$0(ExploreLanguageSettingScreenViewModel exploreLanguageSettingScreenViewModel, KeyLabel keyLabel) {
        keyLabel.getClass();
        exploreLanguageSettingScreenViewModel.selectLanguage(keyLabel);
        return z.f31622a;
    }

    public static final z ExploreLanguageSettingScreen$lambda$1$0(ExploreLanguageSettingScreenViewModel exploreLanguageSettingScreenViewModel) {
        exploreLanguageSettingScreenViewModel.retry();
        return z.f31622a;
    }

    public static final z ExploreLanguageSettingScreen$lambda$2(ho.a aVar, ExploreLanguageSettingScreenViewModel exploreLanguageSettingScreenViewModel, int i10, int i11, m mVar, int i12) {
        ExploreLanguageSettingScreen(aVar, exploreLanguageSettingScreenViewModel, mVar, r.M(i10 | 1), i11);
        return z.f31622a;
    }

    public static final void ExploreLanguageSettingScreenUI(ExploreLanguageState exploreLanguageState, ho.l lVar, ho.a aVar, ho.a aVar2, m mVar, int i10) {
        ExploreLanguageState exploreLanguageState2;
        int i11;
        ho.a aVar3;
        ho.a aVar4;
        boolean z6;
        q qVar;
        int i12;
        int i13;
        int i14;
        int i15;
        q qVar2 = (q) mVar;
        qVar2.Z(-1121164992);
        if ((i10 & 6) == 0) {
            exploreLanguageState2 = exploreLanguageState;
            if (qVar2.h(exploreLanguageState2)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i11 = i15 | i10;
        } else {
            exploreLanguageState2 = exploreLanguageState;
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar2.h(lVar)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i11 |= i14;
        }
        if ((i10 & 384) == 0) {
            aVar3 = aVar;
            if (qVar2.h(aVar3)) {
                i13 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i13 = 128;
            }
            i11 |= i13;
        } else {
            aVar3 = aVar;
        }
        if ((i10 & 3072) == 0) {
            aVar4 = aVar2;
            if (qVar2.h(aVar4)) {
                i12 = 2048;
            } else {
                i12 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i11 |= i12;
        } else {
            aVar4 = aVar2;
        }
        if ((i11 & 1171) != 1170) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar2.O(i11 & 1, z6)) {
            qVar = qVar2;
            k5.a(null, null, null, null, null, 0, 0L, 0L, null, k.d(-1811003567, true, new n2(exploreLanguageState2, aVar4, aVar3, lVar, 4), qVar2), qVar, 805306368, 511);
        } else {
            qVar = qVar2;
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new c3.d(exploreLanguageState, lVar, aVar, aVar2, i10, 2);
        }
    }

    public static final z ExploreLanguageSettingScreenUI$lambda$0(final ExploreLanguageState exploreLanguageState, final ho.a aVar, final ho.a aVar2, final ho.l lVar, z1 z1Var, m mVar, int i10) {
        int i11;
        boolean z6;
        boolean z10;
        q qVar;
        int i12;
        z1Var.getClass();
        if ((i10 & 6) == 0) {
            if (((q) mVar).f(z1Var)) {
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
        q qVar2 = (q) mVar;
        if (qVar2.O(i11 & 1, z6)) {
            i3.q qVar3 = i3.q.f13017a;
            t o6 = r1.d.o(r1.d.D(n.h(p2.d(qVar3, 1.0f), EchoTheme.INSTANCE.getColors(qVar2, EchoTheme.$stable).getBackground().getPrimary(qVar2, EchoThemeColors.Background.$stable), h0.f26395b), z1Var), z1Var);
            f1 d10 = r1.p.d(i3.d.f12998b, false);
            int hashCode = Long.hashCode(qVar2.T);
            c3.o l4 = qVar2.l();
            t c5 = i3.a.c(o6, qVar2);
            h4.h.f11920i.getClass();
            h4.f fVar = h4.g.f11903b;
            qVar2.b0();
            if (qVar2.S) {
                qVar2.k(fVar);
            } else {
                qVar2.k0();
            }
            h4.e eVar = h4.g.f11907f;
            r.J(eVar, d10, qVar2);
            h4.e eVar2 = h4.g.f11906e;
            r.J(eVar2, l4, qVar2);
            Integer valueOf = Integer.valueOf(hashCode);
            h4.e eVar3 = h4.g.f11908g;
            r.y(qVar2, valueOf, eVar3);
            h4.d dVar = h4.g.f11909h;
            r.F(dVar, qVar2);
            h4.e eVar4 = h4.g.f11905d;
            r.J(eVar4, c5, qVar2);
            t d11 = p2.d(qVar3, 1.0f);
            x a10 = w.a(j.f29230c, i3.d.B0, qVar2, 0);
            int hashCode2 = Long.hashCode(qVar2.T);
            c3.o l7 = qVar2.l();
            t c10 = i3.a.c(d11, qVar2);
            qVar2.b0();
            if (qVar2.S) {
                qVar2.k(fVar);
            } else {
                qVar2.k0();
            }
            r.J(eVar, a10, qVar2);
            r.J(eVar2, l7, qVar2);
            defpackage.f.u(hashCode2, qVar2, eVar3, qVar2, dVar);
            r.J(eVar4, c10, qVar2);
            HeaderActionsKt.EchoThemeHeaderActions(null, kj.c.R(qVar2, R.string.explore_select_language), k.d(830394800, true, new ho.q() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.account.explore.g
                @Override // ho.q
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    z ExploreLanguageSettingScreenUI$lambda$0$0$0$0;
                    int intValue = ((Integer) obj3).intValue();
                    ExploreLanguageSettingScreenUI$lambda$0$0$0$0 = ExploreLanguageSettingScreenKt.ExploreLanguageSettingScreenUI$lambda$0$0$0$0(ho.a.this, (l2) obj, (m) obj2, intValue);
                    return ExploreLanguageSettingScreenUI$lambda$0$0$0$0;
                }
            }, qVar2), null, qVar2, 384, 9);
            if (exploreLanguageState.isLoading()) {
                qVar2.X(1757017514);
                t d12 = p2.d(qVar3, 1.0f);
                f1 d13 = r1.p.d(i3.d.f13001e, false);
                int hashCode3 = Long.hashCode(qVar2.T);
                c3.o l10 = qVar2.l();
                t c11 = i3.a.c(d12, qVar2);
                qVar2.b0();
                if (qVar2.S) {
                    qVar2.k(fVar);
                } else {
                    qVar2.k0();
                }
                r.J(eVar, d13, qVar2);
                r.J(eVar2, l10, qVar2);
                defpackage.f.u(hashCode3, qVar2, eVar3, qVar2, dVar);
                r.J(eVar4, c11, qVar2);
                y4.a(null, defpackage.f.A(ElevenLabsTheme.INSTANCE, qVar2, ElevenLabsTheme.$stable), u.P, 0L, 0, u.P, qVar2, 0, 61);
                qVar = qVar2;
                qVar.p(true);
                qVar.p(false);
            } else if (exploreLanguageState.getError() != null) {
                qVar2.X(1757461496);
                ErrorScreenKt.m1836ErrorScreenV9fs2A(r1.d.D(p2.d(qVar3, 1.0f), z1Var), null, exploreLanguageState.getError(), k.d(-836837772, true, new ho.p() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.account.explore.a
                    @Override // ho.p
                    public final Object invoke(Object obj, Object obj2) {
                        z ExploreLanguageSettingScreenUI$lambda$0$0$0$2;
                        int intValue = ((Integer) obj2).intValue();
                        ExploreLanguageSettingScreenUI$lambda$0$0$0$2 = ExploreLanguageSettingScreenKt.ExploreLanguageSettingScreenUI$lambda$0$0$0$2(ho.a.this, (m) obj, intValue);
                        return ExploreLanguageSettingScreenUI$lambda$0$0$0$2;
                    }
                }, qVar2), null, 0L, qVar2, 3072, 50);
                qVar = qVar2;
                qVar.p(false);
            } else {
                qVar2.X(1758119254);
                z10 = true;
                ShadowKt.m1876BottomShadowOverlayPZHvWI(p2.d(qVar3, 1.0f), ElevenLabsTheme.INSTANCE.getSpacings(qVar2, ElevenLabsTheme.$stable).m2357getX5D9Ej5fM(), 0L, k.d(-1049529810, true, new ho.q() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.account.explore.b
                    @Override // ho.q
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        z ExploreLanguageSettingScreenUI$lambda$0$0$0$3;
                        int intValue = ((Integer) obj3).intValue();
                        ExploreLanguageSettingScreenUI$lambda$0$0$0$3 = ExploreLanguageSettingScreenKt.ExploreLanguageSettingScreenUI$lambda$0$0$0$3(ExploreLanguageState.this, lVar, (s) obj, (m) obj2, intValue);
                        return ExploreLanguageSettingScreenUI$lambda$0$0$0$3;
                    }
                }, qVar2), qVar2, 3078, 4);
                qVar = qVar2;
                qVar.p(false);
                qVar.p(z10);
                qVar.p(z10);
            }
            z10 = true;
            qVar.p(z10);
            qVar.p(z10);
        } else {
            qVar2.R();
        }
        return z.f31622a;
    }

    public static final z ExploreLanguageSettingScreenUI$lambda$0$0$0$0(ho.a aVar, l2 l2Var, m mVar, int i10) {
        boolean z6;
        l2Var.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            BackButtonKt.EchoThemeBackButton(aVar, null, qVar, 0, 2);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z ExploreLanguageSettingScreenUI$lambda$0$0$0$2(ho.a aVar, m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            ButtonKt.Button(kj.c.R(qVar, R.string.common_retry), aVar, p2.e(i3.q.f13017a, 1.0f), null, null, null, null, false, false, false, qVar, 384, 1016);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z ExploreLanguageSettingScreenUI$lambda$0$0$0$3(ExploreLanguageState exploreLanguageState, ho.l lVar, s sVar, m mVar, int i10) {
        boolean z6;
        sVar.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            SelectLanguageUI(exploreLanguageState.getAvailableLanguages(), exploreLanguageState.getSelectedLanguageCode(), lVar, qVar, 0);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z ExploreLanguageSettingScreenUI$lambda$1(ExploreLanguageState exploreLanguageState, ho.l lVar, ho.a aVar, ho.a aVar2, int i10, m mVar, int i11) {
        ExploreLanguageSettingScreenUI(exploreLanguageState, lVar, aVar, aVar2, mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_ExploreLanguageSettingScreen(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(-1908016178);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, ComposableSingletons$ExploreLanguageSettingScreenKt.INSTANCE.m1257getLambda$485127896$app_productionRelease(), qVar, (EchoTheme.$stable << 6) | 48, 1);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.c1(i10, 29);
        }
    }

    public static final z Preview_ExploreLanguageSettingScreen$lambda$0(int i10, m mVar, int i11) {
        Preview_ExploreLanguageSettingScreen(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_ExploreLanguageSettingScreen_Error(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(-1248693705);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, ComposableSingletons$ExploreLanguageSettingScreenKt.INSTANCE.getLambda$1521816593$app_productionRelease(), qVar, (EchoTheme.$stable << 6) | 48, 1);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new e(i10, 0);
        }
    }

    public static final z Preview_ExploreLanguageSettingScreen_Error$lambda$0(int i10, m mVar, int i11) {
        Preview_ExploreLanguageSettingScreen_Error(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_ExploreLanguageSettingScreen_Loading(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(-1416704085);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, ComposableSingletons$ExploreLanguageSettingScreenKt.INSTANCE.m1256getLambda$1836031227$app_productionRelease(), qVar, (EchoTheme.$stable << 6) | 48, 1);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.c1(i10, 28);
        }
    }

    public static final z Preview_ExploreLanguageSettingScreen_Loading$lambda$0(int i10, m mVar, int i11) {
        Preview_ExploreLanguageSettingScreen_Loading(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    private static final void SelectLanguageUI(List<KeyLabel> list, String str, ho.l lVar, m mVar, int i10) {
        int i11;
        boolean z6;
        boolean z10;
        int i12;
        int i13;
        int i14;
        q qVar = (q) mVar;
        qVar.Z(-1742420090);
        if ((i10 & 6) == 0) {
            if (qVar.h(list)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i11 = i14 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.f(str)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i11 |= i13;
        }
        if ((i10 & 384) == 0) {
            if (qVar.h(lVar)) {
                i12 = 256;
            } else {
                i12 = 128;
            }
            i11 |= i12;
        }
        boolean z11 = false;
        if ((i11 & 147) != 146) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i11 & 1, z6)) {
            t d10 = p2.d(i3.q.f13017a, 1.0f);
            boolean h10 = qVar.h(list);
            if ((i11 & 896) == 256) {
                z10 = true;
            } else {
                z10 = false;
            }
            boolean z12 = z10 | h10;
            if ((i11 & 112) == 32) {
                z11 = true;
            }
            boolean z13 = z12 | z11;
            Object L = qVar.L();
            if (z13 || L == l.f33918a) {
                L = new o0(list, lVar, str, 16);
                qVar.h0(L);
            }
            c1.c(d10, null, null, false, null, null, null, false, null, (ho.l) L, qVar, 6, 510);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new f(list, str, lVar, i10);
        }
    }

    public static final z SelectLanguageUI$lambda$0$0(final List list, final ho.l lVar, final String str, t1.t tVar) {
        tVar.getClass();
        final ExploreLanguageSettingScreenKt$SelectLanguageUI$lambda$0$0$$inlined$items$default$1 exploreLanguageSettingScreenKt$SelectLanguageUI$lambda$0$0$$inlined$items$default$1 = new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.account.explore.ExploreLanguageSettingScreenKt$SelectLanguageUI$lambda$0$0$$inlined$items$default$1
            @Override // ho.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke((KeyLabel) obj);
            }

            @Override // ho.l
            public final Void invoke(KeyLabel keyLabel) {
                return null;
            }
        };
        ((i) tVar).u(list.size(), null, new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.account.explore.ExploreLanguageSettingScreenKt$SelectLanguageUI$lambda$0$0$$inlined$items$default$3
            public final Object invoke(int i10) {
                return ho.l.this.invoke(list.get(i10));
            }

            @Override // ho.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).intValue());
            }
        }, new c3.j(new ho.r() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.account.explore.ExploreLanguageSettingScreenKt$SelectLanguageUI$lambda$0$0$$inlined$items$default$4
            public final void invoke(t1.b bVar, int i10, m mVar, int i11) {
                int i12;
                boolean z6;
                int i13;
                int i14;
                if ((i11 & 6) == 0) {
                    if (((q) mVar).f(bVar)) {
                        i14 = 4;
                    } else {
                        i14 = 2;
                    }
                    i12 = i11 | i14;
                } else {
                    i12 = i11;
                }
                if ((i11 & 48) == 0) {
                    if (((q) mVar).d(i10)) {
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
                q qVar = (q) mVar;
                if (qVar.O(i12 & 1, z6)) {
                    final KeyLabel keyLabel = (KeyLabel) list.get(i10);
                    qVar.X(-916103704);
                    String label = keyLabel.getLabel();
                    boolean f10 = qVar.f(lVar) | qVar.h(keyLabel);
                    Object L = qVar.L();
                    if (f10 || L == l.f33918a) {
                        final ho.l lVar2 = lVar;
                        L = new ho.a() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.account.explore.ExploreLanguageSettingScreenKt$SelectLanguageUI$1$1$1$1$1
                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m1261invoke() {
                                ho.l.this.invoke(keyLabel);
                            }

                            @Override // ho.a
                            public /* bridge */ /* synthetic */ Object invoke() {
                                m1261invoke();
                                return z.f31622a;
                            }
                        };
                        qVar.h0(L);
                    }
                    ho.a aVar = (ho.a) L;
                    final String str2 = str;
                    ButtonContainerKt.m1780ButtonContainer83mGB3Q(label, aVar, null, 0L, false, 0, null, false, null, k.d(317651358, true, new ho.q() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.account.explore.ExploreLanguageSettingScreenKt$SelectLanguageUI$1$1$1$2
                        public final void invoke(s sVar, m mVar2, int i15) {
                            boolean z10;
                            float f11;
                            sVar.getClass();
                            if ((i15 & 17) != 16) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            q qVar2 = (q) mVar2;
                            if (qVar2.O(i15 & 1, z10)) {
                                i3.q qVar3 = i3.q.f13017a;
                                t e10 = p2.e(qVar3, 1.0f);
                                KeyLabel keyLabel2 = KeyLabel.this;
                                String str3 = str2;
                                x a10 = w.a(j.f29230c, i3.d.B0, qVar2, 0);
                                int hashCode = Long.hashCode(qVar2.T);
                                c3.o l4 = qVar2.l();
                                t c5 = i3.a.c(e10, qVar2);
                                h4.h.f11920i.getClass();
                                h4.f fVar = h4.g.f11903b;
                                qVar2.b0();
                                if (qVar2.S) {
                                    qVar2.k(fVar);
                                } else {
                                    qVar2.k0();
                                }
                                h4.e eVar = h4.g.f11907f;
                                r.J(eVar, a10, qVar2);
                                h4.e eVar2 = h4.g.f11906e;
                                r.J(eVar2, l4, qVar2);
                                Integer valueOf = Integer.valueOf(hashCode);
                                h4.e eVar3 = h4.g.f11908g;
                                r.y(qVar2, valueOf, eVar3);
                                h4.d dVar = h4.g.f11909h;
                                r.F(dVar, qVar2);
                                h4.e eVar4 = h4.g.f11905d;
                                r.J(eVar4, c5, qVar2);
                                t e11 = p2.e(qVar3, 1.0f);
                                ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
                                int i16 = ElevenLabsTheme.$stable;
                                t f12 = ib.i.f(elevenLabsTheme, qVar2, i16, e11);
                                k2 a11 = i2.a(j.f29228a, i3.d.f13005z0, qVar2, 48);
                                int hashCode2 = Long.hashCode(qVar2.T);
                                c3.o l7 = qVar2.l();
                                t c10 = i3.a.c(f12, qVar2);
                                qVar2.b0();
                                if (qVar2.S) {
                                    qVar2.k(fVar);
                                } else {
                                    qVar2.k0();
                                }
                                r.J(eVar, a11, qVar2);
                                r.J(eVar2, l7, qVar2);
                                defpackage.f.u(hashCode2, qVar2, eVar3, qVar2, dVar);
                                r.J(eVar4, c10, qVar2);
                                String upperCase = keyLabel2.getKey().toUpperCase(Locale.ROOT);
                                upperCase.getClass();
                                j7.d(upperCase, p2.s(qVar3, 30), ib.i.w(elevenLabsTheme, qVar2, i16), 0L, null, 0L, null, 0L, 2, false, 1, 0, null, elevenLabsTheme.getTypo(qVar2, i16).getBodyXSmall400(), qVar2, 48, 24960, 110584);
                                r1.d.g(p2.s(qVar3, elevenLabsTheme.getSpacings(qVar2, i16).m2353getX2D9Ej5fM()), qVar2);
                                String label2 = keyLabel2.getLabel();
                                y0 pill700 = elevenLabsTheme.getTypo(qVar2, i16).getPill700();
                                if (1.0f <= 0.0d) {
                                    s1.a.a("invalid weight; must be greater than zero");
                                }
                                j7.d(label2, new m1(1.0f, true), 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, pill700, qVar2, 0, 24960, 110588);
                                r1.d.g(p2.s(qVar3, elevenLabsTheme.getSpacings(qVar2, i16).m2353getX2D9Ej5fM()), qVar2);
                                u3.c M = kd.a.M(io.elevenlabs.ui.R.drawable.checkmark_1, qVar2, 0);
                                t E = r1.d.E(p2.o(qVar3, 24), 5);
                                if (kotlin.jvm.internal.m.c(keyLabel2.getKey(), str3)) {
                                    f11 = 1.0f;
                                } else {
                                    f11 = 0.0f;
                                }
                                y2.a(M, null, m3.h.a(E, f11), defpackage.f.b(elevenLabsTheme, qVar2, i16), qVar2, u3.c.$stable | 48, 0);
                                qVar2.p(true);
                                r1.d.g(n.h(r1.d.G(p2.e(p2.f(qVar3, 1), 1.0f), elevenLabsTheme.getSpacings(qVar2, i16).m2357getX5D9Ej5fM(), u.P, 2), elevenLabsTheme.getColor(qVar2, i16).getDivider().m2059getLine0d7_KjU(), h0.f26395b), qVar2);
                                qVar2.p(true);
                                return;
                            }
                            qVar2.R();
                        }

                        @Override // ho.q
                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                            invoke((s) obj, (m) obj2, ((Number) obj3).intValue());
                            return z.f31622a;
                        }
                    }, qVar), qVar, 805306368, 508);
                    qVar.p(false);
                    return;
                }
                qVar.R();
            }

            @Override // ho.r
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                invoke((t1.b) obj, ((Number) obj2).intValue(), (m) obj3, ((Number) obj4).intValue());
                return z.f31622a;
            }
        }, true, 802480018));
        t1.t.c(tVar, null, null, ComposableSingletons$ExploreLanguageSettingScreenKt.INSTANCE.getLambda$1674317531$app_productionRelease(), 3);
        return z.f31622a;
    }

    public static final z SelectLanguageUI$lambda$1(List list, String str, ho.l lVar, int i10, m mVar, int i11) {
        SelectLanguageUI(list, str, lVar, mVar, r.M(i10 | 1));
        return z.f31622a;
    }
}
