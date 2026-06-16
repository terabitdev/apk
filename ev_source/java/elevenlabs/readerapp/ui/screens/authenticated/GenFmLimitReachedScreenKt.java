package io.elevenlabs.readerapp.ui.screens.authenticated;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.messaging.Constants;
import io.elevenlabs.domain.model.LimitReachedData;
import io.elevenlabs.ui.R;
import io.elevenlabs.ui.components.CloseButtonKt;
import io.elevenlabs.ui.components.FullWidthButtonKt;
import io.elevenlabs.ui.components.FullWidthButtonSize;
import io.elevenlabs.ui.components.FullWidthButtonVariant;
import io.elevenlabs.ui.components.headers.HeaderKt;
import io.elevenlabs.ui.theme.ElevenLabsTheme;
import io.livekit.android.rpc.RpcError;
import java.util.WeakHashMap;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import q2.j7;
import q2.k5;
import r1.c3;
import r1.i2;
import r1.k2;
import r1.l2;
import r1.m1;
import r1.p2;
import r1.z1;
import u2.r1;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u001aA\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001aA\u0010\t\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\t\u0010\b\u001a\u000f\u0010\n\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u000f\u0010\f\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\f\u0010\u000b¨\u0006\r"}, d2 = {"Lio/elevenlabs/domain/model/LimitReachedData;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lkotlin/Function0;", "Lsn/z;", "onUpgradeClick", "onCloseClick", "onGoBack", "GenFmLimitReachedScreen", "(Lio/elevenlabs/domain/model/LimitReachedData;Lho/a;Lho/a;Lho/a;Lu2/m;I)V", "GenFmLimitReachedScreenUI", "Preview_GenFmLimitReachedScreenUI_CanUpgrade", "(Lu2/m;I)V", "Preview_GenFmLimitReachedScreenUI_CannotUpgrade", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class GenFmLimitReachedScreenKt {
    public static final void GenFmLimitReachedScreen(LimitReachedData limitReachedData, ho.a aVar, ho.a aVar2, ho.a aVar3, u2.m mVar, int i10) {
        int i11;
        boolean z6;
        int i12;
        int i13;
        int i14;
        int i15;
        limitReachedData.getClass();
        aVar.getClass();
        aVar2.getClass();
        aVar3.getClass();
        u2.q qVar = (u2.q) mVar;
        qVar.Z(185990752);
        if ((i10 & 6) == 0) {
            if (qVar.h(limitReachedData)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i11 = i15 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.h(aVar)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i11 |= i14;
        }
        if ((i10 & 384) == 0) {
            if (qVar.h(aVar2)) {
                i13 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i13 = 128;
            }
            i11 |= i13;
        }
        if ((i10 & 3072) == 0) {
            if (qVar.h(aVar3)) {
                i12 = 2048;
            } else {
                i12 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i11 |= i12;
        }
        if ((i11 & 1171) != 1170) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i11 & 1, z6)) {
            GenFmLimitReachedScreenUI(limitReachedData, aVar, aVar2, aVar3, qVar, i11 & 8190);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new m0(limitReachedData, aVar, aVar2, aVar3, i10, 0);
        }
    }

    public static final sn.z GenFmLimitReachedScreen$lambda$0(LimitReachedData limitReachedData, ho.a aVar, ho.a aVar2, ho.a aVar3, int i10, u2.m mVar, int i11) {
        GenFmLimitReachedScreen(limitReachedData, aVar, aVar2, aVar3, mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void GenFmLimitReachedScreenUI(LimitReachedData limitReachedData, ho.a aVar, ho.a aVar2, ho.a aVar3, u2.m mVar, int i10) {
        int i11;
        boolean z6;
        u2.q qVar;
        int i12;
        int i13;
        int i14;
        int i15;
        limitReachedData.getClass();
        aVar.getClass();
        aVar2.getClass();
        aVar3.getClass();
        u2.q qVar2 = (u2.q) mVar;
        qVar2.Z(-291508916);
        if ((i10 & 6) == 0) {
            if (qVar2.h(limitReachedData)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i11 = i15 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar2.h(aVar)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i11 |= i14;
        }
        if ((i10 & 384) == 0) {
            if (qVar2.h(aVar2)) {
                i13 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i13 = 128;
            }
            i11 |= i13;
        }
        if ((i10 & 3072) == 0) {
            if (qVar2.h(aVar3)) {
                i12 = 2048;
            } else {
                i12 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i11 |= i12;
        }
        if ((i11 & 1171) != 1170) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar2.O(i11 & 1, z6)) {
            qVar = qVar2;
            k5.a(null, c3.k.d(-1604713720, true, new o(2, aVar3), qVar2), null, null, null, 0, 0L, 0L, null, c3.k.d(1516508957, true, new fm.o(limitReachedData, aVar, aVar2, 5), qVar2), qVar, 805306416, 509);
        } else {
            qVar = qVar2;
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new m0(limitReachedData, aVar, aVar2, aVar3, i10, 1);
        }
    }

    public static final sn.z GenFmLimitReachedScreenUI$lambda$0(ho.a aVar, u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            HeaderKt.Header("", null, c3.k.d(1747059140, true, new u(2, aVar), qVar), null, null, 0, qVar, 390, 58);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z GenFmLimitReachedScreenUI$lambda$0$0(ho.a aVar, l2 l2Var, u2.m mVar, int i10) {
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

    public static final sn.z GenFmLimitReachedScreenUI$lambda$1(LimitReachedData limitReachedData, ho.a aVar, ho.a aVar2, z1 z1Var, u2.m mVar, int i10) {
        int i11;
        boolean z6;
        float f10;
        float f11;
        int i12;
        FullWidthButtonVariant fullWidthButtonVariant;
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
            i3.t D = r1.d.D(p2.d(qVar2, 1.0f), z1Var);
            ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
            int i14 = ElevenLabsTheme.$stable;
            i3.t G = r1.d.G(D, elevenLabsTheme.getSpacings(qVar, i14).m2358getX6D9Ej5fM(), t2.u.P, 2);
            r1.x a10 = r1.w.a(r1.j.f29232e, i3.d.C0, qVar, 54);
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
            h4.e eVar = h4.g.f11907f;
            u2.r.J(eVar, a10, qVar);
            h4.e eVar2 = h4.g.f11906e;
            u2.r.J(eVar2, l4, qVar);
            Integer valueOf = Integer.valueOf(hashCode);
            h4.e eVar3 = h4.g.f11908g;
            u2.r.y(qVar, valueOf, eVar3);
            h4.d dVar = h4.g.f11909h;
            u2.r.F(dVar, qVar);
            h4.e eVar4 = h4.g.f11905d;
            u2.r.J(eVar4, c5, qVar);
            if (1.0f <= 0.0d) {
                s1.a.a("invalid weight; must be greater than zero");
            }
            if (1.0f > Float.MAX_VALUE) {
                f10 = Float.MAX_VALUE;
            } else {
                f10 = 1.0f;
            }
            r1.d.g(new m1(f10, true), qVar);
            l1.n.c(kd.a.M(R.drawable.download_limit_reached, qVar, 0), null, p2.h(p2.e(qVar2, 1.0f), 154, t2.u.P, 2), null, f4.q.f8840c, t2.u.P, null, qVar, u3.c.$stable | 25008, 104);
            r1.d.g(p2.f(qVar2, elevenLabsTheme.getSpacings(qVar, i14).m2351getX10D9Ej5fM()), qVar);
            j7.d(kj.c.R(qVar, io.elevenlabs.readerapp.R.string.genfm_limit_title), p2.e(qVar2, 1.0f), 0L, 0L, null, 0L, new e5.k(3), 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar, i14).getTitleMedium700(), qVar, 48, 0, 130044);
            ib.i.p(elevenLabsTheme, qVar, i14, qVar2, qVar);
            j7.d(limitReachedData.getMessage(), p2.e(qVar2, 1.0f), ib.i.w(elevenLabsTheme, qVar, i14), 0L, null, 0L, new e5.k(3), 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar, i14).getBodySmall500(), qVar, 48, 0, 130040);
            if (1.0f <= 0.0d) {
                s1.a.a("invalid weight; must be greater than zero");
            }
            if (1.0f > Float.MAX_VALUE) {
                f11 = Float.MAX_VALUE;
            } else {
                f11 = 1.0f;
            }
            r1.d.g(new m1(f11, true), qVar);
            i3.t e10 = p2.e(qVar2, 1.0f);
            k2 a11 = i2.a(r1.j.f29228a, i3.d.f13005z0, qVar, 48);
            int hashCode2 = Long.hashCode(qVar.T);
            c3.o l7 = qVar.l();
            i3.t c10 = i3.a.c(e10, qVar);
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            u2.r.J(eVar, a11, qVar);
            u2.r.J(eVar2, l7, qVar);
            defpackage.f.u(hashCode2, qVar, eVar3, qVar, dVar);
            u2.r.J(eVar4, c10, qVar);
            if (limitReachedData.getCanUpgrade()) {
                i12 = io.elevenlabs.readerapp.R.string.genfm_limit_cta;
            } else {
                i12 = io.elevenlabs.readerapp.R.string.bottom_sheet_dialog_close;
            }
            if (limitReachedData.getCanUpgrade()) {
                fullWidthButtonVariant = FullWidthButtonVariant.Subscriptions;
            } else {
                fullWidthButtonVariant = FullWidthButtonVariant.Primary;
            }
            FullWidthButtonVariant fullWidthButtonVariant2 = fullWidthButtonVariant;
            String R = kj.c.R(qVar, i12);
            FullWidthButtonSize fullWidthButtonSize = FullWidthButtonSize.Large;
            i3.t e11 = p2.e(qVar2, 1.0f);
            boolean h10 = qVar.h(limitReachedData) | qVar.f(aVar) | qVar.f(aVar2);
            Object L = qVar.L();
            if (h10 || L == u2.l.f33918a) {
                L = new c3.b(limitReachedData, aVar, aVar2, 9);
                qVar.h0(L);
            }
            FullWidthButtonKt.FullWidthButton(R, (ho.a) L, e11, fullWidthButtonSize, fullWidthButtonVariant2, null, false, false, false, qVar, 3456, 480);
            qVar.p(true);
            r1.d.g(p2.f(qVar2, elevenLabsTheme.getSpacings(qVar, i14).m2356getX4D9Ej5fM()), qVar);
            WeakHashMap weakHashMap = c3.f29142x;
            r1.d.g(r1.d.N(r1.u0.e(qVar).f29154l), qVar);
            qVar.p(true);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z GenFmLimitReachedScreenUI$lambda$1$0$0$0$0(LimitReachedData limitReachedData, ho.a aVar, ho.a aVar2) {
        if (limitReachedData.getCanUpgrade()) {
            aVar.invoke();
        } else {
            aVar2.invoke();
        }
        return sn.z.f31622a;
    }

    public static final sn.z GenFmLimitReachedScreenUI$lambda$2(LimitReachedData limitReachedData, ho.a aVar, ho.a aVar2, ho.a aVar3, int i10, u2.m mVar, int i11) {
        GenFmLimitReachedScreenUI(limitReachedData, aVar, aVar2, aVar3, mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_GenFmLimitReachedScreenUI_CanUpgrade(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-1470397947);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            LimitReachedData limitReachedData = new LimitReachedData("You've reached your GenFM generation for this month. Upgrade to generate more reads.", 3, true);
            Object L = qVar.L();
            u2.e eVar = u2.l.f33918a;
            if (L == eVar) {
                L = new n0(2);
                qVar.h0(L);
            }
            ho.a aVar = (ho.a) L;
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new n0(3);
                qVar.h0(L2);
            }
            ho.a aVar2 = (ho.a) L2;
            Object L3 = qVar.L();
            if (L3 == eVar) {
                L3 = new n0(4);
                qVar.h0(L3);
            }
            GenFmLimitReachedScreenUI(limitReachedData, aVar, aVar2, (ho.a) L3, qVar, 3504);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.anonymous.signin.mfa.d(i10, 17);
        }
    }

    public static final sn.z Preview_GenFmLimitReachedScreenUI_CanUpgrade$lambda$3(int i10, u2.m mVar, int i11) {
        Preview_GenFmLimitReachedScreenUI_CanUpgrade(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_GenFmLimitReachedScreenUI_CannotUpgrade(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-2142127772);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            LimitReachedData limitReachedData = new LimitReachedData("You've reached your GenFM generation for this month.", 10, false);
            Object L = qVar.L();
            u2.e eVar = u2.l.f33918a;
            if (L == eVar) {
                L = new d(29);
                qVar.h0(L);
            }
            ho.a aVar = (ho.a) L;
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new n0(0);
                qVar.h0(L2);
            }
            ho.a aVar2 = (ho.a) L2;
            Object L3 = qVar.L();
            if (L3 == eVar) {
                L3 = new n0(1);
                qVar.h0(L3);
            }
            GenFmLimitReachedScreenUI(limitReachedData, aVar, aVar2, (ho.a) L3, qVar, 3504);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.anonymous.signin.mfa.d(i10, 18);
        }
    }

    public static final sn.z Preview_GenFmLimitReachedScreenUI_CannotUpgrade$lambda$3(int i10, u2.m mVar, int i11) {
        Preview_GenFmLimitReachedScreenUI_CannotUpgrade(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }
}
