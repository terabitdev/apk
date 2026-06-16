package io.elevenlabs.readerapp.ui.screens.authenticated;

import io.elevenlabs.domain.model.AsyncCallResult;
import io.elevenlabs.domain.model.CollectionDetailsWithFirstPage;
import io.elevenlabs.domain.model.OnboardingSurvey;
import io.elevenlabs.readerapp.ui.screens.authenticated.ExploreCollectionViewModel;
import io.elevenlabs.readerapp.ui.screens.authenticated.ExploreCollectionViewModel$loadCollectionDetails$1;
import java.util.Map;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class l0 implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15797a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f15798b;

    public /* synthetic */ l0(Object obj, int i10) {
        this.f15797a = i10;
        this.f15798b = obj;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        ExploreCollectionState emit$lambda$0;
        ExploreCollectionState emit$lambda$02;
        sn.z BottomItem$lambda$2$0$0;
        sn.z DownloadsScreen$lambda$1$0;
        sn.z DownloadsScreenUI$lambda$7$1$0$1$0$0$1$0$0;
        sn.z ExploreCollectionScreen$lambda$2$0;
        sn.z FollowedSeriesScreenUI$lambda$6$1$0$0;
        sn.z OnboardingScreenUI$lambda$0$0$3$2$0$0$0;
        OnboardingState initialize$lambda$0;
        switch (this.f15797a) {
            case 0:
                emit$lambda$0 = ExploreCollectionViewModel.AnonymousClass3.AnonymousClass1.emit$lambda$0((Map) this.f15798b, (ExploreCollectionState) obj);
                return emit$lambda$0;
            case 1:
                emit$lambda$02 = ExploreCollectionViewModel$loadCollectionDetails$1.AnonymousClass1.emit$lambda$0((CollectionDetailsWithFirstPage) this.f15798b, (ExploreCollectionState) obj);
                return emit$lambda$02;
            case 2:
                return OnboardingViewModel$loadVoiceSuggestions$1$1.d((AsyncCallResult.Success) this.f15798b, (OnboardingState) obj);
            case 3:
                BottomItem$lambda$2$0$0 = BottomNavigationKt.BottomItem$lambda$2$0$0((BottomNavigationItem) this.f15798b, (na.g0) obj);
                return BottomItem$lambda$2$0$0;
            case 4:
                DownloadsScreen$lambda$1$0 = DownloadsScreenKt.DownloadsScreen$lambda$1$0((DownloadsViewModel) this.f15798b, (ho.l) obj);
                return DownloadsScreen$lambda$1$0;
            case 5:
                DownloadsScreenUI$lambda$7$1$0$1$0$0$1$0$0 = DownloadsScreenKt.DownloadsScreenUI$lambda$7$1$0$1$0$0$1$0$0((ho.l) this.f15798b, (Filter) obj);
                return DownloadsScreenUI$lambda$7$1$0$1$0$0$1$0$0;
            case 6:
                ExploreCollectionScreen$lambda$2$0 = ExploreCollectionScreenKt.ExploreCollectionScreen$lambda$2$0((ho.a) this.f15798b, (sn.z) obj);
                return ExploreCollectionScreen$lambda$2$0;
            case 7:
                FollowedSeriesScreenUI$lambda$6$1$0$0 = FollowedSeriesScreenKt.FollowedSeriesScreenUI$lambda$6$1$0$0((u2.z0) this.f15798b, (String) obj);
                return FollowedSeriesScreenUI$lambda$6$1$0$0;
            case 8:
                OnboardingScreenUI$lambda$0$0$3$2$0$0$0 = OnboardingScreenKt.OnboardingScreenUI$lambda$0$0$3$2$0$0$0((OnboardingSurvey.Question) this.f15798b, (OnboardingViewModel) obj);
                return OnboardingScreenUI$lambda$0$0$3$2$0$0$0;
            default:
                initialize$lambda$0 = OnboardingViewModel.initialize$lambda$0((OnboardingType) this.f15798b, (OnboardingState) obj);
                return initialize$lambda$0;
        }
    }
}
