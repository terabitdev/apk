package io.elevenlabs.readerapp.ui.components;

import io.elevenlabs.domain.model.MiniReadGridSection;
import io.elevenlabs.readerapp.ui.previews.HomeFactoryKt;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class ComposableSingletons$MiniReadGridKt {
    public static final ComposableSingletons$MiniReadGridKt INSTANCE = new ComposableSingletons$MiniReadGridKt();
    private static ho.p lambda$142583706 = new c3.j(new im.d(14), false, 142583706);

    public static final sn.z lambda_142583706$lambda$0(u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            List stubMiniReadGridItems$default = HomeFactoryKt.stubMiniReadGridItems$default(0, 1, null);
            Object L = qVar.L();
            if (L == u2.l.f33918a) {
                L = new io.elevenlabs.highlighter.z(25);
                qVar.h0(L);
            }
            MiniReadGridKt.MiniReadGrid(stubMiniReadGridItems$default, (ho.l) L, null, qVar, 48, 4);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z lambda_142583706$lambda$0$0$0(MiniReadGridSection.Item item) {
        item.getClass();
        return sn.z.f31622a;
    }

    public final ho.p getLambda$142583706$app_productionRelease() {
        return lambda$142583706;
    }
}
