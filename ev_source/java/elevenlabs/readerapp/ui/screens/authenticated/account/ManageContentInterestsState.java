package io.elevenlabs.readerapp.ui.screens.authenticated.account;

import android.gov.nist.core.Separators;
import com.google.firebase.messaging.Constants;
import io.elevenlabs.domain.model.InterestsQuestion;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003JI\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u001a\u001a\u00020\u00032\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001c\u001a\u00020\u001dHÖ\u0081\u0004J\n\u0010\u001e\u001a\u00020\tHÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\r¨\u0006\u001f"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/account/ManageContentInterestsState;", "", "isLoading", "", "isSubmitLoading", "question", "Lio/elevenlabs/domain/model/InterestsQuestion;", "submitted", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "", "isSaveButtonEnabled", "<init>", "(ZZLio/elevenlabs/domain/model/InterestsQuestion;ZLjava/lang/String;Z)V", "()Z", "getQuestion", "()Lio/elevenlabs/domain/model/InterestsQuestion;", "getSubmitted", "getError", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final /* data */ class ManageContentInterestsState {
    public static final int $stable = 8;
    private final String error;
    private final boolean isLoading;
    private final boolean isSaveButtonEnabled;
    private final boolean isSubmitLoading;
    private final InterestsQuestion question;
    private final boolean submitted;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ ManageContentInterestsState(boolean z6, boolean z10, InterestsQuestion interestsQuestion, boolean z11, String str, boolean z12, int i10, kotlin.jvm.internal.f fVar) {
        this(z6, z10, interestsQuestion, z11, str, r9);
        boolean z13;
        z6 = (i10 & 1) != 0 ? false : z6;
        z10 = (i10 & 2) != 0 ? false : z10;
        interestsQuestion = (i10 & 4) != 0 ? null : interestsQuestion;
        z11 = (i10 & 8) != 0 ? false : z11;
        str = (i10 & 16) != 0 ? null : str;
        if ((i10 & 32) != 0) {
            z13 = false;
        } else {
            z13 = z12;
        }
    }

    public static /* synthetic */ ManageContentInterestsState copy$default(ManageContentInterestsState manageContentInterestsState, boolean z6, boolean z10, InterestsQuestion interestsQuestion, boolean z11, String str, boolean z12, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z6 = manageContentInterestsState.isLoading;
        }
        if ((i10 & 2) != 0) {
            z10 = manageContentInterestsState.isSubmitLoading;
        }
        if ((i10 & 4) != 0) {
            interestsQuestion = manageContentInterestsState.question;
        }
        if ((i10 & 8) != 0) {
            z11 = manageContentInterestsState.submitted;
        }
        if ((i10 & 16) != 0) {
            str = manageContentInterestsState.error;
        }
        if ((i10 & 32) != 0) {
            z12 = manageContentInterestsState.isSaveButtonEnabled;
        }
        String str2 = str;
        boolean z13 = z12;
        return manageContentInterestsState.copy(z6, z10, interestsQuestion, z11, str2, z13);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsSubmitLoading() {
        return this.isSubmitLoading;
    }

    /* renamed from: component3, reason: from getter */
    public final InterestsQuestion getQuestion() {
        return this.question;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getSubmitted() {
        return this.submitted;
    }

    /* renamed from: component5, reason: from getter */
    public final String getError() {
        return this.error;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsSaveButtonEnabled() {
        return this.isSaveButtonEnabled;
    }

    public final ManageContentInterestsState copy(boolean isLoading, boolean isSubmitLoading, InterestsQuestion question, boolean submitted, String error, boolean isSaveButtonEnabled) {
        return new ManageContentInterestsState(isLoading, isSubmitLoading, question, submitted, error, isSaveButtonEnabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ManageContentInterestsState)) {
            return false;
        }
        ManageContentInterestsState manageContentInterestsState = (ManageContentInterestsState) other;
        if (this.isLoading == manageContentInterestsState.isLoading && this.isSubmitLoading == manageContentInterestsState.isSubmitLoading && kotlin.jvm.internal.m.c(this.question, manageContentInterestsState.question) && this.submitted == manageContentInterestsState.submitted && kotlin.jvm.internal.m.c(this.error, manageContentInterestsState.error) && this.isSaveButtonEnabled == manageContentInterestsState.isSaveButtonEnabled) {
            return true;
        }
        return false;
    }

    public final String getError() {
        return this.error;
    }

    public final InterestsQuestion getQuestion() {
        return this.question;
    }

    public final boolean getSubmitted() {
        return this.submitted;
    }

    public int hashCode() {
        int hashCode;
        int f10 = com.google.android.gms.internal.play_billing.b.f(Boolean.hashCode(this.isLoading) * 31, 31, this.isSubmitLoading);
        InterestsQuestion interestsQuestion = this.question;
        int i10 = 0;
        if (interestsQuestion == null) {
            hashCode = 0;
        } else {
            hashCode = interestsQuestion.hashCode();
        }
        int f11 = com.google.android.gms.internal.play_billing.b.f((f10 + hashCode) * 31, 31, this.submitted);
        String str = this.error;
        if (str != null) {
            i10 = str.hashCode();
        }
        return Boolean.hashCode(this.isSaveButtonEnabled) + ((f11 + i10) * 31);
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final boolean isSaveButtonEnabled() {
        return this.isSaveButtonEnabled;
    }

    public final boolean isSubmitLoading() {
        return this.isSubmitLoading;
    }

    public String toString() {
        return "ManageContentInterestsState(isLoading=" + this.isLoading + ", isSubmitLoading=" + this.isSubmitLoading + ", question=" + this.question + ", submitted=" + this.submitted + ", error=" + this.error + ", isSaveButtonEnabled=" + this.isSaveButtonEnabled + Separators.RPAREN;
    }

    public ManageContentInterestsState(boolean z6, boolean z10, InterestsQuestion interestsQuestion, boolean z11, String str, boolean z12) {
        this.isLoading = z6;
        this.isSubmitLoading = z10;
        this.question = interestsQuestion;
        this.submitted = z11;
        this.error = str;
        this.isSaveButtonEnabled = z12;
    }

    public ManageContentInterestsState() {
        this(false, false, null, false, null, false, 63, null);
    }
}
