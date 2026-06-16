package io.livekit.android.room.track.screencapture;

import android.app.Notification;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.gov.nist.javax.sip.header.extensions.ReferencesHeader;
import android.os.IBinder;
import et.d;
import fr.n;
import gg.b;
import io.livekit.android.room.track.screencapture.ScreenCaptureService;
import io.livekit.android.util.LKLog;
import io.livekit.android.util.LoggingLevel;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;
import wn.c;
import xn.a;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b\t\u0010\nJ%\u0010\u000f\u001a\u00020\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012R$\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00138\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR \u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u001c0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\""}, d2 = {"Lio/livekit/android/room/track/screencapture/ScreenCaptureConnection;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lsn/z;", "handleConnect", "()V", "connect", "(Lwn/c;)Ljava/lang/Object;", "", "notificationId", "Landroid/app/Notification;", "notification", "startForeground", "(Ljava/lang/Integer;Landroid/app/Notification;)V", "stop", "Landroid/content/Context;", "", "<set-?>", "isBound", "Z", "()Z", "Lio/livekit/android/room/track/screencapture/ScreenCaptureService;", ReferencesHeader.SERVICE, "Lio/livekit/android/room/track/screencapture/ScreenCaptureService;", "", "Lwn/c;", "queuedConnects", "Ljava/util/Set;", "Landroid/content/ServiceConnection;", "connection", "Landroid/content/ServiceConnection;", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ScreenCaptureConnection {
    private final ServiceConnection connection;
    private final Context context;
    private boolean isBound;
    private final Set<c<z>> queuedConnects;
    private ScreenCaptureService service;

    public ScreenCaptureConnection(Context context) {
        context.getClass();
        this.context = context;
        this.queuedConnects = new LinkedHashSet();
        this.connection = new ServiceConnection() { // from class: io.livekit.android.room.track.screencapture.ScreenCaptureConnection$connection$1
            @Override // android.content.ServiceConnection
            public void onServiceConnected(ComponentName name, IBinder binder) {
                name.getClass();
                binder.getClass();
                LKLog.Companion companion = LKLog.INSTANCE;
                if (LoggingLevel.VERBOSE.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && d.d() > 0) {
                    d.e(null, "Screen capture service is connected", new Object[0]);
                }
                ScreenCaptureConnection.this.service = ((ScreenCaptureService.ScreenCaptureBinder) binder).getThis$0();
                ScreenCaptureConnection.this.handleConnect();
            }

            @Override // android.content.ServiceConnection
            public void onServiceDisconnected(ComponentName name) {
                name.getClass();
                LKLog.Companion companion = LKLog.INSTANCE;
                if (LoggingLevel.VERBOSE.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && d.d() > 0) {
                    d.e(null, "Screen capture service is disconnected", new Object[0]);
                }
                ScreenCaptureConnection.this.isBound = false;
                ScreenCaptureConnection.this.service = null;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleConnect() {
        synchronized (this) {
            try {
                this.isBound = true;
                Iterator<T> it = this.queuedConnects.iterator();
                while (it.hasNext()) {
                    ((c) it.next()).resumeWith(z.f31622a);
                }
                this.queuedConnects.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static /* synthetic */ void startForeground$default(ScreenCaptureConnection screenCaptureConnection, Integer num, Notification notification, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            num = null;
        }
        if ((i10 & 2) != 0) {
            notification = null;
        }
        screenCaptureConnection.startForeground(num, notification);
    }

    public final Object connect(c<? super z> cVar) {
        if (this.isBound) {
            return z.f31622a;
        }
        this.context.bindService(new Intent(this.context, (Class<?>) ScreenCaptureService.class), this.connection, 1);
        n nVar = new n(1, b.V(cVar));
        nVar.t();
        synchronized (this) {
            try {
                if (getIsBound()) {
                    nVar.resumeWith(z.f31622a);
                } else {
                    this.queuedConnects.add(nVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Object s10 = nVar.s();
        if (s10 == a.f37986a) {
            return s10;
        }
        return z.f31622a;
    }

    /* renamed from: isBound, reason: from getter */
    public final boolean getIsBound() {
        return this.isBound;
    }

    public final void startForeground(Integer notificationId, Notification notification) {
        ScreenCaptureService screenCaptureService = this.service;
        if (screenCaptureService != null) {
            screenCaptureService.start(notificationId, notification);
        }
    }

    public final void stop() {
        if (this.isBound) {
            this.context.unbindService(this.connection);
        }
        this.service = null;
        this.isBound = false;
    }
}
