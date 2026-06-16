package io.livekit.android.events;

import android.gov.nist.javax.sip.parser.TokenNames;
import com.google.protobuf.c6;
import fr.d0;
import ho.p;
import java.util.Collection;
import kotlin.Metadata;
import sn.a;
import sn.z;
import wn.c;
import yn.e;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@e(c = "io.livekit.android.events.BroadcastEventBus$postEvents$3", f = "BroadcastEventBus.kt", l = {51}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {TokenNames.T, "Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class BroadcastEventBus$postEvents$3 extends i implements p {
    final /* synthetic */ Collection<T> $eventsToPost;
    int label;
    final /* synthetic */ BroadcastEventBus<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BroadcastEventBus$postEvents$3(BroadcastEventBus<T> broadcastEventBus, Collection<? extends T> collection, c<? super BroadcastEventBus$postEvents$3> cVar) {
        super(2, cVar);
        this.this$0 = broadcastEventBus;
        this.$eventsToPost = collection;
    }

    @Override // yn.a
    public final c<z> create(Object obj, c<?> cVar) {
        return new BroadcastEventBus$postEvents$3(this.this$0, this.$eventsToPost, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, c<? super z> cVar) {
        return ((BroadcastEventBus$postEvents$3) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
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
            BroadcastEventBus<T> broadcastEventBus = this.this$0;
            Object obj2 = this.$eventsToPost;
            this.label = 1;
            Object postEvents = broadcastEventBus.postEvents((Collection) obj2, (c<? super z>) this);
            xn.a aVar = xn.a.f37986a;
            if (postEvents == aVar) {
                return aVar;
            }
        }
        return z.f31622a;
    }
}
