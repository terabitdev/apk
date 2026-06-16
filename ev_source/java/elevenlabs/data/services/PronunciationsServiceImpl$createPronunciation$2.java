package io.elevenlabs.data.services;

import com.google.protobuf.c6;
import fr.d0;
import ho.p;
import io.elevenlabs.data.api.PronunciationsAPI;
import io.elevenlabs.data.extensions.ApiResultExtensionKt;
import io.elevenlabs.data.model.ApiResult;
import io.elevenlabs.data.model.request.CreatePronunciationRequest;
import io.elevenlabs.domain.model.AsyncCallResult;
import io.elevenlabs.domain.model.Pronunciation;
import kotlin.Metadata;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.data.services.PronunciationsServiceImpl$createPronunciation$2", f = "PronunciationsServiceImpl.kt", l = {50, 55}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lfr/d0;", "Lio/elevenlabs/domain/model/AsyncCallResult;", "Lio/elevenlabs/domain/model/Pronunciation;", "<anonymous>", "(Lfr/d0;)Lio/elevenlabs/domain/model/AsyncCallResult;"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes3.dex */
public final class PronunciationsServiceImpl$createPronunciation$2 extends yn.i implements p {
    final /* synthetic */ String $originalText;
    final /* synthetic */ String $spokenText;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ PronunciationsServiceImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PronunciationsServiceImpl$createPronunciation$2(String str, String str2, PronunciationsServiceImpl pronunciationsServiceImpl, wn.c<? super PronunciationsServiceImpl$createPronunciation$2> cVar) {
        super(2, cVar);
        this.$originalText = str;
        this.$spokenText = str2;
        this.this$0 = pronunciationsServiceImpl;
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        return new PronunciationsServiceImpl$createPronunciation$2(this.$originalText, this.$spokenText, this.this$0, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, wn.c<? super AsyncCallResult<Pronunciation>> cVar) {
        return ((PronunciationsServiceImpl$createPronunciation$2) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0042, code lost:
    
        if (r7 == r4) goto L38;
     */
    @Override // yn.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        PronunciationsAPI pronunciationsAPI;
        Object refreshPronunciationsInternal;
        int i10 = this.label;
        xn.a aVar = xn.a.f37986a;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    AsyncCallResult asyncCallResult = (AsyncCallResult) this.L$1;
                    sn.a.g(obj);
                    return asyncCallResult;
                }
                c6.x("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            sn.a.g(obj);
        } else {
            sn.a.g(obj);
            CreatePronunciationRequest createPronunciationRequest = new CreatePronunciationRequest(this.$originalText, this.$spokenText);
            pronunciationsAPI = this.this$0.pronunciationsApi;
            this.L$0 = null;
            this.label = 1;
            obj = pronunciationsAPI.createPronunciation(createPronunciationRequest, this);
        }
        AsyncCallResult map = ApiResultExtensionKt.map(ApiResultExtensionKt.toDomain((ApiResult) obj), new g(this.this$0, 0));
        if (map instanceof AsyncCallResult.Success) {
            PronunciationsServiceImpl pronunciationsServiceImpl = this.this$0;
            this.L$0 = null;
            this.L$1 = map;
            this.label = 2;
            refreshPronunciationsInternal = pronunciationsServiceImpl.refreshPronunciationsInternal(this);
            if (refreshPronunciationsInternal == aVar) {
                return aVar;
            }
        }
        return map;
    }
}
