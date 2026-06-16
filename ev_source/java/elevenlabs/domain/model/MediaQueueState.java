package io.elevenlabs.domain.model;

import android.gov.nist.core.Separators;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;
import tn.o;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J#\u0010\u0012\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0014\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0016\u001a\u00020\u0006HÖ\u0081\u0004J\n\u0010\u0017\u001a\u00020\u0018HÖ\u0081\u0004R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\r\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, d2 = {"Lio/elevenlabs/domain/model/MediaQueueState;", "", FirebaseAnalytics.Param.ITEMS, "", "Lio/elevenlabs/domain/model/MediaItemState;", "currentIndex", "", "<init>", "(Ljava/util/List;I)V", "getItems", "()Ljava/util/List;", "getCurrentIndex", "()I", "currentItem", "getCurrentItem", "()Lio/elevenlabs/domain/model/MediaItemState;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final /* data */ class MediaQueueState {
    private final int currentIndex;
    private final List<MediaItemState> items;

    public MediaQueueState(List<MediaItemState> list, int i10) {
        list.getClass();
        this.items = list;
        this.currentIndex = i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MediaQueueState copy$default(MediaQueueState mediaQueueState, List list, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = mediaQueueState.items;
        }
        if ((i11 & 2) != 0) {
            i10 = mediaQueueState.currentIndex;
        }
        return mediaQueueState.copy(list, i10);
    }

    public final List<MediaItemState> component1() {
        return this.items;
    }

    /* renamed from: component2, reason: from getter */
    public final int getCurrentIndex() {
        return this.currentIndex;
    }

    public final MediaQueueState copy(List<MediaItemState> items, int currentIndex) {
        items.getClass();
        return new MediaQueueState(items, currentIndex);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MediaQueueState)) {
            return false;
        }
        MediaQueueState mediaQueueState = (MediaQueueState) other;
        if (m.c(this.items, mediaQueueState.items) && this.currentIndex == mediaQueueState.currentIndex) {
            return true;
        }
        return false;
    }

    public final int getCurrentIndex() {
        return this.currentIndex;
    }

    public final MediaItemState getCurrentItem() {
        return (MediaItemState) o.z0(this.currentIndex, this.items);
    }

    public final List<MediaItemState> getItems() {
        return this.items;
    }

    public int hashCode() {
        return Integer.hashCode(this.currentIndex) + (this.items.hashCode() * 31);
    }

    public String toString() {
        return "MediaQueueState(items=" + this.items + ", currentIndex=" + this.currentIndex + Separators.RPAREN;
    }
}
