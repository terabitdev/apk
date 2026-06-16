package io.elevenlabs.domain.model.home;

import android.gov.nist.core.Separators;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import defpackage.f;
import ib.i;
import io.elevenlabs.domain.model.AnnouncementBannerCarouselSection;
import io.elevenlabs.domain.model.CategoryReadsRowSection;
import io.elevenlabs.domain.model.EmptyStateSection;
import io.elevenlabs.domain.model.HighlightedCollectionsRowSection;
import io.elevenlabs.domain.model.MiniReadGridSection;
import io.elevenlabs.domain.model.ReadFromFollowingSection;
import io.elevenlabs.domain.model.StatsCarouselSection;
import j0.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u0016\u0017B#\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J)\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0015HÖ\u0081\u0004R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\n¨\u0006\u0018"}, d2 = {"Lio/elevenlabs/domain/model/home/HomePageV3;", "", "sections", "", "Lio/elevenlabs/domain/model/home/HomePageV3$Section;", "subpages", "Lio/elevenlabs/domain/model/home/HomePageV3$Subpage;", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "getSections", "()Ljava/util/List;", "getSubpages", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Subpage", "Section", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final /* data */ class HomePageV3 {
    private final List<Section> sections;
    private final List<Subpage> subpages;

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\n\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\u0082\u0001\n\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016À\u0006\u0003"}, d2 = {"Lio/elevenlabs/domain/model/home/HomePageV3$Section;", "", "RecentReadsSection", "HomeActionList", "StatsCarousel", "CategoryReadsRow", "GenreTilesGridRow", "FeaturedCardList", "MiniReadGrid", "HighlightedCollectionsRow", "EmptyState", "ReadFromFollowing", "Lio/elevenlabs/domain/model/home/HomePageV3$Section$CategoryReadsRow;", "Lio/elevenlabs/domain/model/home/HomePageV3$Section$EmptyState;", "Lio/elevenlabs/domain/model/home/HomePageV3$Section$FeaturedCardList;", "Lio/elevenlabs/domain/model/home/HomePageV3$Section$GenreTilesGridRow;", "Lio/elevenlabs/domain/model/home/HomePageV3$Section$HighlightedCollectionsRow;", "Lio/elevenlabs/domain/model/home/HomePageV3$Section$HomeActionList;", "Lio/elevenlabs/domain/model/home/HomePageV3$Section$MiniReadGrid;", "Lio/elevenlabs/domain/model/home/HomePageV3$Section$ReadFromFollowing;", "Lio/elevenlabs/domain/model/home/HomePageV3$Section$RecentReadsSection;", "Lio/elevenlabs/domain/model/home/HomePageV3$Section$StatsCarousel;", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public interface Section {

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lio/elevenlabs/domain/model/home/HomePageV3$Section$CategoryReadsRow;", "Lio/elevenlabs/domain/model/home/HomePageV3$Section;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lio/elevenlabs/domain/model/CategoryReadsRowSection;", "<init>", "(Lio/elevenlabs/domain/model/CategoryReadsRowSection;)V", "getData", "()Lio/elevenlabs/domain/model/CategoryReadsRowSection;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class CategoryReadsRow implements Section {
            private final CategoryReadsRowSection data;

            public CategoryReadsRow(CategoryReadsRowSection categoryReadsRowSection) {
                categoryReadsRowSection.getClass();
                this.data = categoryReadsRowSection;
            }

            public static /* synthetic */ CategoryReadsRow copy$default(CategoryReadsRow categoryReadsRow, CategoryReadsRowSection categoryReadsRowSection, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    categoryReadsRowSection = categoryReadsRow.data;
                }
                return categoryReadsRow.copy(categoryReadsRowSection);
            }

            /* renamed from: component1, reason: from getter */
            public final CategoryReadsRowSection getData() {
                return this.data;
            }

            public final CategoryReadsRow copy(CategoryReadsRowSection data) {
                data.getClass();
                return new CategoryReadsRow(data);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if ((other instanceof CategoryReadsRow) && m.c(this.data, ((CategoryReadsRow) other).data)) {
                    return true;
                }
                return false;
            }

            public final CategoryReadsRowSection getData() {
                return this.data;
            }

            public int hashCode() {
                return this.data.hashCode();
            }

            public String toString() {
                return "CategoryReadsRow(data=" + this.data + Separators.RPAREN;
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lio/elevenlabs/domain/model/home/HomePageV3$Section$EmptyState;", "Lio/elevenlabs/domain/model/home/HomePageV3$Section;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lio/elevenlabs/domain/model/EmptyStateSection;", "<init>", "(Lio/elevenlabs/domain/model/EmptyStateSection;)V", "getData", "()Lio/elevenlabs/domain/model/EmptyStateSection;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class EmptyState implements Section {
            private final EmptyStateSection data;

            public EmptyState(EmptyStateSection emptyStateSection) {
                emptyStateSection.getClass();
                this.data = emptyStateSection;
            }

            public static /* synthetic */ EmptyState copy$default(EmptyState emptyState, EmptyStateSection emptyStateSection, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    emptyStateSection = emptyState.data;
                }
                return emptyState.copy(emptyStateSection);
            }

            /* renamed from: component1, reason: from getter */
            public final EmptyStateSection getData() {
                return this.data;
            }

            public final EmptyState copy(EmptyStateSection data) {
                data.getClass();
                return new EmptyState(data);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if ((other instanceof EmptyState) && m.c(this.data, ((EmptyState) other).data)) {
                    return true;
                }
                return false;
            }

            public final EmptyStateSection getData() {
                return this.data;
            }

            public int hashCode() {
                return this.data.hashCode();
            }

            public String toString() {
                return "EmptyState(data=" + this.data + Separators.RPAREN;
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lio/elevenlabs/domain/model/home/HomePageV3$Section$FeaturedCardList;", "Lio/elevenlabs/domain/model/home/HomePageV3$Section;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lio/elevenlabs/domain/model/AnnouncementBannerCarouselSection;", "<init>", "(Lio/elevenlabs/domain/model/AnnouncementBannerCarouselSection;)V", "getData", "()Lio/elevenlabs/domain/model/AnnouncementBannerCarouselSection;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class FeaturedCardList implements Section {
            private final AnnouncementBannerCarouselSection data;

            public FeaturedCardList(AnnouncementBannerCarouselSection announcementBannerCarouselSection) {
                announcementBannerCarouselSection.getClass();
                this.data = announcementBannerCarouselSection;
            }

            public static /* synthetic */ FeaturedCardList copy$default(FeaturedCardList featuredCardList, AnnouncementBannerCarouselSection announcementBannerCarouselSection, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    announcementBannerCarouselSection = featuredCardList.data;
                }
                return featuredCardList.copy(announcementBannerCarouselSection);
            }

            /* renamed from: component1, reason: from getter */
            public final AnnouncementBannerCarouselSection getData() {
                return this.data;
            }

            public final FeaturedCardList copy(AnnouncementBannerCarouselSection data) {
                data.getClass();
                return new FeaturedCardList(data);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if ((other instanceof FeaturedCardList) && m.c(this.data, ((FeaturedCardList) other).data)) {
                    return true;
                }
                return false;
            }

            public final AnnouncementBannerCarouselSection getData() {
                return this.data;
            }

            public int hashCode() {
                return this.data.hashCode();
            }

            public String toString() {
                return "FeaturedCardList(data=" + this.data + Separators.RPAREN;
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lio/elevenlabs/domain/model/home/HomePageV3$Section$GenreTilesGridRow;", "Lio/elevenlabs/domain/model/home/HomePageV3$Section;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lio/elevenlabs/domain/model/GenreTilesGridRow;", "<init>", "(Lio/elevenlabs/domain/model/GenreTilesGridRow;)V", "getData", "()Lio/elevenlabs/domain/model/GenreTilesGridRow;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class GenreTilesGridRow implements Section {
            private final io.elevenlabs.domain.model.GenreTilesGridRow data;

            public GenreTilesGridRow(io.elevenlabs.domain.model.GenreTilesGridRow genreTilesGridRow) {
                genreTilesGridRow.getClass();
                this.data = genreTilesGridRow;
            }

            public static /* synthetic */ GenreTilesGridRow copy$default(GenreTilesGridRow genreTilesGridRow, io.elevenlabs.domain.model.GenreTilesGridRow genreTilesGridRow2, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    genreTilesGridRow2 = genreTilesGridRow.data;
                }
                return genreTilesGridRow.copy(genreTilesGridRow2);
            }

            /* renamed from: component1, reason: from getter */
            public final io.elevenlabs.domain.model.GenreTilesGridRow getData() {
                return this.data;
            }

            public final GenreTilesGridRow copy(io.elevenlabs.domain.model.GenreTilesGridRow data) {
                data.getClass();
                return new GenreTilesGridRow(data);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if ((other instanceof GenreTilesGridRow) && m.c(this.data, ((GenreTilesGridRow) other).data)) {
                    return true;
                }
                return false;
            }

            public final io.elevenlabs.domain.model.GenreTilesGridRow getData() {
                return this.data;
            }

            public int hashCode() {
                return this.data.hashCode();
            }

            public String toString() {
                return "GenreTilesGridRow(data=" + this.data + Separators.RPAREN;
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lio/elevenlabs/domain/model/home/HomePageV3$Section$HighlightedCollectionsRow;", "Lio/elevenlabs/domain/model/home/HomePageV3$Section;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lio/elevenlabs/domain/model/HighlightedCollectionsRowSection;", "<init>", "(Lio/elevenlabs/domain/model/HighlightedCollectionsRowSection;)V", "getData", "()Lio/elevenlabs/domain/model/HighlightedCollectionsRowSection;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class HighlightedCollectionsRow implements Section {
            private final HighlightedCollectionsRowSection data;

            public HighlightedCollectionsRow(HighlightedCollectionsRowSection highlightedCollectionsRowSection) {
                highlightedCollectionsRowSection.getClass();
                this.data = highlightedCollectionsRowSection;
            }

            public static /* synthetic */ HighlightedCollectionsRow copy$default(HighlightedCollectionsRow highlightedCollectionsRow, HighlightedCollectionsRowSection highlightedCollectionsRowSection, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    highlightedCollectionsRowSection = highlightedCollectionsRow.data;
                }
                return highlightedCollectionsRow.copy(highlightedCollectionsRowSection);
            }

            /* renamed from: component1, reason: from getter */
            public final HighlightedCollectionsRowSection getData() {
                return this.data;
            }

            public final HighlightedCollectionsRow copy(HighlightedCollectionsRowSection data) {
                data.getClass();
                return new HighlightedCollectionsRow(data);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if ((other instanceof HighlightedCollectionsRow) && m.c(this.data, ((HighlightedCollectionsRow) other).data)) {
                    return true;
                }
                return false;
            }

            public final HighlightedCollectionsRowSection getData() {
                return this.data;
            }

            public int hashCode() {
                return this.data.hashCode();
            }

            public String toString() {
                return "HighlightedCollectionsRow(data=" + this.data + Separators.RPAREN;
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0017B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0083\u0004J\n\u0010\u0014\u001a\u00020\u0015HÖ\u0081\u0004J\n\u0010\u0016\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, d2 = {"Lio/elevenlabs/domain/model/home/HomePageV3$Section$HomeActionList;", "Lio/elevenlabs/domain/model/home/HomePageV3$Section;", "title", "", FirebaseAnalytics.Param.ITEMS, "", "Lio/elevenlabs/domain/model/home/HomePageV3$Section$HomeActionList$HomeActionItem;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getTitle", "()Ljava/lang/String;", "getItems", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "HomeActionItem", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class HomeActionList implements Section {
            private final List<HomeActionItem> items;
            private final String title;

            /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
            @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0016\u001a\u00020\u0017HÖ\u0081\u0004J\n\u0010\u0018\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lio/elevenlabs/domain/model/home/HomePageV3$Section$HomeActionList$HomeActionItem;", "", "title", "", "iconUrl", "deeplink", "analyticsId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getIconUrl", "getDeeplink", "getAnalyticsId", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            /* loaded from: classes3.dex */
            public static final /* data */ class HomeActionItem {
                private final String analyticsId;
                private final String deeplink;
                private final String iconUrl;
                private final String title;

                public HomeActionItem(String str, String str2, String str3, String str4) {
                    c.u(str, str2, str3, str4);
                    this.title = str;
                    this.iconUrl = str2;
                    this.deeplink = str3;
                    this.analyticsId = str4;
                }

                public static /* synthetic */ HomeActionItem copy$default(HomeActionItem homeActionItem, String str, String str2, String str3, String str4, int i10, Object obj) {
                    if ((i10 & 1) != 0) {
                        str = homeActionItem.title;
                    }
                    if ((i10 & 2) != 0) {
                        str2 = homeActionItem.iconUrl;
                    }
                    if ((i10 & 4) != 0) {
                        str3 = homeActionItem.deeplink;
                    }
                    if ((i10 & 8) != 0) {
                        str4 = homeActionItem.analyticsId;
                    }
                    return homeActionItem.copy(str, str2, str3, str4);
                }

                /* renamed from: component1, reason: from getter */
                public final String getTitle() {
                    return this.title;
                }

                /* renamed from: component2, reason: from getter */
                public final String getIconUrl() {
                    return this.iconUrl;
                }

                /* renamed from: component3, reason: from getter */
                public final String getDeeplink() {
                    return this.deeplink;
                }

                /* renamed from: component4, reason: from getter */
                public final String getAnalyticsId() {
                    return this.analyticsId;
                }

                public final HomeActionItem copy(String title, String iconUrl, String deeplink, String analyticsId) {
                    title.getClass();
                    iconUrl.getClass();
                    deeplink.getClass();
                    analyticsId.getClass();
                    return new HomeActionItem(title, iconUrl, deeplink, analyticsId);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof HomeActionItem)) {
                        return false;
                    }
                    HomeActionItem homeActionItem = (HomeActionItem) other;
                    if (m.c(this.title, homeActionItem.title) && m.c(this.iconUrl, homeActionItem.iconUrl) && m.c(this.deeplink, homeActionItem.deeplink) && m.c(this.analyticsId, homeActionItem.analyticsId)) {
                        return true;
                    }
                    return false;
                }

                public final String getAnalyticsId() {
                    return this.analyticsId;
                }

                public final String getDeeplink() {
                    return this.deeplink;
                }

                public final String getIconUrl() {
                    return this.iconUrl;
                }

                public final String getTitle() {
                    return this.title;
                }

                public int hashCode() {
                    return this.analyticsId.hashCode() + c.c(c.c(this.title.hashCode() * 31, 31, this.iconUrl), 31, this.deeplink);
                }

                public String toString() {
                    String str = this.title;
                    String str2 = this.iconUrl;
                    return f.n(f.s("HomeActionItem(title=", str, ", iconUrl=", str2, ", deeplink="), this.deeplink, ", analyticsId=", this.analyticsId, Separators.RPAREN);
                }
            }

            public HomeActionList(String str, List<HomeActionItem> list) {
                str.getClass();
                list.getClass();
                this.title = str;
                this.items = list;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ HomeActionList copy$default(HomeActionList homeActionList, String str, List list, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = homeActionList.title;
                }
                if ((i10 & 2) != 0) {
                    list = homeActionList.items;
                }
                return homeActionList.copy(str, list);
            }

            /* renamed from: component1, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            public final List<HomeActionItem> component2() {
                return this.items;
            }

            public final HomeActionList copy(String title, List<HomeActionItem> items) {
                title.getClass();
                items.getClass();
                return new HomeActionList(title, items);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof HomeActionList)) {
                    return false;
                }
                HomeActionList homeActionList = (HomeActionList) other;
                if (m.c(this.title, homeActionList.title) && m.c(this.items, homeActionList.items)) {
                    return true;
                }
                return false;
            }

            public final List<HomeActionItem> getItems() {
                return this.items;
            }

            public final String getTitle() {
                return this.title;
            }

            public int hashCode() {
                return this.items.hashCode() + (this.title.hashCode() * 31);
            }

            public String toString() {
                return i.j("HomeActionList(title=", this.title, ", items=", Separators.RPAREN, this.items);
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lio/elevenlabs/domain/model/home/HomePageV3$Section$MiniReadGrid;", "Lio/elevenlabs/domain/model/home/HomePageV3$Section;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lio/elevenlabs/domain/model/MiniReadGridSection;", "<init>", "(Lio/elevenlabs/domain/model/MiniReadGridSection;)V", "getData", "()Lio/elevenlabs/domain/model/MiniReadGridSection;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class MiniReadGrid implements Section {
            private final MiniReadGridSection data;

            public MiniReadGrid(MiniReadGridSection miniReadGridSection) {
                miniReadGridSection.getClass();
                this.data = miniReadGridSection;
            }

            public static /* synthetic */ MiniReadGrid copy$default(MiniReadGrid miniReadGrid, MiniReadGridSection miniReadGridSection, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    miniReadGridSection = miniReadGrid.data;
                }
                return miniReadGrid.copy(miniReadGridSection);
            }

            /* renamed from: component1, reason: from getter */
            public final MiniReadGridSection getData() {
                return this.data;
            }

            public final MiniReadGrid copy(MiniReadGridSection data) {
                data.getClass();
                return new MiniReadGrid(data);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if ((other instanceof MiniReadGrid) && m.c(this.data, ((MiniReadGrid) other).data)) {
                    return true;
                }
                return false;
            }

            public final MiniReadGridSection getData() {
                return this.data;
            }

            public int hashCode() {
                return this.data.hashCode();
            }

            public String toString() {
                return "MiniReadGrid(data=" + this.data + Separators.RPAREN;
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lio/elevenlabs/domain/model/home/HomePageV3$Section$ReadFromFollowing;", "Lio/elevenlabs/domain/model/home/HomePageV3$Section;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lio/elevenlabs/domain/model/ReadFromFollowingSection;", "<init>", "(Lio/elevenlabs/domain/model/ReadFromFollowingSection;)V", "getData", "()Lio/elevenlabs/domain/model/ReadFromFollowingSection;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class ReadFromFollowing implements Section {
            private final ReadFromFollowingSection data;

            public ReadFromFollowing(ReadFromFollowingSection readFromFollowingSection) {
                readFromFollowingSection.getClass();
                this.data = readFromFollowingSection;
            }

            public static /* synthetic */ ReadFromFollowing copy$default(ReadFromFollowing readFromFollowing, ReadFromFollowingSection readFromFollowingSection, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    readFromFollowingSection = readFromFollowing.data;
                }
                return readFromFollowing.copy(readFromFollowingSection);
            }

            /* renamed from: component1, reason: from getter */
            public final ReadFromFollowingSection getData() {
                return this.data;
            }

            public final ReadFromFollowing copy(ReadFromFollowingSection data) {
                data.getClass();
                return new ReadFromFollowing(data);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if ((other instanceof ReadFromFollowing) && m.c(this.data, ((ReadFromFollowing) other).data)) {
                    return true;
                }
                return false;
            }

            public final ReadFromFollowingSection getData() {
                return this.data;
            }

            public int hashCode() {
                return this.data.hashCode();
            }

            public String toString() {
                return "ReadFromFollowing(data=" + this.data + Separators.RPAREN;
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lio/elevenlabs/domain/model/home/HomePageV3$Section$RecentReadsSection;", "Lio/elevenlabs/domain/model/home/HomePageV3$Section;", "title", "", "<init>", "(Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class RecentReadsSection implements Section {
            private final String title;

            public RecentReadsSection(String str) {
                str.getClass();
                this.title = str;
            }

            public static /* synthetic */ RecentReadsSection copy$default(RecentReadsSection recentReadsSection, String str, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = recentReadsSection.title;
                }
                return recentReadsSection.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            public final RecentReadsSection copy(String title) {
                title.getClass();
                return new RecentReadsSection(title);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if ((other instanceof RecentReadsSection) && m.c(this.title, ((RecentReadsSection) other).title)) {
                    return true;
                }
                return false;
            }

            public final String getTitle() {
                return this.title;
            }

            public int hashCode() {
                return this.title.hashCode();
            }

            public String toString() {
                return f.C("RecentReadsSection(title=", this.title, Separators.RPAREN);
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lio/elevenlabs/domain/model/home/HomePageV3$Section$StatsCarousel;", "Lio/elevenlabs/domain/model/home/HomePageV3$Section;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lio/elevenlabs/domain/model/StatsCarouselSection;", "<init>", "(Lio/elevenlabs/domain/model/StatsCarouselSection;)V", "getData", "()Lio/elevenlabs/domain/model/StatsCarouselSection;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class StatsCarousel implements Section {
            private final StatsCarouselSection data;

            public StatsCarousel(StatsCarouselSection statsCarouselSection) {
                statsCarouselSection.getClass();
                this.data = statsCarouselSection;
            }

            public static /* synthetic */ StatsCarousel copy$default(StatsCarousel statsCarousel, StatsCarouselSection statsCarouselSection, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    statsCarouselSection = statsCarousel.data;
                }
                return statsCarousel.copy(statsCarouselSection);
            }

            /* renamed from: component1, reason: from getter */
            public final StatsCarouselSection getData() {
                return this.data;
            }

            public final StatsCarousel copy(StatsCarouselSection data) {
                data.getClass();
                return new StatsCarousel(data);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if ((other instanceof StatsCarousel) && m.c(this.data, ((StatsCarousel) other).data)) {
                    return true;
                }
                return false;
            }

            public final StatsCarouselSection getData() {
                return this.data;
            }

            public int hashCode() {
                return this.data.hashCode();
            }

            public String toString() {
                return "StatsCarousel(data=" + this.data + Separators.RPAREN;
            }
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0014\u0010\u0014\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0016\u001a\u00020\u0017HÖ\u0081\u0004J\n\u0010\u0018\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000e¨\u0006\u0019"}, d2 = {"Lio/elevenlabs/domain/model/home/HomePageV3$Subpage;", "", "id", "", "title", "iconUrl", "isLocalOnly", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getId", "()Ljava/lang/String;", "getTitle", "getIconUrl", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final /* data */ class Subpage {
        private final String iconUrl;
        private final String id;
        private final boolean isLocalOnly;
        private final String title;

        public Subpage(String str, String str2, String str3, boolean z6) {
            i.s(str, str2, str3);
            this.id = str;
            this.title = str2;
            this.iconUrl = str3;
            this.isLocalOnly = z6;
        }

        public static /* synthetic */ Subpage copy$default(Subpage subpage, String str, String str2, String str3, boolean z6, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = subpage.id;
            }
            if ((i10 & 2) != 0) {
                str2 = subpage.title;
            }
            if ((i10 & 4) != 0) {
                str3 = subpage.iconUrl;
            }
            if ((i10 & 8) != 0) {
                z6 = subpage.isLocalOnly;
            }
            return subpage.copy(str, str2, str3, z6);
        }

        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* renamed from: component2, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component3, reason: from getter */
        public final String getIconUrl() {
            return this.iconUrl;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getIsLocalOnly() {
            return this.isLocalOnly;
        }

        public final Subpage copy(String id2, String title, String iconUrl, boolean isLocalOnly) {
            id2.getClass();
            title.getClass();
            iconUrl.getClass();
            return new Subpage(id2, title, iconUrl, isLocalOnly);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Subpage)) {
                return false;
            }
            Subpage subpage = (Subpage) other;
            if (m.c(this.id, subpage.id) && m.c(this.title, subpage.title) && m.c(this.iconUrl, subpage.iconUrl) && this.isLocalOnly == subpage.isLocalOnly) {
                return true;
            }
            return false;
        }

        public final String getIconUrl() {
            return this.iconUrl;
        }

        public final String getId() {
            return this.id;
        }

        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isLocalOnly) + c.c(c.c(this.id.hashCode() * 31, 31, this.title), 31, this.iconUrl);
        }

        public final boolean isLocalOnly() {
            return this.isLocalOnly;
        }

        public String toString() {
            String str = this.id;
            String str2 = this.title;
            String str3 = this.iconUrl;
            boolean z6 = this.isLocalOnly;
            StringBuilder s10 = f.s("Subpage(id=", str, ", title=", str2, ", iconUrl=");
            s10.append(str3);
            s10.append(", isLocalOnly=");
            s10.append(z6);
            s10.append(Separators.RPAREN);
            return s10.toString();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HomePageV3(List<? extends Section> list, List<Subpage> list2) {
        list.getClass();
        list2.getClass();
        this.sections = list;
        this.subpages = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HomePageV3 copy$default(HomePageV3 homePageV3, List list, List list2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = homePageV3.sections;
        }
        if ((i10 & 2) != 0) {
            list2 = homePageV3.subpages;
        }
        return homePageV3.copy(list, list2);
    }

    public final List<Section> component1() {
        return this.sections;
    }

    public final List<Subpage> component2() {
        return this.subpages;
    }

    public final HomePageV3 copy(List<? extends Section> sections, List<Subpage> subpages) {
        sections.getClass();
        subpages.getClass();
        return new HomePageV3(sections, subpages);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HomePageV3)) {
            return false;
        }
        HomePageV3 homePageV3 = (HomePageV3) other;
        if (m.c(this.sections, homePageV3.sections) && m.c(this.subpages, homePageV3.subpages)) {
            return true;
        }
        return false;
    }

    public final List<Section> getSections() {
        return this.sections;
    }

    public final List<Subpage> getSubpages() {
        return this.subpages;
    }

    public int hashCode() {
        return this.subpages.hashCode() + (this.sections.hashCode() * 31);
    }

    public String toString() {
        return "HomePageV3(sections=" + this.sections + ", subpages=" + this.subpages + Separators.RPAREN;
    }
}
