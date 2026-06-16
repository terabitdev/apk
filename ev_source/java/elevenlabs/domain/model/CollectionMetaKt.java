package io.elevenlabs.domain.model;

import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0000\u0010\u0003\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0003¨\u0006\u0005"}, d2 = {"isNewsletter", "", "Lio/elevenlabs/domain/model/CollectionMeta;", "(Lio/elevenlabs/domain/model/CollectionMeta;)Z", "isReadLater", "domain"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class CollectionMetaKt {
    public static final boolean isNewsletter(CollectionMeta collectionMeta) {
        collectionMeta.getClass();
        if (!m.c(collectionMeta.getCategory(), "newsletter") && !m.c(collectionMeta.getCategory(), "feed")) {
            return false;
        }
        return true;
    }

    public static final boolean isReadLater(CollectionMeta collectionMeta) {
        collectionMeta.getClass();
        return m.c(collectionMeta.getId(), CollectionMeta.READ_LATER_ID);
    }
}
