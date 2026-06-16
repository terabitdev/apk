package io.elevenlabs.readerapp.ui.screens.authenticated.home.v3;

import io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.HomeViewModelV3;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.HomeViewModelV3$6$2", f = "HomeViewModelV3.kt", l = {118, 122}, m = "emit", v = 2)
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class HomeViewModelV3$6$2$emit$1 extends yn.c {
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ HomeViewModelV3.AnonymousClass6.AnonymousClass2<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HomeViewModelV3$6$2$emit$1(HomeViewModelV3.AnonymousClass6.AnonymousClass2<? super T> anonymousClass2, wn.c<? super HomeViewModelV3$6$2$emit$1> cVar) {
        super(cVar);
        this.this$0 = anonymousClass2;
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit(false, (wn.c<? super z>) this);
    }
}
