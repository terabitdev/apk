package io.elevenlabs.readerapp.ui.screens.authenticated;

import io.elevenlabs.ui.components.ActionConfig;
import io.elevenlabs.ui.components.ActionSpecBuilder;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class g implements ho.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15581a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f15582b;

    public /* synthetic */ g(Object obj, int i10) {
        this.f15581a = i10;
        this.f15582b = obj;
    }

    @Override // ho.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        sn.z DownloadsScreenUI$lambda$7$1$0$1$0$0$0;
        sn.z MockDownloadItems$lambda$1;
        switch (this.f15581a) {
            case 0:
                DownloadsScreenUI$lambda$7$1$0$1$0$0$0 = DownloadsScreenKt.DownloadsScreenUI$lambda$7$1$0$1$0$0$0((DownloadsState) this.f15582b, (t1.b) obj, (u2.m) obj2, ((Integer) obj3).intValue());
                return DownloadsScreenUI$lambda$7$1$0$1$0$0$0;
            default:
                MockDownloadItems$lambda$1 = DownloadsScreenKt.MockDownloadItems$lambda$1((ActionConfig) this.f15582b, (ActionSpecBuilder) obj, (u2.m) obj2, ((Integer) obj3).intValue());
                return MockDownloadItems$lambda$1;
        }
    }
}
