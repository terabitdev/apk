package io.elevenlabs.ui.components;

import com.google.protobuf.c6;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.ui.components.SwipeToActionBoxKt$rememberThresholdState$1$1", f = "SwipeToActionBox.kt", l = {553}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class SwipeToActionBoxKt$rememberThresholdState$1$1 extends yn.i implements ho.p {
    final /* synthetic */ List<ActionConfig> $endSideActions;
    final /* synthetic */ ho.a $onThresholdCrossed;
    final /* synthetic */ List<ActionConfig> $startSideActions;
    final /* synthetic */ n1.p $state;
    final /* synthetic */ u2.z0 $thresholdState$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwipeToActionBoxKt$rememberThresholdState$1$1(List<ActionConfig> list, List<ActionConfig> list2, n1.p pVar, ho.a aVar, u2.z0 z0Var, wn.c<? super SwipeToActionBoxKt$rememberThresholdState$1$1> cVar) {
        super(2, cVar);
        this.$startSideActions = list;
        this.$endSideActions = list2;
        this.$state = pVar;
        this.$onThresholdCrossed = aVar;
        this.$thresholdState$delegate = z0Var;
    }

    public static final float invokeSuspend$lambda$0(n1.p pVar) {
        return pVar.f23888f.h();
    }

    @Override // yn.a
    public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
        return new SwipeToActionBoxKt$rememberThresholdState$1$1(this.$startSideActions, this.$endSideActions, this.$state, this.$onThresholdCrossed, this.$thresholdState$delegate, cVar);
    }

    @Override // ho.p
    public final Object invoke(fr.d0 d0Var, wn.c<? super sn.z> cVar) {
        return ((SwipeToActionBoxKt$rememberThresholdState$1$1) create(d0Var, cVar)).invokeSuspend(sn.z.f31622a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0023, code lost:
    
        if (r6 != false) goto L29;
     */
    @Override // yn.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        boolean isSingleDestructiveAction;
        boolean isSingleDestructiveAction2;
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
            isSingleDestructiveAction = SwipeToActionBoxKt.isSingleDestructiveAction(this.$startSideActions);
            if (!isSingleDestructiveAction) {
                isSingleDestructiveAction2 = SwipeToActionBoxKt.isSingleDestructiveAction(this.$endSideActions);
            }
            final ir.m1 K = u2.r.K(new w2(this.$state, 1));
            final List<ActionConfig> list = this.$startSideActions;
            final n1.p pVar = this.$state;
            final List<ActionConfig> list2 = this.$endSideActions;
            ir.i o6 = ir.r.o(new ir.i() { // from class: io.elevenlabs.ui.components.SwipeToActionBoxKt$rememberThresholdState$1$1$invokeSuspend$$inlined$map$1

                /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
                @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                /* renamed from: io.elevenlabs.ui.components.SwipeToActionBoxKt$rememberThresholdState$1$1$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                /* loaded from: classes4.dex */
                public static final class AnonymousClass2<T> implements ir.j {
                    final /* synthetic */ List $endSideActions$inlined;
                    final /* synthetic */ List $startSideActions$inlined;
                    final /* synthetic */ n1.p $state$inlined;
                    final /* synthetic */ ir.j $this_unsafeFlow;

                    @yn.e(c = "io.elevenlabs.ui.components.SwipeToActionBoxKt$rememberThresholdState$1$1$invokeSuspend$$inlined$map$1$2", f = "SwipeToActionBox.kt", l = {50}, m = "emit", v = 2)
                    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                    /* renamed from: io.elevenlabs.ui.components.SwipeToActionBoxKt$rememberThresholdState$1$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                    /* loaded from: classes4.dex */
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

                    public AnonymousClass2(ir.j jVar, List list, n1.p pVar, List list2) {
                        this.$this_unsafeFlow = jVar;
                        this.$startSideActions$inlined = list;
                        this.$state$inlined = pVar;
                        this.$endSideActions$inlined = list2;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
                    /* JADX WARN: Removed duplicated region for block: B:22:0x0078  */
                    /* JADX WARN: Removed duplicated region for block: B:26:0x00a0  */
                    /* JADX WARN: Removed duplicated region for block: B:29:0x00bf A[RETURN] */
                    /* JADX WARN: Removed duplicated region for block: B:30:0x00a3  */
                    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
                    @Override // ir.j
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object emit(Object obj, wn.c cVar) {
                        AnonymousClass1 anonymousClass1;
                        int i10;
                        boolean isSingleDestructiveAction;
                        boolean z6;
                        boolean isSingleDestructiveAction2;
                        boolean z10;
                        ThresholdState thresholdState;
                        Object emit;
                        xn.a aVar;
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
                                    float floatValue = ((Number) obj).floatValue();
                                    isSingleDestructiveAction = SwipeToActionBoxKt.isSingleDestructiveAction(this.$startSideActions$inlined);
                                    if (isSingleDestructiveAction) {
                                        if (floatValue > (((n1.y) this.$state$inlined.b()).e(SwipeAnchor.StartFullyOpen) + ((n1.y) this.$state$inlined.b()).e(SwipeAnchor.StartPeeking)) / 2) {
                                            z6 = true;
                                            isSingleDestructiveAction2 = SwipeToActionBoxKt.isSingleDestructiveAction(this.$endSideActions$inlined);
                                            if (isSingleDestructiveAction2) {
                                                if (floatValue < (((n1.y) this.$state$inlined.b()).e(SwipeAnchor.EndFullyOpen) + ((n1.y) this.$state$inlined.b()).e(SwipeAnchor.EndPeeking)) / 2) {
                                                    z10 = true;
                                                    if (z6) {
                                                        thresholdState = ThresholdState.START_SIDE_CROSSED;
                                                    } else if (z10) {
                                                        thresholdState = ThresholdState.END_SIDE_CROSSED;
                                                    } else {
                                                        thresholdState = ThresholdState.NOT_CROSSED;
                                                    }
                                                    anonymousClass1.L$0 = null;
                                                    anonymousClass1.L$1 = null;
                                                    anonymousClass1.L$2 = null;
                                                    anonymousClass1.L$3 = null;
                                                    anonymousClass1.I$0 = 0;
                                                    anonymousClass1.label = 1;
                                                    emit = jVar.emit(thresholdState, anonymousClass1);
                                                    aVar = xn.a.f37986a;
                                                    if (emit == aVar) {
                                                        return aVar;
                                                    }
                                                }
                                            }
                                            z10 = false;
                                            if (z6) {
                                            }
                                            anonymousClass1.L$0 = null;
                                            anonymousClass1.L$1 = null;
                                            anonymousClass1.L$2 = null;
                                            anonymousClass1.L$3 = null;
                                            anonymousClass1.I$0 = 0;
                                            anonymousClass1.label = 1;
                                            emit = jVar.emit(thresholdState, anonymousClass1);
                                            aVar = xn.a.f37986a;
                                            if (emit == aVar) {
                                            }
                                        }
                                    }
                                    z6 = false;
                                    isSingleDestructiveAction2 = SwipeToActionBoxKt.isSingleDestructiveAction(this.$endSideActions$inlined);
                                    if (isSingleDestructiveAction2) {
                                    }
                                    z10 = false;
                                    if (z6) {
                                    }
                                    anonymousClass1.L$0 = null;
                                    anonymousClass1.L$1 = null;
                                    anonymousClass1.L$2 = null;
                                    anonymousClass1.L$3 = null;
                                    anonymousClass1.I$0 = 0;
                                    anonymousClass1.label = 1;
                                    emit = jVar.emit(thresholdState, anonymousClass1);
                                    aVar = xn.a.f37986a;
                                    if (emit == aVar) {
                                    }
                                }
                                return sn.z.f31622a;
                            }
                        }
                        anonymousClass1 = new AnonymousClass1(cVar);
                        Object obj22 = anonymousClass1.result;
                        i10 = anonymousClass1.label;
                        if (i10 == 0) {
                        }
                        return sn.z.f31622a;
                    }
                }

                @Override // ir.i
                public Object collect(ir.j jVar, wn.c cVar) {
                    Object collect = ir.i.this.collect(new AnonymousClass2(jVar, list, pVar, list2), cVar);
                    if (collect == xn.a.f37986a) {
                        return collect;
                    }
                    return sn.z.f31622a;
                }
            });
            AnonymousClass3 anonymousClass3 = new ir.j() { // from class: io.elevenlabs.ui.components.SwipeToActionBoxKt$rememberThresholdState$1$1.3
                final /* synthetic */ u2.z0 $thresholdState$delegate;

                public AnonymousClass3(u2.z0 z0Var) {
                    r2 = z0Var;
                }

                /* JADX WARN: Code restructure failed: missing block: B:6:0x0012, code lost:
                
                    if (r0 != r3) goto L20;
                 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(ThresholdState thresholdState, wn.c<? super sn.z> cVar) {
                    ThresholdState rememberThresholdState$lambda$1;
                    ThresholdState rememberThresholdState$lambda$12;
                    rememberThresholdState$lambda$1 = SwipeToActionBoxKt.rememberThresholdState$lambda$1(r2);
                    if (thresholdState != rememberThresholdState$lambda$1) {
                        ThresholdState thresholdState2 = ThresholdState.NOT_CROSSED;
                        if (thresholdState == thresholdState2) {
                            rememberThresholdState$lambda$12 = SwipeToActionBoxKt.rememberThresholdState$lambda$1(r2);
                        }
                        ho.a.this.invoke();
                        r2.setValue(thresholdState);
                    }
                    return sn.z.f31622a;
                }

                @Override // ir.j
                public /* bridge */ /* synthetic */ Object emit(Object obj2, wn.c cVar) {
                    return emit((ThresholdState) obj2, (wn.c<? super sn.z>) cVar);
                }
            };
            this.label = 1;
            Object collect = o6.collect(anonymousClass3, this);
            xn.a aVar = xn.a.f37986a;
            if (collect == aVar) {
                return aVar;
            }
        }
        return sn.z.f31622a;
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* renamed from: io.elevenlabs.ui.components.SwipeToActionBoxKt$rememberThresholdState$1$1$3 */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass3<T> implements ir.j {
        final /* synthetic */ u2.z0 $thresholdState$delegate;

        public AnonymousClass3(u2.z0 z0Var) {
            r2 = z0Var;
        }

        /* JADX WARN: Code restructure failed: missing block: B:6:0x0012, code lost:
        
            if (r0 != r3) goto L20;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(ThresholdState thresholdState, wn.c<? super sn.z> cVar) {
            ThresholdState rememberThresholdState$lambda$1;
            ThresholdState rememberThresholdState$lambda$12;
            rememberThresholdState$lambda$1 = SwipeToActionBoxKt.rememberThresholdState$lambda$1(r2);
            if (thresholdState != rememberThresholdState$lambda$1) {
                ThresholdState thresholdState2 = ThresholdState.NOT_CROSSED;
                if (thresholdState == thresholdState2) {
                    rememberThresholdState$lambda$12 = SwipeToActionBoxKt.rememberThresholdState$lambda$1(r2);
                }
                ho.a.this.invoke();
                r2.setValue(thresholdState);
            }
            return sn.z.f31622a;
        }

        @Override // ir.j
        public /* bridge */ /* synthetic */ Object emit(Object obj2, wn.c cVar) {
            return emit((ThresholdState) obj2, (wn.c<? super sn.z>) cVar);
        }
    }
}
