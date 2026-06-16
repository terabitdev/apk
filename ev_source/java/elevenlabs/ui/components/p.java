package io.elevenlabs.ui.components;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class p implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17553a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f17554b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f17555c;

    public /* synthetic */ p(int i10, String str, String str2) {
        this.f17553a = i10;
        this.f17554b = str;
        this.f17555c = str2;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        sn.z BoxSection$lambda$1$0;
        sn.z Chip$lambda$11$0;
        sn.z Pill$lambda$3$0;
        sn.z Slider$lambda$1$0;
        sn.z VerificationCodeInput$lambda$0$0;
        switch (this.f17553a) {
            case 0:
                BoxSection$lambda$1$0 = BoxSectionKt.BoxSection$lambda$1$0(this.f17554b, this.f17555c, (p4.b0) obj);
                return BoxSection$lambda$1$0;
            case 1:
                return ButtonContainerKt.a(this.f17554b, this.f17555c, (p4.b0) obj);
            case 2:
                Chip$lambda$11$0 = ChipKt.Chip$lambda$11$0(this.f17554b, this.f17555c, (p4.b0) obj);
                return Chip$lambda$11$0;
            case 3:
                Pill$lambda$3$0 = PillKt.Pill$lambda$3$0(this.f17554b, this.f17555c, (p4.b0) obj);
                return Pill$lambda$3$0;
            case 4:
                Slider$lambda$1$0 = SliderKt.Slider$lambda$1$0(this.f17554b, this.f17555c, (p4.b0) obj);
                return Slider$lambda$1$0;
            default:
                VerificationCodeInput$lambda$0$0 = VerificationCodeInputKt.VerificationCodeInput$lambda$0$0(this.f17554b, this.f17555c, (p4.b0) obj);
                return VerificationCodeInput$lambda$0$0;
        }
    }
}
