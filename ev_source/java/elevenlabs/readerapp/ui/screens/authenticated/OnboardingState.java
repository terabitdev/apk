package io.elevenlabs.readerapp.ui.screens.authenticated;

import android.gov.nist.core.Separators;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import io.elevenlabs.domain.model.OnboardingSurvey;
import io.elevenlabs.domain.model.Voice;
import io.livekit.android.rpc.RpcError;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u008b\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\r\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0007\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0005¢\u0006\u0004\b\u0014\u0010\u0015J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0005HÆ\u0003J\u000f\u0010&\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010*\u001a\u00020\u0005HÆ\u0003J\t\u0010+\u001a\u00020\u0005HÆ\u0003J\u000f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00100\u0007HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\t\u0010.\u001a\u00020\u0005HÆ\u0003J\u008d\u0001\u0010/\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00052\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u0005HÆ\u0001J\u0014\u00100\u001a\u00020\u00052\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u00102\u001a\u000203HÖ\u0081\u0004J\n\u00104\u001a\u00020\nHÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u0013\u0010\f\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001dR\u0011\u0010\r\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0019R\u0011\u0010\u000e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0019R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0007¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001bR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\u0013\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0019¨\u00065"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/OnboardingState;", "", "survey", "Lio/elevenlabs/domain/model/OnboardingSurvey;", "voicesSuggestionsLoading", "", "voicesSuggestions", "", "Lio/elevenlabs/domain/model/Voice;", "voicesSuggestionError", "", "playingPreviewVoiceId", "selectedVoiceId", "showAgeWarning", "isSubmitLoading", "pages", "Lio/elevenlabs/readerapp/ui/screens/authenticated/OnboardingPage;", "onboardingType", "Lio/elevenlabs/readerapp/ui/screens/authenticated/OnboardingType;", "isAgeOnboardingCompleted", "<init>", "(Lio/elevenlabs/domain/model/OnboardingSurvey;ZLjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/util/List;Lio/elevenlabs/readerapp/ui/screens/authenticated/OnboardingType;Z)V", "getSurvey", "()Lio/elevenlabs/domain/model/OnboardingSurvey;", "getVoicesSuggestionsLoading", "()Z", "getVoicesSuggestions", "()Ljava/util/List;", "getVoicesSuggestionError", "()Ljava/lang/String;", "getPlayingPreviewVoiceId", "getSelectedVoiceId", "getShowAgeWarning", "getPages", "getOnboardingType", "()Lio/elevenlabs/readerapp/ui/screens/authenticated/OnboardingType;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "equals", "other", "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final /* data */ class OnboardingState {
    public static final int $stable = 8;
    private final boolean isAgeOnboardingCompleted;
    private final boolean isSubmitLoading;
    private final OnboardingType onboardingType;
    private final List<OnboardingPage> pages;
    private final String playingPreviewVoiceId;
    private final String selectedVoiceId;
    private final boolean showAgeWarning;
    private final OnboardingSurvey survey;
    private final String voicesSuggestionError;
    private final List<Voice> voicesSuggestions;
    private final boolean voicesSuggestionsLoading;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ OnboardingState(OnboardingSurvey onboardingSurvey, boolean z6, List list, String str, String str2, String str3, boolean z10, boolean z11, List list2, OnboardingType onboardingType, boolean z12, int i10, kotlin.jvm.internal.f fVar) {
        this(onboardingSurvey, z6, r1, r5, r6, r7, r8, r9, r4, r2, r23);
        List list3;
        String str4;
        String str5;
        String str6;
        boolean z13;
        boolean z14;
        boolean z15;
        onboardingSurvey = (i10 & 1) != 0 ? null : onboardingSurvey;
        z6 = (i10 & 2) != 0 ? false : z6;
        int i11 = i10 & 4;
        List list4 = tn.t.f33547a;
        if (i11 != 0) {
            list3 = list4;
        } else {
            list3 = list;
        }
        if ((i10 & 8) != 0) {
            str4 = null;
        } else {
            str4 = str;
        }
        if ((i10 & 16) != 0) {
            str5 = null;
        } else {
            str5 = str2;
        }
        if ((i10 & 32) != 0) {
            str6 = null;
        } else {
            str6 = str3;
        }
        if ((i10 & 64) != 0) {
            z13 = false;
        } else {
            z13 = z10;
        }
        if ((i10 & 128) != 0) {
            z14 = false;
        } else {
            z14 = z11;
        }
        list4 = (i10 & RpcError.MAX_MESSAGE_BYTES) == 0 ? list2 : list4;
        OnboardingType onboardingType2 = (i10 & 512) == 0 ? onboardingType : null;
        if ((i10 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
            z15 = false;
        } else {
            z15 = z12;
        }
    }

    public static /* synthetic */ OnboardingState copy$default(OnboardingState onboardingState, OnboardingSurvey onboardingSurvey, boolean z6, List list, String str, String str2, String str3, boolean z10, boolean z11, List list2, OnboardingType onboardingType, boolean z12, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            onboardingSurvey = onboardingState.survey;
        }
        if ((i10 & 2) != 0) {
            z6 = onboardingState.voicesSuggestionsLoading;
        }
        if ((i10 & 4) != 0) {
            list = onboardingState.voicesSuggestions;
        }
        if ((i10 & 8) != 0) {
            str = onboardingState.voicesSuggestionError;
        }
        if ((i10 & 16) != 0) {
            str2 = onboardingState.playingPreviewVoiceId;
        }
        if ((i10 & 32) != 0) {
            str3 = onboardingState.selectedVoiceId;
        }
        if ((i10 & 64) != 0) {
            z10 = onboardingState.showAgeWarning;
        }
        if ((i10 & 128) != 0) {
            z11 = onboardingState.isSubmitLoading;
        }
        if ((i10 & RpcError.MAX_MESSAGE_BYTES) != 0) {
            list2 = onboardingState.pages;
        }
        if ((i10 & 512) != 0) {
            onboardingType = onboardingState.onboardingType;
        }
        if ((i10 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
            z12 = onboardingState.isAgeOnboardingCompleted;
        }
        OnboardingType onboardingType2 = onboardingType;
        boolean z13 = z12;
        boolean z14 = z11;
        List list3 = list2;
        String str4 = str3;
        boolean z15 = z10;
        String str5 = str2;
        List list4 = list;
        return onboardingState.copy(onboardingSurvey, z6, list4, str, str5, str4, z15, z14, list3, onboardingType2, z13);
    }

    /* renamed from: component1, reason: from getter */
    public final OnboardingSurvey getSurvey() {
        return this.survey;
    }

    /* renamed from: component10, reason: from getter */
    public final OnboardingType getOnboardingType() {
        return this.onboardingType;
    }

    /* renamed from: component11, reason: from getter */
    public final boolean getIsAgeOnboardingCompleted() {
        return this.isAgeOnboardingCompleted;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getVoicesSuggestionsLoading() {
        return this.voicesSuggestionsLoading;
    }

    public final List<Voice> component3() {
        return this.voicesSuggestions;
    }

    /* renamed from: component4, reason: from getter */
    public final String getVoicesSuggestionError() {
        return this.voicesSuggestionError;
    }

    /* renamed from: component5, reason: from getter */
    public final String getPlayingPreviewVoiceId() {
        return this.playingPreviewVoiceId;
    }

    /* renamed from: component6, reason: from getter */
    public final String getSelectedVoiceId() {
        return this.selectedVoiceId;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getShowAgeWarning() {
        return this.showAgeWarning;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getIsSubmitLoading() {
        return this.isSubmitLoading;
    }

    public final List<OnboardingPage> component9() {
        return this.pages;
    }

    public final OnboardingState copy(OnboardingSurvey survey, boolean voicesSuggestionsLoading, List<Voice> voicesSuggestions, String voicesSuggestionError, String playingPreviewVoiceId, String selectedVoiceId, boolean showAgeWarning, boolean isSubmitLoading, List<? extends OnboardingPage> pages, OnboardingType onboardingType, boolean isAgeOnboardingCompleted) {
        voicesSuggestions.getClass();
        pages.getClass();
        return new OnboardingState(survey, voicesSuggestionsLoading, voicesSuggestions, voicesSuggestionError, playingPreviewVoiceId, selectedVoiceId, showAgeWarning, isSubmitLoading, pages, onboardingType, isAgeOnboardingCompleted);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OnboardingState)) {
            return false;
        }
        OnboardingState onboardingState = (OnboardingState) other;
        if (kotlin.jvm.internal.m.c(this.survey, onboardingState.survey) && this.voicesSuggestionsLoading == onboardingState.voicesSuggestionsLoading && kotlin.jvm.internal.m.c(this.voicesSuggestions, onboardingState.voicesSuggestions) && kotlin.jvm.internal.m.c(this.voicesSuggestionError, onboardingState.voicesSuggestionError) && kotlin.jvm.internal.m.c(this.playingPreviewVoiceId, onboardingState.playingPreviewVoiceId) && kotlin.jvm.internal.m.c(this.selectedVoiceId, onboardingState.selectedVoiceId) && this.showAgeWarning == onboardingState.showAgeWarning && this.isSubmitLoading == onboardingState.isSubmitLoading && kotlin.jvm.internal.m.c(this.pages, onboardingState.pages) && this.onboardingType == onboardingState.onboardingType && this.isAgeOnboardingCompleted == onboardingState.isAgeOnboardingCompleted) {
            return true;
        }
        return false;
    }

    public final OnboardingType getOnboardingType() {
        return this.onboardingType;
    }

    public final List<OnboardingPage> getPages() {
        return this.pages;
    }

    public final String getPlayingPreviewVoiceId() {
        return this.playingPreviewVoiceId;
    }

    public final String getSelectedVoiceId() {
        return this.selectedVoiceId;
    }

    public final boolean getShowAgeWarning() {
        return this.showAgeWarning;
    }

    public final OnboardingSurvey getSurvey() {
        return this.survey;
    }

    public final String getVoicesSuggestionError() {
        return this.voicesSuggestionError;
    }

    public final List<Voice> getVoicesSuggestions() {
        return this.voicesSuggestions;
    }

    public final boolean getVoicesSuggestionsLoading() {
        return this.voicesSuggestionsLoading;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        OnboardingSurvey onboardingSurvey = this.survey;
        int i10 = 0;
        if (onboardingSurvey == null) {
            hashCode = 0;
        } else {
            hashCode = onboardingSurvey.hashCode();
        }
        int d10 = p.n.d(com.google.android.gms.internal.play_billing.b.f(hashCode * 31, 31, this.voicesSuggestionsLoading), 31, this.voicesSuggestions);
        String str = this.voicesSuggestionError;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i11 = (d10 + hashCode2) * 31;
        String str2 = this.playingPreviewVoiceId;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int i12 = (i11 + hashCode3) * 31;
        String str3 = this.selectedVoiceId;
        if (str3 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str3.hashCode();
        }
        int d11 = p.n.d(com.google.android.gms.internal.play_billing.b.f(com.google.android.gms.internal.play_billing.b.f((i12 + hashCode4) * 31, 31, this.showAgeWarning), 31, this.isSubmitLoading), 31, this.pages);
        OnboardingType onboardingType = this.onboardingType;
        if (onboardingType != null) {
            i10 = onboardingType.hashCode();
        }
        return Boolean.hashCode(this.isAgeOnboardingCompleted) + ((d11 + i10) * 31);
    }

    public final boolean isAgeOnboardingCompleted() {
        return this.isAgeOnboardingCompleted;
    }

    public final boolean isSubmitLoading() {
        return this.isSubmitLoading;
    }

    public String toString() {
        OnboardingSurvey onboardingSurvey = this.survey;
        boolean z6 = this.voicesSuggestionsLoading;
        List<Voice> list = this.voicesSuggestions;
        String str = this.voicesSuggestionError;
        String str2 = this.playingPreviewVoiceId;
        String str3 = this.selectedVoiceId;
        boolean z10 = this.showAgeWarning;
        boolean z11 = this.isSubmitLoading;
        List<OnboardingPage> list2 = this.pages;
        OnboardingType onboardingType = this.onboardingType;
        boolean z12 = this.isAgeOnboardingCompleted;
        StringBuilder sb = new StringBuilder("OnboardingState(survey=");
        sb.append(onboardingSurvey);
        sb.append(", voicesSuggestionsLoading=");
        sb.append(z6);
        sb.append(", voicesSuggestions=");
        sb.append(list);
        sb.append(", voicesSuggestionError=");
        sb.append(str);
        sb.append(", playingPreviewVoiceId=");
        defpackage.f.x(sb, str2, ", selectedVoiceId=", str3, ", showAgeWarning=");
        ib.i.t(sb, z10, ", isSubmitLoading=", z11, ", pages=");
        sb.append(list2);
        sb.append(", onboardingType=");
        sb.append(onboardingType);
        sb.append(", isAgeOnboardingCompleted=");
        return p.n.j(Separators.RPAREN, sb, z12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OnboardingState(OnboardingSurvey onboardingSurvey, boolean z6, List<Voice> list, String str, String str2, String str3, boolean z10, boolean z11, List<? extends OnboardingPage> list2, OnboardingType onboardingType, boolean z12) {
        list.getClass();
        list2.getClass();
        this.survey = onboardingSurvey;
        this.voicesSuggestionsLoading = z6;
        this.voicesSuggestions = list;
        this.voicesSuggestionError = str;
        this.playingPreviewVoiceId = str2;
        this.selectedVoiceId = str3;
        this.showAgeWarning = z10;
        this.isSubmitLoading = z11;
        this.pages = list2;
        this.onboardingType = onboardingType;
        this.isAgeOnboardingCompleted = z12;
    }

    public OnboardingState() {
        this(null, false, null, null, null, null, false, false, null, null, false, 2047, null);
    }
}
