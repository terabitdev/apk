package io.elevenlabs.highlighter;

import u2.z0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14163a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z0 f14164b;

    public /* synthetic */ a(z0 z0Var, int i10) {
        this.f14163a = i10;
        this.f14164b = z0Var;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        sn.z Highlighter$lambda$18$0$LocalTextElement$1$0;
        sn.z Highlighter$lambda$18$0$RenderElementBody$3$0;
        int i10 = this.f14163a;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        switch (i10) {
            case 0:
                Highlighter$lambda$18$0$LocalTextElement$1$0 = HighlighterKt.Highlighter$lambda$18$0$LocalTextElement$1$0(this.f14164b, booleanValue);
                return Highlighter$lambda$18$0$LocalTextElement$1$0;
            default:
                Highlighter$lambda$18$0$RenderElementBody$3$0 = HighlighterKt.Highlighter$lambda$18$0$RenderElementBody$3$0(this.f14164b, booleanValue);
                return Highlighter$lambda$18$0$RenderElementBody$3$0;
        }
    }
}
