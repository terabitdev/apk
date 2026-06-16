package io.elevenlabs.readerapp.ui.screens.authenticated.reads.details;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.reads.details.ReadDetailsViewModel", f = "ReadDetailsViewModel.kt", l = {655, 750}, m = "purchaseWithGooglePlay", v = 2)
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ReadDetailsViewModel$purchaseWithGooglePlay$1 extends yn.c {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ReadDetailsViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReadDetailsViewModel$purchaseWithGooglePlay$1(ReadDetailsViewModel readDetailsViewModel, wn.c<? super ReadDetailsViewModel$purchaseWithGooglePlay$1> cVar) {
        super(cVar);
        this.this$0 = readDetailsViewModel;
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        Object purchaseWithGooglePlay;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        purchaseWithGooglePlay = this.this$0.purchaseWithGooglePlay(null, null, null, null, this);
        return purchaseWithGooglePlay;
    }
}
