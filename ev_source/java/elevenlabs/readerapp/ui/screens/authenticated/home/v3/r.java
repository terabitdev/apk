package io.elevenlabs.readerapp.ui.screens.authenticated.home.v3;

import io.elevenlabs.domain.model.GenreTilesGridRow;
import io.elevenlabs.domain.model.HighlightedCollectionsRowSection;
import io.elevenlabs.domain.model.MediaQueueState;
import io.elevenlabs.domain.model.NotificationPrimerData;
import io.elevenlabs.domain.model.ReadMeta;
import io.elevenlabs.domain.model.home.HomePageV3;
import io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.HomeViewModelV3;
import sn.z;
import u2.z0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class r implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15690a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f15691b;

    public /* synthetic */ r(Object obj, int i10) {
        this.f15690a = i10;
        this.f15691b = obj;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        HomeStateV3 emit$lambda$0;
        z HomeSectionContent$lambda$1$0$0;
        z HomeScreenV3UI$lambda$5$0$6$0;
        z HomeSectionContent$lambda$7$0$0;
        z HomeSectionContent$lambda$5$0$0;
        z HomeSectionContent$lambda$2$0$0;
        HomeStateV3 showNotificationPrimer$lambda$0;
        switch (this.f15690a) {
            case 0:
                emit$lambda$0 = HomeViewModelV3.AnonymousClass3.AnonymousClass1.emit$lambda$0((MediaQueueState) this.f15691b, (HomeStateV3) obj);
                return emit$lambda$0;
            case 1:
                HomeSectionContent$lambda$1$0$0 = HomeScreenV3Kt.HomeSectionContent$lambda$1$0$0((ReadMeta) this.f15691b, (HomeViewModelV3) obj);
                return HomeSectionContent$lambda$1$0$0;
            case 2:
                HomeScreenV3UI$lambda$5$0$6$0 = HomeScreenV3Kt.HomeScreenV3UI$lambda$5$0$6$0((z0) this.f15691b, ((Boolean) obj).booleanValue());
                return HomeScreenV3UI$lambda$5$0$6$0;
            case 3:
                HomeSectionContent$lambda$7$0$0 = HomeScreenV3Kt.HomeSectionContent$lambda$7$0$0((HomePageV3.Section.HomeActionList.HomeActionItem) this.f15691b, (HomeViewModelV3) obj);
                return HomeSectionContent$lambda$7$0$0;
            case 4:
                HomeSectionContent$lambda$5$0$0 = HomeScreenV3Kt.HomeSectionContent$lambda$5$0$0((HighlightedCollectionsRowSection.Item) this.f15691b, (HomeViewModelV3) obj);
                return HomeSectionContent$lambda$5$0$0;
            case 5:
                HomeSectionContent$lambda$2$0$0 = HomeScreenV3Kt.HomeSectionContent$lambda$2$0$0((GenreTilesGridRow.Tile) this.f15691b, (HomeViewModelV3) obj);
                return HomeSectionContent$lambda$2$0$0;
            default:
                showNotificationPrimer$lambda$0 = HomeViewModelV3.showNotificationPrimer$lambda$0((NotificationPrimerData) this.f15691b, (HomeStateV3) obj);
                return showNotificationPrimer$lambda$0;
        }
    }
}
