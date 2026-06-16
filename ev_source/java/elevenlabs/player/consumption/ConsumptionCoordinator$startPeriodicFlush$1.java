package io.elevenlabs.player.consumption;

import com.google.protobuf.c6;
import fr.d0;
import fr.g0;
import ho.l;
import ho.p;
import io.elevenlabs.player.consumption.ConsumptionCoordinator;
import kotlin.Metadata;
import sn.z;
import wn.c;
import xn.a;
import xq.b;
import xq.d;
import xq.g;
import yn.e;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@e(c = "io.elevenlabs.player.consumption.ConsumptionCoordinator$startPeriodicFlush$1", f = "ConsumptionCoordinator.kt", l = {69, 70}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes3.dex */
public final class ConsumptionCoordinator$startPeriodicFlush$1 extends i implements p {
    final /* synthetic */ l $provider;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ConsumptionCoordinator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConsumptionCoordinator$startPeriodicFlush$1(l lVar, ConsumptionCoordinator consumptionCoordinator, c<? super ConsumptionCoordinator$startPeriodicFlush$1> cVar) {
        super(2, cVar);
        this.$provider = lVar;
        this.this$0 = consumptionCoordinator;
    }

    @Override // yn.a
    public final c<z> create(Object obj, c<?> cVar) {
        ConsumptionCoordinator$startPeriodicFlush$1 consumptionCoordinator$startPeriodicFlush$1 = new ConsumptionCoordinator$startPeriodicFlush$1(this.$provider, this.this$0, cVar);
        consumptionCoordinator$startPeriodicFlush$1.L$0 = obj;
        return consumptionCoordinator$startPeriodicFlush$1;
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, c<? super z> cVar) {
        return ((ConsumptionCoordinator$startPeriodicFlush$1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0038, code lost:
    
        if (fr.g0.n(r5, r7) == r4) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0045, code lost:
    
        if (r8 == r4) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0047, code lost:
    
        return r4;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0045 -> B:6:0x0048). Please report as a decompilation issue!!! */
    @Override // yn.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        d0 d0Var = (d0) this.L$0;
        int i10 = this.label;
        a aVar = a.f37986a;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    sn.a.g(obj);
                    ConsumptionCoordinator.SnapshotData snapshotData = (ConsumptionCoordinator.SnapshotData) obj;
                    if (snapshotData != null) {
                        this.this$0.flush(snapshotData.getPositionSeconds(), snapshotData.getMeta());
                    }
                    if (!g0.y(d0Var)) {
                        xq.a aVar2 = b.f38124b;
                        long n2 = g.n(1, d.MINUTES);
                        this.L$0 = d0Var;
                        this.label = 1;
                    } else {
                        return z.f31622a;
                    }
                } else {
                    c6.x("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            } else {
                sn.a.g(obj);
                l lVar = this.$provider;
                this.L$0 = d0Var;
                this.label = 2;
                obj = lVar.invoke(this);
            }
        } else {
            sn.a.g(obj);
            if (!g0.y(d0Var)) {
            }
        }
    }
}
