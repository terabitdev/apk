package io.livekit.android.room;

import io.livekit.android.room.RegionUrlProvider;
import java.net.URI;
import rn.a;
import ul.d;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final class RegionUrlProvider_Factory_Impl implements RegionUrlProvider.Factory {
    private final C0062RegionUrlProvider_Factory delegateFactory;

    public RegionUrlProvider_Factory_Impl(C0062RegionUrlProvider_Factory c0062RegionUrlProvider_Factory) {
        this.delegateFactory = c0062RegionUrlProvider_Factory;
    }

    public static a create(C0062RegionUrlProvider_Factory c0062RegionUrlProvider_Factory) {
        return d.a(new RegionUrlProvider_Factory_Impl(c0062RegionUrlProvider_Factory));
    }

    @Override // io.livekit.android.room.RegionUrlProvider.Factory
    public RegionUrlProvider create(URI uri, String str) {
        return this.delegateFactory.get(uri, str);
    }
}
