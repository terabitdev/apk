package io.elevenlabs.readerapp.ui.screens.authenticated.home.v4;

import io.elevenlabs.readerapp.ui.screens.authenticated.home.v4.HomeViewModelV4;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class s implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15766a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f15767b;

    public /* synthetic */ s(String str, int i10) {
        this.f15766a = i10;
        this.f15767b = str;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        HomeStateV4 emit$lambda$0;
        z HomeSectionContent$lambda$6$0$0;
        z HomeSectionContent$lambda$4$0$0$0;
        z HomeSectionContent$lambda$3$0$0$0;
        z HomeSectionContent$lambda$8$0$0;
        z HomeSectionContent$lambda$10$0$0;
        switch (this.f15766a) {
            case 0:
                emit$lambda$0 = HomeViewModelV4.AnonymousClass12.AnonymousClass1.emit$lambda$0(this.f15767b, (HomeStateV4) obj);
                return emit$lambda$0;
            case 1:
                HomeSectionContent$lambda$6$0$0 = HomeScreenV4Kt.HomeSectionContent$lambda$6$0$0(this.f15767b, (HomeViewModelV4) obj);
                return HomeSectionContent$lambda$6$0$0;
            case 2:
                HomeSectionContent$lambda$4$0$0$0 = HomeScreenV4Kt.HomeSectionContent$lambda$4$0$0$0(this.f15767b, (HomeViewModelV4) obj);
                return HomeSectionContent$lambda$4$0$0$0;
            case 3:
                HomeSectionContent$lambda$3$0$0$0 = HomeScreenV4Kt.HomeSectionContent$lambda$3$0$0$0(this.f15767b, (HomeViewModelV4) obj);
                return HomeSectionContent$lambda$3$0$0$0;
            case 4:
                HomeSectionContent$lambda$8$0$0 = HomeScreenV4Kt.HomeSectionContent$lambda$8$0$0(this.f15767b, (HomeViewModelV4) obj);
                return HomeSectionContent$lambda$8$0$0;
            default:
                HomeSectionContent$lambda$10$0$0 = HomeScreenV4Kt.HomeSectionContent$lambda$10$0$0(this.f15767b, (HomeViewModelV4) obj);
                return HomeSectionContent$lambda$10$0$0;
        }
    }
}
