package io.elevenlabs.readerapp.ui.screens.authenticated.player.elements;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class v implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16140a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SleepTimerViewModel f16141b;

    public /* synthetic */ v(SleepTimerViewModel sleepTimerViewModel, int i10) {
        this.f16140a = i10;
        this.f16141b = sleepTimerViewModel;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        sn.z SleepTimerSheet$lambda$2$1$0;
        SleepTimerState save$lambda$0;
        switch (this.f16140a) {
            case 0:
                SleepTimerSheet$lambda$2$1$0 = SleepTimerSheetKt.SleepTimerSheet$lambda$2$1$0(this.f16141b, (ho.l) obj);
                return SleepTimerSheet$lambda$2$1$0;
            default:
                save$lambda$0 = SleepTimerViewModel.save$lambda$0(this.f16141b, (SleepTimerState) obj);
                return save$lambda$0;
        }
    }
}
