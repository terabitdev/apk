package io.elevenlabs.readerapp.ui.previews;

import ig.f;
import io.elevenlabs.domain.model.ExploreVoiceSections;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001\u001a\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0004"}, d2 = {"stubRecommendedVoicesSections", "", "Lio/elevenlabs/domain/model/ExploreVoiceSections$Section$VoiceList;", "stubRecommendedAndOfflineVoicesSections", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class RecommendedVoicesFactoryKt {
    public static final List<ExploreVoiceSections.Section.VoiceList> stubRecommendedAndOfflineVoicesSections() {
        return f.I(new ExploreVoiceSections.Section.VoiceList("Available for offline use", VoicesFactoryKt.stubVoicesList()), new ExploreVoiceSections.Section.VoiceList("Recommended for your read in Polish", VoicesFactoryKt.stubVoicesList()), new ExploreVoiceSections.Section.VoiceList("Your recents", VoicesFactoryKt.stubVoicesList()));
    }

    public static final List<ExploreVoiceSections.Section.VoiceList> stubRecommendedVoicesSections() {
        return f.I(new ExploreVoiceSections.Section.VoiceList("Recommended for your read in Polish", VoicesFactoryKt.stubVoicesList()), new ExploreVoiceSections.Section.VoiceList("Your recents", VoicesFactoryKt.stubVoicesList()));
    }
}
