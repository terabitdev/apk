package io.livekit.android.dagger;

import android.content.Context;
import androidx.room.m0;
import io.livekit.android.stats.NetworkInfo;
import ul.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final class WebModule_NetworkInfoFactory implements c {
    private final rn.a contextProvider;

    public WebModule_NetworkInfoFactory(rn.a aVar) {
        this.contextProvider = aVar;
    }

    public static WebModule_NetworkInfoFactory create(rn.a aVar) {
        return new WebModule_NetworkInfoFactory(aVar);
    }

    public static NetworkInfo networkInfo(Context context) {
        NetworkInfo networkInfo = WebModule.INSTANCE.networkInfo(context);
        m0.n(networkInfo);
        return networkInfo;
    }

    @Override // rn.a
    public NetworkInfo get() {
        return networkInfo((Context) this.contextProvider.get());
    }
}
