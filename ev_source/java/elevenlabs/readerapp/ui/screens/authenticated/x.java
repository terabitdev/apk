package io.elevenlabs.readerapp.ui.screens.authenticated;

import io.elevenlabs.readerapp.ui.screens.authenticated.DownloadsViewModel;
import io.elevenlabs.readerapp.ui.screens.authenticated.FollowedSeriesViewModel;
import java.util.List;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class x implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17222a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f17223b;

    public /* synthetic */ x(List list, int i10) {
        this.f17222a = i10;
        this.f17223b = list;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        DownloadsState invokeSuspend$lambda$0;
        FollowedSeriesState emit$lambda$0;
        sn.z FollowedSeriesScreenUI$lambda$6$1$1$0;
        sn.z ImportOptionsBottomSheetUI$lambda$0$0$1$0;
        switch (this.f17222a) {
            case 0:
                invokeSuspend$lambda$0 = DownloadsViewModel.AnonymousClass1.C00271.invokeSuspend$lambda$0(this.f17223b, (DownloadsState) obj);
                return invokeSuspend$lambda$0;
            case 1:
                emit$lambda$0 = FollowedSeriesViewModel.AnonymousClass1.C00281.emit$lambda$0(this.f17223b, (FollowedSeriesState) obj);
                return emit$lambda$0;
            case 2:
                FollowedSeriesScreenUI$lambda$6$1$1$0 = FollowedSeriesScreenKt.FollowedSeriesScreenUI$lambda$6$1$1$0(this.f17223b, (t1.t) obj);
                return FollowedSeriesScreenUI$lambda$6$1$1$0;
            default:
                ImportOptionsBottomSheetUI$lambda$0$0$1$0 = ImportOptionsBottomSheetKt.ImportOptionsBottomSheetUI$lambda$0$0$1$0(this.f17223b, (u1.w) obj);
                return ImportOptionsBottomSheetUI$lambda$0$0$1$0;
        }
    }
}
