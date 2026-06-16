package io.elevenlabs.ui.components;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class y1 implements ho.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17723a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f17724b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f17725c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i3.t f17726d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f17727e;

    public /* synthetic */ y1(String str, String str2, i3.t tVar, int i10, int i11) {
        this.f17723a = i11;
        this.f17724b = str;
        this.f17725c = str2;
        this.f17726d = tVar;
        this.f17727e = i10;
    }

    @Override // ho.p
    public final Object invoke(Object obj, Object obj2) {
        sn.z ReadItemCover$lambda$1;
        sn.z VoiceBlurBackground$lambda$1;
        switch (this.f17723a) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                ReadItemCover$lambda$1 = ReadItemCoverKt.ReadItemCover$lambda$1(this.f17724b, this.f17725c, this.f17726d, this.f17727e, (u2.m) obj, intValue);
                return ReadItemCover$lambda$1;
            default:
                int intValue2 = ((Integer) obj2).intValue();
                VoiceBlurBackground$lambda$1 = VoiceBlurBackgroundKt.VoiceBlurBackground$lambda$1(this.f17724b, this.f17725c, this.f17726d, this.f17727e, (u2.m) obj, intValue2);
                return VoiceBlurBackground$lambda$1;
        }
    }
}
