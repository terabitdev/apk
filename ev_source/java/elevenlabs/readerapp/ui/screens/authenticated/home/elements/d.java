package io.elevenlabs.readerapp.ui.screens.authenticated.home.elements;

import ho.l;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class d implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15615a;

    public /* synthetic */ d(int i10) {
        this.f15615a = i10;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        z DailyStreakSettingsScreenUI$lambda$0$0;
        DailyStreakSettingsState onClosed$lambda$0;
        switch (this.f15615a) {
            case 0:
                return DailyStreakSettingsViewModel$save$1$1.d((DailyStreakSettingsState) obj);
            case 1:
                return DailyStreakSettingsViewModel$save$1$1.h((DailyStreakSettingsState) obj);
            case 2:
                DailyStreakSettingsScreenUI$lambda$0$0 = DailyStreakSettingsScreenKt.DailyStreakSettingsScreenUI$lambda$0$0((l) obj);
                return DailyStreakSettingsScreenUI$lambda$0$0;
            default:
                onClosed$lambda$0 = DailyStreakSettingsViewModel.onClosed$lambda$0((DailyStreakSettingsState) obj);
                return onClosed$lambda$0;
        }
    }
}
