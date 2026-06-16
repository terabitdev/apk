package io.elevenlabs.ui.components;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class x0 implements ho.p {
    public final /* synthetic */ int Y;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17696a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f17697b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ho.l f17698c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i3.t f17699d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f17700e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f17701f;

    public /* synthetic */ x0(String str, ho.l lVar, i3.t tVar, String str2, int i10, int i11, int i12) {
        this.f17696a = i12;
        this.f17697b = str;
        this.f17698c = lVar;
        this.f17699d = tVar;
        this.f17700e = str2;
        this.f17701f = i10;
        this.Y = i11;
    }

    @Override // ho.p
    public final Object invoke(Object obj, Object obj2) {
        sn.z EchoInputSearch$lambda$2;
        sn.z InputSearch$lambda$1;
        switch (this.f17696a) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                EchoInputSearch$lambda$2 = EchoInputSearchKt.EchoInputSearch$lambda$2(this.f17697b, this.f17698c, this.f17699d, this.f17700e, this.f17701f, this.Y, (u2.m) obj, intValue);
                return EchoInputSearch$lambda$2;
            default:
                int intValue2 = ((Integer) obj2).intValue();
                InputSearch$lambda$1 = InputSearchKt.InputSearch$lambda$1(this.f17697b, this.f17698c, this.f17699d, this.f17700e, this.f17701f, this.Y, (u2.m) obj, intValue2);
                return InputSearch$lambda$1;
        }
    }
}
