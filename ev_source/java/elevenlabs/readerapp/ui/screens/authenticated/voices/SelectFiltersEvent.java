package io.elevenlabs.readerapp.ui.screens.authenticated.voices;

import android.gov.nist.core.Separators;
import io.elevenlabs.domain.model.Filter;
import java.util.Set;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003JW\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001e\u001a\u00020\u001fHÖ\u0081\u0004J\n\u0010 \u001a\u00020!HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r¨\u0006\""}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/voices/SelectFiltersEvent;", "", "activeSort", "Lio/elevenlabs/domain/model/Filter;", "activeAccent", "activeUseCases", "", "activeAge", "activeGender", "activeLanguage", "<init>", "(Lio/elevenlabs/domain/model/Filter;Lio/elevenlabs/domain/model/Filter;Ljava/util/Set;Lio/elevenlabs/domain/model/Filter;Lio/elevenlabs/domain/model/Filter;Lio/elevenlabs/domain/model/Filter;)V", "getActiveSort", "()Lio/elevenlabs/domain/model/Filter;", "getActiveAccent", "getActiveUseCases", "()Ljava/util/Set;", "getActiveAge", "getActiveGender", "getActiveLanguage", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final /* data */ class SelectFiltersEvent {
    public static final int $stable = 8;
    private final Filter activeAccent;
    private final Filter activeAge;
    private final Filter activeGender;
    private final Filter activeLanguage;
    private final Filter activeSort;
    private final Set<Filter> activeUseCases;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ SelectFiltersEvent(Filter filter, Filter filter2, Set set, Filter filter3, Filter filter4, Filter filter5, int i10, kotlin.jvm.internal.f fVar) {
        this(filter, filter2, set, filter3, filter4, r8);
        Filter filter6;
        filter = (i10 & 1) != 0 ? null : filter;
        filter2 = (i10 & 2) != 0 ? null : filter2;
        set = (i10 & 4) != 0 ? null : set;
        filter3 = (i10 & 8) != 0 ? null : filter3;
        filter4 = (i10 & 16) != 0 ? null : filter4;
        if ((i10 & 32) != 0) {
            filter6 = null;
        } else {
            filter6 = filter5;
        }
    }

    public static /* synthetic */ SelectFiltersEvent copy$default(SelectFiltersEvent selectFiltersEvent, Filter filter, Filter filter2, Set set, Filter filter3, Filter filter4, Filter filter5, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            filter = selectFiltersEvent.activeSort;
        }
        if ((i10 & 2) != 0) {
            filter2 = selectFiltersEvent.activeAccent;
        }
        if ((i10 & 4) != 0) {
            set = selectFiltersEvent.activeUseCases;
        }
        if ((i10 & 8) != 0) {
            filter3 = selectFiltersEvent.activeAge;
        }
        if ((i10 & 16) != 0) {
            filter4 = selectFiltersEvent.activeGender;
        }
        if ((i10 & 32) != 0) {
            filter5 = selectFiltersEvent.activeLanguage;
        }
        Filter filter6 = filter4;
        Filter filter7 = filter5;
        return selectFiltersEvent.copy(filter, filter2, set, filter3, filter6, filter7);
    }

    /* renamed from: component1, reason: from getter */
    public final Filter getActiveSort() {
        return this.activeSort;
    }

    /* renamed from: component2, reason: from getter */
    public final Filter getActiveAccent() {
        return this.activeAccent;
    }

    public final Set<Filter> component3() {
        return this.activeUseCases;
    }

    /* renamed from: component4, reason: from getter */
    public final Filter getActiveAge() {
        return this.activeAge;
    }

    /* renamed from: component5, reason: from getter */
    public final Filter getActiveGender() {
        return this.activeGender;
    }

    /* renamed from: component6, reason: from getter */
    public final Filter getActiveLanguage() {
        return this.activeLanguage;
    }

    public final SelectFiltersEvent copy(Filter activeSort, Filter activeAccent, Set<? extends Filter> activeUseCases, Filter activeAge, Filter activeGender, Filter activeLanguage) {
        return new SelectFiltersEvent(activeSort, activeAccent, activeUseCases, activeAge, activeGender, activeLanguage);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SelectFiltersEvent)) {
            return false;
        }
        SelectFiltersEvent selectFiltersEvent = (SelectFiltersEvent) other;
        if (kotlin.jvm.internal.m.c(this.activeSort, selectFiltersEvent.activeSort) && kotlin.jvm.internal.m.c(this.activeAccent, selectFiltersEvent.activeAccent) && kotlin.jvm.internal.m.c(this.activeUseCases, selectFiltersEvent.activeUseCases) && kotlin.jvm.internal.m.c(this.activeAge, selectFiltersEvent.activeAge) && kotlin.jvm.internal.m.c(this.activeGender, selectFiltersEvent.activeGender) && kotlin.jvm.internal.m.c(this.activeLanguage, selectFiltersEvent.activeLanguage)) {
            return true;
        }
        return false;
    }

    public final Filter getActiveAccent() {
        return this.activeAccent;
    }

    public final Filter getActiveAge() {
        return this.activeAge;
    }

    public final Filter getActiveGender() {
        return this.activeGender;
    }

    public final Filter getActiveLanguage() {
        return this.activeLanguage;
    }

    public final Filter getActiveSort() {
        return this.activeSort;
    }

    public final Set<Filter> getActiveUseCases() {
        return this.activeUseCases;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        Filter filter = this.activeSort;
        int i10 = 0;
        if (filter == null) {
            hashCode = 0;
        } else {
            hashCode = filter.hashCode();
        }
        int i11 = hashCode * 31;
        Filter filter2 = this.activeAccent;
        if (filter2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = filter2.hashCode();
        }
        int i12 = (i11 + hashCode2) * 31;
        Set<Filter> set = this.activeUseCases;
        if (set == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = set.hashCode();
        }
        int i13 = (i12 + hashCode3) * 31;
        Filter filter3 = this.activeAge;
        if (filter3 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = filter3.hashCode();
        }
        int i14 = (i13 + hashCode4) * 31;
        Filter filter4 = this.activeGender;
        if (filter4 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = filter4.hashCode();
        }
        int i15 = (i14 + hashCode5) * 31;
        Filter filter5 = this.activeLanguage;
        if (filter5 != null) {
            i10 = filter5.hashCode();
        }
        return i15 + i10;
    }

    public String toString() {
        return "SelectFiltersEvent(activeSort=" + this.activeSort + ", activeAccent=" + this.activeAccent + ", activeUseCases=" + this.activeUseCases + ", activeAge=" + this.activeAge + ", activeGender=" + this.activeGender + ", activeLanguage=" + this.activeLanguage + Separators.RPAREN;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SelectFiltersEvent(Filter filter, Filter filter2, Set<? extends Filter> set, Filter filter3, Filter filter4, Filter filter5) {
        this.activeSort = filter;
        this.activeAccent = filter2;
        this.activeUseCases = set;
        this.activeAge = filter3;
        this.activeGender = filter4;
        this.activeLanguage = filter5;
    }

    public SelectFiltersEvent() {
        this(null, null, null, null, null, null, 63, null);
    }
}
