package io.livekit.android.room.datastream.incoming;

import android.gov.nist.javax.sip.parser.TokenNames;
import com.google.firebase.messaging.Constants;
import com.google.protobuf.c6;
import hr.n;
import ir.i;
import ir.j;
import ir.r;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.d0;
import livekit.LivekitInternal$NodeStats;
import sn.a;
import sn.z;
import wn.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u000e\u001a\u00020\u000b2\u000e\u0010\n\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\tH\u0000¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00028\u0000H\u0086@¢\u0006\u0004\b\u000f\u0010\u0010J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0086@¢\u0006\u0004\b\u0012\u0010\u0010R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00148&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lio/livekit/android/room/datastream/incoming/BaseStreamReceiver;", TokenNames.T, "", "Lhr/n;", "", "source", "<init>", "(Lhr/n;)V", "Ljava/lang/Exception;", "Lkotlin/Exception;", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "Lsn/z;", "close$livekit_android_sdk_release", "(Ljava/lang/Exception;)V", "close", "readNext", "(Lwn/c;)Ljava/lang/Object;", "", "readAll", "Lhr/n;", "Lir/i;", "getFlow", "()Lir/i;", "flow", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public abstract class BaseStreamReceiver<T> {
    private final n source;

    public BaseStreamReceiver(n nVar) {
        nVar.getClass();
        this.source = nVar;
    }

    public final void close$livekit_android_sdk_release(Exception error) {
        this.source.m(error);
    }

    public abstract i getFlow();

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Type inference failed for: r3v0, types: [kotlin.jvm.internal.d0, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object readAll(c<? super List<? extends T>> cVar) {
        BaseStreamReceiver$readAll$1 baseStreamReceiver$readAll$1;
        int i10;
        d0 d0Var;
        if (cVar instanceof BaseStreamReceiver$readAll$1) {
            baseStreamReceiver$readAll$1 = (BaseStreamReceiver$readAll$1) cVar;
            int i11 = baseStreamReceiver$readAll$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                baseStreamReceiver$readAll$1.label = i11 - Integer.MIN_VALUE;
                Object obj = baseStreamReceiver$readAll$1.result;
                i10 = baseStreamReceiver$readAll$1.label;
                if (i10 == 0) {
                    if (i10 == 1) {
                        d0Var = (d0) baseStreamReceiver$readAll$1.L$0;
                        a.g(obj);
                    } else {
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    a.g(obj);
                    getFlow();
                    new BaseStreamReceiver$readAll$2(null);
                    i flow = getFlow();
                    ArrayList arrayList = new ArrayList();
                    final ?? obj2 = new Object();
                    obj2.f20559a = arrayList;
                    j jVar = new j() { // from class: io.livekit.android.room.datastream.incoming.BaseStreamReceiver$readAll$$inlined$fold$1
                        @Override // ir.j
                        public final Object emit(T t10, c<? super z> cVar2) {
                            d0 d0Var2 = d0.this;
                            List list = (List) d0Var2.f20559a;
                            list.add(t10);
                            d0Var2.f20559a = list;
                            return z.f31622a;
                        }
                    };
                    baseStreamReceiver$readAll$1.L$0 = obj2;
                    baseStreamReceiver$readAll$1.label = 1;
                    Object collect = flow.collect(jVar, baseStreamReceiver$readAll$1);
                    xn.a aVar = xn.a.f37986a;
                    if (collect == aVar) {
                        return aVar;
                    }
                    d0Var = obj2;
                }
                return d0Var.f20559a;
            }
        }
        baseStreamReceiver$readAll$1 = new BaseStreamReceiver$readAll$1(this, cVar);
        Object obj3 = baseStreamReceiver$readAll$1.result;
        i10 = baseStreamReceiver$readAll$1.label;
        if (i10 == 0) {
        }
        return d0Var.f20559a;
    }

    public final Object readNext(c<? super T> cVar) {
        return r.u(getFlow(), cVar);
    }
}
