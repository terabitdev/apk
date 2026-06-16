package io.elevenlabs.readerapp.ui.previews;

import android.gov.nist.javax.sip.header.ParameterNames;
import ig.f;
import io.elevenlabs.domain.model.CollectionCategory;
import io.elevenlabs.domain.model.CollectionMeta;
import io.elevenlabs.domain.model.ExploreCollectionDetails;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001\u001a\u0006\u0010\u0003\u001a\u00020\u0002\u001a\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, d2 = {"stubCollectionsList", "", "Lio/elevenlabs/domain/model/CollectionMeta;", "stubCollectionMeta", "stubExploreCollectionDetails", "Lio/elevenlabs/domain/model/ExploreCollectionDetails;", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class CollectionFactoryKt {
    public static final CollectionMeta stubCollectionMeta() {
        return new CollectionMeta("id", "title", null, "description", null, false, new Date(1714026044L), null, null, 5L, false, null);
    }

    public static final List<CollectionMeta> stubCollectionsList() {
        return f.I(CollectionMeta.copy$default(stubCollectionMeta(), "links", "Links", null, null, null, false, null, null, null, null, false, null, 4060, null), CollectionMeta.copy$default(stubCollectionMeta(), "books", "Books", null, null, null, false, null, null, null, null, false, null, 4060, null), CollectionMeta.copy$default(stubCollectionMeta(), ParameterNames.TEXT, "Text", null, null, null, false, null, null, null, null, false, null, 4060, null), CollectionMeta.copy$default(stubCollectionMeta(), "custom-short", "Custom collection", null, null, null, true, null, null, null, null, false, null, 4060, null), CollectionMeta.copy$default(stubCollectionMeta(), "custom-long", "Custom collection with very long title that wont fit single line", null, null, null, false, new Date(1714026044L), null, null, 5L, false, null, 3484, null), CollectionMeta.copy$default(stubCollectionMeta(), "user-collection", "User-made collection", null, null, null, false, new Date(1714026044L), null, null, 7L, true, CollectionMeta.Icon.ForkKnife, 412, null));
    }

    public static final ExploreCollectionDetails stubExploreCollectionDetails() {
        return new ExploreCollectionDetails("art-of-war", "The Art of War", "Ancient Chinese military treatise", "A classic text on strategy and tactics, attributed to the ancient Chinese military strategist Sun Tzu.", CollectionCategory.Curated, "https://elevenlabs.io/collection/art-of-war", f.I("9 books", "Updated 7 minutes ago"));
    }
}
