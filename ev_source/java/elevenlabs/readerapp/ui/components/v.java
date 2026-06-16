package io.elevenlabs.readerapp.ui.components;

import io.elevenlabs.readerapp.ui.screens.authenticated.author.components.AuthorProfileHeaderKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.purchases.hourshistory.HoursHistoryScreenKt;
import java.util.List;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class v implements ho.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14801a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f14802b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f14803c;

    public /* synthetic */ v(int i10, int i11, List list) {
        this.f14801a = i11;
        this.f14802b = list;
        this.f14803c = i10;
    }

    @Override // ho.p
    public final Object invoke(Object obj, Object obj2) {
        sn.z MediaCarouselSection$lambda$2;
        int i10 = this.f14801a;
        u2.m mVar = (u2.m) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i10) {
            case 0:
                MediaCarouselSection$lambda$2 = MediaCarouselSectionKt.MediaCarouselSection$lambda$2(this.f14802b, this.f14803c, mVar, intValue);
                return MediaCarouselSection$lambda$2;
            case 1:
                return HoursHistoryScreenKt.m(this.f14802b, this.f14803c, mVar, intValue);
            default:
                return AuthorProfileHeaderKt.a(this.f14802b, this.f14803c, mVar, intValue);
        }
    }
}
