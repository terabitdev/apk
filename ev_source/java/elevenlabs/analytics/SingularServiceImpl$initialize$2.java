package io.elevenlabs.analytics;

import android.content.SharedPreferences;
import com.google.protobuf.c6;
import fr.d0;
import ho.p;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.model.Customer;
import ir.j;
import kotlin.Metadata;
import rk.q0;
import rk.w;
import rk.w0;
import sn.z;
import wn.c;
import yn.e;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@e(c = "io.elevenlabs.analytics.SingularServiceImpl$initialize$2", f = "SingularServiceImpl.kt", l = {88}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes3.dex */
public final class SingularServiceImpl$initialize$2 extends i implements p {
    int label;
    final /* synthetic */ SingularServiceImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingularServiceImpl$initialize$2(SingularServiceImpl singularServiceImpl, c<? super SingularServiceImpl$initialize$2> cVar) {
        super(2, cVar);
        this.this$0 = singularServiceImpl;
    }

    @Override // yn.a
    public final c<z> create(Object obj, c<?> cVar) {
        return new SingularServiceImpl$initialize$2(this.this$0, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, c<? super z> cVar) {
        return ((SingularServiceImpl$initialize$2) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        ir.i iVar;
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
            iVar = this.this$0.signedInUser;
            final SingularServiceImpl singularServiceImpl = this.this$0;
            j jVar = new j() { // from class: io.elevenlabs.analytics.SingularServiceImpl$initialize$2.1
                public final Object emit(Customer customer, c<? super z> cVar) {
                    Logger logger;
                    String str;
                    String str2;
                    boolean z6;
                    logger = SingularServiceImpl.this.logger;
                    str = SingularServiceImpl.this.tag;
                    if (customer != null) {
                        str2 = "present";
                    } else {
                        str2 = "null";
                    }
                    logger.log(str, "initialize - singedInUser.collect - signedInUser ".concat(str2));
                    if (customer == null) {
                        z6 = SingularServiceImpl.this.hasSeenSignedInUser;
                        if (z6) {
                            SingularServiceImpl.this.resumeStopAllTracking(false);
                        }
                    } else {
                        String id2 = customer.getId();
                        try {
                            if (qk.a.b()) {
                                q0 q0Var = qk.a.f28593b;
                                SharedPreferences.Editor edit = q0Var.b().edit();
                                edit.putString("custom_user_id", id2);
                                edit.commit();
                                w wVar = q0Var.f30175f;
                                if (wVar != null) {
                                    wVar.N = id2;
                                }
                            }
                        } catch (Throwable th) {
                            qk.a.f28592a.d(w0.c(th));
                        }
                        SingularServiceImpl.this.hasSeenSignedInUser = true;
                        SingularServiceImpl.this.resumeStopAllTracking(true);
                    }
                    return z.f31622a;
                }

                @Override // ir.j
                public /* bridge */ /* synthetic */ Object emit(Object obj2, c cVar) {
                    return emit((Customer) obj2, (c<? super z>) cVar);
                }
            };
            this.label = 1;
            Object collect = iVar.collect(jVar, this);
            xn.a aVar = xn.a.f37986a;
            if (collect == aVar) {
                return aVar;
            }
        }
        return z.f31622a;
    }
}
