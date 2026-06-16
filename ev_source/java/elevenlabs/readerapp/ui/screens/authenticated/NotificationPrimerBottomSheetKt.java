package io.elevenlabs.readerapp.ui.screens.authenticated;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.r1;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.protobuf.c6;
import io.elevenlabs.domain.Analytics;
import io.elevenlabs.domain.model.NotificationPrimerModel;
import io.elevenlabs.domain.model.NotificationPrimerSource;
import io.elevenlabs.readerapp.R;
import io.elevenlabs.readerapp.ui.utils.NotificationPrimerSharedActions;
import io.elevenlabs.ui.components.ButtonIconKt;
import io.elevenlabs.ui.components.ButtonIconSize;
import io.elevenlabs.ui.components.ButtonIconVariant;
import io.elevenlabs.ui.components.FullWidthButtonKt;
import io.elevenlabs.ui.components.FullWidthButtonSize;
import io.elevenlabs.ui.components.FullWidthButtonVariant;
import io.elevenlabs.ui.components.StackedNotificationKt;
import io.elevenlabs.ui.components.headers.HeaderKt;
import io.elevenlabs.ui.components.scaffolds.BottomSheetControl;
import io.elevenlabs.ui.components.scaffolds.BottomSheetScaffoldKt;
import io.elevenlabs.ui.theme.ElevenLabsTheme;
import io.elevenlabs.ui.theme.ElevenLabsThemeKt;
import io.livekit.android.rpc.RpcError;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import q2.j7;
import r1.l2;
import r1.p2;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001aG\u0010\n\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a7\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001a]\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00070\u0013H\u0003¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u000f\u0010\u0018\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u000f\u0010\u001a\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u001a\u0010\u0019¨\u0006\u001b"}, d2 = {"", "showPrimer", "Lio/elevenlabs/domain/model/NotificationPrimerSource;", "source", "Lio/elevenlabs/domain/model/NotificationPrimerModel;", "model", "Lkotlin/Function0;", "Lsn/z;", "onHide", FirebaseAnalytics.Param.CONTENT, "NotificationPrimerOverlay", "(ZLio/elevenlabs/domain/model/NotificationPrimerSource;Lio/elevenlabs/domain/model/NotificationPrimerModel;Lho/a;Lho/p;Lu2/m;I)V", "onClose", "Lio/elevenlabs/readerapp/ui/screens/authenticated/NotificationPrimerViewModel;", "vm", "NotificationPrimerBottomSheet", "(Lio/elevenlabs/domain/model/NotificationPrimerSource;Lio/elevenlabs/domain/model/NotificationPrimerModel;Lho/a;Lio/elevenlabs/readerapp/ui/screens/authenticated/NotificationPrimerViewModel;Lu2/m;II)V", "onPrimerShown", "onCtaClicked", "Lkotlin/Function1;", "Lio/elevenlabs/domain/Analytics$Event;", "logEvent", "NotificationPrimerBottomSheetUI", "(Lio/elevenlabs/domain/model/NotificationPrimerModel;Lio/elevenlabs/domain/model/NotificationPrimerSource;Lho/a;Lho/a;Lho/a;Lho/l;Lu2/m;I)V", "Preview_NotificationPrimer_Light", "(Lu2/m;I)V", "Preview_NotificationPrimer_Dark", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class NotificationPrimerBottomSheetKt {
    /* JADX WARN: Code restructure failed: missing block: B:39:0x008d, code lost:
    
        if ((r23 & 8) != 0) goto L117;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void NotificationPrimerBottomSheet(NotificationPrimerSource notificationPrimerSource, NotificationPrimerModel notificationPrimerModel, ho.a aVar, NotificationPrimerViewModel notificationPrimerViewModel, u2.m mVar, int i10, int i11) {
        int i12;
        NotificationPrimerViewModel notificationPrimerViewModel2;
        boolean z6;
        q7.c cVar;
        int i13;
        int i14;
        int i15;
        int i16;
        notificationPrimerSource.getClass();
        notificationPrimerModel.getClass();
        aVar.getClass();
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-2122255007);
        if ((i10 & 6) == 0) {
            if (qVar.d(notificationPrimerSource.ordinal())) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i12 = i16 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.h(notificationPrimerModel)) {
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
        if ((i10 & 3072) == 0) {
            if ((i11 & 8) == 0) {
                notificationPrimerViewModel2 = notificationPrimerViewModel;
                if (qVar.h(notificationPrimerViewModel2)) {
                    i13 = 2048;
                    i12 |= i13;
                }
            } else {
                notificationPrimerViewModel2 = notificationPrimerViewModel;
            }
            i13 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            i12 |= i13;
        } else {
            notificationPrimerViewModel2 = notificationPrimerViewModel;
        }
        if ((i12 & 1171) != 1170) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i12 & 1, z6)) {
            qVar.T();
            if ((i10 & 1) != 0 && !qVar.y()) {
                qVar.R();
            } else {
                if ((i11 & 8) != 0) {
                    r1 a10 = r7.a.a(qVar);
                    if (a10 != null) {
                        pl.f o6 = tb.a.o(a10, qVar);
                        if (a10 instanceof androidx.lifecycle.o) {
                            cVar = ((androidx.lifecycle.o) a10).getDefaultViewModelCreationExtras();
                        } else {
                            cVar = q7.a.f28123b;
                        }
                        notificationPrimerViewModel2 = (NotificationPrimerViewModel) gg.b.j0(kotlin.jvm.internal.e0.f20562a.b(NotificationPrimerViewModel.class), a10, null, o6, cVar, qVar);
                        i12 &= -7169;
                    } else {
                        c6.x("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        return;
                    }
                }
                qVar.q();
                BottomSheetScaffoldKt.m1899BottomSheetScaffoldjb40ds(false, false, 0L, t2.u.P, aVar, false, (ho.r) c3.k.d(464110575, true, new io.elevenlabs.readerapp.core.h(notificationPrimerModel, notificationPrimerSource, notificationPrimerViewModel2, 4), qVar), (u2.m) qVar, ((i12 << 6) & 57344) | 1572864, 47);
                qVar = qVar;
            }
        } else {
            qVar.R();
        }
        NotificationPrimerViewModel notificationPrimerViewModel3 = notificationPrimerViewModel2;
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.core.l((Object) notificationPrimerSource, (Object) notificationPrimerModel, aVar, (Object) notificationPrimerViewModel3, i10, i11, 4);
        }
    }

    public static final sn.z NotificationPrimerBottomSheet$lambda$0(NotificationPrimerModel notificationPrimerModel, final NotificationPrimerSource notificationPrimerSource, final NotificationPrimerViewModel notificationPrimerViewModel, r1.y yVar, BottomSheetControl bottomSheetControl, u2.m mVar, int i10) {
        yVar.getClass();
        bottomSheetControl.getClass();
        u2.q qVar = (u2.q) mVar;
        boolean h10 = qVar.h(bottomSheetControl);
        Object L = qVar.L();
        u2.e eVar = u2.l.f33918a;
        if (h10 || L == eVar) {
            L = new i0(bottomSheetControl, 1);
            qVar.h0(L);
        }
        ho.a aVar = (ho.a) L;
        boolean h11 = qVar.h(notificationPrimerViewModel) | qVar.d(notificationPrimerSource.ordinal());
        Object L2 = qVar.L();
        if (h11 || L2 == eVar) {
            final int i11 = 0;
            L2 = new ho.a() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.s0
                @Override // ho.a
                public final Object invoke() {
                    sn.z NotificationPrimerBottomSheet$lambda$0$1$0;
                    sn.z NotificationPrimerBottomSheet$lambda$0$2$0;
                    switch (i11) {
                        case 0:
                            NotificationPrimerBottomSheet$lambda$0$1$0 = NotificationPrimerBottomSheetKt.NotificationPrimerBottomSheet$lambda$0$1$0(notificationPrimerViewModel, notificationPrimerSource);
                            return NotificationPrimerBottomSheet$lambda$0$1$0;
                        default:
                            NotificationPrimerBottomSheet$lambda$0$2$0 = NotificationPrimerBottomSheetKt.NotificationPrimerBottomSheet$lambda$0$2$0(notificationPrimerViewModel, notificationPrimerSource);
                            return NotificationPrimerBottomSheet$lambda$0$2$0;
                    }
                }
            };
            qVar.h0(L2);
        }
        ho.a aVar2 = (ho.a) L2;
        boolean h12 = qVar.h(notificationPrimerViewModel) | qVar.d(notificationPrimerSource.ordinal());
        Object L3 = qVar.L();
        if (h12 || L3 == eVar) {
            final int i12 = 1;
            L3 = new ho.a() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.s0
                @Override // ho.a
                public final Object invoke() {
                    sn.z NotificationPrimerBottomSheet$lambda$0$1$0;
                    sn.z NotificationPrimerBottomSheet$lambda$0$2$0;
                    switch (i12) {
                        case 0:
                            NotificationPrimerBottomSheet$lambda$0$1$0 = NotificationPrimerBottomSheetKt.NotificationPrimerBottomSheet$lambda$0$1$0(notificationPrimerViewModel, notificationPrimerSource);
                            return NotificationPrimerBottomSheet$lambda$0$1$0;
                        default:
                            NotificationPrimerBottomSheet$lambda$0$2$0 = NotificationPrimerBottomSheetKt.NotificationPrimerBottomSheet$lambda$0$2$0(notificationPrimerViewModel, notificationPrimerSource);
                            return NotificationPrimerBottomSheet$lambda$0$2$0;
                    }
                }
            };
            qVar.h0(L3);
        }
        ho.a aVar3 = (ho.a) L3;
        boolean h13 = qVar.h(notificationPrimerViewModel);
        Object L4 = qVar.L();
        if (h13 || L4 == eVar) {
            L4 = new NotificationPrimerBottomSheetKt$NotificationPrimerBottomSheet$1$4$1(notificationPrimerViewModel);
            qVar.h0(L4);
        }
        NotificationPrimerBottomSheetUI(notificationPrimerModel, notificationPrimerSource, aVar, aVar2, aVar3, (ho.l) ((oo.g) L4), qVar, 0);
        return sn.z.f31622a;
    }

    public static final sn.z NotificationPrimerBottomSheet$lambda$0$0$0(BottomSheetControl bottomSheetControl) {
        bottomSheetControl.close();
        return sn.z.f31622a;
    }

    public static final sn.z NotificationPrimerBottomSheet$lambda$0$1$0(NotificationPrimerViewModel notificationPrimerViewModel, NotificationPrimerSource notificationPrimerSource) {
        notificationPrimerViewModel.recordPrimerShown(notificationPrimerSource);
        notificationPrimerViewModel.logEvent(new Analytics.Event.NotificationsViewedPrimer(notificationPrimerSource.getRawValue()));
        return sn.z.f31622a;
    }

    public static final sn.z NotificationPrimerBottomSheet$lambda$0$2$0(NotificationPrimerViewModel notificationPrimerViewModel, NotificationPrimerSource notificationPrimerSource) {
        notificationPrimerViewModel.logEvent(new Analytics.Event.NotificationsPrimerCtaClicked(notificationPrimerSource.getRawValue()));
        return sn.z.f31622a;
    }

    public static final sn.z NotificationPrimerBottomSheet$lambda$1(NotificationPrimerSource notificationPrimerSource, NotificationPrimerModel notificationPrimerModel, ho.a aVar, NotificationPrimerViewModel notificationPrimerViewModel, int i10, int i11, u2.m mVar, int i12) {
        NotificationPrimerBottomSheet(notificationPrimerSource, notificationPrimerModel, aVar, notificationPrimerViewModel, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }

    public static final void NotificationPrimerBottomSheetUI(NotificationPrimerModel notificationPrimerModel, NotificationPrimerSource notificationPrimerSource, ho.a aVar, ho.a aVar2, ho.a aVar3, ho.l lVar, u2.m mVar, int i10) {
        int i11;
        boolean z6;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(1014343514);
        if ((i10 & 6) == 0) {
            if (qVar.h(notificationPrimerModel)) {
                i17 = 4;
            } else {
                i17 = 2;
            }
            i11 = i17 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.d(notificationPrimerSource.ordinal())) {
                i16 = 32;
            } else {
                i16 = 16;
            }
            i11 |= i16;
        }
        if ((i10 & 384) == 0) {
            if (qVar.h(aVar)) {
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
            if (qVar.h(lVar)) {
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
            Context context = (Context) qVar.j(AndroidCompositionLocals_androidKt.f2291b);
            if ((i11 & 7168) == 2048) {
                z10 = true;
            } else {
                z10 = false;
            }
            Object L = qVar.L();
            u2.e eVar = u2.l.f33918a;
            if (z10 || L == eVar) {
                L = new NotificationPrimerBottomSheetKt$NotificationPrimerBottomSheetUI$1$1(aVar2, null);
                qVar.h0(L);
            }
            u2.r.f((ho.p) L, sn.z.f31622a, qVar);
            i3.q qVar2 = i3.q.f13017a;
            i3.t e10 = p2.e(qVar2, 1.0f);
            ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
            int i18 = ElevenLabsTheme.$stable;
            i3.t h10 = l1.n.h(e10, ib.i.d(elevenLabsTheme, qVar, i18), p3.h0.f26395b);
            r1.e eVar2 = r1.j.f29230c;
            i3.j jVar = i3.d.B0;
            r1.x a10 = r1.w.a(eVar2, jVar, qVar, 0);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.t c5 = i3.a.c(h10, qVar);
            h4.h.f11920i.getClass();
            h4.f fVar = h4.g.f11903b;
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            h4.e eVar3 = h4.g.f11907f;
            u2.r.J(eVar3, a10, qVar);
            h4.e eVar4 = h4.g.f11906e;
            u2.r.J(eVar4, l4, qVar);
            Integer valueOf = Integer.valueOf(hashCode);
            h4.e eVar5 = h4.g.f11908g;
            u2.r.y(qVar, valueOf, eVar5);
            h4.d dVar = h4.g.f11909h;
            u2.r.F(dVar, qVar);
            h4.e eVar6 = h4.g.f11905d;
            u2.r.J(eVar6, c5, qVar);
            int i19 = i11;
            HeaderKt.Header("", null, c3.k.d(358785248, true, new u(3, aVar), qVar), null, null, 0, qVar, 390, 58);
            i3.t E = r1.d.E(qVar2, elevenLabsTheme.getSpacings(qVar, i18).m2357getX5D9Ej5fM());
            r1.x a11 = r1.w.a(eVar2, jVar, qVar, 0);
            int hashCode2 = Long.hashCode(qVar.T);
            c3.o l7 = qVar.l();
            i3.t c10 = i3.a.c(E, qVar);
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            u2.r.J(eVar3, a11, qVar);
            u2.r.J(eVar4, l7, qVar);
            defpackage.f.u(hashCode2, qVar, eVar5, qVar, dVar);
            u2.r.J(eVar6, c10, qVar);
            StackedNotificationKt.StackedNotification(notificationPrimerModel.getExampleNotificationTitle(), notificationPrimerModel.getExampleNotificationSubtitle(), p2.e(qVar2, 1.0f), qVar, 384, 0);
            ib.i.A(elevenLabsTheme, qVar, i18, qVar2, qVar);
            j7.d(notificationPrimerModel.getTitle(), p2.e(qVar2, 1.0f), defpackage.f.b(elevenLabsTheme, qVar, i18), 0L, null, 0L, new e5.k(3), 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar, i18).getTitleMedium700(), qVar, 48, 0, 130040);
            ib.i.A(elevenLabsTheme, qVar, i18, qVar2, qVar);
            j7.d(notificationPrimerModel.getSubtitle(), p2.e(qVar2, 1.0f), ib.i.w(elevenLabsTheme, qVar, i18), 0L, null, 0L, new e5.k(3), 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar, i18).getBodySmall500(), qVar, 48, 0, 130040);
            r1.d.g(p2.f(qVar2, elevenLabsTheme.getSpacings(qVar, i18).m2352getX16D9Ej5fM()), qVar);
            String R = kj.c.R(qVar, R.string.notification_primer_preferences_cta);
            i3.t e11 = p2.e(qVar2, 1.0f);
            FullWidthButtonVariant fullWidthButtonVariant = FullWidthButtonVariant.Primary;
            FullWidthButtonSize fullWidthButtonSize = FullWidthButtonSize.Large;
            if ((i19 & 57344) == 16384) {
                z11 = true;
            } else {
                z11 = false;
            }
            if ((i19 & 458752) == 131072) {
                z12 = true;
            } else {
                z12 = false;
            }
            boolean z16 = z12 | z11;
            if ((i19 & 112) == 32) {
                z13 = true;
            } else {
                z13 = false;
            }
            boolean h11 = z16 | z13 | qVar.h(context);
            if ((i19 & 896) == 256) {
                z14 = true;
            } else {
                z14 = false;
            }
            boolean z17 = h11 | z14;
            Object L2 = qVar.L();
            if (!z17 && L2 != eVar) {
                z15 = true;
            } else {
                z15 = true;
                io.elevenlabs.readerapp.ui.screens.anonymous.signin.d dVar2 = new io.elevenlabs.readerapp.ui.screens.anonymous.signin.d(aVar3, lVar, notificationPrimerSource, context, aVar, 1);
                qVar.h0(dVar2);
                L2 = dVar2;
            }
            FullWidthButtonKt.FullWidthButton(R, (ho.a) L2, e11, fullWidthButtonSize, fullWidthButtonVariant, null, false, false, false, qVar, 28032, 480);
            qVar = qVar;
            qVar.p(z15);
            qVar.p(z15);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new c3.e(notificationPrimerModel, notificationPrimerSource, aVar, aVar2, aVar3, lVar, i10, 4);
        }
    }

    public static final sn.z NotificationPrimerBottomSheetUI$lambda$1$0(ho.a aVar, l2 l2Var, u2.m mVar, int i10) {
        boolean z6;
        l2Var.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            ButtonIconKt.ButtonIcon(io.elevenlabs.ui.R.drawable.close, kj.c.R(qVar, io.elevenlabs.ui.R.string.accessibility_bottom_sheet_dialog_close), aVar, null, ButtonIconVariant.Secondary, ButtonIconSize.Medium, false, false, false, qVar, 221184, 456);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z NotificationPrimerBottomSheetUI$lambda$1$1$0$0(ho.a aVar, ho.l lVar, NotificationPrimerSource notificationPrimerSource, Context context, ho.a aVar2) {
        aVar.invoke();
        lVar.invoke(new Analytics.Event.NotificationsNotificationSettingsOpened(notificationPrimerSource.getRawValue()));
        NotificationPrimerSharedActions.INSTANCE.openAppNotificationSettings(context);
        aVar2.invoke();
        return sn.z.f31622a;
    }

    public static final sn.z NotificationPrimerBottomSheetUI$lambda$2(NotificationPrimerModel notificationPrimerModel, NotificationPrimerSource notificationPrimerSource, ho.a aVar, ho.a aVar2, ho.a aVar3, ho.l lVar, int i10, u2.m mVar, int i11) {
        NotificationPrimerBottomSheetUI(notificationPrimerModel, notificationPrimerSource, aVar, aVar2, aVar3, lVar, mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void NotificationPrimerOverlay(boolean z6, NotificationPrimerSource notificationPrimerSource, NotificationPrimerModel notificationPrimerModel, ho.a aVar, ho.p pVar, u2.m mVar, int i10) {
        int i11;
        boolean z10;
        ho.a aVar2;
        NotificationPrimerModel notificationPrimerModel2;
        NotificationPrimerSource notificationPrimerSource2;
        int i12;
        int i13;
        int i14;
        int ordinal;
        int i15;
        int i16;
        aVar.getClass();
        pVar.getClass();
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-1850187282);
        if ((i10 & 6) == 0) {
            if (qVar.g(z6)) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i11 = i16 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (notificationPrimerSource == null) {
                ordinal = -1;
            } else {
                ordinal = notificationPrimerSource.ordinal();
            }
            if (qVar.d(ordinal)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i11 |= i15;
        }
        if ((i10 & 384) == 0) {
            if (qVar.h(notificationPrimerModel)) {
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
            if (qVar.h(pVar)) {
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
            pVar.invoke(qVar, Integer.valueOf((i11 >> 12) & 14));
            if (z6 && notificationPrimerSource != null && notificationPrimerModel != null) {
                qVar.X(-1613739226);
                aVar2 = aVar;
                NotificationPrimerBottomSheet(notificationPrimerSource, notificationPrimerModel, aVar2, null, qVar, (i11 >> 3) & 1022, 8);
                notificationPrimerSource2 = notificationPrimerSource;
                notificationPrimerModel2 = notificationPrimerModel;
                qVar.p(false);
            } else {
                aVar2 = aVar;
                notificationPrimerModel2 = notificationPrimerModel;
                notificationPrimerSource2 = notificationPrimerSource;
                qVar.X(-1613602764);
                qVar.p(false);
            }
        } else {
            aVar2 = aVar;
            notificationPrimerModel2 = notificationPrimerModel;
            notificationPrimerSource2 = notificationPrimerSource;
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new r0(z6, notificationPrimerSource2, notificationPrimerModel2, aVar2, pVar, i10);
        }
    }

    public static final sn.z NotificationPrimerOverlay$lambda$0(boolean z6, NotificationPrimerSource notificationPrimerSource, NotificationPrimerModel notificationPrimerModel, ho.a aVar, ho.p pVar, int i10, u2.m mVar, int i11) {
        NotificationPrimerOverlay(z6, notificationPrimerSource, notificationPrimerModel, aVar, pVar, mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_NotificationPrimer_Dark(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-1296913287);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            ElevenLabsThemeKt.ElevenLabsTheme(true, ComposableSingletons$NotificationPrimerBottomSheetKt.INSTANCE.getLambda$1094072099$app_productionRelease(), qVar, 54, 0);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.anonymous.signin.mfa.d(i10, 22);
        }
    }

    public static final sn.z Preview_NotificationPrimer_Dark$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_NotificationPrimer_Dark(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_NotificationPrimer_Light(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(2014620305);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            ElevenLabsThemeKt.ElevenLabsTheme(false, ComposableSingletons$NotificationPrimerBottomSheetKt.INSTANCE.m1192getLambda$1174244057$app_productionRelease(), qVar, 54, 0);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.anonymous.signin.mfa.d(i10, 21);
        }
    }

    public static final sn.z Preview_NotificationPrimer_Light$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_NotificationPrimer_Light(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }
}
