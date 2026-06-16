package io.elevenlabs.highlighter;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements ho.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14165a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ org.jsoup.nodes.k f14166b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f14167c;

    public /* synthetic */ b(org.jsoup.nodes.k kVar, int i10, int i11) {
        this.f14165a = i11;
        this.f14166b = kVar;
        this.f14167c = i10;
    }

    @Override // ho.p
    public final Object invoke(Object obj, Object obj2) {
        sn.z SpeakerNameElement$lambda$3;
        sn.z InfoElement$lambda$1;
        int i10 = this.f14165a;
        u2.m mVar = (u2.m) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i10) {
            case 0:
                SpeakerNameElement$lambda$3 = HighlighterKt.SpeakerNameElement$lambda$3(this.f14166b, this.f14167c, mVar, intValue);
                return SpeakerNameElement$lambda$3;
            default:
                InfoElement$lambda$1 = HighlighterKt.InfoElement$lambda$1(this.f14166b, this.f14167c, mVar, intValue);
                return InfoElement$lambda$1;
        }
    }
}
