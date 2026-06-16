package io.elevenlabs.readerapp.ui.screens.authenticated.pronunciations;

import a2.a2;
import a2.k3;
import a2.y1;
import android.gov.nist.core.Separators;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.protobuf.c6;
import f4.f1;
import i4.j1;
import io.elevenlabs.domain.model.PronunciationPreviewState;
import io.elevenlabs.readerapp.R;
import io.elevenlabs.readerapp.ui.components.u0;
import io.elevenlabs.readerapp.ui.models.UiAction;
import io.elevenlabs.readerapp.ui.screens.authenticated.pronunciations.PronunciationScreenMode;
import io.elevenlabs.readerapp.ui.screens.authenticated.pronunciations.components.PronunciationPreviewButtonKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.pronunciations.components.PronunciationPreviewButtonVariant;
import io.elevenlabs.ui.components.CloseButtonKt;
import io.elevenlabs.ui.components.DividerKt;
import io.elevenlabs.ui.components.FullWidthButtonKt;
import io.elevenlabs.ui.components.FullWidthButtonSize;
import io.elevenlabs.ui.components.FullWidthButtonVariant;
import io.elevenlabs.ui.components.headers.HeaderKt;
import io.elevenlabs.ui.theme.ElevenLabsTheme;
import io.elevenlabs.ui.theme.ElevenLabsThemeKt;
import io.livekit.android.rpc.RpcError;
import kotlin.Metadata;
import kotlin.jvm.internal.e0;
import livekit.LivekitInternal$NodeStats;
import n3.v;
import p3.b1;
import p3.d1;
import p3.h0;
import q2.j7;
import q2.k5;
import q2.y2;
import r1.i1;
import r1.i2;
import r1.k2;
import r1.l2;
import r1.m1;
import r1.p2;
import r1.x;
import r1.z1;
import rd.c1;
import s4.t;
import s4.y0;
import sn.z;
import t2.u;
import u2.r1;
import u2.s2;
import u2.z0;
import y4.w;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a/\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001aY\u0010\u0013\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00030\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0003¢\u0006\u0004\b\u0013\u0010\u0014\u001aE\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00152\u001e\u0010\u0017\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00030\u000b\u0012\u0004\u0012\u00020\u00030\u000b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0003¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u000f\u0010\u001a\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u000f\u0010\u001c\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u001c\u0010\u001b\u001a\u000f\u0010\u001d\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u001d\u0010\u001b\"\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006$²\u0006\f\u0010\u0016\u001a\u00020\u00158\nX\u008a\u0084\u0002²\u0006\u000e\u0010\"\u001a\u00020!8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010#\u001a\u00020\t8\n@\nX\u008a\u008e\u0002"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/pronunciations/PronunciationScreenMode;", "mode", "Lkotlin/Function0;", "Lsn/z;", "onGoBack", "Lio/elevenlabs/readerapp/ui/screens/authenticated/pronunciations/PronunciationViewModel;", "vm", PronunciationScreenKt.TAG, "(Lio/elevenlabs/readerapp/ui/screens/authenticated/pronunciations/PronunciationScreenMode;Lho/a;Lio/elevenlabs/readerapp/ui/screens/authenticated/pronunciations/PronunciationViewModel;Lu2/m;II)V", "Ly4/w;", "value", "Lkotlin/Function1;", "onValueChange", "onKeyboardActionDone", "Lio/elevenlabs/domain/model/PronunciationPreviewState;", "previewState", "onPlayPreview", "Li3/t;", "modifier", "SpokenTextTextField", "(Ly4/w;Lho/l;Lho/a;Lio/elevenlabs/domain/model/PronunciationPreviewState;Lho/a;Li3/t;Lu2/m;II)V", "Lio/elevenlabs/readerapp/ui/screens/authenticated/pronunciations/PronunciationState;", RemoteConfigConstants.ResponseFieldKey.STATE, "action", "PronunciationScreenUI", "(Lio/elevenlabs/readerapp/ui/screens/authenticated/pronunciations/PronunciationState;Lho/l;Lho/a;Lu2/m;I)V", "Preview_AddPronunciationScreenUI", "(Lu2/m;I)V", "Preview_AddPronunciationScreenUI_Loading", "Preview_AddPronunciationScreenUI_Error", "", "TAG", "Ljava/lang/String;", "", "hasRequestedFocus", "spokenTextFieldValue", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class PronunciationScreenKt {
    private static final String TAG = "PronunciationScreen";

    public static final void Preview_AddPronunciationScreenUI(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(2048413269);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            ElevenLabsThemeKt.ElevenLabsTheme(false, ComposableSingletons$PronunciationScreenKt.INSTANCE.getLambda$389001599$app_productionRelease(), qVar, 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.filter.e(i10, 28);
        }
    }

    public static final z Preview_AddPronunciationScreenUI$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_AddPronunciationScreenUI(mVar, u2.r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_AddPronunciationScreenUI_Error(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-252676674);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            ElevenLabsThemeKt.ElevenLabsTheme(false, ComposableSingletons$PronunciationScreenKt.INSTANCE.m1626getLambda$680046232$app_productionRelease(), qVar, 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.filter.e(i10, 29);
        }
    }

    public static final z Preview_AddPronunciationScreenUI_Error$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_AddPronunciationScreenUI_Error(mVar, u2.r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_AddPronunciationScreenUI_Loading(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(1694510962);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            ElevenLabsThemeKt.ElevenLabsTheme(false, ComposableSingletons$PronunciationScreenKt.INSTANCE.m1627getLambda$985741156$app_productionRelease(), qVar, 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new h(i10, 0);
        }
    }

    public static final z Preview_AddPronunciationScreenUI_Loading$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_AddPronunciationScreenUI_Loading(mVar, u2.r.M(i10 | 1));
        return z.f31622a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x007e, code lost:
    
        if ((r19 & 4) != 0) goto L133;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PronunciationScreen(PronunciationScreenMode pronunciationScreenMode, ho.a aVar, PronunciationViewModel pronunciationViewModel, u2.m mVar, int i10, int i11) {
        int i12;
        PronunciationViewModel pronunciationViewModel2;
        boolean z6;
        q7.c cVar;
        boolean z10;
        int i13;
        int i14;
        boolean h10;
        int i15;
        pronunciationScreenMode.getClass();
        aVar.getClass();
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-1312648316);
        if ((i10 & 6) == 0) {
            if ((i10 & 8) == 0) {
                h10 = qVar.f(pronunciationScreenMode);
            } else {
                h10 = qVar.h(pronunciationScreenMode);
            }
            if (h10) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i12 = i15 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.h(aVar)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
        }
        if ((i10 & 384) == 0) {
            if ((i11 & 4) == 0) {
                pronunciationViewModel2 = pronunciationViewModel;
                if (qVar.h(pronunciationViewModel2)) {
                    i13 = RpcError.MAX_MESSAGE_BYTES;
                    i12 |= i13;
                }
            } else {
                pronunciationViewModel2 = pronunciationViewModel;
            }
            i13 = 128;
            i12 |= i13;
        } else {
            pronunciationViewModel2 = pronunciationViewModel;
        }
        boolean z11 = true;
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
                    androidx.lifecycle.r1 a10 = r7.a.a(qVar);
                    if (a10 != null) {
                        pl.f o6 = tb.a.o(a10, qVar);
                        if (a10 instanceof androidx.lifecycle.o) {
                            cVar = ((androidx.lifecycle.o) a10).getDefaultViewModelCreationExtras();
                        } else {
                            cVar = q7.a.f28123b;
                        }
                        pronunciationViewModel2 = (PronunciationViewModel) gg.b.j0(e0.f20562a.b(PronunciationViewModel.class), a10, null, o6, cVar, qVar);
                        i12 &= -897;
                    } else {
                        c6.x("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        return;
                    }
                }
                qVar.q();
                z0 m10 = c1.m(pronunciationViewModel2.getStateFlow(), qVar, 0);
                if ((i12 & 14) != 4 && ((i12 & 8) == 0 || !qVar.h(pronunciationScreenMode))) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                boolean h11 = z10 | qVar.h(pronunciationViewModel2);
                Object L = qVar.L();
                u2.e eVar = u2.l.f33918a;
                if (h11 || L == eVar) {
                    L = new PronunciationScreenKt$PronunciationScreen$1$1(pronunciationScreenMode, pronunciationViewModel2, null);
                    qVar.h0(L);
                }
                u2.r.f((ho.p) L, pronunciationScreenMode, qVar);
                UiAction<z> navigateBack = PronunciationScreen$lambda$0(m10).getNavigateBack();
                boolean f10 = qVar.f(m10) | qVar.h(pronunciationViewModel2);
                if ((i12 & 112) != 32) {
                    z11 = false;
                }
                boolean z12 = f10 | z11;
                Object L2 = qVar.L();
                if (z12 || L2 == eVar) {
                    L2 = new PronunciationScreenKt$PronunciationScreen$2$1(pronunciationViewModel2, aVar, m10, null);
                    qVar.h0(L2);
                }
                u2.r.f((ho.p) L2, navigateBack, qVar);
                PronunciationState PronunciationScreen$lambda$0 = PronunciationScreen$lambda$0(m10);
                boolean h12 = qVar.h(pronunciationViewModel2);
                Object L3 = qVar.L();
                if (h12 || L3 == eVar) {
                    L3 = new k(pronunciationViewModel2, 1);
                    qVar.h0(L3);
                }
                PronunciationScreenUI(PronunciationScreen$lambda$0, (ho.l) L3, aVar, qVar, (i12 << 3) & 896);
            }
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.elements.c(pronunciationScreenMode, aVar, pronunciationViewModel2, i10, i11, 10);
        }
    }

    public static final PronunciationState PronunciationScreen$lambda$0(s2 s2Var) {
        return (PronunciationState) s2Var.getValue();
    }

    public static final z PronunciationScreen$lambda$3$0(PronunciationViewModel pronunciationViewModel, ho.l lVar) {
        lVar.getClass();
        lVar.invoke(pronunciationViewModel);
        return z.f31622a;
    }

    public static final z PronunciationScreen$lambda$4(PronunciationScreenMode pronunciationScreenMode, ho.a aVar, PronunciationViewModel pronunciationViewModel, int i10, int i11, u2.m mVar, int i12) {
        PronunciationScreen(pronunciationScreenMode, aVar, pronunciationViewModel, mVar, u2.r.M(i10 | 1), i11);
        return z.f31622a;
    }

    public static final void PronunciationScreenUI(final PronunciationState pronunciationState, ho.l lVar, final ho.a aVar, u2.m mVar, int i10) {
        int i11;
        ho.l lVar2;
        boolean z6;
        u2.q qVar;
        w wVar;
        int i12;
        int i13;
        boolean h10;
        int i14;
        u2.q qVar2 = (u2.q) mVar;
        qVar2.Z(2007793998);
        if ((i10 & 6) == 0) {
            if ((i10 & 8) == 0) {
                h10 = qVar2.f(pronunciationState);
            } else {
                h10 = qVar2.h(pronunciationState);
            }
            if (h10) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i11 = i14 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            lVar2 = lVar;
            if (qVar2.h(lVar2)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i11 |= i13;
        } else {
            lVar2 = lVar;
        }
        if ((i10 & 384) == 0) {
            if (qVar2.h(aVar)) {
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
        if (qVar2.O(i11 & 1, z6)) {
            Object L = qVar2.L();
            Object obj = u2.l.f33918a;
            if (L == obj) {
                L = new v();
                qVar2.h0(L);
            }
            v vVar = (v) L;
            Object[] objArr = new Object[0];
            Object L2 = qVar2.L();
            if (L2 == obj) {
                L2 = new b(6);
                qVar2.h0(L2);
            }
            z0 z0Var = (z0) f3.m.e(objArr, (ho.a) L2, qVar2, 48);
            boolean f10 = qVar2.f(pronunciationState.getMode());
            Object L3 = qVar2.L();
            if (f10 || L3 == obj) {
                PronunciationScreenMode mode = pronunciationState.getMode();
                if (mode instanceof PronunciationScreenMode.Add) {
                    wVar = new w("", 0L, 6);
                } else if (mode instanceof PronunciationScreenMode.Edit) {
                    String spokenText = ((PronunciationScreenMode.Edit) pronunciationState.getMode()).getSpokenText();
                    int length = spokenText.length();
                    wVar = new w(spokenText, t.b(length, length), 4);
                } else {
                    c6.p();
                    return;
                }
                L3 = u2.r.A(wVar);
                qVar2.h0(L3);
            }
            z0 z0Var2 = (z0) L3;
            boolean f11 = qVar2.f(z0Var);
            Object L4 = qVar2.L();
            if (f11 || L4 == obj) {
                L4 = new PronunciationScreenKt$PronunciationScreenUI$1$1(vVar, z0Var, null);
                qVar2.h0(L4);
            }
            u2.r.f((ho.p) L4, z.f31622a, qVar2);
            final float m2358getX6D9Ej5fM = ElevenLabsTheme.INSTANCE.getSpacings(qVar2, ElevenLabsTheme.$stable).m2358getX6D9Ej5fM();
            qVar = qVar2;
            k5.a(null, c3.k.d(-944061422, true, new ho.p() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.pronunciations.g
                @Override // ho.p
                public final Object invoke(Object obj2, Object obj3) {
                    z PronunciationScreenUI$lambda$8;
                    int intValue = ((Integer) obj3).intValue();
                    PronunciationScreenUI$lambda$8 = PronunciationScreenKt.PronunciationScreenUI$lambda$8(PronunciationState.this, m2358getX6D9Ej5fM, aVar, (u2.m) obj2, intValue);
                    return PronunciationScreenUI$lambda$8;
                }
            }, qVar2), null, null, null, 0, 0L, 0L, null, c3.k.d(-289187491, true, new fm.l(m2358getX6D9Ej5fM, pronunciationState, lVar2, z0Var2, vVar), qVar2), qVar, 805306416, 509);
        } else {
            qVar = qVar2;
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new k3(i10, 22, lVar, (Object) pronunciationState, (Object) aVar);
        }
    }

    public static final z0 PronunciationScreenUI$lambda$1$0() {
        return u2.r.A(Boolean.FALSE);
    }

    public static final z PronunciationScreenUI$lambda$10(PronunciationState pronunciationState, ho.l lVar, ho.a aVar, int i10, u2.m mVar, int i11) {
        PronunciationScreenUI(pronunciationState, lVar, aVar, mVar, u2.r.M(i10 | 1));
        return z.f31622a;
    }

    public static final boolean PronunciationScreenUI$lambda$2(z0 z0Var) {
        return ((Boolean) z0Var.getValue()).booleanValue();
    }

    public static final void PronunciationScreenUI$lambda$3(z0 z0Var, boolean z6) {
        z0Var.setValue(Boolean.valueOf(z6));
    }

    private static final w PronunciationScreenUI$lambda$5(z0 z0Var) {
        return (w) z0Var.getValue();
    }

    public static final z PronunciationScreenUI$lambda$8(PronunciationState pronunciationState, float f10, ho.a aVar, u2.m mVar, int i10) {
        boolean z6;
        int i11;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            x a10 = r1.w.a(r1.j.f29230c, i3.d.B0, qVar, 0);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.q qVar2 = i3.q.f13017a;
            i3.t c5 = i3.a.c(qVar2, qVar);
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
            PronunciationScreenMode mode = pronunciationState.getMode();
            if (mode instanceof PronunciationScreenMode.Add) {
                i11 = R.string.pronunciations_add_screen_title;
            } else if (mode instanceof PronunciationScreenMode.Edit) {
                i11 = R.string.pronunciations_edit_screen_title;
            } else {
                c6.p();
                return null;
            }
            HeaderKt.Header(kj.c.R(qVar, i11), null, c3.k.d(1641597132, true, new i(aVar, 0), qVar), null, null, 0, qVar, 384, 58);
            DividerKt.m1828DividerLightiJQMabo(r1.d.G(qVar2, f10, u.P, 2), 0L, qVar, 0, 2);
            qVar.p(true);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z PronunciationScreenUI$lambda$8$0$0(ho.a aVar, l2 l2Var, u2.m mVar, int i10) {
        boolean z6;
        l2Var.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            CloseButtonKt.CloseButton(aVar, qVar, 0);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z PronunciationScreenUI$lambda$9(float f10, PronunciationState pronunciationState, ho.l lVar, z0 z0Var, v vVar, z1 z1Var, u2.m mVar, int i10) {
        int i11;
        boolean z6;
        int i12;
        int i13;
        z1Var.getClass();
        if ((i10 & 6) == 0) {
            if (((u2.q) mVar).f(z1Var)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i11 = i10 | i13;
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
            i3.q qVar2 = i3.q.f13017a;
            i3.t u6 = r1.d.u(r1.d.y(r1.d.D(p2.d(qVar2, 1.0f), z1Var)));
            f1 d10 = r1.p.d(i3.d.f12997a, false);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.t c5 = i3.a.c(u6, qVar);
            h4.h.f11920i.getClass();
            h4.f fVar = h4.g.f11903b;
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            h4.e eVar = h4.g.f11907f;
            u2.r.J(eVar, d10, qVar);
            h4.e eVar2 = h4.g.f11906e;
            u2.r.J(eVar2, l4, qVar);
            Integer valueOf = Integer.valueOf(hashCode);
            h4.e eVar3 = h4.g.f11908g;
            u2.r.y(qVar, valueOf, eVar3);
            h4.d dVar = h4.g.f11909h;
            u2.r.F(dVar, qVar);
            h4.e eVar4 = h4.g.f11905d;
            u2.r.J(eVar4, c5, qVar);
            i3.t y10 = l1.n.y(r1.d.G(p2.d(qVar2, 1.0f), f10, u.P, 2), l1.n.x(qVar), true, true);
            x a10 = r1.w.a(r1.j.f29230c, i3.d.B0, qVar, 0);
            int hashCode2 = Long.hashCode(qVar.T);
            c3.o l7 = qVar.l();
            i3.t c10 = i3.a.c(y10, qVar);
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            u2.r.J(eVar, a10, qVar);
            u2.r.J(eVar2, l7, qVar);
            defpackage.f.u(hashCode2, qVar, eVar3, qVar, dVar);
            u2.r.J(eVar4, c10, qVar);
            ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
            int i14 = ElevenLabsTheme.$stable;
            r1.d.g(p2.f(qVar2, elevenLabsTheme.getSpacings(qVar, i14).m2358getX6D9Ej5fM()), qVar);
            j7.d(kj.c.R(qVar, R.string.pronunciations_original_text_label), null, defpackage.f.b(elevenLabsTheme, qVar, i14), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar, i14).getBodyMedium500(), qVar, 0, 0, 131066);
            r1.d.g(p2.f(qVar2, 6), qVar);
            w PronunciationScreenUI$lambda$5 = PronunciationScreenUI$lambda$5(z0Var);
            boolean f11 = qVar.f(z0Var) | qVar.f(lVar);
            Object L = qVar.L();
            u2.e eVar5 = u2.l.f33918a;
            if (f11 || L == eVar5) {
                L = new q(lVar, z0Var, 2);
                qVar.h0(L);
            }
            ho.l lVar2 = (ho.l) L;
            boolean f12 = qVar.f(lVar);
            Object L2 = qVar.L();
            if (f12 || L2 == eVar5) {
                L2 = new d(lVar, 0);
                qVar.h0(L2);
            }
            ho.a aVar = (ho.a) L2;
            PronunciationPreviewState previewState = pronunciationState.getPreviewState();
            boolean f13 = qVar.f(lVar);
            Object L3 = qVar.L();
            if (f13 || L3 == eVar5) {
                L3 = new d(lVar, 1);
                qVar.h0(L3);
            }
            SpokenTextTextField(PronunciationScreenUI$lambda$5, lVar2, aVar, previewState, (ho.a) L3, n3.d.j(p2.e(qVar2, 1.0f), vVar), qVar, 0, 0);
            ib.i.C(elevenLabsTheme, qVar, i14, qVar2, qVar);
            i3.t F = r1.d.F(l1.n.h(r1.d.t(p2.e(qVar2, 1.0f), i1.f29225b), elevenLabsTheme.getColor(qVar, i14).getBackground().m2005getSecondary0d7_KjU(), elevenLabsTheme.getShapes(qVar, i14).getMx()), elevenLabsTheme.getSpacings(qVar, i14).m2356getX4D9Ej5fM(), elevenLabsTheme.getSpacings(qVar, i14).m2355getX3D9Ej5fM());
            float f14 = 12;
            k2 a11 = i2.a(r1.j.g(f14), i3.d.f13005z0, qVar, 54);
            int hashCode3 = Long.hashCode(qVar.T);
            c3.o l10 = qVar.l();
            i3.t c11 = i3.a.c(F, qVar);
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            u2.r.J(eVar, a11, qVar);
            u2.r.J(eVar2, l10, qVar);
            defpackage.f.u(hashCode3, qVar, eVar3, qVar, dVar);
            u2.r.J(eVar4, c11, qVar);
            h5.m mVar2 = (h5.m) qVar.j(j1.f13135n);
            ho.p m1625getLambda$2016377863$app_productionRelease = ComposableSingletons$PronunciationScreenKt.INSTANCE.m1625getLambda$2016377863$app_productionRelease();
            c3.j d11 = c3.k.d(848160041, true, new e(pronunciationState, 0), qVar);
            if (mVar2 == h5.m.f12093a) {
                qVar.X(-791665727);
                m1625getLambda$2016377863$app_productionRelease.invoke(qVar, 6);
                d11.invoke(qVar, 6);
                qVar.p(false);
            } else {
                qVar.X(-791560575);
                d11.invoke(qVar, 6);
                m1625getLambda$2016377863$app_productionRelease.invoke(qVar, 6);
                qVar.p(false);
            }
            qVar.p(true);
            String R = kj.c.R(qVar, R.string.pronunciations_info_label);
            if (pronunciationState.getShowOriginalTextTooLongWarning()) {
                qVar.X(-30410414);
                R = ((Object) R) + Separators.RETURN + kj.c.R(qVar, R.string.pronunciations_warning_label);
                i12 = 0;
                qVar.p(false);
            } else {
                i12 = 0;
                qVar.X(-30303743);
                qVar.p(false);
            }
            r1.d.g(p2.f(qVar2, 10), qVar);
            k2 a12 = i2.a(r1.j.f29228a, i3.d.f13004y0, qVar, i12);
            int hashCode4 = Long.hashCode(qVar.T);
            c3.o l11 = qVar.l();
            i3.t c12 = i3.a.c(qVar2, qVar);
            qVar.b0();
            String str = R;
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            u2.r.J(eVar, a12, qVar);
            u2.r.J(eVar2, l11, qVar);
            defpackage.f.u(hashCode4, qVar, eVar3, qVar, dVar);
            u2.r.J(eVar4, c12, qVar);
            y2.a(kd.a.M(io.elevenlabs.ui.R.drawable.info, qVar, 0), null, p2.f(r1.d.I(qVar2, u.P, 1, u.P, u.P, 13), f14), ib.i.w(elevenLabsTheme, qVar, i14), qVar, u3.c.$stable | 432, 0);
            r1.d.g(p2.s(qVar2, 4), qVar);
            j7.d(str, null, ib.i.w(elevenLabsTheme, qVar, i14), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar, i14).getBodyXSmall400(), qVar, 0, 0, 131066);
            qVar.p(true);
            r1.d.g(p2.f(qVar2, 64), qVar);
            qVar.p(true);
            String R2 = kj.c.R(qVar, R.string.pronunciations_save_button_label);
            FullWidthButtonSize fullWidthButtonSize = FullWidthButtonSize.Large;
            FullWidthButtonVariant fullWidthButtonVariant = FullWidthButtonVariant.Primary;
            i3.t G = r1.d.G(r1.t.f29349a.b(p2.e(qVar2, 1.0f), i3.d.Z), f10, u.P, 2);
            boolean isLoading = pronunciationState.isLoading();
            boolean z10 = !wq.n.m0(pronunciationState.getSpokenText());
            boolean f15 = qVar.f(lVar) | qVar.h(pronunciationState);
            Object L4 = qVar.L();
            if (f15 || L4 == eVar5) {
                L4 = new f(lVar, pronunciationState, 0);
                qVar.h0(L4);
            }
            FullWidthButtonKt.FullWidthButton(R2, (ho.a) L4, G, fullWidthButtonSize, fullWidthButtonVariant, null, isLoading, z10, false, qVar, 27648, 288);
            qVar.p(true);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z PronunciationScreenUI$lambda$9$0$0$0$0(ho.l lVar, z0 z0Var, w wVar) {
        wVar.getClass();
        z0Var.setValue(wVar);
        lVar.invoke(new l(wVar, 2));
        return z.f31622a;
    }

    public static final z PronunciationScreenUI$lambda$9$0$0$0$0$0(w wVar, PronunciationViewModel pronunciationViewModel) {
        pronunciationViewModel.getClass();
        pronunciationViewModel.onSpokenTextChanged(wVar.f38321a.f31041b);
        return z.f31622a;
    }

    public static final z PronunciationScreenUI$lambda$9$0$0$1$0(ho.l lVar) {
        lVar.invoke(new m(12));
        return z.f31622a;
    }

    public static final z PronunciationScreenUI$lambda$9$0$0$1$0$0(PronunciationViewModel pronunciationViewModel) {
        pronunciationViewModel.getClass();
        pronunciationViewModel.onSaveClick();
        return z.f31622a;
    }

    public static final z PronunciationScreenUI$lambda$9$0$0$2$0(ho.l lVar) {
        lVar.invoke(new m(13));
        return z.f31622a;
    }

    public static final z PronunciationScreenUI$lambda$9$0$0$2$0$0(PronunciationViewModel pronunciationViewModel) {
        pronunciationViewModel.getClass();
        pronunciationViewModel.onPlayPreview();
        return z.f31622a;
    }

    public static final z PronunciationScreenUI$lambda$9$0$0$3$0(PronunciationState pronunciationState, l2 l2Var, u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            String originalText = pronunciationState.getOriginalText();
            ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
            int i11 = ElevenLabsTheme.$stable;
            j7.d(originalText, l2Var.b(i3.q.f13017a, 1.0f, true), defpackage.f.b(elevenLabsTheme, qVar, i11), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, y0.a(elevenLabsTheme.getTypo(qVar, i11).getBookText(), 0L, elevenLabsTheme.getTypo(qVar, i11).getBodyMedium500().f31174a.f31102b, null, null, null, 0L, 0, 0L, null, null, 16777213), qVar, 0, 0, 131064);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z PronunciationScreenUI$lambda$9$0$1$0(ho.l lVar, PronunciationState pronunciationState) {
        lVar.invoke(new l(pronunciationState, 3));
        return z.f31622a;
    }

    public static final z PronunciationScreenUI$lambda$9$0$1$0$0(PronunciationState pronunciationState, PronunciationViewModel pronunciationViewModel) {
        pronunciationViewModel.getClass();
        if (!pronunciationState.isLoading()) {
            pronunciationViewModel.onSaveClick();
        }
        return z.f31622a;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void SpokenTextTextField(final w wVar, ho.l lVar, ho.a aVar, final PronunciationPreviewState pronunciationPreviewState, final ho.a aVar2, i3.t tVar, u2.m mVar, int i10, int i11) {
        int i12;
        i3.t tVar2;
        int i13;
        boolean z6;
        u2.q qVar;
        i3.t tVar3;
        r1 r10;
        boolean z10;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        u2.q qVar2 = (u2.q) mVar;
        qVar2.Z(813178292);
        if ((i10 & 6) == 0) {
            if (qVar2.f(wVar)) {
                i18 = 4;
            } else {
                i18 = 2;
            }
            i12 = i18 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar2.h(lVar)) {
                i17 = 32;
            } else {
                i17 = 16;
            }
            i12 |= i17;
        }
        if ((i10 & 384) == 0) {
            if (qVar2.h(aVar)) {
                i16 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i16 = 128;
            }
            i12 |= i16;
        }
        if ((i10 & 3072) == 0) {
            if (qVar2.d(pronunciationPreviewState.ordinal())) {
                i15 = 2048;
            } else {
                i15 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i12 |= i15;
        }
        if ((i10 & 24576) == 0) {
            if (qVar2.h(aVar2)) {
                i14 = 16384;
            } else {
                i14 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
            }
            i12 |= i14;
        }
        int i19 = i11 & 32;
        if (i19 != 0) {
            i12 |= 196608;
        } else if ((196608 & i10) == 0) {
            tVar2 = tVar;
            if (qVar2.f(tVar2)) {
                i13 = 131072;
            } else {
                i13 = 65536;
            }
            i12 |= i13;
            if ((74899 & i12) == 74898) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (!qVar2.O(i12 & 1, z6)) {
                if (i19 != 0) {
                    tVar3 = i3.q.f13017a;
                } else {
                    tVar3 = tVar2;
                }
                ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
                int i20 = ElevenLabsTheme.$stable;
                final long b10 = p3.x.b(0.2f, elevenLabsTheme.getColor(qVar2, i20).getText().m2185getPrimary0d7_KjU());
                final b1 mx = elevenLabsTheme.getShapes(qVar2, i20).getMx();
                Object L = qVar2.L();
                u2.e eVar = u2.l.f33918a;
                if (L == eVar) {
                    L = j0.c.o(qVar2);
                }
                p1.l lVar2 = (p1.l) L;
                final long d10 = ib.i.d(elevenLabsTheme, qVar2, i20);
                final y0 bodyLarge500 = elevenLabsTheme.getTypo(qVar2, i20).getBodyLarge500();
                d1 d1Var = new d1(defpackage.f.b(elevenLabsTheme, qVar2, i20));
                a2 a2Var = new a2(1, 7, 115);
                if ((i12 & 896) == 256) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                Object L2 = qVar2.L();
                if (z10 || L2 == eVar) {
                    L2 = new l(aVar, 4);
                    qVar2.h0(L2);
                }
                qVar = qVar2;
                a2.v.b(wVar, lVar, tVar3, false, false, bodyLarge500, a2Var, new a2.z1((ho.l) L2, null, null, 62), false, 0, 0, null, null, lVar2, d1Var, c3.k.d(1162859799, true, new ho.q() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.pronunciations.j
                    @Override // ho.q
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        z SpokenTextTextField$lambda$2;
                        int intValue = ((Integer) obj3).intValue();
                        SpokenTextTextField$lambda$2 = PronunciationScreenKt.SpokenTextTextField$lambda$2(b1.this, d10, b10, wVar, pronunciationPreviewState, aVar2, bodyLarge500, (ho.p) obj, (u2.m) obj2, intValue);
                        return SpokenTextTextField$lambda$2;
                    }
                }, qVar2), qVar, (i12 & 126) | ((i12 >> 9) & 896), 199680, 7960);
            } else {
                qVar = qVar2;
                qVar.R();
                tVar3 = tVar2;
            }
            r10 = qVar.r();
            if (r10 == null) {
                r10.f34012d = new u0((Object) wVar, (Object) lVar, (sn.d) aVar, (Object) pronunciationPreviewState, aVar2, tVar3, i10, i11, 8);
                return;
            }
            return;
        }
        tVar2 = tVar;
        if ((74899 & i12) == 74898) {
        }
        if (!qVar2.O(i12 & 1, z6)) {
        }
        r10 = qVar.r();
        if (r10 == null) {
        }
    }

    public static final z SpokenTextTextField$lambda$1$0(ho.a aVar, y1 y1Var) {
        y1Var.getClass();
        aVar.invoke();
        return z.f31622a;
    }

    public static final z SpokenTextTextField$lambda$2(b1 b1Var, long j4, long j10, w wVar, PronunciationPreviewState pronunciationPreviewState, ho.a aVar, y0 y0Var, ho.p pVar, u2.m mVar, int i10) {
        int i11;
        boolean z6;
        boolean z10;
        boolean z11;
        int i12;
        pVar.getClass();
        if ((i10 & 6) == 0) {
            if (((u2.q) mVar).h(pVar)) {
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
            i3.q qVar2 = i3.q.f13017a;
            i3.t j11 = l1.n.j(1, j10, l1.n.h(m3.h.c(qVar2, b1Var), j4, h0.f26395b), b1Var);
            i3.l lVar = i3.d.f12997a;
            f1 d10 = r1.p.d(lVar, false);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.t c5 = i3.a.c(j11, qVar);
            h4.h.f11920i.getClass();
            h4.f fVar = h4.g.f11903b;
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            h4.e eVar = h4.g.f11907f;
            u2.r.J(eVar, d10, qVar);
            h4.e eVar2 = h4.g.f11906e;
            u2.r.J(eVar2, l4, qVar);
            Integer valueOf = Integer.valueOf(hashCode);
            h4.e eVar3 = h4.g.f11908g;
            u2.r.y(qVar, valueOf, eVar3);
            h4.d dVar = h4.g.f11909h;
            u2.r.F(dVar, qVar);
            h4.e eVar4 = h4.g.f11905d;
            u2.r.J(eVar4, c5, qVar);
            i3.t e10 = p2.e(qVar2, 1.0f);
            k2 a10 = i2.a(r1.j.f29228a, i3.d.f13004y0, qVar, 0);
            int hashCode2 = Long.hashCode(qVar.T);
            c3.o l7 = qVar.l();
            i3.t c10 = i3.a.c(e10, qVar);
            qVar.b0();
            int i13 = i11;
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            u2.r.J(eVar, a10, qVar);
            u2.r.J(eVar2, l7, qVar);
            defpackage.f.u(hashCode2, qVar, eVar3, qVar, dVar);
            u2.r.J(eVar4, c10, qVar);
            if (1.0f <= 0.0d) {
                s1.a.a("invalid weight; must be greater than zero");
            }
            i3.t F = r1.d.F(new m1(1.0f, true), 16, 18);
            f1 d11 = r1.p.d(lVar, false);
            int hashCode3 = Long.hashCode(qVar.T);
            c3.o l10 = qVar.l();
            i3.t c11 = i3.a.c(F, qVar);
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            u2.r.J(eVar, d11, qVar);
            u2.r.J(eVar2, l10, qVar);
            defpackage.f.u(hashCode3, qVar, eVar3, qVar, dVar);
            u2.r.J(eVar4, c11, qVar);
            if (wVar.f38321a.f31041b.length() == 0) {
                qVar.X(-1431363726);
                j7.d(kj.c.R(qVar, R.string.pronunciations_original_text_placeholder), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, y0.a(y0Var, ib.i.w(ElevenLabsTheme.INSTANCE, qVar, ElevenLabsTheme.$stable), 0L, null, null, null, 0L, 0, 0L, null, null, 16777214), qVar, 0, 0, 131070);
                qVar = qVar;
                z10 = false;
                qVar.p(false);
            } else {
                z10 = false;
                qVar.X(-1431078309);
                qVar.p(false);
            }
            j0.c.q(i13 & 14, pVar, qVar, true);
            r1.d.g(p2.s(qVar2, 8), qVar);
            if (wVar.f38321a.f31041b.length() > 0) {
                z11 = true;
            } else {
                z11 = z10;
            }
            PronunciationPreviewButtonKt.PronunciationPreviewButton(pronunciationPreviewState, PronunciationPreviewButtonVariant.TEXT_FIELD, aVar, null, z11, qVar, 48, 8);
            qVar.p(true);
            qVar.p(true);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z SpokenTextTextField$lambda$3(w wVar, ho.l lVar, ho.a aVar, PronunciationPreviewState pronunciationPreviewState, ho.a aVar2, i3.t tVar, int i10, int i11, u2.m mVar, int i12) {
        SpokenTextTextField(wVar, lVar, aVar, pronunciationPreviewState, aVar2, tVar, mVar, u2.r.M(i10 | 1), i11);
        return z.f31622a;
    }

    public static final /* synthetic */ void access$PronunciationScreenUI(PronunciationState pronunciationState, ho.l lVar, ho.a aVar, u2.m mVar, int i10) {
        PronunciationScreenUI(pronunciationState, lVar, aVar, mVar, i10);
    }
}
