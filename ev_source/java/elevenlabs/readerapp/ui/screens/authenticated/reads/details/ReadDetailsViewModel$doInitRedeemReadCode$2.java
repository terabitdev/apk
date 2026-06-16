package io.elevenlabs.readerapp.ui.screens.authenticated.reads.details;

import com.google.protobuf.c6;
import io.elevenlabs.domain.Analytics;
import io.elevenlabs.domain.model.AsyncCallResult;
import io.elevenlabs.domain.services.ReadsService;
import io.elevenlabs.domain.usecase.ResolveErrorMessageUseCase;
import kotlin.Metadata;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.reads.details.ReadDetailsViewModel$doInitRedeemReadCode$2", f = "ReadDetailsViewModel.kt", l = {411}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class ReadDetailsViewModel$doInitRedeemReadCode$2 extends yn.i implements ho.p {
    final /* synthetic */ String $code;
    final /* synthetic */ String $readId;
    int label;
    final /* synthetic */ ReadDetailsViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReadDetailsViewModel$doInitRedeemReadCode$2(ReadDetailsViewModel readDetailsViewModel, String str, String str2, wn.c<? super ReadDetailsViewModel$doInitRedeemReadCode$2> cVar) {
        super(2, cVar);
        this.this$0 = readDetailsViewModel;
        this.$readId = str;
        this.$code = str2;
    }

    public static final ReadDetailsState invokeSuspend$lambda$1(String str, ReadDetailsState readDetailsState) {
        return ReadDetailsState.copy$default(readDetailsState, null, false, null, null, false, false, null, false, null, null, false, null, null, null, null, false, null, null, false, false, false, str, null, false, null, false, false, 131071999, null);
    }

    @Override // yn.a
    public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
        return new ReadDetailsViewModel$doInitRedeemReadCode$2(this.this$0, this.$readId, this.$code, cVar);
    }

    @Override // ho.p
    public final Object invoke(fr.d0 d0Var, wn.c<? super sn.z> cVar) {
        return ((ReadDetailsViewModel$doInitRedeemReadCode$2) create(d0Var, cVar)).invokeSuspend(sn.z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        ReadsService readsService;
        ResolveErrorMessageUseCase resolveErrorMessageUseCase;
        Analytics analytics;
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
            readsService = this.this$0.readsService;
            String str = this.$readId;
            String str2 = this.$code;
            this.label = 1;
            obj = readsService.redeemRead(str, str2, this);
            xn.a aVar = xn.a.f37986a;
            if (obj == aVar) {
                return aVar;
            }
        }
        AsyncCallResult asyncCallResult = (AsyncCallResult) obj;
        if (asyncCallResult instanceof AsyncCallResult.Success) {
            analytics = this.this$0.analytics;
            analytics.log(Analytics.Event.PaidReadUnlocked.INSTANCE);
            this.this$0.queueStateUpdate(new m0(0));
            this.this$0.loadReadDetails(this.$readId);
        } else if (asyncCallResult instanceof AsyncCallResult.Error) {
            resolveErrorMessageUseCase = this.this$0.resolveErrorMessageUseCase;
            this.this$0.queueStateUpdate(new k0(ResolveErrorMessageUseCase.invoke$default(resolveErrorMessageUseCase, (AsyncCallResult.Error) asyncCallResult, null, 2, null), 1));
        } else {
            c6.p();
            return null;
        }
        return sn.z.f31622a;
    }
}
