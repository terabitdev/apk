package io.elevenlabs.domain.model;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import com.google.android.gms.internal.play_billing.b;
import com.google.firebase.analytics.FirebaseAnalytics;
import defpackage.f;
import ib.i;
import j0.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0012B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0014\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Lio/elevenlabs/domain/model/AccountPage;", "", "sections", "", "Lio/elevenlabs/domain/model/AccountPage$Section;", "<init>", "(Ljava/util/List;)V", "getSections", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Section", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final /* data */ class AccountPage {
    private final List<Section> sections;

    /* JADX WARN: Multi-variable type inference failed */
    public AccountPage(List<? extends Section> list) {
        list.getClass();
        this.sections = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AccountPage copy$default(AccountPage accountPage, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = accountPage.sections;
        }
        return accountPage.copy(list);
    }

    public final List<Section> component1() {
        return this.sections;
    }

    public final AccountPage copy(List<? extends Section> sections) {
        sections.getClass();
        return new AccountPage(sections);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if ((other instanceof AccountPage) && m.c(this.sections, ((AccountPage) other).sections)) {
            return true;
        }
        return false;
    }

    public final List<Section> getSections() {
        return this.sections;
    }

    public int hashCode() {
        return this.sections.hashCode();
    }

    public String toString() {
        return i.k("AccountPage(sections=", Separators.RPAREN, this.sections);
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lio/elevenlabs/domain/model/AccountPage$Section;", "", "Credits", "HelpfulResourcesV2", "TermsAndConditions", "LocalSettings", "CreditsUnlimited", "Lio/elevenlabs/domain/model/AccountPage$Section$Credits;", "Lio/elevenlabs/domain/model/AccountPage$Section$CreditsUnlimited;", "Lio/elevenlabs/domain/model/AccountPage$Section$HelpfulResourcesV2;", "Lio/elevenlabs/domain/model/AccountPage$Section$LocalSettings;", "Lio/elevenlabs/domain/model/AccountPage$Section$TermsAndConditions;", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public interface Section {

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u000bHÆ\u0003JQ\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0014\u0010\u001f\u001a\u00020\u00052\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0083\u0004J\n\u0010\"\u001a\u00020\u000bHÖ\u0081\u0004J\n\u0010#\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006$"}, d2 = {"Lio/elevenlabs/domain/model/AccountPage$Section$Credits;", "Lio/elevenlabs/domain/model/AccountPage$Section;", "currentPlan", "", "isPaidPlan", "", "canUpgrade", ParameterNames.TEXT, "timeText", "description", "counterNumber", "", "<init>", "(Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getCurrentPlan", "()Ljava/lang/String;", "()Z", "getCanUpgrade", "getText", "getTimeText", "getDescription", "getCounterNumber", "()I", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "", "hashCode", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class Credits implements Section {
            private final boolean canUpgrade;
            private final int counterNumber;
            private final String currentPlan;
            private final String description;
            private final boolean isPaidPlan;
            private final String text;
            private final String timeText;

            public Credits(String str, boolean z6, boolean z10, String str2, String str3, String str4, int i10) {
                i.s(str, str2, str3);
                this.currentPlan = str;
                this.isPaidPlan = z6;
                this.canUpgrade = z10;
                this.text = str2;
                this.timeText = str3;
                this.description = str4;
                this.counterNumber = i10;
            }

            public static /* synthetic */ Credits copy$default(Credits credits, String str, boolean z6, boolean z10, String str2, String str3, String str4, int i10, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = credits.currentPlan;
                }
                if ((i11 & 2) != 0) {
                    z6 = credits.isPaidPlan;
                }
                if ((i11 & 4) != 0) {
                    z10 = credits.canUpgrade;
                }
                if ((i11 & 8) != 0) {
                    str2 = credits.text;
                }
                if ((i11 & 16) != 0) {
                    str3 = credits.timeText;
                }
                if ((i11 & 32) != 0) {
                    str4 = credits.description;
                }
                if ((i11 & 64) != 0) {
                    i10 = credits.counterNumber;
                }
                String str5 = str4;
                int i12 = i10;
                String str6 = str3;
                boolean z11 = z10;
                return credits.copy(str, z6, z11, str2, str6, str5, i12);
            }

            /* renamed from: component1, reason: from getter */
            public final String getCurrentPlan() {
                return this.currentPlan;
            }

            /* renamed from: component2, reason: from getter */
            public final boolean getIsPaidPlan() {
                return this.isPaidPlan;
            }

            /* renamed from: component3, reason: from getter */
            public final boolean getCanUpgrade() {
                return this.canUpgrade;
            }

            /* renamed from: component4, reason: from getter */
            public final String getText() {
                return this.text;
            }

            /* renamed from: component5, reason: from getter */
            public final String getTimeText() {
                return this.timeText;
            }

            /* renamed from: component6, reason: from getter */
            public final String getDescription() {
                return this.description;
            }

            /* renamed from: component7, reason: from getter */
            public final int getCounterNumber() {
                return this.counterNumber;
            }

            public final Credits copy(String currentPlan, boolean isPaidPlan, boolean canUpgrade, String r12, String timeText, String description, int counterNumber) {
                currentPlan.getClass();
                r12.getClass();
                timeText.getClass();
                return new Credits(currentPlan, isPaidPlan, canUpgrade, r12, timeText, description, counterNumber);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Credits)) {
                    return false;
                }
                Credits credits = (Credits) other;
                if (m.c(this.currentPlan, credits.currentPlan) && this.isPaidPlan == credits.isPaidPlan && this.canUpgrade == credits.canUpgrade && m.c(this.text, credits.text) && m.c(this.timeText, credits.timeText) && m.c(this.description, credits.description) && this.counterNumber == credits.counterNumber) {
                    return true;
                }
                return false;
            }

            public final boolean getCanUpgrade() {
                return this.canUpgrade;
            }

            public final int getCounterNumber() {
                return this.counterNumber;
            }

            public final String getCurrentPlan() {
                return this.currentPlan;
            }

            public final String getDescription() {
                return this.description;
            }

            public final String getText() {
                return this.text;
            }

            public final String getTimeText() {
                return this.timeText;
            }

            public int hashCode() {
                int hashCode;
                int c5 = c.c(c.c(b.f(b.f(this.currentPlan.hashCode() * 31, 31, this.isPaidPlan), 31, this.canUpgrade), 31, this.text), 31, this.timeText);
                String str = this.description;
                if (str == null) {
                    hashCode = 0;
                } else {
                    hashCode = str.hashCode();
                }
                return Integer.hashCode(this.counterNumber) + ((c5 + hashCode) * 31);
            }

            public final boolean isPaidPlan() {
                return this.isPaidPlan;
            }

            public String toString() {
                String str = this.currentPlan;
                boolean z6 = this.isPaidPlan;
                boolean z10 = this.canUpgrade;
                String str2 = this.text;
                String str3 = this.timeText;
                String str4 = this.description;
                int i10 = this.counterNumber;
                StringBuilder sb = new StringBuilder("Credits(currentPlan=");
                sb.append(str);
                sb.append(", isPaidPlan=");
                sb.append(z6);
                sb.append(", canUpgrade=");
                f.z(sb, z10, ", text=", str2, ", timeText=");
                f.x(sb, str3, ", description=", str4, ", counterNumber=");
                return f.f(i10, Separators.RPAREN, sb);
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0083\u0004J\n\u0010\u0014\u001a\u00020\u0015HÖ\u0081\u0004J\n\u0010\u0016\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0017"}, d2 = {"Lio/elevenlabs/domain/model/AccountPage$Section$CreditsUnlimited;", "Lio/elevenlabs/domain/model/AccountPage$Section;", "currentPlan", "", "timeText", "description", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCurrentPlan", "()Ljava/lang/String;", "getTimeText", "getDescription", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class CreditsUnlimited implements Section {
            private final String currentPlan;
            private final String description;
            private final String timeText;

            public CreditsUnlimited(String str, String str2, String str3) {
                i.s(str, str2, str3);
                this.currentPlan = str;
                this.timeText = str2;
                this.description = str3;
            }

            public static /* synthetic */ CreditsUnlimited copy$default(CreditsUnlimited creditsUnlimited, String str, String str2, String str3, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = creditsUnlimited.currentPlan;
                }
                if ((i10 & 2) != 0) {
                    str2 = creditsUnlimited.timeText;
                }
                if ((i10 & 4) != 0) {
                    str3 = creditsUnlimited.description;
                }
                return creditsUnlimited.copy(str, str2, str3);
            }

            /* renamed from: component1, reason: from getter */
            public final String getCurrentPlan() {
                return this.currentPlan;
            }

            /* renamed from: component2, reason: from getter */
            public final String getTimeText() {
                return this.timeText;
            }

            /* renamed from: component3, reason: from getter */
            public final String getDescription() {
                return this.description;
            }

            public final CreditsUnlimited copy(String currentPlan, String timeText, String description) {
                currentPlan.getClass();
                timeText.getClass();
                description.getClass();
                return new CreditsUnlimited(currentPlan, timeText, description);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof CreditsUnlimited)) {
                    return false;
                }
                CreditsUnlimited creditsUnlimited = (CreditsUnlimited) other;
                if (m.c(this.currentPlan, creditsUnlimited.currentPlan) && m.c(this.timeText, creditsUnlimited.timeText) && m.c(this.description, creditsUnlimited.description)) {
                    return true;
                }
                return false;
            }

            public final String getCurrentPlan() {
                return this.currentPlan;
            }

            public final String getDescription() {
                return this.description;
            }

            public final String getTimeText() {
                return this.timeText;
            }

            public int hashCode() {
                return this.description.hashCode() + c.c(this.currentPlan.hashCode() * 31, 31, this.timeText);
            }

            public String toString() {
                return f.l(this.description, Separators.RPAREN, f.s("CreditsUnlimited(currentPlan=", this.currentPlan, ", timeText=", this.timeText, ", description="));
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/domain/model/AccountPage$Section$LocalSettings;", "Lio/elevenlabs/domain/model/AccountPage$Section;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class LocalSettings implements Section {
            public static final LocalSettings INSTANCE = new LocalSettings();

            private LocalSettings() {
            }

            public boolean equals(Object other) {
                if (this == other || (other instanceof LocalSettings)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return 1816904195;
            }

            public String toString() {
                return "LocalSettings";
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0017B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0083\u0004J\n\u0010\u0014\u001a\u00020\u0015HÖ\u0081\u0004J\n\u0010\u0016\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, d2 = {"Lio/elevenlabs/domain/model/AccountPage$Section$HelpfulResourcesV2;", "Lio/elevenlabs/domain/model/AccountPage$Section;", "title", "", FirebaseAnalytics.Param.ITEMS, "", "Lio/elevenlabs/domain/model/AccountPage$Section$HelpfulResourcesV2$Item;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getTitle", "()Ljava/lang/String;", "getItems", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "Item", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class HelpfulResourcesV2 implements Section {
            private final List<Item> items;
            private final String title;

            public HelpfulResourcesV2(String str, List<Item> list) {
                str.getClass();
                list.getClass();
                this.title = str;
                this.items = list;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ HelpfulResourcesV2 copy$default(HelpfulResourcesV2 helpfulResourcesV2, String str, List list, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = helpfulResourcesV2.title;
                }
                if ((i10 & 2) != 0) {
                    list = helpfulResourcesV2.items;
                }
                return helpfulResourcesV2.copy(str, list);
            }

            /* renamed from: component1, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            public final List<Item> component2() {
                return this.items;
            }

            public final HelpfulResourcesV2 copy(String title, List<Item> r32) {
                title.getClass();
                r32.getClass();
                return new HelpfulResourcesV2(title, r32);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof HelpfulResourcesV2)) {
                    return false;
                }
                HelpfulResourcesV2 helpfulResourcesV2 = (HelpfulResourcesV2) other;
                if (m.c(this.title, helpfulResourcesV2.title) && m.c(this.items, helpfulResourcesV2.items)) {
                    return true;
                }
                return false;
            }

            public final List<Item> getItems() {
                return this.items;
            }

            public final String getTitle() {
                return this.title;
            }

            public int hashCode() {
                return this.items.hashCode() + (this.title.hashCode() * 31);
            }

            public String toString() {
                return i.j("HelpfulResourcesV2(title=", this.title, ", items=", Separators.RPAREN, this.items);
            }

            /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
            @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J)\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lio/elevenlabs/domain/model/AccountPage$Section$HelpfulResourcesV2$Item;", "", "title", "", "url", ParameterNames.ICON, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getUrl", "getIcon", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            /* loaded from: classes3.dex */
            public static final /* data */ class Item {
                private final String icon;
                private final String title;
                private final String url;

                public Item(String str, String str2, String str3) {
                    str.getClass();
                    str2.getClass();
                    this.title = str;
                    this.url = str2;
                    this.icon = str3;
                }

                public static /* synthetic */ Item copy$default(Item item, String str, String str2, String str3, int i10, Object obj) {
                    if ((i10 & 1) != 0) {
                        str = item.title;
                    }
                    if ((i10 & 2) != 0) {
                        str2 = item.url;
                    }
                    if ((i10 & 4) != 0) {
                        str3 = item.icon;
                    }
                    return item.copy(str, str2, str3);
                }

                /* renamed from: component1, reason: from getter */
                public final String getTitle() {
                    return this.title;
                }

                /* renamed from: component2, reason: from getter */
                public final String getUrl() {
                    return this.url;
                }

                /* renamed from: component3, reason: from getter */
                public final String getIcon() {
                    return this.icon;
                }

                public final Item copy(String title, String url, String r42) {
                    title.getClass();
                    url.getClass();
                    return new Item(title, url, r42);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Item)) {
                        return false;
                    }
                    Item item = (Item) other;
                    if (m.c(this.title, item.title) && m.c(this.url, item.url) && m.c(this.icon, item.icon)) {
                        return true;
                    }
                    return false;
                }

                public final String getIcon() {
                    return this.icon;
                }

                public final String getTitle() {
                    return this.title;
                }

                public final String getUrl() {
                    return this.url;
                }

                public int hashCode() {
                    int hashCode;
                    int c5 = c.c(this.title.hashCode() * 31, 31, this.url);
                    String str = this.icon;
                    if (str == null) {
                        hashCode = 0;
                    } else {
                        hashCode = str.hashCode();
                    }
                    return c5 + hashCode;
                }

                public String toString() {
                    return f.l(this.icon, Separators.RPAREN, f.s("Item(title=", this.title, ", url=", this.url, ", icon="));
                }

                public /* synthetic */ Item(String str, String str2, String str3, int i10, kotlin.jvm.internal.f fVar) {
                    this(str, str2, (i10 & 4) != 0 ? null : str3);
                }
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0017B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0083\u0004J\n\u0010\u0014\u001a\u00020\u0015HÖ\u0081\u0004J\n\u0010\u0016\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, d2 = {"Lio/elevenlabs/domain/model/AccountPage$Section$TermsAndConditions;", "Lio/elevenlabs/domain/model/AccountPage$Section;", "title", "", FirebaseAnalytics.Param.ITEMS, "", "Lio/elevenlabs/domain/model/AccountPage$Section$TermsAndConditions$Item;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getTitle", "()Ljava/lang/String;", "getItems", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "Item", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class TermsAndConditions implements Section {
            private final List<Item> items;
            private final String title;

            public TermsAndConditions(String str, List<Item> list) {
                str.getClass();
                list.getClass();
                this.title = str;
                this.items = list;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ TermsAndConditions copy$default(TermsAndConditions termsAndConditions, String str, List list, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = termsAndConditions.title;
                }
                if ((i10 & 2) != 0) {
                    list = termsAndConditions.items;
                }
                return termsAndConditions.copy(str, list);
            }

            /* renamed from: component1, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            public final List<Item> component2() {
                return this.items;
            }

            public final TermsAndConditions copy(String title, List<Item> r32) {
                title.getClass();
                r32.getClass();
                return new TermsAndConditions(title, r32);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof TermsAndConditions)) {
                    return false;
                }
                TermsAndConditions termsAndConditions = (TermsAndConditions) other;
                if (m.c(this.title, termsAndConditions.title) && m.c(this.items, termsAndConditions.items)) {
                    return true;
                }
                return false;
            }

            public final List<Item> getItems() {
                return this.items;
            }

            public final String getTitle() {
                return this.title;
            }

            public int hashCode() {
                return this.items.hashCode() + (this.title.hashCode() * 31);
            }

            public String toString() {
                return i.j("TermsAndConditions(title=", this.title, ", items=", Separators.RPAREN, this.items);
            }

            /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
            @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J)\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lio/elevenlabs/domain/model/AccountPage$Section$TermsAndConditions$Item;", "", "title", "", "url", ParameterNames.ICON, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getUrl", "getIcon", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            /* loaded from: classes3.dex */
            public static final /* data */ class Item {
                private final String icon;
                private final String title;
                private final String url;

                public Item(String str, String str2, String str3) {
                    str.getClass();
                    str2.getClass();
                    this.title = str;
                    this.url = str2;
                    this.icon = str3;
                }

                public static /* synthetic */ Item copy$default(Item item, String str, String str2, String str3, int i10, Object obj) {
                    if ((i10 & 1) != 0) {
                        str = item.title;
                    }
                    if ((i10 & 2) != 0) {
                        str2 = item.url;
                    }
                    if ((i10 & 4) != 0) {
                        str3 = item.icon;
                    }
                    return item.copy(str, str2, str3);
                }

                /* renamed from: component1, reason: from getter */
                public final String getTitle() {
                    return this.title;
                }

                /* renamed from: component2, reason: from getter */
                public final String getUrl() {
                    return this.url;
                }

                /* renamed from: component3, reason: from getter */
                public final String getIcon() {
                    return this.icon;
                }

                public final Item copy(String title, String url, String r42) {
                    title.getClass();
                    url.getClass();
                    return new Item(title, url, r42);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Item)) {
                        return false;
                    }
                    Item item = (Item) other;
                    if (m.c(this.title, item.title) && m.c(this.url, item.url) && m.c(this.icon, item.icon)) {
                        return true;
                    }
                    return false;
                }

                public final String getIcon() {
                    return this.icon;
                }

                public final String getTitle() {
                    return this.title;
                }

                public final String getUrl() {
                    return this.url;
                }

                public int hashCode() {
                    int hashCode;
                    int c5 = c.c(this.title.hashCode() * 31, 31, this.url);
                    String str = this.icon;
                    if (str == null) {
                        hashCode = 0;
                    } else {
                        hashCode = str.hashCode();
                    }
                    return c5 + hashCode;
                }

                public String toString() {
                    return f.l(this.icon, Separators.RPAREN, f.s("Item(title=", this.title, ", url=", this.url, ", icon="));
                }

                public /* synthetic */ Item(String str, String str2, String str3, int i10, kotlin.jvm.internal.f fVar) {
                    this(str, str2, (i10 & 4) != 0 ? null : str3);
                }
            }
        }
    }
}
