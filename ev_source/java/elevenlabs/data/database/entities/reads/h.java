package io.elevenlabs.data.database.entities.reads;

import a2.a3;
import com.revenuecat.purchases.Package;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.models.StoreTransaction;
import f4.f0;
import fr.d0;
import fr.e0;
import fr.g0;
import g0.j0;
import ho.l;
import ho.p;
import io.elevenlabs.data.database.entities.reads.ReadsDao;
import io.elevenlabs.data.database.entities.voices.RecentVoiceEntity;
import io.elevenlabs.data.database.entities.voices.RecentVoicesDao_Impl;
import io.elevenlabs.domain.Analytics;
import io.elevenlabs.domain.model.Bookmark;
import io.elevenlabs.domain.model.Soundscape;
import io.elevenlabs.domain.model.home.HomePageV4;
import io.elevenlabs.domain.services.ProductsService;
import io.elevenlabs.ocr.OcrImportScreenKt$captureImage$1;
import io.elevenlabs.ocr.OcrImportViewModel;
import io.elevenlabs.readerapp.core.router.RouterKt;
import io.elevenlabs.readerapp.core.router.RouterState;
import io.elevenlabs.readerapp.core.router.RouterViewModel;
import io.elevenlabs.readerapp.ui.screens.authenticated.author.AuthorProfileScreenKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.bookmarks.BookmarkRowKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.bookmarks.EditBookmarkSheetKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.bookmarks.EditBookmarkViewModel;
import io.elevenlabs.readerapp.ui.screens.authenticated.home.elements.DailyStreakSettingsState;
import io.elevenlabs.readerapp.ui.screens.authenticated.home.elements.DailyStreakSettingsViewModel;
import io.elevenlabs.readerapp.ui.screens.authenticated.home.v4.elements.HomeActionListSectionKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.ContentSearchSheetKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.ContentSearchState;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.ReadBookmarksState;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.ReadBookmarksViewModel;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.SleepTimerState;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.SleepTimerViewModel;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.SpeedPickerSheetKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.soundscapes.SoundscapesContract;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.soundscapes.SoundscapesScreenKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.soundscapes.SoundscapesViewModel;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.root.VoicePickerContract;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.root.VoicePickerTab;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.root.VoicePickerViewModel;
import io.elevenlabs.readerapp.ui.screens.authenticated.purchases.paywall.RevenueCatPaywallState;
import io.elevenlabs.readerapp.ui.screens.authenticated.purchases.paywall.RevenueCatPaywallViewModel;
import io.elevenlabs.ui.components.ActionConfig;
import io.elevenlabs.ui.components.ActionSpecBuilder;
import io.elevenlabs.ui.components.headers.ScrollingHeaderBoxKt;
import io.elevenlabs.ui.components.scaffolds.BottomSheetScaffoldKt$BottomSheetScaffold$control$1$1;
import io.elevenlabs.ui.extensions.AutofillExtensionsKt;
import j1.h0;
import j1.s1;
import j1.u1;
import java.util.List;
import na.c0;
import q2.u5;
import sn.z;
import t1.t;
import u2.s2;
import u2.w0;
import u2.x0;
import u2.z0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14071a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14072b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f14073c;

    public /* synthetic */ h(Object obj, Object obj2, int i10) {
        this.f14071a = i10;
        this.f14072b = obj;
        this.f14073c = obj2;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        z updateLastVoiceId$lambda$0;
        z insertRecentVoice$lambda$0;
        z onError$lambda$3;
        z Router$lambda$20$0$4$0$0$120$2$0;
        RouterState onImageShare$lambda$0;
        z AuthorProfileContent$lambda$3$0$0$2$1$0$0;
        z BookmarkRow$lambda$3$0$0;
        z EditBookmarkDialogUI$lambda$5$1$0$0;
        DailyStreakSettingsState save$lambda$0;
        z HomeActionListSectionV4$lambda$0$0$0;
        z ContentSearchBottomSheetUI$lambda$2$2$0;
        ReadBookmarksState deleteBookmark$lambda$0;
        SleepTimerState readId$lambda$0;
        z SpeedPickerSheetUI$lambda$4$0$0$0;
        z SoundscapeList$lambda$0$2$0;
        SoundscapesContract.State playPreview$lambda$0;
        SoundscapesContract.State updateDownloadProgress$lambda$0;
        VoicePickerContract.State handleSelectTab$lambda$0;
        RevenueCatPaywallState sources$lambda$0;
        RevenueCatPaywallState purchaseError$lambda$0;
        RevenueCatPaywallState purchaseInitiated$lambda$0;
        RevenueCatPaywallState purchaseCompleted$lambda$0;
        z autofill$lambda$0$1$0;
        switch (this.f14071a) {
            case 0:
                updateLastVoiceId$lambda$0 = ReadsDao_Impl.updateLastVoiceId$lambda$0((ReadsDao_Impl) this.f14072b, (ReadsDao.ReadMetaLastVoiceIdUpdate) this.f14073c, (mb.a) obj);
                return updateLastVoiceId$lambda$0;
            case 1:
                insertRecentVoice$lambda$0 = RecentVoicesDao_Impl.insertRecentVoice$lambda$0((RecentVoicesDao_Impl) this.f14072b, (RecentVoiceEntity) this.f14073c, (mb.a) obj);
                return insertRecentVoice$lambda$0;
            case 2:
                onError$lambda$3 = OcrImportScreenKt$captureImage$1.onError$lambda$3((String) this.f14072b, (j0) this.f14073c, (OcrImportViewModel) obj);
                return onError$lambda$3;
            case 3:
                Router$lambda$20$0$4$0$0$120$2$0 = RouterKt.Router$lambda$20$0$4$0$0$120$2$0((c0) this.f14072b, (String) this.f14073c, (String) obj);
                return Router$lambda$20$0$4$0$0$120$2$0;
            case 4:
                onImageShare$lambda$0 = RouterViewModel.onImageShare$lambda$0((RouterViewModel) this.f14072b, (List) this.f14073c, (RouterState) obj);
                return onImageShare$lambda$0;
            case 5:
                AuthorProfileContent$lambda$3$0$0$2$1$0$0 = AuthorProfileScreenKt.AuthorProfileContent$lambda$3$0$0$2$1$0$0((p) this.f14072b, (String) this.f14073c, (String) obj);
                return AuthorProfileContent$lambda$3$0$0$2$1$0$0;
            case 6:
                BookmarkRow$lambda$3$0$0 = BookmarkRowKt.BookmarkRow$lambda$3$0$0((ActionConfig) this.f14072b, (z0) this.f14073c, (ActionSpecBuilder.HandlerScope) obj);
                return BookmarkRow$lambda$3$0$0;
            case 7:
                EditBookmarkDialogUI$lambda$5$1$0$0 = EditBookmarkSheetKt.EditBookmarkDialogUI$lambda$5$1$0$0((Bookmark) this.f14072b, (z0) this.f14073c, (EditBookmarkViewModel) obj);
                return EditBookmarkDialogUI$lambda$5$1$0$0;
            case 8:
                save$lambda$0 = DailyStreakSettingsViewModel.save$lambda$0((DailyStreakSettingsViewModel) this.f14072b, (Long) this.f14073c, (DailyStreakSettingsState) obj);
                return save$lambda$0;
            case 9:
                HomeActionListSectionV4$lambda$0$0$0 = HomeActionListSectionKt.HomeActionListSectionV4$lambda$0$0$0((HomePageV4.Section.HomeActionList) this.f14072b, (l) this.f14073c, (t) obj);
                return HomeActionListSectionV4$lambda$0$0$0;
            case 10:
                ContentSearchBottomSheetUI$lambda$2$2$0 = ContentSearchSheetKt.ContentSearchBottomSheetUI$lambda$2$2$0((ContentSearchState) this.f14072b, (l) this.f14073c, (t) obj);
                return ContentSearchBottomSheetUI$lambda$2$2$0;
            case 11:
                deleteBookmark$lambda$0 = ReadBookmarksViewModel.deleteBookmark$lambda$0((ReadBookmarksViewModel) this.f14072b, (Bookmark) this.f14073c, (ReadBookmarksState) obj);
                return deleteBookmark$lambda$0;
            case 12:
                readId$lambda$0 = SleepTimerViewModel.setReadId$lambda$0((SleepTimerViewModel) this.f14072b, (String) this.f14073c, (SleepTimerState) obj);
                return readId$lambda$0;
            case 13:
                SpeedPickerSheetUI$lambda$4$0$0$0 = SpeedPickerSheetKt.SpeedPickerSheetUI$lambda$4$0$0$0((l) this.f14072b, (w0) this.f14073c, ((Float) obj).floatValue());
                return SpeedPickerSheetUI$lambda$4$0$0$0;
            case 14:
                SoundscapeList$lambda$0$2$0 = SoundscapesScreenKt.SoundscapeList$lambda$0$2$0((SoundscapesContract.State) this.f14072b, (l) this.f14073c, (t) obj);
                return SoundscapeList$lambda$0$2$0;
            case 15:
                playPreview$lambda$0 = SoundscapesViewModel.playPreview$lambda$0((Soundscape) this.f14072b, (SoundscapesViewModel) this.f14073c, (SoundscapesContract.State) obj);
                return playPreview$lambda$0;
            case 16:
                updateDownloadProgress$lambda$0 = SoundscapesViewModel.updateDownloadProgress$lambda$0((Float) this.f14072b, (String) this.f14073c, (SoundscapesContract.State) obj);
                return updateDownloadProgress$lambda$0;
            case 17:
                handleSelectTab$lambda$0 = VoicePickerViewModel.handleSelectTab$lambda$0((VoicePickerViewModel) this.f14072b, (VoicePickerTab) this.f14073c, (VoicePickerContract.State) obj);
                return handleSelectTab$lambda$0;
            case 18:
                sources$lambda$0 = RevenueCatPaywallViewModel.setSources$lambda$0((ProductsService.PaywallSource) this.f14072b, (Analytics.Event.PaywallSource) this.f14073c, (RevenueCatPaywallState) obj);
                return sources$lambda$0;
            case 19:
                purchaseError$lambda$0 = RevenueCatPaywallViewModel.purchaseError$lambda$0((RevenueCatPaywallViewModel) this.f14072b, (PurchasesError) this.f14073c, (RevenueCatPaywallState) obj);
                return purchaseError$lambda$0;
            case 20:
                purchaseInitiated$lambda$0 = RevenueCatPaywallViewModel.purchaseInitiated$lambda$0((RevenueCatPaywallViewModel) this.f14072b, (Package) this.f14073c, (RevenueCatPaywallState) obj);
                return purchaseInitiated$lambda$0;
            case 21:
                purchaseCompleted$lambda$0 = RevenueCatPaywallViewModel.purchaseCompleted$lambda$0((RevenueCatPaywallViewModel) this.f14072b, (StoreTransaction) this.f14073c, (RevenueCatPaywallState) obj);
                return purchaseCompleted$lambda$0;
            case 22:
                return ScrollingHeaderBoxKt.b((l) this.f14072b, (x0) this.f14073c, (f0) obj);
            case 23:
                return BottomSheetScaffoldKt$BottomSheetScaffold$control$1$1.a((u5) this.f14072b, (s2) this.f14073c, (Throwable) obj);
            case 24:
                autofill$lambda$0$1$0 = AutofillExtensionsKt.autofill$lambda$0$1$0((j3.i) this.f14072b, (j3.l) this.f14073c, (n3.z) obj);
                return autofill$lambda$0$1$0;
            case 25:
                k.b bVar = (k.b) this.f14072b;
                j.e eVar = (j.e) this.f14073c;
                bVar.a(eVar);
                return new a3(bVar, eVar, 4);
            case 26:
                k.b bVar2 = (k.b) this.f14072b;
                j.g gVar = (j.g) this.f14073c;
                bVar2.a(gVar);
                return new a3(bVar2, gVar, 5);
            case 27:
                h0 h0Var = (h0) this.f14072b;
                j1.f0 f0Var = (j1.f0) this.f14073c;
                h0Var.f18247a.b(f0Var);
                h0Var.f18248b.setValue(Boolean.TRUE);
                return new a3(h0Var, f0Var, 6);
            case 28:
                g0.D((d0) this.f14072b, null, e0.f9815d, new s1((u1) this.f14073c, null), 1);
                return new Object();
            default:
                u1 u1Var = (u1) this.f14072b;
                u1 u1Var2 = (u1) this.f14073c;
                u1Var.f18420j.add(u1Var2);
                return new a3(u1Var, u1Var2, 7);
        }
    }
}
