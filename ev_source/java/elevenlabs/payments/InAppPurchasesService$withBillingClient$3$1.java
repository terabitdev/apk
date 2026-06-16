package io.elevenlabs.payments;

import a8.s;
import android.content.Context;
import com.google.protobuf.c6;
import fr.d0;
import fr.l;
import ho.p;
import ho.q;
import jd.x;
import kotlin.Metadata;
import sn.z;
import wn.c;
import yn.e;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@e(c = "io.elevenlabs.payments.InAppPurchasesService$withBillingClient$3$1", f = "InAppPurchasesService.kt", l = {499, 509}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes3.dex */
public final class InAppPurchasesService$withBillingClient$3$1 extends i implements p {
    final /* synthetic */ l $continuation;
    final /* synthetic */ ho.l $listenerFactory;
    final /* synthetic */ ho.a $onConnectionFailed;
    final /* synthetic */ ho.l $onOperationFailed;
    final /* synthetic */ q $operation;
    Object L$0;
    Object L$1;
    boolean Z$0;
    int label;
    final /* synthetic */ InAppPurchasesService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InAppPurchasesService$withBillingClient$3$1(ho.l lVar, InAppPurchasesService inAppPurchasesService, l lVar2, ho.a aVar, q qVar, ho.l lVar3, c<? super InAppPurchasesService$withBillingClient$3$1> cVar) {
        super(2, cVar);
        this.$listenerFactory = lVar;
        this.this$0 = inAppPurchasesService;
        this.$continuation = lVar2;
        this.$onConnectionFailed = aVar;
        this.$operation = qVar;
        this.$onOperationFailed = lVar3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> void invokeSuspend$send(InAppPurchasesService inAppPurchasesService, l lVar, T t10) {
        inAppPurchasesService.logger.log(inAppPurchasesService.tag, "withBillingClient - send " + t10);
        if (lVar.isActive()) {
            lVar.resumeWith(t10);
        }
    }

    @Override // yn.a
    public final c<z> create(Object obj, c<?> cVar) {
        return new InAppPurchasesService$withBillingClient$3$1(this.$listenerFactory, this.this$0, this.$continuation, this.$onConnectionFailed, this.$operation, this.$onOperationFailed, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, c<? super z> cVar) {
        return ((InAppPurchasesService$withBillingClient$3$1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        Context context;
        Object awaitConnection;
        final jd.b bVar;
        jd.b bVar2;
        z zVar = z.f31622a;
        xn.a aVar = xn.a.f37986a;
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    bVar2 = (jd.b) this.L$1;
                    try {
                        sn.a.g(obj);
                        return zVar;
                    } catch (Exception e10) {
                        e = e10;
                        ib.i.r("withBillingClient - operation failed: ", e.getMessage(), this.this$0.logger, this.this$0.tag);
                        invokeSuspend$send(this.this$0, this.$continuation, this.$onOperationFailed.invoke(e));
                        bVar2.c();
                        return zVar;
                    }
                }
                c6.x("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            bVar = (jd.b) this.L$1;
            sn.a.g(obj);
        } else {
            sn.a.g(obj);
            x xVar = (x) this.$listenerFactory.invoke(new InAppPurchasesService$withBillingClient$3$1$listener$1(this.this$0, this.$continuation));
            context = this.this$0.context;
            jd.a aVar2 = new jd.a(context);
            aVar2.f19363a = new s(false, false);
            aVar2.f19366d = true;
            aVar2.f19365c = xVar;
            final jd.c a10 = aVar2.a();
            l lVar = this.$continuation;
            final InAppPurchasesService inAppPurchasesService = this.this$0;
            lVar.e(new ho.l() { // from class: io.elevenlabs.payments.InAppPurchasesService$withBillingClient$3$1.1
                public final void invoke(Throwable th) {
                    InAppPurchasesService.this.logger.log(InAppPurchasesService.this.tag, "withBillingClient - invokeOnCancellation/endConnection");
                    a10.c();
                }

                @Override // ho.l
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((Throwable) obj2);
                    return z.f31622a;
                }
            });
            this.this$0.logger.log(this.this$0.tag, "withBillingClient - connecting");
            InAppPurchasesService inAppPurchasesService2 = this.this$0;
            this.L$0 = null;
            this.L$1 = a10;
            this.label = 1;
            awaitConnection = inAppPurchasesService2.awaitConnection(a10, this);
            if (awaitConnection != aVar) {
                bVar = a10;
                obj = awaitConnection;
            }
            return aVar;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        if (!booleanValue) {
            this.this$0.logger.log(this.this$0.tag, "withBillingClient - can't establish connection");
            invokeSuspend$send(this.this$0, this.$continuation, this.$onConnectionFailed.invoke());
            bVar.c();
            return zVar;
        }
        try {
            q qVar = this.$operation;
            final InAppPurchasesService inAppPurchasesService3 = this.this$0;
            final l lVar2 = this.$continuation;
            ho.l lVar3 = new ho.l() { // from class: io.elevenlabs.payments.InAppPurchasesService$withBillingClient$3$1.2
                /* renamed from: invoke, reason: collision with other method in class */
                public final void m988invoke(T t10) {
                    InAppPurchasesService$withBillingClient$3$1.invokeSuspend$send(inAppPurchasesService3, lVar2, t10);
                    jd.b.this.c();
                }

                @Override // ho.l
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    m988invoke((AnonymousClass2) obj2);
                    return z.f31622a;
                }
            };
            this.L$0 = null;
            this.L$1 = bVar;
            this.Z$0 = booleanValue;
            this.label = 2;
            if (qVar.invoke(bVar, lVar3, this) == aVar) {
                return aVar;
            }
            return zVar;
        } catch (Exception e11) {
            e = e11;
            bVar2 = bVar;
            ib.i.r("withBillingClient - operation failed: ", e.getMessage(), this.this$0.logger, this.this$0.tag);
            invokeSuspend$send(this.this$0, this.$continuation, this.$onOperationFailed.invoke(e));
            bVar2.c();
            return zVar;
        }
    }
}
