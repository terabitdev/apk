package io.elevenlabs.readerapp.ui.screens.authenticated.search;

import io.elevenlabs.ui.extensions.LazyListExtensionsKt;
import sn.z;
import u2.z0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class d implements ho.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17028a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f17029b;

    public /* synthetic */ d(Object obj, int i10) {
        this.f17028a = i10;
        this.f17029b = obj;
    }

    @Override // ho.a
    public final Object invoke() {
        boolean reachedEnd$default;
        z SearchScreenUI$lambda$9$1$3$0$6$0$0$0;
        z SearchListColumn$lambda$2$0$8$0$0;
        switch (this.f17028a) {
            case 0:
                reachedEnd$default = LazyListExtensionsKt.reachedEnd$default((t1.z) this.f17029b, 0, 1, null);
                return Boolean.valueOf(reachedEnd$default);
            case 1:
                SearchScreenUI$lambda$9$1$3$0$6$0$0$0 = SearchScreenKt.SearchScreenUI$lambda$9$1$3$0$6$0$0$0((ho.l) this.f17029b);
                return SearchScreenUI$lambda$9$1$3$0$6$0$0$0;
            default:
                SearchListColumn$lambda$2$0$8$0$0 = SearchScreenKt.SearchListColumn$lambda$2$0$8$0$0((z0) this.f17029b);
                return SearchListColumn$lambda$2$0$8$0$0;
        }
    }
}
