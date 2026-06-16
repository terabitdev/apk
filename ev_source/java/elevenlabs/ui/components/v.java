package io.elevenlabs.ui.components;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class v implements ho.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17675a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ho.p f17676b;

    public /* synthetic */ v(ho.p pVar, int i10) {
        this.f17675a = i10;
        this.f17676b = pVar;
    }

    @Override // ho.p
    public final Object invoke(Object obj, Object obj2) {
        sn.z Callout$lambda$5$0;
        sn.z Callout$lambda$5$1;
        sn.z Hint$lambda$0$0;
        sn.z VideoPlayerCacheProvider$lambda$2;
        int i10 = this.f17675a;
        u2.m mVar = (u2.m) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i10) {
            case 0:
                Callout$lambda$5$0 = CalloutKt.Callout$lambda$5$0(this.f17676b, mVar, intValue);
                return Callout$lambda$5$0;
            case 1:
                Callout$lambda$5$1 = CalloutKt.Callout$lambda$5$1(this.f17676b, mVar, intValue);
                return Callout$lambda$5$1;
            case 2:
                Hint$lambda$0$0 = HintKt.Hint$lambda$0$0(this.f17676b, mVar, intValue);
                return Hint$lambda$0$0;
            default:
                VideoPlayerCacheProvider$lambda$2 = VideoPlayerKt.VideoPlayerCacheProvider$lambda$2(this.f17676b, mVar, intValue);
                return VideoPlayerCacheProvider$lambda$2;
        }
    }
}
