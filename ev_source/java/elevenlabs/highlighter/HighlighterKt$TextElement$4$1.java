package io.elevenlabs.highlighter;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import u2.z0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final /* synthetic */ class HighlighterKt$TextElement$4$1 extends kotlin.jvm.internal.j implements ho.l {
    final /* synthetic */ z0 $textFieldValue$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HighlighterKt$TextElement$4$1(z0 z0Var) {
        super(1, kotlin.jvm.internal.l.class, "onValueChange", "TextElement$onValueChange(Landroidx/compose/runtime/MutableState;Landroidx/compose/ui/text/input/TextFieldValue;)V", 0);
        this.$textFieldValue$delegate = z0Var;
    }

    public final void invoke(y4.w wVar) {
        wVar.getClass();
        this.$textFieldValue$delegate.setValue(wVar);
    }

    @Override // ho.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((y4.w) obj);
        return sn.z.f31622a;
    }
}
