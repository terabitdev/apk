package io.elevenlabs.domain.model;

import android.gov.nist.core.Separators;
import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u000b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\u0082\u0001\u000b\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017¨\u0006\u0018À\u0006\u0003"}, d2 = {"Lio/elevenlabs/domain/model/ReadDetailsSection;", "", "MediaHeader", "Meta", "TitleDescription", "Details", "ReadActions", "Author", "Reads", "ReadsV2", "Read", "FlatCarousel", "Chapters", "Lio/elevenlabs/domain/model/ReadDetailsSection$Author;", "Lio/elevenlabs/domain/model/ReadDetailsSection$Chapters;", "Lio/elevenlabs/domain/model/ReadDetailsSection$Details;", "Lio/elevenlabs/domain/model/ReadDetailsSection$FlatCarousel;", "Lio/elevenlabs/domain/model/ReadDetailsSection$MediaHeader;", "Lio/elevenlabs/domain/model/ReadDetailsSection$Meta;", "Lio/elevenlabs/domain/model/ReadDetailsSection$Read;", "Lio/elevenlabs/domain/model/ReadDetailsSection$ReadActions;", "Lio/elevenlabs/domain/model/ReadDetailsSection$Reads;", "Lio/elevenlabs/domain/model/ReadDetailsSection$ReadsV2;", "Lio/elevenlabs/domain/model/ReadDetailsSection$TitleDescription;", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public interface ReadDetailsSection {

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lio/elevenlabs/domain/model/ReadDetailsSection$Author;", "Lio/elevenlabs/domain/model/ReadDetailsSection;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lio/elevenlabs/domain/model/ReadDetailsAuthorSection;", "<init>", "(Lio/elevenlabs/domain/model/ReadDetailsAuthorSection;)V", "getData", "()Lio/elevenlabs/domain/model/ReadDetailsAuthorSection;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final /* data */ class Author implements ReadDetailsSection {
        private final ReadDetailsAuthorSection data;

        public Author(ReadDetailsAuthorSection readDetailsAuthorSection) {
            readDetailsAuthorSection.getClass();
            this.data = readDetailsAuthorSection;
        }

        public static /* synthetic */ Author copy$default(Author author, ReadDetailsAuthorSection readDetailsAuthorSection, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                readDetailsAuthorSection = author.data;
            }
            return author.copy(readDetailsAuthorSection);
        }

        /* renamed from: component1, reason: from getter */
        public final ReadDetailsAuthorSection getData() {
            return this.data;
        }

        public final Author copy(ReadDetailsAuthorSection data) {
            data.getClass();
            return new Author(data);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if ((other instanceof Author) && m.c(this.data, ((Author) other).data)) {
                return true;
            }
            return false;
        }

        public final ReadDetailsAuthorSection getData() {
            return this.data;
        }

        public int hashCode() {
            return this.data.hashCode();
        }

        public String toString() {
            return "Author(data=" + this.data + Separators.RPAREN;
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lio/elevenlabs/domain/model/ReadDetailsSection$Chapters;", "Lio/elevenlabs/domain/model/ReadDetailsSection;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lio/elevenlabs/domain/model/ReadDetailsChaptersSection;", "<init>", "(Lio/elevenlabs/domain/model/ReadDetailsChaptersSection;)V", "getData", "()Lio/elevenlabs/domain/model/ReadDetailsChaptersSection;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final /* data */ class Chapters implements ReadDetailsSection {
        private final ReadDetailsChaptersSection data;

        public Chapters(ReadDetailsChaptersSection readDetailsChaptersSection) {
            readDetailsChaptersSection.getClass();
            this.data = readDetailsChaptersSection;
        }

        public static /* synthetic */ Chapters copy$default(Chapters chapters, ReadDetailsChaptersSection readDetailsChaptersSection, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                readDetailsChaptersSection = chapters.data;
            }
            return chapters.copy(readDetailsChaptersSection);
        }

        /* renamed from: component1, reason: from getter */
        public final ReadDetailsChaptersSection getData() {
            return this.data;
        }

        public final Chapters copy(ReadDetailsChaptersSection data) {
            data.getClass();
            return new Chapters(data);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if ((other instanceof Chapters) && m.c(this.data, ((Chapters) other).data)) {
                return true;
            }
            return false;
        }

        public final ReadDetailsChaptersSection getData() {
            return this.data;
        }

        public int hashCode() {
            return this.data.hashCode();
        }

        public String toString() {
            return "Chapters(data=" + this.data + Separators.RPAREN;
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lio/elevenlabs/domain/model/ReadDetailsSection$Details;", "Lio/elevenlabs/domain/model/ReadDetailsSection;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lio/elevenlabs/domain/model/ReadDetailsDetailsSection;", "<init>", "(Lio/elevenlabs/domain/model/ReadDetailsDetailsSection;)V", "getData", "()Lio/elevenlabs/domain/model/ReadDetailsDetailsSection;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final /* data */ class Details implements ReadDetailsSection {
        private final ReadDetailsDetailsSection data;

        public Details(ReadDetailsDetailsSection readDetailsDetailsSection) {
            readDetailsDetailsSection.getClass();
            this.data = readDetailsDetailsSection;
        }

        public static /* synthetic */ Details copy$default(Details details, ReadDetailsDetailsSection readDetailsDetailsSection, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                readDetailsDetailsSection = details.data;
            }
            return details.copy(readDetailsDetailsSection);
        }

        /* renamed from: component1, reason: from getter */
        public final ReadDetailsDetailsSection getData() {
            return this.data;
        }

        public final Details copy(ReadDetailsDetailsSection data) {
            data.getClass();
            return new Details(data);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if ((other instanceof Details) && m.c(this.data, ((Details) other).data)) {
                return true;
            }
            return false;
        }

        public final ReadDetailsDetailsSection getData() {
            return this.data;
        }

        public int hashCode() {
            return this.data.hashCode();
        }

        public String toString() {
            return "Details(data=" + this.data + Separators.RPAREN;
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lio/elevenlabs/domain/model/ReadDetailsSection$FlatCarousel;", "Lio/elevenlabs/domain/model/ReadDetailsSection;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lio/elevenlabs/domain/model/FlatCarouselSection;", "<init>", "(Lio/elevenlabs/domain/model/FlatCarouselSection;)V", "getData", "()Lio/elevenlabs/domain/model/FlatCarouselSection;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final /* data */ class FlatCarousel implements ReadDetailsSection {
        private final FlatCarouselSection data;

        public FlatCarousel(FlatCarouselSection flatCarouselSection) {
            flatCarouselSection.getClass();
            this.data = flatCarouselSection;
        }

        public static /* synthetic */ FlatCarousel copy$default(FlatCarousel flatCarousel, FlatCarouselSection flatCarouselSection, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                flatCarouselSection = flatCarousel.data;
            }
            return flatCarousel.copy(flatCarouselSection);
        }

        /* renamed from: component1, reason: from getter */
        public final FlatCarouselSection getData() {
            return this.data;
        }

        public final FlatCarousel copy(FlatCarouselSection data) {
            data.getClass();
            return new FlatCarousel(data);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if ((other instanceof FlatCarousel) && m.c(this.data, ((FlatCarousel) other).data)) {
                return true;
            }
            return false;
        }

        public final FlatCarouselSection getData() {
            return this.data;
        }

        public int hashCode() {
            return this.data.hashCode();
        }

        public String toString() {
            return "FlatCarousel(data=" + this.data + Separators.RPAREN;
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lio/elevenlabs/domain/model/ReadDetailsSection$MediaHeader;", "Lio/elevenlabs/domain/model/ReadDetailsSection;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lio/elevenlabs/domain/model/MediaHeaderSection;", "<init>", "(Lio/elevenlabs/domain/model/MediaHeaderSection;)V", "getData", "()Lio/elevenlabs/domain/model/MediaHeaderSection;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final /* data */ class MediaHeader implements ReadDetailsSection {
        private final MediaHeaderSection data;

        public MediaHeader(MediaHeaderSection mediaHeaderSection) {
            mediaHeaderSection.getClass();
            this.data = mediaHeaderSection;
        }

        public static /* synthetic */ MediaHeader copy$default(MediaHeader mediaHeader, MediaHeaderSection mediaHeaderSection, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                mediaHeaderSection = mediaHeader.data;
            }
            return mediaHeader.copy(mediaHeaderSection);
        }

        /* renamed from: component1, reason: from getter */
        public final MediaHeaderSection getData() {
            return this.data;
        }

        public final MediaHeader copy(MediaHeaderSection data) {
            data.getClass();
            return new MediaHeader(data);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if ((other instanceof MediaHeader) && m.c(this.data, ((MediaHeader) other).data)) {
                return true;
            }
            return false;
        }

        public final MediaHeaderSection getData() {
            return this.data;
        }

        public int hashCode() {
            return this.data.hashCode();
        }

        public String toString() {
            return "MediaHeader(data=" + this.data + Separators.RPAREN;
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lio/elevenlabs/domain/model/ReadDetailsSection$Meta;", "Lio/elevenlabs/domain/model/ReadDetailsSection;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lio/elevenlabs/domain/model/MetaSection;", "<init>", "(Lio/elevenlabs/domain/model/MetaSection;)V", "getData", "()Lio/elevenlabs/domain/model/MetaSection;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final /* data */ class Meta implements ReadDetailsSection {
        private final MetaSection data;

        public Meta(MetaSection metaSection) {
            metaSection.getClass();
            this.data = metaSection;
        }

        public static /* synthetic */ Meta copy$default(Meta meta, MetaSection metaSection, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                metaSection = meta.data;
            }
            return meta.copy(metaSection);
        }

        /* renamed from: component1, reason: from getter */
        public final MetaSection getData() {
            return this.data;
        }

        public final Meta copy(MetaSection data) {
            data.getClass();
            return new Meta(data);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if ((other instanceof Meta) && m.c(this.data, ((Meta) other).data)) {
                return true;
            }
            return false;
        }

        public final MetaSection getData() {
            return this.data;
        }

        public int hashCode() {
            return this.data.hashCode();
        }

        public String toString() {
            return "Meta(data=" + this.data + Separators.RPAREN;
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lio/elevenlabs/domain/model/ReadDetailsSection$Read;", "Lio/elevenlabs/domain/model/ReadDetailsSection;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lio/elevenlabs/domain/model/ReadSection;", "<init>", "(Lio/elevenlabs/domain/model/ReadSection;)V", "getData", "()Lio/elevenlabs/domain/model/ReadSection;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final /* data */ class Read implements ReadDetailsSection {
        private final ReadSection data;

        public Read(ReadSection readSection) {
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
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lio/elevenlabs/domain/model/ReadDetailsSection$ReadActions;", "Lio/elevenlabs/domain/model/ReadDetailsSection;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lio/elevenlabs/domain/model/ReadDetailsReadActions;", "<init>", "(Lio/elevenlabs/domain/model/ReadDetailsReadActions;)V", "getData", "()Lio/elevenlabs/domain/model/ReadDetailsReadActions;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final /* data */ class ReadActions implements ReadDetailsSection {
        private final ReadDetailsReadActions data;

        public ReadActions(ReadDetailsReadActions readDetailsReadActions) {
            readDetailsReadActions.getClass();
            this.data = readDetailsReadActions;
        }

        public static /* synthetic */ ReadActions copy$default(ReadActions readActions, ReadDetailsReadActions readDetailsReadActions, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                readDetailsReadActions = readActions.data;
            }
            return readActions.copy(readDetailsReadActions);
        }

        /* renamed from: component1, reason: from getter */
        public final ReadDetailsReadActions getData() {
            return this.data;
        }

        public final ReadActions copy(ReadDetailsReadActions data) {
            data.getClass();
            return new ReadActions(data);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if ((other instanceof ReadActions) && m.c(this.data, ((ReadActions) other).data)) {
                return true;
            }
            return false;
        }

        public final ReadDetailsReadActions getData() {
            return this.data;
        }

        public int hashCode() {
            return this.data.hashCode();
        }

        public String toString() {
            return "ReadActions(data=" + this.data + Separators.RPAREN;
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lio/elevenlabs/domain/model/ReadDetailsSection$Reads;", "Lio/elevenlabs/domain/model/ReadDetailsSection;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lio/elevenlabs/domain/model/ReadsSection;", "<init>", "(Lio/elevenlabs/domain/model/ReadsSection;)V", "getData", "()Lio/elevenlabs/domain/model/ReadsSection;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final /* data */ class Reads implements ReadDetailsSection {
        private final ReadsSection data;

        public Reads(ReadsSection readsSection) {
            readsSection.getClass();
            this.data = readsSection;
        }

        public static /* synthetic */ Reads copy$default(Reads reads, ReadsSection readsSection, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                readsSection = reads.data;
            }
            return reads.copy(readsSection);
        }

        /* renamed from: component1, reason: from getter */
        public final ReadsSection getData() {
            return this.data;
        }

        public final Reads copy(ReadsSection data) {
            data.getClass();
            return new Reads(data);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if ((other instanceof Reads) && m.c(this.data, ((Reads) other).data)) {
                return true;
            }
            return false;
        }

        public final ReadsSection getData() {
            return this.data;
        }

        public int hashCode() {
            return this.data.hashCode();
        }

        public String toString() {
            return "Reads(data=" + this.data + Separators.RPAREN;
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lio/elevenlabs/domain/model/ReadDetailsSection$ReadsV2;", "Lio/elevenlabs/domain/model/ReadDetailsSection;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lio/elevenlabs/domain/model/ReadsV2Section;", "<init>", "(Lio/elevenlabs/domain/model/ReadsV2Section;)V", "getData", "()Lio/elevenlabs/domain/model/ReadsV2Section;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final /* data */ class ReadsV2 implements ReadDetailsSection {
        private final ReadsV2Section data;

        public ReadsV2(ReadsV2Section readsV2Section) {
            readsV2Section.getClass();
            this.data = readsV2Section;
        }

        public static /* synthetic */ ReadsV2 copy$default(ReadsV2 readsV2, ReadsV2Section readsV2Section, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                readsV2Section = readsV2.data;
            }
            return readsV2.copy(readsV2Section);
        }

        /* renamed from: component1, reason: from getter */
        public final ReadsV2Section getData() {
            return this.data;
        }

        public final ReadsV2 copy(ReadsV2Section data) {
            data.getClass();
            return new ReadsV2(data);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if ((other instanceof ReadsV2) && m.c(this.data, ((ReadsV2) other).data)) {
                return true;
            }
            return false;
        }

        public final ReadsV2Section getData() {
            return this.data;
        }

        public int hashCode() {
            return this.data.hashCode();
        }

        public String toString() {
            return "ReadsV2(data=" + this.data + Separators.RPAREN;
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lio/elevenlabs/domain/model/ReadDetailsSection$TitleDescription;", "Lio/elevenlabs/domain/model/ReadDetailsSection;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lio/elevenlabs/domain/model/ReadDetailsTitleDescriptionSection;", "<init>", "(Lio/elevenlabs/domain/model/ReadDetailsTitleDescriptionSection;)V", "getData", "()Lio/elevenlabs/domain/model/ReadDetailsTitleDescriptionSection;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final /* data */ class TitleDescription implements ReadDetailsSection {
        private final ReadDetailsTitleDescriptionSection data;

        public TitleDescription(ReadDetailsTitleDescriptionSection readDetailsTitleDescriptionSection) {
            readDetailsTitleDescriptionSection.getClass();
            this.data = readDetailsTitleDescriptionSection;
        }

        public static /* synthetic */ TitleDescription copy$default(TitleDescription titleDescription, ReadDetailsTitleDescriptionSection readDetailsTitleDescriptionSection, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                readDetailsTitleDescriptionSection = titleDescription.data;
            }
            return titleDescription.copy(readDetailsTitleDescriptionSection);
        }

        /* renamed from: component1, reason: from getter */
        public final ReadDetailsTitleDescriptionSection getData() {
            return this.data;
        }

        public final TitleDescription copy(ReadDetailsTitleDescriptionSection data) {
            data.getClass();
            return new TitleDescription(data);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if ((other instanceof TitleDescription) && m.c(this.data, ((TitleDescription) other).data)) {
                return true;
            }
            return false;
        }

        public final ReadDetailsTitleDescriptionSection getData() {
            return this.data;
        }

        public int hashCode() {
            return this.data.hashCode();
        }

        public String toString() {
            return "TitleDescription(data=" + this.data + Separators.RPAREN;
        }
    }
}
