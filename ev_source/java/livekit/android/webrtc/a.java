package io.livekit.android.webrtc;

import io.livekit.android.webrtc.SimulcastVideoEncoderFactoryWrapper;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class a implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17816a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SimulcastVideoEncoderFactoryWrapper.StreamEncoderWrapper f17817b;

    public /* synthetic */ a(SimulcastVideoEncoderFactoryWrapper.StreamEncoderWrapper streamEncoderWrapper, int i10) {
        this.f17816a = i10;
        this.f17817b = streamEncoderWrapper;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f17816a) {
            case 0:
                return SimulcastVideoEncoderFactoryWrapper.StreamEncoderWrapper.g(this.f17817b);
            case 1:
                return SimulcastVideoEncoderFactoryWrapper.StreamEncoderWrapper.k(this.f17817b);
            case 2:
                return SimulcastVideoEncoderFactoryWrapper.StreamEncoderWrapper.j(this.f17817b);
            case 3:
                return SimulcastVideoEncoderFactoryWrapper.StreamEncoderWrapper.i(this.f17817b);
            case 4:
                return SimulcastVideoEncoderFactoryWrapper.StreamEncoderWrapper.f(this.f17817b);
            default:
                return SimulcastVideoEncoderFactoryWrapper.StreamEncoderWrapper.c(this.f17817b);
        }
    }
}
