package io.elevenlabs.readerapp.ui.screens.authenticated.voices;

import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class e implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17112a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ VoiceDetailsViewModel f17113b;

    public /* synthetic */ e(VoiceDetailsViewModel voiceDetailsViewModel, int i10) {
        this.f17112a = i10;
        this.f17113b = voiceDetailsViewModel;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        z VoiceDetailsScreen$lambda$1$0;
        VoiceDetailsState voiceDetailsState;
        VoiceDetailsState retry$lambda$0;
        VoiceDetailsState voiceDetailsState2;
        switch (this.f17112a) {
            case 0:
                VoiceDetailsScreen$lambda$1$0 = VoiceDetailsScreenKt.VoiceDetailsScreen$lambda$1$0(this.f17113b, (ho.l) obj);
                return VoiceDetailsScreen$lambda$1$0;
            case 1:
                voiceDetailsState = VoiceDetailsViewModel.toggleVoiceFavorite$lambda$0(this.f17113b, (VoiceDetailsState) obj);
                return voiceDetailsState;
            case 2:
                retry$lambda$0 = VoiceDetailsViewModel.retry$lambda$0(this.f17113b, (VoiceDetailsState) obj);
                return retry$lambda$0;
            default:
                voiceDetailsState2 = VoiceDetailsViewModel.togglePreview$lambda$0(this.f17113b, (VoiceDetailsState) obj);
                return voiceDetailsState2;
        }
    }
}
