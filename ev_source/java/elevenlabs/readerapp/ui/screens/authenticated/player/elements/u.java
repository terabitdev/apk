package io.elevenlabs.readerapp.ui.screens.authenticated.player.elements;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class u implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16138a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SleepTimerOption f16139b;

    public /* synthetic */ u(SleepTimerOption sleepTimerOption, int i10) {
        this.f16138a = i10;
        this.f16139b = sleepTimerOption;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        sn.z SleepTimerSheetUI$lambda$2$0$0$0$0$0;
        SleepTimerState onOptionSelect$lambda$0;
        switch (this.f16138a) {
            case 0:
                SleepTimerSheetUI$lambda$2$0$0$0$0$0 = SleepTimerSheetKt.SleepTimerSheetUI$lambda$2$0$0$0$0$0(this.f16139b, (SleepTimerViewModel) obj);
                return SleepTimerSheetUI$lambda$2$0$0$0$0$0;
            default:
                onOptionSelect$lambda$0 = SleepTimerViewModel.onOptionSelect$lambda$0(this.f16139b, (SleepTimerState) obj);
                return onOptionSelect$lambda$0;
        }
    }
}
