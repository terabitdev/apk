package io.livekit.android.util;

import android.gov.nist.javax.sip.parser.TokenNames;
import ho.p;
import ir.r;
import ir.z1;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000.\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\u001a?\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\u001c\b\u0002\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a'\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\u0004\b\u0000\u0010\u00002\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\u0006\u0010\u000b\"&\u0010\u0010\u001a\u0004\u0018\u00010\r\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\f8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f\"-\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\f8F¢\u0006\f\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {TokenNames.T, "initialValue", "Lkotlin/Function2;", "Lsn/z;", "onSetValue", "Lio/livekit/android/util/MutableStateFlowDelegate;", "flowDelegate", "(Ljava/lang/Object;Lho/p;)Lio/livekit/android/util/MutableStateFlowDelegate;", "Lir/z1;", "stateFlow", "Lio/livekit/android/util/StateFlowDelegate;", "(Lir/z1;)Lio/livekit/android/util/StateFlowDelegate;", "Loo/r;", "", "getDelegate", "(Loo/r;)Ljava/lang/Object;", "delegate", "getFlow", "(Loo/r;)Lir/z1;", "getFlow$annotations", "(Loo/r;)V", "flow", "livekit-android-sdk_release"}, k = 2, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class FlowDelegateKt {
    public static final <T> MutableStateFlowDelegate<T> flowDelegate(T t10, p pVar) {
        return new MutableStateFlowDelegate<>(r.c(t10), pVar);
    }

    public static /* synthetic */ MutableStateFlowDelegate flowDelegate$default(Object obj, p pVar, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            pVar = null;
        }
        return flowDelegate(obj, pVar);
    }

    public static final <T> Object getDelegate(oo.r rVar) {
        rVar.getClass();
        try {
            DelegateAccess delegateAccess = DelegateAccess.INSTANCE;
            delegateAccess.getDelegateRequested$livekit_android_sdk_release().set(Boolean.TRUE);
            rVar.get();
            Object obj = delegateAccess.getDelegate$livekit_android_sdk_release().get();
            delegateAccess.getDelegate$livekit_android_sdk_release().set(null);
            delegateAccess.getDelegateRequested$livekit_android_sdk_release().set(Boolean.FALSE);
            return obj;
        } catch (Throwable th) {
            DelegateAccess delegateAccess2 = DelegateAccess.INSTANCE;
            delegateAccess2.getDelegate$livekit_android_sdk_release().set(null);
            delegateAccess2.getDelegateRequested$livekit_android_sdk_release().set(Boolean.FALSE);
            throw th;
        }
    }

    public static final <T> z1 getFlow(oo.r rVar) {
        rVar.getClass();
        Object delegate = getDelegate(rVar);
        delegate.getClass();
        return (z1) delegate;
    }

    public static final <T> StateFlowDelegate<T> flowDelegate(z1 z1Var) {
        z1Var.getClass();
        return new StateFlowDelegate<>(z1Var);
    }

    public static /* synthetic */ void getFlow$annotations(oo.r rVar) {
    }
}
