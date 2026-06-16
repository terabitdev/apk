package io.elevenlabs.readerapp.ui.components;

import io.elevenlabs.domain.model.AuthorProfileSection;
import io.elevenlabs.domain.model.SeriesSection;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class ComposableSingletons$SeriesSectionKt {
    public static final ComposableSingletons$SeriesSectionKt INSTANCE = new ComposableSingletons$SeriesSectionKt();

    /* renamed from: lambda$-2145224672 */
    private static ho.p f107lambda$2145224672 = new c3.j(new o(2), false, -2145224672);

    /* renamed from: lambda$-1217440869 */
    private static ho.p f106lambda$1217440869 = new c3.j(new o(3), false, -1217440869);

    public static final sn.z lambda__1217440869$lambda$0(u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            SeriesSectionKt.SeriesSection(new AuthorProfileSection.Series(new SeriesSection("elevenlabs://series/narnia", "The Chronicles of Narnia", "7 book series", null)), null, qVar, 0, 2);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z lambda__2145224672$lambda$0(u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            SeriesSectionKt.SeriesSection(new AuthorProfileSection.Series(new SeriesSection("elevenlabs://series/lord-of-the-rings", "The Lord of The Rings", "3 book series", "https://example.com/lotr-showcase.jpg")), null, qVar, 0, 2);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    /* renamed from: getLambda$-1217440869$app_productionRelease */
    public final ho.p m1081getLambda$1217440869$app_productionRelease() {
        return f106lambda$1217440869;
    }

    /* renamed from: getLambda$-2145224672$app_productionRelease */
    public final ho.p m1082getLambda$2145224672$app_productionRelease() {
        return f107lambda$2145224672;
    }
}
