package io.elevenlabs.readerapp.ui.screens.authenticated.reads.details;

import android.gov.nist.core.Separators;
import com.google.protobuf.c6;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.model.AsyncCallResult;
import io.elevenlabs.domain.model.RawOneTimeProduct;
import io.elevenlabs.domain.services.PurchasesService;
import io.elevenlabs.domain.usecase.ResolveErrorMessageUseCase;
import kotlin.Metadata;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.reads.details.ReadDetailsViewModel$loadStoreProduct$1$1", f = "ReadDetailsViewModel.kt", l = {512}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class ReadDetailsViewModel$loadStoreProduct$1$1 extends yn.i implements ho.p {
    final /* synthetic */ String $androidProductId;
    int label;
    final /* synthetic */ ReadDetailsViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReadDetailsViewModel$loadStoreProduct$1$1(ReadDetailsViewModel readDetailsViewModel, String str, wn.c<? super ReadDetailsViewModel$loadStoreProduct$1$1> cVar) {
        super(2, cVar);
        this.this$0 = readDetailsViewModel;
        this.$androidProductId = str;
    }

    public static final ReadDetailsState invokeSuspend$lambda$0(RawOneTimeProduct rawOneTimeProduct, ReadDetailsState readDetailsState) {
        PurchaseState purchaseState;
        PurchaseState purchase = readDetailsState.getPurchase();
        if (purchase != null) {
            purchaseState = PurchaseState.copy$default(purchase, null, rawOneTimeProduct, false, false, null, 21, null);
        } else {
            purchaseState = null;
        }
        return ReadDetailsState.copy$default(readDetailsState, null, false, null, null, false, false, null, false, null, null, false, purchaseState, null, null, null, false, null, null, false, false, false, null, null, false, null, false, false, 134215647, null);
    }

    public static final ReadDetailsState invokeSuspend$lambda$1(ReadDetailsViewModel readDetailsViewModel, AsyncCallResult asyncCallResult, ReadDetailsState readDetailsState) {
        ResolveErrorMessageUseCase resolveErrorMessageUseCase;
        PurchaseState purchase = readDetailsState.getPurchase();
        PurchaseState purchaseState = null;
        if (purchase != null) {
            resolveErrorMessageUseCase = readDetailsViewModel.resolveErrorMessageUseCase;
            purchaseState = PurchaseState.copy$default(purchase, null, null, false, false, ResolveErrorMessageUseCase.invoke$default(resolveErrorMessageUseCase, (AsyncCallResult.Error) asyncCallResult, null, 2, null), 7, null);
        }
        return ReadDetailsState.copy$default(readDetailsState, null, false, null, null, false, false, null, false, null, null, false, purchaseState, null, null, null, false, null, null, false, false, false, null, null, false, null, false, false, 134215679, null);
    }

    @Override // yn.a
    public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
        return new ReadDetailsViewModel$loadStoreProduct$1$1(this.this$0, this.$androidProductId, cVar);
    }

    @Override // ho.p
    public final Object invoke(fr.d0 d0Var, wn.c<? super sn.z> cVar) {
        return ((ReadDetailsViewModel$loadStoreProduct$1$1) create(d0Var, cVar)).invokeSuspend(sn.z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        Logger logger;
        Logger logger2;
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
            PurchasesService purchasesService = this.this$0.purchasesService;
            String str = this.$androidProductId;
            this.label = 1;
            obj = purchasesService.getGooglePlayProduct(str, this);
            xn.a aVar = xn.a.f37986a;
            if (obj == aVar) {
                return aVar;
            }
        }
        AsyncCallResult asyncCallResult = (AsyncCallResult) obj;
        if (asyncCallResult instanceof AsyncCallResult.Success) {
            RawOneTimeProduct rawOneTimeProduct = (RawOneTimeProduct) ((AsyncCallResult.Success) asyncCallResult).getData();
            logger2 = this.this$0.logger;
            logger2.log("ReadDetailsViewModel", "loadStoreProduct success: productId=" + rawOneTimeProduct.getId() + ", price=" + (((float) rawOneTimeProduct.getPrice().getAmount()) / 100.0f) + Separators.SP + rawOneTimeProduct.getPrice().getCurrency());
            this.this$0.queueStateUpdate(new j0(rawOneTimeProduct, 3));
        } else if (asyncCallResult instanceof AsyncCallResult.Error) {
            logger = this.this$0.logger;
            AsyncCallResult.Error error = (AsyncCallResult.Error) asyncCallResult;
            logger.log("ReadDetailsViewModel", "loadStoreProduct error - " + error.getError());
            ReadDetailsViewModel readDetailsViewModel = this.this$0;
            readDetailsViewModel.queueStateUpdate(new l0(readDetailsViewModel, error, 1));
        } else {
            c6.p();
            return null;
        }
        return sn.z.f31622a;
    }
}
