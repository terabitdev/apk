package io.livekit.android.dagger;

import defpackage.f;
import et.d;
import io.livekit.android.LiveKit;
import io.livekit.android.util.LKLog;
import io.livekit.android.util.LoggingLevel;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import livekit.org.webrtc.Loggable;
import livekit.org.webrtc.Logging;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002\u000e\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "kotlin.jvm.PlatformType", "s", "Llivekit/org/webrtc/Logging$Severity;", "severity", "s2", "Lsn/z;", "onLogMessage", "(Ljava/lang/String;Llivekit/org/webrtc/Logging$Severity;Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class RTCModule$libWebrtcInitialization$1$1 implements Loggable {
    public static final RTCModule$libWebrtcInitialization$1$1 INSTANCE = new RTCModule$libWebrtcInitialization$1$1();

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Logging.Severity.values().length];
            try {
                iArr[Logging.Severity.LS_VERBOSE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Logging.Severity.LS_INFO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Logging.Severity.LS_WARNING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Logging.Severity.LS_ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // livekit.org.webrtc.Loggable
    public final void onLogMessage(String str, Logging.Severity severity, String str2) {
        int i10;
        LoggingLevel loggingLevel;
        if (LiveKit.getEnableWebRTCLogging()) {
            if (severity == null) {
                i10 = -1;
            } else {
                i10 = WhenMappings.$EnumSwitchMapping$0[severity.ordinal()];
            }
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            loggingLevel = LoggingLevel.OFF;
                        } else {
                            loggingLevel = LoggingLevel.ERROR;
                        }
                    } else {
                        loggingLevel = LoggingLevel.WARN;
                    }
                } else {
                    loggingLevel = LoggingLevel.INFO;
                }
            } else {
                loggingLevel = LoggingLevel.VERBOSE;
            }
            if (loggingLevel.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && d.d() > 0) {
                d.f8623c.i(loggingLevel.toAndroidLogPriority(), f.j(str2, ": ", str), new Object[0]);
            }
        }
    }
}
