package io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.sections;

import g3.y;
import ho.l;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.shared.VoicePickerSharedContract;
import io.elevenlabs.readerapp.ui.screens.authenticated.purchases.hourshistory.HoursHistoryScreenKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.purchases.hourshistory.HoursHistoryState;
import io.elevenlabs.readerapp.ui.screens.authenticated.purchases.hourshistory.HoursHistoryViewModel;
import io.elevenlabs.readerapp.ui.screens.authenticated.report.ReportProblemBottomSheetKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.report.ReportProblemViewModel;
import io.elevenlabs.readerapp.ui.screens.authenticated.series.ComposableSingletons$ExploreSeriesScreenKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.series.StackedBookCoversKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.voices.voicedesign.VoiceDesignContract;
import io.elevenlabs.readerapp.ui.screens.authenticated.voices.voicedesign.VoiceDesignPrompt;
import io.elevenlabs.readerapp.ui.screens.authenticated.voices.voicedesign.steps.ComposableSingletons$SaveVoiceStepKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.voices.voicedesign.steps.ComposableSingletons$SelectPreviewStepKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.voices.voicedesign.steps.ComposableSingletons$VoicePromptStepKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.voices.voicedesign.steps.VoicePromptStepKt;
import io.elevenlabs.ui.components.animations.AnimatedVisibilityContainersKt;
import io.elevenlabs.ui.extensions.ComposeExtensionsKt;
import j1.b1;
import j1.m;
import j1.u0;
import j1.z1;
import p4.b0;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class d implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16506a;

    public /* synthetic */ d(int i10) {
        this.f16506a = i10;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [sn.h, java.lang.Object] */
    @Override // ho.l
    public final Object invoke(Object obj) {
        z Preview_VoicePickerSectionsList$lambda$0$1$0;
        z HoursHistoryScreenUI$lambda$2$0;
        z HoursHistoryScreenUI$lambda$7$0$0$0$0;
        z HoursHistoryScreenUI$lambda$7$0$2$0$0;
        HoursHistoryState hoursHistoryState;
        z ReportProblemBottomSheetUI$lambda$2$0$0$0$0;
        z ReportProblemBottomSheetUI$lambda$1$0;
        z ReportProblemBottomSheetUI$lambda$0$0;
        z lambda__1737505919$lambda$0$1$0;
        z StackedBookCovers$lambda$0$0;
        z lambda__1453941496$lambda$0$0$0$0;
        z lambda__1404774262$lambda$0$0$0$0;
        z lambda__225759172$lambda$0$0$0$0;
        Object VoicePromptStep$lambda$0$5$0$0;
        int AnimatedSlideDownWithFadeVisibility$lambda$0$0;
        int AnimatedSlideDownWithFadeVisibility$lambda$1$0;
        int AnimatedSlideBottomVisibility$lambda$0$0;
        int AnimatedSlideBottomVisibility$lambda$1$0;
        int AnimatedSlideTopVisibility$lambda$0$0;
        int AnimatedSlideTopVisibility$lambda$1$0;
        int AnimatedSlideTopWithFadeVisibility$lambda$0$0;
        int AnimatedSlideTopWithFadeVisibility$lambda$1$0;
        z rememberPermissionsGranted$lambda$1$0;
        switch (this.f16506a) {
            case 0:
                Preview_VoicePickerSectionsList$lambda$0$1$0 = VoicePickerSectionsListKt.Preview_VoicePickerSectionsList$lambda$0$1$0((VoicePickerSharedContract.NavigationEvent) obj);
                return Preview_VoicePickerSectionsList$lambda$0$1$0;
            case 1:
                HoursHistoryScreenUI$lambda$2$0 = HoursHistoryScreenKt.HoursHistoryScreenUI$lambda$2$0((l) obj);
                return HoursHistoryScreenUI$lambda$2$0;
            case 2:
                HoursHistoryScreenUI$lambda$7$0$0$0$0 = HoursHistoryScreenKt.HoursHistoryScreenUI$lambda$7$0$0$0$0((HoursHistoryViewModel) obj);
                return HoursHistoryScreenUI$lambda$7$0$0$0$0;
            case 3:
                HoursHistoryScreenUI$lambda$7$0$2$0$0 = HoursHistoryScreenKt.HoursHistoryScreenUI$lambda$7$0$2$0$0((HoursHistoryViewModel) obj);
                return HoursHistoryScreenUI$lambda$7$0$2$0$0;
            case 4:
                hoursHistoryState = HoursHistoryViewModel.toggleExtraHoursExpanded$lambda$0((HoursHistoryState) obj);
                return hoursHistoryState;
            case 5:
                ReportProblemBottomSheetUI$lambda$2$0$0$0$0 = ReportProblemBottomSheetKt.ReportProblemBottomSheetUI$lambda$2$0$0$0$0((ReportProblemViewModel) obj);
                return ReportProblemBottomSheetUI$lambda$2$0$0$0$0;
            case 6:
                ReportProblemBottomSheetUI$lambda$1$0 = ReportProblemBottomSheetKt.ReportProblemBottomSheetUI$lambda$1$0((String) obj);
                return ReportProblemBottomSheetUI$lambda$1$0;
            case 7:
                ReportProblemBottomSheetUI$lambda$0$0 = ReportProblemBottomSheetKt.ReportProblemBottomSheetUI$lambda$0$0((l) obj);
                return ReportProblemBottomSheetUI$lambda$0$0;
            case 8:
                lambda__1737505919$lambda$0$1$0 = ComposableSingletons$ExploreSeriesScreenKt.lambda__1737505919$lambda$0$1$0((String) obj);
                return lambda__1737505919$lambda$0$1$0;
            case 9:
                StackedBookCovers$lambda$0$0 = StackedBookCoversKt.StackedBookCovers$lambda$0$0((b0) obj);
                return StackedBookCovers$lambda$0$0;
            case 10:
                lambda__1453941496$lambda$0$0$0$0 = ComposableSingletons$SaveVoiceStepKt.lambda__1453941496$lambda$0$0$0$0((VoiceDesignContract.Event) obj);
                return lambda__1453941496$lambda$0$0$0$0;
            case 11:
                lambda__1404774262$lambda$0$0$0$0 = ComposableSingletons$SaveVoiceStepKt.lambda__1404774262$lambda$0$0$0$0((VoiceDesignContract.Event) obj);
                return lambda__1404774262$lambda$0$0$0$0;
            case 12:
                lambda__225759172$lambda$0$0$0$0 = ComposableSingletons$SelectPreviewStepKt.lambda__225759172$lambda$0$0$0$0((VoiceDesignContract.Event) obj);
                return lambda__225759172$lambda$0$0$0$0;
            case 13:
                return ComposableSingletons$VoicePromptStepKt.c((VoiceDesignContract.Event) obj);
            case 14:
                return ComposableSingletons$VoicePromptStepKt.d((VoiceDesignContract.Event) obj);
            case 15:
                VoicePromptStep$lambda$0$5$0$0 = VoicePromptStepKt.VoicePromptStep$lambda$0$5$0$0((VoiceDesignPrompt) obj);
                return VoicePromptStep$lambda$0$5$0$0;
            case 16:
                AnimatedSlideDownWithFadeVisibility$lambda$0$0 = AnimatedVisibilityContainersKt.AnimatedSlideDownWithFadeVisibility$lambda$0$0(((Integer) obj).intValue());
                return Integer.valueOf(AnimatedSlideDownWithFadeVisibility$lambda$0$0);
            case 17:
                AnimatedSlideDownWithFadeVisibility$lambda$1$0 = AnimatedVisibilityContainersKt.AnimatedSlideDownWithFadeVisibility$lambda$1$0(((Integer) obj).intValue());
                return Integer.valueOf(AnimatedSlideDownWithFadeVisibility$lambda$1$0);
            case 18:
                AnimatedSlideBottomVisibility$lambda$0$0 = AnimatedVisibilityContainersKt.AnimatedSlideBottomVisibility$lambda$0$0(((Integer) obj).intValue());
                return Integer.valueOf(AnimatedSlideBottomVisibility$lambda$0$0);
            case 19:
                AnimatedSlideBottomVisibility$lambda$1$0 = AnimatedVisibilityContainersKt.AnimatedSlideBottomVisibility$lambda$1$0(((Integer) obj).intValue());
                return Integer.valueOf(AnimatedSlideBottomVisibility$lambda$1$0);
            case 20:
                AnimatedSlideTopVisibility$lambda$0$0 = AnimatedVisibilityContainersKt.AnimatedSlideTopVisibility$lambda$0$0(((Integer) obj).intValue());
                return Integer.valueOf(AnimatedSlideTopVisibility$lambda$0$0);
            case 21:
                AnimatedSlideTopVisibility$lambda$1$0 = AnimatedVisibilityContainersKt.AnimatedSlideTopVisibility$lambda$1$0(((Integer) obj).intValue());
                return Integer.valueOf(AnimatedSlideTopVisibility$lambda$1$0);
            case 22:
                AnimatedSlideTopWithFadeVisibility$lambda$0$0 = AnimatedVisibilityContainersKt.AnimatedSlideTopWithFadeVisibility$lambda$0$0(((Integer) obj).intValue());
                return Integer.valueOf(AnimatedSlideTopWithFadeVisibility$lambda$0$0);
            case 23:
                AnimatedSlideTopWithFadeVisibility$lambda$1$0 = AnimatedVisibilityContainersKt.AnimatedSlideTopWithFadeVisibility$lambda$1$0(((Integer) obj).intValue());
                return Integer.valueOf(AnimatedSlideTopWithFadeVisibility$lambda$1$0);
            case 24:
                rememberPermissionsGranted$lambda$1$0 = ComposeExtensionsKt.rememberPermissionsGranted$lambda$1$0(((Boolean) obj).booleanValue());
                return rememberPermissionsGranted$lambda$1$0;
            case 25:
                return z.f31622a;
            case 26:
                b1 b1Var = (b1) obj;
                long j4 = b1Var.f18176f;
                ((y) z1.f18461b.getValue()).d(b1Var, z1.f18460a, b1Var.Y);
                long j10 = b1Var.f18176f;
                if (j4 != j10) {
                    u0 u0Var = b1Var.C0;
                    if (u0Var != null) {
                        if (u0Var.f18403a > j10) {
                            b1Var.v0();
                        } else {
                            u0Var.f18409g = j10;
                            if (u0Var.f18404b == null) {
                                u0Var.f18410h = jo.a.z((1.0d - u0Var.f18407e.a(0)) * b1Var.f18176f);
                            }
                        }
                    } else if (j10 != 0) {
                        b1Var.y0();
                    }
                }
                return z.f31622a;
            case 27:
                ((ho.a) obj).invoke();
                return z.f31622a;
            case 28:
                return new m(((Float) obj).floatValue());
            default:
                return new m(((Integer) obj).intValue());
        }
    }
}
