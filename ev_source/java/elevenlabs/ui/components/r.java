package io.elevenlabs.ui.components;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class r implements ho.p {
    public final /* synthetic */ Enum A0;
    public final /* synthetic */ boolean Y;
    public final /* synthetic */ boolean Z;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17594a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f17595b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ho.a f17596c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i3.t f17597d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f17598e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f17599f;

    /* renamed from: x0, reason: collision with root package name */
    public final /* synthetic */ int f17600x0;

    /* renamed from: y0, reason: collision with root package name */
    public final /* synthetic */ int f17601y0;

    /* renamed from: z0, reason: collision with root package name */
    public final /* synthetic */ Enum f17602z0;

    public /* synthetic */ r(int i10, ho.a aVar, i3.t tVar, String str, EchoButtonVariant echoButtonVariant, EchoButtonSize echoButtonSize, boolean z6, boolean z10, boolean z11, int i11, int i12) {
        this.f17595b = i10;
        this.f17596c = aVar;
        this.f17597d = tVar;
        this.f17598e = str;
        this.f17602z0 = echoButtonVariant;
        this.A0 = echoButtonSize;
        this.f17599f = z6;
        this.Y = z10;
        this.Z = z11;
        this.f17600x0 = i11;
        this.f17601y0 = i12;
    }

    @Override // ho.p
    public final Object invoke(Object obj, Object obj2) {
        sn.z ButtonIcon$lambda$1;
        sn.z EchoIconButton$lambda$7;
        switch (this.f17594a) {
            case 0:
                ButtonIcon$lambda$1 = ButtonIconKt.ButtonIcon$lambda$1(this.f17595b, this.f17598e, this.f17596c, this.f17597d, (ButtonIconVariant) this.f17602z0, (ButtonIconSize) this.A0, this.f17599f, this.Y, this.Z, this.f17600x0, this.f17601y0, (u2.m) obj, ((Integer) obj2).intValue());
                return ButtonIcon$lambda$1;
            default:
                EchoIconButton$lambda$7 = EchoIconButtonKt.EchoIconButton$lambda$7(this.f17595b, this.f17596c, this.f17597d, this.f17598e, (EchoButtonVariant) this.f17602z0, (EchoButtonSize) this.A0, this.f17599f, this.Y, this.Z, this.f17600x0, this.f17601y0, (u2.m) obj, ((Integer) obj2).intValue());
                return EchoIconButton$lambda$7;
        }
    }

    public /* synthetic */ r(int i10, String str, ho.a aVar, i3.t tVar, ButtonIconVariant buttonIconVariant, ButtonIconSize buttonIconSize, boolean z6, boolean z10, boolean z11, int i11, int i12) {
        this.f17595b = i10;
        this.f17598e = str;
        this.f17596c = aVar;
        this.f17597d = tVar;
        this.f17602z0 = buttonIconVariant;
        this.A0 = buttonIconSize;
        this.f17599f = z6;
        this.Y = z10;
        this.Z = z11;
        this.f17600x0 = i11;
        this.f17601y0 = i12;
    }
}
