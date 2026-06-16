package io.livekit.android.stats;

import android.content.Context;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.protobuf.c6;
import defpackage.f;
import fr.d0;
import fr.f2;
import fr.g0;
import fr.r0;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;
import mr.d;
import mr.e;
import n0.l;
import wn.h;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000fR\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lio/livekit/android/stats/NetworkMonitor;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "bytes", "", "convertBytesToReadableString", "(J)Ljava/lang/String;", "Lsn/z;", "start", "()V", "stop", "Landroid/content/Context;", "Lwn/h;", "coroutineContext", "Lwn/h;", "Lfr/d0;", "scope", "Lfr/d0;", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class NetworkMonitor {
    private final Context context;
    private h coroutineContext;
    private d0 scope;

    public NetworkMonitor(Context context) {
        context.getClass();
        this.context = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String convertBytesToReadableString(long bytes) {
        String str;
        float f10 = (float) bytes;
        int i10 = 0;
        while (f10 >= 1024.0f && i10 < 2) {
            f10 /= UserMetadata.MAX_ATTRIBUTE_SIZE;
            i10++;
        }
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    str = "MBps";
                } else {
                    c6.x(f.e(i10, "this shouldn't happen. level = "));
                    return null;
                }
            } else {
                str = "kBps";
            }
        } else {
            str = "Bps";
        }
        return f10 + ' ' + str;
    }

    public final void start() {
        f2 f10 = g0.f();
        e eVar = r0.f9888a;
        h J = l.J(f10, d.f23445b);
        this.coroutineContext = J;
        if (J != null) {
            kr.d c5 = g0.c(J);
            this.scope = c5;
            g0.D(c5, null, null, new NetworkMonitor$start$1(this, null), 3);
            return;
        }
        m.i("coroutineContext");
        throw null;
    }

    public final void stop() {
        h hVar = this.coroutineContext;
        if (hVar != null) {
            g0.j(hVar, null);
        } else {
            m.i("coroutineContext");
            throw null;
        }
    }
}
