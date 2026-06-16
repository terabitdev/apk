package io.elevenlabs.readerapp.ui.screens.authenticated.collections;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.collections.AddReadToCollectionViewModel", f = "AddReadToCollectionScreen.kt", l = {136, 138}, m = "performToggle", v = 2)
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class AddReadToCollectionViewModel$performToggle$1 extends yn.c {
    Object L$0;
    Object L$1;
    Object L$2;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AddReadToCollectionViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddReadToCollectionViewModel$performToggle$1(AddReadToCollectionViewModel addReadToCollectionViewModel, wn.c<? super AddReadToCollectionViewModel$performToggle$1> cVar) {
        super(cVar);
        this.this$0 = addReadToCollectionViewModel;
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        Object performToggle;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        performToggle = this.this$0.performToggle(null, null, null, false, this);
        return performToggle;
    }
}
