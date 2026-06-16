package io.elevenlabs.readerapp.core;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0005HÖ\u0081\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lio/elevenlabs/readerapp/core/SurveyState;", "", "survey", "Lio/elevenlabs/readerapp/core/Survey;", "currentPage", "", "<init>", "(Lio/elevenlabs/readerapp/core/Survey;I)V", "getSurvey", "()Lio/elevenlabs/readerapp/core/Survey;", "getCurrentPage", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final /* data */ class SurveyState {
    public static final int $stable = 8;
    private final int currentPage;
    private final Survey survey;

    public /* synthetic */ SurveyState(Survey survey, int i10, int i11, kotlin.jvm.internal.f fVar) {
        this((i11 & 1) != 0 ? null : survey, (i11 & 2) != 0 ? 0 : i10);
    }

    public static /* synthetic */ SurveyState copy$default(SurveyState surveyState, Survey survey, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            survey = surveyState.survey;
        }
        if ((i11 & 2) != 0) {
            i10 = surveyState.currentPage;
        }
        return surveyState.copy(survey, i10);
    }

    /* renamed from: component1, reason: from getter */
    public final Survey getSurvey() {
        return this.survey;
    }

    /* renamed from: component2, reason: from getter */
    public final int getCurrentPage() {
        return this.currentPage;
    }

    public final SurveyState copy(Survey survey, int currentPage) {
        return new SurveyState(survey, currentPage);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SurveyState)) {
            return false;
        }
        SurveyState surveyState = (SurveyState) other;
        if (kotlin.jvm.internal.m.c(this.survey, surveyState.survey) && this.currentPage == surveyState.currentPage) {
            return true;
        }
        return false;
    }

    public final int getCurrentPage() {
        return this.currentPage;
    }

    public final Survey getSurvey() {
        return this.survey;
    }

    public int hashCode() {
        int hashCode;
        Survey survey = this.survey;
        if (survey == null) {
            hashCode = 0;
        } else {
            hashCode = survey.hashCode();
        }
        return Integer.hashCode(this.currentPage) + (hashCode * 31);
    }

    public String toString() {
        return "SurveyState(survey=" + this.survey + ", currentPage=" + this.currentPage + Separators.RPAREN;
    }

    public SurveyState(Survey survey, int i10) {
        this.survey = survey;
        this.currentPage = i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SurveyState() {
        this(null, 0, 3, 0 == true ? 1 : 0);
    }
}
