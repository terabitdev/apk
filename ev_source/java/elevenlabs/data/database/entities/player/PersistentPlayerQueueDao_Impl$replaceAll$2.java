package io.elevenlabs.data.database.entities.player;

import com.google.protobuf.c6;
import ho.l;
import java.util.List;
import kotlin.Metadata;
import sn.a;
import sn.z;
import wn.c;
import yn.e;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@e(c = "io.elevenlabs.data.database.entities.player.PersistentPlayerQueueDao_Impl$replaceAll$2", f = "PersistentPlayerQueueDao_Impl.kt", l = {51}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lsn/z;", "<anonymous>", "()V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes3.dex */
public final class PersistentPlayerQueueDao_Impl$replaceAll$2 extends i implements l {
    final /* synthetic */ List<PersistentPlayerQueueEntity> $entities;
    int label;
    final /* synthetic */ PersistentPlayerQueueDao_Impl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PersistentPlayerQueueDao_Impl$replaceAll$2(PersistentPlayerQueueDao_Impl persistentPlayerQueueDao_Impl, List<PersistentPlayerQueueEntity> list, c<? super PersistentPlayerQueueDao_Impl$replaceAll$2> cVar) {
        super(1, cVar);
        this.this$0 = persistentPlayerQueueDao_Impl;
        this.$entities = list;
    }

    @Override // yn.a
    public final c<z> create(c<?> cVar) {
        return new PersistentPlayerQueueDao_Impl$replaceAll$2(this.this$0, this.$entities, cVar);
    }

    @Override // ho.l
    public final Object invoke(c<? super z> cVar) {
        return ((PersistentPlayerQueueDao_Impl$replaceAll$2) create(cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        Object replaceAll;
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                a.g(obj);
            } else {
                c6.x("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            a.g(obj);
            PersistentPlayerQueueDao_Impl persistentPlayerQueueDao_Impl = this.this$0;
            List<PersistentPlayerQueueEntity> list = this.$entities;
            this.label = 1;
            replaceAll = super/*io.elevenlabs.data.database.entities.player.PersistentPlayerQueueDao*/.replaceAll(list, this);
            xn.a aVar = xn.a.f37986a;
            if (replaceAll == aVar) {
                return aVar;
            }
        }
        return z.f31622a;
    }
}
