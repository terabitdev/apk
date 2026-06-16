package io.elevenlabs.data.services;

import com.google.protobuf.c6;
import d8.v;
import fr.d0;
import ho.p;
import io.elevenlabs.domain.Logger;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import kotlin.Metadata;
import sn.z;
import tn.o;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.data.services.OfflineReadsServiceImpl$clearMediaCache$2", f = "OfflineReadsServiceImpl.kt", l = {}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes3.dex */
public final class OfflineReadsServiceImpl$clearMediaCache$2 extends yn.i implements p {
    int label;
    final /* synthetic */ OfflineReadsServiceImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OfflineReadsServiceImpl$clearMediaCache$2(OfflineReadsServiceImpl offlineReadsServiceImpl, wn.c<? super OfflineReadsServiceImpl$clearMediaCache$2> cVar) {
        super(2, cVar);
        this.this$0 = offlineReadsServiceImpl;
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        return new OfflineReadsServiceImpl$clearMediaCache$2(this.this$0, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, wn.c<? super z> cVar) {
        return ((OfflineReadsServiceImpl$clearMediaCache$2) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        Logger logger;
        v vVar;
        HashSet hashSet;
        Logger logger2;
        v vVar2;
        if (this.label == 0) {
            sn.a.g(obj);
            try {
                vVar = this.this$0.simpleCache;
                synchronized (vVar) {
                    hashSet = new HashSet(((HashMap) vVar.f7558c.f38855a).keySet());
                }
                List<String> g12 = o.g1(hashSet);
                OfflineReadsServiceImpl offlineReadsServiceImpl = this.this$0;
                for (String str : g12) {
                    vVar2 = offlineReadsServiceImpl.simpleCache;
                    vVar2.k(str);
                }
                logger2 = this.this$0.logger;
                logger2.log("OfflineReadsService", "Cleared media cache");
            } catch (Exception e10) {
                logger = this.this$0.logger;
                logger.logError("OfflineReadsService", "Failed to clear media cache", e10);
            }
            return z.f31622a;
        }
        c6.x("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
