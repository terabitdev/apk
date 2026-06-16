package io.elevenlabs.readerapp.ui.screens.authenticated.purchases;

import com.google.protobuf.c6;
import fr.d0;
import io.elevenlabs.domain.model.AsyncCallResult;
import io.elevenlabs.domain.services.CustomerService;
import io.elevenlabs.domain.usecase.ResolveErrorMessageUseCase;
import io.elevenlabs.readerapp.ui.screens.authenticated.purchases.BookPurchasesState;
import java.util.List;
import kotlin.Metadata;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.purchases.BookPurchasesViewModel$load$1$1", f = "BookPurchasesScreen.kt", l = {87}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class BookPurchasesViewModel$load$1$1 extends yn.i implements ho.p {
    int label;
    final /* synthetic */ BookPurchasesViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BookPurchasesViewModel$load$1$1(BookPurchasesViewModel bookPurchasesViewModel, wn.c<? super BookPurchasesViewModel$load$1$1> cVar) {
        super(2, cVar);
        this.this$0 = bookPurchasesViewModel;
    }

    public static /* synthetic */ BookPurchasesState d(BookPurchasesViewModel bookPurchasesViewModel, AsyncCallResult.Error error, BookPurchasesState bookPurchasesState) {
        return invokeSuspend$lambda$0(bookPurchasesViewModel, error, bookPurchasesState);
    }

    public static final BookPurchasesState invokeSuspend$lambda$0(BookPurchasesViewModel bookPurchasesViewModel, AsyncCallResult asyncCallResult, BookPurchasesState bookPurchasesState) {
        ResolveErrorMessageUseCase resolveErrorMessageUseCase;
        resolveErrorMessageUseCase = bookPurchasesViewModel.resolveErrorMessageUseCase;
        return new BookPurchasesState.Error(ResolveErrorMessageUseCase.invoke$default(resolveErrorMessageUseCase, (AsyncCallResult.Error) asyncCallResult, null, 2, null));
    }

    public static final BookPurchasesState invokeSuspend$lambda$1(AsyncCallResult asyncCallResult, BookPurchasesState bookPurchasesState) {
        return new BookPurchasesState.Loaded((List) ((AsyncCallResult.Success) asyncCallResult).getData());
    }

    @Override // yn.a
    public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
        return new BookPurchasesViewModel$load$1$1(this.this$0, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, wn.c<? super sn.z> cVar) {
        return ((BookPurchasesViewModel$load$1$1) create(d0Var, cVar)).invokeSuspend(sn.z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        CustomerService customerService;
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
            customerService = this.this$0.customerService;
            this.label = 1;
            obj = customerService.getPurchaseHistory(this);
            xn.a aVar = xn.a.f37986a;
            if (obj == aVar) {
                return aVar;
            }
        }
        AsyncCallResult asyncCallResult = (AsyncCallResult) obj;
        if (asyncCallResult instanceof AsyncCallResult.Error) {
            BookPurchasesViewModel bookPurchasesViewModel = this.this$0;
            bookPurchasesViewModel.queueStateUpdate(new f(bookPurchasesViewModel, (AsyncCallResult.Error) asyncCallResult, 0));
        } else if (asyncCallResult instanceof AsyncCallResult.Success) {
            this.this$0.queueStateUpdate(new g((AsyncCallResult.Success) asyncCallResult, 0));
        } else {
            c6.p();
            return null;
        }
        return sn.z.f31622a;
    }
}
