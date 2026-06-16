package io.elevenlabs.payments;

import com.google.protobuf.c6;
import fr.d0;
import fr.g0;
import ho.p;
import io.elevenlabs.domain.model.AsyncCallResult;
import kotlin.Metadata;
import sn.z;
import wn.c;
import yn.e;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@e(c = "io.elevenlabs.payments.InAppPurchasesService$pollForPurchaseConfirmation$2", f = "InAppPurchasesService.kt", l = {587, 603}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lfr/d0;", "Lio/elevenlabs/domain/model/AsyncCallResult$Success;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)Lio/elevenlabs/domain/model/AsyncCallResult$Success;"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes3.dex */
public final class InAppPurchasesService$pollForPurchaseConfirmation$2 extends i implements p {
    final /* synthetic */ long $pollInterval;
    final /* synthetic */ String $purchaseToken;
    final /* synthetic */ String $readId;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ InAppPurchasesService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InAppPurchasesService$pollForPurchaseConfirmation$2(InAppPurchasesService inAppPurchasesService, long j4, String str, String str2, c<? super InAppPurchasesService$pollForPurchaseConfirmation$2> cVar) {
        super(2, cVar);
        this.this$0 = inAppPurchasesService;
        this.$pollInterval = j4;
        this.$readId = str;
        this.$purchaseToken = str2;
    }

    @Override // yn.a
    public final c<z> create(Object obj, c<?> cVar) {
        InAppPurchasesService$pollForPurchaseConfirmation$2 inAppPurchasesService$pollForPurchaseConfirmation$2 = new InAppPurchasesService$pollForPurchaseConfirmation$2(this.this$0, this.$pollInterval, this.$readId, this.$purchaseToken, cVar);
        inAppPurchasesService$pollForPurchaseConfirmation$2.L$0 = obj;
        return inAppPurchasesService$pollForPurchaseConfirmation$2;
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, c<? super AsyncCallResult.Success<z>> cVar) {
        return ((InAppPurchasesService$pollForPurchaseConfirmation$2) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00b2, code lost:
    
        if (fr.g0.n(r6, r11) == r5) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0033  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x00b2 -> B:6:0x001a). Please report as a decompilation issue!!! */
    @Override // yn.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i10;
        int i11;
        AsyncCallResult asyncCallResult;
        d0 d0Var = (d0) this.L$0;
        int i12 = this.label;
        xn.a aVar = xn.a.f37986a;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 == 2) {
                    i11 = this.I$0;
                    sn.a.g(obj);
                    i10 = i11;
                    if (!g0.y(d0Var)) {
                        int i13 = i10 + 1;
                        fr.z io2 = this.this$0.dispatcherFactory.getIo();
                        InAppPurchasesService$pollForPurchaseConfirmation$2$result$1 inAppPurchasesService$pollForPurchaseConfirmation$2$result$1 = new InAppPurchasesService$pollForPurchaseConfirmation$2$result$1(this.this$0, this.$readId, this.$purchaseToken, null);
                        this.L$0 = d0Var;
                        this.L$1 = null;
                        this.I$0 = i13;
                        this.label = 1;
                        Object Q = g0.Q(io2, inAppPurchasesService$pollForPurchaseConfirmation$2$result$1, this);
                        if (Q != aVar) {
                            i11 = i13;
                            obj = Q;
                            asyncCallResult = (AsyncCallResult) obj;
                            if (asyncCallResult instanceof AsyncCallResult.Success) {
                                ib.i.q("pollForConfirmation - success after ", i11, " attempts", this.this$0.logger, this.this$0.tag);
                                return asyncCallResult;
                            }
                            if (asyncCallResult instanceof AsyncCallResult.Error) {
                                this.this$0.logger.log(this.this$0.tag, "pollForConfirmation - attempt " + i11 + " failed: " + ((AsyncCallResult.Error) asyncCallResult).getError());
                                long j4 = this.$pollInterval;
                                this.L$0 = d0Var;
                                this.L$1 = null;
                                this.I$0 = i11;
                                this.label = 2;
                            } else {
                                c6.p();
                                return null;
                            }
                        }
                        return aVar;
                    }
                    return new AsyncCallResult.Success(z.f31622a);
                }
                c6.x("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i11 = this.I$0;
            sn.a.g(obj);
            asyncCallResult = (AsyncCallResult) obj;
            if (asyncCallResult instanceof AsyncCallResult.Success) {
            }
        } else {
            sn.a.g(obj);
            i10 = 0;
            if (!g0.y(d0Var)) {
            }
        }
    }
}
