package io.elevenlabs.readerapp.core;

import ho.r;
import i1.j2;
import i4.q2;
import io.elevenlabs.domain.model.BluetoothButtonAction;
import io.elevenlabs.domain.model.Bookmark;
import io.elevenlabs.domain.model.ExploreVoiceSections;
import io.elevenlabs.domain.model.NotificationPrimerModel;
import io.elevenlabs.domain.model.NotificationPrimerSource;
import io.elevenlabs.domain.model.SkipDuration;
import io.elevenlabs.readerapp.core.Survey;
import io.elevenlabs.readerapp.core.router.RouterKt;
import io.elevenlabs.readerapp.core.router.RouterViewModel;
import io.elevenlabs.readerapp.ui.screens.authenticated.NotificationPrimerBottomSheetKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.NotificationPrimerViewModel;
import io.elevenlabs.readerapp.ui.screens.authenticated.bookmarks.BookmarkSheetKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.bookmarks.BookmarkViewModel;
import io.elevenlabs.readerapp.ui.screens.authenticated.collections.AddReadToCollectionScreenKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.collections.AddReadToCollectionState;
import io.elevenlabs.readerapp.ui.screens.authenticated.collections.AddReadToCollectionViewModel;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.InAppSkipDirection;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.BluetoothActionSelectorSheetKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.BookmarksSheetKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.ContentSearchSheetKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.ContentSearchState;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.ContentSearchViewModel;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.InAppSkipDurationSelectorSheetKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.ReadBookmarksState;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.ReadBookmarksViewModel;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.sections.VoicePickerExploreFeaturedSectionKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.sections.VoicePickerExploreGridSectionKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.shared.VoicePickerSharedContract;
import io.elevenlabs.readerapp.ui.screens.authenticated.purchases.BookRefundScreenKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.purchases.BookRefundState;
import io.elevenlabs.readerapp.ui.screens.authenticated.report.ReportProblemBottomSheetKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.report.ReportProblemState;
import io.elevenlabs.readerapp.ui.screens.authenticated.report.ReportProblemViewModel;
import io.elevenlabs.readerapp.ui.screens.authenticated.voices.voicedesign.VoiceDesignContract;
import io.elevenlabs.readerapp.ui.screens.authenticated.voices.voicedesign.steps.SelectPreviewStepKt;
import io.elevenlabs.ui.components.scaffolds.BottomSheetControl;
import java.util.ArrayList;
import java.util.List;
import na.c0;
import r1.y;
import sn.z;
import u2.z0;
import w1.w;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h implements r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14360a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14361b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f14362c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f14363d;

    public /* synthetic */ h(AddReadToCollectionState addReadToCollectionState, AddReadToCollectionViewModel addReadToCollectionViewModel, ho.a aVar) {
        this.f14360a = 6;
        this.f14362c = addReadToCollectionState;
        this.f14363d = addReadToCollectionViewModel;
        this.f14361b = aVar;
    }

    @Override // ho.r
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        z SurveySheet$lambda$1;
        z SurveySheetUI$lambda$3$0$0$1;
        z Router$lambda$20$0$4$0$0$49;
        z Router$lambda$20$0$4$0$0$117;
        z NotificationPrimerBottomSheet$lambda$0;
        z BookmarkSheet$lambda$2;
        z AddReadToCollectionSheet$lambda$2;
        z BluetoothActionSelectorSheet$lambda$0;
        z BookmarksSheet$lambda$2;
        z ContentSearchSheet$lambda$1;
        z InAppSkipDurationSelectorSheet$lambda$0;
        z voicePickerExploreFeaturedSection$lambda$1$1;
        z HorizontalVoicesList$lambda$1;
        z BookRefundScreenUI$lambda$3$0$10;
        z ReportProblemBottomSheet$lambda$1;
        z SelectPreviewStep$lambda$0$0$0$2;
        switch (this.f14360a) {
            case 0:
                SurveySheet$lambda$1 = SurveySheetKt.SurveySheet$lambda$1((SurveyState) this.f14362c, (ho.a) this.f14361b, (SurveyViewModel) this.f14363d, (y) obj, (BottomSheetControl) obj2, (u2.m) obj3, ((Integer) obj4).intValue());
                return SurveySheet$lambda$1;
            case 1:
                SurveySheetUI$lambda$3$0$0$1 = SurveySheetKt.SurveySheetUI$lambda$3$0$0$1((ho.l) this.f14362c, (ho.a) this.f14361b, (ho.a) this.f14363d, (i1.o) obj, (Survey.Question) obj2, (u2.m) obj3, ((Integer) obj4).intValue());
                return SurveySheetUI$lambda$3$0$0$1;
            case 2:
                Router$lambda$20$0$4$0$0$49 = RouterKt.Router$lambda$20$0$4$0$0$49((c0) this.f14362c, (q2) this.f14361b, (RouterViewModel) this.f14363d, (i1.o) obj, (na.j) obj2, (u2.m) obj3, ((Integer) obj4).intValue());
                return Router$lambda$20$0$4$0$0$49;
            case 3:
                Router$lambda$20$0$4$0$0$117 = RouterKt.Router$lambda$20$0$4$0$0$117((c0) this.f14362c, (j2) this.f14361b, (RouterViewModel) this.f14363d, (i1.o) obj, (na.j) obj2, (u2.m) obj3, ((Integer) obj4).intValue());
                return Router$lambda$20$0$4$0$0$117;
            case 4:
                NotificationPrimerBottomSheet$lambda$0 = NotificationPrimerBottomSheetKt.NotificationPrimerBottomSheet$lambda$0((NotificationPrimerModel) this.f14362c, (NotificationPrimerSource) this.f14361b, (NotificationPrimerViewModel) this.f14363d, (y) obj, (BottomSheetControl) obj2, (u2.m) obj3, ((Integer) obj4).intValue());
                return NotificationPrimerBottomSheet$lambda$0;
            case 5:
                BookmarkSheet$lambda$2 = BookmarkSheetKt.BookmarkSheet$lambda$2((Bookmark) this.f14362c, (BookmarkViewModel) this.f14361b, (ho.l) this.f14363d, (y) obj, (BottomSheetControl) obj2, (u2.m) obj3, ((Integer) obj4).intValue());
                return BookmarkSheet$lambda$2;
            case 6:
                AddReadToCollectionSheet$lambda$2 = AddReadToCollectionScreenKt.AddReadToCollectionSheet$lambda$2((AddReadToCollectionState) this.f14362c, (AddReadToCollectionViewModel) this.f14363d, (ho.a) this.f14361b, (y) obj, (BottomSheetControl) obj2, (u2.m) obj3, ((Integer) obj4).intValue());
                return AddReadToCollectionSheet$lambda$2;
            case 7:
                BluetoothActionSelectorSheet$lambda$0 = BluetoothActionSelectorSheetKt.BluetoothActionSelectorSheet$lambda$0((List) this.f14362c, (BluetoothButtonAction) this.f14361b, (ho.l) this.f14363d, (y) obj, (BottomSheetControl) obj2, (u2.m) obj3, ((Integer) obj4).intValue());
                return BluetoothActionSelectorSheet$lambda$0;
            case 8:
                BookmarksSheet$lambda$2 = BookmarksSheetKt.BookmarksSheet$lambda$2((ReadBookmarksState) this.f14362c, (ho.l) this.f14361b, (ReadBookmarksViewModel) this.f14363d, (y) obj, (BottomSheetControl) obj2, (u2.m) obj3, ((Integer) obj4).intValue());
                return BookmarksSheet$lambda$2;
            case 9:
                ContentSearchSheet$lambda$1 = ContentSearchSheetKt.ContentSearchSheet$lambda$1((ContentSearchState) this.f14362c, (ContentSearchViewModel) this.f14361b, (ho.l) this.f14363d, (y) obj, (BottomSheetControl) obj2, (u2.m) obj3, ((Integer) obj4).intValue());
                return ContentSearchSheet$lambda$1;
            case 10:
                InAppSkipDurationSelectorSheet$lambda$0 = InAppSkipDurationSelectorSheetKt.InAppSkipDurationSelectorSheet$lambda$0((InAppSkipDirection) this.f14362c, (SkipDuration) this.f14361b, (ho.l) this.f14363d, (y) obj, (BottomSheetControl) obj2, (u2.m) obj3, ((Integer) obj4).intValue());
                return InAppSkipDurationSelectorSheet$lambda$0;
            case 11:
                voicePickerExploreFeaturedSection$lambda$1$1 = VoicePickerExploreFeaturedSectionKt.voicePickerExploreFeaturedSection$lambda$1$1((ExploreVoiceSections.Section.FeaturedVoices) this.f14362c, (VoicePickerSharedContract.State) this.f14361b, (ho.l) this.f14363d, (w) obj, ((Integer) obj2).intValue(), (u2.m) obj3, ((Integer) obj4).intValue());
                return voicePickerExploreFeaturedSection$lambda$1$1;
            case 12:
                HorizontalVoicesList$lambda$1 = VoicePickerExploreGridSectionKt.HorizontalVoicesList$lambda$1((ArrayList) this.f14362c, (VoicePickerSharedContract.State) this.f14361b, (ho.l) this.f14363d, (w) obj, ((Integer) obj2).intValue(), (u2.m) obj3, ((Integer) obj4).intValue());
                return HorizontalVoicesList$lambda$1;
            case 13:
                BookRefundScreenUI$lambda$3$0$10 = BookRefundScreenKt.BookRefundScreenUI$lambda$3$0$10((z0) this.f14362c, (ho.l) this.f14361b, (BookRefundState) this.f14363d, (y) obj, (BottomSheetControl) obj2, (u2.m) obj3, ((Integer) obj4).intValue());
                return BookRefundScreenUI$lambda$3$0$10;
            case 14:
                ReportProblemBottomSheet$lambda$1 = ReportProblemBottomSheetKt.ReportProblemBottomSheet$lambda$1((ReportProblemState) this.f14362c, (ReportProblemViewModel) this.f14361b, (ho.l) this.f14363d, (y) obj, (BottomSheetControl) obj2, (u2.m) obj3, ((Integer) obj4).intValue());
                return ReportProblemBottomSheet$lambda$1;
            default:
                SelectPreviewStep$lambda$0$0$0$2 = SelectPreviewStepKt.SelectPreviewStep$lambda$0$0$0$2((List) this.f14362c, (VoiceDesignContract.State) this.f14361b, (ho.l) this.f14363d, (w) obj, ((Integer) obj2).intValue(), (u2.m) obj3, ((Integer) obj4).intValue());
                return SelectPreviewStep$lambda$0$0$0$2;
        }
    }

    public /* synthetic */ h(Object obj, Object obj2, Object obj3, int i10) {
        this.f14360a = i10;
        this.f14362c = obj;
        this.f14361b = obj2;
        this.f14363d = obj3;
    }
}
