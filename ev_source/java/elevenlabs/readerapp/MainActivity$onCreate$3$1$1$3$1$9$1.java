package io.elevenlabs.readerapp;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final /* synthetic */ class MainActivity$onCreate$3$1$1$3$1$9$1 extends kotlin.jvm.internal.j implements ho.a {
    public MainActivity$onCreate$3$1$1$3$1$9$1(Object obj) {
        super(0, 0, LowDiskSpaceViewModel.class, obj, "dismiss", "dismiss()V");
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m1008invoke() {
        ((LowDiskSpaceViewModel) this.receiver).dismiss();
    }

    @Override // ho.a
    public /* bridge */ /* synthetic */ Object invoke() {
        m1008invoke();
        return z.f31622a;
    }
}
