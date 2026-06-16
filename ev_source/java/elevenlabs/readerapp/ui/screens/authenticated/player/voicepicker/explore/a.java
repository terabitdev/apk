package io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.explore;

import ho.l;
import io.elevenlabs.ui.extensions.LazyListExtensionsKt;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class a implements ho.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16378a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f16379b;

    public /* synthetic */ a(Object obj, int i10) {
        this.f16378a = i10;
        this.f16379b = obj;
    }

    @Override // ho.a
    public final Object invoke() {
        z VoicePickerExploreScreenUI_AxmokPg$lambda$4$0$0;
        boolean reachedEnd$default;
        switch (this.f16378a) {
            case 0:
                VoicePickerExploreScreenUI_AxmokPg$lambda$4$0$0 = VoicePickerExploreScreenKt.VoicePickerExploreScreenUI_AxmokPg$lambda$4$0$0((l) this.f16379b);
                return VoicePickerExploreScreenUI_AxmokPg$lambda$4$0$0;
            default:
                reachedEnd$default = LazyListExtensionsKt.reachedEnd$default((t1.z) this.f16379b, 0, 1, null);
                return Boolean.valueOf(reachedEnd$default);
        }
    }
}
