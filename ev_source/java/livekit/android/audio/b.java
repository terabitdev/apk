package io.livekit.android.audio;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17795a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AudioSwitchHandler f17796b;

    public /* synthetic */ b(AudioSwitchHandler audioSwitchHandler, int i10) {
        this.f17795a = i10;
        this.f17796b = audioSwitchHandler;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f17795a) {
            case 0:
                AudioSwitchHandler.b(this.f17796b);
                return;
            default:
                AudioSwitchHandler.a(this.f17796b);
                return;
        }
    }
}
