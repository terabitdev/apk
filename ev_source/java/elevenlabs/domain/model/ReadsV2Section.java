package io.elevenlabs.domain.model;

import android.gov.nist.core.Separators;
import com.google.firebase.analytics.FirebaseAnalytics;
import ib.i;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lio/elevenlabs/domain/model/ReadsV2Section;", "", "title", "", FirebaseAnalytics.Param.ITEMS, "", "Lio/elevenlabs/domain/model/ExploreRead;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getTitle", "()Ljava/lang/String;", "getItems", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final /* data */ class ReadsV2Section {
    private final List<ExploreRead> items;
    private final String title;

    public ReadsV2Section(String str, List<ExploreRead> list) {
        str.getClass();
        list.getClass();
        this.title = str;
        this.items = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ReadsV2Section copy$default(ReadsV2Section readsV2Section, String str, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = readsV2Section.title;
        }
        if ((i10 & 2) != 0) {
            list = readsV2Section.items;
        }
        return readsV2Section.copy(str, list);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final List<ExploreRead> component2() {
        return this.items;
    }

    public final ReadsV2Section copy(String title, List<ExploreRead> items) {
        title.getClass();
        items.getClass();
        return new ReadsV2Section(title, items);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReadsV2Section)) {
            return false;
        }
        ReadsV2Section readsV2Section = (ReadsV2Section) other;
        if (m.c(this.title, readsV2Section.title) && m.c(this.items, readsV2Section.items)) {
            return true;
        }
        return false;
    }

    public final List<ExploreRead> getItems() {
        return this.items;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.items.hashCode() + (this.title.hashCode() * 31);
    }

    public String toString() {
        return i.j("ReadsV2Section(title=", this.title, ", items=", Separators.RPAREN, this.items);
    }
}
