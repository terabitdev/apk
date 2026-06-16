package io.elevenlabs.readerapp.ui.screens.authenticated.explore;

import com.google.protobuf.c6;
import io.elevenlabs.domain.model.ExploreRead;
import io.elevenlabs.domain.model.ReadsExplorePage;
import io.elevenlabs.readerapp.ui.delegates.PriceFetcherKt;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\u001a\u0018\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0001H\u0002\u001a&\u0010\u0004\u001a\u00020\u0005*\u00020\u00052\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0007H\u0002¨\u0006\b"}, d2 = {"extractProductIds", "", "", "Lio/elevenlabs/domain/model/ReadsExplorePage$Section;", "withUpdatedFilters", "Lio/elevenlabs/readerapp/ui/screens/authenticated/explore/ExploreState;", "newFilters", "", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ExploreViewModelKt {
    public static final List<String> extractProductIds(List<? extends ReadsExplorePage.Section> list) {
        List<ExploreRead> reads;
        ArrayList arrayList = new ArrayList();
        for (ReadsExplorePage.Section section : list) {
            if (section instanceof ReadsExplorePage.Section.GetReadsExploreHighlightedCarousel) {
                reads = ((ReadsExplorePage.Section.GetReadsExploreHighlightedCarousel) section).getReads();
            } else {
                boolean z6 = section instanceof ReadsExplorePage.Section.GetReadsExploreSmallGrid;
                tn.t tVar = tn.t.f33547a;
                if (!z6) {
                    if (section instanceof ReadsExplorePage.Section.GetReadsExploreLargeGrid) {
                        reads = ((ReadsExplorePage.Section.GetReadsExploreLargeGrid) section).getReads();
                    } else if (!(section instanceof ReadsExplorePage.Section.GetReadsExploreCardCollection) && !(section instanceof ReadsExplorePage.Section.GetReadsExploreVoiceCollection) && !(section instanceof ReadsExplorePage.Section.GetReadsExploreHeroCarousel) && !(section instanceof ReadsExplorePage.Section.GetReadsExploreTitleSubtitle)) {
                        c6.p();
                        return null;
                    }
                }
                reads = tVar;
            }
            tn.o.g0(reads, arrayList);
        }
        return PriceFetcherKt.extractProductIds(arrayList);
    }

    public static final ExploreState withUpdatedFilters(ExploreState exploreState, Map<String, ? extends List<String>> map) {
        return ExploreState.copy$default(exploreState, false, null, null, null, map, null, null, null, null, null, 1007, null);
    }
}
