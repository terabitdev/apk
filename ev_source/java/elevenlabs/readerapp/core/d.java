package io.elevenlabs.readerapp.core;

import io.elevenlabs.readerapp.core.router.RouterViewModel;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d implements ho.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14348a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14349b;

    public /* synthetic */ d(Object obj, int i10) {
        this.f14348a = i10;
        this.f14349b = obj;
    }

    @Override // ho.a
    public final Object invoke() {
        z MessageBottomSheetOverlay$lambda$2$0;
        z SurveySheetUI$lambda$3$0$0$1$0$0$0$0;
        switch (this.f14348a) {
            case 0:
                MessageBottomSheetOverlay$lambda$2$0 = MessageBottomSheetOverlayKt.MessageBottomSheetOverlay$lambda$2$0((RouterViewModel) this.f14349b);
                return MessageBottomSheetOverlay$lambda$2$0;
            default:
                SurveySheetUI$lambda$3$0$0$1$0$0$0$0 = SurveySheetKt.SurveySheetUI$lambda$3$0$0$1$0$0$0$0((ho.a) this.f14349b);
                return SurveySheetUI$lambda$3$0$0$1$0$0$0$0;
        }
    }
}
