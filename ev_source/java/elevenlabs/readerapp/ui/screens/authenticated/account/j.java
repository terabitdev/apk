package io.elevenlabs.readerapp.ui.screens.authenticated.account;

import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class j implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15014a;

    public /* synthetic */ j(int i10) {
        this.f15014a = i10;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        z AccountScreenUI$lambda$0$0$1$0$0;
        z Preview_AccountScreen_Error$lambda$0$0;
        z Preview_AccountScreen_Credits_Free$lambda$0$0;
        z Preview_AccountScreen_Loading_PasswordReset$lambda$0$0;
        z Preview_AccountScreen$lambda$0$0;
        z Preview_AccountScreen_Loading$lambda$0$0;
        z Preview_AccountScreen_Credits_Paid$lambda$0$0;
        z Preview_AccountScreen_Loading_RestorePurchases$lambda$0$0;
        z AccountScreenUI$lambda$0$0$0$2$0$0$7$0$0;
        z AccountScreenUI$lambda$0$4$0$0;
        z AccountScreenUI$lambda$0$2$0$0;
        z AccountScreenUI$lambda$0$1$0$0;
        z Preview_Credits_Update$lambda$10$0;
        z AccountScreenUI$lambda$0$0$0$2$0$0$5$0$0;
        z AccountScreenUI$lambda$0$0$0$2$0$0$8$0$0;
        z AccountScreen$lambda$0$0;
        z AccountScreenUI$lambda$0$3$0$0;
        AccountState showCustomerCenter$lambda$0;
        AccountState dismissSignOutConfirmation$lambda$0;
        AccountState confirmSignOut$lambda$0;
        AccountState consumePendingCustomerCenterAction$lambda$0;
        AccountState dismissCustomerCenter$lambda$0;
        z lambda_1802214765$lambda$0$0$0;
        u1.e Content$lambda$1$0$0;
        switch (this.f15014a) {
            case 0:
                return AccountViewModel$resetPassword$1$1.d((AccountState) obj);
            case 1:
                return AccountViewModel$startSignOutFlow$1.d((AccountState) obj);
            case 2:
                return AccountViewModel$startSignOutFlow$1.h((AccountState) obj);
            case 3:
                return ManageContentInterestsViewModel$submitInterests$1$1.d((ManageContentInterestsState) obj);
            case 4:
                return ManagePurchasesViewModel$restorePurchases$1$1.d((ManagePurchasesState) obj);
            case 5:
                return ManagePurchasesViewModel$restorePurchases$1$1.h((ManagePurchasesState) obj);
            case 6:
                AccountScreenUI$lambda$0$0$1$0$0 = AccountScreenKt.AccountScreenUI$lambda$0$0$1$0$0((AccountViewModel) obj);
                return AccountScreenUI$lambda$0$0$1$0$0;
            case 7:
                Preview_AccountScreen_Error$lambda$0$0 = AccountScreenKt.Preview_AccountScreen_Error$lambda$0$0((ho.l) obj);
                return Preview_AccountScreen_Error$lambda$0$0;
            case 8:
                Preview_AccountScreen_Credits_Free$lambda$0$0 = AccountScreenKt.Preview_AccountScreen_Credits_Free$lambda$0$0((ho.l) obj);
                return Preview_AccountScreen_Credits_Free$lambda$0$0;
            case 9:
                Preview_AccountScreen_Loading_PasswordReset$lambda$0$0 = AccountScreenKt.Preview_AccountScreen_Loading_PasswordReset$lambda$0$0((ho.l) obj);
                return Preview_AccountScreen_Loading_PasswordReset$lambda$0$0;
            case 10:
                Preview_AccountScreen$lambda$0$0 = AccountScreenKt.Preview_AccountScreen$lambda$0$0((ho.l) obj);
                return Preview_AccountScreen$lambda$0$0;
            case 11:
                Preview_AccountScreen_Loading$lambda$0$0 = AccountScreenKt.Preview_AccountScreen_Loading$lambda$0$0((ho.l) obj);
                return Preview_AccountScreen_Loading$lambda$0$0;
            case 12:
                Preview_AccountScreen_Credits_Paid$lambda$0$0 = AccountScreenKt.Preview_AccountScreen_Credits_Paid$lambda$0$0((ho.l) obj);
                return Preview_AccountScreen_Credits_Paid$lambda$0$0;
            case 13:
                Preview_AccountScreen_Loading_RestorePurchases$lambda$0$0 = AccountScreenKt.Preview_AccountScreen_Loading_RestorePurchases$lambda$0$0((ho.l) obj);
                return Preview_AccountScreen_Loading_RestorePurchases$lambda$0$0;
            case 14:
                AccountScreenUI$lambda$0$0$0$2$0$0$7$0$0 = AccountScreenKt.AccountScreenUI$lambda$0$0$0$2$0$0$7$0$0((AccountViewModel) obj);
                return AccountScreenUI$lambda$0$0$0$2$0$0$7$0$0;
            case 15:
                AccountScreenUI$lambda$0$4$0$0 = AccountScreenKt.AccountScreenUI$lambda$0$4$0$0((AccountViewModel) obj);
                return AccountScreenUI$lambda$0$4$0$0;
            case 16:
                AccountScreenUI$lambda$0$2$0$0 = AccountScreenKt.AccountScreenUI$lambda$0$2$0$0((AccountViewModel) obj);
                return AccountScreenUI$lambda$0$2$0$0;
            case 17:
                AccountScreenUI$lambda$0$1$0$0 = AccountScreenKt.AccountScreenUI$lambda$0$1$0$0((AccountViewModel) obj);
                return AccountScreenUI$lambda$0$1$0$0;
            case 18:
                Preview_Credits_Update$lambda$10$0 = AccountScreenKt.Preview_Credits_Update$lambda$10$0((ho.l) obj);
                return Preview_Credits_Update$lambda$10$0;
            case 19:
                AccountScreenUI$lambda$0$0$0$2$0$0$5$0$0 = AccountScreenKt.AccountScreenUI$lambda$0$0$0$2$0$0$5$0$0((AccountViewModel) obj);
                return AccountScreenUI$lambda$0$0$0$2$0$0$5$0$0;
            case 20:
                AccountScreenUI$lambda$0$0$0$2$0$0$8$0$0 = AccountScreenKt.AccountScreenUI$lambda$0$0$0$2$0$0$8$0$0((AccountViewModel) obj);
                return AccountScreenUI$lambda$0$0$0$2$0$0$8$0$0;
            case 21:
                AccountScreen$lambda$0$0 = AccountScreenKt.AccountScreen$lambda$0$0((String) obj);
                return AccountScreen$lambda$0$0;
            case 22:
                AccountScreenUI$lambda$0$3$0$0 = AccountScreenKt.AccountScreenUI$lambda$0$3$0$0((AccountViewModel) obj);
                return AccountScreenUI$lambda$0$3$0$0;
            case 23:
                showCustomerCenter$lambda$0 = AccountViewModel.showCustomerCenter$lambda$0((AccountState) obj);
                return showCustomerCenter$lambda$0;
            case 24:
                dismissSignOutConfirmation$lambda$0 = AccountViewModel.dismissSignOutConfirmation$lambda$0((AccountState) obj);
                return dismissSignOutConfirmation$lambda$0;
            case 25:
                confirmSignOut$lambda$0 = AccountViewModel.confirmSignOut$lambda$0((AccountState) obj);
                return confirmSignOut$lambda$0;
            case 26:
                consumePendingCustomerCenterAction$lambda$0 = AccountViewModel.consumePendingCustomerCenterAction$lambda$0((AccountState) obj);
                return consumePendingCustomerCenterAction$lambda$0;
            case 27:
                dismissCustomerCenter$lambda$0 = AccountViewModel.dismissCustomerCenter$lambda$0((AccountState) obj);
                return dismissCustomerCenter$lambda$0;
            case 28:
                lambda_1802214765$lambda$0$0$0 = ComposableSingletons$ContentPreferencesScreenKt.lambda_1802214765$lambda$0$0$0(((Boolean) obj).booleanValue());
                return lambda_1802214765$lambda$0$0$0;
            default:
                Content$lambda$1$0$0 = ManageContentInterestsScreenKt.Content$lambda$1$0$0((u1.o) obj);
                return Content$lambda$1$0$0;
        }
    }
}
