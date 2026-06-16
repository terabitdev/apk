package io.elevenlabs.readerapp.ui.screens.authenticated.account;

import com.google.protobuf.c6;
import fr.g0;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.model.AccountPage;
import io.elevenlabs.domain.model.AsyncCallResult;
import io.elevenlabs.domain.services.AccountService;
import io.elevenlabs.domain.usecase.ResolveErrorMessageUseCase;
import kotlin.Metadata;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.account.AccountViewModel$loadPage$1", f = "AccountViewModel.kt", l = {103, 122}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lhr/x;", "Lsn/z;", "<anonymous>", "(Lhr/x;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class AccountViewModel$loadPage$1 extends yn.i implements ho.p {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AccountViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountViewModel$loadPage$1(AccountViewModel accountViewModel, wn.c<? super AccountViewModel$loadPage$1> cVar) {
        super(2, cVar);
        this.this$0 = accountViewModel;
    }

    public static final AccountState invokeSuspend$lambda$0(AccountViewModel accountViewModel, AsyncCallResult asyncCallResult, AccountState accountState) {
        ResolveErrorMessageUseCase resolveErrorMessageUseCase;
        resolveErrorMessageUseCase = accountViewModel.resolveErrorMessageUseCase;
        return AccountState.copy$default(accountState, null, false, null, null, false, ResolveErrorMessageUseCase.invoke$default(resolveErrorMessageUseCase, (AsyncCallResult.Error) asyncCallResult, null, 2, null), false, false, false, false, null, 1999, null);
    }

    public static final AccountState invokeSuspend$lambda$1(AsyncCallResult asyncCallResult, AccountState accountState) {
        return AccountState.copy$default(accountState, null, false, null, (AccountPage) ((AsyncCallResult.Success) asyncCallResult).getData(), false, "", false, false, false, false, null, 1991, null);
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        AccountViewModel$loadPage$1 accountViewModel$loadPage$1 = new AccountViewModel$loadPage$1(this.this$0, cVar);
        accountViewModel$loadPage$1.L$0 = obj;
        return accountViewModel$loadPage$1;
    }

    @Override // ho.p
    public final Object invoke(hr.x xVar, wn.c<? super z> cVar) {
        return ((AccountViewModel$loadPage$1) create(xVar, cVar)).invokeSuspend(z.f31622a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0078, code lost:
    
        if (fr.g0.n(r6, r9) == r5) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0040, code lost:
    
        if (r10 == r5) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x007a, code lost:
    
        return r5;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0078 -> B:14:0x001f). Please report as a decompilation issue!!! */
    @Override // yn.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Logger logger;
        AccountService accountService;
        hr.x xVar = (hr.x) this.L$0;
        int i10 = this.label;
        xn.a aVar = xn.a.f37986a;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    c6.x("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            } else {
                sn.a.g(obj);
                AsyncCallResult asyncCallResult = (AsyncCallResult) obj;
                if (asyncCallResult instanceof AsyncCallResult.Error) {
                    AccountViewModel accountViewModel = this.this$0;
                    accountViewModel.queueStateUpdate(new i(accountViewModel, (AsyncCallResult.Error) asyncCallResult, 0));
                } else if (asyncCallResult instanceof AsyncCallResult.Success) {
                    this.this$0.queueStateUpdate(new h((AsyncCallResult.Success) asyncCallResult, 3));
                } else {
                    c6.p();
                    return null;
                }
                xq.a aVar2 = xq.b.f38124b;
                long n2 = xq.g.n(3, xq.d.SECONDS);
                this.L$0 = xVar;
                this.label = 2;
            }
        }
        sn.a.g(obj);
        if (g0.y(xVar)) {
            logger = this.this$0.logger;
            logger.log(AccountViewModel.TAG, "refresh");
            accountService = this.this$0.accountService;
            this.L$0 = xVar;
            this.label = 1;
            obj = accountService.getAccount(this);
        } else {
            return z.f31622a;
        }
    }
}
