package io.livekit.android.room;

import java.net.URI;
import okhttp3.OkHttpClient;
import rn.a;
import vr.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* renamed from: io.livekit.android.room.RegionUrlProvider_Factory, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0062RegionUrlProvider_Factory {
    private final a jsonProvider;
    private final a okHttpClientProvider;

    public C0062RegionUrlProvider_Factory(a aVar, a aVar2) {
        this.okHttpClientProvider = aVar;
        this.jsonProvider = aVar2;
    }

    public static C0062RegionUrlProvider_Factory create(a aVar, a aVar2) {
        return new C0062RegionUrlProvider_Factory(aVar, aVar2);
    }

    public static RegionUrlProvider newInstance(URI uri, String str, OkHttpClient okHttpClient, c cVar) {
        return new RegionUrlProvider(uri, str, okHttpClient, cVar);
    }

    public RegionUrlProvider get(URI uri, String str) {
        return newInstance(uri, str, (OkHttpClient) this.okHttpClientProvider.get(), (c) this.jsonProvider.get());
    }
}
