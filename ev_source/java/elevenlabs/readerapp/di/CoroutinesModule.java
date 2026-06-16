package io.elevenlabs.readerapp.di;

import fr.d0;
import fr.g0;
import fr.r0;
import fr.z;
import io.elevenlabs.domain.ApplicationCoroutineScope;
import io.elevenlabs.domain.DispatcherFactory;
import kotlin.Metadata;
import kr.o;
import livekit.LivekitInternal$NodeStats;
import mr.d;
import mr.e;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lio/elevenlabs/readerapp/di/CoroutinesModule;", "", "<init>", "()V", "Lio/elevenlabs/domain/DispatcherFactory;", "dispatcherFactory", "()Lio/elevenlabs/domain/DispatcherFactory;", "Lfr/d0;", "applicationCoroutineScope", "()Lfr/d0;", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class CoroutinesModule {
    public static final int $stable = 0;
    public static final CoroutinesModule INSTANCE = new CoroutinesModule();

    private CoroutinesModule() {
    }

    @ApplicationCoroutineScope
    public final d0 applicationCoroutineScope() {
        return g0.e();
    }

    public final DispatcherFactory dispatcherFactory() {
        return new DispatcherFactory() { // from class: io.elevenlabs.readerapp.di.CoroutinesModule$dispatcherFactory$1
            @Override // io.elevenlabs.domain.DispatcherFactory
            public z getDefault() {
                return r0.f9888a;
            }

            @Override // io.elevenlabs.domain.DispatcherFactory
            public z getIo() {
                e eVar = r0.f9888a;
                return d.f23445b;
            }

            @Override // io.elevenlabs.domain.DispatcherFactory
            public z getMain() {
                e eVar = r0.f9888a;
                return o.f20734a;
            }
        };
    }
}
