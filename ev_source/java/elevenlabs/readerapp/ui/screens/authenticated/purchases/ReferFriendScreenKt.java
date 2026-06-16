package io.elevenlabs.readerapp.ui.screens.authenticated.purchases;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.protobuf.c6;
import f4.f1;
import io.elevenlabs.readerapp.R;
import io.elevenlabs.readerapp.core.extensions.ComposeExtensionsKt;
import io.elevenlabs.ui.components.CloseButtonKt;
import io.elevenlabs.ui.components.FullWidthButtonKt;
import io.elevenlabs.ui.components.FullWidthButtonSize;
import io.elevenlabs.ui.components.FullWidthButtonVariant;
import io.elevenlabs.ui.components.headers.HeaderKt;
import io.elevenlabs.ui.theme.ElevenLabsTheme;
import io.livekit.android.rpc.RpcError;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.e0;
import livekit.LivekitInternal$NodeStats;
import q2.j7;
import q2.k5;
import r1.l2;
import r1.m1;
import r1.p2;
import r1.z1;
import u2.r1;
import u2.s2;
import u2.z0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a'\u0010\u0005\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001aI\u0010\u000b\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00072 \b\u0002\u0010\n\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\t\u0012\u0004\u0012\u00020\u00010\t2\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a\u000f\u0010\r\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\r\u0010\u000e\u001a\u000f\u0010\u000f\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u000f\u0010\u000e¨\u0006\u0010²\u0006\f\u0010\b\u001a\u00020\u00078\nX\u008a\u0084\u0002"}, d2 = {"Lkotlin/Function0;", "Lsn/z;", "onGoBack", "Lio/elevenlabs/readerapp/ui/screens/authenticated/purchases/ReferFriendViewModel;", "vm", "ReferFriendScreen", "(Lho/a;Lio/elevenlabs/readerapp/ui/screens/authenticated/purchases/ReferFriendViewModel;Lu2/m;II)V", "Lio/elevenlabs/readerapp/ui/screens/authenticated/purchases/ReferFriendState;", RemoteConfigConstants.ResponseFieldKey.STATE, "Lkotlin/Function1;", "action", "ReferFriendScreenUI", "(Lio/elevenlabs/readerapp/ui/screens/authenticated/purchases/ReferFriendState;Lho/l;Lho/a;Lu2/m;II)V", "Preview_ReferFriendScreen_Idle", "(Lu2/m;I)V", "Preview_ReferFriendScreen_Loading", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ReferFriendScreenKt {
    public static final void Preview_ReferFriendScreen_Idle(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-1957075859);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            ReferFriendScreenUI(new ReferFriendState(false, null, 3, null), null, null, qVar, 0, 6);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.pronunciations.h(i10, 18);
        }
    }

    public static final sn.z Preview_ReferFriendScreen_Idle$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_ReferFriendScreen_Idle(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_ReferFriendScreen_Loading(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(1288534009);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            ReferFriendScreenUI(new ReferFriendState(true, null, 2, null), null, null, qVar, 0, 6);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.pronunciations.h(i10, 19);
        }
    }

    public static final sn.z Preview_ReferFriendScreen_Loading$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_ReferFriendScreen_Loading(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void ReferFriendScreen(ho.a aVar, ReferFriendViewModel referFriendViewModel, u2.m mVar, int i10, int i11) {
        int i12;
        boolean z6;
        ho.a aVar2;
        u2.q qVar;
        u2.q qVar2;
        q7.c cVar;
        boolean h10;
        Object L;
        boolean h11;
        Object L2;
        int i13;
        int i14;
        aVar.getClass();
        u2.q qVar3 = (u2.q) mVar;
        qVar3.Z(1995014713);
        if ((i10 & 6) == 0) {
            if (qVar3.h(aVar)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i12 = i14 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if ((i11 & 2) == 0 && qVar3.h(referFriendViewModel)) {
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
        if (qVar3.O(i12 & 1, z6)) {
            qVar3.T();
            if ((i10 & 1) != 0 && !qVar3.y()) {
                qVar3.R();
                if ((i11 & 2) != 0) {
                    i12 &= -113;
                }
            } else if ((i11 & 2) != 0) {
                androidx.lifecycle.r1 a10 = r7.a.a(qVar3);
                if (a10 != null) {
                    qVar2 = qVar3;
                    pl.f o6 = tb.a.o(a10, qVar2);
                    if (a10 instanceof androidx.lifecycle.o) {
                        cVar = ((androidx.lifecycle.o) a10).getDefaultViewModelCreationExtras();
                    } else {
                        cVar = q7.a.f28123b;
                    }
                    referFriendViewModel = (ReferFriendViewModel) gg.b.j0(e0.f20562a.b(ReferFriendViewModel.class), a10, null, o6, cVar, qVar2);
                    i12 &= -113;
                    qVar2.q();
                    z0 o10 = u2.r.o(referFriendViewModel.getStateFlow(), qVar2, 0);
                    String link = ReferFriendScreen$lambda$0(o10).getLink();
                    h10 = qVar2.h(referFriendViewModel);
                    L = qVar2.L();
                    u2.e eVar = u2.l.f33918a;
                    if (!h10 || L == eVar) {
                        L = new u(referFriendViewModel, 0);
                        qVar2.h0(L);
                    }
                    ComposeExtensionsKt.ShareLinkHandler(link, (ho.a) L, qVar2, 0);
                    ReferFriendState ReferFriendScreen$lambda$0 = ReferFriendScreen$lambda$0(o10);
                    h11 = qVar2.h(referFriendViewModel);
                    L2 = qVar2.L();
                    if (!h11 || L2 == eVar) {
                        L2 = new v(referFriendViewModel, 0);
                        qVar2.h0(L2);
                    }
                    u2.q qVar4 = qVar2;
                    aVar2 = aVar;
                    ReferFriendScreenUI(ReferFriendScreen$lambda$0, (ho.l) L2, aVar2, qVar4, (i12 << 6) & 896, 0);
                    qVar = qVar4;
                } else {
                    c6.x("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
            }
            qVar2 = qVar3;
            qVar2.q();
            z0 o102 = u2.r.o(referFriendViewModel.getStateFlow(), qVar2, 0);
            String link2 = ReferFriendScreen$lambda$0(o102).getLink();
            h10 = qVar2.h(referFriendViewModel);
            L = qVar2.L();
            u2.e eVar2 = u2.l.f33918a;
            if (!h10) {
            }
            L = new u(referFriendViewModel, 0);
            qVar2.h0(L);
            ComposeExtensionsKt.ShareLinkHandler(link2, (ho.a) L, qVar2, 0);
            ReferFriendState ReferFriendScreen$lambda$02 = ReferFriendScreen$lambda$0(o102);
            h11 = qVar2.h(referFriendViewModel);
            L2 = qVar2.L();
            if (!h11) {
            }
            L2 = new v(referFriendViewModel, 0);
            qVar2.h0(L2);
            u2.q qVar42 = qVar2;
            aVar2 = aVar;
            ReferFriendScreenUI(ReferFriendScreen$lambda$02, (ho.l) L2, aVar2, qVar42, (i12 << 6) & 896, 0);
            qVar = qVar42;
        } else {
            aVar2 = aVar;
            qVar = qVar3;
            qVar.R();
        }
        ReferFriendViewModel referFriendViewModel2 = referFriendViewModel;
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.core.p(aVar2, referFriendViewModel2, i10, i11, 18);
        }
    }

    private static final ReferFriendState ReferFriendScreen$lambda$0(s2 s2Var) {
        return (ReferFriendState) s2Var.getValue();
    }

    public static final sn.z ReferFriendScreen$lambda$1$0(ReferFriendViewModel referFriendViewModel) {
        referFriendViewModel.dismiss();
        return sn.z.f31622a;
    }

    public static final sn.z ReferFriendScreen$lambda$2$0(ReferFriendViewModel referFriendViewModel, ho.l lVar) {
        lVar.getClass();
        lVar.invoke(referFriendViewModel);
        return sn.z.f31622a;
    }

    public static final sn.z ReferFriendScreen$lambda$3(ho.a aVar, ReferFriendViewModel referFriendViewModel, int i10, int i11, u2.m mVar, int i12) {
        ReferFriendScreen(aVar, referFriendViewModel, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ReferFriendScreenUI(ReferFriendState referFriendState, ho.l lVar, ho.a aVar, u2.m mVar, int i10, int i11) {
        int i12;
        ho.l lVar2;
        int i13;
        int i14;
        ho.a aVar2;
        int i15;
        boolean z6;
        u2.q qVar;
        ho.l lVar3;
        ho.a aVar3;
        r1 r10;
        ho.l lVar4;
        ho.a aVar4;
        int i16;
        referFriendState.getClass();
        u2.q qVar2 = (u2.q) mVar;
        qVar2.Z(691453719);
        if ((i10 & 6) == 0) {
            if (qVar2.f(referFriendState)) {
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
            if (qVar2.h(lVar2)) {
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
                if (qVar2.h(aVar2)) {
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
                if (qVar2.O(i12 & 1, z6)) {
                    Object obj = u2.l.f33918a;
                    if (i17 != 0) {
                        Object L = qVar2.L();
                        if (L == obj) {
                            L = new k(16);
                            qVar2.h0(L);
                        }
                        lVar4 = (ho.l) L;
                    } else {
                        lVar4 = lVar2;
                    }
                    if (i14 != 0) {
                        Object L2 = qVar2.L();
                        if (L2 == obj) {
                            L2 = new d(4);
                            qVar2.h0(L2);
                        }
                        aVar4 = (ho.a) L2;
                    } else {
                        aVar4 = aVar2;
                    }
                    qVar = qVar2;
                    k5.a(null, c3.k.d(1727434451, true, new e(3, aVar4), qVar2), null, null, null, 0, 0L, 0L, null, c3.k.d(-1625925016, true, new i(lVar4, referFriendState, 2), qVar2), qVar, 805306416, 509);
                    ho.l lVar5 = lVar4;
                    aVar3 = aVar4;
                    lVar3 = lVar5;
                } else {
                    qVar = qVar2;
                    qVar.R();
                    lVar3 = lVar2;
                    aVar3 = aVar2;
                }
                r10 = qVar.r();
                if (r10 != null) {
                    r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.elements.c((Object) referFriendState, lVar3, aVar3, i10, i11, 14);
                    return;
                }
                return;
            }
            aVar2 = aVar;
            if ((i12 & 147) != 146) {
            }
            if (qVar2.O(i12 & 1, z6)) {
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
        if (qVar2.O(i12 & 1, z6)) {
        }
        r10 = qVar.r();
        if (r10 != null) {
        }
    }

    public static final sn.z ReferFriendScreenUI$lambda$0$0(ho.l lVar) {
        lVar.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z ReferFriendScreenUI$lambda$2(ho.a aVar, u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            HeaderKt.Header("", null, c3.k.d(966379407, true, new c(aVar, 3), qVar), null, null, 0, qVar, 390, 58);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z ReferFriendScreenUI$lambda$2$0(ho.a aVar, l2 l2Var, u2.m mVar, int i10) {
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
        return sn.z.f31622a;
    }

    public static final sn.z ReferFriendScreenUI$lambda$3(ho.l lVar, ReferFriendState referFriendState, z1 z1Var, u2.m mVar, int i10) {
        int i11;
        boolean z6;
        float f10;
        float f11;
        int i12;
        z1Var.getClass();
        if ((i10 & 6) == 0) {
            if (((u2.q) mVar).f(z1Var)) {
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
            i3.t d10 = p2.d(r1.d.o(r1.d.D(qVar2, z1Var), z1Var), 1.0f);
            f1 d11 = r1.p.d(i3.d.f13001e, false);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.t c5 = i3.a.c(d10, qVar);
            h4.h.f11920i.getClass();
            h4.f fVar = h4.g.f11903b;
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            h4.e eVar = h4.g.f11907f;
            u2.r.J(eVar, d11, qVar);
            h4.e eVar2 = h4.g.f11906e;
            u2.r.J(eVar2, l4, qVar);
            Integer valueOf = Integer.valueOf(hashCode);
            h4.e eVar3 = h4.g.f11908g;
            u2.r.y(qVar, valueOf, eVar3);
            h4.d dVar = h4.g.f11909h;
            u2.r.F(dVar, qVar);
            h4.e eVar4 = h4.g.f11905d;
            u2.r.J(eVar4, c5, qVar);
            r1.d.g(m3.h.h(p2.d(qVar2, 1.0f), kd.a.M(R.drawable.elevenreader_icon, qVar, 0), null, f4.q.f8840c, t2.u.P, null, 54), qVar);
            i3.t d12 = p2.d(qVar2, 1.0f);
            ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
            int i13 = ElevenLabsTheme.$stable;
            i3.t f12 = ib.i.f(elevenLabsTheme, qVar, i13, d12);
            r1.x a10 = r1.w.a(r1.j.f29232e, i3.d.C0, qVar, 54);
            int hashCode2 = Long.hashCode(qVar.T);
            c3.o l7 = qVar.l();
            i3.t c10 = i3.a.c(f12, qVar);
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
            if (1.0f <= 0.0d) {
                s1.a.a("invalid weight; must be greater than zero");
            }
            if (1.0f > Float.MAX_VALUE) {
                f10 = Float.MAX_VALUE;
            } else {
                f10 = 1.0f;
            }
            r1.d.g(new m1(f10, true), qVar);
            j7.d(String.format(kj.c.R(qVar, R.string.referal_sheet_discount_title), Arrays.copyOf(new Object[0], 0)), r1.d.I(p2.e(qVar2, 1.0f), t2.u.P, t2.u.P, t2.u.P, elevenLabsTheme.getSpacings(qVar, i13).m2356getX4D9Ej5fM(), 7), 0L, 0L, null, 0L, new e5.k(3), 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar, i13).getTitleMedium700(), qVar, 0, 0, 130044);
            j7.d(String.format(kj.c.R(qVar, R.string.referal_sheet_discount_subtitle), Arrays.copyOf(new Object[0], 0)), p2.e(qVar2, 1.0f), ib.i.w(elevenLabsTheme, qVar, i13), 0L, null, 0L, new e5.k(3), 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar, i13).getBodySmall500(), qVar, 48, 0, 130040);
            if (1.0f <= 0.0d) {
                s1.a.a("invalid weight; must be greater than zero");
            }
            if (1.0f > Float.MAX_VALUE) {
                f11 = Float.MAX_VALUE;
            } else {
                f11 = 1.0f;
            }
            r1.d.g(new m1(f11, true), qVar);
            String R = kj.c.R(qVar, R.string.referal_sheet_action);
            boolean f13 = qVar.f(lVar);
            Object L = qVar.L();
            if (f13 || L == u2.l.f33918a) {
                L = new a(lVar, 5);
                qVar.h0(L);
            }
            FullWidthButtonKt.FullWidthButton(R, (ho.a) L, p2.e(qVar2, 1.0f), FullWidthButtonSize.Large, FullWidthButtonVariant.Primary, null, referFriendState.isLoadingLink(), false, false, qVar, 28032, 416);
            qVar.p(true);
            qVar.p(true);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z ReferFriendScreenUI$lambda$3$0$0$0$0(ho.l lVar) {
        lVar.invoke(new k(15));
        return sn.z.f31622a;
    }

    public static final sn.z ReferFriendScreenUI$lambda$3$0$0$0$0$0(ReferFriendViewModel referFriendViewModel) {
        referFriendViewModel.getClass();
        referFriendViewModel.share();
        return sn.z.f31622a;
    }

    public static final sn.z ReferFriendScreenUI$lambda$4(ReferFriendState referFriendState, ho.l lVar, ho.a aVar, int i10, int i11, u2.m mVar, int i12) {
        ReferFriendScreenUI(referFriendState, lVar, aVar, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }
}
