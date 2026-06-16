package io.elevenlabs.analytics;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.gov.nist.javax.sip.header.ParameterNames;
import android.util.Log;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.protobuf.c6;
import defpackage.f;
import fr.d0;
import fr.g0;
import fr.k1;
import hr.j;
import hr.n;
import io.elevenlabs.domain.Analytics;
import io.elevenlabs.domain.ApplicationCoroutineScope;
import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.services.AdAttributionService;
import io.elevenlabs.domain.services.AuthService;
import io.elevenlabs.domain.services.CustomerService;
import io.elevenlabs.domain.services.SingularService;
import io.livekit.android.room.SignalClient;
import ir.i;
import ir.r;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;
import qk.c;
import rk.q0;
import rk.w0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 T2\u00020\u0001:\u0001TBI\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!J%\u0010&\u001a\u00020\u001b2\u0014\u0010%\u001a\u0010\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$\u0018\u00010\"H\u0002¢\u0006\u0004\b&\u0010'J\u001b\u0010)\u001a\u0004\u0018\u00010#2\b\u0010(\u001a\u0004\u0018\u00010$H\u0002¢\u0006\u0004\b)\u0010*J\u0017\u0010-\u001a\u00020\u001b2\u0006\u0010,\u001a\u00020+H\u0002¢\u0006\u0004\b-\u0010.J\u0017\u00100\u001a\u00020\u001b2\u0006\u0010/\u001a\u00020$H\u0016¢\u0006\u0004\b0\u00101J\u001f\u00102\u001a\u00020\u001b2\u0006\u0010/\u001a\u00020$2\u0006\u0010\u0016\u001a\u00020$H\u0016¢\u0006\u0004\b2\u00103J\u0017\u00105\u001a\u00020\u001b2\u0006\u00105\u001a\u000204H\u0016¢\u0006\u0004\b5\u00106R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00107R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00108R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00109R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010:R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010;R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010<R\u0014\u0010=\u001a\u00020#8\u0002X\u0082D¢\u0006\u0006\n\u0004\b=\u0010>R\u001a\u0010@\u001a\b\u0012\u0004\u0012\u00020#0?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR \u0010C\u001a\b\u0012\u0004\u0012\u00020#0B8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR\"\u0010H\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010G0B8\u0002X\u0082\u0004¢\u0006\f\n\u0004\bH\u0010D\u0012\u0004\bI\u0010JR\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010KR\u0018\u0010M\u001a\u0004\u0018\u00010L8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010NR\u0018\u0010P\u001a\u0004\u0018\u00010O8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010QR\u0016\u0010R\u001a\u00020+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010S¨\u0006U"}, d2 = {"Lio/elevenlabs/analytics/SingularServiceImpl;", "Lio/elevenlabs/domain/services/SingularService;", "Lio/elevenlabs/domain/Logger;", "logger", "Lio/elevenlabs/domain/services/AuthService;", "authService", "Lio/elevenlabs/domain/DispatcherFactory;", "dispatcherFactory", "Lfr/d0;", "coroutineScope", "Lio/elevenlabs/domain/services/CustomerService;", "customerService", "Ljl/a;", "Lio/elevenlabs/domain/Analytics;", "analytics", "Lio/elevenlabs/domain/services/AdAttributionService;", "adAttributionService", "<init>", "(Lio/elevenlabs/domain/Logger;Lio/elevenlabs/domain/services/AuthService;Lio/elevenlabs/domain/DispatcherFactory;Lfr/d0;Lio/elevenlabs/domain/services/CustomerService;Ljl/a;Lio/elevenlabs/domain/services/AdAttributionService;)V", "Landroid/content/Context;", "appContext", "Landroid/content/Intent;", "intent", "Lqk/b;", "buildEarlyConfig", "(Landroid/content/Context;Landroid/content/Intent;)Lqk/b;", "singularConfig", "Lsn/z;", "initSingular", "(Landroid/content/Context;Landroid/content/Intent;Lqk/b;)V", "Lqk/c;", "singularLinkParams", "handleLink", "(Lqk/c;)V", "", "", "", "attributionData", "handleDeviceAttribution", "(Ljava/util/Map;)V", "value", "sanitizedString", "(Ljava/lang/Object;)Ljava/lang/String;", "", "isUserLoggedIn", "resumeStopAllTracking", "(Z)V", "activity", "initialize", "(Ljava/lang/Object;)V", "reInitializeWithNewIntent", "(Ljava/lang/Object;Ljava/lang/Object;)V", "Lio/elevenlabs/domain/Analytics$Event;", "event", "(Lio/elevenlabs/domain/Analytics$Event;)V", "Lio/elevenlabs/domain/Logger;", "Lio/elevenlabs/domain/DispatcherFactory;", "Lfr/d0;", "Lio/elevenlabs/domain/services/CustomerService;", "Ljl/a;", "Lio/elevenlabs/domain/services/AdAttributionService;", ParameterNames.TAG, "Ljava/lang/String;", "Lhr/n;", "deepLinkChannel", "Lhr/n;", "Lir/i;", "deepLinkFlow", "Lir/i;", "getDeepLinkFlow", "()Lir/i;", "Lio/elevenlabs/domain/model/Customer;", "signedInUser", "getSignedInUser$annotations", "()V", "Lqk/b;", "", "currentIntentHash", "Ljava/lang/Integer;", "Lfr/k1;", "job", "Lfr/k1;", "hasSeenSignedInUser", "Z", "Companion", "analytics_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class SingularServiceImpl implements SingularService {
    private static final String ORGANIC_NETWORK_VALUE = "organic";
    private final AdAttributionService adAttributionService;
    private final jl.a analytics;
    private final d0 coroutineScope;
    private Integer currentIntentHash;
    private final CustomerService customerService;
    private final n deepLinkChannel;
    private final i deepLinkFlow;
    private final DispatcherFactory dispatcherFactory;
    private boolean hasSeenSignedInUser;
    private k1 job;
    private final Logger logger;
    private final i signedInUser;
    private qk.b singularConfig;
    private final String tag;

    public SingularServiceImpl(Logger logger, AuthService authService, DispatcherFactory dispatcherFactory, @ApplicationCoroutineScope d0 d0Var, CustomerService customerService, jl.a aVar, AdAttributionService adAttributionService) {
        logger.getClass();
        authService.getClass();
        dispatcherFactory.getClass();
        d0Var.getClass();
        customerService.getClass();
        aVar.getClass();
        adAttributionService.getClass();
        this.logger = logger;
        this.dispatcherFactory = dispatcherFactory;
        this.coroutineScope = d0Var;
        this.customerService = customerService;
        this.analytics = aVar;
        this.adAttributionService = adAttributionService;
        this.tag = "SingularService";
        j b10 = kd.a.b(0, 7, null);
        this.deepLinkChannel = b10;
        this.deepLinkFlow = r.B(b10);
        this.signedInUser = r.o(r.G(authService.isSignedIn(), new SingularServiceImpl$special$$inlined$flatMapLatest$1(null, this)));
    }

    private final qk.b buildEarlyConfig(Context appContext, Intent intent) {
        SingularConfigData fromMetadata = SingularConfigData.INSTANCE.fromMetadata(appContext);
        qk.b bVar = new qk.b(fromMetadata.getApiKey(), fromMetadata.getSecret());
        bVar.f28600f = true;
        bVar.f28601g = 4;
        bVar.b(intent, new b(this, 1));
        bVar.f28604j = new b(this, 2);
        return bVar;
    }

    public static final void buildEarlyConfig$lambda$0(SingularServiceImpl singularServiceImpl, c cVar) {
        cVar.getClass();
        singularServiceImpl.handleLink(cVar);
    }

    public static /* synthetic */ void c(SingularServiceImpl singularServiceImpl, HashMap hashMap) {
        singularServiceImpl.handleDeviceAttribution(hashMap);
    }

    public final void handleDeviceAttribution(Map<String, ? extends Object> attributionData) {
        Object obj;
        Object obj2;
        Object obj3 = null;
        if (attributionData != null) {
            obj = attributionData.get(SignalClient.CONNECT_QUERY_NETWORK_TYPE);
        } else {
            obj = null;
        }
        String sanitizedString = sanitizedString(obj);
        if (attributionData != null) {
            obj2 = attributionData.get("campaign");
        } else {
            obj2 = null;
        }
        String sanitizedString2 = sanitizedString(obj2);
        if (attributionData != null) {
            obj3 = attributionData.get(FirebaseAnalytics.Param.CAMPAIGN_ID);
        }
        String sanitizedString3 = sanitizedString(obj3);
        if (sanitizedString != null && !sanitizedString.equalsIgnoreCase(ORGANIC_NETWORK_VALUE)) {
            if (!this.adAttributionService.recordArrivedFromAd()) {
                return;
            }
            ((Analytics) this.analytics.get()).log(new Analytics.Event.SingularAdAttributionRecorded(sanitizedString, sanitizedString2, sanitizedString3));
            return;
        }
        ((Analytics) this.analytics.get()).log(new Analytics.Event.SingularOrganicAttributionRecorded(sanitizedString, sanitizedString2, sanitizedString3));
    }

    private final void handleLink(c singularLinkParams) {
        String str = singularLinkParams.f28611a;
        String str2 = singularLinkParams.f28612b;
        this.logger.log(this.tag, f.k("singular handling deep link ", str, " with passthrough: ", str2));
        g0.D(this.coroutineScope, null, null, new SingularServiceImpl$handleLink$1(str2, this, str, null), 3);
    }

    private final void initSingular(Context appContext, Intent intent, qk.b singularConfig) {
        try {
            qk.a.a(appContext, singularConfig);
            this.singularConfig = singularConfig;
            this.currentIntentHash = Integer.valueOf(intent.hashCode());
            this.logger.log(this.tag, "initSingular - Singular.init() called");
        } catch (Exception e10) {
            this.logger.logError(this.tag, "Failed to initialize Singular", e10);
        }
    }

    public static final void reInitializeWithNewIntent$lambda$2(SingularServiceImpl singularServiceImpl, c cVar) {
        cVar.getClass();
        singularServiceImpl.handleLink(cVar);
    }

    public final void resumeStopAllTracking(boolean isUserLoggedIn) {
        boolean z6;
        boolean z10 = false;
        if (!isUserLoggedIn) {
            if (qk.a.b()) {
                z10 = qk.a.f28593b.b().getBoolean("stop_all_tracking", false);
            }
            if (!z10 && qk.a.b()) {
                q0 q0Var = qk.a.f28593b;
                q0Var.getClass();
                q0Var.e(new la.b(q0Var, true));
                return;
            }
            return;
        }
        if (!qk.a.b()) {
            z6 = false;
        } else {
            z6 = qk.a.f28593b.b().getBoolean("stop_all_tracking", false);
        }
        if (z6 && qk.a.b()) {
            q0 q0Var2 = qk.a.f28593b;
            q0Var2.getClass();
            q0Var2.e(new la.b(q0Var2, false));
        }
    }

    private final String sanitizedString(Object value) {
        String str;
        if (value instanceof String) {
            str = (String) value;
        } else {
            str = null;
        }
        if (str == null || wq.n.m0(str)) {
            return null;
        }
        return str;
    }

    @Override // io.elevenlabs.domain.services.SingularService
    public void event(Analytics.Event event) {
        int i10;
        event.getClass();
        String name = event.getName();
        a8.a aVar = qk.a.f28592a;
        try {
            if (!qk.a.b()) {
                return;
            }
            if (w0.k(name)) {
                aVar.d("Event name can not be null or empty");
                return;
            }
            q0 q0Var = qk.a.f28593b;
            q0Var.getClass();
            if (name != null) {
                i10 = name.length();
            } else {
                i10 = 0;
            }
            if (i10 > 3746) {
                Object[] objArr = {Integer.valueOf(i10)};
                if (a8.a.l(3)) {
                    String format = String.format("Event discarded! payload length = %d", objArr);
                    Log.d("Singular", "Instance [" + (Thread.currentThread().getName()) + "] - " + format);
                    return;
                }
                return;
            }
            q0Var.d(new d4.b(name, (String) null));
        } catch (Throwable th) {
            aVar.d(w0.c(th));
        }
    }

    @Override // io.elevenlabs.domain.services.SingularService
    public i getDeepLinkFlow() {
        return this.deepLinkFlow;
    }

    @Override // io.elevenlabs.domain.services.SingularService
    public void initialize(Object activity) {
        activity.getClass();
        this.logger.log(this.tag, "initializing Singular in response to Activity creation");
        if (activity instanceof Activity) {
            Activity activity2 = (Activity) activity;
            Context applicationContext = activity2.getApplicationContext();
            Intent intent = activity2.getIntent();
            applicationContext.getClass();
            intent.getClass();
            initSingular(applicationContext, intent, buildEarlyConfig(applicationContext, intent));
            k1 k1Var = this.job;
            if (k1Var != null) {
                k1Var.cancel((CancellationException) null);
            }
            this.job = g0.D(this.coroutineScope, this.dispatcherFactory.getDefault(), null, new SingularServiceImpl$initialize$2(this, null), 2);
            return;
        }
        c6.v(new IllegalArgumentException("Activity must be an Android Activity"));
    }

    @Override // io.elevenlabs.domain.services.SingularService
    public void reInitializeWithNewIntent(Object activity, Object intent) {
        activity.getClass();
        intent.getClass();
        this.logger.log(this.tag, "handling singular intent");
        if (intent instanceof Intent) {
            if (activity instanceof Activity) {
                Intent intent2 = (Intent) intent;
                if (m.c(intent2.getAction(), "android.intent.action.VIEW") && intent2.getData() != null) {
                    int hashCode = intent.hashCode();
                    Integer num = this.currentIntentHash;
                    if (num == null || hashCode != num.intValue()) {
                        qk.b bVar = this.singularConfig;
                        Logger logger = this.logger;
                        String str = this.tag;
                        if (bVar == null) {
                            logger.log(str, "initialize()'s initSingular() still not issued or user logged out");
                            return;
                        }
                        logger.log(str, "singular deep link:  " + intent2.getData());
                        bVar.b(intent2, new b(this, 0));
                        Context applicationContext = ((Activity) activity).getApplicationContext();
                        applicationContext.getClass();
                        initSingular(applicationContext, intent2, bVar);
                        return;
                    }
                    return;
                }
                return;
            }
            c6.v(new IllegalArgumentException("Activity must be an Android Activity"));
            return;
        }
        c6.v(new IllegalArgumentException("Intent must be an Android Intent"));
    }

    private static /* synthetic */ void getSignedInUser$annotations() {
    }
}
