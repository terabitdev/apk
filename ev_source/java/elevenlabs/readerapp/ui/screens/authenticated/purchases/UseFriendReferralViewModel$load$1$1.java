package io.elevenlabs.readerapp.ui.screens.authenticated.purchases;

import androidx.lifecycle.c1;
import com.google.protobuf.c6;
import fr.d0;
import fr.g0;
import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.model.AsyncCallResult;
import io.elevenlabs.domain.model.ReferralResult;
import io.elevenlabs.domain.services.CustomerService;
import io.elevenlabs.domain.services.OnboardingService;
import io.elevenlabs.domain.services.ReferralService;
import io.elevenlabs.domain.usecase.ResolveErrorMessageUseCase;
import kotlin.Metadata;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.purchases.UseFriendReferralViewModel$load$1$1", f = "UseFriendReferralScreen.kt", l = {86}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class UseFriendReferralViewModel$load$1$1 extends yn.i implements ho.p {
    final /* synthetic */ UseFriendReferralState $this_queueStateUpdate;
    int label;
    final /* synthetic */ UseFriendReferralViewModel this$0;

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.purchases.UseFriendReferralViewModel$load$1$1$2", f = "UseFriendReferralScreen.kt", l = {100}, m = "invokeSuspend", v = 2)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
    /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.purchases.UseFriendReferralViewModel$load$1$1$2 */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass2 extends yn.i implements ho.p {
        int label;
        final /* synthetic */ UseFriendReferralViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(UseFriendReferralViewModel useFriendReferralViewModel, wn.c<? super AnonymousClass2> cVar) {
            super(2, cVar);
            this.this$0 = useFriendReferralViewModel;
        }

        @Override // yn.a
        public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
            return new AnonymousClass2(this.this$0, cVar);
        }

        @Override // ho.p
        public final Object invoke(d0 d0Var, wn.c<? super sn.z> cVar) {
            return ((AnonymousClass2) create(d0Var, cVar)).invokeSuspend(sn.z.f31622a);
        }

        @Override // yn.a
        public final Object invokeSuspend(Object obj) {
            jl.a aVar;
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
                aVar = this.this$0.customerService;
                CustomerService customerService = (CustomerService) aVar.get();
                this.label = 1;
                Object invalidateAndSync = customerService.invalidateAndSync(this);
                xn.a aVar2 = xn.a.f37986a;
                if (invalidateAndSync == aVar2) {
                    return aVar2;
                }
            }
            return sn.z.f31622a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UseFriendReferralViewModel$load$1$1(UseFriendReferralViewModel useFriendReferralViewModel, UseFriendReferralState useFriendReferralState, wn.c<? super UseFriendReferralViewModel$load$1$1> cVar) {
        super(2, cVar);
        this.this$0 = useFriendReferralViewModel;
        this.$this_queueStateUpdate = useFriendReferralState;
    }

    public static final UseFriendReferralState invokeSuspend$lambda$0(UseFriendReferralViewModel useFriendReferralViewModel, AsyncCallResult asyncCallResult, UseFriendReferralState useFriendReferralState) {
        ResolveErrorMessageUseCase resolveErrorMessageUseCase;
        resolveErrorMessageUseCase = useFriendReferralViewModel.resolveErrorMessageUseCase;
        return UseFriendReferralState.copy$default(useFriendReferralState, false, null, ResolveErrorMessageUseCase.invoke$default(resolveErrorMessageUseCase, (AsyncCallResult.Error) asyncCallResult, null, 2, null), false, false, null, null, null, 250, null);
    }

    public static final UseFriendReferralState invokeSuspend$lambda$1(AsyncCallResult asyncCallResult, UseFriendReferralState useFriendReferralState) {
        AsyncCallResult.Success success = (AsyncCallResult.Success) asyncCallResult;
        return UseFriendReferralState.copy$default(useFriendReferralState, false, null, null, true, false, null, Long.valueOf(((ReferralResult) success.getData()).getHoursAllocated()), ((ReferralResult) success.getData()).getSubscriptionMonths(), 54, null);
    }

    @Override // yn.a
    public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
        return new UseFriendReferralViewModel$load$1$1(this.this$0, this.$this_queueStateUpdate, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, wn.c<? super sn.z> cVar) {
        return ((UseFriendReferralViewModel$load$1$1) create(d0Var, cVar)).invokeSuspend(sn.z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        ReferralService referralService;
        jl.a aVar;
        DispatcherFactory dispatcherFactory;
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
            String code = this.$this_queueStateUpdate.getCode();
            this.label = 1;
            obj = referralService.use(code, this);
            xn.a aVar2 = xn.a.f37986a;
            if (obj == aVar2) {
                return aVar2;
            }
        }
        AsyncCallResult asyncCallResult = (AsyncCallResult) obj;
        if (asyncCallResult instanceof AsyncCallResult.Error) {
            UseFriendReferralViewModel useFriendReferralViewModel = this.this$0;
            useFriendReferralViewModel.queueStateUpdate(new z(useFriendReferralViewModel, (AsyncCallResult.Error) asyncCallResult, 0));
        } else if (asyncCallResult instanceof AsyncCallResult.Success) {
            AsyncCallResult.Success success = (AsyncCallResult.Success) asyncCallResult;
            if (((ReferralResult) success.getData()).getSubscriptionMonths() != null) {
                aVar = this.this$0.onboardingService;
                ((OnboardingService) aVar.get()).seenPaywall();
                s7.a h10 = c1.h(this.this$0);
                dispatcherFactory = this.this$0.getDispatcherFactory();
                g0.D(h10, dispatcherFactory.getDefault(), null, new AnonymousClass2(this.this$0, null), 2);
            }
            this.this$0.queueStateUpdate(new g(success, 3));
        } else {
            c6.p();
            return null;
        }
        return sn.z.f31622a;
    }
}
