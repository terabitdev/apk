package io.elevenlabs.readerapp.ui.screens.authenticated.explore.elements;

import ho.p;
import io.elevenlabs.domain.model.ReadsExplorePage;
import io.elevenlabs.readerapp.ui.previews.ExploreFactoryKt;
import io.elevenlabs.ui.components.scaffolds.CenteredContentScaffoldKt;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;
import u2.l;
import u2.m;
import u2.q;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ComposableSingletons$ExploreVoiceCollectionKt {
    public static final ComposableSingletons$ExploreVoiceCollectionKt INSTANCE = new ComposableSingletons$ExploreVoiceCollectionKt();
    private static p lambda$1563181681 = new c3.j(new b(27), false, 1563181681);
    private static p lambda$1664331076 = new c3.j(new b(28), false, 1664331076);

    /* renamed from: lambda$-878441353 */
    private static p f347lambda$878441353 = new c3.j(new b(29), false, -878441353);
    private static p lambda$1898033092 = new c3.j(new d(0), false, 1898033092);

    public static final z lambda_1563181681$lambda$0(m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            List I = ig.f.I(new ReadsExplorePage.Section.GetReadsExploreVoiceCollection.VoiceItem("voice-1", "Sir Michael Caine", "Legendary British actor", "https://i.imgur.com/D4p4Xhz.jpeg", ExploreFactoryKt.stubExploreReadList(4), "elevenlabs://collection/voice-1"), new ReadsExplorePage.Section.GetReadsExploreVoiceCollection.VoiceItem("voice-2", "Morgan Freeman", "Award-winning narrator", "https://i.imgur.com/D4p4Xhz.jpeg", ExploreFactoryKt.stubExploreReadList(3), null));
            Object L = qVar.L();
            u2.e eVar = l.f33918a;
            if (L == eVar) {
                L = new io.elevenlabs.readerapp.ui.screens.authenticated.explore.k(28);
                qVar.h0(L);
            }
            ho.l lVar = (ho.l) L;
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new c(10);
                qVar.h0(L2);
            }
            ExploreVoiceCollectionKt.ExploreVoiceCollection("Popular With", "Iconic Voices", I, lVar, (ho.a) L2, null, qVar, 27702, 32);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z lambda_1563181681$lambda$0$0$0(String str) {
        str.getClass();
        return z.f31622a;
    }

    public static final z lambda_1664331076$lambda$0(m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            CenteredContentScaffoldKt.CenteredContentScaffold(null, null, null, lambda$1563181681, qVar, 3072, 7);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z lambda_1898033092$lambda$0(m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            CenteredContentScaffoldKt.CenteredContentScaffold(null, null, null, f347lambda$878441353, qVar, 3072, 7);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z lambda__878441353$lambda$0(m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            List H = ig.f.H(new ReadsExplorePage.Section.GetReadsExploreVoiceCollection.VoiceItem("voice-1", "Jane Doe", null, null, ExploreFactoryKt.stubExploreReadList(3), null));
            Object L = qVar.L();
            if (L == l.f33918a) {
                L = new io.elevenlabs.readerapp.ui.screens.authenticated.explore.k(27);
                qVar.h0(L);
            }
            ExploreVoiceCollectionKt.ExploreVoiceCollection("Iconic Voices", null, H, (ho.l) L, null, null, qVar, 27702, 32);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z lambda__878441353$lambda$0$0$0(String str) {
        str.getClass();
        return z.f31622a;
    }

    /* renamed from: getLambda$-878441353$app_productionRelease */
    public final p m1395getLambda$878441353$app_productionRelease() {
        return f347lambda$878441353;
    }

    public final p getLambda$1563181681$app_productionRelease() {
        return lambda$1563181681;
    }

    public final p getLambda$1664331076$app_productionRelease() {
        return lambda$1664331076;
    }

    public final p getLambda$1898033092$app_productionRelease() {
        return lambda$1898033092;
    }
}
