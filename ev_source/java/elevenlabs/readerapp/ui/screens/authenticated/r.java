package io.elevenlabs.readerapp.ui.screens.authenticated;

import io.elevenlabs.readerapp.ui.screens.authenticated.account.components.AccountSectionDividerKt;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class r implements ho.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16734a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f16735b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f16736c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f16737d;

    public /* synthetic */ r(Object obj, int i10, int i11, int i12) {
        this.f16734a = i12;
        this.f16737d = obj;
        this.f16735b = i10;
        this.f16736c = i11;
    }

    @Override // ho.p
    public final Object invoke(Object obj, Object obj2) {
        sn.z DownloadsEmptyState$lambda$2;
        switch (this.f16734a) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                DownloadsEmptyState$lambda$2 = DownloadsScreenKt.DownloadsEmptyState$lambda$2((ho.a) this.f16737d, this.f16735b, this.f16736c, (u2.m) obj, intValue);
                return DownloadsEmptyState$lambda$2;
            default:
                int intValue2 = ((Integer) obj2).intValue();
                return AccountSectionDividerKt.a((String) this.f16737d, this.f16735b, this.f16736c, (u2.m) obj, intValue2);
        }
    }
}
