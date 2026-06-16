package io.elevenlabs.readerapp.ui.screens.authenticated.account;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final /* synthetic */ class AccountScreenKt$AccountScreenUI$1$1$1$1$1$1 extends kotlin.jvm.internal.a implements ho.a {
    public AccountScreenKt$AccountScreenUI$1$1$1$1$1$1(Object obj) {
        super(0, 8, AccountNavigator.class, obj, "goBack", "goBack()Z");
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m1220invoke() {
        ((AccountNavigator) this.receiver).goBack();
    }

    @Override // ho.a
    public /* bridge */ /* synthetic */ Object invoke() {
        m1220invoke();
        return z.f31622a;
    }
}
