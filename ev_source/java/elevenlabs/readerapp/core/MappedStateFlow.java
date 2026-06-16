package io.elevenlabs.readerapp.core;

import android.gov.nist.javax.sip.parser.TokenNames;
import com.google.protobuf.c6;
import ir.z1;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\b\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003:\u0001\u0017B)\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001e\u0010\f\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\tH\u0096@¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000eR \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000fR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00028\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lio/elevenlabs/readerapp/core/MappedStateFlow;", TokenNames.T, TokenNames.R, "Lir/z1;", "upstream", "Lkotlin/Function1;", "mapper", "<init>", "(Lir/z1;Lho/l;)V", "Lir/j;", "collector", "", "collect", "(Lir/j;Lwn/c;)Ljava/lang/Object;", "Lir/z1;", "Lho/l;", "", "getReplayCache", "()Ljava/util/List;", "replayCache", "getValue", "()Ljava/lang/Object;", "value", "Unset", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class MappedStateFlow<T, R> implements z1 {
    private final ho.l mapper;
    private final z1 upstream;

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/elevenlabs/readerapp/core/MappedStateFlow$Unset;", "", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class Unset {
        public static final Unset INSTANCE = new Unset();

        private Unset() {
        }
    }

    public MappedStateFlow(z1 z1Var, ho.l lVar) {
        z1Var.getClass();
        lVar.getClass();
        this.upstream = z1Var;
        this.mapper = lVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Type inference failed for: r6v2, types: [kotlin.jvm.internal.d0, java.lang.Object] */
    @Override // ir.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object collect(final ir.j jVar, wn.c<?> cVar) {
        MappedStateFlow$collect$1 mappedStateFlow$collect$1;
        int i10;
        if (cVar instanceof MappedStateFlow$collect$1) {
            mappedStateFlow$collect$1 = (MappedStateFlow$collect$1) cVar;
            int i11 = mappedStateFlow$collect$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                mappedStateFlow$collect$1.label = i11 - Integer.MIN_VALUE;
                Object obj = mappedStateFlow$collect$1.result;
                i10 = mappedStateFlow$collect$1.label;
                if (i10 == 0) {
                    if (i10 != 1) {
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    sn.a.g(obj);
                } else {
                    sn.a.g(obj);
                    final ?? obj2 = new Object();
                    obj2.f20559a = Unset.INSTANCE;
                    z1 z1Var = this.upstream;
                    ir.j jVar2 = new ir.j(this) { // from class: io.elevenlabs.readerapp.core.MappedStateFlow$collect$2
                        final /* synthetic */ MappedStateFlow<T, R> this$0;

                        {
                            this.this$0 = this;
                        }

                        @Override // ir.j
                        public final Object emit(T t10, wn.c<? super z> cVar2) {
                            ho.l lVar;
                            lVar = ((MappedStateFlow) this.this$0).mapper;
                            Object invoke = lVar.invoke(t10);
                            boolean c5 = kotlin.jvm.internal.m.c(invoke, obj2.f20559a);
                            z zVar = z.f31622a;
                            if (!c5) {
                                obj2.f20559a = invoke;
                                Object emit = jVar.emit(invoke, cVar2);
                                if (emit == xn.a.f37986a) {
                                    return emit;
                                }
                            }
                            return zVar;
                        }
                    };
                    mappedStateFlow$collect$1.L$0 = null;
                    mappedStateFlow$collect$1.L$1 = null;
                    mappedStateFlow$collect$1.label = 1;
                    Object collect = z1Var.collect(jVar2, mappedStateFlow$collect$1);
                    xn.a aVar = xn.a.f37986a;
                    if (collect == aVar) {
                        return aVar;
                    }
                }
                c6.u();
                return null;
            }
        }
        mappedStateFlow$collect$1 = new MappedStateFlow$collect$1(this, cVar);
        Object obj3 = mappedStateFlow$collect$1.result;
        i10 = mappedStateFlow$collect$1.label;
        if (i10 == 0) {
        }
        c6.u();
        return null;
    }

    @Override // ir.n1
    public List<R> getReplayCache() {
        return ig.f.H(getValue());
    }

    @Override // ir.z1
    public R getValue() {
        return (R) this.mapper.invoke(this.upstream.getValue());
    }
}
