package io.livekit.android.util;

import android.gov.nist.javax.sip.parser.TokenNames;
import ho.p;
import ir.j;
import ir.j1;
import ir.z1;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;
import oo.u;
import sn.z;
import wn.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B5\b\u0000\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u001c\b\u0002\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001e\u0010\f\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0096A¢\u0006\u0004\b\f\u0010\rJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00028\u0000H\u0096\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00028\u0000H\u0096A¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0005H\u0097\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00028\u0000H\u0096\u0001¢\u0006\u0004\b\u0018\u0010\u0019J&\u0010\u001e\u001a\u00028\u00002\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\n\u0010\u001d\u001a\u0006\u0012\u0002\b\u00030\u001cH\u0086\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ.\u0010 \u001a\u00020\u00052\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\n\u0010\u001d\u001a\u0006\u0012\u0002\b\u00030\u001c2\u0006\u0010\u0013\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b \u0010!R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\"R(\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010#R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000$8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b%\u0010&R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020)0(8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b*\u0010+R\u001c\u0010\u0013\u001a\u00028\u00008\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\b\u001e\u0010-\"\u0004\b \u0010.¨\u0006/"}, d2 = {"Lio/livekit/android/util/MutableStateFlowDelegate;", TokenNames.T, "Lir/j1;", "flow", "Lkotlin/Function2;", "Lsn/z;", "onSetValue", "<init>", "(Lir/j1;Lho/p;)V", "Lir/j;", "collector", "", "collect", "(Lir/j;Lwn/c;)Ljava/lang/Object;", "expect", "update", "", "compareAndSet", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "value", "emit", "(Ljava/lang/Object;Lwn/c;)Ljava/lang/Object;", "resetReplayCache", "()V", "tryEmit", "(Ljava/lang/Object;)Z", "", "thisRef", "Loo/u;", "property", "getValue", "(Ljava/lang/Object;Loo/u;)Ljava/lang/Object;", "setValue", "(Ljava/lang/Object;Loo/u;Ljava/lang/Object;)V", "Lir/j1;", "Lho/p;", "", "getReplayCache", "()Ljava/util/List;", "replayCache", "Lir/z1;", "", "getSubscriptionCount", "()Lir/z1;", "subscriptionCount", "()Ljava/lang/Object;", "(Ljava/lang/Object;)V", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class MutableStateFlowDelegate<T> implements j1 {
    private final j1 flow;
    private final p onSetValue;

    public MutableStateFlowDelegate(j1 j1Var, p pVar) {
        j1Var.getClass();
        this.flow = j1Var;
        this.onSetValue = pVar;
    }

    @Override // ir.i
    public Object collect(j jVar, c<?> cVar) {
        return this.flow.collect(jVar, cVar);
    }

    @Override // ir.j1
    public boolean compareAndSet(T expect, T update) {
        return this.flow.compareAndSet(expect, update);
    }

    @Override // ir.i1, ir.j
    public Object emit(T t10, c<? super z> cVar) {
        return this.flow.emit(t10, cVar);
    }

    @Override // ir.n1
    public List<T> getReplayCache() {
        return this.flow.getReplayCache();
    }

    @Override // ir.i1
    public z1 getSubscriptionCount() {
        return this.flow.getSubscriptionCount();
    }

    public final T getValue(Object thisRef, u property) {
        property.getClass();
        DelegateAccess delegateAccess = DelegateAccess.INSTANCE;
        if (m.c(delegateAccess.getDelegateRequested$livekit_android_sdk_release().get(), Boolean.TRUE)) {
            delegateAccess.getDelegate$livekit_android_sdk_release().set(this);
        }
        return (T) this.flow.getValue();
    }

    @Override // ir.i1
    public void resetReplayCache() {
        this.flow.resetReplayCache();
    }

    public final void setValue(Object thisRef, u property, T value) {
        property.getClass();
        Object value2 = this.flow.getValue();
        this.flow.setValue(value);
        p pVar = this.onSetValue;
        if (pVar != null) {
            pVar.invoke(value, value2);
        }
    }

    @Override // ir.i1
    public boolean tryEmit(T value) {
        return this.flow.tryEmit(value);
    }

    public /* synthetic */ MutableStateFlowDelegate(j1 j1Var, p pVar, int i10, f fVar) {
        this(j1Var, (i10 & 2) != 0 ? null : pVar);
    }

    @Override // ir.j1
    public void setValue(T t10) {
        this.flow.setValue(t10);
    }

    @Override // ir.j1, ir.z1
    public T getValue() {
        return (T) this.flow.getValue();
    }
}
