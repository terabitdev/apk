package io.elevenlabs.readerapp.ui.screens.authenticated.collections;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.collections.CreateCollectionViewModel", f = "CreateCollectionSheet.kt", l = {153}, m = "addReadToNewCollection", v = 2)
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class CreateCollectionViewModel$addReadToNewCollection$1 extends yn.c {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CreateCollectionViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateCollectionViewModel$addReadToNewCollection$1(CreateCollectionViewModel createCollectionViewModel, wn.c<? super CreateCollectionViewModel$addReadToNewCollection$1> cVar) {
        super(cVar);
        this.this$0 = createCollectionViewModel;
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        Object addReadToNewCollection;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        addReadToNewCollection = this.this$0.addReadToNewCollection(null, null, null, this);
        return addReadToNewCollection;
    }
}
