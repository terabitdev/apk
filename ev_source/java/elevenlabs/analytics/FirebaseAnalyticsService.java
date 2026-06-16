package io.elevenlabs.analytics;

import a2.m;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import android.os.Bundle;
import com.google.firebase.Firebase;
import com.google.firebase.analytics.AnalyticsKt;
import com.google.firebase.analytics.FirebaseAnalytics;
import ib.i;
import io.elevenlabs.domain.Analytics;
import io.elevenlabs.domain.Logger;
import java.util.Map;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.h;
import sn.o;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\t\u001a\u00020\b*\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00078\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0018\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lio/elevenlabs/analytics/FirebaseAnalyticsService;", "", "Lio/elevenlabs/domain/Logger;", "logger", "<init>", "(Lio/elevenlabs/domain/Logger;)V", "", "", "Landroid/os/Bundle;", "toBundle", "(Ljava/util/Map;)Landroid/os/Bundle;", "Lio/elevenlabs/domain/Analytics$Event;", "event", "Lsn/z;", "trackConversionEvent", "(Lio/elevenlabs/domain/Analytics$Event;)V", "Lio/elevenlabs/domain/Logger;", ParameterNames.TAG, "Ljava/lang/String;", "Lcom/google/firebase/analytics/FirebaseAnalytics;", "firebaseAnalytics$delegate", "Lsn/h;", "getFirebaseAnalytics", "()Lcom/google/firebase/analytics/FirebaseAnalytics;", "firebaseAnalytics", "analytics_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class FirebaseAnalyticsService {

    /* renamed from: firebaseAnalytics$delegate, reason: from kotlin metadata */
    private final h firebaseAnalytics;
    private final Logger logger;
    private final String tag;

    public FirebaseAnalyticsService(Logger logger) {
        logger.getClass();
        this.logger = logger;
        this.tag = "FirebaseAnalytics";
        this.firebaseAnalytics = new o(new m(27));
    }

    public static /* synthetic */ FirebaseAnalytics a() {
        return firebaseAnalytics_delegate$lambda$0();
    }

    public static final FirebaseAnalytics firebaseAnalytics_delegate$lambda$0() {
        return AnalyticsKt.getAnalytics(Firebase.INSTANCE);
    }

    private final FirebaseAnalytics getFirebaseAnalytics() {
        return (FirebaseAnalytics) this.firebaseAnalytics.getValue();
    }

    private final Bundle toBundle(Map<String, ? extends Object> map) {
        Bundle bundle = new Bundle();
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof String) {
                bundle.putString(key, (String) value);
            } else if (value instanceof Double) {
                bundle.putDouble(key, ((Number) value).doubleValue());
            } else if (value instanceof Long) {
                bundle.putLong(key, ((Number) value).longValue());
            } else if (value instanceof Boolean) {
                bundle.putBoolean(key, ((Boolean) value).booleanValue());
            } else if (value instanceof Integer) {
                bundle.putInt(key, ((Number) value).intValue());
            }
        }
        return bundle;
    }

    public final void trackConversionEvent(Analytics.Event event) {
        Bundle bundle;
        event.getClass();
        i.r("Tracking conversion event: ", event.getName(), this.logger, this.tag);
        try {
            FirebaseAnalytics firebaseAnalytics = getFirebaseAnalytics();
            String name = event.getName();
            Map<String, Object> properties = event.getProperties();
            if (properties != null) {
                bundle = toBundle(properties);
            } else {
                bundle = null;
            }
            firebaseAnalytics.logEvent(name, bundle);
        } catch (Exception e10) {
            this.logger.log(this.tag, "Failed to track conversion event: " + event.getName() + Separators.SP + e10);
        }
    }
}
