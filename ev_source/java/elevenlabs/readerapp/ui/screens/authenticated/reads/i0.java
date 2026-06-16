package io.elevenlabs.readerapp.ui.screens.authenticated.reads;

import io.elevenlabs.domain.model.ReadMeta;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class i0 implements ho.p {
    public final /* synthetic */ ho.a Y;
    public final /* synthetic */ ho.a Z;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16926a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ReadMeta f16927b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f16928c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ho.a f16929d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ho.a f16930e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ho.a f16931f;

    /* renamed from: x0, reason: collision with root package name */
    public final /* synthetic */ ho.a f16932x0;

    /* renamed from: y0, reason: collision with root package name */
    public final /* synthetic */ ho.a f16933y0;

    /* renamed from: z0, reason: collision with root package name */
    public final /* synthetic */ int f16934z0;

    public /* synthetic */ i0(ReadMeta readMeta, boolean z6, ho.a aVar, ho.a aVar2, ho.a aVar3, ho.a aVar4, ho.a aVar5, ho.a aVar6, ho.a aVar7, int i10, int i11) {
        this.f16926a = i11;
        this.f16927b = readMeta;
        this.f16928c = z6;
        this.f16929d = aVar;
        this.f16930e = aVar2;
        this.f16931f = aVar3;
        this.Y = aVar4;
        this.Z = aVar5;
        this.f16932x0 = aVar6;
        this.f16933y0 = aVar7;
        this.f16934z0 = i10;
    }

    @Override // ho.p
    public final Object invoke(Object obj, Object obj2) {
        sn.z MoreActionsSheetUI$lambda$1;
        sn.z MoreActionsSheet$lambda$1;
        switch (this.f16926a) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                MoreActionsSheetUI$lambda$1 = MoreActionsSheetKt.MoreActionsSheetUI$lambda$1(this.f16927b, this.f16928c, this.f16929d, this.f16930e, this.f16931f, this.Y, this.Z, this.f16932x0, this.f16933y0, this.f16934z0, (u2.m) obj, intValue);
                return MoreActionsSheetUI$lambda$1;
            default:
                int intValue2 = ((Integer) obj2).intValue();
                MoreActionsSheet$lambda$1 = MoreActionsSheetKt.MoreActionsSheet$lambda$1(this.f16927b, this.f16928c, this.f16929d, this.f16930e, this.f16931f, this.Y, this.Z, this.f16932x0, this.f16933y0, this.f16934z0, (u2.m) obj, intValue2);
                return MoreActionsSheet$lambda$1;
        }
    }
}
