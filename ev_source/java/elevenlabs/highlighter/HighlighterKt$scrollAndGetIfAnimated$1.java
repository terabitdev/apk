package io.elevenlabs.highlighter;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.highlighter.HighlighterKt", f = "Highlighter.kt", l = {419, 421, 424}, m = "scrollAndGetIfAnimated", v = 2)
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class HighlighterKt$scrollAndGetIfAnimated$1 extends yn.c {
    double D$0;
    int I$0;
    int I$1;
    int I$2;
    int I$3;
    Object L$0;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;

    public HighlighterKt$scrollAndGetIfAnimated$1(wn.c<? super HighlighterKt$scrollAndGetIfAnimated$1> cVar) {
        super(cVar);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        Object scrollAndGetIfAnimated;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        scrollAndGetIfAnimated = HighlighterKt.scrollAndGetIfAnimated(null, false, 0, 0, this);
        return scrollAndGetIfAnimated;
    }
}
