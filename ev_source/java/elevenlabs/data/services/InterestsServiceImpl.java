package io.elevenlabs.data.services;

import com.google.protobuf.c6;
import io.elevenlabs.data.api.InterestsAPI;
import io.elevenlabs.data.api.InterestsQuestionResponseModel;
import io.elevenlabs.data.api.InterestsSaveRequestModel;
import io.elevenlabs.data.extensions.ApiResultExtensionKt;
import io.elevenlabs.data.model.ApiResult;
import io.elevenlabs.domain.model.AsyncCallResult;
import io.elevenlabs.domain.model.InterestsAnswer;
import io.elevenlabs.domain.model.InterestsQuestion;
import io.elevenlabs.domain.services.InterestsService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;
import tn.p;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0096@¢\u0006\u0004\b\b\u0010\tJ\u001e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00062\u0006\u0010\n\u001a\u00020\u0007H\u0096@¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000e¨\u0006\u000f"}, d2 = {"Lio/elevenlabs/data/services/InterestsServiceImpl;", "Lio/elevenlabs/domain/services/InterestsService;", "Lio/elevenlabs/data/api/InterestsAPI;", "interestsAPI", "<init>", "(Lio/elevenlabs/data/api/InterestsAPI;)V", "Lio/elevenlabs/domain/model/AsyncCallResult;", "Lio/elevenlabs/domain/model/InterestsQuestion;", "getInterests", "(Lwn/c;)Ljava/lang/Object;", "question", "Lsn/z;", "saveInterests", "(Lio/elevenlabs/domain/model/InterestsQuestion;Lwn/c;)Ljava/lang/Object;", "Lio/elevenlabs/data/api/InterestsAPI;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class InterestsServiceImpl implements InterestsService {
    private final InterestsAPI interestsAPI;

    public InterestsServiceImpl(InterestsAPI interestsAPI) {
        interestsAPI.getClass();
        this.interestsAPI = interestsAPI;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterestsQuestion getInterests$lambda$0(InterestsQuestionResponseModel interestsQuestionResponseModel) {
        InterestsQuestion domain;
        interestsQuestionResponseModel.getClass();
        domain = InterestsServiceImplKt.toDomain(interestsQuestionResponseModel);
        return domain;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    @Override // io.elevenlabs.domain.services.InterestsService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getInterests(wn.c<? super AsyncCallResult<InterestsQuestion>> cVar) {
        InterestsServiceImpl$getInterests$1 interestsServiceImpl$getInterests$1;
        int i10;
        if (cVar instanceof InterestsServiceImpl$getInterests$1) {
            interestsServiceImpl$getInterests$1 = (InterestsServiceImpl$getInterests$1) cVar;
            int i11 = interestsServiceImpl$getInterests$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                interestsServiceImpl$getInterests$1.label = i11 - Integer.MIN_VALUE;
                Object obj = interestsServiceImpl$getInterests$1.result;
                i10 = interestsServiceImpl$getInterests$1.label;
                if (i10 == 0) {
                    if (i10 == 1) {
                        sn.a.g(obj);
                    } else {
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    sn.a.g(obj);
                    InterestsAPI interestsAPI = this.interestsAPI;
                    interestsServiceImpl$getInterests$1.label = 1;
                    obj = interestsAPI.getInterests(interestsServiceImpl$getInterests$1);
                    xn.a aVar = xn.a.f37986a;
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                return ApiResultExtensionKt.map(ApiResultExtensionKt.toDomain((ApiResult) obj), new b(17));
            }
        }
        interestsServiceImpl$getInterests$1 = new InterestsServiceImpl$getInterests$1(this, cVar);
        Object obj2 = interestsServiceImpl$getInterests$1.result;
        i10 = interestsServiceImpl$getInterests$1.label;
        if (i10 == 0) {
        }
        return ApiResultExtensionKt.map(ApiResultExtensionKt.toDomain((ApiResult) obj2), new b(17));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    @Override // io.elevenlabs.domain.services.InterestsService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object saveInterests(InterestsQuestion interestsQuestion, wn.c<? super AsyncCallResult<z>> cVar) {
        InterestsServiceImpl$saveInterests$1 interestsServiceImpl$saveInterests$1;
        int i10;
        if (cVar instanceof InterestsServiceImpl$saveInterests$1) {
            interestsServiceImpl$saveInterests$1 = (InterestsServiceImpl$saveInterests$1) cVar;
            int i11 = interestsServiceImpl$saveInterests$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                interestsServiceImpl$saveInterests$1.label = i11 - Integer.MIN_VALUE;
                Object obj = interestsServiceImpl$saveInterests$1.result;
                i10 = interestsServiceImpl$saveInterests$1.label;
                if (i10 == 0) {
                    if (i10 == 1) {
                        sn.a.g(obj);
                    } else {
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    sn.a.g(obj);
                    List<InterestsAnswer> answers = interestsQuestion.getAnswers();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : answers) {
                        if (((InterestsAnswer) obj2).getSelected()) {
                            arrayList.add(obj2);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(p.a0(arrayList, 10));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(((InterestsAnswer) it.next()).getKey());
                    }
                    InterestsAPI interestsAPI = this.interestsAPI;
                    InterestsSaveRequestModel interestsSaveRequestModel = new InterestsSaveRequestModel(arrayList2);
                    interestsServiceImpl$saveInterests$1.L$0 = null;
                    interestsServiceImpl$saveInterests$1.L$1 = null;
                    interestsServiceImpl$saveInterests$1.label = 1;
                    obj = interestsAPI.postInterests(interestsSaveRequestModel, interestsServiceImpl$saveInterests$1);
                    xn.a aVar = xn.a.f37986a;
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                return ApiResultExtensionKt.toDomain((ApiResult) obj);
            }
        }
        interestsServiceImpl$saveInterests$1 = new InterestsServiceImpl$saveInterests$1(this, cVar);
        Object obj3 = interestsServiceImpl$saveInterests$1.result;
        i10 = interestsServiceImpl$saveInterests$1.label;
        if (i10 == 0) {
        }
        return ApiResultExtensionKt.toDomain((ApiResult) obj3);
    }
}
