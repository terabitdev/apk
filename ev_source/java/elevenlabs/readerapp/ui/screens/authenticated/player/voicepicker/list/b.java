package io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.list;

import ho.l;
import io.elevenlabs.domain.model.Voice;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.sections.VoicePickerExploreFeaturedSectionKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.voices.elements.VoicesCarouselUIKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.voices.elements.VoicesGridUIKt;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class b implements ho.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16422a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f16423b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Voice f16424c;

    public /* synthetic */ b(l lVar, Voice voice, int i10) {
        this.f16422a = i10;
        this.f16423b = lVar;
        this.f16424c = voice;
    }

    @Override // ho.a
    public final Object invoke() {
        z VoicesCarouselUI$lambda$1$0$1$0$0$0;
        z VoicesGridUI$lambda$2$4$0$0$0$0;
        z VoicesGridUI$lambda$2$4$0$0$1$0;
        switch (this.f16422a) {
            case 0:
                return VoicePickerVoiceRowKt.b(this.f16423b, this.f16424c);
            case 1:
                return VoicePickerExploreFeaturedSectionKt.g(this.f16423b, this.f16424c);
            case 2:
                return VoicePickerExploreFeaturedSectionKt.b(this.f16423b, this.f16424c);
            case 3:
                return VoicePickerExploreFeaturedSectionKt.c(this.f16423b, this.f16424c);
            case 4:
                VoicesCarouselUI$lambda$1$0$1$0$0$0 = VoicesCarouselUIKt.VoicesCarouselUI$lambda$1$0$1$0$0$0(this.f16423b, this.f16424c);
                return VoicesCarouselUI$lambda$1$0$1$0$0$0;
            case 5:
                VoicesGridUI$lambda$2$4$0$0$0$0 = VoicesGridUIKt.VoicesGridUI$lambda$2$4$0$0$0$0(this.f16423b, this.f16424c);
                return VoicesGridUI$lambda$2$4$0$0$0$0;
            default:
                VoicesGridUI$lambda$2$4$0$0$1$0 = VoicesGridUIKt.VoicesGridUI$lambda$2$4$0$0$1$0(this.f16423b, this.f16424c);
                return VoicesGridUI$lambda$2$4$0$0$1$0;
        }
    }
}
