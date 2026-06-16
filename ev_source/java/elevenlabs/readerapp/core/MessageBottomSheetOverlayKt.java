package io.elevenlabs.readerapp.core;

import a2.k3;
import com.google.firebase.analytics.FirebaseAnalytics;
import i3.t;
import io.elevenlabs.domain.model.ButtonData;
import io.elevenlabs.domain.model.Message;
import io.elevenlabs.readerapp.R;
import io.elevenlabs.readerapp.core.router.RouterState;
import io.elevenlabs.readerapp.core.router.RouterViewModel;
import io.elevenlabs.readerapp.ui.previews.MessagesFactoryKt;
import io.elevenlabs.ui.components.FullWidthButtonKt;
import io.elevenlabs.ui.components.FullWidthButtonVariant;
import io.elevenlabs.ui.components.MarkdownTextKt;
import io.elevenlabs.ui.components.scaffolds.BottomSheetControl;
import io.elevenlabs.ui.components.scaffolds.BottomSheetScaffoldKt;
import io.elevenlabs.ui.extensions.ComposeExtensionsKt;
import io.elevenlabs.ui.theme.ElevenLabsTheme;
import io.livekit.android.rpc.RpcError;
import ir.z1;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import q2.j7;
import r1.p2;
import r1.w;
import r1.x;
import r1.y;
import sn.z;
import t2.u;
import u2.q;
import u2.r;
import u2.r1;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a9\u0010\b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006H\u0007¢\u0006\u0004\b\b\u0010\t\u001a=\u0010\r\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006H\u0007¢\u0006\u0004\b\r\u0010\u000e\u001a\u000f\u0010\u000f\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lio/elevenlabs/readerapp/core/router/RouterViewModel;", "routerViewModel", "Lkotlin/Function1;", "", "Lsn/z;", "onNavigateToDeeplink", "Lkotlin/Function0;", FirebaseAnalytics.Param.CONTENT, "MessageBottomSheetOverlay", "(Lio/elevenlabs/readerapp/core/router/RouterViewModel;Lho/l;Lho/p;Lu2/m;I)V", "Lio/elevenlabs/domain/model/Message;", "message", "onDismiss", "MessageBottomSheetUI", "(Lio/elevenlabs/domain/model/Message;Lho/l;Lho/a;Lu2/m;II)V", "Preview_MessageBottomSheetUI_full", "(Lu2/m;I)V", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class MessageBottomSheetOverlayKt {
    public static final void MessageBottomSheetOverlay(RouterViewModel routerViewModel, final ho.l lVar, ho.p pVar, u2.m mVar, int i10) {
        int i11;
        boolean z6;
        int i12;
        int i13;
        int i14;
        routerViewModel.getClass();
        lVar.getClass();
        pVar.getClass();
        q qVar = (q) mVar;
        qVar.Z(66777147);
        if ((i10 & 6) == 0) {
            if (qVar.h(routerViewModel)) {
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
            if (qVar.h(pVar)) {
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
            pVar.invoke(qVar, Integer.valueOf((i11 >> 6) & 14));
            z1 stateFlow = routerViewModel.getStateFlow();
            Object L = qVar.L();
            u2.e eVar = u2.l.f33918a;
            if (L == eVar) {
                L = new n(1);
                qVar.h0(L);
            }
            final Message message = (Message) ComposeExtensionsKt.selectAsState(stateFlow, (ho.l) L, qVar, 48).getValue();
            boolean h10 = qVar.h(routerViewModel);
            Object L2 = qVar.L();
            if (h10 || L2 == eVar) {
                L2 = new MessageBottomSheetOverlayKt$MessageBottomSheetOverlay$1$1(routerViewModel, null);
                qVar.h0(L2);
            }
            r.f((ho.p) L2, message, qVar);
            if (message != null) {
                qVar.X(788498681);
                boolean h11 = qVar.h(routerViewModel);
                Object L3 = qVar.L();
                if (h11 || L3 == eVar) {
                    L3 = new d(routerViewModel, 0);
                    qVar.h0(L3);
                }
                BottomSheetScaffoldKt.m1898BottomSheetScaffoldjb40ds(false, false, 0L, u.P, (ho.a) L3, "", (ho.r) c3.k.d(-599692920, true, new ho.r() { // from class: io.elevenlabs.readerapp.core.e
                    @Override // ho.r
                    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                        z MessageBottomSheetOverlay$lambda$3;
                        int intValue = ((Integer) obj4).intValue();
                        MessageBottomSheetOverlay$lambda$3 = MessageBottomSheetOverlayKt.MessageBottomSheetOverlay$lambda$3(Message.this, lVar, (y) obj, (BottomSheetControl) obj2, (u2.m) obj3, intValue);
                        return MessageBottomSheetOverlay$lambda$3;
                    }
                }, qVar), (u2.m) qVar, 1769472, 15);
                qVar.p(false);
            } else {
                qVar.X(788819655);
                qVar.p(false);
            }
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new k3(i10, 7, lVar, (Object) routerViewModel, (Object) pVar);
        }
    }

    public static final Message MessageBottomSheetOverlay$lambda$0$0(RouterState routerState) {
        routerState.getClass();
        return routerState.getMessageToDisplay();
    }

    public static final z MessageBottomSheetOverlay$lambda$2$0(RouterViewModel routerViewModel) {
        routerViewModel.closeMessage();
        return z.f31622a;
    }

    public static final z MessageBottomSheetOverlay$lambda$3(Message message, ho.l lVar, y yVar, BottomSheetControl bottomSheetControl, u2.m mVar, int i10) {
        yVar.getClass();
        bottomSheetControl.getClass();
        q qVar = (q) mVar;
        boolean h10 = qVar.h(bottomSheetControl);
        Object L = qVar.L();
        if (h10 || L == u2.l.f33918a) {
            L = new c(bottomSheetControl, 0);
            qVar.h0(L);
        }
        MessageBottomSheetUI(message, lVar, (ho.a) L, qVar, 0, 0);
        return z.f31622a;
    }

    public static final z MessageBottomSheetOverlay$lambda$3$0$0(BottomSheetControl bottomSheetControl) {
        bottomSheetControl.close();
        return z.f31622a;
    }

    public static final z MessageBottomSheetOverlay$lambda$4(RouterViewModel routerViewModel, ho.l lVar, ho.p pVar, int i10, u2.m mVar, int i11) {
        MessageBottomSheetOverlay(routerViewModel, lVar, pVar, mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void MessageBottomSheetUI(Message message, ho.l lVar, ho.a aVar, u2.m mVar, int i10, int i11) {
        int i12;
        ho.l lVar2;
        int i13;
        int i14;
        ho.a aVar2;
        int i15;
        boolean z6;
        ho.l lVar3;
        ho.a aVar3;
        r1 r10;
        ho.l lVar4;
        ho.a aVar4;
        boolean z10;
        boolean z11;
        boolean z12;
        int i16;
        message.getClass();
        q qVar = (q) mVar;
        qVar.Z(819320334);
        if ((i10 & 6) == 0) {
            if (qVar.h(message)) {
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
            lVar2 = lVar;
            if (qVar.h(lVar2)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i12 |= i13;
            i14 = i11 & 4;
            if (i14 == 0) {
                i12 |= 384;
            } else if ((i10 & 384) == 0) {
                aVar2 = aVar;
                if (qVar.h(aVar2)) {
                    i15 = RpcError.MAX_MESSAGE_BYTES;
                } else {
                    i15 = 128;
                }
                i12 |= i15;
                if ((i12 & 147) != 146) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (qVar.O(i12 & 1, z6)) {
                    u2.e eVar = u2.l.f33918a;
                    if (i17 != 0) {
                        Object L = qVar.L();
                        if (L == eVar) {
                            L = new n(2);
                            qVar.h0(L);
                        }
                        lVar4 = (ho.l) L;
                    } else {
                        lVar4 = lVar2;
                    }
                    if (i14 != 0) {
                        Object L2 = qVar.L();
                        if (L2 == eVar) {
                            L2 = new f(2);
                            qVar.h0(L2);
                        }
                        aVar4 = (ho.a) L2;
                    } else {
                        aVar4 = aVar2;
                    }
                    u3.c M = kd.a.M(R.drawable.elevenreader_icon, qVar, 0);
                    int i18 = (u3.c.$stable << 3) | 6;
                    i3.q qVar2 = i3.q.f13017a;
                    t backgroundStreched = ComposeExtensionsKt.backgroundStreched(qVar2, M, qVar, i18);
                    ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
                    int i19 = ElevenLabsTheme.$stable;
                    t f10 = ib.i.f(elevenLabsTheme, qVar, i19, backgroundStreched);
                    x a10 = w.a(r1.j.f29230c, i3.d.C0, qVar, 48);
                    int hashCode = Long.hashCode(qVar.T);
                    c3.o l4 = qVar.l();
                    t c5 = i3.a.c(f10, qVar);
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
                    ib.i.C(elevenLabsTheme, qVar, i19, qVar2, qVar);
                    aVar3 = aVar4;
                    ho.l lVar5 = lVar4;
                    j7.d(message.getTitle(), null, defpackage.f.b(elevenLabsTheme, qVar, i19), 0L, null, 0L, new e5.k(3), 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar, i19).getTitleXLarge700Eleven(), qVar, 0, 0, 130042);
                    q qVar3 = qVar;
                    r1.d.g(p2.f(qVar2, elevenLabsTheme.getSpacings(qVar3, i19).m2351getX10D9Ej5fM()), qVar3);
                    String subtitle = message.getSubtitle();
                    if (subtitle == null || wq.n.m0(subtitle)) {
                        z10 = false;
                        qVar3.X(-598449526);
                        qVar3.p(false);
                    } else {
                        qVar3.X(-598738787);
                        j7.d(subtitle, null, defpackage.f.b(elevenLabsTheme, qVar3, i19), 0L, null, 0L, new e5.k(3), 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar3, i19).getTitleMedium700(), qVar3, 0, 0, 130042);
                        qVar3 = qVar3;
                        ib.i.A(elevenLabsTheme, qVar3, i19, qVar2, qVar3);
                        z10 = false;
                        qVar3.p(false);
                    }
                    q qVar4 = qVar3;
                    MarkdownTextKt.m1841MarkdownText6lElgYI(message.getTextMarkdown(), null, ib.i.w(elevenLabsTheme, qVar3, i19), 3, elevenLabsTheme.getTypo(qVar3, i19).getBodySmall500(), null, null, null, 0, qVar4, 0, 482);
                    qVar = qVar4;
                    ButtonData button = message.getButton();
                    if (button != null) {
                        qVar.X(-598144889);
                        String deeplink = button.getDeeplink();
                        r1.d.g(p2.f(qVar2, elevenLabsTheme.getSpacings(qVar, i19).m2354getX25D9Ej5fM()), qVar);
                        String text = button.getText();
                        t e10 = p2.e(qVar2, 1.0f);
                        FullWidthButtonVariant fullWidthButtonVariant = FullWidthButtonVariant.Primary;
                        boolean f11 = qVar.f(deeplink);
                        if ((i12 & 112) == 32) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        boolean z13 = f11 | z11;
                        if ((i12 & 896) == 256) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        boolean z14 = z13 | z12;
                        Object L3 = qVar.L();
                        if (!z14 && L3 != eVar) {
                            lVar3 = lVar5;
                        } else {
                            lVar3 = lVar5;
                            L3 = new c3.b(deeplink, lVar3, aVar3, 3);
                            qVar.h0(L3);
                        }
                        FullWidthButtonKt.FullWidthButton(text, (ho.a) L3, e10, null, fullWidthButtonVariant, null, false, false, false, qVar, 24960, 488);
                        qVar.p(false);
                    } else {
                        lVar3 = lVar5;
                        qVar.X(-597588470);
                        qVar.p(false);
                    }
                    qVar.p(true);
                } else {
                    qVar.R();
                    lVar3 = lVar2;
                    aVar3 = aVar2;
                }
                r10 = qVar.r();
                if (r10 != null) {
                    r10.f34012d = new fm.f(message, lVar3, aVar3, i10, i11, 5);
                    return;
                }
                return;
            }
            aVar2 = aVar;
            if ((i12 & 147) != 146) {
            }
            if (qVar.O(i12 & 1, z6)) {
            }
            r10 = qVar.r();
            if (r10 != null) {
            }
        }
        lVar2 = lVar;
        i14 = i11 & 4;
        if (i14 == 0) {
        }
        aVar2 = aVar;
        if ((i12 & 147) != 146) {
        }
        if (qVar.O(i12 & 1, z6)) {
        }
        r10 = qVar.r();
        if (r10 != null) {
        }
    }

    public static final z MessageBottomSheetUI$lambda$0$0(String str) {
        str.getClass();
        return z.f31622a;
    }

    public static final z MessageBottomSheetUI$lambda$2$0$0(String str, ho.l lVar, ho.a aVar) {
        if (str != null) {
            lVar.invoke(str);
            aVar.invoke();
        } else {
            aVar.invoke();
        }
        return z.f31622a;
    }

    public static final z MessageBottomSheetUI$lambda$3(Message message, ho.l lVar, ho.a aVar, int i10, int i11, u2.m mVar, int i12) {
        MessageBottomSheetUI(message, lVar, aVar, mVar, r.M(i10 | 1), i11);
        return z.f31622a;
    }

    public static final void Preview_MessageBottomSheetUI_full(u2.m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(-2079395929);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            MessageBottomSheetUI(MessagesFactoryKt.stubMessage(), null, null, qVar, 0, 6);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.highlighter.y(i10, 16);
        }
    }

    public static final z Preview_MessageBottomSheetUI_full$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_MessageBottomSheetUI_full(mVar, r.M(i10 | 1));
        return z.f31622a;
    }
}
