package io.livekit.android.dagger;

import fr.r0;
import fr.y1;
import fr.z;
import kotlin.Metadata;
import kr.o;
import livekit.LivekitInternal$NodeStats;
import mr.d;
import mr.e;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\u0006¨\u0006\f"}, d2 = {"Lio/livekit/android/dagger/CoroutinesModule;", "", "<init>", "()V", "Lfr/z;", "defaultDispatcher", "()Lfr/z;", "ioDispatcher", "Lfr/y1;", "mainDispatcher", "()Lfr/y1;", "unconfinedDispatcher", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class CoroutinesModule {
    public static final CoroutinesModule INSTANCE = new CoroutinesModule();

    private CoroutinesModule() {
    }

    public final z defaultDispatcher() {
        return r0.f9888a;
    }

    public final z ioDispatcher() {
        e eVar = r0.f9888a;
        return d.f23445b;
    }

    public final y1 mainDispatcher() {
        e eVar = r0.f9888a;
        return o.f20734a;
    }

    public final z unconfinedDispatcher() {
        return r0.f9889b;
    }
}
