package io.elevenlabs.readerapp.ui.screens.authenticated.explore;

import io.elevenlabs.domain.model.AsyncCallResult;
import io.elevenlabs.readerapp.ui.screens.authenticated.explore.ExploreViewModel;
import io.elevenlabs.readerapp.ui.screens.authenticated.explore.ExploreViewModel$loadInitialData$2;
import java.util.Map;
import sn.z;
import u2.z0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class s implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15563a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f15564b;

    public /* synthetic */ s(Object obj, int i10) {
        this.f15563a = i10;
        this.f15564b = obj;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        ExploreState emit$lambda$0;
        ExploreState emit$lambda$1;
        z ExploreScreenUI$lambda$5$0$0$0$15$0$1$1$0;
        z ExploreScreen$lambda$3$0$0;
        z ExploreScreenUI$lambda$5$0$0$0$6$0;
        Object exploreFilteredContent$lambda$2;
        switch (this.f15563a) {
            case 0:
                emit$lambda$0 = ExploreViewModel.AnonymousClass3.AnonymousClass1.emit$lambda$0((Map) this.f15564b, (ExploreState) obj);
                return emit$lambda$0;
            case 1:
                emit$lambda$1 = ExploreViewModel$loadInitialData$2.AnonymousClass1.emit$lambda$1((AsyncCallResult.Success) this.f15564b, (ExploreState) obj);
                return emit$lambda$1;
            case 2:
                ExploreScreenUI$lambda$5$0$0$0$15$0$1$1$0 = ExploreScreenKt.ExploreScreenUI$lambda$5$0$0$0$15$0$1$1$0((ho.l) this.f15564b, (String) obj);
                return ExploreScreenUI$lambda$5$0$0$0$15$0$1$1$0;
            case 3:
                ExploreScreen$lambda$3$0$0 = ExploreScreenKt.ExploreScreen$lambda$3$0$0((ho.p) this.f15564b, (String) obj);
                return ExploreScreen$lambda$3$0$0;
            case 4:
                ExploreScreenUI$lambda$5$0$0$0$6$0 = ExploreScreenKt.ExploreScreenUI$lambda$5$0$0$0$6$0((z0) this.f15564b, ((Boolean) obj).booleanValue());
                return ExploreScreenUI$lambda$5$0$0$0$6$0;
            default:
                exploreFilteredContent$lambda$2 = ExploreScreenKt.exploreFilteredContent$lambda$2((ua.b) this.f15564b, ((Integer) obj).intValue());
                return exploreFilteredContent$lambda$2;
        }
    }
}
