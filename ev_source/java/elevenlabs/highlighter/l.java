package io.elevenlabs.highlighter;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l implements ho.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14216a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14217b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f14218c;

    public /* synthetic */ l(Object obj, Object obj2, int i10) {
        this.f14216a = i10;
        this.f14217b = obj;
        this.f14218c = obj2;
    }

    @Override // ho.a
    public final Object invoke() {
        sn.z TextElement$lambda$3$0;
        sn.z rememberTextBoundsDrawerState$lambda$1$0;
        sn.z ImageElement$lambda$1$2$0;
        switch (this.f14216a) {
            case 0:
                TextElement$lambda$3$0 = HighlighterKt.TextElement$lambda$3$0((TextBoundsDrawerState) this.f14217b, (HighlighterPosition) this.f14218c);
                return TextElement$lambda$3$0;
            case 1:
                rememberTextBoundsDrawerState$lambda$1$0 = HighlighterKt.rememberTextBoundsDrawerState$lambda$1$0((TextBoundsDrawerState) this.f14217b, (AnnotationData) this.f14218c);
                return rememberTextBoundsDrawerState$lambda$1$0;
            default:
                ImageElement$lambda$1$2$0 = HighlighterKt.ImageElement$lambda$1$2$0((ho.l) this.f14217b, (String) this.f14218c);
                return ImageElement$lambda$1$2$0;
        }
    }
}
