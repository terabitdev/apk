package io.livekit.android.webrtc.peerconnection;

import android.gov.nist.javax.sip.parser.TokenNames;
import fc.d;
import fr.d1;
import fr.g0;
import fr.z;
import ho.a;
import ho.p;
import ib.i;
import io.elevenlabs.data.worker.SubmitNotificationTokenWorkerBase;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import wn.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000E\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\b\t*\u0001\u0019\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a+\u0010\f\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00072\u0006\u0010\t\u001a\u00020\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0000¢\u0006\u0004\b\f\u0010\r\u001a3\u0010\u000e\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00072\u0006\u0010\t\u001a\u00020\b2\u000e\b\u0004\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0080\bø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001aD\u0010\u0014\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00072\u0006\u0010\t\u001a\u00020\b2\"\u0010\u000b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0010H\u0080@¢\u0006\u0004\b\u0014\u0010\u0015\"\u0014\u0010\u0017\u001a\u00020\u00168\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018\"\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b\"\u001e\u0010\u001d\u001a\n \u001c*\u0004\u0018\u00010\u00000\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e\"\u0016\u0010\u001f\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 \u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006!"}, d2 = {"Ljava/util/concurrent/ExecutorService;", "executorService", "Lfr/z;", "dispatcher", "Lsn/z;", "overrideExecutorAndDispatcher", "(Ljava/util/concurrent/ExecutorService;Lfr/z;)V", TokenNames.T, "Lio/livekit/android/webrtc/peerconnection/RTCThreadToken;", SubmitNotificationTokenWorkerBase.KEY_TOKEN, "Lkotlin/Function0;", "action", "executeOnRTCThread", "(Lio/livekit/android/webrtc/peerconnection/RTCThreadToken;Lho/a;)V", "executeBlockingOnRTCThread", "(Lio/livekit/android/webrtc/peerconnection/RTCThreadToken;Lho/a;)Ljava/lang/Object;", "Lkotlin/Function2;", "Lfr/d0;", "Lwn/c;", "", "launchBlockingOnRTCThread", "(Lio/livekit/android/webrtc/peerconnection/RTCThreadToken;Lho/p;Lwn/c;)Ljava/lang/Object;", "", "RTC_EXECUTOR_THREADNAME_PREFIX", "Ljava/lang/String;", "io/livekit/android/webrtc/peerconnection/RTCThreadUtilsKt$threadFactory$1", "threadFactory", "Lio/livekit/android/webrtc/peerconnection/RTCThreadUtilsKt$threadFactory$1;", "kotlin.jvm.PlatformType", "executor", "Ljava/util/concurrent/ExecutorService;", "rtcDispatcher", "Lfr/z;", "livekit-android-sdk_release"}, k = 2, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class RTCThreadUtilsKt {
    public static final String RTC_EXECUTOR_THREADNAME_PREFIX = "LK_RTC_THREAD";
    private static ExecutorService executor;
    private static z rtcDispatcher;
    private static final RTCThreadUtilsKt$threadFactory$1 threadFactory;

    /* JADX WARN: Type inference failed for: r0v0, types: [io.livekit.android.webrtc.peerconnection.RTCThreadUtilsKt$threadFactory$1, java.util.concurrent.ThreadFactory] */
    static {
        ?? r02 = new ThreadFactory() { // from class: io.livekit.android.webrtc.peerconnection.RTCThreadUtilsKt$threadFactory$1
            private final AtomicInteger idGenerator = new AtomicInteger(0);

            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable r10) {
                r10.getClass();
                Thread thread = new Thread(r10);
                thread.setName("LK_RTC_THREAD_" + this.idGenerator.incrementAndGet());
                return thread;
            }
        };
        threadFactory = r02;
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(r02);
        executor = newSingleThreadExecutor;
        newSingleThreadExecutor.getClass();
        rtcDispatcher = new d1(newSingleThreadExecutor);
    }

    public static /* synthetic */ void a(RTCThreadToken rTCThreadToken, a aVar) {
        executeOnRTCThread$lambda$0(rTCThreadToken, aVar);
    }

    public static final /* synthetic */ ExecutorService access$getExecutor$p() {
        return executor;
    }

    public static final <T> T executeBlockingOnRTCThread(final RTCThreadToken rTCThreadToken, final a aVar) {
        rTCThreadToken.getClass();
        aVar.getClass();
        if (rTCThreadToken.isDisposed()) {
            return null;
        }
        if (i.u(RTC_EXECUTOR_THREADNAME_PREFIX, false)) {
            return (T) aVar.invoke();
        }
        return executor.submit(new Callable() { // from class: io.livekit.android.webrtc.peerconnection.RTCThreadUtilsKt$executeBlockingOnRTCThread$1
            /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Object] */
            @Override // java.util.concurrent.Callable
            public final T call() {
                if (RTCThreadToken.this.isDisposed()) {
                    return null;
                }
                return aVar.invoke();
            }
        }).get();
    }

    public static final <T> void executeOnRTCThread(RTCThreadToken rTCThreadToken, a aVar) {
        rTCThreadToken.getClass();
        aVar.getClass();
        if (rTCThreadToken.isDisposed()) {
            return;
        }
        if (i.u(RTC_EXECUTOR_THREADNAME_PREFIX, false)) {
            aVar.invoke();
        } else {
            executor.submit(new d(rTCThreadToken, aVar, 21));
        }
    }

    public static final void executeOnRTCThread$lambda$0(RTCThreadToken rTCThreadToken, a aVar) {
        rTCThreadToken.getClass();
        aVar.getClass();
        if (rTCThreadToken.isDisposed()) {
            return;
        }
        aVar.invoke();
    }

    public static final <T> Object launchBlockingOnRTCThread(RTCThreadToken rTCThreadToken, p pVar, c<? super T> cVar) {
        return g0.l(new RTCThreadUtilsKt$launchBlockingOnRTCThread$2(rTCThreadToken, pVar, null), cVar);
    }

    public static final void overrideExecutorAndDispatcher(ExecutorService executorService, z zVar) {
        executorService.getClass();
        zVar.getClass();
        executor = executorService;
        rtcDispatcher = zVar;
    }
}
