package io.elevenlabs.readerapp.core;

import android.gov.nist.javax.sip.header.ParameterNames;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import java.util.Map;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ'\u0010\f\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0010\u001a\u00020\u00072\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00158BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lio/elevenlabs/readerapp/core/CrashlyticsLogger;", "", "<init>", "()V", "", ParameterNames.TAG, "message", "Lsn/z;", "log", "(Ljava/lang/String;Ljava/lang/String;)V", "", ParameterNames.CAUSE, "logError", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "", "extras", "setCustomKeys", "(Ljava/util/Map;)V", "userId", "setUserId", "(Ljava/lang/String;)V", "Lcom/google/firebase/crashlytics/FirebaseCrashlytics;", "getCrashlytics", "()Lcom/google/firebase/crashlytics/FirebaseCrashlytics;", "crashlytics", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class CrashlyticsLogger {
    public static final int $stable = 0;

    private final FirebaseCrashlytics getCrashlytics() {
        FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
        firebaseCrashlytics.getClass();
        return firebaseCrashlytics;
    }

    public final void log(String tag, String message) {
        tag.getClass();
        message.getClass();
        getCrashlytics().log(tag + " : " + message);
    }

    public final void logError(String tag, String message, Throwable cause) {
        tag.getClass();
        message.getClass();
        getCrashlytics().log(tag + " : " + message);
        if (cause != null) {
            getCrashlytics().recordException(cause);
        }
    }

    public final void setCustomKeys(Map<String, ? extends Object> extras) {
        extras.getClass();
        for (Map.Entry<String, ? extends Object> entry : extras.entrySet()) {
            getCrashlytics().setCustomKey(entry.getKey(), entry.getValue().toString());
        }
    }

    public final void setUserId(String userId) {
        FirebaseCrashlytics crashlytics = getCrashlytics();
        if (userId == null) {
            userId = "";
        }
        crashlytics.setUserId(userId);
    }
}
