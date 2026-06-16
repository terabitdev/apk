package io.elevenlabs.ui.components;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class s1 implements ho.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17619a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f17620b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f17621c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f17622d;

    public /* synthetic */ s1(int i10, PillButtonColors pillButtonColors, String str) {
        this.f17621c = i10;
        this.f17622d = pillButtonColors;
        this.f17620b = str;
    }

    @Override // ho.p
    public final Object invoke(Object obj, Object obj2) {
        sn.z PillButton$lambda$0;
        sn.z SmallCallout$lambda$1;
        switch (this.f17619a) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                PillButton$lambda$0 = PillButtonKt.PillButton$lambda$0(this.f17621c, (PillButtonColors) this.f17622d, this.f17620b, (u2.m) obj, intValue);
                return PillButton$lambda$0;
            default:
                int intValue2 = ((Integer) obj2).intValue();
                int i10 = this.f17621c;
                SmallCallout$lambda$1 = CalloutKt.SmallCallout$lambda$1(this.f17620b, (ho.p) this.f17622d, i10, (u2.m) obj, intValue2);
                return SmallCallout$lambda$1;
        }
    }

    public /* synthetic */ s1(String str, ho.p pVar, int i10) {
        this.f17620b = str;
        this.f17622d = pVar;
        this.f17621c = i10;
    }
}
