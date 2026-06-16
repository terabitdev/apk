package io.elevenlabs.domain.model;

import android.gov.nist.core.Separators;
import com.google.android.gms.internal.play_billing.b;
import com.google.firebase.analytics.FirebaseAnalytics;
import defpackage.f;
import j0.c;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;
import p.n;
import z.h;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\"BU\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u0012\u001c\b\u0002\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0003\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\b0\u0003HÆ\u0003J\u001d\u0010\u0019\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0003\u0018\u00010\nHÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0006HÆ\u0003J]\u0010\u001b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\u001c\b\u0002\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0003\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0014\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001f\u001a\u00020 HÖ\u0081\u0004J\n\u0010!\u001a\u00020\u0006HÖ\u0081\u0004R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR%\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0003\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011¨\u0006#"}, d2 = {"Lio/elevenlabs/domain/model/ReadsExplorePage;", "", "sections", "", "Lio/elevenlabs/domain/model/ReadsExplorePage$Section;", "language", "", "pageFilters", "Lio/elevenlabs/domain/model/PageFilter;", "filterOptions", "", "nextCursor", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;Ljava/lang/String;)V", "getSections", "()Ljava/util/List;", "getLanguage", "()Ljava/lang/String;", "getPageFilters", "getFilterOptions", "()Ljava/util/Map;", "getNextCursor", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "Section", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final /* data */ class ReadsExplorePage {
    private final Map<String, List<String>> filterOptions;
    private final String language;
    private final String nextCursor;
    private final List<PageFilter> pageFilters;
    private final List<Section> sections;

    /* JADX WARN: Multi-variable type inference failed */
    public ReadsExplorePage(List<? extends Section> list, String str, List<? extends PageFilter> list2, Map<String, ? extends List<String>> map, String str2) {
        list.getClass();
        str.getClass();
        list2.getClass();
        this.sections = list;
        this.language = str;
        this.pageFilters = list2;
        this.filterOptions = map;
        this.nextCursor = str2;
    }

    public static /* synthetic */ ReadsExplorePage copy$default(ReadsExplorePage readsExplorePage, List list, String str, List list2, Map map, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = readsExplorePage.sections;
        }
        if ((i10 & 2) != 0) {
            str = readsExplorePage.language;
        }
        if ((i10 & 4) != 0) {
            list2 = readsExplorePage.pageFilters;
        }
        if ((i10 & 8) != 0) {
            map = readsExplorePage.filterOptions;
        }
        if ((i10 & 16) != 0) {
            str2 = readsExplorePage.nextCursor;
        }
        String str3 = str2;
        List list3 = list2;
        return readsExplorePage.copy(list, str, list3, map, str3);
    }

    public final List<Section> component1() {
        return this.sections;
    }

    /* renamed from: component2, reason: from getter */
    public final String getLanguage() {
        return this.language;
    }

    public final List<PageFilter> component3() {
        return this.pageFilters;
    }

    public final Map<String, List<String>> component4() {
        return this.filterOptions;
    }

    /* renamed from: component5, reason: from getter */
    public final String getNextCursor() {
        return this.nextCursor;
    }

    public final ReadsExplorePage copy(List<? extends Section> sections, String language, List<? extends PageFilter> pageFilters, Map<String, ? extends List<String>> filterOptions, String nextCursor) {
        sections.getClass();
        language.getClass();
        pageFilters.getClass();
        return new ReadsExplorePage(sections, language, pageFilters, filterOptions, nextCursor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReadsExplorePage)) {
            return false;
        }
        ReadsExplorePage readsExplorePage = (ReadsExplorePage) other;
        if (m.c(this.sections, readsExplorePage.sections) && m.c(this.language, readsExplorePage.language) && m.c(this.pageFilters, readsExplorePage.pageFilters) && m.c(this.filterOptions, readsExplorePage.filterOptions) && m.c(this.nextCursor, readsExplorePage.nextCursor)) {
            return true;
        }
        return false;
    }

    public final Map<String, List<String>> getFilterOptions() {
        return this.filterOptions;
    }

    public final String getLanguage() {
        return this.language;
    }

    public final String getNextCursor() {
        return this.nextCursor;
    }

    public final List<PageFilter> getPageFilters() {
        return this.pageFilters;
    }

    public final List<Section> getSections() {
        return this.sections;
    }

    public int hashCode() {
        int hashCode;
        int d10 = n.d(c.c(this.sections.hashCode() * 31, 31, this.language), 31, this.pageFilters);
        Map<String, List<String>> map = this.filterOptions;
        int i10 = 0;
        if (map == null) {
            hashCode = 0;
        } else {
            hashCode = map.hashCode();
        }
        int i11 = (d10 + hashCode) * 31;
        String str = this.nextCursor;
        if (str != null) {
            i10 = str.hashCode();
        }
        return i11 + i10;
    }

    public String toString() {
        List<Section> list = this.sections;
        String str = this.language;
        List<PageFilter> list2 = this.pageFilters;
        Map<String, List<String>> map = this.filterOptions;
        String str2 = this.nextCursor;
        StringBuilder sb = new StringBuilder("ReadsExplorePage(sections=");
        sb.append(list);
        sb.append(", language=");
        sb.append(str);
        sb.append(", pageFilters=");
        sb.append(list2);
        sb.append(", filterOptions=");
        sb.append(map);
        sb.append(", nextCursor=");
        return f.l(str2, Separators.RPAREN, sb);
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0007\u0004\u0005\u0006\u0007\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0007\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lio/elevenlabs/domain/model/ReadsExplorePage$Section;", "", "<init>", "()V", "GetReadsExploreHighlightedCarousel", "GetReadsExploreSmallGrid", "GetReadsExploreLargeGrid", "GetReadsExploreCardCollection", "GetReadsExploreHeroCarousel", "GetReadsExploreVoiceCollection", "GetReadsExploreTitleSubtitle", "Lio/elevenlabs/domain/model/ReadsExplorePage$Section$GetReadsExploreCardCollection;", "Lio/elevenlabs/domain/model/ReadsExplorePage$Section$GetReadsExploreHeroCarousel;", "Lio/elevenlabs/domain/model/ReadsExplorePage$Section$GetReadsExploreHighlightedCarousel;", "Lio/elevenlabs/domain/model/ReadsExplorePage$Section$GetReadsExploreLargeGrid;", "Lio/elevenlabs/domain/model/ReadsExplorePage$Section$GetReadsExploreSmallGrid;", "Lio/elevenlabs/domain/model/ReadsExplorePage$Section$GetReadsExploreTitleSubtitle;", "Lio/elevenlabs/domain/model/ReadsExplorePage$Section$GetReadsExploreVoiceCollection;", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static abstract class Section {

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J=\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0014\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0083\u0004J\n\u0010\u001a\u001a\u00020\u001bHÖ\u0081\u0004J\n\u0010\u001c\u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001d"}, d2 = {"Lio/elevenlabs/domain/model/ReadsExplorePage$Section$GetReadsExploreCardCollection;", "Lio/elevenlabs/domain/model/ReadsExplorePage$Section;", "title", "", "subtitle", "deeplink", "reads", "", "Lio/elevenlabs/domain/model/ExploreRead;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getDeeplink", "getReads", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class GetReadsExploreCardCollection extends Section {
            private final String deeplink;
            private final List<ExploreRead> reads;
            private final String subtitle;
            private final String title;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public GetReadsExploreCardCollection(String str, String str2, String str3, List<ExploreRead> list) {
                super(null);
                list.getClass();
                this.title = str;
                this.subtitle = str2;
                this.deeplink = str3;
                this.reads = list;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ GetReadsExploreCardCollection copy$default(GetReadsExploreCardCollection getReadsExploreCardCollection, String str, String str2, String str3, List list, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = getReadsExploreCardCollection.title;
                }
                if ((i10 & 2) != 0) {
                    str2 = getReadsExploreCardCollection.subtitle;
                }
                if ((i10 & 4) != 0) {
                    str3 = getReadsExploreCardCollection.deeplink;
                }
                if ((i10 & 8) != 0) {
                    list = getReadsExploreCardCollection.reads;
                }
                return getReadsExploreCardCollection.copy(str, str2, str3, list);
            }

            /* renamed from: component1, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            /* renamed from: component2, reason: from getter */
            public final String getSubtitle() {
                return this.subtitle;
            }

            /* renamed from: component3, reason: from getter */
            public final String getDeeplink() {
                return this.deeplink;
            }

            public final List<ExploreRead> component4() {
                return this.reads;
            }

            public final GetReadsExploreCardCollection copy(String title, String subtitle, String deeplink, List<ExploreRead> reads) {
                reads.getClass();
                return new GetReadsExploreCardCollection(title, subtitle, deeplink, reads);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof GetReadsExploreCardCollection)) {
                    return false;
                }
                GetReadsExploreCardCollection getReadsExploreCardCollection = (GetReadsExploreCardCollection) other;
                if (m.c(this.title, getReadsExploreCardCollection.title) && m.c(this.subtitle, getReadsExploreCardCollection.subtitle) && m.c(this.deeplink, getReadsExploreCardCollection.deeplink) && m.c(this.reads, getReadsExploreCardCollection.reads)) {
                    return true;
                }
                return false;
            }

            public final String getDeeplink() {
                return this.deeplink;
            }

            public final List<ExploreRead> getReads() {
                return this.reads;
            }

            public final String getSubtitle() {
                return this.subtitle;
            }

            public final String getTitle() {
                return this.title;
            }

            public int hashCode() {
                int hashCode;
                int hashCode2;
                String str = this.title;
                int i10 = 0;
                if (str == null) {
                    hashCode = 0;
                } else {
                    hashCode = str.hashCode();
                }
                int i11 = hashCode * 31;
                String str2 = this.subtitle;
                if (str2 == null) {
                    hashCode2 = 0;
                } else {
                    hashCode2 = str2.hashCode();
                }
                int i12 = (i11 + hashCode2) * 31;
                String str3 = this.deeplink;
                if (str3 != null) {
                    i10 = str3.hashCode();
                }
                return this.reads.hashCode() + ((i12 + i10) * 31);
            }

            public String toString() {
                String str = this.title;
                String str2 = this.subtitle;
                String str3 = this.deeplink;
                List<ExploreRead> list = this.reads;
                StringBuilder s10 = f.s("GetReadsExploreCardCollection(title=", str, ", subtitle=", str2, ", deeplink=");
                s10.append(str3);
                s10.append(", reads=");
                s10.append(list);
                s10.append(Separators.RPAREN);
                return s10.toString();
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u001aB'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J/\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001J\u0014\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0083\u0004J\n\u0010\u0017\u001a\u00020\u0018HÖ\u0081\u0004J\n\u0010\u0019\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001b"}, d2 = {"Lio/elevenlabs/domain/model/ReadsExplorePage$Section$GetReadsExploreHeroCarousel;", "Lio/elevenlabs/domain/model/ReadsExplorePage$Section;", "title", "", "subtitle", FirebaseAnalytics.Param.ITEMS, "", "Lio/elevenlabs/domain/model/ReadsExplorePage$Section$GetReadsExploreHeroCarousel$Item;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getItems", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "Item", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class GetReadsExploreHeroCarousel extends Section {
            private final List<Item> items;
            private final String subtitle;
            private final String title;

            /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
            @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003JK\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u001b\u001a\u00020\u00062\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001d\u001a\u00020\u001eHÖ\u0081\u0004J\n\u0010\u001f\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r¨\u0006 "}, d2 = {"Lio/elevenlabs/domain/model/ReadsExplorePage$Section$GetReadsExploreHeroCarousel$Item;", "", "title", "", "subtitle", "swapTitleSubtitle", "", "backgroundImageUrl", "backgroundVideoUrl", "deeplink", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getSwapTitleSubtitle", "()Z", "getBackgroundImageUrl", "getBackgroundVideoUrl", "getDeeplink", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            /* loaded from: classes3.dex */
            public static final /* data */ class Item {
                private final String backgroundImageUrl;
                private final String backgroundVideoUrl;
                private final String deeplink;
                private final String subtitle;
                private final boolean swapTitleSubtitle;
                private final String title;

                public Item(String str, String str2, boolean z6, String str3, String str4, String str5) {
                    str.getClass();
                    str5.getClass();
                    this.title = str;
                    this.subtitle = str2;
                    this.swapTitleSubtitle = z6;
                    this.backgroundImageUrl = str3;
                    this.backgroundVideoUrl = str4;
                    this.deeplink = str5;
                }

                public static /* synthetic */ Item copy$default(Item item, String str, String str2, boolean z6, String str3, String str4, String str5, int i10, Object obj) {
                    if ((i10 & 1) != 0) {
                        str = item.title;
                    }
                    if ((i10 & 2) != 0) {
                        str2 = item.subtitle;
                    }
                    if ((i10 & 4) != 0) {
                        z6 = item.swapTitleSubtitle;
                    }
                    if ((i10 & 8) != 0) {
                        str3 = item.backgroundImageUrl;
                    }
                    if ((i10 & 16) != 0) {
                        str4 = item.backgroundVideoUrl;
                    }
                    if ((i10 & 32) != 0) {
                        str5 = item.deeplink;
                    }
                    String str6 = str4;
                    String str7 = str5;
                    return item.copy(str, str2, z6, str3, str6, str7);
                }

                /* renamed from: component1, reason: from getter */
                public final String getTitle() {
                    return this.title;
                }

                /* renamed from: component2, reason: from getter */
                public final String getSubtitle() {
                    return this.subtitle;
                }

                /* renamed from: component3, reason: from getter */
                public final boolean getSwapTitleSubtitle() {
                    return this.swapTitleSubtitle;
                }

                /* renamed from: component4, reason: from getter */
                public final String getBackgroundImageUrl() {
                    return this.backgroundImageUrl;
                }

                /* renamed from: component5, reason: from getter */
                public final String getBackgroundVideoUrl() {
                    return this.backgroundVideoUrl;
                }

                /* renamed from: component6, reason: from getter */
                public final String getDeeplink() {
                    return this.deeplink;
                }

                public final Item copy(String title, String subtitle, boolean swapTitleSubtitle, String backgroundImageUrl, String backgroundVideoUrl, String deeplink) {
                    title.getClass();
                    deeplink.getClass();
                    return new Item(title, subtitle, swapTitleSubtitle, backgroundImageUrl, backgroundVideoUrl, deeplink);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Item)) {
                        return false;
                    }
                    Item item = (Item) other;
                    if (m.c(this.title, item.title) && m.c(this.subtitle, item.subtitle) && this.swapTitleSubtitle == item.swapTitleSubtitle && m.c(this.backgroundImageUrl, item.backgroundImageUrl) && m.c(this.backgroundVideoUrl, item.backgroundVideoUrl) && m.c(this.deeplink, item.deeplink)) {
                        return true;
                    }
                    return false;
                }

                public final String getBackgroundImageUrl() {
                    return this.backgroundImageUrl;
                }

                public final String getBackgroundVideoUrl() {
                    return this.backgroundVideoUrl;
                }

                public final String getDeeplink() {
                    return this.deeplink;
                }

                public final String getSubtitle() {
                    return this.subtitle;
                }

                public final boolean getSwapTitleSubtitle() {
                    return this.swapTitleSubtitle;
                }

                public final String getTitle() {
                    return this.title;
                }

                public int hashCode() {
                    int hashCode;
                    int hashCode2;
                    int hashCode3 = this.title.hashCode() * 31;
                    String str = this.subtitle;
                    int i10 = 0;
                    if (str == null) {
                        hashCode = 0;
                    } else {
                        hashCode = str.hashCode();
                    }
                    int f10 = b.f((hashCode3 + hashCode) * 31, 31, this.swapTitleSubtitle);
                    String str2 = this.backgroundImageUrl;
                    if (str2 == null) {
                        hashCode2 = 0;
                    } else {
                        hashCode2 = str2.hashCode();
                    }
                    int i11 = (f10 + hashCode2) * 31;
                    String str3 = this.backgroundVideoUrl;
                    if (str3 != null) {
                        i10 = str3.hashCode();
                    }
                    return this.deeplink.hashCode() + ((i11 + i10) * 31);
                }

                public String toString() {
                    String str = this.title;
                    String str2 = this.subtitle;
                    boolean z6 = this.swapTitleSubtitle;
                    String str3 = this.backgroundImageUrl;
                    String str4 = this.backgroundVideoUrl;
                    String str5 = this.deeplink;
                    StringBuilder s10 = f.s("Item(title=", str, ", subtitle=", str2, ", swapTitleSubtitle=");
                    f.z(s10, z6, ", backgroundImageUrl=", str3, ", backgroundVideoUrl=");
                    return f.n(s10, str4, ", deeplink=", str5, Separators.RPAREN);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public GetReadsExploreHeroCarousel(String str, String str2, List<Item> list) {
                super(null);
                str.getClass();
                list.getClass();
                this.title = str;
                this.subtitle = str2;
                this.items = list;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ GetReadsExploreHeroCarousel copy$default(GetReadsExploreHeroCarousel getReadsExploreHeroCarousel, String str, String str2, List list, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = getReadsExploreHeroCarousel.title;
                }
                if ((i10 & 2) != 0) {
                    str2 = getReadsExploreHeroCarousel.subtitle;
                }
                if ((i10 & 4) != 0) {
                    list = getReadsExploreHeroCarousel.items;
                }
                return getReadsExploreHeroCarousel.copy(str, str2, list);
            }

            /* renamed from: component1, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            /* renamed from: component2, reason: from getter */
            public final String getSubtitle() {
                return this.subtitle;
            }

            public final List<Item> component3() {
                return this.items;
            }

            public final GetReadsExploreHeroCarousel copy(String title, String subtitle, List<Item> items) {
                title.getClass();
                items.getClass();
                return new GetReadsExploreHeroCarousel(title, subtitle, items);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof GetReadsExploreHeroCarousel)) {
                    return false;
                }
                GetReadsExploreHeroCarousel getReadsExploreHeroCarousel = (GetReadsExploreHeroCarousel) other;
                if (m.c(this.title, getReadsExploreHeroCarousel.title) && m.c(this.subtitle, getReadsExploreHeroCarousel.subtitle) && m.c(this.items, getReadsExploreHeroCarousel.items)) {
                    return true;
                }
                return false;
            }

            public final List<Item> getItems() {
                return this.items;
            }

            public final String getSubtitle() {
                return this.subtitle;
            }

            public final String getTitle() {
                return this.title;
            }

            public int hashCode() {
                int hashCode;
                int hashCode2 = this.title.hashCode() * 31;
                String str = this.subtitle;
                if (str == null) {
                    hashCode = 0;
                } else {
                    hashCode = str.hashCode();
                }
                return this.items.hashCode() + ((hashCode2 + hashCode) * 31);
            }

            public String toString() {
                String str = this.title;
                String str2 = this.subtitle;
                return h.e(f.s("GetReadsExploreHeroCarousel(title=", str, ", subtitle=", str2, ", items="), this.items, Separators.RPAREN);
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J=\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0014\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0083\u0004J\n\u0010\u001a\u001a\u00020\u001bHÖ\u0081\u0004J\n\u0010\u001c\u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001d"}, d2 = {"Lio/elevenlabs/domain/model/ReadsExplorePage$Section$GetReadsExploreHighlightedCarousel;", "Lio/elevenlabs/domain/model/ReadsExplorePage$Section;", "title", "", "subtitle", "deeplink", "reads", "", "Lio/elevenlabs/domain/model/ExploreRead;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getDeeplink", "getReads", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class GetReadsExploreHighlightedCarousel extends Section {
            private final String deeplink;
            private final List<ExploreRead> reads;
            private final String subtitle;
            private final String title;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public GetReadsExploreHighlightedCarousel(String str, String str2, String str3, List<ExploreRead> list) {
                super(null);
                list.getClass();
                this.title = str;
                this.subtitle = str2;
                this.deeplink = str3;
                this.reads = list;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ GetReadsExploreHighlightedCarousel copy$default(GetReadsExploreHighlightedCarousel getReadsExploreHighlightedCarousel, String str, String str2, String str3, List list, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = getReadsExploreHighlightedCarousel.title;
                }
                if ((i10 & 2) != 0) {
                    str2 = getReadsExploreHighlightedCarousel.subtitle;
                }
                if ((i10 & 4) != 0) {
                    str3 = getReadsExploreHighlightedCarousel.deeplink;
                }
                if ((i10 & 8) != 0) {
                    list = getReadsExploreHighlightedCarousel.reads;
                }
                return getReadsExploreHighlightedCarousel.copy(str, str2, str3, list);
            }

            /* renamed from: component1, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            /* renamed from: component2, reason: from getter */
            public final String getSubtitle() {
                return this.subtitle;
            }

            /* renamed from: component3, reason: from getter */
            public final String getDeeplink() {
                return this.deeplink;
            }

            public final List<ExploreRead> component4() {
                return this.reads;
            }

            public final GetReadsExploreHighlightedCarousel copy(String title, String subtitle, String deeplink, List<ExploreRead> reads) {
                reads.getClass();
                return new GetReadsExploreHighlightedCarousel(title, subtitle, deeplink, reads);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof GetReadsExploreHighlightedCarousel)) {
                    return false;
                }
                GetReadsExploreHighlightedCarousel getReadsExploreHighlightedCarousel = (GetReadsExploreHighlightedCarousel) other;
                if (m.c(this.title, getReadsExploreHighlightedCarousel.title) && m.c(this.subtitle, getReadsExploreHighlightedCarousel.subtitle) && m.c(this.deeplink, getReadsExploreHighlightedCarousel.deeplink) && m.c(this.reads, getReadsExploreHighlightedCarousel.reads)) {
                    return true;
                }
                return false;
            }

            public final String getDeeplink() {
                return this.deeplink;
            }

            public final List<ExploreRead> getReads() {
                return this.reads;
            }

            public final String getSubtitle() {
                return this.subtitle;
            }

            public final String getTitle() {
                return this.title;
            }

            public int hashCode() {
                int hashCode;
                int hashCode2;
                String str = this.title;
                int i10 = 0;
                if (str == null) {
                    hashCode = 0;
                } else {
                    hashCode = str.hashCode();
                }
                int i11 = hashCode * 31;
                String str2 = this.subtitle;
                if (str2 == null) {
                    hashCode2 = 0;
                } else {
                    hashCode2 = str2.hashCode();
                }
                int i12 = (i11 + hashCode2) * 31;
                String str3 = this.deeplink;
                if (str3 != null) {
                    i10 = str3.hashCode();
                }
                return this.reads.hashCode() + ((i12 + i10) * 31);
            }

            public String toString() {
                String str = this.title;
                String str2 = this.subtitle;
                String str3 = this.deeplink;
                List<ExploreRead> list = this.reads;
                StringBuilder s10 = f.s("GetReadsExploreHighlightedCarousel(title=", str, ", subtitle=", str2, ", deeplink=");
                s10.append(str3);
                s10.append(", reads=");
                s10.append(list);
                s10.append(Separators.RPAREN);
                return s10.toString();
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0083\u0004J\n\u0010\u0011\u001a\u00020\u0012HÖ\u0081\u0004J\n\u0010\u0013\u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lio/elevenlabs/domain/model/ReadsExplorePage$Section$GetReadsExploreTitleSubtitle;", "Lio/elevenlabs/domain/model/ReadsExplorePage$Section;", "title", "", "subtitle", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class GetReadsExploreTitleSubtitle extends Section {
            private final String subtitle;
            private final String title;

            public GetReadsExploreTitleSubtitle(String str, String str2) {
                super(null);
                this.title = str;
                this.subtitle = str2;
            }

            public static /* synthetic */ GetReadsExploreTitleSubtitle copy$default(GetReadsExploreTitleSubtitle getReadsExploreTitleSubtitle, String str, String str2, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = getReadsExploreTitleSubtitle.title;
                }
                if ((i10 & 2) != 0) {
                    str2 = getReadsExploreTitleSubtitle.subtitle;
                }
                return getReadsExploreTitleSubtitle.copy(str, str2);
            }

            /* renamed from: component1, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            /* renamed from: component2, reason: from getter */
            public final String getSubtitle() {
                return this.subtitle;
            }

            public final GetReadsExploreTitleSubtitle copy(String title, String subtitle) {
                return new GetReadsExploreTitleSubtitle(title, subtitle);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof GetReadsExploreTitleSubtitle)) {
                    return false;
                }
                GetReadsExploreTitleSubtitle getReadsExploreTitleSubtitle = (GetReadsExploreTitleSubtitle) other;
                if (m.c(this.title, getReadsExploreTitleSubtitle.title) && m.c(this.subtitle, getReadsExploreTitleSubtitle.subtitle)) {
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
                int hashCode;
                String str = this.title;
                int i10 = 0;
                if (str == null) {
                    hashCode = 0;
                } else {
                    hashCode = str.hashCode();
                }
                int i11 = hashCode * 31;
                String str2 = this.subtitle;
                if (str2 != null) {
                    i10 = str2.hashCode();
                }
                return i11 + i10;
            }

            public String toString() {
                return h.c("GetReadsExploreTitleSubtitle(title=", this.title, ", subtitle=", this.subtitle, Separators.RPAREN);
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u001aB'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J/\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001J\u0014\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0083\u0004J\n\u0010\u0017\u001a\u00020\u0018HÖ\u0081\u0004J\n\u0010\u0019\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001b"}, d2 = {"Lio/elevenlabs/domain/model/ReadsExplorePage$Section$GetReadsExploreVoiceCollection;", "Lio/elevenlabs/domain/model/ReadsExplorePage$Section;", "title", "", "subtitle", FirebaseAnalytics.Param.ITEMS, "", "Lio/elevenlabs/domain/model/ReadsExplorePage$Section$GetReadsExploreVoiceCollection$VoiceItem;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getItems", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "VoiceItem", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class GetReadsExploreVoiceCollection extends Section {
            private final List<VoiceItem> items;
            private final String subtitle;
            private final String title;

            /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
            @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003JQ\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001f\u001a\u00020 HÖ\u0081\u0004J\n\u0010!\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000e¨\u0006\""}, d2 = {"Lio/elevenlabs/domain/model/ReadsExplorePage$Section$GetReadsExploreVoiceCollection$VoiceItem;", "", "voiceId", "", "voiceName", "voiceSubtitle", "avatarUrl", "reads", "", "Lio/elevenlabs/domain/model/ExploreRead;", "deeplink", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "getVoiceId", "()Ljava/lang/String;", "getVoiceName", "getVoiceSubtitle", "getAvatarUrl", "getReads", "()Ljava/util/List;", "getDeeplink", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            /* loaded from: classes3.dex */
            public static final /* data */ class VoiceItem {
                private final String avatarUrl;
                private final String deeplink;
                private final List<ExploreRead> reads;
                private final String voiceId;
                private final String voiceName;
                private final String voiceSubtitle;

                public VoiceItem(String str, String str2, String str3, String str4, List<ExploreRead> list, String str5) {
                    c.w(str, str2, list);
                    this.voiceId = str;
                    this.voiceName = str2;
                    this.voiceSubtitle = str3;
                    this.avatarUrl = str4;
                    this.reads = list;
                    this.deeplink = str5;
                }

                public static /* synthetic */ VoiceItem copy$default(VoiceItem voiceItem, String str, String str2, String str3, String str4, List list, String str5, int i10, Object obj) {
                    if ((i10 & 1) != 0) {
                        str = voiceItem.voiceId;
                    }
                    if ((i10 & 2) != 0) {
                        str2 = voiceItem.voiceName;
                    }
                    if ((i10 & 4) != 0) {
                        str3 = voiceItem.voiceSubtitle;
                    }
                    if ((i10 & 8) != 0) {
                        str4 = voiceItem.avatarUrl;
                    }
                    if ((i10 & 16) != 0) {
                        list = voiceItem.reads;
                    }
                    if ((i10 & 32) != 0) {
                        str5 = voiceItem.deeplink;
                    }
                    List list2 = list;
                    String str6 = str5;
                    return voiceItem.copy(str, str2, str3, str4, list2, str6);
                }

                /* renamed from: component1, reason: from getter */
                public final String getVoiceId() {
                    return this.voiceId;
                }

                /* renamed from: component2, reason: from getter */
                public final String getVoiceName() {
                    return this.voiceName;
                }

                /* renamed from: component3, reason: from getter */
                public final String getVoiceSubtitle() {
                    return this.voiceSubtitle;
                }

                /* renamed from: component4, reason: from getter */
                public final String getAvatarUrl() {
                    return this.avatarUrl;
                }

                public final List<ExploreRead> component5() {
                    return this.reads;
                }

                /* renamed from: component6, reason: from getter */
                public final String getDeeplink() {
                    return this.deeplink;
                }

                public final VoiceItem copy(String voiceId, String voiceName, String voiceSubtitle, String avatarUrl, List<ExploreRead> reads, String deeplink) {
                    voiceId.getClass();
                    voiceName.getClass();
                    reads.getClass();
                    return new VoiceItem(voiceId, voiceName, voiceSubtitle, avatarUrl, reads, deeplink);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof VoiceItem)) {
                        return false;
                    }
                    VoiceItem voiceItem = (VoiceItem) other;
                    if (m.c(this.voiceId, voiceItem.voiceId) && m.c(this.voiceName, voiceItem.voiceName) && m.c(this.voiceSubtitle, voiceItem.voiceSubtitle) && m.c(this.avatarUrl, voiceItem.avatarUrl) && m.c(this.reads, voiceItem.reads) && m.c(this.deeplink, voiceItem.deeplink)) {
                        return true;
                    }
                    return false;
                }

                public final String getAvatarUrl() {
                    return this.avatarUrl;
                }

                public final String getDeeplink() {
                    return this.deeplink;
                }

                public final List<ExploreRead> getReads() {
                    return this.reads;
                }

                public final String getVoiceId() {
                    return this.voiceId;
                }

                public final String getVoiceName() {
                    return this.voiceName;
                }

                public final String getVoiceSubtitle() {
                    return this.voiceSubtitle;
                }

                public int hashCode() {
                    int hashCode;
                    int hashCode2;
                    int c5 = c.c(this.voiceId.hashCode() * 31, 31, this.voiceName);
                    String str = this.voiceSubtitle;
                    int i10 = 0;
                    if (str == null) {
                        hashCode = 0;
                    } else {
                        hashCode = str.hashCode();
                    }
                    int i11 = (c5 + hashCode) * 31;
                    String str2 = this.avatarUrl;
                    if (str2 == null) {
                        hashCode2 = 0;
                    } else {
                        hashCode2 = str2.hashCode();
                    }
                    int d10 = n.d((i11 + hashCode2) * 31, 31, this.reads);
                    String str3 = this.deeplink;
                    if (str3 != null) {
                        i10 = str3.hashCode();
                    }
                    return d10 + i10;
                }

                public String toString() {
                    String str = this.voiceId;
                    String str2 = this.voiceName;
                    String str3 = this.voiceSubtitle;
                    String str4 = this.avatarUrl;
                    List<ExploreRead> list = this.reads;
                    String str5 = this.deeplink;
                    StringBuilder s10 = f.s("VoiceItem(voiceId=", str, ", voiceName=", str2, ", voiceSubtitle=");
                    f.x(s10, str3, ", avatarUrl=", str4, ", reads=");
                    s10.append(list);
                    s10.append(", deeplink=");
                    s10.append(str5);
                    s10.append(Separators.RPAREN);
                    return s10.toString();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public GetReadsExploreVoiceCollection(String str, String str2, List<VoiceItem> list) {
                super(null);
                str.getClass();
                list.getClass();
                this.title = str;
                this.subtitle = str2;
                this.items = list;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ GetReadsExploreVoiceCollection copy$default(GetReadsExploreVoiceCollection getReadsExploreVoiceCollection, String str, String str2, List list, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = getReadsExploreVoiceCollection.title;
                }
                if ((i10 & 2) != 0) {
                    str2 = getReadsExploreVoiceCollection.subtitle;
                }
                if ((i10 & 4) != 0) {
                    list = getReadsExploreVoiceCollection.items;
                }
                return getReadsExploreVoiceCollection.copy(str, str2, list);
            }

            /* renamed from: component1, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            /* renamed from: component2, reason: from getter */
            public final String getSubtitle() {
                return this.subtitle;
            }

            public final List<VoiceItem> component3() {
                return this.items;
            }

            public final GetReadsExploreVoiceCollection copy(String title, String subtitle, List<VoiceItem> items) {
                title.getClass();
                items.getClass();
                return new GetReadsExploreVoiceCollection(title, subtitle, items);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof GetReadsExploreVoiceCollection)) {
                    return false;
                }
                GetReadsExploreVoiceCollection getReadsExploreVoiceCollection = (GetReadsExploreVoiceCollection) other;
                if (m.c(this.title, getReadsExploreVoiceCollection.title) && m.c(this.subtitle, getReadsExploreVoiceCollection.subtitle) && m.c(this.items, getReadsExploreVoiceCollection.items)) {
                    return true;
                }
                return false;
            }

            public final List<VoiceItem> getItems() {
                return this.items;
            }

            public final String getSubtitle() {
                return this.subtitle;
            }

            public final String getTitle() {
                return this.title;
            }

            public int hashCode() {
                int hashCode;
                int hashCode2 = this.title.hashCode() * 31;
                String str = this.subtitle;
                if (str == null) {
                    hashCode = 0;
                } else {
                    hashCode = str.hashCode();
                }
                return this.items.hashCode() + ((hashCode2 + hashCode) * 31);
            }

            public String toString() {
                String str = this.title;
                String str2 = this.subtitle;
                return h.e(f.s("GetReadsExploreVoiceCollection(title=", str, ", subtitle=", str2, ", items="), this.items, Separators.RPAREN);
            }
        }

        public /* synthetic */ Section(kotlin.jvm.internal.f fVar) {
            this();
        }

        private Section() {
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0014JN\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u0010\u001cJ\u0014\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0083\u0004J\n\u0010!\u001a\u00020\nHÖ\u0081\u0004J\n\u0010\"\u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014¨\u0006#"}, d2 = {"Lio/elevenlabs/domain/model/ReadsExplorePage$Section$GetReadsExploreLargeGrid;", "Lio/elevenlabs/domain/model/ReadsExplorePage$Section;", "title", "", "subtitle", "deeplink", "reads", "", "Lio/elevenlabs/domain/model/ExploreRead;", "rows", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getDeeplink", "getReads", "()Ljava/util/List;", "getRows", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;)Lio/elevenlabs/domain/model/ReadsExplorePage$Section$GetReadsExploreLargeGrid;", "equals", "", "other", "", "hashCode", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class GetReadsExploreLargeGrid extends Section {
            private final String deeplink;
            private final List<ExploreRead> reads;
            private final Integer rows;
            private final String subtitle;
            private final String title;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public GetReadsExploreLargeGrid(String str, String str2, String str3, List<ExploreRead> list, Integer num) {
                super(null);
                list.getClass();
                this.title = str;
                this.subtitle = str2;
                this.deeplink = str3;
                this.reads = list;
                this.rows = num;
            }

            public static /* synthetic */ GetReadsExploreLargeGrid copy$default(GetReadsExploreLargeGrid getReadsExploreLargeGrid, String str, String str2, String str3, List list, Integer num, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = getReadsExploreLargeGrid.title;
                }
                if ((i10 & 2) != 0) {
                    str2 = getReadsExploreLargeGrid.subtitle;
                }
                if ((i10 & 4) != 0) {
                    str3 = getReadsExploreLargeGrid.deeplink;
                }
                if ((i10 & 8) != 0) {
                    list = getReadsExploreLargeGrid.reads;
                }
                if ((i10 & 16) != 0) {
                    num = getReadsExploreLargeGrid.rows;
                }
                Integer num2 = num;
                String str4 = str3;
                return getReadsExploreLargeGrid.copy(str, str2, str4, list, num2);
            }

            /* renamed from: component1, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            /* renamed from: component2, reason: from getter */
            public final String getSubtitle() {
                return this.subtitle;
            }

            /* renamed from: component3, reason: from getter */
            public final String getDeeplink() {
                return this.deeplink;
            }

            public final List<ExploreRead> component4() {
                return this.reads;
            }

            /* renamed from: component5, reason: from getter */
            public final Integer getRows() {
                return this.rows;
            }

            public final GetReadsExploreLargeGrid copy(String title, String subtitle, String deeplink, List<ExploreRead> reads, Integer rows) {
                reads.getClass();
                return new GetReadsExploreLargeGrid(title, subtitle, deeplink, reads, rows);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof GetReadsExploreLargeGrid)) {
                    return false;
                }
                GetReadsExploreLargeGrid getReadsExploreLargeGrid = (GetReadsExploreLargeGrid) other;
                if (m.c(this.title, getReadsExploreLargeGrid.title) && m.c(this.subtitle, getReadsExploreLargeGrid.subtitle) && m.c(this.deeplink, getReadsExploreLargeGrid.deeplink) && m.c(this.reads, getReadsExploreLargeGrid.reads) && m.c(this.rows, getReadsExploreLargeGrid.rows)) {
                    return true;
                }
                return false;
            }

            public final String getDeeplink() {
                return this.deeplink;
            }

            public final List<ExploreRead> getReads() {
                return this.reads;
            }

            public final Integer getRows() {
                return this.rows;
            }

            public final String getSubtitle() {
                return this.subtitle;
            }

            public final String getTitle() {
                return this.title;
            }

            public int hashCode() {
                int hashCode;
                int hashCode2;
                int hashCode3;
                String str = this.title;
                int i10 = 0;
                if (str == null) {
                    hashCode = 0;
                } else {
                    hashCode = str.hashCode();
                }
                int i11 = hashCode * 31;
                String str2 = this.subtitle;
                if (str2 == null) {
                    hashCode2 = 0;
                } else {
                    hashCode2 = str2.hashCode();
                }
                int i12 = (i11 + hashCode2) * 31;
                String str3 = this.deeplink;
                if (str3 == null) {
                    hashCode3 = 0;
                } else {
                    hashCode3 = str3.hashCode();
                }
                int d10 = n.d((i12 + hashCode3) * 31, 31, this.reads);
                Integer num = this.rows;
                if (num != null) {
                    i10 = num.hashCode();
                }
                return d10 + i10;
            }

            public String toString() {
                String str = this.title;
                String str2 = this.subtitle;
                String str3 = this.deeplink;
                List<ExploreRead> list = this.reads;
                Integer num = this.rows;
                StringBuilder s10 = f.s("GetReadsExploreLargeGrid(title=", str, ", subtitle=", str2, ", deeplink=");
                s10.append(str3);
                s10.append(", reads=");
                s10.append(list);
                s10.append(", rows=");
                s10.append(num);
                s10.append(Separators.RPAREN);
                return s10.toString();
            }

            public /* synthetic */ GetReadsExploreLargeGrid(String str, String str2, String str3, List list, Integer num, int i10, kotlin.jvm.internal.f fVar) {
                this(str, str2, str3, list, (i10 & 16) != 0 ? null : num);
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001BK\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0016J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\fHÆ\u0003JZ\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0002\u0010!J\u0014\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%HÖ\u0083\u0004J\n\u0010&\u001a\u00020\nHÖ\u0081\u0004J\n\u0010'\u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006("}, d2 = {"Lio/elevenlabs/domain/model/ReadsExplorePage$Section$GetReadsExploreSmallGrid;", "Lio/elevenlabs/domain/model/ReadsExplorePage$Section;", "title", "", "subtitle", "deeplink", "reads", "", "Lio/elevenlabs/domain/model/ExploreRead;", "rows", "", "deeplinkPosition", "Lio/elevenlabs/domain/model/ExploreDeeplinkPosition;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;Lio/elevenlabs/domain/model/ExploreDeeplinkPosition;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getDeeplink", "getReads", "()Ljava/util/List;", "getRows", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getDeeplinkPosition", "()Lio/elevenlabs/domain/model/ExploreDeeplinkPosition;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;Lio/elevenlabs/domain/model/ExploreDeeplinkPosition;)Lio/elevenlabs/domain/model/ReadsExplorePage$Section$GetReadsExploreSmallGrid;", "equals", "", "other", "", "hashCode", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class GetReadsExploreSmallGrid extends Section {
            private final String deeplink;
            private final ExploreDeeplinkPosition deeplinkPosition;
            private final List<ExploreRead> reads;
            private final Integer rows;
            private final String subtitle;
            private final String title;

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public /* synthetic */ GetReadsExploreSmallGrid(String str, String str2, String str3, List list, Integer num, ExploreDeeplinkPosition exploreDeeplinkPosition, int i10, kotlin.jvm.internal.f fVar) {
                this(str, str2, str3, list, num, r8);
                ExploreDeeplinkPosition exploreDeeplinkPosition2;
                num = (i10 & 16) != 0 ? null : num;
                if ((i10 & 32) != 0) {
                    exploreDeeplinkPosition2 = null;
                } else {
                    exploreDeeplinkPosition2 = exploreDeeplinkPosition;
                }
            }

            public static /* synthetic */ GetReadsExploreSmallGrid copy$default(GetReadsExploreSmallGrid getReadsExploreSmallGrid, String str, String str2, String str3, List list, Integer num, ExploreDeeplinkPosition exploreDeeplinkPosition, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = getReadsExploreSmallGrid.title;
                }
                if ((i10 & 2) != 0) {
                    str2 = getReadsExploreSmallGrid.subtitle;
                }
                if ((i10 & 4) != 0) {
                    str3 = getReadsExploreSmallGrid.deeplink;
                }
                if ((i10 & 8) != 0) {
                    list = getReadsExploreSmallGrid.reads;
                }
                if ((i10 & 16) != 0) {
                    num = getReadsExploreSmallGrid.rows;
                }
                if ((i10 & 32) != 0) {
                    exploreDeeplinkPosition = getReadsExploreSmallGrid.deeplinkPosition;
                }
                Integer num2 = num;
                ExploreDeeplinkPosition exploreDeeplinkPosition2 = exploreDeeplinkPosition;
                return getReadsExploreSmallGrid.copy(str, str2, str3, list, num2, exploreDeeplinkPosition2);
            }

            /* renamed from: component1, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            /* renamed from: component2, reason: from getter */
            public final String getSubtitle() {
                return this.subtitle;
            }

            /* renamed from: component3, reason: from getter */
            public final String getDeeplink() {
                return this.deeplink;
            }

            public final List<ExploreRead> component4() {
                return this.reads;
            }

            /* renamed from: component5, reason: from getter */
            public final Integer getRows() {
                return this.rows;
            }

            /* renamed from: component6, reason: from getter */
            public final ExploreDeeplinkPosition getDeeplinkPosition() {
                return this.deeplinkPosition;
            }

            public final GetReadsExploreSmallGrid copy(String title, String subtitle, String deeplink, List<ExploreRead> reads, Integer rows, ExploreDeeplinkPosition deeplinkPosition) {
                reads.getClass();
                return new GetReadsExploreSmallGrid(title, subtitle, deeplink, reads, rows, deeplinkPosition);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof GetReadsExploreSmallGrid)) {
                    return false;
                }
                GetReadsExploreSmallGrid getReadsExploreSmallGrid = (GetReadsExploreSmallGrid) other;
                if (m.c(this.title, getReadsExploreSmallGrid.title) && m.c(this.subtitle, getReadsExploreSmallGrid.subtitle) && m.c(this.deeplink, getReadsExploreSmallGrid.deeplink) && m.c(this.reads, getReadsExploreSmallGrid.reads) && m.c(this.rows, getReadsExploreSmallGrid.rows) && this.deeplinkPosition == getReadsExploreSmallGrid.deeplinkPosition) {
                    return true;
                }
                return false;
            }

            public final String getDeeplink() {
                return this.deeplink;
            }

            public final ExploreDeeplinkPosition getDeeplinkPosition() {
                return this.deeplinkPosition;
            }

            public final List<ExploreRead> getReads() {
                return this.reads;
            }

            public final Integer getRows() {
                return this.rows;
            }

            public final String getSubtitle() {
                return this.subtitle;
            }

            public final String getTitle() {
                return this.title;
            }

            public int hashCode() {
                int hashCode;
                int hashCode2;
                int hashCode3;
                int hashCode4;
                String str = this.title;
                int i10 = 0;
                if (str == null) {
                    hashCode = 0;
                } else {
                    hashCode = str.hashCode();
                }
                int i11 = hashCode * 31;
                String str2 = this.subtitle;
                if (str2 == null) {
                    hashCode2 = 0;
                } else {
                    hashCode2 = str2.hashCode();
                }
                int i12 = (i11 + hashCode2) * 31;
                String str3 = this.deeplink;
                if (str3 == null) {
                    hashCode3 = 0;
                } else {
                    hashCode3 = str3.hashCode();
                }
                int d10 = n.d((i12 + hashCode3) * 31, 31, this.reads);
                Integer num = this.rows;
                if (num == null) {
                    hashCode4 = 0;
                } else {
                    hashCode4 = num.hashCode();
                }
                int i13 = (d10 + hashCode4) * 31;
                ExploreDeeplinkPosition exploreDeeplinkPosition = this.deeplinkPosition;
                if (exploreDeeplinkPosition != null) {
                    i10 = exploreDeeplinkPosition.hashCode();
                }
                return i13 + i10;
            }

            public String toString() {
                String str = this.title;
                String str2 = this.subtitle;
                String str3 = this.deeplink;
                List<ExploreRead> list = this.reads;
                Integer num = this.rows;
                ExploreDeeplinkPosition exploreDeeplinkPosition = this.deeplinkPosition;
                StringBuilder s10 = f.s("GetReadsExploreSmallGrid(title=", str, ", subtitle=", str2, ", deeplink=");
                s10.append(str3);
                s10.append(", reads=");
                s10.append(list);
                s10.append(", rows=");
                s10.append(num);
                s10.append(", deeplinkPosition=");
                s10.append(exploreDeeplinkPosition);
                s10.append(Separators.RPAREN);
                return s10.toString();
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public GetReadsExploreSmallGrid(String str, String str2, String str3, List<ExploreRead> list, Integer num, ExploreDeeplinkPosition exploreDeeplinkPosition) {
                super(null);
                list.getClass();
                this.title = str;
                this.subtitle = str2;
                this.deeplink = str3;
                this.reads = list;
                this.rows = num;
                this.deeplinkPosition = exploreDeeplinkPosition;
            }
        }
    }

    public /* synthetic */ ReadsExplorePage(List list, String str, List list2, Map map, String str2, int i10, kotlin.jvm.internal.f fVar) {
        this(list, str, list2, (i10 & 8) != 0 ? null : map, (i10 & 16) != 0 ? null : str2);
    }
}
