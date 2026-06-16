package io.elevenlabs.readerapp.ui.screens.authenticated.purchases.hourshistory;

import com.google.protobuf.c6;
import fr.d0;
import ho.l;
import ho.p;
import io.elevenlabs.domain.model.AsyncCallResult;
import io.elevenlabs.domain.model.UsageSectionsPage;
import io.elevenlabs.domain.services.CustomerService;
import io.elevenlabs.domain.usecase.ResolveErrorMessageUseCase;
import kotlin.Metadata;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.purchases.hourshistory.HoursHistoryViewModel$refresh$1$2", f = "HoursHistoryViewModel.kt", l = {66}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class HoursHistoryViewModel$refresh$1$2 extends yn.i implements p {
    int label;
    final /* synthetic */ HoursHistoryViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HoursHistoryViewModel$refresh$1$2(HoursHistoryViewModel hoursHistoryViewModel, wn.c<? super HoursHistoryViewModel$refresh$1$2> cVar) {
        super(2, cVar);
        this.this$0 = hoursHistoryViewModel;
    }

    public static final HoursHistoryState invokeSuspend$lambda$0(HoursHistoryViewModel hoursHistoryViewModel, AsyncCallResult asyncCallResult, HoursHistoryState hoursHistoryState) {
        ResolveErrorMessageUseCase resolveErrorMessageUseCase;
        resolveErrorMessageUseCase = hoursHistoryViewModel.resolveErrorMessageUseCase;
        return HoursHistoryState.copy$default(hoursHistoryState, false, ResolveErrorMessageUseCase.invoke$default(resolveErrorMessageUseCase, (AsyncCallResult.Error) asyncCallResult, null, 2, null), null, false, false, 28, null);
    }

    public static final HoursHistoryState invokeSuspend$lambda$1(AsyncCallResult asyncCallResult, HoursHistoryState hoursHistoryState) {
        return HoursHistoryState.copy$default(hoursHistoryState, false, "", ((UsageSectionsPage) ((AsyncCallResult.Success) asyncCallResult).getData()).getSections(), false, false, 24, null);
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        return new HoursHistoryViewModel$refresh$1$2(this.this$0, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, wn.c<? super z> cVar) {
        return ((HoursHistoryViewModel$refresh$1$2) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
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
            CustomerService customerService = this.this$0.customerService;
            this.label = 1;
            obj = customerService.getCreditHistorySections(this);
            xn.a aVar = xn.a.f37986a;
            if (obj == aVar) {
                return aVar;
            }
        }
        AsyncCallResult asyncCallResult = (AsyncCallResult) obj;
        if (asyncCallResult instanceof AsyncCallResult.Error) {
            final HoursHistoryViewModel hoursHistoryViewModel = this.this$0;
            final AsyncCallResult.Error error = (AsyncCallResult.Error) asyncCallResult;
            hoursHistoryViewModel.queueStateUpdate(new l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.purchases.hourshistory.h
                @Override // ho.l
                public final Object invoke(Object obj2) {
                    HoursHistoryState invokeSuspend$lambda$0;
                    invokeSuspend$lambda$0 = HoursHistoryViewModel$refresh$1$2.invokeSuspend$lambda$0(HoursHistoryViewModel.this, error, (HoursHistoryState) obj2);
                    return invokeSuspend$lambda$0;
                }
            });
        } else if (asyncCallResult instanceof AsyncCallResult.Success) {
            this.this$0.queueStateUpdate(new i((AsyncCallResult.Success) asyncCallResult, 0));
        } else {
            c6.p();
            return null;
        }
        return z.f31622a;
    }
}
