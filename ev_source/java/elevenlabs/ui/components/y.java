package io.elevenlabs.ui.components;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class y implements ho.p {
    public final /* synthetic */ int Y;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17715a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f17716b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ho.a f17717c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f17718d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i3.t f17719e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f17720f;

    public /* synthetic */ y(boolean z6, ho.a aVar, String str, i3.t tVar, int i10, int i11, int i12) {
        this.f17715a = i12;
        this.f17716b = z6;
        this.f17717c = aVar;
        this.f17718d = str;
        this.f17719e = tVar;
        this.f17720f = i10;
        this.Y = i11;
    }

    @Override // ho.p
    public final Object invoke(Object obj, Object obj2) {
        sn.z Checkbox$lambda$1;
        sn.z RadioButton$lambda$3;
        switch (this.f17715a) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                Checkbox$lambda$1 = CheckboxKt.Checkbox$lambda$1(this.f17716b, this.f17717c, this.f17718d, this.f17719e, this.f17720f, this.Y, (u2.m) obj, intValue);
                return Checkbox$lambda$1;
            default:
                int intValue2 = ((Integer) obj2).intValue();
                RadioButton$lambda$3 = RadioButtonKt.RadioButton$lambda$3(this.f17716b, this.f17717c, this.f17718d, this.f17719e, this.f17720f, this.Y, (u2.m) obj, intValue2);
                return RadioButton$lambda$3;
        }
    }
}
