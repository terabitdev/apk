package io.elevenlabs.readerapp.ui.screens.authenticated.account;

import com.google.protobuf.c6;
import fr.d0;
import io.elevenlabs.domain.services.OfflineReadsService;
import kotlin.Metadata;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.account.AccountViewModel$startSignOutFlow$1", f = "AccountViewModel.kt", l = {128}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class AccountViewModel$startSignOutFlow$1 extends yn.i implements ho.p {
    int label;
    final /* synthetic */ AccountViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountViewModel$startSignOutFlow$1(AccountViewModel accountViewModel, wn.c<? super AccountViewModel$startSignOutFlow$1> cVar) {
        super(2, cVar);
        this.this$0 = accountViewModel;
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        return new AccountViewModel$startSignOutFlow$1(this.this$0, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, wn.c<? super z> cVar) {
        return ((AccountViewModel$startSignOutFlow$1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        OfflineReadsService offlineReadsService;
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
            offlineReadsService = this.this$0.offlineReadsService;
            this.label = 1;
            obj = offlineReadsService.hasDownloadedReads(this);
            xn.a aVar = xn.a.f37986a;
            if (obj == aVar) {
                return aVar;
            }
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        AccountViewModel accountViewModel = this.this$0;
        if (booleanValue) {
            accountViewModel.queueStateUpdate(new j(1));
        } else {
            accountViewModel.queueStateUpdate(new j(2));
        }
        return z.f31622a;
    }
}
