package io.elevenlabs.readerapp.ui.screens.authenticated.voices;

import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class l implements ho.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17132a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ho.l f17133b;

    public /* synthetic */ l(ho.l lVar, int i10) {
        this.f17132a = i10;
        this.f17133b = lVar;
    }

    @Override // ho.a
    public final Object invoke() {
        z VoiceDetailsScreenUI$lambda$2$0$0$0$0;
        z VoiceActionButtons$lambda$1$0$0;
        switch (this.f17132a) {
            case 0:
                VoiceDetailsScreenUI$lambda$2$0$0$0$0 = VoiceDetailsScreenKt.VoiceDetailsScreenUI$lambda$2$0$0$0$0(this.f17133b);
                return VoiceDetailsScreenUI$lambda$2$0$0$0$0;
            default:
                VoiceActionButtons$lambda$1$0$0 = VoiceDetailsScreenKt.VoiceActionButtons$lambda$1$0$0(this.f17133b);
                return VoiceActionButtons$lambda$1$0$0;
        }
    }
}
