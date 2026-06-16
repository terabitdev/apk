package io.elevenlabs.ui.components;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class b1 implements ho.p {
    public final /* synthetic */ int A0;
    public final /* synthetic */ Integer Y;
    public final /* synthetic */ boolean Z;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17272a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f17273b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ho.a f17274c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i3.t f17275d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ FullWidthButtonSize f17276e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ FullWidthButtonVariant f17277f;

    /* renamed from: x0, reason: collision with root package name */
    public final /* synthetic */ boolean f17278x0;

    /* renamed from: y0, reason: collision with root package name */
    public final /* synthetic */ boolean f17279y0;

    /* renamed from: z0, reason: collision with root package name */
    public final /* synthetic */ int f17280z0;

    public /* synthetic */ b1(String str, ho.a aVar, i3.t tVar, FullWidthButtonSize fullWidthButtonSize, FullWidthButtonVariant fullWidthButtonVariant, Integer num, boolean z6, boolean z10, boolean z11, int i10, int i11, int i12) {
        this.f17272a = i12;
        this.f17273b = str;
        this.f17274c = aVar;
        this.f17275d = tVar;
        this.f17276e = fullWidthButtonSize;
        this.f17277f = fullWidthButtonVariant;
        this.Y = num;
        this.Z = z6;
        this.f17278x0 = z10;
        this.f17279y0 = z11;
        this.f17280z0 = i10;
        this.A0 = i11;
    }

    @Override // ho.p
    public final Object invoke(Object obj, Object obj2) {
        sn.z EchoThemeFullWidthButton$lambda$0;
        sn.z FullWidthButton$lambda$0;
        switch (this.f17272a) {
            case 0:
                EchoThemeFullWidthButton$lambda$0 = FullWidthButtonKt.EchoThemeFullWidthButton$lambda$0(this.f17273b, this.f17274c, this.f17275d, this.f17276e, this.f17277f, this.Y, this.Z, this.f17278x0, this.f17279y0, this.f17280z0, this.A0, (u2.m) obj, ((Integer) obj2).intValue());
                return EchoThemeFullWidthButton$lambda$0;
            default:
                FullWidthButton$lambda$0 = FullWidthButtonKt.FullWidthButton$lambda$0(this.f17273b, this.f17274c, this.f17275d, this.f17276e, this.f17277f, this.Y, this.Z, this.f17278x0, this.f17279y0, this.f17280z0, this.A0, (u2.m) obj, ((Integer) obj2).intValue());
                return FullWidthButton$lambda$0;
        }
    }
}
