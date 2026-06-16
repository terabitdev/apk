package io.elevenlabs.readerapp.ui.screens.authenticated.agent;

import c3.o;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.messaging.Constants;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.protobuf.c6;
import f4.f1;
import fr.d0;
import fr.g0;
import ho.p;
import i1.e2;
import i1.y0;
import i3.k;
import i3.t;
import io.elevenlabs.readerapp.R;
import io.elevenlabs.readerapp.ui.screens.authenticated.account.components.CustomerCenterSheetKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.agent.AskAgentContract;
import io.elevenlabs.readerapp.ui.screens.authenticated.agent.components.AgentChatComposerKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.agent.components.AgentChatListKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.agent.components.ScrollToBottomButtonKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.assistant.AssistantStatus;
import io.elevenlabs.readerapp.ui.screens.authenticated.assistant.ChatMessage;
import io.elevenlabs.ui.components.EchoButtonSize;
import io.elevenlabs.ui.components.EchoButtonVariant;
import io.elevenlabs.ui.components.FullWidthButtonKt;
import io.elevenlabs.ui.echo.EchoTheme;
import io.elevenlabs.ui.echo.EchoThemeColors;
import io.elevenlabs.ui.echo.EchoThemeTypography;
import io.elevenlabs.ui.echo.components.EchoBackButtonKt;
import io.livekit.android.rpc.RpcError;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.e0;
import l1.n;
import livekit.LivekitInternal$NodeStats;
import p3.h0;
import q2.d5;
import q2.j7;
import r1.c3;
import r1.d2;
import r1.i2;
import r1.k2;
import r1.m1;
import r1.p2;
import r1.u0;
import r1.w;
import r1.x;
import rd.c1;
import sn.z;
import t1.b0;
import t2.u;
import u2.l;
import u2.m;
import u2.q;
import u2.r;
import u2.r1;
import u2.s2;
import u2.z0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\n\u001a'\u0010\u0005\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001ac\u0010\u000f\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00072\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0003¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001d\u0010\u0011\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0003¢\u0006\u0004\b\u0011\u0010\u0012\u001aC\u0010\u0015\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00072\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0003¢\u0006\u0004\b\u0015\u0010\u0016\u001a1\u0010\u0018\u001a\u00020\u00012\b\u0010\u0017\u001a\u0004\u0018\u00010\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0003¢\u0006\u0004\b\u0018\u0010\u0019\u001a/\u0010\u001d\u001a\u00020\u00012\u0006\u0010\u001b\u001a\u00020\u001a2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0003¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u000f\u0010\u001f\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\u001f\u0010 \u001a\u000f\u0010!\u001a\u00020\u0001H\u0001¢\u0006\u0004\b!\u0010 \"\u0018\u0010\"\u001a\u00020\u001a*\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006$²\u0006\f\u0010\b\u001a\u00020\u00078\nX\u008a\u0084\u0002"}, d2 = {"Lkotlin/Function0;", "Lsn/z;", "onBack", "Lio/elevenlabs/readerapp/ui/screens/authenticated/agent/AskAgentViewModel;", "vm", "AskAgentScreen", "(Lho/a;Lio/elevenlabs/readerapp/ui/screens/authenticated/agent/AskAgentViewModel;Lu2/m;II)V", "Lio/elevenlabs/readerapp/ui/screens/authenticated/agent/AskAgentContract$State;", RemoteConfigConstants.ResponseFieldKey.STATE, "Lkotlin/Function1;", "", "onSend", "onEndChat", "onRetry", "onDismissCustomerCenter", "AskAgentScreenUi", "(Lio/elevenlabs/readerapp/ui/screens/authenticated/agent/AskAgentContract$State;Lho/a;Lho/l;Lho/a;Lho/a;Lho/a;Lu2/m;I)V", "AgentScreenHeader", "(Lho/a;Lu2/m;I)V", "Li3/t;", "modifier", "ConversationArea", "(Lio/elevenlabs/readerapp/ui/screens/authenticated/agent/AskAgentContract$State;Lho/l;Lho/a;Li3/t;Lu2/m;II)V", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "DisconnectedState", "(Ljava/lang/String;Lho/a;Li3/t;Lu2/m;II)V", "", "visible", "onClick", "ScrollToBottomFab", "(ZLho/a;Li3/t;Lu2/m;II)V", "Preview_AskAgentScreen_Connected", "(Lu2/m;I)V", "Preview_AskAgentScreen_Disconnected", "isUnrecoverable", "(Lio/elevenlabs/readerapp/ui/screens/authenticated/agent/AskAgentContract$State;)Z", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class AskAgentScreenKt {
    private static final void AgentScreenHeader(ho.a aVar, m mVar, int i10) {
        int i11;
        boolean z6;
        int i12;
        q qVar = (q) mVar;
        qVar.Z(930783398);
        if ((i10 & 6) == 0) {
            if (qVar.h(aVar)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i11 = i12 | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i11 & 1, z6)) {
            t e10 = p2.e(i3.q.f13017a, 1.0f);
            EchoTheme echoTheme = EchoTheme.INSTANCE;
            int i13 = EchoTheme.$stable;
            t F = r1.d.F(e10, echoTheme.getSpacings(qVar, i13).getX4(), echoTheme.getSpacings(qVar, i13).getX3());
            k kVar = i3.d.f13005z0;
            u0 u0Var = r1.j.f29228a;
            k2 a10 = i2.a(ib.i.m(echoTheme, qVar, i13), kVar, qVar, 48);
            int hashCode = Long.hashCode(qVar.T);
            o l4 = qVar.l();
            t c5 = i3.a.c(F, qVar);
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
            EchoBackButtonKt.EchoBackButton(aVar, null, EchoButtonVariant.Ghost, EchoButtonSize.Small, qVar, (i11 & 14) | 3456, 2);
            if (1.0f <= 0.0d) {
                s1.a.a("invalid weight; must be greater than zero");
            }
            j7.d(kj.c.R(qVar, R.string.chat_support_title), new m1(1.0f, true), echoTheme.getColors(qVar, i13).getText().getPrimary(qVar, EchoThemeColors.Text.$stable), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, echoTheme.getTypography(qVar, i13).getLgCompact500(qVar, EchoThemeTypography.$stable), qVar, 0, 0, 131064);
            qVar.p(true);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new hm.b(aVar, i10, 6);
        }
    }

    public static final z AgentScreenHeader$lambda$1(ho.a aVar, int i10, m mVar, int i11) {
        AgentScreenHeader(aVar, mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00b3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0108 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0120 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0137 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AskAgentScreen(ho.a aVar, AskAgentViewModel askAgentViewModel, m mVar, int i10, int i11) {
        int i12;
        boolean z6;
        q qVar;
        AskAgentViewModel askAgentViewModel2;
        q7.c cVar;
        q qVar2;
        final AskAgentViewModel askAgentViewModel3;
        boolean h10;
        Object L;
        boolean z10;
        Object L2;
        boolean h11;
        Object L3;
        boolean h12;
        Object L4;
        boolean h13;
        Object L5;
        boolean h14;
        Object L6;
        int i13;
        int i14;
        aVar.getClass();
        q qVar3 = (q) mVar;
        qVar3.Z(1449130084);
        if ((i10 & 6) == 0) {
            if (qVar3.h(aVar)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i12 = i10 | i14;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if ((i11 & 2) == 0 && qVar3.h(askAgentViewModel)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i12 |= i13;
        }
        boolean z11 = false;
        if ((i12 & 19) != 18) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar3.O(i12 & 1, z6)) {
            qVar3.T();
            if ((i10 & 1) != 0 && !qVar3.y()) {
                qVar3.R();
                if ((i11 & 2) != 0) {
                    i12 &= -113;
                    askAgentViewModel3 = askAgentViewModel;
                    qVar2 = qVar3;
                    qVar2.q();
                    z0 m10 = c1.m(askAgentViewModel3.getStateFlow(), qVar2, 0);
                    h10 = qVar2.h(askAgentViewModel3);
                    L = qVar2.L();
                    u2.e eVar = l.f33918a;
                    if (!h10) {
                    }
                    L = new AskAgentScreenKt$AskAgentScreen$1$1(askAgentViewModel3, null);
                    qVar2.h0(L);
                    z zVar = z.f31622a;
                    r.f((p) L, zVar, qVar2);
                    boolean h15 = qVar2.h(askAgentViewModel3);
                    if ((i12 & 14) == 4) {
                    }
                    z10 = h15 | z11;
                    L2 = qVar2.L();
                    if (!z10) {
                    }
                    L2 = new AskAgentScreenKt$AskAgentScreen$2$1(askAgentViewModel3, aVar, null);
                    qVar2.h0(L2);
                    r.f((p) L2, zVar, qVar2);
                    AskAgentContract.State AskAgentScreen$lambda$0 = AskAgentScreen$lambda$0(m10);
                    h11 = qVar2.h(askAgentViewModel3);
                    L3 = qVar2.L();
                    if (!h11) {
                    }
                    L3 = new h(askAgentViewModel3, 3);
                    qVar2.h0(L3);
                    ho.l lVar = (ho.l) L3;
                    h12 = qVar2.h(askAgentViewModel3);
                    L4 = qVar2.L();
                    if (!h12) {
                    }
                    final int i15 = 1;
                    L4 = new ho.a() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.agent.a
                        @Override // ho.a
                        public final Object invoke() {
                            z AskAgentScreen$lambda$6$0;
                            z AskAgentScreen$lambda$4$0;
                            z AskAgentScreen$lambda$5$0;
                            switch (i15) {
                                case 0:
                                    AskAgentScreen$lambda$6$0 = AskAgentScreenKt.AskAgentScreen$lambda$6$0(askAgentViewModel3);
                                    return AskAgentScreen$lambda$6$0;
                                case 1:
                                    AskAgentScreen$lambda$4$0 = AskAgentScreenKt.AskAgentScreen$lambda$4$0(askAgentViewModel3);
                                    return AskAgentScreen$lambda$4$0;
                                default:
                                    AskAgentScreen$lambda$5$0 = AskAgentScreenKt.AskAgentScreen$lambda$5$0(askAgentViewModel3);
                                    return AskAgentScreen$lambda$5$0;
                            }
                        }
                    };
                    qVar2.h0(L4);
                    ho.a aVar2 = (ho.a) L4;
                    h13 = qVar2.h(askAgentViewModel3);
                    L5 = qVar2.L();
                    if (!h13) {
                    }
                    final int i16 = 2;
                    L5 = new ho.a() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.agent.a
                        @Override // ho.a
                        public final Object invoke() {
                            z AskAgentScreen$lambda$6$0;
                            z AskAgentScreen$lambda$4$0;
                            z AskAgentScreen$lambda$5$0;
                            switch (i16) {
                                case 0:
                                    AskAgentScreen$lambda$6$0 = AskAgentScreenKt.AskAgentScreen$lambda$6$0(askAgentViewModel3);
                                    return AskAgentScreen$lambda$6$0;
                                case 1:
                                    AskAgentScreen$lambda$4$0 = AskAgentScreenKt.AskAgentScreen$lambda$4$0(askAgentViewModel3);
                                    return AskAgentScreen$lambda$4$0;
                                default:
                                    AskAgentScreen$lambda$5$0 = AskAgentScreenKt.AskAgentScreen$lambda$5$0(askAgentViewModel3);
                                    return AskAgentScreen$lambda$5$0;
                            }
                        }
                    };
                    qVar2.h0(L5);
                    ho.a aVar3 = (ho.a) L5;
                    h14 = qVar2.h(askAgentViewModel3);
                    L6 = qVar2.L();
                    if (!h14) {
                    }
                    final int i17 = 0;
                    L6 = new ho.a() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.agent.a
                        @Override // ho.a
                        public final Object invoke() {
                            z AskAgentScreen$lambda$6$0;
                            z AskAgentScreen$lambda$4$0;
                            z AskAgentScreen$lambda$5$0;
                            switch (i17) {
                                case 0:
                                    AskAgentScreen$lambda$6$0 = AskAgentScreenKt.AskAgentScreen$lambda$6$0(askAgentViewModel3);
                                    return AskAgentScreen$lambda$6$0;
                                case 1:
                                    AskAgentScreen$lambda$4$0 = AskAgentScreenKt.AskAgentScreen$lambda$4$0(askAgentViewModel3);
                                    return AskAgentScreen$lambda$4$0;
                                default:
                                    AskAgentScreen$lambda$5$0 = AskAgentScreenKt.AskAgentScreen$lambda$5$0(askAgentViewModel3);
                                    return AskAgentScreen$lambda$5$0;
                            }
                        }
                    };
                    qVar2.h0(L6);
                    q qVar4 = qVar2;
                    AskAgentScreenUi(AskAgentScreen$lambda$0, aVar, lVar, aVar2, aVar3, (ho.a) L6, qVar4, (i12 << 3) & 112);
                    qVar = qVar4;
                    askAgentViewModel2 = askAgentViewModel3;
                }
                qVar2 = qVar3;
                askAgentViewModel3 = askAgentViewModel;
                qVar2.q();
                z0 m102 = c1.m(askAgentViewModel3.getStateFlow(), qVar2, 0);
                h10 = qVar2.h(askAgentViewModel3);
                L = qVar2.L();
                u2.e eVar2 = l.f33918a;
                if (!h10) {
                }
                L = new AskAgentScreenKt$AskAgentScreen$1$1(askAgentViewModel3, null);
                qVar2.h0(L);
                z zVar2 = z.f31622a;
                r.f((p) L, zVar2, qVar2);
                boolean h152 = qVar2.h(askAgentViewModel3);
                if ((i12 & 14) == 4) {
                }
                z10 = h152 | z11;
                L2 = qVar2.L();
                if (!z10) {
                }
                L2 = new AskAgentScreenKt$AskAgentScreen$2$1(askAgentViewModel3, aVar, null);
                qVar2.h0(L2);
                r.f((p) L2, zVar2, qVar2);
                AskAgentContract.State AskAgentScreen$lambda$02 = AskAgentScreen$lambda$0(m102);
                h11 = qVar2.h(askAgentViewModel3);
                L3 = qVar2.L();
                if (!h11) {
                }
                L3 = new h(askAgentViewModel3, 3);
                qVar2.h0(L3);
                ho.l lVar2 = (ho.l) L3;
                h12 = qVar2.h(askAgentViewModel3);
                L4 = qVar2.L();
                if (!h12) {
                }
                final int i152 = 1;
                L4 = new ho.a() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.agent.a
                    @Override // ho.a
                    public final Object invoke() {
                        z AskAgentScreen$lambda$6$0;
                        z AskAgentScreen$lambda$4$0;
                        z AskAgentScreen$lambda$5$0;
                        switch (i152) {
                            case 0:
                                AskAgentScreen$lambda$6$0 = AskAgentScreenKt.AskAgentScreen$lambda$6$0(askAgentViewModel3);
                                return AskAgentScreen$lambda$6$0;
                            case 1:
                                AskAgentScreen$lambda$4$0 = AskAgentScreenKt.AskAgentScreen$lambda$4$0(askAgentViewModel3);
                                return AskAgentScreen$lambda$4$0;
                            default:
                                AskAgentScreen$lambda$5$0 = AskAgentScreenKt.AskAgentScreen$lambda$5$0(askAgentViewModel3);
                                return AskAgentScreen$lambda$5$0;
                        }
                    }
                };
                qVar2.h0(L4);
                ho.a aVar22 = (ho.a) L4;
                h13 = qVar2.h(askAgentViewModel3);
                L5 = qVar2.L();
                if (!h13) {
                }
                final int i162 = 2;
                L5 = new ho.a() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.agent.a
                    @Override // ho.a
                    public final Object invoke() {
                        z AskAgentScreen$lambda$6$0;
                        z AskAgentScreen$lambda$4$0;
                        z AskAgentScreen$lambda$5$0;
                        switch (i162) {
                            case 0:
                                AskAgentScreen$lambda$6$0 = AskAgentScreenKt.AskAgentScreen$lambda$6$0(askAgentViewModel3);
                                return AskAgentScreen$lambda$6$0;
                            case 1:
                                AskAgentScreen$lambda$4$0 = AskAgentScreenKt.AskAgentScreen$lambda$4$0(askAgentViewModel3);
                                return AskAgentScreen$lambda$4$0;
                            default:
                                AskAgentScreen$lambda$5$0 = AskAgentScreenKt.AskAgentScreen$lambda$5$0(askAgentViewModel3);
                                return AskAgentScreen$lambda$5$0;
                        }
                    }
                };
                qVar2.h0(L5);
                ho.a aVar32 = (ho.a) L5;
                h14 = qVar2.h(askAgentViewModel3);
                L6 = qVar2.L();
                if (!h14) {
                }
                final int i172 = 0;
                L6 = new ho.a() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.agent.a
                    @Override // ho.a
                    public final Object invoke() {
                        z AskAgentScreen$lambda$6$0;
                        z AskAgentScreen$lambda$4$0;
                        z AskAgentScreen$lambda$5$0;
                        switch (i172) {
                            case 0:
                                AskAgentScreen$lambda$6$0 = AskAgentScreenKt.AskAgentScreen$lambda$6$0(askAgentViewModel3);
                                return AskAgentScreen$lambda$6$0;
                            case 1:
                                AskAgentScreen$lambda$4$0 = AskAgentScreenKt.AskAgentScreen$lambda$4$0(askAgentViewModel3);
                                return AskAgentScreen$lambda$4$0;
                            default:
                                AskAgentScreen$lambda$5$0 = AskAgentScreenKt.AskAgentScreen$lambda$5$0(askAgentViewModel3);
                                return AskAgentScreen$lambda$5$0;
                        }
                    }
                };
                qVar2.h0(L6);
                q qVar42 = qVar2;
                AskAgentScreenUi(AskAgentScreen$lambda$02, aVar, lVar2, aVar22, aVar32, (ho.a) L6, qVar42, (i12 << 3) & 112);
                qVar = qVar42;
                askAgentViewModel2 = askAgentViewModel3;
            } else {
                if ((i11 & 2) != 0) {
                    androidx.lifecycle.r1 a10 = r7.a.a(qVar3);
                    if (a10 != null) {
                        pl.f o6 = tb.a.o(a10, qVar3);
                        if (a10 instanceof androidx.lifecycle.o) {
                            cVar = ((androidx.lifecycle.o) a10).getDefaultViewModelCreationExtras();
                        } else {
                            cVar = q7.a.f28123b;
                        }
                        qVar2 = qVar3;
                        i12 &= -113;
                        askAgentViewModel3 = (AskAgentViewModel) gg.b.j0(e0.f20562a.b(AskAgentViewModel.class), a10, null, o6, cVar, qVar2);
                        qVar2.q();
                        z0 m1022 = c1.m(askAgentViewModel3.getStateFlow(), qVar2, 0);
                        h10 = qVar2.h(askAgentViewModel3);
                        L = qVar2.L();
                        u2.e eVar22 = l.f33918a;
                        if (!h10 || L == eVar22) {
                            L = new AskAgentScreenKt$AskAgentScreen$1$1(askAgentViewModel3, null);
                            qVar2.h0(L);
                        }
                        z zVar22 = z.f31622a;
                        r.f((p) L, zVar22, qVar2);
                        boolean h1522 = qVar2.h(askAgentViewModel3);
                        if ((i12 & 14) == 4) {
                            z11 = true;
                        }
                        z10 = h1522 | z11;
                        L2 = qVar2.L();
                        if (!z10 || L2 == eVar22) {
                            L2 = new AskAgentScreenKt$AskAgentScreen$2$1(askAgentViewModel3, aVar, null);
                            qVar2.h0(L2);
                        }
                        r.f((p) L2, zVar22, qVar2);
                        AskAgentContract.State AskAgentScreen$lambda$022 = AskAgentScreen$lambda$0(m1022);
                        h11 = qVar2.h(askAgentViewModel3);
                        L3 = qVar2.L();
                        if (!h11 || L3 == eVar22) {
                            L3 = new h(askAgentViewModel3, 3);
                            qVar2.h0(L3);
                        }
                        ho.l lVar22 = (ho.l) L3;
                        h12 = qVar2.h(askAgentViewModel3);
                        L4 = qVar2.L();
                        if (!h12 || L4 == eVar22) {
                            final int i1522 = 1;
                            L4 = new ho.a() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.agent.a
                                @Override // ho.a
                                public final Object invoke() {
                                    z AskAgentScreen$lambda$6$0;
                                    z AskAgentScreen$lambda$4$0;
                                    z AskAgentScreen$lambda$5$0;
                                    switch (i1522) {
                                        case 0:
                                            AskAgentScreen$lambda$6$0 = AskAgentScreenKt.AskAgentScreen$lambda$6$0(askAgentViewModel3);
                                            return AskAgentScreen$lambda$6$0;
                                        case 1:
                                            AskAgentScreen$lambda$4$0 = AskAgentScreenKt.AskAgentScreen$lambda$4$0(askAgentViewModel3);
                                            return AskAgentScreen$lambda$4$0;
                                        default:
                                            AskAgentScreen$lambda$5$0 = AskAgentScreenKt.AskAgentScreen$lambda$5$0(askAgentViewModel3);
                                            return AskAgentScreen$lambda$5$0;
                                    }
                                }
                            };
                            qVar2.h0(L4);
                        }
                        ho.a aVar222 = (ho.a) L4;
                        h13 = qVar2.h(askAgentViewModel3);
                        L5 = qVar2.L();
                        if (!h13 || L5 == eVar22) {
                            final int i1622 = 2;
                            L5 = new ho.a() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.agent.a
                                @Override // ho.a
                                public final Object invoke() {
                                    z AskAgentScreen$lambda$6$0;
                                    z AskAgentScreen$lambda$4$0;
                                    z AskAgentScreen$lambda$5$0;
                                    switch (i1622) {
                                        case 0:
                                            AskAgentScreen$lambda$6$0 = AskAgentScreenKt.AskAgentScreen$lambda$6$0(askAgentViewModel3);
                                            return AskAgentScreen$lambda$6$0;
                                        case 1:
                                            AskAgentScreen$lambda$4$0 = AskAgentScreenKt.AskAgentScreen$lambda$4$0(askAgentViewModel3);
                                            return AskAgentScreen$lambda$4$0;
                                        default:
                                            AskAgentScreen$lambda$5$0 = AskAgentScreenKt.AskAgentScreen$lambda$5$0(askAgentViewModel3);
                                            return AskAgentScreen$lambda$5$0;
                                    }
                                }
                            };
                            qVar2.h0(L5);
                        }
                        ho.a aVar322 = (ho.a) L5;
                        h14 = qVar2.h(askAgentViewModel3);
                        L6 = qVar2.L();
                        if (!h14 || L6 == eVar22) {
                            final int i1722 = 0;
                            L6 = new ho.a() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.agent.a
                                @Override // ho.a
                                public final Object invoke() {
                                    z AskAgentScreen$lambda$6$0;
                                    z AskAgentScreen$lambda$4$0;
                                    z AskAgentScreen$lambda$5$0;
                                    switch (i1722) {
                                        case 0:
                                            AskAgentScreen$lambda$6$0 = AskAgentScreenKt.AskAgentScreen$lambda$6$0(askAgentViewModel3);
                                            return AskAgentScreen$lambda$6$0;
                                        case 1:
                                            AskAgentScreen$lambda$4$0 = AskAgentScreenKt.AskAgentScreen$lambda$4$0(askAgentViewModel3);
                                            return AskAgentScreen$lambda$4$0;
                                        default:
                                            AskAgentScreen$lambda$5$0 = AskAgentScreenKt.AskAgentScreen$lambda$5$0(askAgentViewModel3);
                                            return AskAgentScreen$lambda$5$0;
                                    }
                                }
                            };
                            qVar2.h0(L6);
                        }
                        q qVar422 = qVar2;
                        AskAgentScreenUi(AskAgentScreen$lambda$022, aVar, lVar22, aVar222, aVar322, (ho.a) L6, qVar422, (i12 << 3) & 112);
                        qVar = qVar422;
                        askAgentViewModel2 = askAgentViewModel3;
                    } else {
                        c6.x("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        return;
                    }
                }
                qVar2 = qVar3;
                askAgentViewModel3 = askAgentViewModel;
                qVar2.q();
                z0 m10222 = c1.m(askAgentViewModel3.getStateFlow(), qVar2, 0);
                h10 = qVar2.h(askAgentViewModel3);
                L = qVar2.L();
                u2.e eVar222 = l.f33918a;
                if (!h10) {
                }
                L = new AskAgentScreenKt$AskAgentScreen$1$1(askAgentViewModel3, null);
                qVar2.h0(L);
                z zVar222 = z.f31622a;
                r.f((p) L, zVar222, qVar2);
                boolean h15222 = qVar2.h(askAgentViewModel3);
                if ((i12 & 14) == 4) {
                }
                z10 = h15222 | z11;
                L2 = qVar2.L();
                if (!z10) {
                }
                L2 = new AskAgentScreenKt$AskAgentScreen$2$1(askAgentViewModel3, aVar, null);
                qVar2.h0(L2);
                r.f((p) L2, zVar222, qVar2);
                AskAgentContract.State AskAgentScreen$lambda$0222 = AskAgentScreen$lambda$0(m10222);
                h11 = qVar2.h(askAgentViewModel3);
                L3 = qVar2.L();
                if (!h11) {
                }
                L3 = new h(askAgentViewModel3, 3);
                qVar2.h0(L3);
                ho.l lVar222 = (ho.l) L3;
                h12 = qVar2.h(askAgentViewModel3);
                L4 = qVar2.L();
                if (!h12) {
                }
                final int i15222 = 1;
                L4 = new ho.a() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.agent.a
                    @Override // ho.a
                    public final Object invoke() {
                        z AskAgentScreen$lambda$6$0;
                        z AskAgentScreen$lambda$4$0;
                        z AskAgentScreen$lambda$5$0;
                        switch (i15222) {
                            case 0:
                                AskAgentScreen$lambda$6$0 = AskAgentScreenKt.AskAgentScreen$lambda$6$0(askAgentViewModel3);
                                return AskAgentScreen$lambda$6$0;
                            case 1:
                                AskAgentScreen$lambda$4$0 = AskAgentScreenKt.AskAgentScreen$lambda$4$0(askAgentViewModel3);
                                return AskAgentScreen$lambda$4$0;
                            default:
                                AskAgentScreen$lambda$5$0 = AskAgentScreenKt.AskAgentScreen$lambda$5$0(askAgentViewModel3);
                                return AskAgentScreen$lambda$5$0;
                        }
                    }
                };
                qVar2.h0(L4);
                ho.a aVar2222 = (ho.a) L4;
                h13 = qVar2.h(askAgentViewModel3);
                L5 = qVar2.L();
                if (!h13) {
                }
                final int i16222 = 2;
                L5 = new ho.a() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.agent.a
                    @Override // ho.a
                    public final Object invoke() {
                        z AskAgentScreen$lambda$6$0;
                        z AskAgentScreen$lambda$4$0;
                        z AskAgentScreen$lambda$5$0;
                        switch (i16222) {
                            case 0:
                                AskAgentScreen$lambda$6$0 = AskAgentScreenKt.AskAgentScreen$lambda$6$0(askAgentViewModel3);
                                return AskAgentScreen$lambda$6$0;
                            case 1:
                                AskAgentScreen$lambda$4$0 = AskAgentScreenKt.AskAgentScreen$lambda$4$0(askAgentViewModel3);
                                return AskAgentScreen$lambda$4$0;
                            default:
                                AskAgentScreen$lambda$5$0 = AskAgentScreenKt.AskAgentScreen$lambda$5$0(askAgentViewModel3);
                                return AskAgentScreen$lambda$5$0;
                        }
                    }
                };
                qVar2.h0(L5);
                ho.a aVar3222 = (ho.a) L5;
                h14 = qVar2.h(askAgentViewModel3);
                L6 = qVar2.L();
                if (!h14) {
                }
                final int i17222 = 0;
                L6 = new ho.a() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.agent.a
                    @Override // ho.a
                    public final Object invoke() {
                        z AskAgentScreen$lambda$6$0;
                        z AskAgentScreen$lambda$4$0;
                        z AskAgentScreen$lambda$5$0;
                        switch (i17222) {
                            case 0:
                                AskAgentScreen$lambda$6$0 = AskAgentScreenKt.AskAgentScreen$lambda$6$0(askAgentViewModel3);
                                return AskAgentScreen$lambda$6$0;
                            case 1:
                                AskAgentScreen$lambda$4$0 = AskAgentScreenKt.AskAgentScreen$lambda$4$0(askAgentViewModel3);
                                return AskAgentScreen$lambda$4$0;
                            default:
                                AskAgentScreen$lambda$5$0 = AskAgentScreenKt.AskAgentScreen$lambda$5$0(askAgentViewModel3);
                                return AskAgentScreen$lambda$5$0;
                        }
                    }
                };
                qVar2.h0(L6);
                q qVar4222 = qVar2;
                AskAgentScreenUi(AskAgentScreen$lambda$0222, aVar, lVar222, aVar2222, aVar3222, (ho.a) L6, qVar4222, (i12 << 3) & 112);
                qVar = qVar4222;
                askAgentViewModel2 = askAgentViewModel3;
            }
        } else {
            qVar = qVar3;
            qVar.R();
            askAgentViewModel2 = askAgentViewModel;
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.core.p(aVar, askAgentViewModel2, i10, i11, 10);
        }
    }

    private static final AskAgentContract.State AskAgentScreen$lambda$0(s2 s2Var) {
        return (AskAgentContract.State) s2Var.getValue();
    }

    public static final z AskAgentScreen$lambda$3$0(AskAgentViewModel askAgentViewModel, String str) {
        str.getClass();
        askAgentViewModel.onEvent(new AskAgentContract.Event.SendMessage(str));
        return z.f31622a;
    }

    public static final z AskAgentScreen$lambda$4$0(AskAgentViewModel askAgentViewModel) {
        askAgentViewModel.onEvent(AskAgentContract.Event.EndChat.INSTANCE);
        return z.f31622a;
    }

    public static final z AskAgentScreen$lambda$5$0(AskAgentViewModel askAgentViewModel) {
        askAgentViewModel.onEvent(AskAgentContract.Event.Retry.INSTANCE);
        return z.f31622a;
    }

    public static final z AskAgentScreen$lambda$6$0(AskAgentViewModel askAgentViewModel) {
        askAgentViewModel.onEvent(AskAgentContract.Event.DismissCustomerCenter.INSTANCE);
        return z.f31622a;
    }

    public static final z AskAgentScreen$lambda$7(ho.a aVar, AskAgentViewModel askAgentViewModel, int i10, int i11, m mVar, int i12) {
        AskAgentScreen(aVar, askAgentViewModel, mVar, r.M(i10 | 1), i11);
        return z.f31622a;
    }

    public static final void AskAgentScreenUi(AskAgentContract.State state, ho.a aVar, ho.l lVar, ho.a aVar2, ho.a aVar3, ho.a aVar4, m mVar, int i10) {
        int i11;
        boolean z6;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        q qVar = (q) mVar;
        qVar.Z(41934470);
        if ((i10 & 6) == 0) {
            if (qVar.h(state)) {
                i17 = 4;
            } else {
                i17 = 2;
            }
            i11 = i17 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.h(aVar)) {
                i16 = 32;
            } else {
                i16 = 16;
            }
            i11 |= i16;
        }
        if ((i10 & 384) == 0) {
            if (qVar.h(lVar)) {
                i15 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i15 = 128;
            }
            i11 |= i15;
        }
        if ((i10 & 3072) == 0) {
            if (qVar.h(aVar2)) {
                i14 = 2048;
            } else {
                i14 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i11 |= i14;
        }
        if ((i10 & 24576) == 0) {
            if (qVar.h(aVar3)) {
                i13 = 16384;
            } else {
                i13 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
            }
            i11 |= i13;
        }
        if ((196608 & i10) == 0) {
            if (qVar.h(aVar4)) {
                i12 = 131072;
            } else {
                i12 = 65536;
            }
            i11 |= i12;
        }
        if ((74899 & i11) != 74898) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i11 & 1, z6)) {
            i3.q qVar2 = i3.q.f13017a;
            t d10 = p2.d(qVar2, 1.0f);
            f1 d11 = r1.p.d(i3.d.f12997a, false);
            int hashCode = Long.hashCode(qVar.T);
            o l4 = qVar.l();
            t c5 = i3.a.c(d10, qVar);
            h4.h.f11920i.getClass();
            h4.f fVar = h4.g.f11903b;
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            h4.e eVar = h4.g.f11907f;
            r.J(eVar, d11, qVar);
            h4.e eVar2 = h4.g.f11906e;
            r.J(eVar2, l4, qVar);
            Integer valueOf = Integer.valueOf(hashCode);
            h4.e eVar3 = h4.g.f11908g;
            r.y(qVar, valueOf, eVar3);
            h4.d dVar = h4.g.f11909h;
            r.F(dVar, qVar);
            int i18 = i11;
            h4.e eVar4 = h4.g.f11905d;
            r.J(eVar4, c5, qVar);
            t d12 = p2.d(qVar2, 1.0f);
            EchoTheme echoTheme = EchoTheme.INSTANCE;
            int i19 = EchoTheme.$stable;
            t h10 = n.h(d12, echoTheme.getColors(qVar, i19).getBackground().getPrimary(qVar, EchoThemeColors.Background.$stable), h0.f26395b);
            WeakHashMap weakHashMap = c3.f29142x;
            t u6 = r1.d.u(r1.d.P(h10, u0.e(qVar).f29149g));
            x a10 = w.a(r1.j.f29230c, i3.d.B0, qVar, 0);
            int hashCode2 = Long.hashCode(qVar.T);
            o l7 = qVar.l();
            t c10 = i3.a.c(u6, qVar);
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            r.J(eVar, a10, qVar);
            r.J(eVar2, l7, qVar);
            defpackage.f.u(hashCode2, qVar, eVar3, qVar, dVar);
            r.J(eVar4, c10, qVar);
            int i20 = i18 >> 3;
            AgentScreenHeader(aVar, qVar, i20 & 14);
            d5.e(null, u.P, echoTheme.getColors(qVar, i19).getBorder().getPrimary(qVar, EchoThemeColors.Border.$stable), qVar, 0, 3);
            float f10 = Float.MAX_VALUE;
            if (isUnrecoverable(state)) {
                qVar.X(1485611601);
                String errorMessage = state.getErrorMessage();
                if (1.0f <= 0.0d) {
                    s1.a.a("invalid weight; must be greater than zero");
                }
                if (1.0f <= Float.MAX_VALUE) {
                    f10 = 1.0f;
                }
                DisconnectedState(errorMessage, aVar3, new m1(f10, true), qVar, (i18 >> 9) & 112, 0);
                qVar = qVar;
                qVar.p(false);
            } else {
                qVar.X(1485823734);
                if (1.0f <= 0.0d) {
                    s1.a.a("invalid weight; must be greater than zero");
                }
                if (1.0f <= Float.MAX_VALUE) {
                    f10 = 1.0f;
                }
                ConversationArea(state, lVar, aVar2, new m1(f10, true), qVar, (i18 & 14) | (i20 & 112) | (i20 & 896), 0);
                qVar.p(false);
            }
            qVar.p(true);
            if (state.getShowCustomerCenter()) {
                qVar.X(2140838118);
                CustomerCenterSheetKt.CustomerCenterSheet(aVar4, qVar, (i18 >> 15) & 14);
                qVar.p(false);
            } else {
                qVar.X(2140914998);
                qVar.p(false);
            }
            qVar.p(true);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new c3.e(state, aVar, lVar, aVar2, aVar3, aVar4, i10, 7);
        }
    }

    public static final z AskAgentScreenUi$lambda$1(AskAgentContract.State state, ho.a aVar, ho.l lVar, ho.a aVar2, ho.a aVar3, ho.a aVar4, int i10, m mVar, int i11) {
        AskAgentScreenUi(state, aVar, lVar, aVar2, aVar3, aVar4, mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void ConversationArea(AskAgentContract.State state, ho.l lVar, ho.a aVar, t tVar, m mVar, int i10, int i11) {
        int i12;
        t tVar2;
        int i13;
        boolean z6;
        t tVar3;
        r1 r10;
        t tVar4;
        boolean z10;
        boolean z11;
        boolean z12;
        int i14;
        int i15;
        int i16;
        q qVar = (q) mVar;
        qVar.Z(1700769667);
        if ((i10 & 6) == 0) {
            if (qVar.h(state)) {
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
            if (qVar.h(aVar)) {
                i14 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i14 = 128;
            }
            i12 |= i14;
        }
        int i17 = i11 & 8;
        if (i17 != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            tVar2 = tVar;
            if (qVar.f(tVar2)) {
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
                i3.q qVar2 = i3.q.f13017a;
                if (i17 != 0) {
                    tVar4 = qVar2;
                } else {
                    tVar4 = tVar2;
                }
                final t1.z a10 = b0.a(0, qVar, 3);
                Object L = qVar.L();
                Object obj = l.f33918a;
                if (L == obj) {
                    L = r.q(qVar);
                    qVar.h0(L);
                }
                final d0 d0Var = (d0) L;
                boolean isAtBottom = AgentChatListKt.isAtBottom(a10, qVar, 0);
                t e10 = p2.e(tVar4, 1.0f);
                x a11 = w.a(r1.j.f29230c, i3.d.B0, qVar, 0);
                int hashCode = Long.hashCode(qVar.T);
                o l4 = qVar.l();
                t c5 = i3.a.c(e10, qVar);
                h4.h.f11920i.getClass();
                h4.f fVar = h4.g.f11903b;
                qVar.b0();
                int i18 = i12;
                if (qVar.S) {
                    qVar.k(fVar);
                } else {
                    qVar.k0();
                }
                h4.e eVar = h4.g.f11907f;
                r.J(eVar, a11, qVar);
                h4.e eVar2 = h4.g.f11906e;
                r.J(eVar2, l4, qVar);
                Integer valueOf = Integer.valueOf(hashCode);
                h4.e eVar3 = h4.g.f11908g;
                r.y(qVar, valueOf, eVar3);
                h4.d dVar = h4.g.f11909h;
                r.F(dVar, qVar);
                h4.e eVar4 = h4.g.f11905d;
                r.J(eVar4, c5, qVar);
                if (1.0f <= 0.0d) {
                    s1.a.a("invalid weight; must be greater than zero");
                }
                m1 m1Var = new m1(1.0f, true);
                f1 d10 = r1.p.d(i3.d.f12997a, false);
                int hashCode2 = Long.hashCode(qVar.T);
                o l7 = qVar.l();
                t c10 = i3.a.c(m1Var, qVar);
                qVar.b0();
                t tVar5 = tVar4;
                if (qVar.S) {
                    qVar.k(fVar);
                } else {
                    qVar.k0();
                }
                r.J(eVar, d10, qVar);
                r.J(eVar2, l7, qVar);
                defpackage.f.u(hashCode2, qVar, eVar3, qVar, dVar);
                r.J(eVar4, c10, qVar);
                List<ChatMessage> messages = state.getMessages();
                boolean isAssistantTyping = state.isAssistantTyping();
                t d11 = p2.d(qVar2, 1.0f);
                EchoTheme echoTheme = EchoTheme.INSTANCE;
                int i19 = EchoTheme.$stable;
                float x42 = echoTheme.getSpacings(qVar, i19).getX4();
                float x43 = echoTheme.getSpacings(qVar, i19).getX4();
                AgentChatListKt.AgentChatList(messages, isAssistantTyping, d11, a10, new d2(x42, x43, x42, x43), qVar, 384, 0);
                if (!isAtBottom && !state.getMessages().isEmpty()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                boolean h10 = qVar.h(d0Var) | qVar.f(a10);
                Object L2 = qVar.L();
                if (h10 || L2 == obj) {
                    L2 = new ho.a() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.agent.d
                        @Override // ho.a
                        public final Object invoke() {
                            z ConversationArea$lambda$0$0$0$0;
                            ConversationArea$lambda$0$0$0$0 = AskAgentScreenKt.ConversationArea$lambda$0$0$0$0(d0.this, a10);
                            return ConversationArea$lambda$0$0$0$0;
                        }
                    };
                    qVar.h0(L2);
                }
                ScrollToBottomFab(z10, (ho.a) L2, r1.d.I(r1.t.f29349a.b(qVar2, i3.d.Z), u.P, u.P, u.P, echoTheme.getSpacings(qVar, i19).getX3(), 7), qVar, 0, 0);
                qVar = qVar;
                qVar.p(true);
                if (!state.isAssistantTyping() && !state.isStreamingAgentMessage()) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (state.getStatus() == AssistantStatus.CONNECTED) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                AgentChatComposerKt.AgentChatComposer(lVar, aVar, z11, r1.d.F(qVar2, echoTheme.getSpacings(qVar, i19).getX4(), echoTheme.getSpacings(qVar, i19).getX3()), z12, qVar, (i18 >> 3) & 126, 0);
                qVar.p(true);
                tVar3 = tVar5;
            } else {
                qVar.R();
                tVar3 = tVar2;
            }
            r10 = qVar.r();
            if (r10 == null) {
                r10.f34012d = new io.elevenlabs.readerapp.core.l((Object) state, lVar, aVar, (Object) tVar3, i10, i11, 7);
                return;
            }
            return;
        }
        tVar2 = tVar;
        if ((i12 & 1171) == 1170) {
        }
        if (!qVar.O(i12 & 1, z6)) {
        }
        r10 = qVar.r();
        if (r10 == null) {
        }
    }

    public static final z ConversationArea$lambda$0$0$0$0(d0 d0Var, t1.z zVar) {
        g0.D(d0Var, null, null, new AskAgentScreenKt$ConversationArea$1$1$1$1$1(zVar, null), 3);
        return z.f31622a;
    }

    public static final z ConversationArea$lambda$1(AskAgentContract.State state, ho.l lVar, ho.a aVar, t tVar, int i10, int i11, m mVar, int i12) {
        ConversationArea(state, lVar, aVar, tVar, mVar, r.M(i10 | 1), i11);
        return z.f31622a;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void DisconnectedState(String str, ho.a aVar, t tVar, m mVar, int i10, int i11) {
        int i12;
        t tVar2;
        int i13;
        boolean z6;
        t tVar3;
        r1 r10;
        t tVar4;
        String str2;
        int i14;
        int i15;
        q qVar = (q) mVar;
        qVar.Z(795355520);
        if ((i10 & 6) == 0) {
            if (qVar.f(str)) {
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
        int i16 = i11 & 4;
        if (i16 != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            tVar2 = tVar;
            if (qVar.f(tVar2)) {
                i13 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i13 = 128;
            }
            i12 |= i13;
            if ((i12 & 147) == 146) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (!qVar.O(i12 & 1, z6)) {
                i3.q qVar2 = i3.q.f13017a;
                if (i16 != 0) {
                    tVar4 = qVar2;
                } else {
                    tVar4 = tVar2;
                }
                t d10 = p2.d(tVar4, 1.0f);
                EchoTheme echoTheme = EchoTheme.INSTANCE;
                int i17 = EchoTheme.$stable;
                t E = r1.d.E(d10, echoTheme.getSpacings(qVar, i17).getX5());
                x a10 = w.a(r1.j.f29232e, i3.d.C0, qVar, 54);
                int hashCode = Long.hashCode(qVar.T);
                o l4 = qVar.l();
                t c5 = i3.a.c(E, qVar);
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
                t e10 = p2.e(qVar2, 1.0f);
                if (str == null) {
                    qVar.X(-545404675);
                    str2 = kj.c.R(qVar, R.string.chat_support_error_generic);
                    qVar.p(false);
                } else {
                    qVar.X(-545404954);
                    qVar.p(false);
                    str2 = str;
                }
                String str3 = str2;
                j7.d(str3, e10, echoTheme.getColors(qVar, i17).getText().getPrimary(qVar, EchoThemeColors.Text.$stable), 0L, null, 0L, new e5.k(3), 0L, 0, false, 0, 0, null, echoTheme.getTypography(qVar, i17).getBaseRegular400(qVar, EchoThemeTypography.$stable), qVar, 48, 0, 130040);
                qVar = qVar;
                ib.i.o(echoTheme, qVar, i17, qVar2, qVar);
                FullWidthButtonKt.EchoThemeFullWidthButton(kj.c.R(qVar, R.string.common_retry), aVar, null, null, null, null, false, false, false, qVar, i12 & 112, 508);
                qVar.p(true);
                tVar3 = tVar4;
            } else {
                qVar.R();
                tVar3 = tVar2;
            }
            r10 = qVar.r();
            if (r10 == null) {
                r10.f34012d = new im.a(i10, str, aVar, tVar3, i11, 1);
                return;
            }
            return;
        }
        tVar2 = tVar;
        if ((i12 & 147) == 146) {
        }
        if (!qVar.O(i12 & 1, z6)) {
        }
        r10 = qVar.r();
        if (r10 == null) {
        }
    }

    public static final z DisconnectedState$lambda$1(String str, ho.a aVar, t tVar, int i10, int i11, m mVar, int i12) {
        DisconnectedState(str, aVar, tVar, mVar, r.M(i10 | 1), i11);
        return z.f31622a;
    }

    public static final void Preview_AskAgentScreen_Connected(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(586876357);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, ComposableSingletons$AskAgentScreenKt.INSTANCE.getLambda$87571999$app_productionRelease(), qVar, (EchoTheme.$stable << 6) | 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.account.explore.e(i10, 1);
        }
    }

    public static final z Preview_AskAgentScreen_Connected$lambda$0(int i10, m mVar, int i11) {
        Preview_AskAgentScreen_Connected(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_AskAgentScreen_Disconnected(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(1623468923);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, ComposableSingletons$AskAgentScreenKt.INSTANCE.getLambda$319085793$app_productionRelease(), qVar, (EchoTheme.$stable << 6) | 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.account.explore.e(i10, 2);
        }
    }

    public static final z Preview_AskAgentScreen_Disconnected$lambda$0(int i10, m mVar, int i11) {
        Preview_AskAgentScreen_Disconnected(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void ScrollToBottomFab(boolean z6, final ho.a aVar, t tVar, m mVar, int i10, int i11) {
        int i12;
        t tVar2;
        int i13;
        boolean z10;
        t tVar3;
        r1 r10;
        t tVar4;
        int i14;
        int i15;
        q qVar = (q) mVar;
        qVar.Z(586858389);
        if ((i10 & 6) == 0) {
            if (qVar.g(z6)) {
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
        int i16 = i11 & 4;
        if (i16 != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            tVar2 = tVar;
            if (qVar.f(tVar2)) {
                i13 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i13 = 128;
            }
            i12 |= i13;
            if ((i12 & 147) == 146) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!qVar.O(i12 & 1, z10)) {
                if (i16 != 0) {
                    tVar4 = i3.q.f13017a;
                } else {
                    tVar4 = tVar2;
                }
                t tVar5 = tVar4;
                e2.c(z6, tVar5, y0.e(null, 3), y0.f(null, 3), null, c3.k.d(-531701139, true, new ho.q() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.agent.b
                    @Override // ho.q
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        z ScrollToBottomFab$lambda$0;
                        int intValue = ((Integer) obj3).intValue();
                        ScrollToBottomFab$lambda$0 = AskAgentScreenKt.ScrollToBottomFab$lambda$0(ho.a.this, (i1.g0) obj, (m) obj2, intValue);
                        return ScrollToBottomFab$lambda$0;
                    }
                }, qVar), qVar, (i12 & 14) | 200064 | ((i12 >> 3) & 112), 16);
                tVar3 = tVar5;
            } else {
                qVar.R();
                tVar3 = tVar2;
            }
            r10 = qVar.r();
            if (r10 == null) {
                r10.f34012d = new c(z6, aVar, tVar3, i10, i11, 0);
                return;
            }
            return;
        }
        tVar2 = tVar;
        if ((i12 & 147) == 146) {
        }
        if (!qVar.O(i12 & 1, z10)) {
        }
        r10 = qVar.r();
        if (r10 == null) {
        }
    }

    public static final z ScrollToBottomFab$lambda$0(ho.a aVar, i1.g0 g0Var, m mVar, int i10) {
        g0Var.getClass();
        ScrollToBottomButtonKt.ScrollToBottomButton(aVar, null, mVar, 0, 2);
        return z.f31622a;
    }

    public static final z ScrollToBottomFab$lambda$1(boolean z6, ho.a aVar, t tVar, int i10, int i11, m mVar, int i12) {
        ScrollToBottomFab(z6, aVar, tVar, mVar, r.M(i10 | 1), i11);
        return z.f31622a;
    }

    public static final /* synthetic */ void access$AskAgentScreenUi(AskAgentContract.State state, ho.a aVar, ho.l lVar, ho.a aVar2, ho.a aVar3, ho.a aVar4, m mVar, int i10) {
        AskAgentScreenUi(state, aVar, lVar, aVar2, aVar3, aVar4, mVar, i10);
    }

    private static final boolean isUnrecoverable(AskAgentContract.State state) {
        if (state.getStatus() == AssistantStatus.DISCONNECTED && state.getMessages().isEmpty()) {
            return true;
        }
        return false;
    }
}
