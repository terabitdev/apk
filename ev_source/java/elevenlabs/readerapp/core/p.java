package io.elevenlabs.readerapp.core;

import ho.q;
import i3.t;
import io.elevenlabs.domain.model.AuthorProfileSection;
import io.elevenlabs.domain.model.FlatCarouselSection;
import io.elevenlabs.domain.model.VoiceSection;
import io.elevenlabs.readerapp.ui.components.AuthorPictureKt;
import io.elevenlabs.readerapp.ui.components.AuthorPictureSize;
import io.elevenlabs.readerapp.ui.components.FlatCarouselSectionKt;
import io.elevenlabs.readerapp.ui.components.SeriesSectionKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.FollowedSeriesScreenKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.FollowedSeriesState;
import io.elevenlabs.readerapp.ui.screens.authenticated.FollowedSeriesViewModel;
import io.elevenlabs.readerapp.ui.screens.authenticated.OnboardingScreenKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.OnboardingType;
import io.elevenlabs.readerapp.ui.screens.authenticated.OnboardingViewModel;
import io.elevenlabs.readerapp.ui.screens.authenticated.account.ManageContentInterestsScreenKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.account.ManageContentInterestsViewModel;
import io.elevenlabs.readerapp.ui.screens.authenticated.account.delete.DeleteAccountScreenKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.account.delete.DeleteAccountViewModel;
import io.elevenlabs.readerapp.ui.screens.authenticated.account.explore.ExploreLanguageSettingScreenKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.account.explore.ExploreLanguageSettingScreenViewModel;
import io.elevenlabs.readerapp.ui.screens.authenticated.agent.AskAgentScreenKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.agent.AskAgentViewModel;
import io.elevenlabs.readerapp.ui.screens.authenticated.agent.components.AgentMessageRowKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.assistant.ChatMessage;
import io.elevenlabs.readerapp.ui.screens.authenticated.author.components.AuthorProfileHeaderKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.home.elements.DailyStreakSettingsScreenKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.home.elements.DailyStreakSettingsState;
import io.elevenlabs.readerapp.ui.screens.authenticated.home.elements.DailyStreakSettingsViewModel;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.PlayerPreferencesScreenKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.PlayerPreferencesViewModel;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.ExportSheetKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.soundscapes.SoundscapesScreenKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.soundscapes.SoundscapesViewModel;
import io.elevenlabs.readerapp.ui.screens.authenticated.purchases.ReferFriendScreenKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.purchases.ReferFriendViewModel;
import io.elevenlabs.readerapp.ui.screens.authenticated.reads.RateTitleSheetKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.reads.RateTitleState;
import io.elevenlabs.readerapp.ui.screens.authenticated.voices.elements.VoicesCarouselUIKt;
import io.elevenlabs.ui.components.BlurredImagePlaceholderKt;
import io.elevenlabs.ui.components.ErrorContainerKt;
import io.elevenlabs.ui.components.LabelSquareColor;
import io.elevenlabs.ui.components.LabelSquareKt;
import io.elevenlabs.ui.components.ZoomableBoxKt;
import io.elevenlabs.ui.components.scaffolds.CenteredContentScaffoldKt;
import p3.k0;
import rd.c1;
import sn.z;
import u2.r;
import w7.h1;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p implements ho.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14383a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f14384b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f14385c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f14386d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f14387e;

    public /* synthetic */ p(Object obj, ho.l lVar, int i10, int i11, int i12) {
        this.f14383a = i12;
        this.f14387e = obj;
        this.f14386d = lVar;
        this.f14384b = i10;
        this.f14385c = i11;
    }

    @Override // ho.p
    public final Object invoke(Object obj, Object obj2) {
        z ToastOverlay$lambda$1;
        z AuthorPictureFallback$lambda$1;
        z FlatCarouselSection$lambda$1;
        z SeriesSection$lambda$1;
        z FollowedSeriesScreen$lambda$1;
        z FollowedSeriesScreenUI$lambda$7;
        z OnboardingScreen$lambda$2;
        z ManageContentInterestsScreen$lambda$5;
        z DeleteAccountScreen$lambda$1;
        z ExploreLanguageSettingScreen$lambda$2;
        z AskAgentScreen$lambda$7;
        z AgentMessageRow$lambda$0;
        z DailyStreakSettingsScreenUI$lambda$6;
        z DailyStreakSettingsScreen$lambda$2;
        z PlayerPreferencesScreen$lambda$13;
        z ExportSheetUI$lambda$3;
        z SoundscapeControls$lambda$1;
        z SoundscapesScreen$lambda$3;
        z ReferFriendScreen$lambda$3;
        z RateTitleSheetUI$lambda$5;
        z ErrorContainer$lambda$3;
        z LabelSquare$lambda$1;
        z ZoomableBox$lambda$12;
        z CenteredContentBox$lambda$1;
        z AuthorProfileHeader$lambda$1;
        z VoicesCarouselUI$lambda$2;
        switch (this.f14383a) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                ToastOverlay$lambda$1 = ToastViewModelKt.ToastOverlay$lambda$1((ho.l) this.f14386d, (ToastViewModel) this.f14387e, this.f14384b, this.f14385c, (u2.m) obj, intValue);
                return ToastOverlay$lambda$1;
            case 1:
                int intValue2 = ((Integer) obj2).intValue();
                AuthorPictureFallback$lambda$1 = AuthorPictureKt.AuthorPictureFallback$lambda$1((AuthorPictureSize) this.f14386d, (t) this.f14387e, this.f14384b, this.f14385c, (u2.m) obj, intValue2);
                return AuthorPictureFallback$lambda$1;
            case 2:
                int intValue3 = ((Integer) obj2).intValue();
                FlatCarouselSection$lambda$1 = FlatCarouselSectionKt.FlatCarouselSection$lambda$1((FlatCarouselSection) this.f14386d, (t) this.f14387e, this.f14384b, this.f14385c, (u2.m) obj, intValue3);
                return FlatCarouselSection$lambda$1;
            case 3:
                int intValue4 = ((Integer) obj2).intValue();
                SeriesSection$lambda$1 = SeriesSectionKt.SeriesSection$lambda$1((AuthorProfileSection.Series) this.f14386d, (t) this.f14387e, this.f14384b, this.f14385c, (u2.m) obj, intValue4);
                return SeriesSection$lambda$1;
            case 4:
                int intValue5 = ((Integer) obj2).intValue();
                FollowedSeriesScreen$lambda$1 = FollowedSeriesScreenKt.FollowedSeriesScreen$lambda$1((ho.a) this.f14386d, (FollowedSeriesViewModel) this.f14387e, this.f14384b, this.f14385c, (u2.m) obj, intValue5);
                return FollowedSeriesScreen$lambda$1;
            case 5:
                int intValue6 = ((Integer) obj2).intValue();
                FollowedSeriesScreenUI$lambda$7 = FollowedSeriesScreenKt.FollowedSeriesScreenUI$lambda$7((FollowedSeriesState) this.f14386d, (ho.a) this.f14387e, this.f14384b, this.f14385c, (u2.m) obj, intValue6);
                return FollowedSeriesScreenUI$lambda$7;
            case 6:
                int intValue7 = ((Integer) obj2).intValue();
                OnboardingScreen$lambda$2 = OnboardingScreenKt.OnboardingScreen$lambda$2((OnboardingViewModel) this.f14386d, (OnboardingType) this.f14387e, this.f14384b, this.f14385c, (u2.m) obj, intValue7);
                return OnboardingScreen$lambda$2;
            case 7:
                int intValue8 = ((Integer) obj2).intValue();
                ManageContentInterestsScreen$lambda$5 = ManageContentInterestsScreenKt.ManageContentInterestsScreen$lambda$5((ho.a) this.f14386d, (ManageContentInterestsViewModel) this.f14387e, this.f14384b, this.f14385c, (u2.m) obj, intValue8);
                return ManageContentInterestsScreen$lambda$5;
            case 8:
                int intValue9 = ((Integer) obj2).intValue();
                DeleteAccountScreen$lambda$1 = DeleteAccountScreenKt.DeleteAccountScreen$lambda$1((ho.a) this.f14386d, (DeleteAccountViewModel) this.f14387e, this.f14384b, this.f14385c, (u2.m) obj, intValue9);
                return DeleteAccountScreen$lambda$1;
            case 9:
                int intValue10 = ((Integer) obj2).intValue();
                ExploreLanguageSettingScreen$lambda$2 = ExploreLanguageSettingScreenKt.ExploreLanguageSettingScreen$lambda$2((ho.a) this.f14386d, (ExploreLanguageSettingScreenViewModel) this.f14387e, this.f14384b, this.f14385c, (u2.m) obj, intValue10);
                return ExploreLanguageSettingScreen$lambda$2;
            case 10:
                int intValue11 = ((Integer) obj2).intValue();
                AskAgentScreen$lambda$7 = AskAgentScreenKt.AskAgentScreen$lambda$7((ho.a) this.f14386d, (AskAgentViewModel) this.f14387e, this.f14384b, this.f14385c, (u2.m) obj, intValue11);
                return AskAgentScreen$lambda$7;
            case 11:
                int intValue12 = ((Integer) obj2).intValue();
                AgentMessageRow$lambda$0 = AgentMessageRowKt.AgentMessageRow$lambda$0((ChatMessage) this.f14386d, (t) this.f14387e, this.f14384b, this.f14385c, (u2.m) obj, intValue12);
                return AgentMessageRow$lambda$0;
            case 12:
                int intValue13 = ((Integer) obj2).intValue();
                DailyStreakSettingsScreenUI$lambda$6 = DailyStreakSettingsScreenKt.DailyStreakSettingsScreenUI$lambda$6((DailyStreakSettingsState) this.f14387e, (ho.l) this.f14386d, this.f14384b, this.f14385c, (u2.m) obj, intValue13);
                return DailyStreakSettingsScreenUI$lambda$6;
            case 13:
                int intValue14 = ((Integer) obj2).intValue();
                DailyStreakSettingsScreen$lambda$2 = DailyStreakSettingsScreenKt.DailyStreakSettingsScreen$lambda$2((ho.a) this.f14386d, (DailyStreakSettingsViewModel) this.f14387e, this.f14384b, this.f14385c, (u2.m) obj, intValue14);
                return DailyStreakSettingsScreen$lambda$2;
            case 14:
                int intValue15 = ((Integer) obj2).intValue();
                PlayerPreferencesScreen$lambda$13 = PlayerPreferencesScreenKt.PlayerPreferencesScreen$lambda$13((ho.a) this.f14386d, (PlayerPreferencesViewModel) this.f14387e, this.f14384b, this.f14385c, (u2.m) obj, intValue15);
                return PlayerPreferencesScreen$lambda$13;
            case 15:
                int intValue16 = ((Integer) obj2).intValue();
                ExportSheetUI$lambda$3 = ExportSheetKt.ExportSheetUI$lambda$3((ho.a) this.f14387e, (ho.l) this.f14386d, this.f14384b, this.f14385c, (u2.m) obj, intValue16);
                return ExportSheetUI$lambda$3;
            case 16:
                int intValue17 = ((Integer) obj2).intValue();
                SoundscapeControls$lambda$1 = SoundscapesScreenKt.SoundscapeControls$lambda$1((ho.l) this.f14386d, (t) this.f14387e, this.f14384b, this.f14385c, (u2.m) obj, intValue17);
                return SoundscapeControls$lambda$1;
            case 17:
                int intValue18 = ((Integer) obj2).intValue();
                SoundscapesScreen$lambda$3 = SoundscapesScreenKt.SoundscapesScreen$lambda$3((SoundscapesViewModel) this.f14386d, (ho.a) this.f14387e, this.f14384b, this.f14385c, (u2.m) obj, intValue18);
                return SoundscapesScreen$lambda$3;
            case 18:
                int intValue19 = ((Integer) obj2).intValue();
                ReferFriendScreen$lambda$3 = ReferFriendScreenKt.ReferFriendScreen$lambda$3((ho.a) this.f14386d, (ReferFriendViewModel) this.f14387e, this.f14384b, this.f14385c, (u2.m) obj, intValue19);
                return ReferFriendScreen$lambda$3;
            case 19:
                int intValue20 = ((Integer) obj2).intValue();
                RateTitleSheetUI$lambda$5 = RateTitleSheetKt.RateTitleSheetUI$lambda$5((RateTitleState) this.f14387e, (ho.l) this.f14386d, this.f14384b, this.f14385c, (u2.m) obj, intValue20);
                return RateTitleSheetUI$lambda$5;
            case 20:
                int intValue21 = ((Integer) obj2).intValue();
                return BlurredImagePlaceholderKt.a((k0) this.f14386d, (t) this.f14387e, this.f14384b, this.f14385c, (u2.m) obj, intValue21);
            case 21:
                int intValue22 = ((Integer) obj2).intValue();
                ErrorContainer$lambda$3 = ErrorContainerKt.ErrorContainer$lambda$3((i3.f) this.f14386d, (q) this.f14387e, this.f14384b, this.f14385c, (u2.m) obj, intValue22);
                return ErrorContainer$lambda$3;
            case 22:
                int intValue23 = ((Integer) obj2).intValue();
                LabelSquare$lambda$1 = LabelSquareKt.LabelSquare$lambda$1((String) this.f14386d, (LabelSquareColor) this.f14387e, this.f14384b, this.f14385c, (u2.m) obj, intValue23);
                return LabelSquare$lambda$1;
            case 23:
                int intValue24 = ((Integer) obj2).intValue();
                ZoomableBox$lambda$12 = ZoomableBoxKt.ZoomableBox$lambda$12((t) this.f14386d, (q) this.f14387e, this.f14384b, this.f14385c, (u2.m) obj, intValue24);
                return ZoomableBox$lambda$12;
            case 24:
                int intValue25 = ((Integer) obj2).intValue();
                CenteredContentBox$lambda$1 = CenteredContentScaffoldKt.CenteredContentBox$lambda$1((t) this.f14386d, (ho.p) this.f14387e, this.f14384b, this.f14385c, (u2.m) obj, intValue25);
                return CenteredContentBox$lambda$1;
            case 25:
                int intValue26 = ((Integer) obj2).intValue();
                AuthorProfileHeader$lambda$1 = AuthorProfileHeaderKt.AuthorProfileHeader$lambda$1((AuthorProfileSection.Header) this.f14386d, (t) this.f14387e, this.f14384b, this.f14385c, (u2.m) obj, intValue26);
                return AuthorProfileHeader$lambda$1;
            case 26:
                ((Integer) obj2).getClass();
                int M = r.M(this.f14385c | 1);
                c1.f((h1) this.f14386d, (t) this.f14387e, this.f14384b, (u2.m) obj, M);
                return z.f31622a;
            default:
                int intValue27 = ((Integer) obj2).intValue();
                VoicesCarouselUI$lambda$2 = VoicesCarouselUIKt.VoicesCarouselUI$lambda$2((VoiceSection.VoiceCarouselSection) this.f14387e, (ho.l) this.f14386d, this.f14384b, this.f14385c, (u2.m) obj, intValue27);
                return VoicesCarouselUI$lambda$2;
        }
    }

    public /* synthetic */ p(Object obj, Object obj2, int i10, int i11, int i12) {
        this.f14383a = i12;
        this.f14386d = obj;
        this.f14387e = obj2;
        this.f14384b = i10;
        this.f14385c = i11;
    }
}
