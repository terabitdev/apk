package io.elevenlabs.domain.model;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lio/elevenlabs/domain/model/SearchResult;", "", "GlobalRead", "Collection", "Lio/elevenlabs/domain/model/SearchResult$Collection;", "Lio/elevenlabs/domain/model/SearchResult$GlobalRead;", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public interface SearchResult {

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lio/elevenlabs/domain/model/SearchResult$Collection;", "Lio/elevenlabs/domain/model/SearchResult;", "collection", "Lio/elevenlabs/domain/model/CollectionMeta;", "<init>", "(Lio/elevenlabs/domain/model/CollectionMeta;)V", "getCollection", "()Lio/elevenlabs/domain/model/CollectionMeta;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final /* data */ class Collection implements SearchResult {
        private final CollectionMeta collection;

        public Collection(CollectionMeta collectionMeta) {
            collectionMeta.getClass();
            this.collection = collectionMeta;
        }

        public static /* synthetic */ Collection copy$default(Collection collection, CollectionMeta collectionMeta, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                collectionMeta = collection.collection;
            }
            return collection.copy(collectionMeta);
        }

        /* renamed from: component1, reason: from getter */
        public final CollectionMeta getCollection() {
            return this.collection;
        }

        public final Collection copy(CollectionMeta collection) {
            collection.getClass();
            return new Collection(collection);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if ((other instanceof Collection) && m.c(this.collection, ((Collection) other).collection)) {
                return true;
            }
            return false;
        }

        public final CollectionMeta getCollection() {
            return this.collection;
        }

        public int hashCode() {
            return this.collection.hashCode();
        }

        public String toString() {
            return "Collection(collection=" + this.collection + Separators.RPAREN;
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lio/elevenlabs/domain/model/SearchResult$GlobalRead;", "Lio/elevenlabs/domain/model/SearchResult;", "read", "Lio/elevenlabs/domain/model/ReadMeta;", "<init>", "(Lio/elevenlabs/domain/model/ReadMeta;)V", "getRead", "()Lio/elevenlabs/domain/model/ReadMeta;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final /* data */ class GlobalRead implements SearchResult {
        private final ReadMeta read;

        public GlobalRead(ReadMeta readMeta) {
            readMeta.getClass();
            this.read = readMeta;
        }

        public static /* synthetic */ GlobalRead copy$default(GlobalRead globalRead, ReadMeta readMeta, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                readMeta = globalRead.read;
            }
            return globalRead.copy(readMeta);
        }

        /* renamed from: component1, reason: from getter */
        public final ReadMeta getRead() {
            return this.read;
        }

        public final GlobalRead copy(ReadMeta read) {
            read.getClass();
            return new GlobalRead(read);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if ((other instanceof GlobalRead) && m.c(this.read, ((GlobalRead) other).read)) {
                return true;
            }
            return false;
        }

        public final ReadMeta getRead() {
            return this.read;
        }

        public int hashCode() {
            return this.read.hashCode();
        }

        public String toString() {
            return "GlobalRead(read=" + this.read + Separators.RPAREN;
        }
    }
}
