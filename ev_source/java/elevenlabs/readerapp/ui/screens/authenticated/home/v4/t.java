package io.elevenlabs.readerapp.ui.screens.authenticated.home.v4;

import io.elevenlabs.domain.model.AsyncCallResult;
import io.elevenlabs.domain.model.ExploreRead;
import io.elevenlabs.domain.model.MediaQueueState;
import io.elevenlabs.domain.model.NotificationPrimerData;
import io.elevenlabs.domain.model.ReadMeta;
import io.elevenlabs.domain.model.User;
import io.elevenlabs.domain.model.home.HomePageV4;
import io.elevenlabs.readerapp.ui.screens.authenticated.home.v4.HomeViewModelV4;
import java.util.List;
import java.util.Map;
import sn.z;
import u2.z0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class t implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15768a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f15769b;

    public /* synthetic */ t(Object obj, int i10) {
        this.f15768a = i10;
        this.f15769b = obj;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        HomeStateV4 emit$lambda$0;
        HomeStateV4 emit$lambda$02;
        HomeStateV4 emit$lambda$03;
        HomeStateV4 emit$lambda$04;
        HomeStateV4 invokeSuspend$lambda$2;
        z HomeSectionContent$lambda$1$0$0;
        z HomeSectionContent$lambda$9$0$0;
        z HomeScreenV4UI$lambda$4$0$0$6$0;
        z HomeSectionContent$lambda$2$0$0;
        HomeStateV4 showNotificationPrimer$lambda$0;
        switch (this.f15768a) {
            case 0:
                emit$lambda$0 = HomeViewModelV4.AnonymousClass13.AnonymousClass1.emit$lambda$0((Map) this.f15769b, (HomeStateV4) obj);
                return emit$lambda$0;
            case 1:
                emit$lambda$02 = HomeViewModelV4.AnonymousClass3.AnonymousClass1.emit$lambda$0((MediaQueueState) this.f15769b, (HomeStateV4) obj);
                return emit$lambda$02;
            case 2:
                emit$lambda$03 = HomeViewModelV4.AnonymousClass6.AnonymousClass3.AnonymousClass1.emit$lambda$0((List) this.f15769b, (HomeStateV4) obj);
                return emit$lambda$03;
            case 3:
                emit$lambda$04 = HomeViewModelV4.AnonymousClass8.AnonymousClass1.emit$lambda$0((User) this.f15769b, (HomeStateV4) obj);
                return emit$lambda$04;
            case 4:
                invokeSuspend$lambda$2 = HomeViewModelV4$loadPage$1$1.invokeSuspend$lambda$2((AsyncCallResult.Success) this.f15769b, (HomeStateV4) obj);
                return invokeSuspend$lambda$2;
            case 5:
                HomeSectionContent$lambda$1$0$0 = HomeScreenV4Kt.HomeSectionContent$lambda$1$0$0((ReadMeta) this.f15769b, (HomeViewModelV4) obj);
                return HomeSectionContent$lambda$1$0$0;
            case 6:
                HomeSectionContent$lambda$9$0$0 = HomeScreenV4Kt.HomeSectionContent$lambda$9$0$0((ExploreRead) this.f15769b, (HomeViewModelV4) obj);
                return HomeSectionContent$lambda$9$0$0;
            case 7:
                HomeScreenV4UI$lambda$4$0$0$6$0 = HomeScreenV4Kt.HomeScreenV4UI$lambda$4$0$0$6$0((z0) this.f15769b, ((Boolean) obj).booleanValue());
                return HomeScreenV4UI$lambda$4$0$0$6$0;
            case 8:
                HomeSectionContent$lambda$2$0$0 = HomeScreenV4Kt.HomeSectionContent$lambda$2$0$0((HomePageV4.Section.HomeActionList.HomeActionItem) this.f15769b, (HomeViewModelV4) obj);
                return HomeSectionContent$lambda$2$0$0;
            default:
                showNotificationPrimer$lambda$0 = HomeViewModelV4.showNotificationPrimer$lambda$0((NotificationPrimerData) this.f15769b, (HomeStateV4) obj);
                return showNotificationPrimer$lambda$0;
        }
    }
}
