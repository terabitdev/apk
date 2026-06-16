package io.elevenlabs.data.services;

import com.google.protobuf.c6;
import fr.d0;
import ho.p;
import io.elevenlabs.data.api.CommunityVoicesApi;
import io.elevenlabs.data.extensions.ApiResultExtensionKt;
import io.elevenlabs.data.mapping.VoiceMappingKt;
import io.elevenlabs.data.model.ApiResult;
import io.elevenlabs.data.model.response.ReaderVoicesExploreResponseModelV2;
import io.elevenlabs.data.model.response.VoiceItemResponseModel;
import io.elevenlabs.domain.model.AsyncCallResult;
import io.elevenlabs.domain.model.CommunityVoicesPage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.data.services.CommunityVoicesServiceImpl$getCommunityVoices$2", f = "CommunityVoicesServiceImpl.kt", l = {36}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lfr/d0;", "Lio/elevenlabs/domain/model/AsyncCallResult;", "Lio/elevenlabs/domain/model/CommunityVoicesPage;", "<anonymous>", "(Lfr/d0;)Lio/elevenlabs/domain/model/AsyncCallResult;"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes3.dex */
public final class CommunityVoicesServiceImpl$getCommunityVoices$2 extends yn.i implements p {
    final /* synthetic */ String $accent;
    final /* synthetic */ String $age;
    final /* synthetic */ String $category;
    final /* synthetic */ String $gender;
    final /* synthetic */ String $language;
    final /* synthetic */ int $page;
    final /* synthetic */ int $pageSize;
    final /* synthetic */ String $search;
    final /* synthetic */ String $sort;
    final /* synthetic */ Set<String> $useCases;
    int label;
    final /* synthetic */ CommunityVoicesServiceImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommunityVoicesServiceImpl$getCommunityVoices$2(CommunityVoicesServiceImpl communityVoicesServiceImpl, int i10, int i11, String str, String str2, String str3, String str4, String str5, String str6, Set<String> set, String str7, wn.c<? super CommunityVoicesServiceImpl$getCommunityVoices$2> cVar) {
        super(2, cVar);
        this.this$0 = communityVoicesServiceImpl;
        this.$page = i10;
        this.$pageSize = i11;
        this.$category = str;
        this.$gender = str2;
        this.$age = str3;
        this.$accent = str4;
        this.$language = str5;
        this.$search = str6;
        this.$useCases = set;
        this.$sort = str7;
    }

    public static /* synthetic */ CommunityVoicesPage d(ReaderVoicesExploreResponseModelV2 readerVoicesExploreResponseModelV2) {
        return invokeSuspend$lambda$0(readerVoicesExploreResponseModelV2);
    }

    public static final CommunityVoicesPage invokeSuspend$lambda$0(ReaderVoicesExploreResponseModelV2 readerVoicesExploreResponseModelV2) {
        List<VoiceItemResponseModel> voices = readerVoicesExploreResponseModelV2.getVoices();
        ArrayList arrayList = new ArrayList(tn.p.a0(voices, 10));
        Iterator<T> it = voices.iterator();
        while (it.hasNext()) {
            arrayList.add(VoiceMappingKt.toDomain((VoiceItemResponseModel) it.next()));
        }
        return new CommunityVoicesPage(arrayList, readerVoicesExploreResponseModelV2.getHasMore());
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        return new CommunityVoicesServiceImpl$getCommunityVoices$2(this.this$0, this.$page, this.$pageSize, this.$category, this.$gender, this.$age, this.$accent, this.$language, this.$search, this.$useCases, this.$sort, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, wn.c<? super AsyncCallResult<CommunityVoicesPage>> cVar) {
        return ((CommunityVoicesServiceImpl$getCommunityVoices$2) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        CommunityVoicesApi communityVoicesApi;
        Object communityVoices$default;
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                sn.a.g(obj);
                communityVoices$default = obj;
            } else {
                c6.x("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            sn.a.g(obj);
            communityVoicesApi = this.this$0.api;
            int i11 = this.$page;
            Integer num = new Integer(this.$pageSize);
            String str = this.$category;
            String str2 = this.$gender;
            String str3 = this.$age;
            String str4 = this.$accent;
            String str5 = this.$language;
            String str6 = this.$search;
            Set<String> set = this.$useCases;
            String str7 = this.$sort;
            this.label = 1;
            communityVoices$default = CommunityVoicesApi.getCommunityVoices$default(communityVoicesApi, i11, num, str, str2, str3, str4, str5, str6, set, null, null, null, str7, this, 3584, null);
            xn.a aVar = xn.a.f37986a;
            if (communityVoices$default == aVar) {
                return aVar;
            }
        }
        return ApiResultExtensionKt.map(ApiResultExtensionKt.toDomain((ApiResult) communityVoices$default), new b(0));
    }
}
