package io.elevenlabs.readerapp.ui.screens.authenticated.reads;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import io.elevenlabs.domain.model.LimitReachedData;
import io.elevenlabs.domain.model.ReadMeta;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BQ\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003JS\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u0003HÆ\u0001J\u0014\u0010 \u001a\u00020\u00032\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\"\u001a\u00020#HÖ\u0081\u0004J\n\u0010$\u001a\u00020\u0005HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000fR\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000f¨\u0006%"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/reads/WriteState;", "", "isLoading", "", ParameterNames.TEXT, "", "navigateToRead", "Lio/elevenlabs/domain/model/ReadMeta;", "navigateToAddPodcastLimitReached", "Lio/elevenlabs/domain/model/LimitReachedData;", "isPodcastMode", "showImportSurvey", "showSurvey", "<init>", "(ZLjava/lang/String;Lio/elevenlabs/domain/model/ReadMeta;Lio/elevenlabs/domain/model/LimitReachedData;ZZZ)V", "()Z", "getText", "()Ljava/lang/String;", "getNavigateToRead", "()Lio/elevenlabs/domain/model/ReadMeta;", "getNavigateToAddPodcastLimitReached", "()Lio/elevenlabs/domain/model/LimitReachedData;", "getShowImportSurvey", "getShowSurvey", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final /* data */ class WriteState {
    public static final int $stable = 8;
    private final boolean isLoading;
    private final boolean isPodcastMode;
    private final LimitReachedData navigateToAddPodcastLimitReached;
    private final ReadMeta navigateToRead;
    private final boolean showImportSurvey;
    private final boolean showSurvey;
    private final String text;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ WriteState(boolean z6, String str, ReadMeta readMeta, LimitReachedData limitReachedData, boolean z10, boolean z11, boolean z12, int i10, kotlin.jvm.internal.f fVar) {
        this(z6, str, readMeta, limitReachedData, z10, z11, r10);
        boolean z13;
        z6 = (i10 & 1) != 0 ? false : z6;
        str = (i10 & 2) != 0 ? "" : str;
        readMeta = (i10 & 4) != 0 ? null : readMeta;
        limitReachedData = (i10 & 8) != 0 ? null : limitReachedData;
        z10 = (i10 & 16) != 0 ? false : z10;
        z11 = (i10 & 32) != 0 ? false : z11;
        if ((i10 & 64) != 0) {
            z13 = false;
        } else {
            z13 = z12;
        }
    }

    public static /* synthetic */ WriteState copy$default(WriteState writeState, boolean z6, String str, ReadMeta readMeta, LimitReachedData limitReachedData, boolean z10, boolean z11, boolean z12, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z6 = writeState.isLoading;
        }
        if ((i10 & 2) != 0) {
            str = writeState.text;
        }
        if ((i10 & 4) != 0) {
            readMeta = writeState.navigateToRead;
        }
        if ((i10 & 8) != 0) {
            limitReachedData = writeState.navigateToAddPodcastLimitReached;
        }
        if ((i10 & 16) != 0) {
            z10 = writeState.isPodcastMode;
        }
        if ((i10 & 32) != 0) {
            z11 = writeState.showImportSurvey;
        }
        if ((i10 & 64) != 0) {
            z12 = writeState.showSurvey;
        }
        boolean z13 = z11;
        boolean z14 = z12;
        boolean z15 = z10;
        ReadMeta readMeta2 = readMeta;
        return writeState.copy(z6, str, readMeta2, limitReachedData, z15, z13, z14);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* renamed from: component2, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* renamed from: component3, reason: from getter */
    public final ReadMeta getNavigateToRead() {
        return this.navigateToRead;
    }

    /* renamed from: component4, reason: from getter */
    public final LimitReachedData getNavigateToAddPodcastLimitReached() {
        return this.navigateToAddPodcastLimitReached;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsPodcastMode() {
        return this.isPodcastMode;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getShowImportSurvey() {
        return this.showImportSurvey;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getShowSurvey() {
        return this.showSurvey;
    }

    public final WriteState copy(boolean isLoading, String text, ReadMeta navigateToRead, LimitReachedData navigateToAddPodcastLimitReached, boolean isPodcastMode, boolean showImportSurvey, boolean showSurvey) {
        text.getClass();
        return new WriteState(isLoading, text, navigateToRead, navigateToAddPodcastLimitReached, isPodcastMode, showImportSurvey, showSurvey);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WriteState)) {
            return false;
        }
        WriteState writeState = (WriteState) other;
        if (this.isLoading == writeState.isLoading && kotlin.jvm.internal.m.c(this.text, writeState.text) && kotlin.jvm.internal.m.c(this.navigateToRead, writeState.navigateToRead) && kotlin.jvm.internal.m.c(this.navigateToAddPodcastLimitReached, writeState.navigateToAddPodcastLimitReached) && this.isPodcastMode == writeState.isPodcastMode && this.showImportSurvey == writeState.showImportSurvey && this.showSurvey == writeState.showSurvey) {
            return true;
        }
        return false;
    }

    public final LimitReachedData getNavigateToAddPodcastLimitReached() {
        return this.navigateToAddPodcastLimitReached;
    }

    public final ReadMeta getNavigateToRead() {
        return this.navigateToRead;
    }

    public final boolean getShowImportSurvey() {
        return this.showImportSurvey;
    }

    public final boolean getShowSurvey() {
        return this.showSurvey;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        int hashCode;
        int c5 = j0.c.c(Boolean.hashCode(this.isLoading) * 31, 31, this.text);
        ReadMeta readMeta = this.navigateToRead;
        int i10 = 0;
        if (readMeta == null) {
            hashCode = 0;
        } else {
            hashCode = readMeta.hashCode();
        }
        int i11 = (c5 + hashCode) * 31;
        LimitReachedData limitReachedData = this.navigateToAddPodcastLimitReached;
        if (limitReachedData != null) {
            i10 = limitReachedData.hashCode();
        }
        return Boolean.hashCode(this.showSurvey) + com.google.android.gms.internal.play_billing.b.f(com.google.android.gms.internal.play_billing.b.f((i11 + i10) * 31, 31, this.isPodcastMode), 31, this.showImportSurvey);
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final boolean isPodcastMode() {
        return this.isPodcastMode;
    }

    public String toString() {
        boolean z6 = this.isLoading;
        String str = this.text;
        ReadMeta readMeta = this.navigateToRead;
        LimitReachedData limitReachedData = this.navigateToAddPodcastLimitReached;
        boolean z10 = this.isPodcastMode;
        boolean z11 = this.showImportSurvey;
        boolean z12 = this.showSurvey;
        StringBuilder sb = new StringBuilder("WriteState(isLoading=");
        sb.append(z6);
        sb.append(", text=");
        sb.append(str);
        sb.append(", navigateToRead=");
        sb.append(readMeta);
        sb.append(", navigateToAddPodcastLimitReached=");
        sb.append(limitReachedData);
        sb.append(", isPodcastMode=");
        ib.i.t(sb, z10, ", showImportSurvey=", z11, ", showSurvey=");
        return p.n.j(Separators.RPAREN, sb, z12);
    }

    public WriteState(boolean z6, String str, ReadMeta readMeta, LimitReachedData limitReachedData, boolean z10, boolean z11, boolean z12) {
        str.getClass();
        this.isLoading = z6;
        this.text = str;
        this.navigateToRead = readMeta;
        this.navigateToAddPodcastLimitReached = limitReachedData;
        this.isPodcastMode = z10;
        this.showImportSurvey = z11;
        this.showSurvey = z12;
    }

    public WriteState() {
        this(false, null, null, null, false, false, false, 127, null);
    }
}
