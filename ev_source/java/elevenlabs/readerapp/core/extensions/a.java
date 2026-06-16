package io.elevenlabs.readerapp.core.extensions;

import ho.p;
import io.elevenlabs.readerapp.ui.components.CenteredCloseHeaderKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.OfflineDownloadLimitReachedScreenKt;
import sn.z;
import u2.m;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14352a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f14353b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ho.a f14354c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f14355d;

    public /* synthetic */ a(String str, ho.a aVar, int i10, int i11) {
        this.f14352a = i11;
        this.f14353b = str;
        this.f14354c = aVar;
        this.f14355d = i10;
    }

    @Override // ho.p
    public final Object invoke(Object obj, Object obj2) {
        z OfflineDownloadLimitReachedScreen$lambda$2;
        int i10 = this.f14352a;
        m mVar = (m) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i10) {
            case 0:
                return ComposeExtensionsKt.b(this.f14353b, this.f14354c, this.f14355d, mVar, intValue);
            case 1:
                return CenteredCloseHeaderKt.a(this.f14353b, this.f14354c, this.f14355d, mVar, intValue);
            default:
                OfflineDownloadLimitReachedScreen$lambda$2 = OfflineDownloadLimitReachedScreenKt.OfflineDownloadLimitReachedScreen$lambda$2(this.f14353b, this.f14354c, this.f14355d, mVar, intValue);
                return OfflineDownloadLimitReachedScreen$lambda$2;
        }
    }
}
