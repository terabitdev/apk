package io.elevenlabs.readerapp.ui.screens.authenticated.reads.details;

import android.app.Activity;
import com.google.protobuf.c6;
import kotlin.Metadata;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.reads.details.ReadDetailsViewModel$purchaseRead$2", f = "ReadDetailsViewModel.kt", l = {622}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class ReadDetailsViewModel$purchaseRead$2 extends yn.i implements ho.p {
    final /* synthetic */ Activity $activity;
    final /* synthetic */ String $readId;
    int label;
    final /* synthetic */ ReadDetailsViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReadDetailsViewModel$purchaseRead$2(ReadDetailsViewModel readDetailsViewModel, Activity activity, String str, wn.c<? super ReadDetailsViewModel$purchaseRead$2> cVar) {
        super(2, cVar);
        this.this$0 = readDetailsViewModel;
        this.$activity = activity;
        this.$readId = str;
    }

    @Override // yn.a
    public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
        return new ReadDetailsViewModel$purchaseRead$2(this.this$0, this.$activity, this.$readId, cVar);
    }

    @Override // ho.p
    public final Object invoke(fr.d0 d0Var, wn.c<? super sn.z> cVar) {
        return ((ReadDetailsViewModel$purchaseRead$2) create(d0Var, cVar)).invokeSuspend(sn.z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        Object proceedPurchase;
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
            ReadDetailsViewModel readDetailsViewModel = this.this$0;
            Activity activity = this.$activity;
            String str = this.$readId;
            this.label = 1;
            proceedPurchase = readDetailsViewModel.proceedPurchase(activity, str, this);
            xn.a aVar = xn.a.f37986a;
            if (proceedPurchase == aVar) {
                return aVar;
            }
        }
        return sn.z.f31622a;
    }
}
