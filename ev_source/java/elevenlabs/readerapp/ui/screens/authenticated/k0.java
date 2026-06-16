package io.elevenlabs.readerapp.ui.screens.authenticated;

import io.elevenlabs.readerapp.ui.screens.authenticated.ExploreCollectionViewModel;
import io.elevenlabs.readerapp.ui.screens.authenticated.ExploreCollectionViewModel$loadCollectionDetails$1;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class k0 implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15793a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f15794b;

    public /* synthetic */ k0(String str, int i10) {
        this.f15793a = i10;
        this.f15794b = str;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        ExploreCollectionState emit$lambda$0;
        DownloadsState onReadClicked$lambda$0;
        ExploreCollectionState doInit$lambda$0;
        switch (this.f15793a) {
            case 0:
                emit$lambda$0 = ExploreCollectionViewModel.AnonymousClass2.AnonymousClass1.emit$lambda$0(this.f15794b, (ExploreCollectionState) obj);
                return emit$lambda$0;
            case 1:
                return ExploreCollectionViewModel$loadCollectionDetails$1.AnonymousClass1.b(this.f15794b, (ExploreCollectionState) obj);
            case 2:
                return BottomNavigationKt.g(this.f15794b, (p4.b0) obj);
            case 3:
                onReadClicked$lambda$0 = DownloadsViewModel.onReadClicked$lambda$0(this.f15794b, (DownloadsState) obj);
                return onReadClicked$lambda$0;
            default:
                doInit$lambda$0 = ExploreCollectionViewModel.doInit$lambda$0(this.f15794b, (ExploreCollectionState) obj);
                return doInit$lambda$0;
        }
    }
}
