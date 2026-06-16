package io.elevenlabs.readerapp.ui.screens.authenticated.report;

import android.gov.nist.core.Separators;
import com.google.firebase.messaging.Constants;
import io.elevenlabs.domain.model.ReportLinks;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J5\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0016\u001a\u00020\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0018\u001a\u00020\u0019HÖ\u0081\u0004J\n\u0010\u001a\u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\f¨\u0006\u001b"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/report/ReportProblemState;", "", "readId", "", "reportLinks", "Lio/elevenlabs/domain/model/ReportLinks;", "isLoading", "", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "<init>", "(Ljava/lang/String;Lio/elevenlabs/domain/model/ReportLinks;ZLjava/lang/String;)V", "getReadId", "()Ljava/lang/String;", "getReportLinks", "()Lio/elevenlabs/domain/model/ReportLinks;", "()Z", "getError", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final /* data */ class ReportProblemState {
    public static final int $stable = 8;
    private final String error;
    private final boolean isLoading;
    private final String readId;
    private final ReportLinks reportLinks;

    public /* synthetic */ ReportProblemState(String str, ReportLinks reportLinks, boolean z6, String str2, int i10, f fVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : reportLinks, (i10 & 4) != 0 ? false : z6, (i10 & 8) != 0 ? "" : str2);
    }

    public static /* synthetic */ ReportProblemState copy$default(ReportProblemState reportProblemState, String str, ReportLinks reportLinks, boolean z6, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = reportProblemState.readId;
        }
        if ((i10 & 2) != 0) {
            reportLinks = reportProblemState.reportLinks;
        }
        if ((i10 & 4) != 0) {
            z6 = reportProblemState.isLoading;
        }
        if ((i10 & 8) != 0) {
            str2 = reportProblemState.error;
        }
        return reportProblemState.copy(str, reportLinks, z6, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getReadId() {
        return this.readId;
    }

    /* renamed from: component2, reason: from getter */
    public final ReportLinks getReportLinks() {
        return this.reportLinks;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* renamed from: component4, reason: from getter */
    public final String getError() {
        return this.error;
    }

    public final ReportProblemState copy(String readId, ReportLinks reportLinks, boolean isLoading, String error) {
        error.getClass();
        return new ReportProblemState(readId, reportLinks, isLoading, error);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReportProblemState)) {
            return false;
        }
        ReportProblemState reportProblemState = (ReportProblemState) other;
        if (m.c(this.readId, reportProblemState.readId) && m.c(this.reportLinks, reportProblemState.reportLinks) && this.isLoading == reportProblemState.isLoading && m.c(this.error, reportProblemState.error)) {
            return true;
        }
        return false;
    }

    public final String getError() {
        return this.error;
    }

    public final String getReadId() {
        return this.readId;
    }

    public final ReportLinks getReportLinks() {
        return this.reportLinks;
    }

    public int hashCode() {
        int hashCode;
        String str = this.readId;
        int i10 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = hashCode * 31;
        ReportLinks reportLinks = this.reportLinks;
        if (reportLinks != null) {
            i10 = reportLinks.hashCode();
        }
        return this.error.hashCode() + com.google.android.gms.internal.play_billing.b.f((i11 + i10) * 31, 31, this.isLoading);
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public String toString() {
        return "ReportProblemState(readId=" + this.readId + ", reportLinks=" + this.reportLinks + ", isLoading=" + this.isLoading + ", error=" + this.error + Separators.RPAREN;
    }

    public ReportProblemState(String str, ReportLinks reportLinks, boolean z6, String str2) {
        str2.getClass();
        this.readId = str;
        this.reportLinks = reportLinks;
        this.isLoading = z6;
        this.error = str2;
    }

    public ReportProblemState() {
        this(null, null, false, null, 15, null);
    }
}
