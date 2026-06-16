package io.elevenlabs.readerapp.ui.components.homev3;

import a2.e3;
import c3.j;
import fm.d;
import ho.p;
import ig.f;
import io.elevenlabs.domain.model.HighlightedCollectionsRowSection;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;
import u2.l;
import u2.m;
import u2.q;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class ComposableSingletons$HighlightedCollectionsRowKt {
    public static final ComposableSingletons$HighlightedCollectionsRowKt INSTANCE = new ComposableSingletons$HighlightedCollectionsRowKt();
    private static p lambda$633805711 = new j(new e3(11), false, 633805711);

    public static final z lambda_633805711$lambda$0(m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            List I = f.I(new HighlightedCollectionsRowSection.Item("Fantasy", "Epic tales of magic and adventure", "elevenlabs://collection/fantasy", "https://example.com/fantasy.jpg", "123"), new HighlightedCollectionsRowSection.Item("Science Fiction", "Explore the future and beyond", "elevenlabs://collection/scifi", "https://example.com/scifi.jpg", "123"), new HighlightedCollectionsRowSection.Item("Romance", null, "elevenlabs://collection/romance", "https://example.com/romance.jpg", "123"));
            Object L = qVar.L();
            if (L == l.f33918a) {
                L = new d(3);
                qVar.h0(L);
            }
            HighlightedCollectionsRowKt.HighlightedCollectionsRowV3("Top picks for you", I, (ho.l) L, null, qVar, 390, 8);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z lambda_633805711$lambda$0$0$0(HighlightedCollectionsRowSection.Item item) {
        item.getClass();
        return z.f31622a;
    }

    public final p getLambda$633805711$app_productionRelease() {
        return lambda$633805711;
    }
}
