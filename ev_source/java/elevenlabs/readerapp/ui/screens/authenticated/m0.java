package io.elevenlabs.readerapp.ui.screens.authenticated;

import io.elevenlabs.domain.model.LimitReachedData;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class m0 implements ho.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15916a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LimitReachedData f15917b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ho.a f15918c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ho.a f15919d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ho.a f15920e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f15921f;

    public /* synthetic */ m0(LimitReachedData limitReachedData, ho.a aVar, ho.a aVar2, ho.a aVar3, int i10, int i11) {
        this.f15916a = i11;
        this.f15917b = limitReachedData;
        this.f15918c = aVar;
        this.f15919d = aVar2;
        this.f15920e = aVar3;
        this.f15921f = i10;
    }

    @Override // ho.p
    public final Object invoke(Object obj, Object obj2) {
        sn.z GenFmLimitReachedScreen$lambda$0;
        sn.z GenFmLimitReachedScreenUI$lambda$2;
        switch (this.f15916a) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                GenFmLimitReachedScreen$lambda$0 = GenFmLimitReachedScreenKt.GenFmLimitReachedScreen$lambda$0(this.f15917b, this.f15918c, this.f15919d, this.f15920e, this.f15921f, (u2.m) obj, intValue);
                return GenFmLimitReachedScreen$lambda$0;
            default:
                int intValue2 = ((Integer) obj2).intValue();
                GenFmLimitReachedScreenUI$lambda$2 = GenFmLimitReachedScreenKt.GenFmLimitReachedScreenUI$lambda$2(this.f15917b, this.f15918c, this.f15919d, this.f15920e, this.f15921f, (u2.m) obj, intValue2);
                return GenFmLimitReachedScreenUI$lambda$2;
        }
    }
}
