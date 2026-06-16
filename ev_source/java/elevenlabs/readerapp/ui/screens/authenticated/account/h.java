package io.elevenlabs.readerapp.ui.screens.authenticated.account;

import io.elevenlabs.domain.model.AppConfig;
import io.elevenlabs.domain.model.AsyncCallResult;
import io.elevenlabs.domain.model.User;
import io.elevenlabs.domain.services.PurchasesService;
import io.elevenlabs.readerapp.ui.screens.authenticated.account.AccountViewModel;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class h implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15009a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f15010b;

    public /* synthetic */ h(Object obj, int i10) {
        this.f15009a = i10;
        this.f15010b = obj;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        AccountState emit$lambda$0;
        AccountState emit$lambda$02;
        AccountState invokeSuspend$lambda$0;
        z ContentPreferencesScreen$lambda$0$0;
        ManagePurchasesState restorePurchases$lambda$0;
        switch (this.f15009a) {
            case 0:
                emit$lambda$0 = AccountViewModel.AnonymousClass1.C00291.emit$lambda$0((PurchasesService.CustomerCenterEvent.CustomAction) this.f15010b, (AccountState) obj);
                return emit$lambda$0;
            case 1:
                emit$lambda$02 = AccountViewModel.AnonymousClass2.AnonymousClass1.emit$lambda$0((User) this.f15010b, (AccountState) obj);
                return emit$lambda$02;
            case 2:
                invokeSuspend$lambda$0 = AccountViewModel.AnonymousClass3.AnonymousClass1.invokeSuspend$lambda$0((AppConfig) this.f15010b, (AccountState) obj);
                return invokeSuspend$lambda$0;
            case 3:
                return AccountViewModel$loadPage$1.d((AsyncCallResult.Success) this.f15010b, (AccountState) obj);
            case 4:
                ContentPreferencesScreen$lambda$0$0 = ContentPreferencesScreenKt.ContentPreferencesScreen$lambda$0$0((ContentPreferencesViewModel) this.f15010b, ((Boolean) obj).booleanValue());
                return ContentPreferencesScreen$lambda$0$0;
            default:
                restorePurchases$lambda$0 = ManagePurchasesViewModel.restorePurchases$lambda$0((ManagePurchasesViewModel) this.f15010b, (ManagePurchasesState) obj);
                return restorePurchases$lambda$0;
        }
    }
}
