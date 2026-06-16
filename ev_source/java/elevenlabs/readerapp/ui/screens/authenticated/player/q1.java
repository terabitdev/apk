package io.elevenlabs.readerapp.ui.screens.authenticated.player;

import io.elevenlabs.domain.model.Chapter;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class q1 implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16274a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ double f16275b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Chapter f16276c;

    public /* synthetic */ q1(double d10, Chapter chapter) {
        this.f16275b = d10;
        this.f16276c = chapter;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        PlayerState seekToCumulativePosition$lambda$0;
        PlayerState seekToAudioFileTime$lambda$3;
        switch (this.f16274a) {
            case 0:
                seekToCumulativePosition$lambda$0 = PlayerViewModel.seekToCumulativePosition$lambda$0(this.f16276c, this.f16275b, (PlayerState) obj);
                return seekToCumulativePosition$lambda$0;
            default:
                seekToAudioFileTime$lambda$3 = PlayerViewModel.seekToAudioFileTime$lambda$3(this.f16275b, this.f16276c, (PlayerState) obj);
                return seekToAudioFileTime$lambda$3;
        }
    }

    public /* synthetic */ q1(Chapter chapter, double d10) {
        this.f16276c = chapter;
        this.f16275b = d10;
    }
}
