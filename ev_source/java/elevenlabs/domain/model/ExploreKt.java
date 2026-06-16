package io.elevenlabs.domain.model;

import java.util.Map;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0014\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\"\u0015\u0010\u0005\u001a\u00020\u0006*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"coverImageUrl", "", "Lio/elevenlabs/domain/model/ExploreRead;", "size", "Lio/elevenlabs/domain/model/CoverImageSize;", "canBePurchasedIndividually", "", "getCanBePurchasedIndividually", "(Lio/elevenlabs/domain/model/ExploreRead;)Z", "domain"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class ExploreKt {
    public static final String coverImageUrl(ExploreRead exploreRead, CoverImageSize coverImageSize) {
        String str;
        exploreRead.getClass();
        coverImageSize.getClass();
        Map<String, String> coverImageUrls = exploreRead.getCoverImageUrls();
        if (coverImageUrls != null && (str = coverImageUrls.get(coverImageSize.getKey())) != null) {
            return str;
        }
        return exploreRead.getArticleImageUrl();
    }

    public static final boolean getCanBePurchasedIndividually(ExploreRead exploreRead) {
        exploreRead.getClass();
        if (exploreRead.getAndroidProductId() != null) {
            return true;
        }
        return false;
    }
}
