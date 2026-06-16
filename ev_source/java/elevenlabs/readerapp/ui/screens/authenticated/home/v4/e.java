package io.elevenlabs.readerapp.ui.screens.authenticated.home.v4;

import io.elevenlabs.domain.model.ExploreRead;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class e implements ho.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15705a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f15706b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f15707c;

    public /* synthetic */ e(Object obj, Object obj2, int i10) {
        this.f15705a = i10;
        this.f15706b = obj;
        this.f15707c = obj2;
    }

    @Override // ho.a
    public final Object invoke() {
        z HomeSectionContent$lambda$7$0$0;
        z HomeSectionContent$lambda$11$0$0;
        z playPreview$lambda$0;
        switch (this.f15705a) {
            case 0:
                HomeSectionContent$lambda$7$0$0 = HomeScreenV4Kt.HomeSectionContent$lambda$7$0$0((ho.l) this.f15706b, (String) this.f15707c);
                return HomeSectionContent$lambda$7$0$0;
            case 1:
                HomeSectionContent$lambda$11$0$0 = HomeScreenV4Kt.HomeSectionContent$lambda$11$0$0((ho.l) this.f15706b, (String) this.f15707c);
                return HomeSectionContent$lambda$11$0$0;
            default:
                playPreview$lambda$0 = HomeViewModelV4.playPreview$lambda$0((HomeViewModelV4) this.f15706b, (ExploreRead) this.f15707c);
                return playPreview$lambda$0;
        }
    }
}
