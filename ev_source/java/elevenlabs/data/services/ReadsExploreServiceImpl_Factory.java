package io.elevenlabs.data.services;

import android.content.SharedPreferences;
import io.elevenlabs.data.api.ReadsAPI;
import io.elevenlabs.data.api.ReadsExploreSearchAPI;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class ReadsExploreServiceImpl_Factory implements ul.c {
    private final ul.f exploreSearchApiProvider;
    private final ul.f readsAPIProvider;
    private final ul.f userSharedPreferencesProvider;

    private ReadsExploreServiceImpl_Factory(ul.f fVar, ul.f fVar2, ul.f fVar3) {
        this.readsAPIProvider = fVar;
        this.exploreSearchApiProvider = fVar2;
        this.userSharedPreferencesProvider = fVar3;
    }

    public static ReadsExploreServiceImpl_Factory create(ul.f fVar, ul.f fVar2, ul.f fVar3) {
        return new ReadsExploreServiceImpl_Factory(fVar, fVar2, fVar3);
    }

    public static ReadsExploreServiceImpl newInstance(ReadsAPI readsAPI, ReadsExploreSearchAPI readsExploreSearchAPI, SharedPreferences sharedPreferences) {
        return new ReadsExploreServiceImpl(readsAPI, readsExploreSearchAPI, sharedPreferences);
    }

    @Override // rn.a
    public ReadsExploreServiceImpl get() {
        return newInstance((ReadsAPI) this.readsAPIProvider.get(), (ReadsExploreSearchAPI) this.exploreSearchApiProvider.get(), (SharedPreferences) this.userSharedPreferencesProvider.get());
    }
}
