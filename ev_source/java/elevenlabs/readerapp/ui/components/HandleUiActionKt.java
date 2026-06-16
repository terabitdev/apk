package io.elevenlabs.readerapp.ui.components;

import a2.k3;
import android.gov.nist.javax.sip.parser.TokenNames;
import io.elevenlabs.readerapp.ui.models.UiAction;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import u2.r1;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aE\u0010\b\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0006H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {TokenNames.T, "Lio/elevenlabs/readerapp/ui/models/UiAction;", "action", "Lkotlin/Function0;", "Lsn/z;", "onHandled", "Lkotlin/Function1;", "handler", "HandleUiAction", "(Lio/elevenlabs/readerapp/ui/models/UiAction;Lho/a;Lho/l;Lu2/m;I)V", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class HandleUiActionKt {
    public static final <T> void HandleUiAction(UiAction<? extends T> uiAction, ho.a aVar, ho.l lVar, u2.m mVar, int i10) {
        int i11;
        boolean z6;
        boolean z10;
        boolean z11;
        int i12;
        int i13;
        boolean h10;
        int i14;
        uiAction.getClass();
        aVar.getClass();
        lVar.getClass();
        u2.q qVar = (u2.q) mVar;
        qVar.Z(2079425392);
        if ((i10 & 6) == 0) {
            if ((i10 & 8) == 0) {
                h10 = qVar.f(uiAction);
            } else {
                h10 = qVar.h(uiAction);
            }
            if (h10) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i11 = i14 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.h(aVar)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i11 |= i13;
        }
        if ((i10 & 384) == 0) {
            if (qVar.h(lVar)) {
                i12 = 256;
            } else {
                i12 = 128;
            }
            i11 |= i12;
        }
        boolean z12 = false;
        if ((i11 & 147) != 146) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i11 & 1, z6)) {
            if ((i11 & 14) != 4 && ((i11 & 8) == 0 || !qVar.h(uiAction))) {
                z10 = false;
            } else {
                z10 = true;
            }
            if ((i11 & 896) == 256) {
                z11 = true;
            } else {
                z11 = false;
            }
            boolean z13 = z10 | z11;
            if ((i11 & 112) == 32) {
                z12 = true;
            }
            boolean z14 = z13 | z12;
            Object L = qVar.L();
            if (z14 || L == u2.l.f33918a) {
                L = new HandleUiActionKt$HandleUiAction$1$1(uiAction, lVar, aVar, null);
                qVar.h0(L);
            }
            u2.r.f((ho.p) L, uiAction, qVar);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new k3(i10, 8, uiAction, aVar, lVar);
        }
    }

    public static final sn.z HandleUiAction$lambda$1(UiAction uiAction, ho.a aVar, ho.l lVar, int i10, u2.m mVar, int i11) {
        HandleUiAction(uiAction, aVar, lVar, mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static /* synthetic */ sn.z a(UiAction uiAction, ho.a aVar, ho.l lVar, int i10, u2.m mVar, int i11) {
        return HandleUiAction$lambda$1(uiAction, aVar, lVar, i10, mVar, i11);
    }
}
