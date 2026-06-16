package io.elevenlabs.readerapp.ui.screens.authenticated.assistant;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import io.elevenlabs.domain.model.AssistantConfig;
import io.elevenlabs.readerapp.ui.screens.authenticated.assistant.AssistantContract;
import io.elevenlabs.readerapp.ui.screens.authenticated.assistant.components.PromptSuggestionsSectionKt;
import io.elevenlabs.ui.components.VoiceCircleKt;
import io.elevenlabs.ui.echo.EchoTheme;
import io.elevenlabs.ui.extensions.SafeHapticFeedback;
import io.elevenlabs.ui.extensions.SafeHapticFeedbackKt;
import io.livekit.android.rpc.RpcError;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import r1.m1;
import r1.p2;
import u2.r1;
import u2.s2;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0010\u0007\n\u0002\b\u0002\u001aE\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f\u001aS\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00000\r2\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u000f\u0010\u0012\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u000f\u0010\u0014\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0014\u0010\u0013\u001a\u000f\u0010\u0015\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0015\u0010\u0013\"\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00000\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001a²\u0006\f\u0010\u0019\u001a\u00020\u00188\nX\u008a\u0084\u0002"}, d2 = {"", "voiceId", "Lio/elevenlabs/readerapp/ui/screens/authenticated/assistant/AssistantContract$State;", RemoteConfigConstants.ResponseFieldKey.STATE, "", "isLoading", "Lkotlin/Function1;", "Lsn/z;", "onSuggestionClick", "Li3/t;", "modifier", "AssistantVoiceModeScreen", "(Ljava/lang/String;Lio/elevenlabs/readerapp/ui/screens/authenticated/assistant/AssistantContract$State;ZLho/l;Li3/t;Lu2/m;II)V", "", "promptSuggestions", "hidePromptSuggestions", "AssistantVoiceModeUI", "(Ljava/lang/String;Ljava/util/List;Lho/l;Li3/t;ZZLu2/m;II)V", "Preview_Assistant_VoiceModeUI_Listening", "(Lu2/m;I)V", "Preview_Assistant_VoiceModeUI_Speaking", "Preview_Assistant_VoiceModeUI_Loading", "placeholderPromptSuggestions", "Ljava/util/List;", "", "promptSuggestionsAlpha", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class AssistantVoiceModeScreenKt {
    private static final List<String> placeholderPromptSuggestions = ig.f.I("What's this about?", "Summarise this", "Tell me more", "Who is the author?", "What are the key points?", "Foo bar?", "Bar foo?");

    /* JADX WARN: Code restructure failed: missing block: B:61:0x00e9, code lost:
    
        if (r18.getHidePromptSuggestions() == false) goto L164;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AssistantVoiceModeScreen(String str, AssistantContract.State state, boolean z6, ho.l lVar, i3.t tVar, u2.m mVar, int i10, int i11) {
        int i12;
        i3.t tVar2;
        int i13;
        boolean z10;
        i3.t tVar3;
        r1 r10;
        boolean z11;
        i3.t tVar4;
        List<String> list;
        List<String> list2;
        int i14;
        int i15;
        int i16;
        int i17;
        str.getClass();
        state.getClass();
        lVar.getClass();
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-2100042251);
        if ((i10 & 6) == 0) {
            if (qVar.f(str)) {
                i17 = 4;
            } else {
                i17 = 2;
            }
            i12 = i17 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.h(state)) {
                i16 = 32;
            } else {
                i16 = 16;
            }
            i12 |= i16;
        }
        if ((i10 & 384) == 0) {
            if (qVar.g(z6)) {
                i15 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i15 = 128;
            }
            i12 |= i15;
        }
        if ((i10 & 3072) == 0) {
            if (qVar.h(lVar)) {
                i14 = 2048;
            } else {
                i14 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i12 |= i14;
        }
        int i18 = i11 & 16;
        if (i18 != 0) {
            i12 |= 24576;
        } else if ((i10 & 24576) == 0) {
            tVar2 = tVar;
            if (qVar.f(tVar2)) {
                i13 = 16384;
            } else {
                i13 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
            }
            i12 |= i13;
            boolean z12 = false;
            if ((i12 & 9363) == 9362) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!qVar.O(i12 & 1, z10)) {
                if (i18 != 0) {
                    tVar4 = i3.q.f13017a;
                    z11 = true;
                } else {
                    z11 = true;
                    tVar4 = tVar2;
                }
                boolean f10 = qVar.f(state);
                Object L = qVar.L();
                u2.e eVar = u2.l.f33918a;
                if (f10 || L == eVar) {
                    AssistantConfig assistantConfig = state.getAssistantConfig();
                    if (assistantConfig == null || (list = assistantConfig.getPromptSuggestions()) == null) {
                        list = placeholderPromptSuggestions;
                    }
                    L = list;
                    qVar.h0(L);
                }
                List list3 = (List) L;
                boolean f11 = qVar.f(state);
                Object L2 = qVar.L();
                if (f11 || L2 == eVar) {
                    if (state.getStatus() == AssistantStatus.CONNECTED) {
                        AssistantConfig assistantConfig2 = state.getAssistantConfig();
                        if (assistantConfig2 != null) {
                            list2 = assistantConfig2.getPromptSuggestions();
                        } else {
                            list2 = null;
                        }
                        if (list2 != null) {
                            if (!list2.isEmpty()) {
                            }
                        }
                    }
                    z12 = z11;
                    L2 = Boolean.valueOf(z12);
                    qVar.h0(L2);
                }
                int i19 = i12 >> 3;
                AssistantVoiceModeUI(str, list3, lVar, tVar4, z6, ((Boolean) L2).booleanValue(), qVar, (i12 & 14) | (i19 & 896) | (i19 & 7168) | ((i12 << 6) & 57344), 0);
                tVar3 = tVar4;
            } else {
                qVar.R();
                tVar3 = tVar2;
            }
            r10 = qVar.r();
            if (r10 == null) {
                r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.account.components.j(str, state, z6, lVar, tVar3, i10, i11);
                return;
            }
            return;
        }
        tVar2 = tVar;
        boolean z122 = false;
        if ((i12 & 9363) == 9362) {
        }
        if (!qVar.O(i12 & 1, z10)) {
        }
        r10 = qVar.r();
        if (r10 == null) {
        }
    }

    public static final sn.z AssistantVoiceModeScreen$lambda$2(String str, AssistantContract.State state, boolean z6, ho.l lVar, i3.t tVar, int i10, int i11, u2.m mVar, int i12) {
        AssistantVoiceModeScreen(str, state, z6, lVar, tVar, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AssistantVoiceModeUI(String str, List<String> list, ho.l lVar, i3.t tVar, boolean z6, boolean z10, u2.m mVar, int i10, int i11) {
        int i12;
        i3.t tVar2;
        int i13;
        boolean z11;
        i3.t tVar3;
        r1 r10;
        float f10;
        boolean z12;
        boolean z13;
        float f11;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-1413465730);
        if ((i10 & 6) == 0) {
            if (qVar.f(str)) {
                i18 = 4;
            } else {
                i18 = 2;
            }
            i12 = i18 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.h(list)) {
                i17 = 32;
            } else {
                i17 = 16;
            }
            i12 |= i17;
        }
        if ((i10 & 384) == 0) {
            if (qVar.h(lVar)) {
                i16 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i16 = 128;
            }
            i12 |= i16;
        }
        int i19 = i11 & 8;
        if (i19 != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            tVar2 = tVar;
            if (qVar.f(tVar2)) {
                i13 = 2048;
            } else {
                i13 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i12 |= i13;
            if ((i10 & 24576) == 0) {
                if (qVar.g(z6)) {
                    i15 = 16384;
                } else {
                    i15 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                }
                i12 |= i15;
            }
            if ((196608 & i10) == 0) {
                if (qVar.g(z10)) {
                    i14 = 131072;
                } else {
                    i14 = 65536;
                }
                i12 |= i14;
            }
            if ((74899 & i12) == 74898) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!qVar.O(i12 & 1, z11)) {
                i3.q qVar2 = i3.q.f13017a;
                if (i19 != 0) {
                    tVar2 = qVar2;
                }
                SafeHapticFeedback safeHapticFeedback = SafeHapticFeedbackKt.safeHapticFeedback(qVar, 0);
                Object L = qVar.L();
                u2.e eVar = u2.l.f33918a;
                if (L == eVar) {
                    L = j1.e.a(0.7f);
                    qVar.h0(L);
                }
                j1.d dVar = (j1.d) L;
                Object L2 = qVar.L();
                if (L2 == eVar) {
                    L2 = j1.e.a(0.4f);
                    qVar.h0(L2);
                }
                j1.d dVar2 = (j1.d) L2;
                if (z10) {
                    f10 = t2.u.P;
                } else {
                    f10 = 1.0f;
                }
                int i20 = i12;
                i3.t tVar4 = tVar2;
                s2 b10 = j1.f.b(f10, j1.e.s(300, 0, j1.y.f18444a, 2), "SuggestionsAlpha", qVar, 3072, 20);
                Boolean valueOf = Boolean.valueOf(z6);
                int i21 = i20 & 57344;
                if (i21 == 16384) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                boolean h10 = qVar.h(dVar) | z12 | qVar.h(dVar2);
                Object L3 = qVar.L();
                if (h10 || L3 == eVar) {
                    L3 = new AssistantVoiceModeScreenKt$AssistantVoiceModeUI$1$1(z6, dVar, dVar2, null);
                    qVar.h0(L3);
                }
                u2.r.f((ho.p) L3, valueOf, qVar);
                Boolean valueOf2 = Boolean.valueOf(z6);
                if (i21 == 16384) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                boolean h11 = z13 | qVar.h(safeHapticFeedback);
                Object L4 = qVar.L();
                if (h11 || L4 == eVar) {
                    L4 = new AssistantVoiceModeScreenKt$AssistantVoiceModeUI$2$1(z6, safeHapticFeedback, null);
                    qVar.h0(L4);
                }
                u2.r.f((ho.p) L4, valueOf2, qVar);
                i3.t d10 = p2.d(tVar4, 1.0f);
                EchoTheme echoTheme = EchoTheme.INSTANCE;
                int i22 = EchoTheme.$stable;
                i3.t G = r1.d.G(d10, t2.u.P, echoTheme.getSpacings(qVar, i22).getX4(), 1);
                r1.x a10 = r1.w.a(r1.j.f29230c, i3.d.C0, qVar, 48);
                int hashCode = Long.hashCode(qVar.T);
                c3.o l4 = qVar.l();
                i3.t c5 = i3.a.c(G, qVar);
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
                float f12 = 2.5f;
                if (2.5f <= 0.0d) {
                    s1.a.a("invalid weight; must be greater than zero");
                }
                if (2.5f > Float.MAX_VALUE) {
                    f12 = Float.MAX_VALUE;
                }
                r1.d.g(new m1(f12, true), qVar);
                float f13 = 160;
                i3.t j4 = r1.d.j(p2.r(r1.d.G(qVar2, echoTheme.getSpacings(qVar, i22).getX6(), t2.u.P, 2), t2.u.P, t2.u.P, f13, f13, 3), 1.0f, false);
                float floatValue = ((Number) dVar.d()).floatValue();
                VoiceCircleKt.VoiceCircle(true, str, m3.h.a(m3.h.j(j4, floatValue, floatValue), ((Number) dVar2.d()).floatValue()), false, !z6, qVar, ((i20 << 3) & 112) | 6, 8);
                qVar = qVar;
                if (1.0f <= 0.0d) {
                    s1.a.a("invalid weight; must be greater than zero");
                }
                if (1.0f > Float.MAX_VALUE) {
                    f11 = Float.MAX_VALUE;
                } else {
                    f11 = 1.0f;
                }
                r1.d.g(new m1(f11, true), qVar);
                PromptSuggestionsSectionKt.PromptSuggestionsSection(list, lVar, m3.h.a(qVar2, AssistantVoiceModeUI$lambda$2(b10)), qVar, (i20 >> 3) & 126, 0);
                r1.d.g(p2.f(qVar2, echoTheme.getSpacings(qVar, i22).getX5()), qVar);
                qVar.p(true);
                tVar3 = tVar4;
            } else {
                qVar.R();
                tVar3 = tVar2;
            }
            r10 = qVar.r();
            if (r10 == null) {
                r10.f34012d = new x(str, list, lVar, tVar3, z6, z10, i10, i11);
                return;
            }
            return;
        }
        tVar2 = tVar;
        if ((i10 & 24576) == 0) {
        }
        if ((196608 & i10) == 0) {
        }
        if ((74899 & i12) == 74898) {
        }
        if (!qVar.O(i12 & 1, z11)) {
        }
        r10 = qVar.r();
        if (r10 == null) {
        }
    }

    private static final float AssistantVoiceModeUI$lambda$2(s2 s2Var) {
        return ((Number) s2Var.getValue()).floatValue();
    }

    public static final sn.z AssistantVoiceModeUI$lambda$6(String str, List list, ho.l lVar, i3.t tVar, boolean z6, boolean z10, int i10, int i11, u2.m mVar, int i12) {
        AssistantVoiceModeUI(str, list, lVar, tVar, z6, z10, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }

    public static final void Preview_Assistant_VoiceModeUI_Listening(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-946163783);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, ComposableSingletons$AssistantVoiceModeScreenKt.INSTANCE.getLambda$693375903$app_productionRelease(), qVar, (EchoTheme.$stable << 6) | 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.account.explore.e(i10, 16);
        }
    }

    public static final sn.z Preview_Assistant_VoiceModeUI_Listening$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_Assistant_VoiceModeUI_Listening(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_Assistant_VoiceModeUI_Loading(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(945543290);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, ComposableSingletons$AssistantVoiceModeScreenKt.INSTANCE.getLambda$13172192$app_productionRelease(), qVar, (EchoTheme.$stable << 6) | 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.account.explore.e(i10, 17);
        }
    }

    public static final sn.z Preview_Assistant_VoiceModeUI_Loading$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_Assistant_VoiceModeUI_Loading(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_Assistant_VoiceModeUI_Speaking(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-499923386);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, ComposableSingletons$AssistantVoiceModeScreenKt.INSTANCE.getLambda$661343648$app_productionRelease(), qVar, (EchoTheme.$stable << 6) | 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.account.explore.e(i10, 15);
        }
    }

    public static final sn.z Preview_Assistant_VoiceModeUI_Speaking$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_Assistant_VoiceModeUI_Speaking(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }
}
