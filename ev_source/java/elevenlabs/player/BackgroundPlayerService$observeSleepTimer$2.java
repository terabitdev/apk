package io.elevenlabs.player;

import com.google.protobuf.c6;
import fr.d0;
import ho.p;
import io.elevenlabs.player.BackgroundPlayerAction;
import io.elevenlabs.player.audio.SleepTimerFadeOut;
import ir.i1;
import ir.r;
import java.util.Date;
import jr.j;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;
import sn.k;
import sn.z;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.player.BackgroundPlayerService$observeSleepTimer$2", f = "BackgroundPlayerService.kt", l = {407}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes3.dex */
public final class BackgroundPlayerService$observeSleepTimer$2 extends i implements p {
    int label;
    final /* synthetic */ BackgroundPlayerService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackgroundPlayerService$observeSleepTimer$2(BackgroundPlayerService backgroundPlayerService, wn.c<? super BackgroundPlayerService$observeSleepTimer$2> cVar) {
        super(2, cVar);
        this.this$0 = backgroundPlayerService;
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        return new BackgroundPlayerService$observeSleepTimer$2(this.this$0, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, wn.c<? super z> cVar) {
        return ((BackgroundPlayerService$observeSleepTimer$2) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        final i1 i1Var;
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                sn.a.g(obj);
            } else {
                c6.x("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            sn.a.g(obj);
            i1Var = this.this$0.actionsFlow;
            j G = r.G(r.o(new ir.i() { // from class: io.elevenlabs.player.BackgroundPlayerService$observeSleepTimer$2$invokeSuspend$$inlined$filterIsInstance$1

                /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
                @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                /* renamed from: io.elevenlabs.player.BackgroundPlayerService$observeSleepTimer$2$invokeSuspend$$inlined$filterIsInstance$1$2, reason: invalid class name */
                /* loaded from: classes3.dex */
                public static final class AnonymousClass2<T> implements ir.j {
                    final /* synthetic */ ir.j $this_unsafeFlow;

                    @yn.e(c = "io.elevenlabs.player.BackgroundPlayerService$observeSleepTimer$2$invokeSuspend$$inlined$filterIsInstance$1$2", f = "BackgroundPlayerService.kt", l = {50}, m = "emit", v = 2)
                    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                    /* renamed from: io.elevenlabs.player.BackgroundPlayerService$observeSleepTimer$2$invokeSuspend$$inlined$filterIsInstance$1$2$1, reason: invalid class name */
                    /* loaded from: classes3.dex */
                    public static final class AnonymousClass1 extends yn.c {
                        int I$0;
                        Object L$0;
                        Object L$1;
                        Object L$2;
                        Object L$3;
                        int label;
                        /* synthetic */ Object result;

                        public AnonymousClass1(wn.c cVar) {
                            super(cVar);
                        }

                        @Override // yn.a
                        public final Object invokeSuspend(Object obj) {
                            this.result = obj;
                            this.label |= Integer.MIN_VALUE;
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(ir.j jVar) {
                        this.$this_unsafeFlow = jVar;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
                    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
                    @Override // ir.j
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object emit(Object obj, wn.c cVar) {
                        AnonymousClass1 anonymousClass1;
                        int i10;
                        if (cVar instanceof AnonymousClass1) {
                            anonymousClass1 = (AnonymousClass1) cVar;
                            int i11 = anonymousClass1.label;
                            if ((i11 & Integer.MIN_VALUE) != 0) {
                                anonymousClass1.label = i11 - Integer.MIN_VALUE;
                                Object obj2 = anonymousClass1.result;
                                i10 = anonymousClass1.label;
                                if (i10 == 0) {
                                    if (i10 == 1) {
                                        sn.a.g(obj2);
                                    } else {
                                        c6.x("call to 'resume' before 'invoke' with coroutine");
                                        return null;
                                    }
                                } else {
                                    sn.a.g(obj2);
                                    ir.j jVar = this.$this_unsafeFlow;
                                    if (obj instanceof BackgroundPlayerAction.SleepTimer) {
                                        anonymousClass1.L$0 = null;
                                        anonymousClass1.L$1 = null;
                                        anonymousClass1.L$2 = null;
                                        anonymousClass1.L$3 = null;
                                        anonymousClass1.I$0 = 0;
                                        anonymousClass1.label = 1;
                                        Object emit = jVar.emit(obj, anonymousClass1);
                                        xn.a aVar = xn.a.f37986a;
                                        if (emit == aVar) {
                                            return aVar;
                                        }
                                    }
                                }
                                return z.f31622a;
                            }
                        }
                        anonymousClass1 = new AnonymousClass1(cVar);
                        Object obj22 = anonymousClass1.result;
                        i10 = anonymousClass1.label;
                        if (i10 == 0) {
                        }
                        return z.f31622a;
                    }
                }

                @Override // ir.i
                public Object collect(ir.j jVar, wn.c cVar) {
                    Object collect = ir.i.this.collect(new AnonymousClass2(jVar), cVar);
                    if (collect == xn.a.f37986a) {
                        return collect;
                    }
                    return z.f31622a;
                }
            }), new BackgroundPlayerService$observeSleepTimer$2$invokeSuspend$$inlined$flatMapLatest$1(null, this.this$0));
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0);
            this.label = 1;
            Object collect = G.collect(anonymousClass2, this);
            xn.a aVar = xn.a.f37986a;
            if (collect == aVar) {
                return aVar;
            }
        }
        return z.f31622a;
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* renamed from: io.elevenlabs.player.BackgroundPlayerService$observeSleepTimer$2$2, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass2<T> implements ir.j {
        final /* synthetic */ BackgroundPlayerService this$0;

        public AnonymousClass2(BackgroundPlayerService backgroundPlayerService) {
            this.this$0 = backgroundPlayerService;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0079  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x009b  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0035  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(k kVar, wn.c<? super z> cVar) {
            BackgroundPlayerService$observeSleepTimer$2$2$emit$1 backgroundPlayerService$observeSleepTimer$2$2$emit$1;
            int i10;
            i1 i1Var;
            SleepTimerFadeOut sleepTimerFadeOut;
            if (cVar instanceof BackgroundPlayerService$observeSleepTimer$2$2$emit$1) {
                backgroundPlayerService$observeSleepTimer$2$2$emit$1 = (BackgroundPlayerService$observeSleepTimer$2$2$emit$1) cVar;
                int i11 = backgroundPlayerService$observeSleepTimer$2$2$emit$1.label;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    backgroundPlayerService$observeSleepTimer$2$2$emit$1.label = i11 - Integer.MIN_VALUE;
                    Object obj = backgroundPlayerService$observeSleepTimer$2$2$emit$1.result;
                    i10 = backgroundPlayerService$observeSleepTimer$2$2$emit$1.label;
                    if (i10 == 0) {
                        if (i10 == 1) {
                            sn.a.g(obj);
                        } else {
                            c6.x("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    } else {
                        sn.a.g(obj);
                        if (((Date) kVar.f31600a).compareTo((Date) kVar.f31601b) > 0) {
                            this.this$0.getLogger().log(this.this$0.tag, "Sleep timer reached, starting fade-out");
                            i1Var = this.this$0.actionsFlow;
                            BackgroundPlayerAction.SleepTimer sleepTimer = new BackgroundPlayerAction.SleepTimer(null);
                            backgroundPlayerService$observeSleepTimer$2$2$emit$1.L$0 = null;
                            backgroundPlayerService$observeSleepTimer$2$2$emit$1.L$1 = null;
                            backgroundPlayerService$observeSleepTimer$2$2$emit$1.label = 1;
                            Object emit = i1Var.emit(sleepTimer, backgroundPlayerService$observeSleepTimer$2$2$emit$1);
                            xn.a aVar = xn.a.f37986a;
                            if (emit == aVar) {
                                return aVar;
                            }
                        }
                        return z.f31622a;
                    }
                    sleepTimerFadeOut = this.this$0.sleepTimerFadeOut;
                    if (sleepTimerFadeOut == null) {
                        d0 d0Var = this.this$0.scope;
                        if (d0Var != null) {
                            sleepTimerFadeOut.start(d0Var, this.this$0.getPlayer(), this.this$0.getDispatcherFactory().getMain());
                            return z.f31622a;
                        }
                        m.i("scope");
                        throw null;
                    }
                    m.i("sleepTimerFadeOut");
                    throw null;
                }
            }
            backgroundPlayerService$observeSleepTimer$2$2$emit$1 = new BackgroundPlayerService$observeSleepTimer$2$2$emit$1(this, cVar);
            Object obj2 = backgroundPlayerService$observeSleepTimer$2$2$emit$1.result;
            i10 = backgroundPlayerService$observeSleepTimer$2$2$emit$1.label;
            if (i10 == 0) {
            }
            sleepTimerFadeOut = this.this$0.sleepTimerFadeOut;
            if (sleepTimerFadeOut == null) {
            }
        }

        @Override // ir.j
        public /* bridge */ /* synthetic */ Object emit(Object obj, wn.c cVar) {
            return emit((k) obj, (wn.c<? super z>) cVar);
        }
    }
}
