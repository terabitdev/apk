package io.elevenlabs.readerapp.ui.screens.authenticated.assistant;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import io.elevenlabs.readerapp.ui.screens.authenticated.assistant.AssistantContract;
import io.elevenlabs.readerapp.ui.screens.authenticated.assistant.components.ChatHistoryListKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.assistant.components.ChatInputKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.r0;
import io.elevenlabs.ui.echo.EchoTheme;
import io.livekit.android.rpc.RpcError;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import r1.m1;
import r1.p2;
import u2.r1;
import u2.z0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\u001aO\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a]\u0010\u0011\u001a\u00020\u00062\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\u0003¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u000f\u0010\u0013\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u000f\u0010\u0015\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0015\u0010\u0014\u001a\u000f\u0010\u0016\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0016\u0010\u0014¨\u0006\u0018²\u0006\u000e\u0010\u0017\u001a\u00020\u00058\n@\nX\u008a\u008e\u0002"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/assistant/AssistantContract$State;", RemoteConfigConstants.ResponseFieldKey.STATE, "", "isLoading", "Lkotlin/Function1;", "", "Lsn/z;", "onSendMessage", "Lkotlin/Function0;", "onUserTyping", "onSwitchToVoiceMode", "AssistantTextModeScreen", "(Lio/elevenlabs/readerapp/ui/screens/authenticated/assistant/AssistantContract$State;ZLho/l;Lho/a;Lho/a;Lu2/m;I)V", "", "Lio/elevenlabs/readerapp/ui/screens/authenticated/assistant/ChatMessage;", "messages", "isAssistantTyping", "AssistantTextModeUI", "(Ljava/util/List;ZZLho/l;Lho/a;Lho/a;Lu2/m;I)V", "Preview_Assistant_TextModeUI", "(Lu2/m;I)V", "Preview_Assistant_TextModeUI_Typing", "Preview_Assistant_TextModeUI_Loading", "textValue", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class AssistantTextModeScreenKt {
    public static final void AssistantTextModeScreen(AssistantContract.State state, boolean z6, ho.l lVar, ho.a aVar, ho.a aVar2, u2.m mVar, int i10) {
        int i11;
        boolean z10;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        state.getClass();
        lVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        u2.q qVar = (u2.q) mVar;
        qVar.Z(267809573);
        if ((i10 & 6) == 0) {
            if (qVar.h(state)) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i11 = i16 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.g(z6)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i11 |= i15;
        }
        if ((i10 & 384) == 0) {
            if (qVar.h(lVar)) {
                i14 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i14 = 128;
            }
            i11 |= i14;
        }
        if ((i10 & 3072) == 0) {
            if (qVar.h(aVar)) {
                i13 = 2048;
            } else {
                i13 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i11 |= i13;
        }
        if ((i10 & 24576) == 0) {
            if (qVar.h(aVar2)) {
                i12 = 16384;
            } else {
                i12 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
            }
            i11 |= i12;
        }
        if ((i11 & 9363) != 9362) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (qVar.O(i11 & 1, z10)) {
            AssistantTextModeUI(tn.o.U0(state.getChatMessages()), state.isAssistantTyping(), z6, lVar, aVar, aVar2, qVar, (i11 << 3) & 524160);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new r0(state, z6, lVar, aVar, aVar2, i10, 2);
        }
    }

    public static final sn.z AssistantTextModeScreen$lambda$0(AssistantContract.State state, boolean z6, ho.l lVar, ho.a aVar, ho.a aVar2, int i10, u2.m mVar, int i11) {
        AssistantTextModeScreen(state, z6, lVar, aVar, aVar2, mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void AssistantTextModeUI(List<ChatMessage> list, boolean z6, boolean z10, ho.l lVar, ho.a aVar, ho.a aVar2, u2.m mVar, int i10) {
        int i11;
        boolean z11;
        u2.e eVar;
        boolean z12;
        boolean z13;
        boolean z14;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-693710530);
        if ((i10 & 6) == 0) {
            if (qVar.h(list)) {
                i17 = 4;
            } else {
                i17 = 2;
            }
            i11 = i17 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.g(z6)) {
                i16 = 32;
            } else {
                i16 = 16;
            }
            i11 |= i16;
        }
        if ((i10 & 384) == 0) {
            if (qVar.g(z10)) {
                i15 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i15 = 128;
            }
            i11 |= i15;
        }
        if ((i10 & 3072) == 0) {
            if (qVar.h(lVar)) {
                i14 = 2048;
            } else {
                i14 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i11 |= i14;
        }
        if ((i10 & 24576) == 0) {
            if (qVar.h(aVar)) {
                i13 = 16384;
            } else {
                i13 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
            }
            i11 |= i13;
        }
        if ((196608 & i10) == 0) {
            if (qVar.h(aVar2)) {
                i12 = 131072;
            } else {
                i12 = 65536;
            }
            i11 |= i12;
        }
        if ((74899 & i11) != 74898) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (qVar.O(i11 & 1, z11)) {
            Object L = qVar.L();
            u2.e eVar2 = u2.l.f33918a;
            if (L == eVar2) {
                L = u2.r.A("");
                qVar.h0(L);
            }
            z0 z0Var = (z0) L;
            i3.t v9 = p2.v(p2.e(i3.q.f13017a, 1.0f), null, 3);
            EchoTheme echoTheme = EchoTheme.INSTANCE;
            int i18 = EchoTheme.$stable;
            i3.t F = r1.d.F(v9, echoTheme.getSpacings(qVar, i18).getX5(), echoTheme.getSpacings(qVar, i18).getX5());
            r1.x a10 = r1.w.a(r1.j.f29230c, i3.d.B0, qVar, 0);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.t c5 = i3.a.c(F, qVar);
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
            if (1.0f <= 0.0d) {
                s1.a.a("invalid weight; must be greater than zero");
            }
            m1 m1Var = new m1(1.0f, true);
            if (!z6 && !z10) {
                eVar = eVar2;
                z12 = false;
            } else {
                eVar = eVar2;
                z12 = true;
            }
            u2.e eVar3 = eVar;
            ChatHistoryListKt.ChatHistoryList(list, m1Var, z12, qVar, i11 & 14, 0);
            String AssistantTextModeUI$lambda$1 = AssistantTextModeUI$lambda$1(z0Var);
            if ((57344 & i11) == 16384) {
                z13 = true;
            } else {
                z13 = false;
            }
            Object L2 = qVar.L();
            if (z13 || L2 == eVar3) {
                L2 = new n(aVar, z0Var, 3);
                qVar.h0(L2);
            }
            ho.l lVar2 = (ho.l) L2;
            if ((i11 & 7168) == 2048) {
                z14 = true;
            } else {
                z14 = false;
            }
            Object L3 = qVar.L();
            if (z14 || L3 == eVar3) {
                L3 = new c(lVar, z0Var, 2);
                qVar.h0(L3);
            }
            ChatInputKt.ChatInput(AssistantTextModeUI$lambda$1, lVar2, (ho.a) L3, aVar2, null, null, false, !z10, qVar, (i11 >> 6) & 7168, 112);
            qVar = qVar;
            qVar.p(true);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new w(list, z6, z10, lVar, aVar, aVar2, i10, 0);
        }
    }

    private static final String AssistantTextModeUI$lambda$1(z0 z0Var) {
        return (String) z0Var.getValue();
    }

    public static final sn.z AssistantTextModeUI$lambda$3$0$0(ho.a aVar, z0 z0Var, String str) {
        str.getClass();
        z0Var.setValue(str);
        aVar.invoke();
        return sn.z.f31622a;
    }

    public static final sn.z AssistantTextModeUI$lambda$3$1$0(ho.l lVar, z0 z0Var) {
        lVar.invoke(AssistantTextModeUI$lambda$1(z0Var));
        z0Var.setValue("");
        return sn.z.f31622a;
    }

    public static final sn.z AssistantTextModeUI$lambda$4(List list, boolean z6, boolean z10, ho.l lVar, ho.a aVar, ho.a aVar2, int i10, u2.m mVar, int i11) {
        AssistantTextModeUI(list, z6, z10, lVar, aVar, aVar2, mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_Assistant_TextModeUI(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(245453421);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, ComposableSingletons$AssistantTextModeScreenKt.INSTANCE.getLambda$1402265427$app_productionRelease(), qVar, (EchoTheme.$stable << 6) | 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.account.explore.e(i10, 14);
        }
    }

    public static final sn.z Preview_Assistant_TextModeUI$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_Assistant_TextModeUI(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_Assistant_TextModeUI_Loading(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(652712624);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, ComposableSingletons$AssistantTextModeScreenKt.INSTANCE.getLambda$1795875222$app_productionRelease(), qVar, (EchoTheme.$stable << 6) | 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.account.explore.e(i10, 13);
        }
    }

    public static final sn.z Preview_Assistant_TextModeUI_Loading$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_Assistant_TextModeUI_Loading(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_Assistant_TextModeUI_Typing(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-1638426037);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, ComposableSingletons$AssistantTextModeScreenKt.INSTANCE.m1273getLambda$354623835$app_productionRelease(), qVar, (EchoTheme.$stable << 6) | 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.account.explore.e(i10, 12);
        }
    }

    public static final sn.z Preview_Assistant_TextModeUI_Typing$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_Assistant_TextModeUI_Typing(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final /* synthetic */ void access$AssistantTextModeUI(List list, boolean z6, boolean z10, ho.l lVar, ho.a aVar, ho.a aVar2, u2.m mVar, int i10) {
        AssistantTextModeUI(list, z6, z10, lVar, aVar, aVar2, mVar, i10);
    }
}
