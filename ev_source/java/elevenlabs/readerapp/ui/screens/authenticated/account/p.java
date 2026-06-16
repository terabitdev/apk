package io.elevenlabs.readerapp.ui.screens.authenticated.account;

import r1.l2;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class p implements ho.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15022a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ho.a f15023b;

    public /* synthetic */ p(int i10, ho.a aVar) {
        this.f15022a = i10;
        this.f15023b = aVar;
    }

    @Override // ho.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        z ContentPreferencesScreenUI$lambda$0$0$0$0;
        z ManageContentInterestsUI$lambda$4$0$0;
        z ManagePurchasesScreenUI$lambda$0$0$0$0;
        int i10 = this.f15022a;
        l2 l2Var = (l2) obj;
        u2.m mVar = (u2.m) obj2;
        int intValue = ((Integer) obj3).intValue();
        switch (i10) {
            case 0:
                ContentPreferencesScreenUI$lambda$0$0$0$0 = ContentPreferencesScreenKt.ContentPreferencesScreenUI$lambda$0$0$0$0(this.f15023b, l2Var, mVar, intValue);
                return ContentPreferencesScreenUI$lambda$0$0$0$0;
            case 1:
                ManageContentInterestsUI$lambda$4$0$0 = ManageContentInterestsScreenKt.ManageContentInterestsUI$lambda$4$0$0(this.f15023b, l2Var, mVar, intValue);
                return ManageContentInterestsUI$lambda$4$0$0;
            default:
                ManagePurchasesScreenUI$lambda$0$0$0$0 = ManagePurchasesScreenKt.ManagePurchasesScreenUI$lambda$0$0$0$0(this.f15023b, l2Var, mVar, intValue);
                return ManagePurchasesScreenUI$lambda$0$0$0$0;
        }
    }
}
