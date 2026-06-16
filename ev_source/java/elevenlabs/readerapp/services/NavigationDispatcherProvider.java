package io.elevenlabs.readerapp.services;

import io.elevenlabs.readerapp.core.NavigationDispatcher;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR(\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0005\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lio/elevenlabs/readerapp/services/NavigationDispatcherProvider;", "", "<init>", "()V", "Lio/elevenlabs/readerapp/core/NavigationDispatcher;", "dispatcher", "Lsn/z;", "setupDispatcher", "(Lio/elevenlabs/readerapp/core/NavigationDispatcher;)V", "value", "Lio/elevenlabs/readerapp/core/NavigationDispatcher;", "getDispatcher", "()Lio/elevenlabs/readerapp/core/NavigationDispatcher;", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class NavigationDispatcherProvider {
    public static final int $stable = 8;
    private NavigationDispatcher dispatcher;

    public final NavigationDispatcher getDispatcher() {
        return this.dispatcher;
    }

    public final void setupDispatcher(NavigationDispatcher dispatcher) {
        dispatcher.getClass();
        this.dispatcher = dispatcher;
    }
}
