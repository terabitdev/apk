package io.elevenlabs.domain.model;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0014\u0010\u0010\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0015HÖ\u0081\u0004R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lio/elevenlabs/domain/model/CommunityVoicesPage;", "", "voices", "", "Lio/elevenlabs/domain/model/Voice;", "hasMore", "", "<init>", "(Ljava/util/List;Z)V", "getVoices", "()Ljava/util/List;", "getHasMore", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final /* data */ class CommunityVoicesPage {
    private final boolean hasMore;
    private final List<Voice> voices;

    public CommunityVoicesPage(List<Voice> list, boolean z6) {
        list.getClass();
        this.voices = list;
        this.hasMore = z6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CommunityVoicesPage copy$default(CommunityVoicesPage communityVoicesPage, List list, boolean z6, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = communityVoicesPage.voices;
        }
        if ((i10 & 2) != 0) {
            z6 = communityVoicesPage.hasMore;
        }
        return communityVoicesPage.copy(list, z6);
    }

    public final List<Voice> component1() {
        return this.voices;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getHasMore() {
        return this.hasMore;
    }

    public final CommunityVoicesPage copy(List<Voice> voices, boolean hasMore) {
        voices.getClass();
        return new CommunityVoicesPage(voices, hasMore);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CommunityVoicesPage)) {
            return false;
        }
        CommunityVoicesPage communityVoicesPage = (CommunityVoicesPage) other;
        if (m.c(this.voices, communityVoicesPage.voices) && this.hasMore == communityVoicesPage.hasMore) {
            return true;
        }
        return false;
    }

    public final boolean getHasMore() {
        return this.hasMore;
    }

    public final List<Voice> getVoices() {
        return this.voices;
    }

    public int hashCode() {
        return Boolean.hashCode(this.hasMore) + (this.voices.hashCode() * 31);
    }

    public String toString() {
        return "CommunityVoicesPage(voices=" + this.voices + ", hasMore=" + this.hasMore + Separators.RPAREN;
    }
}
