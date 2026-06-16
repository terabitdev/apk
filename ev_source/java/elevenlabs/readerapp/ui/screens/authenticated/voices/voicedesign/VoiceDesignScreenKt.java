package io.elevenlabs.readerapp.ui.screens.authenticated.voices.voicedesign;

import a2.b3;
import androidx.lifecycle.j1;
import androidx.lifecycle.o;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.protobuf.c6;
import f4.f1;
import ho.l;
import ho.p;
import i1.m0;
import i1.y0;
import i3.t;
import io.elevenlabs.readerapp.R;
import io.elevenlabs.readerapp.ui.components.d0;
import io.elevenlabs.readerapp.ui.screens.authenticated.voices.voicedesign.VoiceDesignContract;
import io.elevenlabs.readerapp.ui.screens.authenticated.voices.voicedesign.steps.GeneratingStepKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.voices.voicedesign.steps.SaveVoiceStepKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.voices.voicedesign.steps.SelectPreviewStepKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.voices.voicedesign.steps.VoiceDesignTipsSheetKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.voices.voicedesign.steps.VoicePromptStepKt;
import io.elevenlabs.ui.components.BackButtonKt;
import io.elevenlabs.ui.components.ConfirmationDialogKt;
import io.elevenlabs.ui.components.EchoCloseButtonKt;
import io.elevenlabs.ui.components.ErrorScreenKt;
import io.elevenlabs.ui.components.headers.HeaderActionsKt;
import io.elevenlabs.ui.echo.EchoTheme;
import io.elevenlabs.ui.echo.EchoThemeColors;
import io.livekit.android.rpc.RpcError;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.e0;
import livekit.LivekitInternal$NodeStats;
import q2.k5;
import r1.l2;
import r1.p2;
import r1.z1;
import rd.c1;
import sn.z;
import u2.m;
import u2.q;
import u2.r;
import u2.r1;
import u2.s2;
import u2.z0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u001aK\u0010\t\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\t\u0010\n\u001a5\u0010\u0011\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u000b2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u000fH\u0003¢\u0006\u0004\b\u0011\u0010\u0012\u001a?\u0010\u0015\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u000b2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0010\u001a\u00020\u000fH\u0003¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u000f\u0010\u0017\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u000f\u0010\u0019\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\u0019\u0010\u0018¨\u0006\u001a²\u0006\f\u0010\f\u001a\u00020\u000b8\nX\u008a\u0084\u0002"}, d2 = {"Lkotlin/Function0;", "Lsn/z;", "onGoBack", "Lkotlin/Function1;", "", "onVoiceCreated", "onNavigateToPaywall", "Lio/elevenlabs/readerapp/ui/screens/authenticated/voices/voicedesign/VoiceDesignViewModel;", "viewModel", "VoiceDesignScreen", "(Lho/a;Lho/l;Lho/a;Lio/elevenlabs/readerapp/ui/screens/authenticated/voices/voicedesign/VoiceDesignViewModel;Lu2/m;II)V", "Lio/elevenlabs/readerapp/ui/screens/authenticated/voices/voicedesign/VoiceDesignContract$State;", RemoteConfigConstants.ResponseFieldKey.STATE, "Lio/elevenlabs/readerapp/ui/screens/authenticated/voices/voicedesign/VoiceDesignContract$Event;", "onEvent", "", "deterministic", "VoiceDesignScreenUI", "(Lio/elevenlabs/readerapp/ui/screens/authenticated/voices/voicedesign/VoiceDesignContract$State;Lho/l;ZLu2/m;II)V", "Li3/t;", "modifier", "VoiceDesignScreenContent", "(Lio/elevenlabs/readerapp/ui/screens/authenticated/voices/voicedesign/VoiceDesignContract$State;Lho/l;Li3/t;ZLu2/m;II)V", "Preview_VoiceDesignScreen_PromptStep", "(Lu2/m;I)V", "Preview_VoiceDesignScreen_GeneratingStep", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class VoiceDesignScreenKt {

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VoiceDesignContract.Step.values().length];
            try {
                iArr[VoiceDesignContract.Step.VOICE_PROMPT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VoiceDesignContract.Step.GENERATING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VoiceDesignContract.Step.SELECT_PREVIEW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[VoiceDesignContract.Step.SAVE_VOICE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void Preview_VoiceDesignScreen_GeneratingStep(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(-1150092180);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, ComposableSingletons$VoiceDesignScreenKt.INSTANCE.getLambda$8603334$app_productionRelease(), qVar, (EchoTheme.$stable << 6) | 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.voices.j(i10, 8);
        }
    }

    public static final z Preview_VoiceDesignScreen_GeneratingStep$lambda$0(int i10, m mVar, int i11) {
        Preview_VoiceDesignScreen_GeneratingStep(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_VoiceDesignScreen_PromptStep(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(-573538850);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, ComposableSingletons$VoiceDesignScreenKt.INSTANCE.getLambda$587728184$app_productionRelease(), qVar, (EchoTheme.$stable << 6) | 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.voices.j(i10, 9);
        }
    }

    public static final z Preview_VoiceDesignScreen_PromptStep$lambda$0(int i10, m mVar, int i11) {
        Preview_VoiceDesignScreen_PromptStep(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void VoiceDesignScreen(ho.a aVar, l lVar, ho.a aVar2, VoiceDesignViewModel voiceDesignViewModel, m mVar, int i10, int i11) {
        int i12;
        ho.a aVar3;
        int i13;
        VoiceDesignViewModel voiceDesignViewModel2;
        boolean z6;
        ho.a aVar4;
        VoiceDesignViewModel voiceDesignViewModel3;
        r1 r10;
        ho.a aVar5;
        u2.e eVar;
        VoiceDesignViewModel voiceDesignViewModel4;
        q7.c cVar;
        boolean z10;
        boolean z11;
        Object voiceDesignScreenKt$VoiceDesignScreen$2$1;
        u2.e eVar2;
        ho.a aVar6;
        VoiceDesignViewModel voiceDesignViewModel5;
        int i14;
        int i15;
        int i16;
        aVar.getClass();
        lVar.getClass();
        q qVar = (q) mVar;
        qVar.Z(283935909);
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
        int i17 = i11 & 4;
        if (i17 != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            aVar3 = aVar2;
            if (qVar.h(aVar3)) {
                i13 = 256;
            } else {
                i13 = 128;
            }
            i12 |= i13;
            if ((i10 & 3072) != 0) {
                if ((i11 & 8) == 0) {
                    voiceDesignViewModel2 = voiceDesignViewModel;
                    if (qVar.h(voiceDesignViewModel2)) {
                        i14 = 2048;
                        i12 |= i14;
                    }
                } else {
                    voiceDesignViewModel2 = voiceDesignViewModel;
                }
                i14 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                i12 |= i14;
            } else {
                voiceDesignViewModel2 = voiceDesignViewModel;
            }
            boolean z12 = false;
            if ((i12 & 1171) == 1170) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (!qVar.O(i12 & 1, z6)) {
                qVar.T();
                int i18 = i10 & 1;
                u2.e eVar3 = u2.l.f33918a;
                if (i18 != 0 && !qVar.y()) {
                    qVar.R();
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                    }
                    aVar5 = aVar3;
                    voiceDesignViewModel4 = voiceDesignViewModel2;
                    eVar = eVar3;
                } else {
                    if (i17 != 0) {
                        Object L = qVar.L();
                        if (L == eVar3) {
                            L = new Object();
                            qVar.h0(L);
                        }
                        aVar5 = (ho.a) L;
                    } else {
                        aVar5 = aVar3;
                    }
                    if ((i11 & 8) != 0) {
                        androidx.lifecycle.r1 a10 = r7.a.a(qVar);
                        if (a10 != null) {
                            pl.f o6 = tb.a.o(a10, qVar);
                            if (a10 instanceof o) {
                                cVar = ((o) a10).getDefaultViewModelCreationExtras();
                            } else {
                                cVar = q7.a.f28123b;
                            }
                            eVar = eVar3;
                            j1 j02 = gg.b.j0(e0.f20562a.b(VoiceDesignViewModel.class), a10, null, o6, cVar, qVar);
                            qVar = qVar;
                            i12 &= -7169;
                            voiceDesignViewModel4 = (VoiceDesignViewModel) j02;
                        } else {
                            c6.x("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                            return;
                        }
                    } else {
                        eVar = eVar3;
                        voiceDesignViewModel4 = voiceDesignViewModel2;
                    }
                }
                qVar.q();
                z0 m10 = c1.m(voiceDesignViewModel4.getStateFlow(), qVar, 0);
                boolean h10 = qVar.h(voiceDesignViewModel4);
                if ((i12 & 14) == 4) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                boolean z13 = z10 | h10;
                if ((i12 & 112) == 32) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                boolean z14 = z13 | z11;
                if ((i12 & 896) == 256) {
                    z12 = true;
                }
                boolean z15 = z14 | z12;
                Object L2 = qVar.L();
                if (!z15 && L2 != eVar) {
                    voiceDesignScreenKt$VoiceDesignScreen$2$1 = L2;
                    aVar6 = aVar5;
                    voiceDesignViewModel5 = voiceDesignViewModel4;
                    eVar2 = eVar;
                } else {
                    eVar2 = eVar;
                    aVar6 = aVar5;
                    voiceDesignScreenKt$VoiceDesignScreen$2$1 = new VoiceDesignScreenKt$VoiceDesignScreen$2$1(voiceDesignViewModel4, aVar, lVar, aVar6, null);
                    voiceDesignViewModel5 = voiceDesignViewModel4;
                    qVar.h0(voiceDesignScreenKt$VoiceDesignScreen$2$1);
                }
                r.f((p) voiceDesignScreenKt$VoiceDesignScreen$2$1, z.f31622a, qVar);
                VoiceDesignContract.State VoiceDesignScreen$lambda$1 = VoiceDesignScreen$lambda$1(m10);
                boolean h11 = qVar.h(voiceDesignViewModel5);
                Object L3 = qVar.L();
                if (h11 || L3 == eVar2) {
                    L3 = new VoiceDesignScreenKt$VoiceDesignScreen$3$1(voiceDesignViewModel5);
                    qVar.h0(L3);
                }
                VoiceDesignScreenUI(VoiceDesignScreen$lambda$1, (l) ((oo.g) L3), false, qVar, 0, 4);
                voiceDesignViewModel3 = voiceDesignViewModel5;
                aVar4 = aVar6;
            } else {
                qVar.R();
                aVar4 = aVar3;
                voiceDesignViewModel3 = voiceDesignViewModel2;
            }
            r10 = qVar.r();
            if (r10 == null) {
                r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.voices.f(aVar, lVar, aVar4, voiceDesignViewModel3, i10, i11);
                return;
            }
            return;
        }
        aVar3 = aVar2;
        if ((i10 & 3072) != 0) {
        }
        boolean z122 = false;
        if ((i12 & 1171) == 1170) {
        }
        if (!qVar.O(i12 & 1, z6)) {
        }
        r10 = qVar.r();
        if (r10 == null) {
        }
    }

    private static final VoiceDesignContract.State VoiceDesignScreen$lambda$1(s2 s2Var) {
        return (VoiceDesignContract.State) s2Var.getValue();
    }

    public static final z VoiceDesignScreen$lambda$4(ho.a aVar, l lVar, ho.a aVar2, VoiceDesignViewModel voiceDesignViewModel, int i10, int i11, m mVar, int i12) {
        VoiceDesignScreen(aVar, lVar, aVar2, voiceDesignViewModel, mVar, r.M(i10 | 1), i11);
        return z.f31622a;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void VoiceDesignScreenContent(final VoiceDesignContract.State state, final l lVar, t tVar, boolean z6, m mVar, int i10, int i11) {
        int i12;
        t tVar2;
        int i13;
        int i14;
        boolean z10;
        int i15;
        boolean z11;
        t tVar3;
        boolean z12;
        r1 r10;
        t tVar4;
        final boolean z13;
        int i16;
        int i17;
        q qVar = (q) mVar;
        qVar.Z(1763229520);
        if ((i10 & 6) == 0) {
            if (qVar.h(state)) {
                i17 = 4;
            } else {
                i17 = 2;
            }
            i12 = i17 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.h(lVar)) {
                i16 = 32;
            } else {
                i16 = 16;
            }
            i12 |= i16;
        }
        int i18 = i11 & 4;
        if (i18 != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            tVar2 = tVar;
            if (qVar.f(tVar2)) {
                i13 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i13 = 128;
            }
            i12 |= i13;
            i14 = i11 & 8;
            if (i14 == 0) {
                i12 |= 3072;
            } else if ((i10 & 3072) == 0) {
                z10 = z6;
                if (qVar.g(z10)) {
                    i15 = 2048;
                } else {
                    i15 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                }
                i12 |= i15;
                if ((i12 & 1171) != 1170) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (qVar.O(i12 & 1, z11)) {
                    if (i18 != 0) {
                        tVar4 = i3.q.f13017a;
                    } else {
                        tVar4 = tVar2;
                    }
                    if (i14 != 0) {
                        z13 = false;
                    } else {
                        z13 = z10;
                    }
                    VoiceDesignContract.Step currentStep = state.getCurrentStep();
                    t d10 = p2.d(tVar4, 1.0f);
                    Object L = qVar.L();
                    if (L == u2.l.f33918a) {
                        L = new i(3);
                        qVar.h0(L);
                    }
                    i1.l.b(currentStep, d10, (l) L, null, "voice_design_step_transition", null, c3.k.d(837546571, true, new ho.r() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.voices.voicedesign.e
                        @Override // ho.r
                        public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                            z VoiceDesignScreenContent$lambda$1;
                            int intValue = ((Integer) obj4).intValue();
                            VoiceDesignScreenContent$lambda$1 = VoiceDesignScreenKt.VoiceDesignScreenContent$lambda$1(z13, state, lVar, (i1.o) obj, (VoiceDesignContract.Step) obj2, (m) obj3, intValue);
                            return VoiceDesignScreenContent$lambda$1;
                        }
                    }, qVar), qVar, 1597824, 40);
                    z12 = z13;
                    tVar3 = tVar4;
                } else {
                    qVar.R();
                    tVar3 = tVar2;
                    z12 = z10;
                }
                r10 = qVar.r();
                if (r10 != null) {
                    r10.f34012d = new d0(state, lVar, tVar3, z12, i10, i11);
                    return;
                }
                return;
            }
            z10 = z6;
            if ((i12 & 1171) != 1170) {
            }
            if (qVar.O(i12 & 1, z11)) {
            }
            r10 = qVar.r();
            if (r10 != null) {
            }
        }
        tVar2 = tVar;
        i14 = i11 & 8;
        if (i14 == 0) {
        }
        z10 = z6;
        if ((i12 & 1171) != 1170) {
        }
        if (qVar.O(i12 & 1, z11)) {
        }
        r10 = qVar.r();
        if (r10 != null) {
        }
    }

    public static final m0 VoiceDesignScreenContent$lambda$0$0(i1.q qVar) {
        qVar.getClass();
        return i1.l.c(y0.e(null, 3), y0.f(null, 3));
    }

    public static final z VoiceDesignScreenContent$lambda$1(boolean z6, VoiceDesignContract.State state, l lVar, i1.o oVar, VoiceDesignContract.Step step, m mVar, int i10) {
        List<VoiceDesignPrompt> list;
        oVar.getClass();
        step.getClass();
        int i11 = WhenMappings.$EnumSwitchMapping$0[step.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 == 4) {
                        q qVar = (q) mVar;
                        qVar.X(1885784173);
                        SaveVoiceStepKt.SaveVoiceStep(state, lVar, null, qVar, 0, 4);
                        qVar.p(false);
                    } else {
                        throw com.google.android.gms.internal.play_billing.b.h(1723371998, (q) mVar, false);
                    }
                } else {
                    q qVar2 = (q) mVar;
                    qVar2.X(1885610697);
                    SelectPreviewStepKt.SelectPreviewStep(state, lVar, null, qVar2, 0, 4);
                    qVar2.p(false);
                }
            } else {
                q qVar3 = (q) mVar;
                qVar3.X(1885373547);
                if (z6) {
                    qVar3.X(1885406748);
                    GeneratingStepKt.GeneratingStep(null, "voice_design_generating", qVar3, 48, 1);
                    qVar3.p(false);
                } else {
                    qVar3.X(1885501887);
                    GeneratingStepKt.GeneratingStep(null, null, qVar3, 0, 3);
                    qVar3.p(false);
                }
                qVar3.p(false);
            }
        } else {
            q qVar4 = (q) mVar;
            qVar4.X(1884951048);
            if (z6) {
                qVar4.X(1884991441);
                qVar4.p(false);
                list = VoiceDesignPrompts.INSTANCE.getALL_PROMPTS();
            } else {
                qVar4.X(1885067577);
                Object L = qVar4.L();
                Object obj = L;
                if (L == u2.l.f33918a) {
                    List<VoiceDesignPrompt> all_prompts = VoiceDesignPrompts.INSTANCE.getALL_PROMPTS();
                    all_prompts.getClass();
                    List j12 = tn.o.j1(all_prompts);
                    Collections.shuffle(j12);
                    qVar4.h0(j12);
                    obj = j12;
                }
                list = (List) obj;
                qVar4.p(false);
            }
            VoicePromptStepKt.VoicePromptStep(state, list, lVar, null, qVar4, 0, 8);
            qVar4.p(false);
        }
        return z.f31622a;
    }

    public static final z VoiceDesignScreenContent$lambda$2(VoiceDesignContract.State state, l lVar, t tVar, boolean z6, int i10, int i11, m mVar, int i12) {
        VoiceDesignScreenContent(state, lVar, tVar, z6, mVar, r.M(i10 | 1), i11);
        return z.f31622a;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void VoiceDesignScreenUI(final VoiceDesignContract.State state, final l lVar, boolean z6, m mVar, int i10, int i11) {
        int i12;
        boolean z10;
        int i13;
        boolean z11;
        boolean z12;
        r1 r10;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        int i14;
        int i15;
        q qVar = (q) mVar;
        qVar.Z(-1874051590);
        if ((i10 & 6) == 0) {
            if (qVar.h(state)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i12 = i15 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.h(lVar)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
        }
        int i16 = i11 & 4;
        if (i16 != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            z10 = z6;
            if (qVar.g(z10)) {
                i13 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i13 = 128;
            }
            i12 |= i13;
            if ((i12 & 147) == 146) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!qVar.O(i12 & 1, z11)) {
                if (i16 != 0) {
                    z13 = false;
                } else {
                    z13 = z10;
                }
                boolean hasChanges = state.getHasChanges();
                int i17 = i12 & 112;
                if (i17 == 32) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                Object L = qVar.L();
                u2.e eVar = u2.l.f33918a;
                if (z14 || L == eVar) {
                    L = new c(lVar, 3);
                    qVar.h0(L);
                }
                androidx.room.m0.a((ho.a) L, hasChanges, 0, qVar, 0);
                boolean z19 = z13;
                k5.a(null, c3.k.d(1862355894, true, new p() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.voices.voicedesign.f
                    @Override // ho.p
                    public final Object invoke(Object obj, Object obj2) {
                        z VoiceDesignScreenUI$lambda$1;
                        int intValue = ((Integer) obj2).intValue();
                        VoiceDesignScreenUI$lambda$1 = VoiceDesignScreenKt.VoiceDesignScreenUI$lambda$1(VoiceDesignContract.State.this, lVar, (m) obj, intValue);
                        return VoiceDesignScreenUI$lambda$1;
                    }
                }, qVar), null, null, null, 0, EchoTheme.INSTANCE.getColors(qVar, EchoTheme.$stable).getBackground().getPrimary(qVar, EchoThemeColors.Background.$stable), 0L, null, c3.k.d(681060811, true, new b3(state, lVar, z13, 1), qVar), qVar, 805306416, 445);
                qVar = qVar;
                if (state.getShowTipsSheet()) {
                    qVar.X(410362852);
                    if (i17 == 32) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    Object L2 = qVar.L();
                    if (z18 || L2 == eVar) {
                        L2 = new c(lVar, 4);
                        qVar.h0(L2);
                    }
                    z15 = false;
                    VoiceDesignTipsSheetKt.VoiceDesignTipsSheet((ho.a) L2, qVar, 0);
                    qVar.p(false);
                } else {
                    z15 = false;
                    qVar.X(410458952);
                    qVar.p(false);
                }
                if (state.getShowDiscardDialog()) {
                    qVar.X(410543861);
                    if (i17 == 32) {
                        z16 = true;
                    } else {
                        z16 = z15;
                    }
                    Object L3 = qVar.L();
                    if (z16 || L3 == eVar) {
                        L3 = new c(lVar, 5);
                        qVar.h0(L3);
                    }
                    ho.a aVar = (ho.a) L3;
                    if (i17 == 32) {
                        z17 = true;
                    } else {
                        z17 = z15;
                    }
                    Object L4 = qVar.L();
                    if (z17 || L4 == eVar) {
                        L4 = new c(lVar, 6);
                        qVar.h0(L4);
                    }
                    ConfirmationDialogKt.ConfirmationDialog(aVar, (ho.a) L4, kj.c.R(qVar, R.string.voice_design_discard_title), kj.c.R(qVar, R.string.voice_design_discard_text), kj.c.R(qVar, R.string.common_cancel), kj.c.R(qVar, R.string.voice_design_discard_confirm), true, qVar, 1572864, 0);
                    qVar.p(z15);
                } else {
                    qVar.X(411023400);
                    qVar.p(z15);
                }
                z12 = z19;
            } else {
                qVar.R();
                z12 = z10;
            }
            r10 = qVar.r();
            if (r10 == null) {
                r10.f34012d = new id.c(state, lVar, z12, i10, i11, 2);
                return;
            }
            return;
        }
        z10 = z6;
        if ((i12 & 147) == 146) {
        }
        if (!qVar.O(i12 & 1, z11)) {
        }
        r10 = qVar.r();
        if (r10 == null) {
        }
    }

    public static final z VoiceDesignScreenUI$lambda$0$0(l lVar) {
        lVar.invoke(VoiceDesignContract.Event.Close.INSTANCE);
        return z.f31622a;
    }

    public static final z VoiceDesignScreenUI$lambda$1(VoiceDesignContract.State state, final l lVar, m mVar, int i10) {
        boolean z6;
        c3.j jVar;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            c3.j jVar2 = null;
            if (state.getCanGoBack()) {
                qVar.X(-943001176);
                final int i11 = 0;
                c3.j d10 = c3.k.d(2081412552, true, new ho.q() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.voices.voicedesign.d
                    @Override // ho.q
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        z VoiceDesignScreenUI$lambda$1$0;
                        z VoiceDesignScreenUI$lambda$1$1;
                        int i12 = i11;
                        l2 l2Var = (l2) obj;
                        m mVar2 = (m) obj2;
                        int intValue = ((Integer) obj3).intValue();
                        switch (i12) {
                            case 0:
                                VoiceDesignScreenUI$lambda$1$0 = VoiceDesignScreenKt.VoiceDesignScreenUI$lambda$1$0(lVar, l2Var, mVar2, intValue);
                                return VoiceDesignScreenUI$lambda$1$0;
                            default:
                                VoiceDesignScreenUI$lambda$1$1 = VoiceDesignScreenKt.VoiceDesignScreenUI$lambda$1$1(lVar, l2Var, mVar2, intValue);
                                return VoiceDesignScreenUI$lambda$1$1;
                        }
                    }
                }, qVar);
                qVar.p(false);
                jVar = d10;
            } else {
                qVar.X(-942897760);
                qVar.p(false);
                jVar = null;
            }
            if (!state.getCanGoBack()) {
                qVar.X(-942798963);
                final int i12 = 1;
                jVar2 = c3.k.d(-1103945954, true, new ho.q() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.voices.voicedesign.d
                    @Override // ho.q
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        z VoiceDesignScreenUI$lambda$1$0;
                        z VoiceDesignScreenUI$lambda$1$1;
                        int i122 = i12;
                        l2 l2Var = (l2) obj;
                        m mVar2 = (m) obj2;
                        int intValue = ((Integer) obj3).intValue();
                        switch (i122) {
                            case 0:
                                VoiceDesignScreenUI$lambda$1$0 = VoiceDesignScreenKt.VoiceDesignScreenUI$lambda$1$0(lVar, l2Var, mVar2, intValue);
                                return VoiceDesignScreenUI$lambda$1$0;
                            default:
                                VoiceDesignScreenUI$lambda$1$1 = VoiceDesignScreenKt.VoiceDesignScreenUI$lambda$1$1(lVar, l2Var, mVar2, intValue);
                                return VoiceDesignScreenUI$lambda$1$1;
                        }
                    }
                }, qVar);
                qVar.p(false);
            } else {
                qVar.X(-942700352);
                qVar.p(false);
            }
            HeaderActionsKt.EchoThemeHeaderActions(null, kj.c.R(qVar, R.string.voice_design_title), jVar, jVar2, qVar, 0, 1);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z VoiceDesignScreenUI$lambda$1$0(l lVar, l2 l2Var, m mVar, int i10) {
        boolean z6;
        l2Var.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            boolean f10 = qVar.f(lVar);
            Object L = qVar.L();
            if (f10 || L == u2.l.f33918a) {
                L = new c(lVar, 1);
                qVar.h0(L);
            }
            BackButtonKt.EchoThemeBackButton((ho.a) L, null, qVar, 0, 2);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z VoiceDesignScreenUI$lambda$1$0$0$0(l lVar) {
        lVar.invoke(VoiceDesignContract.Event.GoBack.INSTANCE);
        return z.f31622a;
    }

    public static final z VoiceDesignScreenUI$lambda$1$1(l lVar, l2 l2Var, m mVar, int i10) {
        boolean z6;
        l2Var.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            boolean f10 = qVar.f(lVar);
            Object L = qVar.L();
            if (f10 || L == u2.l.f33918a) {
                L = new c(lVar, 2);
                qVar.h0(L);
            }
            EchoCloseButtonKt.EchoCloseButton((ho.a) L, qVar, 0);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z VoiceDesignScreenUI$lambda$1$1$0$0(l lVar) {
        lVar.invoke(VoiceDesignContract.Event.Close.INSTANCE);
        return z.f31622a;
    }

    public static final z VoiceDesignScreenUI$lambda$2(VoiceDesignContract.State state, l lVar, boolean z6, z1 z1Var, m mVar, int i10) {
        int i11;
        boolean z10;
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
            z10 = true;
        } else {
            z10 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i11 & 1, z10)) {
            i3.q qVar2 = i3.q.f13017a;
            t u6 = r1.d.u(r1.d.D(qVar2, z1Var));
            f1 d10 = r1.p.d(i3.d.f12997a, false);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            t c5 = i3.a.c(u6, qVar);
            h4.h.f11920i.getClass();
            h4.f fVar = h4.g.f11903b;
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            r.J(h4.g.f11907f, d10, qVar);
            r.J(h4.g.f11906e, l4, qVar);
            r.y(qVar, Integer.valueOf(hashCode), h4.g.f11908g);
            r.F(h4.g.f11909h, qVar);
            r.J(h4.g.f11905d, c5, qVar);
            VoiceDesignScreenContent(state, lVar, null, z6, qVar, 0, 4);
            if (state.getError() != null) {
                qVar.X(701150908);
                t d11 = p2.d(qVar2, 1.0f);
                String error = state.getError();
                boolean f10 = qVar.f(lVar);
                Object L = qVar.L();
                if (f10 || L == u2.l.f33918a) {
                    L = new c(lVar, 0);
                    qVar.h0(L);
                }
                ErrorScreenKt.m1837ErrorScreenuDo3WH8(d11, null, error, 0L, (ho.a) L, qVar, 6, 10);
                qVar.p(false);
            } else {
                qVar.X(701355601);
                qVar.p(false);
            }
            qVar.p(true);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z VoiceDesignScreenUI$lambda$2$0$0$0(l lVar) {
        lVar.invoke(VoiceDesignContract.Event.Retry.INSTANCE);
        return z.f31622a;
    }

    public static final z VoiceDesignScreenUI$lambda$3$0(l lVar) {
        lVar.invoke(VoiceDesignContract.Event.HideTips.INSTANCE);
        return z.f31622a;
    }

    public static final z VoiceDesignScreenUI$lambda$4$0(l lVar) {
        lVar.invoke(VoiceDesignContract.Event.HideDiscardDialog.INSTANCE);
        return z.f31622a;
    }

    public static final z VoiceDesignScreenUI$lambda$5$0(l lVar) {
        lVar.invoke(VoiceDesignContract.Event.ConfirmDiscard.INSTANCE);
        return z.f31622a;
    }

    public static final z VoiceDesignScreenUI$lambda$6(VoiceDesignContract.State state, l lVar, boolean z6, int i10, int i11, m mVar, int i12) {
        VoiceDesignScreenUI(state, lVar, z6, mVar, r.M(i10 | 1), i11);
        return z.f31622a;
    }
}
