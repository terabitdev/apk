package io.elevenlabs.analytics;

import android.gov.nist.javax.sip.parser.TokenNames;
import com.google.protobuf.c6;
import fr.d0;
import fr.g0;
import ho.p;
import io.elevenlabs.domain.ApplicationCoroutineScope;
import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.model.Customer;
import io.elevenlabs.domain.services.CustomerService;
import io.elevenlabs.domain.services.FeatureFlagService;
import ir.j;
import ir.j1;
import ir.r;
import ir.w;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;
import wn.c;
import yn.e;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0007\u0018\u0000 !2\u00020\u0001:\u0001!B+\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ-\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00112\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J3\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011\"\u000e\b\u0000\u0010\u0015*\b\u0012\u0004\u0012\u00028\u00000\u00142\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001bR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001cR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lio/elevenlabs/analytics/PostHogFeatureFlagService;", "Lio/elevenlabs/domain/services/FeatureFlagService;", "Lio/elevenlabs/domain/Logger;", "logger", "Lio/elevenlabs/domain/services/CustomerService;", "customerService", "Lfr/d0;", "scope", "Lio/elevenlabs/domain/DispatcherFactory;", "dispatcherFactory", "<init>", "(Lio/elevenlabs/domain/Logger;Lio/elevenlabs/domain/services/CustomerService;Lfr/d0;Lio/elevenlabs/domain/DispatcherFactory;)V", "Lio/elevenlabs/domain/services/FeatureFlagService$Flag;", "flag", "", "defaultValue", "logUsage", "Lir/i;", "isFlagEnabled", "(Lio/elevenlabs/domain/services/FeatureFlagService$Flag;ZZ)Lir/i;", "", TokenNames.T, "Lio/elevenlabs/domain/services/FeatureFlagService$Experiment;", "experiment", "getVariant", "(Lio/elevenlabs/domain/services/FeatureFlagService$Experiment;)Lir/i;", "Lio/elevenlabs/domain/Logger;", "Lio/elevenlabs/domain/services/CustomerService;", "Lfr/d0;", "Lir/j1;", "", "featureFlagsLastLoaded", "Lir/j1;", "Companion", "analytics_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class PostHogFeatureFlagService implements FeatureFlagService {
    private static final String TAG = "PostHogFeatureFlagService";
    private final CustomerService customerService;
    private final j1 featureFlagsLastLoaded;
    private final Logger logger;
    private final d0 scope;

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @e(c = "io.elevenlabs.analytics.PostHogFeatureFlagService$1", f = "PostHogFeatureFlagService.kt", l = {34}, m = "invokeSuspend", v = 2)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
    /* renamed from: io.elevenlabs.analytics.PostHogFeatureFlagService$1 */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends i implements p {
        int label;

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @e(c = "io.elevenlabs.analytics.PostHogFeatureFlagService$1$2", f = "PostHogFeatureFlagService.kt", l = {}, m = "invokeSuspend", v = 2)
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "customerId", "Lsn/z;", "<anonymous>", "(Ljava/lang/String;)V"}, k = 3, mv = {2, 3, 0})
        /* renamed from: io.elevenlabs.analytics.PostHogFeatureFlagService$1$2 */
        /* loaded from: classes3.dex */
        public static final class AnonymousClass2 extends i implements p {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ PostHogFeatureFlagService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(PostHogFeatureFlagService postHogFeatureFlagService, c<? super AnonymousClass2> cVar) {
                super(2, cVar);
                this.this$0 = postHogFeatureFlagService;
            }

            public static final void invokeSuspend$lambda$0(PostHogFeatureFlagService postHogFeatureFlagService) {
                postHogFeatureFlagService.featureFlagsLastLoaded.setValue(Long.valueOf(System.currentTimeMillis()));
                postHogFeatureFlagService.logger.log(PostHogFeatureFlagService.TAG, "Feature flags reloaded");
            }

            @Override // yn.a
            public final c<z> create(Object obj, c<?> cVar) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, cVar);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // ho.p
            public final Object invoke(String str, c<? super z> cVar) {
                return ((AnonymousClass2) create(str, cVar)).invokeSuspend(z.f31622a);
            }

            @Override // yn.a
            public final Object invokeSuspend(Object obj) {
                String str = (String) this.L$0;
                if (this.label == 0) {
                    sn.a.g(obj);
                    this.this$0.logger.log(PostHogFeatureFlagService.TAG, "Customer changed to: " + str + ", reloading feature flags");
                    ij.a aVar = ck.b.P0;
                    ck.b.Q0.s(new b(this.this$0, 3));
                    return z.f31622a;
                }
                c6.x("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }

        public AnonymousClass1(c<? super AnonymousClass1> cVar) {
            super(2, cVar);
        }

        @Override // yn.a
        public final c<z> create(Object obj, c<?> cVar) {
            return new AnonymousClass1(cVar);
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
                    sn.a.g(obj);
                } else {
                    c6.x("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            } else {
                sn.a.g(obj);
                final ir.i customerOrNull = PostHogFeatureFlagService.this.customerService.getCustomerOrNull();
                ir.i o6 = r.o(new ir.i() { // from class: io.elevenlabs.analytics.PostHogFeatureFlagService$1$invokeSuspend$$inlined$map$1

                    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
                    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                    /* renamed from: io.elevenlabs.analytics.PostHogFeatureFlagService$1$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                    /* loaded from: classes3.dex */
                    public static final class AnonymousClass2<T> implements j {
                        final /* synthetic */ j $this_unsafeFlow;

                        @e(c = "io.elevenlabs.analytics.PostHogFeatureFlagService$1$invokeSuspend$$inlined$map$1$2", f = "PostHogFeatureFlagService.kt", l = {50}, m = "emit", v = 2)
                        @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                        /* renamed from: io.elevenlabs.analytics.PostHogFeatureFlagService$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                        /* loaded from: classes3.dex */
                        public static final class AnonymousClass1 extends yn.c {
                            int I$0;
                            Object L$0;
                            Object L$1;
                            Object L$2;
                            Object L$3;
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(c cVar) {
                                super(cVar);
                            }

                            @Override // yn.a
                            public final Object invokeSuspend(Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(j jVar) {
                            this.$this_unsafeFlow = jVar;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
                        /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
                        @Override // ir.j
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object emit(Object obj, c cVar) {
                            AnonymousClass1 anonymousClass1;
                            int i10;
                            String str;
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
                                        j jVar = this.$this_unsafeFlow;
                                        Customer customer = (Customer) obj;
                                        if (customer != null) {
                                            str = customer.getId();
                                        } else {
                                            str = null;
                                        }
                                        anonymousClass1.L$0 = null;
                                        anonymousClass1.L$1 = null;
                                        anonymousClass1.L$2 = null;
                                        anonymousClass1.L$3 = null;
                                        anonymousClass1.I$0 = 0;
                                        anonymousClass1.label = 1;
                                        Object emit = jVar.emit(str, anonymousClass1);
                                        xn.a aVar = xn.a.f37986a;
                                        if (emit == aVar) {
                                            return aVar;
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
                    public Object collect(j jVar, c cVar) {
                        Object collect = ir.i.this.collect(new AnonymousClass2(jVar), cVar);
                        if (collect == xn.a.f37986a) {
                            return collect;
                        }
                        return z.f31622a;
                    }
                });
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(PostHogFeatureFlagService.this, null);
                this.label = 1;
                Object l4 = r.l(o6, anonymousClass2, this);
                xn.a aVar = xn.a.f37986a;
                if (l4 == aVar) {
                    return aVar;
                }
            }
            return z.f31622a;
        }
    }

    public PostHogFeatureFlagService(Logger logger, CustomerService customerService, @ApplicationCoroutineScope d0 d0Var, DispatcherFactory dispatcherFactory) {
        logger.getClass();
        customerService.getClass();
        d0Var.getClass();
        dispatcherFactory.getClass();
        this.logger = logger;
        this.customerService = customerService;
        this.scope = d0Var;
        this.featureFlagsLastLoaded = r.c(0L);
        g0.D(d0Var, dispatcherFactory.getDefault(), null, new AnonymousClass1(null), 2);
    }

    @Override // io.elevenlabs.domain.services.FeatureFlagService
    public <T extends Enum<T>> ir.i getVariant(final FeatureFlagService.Experiment<T> experiment) {
        experiment.getClass();
        final j1 j1Var = this.featureFlagsLastLoaded;
        final ir.i o6 = r.o(new ir.i() { // from class: io.elevenlabs.analytics.PostHogFeatureFlagService$getVariant$$inlined$map$1

            /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            /* renamed from: io.elevenlabs.analytics.PostHogFeatureFlagService$getVariant$$inlined$map$1$2, reason: invalid class name */
            /* loaded from: classes3.dex */
            public static final class AnonymousClass2<T> implements j {
                final /* synthetic */ FeatureFlagService.Experiment $experiment$inlined;
                final /* synthetic */ j $this_unsafeFlow;

                @e(c = "io.elevenlabs.analytics.PostHogFeatureFlagService$getVariant$$inlined$map$1$2", f = "PostHogFeatureFlagService.kt", l = {50}, m = "emit", v = 2)
                @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                /* renamed from: io.elevenlabs.analytics.PostHogFeatureFlagService$getVariant$$inlined$map$1$2$1, reason: invalid class name */
                /* loaded from: classes3.dex */
                public static final class AnonymousClass1 extends yn.c {
                    int I$0;
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(c cVar) {
                        super(cVar);
                    }

                    @Override // yn.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(j jVar, FeatureFlagService.Experiment experiment) {
                    this.$this_unsafeFlow = jVar;
                    this.$experiment$inlined = experiment;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
                @Override // ir.j
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, c cVar) {
                    AnonymousClass1 anonymousClass1;
                    int i10;
                    String str;
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
                                j jVar = this.$this_unsafeFlow;
                                ((Number) obj).longValue();
                                ij.a aVar = ck.b.P0;
                                String experimentKey = this.$experiment$inlined.getExperimentKey();
                                experimentKey.getClass();
                                Object o6 = ck.b.Q0.o(null, experimentKey);
                                if (o6 instanceof String) {
                                    str = (String) o6;
                                } else {
                                    str = null;
                                }
                                anonymousClass1.L$0 = null;
                                anonymousClass1.L$1 = null;
                                anonymousClass1.L$2 = null;
                                anonymousClass1.L$3 = null;
                                anonymousClass1.I$0 = 0;
                                anonymousClass1.label = 1;
                                Object emit = jVar.emit(str, anonymousClass1);
                                xn.a aVar2 = xn.a.f37986a;
                                if (emit == aVar2) {
                                    return aVar2;
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
            public Object collect(j jVar, c cVar) {
                Object collect = ir.i.this.collect(new AnonymousClass2(jVar, experiment), cVar);
                if (collect == xn.a.f37986a) {
                    return collect;
                }
                return z.f31622a;
            }
        });
        return new ir.i() { // from class: io.elevenlabs.analytics.PostHogFeatureFlagService$getVariant$$inlined$map$2

            /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            /* renamed from: io.elevenlabs.analytics.PostHogFeatureFlagService$getVariant$$inlined$map$2$2, reason: invalid class name */
            /* loaded from: classes3.dex */
            public static final class AnonymousClass2<T> implements j {
                final /* synthetic */ FeatureFlagService.Experiment $experiment$inlined;
                final /* synthetic */ j $this_unsafeFlow;

                @e(c = "io.elevenlabs.analytics.PostHogFeatureFlagService$getVariant$$inlined$map$2$2", f = "PostHogFeatureFlagService.kt", l = {50}, m = "emit", v = 2)
                @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                /* renamed from: io.elevenlabs.analytics.PostHogFeatureFlagService$getVariant$$inlined$map$2$2$1, reason: invalid class name */
                /* loaded from: classes3.dex */
                public static final class AnonymousClass1 extends yn.c {
                    int I$0;
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(c cVar) {
                        super(cVar);
                    }

                    @Override // yn.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(j jVar, FeatureFlagService.Experiment experiment) {
                    this.$this_unsafeFlow = jVar;
                    this.$experiment$inlined = experiment;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
                @Override // ir.j
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, c cVar) {
                    AnonymousClass1 anonymousClass1;
                    int i10;
                    Enum defaultVariant;
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
                                j jVar = this.$this_unsafeFlow;
                                String str = (String) obj;
                                if (str == null || (defaultVariant = this.$experiment$inlined.parseVariant(str)) == null) {
                                    defaultVariant = this.$experiment$inlined.getDefaultVariant();
                                }
                                anonymousClass1.L$0 = null;
                                anonymousClass1.L$1 = null;
                                anonymousClass1.L$2 = null;
                                anonymousClass1.L$3 = null;
                                anonymousClass1.I$0 = 0;
                                anonymousClass1.label = 1;
                                Object emit = jVar.emit(defaultVariant, anonymousClass1);
                                xn.a aVar = xn.a.f37986a;
                                if (emit == aVar) {
                                    return aVar;
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
            public Object collect(j jVar, c cVar) {
                Object collect = ir.i.this.collect(new AnonymousClass2(jVar, experiment), cVar);
                if (collect == xn.a.f37986a) {
                    return collect;
                }
                return z.f31622a;
            }
        };
    }

    @Override // io.elevenlabs.domain.services.FeatureFlagService
    public ir.i isFlagEnabled(final FeatureFlagService.Flag flag, final boolean defaultValue, boolean logUsage) {
        flag.getClass();
        final j1 j1Var = this.featureFlagsLastLoaded;
        return new w(r.o(new ir.i() { // from class: io.elevenlabs.analytics.PostHogFeatureFlagService$isFlagEnabled$$inlined$map$1

            /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            /* renamed from: io.elevenlabs.analytics.PostHogFeatureFlagService$isFlagEnabled$$inlined$map$1$2, reason: invalid class name */
            /* loaded from: classes3.dex */
            public static final class AnonymousClass2<T> implements j {
                final /* synthetic */ boolean $defaultValue$inlined;
                final /* synthetic */ FeatureFlagService.Flag $flag$inlined;
                final /* synthetic */ j $this_unsafeFlow;

                @e(c = "io.elevenlabs.analytics.PostHogFeatureFlagService$isFlagEnabled$$inlined$map$1$2", f = "PostHogFeatureFlagService.kt", l = {50}, m = "emit", v = 2)
                @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                /* renamed from: io.elevenlabs.analytics.PostHogFeatureFlagService$isFlagEnabled$$inlined$map$1$2$1, reason: invalid class name */
                /* loaded from: classes3.dex */
                public static final class AnonymousClass1 extends yn.c {
                    int I$0;
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(c cVar) {
                        super(cVar);
                    }

                    @Override // yn.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(j jVar, FeatureFlagService.Flag flag, boolean z6) {
                    this.$this_unsafeFlow = jVar;
                    this.$flag$inlined = flag;
                    this.$defaultValue$inlined = z6;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
                @Override // ir.j
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, c cVar) {
                    AnonymousClass1 anonymousClass1;
                    int i10;
                    boolean z6;
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
                                j jVar = this.$this_unsafeFlow;
                                ((Number) obj).longValue();
                                ij.a aVar = ck.b.P0;
                                String key = this.$flag$inlined.getKey();
                                boolean z10 = this.$defaultValue$inlined;
                                aVar.getClass();
                                key.getClass();
                                ck.b bVar = ck.b.Q0;
                                bVar.getClass();
                                key.getClass();
                                Object o6 = bVar.o(Boolean.valueOf(z10), key);
                                if (o6 instanceof Boolean) {
                                    z6 = ((Boolean) o6).booleanValue();
                                } else if ((o6 instanceof String) && ((CharSequence) o6).length() > 0) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                                Boolean valueOf = Boolean.valueOf(z6);
                                anonymousClass1.L$0 = null;
                                anonymousClass1.L$1 = null;
                                anonymousClass1.L$2 = null;
                                anonymousClass1.L$3 = null;
                                anonymousClass1.I$0 = 0;
                                anonymousClass1.label = 1;
                                Object emit = jVar.emit(valueOf, anonymousClass1);
                                xn.a aVar2 = xn.a.f37986a;
                                if (emit == aVar2) {
                                    return aVar2;
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
            public Object collect(j jVar, c cVar) {
                Object collect = ir.i.this.collect(new AnonymousClass2(jVar, flag, defaultValue), cVar);
                if (collect == xn.a.f37986a) {
                    return collect;
                }
                return z.f31622a;
            }
        }), new PostHogFeatureFlagService$isFlagEnabled$2(this, flag, defaultValue, null), 5);
    }
}
