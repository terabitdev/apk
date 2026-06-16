package io.elevenlabs.readerapp.ui.components;

import io.elevenlabs.domain.model.ReadMeta;
import io.elevenlabs.readerapp.ui.previews.ReadsFactoryKt;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class ComposableSingletons$ReadSectionKt {
    public static final ComposableSingletons$ReadSectionKt INSTANCE = new ComposableSingletons$ReadSectionKt();

    /* renamed from: lambda$-272376320 */
    private static ho.p f105lambda$272376320 = new c3.j(new o(0), false, -272376320);

    public static final sn.z lambda__272376320$lambda$0(u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            ReadMeta stubReadMeta$default = ReadsFactoryKt.stubReadMeta$default(null, 1, null);
            Object L = qVar.L();
            if (L == u2.l.f33918a) {
                L = new io.elevenlabs.highlighter.z(26);
                qVar.h0(L);
            }
            ReadSectionKt.ReadSection(stubReadMeta$default, "Book 1", null, (ho.l) L, qVar, 3120, 4);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z lambda__272376320$lambda$0$0$0(String str) {
        str.getClass();
        return sn.z.f31622a;
    }

    /* renamed from: getLambda$-272376320$app_productionRelease */
    public final ho.p m1080getLambda$272376320$app_productionRelease() {
        return f105lambda$272376320;
    }
}
