package io.livekit.android.events;

import android.gov.nist.javax.sip.parser.TokenNames;
import ho.p;
import ir.j;
import kotlin.Metadata;
import sn.z;
import wn.c;
import xn.a;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {TokenNames.T, "value", "Lsn/z;", "emit", "(Ljava/lang/Object;Lwn/c;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class EventListenableKt$collect$2<T> implements j {
    final /* synthetic */ p $action;

    public EventListenableKt$collect$2(p pVar) {
        this.$action = pVar;
    }

    @Override // ir.j
    public final Object emit(T t10, c<? super z> cVar) {
        Object invoke = this.$action.invoke(t10, cVar);
        if (invoke == a.f37986a) {
            return invoke;
        }
        return z.f31622a;
    }

    public final Object emit$$forInline(T t10, final c<? super z> cVar) {
        new yn.c(this, cVar) { // from class: io.livekit.android.events.EventListenableKt$collect$2$emit$1
            int label;
            /* synthetic */ Object result;
            final /* synthetic */ EventListenableKt$collect$2<T> this$0;

            /* JADX WARN: Multi-variable type inference failed */
            {
                this.this$0 = this;
            }

            @Override // yn.a
            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return this.this$0.emit(null, this);
            }
        };
        this.$action.invoke(t10, cVar);
        return z.f31622a;
    }
}
