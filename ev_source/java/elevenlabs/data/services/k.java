package io.elevenlabs.data.services;

import io.elevenlabs.data.services.WssStreamingSession;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k implements ho.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14128a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f14129b;

    public /* synthetic */ k(long j4, int i10) {
        this.f14128a = i10;
        this.f14129b = j4;
    }

    @Override // ho.a
    public final Object invoke() {
        switch (this.f14128a) {
            case 0:
                return WssStreamingSession.AnonymousClass1.AnonymousClass4.a(this.f14129b);
            default:
                return DiskChunkReader.a(this.f14129b);
        }
    }
}
