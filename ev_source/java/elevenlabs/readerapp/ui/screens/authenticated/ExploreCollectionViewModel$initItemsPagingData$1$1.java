package io.elevenlabs.readerapp.ui.screens.authenticated;

import io.elevenlabs.domain.model.ExploreRead;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final /* synthetic */ class ExploreCollectionViewModel$initItemsPagingData$1$1 extends kotlin.jvm.internal.j implements ho.l {
    public ExploreCollectionViewModel$initItemsPagingData$1$1(Object obj) {
        super(1, 0, ExploreCollectionViewModel.class, obj, "fetchPricesFromItems", "fetchPricesFromItems(Ljava/util/List;)V");
    }

    public final void invoke(List<ExploreRead> list) {
        list.getClass();
        ((ExploreCollectionViewModel) this.receiver).fetchPricesFromItems(list);
    }

    @Override // ho.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((List<ExploreRead>) obj);
        return sn.z.f31622a;
    }
}
