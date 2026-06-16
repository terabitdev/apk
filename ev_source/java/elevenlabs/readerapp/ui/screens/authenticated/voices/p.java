package io.elevenlabs.readerapp.ui.screens.authenticated.voices;

import io.elevenlabs.domain.model.AsyncCallResult;
import io.elevenlabs.readerapp.ui.screens.authenticated.voices.VoiceDetailsViewModel$setVoiceId$1$1;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class p implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17142a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ VoiceDetailsViewModel f17143b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f17144c;

    public /* synthetic */ p(AsyncCallResult.Success success, VoiceDetailsViewModel voiceDetailsViewModel) {
        this.f17142a = 1;
        this.f17144c = success;
        this.f17143b = voiceDetailsViewModel;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        VoiceDetailsState voiceId$lambda$0;
        switch (this.f17142a) {
            case 0:
                return VoiceDetailsViewModel$setVoiceId$1$1.AnonymousClass1.c(this.f17143b, (AsyncCallResult.Error) this.f17144c, (VoiceDetailsState) obj);
            case 1:
                return VoiceDetailsViewModel$setVoiceId$1$1.AnonymousClass1.a((AsyncCallResult.Success) this.f17144c, this.f17143b, (VoiceDetailsState) obj);
            default:
                voiceId$lambda$0 = VoiceDetailsViewModel.setVoiceId$lambda$0(this.f17143b, (String) this.f17144c, (VoiceDetailsState) obj);
                return voiceId$lambda$0;
        }
    }

    public /* synthetic */ p(VoiceDetailsViewModel voiceDetailsViewModel, Object obj, int i10) {
        this.f17142a = i10;
        this.f17143b = voiceDetailsViewModel;
        this.f17144c = obj;
    }
}
