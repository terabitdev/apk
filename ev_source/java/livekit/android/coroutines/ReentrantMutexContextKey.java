package io.livekit.android.coroutines;

import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;
import or.a;
import wn.g;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\b¨\u0006\u0018"}, d2 = {"Lio/livekit/android/coroutines/ReentrantMutexContextKey;", "Lwn/g;", "Lio/livekit/android/coroutines/ReentrantMutexContextElement;", "Lor/a;", "mutex", "<init>", "(Lor/a;)V", "component1", "()Lor/a;", "copy", "(Lor/a;)Lio/livekit/android/coroutines/ReentrantMutexContextKey;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lor/a;", "getMutex", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final /* data */ class ReentrantMutexContextKey implements g {
    private final a mutex;

    public ReentrantMutexContextKey(a aVar) {
        aVar.getClass();
        this.mutex = aVar;
    }

    public static /* synthetic */ ReentrantMutexContextKey copy$default(ReentrantMutexContextKey reentrantMutexContextKey, a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            aVar = reentrantMutexContextKey.mutex;
        }
        return reentrantMutexContextKey.copy(aVar);
    }

    /* renamed from: component1, reason: from getter */
    public final a getMutex() {
        return this.mutex;
    }

    public final ReentrantMutexContextKey copy(a mutex) {
        mutex.getClass();
        return new ReentrantMutexContextKey(mutex);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if ((other instanceof ReentrantMutexContextKey) && m.c(this.mutex, ((ReentrantMutexContextKey) other).mutex)) {
            return true;
        }
        return false;
    }

    public final a getMutex() {
        return this.mutex;
    }

    public int hashCode() {
        return this.mutex.hashCode();
    }

    public String toString() {
        return "ReentrantMutexContextKey(mutex=" + this.mutex + ')';
    }
}
