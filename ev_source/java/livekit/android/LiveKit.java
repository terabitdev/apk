package io.livekit.android;

import android.app.Application;
import android.content.Context;
import com.google.protobuf.c6;
import et.b;
import et.c;
import et.d;
import io.livekit.android.dagger.DaggerLiveKitComponent;
import io.livekit.android.dagger.LiveKitComponent;
import io.livekit.android.dagger.LiveKitComponentKt;
import io.livekit.android.dagger.RTCModule;
import io.livekit.android.room.Room;
import io.livekit.android.util.LKLog;
import io.livekit.android.util.LoggingLevel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fR(\u0010\u0011\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0011\u0010\u0012\u0012\u0004\b\u0017\u0010\u0003\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R*\u0010\u001f\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00188F@FX\u0087\u000e¢\u0006\u0012\u0012\u0004\b\u001e\u0010\u0003\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006 "}, d2 = {"Lio/livekit/android/LiveKit;", "", "<init>", "()V", "Landroid/content/Context;", "appContext", "Lsn/z;", "init", "(Landroid/content/Context;)V", "Lio/livekit/android/RoomOptions;", "options", "Lio/livekit/android/LiveKitOverrides;", "overrides", "Lio/livekit/android/room/Room;", "create", "(Landroid/content/Context;Lio/livekit/android/RoomOptions;Lio/livekit/android/LiveKitOverrides;)Lio/livekit/android/room/Room;", "", "enableWebRTCLogging", "Z", "getEnableWebRTCLogging", "()Z", "setEnableWebRTCLogging", "(Z)V", "getEnableWebRTCLogging$annotations", "Lio/livekit/android/util/LoggingLevel;", "value", "getLoggingLevel", "()Lio/livekit/android/util/LoggingLevel;", "setLoggingLevel", "(Lio/livekit/android/util/LoggingLevel;)V", "getLoggingLevel$annotations", "loggingLevel", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class LiveKit {
    public static final LiveKit INSTANCE = new LiveKit();
    private static boolean enableWebRTCLogging;

    private LiveKit() {
    }

    public static /* synthetic */ Room create$default(LiveKit liveKit, Context context, RoomOptions roomOptions, LiveKitOverrides liveKitOverrides, int i10, Object obj) {
        LiveKitOverrides liveKitOverrides2;
        if ((i10 & 2) != 0) {
            roomOptions = new RoomOptions(false, false, null, null, null, null, null, null, null, 511, null);
        }
        if ((i10 & 4) != 0) {
            liveKitOverrides2 = new LiveKitOverrides(null, null, null, null, null, null, 63, null);
        } else {
            liveKitOverrides2 = liveKitOverrides;
        }
        return liveKit.create(context, roomOptions, liveKitOverrides2);
    }

    public static final boolean getEnableWebRTCLogging() {
        return enableWebRTCLogging;
    }

    public static final LoggingLevel getLoggingLevel() {
        return LKLog.INSTANCE.getLoggingLevel();
    }

    public static final void setEnableWebRTCLogging(boolean z6) {
        enableWebRTCLogging = z6;
    }

    public static final void setLoggingLevel(LoggingLevel loggingLevel) {
        List unmodifiableList;
        loggingLevel.getClass();
        LKLog.INSTANCE.setLoggingLevel(loggingLevel);
        if (loggingLevel != LoggingLevel.OFF) {
            ArrayList arrayList = d.f8621a;
            synchronized (arrayList) {
                unmodifiableList = Collections.unmodifiableList(new ArrayList(arrayList));
            }
            unmodifiableList.getClass();
            if (!unmodifiableList.isEmpty()) {
                Iterator it = unmodifiableList.iterator();
                while (it.hasNext()) {
                    if (((c) it.next()) instanceof b) {
                        return;
                    }
                }
            }
            c cVar = new c();
            if (cVar != d.f8623c) {
                ArrayList arrayList2 = d.f8621a;
                synchronized (arrayList2) {
                    arrayList2.add(cVar);
                    d.f8622b = (c[]) arrayList2.toArray(new c[arrayList2.size()]);
                }
                return;
            }
            c6.t("Cannot plant Timber into itself.");
        }
    }

    public final Room create(Context appContext, RoomOptions options, LiveKitOverrides overrides) {
        appContext.getClass();
        options.getClass();
        overrides.getClass();
        Context applicationContext = appContext.getApplicationContext();
        if (!(applicationContext instanceof Application)) {
            LKLog.Companion companion = LKLog.INSTANCE;
            if (LoggingLevel.WARN.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && d.d() > 0) {
                d.f(null, "Application context was not found, this may cause memory leaks.", new Object[0]);
            }
        }
        LiveKitComponent.Factory factory = DaggerLiveKitComponent.factory();
        factory.getClass();
        applicationContext.getClass();
        Room create = LiveKitComponentKt.create(factory, applicationContext, overrides).roomFactory().create(applicationContext);
        create.setRoomOptions(options);
        return create;
    }

    public final void init(Context appContext) {
        appContext.getClass();
        RTCModule.INSTANCE.libWebrtcInitialization(appContext);
    }

    public static /* synthetic */ void getEnableWebRTCLogging$annotations() {
    }

    public static /* synthetic */ void getLoggingLevel$annotations() {
    }
}
