package io.elevenlabs.data.database.entities.offline;

import com.google.protobuf.c6;
import ho.l;
import kotlin.Metadata;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.data.database.entities.offline.OfflineReadsDao_Impl$recomputeReadAggregate$2", f = "OfflineReadsDao_Impl.kt", l = {174}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lsn/z;", "<anonymous>", "()V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes3.dex */
public final class OfflineReadsDao_Impl$recomputeReadAggregate$2 extends yn.i implements l {
    final /* synthetic */ long $offlineReadId;
    int label;
    final /* synthetic */ OfflineReadsDao_Impl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OfflineReadsDao_Impl$recomputeReadAggregate$2(OfflineReadsDao_Impl offlineReadsDao_Impl, long j4, wn.c<? super OfflineReadsDao_Impl$recomputeReadAggregate$2> cVar) {
        super(1, cVar);
        this.this$0 = offlineReadsDao_Impl;
        this.$offlineReadId = j4;
    }

    @Override // yn.a
    public final wn.c<z> create(wn.c<?> cVar) {
        return new OfflineReadsDao_Impl$recomputeReadAggregate$2(this.this$0, this.$offlineReadId, cVar);
    }

    @Override // ho.l
    public final Object invoke(wn.c<? super z> cVar) {
        return ((OfflineReadsDao_Impl$recomputeReadAggregate$2) create(cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        Object recomputeReadAggregate;
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
            OfflineReadsDao_Impl offlineReadsDao_Impl = this.this$0;
            long j4 = this.$offlineReadId;
            this.label = 1;
            recomputeReadAggregate = super/*io.elevenlabs.data.database.entities.offline.OfflineReadsDao*/.recomputeReadAggregate(j4, this);
            xn.a aVar = xn.a.f37986a;
            if (recomputeReadAggregate == aVar) {
                return aVar;
            }
        }
        return z.f31622a;
    }
}
