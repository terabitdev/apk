package io.elevenlabs.readerapp.ui.components;

import io.elevenlabs.readerapp.ui.screens.authenticated.OnboardingScreenKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.account.components.AccountDurationCounterKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.account.components.AccountSummaryKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.collections.AddReadToCollectionScreenKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.search.SearchScreenKt;
import io.elevenlabs.ui.components.ErrorContainerKt;
import io.elevenlabs.ui.components.MenuKt;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q0 implements ho.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14762a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f14763b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f14764c;

    public /* synthetic */ q0(String str, int i10, int i11) {
        this.f14762a = i11;
        this.f14763b = str;
        this.f14764c = i10;
    }

    @Override // ho.p
    public final Object invoke(Object obj, Object obj2) {
        sn.z ReadRowPrimaryText$lambda$0;
        sn.z EmptyMessage$lambda$1;
        sn.z MenuTitle$lambda$0;
        int i10 = this.f14762a;
        u2.m mVar = (u2.m) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i10) {
            case 0:
                ReadRowPrimaryText$lambda$0 = ReadRowKt.ReadRowPrimaryText$lambda$0(this.f14763b, this.f14764c, mVar, intValue);
                return ReadRowPrimaryText$lambda$0;
            case 1:
                return OnboardingScreenKt.V(this.f14763b, this.f14764c, mVar, intValue);
            case 2:
                return AccountDurationCounterKt.a(this.f14763b, this.f14764c, mVar, intValue);
            case 3:
                return AccountSummaryKt.d(this.f14763b, this.f14764c, mVar, intValue);
            case 4:
                EmptyMessage$lambda$1 = AddReadToCollectionScreenKt.EmptyMessage$lambda$1(this.f14763b, this.f14764c, mVar, intValue);
                return EmptyMessage$lambda$1;
            case 5:
                return SearchScreenKt.G(this.f14763b, this.f14764c, mVar, intValue);
            case 6:
                return ErrorContainerKt.d(this.f14763b, this.f14764c, mVar, intValue);
            default:
                MenuTitle$lambda$0 = MenuKt.MenuTitle$lambda$0(this.f14763b, this.f14764c, mVar, intValue);
                return MenuTitle$lambda$0;
        }
    }
}
