package io.elevenlabs.readerapp.ui.screens.authenticated.agent.components;

import android.gov.nist.javax.sip.parser.TokenNames;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.protobuf.c6;
import e5.k;
import f4.f1;
import h4.g;
import ho.p;
import i3.t;
import ib.i;
import io.elevenlabs.readerapp.R;
import io.elevenlabs.readerapp.ui.screens.authenticated.assistant.ChatMessage;
import io.elevenlabs.ui.echo.EchoTheme;
import io.elevenlabs.ui.echo.EchoThemeColors;
import io.elevenlabs.ui.echo.EchoThemeTypography;
import io.livekit.android.rpc.RpcError;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import q2.j7;
import r1.h;
import r1.j;
import r1.p2;
import r1.u0;
import r1.z1;
import rd.c1;
import t1.b0;
import t1.z;
import t2.u;
import tn.o;
import u2.l;
import u2.m;
import u2.q;
import u2.r;
import u2.r1;
import u2.s2;
import u2.z0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0004\u001aC\u0010\f\u001a\u00020\u000b2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\r\u001a\u0014\u0010\u000e\u001a\u00020\u000b*\u00020\u0007H\u0080@¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0013\u0010\u0010\u001a\u00020\u0003*\u00020\u0007H\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u000f\u0010\u0012\u001a\u00020\u000bH\u0003¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0013\u0010\u0014\u001a\u00020\u0003*\u00020\u0007H\u0007¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u000f\u0010\u0016\u001a\u00020\u000bH\u0001¢\u0006\u0004\b\u0016\u0010\u0013\"\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001b²\u0006\u000e\u0010\u001a\u001a\u00020\u00038\n@\nX\u008a\u008e\u0002"}, d2 = {"", "Lio/elevenlabs/readerapp/ui/screens/authenticated/assistant/ChatMessage;", "messages", "", "isAssistantTyping", "Li3/t;", "modifier", "Lt1/z;", "listState", "Lr1/z1;", "contentPadding", "Lsn/z;", "AgentChatList", "(Ljava/util/List;ZLi3/t;Lt1/z;Lr1/z1;Lu2/m;II)V", "scrollToBottom", "(Lt1/z;Lwn/c;)Ljava/lang/Object;", "isAtBottomNow", "(Lt1/z;)Z", "ChatStartedHeader", "(Lu2/m;I)V", "isAtBottom", "(Lt1/z;Lu2/m;I)Z", "Preview_AgentChatList", "", "SCROLL_TO_BOTTOM_THRESHOLD_PX", TokenNames.I, "followBottom", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class AgentChatListKt {
    private static final int SCROLL_TO_BOTTOM_THRESHOLD_PX = 200;

    /* JADX WARN: Removed duplicated region for block: B:118:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AgentChatList(List<ChatMessage> list, boolean z6, t tVar, z zVar, z1 z1Var, m mVar, int i10, int i11) {
        int i12;
        t tVar2;
        int i13;
        z zVar2;
        z1 z1Var2;
        boolean z10;
        q qVar;
        t tVar3;
        z zVar3;
        z1 z1Var3;
        r1 r10;
        int i14;
        z zVar4;
        z1 d10;
        Object L;
        u2.e eVar;
        int i15;
        boolean z11;
        Object L2;
        ChatMessage chatMessage;
        int i16;
        boolean z12;
        Object L3;
        boolean z13;
        Object L4;
        boolean z14;
        boolean z15;
        Object L5;
        String content;
        int i17;
        int i18;
        int i19;
        int i20;
        list.getClass();
        q qVar2 = (q) mVar;
        qVar2.Z(1546290787);
        if ((i10 & 6) == 0) {
            if (qVar2.h(list)) {
                i20 = 4;
            } else {
                i20 = 2;
            }
            i12 = i20 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar2.g(z6)) {
                i19 = 32;
            } else {
                i19 = 16;
            }
            i12 |= i19;
        }
        int i21 = i11 & 4;
        if (i21 != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            tVar2 = tVar;
            if (qVar2.f(tVar2)) {
                i13 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i13 = 128;
            }
            i12 |= i13;
            if ((i10 & 3072) != 0) {
                if ((i11 & 8) == 0) {
                    zVar2 = zVar;
                    if (qVar2.f(zVar2)) {
                        i18 = 2048;
                        i12 |= i18;
                    }
                } else {
                    zVar2 = zVar;
                }
                i18 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                i12 |= i18;
            } else {
                zVar2 = zVar;
            }
            if ((i10 & 24576) != 0) {
                if ((i11 & 16) == 0) {
                    z1Var2 = z1Var;
                    if (qVar2.f(z1Var2)) {
                        i17 = 16384;
                        i12 |= i17;
                    }
                } else {
                    z1Var2 = z1Var;
                }
                i17 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                i12 |= i17;
            } else {
                z1Var2 = z1Var;
            }
            if ((i12 & 9363) == 9362) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!qVar2.O(i12 & 1, z10)) {
                qVar2.T();
                if ((i10 & 1) != 0 && !qVar2.y()) {
                    qVar2.R();
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                    }
                    if ((i11 & 16) != 0) {
                        i12 &= -57345;
                    }
                } else {
                    if (i21 != 0) {
                        tVar2 = i3.q.f13017a;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        zVar2 = b0.a(0, qVar2, 3);
                    }
                    if ((i11 & 16) != 0) {
                        i14 = i12 & (-57345);
                        tVar3 = tVar2;
                        zVar4 = zVar2;
                        d10 = r1.d.d(EchoTheme.INSTANCE.getSpacings(qVar2, EchoTheme.$stable).getX4(), u.P, 2);
                        qVar2.q();
                        L = qVar2.L();
                        eVar = l.f33918a;
                        if (L == eVar) {
                            L = r.A(Boolean.TRUE);
                            qVar2.h0(L);
                        }
                        z0 z0Var = (z0) L;
                        i15 = (i14 & 7168) ^ 3072;
                        if ((i15 <= 2048 && qVar2.f(zVar4)) || (i14 & 3072) == 2048) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        L2 = qVar2.L();
                        if (!z11 || L2 == eVar) {
                            L2 = new AgentChatListKt$AgentChatList$1$1(zVar4, z0Var, null);
                            qVar2.h0(L2);
                        }
                        r.f((p) L2, zVar4, qVar2);
                        chatMessage = (ChatMessage) o.H0(list);
                        if (chatMessage == null && (content = chatMessage.getContent()) != null) {
                            i16 = content.length();
                        } else {
                            i16 = 0;
                        }
                        Integer valueOf = Integer.valueOf(list.size());
                        Integer valueOf2 = Integer.valueOf(i16);
                        Boolean valueOf3 = Boolean.valueOf(z6);
                        if ((i15 <= 2048 && qVar2.f(zVar4)) || (i14 & 3072) == 2048) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        L3 = qVar2.L();
                        if (!z12 || L3 == eVar) {
                            L3 = new AgentChatListKt$AgentChatList$2$1(zVar4, z0Var, null);
                            qVar2.h0(L3);
                        }
                        r.h(valueOf, valueOf2, valueOf3, (p) L3, qVar2);
                        if ((i15 <= 2048 && qVar2.f(zVar4)) || (i14 & 3072) == 2048) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        L4 = qVar2.L();
                        if (!z13 || L4 == eVar) {
                            L4 = new AgentChatListKt$AgentChatList$3$1(zVar4, z0Var, null);
                            qVar2.h0(L4);
                        }
                        r.f((p) L4, zVar4, qVar2);
                        t e10 = p2.e(tVar3, 1.0f);
                        u0 u0Var = j.f29228a;
                        h y10 = i.y(EchoTheme.INSTANCE, qVar2, EchoTheme.$stable);
                        boolean h10 = qVar2.h(list);
                        if ((i14 & 112) != 32) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        z15 = h10 | z14;
                        L5 = qVar2.L();
                        if (!z15 || L5 == eVar) {
                            L5 = new d(list, z6);
                            qVar2.h0(L5);
                        }
                        qVar = qVar2;
                        c1.c(e10, zVar4, d10, false, y10, null, null, false, null, (ho.l) L5, qVar, (i14 >> 6) & 1008, 488);
                        zVar3 = zVar4;
                        z1Var3 = d10;
                    }
                }
                i14 = i12;
                tVar3 = tVar2;
                zVar4 = zVar2;
                d10 = z1Var2;
                qVar2.q();
                L = qVar2.L();
                eVar = l.f33918a;
                if (L == eVar) {
                }
                z0 z0Var2 = (z0) L;
                i15 = (i14 & 7168) ^ 3072;
                if (i15 <= 2048) {
                }
                z11 = false;
                L2 = qVar2.L();
                if (!z11) {
                }
                L2 = new AgentChatListKt$AgentChatList$1$1(zVar4, z0Var2, null);
                qVar2.h0(L2);
                r.f((p) L2, zVar4, qVar2);
                chatMessage = (ChatMessage) o.H0(list);
                if (chatMessage == null) {
                }
                i16 = 0;
                Integer valueOf4 = Integer.valueOf(list.size());
                Integer valueOf22 = Integer.valueOf(i16);
                Boolean valueOf32 = Boolean.valueOf(z6);
                if (i15 <= 2048) {
                }
                z12 = false;
                L3 = qVar2.L();
                if (!z12) {
                }
                L3 = new AgentChatListKt$AgentChatList$2$1(zVar4, z0Var2, null);
                qVar2.h0(L3);
                r.h(valueOf4, valueOf22, valueOf32, (p) L3, qVar2);
                if (i15 <= 2048) {
                }
                z13 = false;
                L4 = qVar2.L();
                if (!z13) {
                }
                L4 = new AgentChatListKt$AgentChatList$3$1(zVar4, z0Var2, null);
                qVar2.h0(L4);
                r.f((p) L4, zVar4, qVar2);
                t e102 = p2.e(tVar3, 1.0f);
                u0 u0Var2 = j.f29228a;
                h y102 = i.y(EchoTheme.INSTANCE, qVar2, EchoTheme.$stable);
                boolean h102 = qVar2.h(list);
                if ((i14 & 112) != 32) {
                }
                z15 = h102 | z14;
                L5 = qVar2.L();
                if (!z15) {
                }
                L5 = new d(list, z6);
                qVar2.h0(L5);
                qVar = qVar2;
                c1.c(e102, zVar4, d10, false, y102, null, null, false, null, (ho.l) L5, qVar, (i14 >> 6) & 1008, 488);
                zVar3 = zVar4;
                z1Var3 = d10;
            } else {
                qVar = qVar2;
                qVar.R();
                tVar3 = tVar2;
                zVar3 = zVar2;
                z1Var3 = z1Var2;
            }
            r10 = qVar.r();
            if (r10 == null) {
                r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.account.components.j(list, z6, tVar3, zVar3, z1Var3, i10, i11);
                return;
            }
            return;
        }
        tVar2 = tVar;
        if ((i10 & 3072) != 0) {
        }
        if ((i10 & 24576) != 0) {
        }
        if ((i12 & 9363) == 9362) {
        }
        if (!qVar2.O(i12 & 1, z10)) {
        }
        r10 = qVar.r();
        if (r10 == null) {
        }
    }

    public static final boolean AgentChatList$lambda$1(z0 z0Var) {
        return ((Boolean) z0Var.getValue()).booleanValue();
    }

    public static final void AgentChatList$lambda$2(z0 z0Var, boolean z6) {
        z0Var.setValue(Boolean.valueOf(z6));
    }

    public static final sn.z AgentChatList$lambda$6$0(final List list, boolean z6, t1.t tVar) {
        tVar.getClass();
        ComposableSingletons$AgentChatListKt composableSingletons$AgentChatListKt = ComposableSingletons$AgentChatListKt.INSTANCE;
        t1.t.c(tVar, "chat_started_header", null, composableSingletons$AgentChatListKt.getLambda$1694287854$app_productionRelease(), 2);
        final io.elevenlabs.readerapp.ui.screens.authenticated.account.components.h hVar = new io.elevenlabs.readerapp.ui.screens.authenticated.account.components.h(15);
        ((t1.i) tVar).u(list.size(), new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.agent.components.AgentChatListKt$AgentChatList$lambda$6$0$$inlined$itemsIndexed$default$1
            public final Object invoke(int i10) {
                return p.this.invoke(Integer.valueOf(i10), list.get(i10));
            }

            @Override // ho.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).intValue());
            }
        }, new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.agent.components.AgentChatListKt$AgentChatList$lambda$6$0$$inlined$itemsIndexed$default$2
            @Override // ho.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).intValue());
            }

            public final Object invoke(int i10) {
                list.get(i10);
                return null;
            }
        }, new c3.j(new ho.r() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.agent.components.AgentChatListKt$AgentChatList$lambda$6$0$$inlined$itemsIndexed$default$3
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
                    qVar.X(-1756945576);
                    AgentMessageRowKt.AgentMessageRow(chatMessage, null, qVar, 0, 2);
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
        }, true, 2039820996));
        if (z6) {
            t1.t.c(tVar, "typing_indicator", null, composableSingletons$AgentChatListKt.m1266getLambda$2080694477$app_productionRelease(), 2);
        }
        return sn.z.f31622a;
    }

    public static final Object AgentChatList$lambda$6$0$0(int i10, ChatMessage chatMessage) {
        chatMessage.getClass();
        return i10 + ":" + chatMessage.getTimestamp() + ":" + chatMessage.isFromUser();
    }

    public static final sn.z AgentChatList$lambda$7(List list, boolean z6, t tVar, z zVar, z1 z1Var, int i10, int i11, m mVar, int i12) {
        AgentChatList(list, z6, tVar, zVar, z1Var, mVar, r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }

    public static final void ChatStartedHeader(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(2047396395);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            t e10 = p2.e(i3.q.f13017a, 1.0f);
            EchoTheme echoTheme = EchoTheme.INSTANCE;
            int i11 = EchoTheme.$stable;
            t G = r1.d.G(e10, u.P, echoTheme.getSpacings(qVar, i11).getX4(), 1);
            f1 d10 = r1.p.d(i3.d.f13001e, false);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            t c5 = i3.a.c(G, qVar);
            h4.h.f11920i.getClass();
            h4.f fVar = g.f11903b;
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            r.J(g.f11907f, d10, qVar);
            r.J(g.f11906e, l4, qVar);
            r.y(qVar, Integer.valueOf(hashCode), g.f11908g);
            r.F(g.f11909h, qVar);
            r.J(g.f11905d, c5, qVar);
            j7.d(kj.c.R(qVar, R.string.chat_support_started_label), null, echoTheme.getColors(qVar, i11).getText().getTertiary(qVar, EchoThemeColors.Text.$stable), 0L, null, 0L, new k(3), 0L, 0, false, 0, 0, null, echoTheme.getTypography(qVar, i11).getSmRegular400(qVar, EchoThemeTypography.$stable), qVar, 0, 0, 130042);
            qVar = qVar;
            qVar.p(true);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.account.explore.e(i10, 6);
        }
    }

    public static final sn.z ChatStartedHeader$lambda$1(int i10, m mVar, int i11) {
        ChatStartedHeader(mVar, r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_AgentChatList(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(348345753);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, ComposableSingletons$AgentChatListKt.INSTANCE.m1265getLambda$1607423489$app_productionRelease(), qVar, (EchoTheme.$stable << 6) | 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.account.explore.e(i10, 5);
        }
    }

    public static final sn.z Preview_AgentChatList$lambda$0(int i10, m mVar, int i11) {
        Preview_AgentChatList(mVar, r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final boolean isAtBottom(z zVar, m mVar, int i10) {
        boolean z6;
        zVar.getClass();
        if ((((i10 & 14) ^ 6) > 4 && ((q) mVar).f(zVar)) || (i10 & 6) == 4) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        Object L = qVar.L();
        if (z6 || L == l.f33918a) {
            L = r.s(new e(zVar, 2));
            qVar.h0(L);
        }
        return ((Boolean) ((s2) L).getValue()).booleanValue();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List, java.lang.Object] */
    public static final boolean isAtBottom$lambda$0$0(z zVar) {
        t1.j jVar = (t1.j) o.H0(((t1.q) zVar.h()).f31820k);
        if (jVar != null) {
            int i10 = ((t1.q) zVar.h()).f31823n - 1;
            int i11 = ((t1.q) zVar.h()).f31822m;
            t1.r rVar = (t1.r) jVar;
            int i12 = rVar.f31842p + rVar.q;
            if (rVar.f31827a != i10 || i12 > i11 + 200) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List, java.lang.Object] */
    public static final boolean isAtBottomNow(z zVar) {
        t1.q qVar = (t1.q) zVar.h();
        t1.j jVar = (t1.j) o.H0(qVar.f31820k);
        if (jVar != null) {
            int i10 = qVar.f31823n - 1;
            t1.r rVar = (t1.r) jVar;
            int i11 = rVar.f31842p + rVar.q;
            if (rVar.f31827a != i10 || i11 > qVar.f31822m + 200) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x006a, code lost:
    
        if (r10.f(r11, 0, r0) == r5) goto L79;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, java.lang.Iterable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object scrollToBottom(z zVar, wn.c<? super sn.z> cVar) {
        AgentChatListKt$scrollToBottom$1 agentChatListKt$scrollToBottom$1;
        int i10;
        int i11;
        int i12;
        Iterator it;
        Object obj;
        t1.j jVar;
        if (cVar instanceof AgentChatListKt$scrollToBottom$1) {
            agentChatListKt$scrollToBottom$1 = (AgentChatListKt$scrollToBottom$1) cVar;
            int i13 = agentChatListKt$scrollToBottom$1.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                agentChatListKt$scrollToBottom$1.label = i13 - Integer.MIN_VALUE;
                Object obj2 = agentChatListKt$scrollToBottom$1.result;
                i10 = agentChatListKt$scrollToBottom$1.label;
                sn.z zVar2 = sn.z.f31622a;
                xn.a aVar = xn.a.f37986a;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            sn.a.g(obj2);
                            return zVar2;
                        }
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i14 = agentChatListKt$scrollToBottom$1.I$1;
                    i11 = agentChatListKt$scrollToBottom$1.I$0;
                    z zVar3 = (z) agentChatListKt$scrollToBottom$1.L$0;
                    sn.a.g(obj2);
                    i12 = i14;
                    zVar = zVar3;
                } else {
                    sn.a.g(obj2);
                    i11 = ((t1.q) zVar.h()).f31823n;
                    if (i11 != 0) {
                        i12 = i11 - 1;
                        agentChatListKt$scrollToBottom$1.L$0 = zVar;
                        agentChatListKt$scrollToBottom$1.I$0 = i11;
                        agentChatListKt$scrollToBottom$1.I$1 = i12;
                        agentChatListKt$scrollToBottom$1.label = 1;
                    }
                    return zVar2;
                }
                t1.q qVar = (t1.q) zVar.h();
                it = qVar.f31820k.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = it.next();
                        if (((t1.r) ((t1.j) obj)).f31827a == i12) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                jVar = (t1.j) obj;
                if (jVar != null) {
                    t1.r rVar = (t1.r) jVar;
                    int i15 = (rVar.f31842p + rVar.q) - qVar.f31822m;
                    if (i15 > 0) {
                        agentChatListKt$scrollToBottom$1.L$0 = null;
                        agentChatListKt$scrollToBottom$1.L$1 = null;
                        agentChatListKt$scrollToBottom$1.L$2 = null;
                        agentChatListKt$scrollToBottom$1.I$0 = i11;
                        agentChatListKt$scrollToBottom$1.I$1 = i12;
                        agentChatListKt$scrollToBottom$1.I$2 = i15;
                        agentChatListKt$scrollToBottom$1.label = 2;
                        if (n1.g.i(zVar, i15, j1.e.r(u.P, u.P, 7, null), agentChatListKt$scrollToBottom$1) == aVar) {
                            return aVar;
                        }
                    }
                }
                return zVar2;
            }
        }
        agentChatListKt$scrollToBottom$1 = new AgentChatListKt$scrollToBottom$1(cVar);
        Object obj22 = agentChatListKt$scrollToBottom$1.result;
        i10 = agentChatListKt$scrollToBottom$1.label;
        sn.z zVar22 = sn.z.f31622a;
        xn.a aVar2 = xn.a.f37986a;
        if (i10 == 0) {
        }
        t1.q qVar2 = (t1.q) zVar.h();
        it = qVar2.f31820k.iterator();
        while (true) {
            if (!it.hasNext()) {
            }
        }
        jVar = (t1.j) obj;
        if (jVar != null) {
        }
        return zVar22;
    }
}
