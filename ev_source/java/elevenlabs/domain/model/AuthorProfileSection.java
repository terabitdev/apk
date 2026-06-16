package io.elevenlabs.domain.model;

import android.gov.nist.core.Separators;
import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lio/elevenlabs/domain/model/AuthorProfileSection;", "", "<init>", "()V", "Header", "Actions", "Series", "Read", "Lio/elevenlabs/domain/model/AuthorProfileSection$Actions;", "Lio/elevenlabs/domain/model/AuthorProfileSection$Header;", "Lio/elevenlabs/domain/model/AuthorProfileSection$Read;", "Lio/elevenlabs/domain/model/AuthorProfileSection$Series;", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public abstract class AuthorProfileSection {

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lio/elevenlabs/domain/model/AuthorProfileSection$Actions;", "Lio/elevenlabs/domain/model/AuthorProfileSection;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lio/elevenlabs/domain/model/AuthorActionsSection;", "<init>", "(Lio/elevenlabs/domain/model/AuthorActionsSection;)V", "getData", "()Lio/elevenlabs/domain/model/AuthorActionsSection;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final /* data */ class Actions extends AuthorProfileSection {
        private final AuthorActionsSection data;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Actions(AuthorActionsSection authorActionsSection) {
            super(null);
            authorActionsSection.getClass();
            this.data = authorActionsSection;
        }

        public static /* synthetic */ Actions copy$default(Actions actions, AuthorActionsSection authorActionsSection, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                authorActionsSection = actions.data;
            }
            return actions.copy(authorActionsSection);
        }

        /* renamed from: component1, reason: from getter */
        public final AuthorActionsSection getData() {
            return this.data;
        }

        public final Actions copy(AuthorActionsSection data) {
            data.getClass();
            return new Actions(data);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if ((other instanceof Actions) && m.c(this.data, ((Actions) other).data)) {
                return true;
            }
            return false;
        }

        public final AuthorActionsSection getData() {
            return this.data;
        }

        public int hashCode() {
            return this.data.hashCode();
        }

        public String toString() {
            return "Actions(data=" + this.data + Separators.RPAREN;
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lio/elevenlabs/domain/model/AuthorProfileSection$Header;", "Lio/elevenlabs/domain/model/AuthorProfileSection;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lio/elevenlabs/domain/model/AuthorProfileHeaderSection;", "<init>", "(Lio/elevenlabs/domain/model/AuthorProfileHeaderSection;)V", "getData", "()Lio/elevenlabs/domain/model/AuthorProfileHeaderSection;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final /* data */ class Header extends AuthorProfileSection {
        private final AuthorProfileHeaderSection data;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Header(AuthorProfileHeaderSection authorProfileHeaderSection) {
            super(null);
            authorProfileHeaderSection.getClass();
            this.data = authorProfileHeaderSection;
        }

        public static /* synthetic */ Header copy$default(Header header, AuthorProfileHeaderSection authorProfileHeaderSection, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                authorProfileHeaderSection = header.data;
            }
            return header.copy(authorProfileHeaderSection);
        }

        /* renamed from: component1, reason: from getter */
        public final AuthorProfileHeaderSection getData() {
            return this.data;
        }

        public final Header copy(AuthorProfileHeaderSection data) {
            data.getClass();
            return new Header(data);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if ((other instanceof Header) && m.c(this.data, ((Header) other).data)) {
                return true;
            }
            return false;
        }

        public final AuthorProfileHeaderSection getData() {
            return this.data;
        }

        public int hashCode() {
            return this.data.hashCode();
        }

        public String toString() {
            return "Header(data=" + this.data + Separators.RPAREN;
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lio/elevenlabs/domain/model/AuthorProfileSection$Read;", "Lio/elevenlabs/domain/model/AuthorProfileSection;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lio/elevenlabs/domain/model/ReadSection;", "<init>", "(Lio/elevenlabs/domain/model/ReadSection;)V", "getData", "()Lio/elevenlabs/domain/model/ReadSection;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final /* data */ class Read extends AuthorProfileSection {
        private final ReadSection data;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Read(ReadSection readSection) {
            super(null);
            readSection.getClass();
            this.data = readSection;
        }

        public static /* synthetic */ Read copy$default(Read read, ReadSection readSection, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                readSection = read.data;
            }
            return read.copy(readSection);
        }

        /* renamed from: component1, reason: from getter */
        public final ReadSection getData() {
            return this.data;
        }

        public final Read copy(ReadSection data) {
            data.getClass();
            return new Read(data);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if ((other instanceof Read) && m.c(this.data, ((Read) other).data)) {
                return true;
            }
            return false;
        }

        public final ReadSection getData() {
            return this.data;
        }

        public int hashCode() {
            return this.data.hashCode();
        }

        public String toString() {
            return "Read(data=" + this.data + Separators.RPAREN;
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lio/elevenlabs/domain/model/AuthorProfileSection$Series;", "Lio/elevenlabs/domain/model/AuthorProfileSection;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lio/elevenlabs/domain/model/SeriesSection;", "<init>", "(Lio/elevenlabs/domain/model/SeriesSection;)V", "getData", "()Lio/elevenlabs/domain/model/SeriesSection;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final /* data */ class Series extends AuthorProfileSection {
        private final SeriesSection data;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Series(SeriesSection seriesSection) {
            super(null);
            seriesSection.getClass();
            this.data = seriesSection;
        }

        public static /* synthetic */ Series copy$default(Series series, SeriesSection seriesSection, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                seriesSection = series.data;
            }
            return series.copy(seriesSection);
        }

        /* renamed from: component1, reason: from getter */
        public final SeriesSection getData() {
            return this.data;
        }

        public final Series copy(SeriesSection data) {
            data.getClass();
            return new Series(data);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if ((other instanceof Series) && m.c(this.data, ((Series) other).data)) {
                return true;
            }
            return false;
        }

        public final SeriesSection getData() {
            return this.data;
        }

        public int hashCode() {
            return this.data.hashCode();
        }

        public String toString() {
            return "Series(data=" + this.data + Separators.RPAREN;
        }
    }

    public /* synthetic */ AuthorProfileSection(f fVar) {
        this();
    }

    private AuthorProfileSection() {
    }
}
