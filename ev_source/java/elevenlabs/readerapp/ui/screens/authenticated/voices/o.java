package io.elevenlabs.readerapp.ui.screens.authenticated.voices;

import io.elevenlabs.domain.model.AsyncCallResult;
import io.elevenlabs.domain.model.Voice;
import io.elevenlabs.readerapp.ui.screens.authenticated.voices.VoiceDetailsViewModel$actualiseVoice$1;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class o implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17140a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f17141b;

    public /* synthetic */ o(Object obj, int i10) {
        this.f17140a = i10;
        this.f17141b = obj;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        switch (this.f17140a) {
            case 0:
                return VoiceDetailsViewModel$actualiseVoice$1.AnonymousClass6.a((Voice) this.f17141b, (VoiceDetailsState) obj);
            default:
                return VoiceDetailsViewModel$setVoiceId$1$1$1$2$2.d((AsyncCallResult) this.f17141b, (VoiceDetailsState) obj);
        }
    }
}
