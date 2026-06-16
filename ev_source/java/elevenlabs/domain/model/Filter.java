package io.elevenlabs.domain.model;

import android.gov.nist.core.Separators;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import defpackage.f;
import ib.i;
import j0.c;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;
import z.h;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\b\tR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005\u0082\u0001\u0002\n\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lio/elevenlabs/domain/model/Filter;", "", SubscriberAttributeKt.JSON_NAME_KEY, "", "getKey", "()Ljava/lang/String;", "description", "getDescription", "Default", "Accent", "Lio/elevenlabs/domain/model/Filter$Accent;", "Lio/elevenlabs/domain/model/Filter$Default;", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public interface Filter {

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0083\u0004J\n\u0010\u0014\u001a\u00020\u0015HÖ\u0081\u0004J\n\u0010\u0016\u001a\u00020\u0003HÖ\u0081\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0017"}, d2 = {"Lio/elevenlabs/domain/model/Filter$Accent;", "Lio/elevenlabs/domain/model/Filter;", SubscriberAttributeKt.JSON_NAME_KEY, "", "description", "language", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getKey", "()Ljava/lang/String;", "getDescription", "getLanguage", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final /* data */ class Accent implements Filter {
        private final String description;
        private final String key;
        private final String language;

        public Accent(String str, String str2, String str3) {
            i.s(str, str2, str3);
            this.key = str;
            this.description = str2;
            this.language = str3;
        }

        public static /* synthetic */ Accent copy$default(Accent accent, String str, String str2, String str3, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = accent.key;
            }
            if ((i10 & 2) != 0) {
                str2 = accent.description;
            }
            if ((i10 & 4) != 0) {
                str3 = accent.language;
            }
            return accent.copy(str, str2, str3);
        }

        /* renamed from: component1, reason: from getter */
        public final String getKey() {
            return this.key;
        }

        /* renamed from: component2, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        /* renamed from: component3, reason: from getter */
        public final String getLanguage() {
            return this.language;
        }

        public final Accent copy(String key, String description, String language) {
            key.getClass();
            description.getClass();
            language.getClass();
            return new Accent(key, description, language);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Accent)) {
                return false;
            }
            Accent accent = (Accent) other;
            if (m.c(this.key, accent.key) && m.c(this.description, accent.description) && m.c(this.language, accent.language)) {
                return true;
            }
            return false;
        }

        @Override // io.elevenlabs.domain.model.Filter
        public String getDescription() {
            return this.description;
        }

        @Override // io.elevenlabs.domain.model.Filter
        public String getKey() {
            return this.key;
        }

        public final String getLanguage() {
            return this.language;
        }

        public int hashCode() {
            return this.language.hashCode() + c.c(this.key.hashCode() * 31, 31, this.description);
        }

        public String toString() {
            return f.l(this.language, Separators.RPAREN, f.s("Accent(key=", this.key, ", description=", this.description, ", language="));
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0083\u0004J\n\u0010\u0011\u001a\u00020\u0012HÖ\u0081\u0004J\n\u0010\u0013\u001a\u00020\u0003HÖ\u0081\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lio/elevenlabs/domain/model/Filter$Default;", "Lio/elevenlabs/domain/model/Filter;", SubscriberAttributeKt.JSON_NAME_KEY, "", "description", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getKey", "()Ljava/lang/String;", "getDescription", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final /* data */ class Default implements Filter {
        private final String description;
        private final String key;

        public Default(String str, String str2) {
            str.getClass();
            str2.getClass();
            this.key = str;
            this.description = str2;
        }

        public static /* synthetic */ Default copy$default(Default r02, String str, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = r02.key;
            }
            if ((i10 & 2) != 0) {
                str2 = r02.description;
            }
            return r02.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getKey() {
            return this.key;
        }

        /* renamed from: component2, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        public final Default copy(String key, String description) {
            key.getClass();
            description.getClass();
            return new Default(key, description);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Default)) {
                return false;
            }
            Default r52 = (Default) other;
            if (m.c(this.key, r52.key) && m.c(this.description, r52.description)) {
                return true;
            }
            return false;
        }

        @Override // io.elevenlabs.domain.model.Filter
        public String getDescription() {
            return this.description;
        }

        @Override // io.elevenlabs.domain.model.Filter
        public String getKey() {
            return this.key;
        }

        public int hashCode() {
            return this.description.hashCode() + (this.key.hashCode() * 31);
        }

        public String toString() {
            return h.c("Default(key=", this.key, ", description=", this.description, Separators.RPAREN);
        }
    }

    String getDescription();

    String getKey();
}
