package io.elevenlabs.readerapp.ui.screens.authenticated.voices;

import android.gov.nist.core.Separators;
import io.elevenlabs.domain.model.AvailableFilters;
import io.elevenlabs.domain.model.Filter;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0010\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\bHÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0005HÆ\u0003Jc\u0010&\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0014\u0010'\u001a\u00020\u001d2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010)\u001a\u00020*HÖ\u0081\u0004J\n\u0010+\u001a\u00020,HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00010\u0019¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001c\u001a\u00020\u001d8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001e¨\u0006-"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/voices/FiltersState;", "", "available", "Lio/elevenlabs/domain/model/AvailableFilters;", "activeSort", "Lio/elevenlabs/domain/model/Filter;", "activeAccent", "activeUseCases", "", "activeAge", "activeGender", "activeLanguage", "<init>", "(Lio/elevenlabs/domain/model/AvailableFilters;Lio/elevenlabs/domain/model/Filter;Lio/elevenlabs/domain/model/Filter;Ljava/util/Set;Lio/elevenlabs/domain/model/Filter;Lio/elevenlabs/domain/model/Filter;Lio/elevenlabs/domain/model/Filter;)V", "getAvailable", "()Lio/elevenlabs/domain/model/AvailableFilters;", "getActiveSort", "()Lio/elevenlabs/domain/model/Filter;", "getActiveAccent", "getActiveUseCases", "()Ljava/util/Set;", "getActiveAge", "getActiveGender", "getActiveLanguage", "activeFilters", "", "getActiveFilters", "()Ljava/util/List;", "isActive", "", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final /* data */ class FiltersState {
    public static final int $stable = 8;
    private final Filter activeAccent;
    private final Filter activeAge;
    private final List<Object> activeFilters;
    private final Filter activeGender;
    private final Filter activeLanguage;
    private final Filter activeSort;
    private final Set<Filter> activeUseCases;
    private final AvailableFilters available;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ FiltersState(AvailableFilters availableFilters, Filter filter, Filter filter2, Set set, Filter filter3, Filter filter4, Filter filter5, int i10, kotlin.jvm.internal.f fVar) {
        this(availableFilters, filter, filter2, set, filter3, filter4, r9);
        Filter filter6;
        availableFilters = (i10 & 1) != 0 ? null : availableFilters;
        filter = (i10 & 2) != 0 ? null : filter;
        filter2 = (i10 & 4) != 0 ? null : filter2;
        set = (i10 & 8) != 0 ? null : set;
        filter3 = (i10 & 16) != 0 ? null : filter3;
        filter4 = (i10 & 32) != 0 ? null : filter4;
        if ((i10 & 64) != 0) {
            filter6 = null;
        } else {
            filter6 = filter5;
        }
    }

    public static /* synthetic */ FiltersState copy$default(FiltersState filtersState, AvailableFilters availableFilters, Filter filter, Filter filter2, Set set, Filter filter3, Filter filter4, Filter filter5, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            availableFilters = filtersState.available;
        }
        if ((i10 & 2) != 0) {
            filter = filtersState.activeSort;
        }
        if ((i10 & 4) != 0) {
            filter2 = filtersState.activeAccent;
        }
        if ((i10 & 8) != 0) {
            set = filtersState.activeUseCases;
        }
        if ((i10 & 16) != 0) {
            filter3 = filtersState.activeAge;
        }
        if ((i10 & 32) != 0) {
            filter4 = filtersState.activeGender;
        }
        if ((i10 & 64) != 0) {
            filter5 = filtersState.activeLanguage;
        }
        Filter filter6 = filter4;
        Filter filter7 = filter5;
        Filter filter8 = filter3;
        Filter filter9 = filter2;
        return filtersState.copy(availableFilters, filter, filter9, set, filter8, filter6, filter7);
    }

    /* renamed from: component1, reason: from getter */
    public final AvailableFilters getAvailable() {
        return this.available;
    }

    /* renamed from: component2, reason: from getter */
    public final Filter getActiveSort() {
        return this.activeSort;
    }

    /* renamed from: component3, reason: from getter */
    public final Filter getActiveAccent() {
        return this.activeAccent;
    }

    public final Set<Filter> component4() {
        return this.activeUseCases;
    }

    /* renamed from: component5, reason: from getter */
    public final Filter getActiveAge() {
        return this.activeAge;
    }

    /* renamed from: component6, reason: from getter */
    public final Filter getActiveGender() {
        return this.activeGender;
    }

    /* renamed from: component7, reason: from getter */
    public final Filter getActiveLanguage() {
        return this.activeLanguage;
    }

    public final FiltersState copy(AvailableFilters available, Filter activeSort, Filter activeAccent, Set<? extends Filter> activeUseCases, Filter activeAge, Filter activeGender, Filter activeLanguage) {
        return new FiltersState(available, activeSort, activeAccent, activeUseCases, activeAge, activeGender, activeLanguage);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FiltersState)) {
            return false;
        }
        FiltersState filtersState = (FiltersState) other;
        if (kotlin.jvm.internal.m.c(this.available, filtersState.available) && kotlin.jvm.internal.m.c(this.activeSort, filtersState.activeSort) && kotlin.jvm.internal.m.c(this.activeAccent, filtersState.activeAccent) && kotlin.jvm.internal.m.c(this.activeUseCases, filtersState.activeUseCases) && kotlin.jvm.internal.m.c(this.activeAge, filtersState.activeAge) && kotlin.jvm.internal.m.c(this.activeGender, filtersState.activeGender) && kotlin.jvm.internal.m.c(this.activeLanguage, filtersState.activeLanguage)) {
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

    public final List<Object> getActiveFilters() {
        return this.activeFilters;
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

    public final AvailableFilters getAvailable() {
        return this.available;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        AvailableFilters availableFilters = this.available;
        int i10 = 0;
        if (availableFilters == null) {
            hashCode = 0;
        } else {
            hashCode = availableFilters.hashCode();
        }
        int i11 = hashCode * 31;
        Filter filter = this.activeSort;
        if (filter == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = filter.hashCode();
        }
        int i12 = (i11 + hashCode2) * 31;
        Filter filter2 = this.activeAccent;
        if (filter2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = filter2.hashCode();
        }
        int i13 = (i12 + hashCode3) * 31;
        Set<Filter> set = this.activeUseCases;
        if (set == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = set.hashCode();
        }
        int i14 = (i13 + hashCode4) * 31;
        Filter filter3 = this.activeAge;
        if (filter3 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = filter3.hashCode();
        }
        int i15 = (i14 + hashCode5) * 31;
        Filter filter4 = this.activeGender;
        if (filter4 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = filter4.hashCode();
        }
        int i16 = (i15 + hashCode6) * 31;
        Filter filter5 = this.activeLanguage;
        if (filter5 != null) {
            i10 = filter5.hashCode();
        }
        return i16 + i10;
    }

    public final boolean isActive() {
        return !this.activeFilters.isEmpty();
    }

    public String toString() {
        return "FiltersState(available=" + this.available + ", activeSort=" + this.activeSort + ", activeAccent=" + this.activeAccent + ", activeUseCases=" + this.activeUseCases + ", activeAge=" + this.activeAge + ", activeGender=" + this.activeGender + ", activeLanguage=" + this.activeLanguage + Separators.RPAREN;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001b, code lost:
    
        if (r0 == false) goto L18;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public FiltersState(AvailableFilters availableFilters, Filter filter, Filter filter2, Set<? extends Filter> set, Filter filter3, Filter filter4, Filter filter5) {
        Object obj;
        this.available = availableFilters;
        this.activeSort = filter;
        this.activeAccent = filter2;
        this.activeUseCases = set;
        this.activeAge = filter3;
        this.activeGender = filter4;
        this.activeLanguage = filter5;
        if (set != 0) {
            boolean isEmpty = set.isEmpty();
            obj = set;
        }
        obj = null;
        this.activeFilters = tn.n.F0(new Object[]{filter, filter2, obj, filter3, filter4, filter5});
    }

    public FiltersState() {
        this(null, null, null, null, null, null, null, 127, null);
    }
}
