package io.elevenlabs.readerapp.ui.screens.authenticated.purchases.hourshistory;

import android.gov.nist.core.Separators;
import io.elevenlabs.domain.model.UsageSection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;
import p.n;
import tn.t;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003JA\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0018\u001a\u00020\u00032\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001a\u001a\u00020\u001bHÖ\u0081\u0004J\n\u0010\u001c\u001a\u00020\u0005HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\rR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\r¨\u0006\u001d"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/purchases/hourshistory/HoursHistoryState;", "", "isLoadingMore", "", "loadingMoreError", "", "sections", "", "Lio/elevenlabs/domain/model/UsageSection;", "isExtraHoursExpanded", "isScreenVisible", "<init>", "(ZLjava/lang/String;Ljava/util/List;ZZ)V", "()Z", "getLoadingMoreError", "()Ljava/lang/String;", "getSections", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final /* data */ class HoursHistoryState {
    public static final int $stable = 8;
    private final boolean isExtraHoursExpanded;
    private final boolean isLoadingMore;
    private final boolean isScreenVisible;
    private final String loadingMoreError;
    private final List<UsageSection> sections;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ HoursHistoryState(boolean z6, String str, List list, boolean z10, boolean z11, int i10, kotlin.jvm.internal.f fVar) {
        this(z6, str, list, z10, r7);
        boolean z12;
        z6 = (i10 & 1) != 0 ? false : z6;
        str = (i10 & 2) != 0 ? "" : str;
        list = (i10 & 4) != 0 ? t.f33547a : list;
        z10 = (i10 & 8) != 0 ? false : z10;
        if ((i10 & 16) != 0) {
            z12 = false;
        } else {
            z12 = z11;
        }
    }

    public static /* synthetic */ HoursHistoryState copy$default(HoursHistoryState hoursHistoryState, boolean z6, String str, List list, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z6 = hoursHistoryState.isLoadingMore;
        }
        if ((i10 & 2) != 0) {
            str = hoursHistoryState.loadingMoreError;
        }
        if ((i10 & 4) != 0) {
            list = hoursHistoryState.sections;
        }
        if ((i10 & 8) != 0) {
            z10 = hoursHistoryState.isExtraHoursExpanded;
        }
        if ((i10 & 16) != 0) {
            z11 = hoursHistoryState.isScreenVisible;
        }
        boolean z12 = z11;
        List list2 = list;
        return hoursHistoryState.copy(z6, str, list2, z10, z12);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsLoadingMore() {
        return this.isLoadingMore;
    }

    /* renamed from: component2, reason: from getter */
    public final String getLoadingMoreError() {
        return this.loadingMoreError;
    }

    public final List<UsageSection> component3() {
        return this.sections;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsExtraHoursExpanded() {
        return this.isExtraHoursExpanded;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsScreenVisible() {
        return this.isScreenVisible;
    }

    public final HoursHistoryState copy(boolean isLoadingMore, String loadingMoreError, List<? extends UsageSection> sections, boolean isExtraHoursExpanded, boolean isScreenVisible) {
        loadingMoreError.getClass();
        sections.getClass();
        return new HoursHistoryState(isLoadingMore, loadingMoreError, sections, isExtraHoursExpanded, isScreenVisible);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HoursHistoryState)) {
            return false;
        }
        HoursHistoryState hoursHistoryState = (HoursHistoryState) other;
        if (this.isLoadingMore == hoursHistoryState.isLoadingMore && m.c(this.loadingMoreError, hoursHistoryState.loadingMoreError) && m.c(this.sections, hoursHistoryState.sections) && this.isExtraHoursExpanded == hoursHistoryState.isExtraHoursExpanded && this.isScreenVisible == hoursHistoryState.isScreenVisible) {
            return true;
        }
        return false;
    }

    public final String getLoadingMoreError() {
        return this.loadingMoreError;
    }

    public final List<UsageSection> getSections() {
        return this.sections;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isScreenVisible) + com.google.android.gms.internal.play_billing.b.f(n.d(j0.c.c(Boolean.hashCode(this.isLoadingMore) * 31, 31, this.loadingMoreError), 31, this.sections), 31, this.isExtraHoursExpanded);
    }

    public final boolean isExtraHoursExpanded() {
        return this.isExtraHoursExpanded;
    }

    public final boolean isLoadingMore() {
        return this.isLoadingMore;
    }

    public final boolean isScreenVisible() {
        return this.isScreenVisible;
    }

    public String toString() {
        boolean z6 = this.isLoadingMore;
        String str = this.loadingMoreError;
        List<UsageSection> list = this.sections;
        boolean z10 = this.isExtraHoursExpanded;
        boolean z11 = this.isScreenVisible;
        StringBuilder sb = new StringBuilder("HoursHistoryState(isLoadingMore=");
        sb.append(z6);
        sb.append(", loadingMoreError=");
        sb.append(str);
        sb.append(", sections=");
        sb.append(list);
        sb.append(", isExtraHoursExpanded=");
        sb.append(z10);
        sb.append(", isScreenVisible=");
        return n.j(Separators.RPAREN, sb, z11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HoursHistoryState(boolean z6, String str, List<? extends UsageSection> list, boolean z10, boolean z11) {
        str.getClass();
        list.getClass();
        this.isLoadingMore = z6;
        this.loadingMoreError = str;
        this.sections = list;
        this.isExtraHoursExpanded = z10;
        this.isScreenVisible = z11;
    }

    public HoursHistoryState() {
        this(false, null, null, false, false, 31, null);
    }
}
