package io.elevenlabs.ui.components;

import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"", "active", "Lsn/z;", "KeepScreenOn", "(ZLu2/m;I)V", "ui_release"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class KeepScreenOnKt {
    public static final void KeepScreenOn(boolean z6, u2.m mVar, int i10) {
        int i11;
        boolean z10;
        int i12;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(2125744213);
        if ((i10 & 6) == 0) {
            if (qVar.g(z6)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i11 = i12 | i10;
        } else {
            i11 = i10;
        }
        boolean z11 = false;
        if ((i11 & 3) != 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (qVar.O(i11 & 1, z10)) {
            View view = (View) qVar.j(AndroidCompositionLocals_androidKt.f2295f);
            Boolean valueOf = Boolean.valueOf(z6);
            boolean h10 = qVar.h(view);
            if ((i11 & 14) == 4) {
                z11 = true;
            }
            boolean z12 = h10 | z11;
            Object L = qVar.L();
            if (z12 || L == u2.l.f33918a) {
                L = new io.elevenlabs.readerapp.ui.screens.authenticated.c0(view, 2, z6);
                qVar.h0(L);
            }
            u2.r.c(valueOf, (ho.l) L, qVar);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new j1(z6, i10);
        }
    }

    public static final u2.h0 KeepScreenOn$lambda$0$0(final View view, boolean z6, u2.i0 i0Var) {
        i0Var.getClass();
        view.setKeepScreenOn(z6);
        return new u2.h0() { // from class: io.elevenlabs.ui.components.KeepScreenOnKt$KeepScreenOn$lambda$0$0$$inlined$onDispose$1
            @Override // u2.h0
            public void dispose() {
                view.setKeepScreenOn(false);
            }
        };
    }

    public static final sn.z KeepScreenOn$lambda$1(boolean z6, int i10, u2.m mVar, int i11) {
        KeepScreenOn(z6, mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }
}
