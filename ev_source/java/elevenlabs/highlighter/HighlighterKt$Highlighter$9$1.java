package io.elevenlabs.highlighter;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import c4.a0;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import n1.s3;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class HighlighterKt$Highlighter$9$1 implements PointerInputEventHandler {
    final /* synthetic */ ho.a $onBackgroundTap;

    public HighlighterKt$Highlighter$9$1(ho.a aVar) {
        this.$onBackgroundTap = aVar;
    }

    public static /* synthetic */ sn.z a(ho.a aVar, o3.b bVar) {
        return invoke$lambda$0(aVar, bVar);
    }

    public static final sn.z invoke$lambda$0(ho.a aVar, o3.b bVar) {
        aVar.invoke();
        return sn.z.f31622a;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(a0 a0Var, wn.c<? super sn.z> cVar) {
        Object d10 = s3.d(a0Var, null, null, new g(this.$onBackgroundTap, 1), cVar, 7);
        if (d10 == xn.a.f37986a) {
            return d10;
        }
        return sn.z.f31622a;
    }
}
