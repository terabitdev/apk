package io.elevenlabs.readerapp.di;

import android.os.Looper;
import com.google.protobuf.c6;
import fr.d0;
import fr.g0;
import kotlin.Metadata;
import kr.d;
import livekit.LivekitInternal$NodeStats;
import pl.h;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lio/elevenlabs/readerapp/di/ActivityRetainedCoroutinesModule;", "", "<init>", "()V", "Lll/a;", "activityRetainedLifecycle", "Lfr/d0;", "activityRetainedCoroutineScope", "(Lll/a;)Lfr/d0;", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class ActivityRetainedCoroutinesModule {
    public static final int $stable = 0;
    public static final ActivityRetainedCoroutinesModule INSTANCE = new ActivityRetainedCoroutinesModule();

    private ActivityRetainedCoroutinesModule() {
    }

    public final d0 activityRetainedCoroutineScope(ll.a activityRetainedLifecycle) {
        activityRetainedLifecycle.getClass();
        d e10 = g0.e();
        a aVar = new a(e10);
        h hVar = (h) activityRetainedLifecycle;
        if (a.a.f684a == null) {
            a.a.f684a = Looper.getMainLooper().getThread();
        }
        if (Thread.currentThread() == a.a.f684a) {
            if (!hVar.f26710b) {
                hVar.f26709a.add(aVar);
                return e10;
            }
            c6.x("There was a race between the call to add/remove an OnClearedListener and onCleared(). This can happen when posting to the Main thread from a background thread, which is not supported.");
            return null;
        }
        c6.x("Must be called on the Main thread.");
        return null;
    }
}
