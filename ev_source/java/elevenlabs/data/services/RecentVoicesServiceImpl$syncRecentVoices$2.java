package io.elevenlabs.data.services;

import com.google.protobuf.c6;
import ho.q;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.model.SyncStatus;
import kotlin.Metadata;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.data.services.RecentVoicesServiceImpl$syncRecentVoices$2", f = "RecentVoicesServiceImpl.kt", l = {56}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lir/j;", "Lio/elevenlabs/domain/model/SyncStatus;", "", "it", "Lsn/z;", "<anonymous>", "(Lir/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes3.dex */
public final class RecentVoicesServiceImpl$syncRecentVoices$2 extends yn.i implements q {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ RecentVoicesServiceImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecentVoicesServiceImpl$syncRecentVoices$2(RecentVoicesServiceImpl recentVoicesServiceImpl, wn.c<? super RecentVoicesServiceImpl$syncRecentVoices$2> cVar) {
        super(3, cVar);
        this.this$0 = recentVoicesServiceImpl;
    }

    @Override // ho.q
    public final Object invoke(ir.j jVar, Throwable th, wn.c<? super z> cVar) {
        RecentVoicesServiceImpl$syncRecentVoices$2 recentVoicesServiceImpl$syncRecentVoices$2 = new RecentVoicesServiceImpl$syncRecentVoices$2(this.this$0, cVar);
        recentVoicesServiceImpl$syncRecentVoices$2.L$0 = jVar;
        return recentVoicesServiceImpl$syncRecentVoices$2.invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        Logger logger;
        ir.j jVar = (ir.j) this.L$0;
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
            logger = this.this$0.logger;
            Logger.logWarning$default(logger, "RecentVoicesService", "Recent voices sync failed after all retries", null, 4, null);
            SyncStatus syncStatus = SyncStatus.ERROR;
            this.L$0 = null;
            this.label = 1;
            Object emit = jVar.emit(syncStatus, this);
            xn.a aVar = xn.a.f37986a;
            if (emit == aVar) {
                return aVar;
            }
        }
        return z.f31622a;
    }
}
