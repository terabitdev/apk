package io.elevenlabs.ui.components;

import com.google.protobuf.c6;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.ui.components.SwipeToActionBoxKt$SwipeToActionBox$3$1", f = "SwipeToActionBox.kt", l = {161}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class SwipeToActionBoxKt$SwipeToActionBox$3$1 extends yn.i implements ho.p {
    final /* synthetic */ ho.p $onDismissGestureHandler;
    final /* synthetic */ n1.p $state;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwipeToActionBoxKt$SwipeToActionBox$3$1(n1.p pVar, ho.p pVar2, wn.c<? super SwipeToActionBoxKt$SwipeToActionBox$3$1> cVar) {
        super(2, cVar);
        this.$state = pVar;
        this.$onDismissGestureHandler = pVar2;
    }

    public static final SwipeAnchor invokeSuspend$lambda$0(n1.p pVar) {
        return (SwipeAnchor) pVar.f23886d.getValue();
    }

    @Override // yn.a
    public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
        return new SwipeToActionBoxKt$SwipeToActionBox$3$1(this.$state, this.$onDismissGestureHandler, cVar);
    }

    @Override // ho.p
    public final Object invoke(fr.d0 d0Var, wn.c<? super sn.z> cVar) {
        return ((SwipeToActionBoxKt$SwipeToActionBox$3$1) create(d0Var, cVar)).invokeSuspend(sn.z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
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
            ir.i o6 = ir.r.o(u2.r.K(new w2(this.$state, 0)));
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$onDismissGestureHandler, this.$state);
            this.label = 1;
            Object collect = o6.collect(anonymousClass2, this);
            xn.a aVar = xn.a.f37986a;
            if (collect == aVar) {
                return aVar;
            }
        }
        return sn.z.f31622a;
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* renamed from: io.elevenlabs.ui.components.SwipeToActionBoxKt$SwipeToActionBox$3$1$2 */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass2<T> implements ir.j {
        final /* synthetic */ ho.p $onDismissGestureHandler;
        final /* synthetic */ n1.p $state;

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* renamed from: io.elevenlabs.ui.components.SwipeToActionBoxKt$SwipeToActionBox$3$1$2$WhenMappings */
        /* loaded from: classes4.dex */
        public static final /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[SwipeAnchor.values().length];
                try {
                    iArr[SwipeAnchor.StartFullyOpen.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[SwipeAnchor.EndFullyOpen.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public AnonymousClass2(ho.p pVar, n1.p pVar2) {
            this.$onDismissGestureHandler = pVar;
            this.$state = pVar2;
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x006a, code lost:
        
            if (r11 == r8) goto L80;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x0092, code lost:
        
            if (r11 == r8) goto L80;
         */
        /* JADX WARN: Removed duplicated region for block: B:20:0x00ad A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:29:0x004e  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(SwipeAnchor swipeAnchor, wn.c<? super sn.z> cVar) {
            SwipeToActionBoxKt$SwipeToActionBox$3$1$2$emit$1 swipeToActionBoxKt$SwipeToActionBox$3$1$2$emit$1;
            int i10;
            if (cVar instanceof SwipeToActionBoxKt$SwipeToActionBox$3$1$2$emit$1) {
                swipeToActionBoxKt$SwipeToActionBox$3$1$2$emit$1 = (SwipeToActionBoxKt$SwipeToActionBox$3$1$2$emit$1) cVar;
                int i11 = swipeToActionBoxKt$SwipeToActionBox$3$1$2$emit$1.label;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    swipeToActionBoxKt$SwipeToActionBox$3$1$2$emit$1.label = i11 - Integer.MIN_VALUE;
                    Object obj = swipeToActionBoxKt$SwipeToActionBox$3$1$2$emit$1.result;
                    i10 = swipeToActionBoxKt$SwipeToActionBox$3$1$2$emit$1.label;
                    sn.z zVar = sn.z.f31622a;
                    xn.a aVar = xn.a.f37986a;
                    if (i10 == 0) {
                        if (i10 != 1) {
                            if (i10 != 2) {
                                if (i10 != 3) {
                                    if (i10 != 4) {
                                        c6.x("call to 'resume' before 'invoke' with coroutine");
                                        return null;
                                    }
                                } else {
                                    sn.a.g(obj);
                                    boolean booleanValue = ((Boolean) obj).booleanValue();
                                    if (!booleanValue) {
                                        n1.p pVar = this.$state;
                                        SwipeAnchor swipeAnchor2 = SwipeAnchor.SettledAtCenter;
                                        swipeToActionBoxKt$SwipeToActionBox$3$1$2$emit$1.L$0 = null;
                                        swipeToActionBoxKt$SwipeToActionBox$3$1$2$emit$1.Z$0 = booleanValue;
                                        swipeToActionBoxKt$SwipeToActionBox$3$1$2$emit$1.label = 4;
                                        if (n1.g.j(pVar, swipeAnchor2, swipeToActionBoxKt$SwipeToActionBox$3$1$2$emit$1) == aVar) {
                                            return aVar;
                                        }
                                    }
                                    return zVar;
                                }
                            }
                            sn.a.g(obj);
                            return zVar;
                        }
                        sn.a.g(obj);
                        boolean booleanValue2 = ((Boolean) obj).booleanValue();
                        if (!booleanValue2) {
                            n1.p pVar2 = this.$state;
                            SwipeAnchor swipeAnchor3 = SwipeAnchor.SettledAtCenter;
                            swipeToActionBoxKt$SwipeToActionBox$3$1$2$emit$1.L$0 = null;
                            swipeToActionBoxKt$SwipeToActionBox$3$1$2$emit$1.Z$0 = booleanValue2;
                            swipeToActionBoxKt$SwipeToActionBox$3$1$2$emit$1.label = 2;
                            if (n1.g.j(pVar2, swipeAnchor3, swipeToActionBoxKt$SwipeToActionBox$3$1$2$emit$1) == aVar) {
                            }
                        }
                        return zVar;
                    }
                    sn.a.g(obj);
                    int i12 = WhenMappings.$EnumSwitchMapping$0[swipeAnchor.ordinal()];
                    if (i12 != 1) {
                        if (i12 == 2) {
                            ho.p pVar3 = this.$onDismissGestureHandler;
                            BoxSide boxSide = BoxSide.END;
                            swipeToActionBoxKt$SwipeToActionBox$3$1$2$emit$1.L$0 = null;
                            swipeToActionBoxKt$SwipeToActionBox$3$1$2$emit$1.label = 3;
                            obj = pVar3.invoke(boxSide, swipeToActionBoxKt$SwipeToActionBox$3$1$2$emit$1);
                        }
                        return zVar;
                    }
                    ho.p pVar4 = this.$onDismissGestureHandler;
                    BoxSide boxSide2 = BoxSide.START;
                    swipeToActionBoxKt$SwipeToActionBox$3$1$2$emit$1.L$0 = null;
                    swipeToActionBoxKt$SwipeToActionBox$3$1$2$emit$1.label = 1;
                    obj = pVar4.invoke(boxSide2, swipeToActionBoxKt$SwipeToActionBox$3$1$2$emit$1);
                    return aVar;
                }
            }
            swipeToActionBoxKt$SwipeToActionBox$3$1$2$emit$1 = new SwipeToActionBoxKt$SwipeToActionBox$3$1$2$emit$1(this, cVar);
            Object obj2 = swipeToActionBoxKt$SwipeToActionBox$3$1$2$emit$1.result;
            i10 = swipeToActionBoxKt$SwipeToActionBox$3$1$2$emit$1.label;
            sn.z zVar2 = sn.z.f31622a;
            xn.a aVar2 = xn.a.f37986a;
            if (i10 == 0) {
            }
        }

        @Override // ir.j
        public /* bridge */ /* synthetic */ Object emit(Object obj, wn.c cVar) {
            return emit((SwipeAnchor) obj, (wn.c<? super sn.z>) cVar);
        }
    }
}
