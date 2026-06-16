package io.elevenlabs.readerapp.ui.components.homev3;

import a2.e3;
import c3.j;
import fm.d;
import ho.p;
import io.elevenlabs.domain.model.EmptyStateSection;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;
import u2.l;
import u2.m;
import u2.q;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class ComposableSingletons$EmptyStateSectionKt {
    public static final ComposableSingletons$EmptyStateSectionKt INSTANCE = new ComposableSingletons$EmptyStateSectionKt();

    /* renamed from: lambda$-1362111555 */
    private static p f161lambda$1362111555 = new j(new e3(9), false, -1362111555);

    public static final z lambda__1362111555$lambda$0(m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            EmptyStateSection emptyStateSection = new EmptyStateSection("No recent listens", "Start listening and your recent reads will appear here when you do", "Explore library", "elevenlabs://library");
            Object L = qVar.L();
            if (L == l.f33918a) {
                L = new d(1);
                qVar.h0(L);
            }
            EmptyStateSectionKt.EmptyStateSectionV3(emptyStateSection, (ho.l) L, null, qVar, 48, 4);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z lambda__1362111555$lambda$0$0$0(String str) {
        str.getClass();
        return z.f31622a;
    }

    /* renamed from: getLambda$-1362111555$app_productionRelease */
    public final p m1169getLambda$1362111555$app_productionRelease() {
        return f161lambda$1362111555;
    }
}
