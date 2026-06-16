package io.elevenlabs.domain.model;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.a;
import com.google.android.gms.internal.play_billing.b;
import com.google.firebase.messaging.Constants;
import j0.c;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lio/elevenlabs/domain/model/UsageSection;", "", "UsageProgress", "UsageExtraHours", "Lio/elevenlabs/domain/model/UsageSection$UsageExtraHours;", "Lio/elevenlabs/domain/model/UsageSection$UsageProgress;", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public interface UsageSection {

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001e\u001a\u00020\tHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\fHÆ\u0003JS\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001J\u0014\u0010\"\u001a\u00020\t2\b\u0010#\u001a\u0004\u0018\u00010$HÖ\u0083\u0004J\n\u0010%\u001a\u00020\u0006HÖ\u0081\u0004J\n\u0010&\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006'"}, d2 = {"Lio/elevenlabs/domain/model/UsageSection$UsageProgress;", "Lio/elevenlabs/domain/model/UsageSection;", Constants.ScionAnalytics.PARAM_LABEL, "", "valueLabel", "progressCurrent", "", "progressTotal", "enabled", "", "infoTooltip", "resetsAt", "Ljava/util/Date;", "<init>", "(Ljava/lang/String;Ljava/lang/String;IIZLjava/lang/String;Ljava/util/Date;)V", "getLabel", "()Ljava/lang/String;", "getValueLabel", "getProgressCurrent", "()I", "getProgressTotal", "getEnabled", "()Z", "getInfoTooltip", "getResetsAt", "()Ljava/util/Date;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "", "hashCode", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final /* data */ class UsageProgress implements UsageSection {
        private final boolean enabled;
        private final String infoTooltip;
        private final String label;
        private final int progressCurrent;
        private final int progressTotal;
        private final Date resetsAt;
        private final String valueLabel;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ UsageProgress(String str, String str2, int i10, int i11, boolean z6, String str3, Date date, int i12, f fVar) {
            this(str, str2, i10, i11, z6, str3, r9);
            Date date2;
            str3 = (i12 & 32) != 0 ? null : str3;
            if ((i12 & 64) != 0) {
                date2 = null;
            } else {
                date2 = date;
            }
        }

        public static /* synthetic */ UsageProgress copy$default(UsageProgress usageProgress, String str, String str2, int i10, int i11, boolean z6, String str3, Date date, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = usageProgress.label;
            }
            if ((i12 & 2) != 0) {
                str2 = usageProgress.valueLabel;
            }
            if ((i12 & 4) != 0) {
                i10 = usageProgress.progressCurrent;
            }
            if ((i12 & 8) != 0) {
                i11 = usageProgress.progressTotal;
            }
            if ((i12 & 16) != 0) {
                z6 = usageProgress.enabled;
            }
            if ((i12 & 32) != 0) {
                str3 = usageProgress.infoTooltip;
            }
            if ((i12 & 64) != 0) {
                date = usageProgress.resetsAt;
            }
            String str4 = str3;
            Date date2 = date;
            boolean z10 = z6;
            int i13 = i10;
            return usageProgress.copy(str, str2, i13, i11, z10, str4, date2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        /* renamed from: component2, reason: from getter */
        public final String getValueLabel() {
            return this.valueLabel;
        }

        /* renamed from: component3, reason: from getter */
        public final int getProgressCurrent() {
            return this.progressCurrent;
        }

        /* renamed from: component4, reason: from getter */
        public final int getProgressTotal() {
            return this.progressTotal;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getEnabled() {
            return this.enabled;
        }

        /* renamed from: component6, reason: from getter */
        public final String getInfoTooltip() {
            return this.infoTooltip;
        }

        /* renamed from: component7, reason: from getter */
        public final Date getResetsAt() {
            return this.resetsAt;
        }

        public final UsageProgress copy(String label, String valueLabel, int progressCurrent, int progressTotal, boolean enabled, String infoTooltip, Date resetsAt) {
            label.getClass();
            valueLabel.getClass();
            return new UsageProgress(label, valueLabel, progressCurrent, progressTotal, enabled, infoTooltip, resetsAt);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UsageProgress)) {
                return false;
            }
            UsageProgress usageProgress = (UsageProgress) other;
            if (m.c(this.label, usageProgress.label) && m.c(this.valueLabel, usageProgress.valueLabel) && this.progressCurrent == usageProgress.progressCurrent && this.progressTotal == usageProgress.progressTotal && this.enabled == usageProgress.enabled && m.c(this.infoTooltip, usageProgress.infoTooltip) && m.c(this.resetsAt, usageProgress.resetsAt)) {
                return true;
            }
            return false;
        }

        public final boolean getEnabled() {
            return this.enabled;
        }

        public final String getInfoTooltip() {
            return this.infoTooltip;
        }

        public final String getLabel() {
            return this.label;
        }

        public final int getProgressCurrent() {
            return this.progressCurrent;
        }

        public final int getProgressTotal() {
            return this.progressTotal;
        }

        public final Date getResetsAt() {
            return this.resetsAt;
        }

        public final String getValueLabel() {
            return this.valueLabel;
        }

        public int hashCode() {
            int hashCode;
            int f10 = b.f(c.b(this.progressTotal, c.b(this.progressCurrent, c.c(this.label.hashCode() * 31, 31, this.valueLabel), 31), 31), 31, this.enabled);
            String str = this.infoTooltip;
            int i10 = 0;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i11 = (f10 + hashCode) * 31;
            Date date = this.resetsAt;
            if (date != null) {
                i10 = date.hashCode();
            }
            return i11 + i10;
        }

        public String toString() {
            String str = this.label;
            String str2 = this.valueLabel;
            int i10 = this.progressCurrent;
            int i11 = this.progressTotal;
            boolean z6 = this.enabled;
            String str3 = this.infoTooltip;
            Date date = this.resetsAt;
            StringBuilder s10 = defpackage.f.s("UsageProgress(label=", str, ", valueLabel=", str2, ", progressCurrent=");
            a.t(s10, i10, ", progressTotal=", i11, ", enabled=");
            defpackage.f.z(s10, z6, ", infoTooltip=", str3, ", resetsAt=");
            s10.append(date);
            s10.append(Separators.RPAREN);
            return s10.toString();
        }

        public UsageProgress(String str, String str2, int i10, int i11, boolean z6, String str3, Date date) {
            str.getClass();
            str2.getClass();
            this.label = str;
            this.valueLabel = str2;
            this.progressCurrent = i10;
            this.progressTotal = i11;
            this.enabled = z6;
            this.infoTooltip = str3;
            this.resetsAt = date;
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0006HÆ\u0003J\t\u0010 \u001a\u00020\u0006HÆ\u0003J\t\u0010!\u001a\u00020\tHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\u000f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u000e0\rHÆ\u0003Ja\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rHÆ\u0001J\u0014\u0010&\u001a\u00020\t2\b\u0010'\u001a\u0004\u0018\u00010(HÖ\u0083\u0004J\n\u0010)\u001a\u00020\u0006HÖ\u0081\u0004J\n\u0010*\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006+"}, d2 = {"Lio/elevenlabs/domain/model/UsageSection$UsageExtraHours;", "Lio/elevenlabs/domain/model/UsageSection;", Constants.ScionAnalytics.PARAM_LABEL, "", "valueLabel", "progressCurrent", "", "progressTotal", "enabled", "", "infoTooltip", "packsSummaryLabel", "packs", "", "Lio/elevenlabs/domain/model/ActiveCreditPack;", "<init>", "(Ljava/lang/String;Ljava/lang/String;IIZLjava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getLabel", "()Ljava/lang/String;", "getValueLabel", "getProgressCurrent", "()I", "getProgressTotal", "getEnabled", "()Z", "getInfoTooltip", "getPacksSummaryLabel", "getPacks", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "", "hashCode", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final /* data */ class UsageExtraHours implements UsageSection {
        private final boolean enabled;
        private final String infoTooltip;
        private final String label;
        private final List<ActiveCreditPack> packs;
        private final String packsSummaryLabel;
        private final int progressCurrent;
        private final int progressTotal;
        private final String valueLabel;

        public UsageExtraHours(String str, String str2, int i10, int i11, boolean z6, String str3, String str4, List<ActiveCreditPack> list) {
            str.getClass();
            str2.getClass();
            str4.getClass();
            list.getClass();
            this.label = str;
            this.valueLabel = str2;
            this.progressCurrent = i10;
            this.progressTotal = i11;
            this.enabled = z6;
            this.infoTooltip = str3;
            this.packsSummaryLabel = str4;
            this.packs = list;
        }

        public static /* synthetic */ UsageExtraHours copy$default(UsageExtraHours usageExtraHours, String str, String str2, int i10, int i11, boolean z6, String str3, String str4, List list, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = usageExtraHours.label;
            }
            if ((i12 & 2) != 0) {
                str2 = usageExtraHours.valueLabel;
            }
            if ((i12 & 4) != 0) {
                i10 = usageExtraHours.progressCurrent;
            }
            if ((i12 & 8) != 0) {
                i11 = usageExtraHours.progressTotal;
            }
            if ((i12 & 16) != 0) {
                z6 = usageExtraHours.enabled;
            }
            if ((i12 & 32) != 0) {
                str3 = usageExtraHours.infoTooltip;
            }
            if ((i12 & 64) != 0) {
                str4 = usageExtraHours.packsSummaryLabel;
            }
            if ((i12 & 128) != 0) {
                list = usageExtraHours.packs;
            }
            String str5 = str4;
            List list2 = list;
            boolean z10 = z6;
            String str6 = str3;
            return usageExtraHours.copy(str, str2, i10, i11, z10, str6, str5, list2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        /* renamed from: component2, reason: from getter */
        public final String getValueLabel() {
            return this.valueLabel;
        }

        /* renamed from: component3, reason: from getter */
        public final int getProgressCurrent() {
            return this.progressCurrent;
        }

        /* renamed from: component4, reason: from getter */
        public final int getProgressTotal() {
            return this.progressTotal;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getEnabled() {
            return this.enabled;
        }

        /* renamed from: component6, reason: from getter */
        public final String getInfoTooltip() {
            return this.infoTooltip;
        }

        /* renamed from: component7, reason: from getter */
        public final String getPacksSummaryLabel() {
            return this.packsSummaryLabel;
        }

        public final List<ActiveCreditPack> component8() {
            return this.packs;
        }

        public final UsageExtraHours copy(String label, String valueLabel, int progressCurrent, int progressTotal, boolean enabled, String infoTooltip, String packsSummaryLabel, List<ActiveCreditPack> packs) {
            label.getClass();
            valueLabel.getClass();
            packsSummaryLabel.getClass();
            packs.getClass();
            return new UsageExtraHours(label, valueLabel, progressCurrent, progressTotal, enabled, infoTooltip, packsSummaryLabel, packs);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UsageExtraHours)) {
                return false;
            }
            UsageExtraHours usageExtraHours = (UsageExtraHours) other;
            if (m.c(this.label, usageExtraHours.label) && m.c(this.valueLabel, usageExtraHours.valueLabel) && this.progressCurrent == usageExtraHours.progressCurrent && this.progressTotal == usageExtraHours.progressTotal && this.enabled == usageExtraHours.enabled && m.c(this.infoTooltip, usageExtraHours.infoTooltip) && m.c(this.packsSummaryLabel, usageExtraHours.packsSummaryLabel) && m.c(this.packs, usageExtraHours.packs)) {
                return true;
            }
            return false;
        }

        public final boolean getEnabled() {
            return this.enabled;
        }

        public final String getInfoTooltip() {
            return this.infoTooltip;
        }

        public final String getLabel() {
            return this.label;
        }

        public final List<ActiveCreditPack> getPacks() {
            return this.packs;
        }

        public final String getPacksSummaryLabel() {
            return this.packsSummaryLabel;
        }

        public final int getProgressCurrent() {
            return this.progressCurrent;
        }

        public final int getProgressTotal() {
            return this.progressTotal;
        }

        public final String getValueLabel() {
            return this.valueLabel;
        }

        public int hashCode() {
            int hashCode;
            int f10 = b.f(c.b(this.progressTotal, c.b(this.progressCurrent, c.c(this.label.hashCode() * 31, 31, this.valueLabel), 31), 31), 31, this.enabled);
            String str = this.infoTooltip;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            return this.packs.hashCode() + c.c((f10 + hashCode) * 31, 31, this.packsSummaryLabel);
        }

        public String toString() {
            String str = this.label;
            String str2 = this.valueLabel;
            int i10 = this.progressCurrent;
            int i11 = this.progressTotal;
            boolean z6 = this.enabled;
            String str3 = this.infoTooltip;
            String str4 = this.packsSummaryLabel;
            List<ActiveCreditPack> list = this.packs;
            StringBuilder s10 = defpackage.f.s("UsageExtraHours(label=", str, ", valueLabel=", str2, ", progressCurrent=");
            a.t(s10, i10, ", progressTotal=", i11, ", enabled=");
            defpackage.f.z(s10, z6, ", infoTooltip=", str3, ", packsSummaryLabel=");
            s10.append(str4);
            s10.append(", packs=");
            s10.append(list);
            s10.append(Separators.RPAREN);
            return s10.toString();
        }

        public /* synthetic */ UsageExtraHours(String str, String str2, int i10, int i11, boolean z6, String str3, String str4, List list, int i12, f fVar) {
            this(str, str2, i10, i11, z6, (i12 & 32) != 0 ? null : str3, str4, list);
        }
    }
}
