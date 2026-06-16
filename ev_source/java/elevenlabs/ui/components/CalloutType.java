package io.elevenlabs.ui.components;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lio/elevenlabs/ui/components/CalloutType;", "", "<init>", "()V", "Large", "Small", "Lio/elevenlabs/ui/components/CalloutType$Large;", "Lio/elevenlabs/ui/components/CalloutType$Small;", "ui_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public abstract class CalloutType {
    public static final int $stable = 0;

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0083\u0004J\n\u0010\u0011\u001a\u00020\u0012HÖ\u0081\u0004J\n\u0010\u0013\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lio/elevenlabs/ui/components/CalloutType$Large;", "Lio/elevenlabs/ui/components/CalloutType;", "title", "", "subtitle", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ui_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final /* data */ class Large extends CalloutType {
        public static final int $stable = 0;
        private final String subtitle;
        private final String title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Large(String str, String str2) {
            super(null);
            str.getClass();
            str2.getClass();
            this.title = str;
            this.subtitle = str2;
        }

        public static /* synthetic */ Large copy$default(Large large, String str, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = large.title;
            }
            if ((i10 & 2) != 0) {
                str2 = large.subtitle;
            }
            return large.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final String getSubtitle() {
            return this.subtitle;
        }

        public final Large copy(String title, String subtitle) {
            title.getClass();
            subtitle.getClass();
            return new Large(title, subtitle);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Large)) {
                return false;
            }
            Large large = (Large) other;
            if (kotlin.jvm.internal.m.c(this.title, large.title) && kotlin.jvm.internal.m.c(this.subtitle, large.subtitle)) {
                return true;
            }
            return false;
        }

        public final String getSubtitle() {
            return this.subtitle;
        }

        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            return this.subtitle.hashCode() + (this.title.hashCode() * 31);
        }

        public String toString() {
            return z.h.c("Large(title=", this.title, ", subtitle=", this.subtitle, Separators.RPAREN);
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lio/elevenlabs/ui/components/CalloutType$Small;", "Lio/elevenlabs/ui/components/CalloutType;", ParameterNames.TEXT, "", "<init>", "(Ljava/lang/String;)V", "getText", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ui_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final /* data */ class Small extends CalloutType {
        public static final int $stable = 0;
        private final String text;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Small(String str) {
            super(null);
            str.getClass();
            this.text = str;
        }

        public static /* synthetic */ Small copy$default(Small small, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = small.text;
            }
            return small.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getText() {
            return this.text;
        }

        public final Small copy(String text) {
            text.getClass();
            return new Small(text);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if ((other instanceof Small) && kotlin.jvm.internal.m.c(this.text, ((Small) other).text)) {
                return true;
            }
            return false;
        }

        public final String getText() {
            return this.text;
        }

        public int hashCode() {
            return this.text.hashCode();
        }

        public String toString() {
            return defpackage.f.C("Small(text=", this.text, Separators.RPAREN);
        }
    }

    public /* synthetic */ CalloutType(kotlin.jvm.internal.f fVar) {
        this();
    }

    private CalloutType() {
    }
}
