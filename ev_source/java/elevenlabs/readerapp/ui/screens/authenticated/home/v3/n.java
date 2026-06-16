package io.elevenlabs.readerapp.ui.screens.authenticated.home.v3;

import io.elevenlabs.domain.model.ReadMeta;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class n implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15679a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ho.l f15680b;

    public /* synthetic */ n(ho.l lVar, int i10) {
        this.f15679a = i10;
        this.f15680b = lVar;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        z HomeSectionContent$lambda$1$0;
        z homeItems$lambda$3$0$0;
        switch (this.f15679a) {
            case 0:
                HomeSectionContent$lambda$1$0 = HomeScreenV3Kt.HomeSectionContent$lambda$1$0(this.f15680b, (ReadMeta) obj);
                return HomeSectionContent$lambda$1$0;
            default:
                homeItems$lambda$3$0$0 = HomeScreenV3Kt.homeItems$lambda$3$0$0(this.f15680b, (String) obj);
                return homeItems$lambda$3$0$0;
        }
    }
}
