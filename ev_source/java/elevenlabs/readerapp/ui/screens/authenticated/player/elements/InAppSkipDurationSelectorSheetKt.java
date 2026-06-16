package io.elevenlabs.readerapp.ui.screens.authenticated.player.elements;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.protobuf.c6;
import h4.f2;
import io.elevenlabs.domain.model.SkipDuration;
import io.elevenlabs.readerapp.R;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.InAppSkipDirection;
import io.elevenlabs.ui.components.DividerKt;
import io.elevenlabs.ui.components.scaffolds.BottomSheetControl;
import io.elevenlabs.ui.components.scaffolds.BottomSheetScaffoldKt;
import io.elevenlabs.ui.echo.EchoTheme;
import io.livekit.android.rpc.RpcError;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import r1.p2;
import u2.r1;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u001aA\u0010\t\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\u0007¢\u0006\u0004\b\t\u0010\n\u001a\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/InAppSkipDirection;", "direction", "Lio/elevenlabs/domain/model/SkipDuration;", "currentDuration", "Lkotlin/Function1;", "Lsn/z;", "onDurationSelected", "Lkotlin/Function0;", "onDismiss", "InAppSkipDurationSelectorSheet", "(Lio/elevenlabs/readerapp/ui/screens/authenticated/player/InAppSkipDirection;Lio/elevenlabs/domain/model/SkipDuration;Lho/l;Lho/a;Lu2/m;I)V", "duration", "", "inAppSkipDurationLabel", "(Lio/elevenlabs/readerapp/ui/screens/authenticated/player/InAppSkipDirection;Lio/elevenlabs/domain/model/SkipDuration;)I", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class InAppSkipDurationSelectorSheetKt {

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[SkipDuration.values().length];
            try {
                iArr[SkipDuration.SECONDS_15.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SkipDuration.SECONDS_30.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[InAppSkipDirection.values().length];
            try {
                iArr2[InAppSkipDirection.FORWARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[InAppSkipDirection.BACKWARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final void InAppSkipDurationSelectorSheet(InAppSkipDirection inAppSkipDirection, SkipDuration skipDuration, ho.l lVar, ho.a aVar, u2.m mVar, int i10) {
        int i11;
        boolean z6;
        int i12;
        int i13;
        int i14;
        int i15;
        inAppSkipDirection.getClass();
        skipDuration.getClass();
        lVar.getClass();
        aVar.getClass();
        u2.q qVar = (u2.q) mVar;
        qVar.Z(1050160355);
        if ((i10 & 6) == 0) {
            if (qVar.d(inAppSkipDirection.ordinal())) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i11 = i15 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.d(skipDuration.ordinal())) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i11 |= i14;
        }
        if ((i10 & 384) == 0) {
            if (qVar.h(lVar)) {
                i13 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i13 = 128;
            }
            i11 |= i13;
        }
        if ((i10 & 3072) == 0) {
            if (qVar.h(aVar)) {
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
            BottomSheetScaffoldKt.EchoBottomSheetScaffold(false, aVar, null, false, null, ComposableSingletons$InAppSkipDurationSelectorSheetKt.INSTANCE.getLambda$2029582497$app_productionRelease(), c3.k.d(-1676211280, true, new io.elevenlabs.readerapp.core.h(inAppSkipDirection, skipDuration, lVar, 10), qVar), qVar, ((i11 >> 6) & 112) | 1769472, 29);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new c3.d(inAppSkipDirection, skipDuration, lVar, aVar, i10, 5);
        }
    }

    public static final sn.z InAppSkipDurationSelectorSheet$lambda$0(InAppSkipDirection inAppSkipDirection, SkipDuration skipDuration, ho.l lVar, r1.y yVar, BottomSheetControl bottomSheetControl, u2.m mVar, int i10) {
        boolean z6;
        yVar.getClass();
        bottomSheetControl.getClass();
        i3.q qVar = i3.q.f13017a;
        boolean z10 = true;
        i3.t y10 = l1.n.y(p2.e(qVar, 1.0f), l1.n.x(mVar), true, true);
        r1.x a10 = r1.w.a(r1.j.f29230c, i3.d.B0, mVar, 0);
        u2.q qVar2 = (u2.q) mVar;
        int hashCode = Long.hashCode(qVar2.T);
        c3.o l4 = qVar2.l();
        i3.t c5 = i3.a.c(y10, mVar);
        h4.h.f11920i.getClass();
        h4.f fVar = h4.g.f11903b;
        f2 f2Var = qVar2.f33969a;
        qVar2.b0();
        if (qVar2.S) {
            qVar2.k(fVar);
        } else {
            qVar2.k0();
        }
        u2.r.J(h4.g.f11907f, a10, mVar);
        u2.r.J(h4.g.f11906e, l4, mVar);
        u2.r.y(mVar, Integer.valueOf(hashCode), h4.g.f11908g);
        u2.r.F(h4.g.f11909h, mVar);
        u2.r.J(h4.g.f11905d, c5, mVar);
        qVar2.X(1284111366);
        int i11 = 0;
        for (Object obj : SkipDuration.getEntries()) {
            int i12 = i11 + 1;
            if (i11 >= 0) {
                SkipDuration skipDuration2 = (SkipDuration) obj;
                String R = kj.c.R(mVar, inAppSkipDurationLabel(inAppSkipDirection, skipDuration2));
                if (skipDuration == skipDuration2) {
                    z6 = z10;
                } else {
                    z6 = false;
                }
                boolean f10 = qVar2.f(lVar) | qVar2.d(skipDuration2.ordinal()) | qVar2.h(bottomSheetControl);
                Object L = qVar2.L();
                if (f10 || L == u2.l.f33918a) {
                    L = new c3.b(lVar, skipDuration2, bottomSheetControl, 21);
                    qVar2.h0(L);
                }
                BluetoothActionSelectorSheetKt.ActionItem(R, z6, (ho.a) L, mVar, 0);
                if (i11 < ig.f.y(SkipDuration.getEntries())) {
                    qVar2.X(242489415);
                    DividerKt.m1827DivideriJQMabo(r1.d.G(qVar, EchoTheme.INSTANCE.getSpacings(mVar, EchoTheme.$stable).getX5(), t2.u.P, 2), 0L, mVar, 0, 2);
                    qVar2.p(false);
                } else {
                    qVar2.X(242586476);
                    qVar2.p(false);
                }
                i11 = i12;
                z10 = true;
            } else {
                ig.f.U();
                throw null;
            }
        }
        qVar2.p(false);
        r1.d.g(p2.f(qVar, EchoTheme.INSTANCE.getSpacings(mVar, EchoTheme.$stable).getX5()), mVar);
        qVar2.p(true);
        return sn.z.f31622a;
    }

    public static final sn.z InAppSkipDurationSelectorSheet$lambda$0$0$0$0$0(ho.l lVar, SkipDuration skipDuration, BottomSheetControl bottomSheetControl) {
        lVar.invoke(skipDuration);
        bottomSheetControl.close();
        return sn.z.f31622a;
    }

    public static final sn.z InAppSkipDurationSelectorSheet$lambda$1(InAppSkipDirection inAppSkipDirection, SkipDuration skipDuration, ho.l lVar, ho.a aVar, int i10, u2.m mVar, int i11) {
        InAppSkipDurationSelectorSheet(inAppSkipDirection, skipDuration, lVar, aVar, mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final int inAppSkipDurationLabel(InAppSkipDirection inAppSkipDirection, SkipDuration skipDuration) {
        inAppSkipDirection.getClass();
        skipDuration.getClass();
        int i10 = WhenMappings.$EnumSwitchMapping$1[inAppSkipDirection.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                int i11 = WhenMappings.$EnumSwitchMapping$0[skipDuration.ordinal()];
                if (i11 != 1) {
                    if (i11 == 2) {
                        return R.string.player_preferences_controls_skip_backward_30;
                    }
                    c6.p();
                    return 0;
                }
                return R.string.player_preferences_controls_skip_backward_15;
            }
            c6.p();
            return 0;
        }
        int i12 = WhenMappings.$EnumSwitchMapping$0[skipDuration.ordinal()];
        if (i12 != 1) {
            if (i12 == 2) {
                return R.string.player_preferences_controls_skip_forward_30;
            }
            c6.p();
            return 0;
        }
        return R.string.player_preferences_controls_skip_forward_15;
    }
}
