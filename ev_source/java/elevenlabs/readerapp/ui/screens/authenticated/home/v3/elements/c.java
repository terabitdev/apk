package io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.elements;

import ho.l;
import ho.p;
import i1.j2;
import i1.o;
import i3.t;
import io.elevenlabs.domain.model.home.HomePageV3;
import io.elevenlabs.domain.model.home.HomePageV4;
import io.elevenlabs.readerapp.ui.screens.authenticated.home.v4.elements.HomeActionListSectionKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.home.v4.elements.HomeHeroCarouselSectionKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.ContentSearchSheetKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.ContentSearchState;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.SleepTimerSheetKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.SleepTimerState;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.SleepTimerViewModel;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.soundscapes.SoundscapesContract;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.soundscapes.SoundscapesScreenKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.collection.VoicePickerCollectionRoute;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.collection.VoicePickerCollectionScreenKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.collection.VoicePickerCollectionViewModel;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.root.VoicePickerHeaderKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.pronunciations.PronunciationScreenKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.pronunciations.PronunciationScreenMode;
import io.elevenlabs.readerapp.ui.screens.authenticated.pronunciations.PronunciationViewModel;
import io.elevenlabs.readerapp.ui.screens.authenticated.purchases.BookRefundScreenKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.purchases.BookRefundState;
import io.elevenlabs.readerapp.ui.screens.authenticated.purchases.BookRefundViewModel;
import io.elevenlabs.readerapp.ui.screens.authenticated.purchases.HoursLowScreenKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.purchases.HoursLowViewModel;
import io.elevenlabs.readerapp.ui.screens.authenticated.purchases.ReferFriendScreenKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.purchases.ReferFriendState;
import io.elevenlabs.readerapp.ui.screens.authenticated.purchases.UseFriendReferralScreenKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.purchases.UseFriendReferralState;
import io.elevenlabs.readerapp.ui.screens.authenticated.purchases.UseFriendReferralViewModel;
import io.elevenlabs.readerapp.ui.screens.authenticated.purchases.hourshistory.HoursHistoryScreenKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.purchases.hourshistory.HoursHistoryViewModel;
import io.elevenlabs.readerapp.ui.screens.authenticated.purchases.paywall.RevenueCatPaywallScreenKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.purchases.paywall.RevenueCatPaywallState;
import io.elevenlabs.readerapp.ui.screens.authenticated.reads.AddSharedReadScreenKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.reads.AddSharedReadState;
import io.elevenlabs.readerapp.ui.screens.authenticated.reads.GenFMLoadingScreenKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.reads.GenFMLoadingState;
import io.elevenlabs.readerapp.ui.screens.authenticated.reads.PasteLinkScreenKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.reads.PasteLinkViewModel;
import io.elevenlabs.readerapp.ui.screens.authenticated.reads.RateTitleSheetKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.reads.RateTitleViewModel;
import io.elevenlabs.readerapp.ui.screens.authenticated.reads.ReadShareDetailsScreenKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.reads.ReadShareDetailsState;
import io.elevenlabs.readerapp.ui.screens.authenticated.reads.ReadShareDetailsViewModel;
import io.elevenlabs.readerapp.ui.screens.authenticated.report.ReportProblemBottomSheetKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.report.ReportProblemState;
import io.elevenlabs.readerapp.ui.screens.authenticated.voices.voicedesign.VoiceDesignPrompt;
import io.elevenlabs.readerapp.ui.screens.authenticated.voices.voicedesign.steps.VoicePromptStepKt;
import io.elevenlabs.ui.components.ChipGroupKt;
import io.elevenlabs.ui.components.MetaChipKt;
import io.elevenlabs.ui.components.MetaChipVariant;
import r1.z1;
import sn.z;
import u2.m;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class c implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15625a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f15626b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f15627c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f15628d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f15629e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f15630f;

    public /* synthetic */ c(ho.a aVar, Object obj, Object obj2, int i10, int i11, int i12) {
        this.f15625a = i12;
        this.f15630f = aVar;
        this.f15629e = obj;
        this.f15626b = obj2;
        this.f15627c = i10;
        this.f15628d = i11;
    }

    @Override // ho.p
    public final Object invoke(Object obj, Object obj2) {
        z HomeActionItemV3$lambda$2;
        z HomeActionListSectionV3$lambda$1;
        z HomeActionListSectionV4$lambda$1;
        z ContentSearchBottomSheetUI$lambda$3;
        z SleepTimerSheet$lambda$3;
        z SleepTimerSheetUI$lambda$3;
        z SoundscapeList$lambda$1;
        z VoicePickerCollectionScreen$lambda$5;
        z SearchHeader$lambda$5;
        z PronunciationScreen$lambda$4;
        z BookRefundScreenUI$lambda$4;
        z BookRefundScreen$lambda$3;
        z HoursLowScreen$lambda$2;
        z ReferFriendScreenUI$lambda$4;
        z UseFriendReferralScreenUI$lambda$4;
        z UseFriendReferralScreen$lambda$4;
        z HoursHistoryScreen$lambda$1;
        z RevenueCatPaywallScreenUI$lambda$3;
        z AddSharedReadScreenUI$lambda$4;
        z GenFMLoadingUI$lambda$7;
        z PasteLinkScreen$lambda$1;
        z RateTitleSheet$lambda$3;
        z ReadShareDetailsScreenUI$lambda$4;
        z ReadShareDetailsScreen$lambda$1;
        z ReportProblemBottomSheetUI$lambda$3;
        z PromptPill$lambda$3;
        z ChipGroup$lambda$5;
        z MetaChipUi$lambda$1;
        z MetaChip$lambda$3;
        switch (this.f15625a) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                HomeActionItemV3$lambda$2 = HomeActionListSectionV2Kt.HomeActionItemV3$lambda$2((HomePageV3.Section.HomeActionList.HomeActionItem) this.f15629e, (ho.a) this.f15630f, (t) this.f15626b, this.f15627c, this.f15628d, (m) obj, intValue);
                return HomeActionItemV3$lambda$2;
            case 1:
                int intValue2 = ((Integer) obj2).intValue();
                HomeActionListSectionV3$lambda$1 = HomeActionListSectionV2Kt.HomeActionListSectionV3$lambda$1((HomePageV3.Section.HomeActionList) this.f15629e, (l) this.f15630f, (t) this.f15626b, this.f15627c, this.f15628d, (m) obj, intValue2);
                return HomeActionListSectionV3$lambda$1;
            case 2:
                int intValue3 = ((Integer) obj2).intValue();
                HomeActionListSectionV4$lambda$1 = HomeActionListSectionKt.HomeActionListSectionV4$lambda$1((HomePageV4.Section.HomeActionList) this.f15629e, (l) this.f15630f, (t) this.f15626b, this.f15627c, this.f15628d, (m) obj, intValue3);
                return HomeActionListSectionV4$lambda$1;
            case 3:
                int intValue4 = ((Integer) obj2).intValue();
                return HomeHeroCarouselSectionKt.a((HomePageV4.Section.HeroCarousel) this.f15629e, (l) this.f15630f, (t) this.f15626b, this.f15627c, this.f15628d, (m) obj, intValue4);
            case 4:
                int intValue5 = ((Integer) obj2).intValue();
                ContentSearchBottomSheetUI$lambda$3 = ContentSearchSheetKt.ContentSearchBottomSheetUI$lambda$3((ContentSearchState) this.f15629e, (l) this.f15630f, (l) this.f15626b, this.f15627c, this.f15628d, (m) obj, intValue5);
                return ContentSearchBottomSheetUI$lambda$3;
            case 5:
                int intValue6 = ((Integer) obj2).intValue();
                SleepTimerSheet$lambda$3 = SleepTimerSheetKt.SleepTimerSheet$lambda$3((ho.a) this.f15630f, (String) this.f15629e, (SleepTimerViewModel) this.f15626b, this.f15627c, this.f15628d, (m) obj, intValue6);
                return SleepTimerSheet$lambda$3;
            case 6:
                int intValue7 = ((Integer) obj2).intValue();
                SleepTimerSheetUI$lambda$3 = SleepTimerSheetKt.SleepTimerSheetUI$lambda$3((ho.a) this.f15630f, (l) this.f15629e, (SleepTimerState) this.f15626b, this.f15627c, this.f15628d, (m) obj, intValue7);
                return SleepTimerSheetUI$lambda$3;
            case 7:
                int intValue8 = ((Integer) obj2).intValue();
                SoundscapeList$lambda$1 = SoundscapesScreenKt.SoundscapeList$lambda$1((SoundscapesContract.State) this.f15629e, (l) this.f15630f, (t) this.f15626b, this.f15627c, this.f15628d, (m) obj, intValue8);
                return SoundscapeList$lambda$1;
            case 8:
                int intValue9 = ((Integer) obj2).intValue();
                VoicePickerCollectionScreen$lambda$5 = VoicePickerCollectionScreenKt.VoicePickerCollectionScreen$lambda$5((VoicePickerCollectionRoute) this.f15629e, (ho.a) this.f15630f, (VoicePickerCollectionViewModel) this.f15626b, this.f15627c, this.f15628d, (m) obj, intValue9);
                return VoicePickerCollectionScreen$lambda$5;
            case 9:
                int intValue10 = ((Integer) obj2).intValue();
                SearchHeader$lambda$5 = VoicePickerHeaderKt.SearchHeader$lambda$5((l) this.f15629e, (j2) this.f15630f, (o) this.f15626b, this.f15627c, this.f15628d, (m) obj, intValue10);
                return SearchHeader$lambda$5;
            case 10:
                int intValue11 = ((Integer) obj2).intValue();
                PronunciationScreen$lambda$4 = PronunciationScreenKt.PronunciationScreen$lambda$4((PronunciationScreenMode) this.f15629e, (ho.a) this.f15630f, (PronunciationViewModel) this.f15626b, this.f15627c, this.f15628d, (m) obj, intValue11);
                return PronunciationScreen$lambda$4;
            case 11:
                int intValue12 = ((Integer) obj2).intValue();
                BookRefundScreenUI$lambda$4 = BookRefundScreenKt.BookRefundScreenUI$lambda$4((BookRefundState) this.f15629e, (ho.a) this.f15630f, (l) this.f15626b, this.f15627c, this.f15628d, (m) obj, intValue12);
                return BookRefundScreenUI$lambda$4;
            case 12:
                int intValue13 = ((Integer) obj2).intValue();
                BookRefundScreen$lambda$3 = BookRefundScreenKt.BookRefundScreen$lambda$3((String) this.f15629e, (ho.a) this.f15630f, (BookRefundViewModel) this.f15626b, this.f15627c, this.f15628d, (m) obj, intValue13);
                return BookRefundScreen$lambda$3;
            case 13:
                int intValue14 = ((Integer) obj2).intValue();
                HoursLowScreen$lambda$2 = HoursLowScreenKt.HoursLowScreen$lambda$2((l) this.f15629e, (ho.a) this.f15630f, (HoursLowViewModel) this.f15626b, this.f15627c, this.f15628d, (m) obj, intValue14);
                return HoursLowScreen$lambda$2;
            case 14:
                int intValue15 = ((Integer) obj2).intValue();
                ReferFriendScreenUI$lambda$4 = ReferFriendScreenKt.ReferFriendScreenUI$lambda$4((ReferFriendState) this.f15629e, (l) this.f15626b, (ho.a) this.f15630f, this.f15627c, this.f15628d, (m) obj, intValue15);
                return ReferFriendScreenUI$lambda$4;
            case 15:
                int intValue16 = ((Integer) obj2).intValue();
                UseFriendReferralScreenUI$lambda$4 = UseFriendReferralScreenKt.UseFriendReferralScreenUI$lambda$4((UseFriendReferralState) this.f15629e, (l) this.f15626b, (ho.a) this.f15630f, this.f15627c, this.f15628d, (m) obj, intValue16);
                return UseFriendReferralScreenUI$lambda$4;
            case 16:
                int intValue17 = ((Integer) obj2).intValue();
                UseFriendReferralScreen$lambda$4 = UseFriendReferralScreenKt.UseFriendReferralScreen$lambda$4((String) this.f15629e, (ho.a) this.f15630f, (UseFriendReferralViewModel) this.f15626b, this.f15627c, this.f15628d, (m) obj, intValue17);
                return UseFriendReferralScreen$lambda$4;
            case 17:
                int intValue18 = ((Integer) obj2).intValue();
                HoursHistoryScreen$lambda$1 = HoursHistoryScreenKt.HoursHistoryScreen$lambda$1((ho.a) this.f15630f, (ho.a) this.f15629e, (HoursHistoryViewModel) this.f15626b, this.f15627c, this.f15628d, (m) obj, intValue18);
                return HoursHistoryScreen$lambda$1;
            case 18:
                int intValue19 = ((Integer) obj2).intValue();
                RevenueCatPaywallScreenUI$lambda$3 = RevenueCatPaywallScreenKt.RevenueCatPaywallScreenUI$lambda$3((RevenueCatPaywallState) this.f15629e, (l) this.f15630f, (l) this.f15626b, this.f15627c, this.f15628d, (m) obj, intValue19);
                return RevenueCatPaywallScreenUI$lambda$3;
            case 19:
                int intValue20 = ((Integer) obj2).intValue();
                AddSharedReadScreenUI$lambda$4 = AddSharedReadScreenKt.AddSharedReadScreenUI$lambda$4((AddSharedReadState) this.f15629e, (l) this.f15626b, (ho.a) this.f15630f, this.f15627c, this.f15628d, (m) obj, intValue20);
                return AddSharedReadScreenUI$lambda$4;
            case 20:
                int intValue21 = ((Integer) obj2).intValue();
                GenFMLoadingUI$lambda$7 = GenFMLoadingScreenKt.GenFMLoadingUI$lambda$7((GenFMLoadingState) this.f15629e, (l) this.f15626b, (ho.a) this.f15630f, this.f15627c, this.f15628d, (m) obj, intValue21);
                return GenFMLoadingUI$lambda$7;
            case 21:
                int intValue22 = ((Integer) obj2).intValue();
                PasteLinkScreen$lambda$1 = PasteLinkScreenKt.PasteLinkScreen$lambda$1((ho.a) this.f15630f, (l) this.f15629e, (PasteLinkViewModel) this.f15626b, this.f15627c, this.f15628d, (m) obj, intValue22);
                return PasteLinkScreen$lambda$1;
            case 22:
                int intValue23 = ((Integer) obj2).intValue();
                RateTitleSheet$lambda$3 = RateTitleSheetKt.RateTitleSheet$lambda$3((String) this.f15629e, (l) this.f15630f, (RateTitleViewModel) this.f15626b, this.f15627c, this.f15628d, (m) obj, intValue23);
                return RateTitleSheet$lambda$3;
            case 23:
                int intValue24 = ((Integer) obj2).intValue();
                ReadShareDetailsScreenUI$lambda$4 = ReadShareDetailsScreenKt.ReadShareDetailsScreenUI$lambda$4((ReadShareDetailsState) this.f15629e, (ho.a) this.f15630f, (t) this.f15626b, this.f15627c, this.f15628d, (m) obj, intValue24);
                return ReadShareDetailsScreenUI$lambda$4;
            case 24:
                int intValue25 = ((Integer) obj2).intValue();
                ReadShareDetailsScreen$lambda$1 = ReadShareDetailsScreenKt.ReadShareDetailsScreen$lambda$1((String) this.f15629e, (ho.a) this.f15630f, (ReadShareDetailsViewModel) this.f15626b, this.f15627c, this.f15628d, (m) obj, intValue25);
                return ReadShareDetailsScreen$lambda$1;
            case 25:
                int intValue26 = ((Integer) obj2).intValue();
                ReportProblemBottomSheetUI$lambda$3 = ReportProblemBottomSheetKt.ReportProblemBottomSheetUI$lambda$3((ReportProblemState) this.f15629e, (l) this.f15630f, (l) this.f15626b, this.f15627c, this.f15628d, (m) obj, intValue26);
                return ReportProblemBottomSheetUI$lambda$3;
            case 26:
                int intValue27 = ((Integer) obj2).intValue();
                PromptPill$lambda$3 = VoicePromptStepKt.PromptPill$lambda$3((VoiceDesignPrompt) this.f15629e, (ho.a) this.f15630f, (t) this.f15626b, this.f15627c, this.f15628d, (m) obj, intValue27);
                return PromptPill$lambda$3;
            case 27:
                int intValue28 = ((Integer) obj2).intValue();
                ChipGroup$lambda$5 = ChipGroupKt.ChipGroup$lambda$5((t1.z) this.f15629e, (z1) this.f15630f, (l) this.f15626b, this.f15627c, this.f15628d, (m) obj, intValue28);
                return ChipGroup$lambda$5;
            case 28:
                int intValue29 = ((Integer) obj2).intValue();
                MetaChipUi$lambda$1 = MetaChipKt.MetaChipUi$lambda$1((String) this.f15629e, (p) this.f15630f, (MetaChipVariant) this.f15626b, this.f15627c, this.f15628d, (m) obj, intValue29);
                return MetaChipUi$lambda$1;
            default:
                int intValue30 = ((Integer) obj2).intValue();
                MetaChip$lambda$3 = MetaChipKt.MetaChip$lambda$3((String) this.f15629e, (String) this.f15630f, (MetaChipVariant) this.f15626b, this.f15627c, this.f15628d, (m) obj, intValue30);
                return MetaChip$lambda$3;
        }
    }

    public /* synthetic */ c(Object obj, l lVar, ho.a aVar, int i10, int i11, int i12) {
        this.f15625a = i12;
        this.f15629e = obj;
        this.f15626b = lVar;
        this.f15630f = aVar;
        this.f15627c = i10;
        this.f15628d = i11;
    }

    public /* synthetic */ c(Object obj, Object obj2, Object obj3, int i10, int i11, int i12) {
        this.f15625a = i12;
        this.f15629e = obj;
        this.f15630f = obj2;
        this.f15626b = obj3;
        this.f15627c = i10;
        this.f15628d = i11;
    }
}
