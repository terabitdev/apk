package io.elevenlabs.readerapp.ui.screens.authenticated;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final /* synthetic */ class ExploreCollectionScreenKt$ExploreCollectionScreen$6$2$1 extends kotlin.jvm.internal.j implements ho.a {
    public ExploreCollectionScreenKt$ExploreCollectionScreen$6$2$1(Object obj) {
        super(0, 0, ExploreCollectionViewModel.class, obj, "onRetry", "onRetry()V");
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m1213invoke() {
        ((ExploreCollectionViewModel) this.receiver).onRetry();
    }

    @Override // ho.a
    public /* bridge */ /* synthetic */ Object invoke() {
        m1213invoke();
        return sn.z.f31622a;
    }
}
