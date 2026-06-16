package io.elevenlabs.readerapp.ui.screens.authenticated.explore;

import io.elevenlabs.domain.model.AsyncCallResult;
import io.elevenlabs.readerapp.ui.screens.authenticated.explore.ExploreViewModel;
import io.elevenlabs.readerapp.ui.screens.authenticated.explore.ExploreViewModel$loadInitialData$2;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class q implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15558a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f15559b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f15560c;

    public /* synthetic */ q(Object obj, Object obj2, int i10) {
        this.f15558a = i10;
        this.f15559b = obj;
        this.f15560c = obj2;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        ExploreState emit$lambda$0;
        switch (this.f15558a) {
            case 0:
                emit$lambda$0 = ExploreViewModel.AnonymousClass1.AnonymousClass3.emit$lambda$0((String) this.f15559b, (String) this.f15560c, (ExploreState) obj);
                return emit$lambda$0;
            default:
                return ExploreViewModel$loadInitialData$2.AnonymousClass1.b((ExploreViewModel) this.f15559b, (AsyncCallResult.Error) this.f15560c, (ExploreState) obj);
        }
    }
}
