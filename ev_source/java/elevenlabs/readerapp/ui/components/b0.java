package io.elevenlabs.readerapp.ui.components;

import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.root.VoicePickerScreenKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.series.ExploreSeriesScreenKt;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b0 implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14520a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u2.x0 f14521b;

    public /* synthetic */ b0(u2.x0 x0Var, int i10) {
        this.f14520a = i10;
        this.f14521b = x0Var;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        sn.z OfflineBannerDisplayingSurface$lambda$11$0$3$0;
        sn.z OfflineBannerDisplayingSurface$lambda$11$0$4$0$0;
        sn.z VoicePickerUI$lambda$5$0$0$1$0$0;
        sn.z SeriesContent_lQd7feU$lambda$4$0$1$0;
        sn.z ExploreSeriesScreenUI$lambda$6$1$0;
        switch (this.f14520a) {
            case 0:
                OfflineBannerDisplayingSurface$lambda$11$0$3$0 = OfflineBannerDisplayingSurfaceKt.OfflineBannerDisplayingSurface$lambda$11$0$3$0(this.f14521b, (h5.l) obj);
                return OfflineBannerDisplayingSurface$lambda$11$0$3$0;
            case 1:
                OfflineBannerDisplayingSurface$lambda$11$0$4$0$0 = OfflineBannerDisplayingSurfaceKt.OfflineBannerDisplayingSurface$lambda$11$0$4$0$0(this.f14521b, (h5.l) obj);
                return OfflineBannerDisplayingSurface$lambda$11$0$4$0$0;
            case 2:
                VoicePickerUI$lambda$5$0$0$1$0$0 = VoicePickerScreenKt.VoicePickerUI$lambda$5$0$0$1$0$0(this.f14521b, (h5.l) obj);
                return VoicePickerUI$lambda$5$0$0$1$0$0;
            case 3:
                SeriesContent_lQd7feU$lambda$4$0$1$0 = ExploreSeriesScreenKt.SeriesContent_lQd7feU$lambda$4$0$1$0(this.f14521b, (h5.l) obj);
                return SeriesContent_lQd7feU$lambda$4$0$1$0;
            default:
                ExploreSeriesScreenUI$lambda$6$1$0 = ExploreSeriesScreenKt.ExploreSeriesScreenUI$lambda$6$1$0(this.f14521b, (h5.l) obj);
                return ExploreSeriesScreenUI$lambda$6$1$0;
        }
    }
}
