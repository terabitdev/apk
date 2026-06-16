package io.elevenlabs.readerapp.core;

import io.elevenlabs.readerapp.ui.screens.authenticated.purchases.OneTimeCreditProductsListKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.purchases.SubscriptionProductsListKt;
import java.util.List;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k implements ho.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14368a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f14369b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ho.l f14370c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f14371d;

    public /* synthetic */ k(List list, ho.l lVar, int i10, int i11) {
        this.f14368a = i11;
        this.f14369b = list;
        this.f14370c = lVar;
        this.f14371d = i10;
    }

    @Override // ho.p
    public final Object invoke(Object obj, Object obj2) {
        z SingleSelectQuestionView$lambda$4;
        z OneTimeCreditProductsList$lambda$1;
        z SubscriptionProductsList$lambda$1;
        int i10 = this.f14368a;
        u2.m mVar = (u2.m) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i10) {
            case 0:
                SingleSelectQuestionView$lambda$4 = SurveySheetKt.SingleSelectQuestionView$lambda$4(this.f14369b, this.f14370c, this.f14371d, mVar, intValue);
                return SingleSelectQuestionView$lambda$4;
            case 1:
                OneTimeCreditProductsList$lambda$1 = OneTimeCreditProductsListKt.OneTimeCreditProductsList$lambda$1(this.f14369b, this.f14370c, this.f14371d, mVar, intValue);
                return OneTimeCreditProductsList$lambda$1;
            default:
                SubscriptionProductsList$lambda$1 = SubscriptionProductsListKt.SubscriptionProductsList$lambda$1(this.f14369b, this.f14370c, this.f14371d, mVar, intValue);
                return SubscriptionProductsList$lambda$1;
        }
    }
}
