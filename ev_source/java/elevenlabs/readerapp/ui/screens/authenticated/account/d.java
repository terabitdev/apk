package io.elevenlabs.readerapp.ui.screens.authenticated.account;

import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class d implements ho.p {
    public final /* synthetic */ int Y;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14975a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f14976b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ho.a f14977c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ho.a f14978d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ho.a f14979e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ho.a f14980f;

    public /* synthetic */ d(boolean z6, ho.a aVar, ho.a aVar2, ho.a aVar3, ho.a aVar4, int i10, int i11) {
        this.f14975a = i11;
        this.f14976b = z6;
        this.f14977c = aVar;
        this.f14978d = aVar2;
        this.f14979e = aVar3;
        this.f14980f = aVar4;
        this.Y = i10;
    }

    @Override // ho.p
    public final Object invoke(Object obj, Object obj2) {
        z BottomActions$lambda$1;
        z ManagePurchasesScreenUI$lambda$1;
        switch (this.f14975a) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                BottomActions$lambda$1 = AccountScreenKt.BottomActions$lambda$1(this.f14976b, this.f14977c, this.f14978d, this.f14979e, this.f14980f, this.Y, (u2.m) obj, intValue);
                return BottomActions$lambda$1;
            default:
                int intValue2 = ((Integer) obj2).intValue();
                ManagePurchasesScreenUI$lambda$1 = ManagePurchasesScreenKt.ManagePurchasesScreenUI$lambda$1(this.f14976b, this.f14977c, this.f14978d, this.f14979e, this.f14980f, this.Y, (u2.m) obj, intValue2);
                return ManagePurchasesScreenUI$lambda$1;
        }
    }
}
