package io.livekit.android.coroutines;

import android.gov.nist.javax.sip.parser.TokenNames;
import com.google.protobuf.c6;
import fr.d0;
import fr.g0;
import ho.p;
import ir.j;
import ir.r;
import ir.w;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import sn.a;
import sn.z;
import wn.c;
import yn.e;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@e(c = "io.livekit.android.coroutines.FlowExtKt$takeUntilSignal$1", f = "FlowExt.kt", l = {31}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {TokenNames.T, "Lir/j;", "Lsn/z;", "<anonymous>", "(Lir/j;)V"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class FlowExtKt$takeUntilSignal$1 extends i implements p {
    final /* synthetic */ ir.i $signal;
    final /* synthetic */ ir.i $this_takeUntilSignal;
    private /* synthetic */ Object L$0;
    int label;

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @e(c = "io.livekit.android.coroutines.FlowExtKt$takeUntilSignal$1$1", f = "FlowExt.kt", l = {37}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {TokenNames.T, "Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: io.livekit.android.coroutines.FlowExtKt$takeUntilSignal$1$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends i implements p {
        final /* synthetic */ j $$this$flow;
        final /* synthetic */ ir.i $signal;
        final /* synthetic */ ir.i $this_takeUntilSignal;
        private /* synthetic */ Object L$0;
        int label;

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @e(c = "io.livekit.android.coroutines.FlowExtKt$takeUntilSignal$1$1$1", f = "FlowExt.kt", l = {33}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {TokenNames.T, "Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {1, 9, 0})
        /* renamed from: io.livekit.android.coroutines.FlowExtKt$takeUntilSignal$1$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C00531 extends i implements p {
            final /* synthetic */ d0 $$this$coroutineScope;
            final /* synthetic */ ir.i $signal;
            int label;

            /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
            @e(c = "io.livekit.android.coroutines.FlowExtKt$takeUntilSignal$1$1$1$1", f = "FlowExt.kt", l = {}, m = "invokeSuspend")
            @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {TokenNames.T, "Lsn/z;", "it", "", "<anonymous>", "(V)Z"}, k = 3, mv = {1, 9, 0})
            /* renamed from: io.livekit.android.coroutines.FlowExtKt$takeUntilSignal$1$1$1$1, reason: invalid class name and collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C00541 extends i implements p {
                /* synthetic */ Object L$0;
                int label;

                public C00541(c<? super C00541> cVar) {
                    super(2, cVar);
                }

                @Override // yn.a
                public final c<z> create(Object obj, c<?> cVar) {
                    C00541 c00541 = new C00541(cVar);
                    c00541.L$0 = obj;
                    return c00541;
                }

                @Override // ho.p
                public final Object invoke(z zVar, c<? super Boolean> cVar) {
                    return ((C00541) create(zVar, cVar)).invokeSuspend(z.f31622a);
                }

                @Override // yn.a
                public final Object invokeSuspend(Object obj) {
                    boolean z6;
                    if (this.label == 0) {
                        a.g(obj);
                        if (((z) this.L$0) == null) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        return Boolean.valueOf(z6);
                    }
                    c6.x("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00531(ir.i iVar, d0 d0Var, c<? super C00531> cVar) {
                super(2, cVar);
                this.$signal = iVar;
                this.$$this$coroutineScope = d0Var;
            }

            @Override // yn.a
            public final c<z> create(Object obj, c<?> cVar) {
                return new C00531(this.$signal, this.$$this$coroutineScope, cVar);
            }

            @Override // ho.p
            public final Object invoke(d0 d0Var, c<? super z> cVar) {
                return ((C00531) create(d0Var, cVar)).invokeSuspend(z.f31622a);
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
                    w wVar = new w(this.$signal, new C00541(null), 4);
                    this.label = 1;
                    Object k4 = r.k(wVar, this);
                    xn.a aVar = xn.a.f37986a;
                    if (k4 == aVar) {
                        return aVar;
                    }
                }
                g0.i(this.$$this$coroutineScope, null);
                return z.f31622a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ir.i iVar, ir.i iVar2, j jVar, c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$this_takeUntilSignal = iVar;
            this.$signal = iVar2;
            this.$$this$flow = jVar;
        }

        @Override // yn.a
        public final c<z> create(Object obj, c<?> cVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$this_takeUntilSignal, this.$signal, this.$$this$flow, cVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // ho.p
        public final Object invoke(d0 d0Var, c<? super z> cVar) {
            return ((AnonymousClass1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
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
                d0 d0Var = (d0) this.L$0;
                g0.D(d0Var, null, null, new C00531(this.$signal, d0Var, null), 3);
                ir.i iVar = this.$this_takeUntilSignal;
                final j jVar = this.$$this$flow;
                j jVar2 = new j() { // from class: io.livekit.android.coroutines.FlowExtKt.takeUntilSignal.1.1.2
                    @Override // ir.j
                    public final Object emit(T t10, c<? super z> cVar) {
                        Object emit = j.this.emit(t10, cVar);
                        if (emit == xn.a.f37986a) {
                            return emit;
                        }
                        return z.f31622a;
                    }
                };
                this.label = 1;
                Object collect = iVar.collect(jVar2, this);
                xn.a aVar = xn.a.f37986a;
                if (collect == aVar) {
                    return aVar;
                }
            }
            return z.f31622a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowExtKt$takeUntilSignal$1(ir.i iVar, ir.i iVar2, c<? super FlowExtKt$takeUntilSignal$1> cVar) {
        super(2, cVar);
        this.$this_takeUntilSignal = iVar;
        this.$signal = iVar2;
    }

    @Override // yn.a
    public final c<z> create(Object obj, c<?> cVar) {
        FlowExtKt$takeUntilSignal$1 flowExtKt$takeUntilSignal$1 = new FlowExtKt$takeUntilSignal$1(this.$this_takeUntilSignal, this.$signal, cVar);
        flowExtKt$takeUntilSignal$1.L$0 = obj;
        return flowExtKt$takeUntilSignal$1;
    }

    @Override // ho.p
    public final Object invoke(j jVar, c<? super z> cVar) {
        return ((FlowExtKt$takeUntilSignal$1) create(jVar, cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.label;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    a.g(obj);
                } else {
                    c6.x("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            } else {
                a.g(obj);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$this_takeUntilSignal, this.$signal, (j) this.L$0, null);
                this.label = 1;
                Object l4 = g0.l(anonymousClass1, this);
                xn.a aVar = xn.a.f37986a;
                if (l4 == aVar) {
                    return aVar;
                }
            }
        } catch (CancellationException unused) {
        }
        return z.f31622a;
    }
}
