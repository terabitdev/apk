package io.elevenlabs.data.services;

import com.google.protobuf.c6;
import fr.d0;
import ho.p;
import io.elevenlabs.data.api.CommunityVoicesApi;
import io.elevenlabs.data.extensions.ApiResultExtensionKt;
import io.elevenlabs.data.model.ApiResult;
import io.elevenlabs.data.model.response.AvailableFiltersResponseModel;
import io.elevenlabs.data.model.response.FilterOptionResponseModel;
import io.elevenlabs.domain.model.AsyncCallResult;
import io.elevenlabs.domain.model.AvailableFilters;
import io.elevenlabs.domain.model.Filter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.data.services.CommunityVoicesServiceImpl$getFilters$2", f = "CommunityVoicesServiceImpl.kt", l = {57}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lfr/d0;", "Lio/elevenlabs/domain/model/AsyncCallResult;", "Lio/elevenlabs/domain/model/AvailableFilters;", "<anonymous>", "(Lfr/d0;)Lio/elevenlabs/domain/model/AsyncCallResult;"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes3.dex */
public final class CommunityVoicesServiceImpl$getFilters$2 extends yn.i implements p {
    int label;
    final /* synthetic */ CommunityVoicesServiceImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommunityVoicesServiceImpl$getFilters$2(CommunityVoicesServiceImpl communityVoicesServiceImpl, wn.c<? super CommunityVoicesServiceImpl$getFilters$2> cVar) {
        super(2, cVar);
        this.this$0 = communityVoicesServiceImpl;
    }

    public static /* synthetic */ AvailableFilters d(AvailableFiltersResponseModel availableFiltersResponseModel) {
        return invokeSuspend$lambda$0(availableFiltersResponseModel);
    }

    public static final AvailableFilters invokeSuspend$lambda$0(AvailableFiltersResponseModel availableFiltersResponseModel) {
        Filter domain;
        Filter domain2;
        Filter domain3;
        Filter domain4;
        Filter domain5;
        Filter domain6;
        Filter domain7;
        List<FilterOptionResponseModel> age = availableFiltersResponseModel.getAge();
        ArrayList arrayList = new ArrayList(tn.p.a0(age, 10));
        Iterator<T> it = age.iterator();
        while (it.hasNext()) {
            domain7 = CommunityVoicesServiceImplKt.toDomain((FilterOptionResponseModel) it.next());
            arrayList.add(domain7);
        }
        List<FilterOptionResponseModel> category = availableFiltersResponseModel.getCategory();
        ArrayList arrayList2 = new ArrayList(tn.p.a0(category, 10));
        Iterator<T> it2 = category.iterator();
        while (it2.hasNext()) {
            domain6 = CommunityVoicesServiceImplKt.toDomain((FilterOptionResponseModel) it2.next());
            arrayList2.add(domain6);
        }
        List<FilterOptionResponseModel> gender = availableFiltersResponseModel.getGender();
        ArrayList arrayList3 = new ArrayList(tn.p.a0(gender, 10));
        Iterator<T> it3 = gender.iterator();
        while (it3.hasNext()) {
            domain5 = CommunityVoicesServiceImplKt.toDomain((FilterOptionResponseModel) it3.next());
            arrayList3.add(domain5);
        }
        List<FilterOptionResponseModel> language = availableFiltersResponseModel.getLanguage();
        ArrayList arrayList4 = new ArrayList(tn.p.a0(language, 10));
        Iterator<T> it4 = language.iterator();
        while (it4.hasNext()) {
            domain4 = CommunityVoicesServiceImplKt.toDomain((FilterOptionResponseModel) it4.next());
            arrayList4.add(domain4);
        }
        List<FilterOptionResponseModel> sort = availableFiltersResponseModel.getSort();
        ArrayList arrayList5 = new ArrayList(tn.p.a0(sort, 10));
        Iterator<T> it5 = sort.iterator();
        while (it5.hasNext()) {
            domain3 = CommunityVoicesServiceImplKt.toDomain((FilterOptionResponseModel) it5.next());
            arrayList5.add(domain3);
        }
        List<FilterOptionResponseModel> useCase = availableFiltersResponseModel.getUseCase();
        ArrayList arrayList6 = new ArrayList(tn.p.a0(useCase, 10));
        Iterator<T> it6 = useCase.iterator();
        while (it6.hasNext()) {
            domain2 = CommunityVoicesServiceImplKt.toDomain((FilterOptionResponseModel) it6.next());
            arrayList6.add(domain2);
        }
        List<FilterOptionResponseModel> accents = availableFiltersResponseModel.getAccents();
        ArrayList arrayList7 = new ArrayList(tn.p.a0(accents, 10));
        Iterator<T> it7 = accents.iterator();
        while (it7.hasNext()) {
            domain = CommunityVoicesServiceImplKt.toDomain((FilterOptionResponseModel) it7.next());
            arrayList7.add(domain);
        }
        return new AvailableFilters(arrayList, arrayList2, arrayList3, arrayList4, arrayList5, arrayList6, arrayList7);
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        return new CommunityVoicesServiceImpl$getFilters$2(this.this$0, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, wn.c<? super AsyncCallResult<AvailableFilters>> cVar) {
        return ((CommunityVoicesServiceImpl$getFilters$2) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        CommunityVoicesApi communityVoicesApi;
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                sn.a.g(obj);
            } else {
                c6.x("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            sn.a.g(obj);
            communityVoicesApi = this.this$0.api;
            this.label = 1;
            obj = communityVoicesApi.getAvailableFilters(this);
            xn.a aVar = xn.a.f37986a;
            if (obj == aVar) {
                return aVar;
            }
        }
        return ApiResultExtensionKt.map(ApiResultExtensionKt.toDomain((ApiResult) obj), new b(1));
    }
}
