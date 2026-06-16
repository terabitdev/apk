package io.elevenlabs.readerapp.ui.components;

import io.elevenlabs.readerapp.ui.screens.authenticated.account.components.AccountSummaryKt;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k0 implements ho.p {
    public final /* synthetic */ int Y;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14714a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f14715b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i3.t f14716c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f14717d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s4.y0 f14718e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f14719f;

    public /* synthetic */ k0(String str, i3.t tVar, long j4, s4.y0 y0Var, int i10, int i11) {
        this.f14715b = str;
        this.f14716c = tVar;
        this.f14717d = j4;
        this.f14718e = y0Var;
        this.f14719f = i10;
        this.Y = i11;
    }

    @Override // ho.p
    public final Object invoke(Object obj, Object obj2) {
        sn.z PriceText_cf5BqRc$lambda$0;
        sn.z TextSectionTitle_cf5BqRc$lambda$0;
        switch (this.f14714a) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                String str = this.f14715b;
                i3.t tVar = this.f14716c;
                long j4 = this.f14717d;
                PriceText_cf5BqRc$lambda$0 = ReadPricingRowKt.PriceText_cf5BqRc$lambda$0(str, this.f14718e, j4, tVar, this.f14719f, this.Y, (u2.m) obj, intValue);
                return PriceText_cf5BqRc$lambda$0;
            default:
                int intValue2 = ((Integer) obj2).intValue();
                TextSectionTitle_cf5BqRc$lambda$0 = AccountSummaryKt.TextSectionTitle_cf5BqRc$lambda$0(this.f14715b, this.f14716c, this.f14717d, this.f14718e, this.f14719f, this.Y, (u2.m) obj, intValue2);
                return TextSectionTitle_cf5BqRc$lambda$0;
        }
    }

    public /* synthetic */ k0(String str, s4.y0 y0Var, long j4, i3.t tVar, int i10, int i11) {
        this.f14715b = str;
        this.f14718e = y0Var;
        this.f14717d = j4;
        this.f14716c = tVar;
        this.f14719f = i10;
        this.Y = i11;
    }
}
