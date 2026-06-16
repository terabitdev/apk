package io.elevenlabs.readerapp.ui.screens.authenticated;

import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.created.VoicePickerCreatedScreenKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.created.VoicePickerCreatedViewModel;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.explore.VoicePickerExploreScreenKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.explore.VoicePickerExploreViewModel;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.favorites.VoicePickerFavoritesScreenKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.favorites.VoicePickerFavoritesViewModel;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.filter.VoicePickerFilteredListScreenKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.filter.VoicePickerFilteredListViewModel;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.recents.VoicePickerRecentsScreenKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.recents.VoicePickerRecentsViewModel;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.search.VoicePickerSearchListScreenKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.search.VoicePickerSearchListViewModel;
import io.elevenlabs.ui.components.BackButtonWithBackgroundKt;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class a1 implements ho.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14929a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f14930b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f14931c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f14932d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f14933e;

    public /* synthetic */ a1(ho.a aVar, float f10, int i10, int i11) {
        this.f14929a = 7;
        this.f14933e = aVar;
        this.f14930b = f10;
        this.f14931c = i10;
        this.f14932d = i11;
    }

    @Override // ho.p
    public final Object invoke(Object obj, Object obj2) {
        sn.z QuestionPageScaffold__orJrPs$lambda$1;
        sn.z VoicePickerCreatedScreen__orJrPs$lambda$3;
        sn.z VoicePickerExploreScreen__orJrPs$lambda$5;
        sn.z VoicePickerFavoritesScreen__orJrPs$lambda$3;
        sn.z VoicePickerFilteredListScreen__orJrPs$lambda$5;
        sn.z VoicePickerRecentsScreen__orJrPs$lambda$4;
        sn.z VoicePickerSearchListScreen__orJrPs$lambda$6;
        sn.z BackButtonWithBackground$lambda$0;
        switch (this.f14929a) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                QuestionPageScaffold__orJrPs$lambda$1 = OnboardingScreenKt.QuestionPageScaffold__orJrPs$lambda$1(this.f14930b, (ho.q) this.f14933e, this.f14931c, this.f14932d, (u2.m) obj, intValue);
                return QuestionPageScaffold__orJrPs$lambda$1;
            case 1:
                int intValue2 = ((Integer) obj2).intValue();
                VoicePickerCreatedScreen__orJrPs$lambda$3 = VoicePickerCreatedScreenKt.VoicePickerCreatedScreen__orJrPs$lambda$3(this.f14930b, (VoicePickerCreatedViewModel) this.f14933e, this.f14931c, this.f14932d, (u2.m) obj, intValue2);
                return VoicePickerCreatedScreen__orJrPs$lambda$3;
            case 2:
                int intValue3 = ((Integer) obj2).intValue();
                VoicePickerExploreScreen__orJrPs$lambda$5 = VoicePickerExploreScreenKt.VoicePickerExploreScreen__orJrPs$lambda$5(this.f14930b, (VoicePickerExploreViewModel) this.f14933e, this.f14931c, this.f14932d, (u2.m) obj, intValue3);
                return VoicePickerExploreScreen__orJrPs$lambda$5;
            case 3:
                int intValue4 = ((Integer) obj2).intValue();
                VoicePickerFavoritesScreen__orJrPs$lambda$3 = VoicePickerFavoritesScreenKt.VoicePickerFavoritesScreen__orJrPs$lambda$3(this.f14930b, (VoicePickerFavoritesViewModel) this.f14933e, this.f14931c, this.f14932d, (u2.m) obj, intValue4);
                return VoicePickerFavoritesScreen__orJrPs$lambda$3;
            case 4:
                int intValue5 = ((Integer) obj2).intValue();
                VoicePickerFilteredListScreen__orJrPs$lambda$5 = VoicePickerFilteredListScreenKt.VoicePickerFilteredListScreen__orJrPs$lambda$5(this.f14930b, (VoicePickerFilteredListViewModel) this.f14933e, this.f14931c, this.f14932d, (u2.m) obj, intValue5);
                return VoicePickerFilteredListScreen__orJrPs$lambda$5;
            case 5:
                int intValue6 = ((Integer) obj2).intValue();
                VoicePickerRecentsScreen__orJrPs$lambda$4 = VoicePickerRecentsScreenKt.VoicePickerRecentsScreen__orJrPs$lambda$4(this.f14930b, (VoicePickerRecentsViewModel) this.f14933e, this.f14931c, this.f14932d, (u2.m) obj, intValue6);
                return VoicePickerRecentsScreen__orJrPs$lambda$4;
            case 6:
                int intValue7 = ((Integer) obj2).intValue();
                VoicePickerSearchListScreen__orJrPs$lambda$6 = VoicePickerSearchListScreenKt.VoicePickerSearchListScreen__orJrPs$lambda$6(this.f14930b, (VoicePickerSearchListViewModel) this.f14933e, this.f14931c, this.f14932d, (u2.m) obj, intValue7);
                return VoicePickerSearchListScreen__orJrPs$lambda$6;
            default:
                int intValue8 = ((Integer) obj2).intValue();
                BackButtonWithBackground$lambda$0 = BackButtonWithBackgroundKt.BackButtonWithBackground$lambda$0((ho.a) this.f14933e, this.f14930b, this.f14931c, this.f14932d, (u2.m) obj, intValue8);
                return BackButtonWithBackground$lambda$0;
        }
    }

    public /* synthetic */ a1(float f10, Object obj, int i10, int i11, int i12) {
        this.f14929a = i12;
        this.f14930b = f10;
        this.f14933e = obj;
        this.f14931c = i10;
        this.f14932d = i11;
    }
}
