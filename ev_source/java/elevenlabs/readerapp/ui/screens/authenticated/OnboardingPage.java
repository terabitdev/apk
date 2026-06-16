package io.elevenlabs.readerapp.ui.screens.authenticated;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/OnboardingPage;", "", "<init>", "()V", "Voices", "Age", "SurveyPage", "Lio/elevenlabs/readerapp/ui/screens/authenticated/OnboardingPage$Age;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/OnboardingPage$SurveyPage;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/OnboardingPage$Voices;", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public abstract class OnboardingPage {
    public static final int $stable = 0;

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/OnboardingPage$Age;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/OnboardingPage;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final class Age extends OnboardingPage {
        public static final int $stable = 0;
        public static final Age INSTANCE = new Age();

        private Age() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u000f\u001a\u00020\u0010HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/OnboardingPage$SurveyPage;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/OnboardingPage;", "questionIndex", "", "<init>", "(I)V", "getQuestionIndex", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final /* data */ class SurveyPage extends OnboardingPage {
        public static final int $stable = 0;
        private final int questionIndex;

        public SurveyPage(int i10) {
            super(null);
            this.questionIndex = i10;
        }

        public static /* synthetic */ SurveyPage copy$default(SurveyPage surveyPage, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = surveyPage.questionIndex;
            }
            return surveyPage.copy(i10);
        }

        /* renamed from: component1, reason: from getter */
        public final int getQuestionIndex() {
            return this.questionIndex;
        }

        public final SurveyPage copy(int questionIndex) {
            return new SurveyPage(questionIndex);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if ((other instanceof SurveyPage) && this.questionIndex == ((SurveyPage) other).questionIndex) {
                return true;
            }
            return false;
        }

        public final int getQuestionIndex() {
            return this.questionIndex;
        }

        public int hashCode() {
            return Integer.hashCode(this.questionIndex);
        }

        public String toString() {
            return com.google.android.gms.internal.play_billing.b.j(this.questionIndex, "SurveyPage(questionIndex=", Separators.RPAREN);
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/OnboardingPage$Voices;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/OnboardingPage;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final class Voices extends OnboardingPage {
        public static final int $stable = 0;
        public static final Voices INSTANCE = new Voices();

        private Voices() {
            super(null);
        }
    }

    public /* synthetic */ OnboardingPage(kotlin.jvm.internal.f fVar) {
        this();
    }

    private OnboardingPage() {
    }
}
