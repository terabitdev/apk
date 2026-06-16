package com.google.android.gms.measurement;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresPermission;
import androidx.annotation.Size;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import androidx.autofill.HintConstants;
import com.google.android.gms.internal.measurement.v0;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import o1.a;
import o1.b;
import o1.c;
import q1.j2;
import q1.s1;
import q1.z2;
import w0.x;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
@Deprecated
/* loaded from: classes4.dex */
public class AppMeasurement {

    /* renamed from: b, reason: collision with root package name */
    public static volatile AppMeasurement f4068b;

    /* renamed from: a, reason: collision with root package name */
    public final c f4069a;

    /* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
    /* loaded from: classes4.dex */
    public static class ConditionalUserProperty {

        @Keep
        public boolean mActive;

        @NonNull
        @Keep
        public String mAppId;

        @Keep
        public long mCreationTimestamp;

        @NonNull
        @Keep
        public String mExpiredEventName;

        @NonNull
        @Keep
        public Bundle mExpiredEventParams;

        @NonNull
        @Keep
        public String mName;

        @NonNull
        @Keep
        public String mOrigin;

        @Keep
        public long mTimeToLive;

        @NonNull
        @Keep
        public String mTimedOutEventName;

        @NonNull
        @Keep
        public Bundle mTimedOutEventParams;

        @NonNull
        @Keep
        public String mTriggerEventName;

        @Keep
        public long mTriggerTimeout;

        @NonNull
        @Keep
        public String mTriggeredEventName;

        @NonNull
        @Keep
        public Bundle mTriggeredEventParams;

        @Keep
        public long mTriggeredTimestamp;

        @NonNull
        @Keep
        public Object mValue;
    }

    public AppMeasurement(s1 s1Var) {
        this.f4069a = new a(s1Var);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @NonNull
    @Keep
    @Deprecated
    @RequiresPermission(allOf = {"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE", "android.permission.WAKE_LOCK"})
    public static AppMeasurement getInstance(@NonNull Context context) {
        if (f4068b == null) {
            synchronized (AppMeasurement.class) {
                if (f4068b == null) {
                    z2 z2Var = (z2) FirebaseAnalytics.class.getDeclaredMethod("getScionFrontendApiImplementation", Context.class, Bundle.class).invoke(null, context, null);
                    if (z2Var != null) {
                        f4068b = new AppMeasurement(z2Var);
                    } else {
                        f4068b = new AppMeasurement(s1.s(context, new v0(0L, 0L, true, null, null), null));
                    }
                }
            }
        }
        return f4068b;
    }

    @Keep
    public void beginAdUnitExposure(@NonNull @Size(min = 1) String str) {
        this.f4069a.g(str);
    }

    @Keep
    public void clearConditionalUserProperty(@NonNull @Size(max = 24, min = 1) String str, @NonNull String str2, @NonNull Bundle bundle) {
        this.f4069a.i(str, str2, bundle);
    }

    @Keep
    public void endAdUnitExposure(@NonNull @Size(min = 1) String str) {
        this.f4069a.f(str);
    }

    @Keep
    public long generateEventId() {
        return this.f4069a.h();
    }

    @NonNull
    @Keep
    public String getAppInstanceId() {
        return this.f4069a.l();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.google.android.gms.measurement.AppMeasurement$ConditionalUserProperty, java.lang.Object] */
    @NonNull
    @Keep
    @WorkerThread
    public List<ConditionalUserProperty> getConditionalUserProperties(@NonNull String str, @NonNull @Size(max = 23, min = 1) String str2) {
        int size;
        List<Bundle> j = this.f4069a.j(str, str2);
        if (j == null) {
            size = 0;
        } else {
            size = j.size();
        }
        ArrayList arrayList = new ArrayList(size);
        for (Bundle bundle : j) {
            ?? obj = new Object();
            x.g(bundle);
            obj.mAppId = (String) j2.e(bundle, "app_id", String.class, null);
            obj.mOrigin = (String) j2.e(bundle, "origin", String.class, null);
            obj.mName = (String) j2.e(bundle, HintConstants.AUTOFILL_HINT_NAME, String.class, null);
            obj.mValue = j2.e(bundle, "value", Object.class, null);
            obj.mTriggerEventName = (String) j2.e(bundle, "trigger_event_name", String.class, null);
            obj.mTriggerTimeout = ((Long) j2.e(bundle, "trigger_timeout", Long.class, 0L)).longValue();
            obj.mTimedOutEventName = (String) j2.e(bundle, "timed_out_event_name", String.class, null);
            obj.mTimedOutEventParams = (Bundle) j2.e(bundle, "timed_out_event_params", Bundle.class, null);
            obj.mTriggeredEventName = (String) j2.e(bundle, "triggered_event_name", String.class, null);
            obj.mTriggeredEventParams = (Bundle) j2.e(bundle, "triggered_event_params", Bundle.class, null);
            obj.mTimeToLive = ((Long) j2.e(bundle, "time_to_live", Long.class, 0L)).longValue();
            obj.mExpiredEventName = (String) j2.e(bundle, "expired_event_name", String.class, null);
            obj.mExpiredEventParams = (Bundle) j2.e(bundle, "expired_event_params", Bundle.class, null);
            obj.mActive = ((Boolean) j2.e(bundle, "active", Boolean.class, Boolean.FALSE)).booleanValue();
            obj.mCreationTimestamp = ((Long) j2.e(bundle, "creation_timestamp", Long.class, 0L)).longValue();
            obj.mTriggeredTimestamp = ((Long) j2.e(bundle, "triggered_timestamp", Long.class, 0L)).longValue();
            arrayList.add(obj);
        }
        return arrayList;
    }

    @NonNull
    @Keep
    public String getCurrentScreenClass() {
        return this.f4069a.d();
    }

    @NonNull
    @Keep
    public String getCurrentScreenName() {
        return this.f4069a.c();
    }

    @NonNull
    @Keep
    public String getGmpAppId() {
        return this.f4069a.m();
    }

    @Keep
    @WorkerThread
    public int getMaxUserProperties(@NonNull @Size(min = 1) String str) {
        return this.f4069a.k(str);
    }

    @NonNull
    @Keep
    @VisibleForTesting
    @WorkerThread
    public Map<String, Object> getUserProperties(@NonNull String str, @NonNull @Size(max = 24, min = 1) String str2, boolean z10) {
        return this.f4069a.n(str, str2, z10);
    }

    @Keep
    public void logEventInternal(@NonNull String str, @NonNull String str2, @NonNull Bundle bundle) {
        this.f4069a.b(str, str2, bundle);
    }

    @Keep
    public void setConditionalUserProperty(@NonNull ConditionalUserProperty conditionalUserProperty) {
        x.g(conditionalUserProperty);
        Bundle bundle = new Bundle();
        String str = conditionalUserProperty.mAppId;
        if (str != null) {
            bundle.putString("app_id", str);
        }
        String str2 = conditionalUserProperty.mOrigin;
        if (str2 != null) {
            bundle.putString("origin", str2);
        }
        String str3 = conditionalUserProperty.mName;
        if (str3 != null) {
            bundle.putString(HintConstants.AUTOFILL_HINT_NAME, str3);
        }
        Object obj = conditionalUserProperty.mValue;
        if (obj != null) {
            j2.c(bundle, obj);
        }
        String str4 = conditionalUserProperty.mTriggerEventName;
        if (str4 != null) {
            bundle.putString("trigger_event_name", str4);
        }
        bundle.putLong("trigger_timeout", conditionalUserProperty.mTriggerTimeout);
        String str5 = conditionalUserProperty.mTimedOutEventName;
        if (str5 != null) {
            bundle.putString("timed_out_event_name", str5);
        }
        Bundle bundle2 = conditionalUserProperty.mTimedOutEventParams;
        if (bundle2 != null) {
            bundle.putBundle("timed_out_event_params", bundle2);
        }
        String str6 = conditionalUserProperty.mTriggeredEventName;
        if (str6 != null) {
            bundle.putString("triggered_event_name", str6);
        }
        Bundle bundle3 = conditionalUserProperty.mTriggeredEventParams;
        if (bundle3 != null) {
            bundle.putBundle("triggered_event_params", bundle3);
        }
        bundle.putLong("time_to_live", conditionalUserProperty.mTimeToLive);
        String str7 = conditionalUserProperty.mExpiredEventName;
        if (str7 != null) {
            bundle.putString("expired_event_name", str7);
        }
        Bundle bundle4 = conditionalUserProperty.mExpiredEventParams;
        if (bundle4 != null) {
            bundle.putBundle("expired_event_params", bundle4);
        }
        bundle.putLong("creation_timestamp", conditionalUserProperty.mCreationTimestamp);
        bundle.putBoolean("active", conditionalUserProperty.mActive);
        bundle.putLong("triggered_timestamp", conditionalUserProperty.mTriggeredTimestamp);
        this.f4069a.e(bundle);
    }

    public AppMeasurement(z2 z2Var) {
        this.f4069a = new b(z2Var);
    }
}
