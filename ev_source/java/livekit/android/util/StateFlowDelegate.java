package io.livekit.android.util;

import android.gov.nist.javax.sip.parser.TokenNames;
import ir.j;
import ir.z1;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;
import oo.u;
import wn.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0006\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0017\b\u0000\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001e\u0010\t\u001a\u00020\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0096A¢\u0006\u0004\b\t\u0010\nJ&\u0010\u000f\u001a\u00028\u00002\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\rH\u0086\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00128\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00028\u00008\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0016¨\u0006\u0018"}, d2 = {"Lio/livekit/android/util/StateFlowDelegate;", TokenNames.T, "Lir/z1;", "flow", "<init>", "(Lir/z1;)V", "Lir/j;", "collector", "", "collect", "(Lir/j;Lwn/c;)Ljava/lang/Object;", "", "thisRef", "Loo/u;", "property", "getValue", "(Ljava/lang/Object;Loo/u;)Ljava/lang/Object;", "Lir/z1;", "", "getReplayCache", "()Ljava/util/List;", "replayCache", "()Ljava/lang/Object;", "value", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class StateFlowDelegate<T> implements z1 {
    private final z1 flow;

    public StateFlowDelegate(z1 z1Var) {
        z1Var.getClass();
        this.flow = z1Var;
    }

    @Override // ir.i
    public Object collect(j jVar, c<?> cVar) {
        return this.flow.collect(jVar, cVar);
    }

    @Override // ir.n1
    public List<T> getReplayCache() {
        return this.flow.getReplayCache();
    }

    public final T getValue(Object thisRef, u property) {
        property.getClass();
        DelegateAccess delegateAccess = DelegateAccess.INSTANCE;
        if (m.c(delegateAccess.getDelegateRequested$livekit_android_sdk_release().get(), Boolean.TRUE)) {
            delegateAccess.getDelegate$livekit_android_sdk_release().set(this);
        }
        return (T) this.flow.getValue();
    }

    @Override // ir.z1
    public T getValue() {
        return (T) this.flow.getValue();
    }
}
