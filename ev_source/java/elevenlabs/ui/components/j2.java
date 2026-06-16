package io.elevenlabs.ui.components;

import io.elevenlabs.ui.echo.components.TileKt;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class j2 implements ho.p {
    public final /* synthetic */ boolean Y;
    public final /* synthetic */ int Z;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17465a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f17466b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f17467c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ho.a f17468d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i3.t f17469e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f17470f;

    /* renamed from: x0, reason: collision with root package name */
    public final /* synthetic */ int f17471x0;

    public /* synthetic */ j2(String str, int i10, ho.a aVar, i3.t tVar, String str2, boolean z6, int i11, int i12) {
        this.f17466b = str;
        this.f17467c = i10;
        this.f17468d = aVar;
        this.f17469e = tVar;
        this.f17470f = str2;
        this.Y = z6;
        this.Z = i11;
        this.f17471x0 = i12;
    }

    @Override // ho.p
    public final Object invoke(Object obj, Object obj2) {
        sn.z SelectableCard$lambda$0;
        sn.z Tile$lambda$3;
        sn.z Pill$lambda$5;
        switch (this.f17465a) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                String str = this.f17466b;
                int i10 = this.f17467c;
                ho.a aVar = this.f17468d;
                i3.t tVar = this.f17469e;
                SelectableCard$lambda$0 = SelectableCardKt.SelectableCard$lambda$0(this.Y, i10, str, (String) this.f17470f, aVar, tVar, this.Z, this.f17471x0, (u2.m) obj, intValue);
                return SelectableCard$lambda$0;
            case 1:
                int intValue2 = ((Integer) obj2).intValue();
                Tile$lambda$3 = TileKt.Tile$lambda$3(this.f17466b, this.f17467c, this.f17468d, this.f17469e, (String) this.f17470f, this.Y, this.Z, this.f17471x0, (u2.m) obj, intValue2);
                return Tile$lambda$3;
            default:
                int intValue3 = ((Integer) obj2).intValue();
                Pill$lambda$5 = PillKt.Pill$lambda$5(this.f17466b, (PillSize) this.f17470f, this.f17467c, this.f17469e, this.Y, this.f17468d, this.Z, this.f17471x0, (u2.m) obj, intValue3);
                return Pill$lambda$5;
        }
    }

    public /* synthetic */ j2(String str, PillSize pillSize, int i10, i3.t tVar, boolean z6, ho.a aVar, int i11, int i12) {
        this.f17466b = str;
        this.f17470f = pillSize;
        this.f17467c = i10;
        this.f17469e = tVar;
        this.Y = z6;
        this.f17468d = aVar;
        this.Z = i11;
        this.f17471x0 = i12;
    }

    public /* synthetic */ j2(boolean z6, int i10, String str, String str2, ho.a aVar, i3.t tVar, int i11, int i12) {
        this.Y = z6;
        this.f17467c = i10;
        this.f17466b = str;
        this.f17470f = str2;
        this.f17468d = aVar;
        this.f17469e = tVar;
        this.Z = i11;
        this.f17471x0 = i12;
    }
}
