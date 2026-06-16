package io.elevenlabs.domain.model;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;
import p.n;
import z.h;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001Bi\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003Jy\u0010\u001c\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0014\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010 \u001a\u00020!HÖ\u0081\u0004J\n\u0010\"\u001a\u00020#HÖ\u0081\u0004R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000e¨\u0006$"}, d2 = {"Lio/elevenlabs/domain/model/AvailableFilters;", "", "age", "", "Lio/elevenlabs/domain/model/Filter;", "category", "gender", "language", "sort", "useCase", "accents", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getAge", "()Ljava/util/List;", "getCategory", "getGender", "getLanguage", "getSort", "getUseCase", "getAccents", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final /* data */ class AvailableFilters {
    private final List<Filter> accents;
    private final List<Filter> age;
    private final List<Filter> category;
    private final List<Filter> gender;
    private final List<Filter> language;
    private final List<Filter> sort;
    private final List<Filter> useCase;

    /* JADX WARN: Multi-variable type inference failed */
    public AvailableFilters(List<? extends Filter> list, List<? extends Filter> list2, List<? extends Filter> list3, List<? extends Filter> list4, List<? extends Filter> list5, List<? extends Filter> list6, List<? extends Filter> list7) {
        list.getClass();
        list2.getClass();
        list3.getClass();
        list4.getClass();
        list5.getClass();
        list6.getClass();
        list7.getClass();
        this.age = list;
        this.category = list2;
        this.gender = list3;
        this.language = list4;
        this.sort = list5;
        this.useCase = list6;
        this.accents = list7;
    }

    public static /* synthetic */ AvailableFilters copy$default(AvailableFilters availableFilters, List list, List list2, List list3, List list4, List list5, List list6, List list7, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = availableFilters.age;
        }
        if ((i10 & 2) != 0) {
            list2 = availableFilters.category;
        }
        if ((i10 & 4) != 0) {
            list3 = availableFilters.gender;
        }
        if ((i10 & 8) != 0) {
            list4 = availableFilters.language;
        }
        if ((i10 & 16) != 0) {
            list5 = availableFilters.sort;
        }
        if ((i10 & 32) != 0) {
            list6 = availableFilters.useCase;
        }
        if ((i10 & 64) != 0) {
            list7 = availableFilters.accents;
        }
        List list8 = list6;
        List list9 = list7;
        List list10 = list5;
        List list11 = list3;
        return availableFilters.copy(list, list2, list11, list4, list10, list8, list9);
    }

    public final List<Filter> component1() {
        return this.age;
    }

    public final List<Filter> component2() {
        return this.category;
    }

    public final List<Filter> component3() {
        return this.gender;
    }

    public final List<Filter> component4() {
        return this.language;
    }

    public final List<Filter> component5() {
        return this.sort;
    }

    public final List<Filter> component6() {
        return this.useCase;
    }

    public final List<Filter> component7() {
        return this.accents;
    }

    public final AvailableFilters copy(List<? extends Filter> age, List<? extends Filter> category, List<? extends Filter> gender, List<? extends Filter> language, List<? extends Filter> sort, List<? extends Filter> useCase, List<? extends Filter> accents) {
        age.getClass();
        category.getClass();
        gender.getClass();
        language.getClass();
        sort.getClass();
        useCase.getClass();
        accents.getClass();
        return new AvailableFilters(age, category, gender, language, sort, useCase, accents);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AvailableFilters)) {
            return false;
        }
        AvailableFilters availableFilters = (AvailableFilters) other;
        if (m.c(this.age, availableFilters.age) && m.c(this.category, availableFilters.category) && m.c(this.gender, availableFilters.gender) && m.c(this.language, availableFilters.language) && m.c(this.sort, availableFilters.sort) && m.c(this.useCase, availableFilters.useCase) && m.c(this.accents, availableFilters.accents)) {
            return true;
        }
        return false;
    }

    public final List<Filter> getAccents() {
        return this.accents;
    }

    public final List<Filter> getAge() {
        return this.age;
    }

    public final List<Filter> getCategory() {
        return this.category;
    }

    public final List<Filter> getGender() {
        return this.gender;
    }

    public final List<Filter> getLanguage() {
        return this.language;
    }

    public final List<Filter> getSort() {
        return this.sort;
    }

    public final List<Filter> getUseCase() {
        return this.useCase;
    }

    public int hashCode() {
        return this.accents.hashCode() + n.d(n.d(n.d(n.d(n.d(this.age.hashCode() * 31, 31, this.category), 31, this.gender), 31, this.language), 31, this.sort), 31, this.useCase);
    }

    public String toString() {
        List<Filter> list = this.age;
        List<Filter> list2 = this.category;
        List<Filter> list3 = this.gender;
        List<Filter> list4 = this.language;
        List<Filter> list5 = this.sort;
        List<Filter> list6 = this.useCase;
        List<Filter> list7 = this.accents;
        StringBuilder sb = new StringBuilder("AvailableFilters(age=");
        sb.append(list);
        sb.append(", category=");
        sb.append(list2);
        sb.append(", gender=");
        sb.append(list3);
        sb.append(", language=");
        sb.append(list4);
        sb.append(", sort=");
        sb.append(list5);
        sb.append(", useCase=");
        sb.append(list6);
        sb.append(", accents=");
        return h.e(sb, list7, Separators.RPAREN);
    }
}
