package io.elevenlabs.readerapp.ui.screens.authenticated.player.queue;

import android.gov.nist.core.Separators;
import io.elevenlabs.domain.model.MediaItemState;
import io.elevenlabs.domain.model.MediaQueueState;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/queue/PlayerQueueContract;", "", "DomainState", "UiState", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public interface PlayerQueueContract {

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/queue/PlayerQueueContract$DomainState;", "", "Initial", "Data", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/queue/PlayerQueueContract$DomainState$Data;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/queue/PlayerQueueContract$DomainState$Initial;", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public interface DomainState {

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0016HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/queue/PlayerQueueContract$DomainState$Data;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/queue/PlayerQueueContract$DomainState;", "queue", "Lio/elevenlabs/domain/model/MediaQueueState;", "fallbackActiveItem", "Lio/elevenlabs/domain/model/MediaItemState;", "<init>", "(Lio/elevenlabs/domain/model/MediaQueueState;Lio/elevenlabs/domain/model/MediaItemState;)V", "getQueue", "()Lio/elevenlabs/domain/model/MediaQueueState;", "getFallbackActiveItem", "()Lio/elevenlabs/domain/model/MediaItemState;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes4.dex */
        public static final /* data */ class Data implements DomainState {
            public static final int $stable = 8;
            private final MediaItemState fallbackActiveItem;
            private final MediaQueueState queue;

            public Data(MediaQueueState mediaQueueState, MediaItemState mediaItemState) {
                mediaQueueState.getClass();
                this.queue = mediaQueueState;
                this.fallbackActiveItem = mediaItemState;
            }

            public static /* synthetic */ Data copy$default(Data data, MediaQueueState mediaQueueState, MediaItemState mediaItemState, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    mediaQueueState = data.queue;
                }
                if ((i10 & 2) != 0) {
                    mediaItemState = data.fallbackActiveItem;
                }
                return data.copy(mediaQueueState, mediaItemState);
            }

            /* renamed from: component1, reason: from getter */
            public final MediaQueueState getQueue() {
                return this.queue;
            }

            /* renamed from: component2, reason: from getter */
            public final MediaItemState getFallbackActiveItem() {
                return this.fallbackActiveItem;
            }

            public final Data copy(MediaQueueState queue, MediaItemState fallbackActiveItem) {
                queue.getClass();
                return new Data(queue, fallbackActiveItem);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Data)) {
                    return false;
                }
                Data data = (Data) other;
                if (m.c(this.queue, data.queue) && m.c(this.fallbackActiveItem, data.fallbackActiveItem)) {
                    return true;
                }
                return false;
            }

            public final MediaItemState getFallbackActiveItem() {
                return this.fallbackActiveItem;
            }

            public final MediaQueueState getQueue() {
                return this.queue;
            }

            public int hashCode() {
                int hashCode;
                int hashCode2 = this.queue.hashCode() * 31;
                MediaItemState mediaItemState = this.fallbackActiveItem;
                if (mediaItemState == null) {
                    hashCode = 0;
                } else {
                    hashCode = mediaItemState.hashCode();
                }
                return hashCode2 + hashCode;
            }

            public String toString() {
                return "Data(queue=" + this.queue + ", fallbackActiveItem=" + this.fallbackActiveItem + Separators.RPAREN;
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/queue/PlayerQueueContract$DomainState$Initial;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/queue/PlayerQueueContract$DomainState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes4.dex */
        public static final /* data */ class Initial implements DomainState {
            public static final int $stable = 0;
            public static final Initial INSTANCE = new Initial();

            private Initial() {
            }

            public boolean equals(Object other) {
                if (this == other || (other instanceof Initial)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return 420338014;
            }

            public String toString() {
                return "Initial";
            }
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/queue/PlayerQueueContract$UiState;", "", "Loading", "EmptyQueue", "NonEmptyQueue", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/queue/PlayerQueueContract$UiState$EmptyQueue;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/queue/PlayerQueueContract$UiState$Loading;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/queue/PlayerQueueContract$UiState$NonEmptyQueue;", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public interface UiState {

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/queue/PlayerQueueContract$UiState$EmptyQueue;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/queue/PlayerQueueContract$UiState;", "currentItem", "Lio/elevenlabs/domain/model/MediaItemState;", "<init>", "(Lio/elevenlabs/domain/model/MediaItemState;)V", "getCurrentItem", "()Lio/elevenlabs/domain/model/MediaItemState;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes4.dex */
        public static final /* data */ class EmptyQueue implements UiState {
            public static final int $stable = 8;
            private final MediaItemState currentItem;

            public EmptyQueue(MediaItemState mediaItemState) {
                mediaItemState.getClass();
                this.currentItem = mediaItemState;
            }

            public static /* synthetic */ EmptyQueue copy$default(EmptyQueue emptyQueue, MediaItemState mediaItemState, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    mediaItemState = emptyQueue.currentItem;
                }
                return emptyQueue.copy(mediaItemState);
            }

            /* renamed from: component1, reason: from getter */
            public final MediaItemState getCurrentItem() {
                return this.currentItem;
            }

            public final EmptyQueue copy(MediaItemState currentItem) {
                currentItem.getClass();
                return new EmptyQueue(currentItem);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if ((other instanceof EmptyQueue) && m.c(this.currentItem, ((EmptyQueue) other).currentItem)) {
                    return true;
                }
                return false;
            }

            public final MediaItemState getCurrentItem() {
                return this.currentItem;
            }

            public int hashCode() {
                return this.currentItem.hashCode();
            }

            public String toString() {
                return "EmptyQueue(currentItem=" + this.currentItem + Separators.RPAREN;
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/queue/PlayerQueueContract$UiState$Loading;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/queue/PlayerQueueContract$UiState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes4.dex */
        public static final /* data */ class Loading implements UiState {
            public static final int $stable = 0;
            public static final Loading INSTANCE = new Loading();

            private Loading() {
            }

            public boolean equals(Object other) {
                if (this == other || (other instanceof Loading)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return -621981434;
            }

            public String toString() {
                return "Loading";
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0016HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/queue/PlayerQueueContract$UiState$NonEmptyQueue;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/queue/PlayerQueueContract$UiState;", "currentItem", "Lio/elevenlabs/domain/model/MediaItemState;", "queue", "", "<init>", "(Lio/elevenlabs/domain/model/MediaItemState;Ljava/util/List;)V", "getCurrentItem", "()Lio/elevenlabs/domain/model/MediaItemState;", "getQueue", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes4.dex */
        public static final /* data */ class NonEmptyQueue implements UiState {
            public static final int $stable = 8;
            private final MediaItemState currentItem;
            private final List<MediaItemState> queue;

            public NonEmptyQueue(MediaItemState mediaItemState, List<MediaItemState> list) {
                mediaItemState.getClass();
                list.getClass();
                this.currentItem = mediaItemState;
                this.queue = list;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ NonEmptyQueue copy$default(NonEmptyQueue nonEmptyQueue, MediaItemState mediaItemState, List list, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    mediaItemState = nonEmptyQueue.currentItem;
                }
                if ((i10 & 2) != 0) {
                    list = nonEmptyQueue.queue;
                }
                return nonEmptyQueue.copy(mediaItemState, list);
            }

            /* renamed from: component1, reason: from getter */
            public final MediaItemState getCurrentItem() {
                return this.currentItem;
            }

            public final List<MediaItemState> component2() {
                return this.queue;
            }

            public final NonEmptyQueue copy(MediaItemState currentItem, List<MediaItemState> queue) {
                currentItem.getClass();
                queue.getClass();
                return new NonEmptyQueue(currentItem, queue);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof NonEmptyQueue)) {
                    return false;
                }
                NonEmptyQueue nonEmptyQueue = (NonEmptyQueue) other;
                if (m.c(this.currentItem, nonEmptyQueue.currentItem) && m.c(this.queue, nonEmptyQueue.queue)) {
                    return true;
                }
                return false;
            }

            public final MediaItemState getCurrentItem() {
                return this.currentItem;
            }

            public final List<MediaItemState> getQueue() {
                return this.queue;
            }

            public int hashCode() {
                return this.queue.hashCode() + (this.currentItem.hashCode() * 31);
            }

            public String toString() {
                return "NonEmptyQueue(currentItem=" + this.currentItem + ", queue=" + this.queue + Separators.RPAREN;
            }
        }
    }
}
