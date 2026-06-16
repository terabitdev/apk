package io.elevenlabs.highlighter;

import io.elevenlabs.domain.model.ChapterSlot;
import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14188a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14189b;

    public /* synthetic */ g(Object obj, int i10) {
        this.f14188a = i10;
        this.f14189b = obj;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        sn.z TextElement$lambda$13$0$0;
        Object Highlighter$lambda$18$0$6;
        boolean z6;
        boolean applyContentAndCap$lambda$5;
        switch (this.f14188a) {
            case 0:
                TextElement$lambda$13$0$0 = HighlighterKt.TextElement$lambda$13$0$0((TextBoundsDrawerState) this.f14189b, (r3.e) obj);
                return TextElement$lambda$13$0$0;
            case 1:
                return HighlighterKt$Highlighter$9$1.a((ho.a) this.f14189b, (o3.b) obj);
            case 2:
                Highlighter$lambda$18$0$6 = HighlighterKt.Highlighter$lambda$18$0$6((ChapterSlot) this.f14189b, ((Integer) obj).intValue());
                return Highlighter$lambda$18$0$6;
            case 3:
                z6 = HighlighterKt.setupTextContextMenu$lambda$2$0((Set) this.f14189b, (d2.b) obj);
                return Boolean.valueOf(z6);
            default:
                applyContentAndCap$lambda$5 = HighlighterKt.applyContentAndCap$lambda$5((LinkedHashSet) this.f14189b, (ChapterSlot) obj);
                return Boolean.valueOf(applyContentAndCap$lambda$5);
        }
    }
}
