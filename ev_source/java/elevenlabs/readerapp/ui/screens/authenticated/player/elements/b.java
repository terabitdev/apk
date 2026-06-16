package io.elevenlabs.readerapp.ui.screens.authenticated.player.elements;

import io.elevenlabs.ui.components.scaffolds.BottomSheetControl;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class b implements ho.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16055a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BottomSheetControl f16056b;

    public /* synthetic */ b(BottomSheetControl bottomSheetControl, int i10) {
        this.f16055a = i10;
        this.f16056b = bottomSheetControl;
    }

    @Override // ho.a
    public final Object invoke() {
        sn.z BookmarksSheet$lambda$2$0$0$1$0;
        sn.z BookmarksSheet$lambda$2$1$0;
        sn.z ExportSheet$lambda$1$0$0;
        sn.z SleepTimerSheet$lambda$2$0$0;
        sn.z SpeedPickerSheet$lambda$1$0$0;
        switch (this.f16055a) {
            case 0:
                BookmarksSheet$lambda$2$0$0$1$0 = BookmarksSheetKt.BookmarksSheet$lambda$2$0$0$1$0(this.f16056b);
                return BookmarksSheet$lambda$2$0$0$1$0;
            case 1:
                BookmarksSheet$lambda$2$1$0 = BookmarksSheetKt.BookmarksSheet$lambda$2$1$0(this.f16056b);
                return BookmarksSheet$lambda$2$1$0;
            case 2:
                return ComposableSingletons$BluetoothActionSelectorSheetKt.c(this.f16056b);
            case 3:
                return ComposableSingletons$InAppSkipDurationSelectorSheetKt.a(this.f16056b);
            case 4:
                ExportSheet$lambda$1$0$0 = ExportSheetKt.ExportSheet$lambda$1$0$0(this.f16056b);
                return ExportSheet$lambda$1$0$0;
            case 5:
                SleepTimerSheet$lambda$2$0$0 = SleepTimerSheetKt.SleepTimerSheet$lambda$2$0$0(this.f16056b);
                return SleepTimerSheet$lambda$2$0$0;
            default:
                SpeedPickerSheet$lambda$1$0$0 = SpeedPickerSheetKt.SpeedPickerSheet$lambda$1$0$0(this.f16056b);
                return SpeedPickerSheet$lambda$1$0$0;
        }
    }
}
