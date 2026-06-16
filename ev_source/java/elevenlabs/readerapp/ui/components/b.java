package io.elevenlabs.readerapp.ui.components;

import androidx.media3.exoplayer.ExoPlayer;
import io.elevenlabs.readerapp.ui.screens.authenticated.home.v4.elements.HomeStatsCarouselKt;
import io.elevenlabs.ui.components.VideoPlayerKt;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements ho.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14515a = 2;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f14516b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f14517c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f14518d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f14519e;

    public /* synthetic */ b(long j4, ExoPlayer exoPlayer, int i10, u2.w0 w0Var) {
        this.f14516b = j4;
        this.f14519e = exoPlayer;
        this.f14517c = i10;
        this.f14518d = w0Var;
    }

    @Override // ho.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        sn.z ActionRow_T042LqI$lambda$0;
        sn.z HomeStatsCarouselSectionV4$lambda$1;
        sn.z VideoPlayer__Ogyb9c$lambda$14$4;
        switch (this.f14515a) {
            case 0:
                int intValue = ((Integer) obj3).intValue();
                ActionRow_T042LqI$lambda$0 = ActionRowKt.ActionRow_T042LqI$lambda$0((i3.t) this.f14519e, this.f14517c, this.f14516b, (String) this.f14518d, (r1.s) obj, (u2.m) obj2, intValue);
                return ActionRow_T042LqI$lambda$0;
            case 1:
                int intValue2 = ((Integer) obj3).intValue();
                HomeStatsCarouselSectionV4$lambda$1 = HomeStatsCarouselKt.HomeStatsCarouselSectionV4$lambda$1(this.f14516b, this.f14517c, (String) this.f14518d, (String) this.f14519e, (r1.s) obj, (u2.m) obj2, intValue2);
                return HomeStatsCarouselSectionV4$lambda$1;
            default:
                int intValue3 = ((Integer) obj3).intValue();
                VideoPlayer__Ogyb9c$lambda$14$4 = VideoPlayerKt.VideoPlayer__Ogyb9c$lambda$14$4(this.f14516b, (ExoPlayer) this.f14519e, this.f14517c, (u2.w0) this.f14518d, (r1.u) obj, (u2.m) obj2, intValue3);
                return VideoPlayer__Ogyb9c$lambda$14$4;
        }
    }

    public /* synthetic */ b(i3.t tVar, int i10, long j4, String str) {
        this.f14519e = tVar;
        this.f14517c = i10;
        this.f14516b = j4;
        this.f14518d = str;
    }

    public /* synthetic */ b(String str, int i10, String str2, long j4) {
        this.f14516b = j4;
        this.f14517c = i10;
        this.f14518d = str;
        this.f14519e = str2;
    }
}
