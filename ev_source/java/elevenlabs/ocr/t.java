package io.elevenlabs.ocr;

import io.elevenlabs.readerapp.ui.screens.authenticated.collections.AddReadToCollectionScreenKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.HomeStateV3;
import io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.HomeViewModelV3;
import io.elevenlabs.readerapp.ui.screens.authenticated.library.LibraryState;
import io.elevenlabs.readerapp.ui.screens.authenticated.library.LibraryViewModel;
import io.elevenlabs.readerapp.ui.screens.authenticated.purchases.hourshistory.HoursHistoryState;
import io.elevenlabs.readerapp.ui.screens.authenticated.purchases.hourshistory.HoursHistoryViewModel;
import io.elevenlabs.readerapp.ui.screens.authenticated.reads.ImportFileState;
import io.elevenlabs.readerapp.ui.screens.authenticated.reads.ImportFileViewModel;
import io.elevenlabs.readerapp.ui.screens.authenticated.reads.ImportLinkState;
import io.elevenlabs.readerapp.ui.screens.authenticated.reads.ImportLinkViewModel;
import io.elevenlabs.readerapp.ui.screens.authenticated.reads.WriteState;
import io.elevenlabs.readerapp.ui.screens.authenticated.reads.WriteViewModel;
import io.elevenlabs.ui.components.AnimatedDigitCounterKt;
import p4.b0;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class t implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14307a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f14308b;

    public /* synthetic */ t(boolean z6, int i10) {
        this.f14307a = i10;
        this.f14308b = z6;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        OcrImportState podcastMode$lambda$0;
        OcrImportState onPermissionStatusChanged$lambda$0;
        z CollectionItemRow$lambda$0$0;
        HomeStateV3 onScreenVisibleChange$lambda$0;
        LibraryState onLibraryVisibilityChange$lambda$0;
        HoursHistoryState onVisibilityToggled$lambda$0;
        ImportFileState podcastMode$lambda$02;
        ImportLinkState podcastMode$lambda$03;
        WriteState podcastMode$lambda$04;
        switch (this.f14307a) {
            case 0:
                podcastMode$lambda$0 = OcrImportViewModel.setPodcastMode$lambda$0(this.f14308b, (OcrImportState) obj);
                return podcastMode$lambda$0;
            case 1:
                onPermissionStatusChanged$lambda$0 = OcrImportViewModel.onPermissionStatusChanged$lambda$0(this.f14308b, (OcrImportState) obj);
                return onPermissionStatusChanged$lambda$0;
            case 2:
                CollectionItemRow$lambda$0$0 = AddReadToCollectionScreenKt.CollectionItemRow$lambda$0$0(this.f14308b, (b0) obj);
                return CollectionItemRow$lambda$0$0;
            case 3:
                onScreenVisibleChange$lambda$0 = HomeViewModelV3.onScreenVisibleChange$lambda$0(this.f14308b, (HomeStateV3) obj);
                return onScreenVisibleChange$lambda$0;
            case 4:
                onLibraryVisibilityChange$lambda$0 = LibraryViewModel.onLibraryVisibilityChange$lambda$0(this.f14308b, (LibraryState) obj);
                return onLibraryVisibilityChange$lambda$0;
            case 5:
                onVisibilityToggled$lambda$0 = HoursHistoryViewModel.onVisibilityToggled$lambda$0(this.f14308b, (HoursHistoryState) obj);
                return onVisibilityToggled$lambda$0;
            case 6:
                podcastMode$lambda$02 = ImportFileViewModel.setPodcastMode$lambda$0(this.f14308b, (ImportFileState) obj);
                return podcastMode$lambda$02;
            case 7:
                podcastMode$lambda$03 = ImportLinkViewModel.setPodcastMode$lambda$0(this.f14308b, (ImportLinkState) obj);
                return podcastMode$lambda$03;
            case 8:
                podcastMode$lambda$04 = WriteViewModel.setPodcastMode$lambda$0(this.f14308b, (WriteState) obj);
                return podcastMode$lambda$04;
            default:
                return AnimatedDigitCounterKt.e(this.f14308b, (i1.q) obj);
        }
    }
}
