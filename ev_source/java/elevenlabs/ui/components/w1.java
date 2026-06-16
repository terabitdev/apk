package io.elevenlabs.ui.components;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class w1 implements ho.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17690a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f17691b;

    public /* synthetic */ w1(String str, int i10) {
        this.f17690a = i10;
        this.f17691b = str;
    }

    @Override // ho.a
    public final Object invoke() {
        switch (this.f17690a) {
            case 0:
                return ReadAudioBackgroundImageKt.a(this.f17691b);
            default:
                return VoiceBlurBackgroundKt.b(this.f17691b);
        }
    }
}
