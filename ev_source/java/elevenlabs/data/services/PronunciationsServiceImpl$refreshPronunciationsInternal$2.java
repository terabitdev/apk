package io.elevenlabs.data.services;

import com.google.protobuf.c6;
import fr.d0;
import ho.p;
import io.elevenlabs.data.api.PronunciationsAPI;
import io.elevenlabs.data.extensions.ApiResultExtensionKt;
import io.elevenlabs.data.model.ApiResult;
import io.elevenlabs.data.model.response.PronunciationResponse;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.model.AsyncCallResult;
import io.elevenlabs.domain.model.Pronunciation;
import ir.j1;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.data.services.PronunciationsServiceImpl$refreshPronunciationsInternal$2", f = "PronunciationsServiceImpl.kt", l = {154}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes3.dex */
public final class PronunciationsServiceImpl$refreshPronunciationsInternal$2 extends yn.i implements p {
    int label;
    final /* synthetic */ PronunciationsServiceImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PronunciationsServiceImpl$refreshPronunciationsInternal$2(PronunciationsServiceImpl pronunciationsServiceImpl, wn.c<? super PronunciationsServiceImpl$refreshPronunciationsInternal$2> cVar) {
        super(2, cVar);
        this.this$0 = pronunciationsServiceImpl;
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        return new PronunciationsServiceImpl$refreshPronunciationsInternal$2(this.this$0, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, wn.c<? super z> cVar) {
        return ((PronunciationsServiceImpl$refreshPronunciationsInternal$2) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        PronunciationsAPI pronunciationsAPI;
        Logger logger;
        j1 j1Var;
        Logger logger2;
        j1 j1Var2;
        Pronunciation domainModel;
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
            pronunciationsAPI = this.this$0.pronunciationsApi;
            this.label = 1;
            obj = pronunciationsAPI.getPronunciations(this);
            xn.a aVar = xn.a.f37986a;
            if (obj == aVar) {
                return aVar;
            }
        }
        AsyncCallResult domain = ApiResultExtensionKt.toDomain((ApiResult) obj);
        if (domain instanceof AsyncCallResult.Success) {
            Iterable iterable = (Iterable) ((AsyncCallResult.Success) domain).getData();
            PronunciationsServiceImpl pronunciationsServiceImpl = this.this$0;
            ArrayList arrayList = new ArrayList(tn.p.a0(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                domainModel = pronunciationsServiceImpl.toDomainModel((PronunciationResponse) it.next());
                arrayList.add(domainModel);
            }
            j1Var = this.this$0.pronunciationsFlow;
            if (!m.c(j1Var.getValue(), arrayList)) {
                j1Var2 = this.this$0.pronunciationsFlow;
                j1Var2.setValue(arrayList);
            }
            logger2 = this.this$0.logger;
            ib.i.q("Refreshed pronunciations: ", arrayList.size(), " items", logger2, "PronunciationsService");
        } else if (domain instanceof AsyncCallResult.Error) {
            logger = this.this$0.logger;
            Logger.logWarning$default(logger, "PronunciationsService", "Failed to refresh pronunciations: " + ((AsyncCallResult.Error) domain).getError(), null, 4, null);
        } else {
            c6.p();
            return null;
        }
        return z.f31622a;
    }
}
