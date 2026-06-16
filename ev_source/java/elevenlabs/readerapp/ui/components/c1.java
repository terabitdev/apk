package io.elevenlabs.readerapp.ui.components;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c1 implements ho.l {
    public final /* synthetic */ ho.a Y;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14536a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f14537b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f14538c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f14539d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f14540e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f14541f;

    public /* synthetic */ c1(String str, String str2, boolean z6, String str3, String str4, ho.a aVar, int i10) {
        this.f14536a = i10;
        this.f14537b = str;
        this.f14538c = str2;
        this.f14539d = z6;
        this.f14540e = str3;
        this.f14541f = str4;
        this.Y = aVar;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        sn.z VoiceFeaturedCell$lambda$0$0;
        sn.z VoiceRow_LYuG0Iw$lambda$3$0;
        switch (this.f14536a) {
            case 0:
                VoiceFeaturedCell$lambda$0$0 = VoiceFeaturedCellKt.VoiceFeaturedCell$lambda$0$0(this.f14537b, this.f14538c, this.f14539d, this.f14540e, this.f14541f, this.Y, (p4.b0) obj);
                return VoiceFeaturedCell$lambda$0$0;
            default:
                VoiceRow_LYuG0Iw$lambda$3$0 = VoiceRowKt.VoiceRow_LYuG0Iw$lambda$3$0(this.f14537b, this.f14538c, this.f14539d, this.f14540e, this.f14541f, this.Y, (p4.b0) obj);
                return VoiceRow_LYuG0Iw$lambda$3$0;
        }
    }
}
