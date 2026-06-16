package io.elevenlabs.ui.components;

import androidx.media3.exoplayer.ExoPlayer;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class u2 implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17672a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f17673b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f17674c;

    public /* synthetic */ u2(Object obj, Object obj2, int i10) {
        this.f17672a = i10;
        this.f17673b = obj;
        this.f17674c = obj2;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        sn.z invokeSuspend$lambda$0$0;
        sn.z Input$lambda$12$0;
        u2.h0 VideoPlayer__Ogyb9c$lambda$14$3$0;
        switch (this.f17672a) {
            case 0:
                invokeSuspend$lambda$0$0 = SwipeToActionBoxKt$SwipeToActionBox$2$1.invokeSuspend$lambda$0$0((u2.z0) this.f17673b, (u2.z0) this.f17674c, (h5.g) obj);
                return invokeSuspend$lambda$0$0;
            case 1:
                Input$lambda$12$0 = InputKt.Input$lambda$12$0((String) this.f17673b, (y4.w) this.f17674c, (p4.b0) obj);
                return Input$lambda$12$0;
            default:
                VideoPlayer__Ogyb9c$lambda$14$3$0 = VideoPlayerKt.VideoPlayer__Ogyb9c$lambda$14$3$0((ExoPlayer) this.f17673b, (u2.w0) this.f17674c, (u2.i0) obj);
                return VideoPlayer__Ogyb9c$lambda$14$3$0;
        }
    }
}
