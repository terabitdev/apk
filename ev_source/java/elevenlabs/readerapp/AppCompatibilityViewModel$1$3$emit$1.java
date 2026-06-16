package io.elevenlabs.readerapp;

import io.elevenlabs.readerapp.AppCompatibilityViewModel;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.AppCompatibilityViewModel$1$3", f = "AppCompatibilityViewModel.kt", l = {40}, m = "emit", v = 2)
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class AppCompatibilityViewModel$1$3$emit$1 extends yn.c {
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AppCompatibilityViewModel.AnonymousClass1.AnonymousClass3<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AppCompatibilityViewModel$1$3$emit$1(AppCompatibilityViewModel.AnonymousClass1.AnonymousClass3<? super T> anonymousClass3, wn.c<? super AppCompatibilityViewModel$1$3$emit$1> cVar) {
        super(cVar);
        this.this$0 = anonymousClass3;
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit(false, (wn.c<? super z>) this);
    }
}
