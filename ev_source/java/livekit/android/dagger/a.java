package io.livekit.android.dagger;

import io.livekit.android.audio.CommunicationWorkaroundImpl;
import java.io.Closeable;
import livekit.org.webrtc.EglBase;
import livekit.org.webrtc.audio.JavaAudioDeviceModule;
import pl.h;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class a implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17797a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f17798b;

    public /* synthetic */ a(Object obj, int i10) {
        this.f17797a = i10;
        this.f17798b = obj;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f17797a) {
            case 0:
                AudioHandlerModule.a((CommunicationWorkaroundImpl) this.f17798b);
                return;
            case 1:
                ((JavaAudioDeviceModule) this.f17798b).release();
                return;
            case 2:
                ((EglBase) this.f17798b).release();
                return;
            default:
                ((h) this.f17798b).a();
                return;
        }
    }
}
