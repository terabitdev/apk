package io.elevenlabs.analytics;

import com.google.protobuf.c6;
import fr.d0;
import fr.g0;
import ho.p;
import ig.f;
import io.elevenlabs.domain.Analytics;
import io.elevenlabs.domain.ApplicationCoroutineScope;
import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.model.User;
import io.elevenlabs.domain.services.AuthService;
import io.elevenlabs.domain.services.LocaleService;
import io.elevenlabs.domain.services.SingularService;
import io.elevenlabs.domain.usecase.DevicePerformanceMeasurer;
import ir.j;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import jk.q;
import jk.y;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.k;
import sn.z;
import tn.a0;
import tn.o;
import tn.u;
import wn.c;
import wq.n;
import yn.e;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001BK\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0001\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001aR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001bR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001cR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001dR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001eR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001fR\u0016\u0010!\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lio/elevenlabs/analytics/PostHogAnalytics;", "Lio/elevenlabs/domain/Analytics;", "Lio/elevenlabs/domain/Logger;", "logger", "Lio/elevenlabs/domain/services/AuthService;", "authService", "Lio/elevenlabs/domain/DispatcherFactory;", "dispatcherFactory", "Lio/elevenlabs/domain/services/LocaleService;", "localeService", "Lfr/d0;", "coroutineScope", "Lio/elevenlabs/domain/services/SingularService;", "singularService", "Lio/elevenlabs/domain/usecase/DevicePerformanceMeasurer;", "devicePerformanceMeasurer", "Lio/elevenlabs/analytics/FirebaseAnalyticsService;", "firebaseAnalyticsService", "<init>", "(Lio/elevenlabs/domain/Logger;Lio/elevenlabs/domain/services/AuthService;Lio/elevenlabs/domain/DispatcherFactory;Lio/elevenlabs/domain/services/LocaleService;Lfr/d0;Lio/elevenlabs/domain/services/SingularService;Lio/elevenlabs/domain/usecase/DevicePerformanceMeasurer;Lio/elevenlabs/analytics/FirebaseAnalyticsService;)V", "Lio/elevenlabs/domain/Analytics$Event;", "event", "Lsn/z;", "log", "(Lio/elevenlabs/domain/Analytics$Event;)V", "Lio/elevenlabs/domain/Logger;", "Lio/elevenlabs/domain/services/AuthService;", "Lio/elevenlabs/domain/services/LocaleService;", "Lfr/d0;", "Lio/elevenlabs/domain/services/SingularService;", "Lio/elevenlabs/domain/usecase/DevicePerformanceMeasurer;", "Lio/elevenlabs/analytics/FirebaseAnalyticsService;", "", "isSignedIn", "Z", "analytics_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class PostHogAnalytics implements Analytics {
    private final AuthService authService;
    private final d0 coroutineScope;
    private final DevicePerformanceMeasurer devicePerformanceMeasurer;
    private final FirebaseAnalyticsService firebaseAnalyticsService;
    private boolean isSignedIn;
    private final LocaleService localeService;
    private final Logger logger;
    private final SingularService singularService;

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @e(c = "io.elevenlabs.analytics.PostHogAnalytics$1", f = "PostHogAnalytics.kt", l = {}, m = "invokeSuspend", v = 2)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
    /* renamed from: io.elevenlabs.analytics.PostHogAnalytics$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends i implements p {
        private /* synthetic */ Object L$0;
        int label;

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @e(c = "io.elevenlabs.analytics.PostHogAnalytics$1$1", f = "PostHogAnalytics.kt", l = {31}, m = "invokeSuspend", v = 2)
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
        /* renamed from: io.elevenlabs.analytics.PostHogAnalytics$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C00091 extends i implements p {
            int label;
            final /* synthetic */ PostHogAnalytics this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00091(PostHogAnalytics postHogAnalytics, c<? super C00091> cVar) {
                super(2, cVar);
                this.this$0 = postHogAnalytics;
            }

            @Override // yn.a
            public final c<z> create(Object obj, c<?> cVar) {
                return new C00091(this.this$0, cVar);
            }

            @Override // ho.p
            public final Object invoke(d0 d0Var, c<? super z> cVar) {
                return ((C00091) create(d0Var, cVar)).invokeSuspend(z.f31622a);
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
                    ir.i userOrNull = this.this$0.authService.userOrNull();
                    final PostHogAnalytics postHogAnalytics = this.this$0;
                    j jVar = new j() { // from class: io.elevenlabs.analytics.PostHogAnalytics.1.1.1
                        public final Object emit(User user, c<? super z> cVar) {
                            boolean z6;
                            q qVar;
                            q qVar2;
                            q qVar3;
                            q qVar4;
                            PostHogAnalytics postHogAnalytics2 = PostHogAnalytics.this;
                            if (user != null) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            postHogAnalytics2.isSignedIn = z6;
                            if (user == null) {
                                ij.a aVar = ck.b.P0;
                                ck.b bVar = ck.b.Q0;
                                if (bVar.j()) {
                                    bVar.i().c(o.g1(f.K("version", "build")));
                                    y yVar = bVar.F0;
                                    if (yVar != null) {
                                        yVar.a();
                                    }
                                    bVar.H0.clear();
                                    synchronized (bVar.C0) {
                                        bVar.J0 = false;
                                    }
                                    synchronized (bVar.D0) {
                                        bVar.K0 = false;
                                    }
                                    bVar.endSession();
                                    bVar.g();
                                    if (bVar.A0) {
                                        bVar.s(null);
                                    }
                                }
                            } else {
                                ij.a aVar2 = ck.b.P0;
                                String id2 = user.getId();
                                PostHogAnalytics postHogAnalytics3 = PostHogAnalytics.this;
                                un.e eVar = new un.e();
                                eVar.put("device_performance_class", postHogAnalytics3.devicePerformanceMeasurer.measure().getPerformanceClass().getValue());
                                String email = user.getEmail();
                                if (email != null) {
                                    eVar.put("email", email);
                                }
                                un.e b10 = eVar.b();
                                id2.getClass();
                                ck.b bVar2 = ck.b.Q0;
                                bVar2.getClass();
                                id2.getClass();
                                if (bVar2.j() && bVar2.t("identify", false)) {
                                    if (n.m0(id2)) {
                                        dk.b bVar3 = bVar2.f5114e;
                                        if (bVar3 != null && (qVar4 = bVar3.f5100p) != null) {
                                            qVar4.d("identify call not allowed, distinctId is invalid: " + id2 + '.');
                                        }
                                    } else {
                                        String n2 = bVar2.n();
                                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                                        String m10 = bVar2.m();
                                        if (!n.m0(m10)) {
                                            linkedHashMap.put("$anon_distinct_id", m10);
                                        } else {
                                            dk.b bVar4 = bVar2.f5114e;
                                            if (bVar4 != null && (qVar = bVar4.f5100p) != null) {
                                                qVar.d("identify called with invalid anonymousId: " + m10 + '.');
                                            }
                                        }
                                        boolean equals = n2.equals(id2);
                                        if (!equals && !bVar2.q()) {
                                            synchronized (bVar2.C0) {
                                                bVar2.u(true);
                                            }
                                            kd.a.q(bVar2, "$identify", id2, linkedHashMap, b10, null, 96);
                                            if (!n.m0(n2)) {
                                                bVar2.i().a(n2, "anonymousId");
                                            } else {
                                                dk.b bVar5 = bVar2.f5114e;
                                                if (bVar5 != null && (qVar3 = bVar5.f5100p) != null) {
                                                    qVar3.d("identify called with invalid former distinctId: " + n2 + '.');
                                                }
                                            }
                                            bVar2.i().a(id2, "distinctId");
                                            bVar2.w(b10, null);
                                            if (bVar2.A0) {
                                                bVar2.s(null);
                                            }
                                        } else if (equals && (!b10.isEmpty())) {
                                            kd.a.q(bVar2, "$set", id2, null, b10, null, 100);
                                        } else {
                                            dk.b bVar6 = bVar2.f5114e;
                                            if (bVar6 != null && (qVar2 = bVar6.f5100p) != null) {
                                                qVar2.d("already identified with id: " + id2 + '.');
                                            }
                                        }
                                    }
                                }
                            }
                            return z.f31622a;
                        }

                        @Override // ir.j
                        public /* bridge */ /* synthetic */ Object emit(Object obj2, c cVar) {
                            return emit((User) obj2, (c<? super z>) cVar);
                        }
                    };
                    this.label = 1;
                    Object collect = userOrNull.collect(jVar, this);
                    xn.a aVar = xn.a.f37986a;
                    if (collect == aVar) {
                        return aVar;
                    }
                }
                return z.f31622a;
            }
        }

        public AnonymousClass1(c<? super AnonymousClass1> cVar) {
            super(2, cVar);
        }

        @Override // yn.a
        public final c<z> create(Object obj, c<?> cVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(cVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // ho.p
        public final Object invoke(d0 d0Var, c<? super z> cVar) {
            return ((AnonymousClass1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
        }

        @Override // yn.a
        public final Object invokeSuspend(Object obj) {
            d0 d0Var = (d0) this.L$0;
            if (this.label == 0) {
                sn.a.g(obj);
                g0.D(d0Var, null, null, new C00091(PostHogAnalytics.this, null), 3);
                return z.f31622a;
            }
            c6.x("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    public PostHogAnalytics(Logger logger, AuthService authService, DispatcherFactory dispatcherFactory, LocaleService localeService, @ApplicationCoroutineScope d0 d0Var, SingularService singularService, DevicePerformanceMeasurer devicePerformanceMeasurer, FirebaseAnalyticsService firebaseAnalyticsService) {
        logger.getClass();
        authService.getClass();
        dispatcherFactory.getClass();
        localeService.getClass();
        d0Var.getClass();
        singularService.getClass();
        devicePerformanceMeasurer.getClass();
        firebaseAnalyticsService.getClass();
        this.logger = logger;
        this.authService = authService;
        this.localeService = localeService;
        this.coroutineScope = d0Var;
        this.singularService = singularService;
        this.devicePerformanceMeasurer = devicePerformanceMeasurer;
        this.firebaseAnalyticsService = firebaseAnalyticsService;
        g0.D(d0Var, dispatcherFactory.getDefault(), null, new AnonymousClass1(null), 2);
    }

    @Override // io.elevenlabs.domain.Analytics
    public void log(Analytics.Event event) {
        String str;
        event.getClass();
        Logger logger = this.logger;
        String name = event.getName();
        Map<String, Object> properties = event.getProperties();
        Map map = null;
        if (properties != null) {
            ArrayList arrayList = new ArrayList(properties.size());
            for (Map.Entry<String, Object> entry : properties.entrySet()) {
                String key = entry.getKey();
                arrayList.add(((Object) key) + ": " + entry.getValue());
            }
            str = o.E0(arrayList, ", ", null, null, null, 62);
        } else {
            str = null;
        }
        logger.log("Analytics", name + " / " + str);
        Map J = a0.J(new k("Device Language", this.localeService.getLanguage()), new k("reader_global_is_signed_in", Boolean.valueOf(this.isSignedIn)));
        Map<String, Object> properties2 = event.getProperties();
        if (properties2 != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, Object> entry2 : properties2.entrySet()) {
                if (entry2.getValue() != null) {
                    linkedHashMap.put(entry2.getKey(), entry2.getValue());
                }
            }
            map = new LinkedHashMap(a0.H(linkedHashMap.size()));
            for (Map.Entry entry3 : linkedHashMap.entrySet()) {
                Object key2 = entry3.getKey();
                Object value = entry3.getValue();
                value.getClass();
                map.put(key2, value);
            }
        }
        if (map == null) {
            map = u.f33548a;
        }
        kd.a.q(ck.b.P0, event.getName(), null, a0.N(J, map), null, event.getSetOncePersonProperties(), 106);
        this.singularService.event(event);
        if (event instanceof Analytics.Event.ConversionEvent) {
            this.firebaseAnalyticsService.trackConversionEvent(event);
        }
    }
}
