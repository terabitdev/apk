package io.elevenlabs.readerapp.ui.screens.authenticated.home.elements;

import ho.l;
import io.elevenlabs.domain.model.UserConfig;
import io.elevenlabs.readerapp.ui.screens.authenticated.home.elements.DailyStreakSettingsViewModel;
import sn.z;
import u2.y0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class c implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15613a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f15614b;

    public /* synthetic */ c(Object obj, int i10) {
        this.f15613a = i10;
        this.f15614b = obj;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        DailyStreakSettingsState invokeSuspend$lambda$0;
        z DailyStreakSettingsScreenUI$lambda$5$2$0$0;
        z DailyStreakSettingsScreen$lambda$1$0;
        switch (this.f15613a) {
            case 0:
                invokeSuspend$lambda$0 = DailyStreakSettingsViewModel.AnonymousClass1.C00391.invokeSuspend$lambda$0((UserConfig) this.f15614b, (DailyStreakSettingsState) obj);
                return invokeSuspend$lambda$0;
            case 1:
                DailyStreakSettingsScreenUI$lambda$5$2$0$0 = DailyStreakSettingsScreenKt.DailyStreakSettingsScreenUI$lambda$5$2$0$0((y0) this.f15614b, (DailyStreakSettingsViewModel) obj);
                return DailyStreakSettingsScreenUI$lambda$5$2$0$0;
            default:
                DailyStreakSettingsScreen$lambda$1$0 = DailyStreakSettingsScreenKt.DailyStreakSettingsScreen$lambda$1$0((DailyStreakSettingsViewModel) this.f15614b, (l) obj);
                return DailyStreakSettingsScreen$lambda$1$0;
        }
    }
}
