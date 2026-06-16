package io.elevenlabs.readerapp.ui.screens.authenticated.purchases;

import com.google.protobuf.c6;
import fr.d0;
import io.elevenlabs.domain.model.AsyncCallResult;
import io.elevenlabs.domain.services.ReferralService;
import io.elevenlabs.domain.services.ToastService;
import io.elevenlabs.domain.usecase.ResolveErrorMessageUseCase;
import kotlin.Metadata;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.purchases.ReferFriendViewModel$share$1$1", f = "ReferFriendScreen.kt", l = {61}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class ReferFriendViewModel$share$1$1 extends yn.i implements ho.p {
    int label;
    final /* synthetic */ ReferFriendViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReferFriendViewModel$share$1$1(ReferFriendViewModel referFriendViewModel, wn.c<? super ReferFriendViewModel$share$1$1> cVar) {
        super(2, cVar);
        this.this$0 = referFriendViewModel;
    }

    public static /* synthetic */ ReferFriendState h(ReferFriendViewModel referFriendViewModel, AsyncCallResult.Error error, ReferFriendState referFriendState) {
        return invokeSuspend$lambda$0(referFriendViewModel, error, referFriendState);
    }

    public static final ReferFriendState invokeSuspend$lambda$0(ReferFriendViewModel referFriendViewModel, AsyncCallResult asyncCallResult, ReferFriendState referFriendState) {
        ToastService toastService;
        ResolveErrorMessageUseCase resolveErrorMessageUseCase;
        toastService = referFriendViewModel.toastService;
        resolveErrorMessageUseCase = referFriendViewModel.resolveErrorMessageUseCase;
        ToastService.showToast$default(toastService, ResolveErrorMessageUseCase.invoke$default(resolveErrorMessageUseCase, (AsyncCallResult.Error) asyncCallResult, null, 2, null), null, ToastService.ToastVariant.ERROR, 2, null);
        return ReferFriendState.copy$default(referFriendState, false, null, 2, null);
    }

    public static final ReferFriendState invokeSuspend$lambda$1(AsyncCallResult asyncCallResult, ReferFriendState referFriendState) {
        return referFriendState.copy(false, (String) ((AsyncCallResult.Success) asyncCallResult).getData());
    }

    @Override // yn.a
    public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
        return new ReferFriendViewModel$share$1$1(this.this$0, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, wn.c<? super sn.z> cVar) {
        return ((ReferFriendViewModel$share$1$1) create(d0Var, cVar)).invokeSuspend(sn.z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        ReferralService referralService;
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
            referralService = this.this$0.referralService;
            this.label = 1;
            obj = referralService.share(this);
            xn.a aVar = xn.a.f37986a;
            if (obj == aVar) {
                return aVar;
            }
        }
        AsyncCallResult asyncCallResult = (AsyncCallResult) obj;
        if (asyncCallResult instanceof AsyncCallResult.Error) {
            ReferFriendViewModel referFriendViewModel = this.this$0;
            referFriendViewModel.queueStateUpdate(new f(referFriendViewModel, (AsyncCallResult.Error) asyncCallResult, 1));
        } else if (asyncCallResult instanceof AsyncCallResult.Success) {
            this.this$0.queueStateUpdate(new g((AsyncCallResult.Success) asyncCallResult, 2));
        } else {
            c6.p();
            return null;
        }
        return sn.z.f31622a;
    }
}
