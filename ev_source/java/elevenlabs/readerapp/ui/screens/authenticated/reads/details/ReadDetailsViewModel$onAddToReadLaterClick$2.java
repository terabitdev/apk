package io.elevenlabs.readerapp.ui.screens.authenticated.reads.details;

import com.google.protobuf.c6;
import io.elevenlabs.domain.Analytics;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.StringProvider;
import io.elevenlabs.domain.model.AsyncCallResult;
import io.elevenlabs.domain.services.CollectionsService;
import io.elevenlabs.domain.usecase.ResolveErrorMessageUseCase;
import io.elevenlabs.readerapp.R;
import kotlin.Metadata;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.reads.details.ReadDetailsViewModel$onAddToReadLaterClick$2", f = "ReadDetailsViewModel.kt", l = {210}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class ReadDetailsViewModel$onAddToReadLaterClick$2 extends yn.i implements ho.p {
    final /* synthetic */ String $readId;
    int label;
    final /* synthetic */ ReadDetailsViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReadDetailsViewModel$onAddToReadLaterClick$2(ReadDetailsViewModel readDetailsViewModel, String str, wn.c<? super ReadDetailsViewModel$onAddToReadLaterClick$2> cVar) {
        super(2, cVar);
        this.this$0 = readDetailsViewModel;
        this.$readId = str;
    }

    @Override // yn.a
    public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
        return new ReadDetailsViewModel$onAddToReadLaterClick$2(this.this$0, this.$readId, cVar);
    }

    @Override // ho.p
    public final Object invoke(fr.d0 d0Var, wn.c<? super sn.z> cVar) {
        return ((ReadDetailsViewModel$onAddToReadLaterClick$2) create(d0Var, cVar)).invokeSuspend(sn.z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        jl.a aVar;
        Logger logger;
        ResolveErrorMessageUseCase resolveErrorMessageUseCase;
        Analytics analytics;
        StringProvider stringProvider;
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
            aVar = this.this$0.collectionsService;
            CollectionsService collectionsService = (CollectionsService) aVar.get();
            String str = this.$readId;
            this.label = 1;
            obj = collectionsService.addReadToReadLater(str, this);
            xn.a aVar2 = xn.a.f37986a;
            if (obj == aVar2) {
                return aVar2;
            }
        }
        AsyncCallResult asyncCallResult = (AsyncCallResult) obj;
        if (asyncCallResult instanceof AsyncCallResult.Success) {
            analytics = this.this$0.analytics;
            analytics.log(new Analytics.Event.ReadLaterAdded(Analytics.Event.ReadDetailsActionSource.TopBar, this.$readId));
            ReadDetailsViewModel readDetailsViewModel = this.this$0;
            stringProvider = readDetailsViewModel.stringProvider;
            readDetailsViewModel.showReadLaterToast(stringProvider.getString(R.string.read_later_toast_added));
        } else if (asyncCallResult instanceof AsyncCallResult.Error) {
            logger = this.this$0.logger;
            AsyncCallResult.Error error = (AsyncCallResult.Error) asyncCallResult;
            Logger.logWarning$default(logger, "ReadDetailsViewModel", "addReadToReadLater failed for " + this.$readId + ": " + error.getError(), null, 4, null);
            this.this$0.queueStateUpdate(new m0(2));
            ReadDetailsViewModel readDetailsViewModel2 = this.this$0;
            resolveErrorMessageUseCase = readDetailsViewModel2.resolveErrorMessageUseCase;
            readDetailsViewModel2.showReadLaterErrorToast(ResolveErrorMessageUseCase.invoke$default(resolveErrorMessageUseCase, error, null, 2, null));
        } else {
            c6.p();
            return null;
        }
        return sn.z.f31622a;
    }
}
