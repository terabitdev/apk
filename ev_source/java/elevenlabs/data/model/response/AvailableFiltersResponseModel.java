package io.elevenlabs.data.model.response;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import livekit.LivekitInternal$NodeStats;
import p.n;
import qr.g;
import sn.h;
import sn.i;
import ur.c1;
import ur.t0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0087\b\u0018\u0000 >2\u00020\u0001:\u0002?>Bi\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u000b\u0010\fB\u008b\u0001\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0013J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0013J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0013J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0013J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0013J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0013J\u0080\u0001\u0010\u001a\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$J'\u0010-\u001a\u00020*2\u0006\u0010%\u001a\u00020\u00002\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(H\u0001¢\u0006\u0004\b+\u0010,R&\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010.\u0012\u0004\b0\u00101\u001a\u0004\b/\u0010\u0013R&\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010.\u0012\u0004\b3\u00101\u001a\u0004\b2\u0010\u0013R&\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010.\u0012\u0004\b5\u00101\u001a\u0004\b4\u0010\u0013R&\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010.\u0012\u0004\b7\u00101\u001a\u0004\b6\u0010\u0013R&\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010.\u0012\u0004\b9\u00101\u001a\u0004\b8\u0010\u0013R&\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010.\u0012\u0004\b;\u00101\u001a\u0004\b:\u0010\u0013R&\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010.\u0012\u0004\b=\u00101\u001a\u0004\b<\u0010\u0013¨\u0006@"}, d2 = {"Lio/elevenlabs/data/model/response/AvailableFiltersResponseModel;", "", "", "Lio/elevenlabs/data/model/response/FilterOptionResponseModel;", "category", "gender", "age", "accents", "useCase", "language", "sort", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "", "seen0", "Lur/c1;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lur/c1;)V", "component1", "()Ljava/util/List;", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lio/elevenlabs/data/model/response/AvailableFiltersResponseModel;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "Ltr/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lsn/z;", "write$Self$data_release", "(Lio/elevenlabs/data/model/response/AvailableFiltersResponseModel;Ltr/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/util/List;", "getCategory", "getCategory$annotations", "()V", "getGender", "getGender$annotations", "getAge", "getAge$annotations", "getAccents", "getAccents$annotations", "getUseCase", "getUseCase$annotations", "getLanguage", "getLanguage$annotations", "getSort", "getSort$annotations", "Companion", "$serializer", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
@g
/* loaded from: classes3.dex */
public final /* data */ class AvailableFiltersResponseModel {
    private static final h[] $childSerializers;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final List<FilterOptionResponseModel> accents;
    private final List<FilterOptionResponseModel> age;
    private final List<FilterOptionResponseModel> category;
    private final List<FilterOptionResponseModel> gender;
    private final List<FilterOptionResponseModel> language;
    private final List<FilterOptionResponseModel> sort;
    private final List<FilterOptionResponseModel> useCase;

    static {
        io.elevenlabs.data.model.a aVar = new io.elevenlabs.data.model.a(12);
        i iVar = i.f31597b;
        $childSerializers = new h[]{sn.a.d(iVar, aVar), sn.a.d(iVar, new io.elevenlabs.data.model.a(13)), sn.a.d(iVar, new io.elevenlabs.data.model.a(14)), sn.a.d(iVar, new io.elevenlabs.data.model.a(15)), sn.a.d(iVar, new io.elevenlabs.data.model.a(16)), sn.a.d(iVar, new io.elevenlabs.data.model.a(17)), sn.a.d(iVar, new io.elevenlabs.data.model.a(18))};
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AvailableFiltersResponseModel(List<? extends FilterOptionResponseModel> list, List<? extends FilterOptionResponseModel> list2, List<? extends FilterOptionResponseModel> list3, List<? extends FilterOptionResponseModel> list4, List<? extends FilterOptionResponseModel> list5, List<? extends FilterOptionResponseModel> list6, List<? extends FilterOptionResponseModel> list7) {
        list.getClass();
        list2.getClass();
        list3.getClass();
        list4.getClass();
        list5.getClass();
        list6.getClass();
        list7.getClass();
        this.category = list;
        this.gender = list2;
        this.age = list3;
        this.accents = list4;
        this.useCase = list5;
        this.language = list6;
        this.sort = list7;
    }

    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new ur.d(FilterOptionResponseModel.INSTANCE.serializer(), 0);
    }

    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new ur.d(FilterOptionResponseModel.INSTANCE.serializer(), 0);
    }

    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$1() {
        return new ur.d(FilterOptionResponseModel.INSTANCE.serializer(), 0);
    }

    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$2() {
        return new ur.d(FilterOptionResponseModel.INSTANCE.serializer(), 0);
    }

    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$3() {
        return new ur.d(FilterOptionResponseModel.INSTANCE.serializer(), 0);
    }

    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$4() {
        return new ur.d(FilterOptionResponseModel.INSTANCE.serializer(), 0);
    }

    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$5() {
        return new ur.d(FilterOptionResponseModel.INSTANCE.serializer(), 0);
    }

    public static /* synthetic */ AvailableFiltersResponseModel copy$default(AvailableFiltersResponseModel availableFiltersResponseModel, List list, List list2, List list3, List list4, List list5, List list6, List list7, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = availableFiltersResponseModel.category;
        }
        if ((i10 & 2) != 0) {
            list2 = availableFiltersResponseModel.gender;
        }
        if ((i10 & 4) != 0) {
            list3 = availableFiltersResponseModel.age;
        }
        if ((i10 & 8) != 0) {
            list4 = availableFiltersResponseModel.accents;
        }
        if ((i10 & 16) != 0) {
            list5 = availableFiltersResponseModel.useCase;
        }
        if ((i10 & 32) != 0) {
            list6 = availableFiltersResponseModel.language;
        }
        if ((i10 & 64) != 0) {
            list7 = availableFiltersResponseModel.sort;
        }
        List list8 = list6;
        List list9 = list7;
        List list10 = list5;
        List list11 = list3;
        return availableFiltersResponseModel.copy(list, list2, list11, list4, list10, list8, list9);
    }

    public static final /* synthetic */ void write$Self$data_release(AvailableFiltersResponseModel self, tr.b output, SerialDescriptor serialDesc) {
        h[] hVarArr = $childSerializers;
        output.g(serialDesc, 0, (KSerializer) hVarArr[0].getValue(), self.category);
        output.g(serialDesc, 1, (KSerializer) hVarArr[1].getValue(), self.gender);
        output.g(serialDesc, 2, (KSerializer) hVarArr[2].getValue(), self.age);
        output.g(serialDesc, 3, (KSerializer) hVarArr[3].getValue(), self.accents);
        output.g(serialDesc, 4, (KSerializer) hVarArr[4].getValue(), self.useCase);
        output.g(serialDesc, 5, (KSerializer) hVarArr[5].getValue(), self.language);
        output.g(serialDesc, 6, (KSerializer) hVarArr[6].getValue(), self.sort);
    }

    public final List<FilterOptionResponseModel> component1() {
        return this.category;
    }

    public final List<FilterOptionResponseModel> component2() {
        return this.gender;
    }

    public final List<FilterOptionResponseModel> component3() {
        return this.age;
    }

    public final List<FilterOptionResponseModel> component4() {
        return this.accents;
    }

    public final List<FilterOptionResponseModel> component5() {
        return this.useCase;
    }

    public final List<FilterOptionResponseModel> component6() {
        return this.language;
    }

    public final List<FilterOptionResponseModel> component7() {
        return this.sort;
    }

    public final AvailableFiltersResponseModel copy(List<? extends FilterOptionResponseModel> category, List<? extends FilterOptionResponseModel> gender, List<? extends FilterOptionResponseModel> age, List<? extends FilterOptionResponseModel> accents, List<? extends FilterOptionResponseModel> useCase, List<? extends FilterOptionResponseModel> language, List<? extends FilterOptionResponseModel> sort) {
        category.getClass();
        gender.getClass();
        age.getClass();
        accents.getClass();
        useCase.getClass();
        language.getClass();
        sort.getClass();
        return new AvailableFiltersResponseModel(category, gender, age, accents, useCase, language, sort);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AvailableFiltersResponseModel)) {
            return false;
        }
        AvailableFiltersResponseModel availableFiltersResponseModel = (AvailableFiltersResponseModel) other;
        if (m.c(this.category, availableFiltersResponseModel.category) && m.c(this.gender, availableFiltersResponseModel.gender) && m.c(this.age, availableFiltersResponseModel.age) && m.c(this.accents, availableFiltersResponseModel.accents) && m.c(this.useCase, availableFiltersResponseModel.useCase) && m.c(this.language, availableFiltersResponseModel.language) && m.c(this.sort, availableFiltersResponseModel.sort)) {
            return true;
        }
        return false;
    }

    public final List<FilterOptionResponseModel> getAccents() {
        return this.accents;
    }

    public final List<FilterOptionResponseModel> getAge() {
        return this.age;
    }

    public final List<FilterOptionResponseModel> getCategory() {
        return this.category;
    }

    public final List<FilterOptionResponseModel> getGender() {
        return this.gender;
    }

    public final List<FilterOptionResponseModel> getLanguage() {
        return this.language;
    }

    public final List<FilterOptionResponseModel> getSort() {
        return this.sort;
    }

    public final List<FilterOptionResponseModel> getUseCase() {
        return this.useCase;
    }

    public int hashCode() {
        return this.sort.hashCode() + n.d(n.d(n.d(n.d(n.d(this.category.hashCode() * 31, 31, this.gender), 31, this.age), 31, this.accents), 31, this.useCase), 31, this.language);
    }

    public String toString() {
        List<FilterOptionResponseModel> list = this.category;
        List<FilterOptionResponseModel> list2 = this.gender;
        List<FilterOptionResponseModel> list3 = this.age;
        List<FilterOptionResponseModel> list4 = this.accents;
        List<FilterOptionResponseModel> list5 = this.useCase;
        List<FilterOptionResponseModel> list6 = this.language;
        List<FilterOptionResponseModel> list7 = this.sort;
        StringBuilder sb = new StringBuilder("AvailableFiltersResponseModel(category=");
        sb.append(list);
        sb.append(", gender=");
        sb.append(list2);
        sb.append(", age=");
        sb.append(list3);
        sb.append(", accents=");
        sb.append(list4);
        sb.append(", useCase=");
        sb.append(list5);
        sb.append(", language=");
        sb.append(list6);
        sb.append(", sort=");
        return z.h.e(sb, list7, Separators.RPAREN);
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/model/response/AvailableFiltersResponseModel$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/model/response/AvailableFiltersResponseModel;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final KSerializer serializer() {
            return AvailableFiltersResponseModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public static /* synthetic */ void getAccents$annotations() {
    }

    public static /* synthetic */ void getAge$annotations() {
    }

    public static /* synthetic */ void getCategory$annotations() {
    }

    public static /* synthetic */ void getGender$annotations() {
    }

    public static /* synthetic */ void getLanguage$annotations() {
    }

    public static /* synthetic */ void getSort$annotations() {
    }

    public static /* synthetic */ void getUseCase$annotations() {
    }

    public /* synthetic */ AvailableFiltersResponseModel(int i10, List list, List list2, List list3, List list4, List list5, List list6, List list7, c1 c1Var) {
        if (127 != (i10 & 127)) {
            t0.j(i10, 127, AvailableFiltersResponseModel$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.category = list;
        this.gender = list2;
        this.age = list3;
        this.accents = list4;
        this.useCase = list5;
        this.language = list6;
        this.sort = list7;
    }
}
