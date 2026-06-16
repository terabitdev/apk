package io.elevenlabs.readerapp.ui.screens.authenticated.account;

import io.elevenlabs.domain.model.InterestsQuestion;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class l implements ho.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15016a;

    public /* synthetic */ l(int i10) {
        this.f15016a = i10;
    }

    @Override // ho.p
    public final Object invoke(Object obj, Object obj2) {
        z lambda_1802214765$lambda$0;
        z lambda__576182259$lambda$0;
        z ManageContentInterestsUI$lambda$2$0;
        switch (this.f15016a) {
            case 0:
                lambda_1802214765$lambda$0 = ComposableSingletons$ContentPreferencesScreenKt.lambda_1802214765$lambda$0((u2.m) obj, ((Integer) obj2).intValue());
                return lambda_1802214765$lambda$0;
            case 1:
                lambda__576182259$lambda$0 = ComposableSingletons$ManagePurchasesScreenKt.lambda__576182259$lambda$0((u2.m) obj, ((Integer) obj2).intValue());
                return lambda__576182259$lambda$0;
            case 2:
                return ComposableSingletons$PreviewAccountScreenAccountScreenPreviewAccountScreenKt.a((u2.m) obj, ((Integer) obj2).intValue());
            case 3:
                return ComposableSingletons$PreviewAccountScreenCreditsFreeAccountScreenPreviewAccountScreenCreditsFreeKt.a((u2.m) obj, ((Integer) obj2).intValue());
            case 4:
                return ComposableSingletons$PreviewAccountScreenCreditsPaidAccountScreenPreviewAccountScreenCreditsPaidKt.a((u2.m) obj, ((Integer) obj2).intValue());
            case 5:
                return ComposableSingletons$PreviewAccountScreenErrorAccountScreenPreviewAccountScreenErrorKt.a((u2.m) obj, ((Integer) obj2).intValue());
            case 6:
                return ComposableSingletons$PreviewAccountScreenLoadingAccountScreenPreviewAccountScreenLoadingKt.a((u2.m) obj, ((Integer) obj2).intValue());
            case 7:
                return ComposableSingletons$PreviewAccountScreenLoadingPasswordResetAccountScreenPreviewAccountScreenLoadingPasswordResetKt.a((u2.m) obj, ((Integer) obj2).intValue());
            case 8:
                return ComposableSingletons$PreviewAccountScreenLoadingRestorePurchasesAccountScreenPreviewAccountScreenLoadingRestorePurchasesKt.a((u2.m) obj, ((Integer) obj2).intValue());
            case 9:
                return ComposableSingletons$PreviewContentPreferencesScreenAccountScreenPreviewContentPreferencesScreenKt.a((u2.m) obj, ((Integer) obj2).intValue());
            case 10:
                return ComposableSingletons$PreviewCreditsUpdateDefaultGroupPreviewCreditsUpdateKt.a((u2.m) obj, ((Integer) obj2).intValue());
            case 11:
                return ComposableSingletons$PreviewManageContentInterestsScreenErrorAccountScreenPreviewManageContentInterestsScreenErrorKt.a((u2.m) obj, ((Integer) obj2).intValue());
            case 12:
                return ComposableSingletons$PreviewManageContentInterestsScreenLoadedAccountScreenPreviewManageContentInterestsScreenLoadedKt.a((u2.m) obj, ((Integer) obj2).intValue());
            case 13:
                return ComposableSingletons$PreviewManageContentInterestsScreenLoadingAccountScreenPreviewManageContentInterestsScreenLoadingKt.a((u2.m) obj, ((Integer) obj2).intValue());
            case 14:
                return ComposableSingletons$PreviewManagePurchasesScreenAccountScreenPreviewManagePurchasesScreenKt.a((u2.m) obj, ((Integer) obj2).intValue());
            default:
                ManageContentInterestsUI$lambda$2$0 = ManageContentInterestsScreenKt.ManageContentInterestsUI$lambda$2$0((InterestsQuestion) obj, (String) obj2);
                return ManageContentInterestsUI$lambda$2$0;
        }
    }
}
