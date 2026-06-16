package io.elevenlabs.readerapp.ui.screens.authenticated.assistant.components;

import ho.p;
import i3.t;
import io.elevenlabs.readerapp.ui.components.r0;
import io.elevenlabs.readerapp.ui.screens.authenticated.account.explore.e;
import io.elevenlabs.readerapp.ui.screens.authenticated.assistant.ChatMessage;
import io.elevenlabs.ui.echo.EchoTheme;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import r1.d;
import r1.d2;
import r1.h;
import r1.j;
import r1.p2;
import r1.u0;
import rd.c1;
import t1.b0;
import t1.i;
import t1.z;
import t2.u;
import u2.l;
import u2.m;
import u2.q;
import u2.r;
import u2.r1;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a1\u0010\b\u001a\u00020\u00072\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\b\u0010\t\u001a\u000f\u0010\n\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u000f\u0010\f\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\f\u0010\u000b¨\u0006\r"}, d2 = {"", "Lio/elevenlabs/readerapp/ui/screens/authenticated/assistant/ChatMessage;", "messages", "Li3/t;", "modifier", "", "showAssistantTypingAnimation", "Lsn/z;", "ChatHistoryList", "(Ljava/util/List;Li3/t;ZLu2/m;II)V", "Preview_ChatHistoryList", "(Lu2/m;I)V", "Preview_ChatHistoryList_Typing", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ChatHistoryListKt {
    /* JADX WARN: Removed duplicated region for block: B:13:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ChatHistoryList(List<ChatMessage> list, t tVar, boolean z6, m mVar, int i10, int i11) {
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
        int i16;
        list.getClass();
        q qVar = (q) mVar;
        qVar.Z(759695534);
        if ((i10 & 6) == 0) {
            if (qVar.h(list)) {
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
            tVar2 = tVar;
            if (qVar.f(tVar2)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i12 |= i13;
            i14 = i11 & 4;
            if (i14 == 0) {
                i12 |= 384;
            } else if ((i10 & 384) == 0) {
                z10 = z6;
                if (qVar.g(z10)) {
                    i15 = 256;
                } else {
                    i15 = 128;
                }
                i12 |= i15;
                boolean z13 = false;
                if ((i12 & 147) != 146) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (qVar.O(i12 & 1, z11)) {
                    if (i17 != 0) {
                        tVar3 = i3.q.f13017a;
                    } else {
                        tVar3 = tVar2;
                    }
                    if (i14 != 0) {
                        z12 = false;
                    } else {
                        z12 = z10;
                    }
                    z a10 = b0.a(0, qVar, 3);
                    Integer valueOf = Integer.valueOf(list.size());
                    boolean h10 = qVar.h(list) | qVar.f(a10);
                    Object L = qVar.L();
                    Object obj = l.f33918a;
                    if (h10 || L == obj) {
                        L = new ChatHistoryListKt$ChatHistoryList$1$1(list, a10, null);
                        qVar.h0(L);
                    }
                    r.f((p) L, valueOf, qVar);
                    t r11 = p2.r(p2.e(tVar3, 1.0f), u.P, 200, u.P, u.P, 13);
                    EchoTheme echoTheme = EchoTheme.INSTANCE;
                    int i18 = EchoTheme.$stable;
                    d2 f10 = d.f(u.P, u.P, u.P, echoTheme.getSpacings(qVar, i18).getX5(), 7);
                    u0 u0Var = j.f29228a;
                    h g10 = j.g(echoTheme.getSpacings(qVar, i18).getX3());
                    if ((i12 & 896) == 256) {
                        z13 = true;
                    }
                    boolean h11 = qVar.h(list) | z13;
                    Object L2 = qVar.L();
                    if (h11 || L2 == obj) {
                        L2 = new io.elevenlabs.readerapp.ui.screens.authenticated.agent.components.d(z12, list);
                        qVar.h0(L2);
                    }
                    c1.c(r11, a10, f10, true, g10, null, null, false, null, (ho.l) L2, qVar, 3072, 480);
                } else {
                    qVar.R();
                    tVar3 = tVar2;
                    z12 = z10;
                }
                r10 = qVar.r();
                if (r10 != null) {
                    r10.f34012d = new id.c(list, tVar3, z12, i10, i11, 1);
                    return;
                }
                return;
            }
            z10 = z6;
            boolean z132 = false;
            if ((i12 & 147) != 146) {
            }
            if (qVar.O(i12 & 1, z11)) {
            }
            r10 = qVar.r();
            if (r10 != null) {
            }
        }
        tVar2 = tVar;
        i14 = i11 & 4;
        if (i14 == 0) {
        }
        z10 = z6;
        boolean z1322 = false;
        if ((i12 & 147) != 146) {
        }
        if (qVar.O(i12 & 1, z11)) {
        }
        r10 = qVar.r();
        if (r10 != null) {
        }
    }

    public static final sn.z ChatHistoryList$lambda$1$0(boolean z6, final List list, t1.t tVar) {
        tVar.getClass();
        if (z6) {
            t1.t.c(tVar, "typing_indicator", null, ComposableSingletons$ChatHistoryListKt.INSTANCE.getLambda$547432830$app_productionRelease(), 2);
        }
        final r0 r0Var = new r0(26);
        final ChatHistoryListKt$ChatHistoryList$lambda$1$0$$inlined$items$default$1 chatHistoryListKt$ChatHistoryList$lambda$1$0$$inlined$items$default$1 = new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.assistant.components.ChatHistoryListKt$ChatHistoryList$lambda$1$0$$inlined$items$default$1
            @Override // ho.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke((ChatMessage) obj);
            }

            @Override // ho.l
            public final Void invoke(ChatMessage chatMessage) {
                return null;
            }
        };
        ((i) tVar).u(list.size(), new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.assistant.components.ChatHistoryListKt$ChatHistoryList$lambda$1$0$$inlined$items$default$2
            public final Object invoke(int i10) {
                return ho.l.this.invoke(list.get(i10));
            }

            @Override // ho.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).intValue());
            }
        }, new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.assistant.components.ChatHistoryListKt$ChatHistoryList$lambda$1$0$$inlined$items$default$3
            public final Object invoke(int i10) {
                return ho.l.this.invoke(list.get(i10));
            }

            @Override // ho.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).intValue());
            }
        }, new c3.j(new ho.r() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.assistant.components.ChatHistoryListKt$ChatHistoryList$lambda$1$0$$inlined$items$default$4
            public final void invoke(t1.b bVar, int i10, m mVar, int i11) {
                int i12;
                boolean z10;
                int i13;
                int i14;
                if ((i11 & 6) == 0) {
                    if (((q) mVar).f(bVar)) {
                        i14 = 4;
                    } else {
                        i14 = 2;
                    }
                    i12 = i14 | i11;
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
                    z10 = true;
                } else {
                    z10 = false;
                }
                q qVar = (q) mVar;
                if (qVar.O(i12 & 1, z10)) {
                    ChatMessage chatMessage = (ChatMessage) list.get(i10);
                    qVar.X(-1042869928);
                    if (chatMessage.isFromUser()) {
                        qVar.X(-1042849562);
                        ChatMessageBubbleKt.UserMessageBubble(chatMessage.getContent(), null, qVar, 0, 2);
                        qVar.p(false);
                    } else {
                        qVar.X(-1042768063);
                        ChatMessageBubbleKt.AssistantMessageBubble(chatMessage.getContent(), null, qVar, 0, 2);
                        qVar.p(false);
                    }
                    qVar.p(false);
                    return;
                }
                qVar.R();
            }

            @Override // ho.r
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                invoke((t1.b) obj, ((Number) obj2).intValue(), (m) obj3, ((Number) obj4).intValue());
                return sn.z.f31622a;
            }
        }, true, 802480018));
        return sn.z.f31622a;
    }

    public static final Object ChatHistoryList$lambda$1$0$0(ChatMessage chatMessage) {
        chatMessage.getClass();
        return Integer.valueOf(chatMessage.hashCode());
    }

    public static final sn.z ChatHistoryList$lambda$2(List list, t tVar, boolean z6, int i10, int i11, m mVar, int i12) {
        ChatHistoryList(list, tVar, z6, mVar, r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }

    public static final void Preview_ChatHistoryList(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(38625216);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, ComposableSingletons$ChatHistoryListKt.INSTANCE.getLambda$1483402790$app_productionRelease(), qVar, (EchoTheme.$stable << 6) | 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new e(i10, 18);
        }
    }

    public static final sn.z Preview_ChatHistoryList$lambda$0(int i10, m mVar, int i11) {
        Preview_ChatHistoryList(mVar, r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_ChatHistoryList_Typing(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(228016428);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, ComposableSingletons$ChatHistoryListKt.INSTANCE.getLambda$1467339782$app_productionRelease(), qVar, (EchoTheme.$stable << 6) | 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new e(i10, 19);
        }
    }

    public static final sn.z Preview_ChatHistoryList_Typing$lambda$0(int i10, m mVar, int i11) {
        Preview_ChatHistoryList_Typing(mVar, r.M(i10 | 1));
        return sn.z.f31622a;
    }
}
