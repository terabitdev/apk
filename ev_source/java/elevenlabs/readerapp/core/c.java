package io.elevenlabs.readerapp.core;

import io.elevenlabs.ui.components.scaffolds.BottomSheetControl;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c implements ho.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14346a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BottomSheetControl f14347b;

    public /* synthetic */ c(BottomSheetControl bottomSheetControl, int i10) {
        this.f14346a = i10;
        this.f14347b = bottomSheetControl;
    }

    @Override // ho.a
    public final Object invoke() {
        z MessageBottomSheetOverlay$lambda$3$0$0;
        z SurveySheet$lambda$1$1$0;
        switch (this.f14346a) {
            case 0:
                MessageBottomSheetOverlay$lambda$3$0$0 = MessageBottomSheetOverlayKt.MessageBottomSheetOverlay$lambda$3$0$0(this.f14347b);
                return MessageBottomSheetOverlay$lambda$3$0$0;
            default:
                SurveySheet$lambda$1$1$0 = SurveySheetKt.SurveySheet$lambda$1$1$0(this.f14347b);
                return SurveySheet$lambda$1$1$0;
        }
    }
}
