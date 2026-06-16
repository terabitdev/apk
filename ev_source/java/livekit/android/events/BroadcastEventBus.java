package io.livekit.android.events;

import android.gov.nist.javax.sip.parser.TokenNames;
import com.google.android.gms.common.api.f;
import com.google.protobuf.c6;
import fr.d0;
import fr.g0;
import ir.i1;
import ir.k1;
import ir.n1;
import ir.q1;
import ir.r;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.a;
import sn.z;
import wn.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00028\u0000H\u0086@¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u0007\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0007\u0010\u000eJ\u001e\u0010\u0011\u001a\u00020\u00062\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0086@¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0011\u001a\u00020\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0011\u0010\u0013J\u0013\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R \u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lio/livekit/android/events/BroadcastEventBus;", TokenNames.T, "Lio/livekit/android/events/EventListenable;", "<init>", "()V", "event", "Lsn/z;", "postEvent", "(Ljava/lang/Object;Lwn/c;)Ljava/lang/Object;", "tryPostEvent", "(Ljava/lang/Object;)V", "Lfr/d0;", "scope", "Lfr/k1;", "(Ljava/lang/Object;Lfr/d0;)Lfr/k1;", "", "eventsToPost", "postEvents", "(Ljava/util/Collection;Lwn/c;)Ljava/lang/Object;", "(Ljava/util/Collection;Lfr/d0;)Lfr/k1;", "readOnly", "()Lio/livekit/android/events/EventListenable;", "Lir/i1;", "mutableEvents", "Lir/i1;", "Lir/n1;", "events", "Lir/n1;", "getEvents", "()Lir/n1;", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class BroadcastEventBus<T> implements EventListenable<T> {
    private final n1 events;
    private final i1 mutableEvents;

    public BroadcastEventBus() {
        q1 b10 = r.b(0, f.API_PRIORITY_OTHER, null, 5);
        this.mutableEvents = b10;
        this.events = new k1(b10);
    }

    @Override // io.livekit.android.events.EventListenable
    public n1 getEvents() {
        return this.events;
    }

    public final fr.k1 postEvent(T event, d0 scope) {
        scope.getClass();
        return g0.D(scope, null, null, new BroadcastEventBus$postEvent$2(this, event, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object postEvents(Collection<? extends T> collection, c<? super z> cVar) {
        BroadcastEventBus$postEvents$1 broadcastEventBus$postEvents$1;
        int i10;
        Iterator<T> it;
        BroadcastEventBus<T> broadcastEventBus;
        if (cVar instanceof BroadcastEventBus$postEvents$1) {
            broadcastEventBus$postEvents$1 = (BroadcastEventBus$postEvents$1) cVar;
            int i11 = broadcastEventBus$postEvents$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                broadcastEventBus$postEvents$1.label = i11 - Integer.MIN_VALUE;
                Object obj = broadcastEventBus$postEvents$1.result;
                i10 = broadcastEventBus$postEvents$1.label;
                if (i10 == 0) {
                    if (i10 == 1) {
                        it = (Iterator) broadcastEventBus$postEvents$1.L$1;
                        broadcastEventBus = (BroadcastEventBus) broadcastEventBus$postEvents$1.L$0;
                        a.g(obj);
                    } else {
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    a.g(obj);
                    it = collection.iterator();
                    broadcastEventBus = this;
                }
                while (it.hasNext()) {
                    T next = it.next();
                    i1 i1Var = broadcastEventBus.mutableEvents;
                    broadcastEventBus$postEvents$1.L$0 = broadcastEventBus;
                    broadcastEventBus$postEvents$1.L$1 = it;
                    broadcastEventBus$postEvents$1.label = 1;
                    Object emit = i1Var.emit(next, broadcastEventBus$postEvents$1);
                    xn.a aVar = xn.a.f37986a;
                    if (emit == aVar) {
                        return aVar;
                    }
                }
                return z.f31622a;
            }
        }
        broadcastEventBus$postEvents$1 = new BroadcastEventBus$postEvents$1(this, cVar);
        Object obj2 = broadcastEventBus$postEvents$1.result;
        i10 = broadcastEventBus$postEvents$1.label;
        if (i10 == 0) {
        }
        while (it.hasNext()) {
        }
        return z.f31622a;
    }

    public final void tryPostEvent(T event) {
        this.mutableEvents.tryEmit(event);
    }

    public final Object postEvent(T t10, c<? super z> cVar) {
        Object emit = this.mutableEvents.emit(t10, cVar);
        return emit == xn.a.f37986a ? emit : z.f31622a;
    }

    public final EventListenable<T> readOnly() {
        return this;
    }

    public final fr.k1 postEvents(Collection<? extends T> eventsToPost, d0 scope) {
        eventsToPost.getClass();
        scope.getClass();
        return g0.D(scope, null, null, new BroadcastEventBus$postEvents$3(this, eventsToPost, null), 3);
    }
}
