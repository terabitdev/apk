package io.livekit.android.util;

import et.d;
import ho.a;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lio/livekit/android/util/LKLog;", "", "()V", "Companion", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class LKLog {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static LoggingLevel loggingLevel = LoggingLevel.OFF;

    public static final void d(Throwable th) {
        INSTANCE.d(th);
    }

    public static final void e(Throwable th) {
        INSTANCE.e(th);
    }

    public static final void i(Throwable th) {
        INSTANCE.i(th);
    }

    public static final void v(Throwable th) {
        INSTANCE.v(th);
    }

    public static final void w(Throwable th) {
        INSTANCE.w(th);
    }

    public static final void wtf(Throwable th) {
        INSTANCE.wtf(th);
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0087\bø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\n\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0087\b¢\u0006\u0004\b\n\u0010\fJ-\u0010\r\u001a\u00020\t2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0087\bø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000bJ\u001a\u0010\r\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0087\b¢\u0006\u0004\b\r\u0010\fJ-\u0010\u000e\u001a\u00020\t2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0087\b¢\u0006\u0004\b\u000e\u0010\fJ-\u0010\u000f\u001a\u00020\t2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0087\b¢\u0006\u0004\b\u000f\u0010\fJ-\u0010\u0010\u001a\u00020\t2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u000bJ\u001a\u0010\u0010\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0087\b¢\u0006\u0004\b\u0010\u0010\fJ-\u0010\u0011\u001a\u00020\t2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u000bJ\u001a\u0010\u0011\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0087\b¢\u0006\u0004\b\u0011\u0010\fJ)\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u00122\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\t0\u0006H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016R\"\u0010\u0013\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001c"}, d2 = {"Lio/livekit/android/util/LKLog$Companion;", "", "<init>", "()V", "", "t", "Lkotlin/Function0;", "", "message", "Lsn/z;", "v", "(Ljava/lang/Throwable;Lho/a;)V", "(Ljava/lang/Throwable;)V", "d", "i", "w", "e", "wtf", "Lio/livekit/android/util/LoggingLevel;", "loggingLevel", "block", "log", "(Lio/livekit/android/util/LoggingLevel;Lho/a;)V", "Lio/livekit/android/util/LoggingLevel;", "getLoggingLevel", "()Lio/livekit/android/util/LoggingLevel;", "setLoggingLevel", "(Lio/livekit/android/util/LoggingLevel;)V", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public static /* synthetic */ void d$default(Companion companion, Throwable th, a aVar, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                th = null;
            }
            aVar.getClass();
            if (LoggingLevel.DEBUG.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && d.d() > 0) {
                d.a(th, (String) aVar.invoke(), new Object[0]);
            }
        }

        public static /* synthetic */ void e$default(Companion companion, Throwable th, a aVar, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                th = null;
            }
            aVar.getClass();
            if (LoggingLevel.ERROR.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && d.d() > 0) {
                d.b(th, (String) aVar.invoke(), new Object[0]);
            }
        }

        public static /* synthetic */ void i$default(Companion companion, Throwable th, a aVar, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                th = null;
            }
            aVar.getClass();
            if (LoggingLevel.INFO.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && d.d() > 0) {
                d.c(th, (String) aVar.invoke(), new Object[0]);
            }
        }

        public static /* synthetic */ void v$default(Companion companion, Throwable th, a aVar, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                th = null;
            }
            aVar.getClass();
            if (LoggingLevel.VERBOSE.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && d.d() > 0) {
                d.e(th, (String) aVar.invoke(), new Object[0]);
            }
        }

        public static /* synthetic */ void w$default(Companion companion, Throwable th, a aVar, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                th = null;
            }
            aVar.getClass();
            if (LoggingLevel.WARN.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && d.d() > 0) {
                d.f(th, (String) aVar.invoke(), new Object[0]);
            }
        }

        public static void wtf$default(Companion companion, Throwable th, a aVar, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                th = null;
            }
            aVar.getClass();
            if (LoggingLevel.WTF.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && d.d() > 0) {
                d.f8623c.p(th, (String) aVar.invoke(), new Object[0]);
            }
        }

        public final void d(Throwable t10, a message) {
            message.getClass();
            if (LoggingLevel.DEBUG.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && d.d() > 0) {
                d.a(t10, (String) message.invoke(), new Object[0]);
            }
        }

        public final void e(Throwable t10, a message) {
            message.getClass();
            if (LoggingLevel.ERROR.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && d.d() > 0) {
                d.b(t10, (String) message.invoke(), new Object[0]);
            }
        }

        public final LoggingLevel getLoggingLevel() {
            return LKLog.loggingLevel;
        }

        public final void i(Throwable t10, a message) {
            message.getClass();
            if (LoggingLevel.INFO.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && d.d() > 0) {
                d.c(t10, (String) message.invoke(), new Object[0]);
            }
        }

        public final void log(LoggingLevel loggingLevel, a block) {
            loggingLevel.getClass();
            block.getClass();
            if (loggingLevel.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && d.d() > 0) {
                block.invoke();
            }
        }

        public final void setLoggingLevel(LoggingLevel loggingLevel) {
            loggingLevel.getClass();
            LKLog.loggingLevel = loggingLevel;
        }

        public final void v(Throwable t10, a message) {
            message.getClass();
            if (LoggingLevel.VERBOSE.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && d.d() > 0) {
                d.e(t10, (String) message.invoke(), new Object[0]);
            }
        }

        public final void w(Throwable t10, a message) {
            message.getClass();
            if (LoggingLevel.WARN.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && d.d() > 0) {
                d.f(t10, (String) message.invoke(), new Object[0]);
            }
        }

        public final void wtf(Throwable t10, a message) {
            message.getClass();
            if (LoggingLevel.WTF.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && d.d() > 0) {
                d.f8623c.p(t10, (String) message.invoke(), new Object[0]);
            }
        }

        private Companion() {
        }

        public final void d(Throwable t10) {
            if (LoggingLevel.DEBUG.compareTo(LKLog.INSTANCE.getLoggingLevel()) < 0 || d.d() <= 0) {
                return;
            }
            d.f8623c.a(t10);
        }

        public final void e(Throwable t10) {
            if (LoggingLevel.ERROR.compareTo(LKLog.INSTANCE.getLoggingLevel()) < 0 || d.d() <= 0) {
                return;
            }
            d.f8623c.c(t10);
        }

        public final void i(Throwable t10) {
            if (LoggingLevel.INFO.compareTo(LKLog.INSTANCE.getLoggingLevel()) < 0 || d.d() <= 0) {
                return;
            }
            d.f8623c.f(t10);
        }

        public final void v(Throwable t10) {
            if (LoggingLevel.VERBOSE.compareTo(LKLog.INSTANCE.getLoggingLevel()) < 0 || d.d() <= 0) {
                return;
            }
            d.f8623c.k(t10);
        }

        public final void w(Throwable t10) {
            if (LoggingLevel.WARN.compareTo(LKLog.INSTANCE.getLoggingLevel()) < 0 || d.d() <= 0) {
                return;
            }
            d.f8623c.m(t10);
        }

        public final void wtf(Throwable t10) {
            if (LoggingLevel.WTF.compareTo(LKLog.INSTANCE.getLoggingLevel()) < 0 || d.d() <= 0) {
                return;
            }
            d.f8623c.o(t10);
        }
    }

    public static final void d(Throwable th, a aVar) {
        INSTANCE.d(th, aVar);
    }

    public static final void e(Throwable th, a aVar) {
        INSTANCE.e(th, aVar);
    }

    public static final void i(Throwable th, a aVar) {
        INSTANCE.i(th, aVar);
    }

    public static final void v(Throwable th, a aVar) {
        INSTANCE.v(th, aVar);
    }

    public static final void w(Throwable th, a aVar) {
        INSTANCE.w(th, aVar);
    }

    public static final void wtf(Throwable th, a aVar) {
        INSTANCE.wtf(th, aVar);
    }
}
