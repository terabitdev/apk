package io.elevenlabs.ui.components;

import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ComposableSingletons$SegmentedSelectorControlKt {
    public static final ComposableSingletons$SegmentedSelectorControlKt INSTANCE = new ComposableSingletons$SegmentedSelectorControlKt();

    /* renamed from: lambda$-1743059096 */
    private static ho.p f663lambda$1743059096 = new c3.j(new n0(6), false, -1743059096);

    public static final sn.z lambda__1743059096$lambda$0(u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            List I = ig.f.I("All", "Books", "Articles");
            Object L = qVar.L();
            if (L == u2.l.f33918a) {
                L = new z(28);
                qVar.h0(L);
            }
            SegmentedSelectorControlKt.SegmentedSelectorControl(I, 1, (ho.l) L, r1.d.E(i3.q.f13017a, 16), null, qVar, 3510, 16);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z lambda__1743059096$lambda$0$0$0(int i10) {
        return sn.z.f31622a;
    }

    /* renamed from: getLambda$-1743059096$ui_release */
    public final ho.p m1819getLambda$1743059096$ui_release() {
        return f663lambda$1743059096;
    }
}
