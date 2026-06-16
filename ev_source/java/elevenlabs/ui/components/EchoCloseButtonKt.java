package io.elevenlabs.ui.components;

import io.elevenlabs.ui.echo.EchoTheme;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import q2.d5;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u001d\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u000f\u0010\u0005\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/Function0;", "Lsn/z;", "onClose", "EchoCloseButton", "(Lho/a;Lu2/m;I)V", "Preview_EchoCloseButton", "(Lu2/m;I)V", "ui_release"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class EchoCloseButtonKt {
    public static final void EchoCloseButton(ho.a aVar, u2.m mVar, int i10) {
        int i11;
        boolean z6;
        ho.a aVar2;
        u2.q qVar;
        int i12;
        aVar.getClass();
        u2.q qVar2 = (u2.q) mVar;
        qVar2.Z(1367519611);
        if ((i10 & 6) == 0) {
            if (qVar2.h(aVar)) {
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
        if (qVar2.O(i11 & 1, z6)) {
            aVar2 = aVar;
            d5.g(aVar2, r1.p2.o(i3.q.f13017a, 48), false, d5.q(p3.x.f26437l, EchoTheme.INSTANCE.getColors(qVar2, 6).getIcon().getPrimary(qVar2, 0), 0L, 0L, qVar2, 12), null, ComposableSingletons$EchoCloseButtonKt.INSTANCE.getLambda$1431831837$ui_release(), qVar2, (i11 & 14) | 1572912, 52);
            qVar = qVar2;
        } else {
            aVar2 = aVar;
            qVar = qVar2;
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new hm.b(aVar2, i10, 15);
        }
    }

    public static final sn.z EchoCloseButton$lambda$0(ho.a aVar, int i10, u2.m mVar, int i11) {
        EchoCloseButton(aVar, mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_EchoCloseButton(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(580482714);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            Object L = qVar.L();
            if (L == u2.l.f33918a) {
                L = new u0(0);
                qVar.h0(L);
            }
            EchoCloseButton((ho.a) L, qVar, 6);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new x(i10, 17);
        }
    }

    public static final sn.z Preview_EchoCloseButton$lambda$1(int i10, u2.m mVar, int i11) {
        Preview_EchoCloseButton(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }
}
