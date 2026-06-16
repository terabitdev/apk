package io.livekit.android.coroutines;

import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import ho.p;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import n0.l;
import wn.f;
import wn.g;
import wn.h;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lio/livekit/android/coroutines/ReentrantMutexContextElement;", "Lwn/f;", "Lio/livekit/android/coroutines/ReentrantMutexContextKey;", SubscriberAttributeKt.JSON_NAME_KEY, "<init>", "(Lio/livekit/android/coroutines/ReentrantMutexContextKey;)V", "Lio/livekit/android/coroutines/ReentrantMutexContextKey;", "getKey", "()Lio/livekit/android/coroutines/ReentrantMutexContextKey;", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ReentrantMutexContextElement implements f {
    private final ReentrantMutexContextKey key;

    public ReentrantMutexContextElement(ReentrantMutexContextKey reentrantMutexContextKey) {
        reentrantMutexContextKey.getClass();
        this.key = reentrantMutexContextKey;
    }

    @Override // wn.h
    public <R> R fold(R r10, p pVar) {
        return (R) l.u(this, r10, pVar);
    }

    @Override // wn.h
    public <E extends f> E get(g gVar) {
        return (E) l.w(this, gVar);
    }

    @Override // wn.h
    public h minusKey(g gVar) {
        return l.H(this, gVar);
    }

    @Override // wn.h
    public h plus(h hVar) {
        return l.J(this, hVar);
    }

    @Override // wn.f
    public ReentrantMutexContextKey getKey() {
        return this.key;
    }
}
