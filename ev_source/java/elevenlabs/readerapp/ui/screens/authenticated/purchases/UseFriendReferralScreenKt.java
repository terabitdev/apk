package io.elevenlabs.readerapp.ui.screens.authenticated.purchases;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.protobuf.c6;
import f4.f1;
import io.elevenlabs.readerapp.core.extensions.ComposeExtensionsKt;
import io.elevenlabs.readerapp.ui.formatter.MinutesFormatterKt;
import io.elevenlabs.ui.R;
import io.elevenlabs.ui.components.CloseButtonKt;
import io.elevenlabs.ui.components.ErrorScreenKt;
import io.elevenlabs.ui.components.FullScreenLoaderKt;
import io.elevenlabs.ui.components.FullWidthButtonKt;
import io.elevenlabs.ui.components.FullWidthButtonSize;
import io.elevenlabs.ui.components.FullWidthButtonVariant;
import io.elevenlabs.ui.components.headers.HeaderKt;
import io.elevenlabs.ui.theme.ElevenLabsTheme;
import io.livekit.android.rpc.RpcError;
import kotlin.Metadata;
import kotlin.jvm.internal.e0;
import livekit.LivekitInternal$NodeStats;
import q2.j7;
import q2.k5;
import r1.i2;
import r1.k2;
import r1.l2;
import r1.m1;
import r1.p2;
import r1.z1;
import u2.r1;
import u2.s2;
import u2.z0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\r\u001a/\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001aI\u0010\r\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\t2 \b\u0002\u0010\f\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00030\u000b\u0012\u0004\u0012\u00020\u00030\u000b2\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\r\u0010\u000e\u001a%\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0003¢\u0006\u0004\b\u0011\u0010\u0012\u001a-\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u00142\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0003¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u000f\u0010\u0019\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u000f\u0010\u001b\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u001b\u0010\u001a\u001a\u000f\u0010\u001c\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u001c\u0010\u001a\u001a\u000f\u0010\u001d\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u001d\u0010\u001a\u001a\u000f\u0010\u001e\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u001e\u0010\u001a\u001a\u000f\u0010\u001f\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u001f\u0010\u001a\u001a\u000f\u0010 \u001a\u00020\u0003H\u0007¢\u0006\u0004\b \u0010\u001a¨\u0006!²\u0006\f\u0010\n\u001a\u00020\t8\nX\u008a\u0084\u0002"}, d2 = {"", "code", "Lkotlin/Function0;", "Lsn/z;", "onGoBack", "Lio/elevenlabs/readerapp/ui/screens/authenticated/purchases/UseFriendReferralViewModel;", "vm", "UseFriendReferralScreen", "(Ljava/lang/String;Lho/a;Lio/elevenlabs/readerapp/ui/screens/authenticated/purchases/UseFriendReferralViewModel;Lu2/m;II)V", "Lio/elevenlabs/readerapp/ui/screens/authenticated/purchases/UseFriendReferralState;", RemoteConfigConstants.ResponseFieldKey.STATE, "Lkotlin/Function1;", "action", "UseFriendReferralScreenUI", "(Lio/elevenlabs/readerapp/ui/screens/authenticated/purchases/UseFriendReferralState;Lho/l;Lho/a;Lu2/m;II)V", "", "subscriptionMonths", "SubscriptionSuccessContent", "(JLho/a;Lu2/m;I)V", "hoursAllocated", "", "isLoadingLink", "onShare", "HoursSuccessContent", "(JZLho/a;Lu2/m;I)V", "Preview_UseFriendReferralScreen_Idle", "(Lu2/m;I)V", "Preview_UseFriendReferralScreen_Loading", "Preview_UseFriendReferralScreen_Error", "Preview_UseFriendReferralScreen_Success", "Preview_UseFriendReferralScreen_Success_LoadingLink", "Preview_UseFriendReferralScreen_SubscriptionSuccess_Year", "Preview_UseFriendReferralScreen_SubscriptionSuccess_Months", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class UseFriendReferralScreenKt {
    private static final void HoursSuccessContent(final long j4, final boolean z6, final ho.a aVar, u2.m mVar, final int i10) {
        int i11;
        boolean z10;
        float f10;
        float f11;
        int i12;
        int i13;
        int i14;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(749152964);
        if ((i10 & 6) == 0) {
            if (qVar.e(j4)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i11 = i14 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.g(z6)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i11 |= i13;
        }
        if ((i10 & 384) == 0) {
            if (qVar.h(aVar)) {
                i12 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i12 = 128;
            }
            i11 |= i12;
        }
        if ((i11 & 147) != 146) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (qVar.O(i11 & 1, z10)) {
            i3.q qVar2 = i3.q.f13017a;
            i3.t d10 = p2.d(qVar2, 1.0f);
            ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
            int i15 = ElevenLabsTheme.$stable;
            i3.t f12 = ib.i.f(elevenLabsTheme, qVar, i15, d10);
            r1.x a10 = r1.w.a(r1.j.f29232e, i3.d.C0, qVar, 54);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.t c5 = i3.a.c(f12, qVar);
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
            i3.k kVar = i3.d.f13005z0;
            r1.h n2 = ib.i.n(elevenLabsTheme, qVar, i15);
            int i16 = i11;
            i3.t I = r1.d.I(qVar2, t2.u.P, t2.u.P, t2.u.P, elevenLabsTheme.getSpacings(qVar, i15).m2351getX10D9Ej5fM(), 7);
            k2 a11 = i2.a(n2, kVar, qVar, 48);
            int hashCode2 = Long.hashCode(qVar.T);
            c3.o l7 = qVar.l();
            i3.t c10 = i3.a.c(I, qVar);
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
            l1.n.c(kd.a.M(R.drawable.clock__time__timer, qVar, 0), null, p2.o(qVar2, 32), null, null, t2.u.P, new p3.n(defpackage.f.b(elevenLabsTheme, qVar, i15), 5), qVar, u3.c.$stable | 432, 56);
            j7.d(MinutesFormatterKt.formatHoursShort(j4, qVar, i16 & 14), null, defpackage.f.b(elevenLabsTheme, qVar, i15), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar, i15).getTitleXLarge700Eleven(), qVar, 0, 0, 131066);
            qVar.p(true);
            j7.d(kj.c.Q(io.elevenlabs.readerapp.R.string.referral_sheet_hours_success_title, new Object[]{Long.valueOf(j4)}, qVar), r1.d.I(p2.e(qVar2, 1.0f), t2.u.P, t2.u.P, t2.u.P, elevenLabsTheme.getSpacings(qVar, i15).m2356getX4D9Ej5fM(), 7), 0L, 0L, null, 0L, new e5.k(3), 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar, i15).getTitleMedium700(), qVar, 0, 0, 130044);
            j7.d(kj.c.Q(io.elevenlabs.readerapp.R.string.referral_sheet_hours_success_subtitle, new Object[]{Long.valueOf(j4)}, qVar), r1.d.I(p2.e(qVar2, 1.0f), t2.u.P, t2.u.P, t2.u.P, elevenLabsTheme.getSpacings(qVar, i15).m2356getX4D9Ej5fM(), 7), ib.i.w(elevenLabsTheme, qVar, i15), 0L, null, 0L, new e5.k(3), 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar, i15).getBodySmall500(), qVar, 0, 0, 130040);
            if (1.0f <= 0.0d) {
                s1.a.a("invalid weight; must be greater than zero");
            }
            if (1.0f > Float.MAX_VALUE) {
                f11 = Float.MAX_VALUE;
            } else {
                f11 = 1.0f;
            }
            r1.d.g(new m1(f11, true), qVar);
            FullWidthButtonKt.FullWidthButton(kj.c.R(qVar, io.elevenlabs.readerapp.R.string.referal_sheet_action), aVar, p2.e(qVar2, 1.0f), FullWidthButtonSize.Large, FullWidthButtonVariant.Primary, null, z6, false, false, qVar, ((i16 >> 3) & 112) | 28032 | ((i16 << 15) & 3670016), 416);
            qVar = qVar;
            qVar.p(true);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new ho.p() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.purchases.w
                @Override // ho.p
                public final Object invoke(Object obj, Object obj2) {
                    sn.z HoursSuccessContent$lambda$1;
                    int intValue = ((Integer) obj2).intValue();
                    HoursSuccessContent$lambda$1 = UseFriendReferralScreenKt.HoursSuccessContent$lambda$1(j4, z6, aVar, i10, (u2.m) obj, intValue);
                    return HoursSuccessContent$lambda$1;
                }
            };
        }
    }

    public static final sn.z HoursSuccessContent$lambda$1(long j4, boolean z6, ho.a aVar, int i10, u2.m mVar, int i11) {
        HoursSuccessContent(j4, z6, aVar, mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_UseFriendReferralScreen_Error(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-1969886107);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            UseFriendReferralScreenUI(new UseFriendReferralState(false, null, "This is an error", false, false, null, null, null, 251, null), null, null, qVar, 0, 6);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.pronunciations.h(i10, 27);
        }
    }

    public static final sn.z Preview_UseFriendReferralScreen_Error$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_UseFriendReferralScreen_Error(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_UseFriendReferralScreen_Idle(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(1242091693);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            UseFriendReferralScreenUI(new UseFriendReferralState(false, null, null, false, false, null, null, null, 255, null), null, null, qVar, 0, 6);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.pronunciations.h(i10, 24);
        }
    }

    public static final sn.z Preview_UseFriendReferralScreen_Idle$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_UseFriendReferralScreen_Idle(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_UseFriendReferralScreen_Loading(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(54833201);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            UseFriendReferralScreenUI(new UseFriendReferralState(true, null, null, false, false, null, null, null, 254, null), null, null, qVar, 0, 6);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.pronunciations.h(i10, 22);
        }
    }

    public static final sn.z Preview_UseFriendReferralScreen_Loading$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_UseFriendReferralScreen_Loading(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_UseFriendReferralScreen_SubscriptionSuccess_Months(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(1695269813);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            UseFriendReferralScreenUI(new UseFriendReferralState(false, null, null, true, false, null, null, 3L, 119, null), null, null, qVar, 0, 6);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.pronunciations.h(i10, 21);
        }
    }

    public static final sn.z Preview_UseFriendReferralScreen_SubscriptionSuccess_Months$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_UseFriendReferralScreen_SubscriptionSuccess_Months(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_UseFriendReferralScreen_SubscriptionSuccess_Year(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(1697445867);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            UseFriendReferralScreenUI(new UseFriendReferralState(false, null, null, true, false, null, null, 12L, 119, null), null, null, qVar, 0, 6);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.pronunciations.h(i10, 25);
        }
    }

    public static final sn.z Preview_UseFriendReferralScreen_SubscriptionSuccess_Year$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_UseFriendReferralScreen_SubscriptionSuccess_Year(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_UseFriendReferralScreen_Success(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-809399862);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            UseFriendReferralScreenUI(new UseFriendReferralState(false, null, null, true, false, null, 2L, null, 183, null), null, null, qVar, 0, 6);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.pronunciations.h(i10, 26);
        }
    }

    public static final sn.z Preview_UseFriendReferralScreen_Success$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_UseFriendReferralScreen_Success(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_UseFriendReferralScreen_Success_LoadingLink(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-1650282957);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            UseFriendReferralScreenUI(new UseFriendReferralState(false, null, null, true, true, null, 5L, null, 167, null), null, null, qVar, 0, 6);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.pronunciations.h(i10, 23);
        }
    }

    public static final sn.z Preview_UseFriendReferralScreen_Success_LoadingLink$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_UseFriendReferralScreen_Success_LoadingLink(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    private static final void SubscriptionSuccessContent(final long j4, final ho.a aVar, u2.m mVar, final int i10) {
        int i11;
        boolean z6;
        float f10;
        float f11;
        double d10;
        String I;
        float f12;
        int i12;
        int i13;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-339323394);
        if ((i10 & 6) == 0) {
            if (qVar.e(j4)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i11 = i13 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.h(aVar)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i11 |= i12;
        }
        if ((i11 & 19) != 18) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i11 & 1, z6)) {
            i3.q qVar2 = i3.q.f13017a;
            i3.t d11 = p2.d(qVar2, 1.0f);
            ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
            int i14 = ElevenLabsTheme.$stable;
            i3.t f13 = ib.i.f(elevenLabsTheme, qVar, i14, d11);
            r1.x a10 = r1.w.a(r1.j.f29232e, i3.d.C0, qVar, 54);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.t c5 = i3.a.c(f13, qVar);
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
            if (1.0f > Float.MAX_VALUE) {
                f10 = Float.MAX_VALUE;
                f11 = Float.MAX_VALUE;
            } else {
                f10 = 1.0f;
                f11 = Float.MAX_VALUE;
            }
            r1.d.g(new m1(f10, true), qVar);
            j7.d(kj.c.R(qVar, io.elevenlabs.readerapp.R.string.referral_sheet_subscription_welcome), r1.d.I(p2.e(qVar2, 1.0f), t2.u.P, t2.u.P, t2.u.P, elevenLabsTheme.getSpacings(qVar, i14).m2356getX4D9Ej5fM(), 7), 0L, 0L, null, 0L, new e5.k(3), 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar, i14).getTitleXLarge700Eleven(), qVar, 0, 0, 130044);
            j7.d(kj.c.R(qVar, io.elevenlabs.readerapp.R.string.referral_sheet_subscription_unlocked), r1.d.I(p2.e(qVar2, 1.0f), t2.u.P, t2.u.P, t2.u.P, elevenLabsTheme.getSpacings(qVar, i14).m2356getX4D9Ej5fM(), 7), 0L, 0L, null, 0L, new e5.k(3), 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar, i14).getTitleMedium700(), qVar, 0, 0, 130044);
            int i15 = (int) j4;
            if (j4 == 12) {
                qVar.X(1814417523);
                I = kj.c.R(qVar, io.elevenlabs.readerapp.R.string.referral_sheet_subscription_activated_year);
                qVar.p(false);
                d10 = 0.0d;
            } else {
                d10 = 0.0d;
                qVar.X(1814514770);
                I = kj.c.I(io.elevenlabs.readerapp.R.plurals.referral_sheet_subscription_activated_months_plurals, i15, new Object[]{Integer.valueOf(i15)}, qVar);
                qVar.p(false);
            }
            j7.d(I, r1.d.I(p2.e(qVar2, 1.0f), t2.u.P, t2.u.P, t2.u.P, elevenLabsTheme.getSpacings(qVar, i14).m2356getX4D9Ej5fM(), 7), ib.i.w(elevenLabsTheme, qVar, i14), 0L, null, 0L, new e5.k(3), 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar, i14).getBodySmall500(), qVar, 0, 0, 130040);
            if (1.0f <= d10) {
                s1.a.a("invalid weight; must be greater than zero");
            }
            if (1.0f > f11) {
                f12 = f11;
            } else {
                f12 = 1.0f;
            }
            r1.d.g(new m1(f12, true), qVar);
            FullWidthButtonKt.FullWidthButton(kj.c.R(qVar, io.elevenlabs.readerapp.R.string.start_listening), aVar, p2.e(qVar2, 1.0f), FullWidthButtonSize.Large, FullWidthButtonVariant.Primary, null, false, false, false, qVar, (i11 & 112) | 28032, 480);
            qVar.p(true);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new ho.p() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.purchases.y
                @Override // ho.p
                public final Object invoke(Object obj, Object obj2) {
                    sn.z SubscriptionSuccessContent$lambda$1;
                    int intValue = ((Integer) obj2).intValue();
                    SubscriptionSuccessContent$lambda$1 = UseFriendReferralScreenKt.SubscriptionSuccessContent$lambda$1(j4, aVar, i10, (u2.m) obj, intValue);
                    return SubscriptionSuccessContent$lambda$1;
                }
            };
        }
    }

    public static final sn.z SubscriptionSuccessContent$lambda$1(long j4, ho.a aVar, int i10, u2.m mVar, int i11) {
        SubscriptionSuccessContent(j4, aVar, mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void UseFriendReferralScreen(String str, ho.a aVar, UseFriendReferralViewModel useFriendReferralViewModel, u2.m mVar, int i10, int i11) {
        int i12;
        boolean z6;
        UseFriendReferralViewModel useFriendReferralViewModel2;
        q7.c cVar;
        UseFriendReferralViewModel useFriendReferralViewModel3;
        boolean z10;
        Object L;
        boolean h10;
        Object L2;
        boolean h11;
        Object L3;
        int i13;
        int i14;
        int i15;
        str.getClass();
        aVar.getClass();
        u2.q qVar = (u2.q) mVar;
        qVar.Z(1941638200);
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
        if ((i10 & 384) == 0) {
            if ((i11 & 4) == 0 && qVar.h(useFriendReferralViewModel)) {
                i13 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i13 = 128;
            }
            i12 |= i13;
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
                if ((i11 & 4) != 0) {
                    i12 &= -897;
                }
            } else if ((i11 & 4) != 0) {
                androidx.lifecycle.r1 a10 = r7.a.a(qVar);
                if (a10 != null) {
                    pl.f o6 = tb.a.o(a10, qVar);
                    if (a10 instanceof androidx.lifecycle.o) {
                        cVar = ((androidx.lifecycle.o) a10).getDefaultViewModelCreationExtras();
                    } else {
                        cVar = q7.a.f28123b;
                    }
                    useFriendReferralViewModel3 = (UseFriendReferralViewModel) gg.b.j0(e0.f20562a.b(UseFriendReferralViewModel.class), a10, null, o6, cVar, qVar);
                    i12 &= -897;
                    qVar.q();
                    boolean h12 = qVar.h(useFriendReferralViewModel3);
                    if ((i12 & 14) != 4) {
                        z11 = false;
                    }
                    z10 = h12 | z11;
                    L = qVar.L();
                    u2.e eVar = u2.l.f33918a;
                    if (!z10 || L == eVar) {
                        L = new UseFriendReferralScreenKt$UseFriendReferralScreen$1$1(useFriendReferralViewModel3, str, null);
                        qVar.h0(L);
                    }
                    u2.r.f((ho.p) L, str, qVar);
                    z0 o10 = u2.r.o(useFriendReferralViewModel3.getStateFlow(), qVar, 0);
                    String link = UseFriendReferralScreen$lambda$1(o10).getLink();
                    h10 = qVar.h(useFriendReferralViewModel3);
                    L2 = qVar.L();
                    if (!h10 || L2 == eVar) {
                        L2 = new u(useFriendReferralViewModel3, 1);
                        qVar.h0(L2);
                    }
                    ComposeExtensionsKt.ShareLinkHandler(link, (ho.a) L2, qVar, 0);
                    UseFriendReferralState UseFriendReferralScreen$lambda$1 = UseFriendReferralScreen$lambda$1(o10);
                    h11 = qVar.h(useFriendReferralViewModel3);
                    L3 = qVar.L();
                    if (!h11 || L3 == eVar) {
                        L3 = new x(useFriendReferralViewModel3, 0);
                        qVar.h0(L3);
                    }
                    UseFriendReferralScreenUI(UseFriendReferralScreen$lambda$1, (ho.l) L3, aVar, qVar, (i12 << 3) & 896, 0);
                    qVar = qVar;
                    useFriendReferralViewModel2 = useFriendReferralViewModel3;
                } else {
                    c6.x("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
            }
            useFriendReferralViewModel3 = useFriendReferralViewModel;
            qVar.q();
            boolean h122 = qVar.h(useFriendReferralViewModel3);
            if ((i12 & 14) != 4) {
            }
            z10 = h122 | z11;
            L = qVar.L();
            u2.e eVar2 = u2.l.f33918a;
            if (!z10) {
            }
            L = new UseFriendReferralScreenKt$UseFriendReferralScreen$1$1(useFriendReferralViewModel3, str, null);
            qVar.h0(L);
            u2.r.f((ho.p) L, str, qVar);
            z0 o102 = u2.r.o(useFriendReferralViewModel3.getStateFlow(), qVar, 0);
            String link2 = UseFriendReferralScreen$lambda$1(o102).getLink();
            h10 = qVar.h(useFriendReferralViewModel3);
            L2 = qVar.L();
            if (!h10) {
            }
            L2 = new u(useFriendReferralViewModel3, 1);
            qVar.h0(L2);
            ComposeExtensionsKt.ShareLinkHandler(link2, (ho.a) L2, qVar, 0);
            UseFriendReferralState UseFriendReferralScreen$lambda$12 = UseFriendReferralScreen$lambda$1(o102);
            h11 = qVar.h(useFriendReferralViewModel3);
            L3 = qVar.L();
            if (!h11) {
            }
            L3 = new x(useFriendReferralViewModel3, 0);
            qVar.h0(L3);
            UseFriendReferralScreenUI(UseFriendReferralScreen$lambda$12, (ho.l) L3, aVar, qVar, (i12 << 3) & 896, 0);
            qVar = qVar;
            useFriendReferralViewModel2 = useFriendReferralViewModel3;
        } else {
            qVar.R();
            useFriendReferralViewModel2 = useFriendReferralViewModel;
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.elements.c(str, aVar, useFriendReferralViewModel2, i10, i11, 16);
        }
    }

    private static final UseFriendReferralState UseFriendReferralScreen$lambda$1(s2 s2Var) {
        return (UseFriendReferralState) s2Var.getValue();
    }

    public static final sn.z UseFriendReferralScreen$lambda$2$0(UseFriendReferralViewModel useFriendReferralViewModel) {
        useFriendReferralViewModel.dismiss();
        return sn.z.f31622a;
    }

    public static final sn.z UseFriendReferralScreen$lambda$3$0(UseFriendReferralViewModel useFriendReferralViewModel, ho.l lVar) {
        lVar.getClass();
        lVar.invoke(useFriendReferralViewModel);
        return sn.z.f31622a;
    }

    public static final sn.z UseFriendReferralScreen$lambda$4(String str, ho.a aVar, UseFriendReferralViewModel useFriendReferralViewModel, int i10, int i11, u2.m mVar, int i12) {
        UseFriendReferralScreen(str, aVar, useFriendReferralViewModel, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void UseFriendReferralScreenUI(UseFriendReferralState useFriendReferralState, ho.l lVar, ho.a aVar, u2.m mVar, int i10, int i11) {
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
        useFriendReferralState.getClass();
        u2.q qVar2 = (u2.q) mVar;
        qVar2.Z(1761958411);
        if ((i10 & 6) == 0) {
            if (qVar2.f(useFriendReferralState)) {
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
                            L = new k(21);
                            qVar2.h0(L);
                        }
                        lVar4 = (ho.l) L;
                    } else {
                        lVar4 = lVar2;
                    }
                    if (i14 != 0) {
                        Object L2 = qVar2.L();
                        if (L2 == obj) {
                            L2 = new d(5);
                            qVar2.h0(L2);
                        }
                        aVar4 = (ho.a) L2;
                    } else {
                        aVar4 = aVar2;
                    }
                    qVar = qVar2;
                    k5.a(null, c3.k.d(590295751, true, new e(4, aVar4), qVar2), null, null, null, 0, 0L, 0L, null, c3.k.d(20783900, true, new fm.o(useFriendReferralState, lVar4, aVar4, 23), qVar2), qVar, 805306416, 509);
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
                    r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.elements.c((Object) useFriendReferralState, lVar3, aVar3, i10, i11, 15);
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

    public static final sn.z UseFriendReferralScreenUI$lambda$0$0(ho.l lVar) {
        lVar.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z UseFriendReferralScreenUI$lambda$2(ho.a aVar, u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            HeaderKt.Header("", null, c3.k.d(26489987, true, new c(aVar, 4), qVar), null, null, 0, qVar, 390, 58);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z UseFriendReferralScreenUI$lambda$2$0(ho.a aVar, l2 l2Var, u2.m mVar, int i10) {
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

    public static final sn.z UseFriendReferralScreenUI$lambda$3(UseFriendReferralState useFriendReferralState, ho.l lVar, ho.a aVar, z1 z1Var, u2.m mVar, int i10) {
        int i11;
        boolean z6;
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
            u2.r.J(h4.g.f11907f, d11, qVar);
            u2.r.J(h4.g.f11906e, l4, qVar);
            u2.r.y(qVar, Integer.valueOf(hashCode), h4.g.f11908g);
            u2.r.F(h4.g.f11909h, qVar);
            u2.r.J(h4.g.f11905d, c5, qVar);
            r1.d.g(m3.h.h(p2.d(qVar2, 1.0f), kd.a.M(io.elevenlabs.readerapp.R.drawable.elevenreader_icon, qVar, 0), null, f4.q.f8840c, t2.u.P, null, 54), qVar);
            boolean m02 = wq.n.m0(useFriendReferralState.getError());
            u2.e eVar = u2.l.f33918a;
            if (!m02) {
                qVar.X(-576761050);
                String error = useFriendReferralState.getError();
                boolean f10 = qVar.f(lVar);
                Object L = qVar.L();
                if (f10 || L == eVar) {
                    L = new a(lVar, 6);
                    qVar.h0(L);
                }
                ErrorScreenKt.m1837ErrorScreenuDo3WH8(null, null, error, 0L, (ho.a) L, qVar, 0, 11);
                qVar = qVar;
                qVar.p(false);
            } else if (useFriendReferralState.getShowSuccess() && useFriendReferralState.getSubscriptionMonths() != null) {
                qVar.X(-576542841);
                SubscriptionSuccessContent(useFriendReferralState.getSubscriptionMonths().longValue(), aVar, qVar, 0);
                qVar.p(false);
            } else if (useFriendReferralState.getShowSuccess() && useFriendReferralState.getHoursAllocated() != null) {
                qVar.X(-576297104);
                long longValue = useFriendReferralState.getHoursAllocated().longValue();
                boolean isLoadingLink = useFriendReferralState.isLoadingLink();
                boolean f11 = qVar.f(lVar);
                Object L2 = qVar.L();
                if (f11 || L2 == eVar) {
                    L2 = new a(lVar, 7);
                    qVar.h0(L2);
                }
                HoursSuccessContent(longValue, isLoadingLink, (ho.a) L2, qVar, 0);
                qVar.p(false);
            } else {
                qVar.X(-576066464);
                qVar.p(false);
            }
            FullScreenLoaderKt.m1838FullScreenLoaderFNF3uiM(useFriendReferralState.isLoading(), null, 0L, qVar, 0, 6);
            qVar.p(true);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z UseFriendReferralScreenUI$lambda$3$0$0$0(ho.l lVar) {
        lVar.invoke(new k(19));
        return sn.z.f31622a;
    }

    public static final sn.z UseFriendReferralScreenUI$lambda$3$0$0$0$0(UseFriendReferralViewModel useFriendReferralViewModel) {
        useFriendReferralViewModel.getClass();
        useFriendReferralViewModel.load();
        return sn.z.f31622a;
    }

    public static final sn.z UseFriendReferralScreenUI$lambda$3$0$1$0(ho.l lVar) {
        lVar.invoke(new k(20));
        return sn.z.f31622a;
    }

    public static final sn.z UseFriendReferralScreenUI$lambda$3$0$1$0$0(UseFriendReferralViewModel useFriendReferralViewModel) {
        useFriendReferralViewModel.getClass();
        useFriendReferralViewModel.share();
        return sn.z.f31622a;
    }

    public static final sn.z UseFriendReferralScreenUI$lambda$4(UseFriendReferralState useFriendReferralState, ho.l lVar, ho.a aVar, int i10, int i11, u2.m mVar, int i12) {
        UseFriendReferralScreenUI(useFriendReferralState, lVar, aVar, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }
}
