package io.elevenlabs.readerapp.core;

import a2.q0;
import androidx.lifecycle.r1;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.protobuf.c6;
import i3.t;
import io.elevenlabs.domain.services.ToastService;
import io.elevenlabs.ui.R;
import io.elevenlabs.ui.components.ToastContainerKt;
import io.elevenlabs.ui.echo.EchoTheme;
import io.elevenlabs.ui.echo.components.EchoToastKt;
import io.livekit.android.rpc.RpcError;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.e0;
import livekit.LivekitInternal$NodeStats;
import r1.c3;
import r1.u0;
import sn.z;
import t2.u;
import u2.q;
import u2.r;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001a-\u0010\u0006\u001a\u00020\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001aM\u0010\u000b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u001e\u0010\n\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u00002\u0014\b\u0002\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0003¢\u0006\u0004\b\u000b\u0010\f\u001a\u0013\u0010\u000e\u001a\u00020\r*\u00020\rH\u0003¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lkotlin/Function1;", "", "Lsn/z;", "onNavigateToDeeplink", "Lio/elevenlabs/readerapp/core/ToastViewModel;", "vm", "ToastOverlay", "(Lho/l;Lio/elevenlabs/readerapp/core/ToastViewModel;Lu2/m;II)V", "Lio/elevenlabs/readerapp/core/ToastState;", RemoteConfigConstants.ResponseFieldKey.STATE, "action", "ToastOverlayUI", "(Lio/elevenlabs/readerapp/core/ToastState;Lho/l;Lho/l;Lu2/m;II)V", "Li3/t;", "toastOverlay", "(Li3/t;Lu2/m;I)Li3/t;", "Lio/elevenlabs/domain/services/ToastService$ToastVariant;", "variant", "", "defaultIconFor", "(Lio/elevenlabs/domain/services/ToastService$ToastVariant;)Ljava/lang/Integer;", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class ToastViewModelKt {

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ToastService.ToastVariant.values().length];
            try {
                iArr[ToastService.ToastVariant.ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ToastService.ToastVariant.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ToastService.ToastVariant.NEUTRAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void ToastOverlay(ho.l lVar, ToastViewModel toastViewModel, u2.m mVar, int i10, int i11) {
        int i12;
        boolean z6;
        ho.l lVar2;
        q qVar;
        q qVar2;
        q7.c cVar;
        boolean h10;
        Object L;
        int i13;
        int i14;
        lVar.getClass();
        q qVar3 = (q) mVar;
        qVar3.Z(1206282534);
        if ((i10 & 6) == 0) {
            if (qVar3.h(lVar)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i12 = i14 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if ((i11 & 2) == 0 && qVar3.h(toastViewModel)) {
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
                r1 a10 = r7.a.a(qVar3);
                if (a10 != null) {
                    qVar2 = qVar3;
                    pl.f o6 = tb.a.o(a10, qVar2);
                    if (a10 instanceof androidx.lifecycle.o) {
                        cVar = ((androidx.lifecycle.o) a10).getDefaultViewModelCreationExtras();
                    } else {
                        cVar = q7.a.f28123b;
                    }
                    toastViewModel = (ToastViewModel) gg.b.j0(e0.f20562a.b(ToastViewModel.class), a10, null, o6, cVar, qVar2);
                    i12 &= -113;
                    qVar2.q();
                    ToastState toastState = (ToastState) r.o(toastViewModel.getStateFlow(), qVar2, 0).getValue();
                    h10 = qVar2.h(toastViewModel);
                    L = qVar2.L();
                    if (!h10 || L == u2.l.f33918a) {
                        L = new m(toastViewModel, 1);
                        qVar2.h0(L);
                    }
                    q qVar4 = qVar2;
                    lVar2 = lVar;
                    ToastOverlayUI(toastState, (ho.l) L, lVar2, qVar4, (i12 << 6) & 896, 0);
                    qVar = qVar4;
                } else {
                    c6.x("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
            }
            qVar2 = qVar3;
            qVar2.q();
            ToastState toastState2 = (ToastState) r.o(toastViewModel.getStateFlow(), qVar2, 0).getValue();
            h10 = qVar2.h(toastViewModel);
            L = qVar2.L();
            if (!h10) {
            }
            L = new m(toastViewModel, 1);
            qVar2.h0(L);
            q qVar42 = qVar2;
            lVar2 = lVar;
            ToastOverlayUI(toastState2, (ho.l) L, lVar2, qVar42, (i12 << 6) & 896, 0);
            qVar = qVar42;
        } else {
            lVar2 = lVar;
            qVar = qVar3;
            qVar.R();
        }
        ToastViewModel toastViewModel2 = toastViewModel;
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new p(lVar2, toastViewModel2, i10, i11, 0);
        }
    }

    public static final z ToastOverlay$lambda$0$0(ToastViewModel toastViewModel, ho.l lVar) {
        lVar.getClass();
        lVar.invoke(toastViewModel);
        return z.f31622a;
    }

    public static final z ToastOverlay$lambda$1(ho.l lVar, ToastViewModel toastViewModel, int i10, int i11, u2.m mVar, int i12) {
        ToastOverlay(lVar, toastViewModel, mVar, r.M(i10 | 1), i11);
        return z.f31622a;
    }

    private static final void ToastOverlayUI(ToastState toastState, ho.l lVar, ho.l lVar2, u2.m mVar, int i10, int i11) {
        int i12;
        int i13;
        boolean z6;
        int i14;
        int i15;
        q qVar = (q) mVar;
        qVar.Z(-764699994);
        if ((i10 & 6) == 0) {
            if (qVar.h(toastState)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i12 = i15 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.h(lVar)) {
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
            if (qVar.h(lVar2)) {
                i13 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i13 = 128;
            }
            i12 |= i13;
        }
        boolean z10 = false;
        if ((i12 & 147) != 146) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i12 & 1, z6)) {
            u2.e eVar = u2.l.f33918a;
            if (i16 != 0) {
                Object L = qVar.L();
                if (L == eVar) {
                    L = new n(12);
                    qVar.h0(L);
                }
                lVar2 = (ho.l) L;
            }
            c3.j d10 = c3.k.d(1189331743, true, new q0(toastState, lVar, lVar2, 2), qVar);
            if ((i12 & 112) == 32) {
                z10 = true;
            }
            Object L2 = qVar.L();
            if (z10 || L2 == eVar) {
                L2 = new o(lVar, 1);
                qVar.h0(L2);
            }
            ToastContainerKt.ToastContainer(d10, (ho.a) L2, toastState.getShowToast(), qVar, 6);
        } else {
            qVar.R();
        }
        ho.l lVar3 = lVar2;
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new fm.f(toastState, lVar, lVar3, i10, i11, 7);
        }
    }

    public static final z ToastOverlayUI$lambda$0$0(String str) {
        str.getClass();
        return z.f31622a;
    }

    public static final z ToastOverlayUI$lambda$1(ToastState toastState, ho.l lVar, ho.l lVar2, u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            ToastService.Toast toast = toastState.getToast();
            if (toast == null) {
                qVar.X(486506563);
                qVar.p(false);
            } else {
                boolean z10 = toast instanceof ToastService.Toast.Action;
                i3.q qVar2 = i3.q.f13017a;
                u2.e eVar = u2.l.f33918a;
                if (z10) {
                    qVar.X(-2098102799);
                    t tVar = toastOverlay(qVar2, qVar, 6);
                    ToastService.Toast.Action action = (ToastService.Toast.Action) toast;
                    String message = action.getMessage();
                    String title = action.getTitle();
                    boolean f10 = qVar.f(lVar) | qVar.h(toast) | qVar.f(lVar2);
                    Object L = qVar.L();
                    if (f10 || L == eVar) {
                        L = new c3.b(lVar, toast, lVar2, 5);
                        qVar.h0(L);
                    }
                    EchoToastKt.EchoToast(message, tVar, title, null, (ho.a) L, null, qVar, 0, 40);
                    qVar.p(false);
                } else if (toast instanceof ToastService.Toast.Message) {
                    qVar.X(-2097719143);
                    t tVar2 = toastOverlay(qVar2, qVar, 6);
                    ToastService.Toast.Message message2 = (ToastService.Toast.Message) toast;
                    String message3 = message2.getMessage();
                    Integer icon = message2.getIcon();
                    if (icon == null) {
                        icon = defaultIconFor(message2.getVariant());
                    }
                    Integer num = icon;
                    boolean f11 = qVar.f(lVar);
                    Object L2 = qVar.L();
                    if (f11 || L2 == eVar) {
                        L2 = new o(lVar, 0);
                        qVar.h0(L2);
                    }
                    EchoToastKt.EchoToast(message3, tVar2, null, num, (ho.a) L2, null, qVar, 0, 36);
                    qVar.p(false);
                } else {
                    throw com.google.android.gms.internal.play_billing.b.h(486505514, qVar, false);
                }
            }
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z ToastOverlayUI$lambda$1$0$0(ho.l lVar, ToastService.Toast toast, ho.l lVar2) {
        lVar.invoke(new n(10));
        String deeplink = ((ToastService.Toast.Action) toast).getDeeplink();
        if (deeplink != null) {
            lVar2.invoke(deeplink);
        }
        return z.f31622a;
    }

    public static final z ToastOverlayUI$lambda$1$0$0$0(ToastViewModel toastViewModel) {
        toastViewModel.getClass();
        toastViewModel.onToastClick();
        return z.f31622a;
    }

    public static final z ToastOverlayUI$lambda$1$1$0(ho.l lVar) {
        lVar.invoke(new n(9));
        return z.f31622a;
    }

    public static final z ToastOverlayUI$lambda$1$1$0$0(ToastViewModel toastViewModel) {
        toastViewModel.getClass();
        toastViewModel.onToastClick();
        return z.f31622a;
    }

    public static final z ToastOverlayUI$lambda$2$0(ho.l lVar) {
        lVar.invoke(new n(11));
        return z.f31622a;
    }

    public static final z ToastOverlayUI$lambda$2$0$0(ToastViewModel toastViewModel) {
        toastViewModel.getClass();
        toastViewModel.onToastHidden();
        return z.f31622a;
    }

    public static final z ToastOverlayUI$lambda$3(ToastState toastState, ho.l lVar, ho.l lVar2, int i10, int i11, u2.m mVar, int i12) {
        ToastOverlayUI(toastState, lVar, lVar2, mVar, r.M(i10 | 1), i11);
        return z.f31622a;
    }

    private static final Integer defaultIconFor(ToastService.ToastVariant toastVariant) {
        int i10 = WhenMappings.$EnumSwitchMapping$0[toastVariant.ordinal()];
        if (i10 != 1) {
            if (i10 != 2 && i10 != 3) {
                c6.p();
                return null;
            }
            return null;
        }
        return Integer.valueOf(R.drawable.warning_triangle_filled);
    }

    private static final t toastOverlay(t tVar, u2.m mVar, int i10) {
        WeakHashMap weakHashMap = c3.f29142x;
        t P = r1.d.P(tVar, u0.e(mVar).f29154l);
        EchoTheme echoTheme = EchoTheme.INSTANCE;
        int i11 = EchoTheme.$stable;
        return r1.d.I(P, echoTheme.getSpacings(mVar, i11).getX4(), echoTheme.getSpacings(mVar, i11).getX6(), echoTheme.getSpacings(mVar, i11).getX4(), u.P, 8);
    }
}
