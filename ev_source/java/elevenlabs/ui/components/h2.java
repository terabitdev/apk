package io.elevenlabs.ui.components;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class h2 implements ho.p {
    public final /* synthetic */ ho.p Y;
    public final /* synthetic */ int Z;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17424a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f17425b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f17426c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ho.a f17427d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i3.t f17428e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f17429f;

    /* renamed from: x0, reason: collision with root package name */
    public final /* synthetic */ int f17430x0;

    public /* synthetic */ h2(String str, boolean z6, ho.a aVar, i3.t tVar, String str2, ho.p pVar, int i10, int i11, int i12) {
        this.f17424a = i12;
        this.f17425b = str;
        this.f17426c = z6;
        this.f17427d = aVar;
        this.f17428e = tVar;
        this.f17429f = str2;
        this.Y = pVar;
        this.Z = i10;
        this.f17430x0 = i11;
    }

    @Override // ho.p
    public final Object invoke(Object obj, Object obj2) {
        sn.z SelectableBadgeBox$lambda$1;
        sn.z SelectableCardV2$lambda$4;
        switch (this.f17424a) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                SelectableBadgeBox$lambda$1 = SelectableBadgeBoxKt.SelectableBadgeBox$lambda$1(this.f17425b, this.f17426c, this.f17427d, this.f17428e, this.f17429f, this.Y, this.Z, this.f17430x0, (u2.m) obj, intValue);
                return SelectableBadgeBox$lambda$1;
            default:
                int intValue2 = ((Integer) obj2).intValue();
                SelectableCardV2$lambda$4 = SelectableCardV2Kt.SelectableCardV2$lambda$4(this.f17425b, this.f17426c, this.f17427d, this.f17428e, this.f17429f, this.Y, this.Z, this.f17430x0, (u2.m) obj, intValue2);
                return SelectableCardV2$lambda$4;
        }
    }
}
