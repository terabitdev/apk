package io.elevenlabs.domain.model;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import ib.i;
import j0.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lio/elevenlabs/domain/model/SearchSection;", "", "SearchList", "GlobalRead", "Collection", "GenericItem", "Lio/elevenlabs/domain/model/SearchSection$Collection;", "Lio/elevenlabs/domain/model/SearchSection$GenericItem;", "Lio/elevenlabs/domain/model/SearchSection$GlobalRead;", "Lio/elevenlabs/domain/model/SearchSection$SearchList;", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public interface SearchSection {

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lio/elevenlabs/domain/model/SearchSection$Collection;", "Lio/elevenlabs/domain/model/SearchSection;", "collection", "Lio/elevenlabs/domain/model/CollectionMeta;", "<init>", "(Lio/elevenlabs/domain/model/CollectionMeta;)V", "getCollection", "()Lio/elevenlabs/domain/model/CollectionMeta;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final /* data */ class Collection implements SearchSection {
        private final CollectionMeta collection;

        public Collection(CollectionMeta collectionMeta) {
            collectionMeta.getClass();
            this.collection = collectionMeta;
        }

        public static /* synthetic */ Collection copy$default(Collection collection, CollectionMeta collectionMeta, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                collectionMeta = collection.collection;
            }
            return collection.copy(collectionMeta);
        }

        /* renamed from: component1, reason: from getter */
        public final CollectionMeta getCollection() {
            return this.collection;
        }

        public final Collection copy(CollectionMeta collection) {
            collection.getClass();
            return new Collection(collection);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if ((other instanceof Collection) && m.c(this.collection, ((Collection) other).collection)) {
                return true;
            }
            return false;
        }

        public final CollectionMeta getCollection() {
            return this.collection;
        }

        public int hashCode() {
            return this.collection.hashCode();
        }

        public String toString() {
            return "Collection(collection=" + this.collection + Separators.RPAREN;
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lio/elevenlabs/domain/model/SearchSection$GlobalRead;", "Lio/elevenlabs/domain/model/SearchSection;", "read", "Lio/elevenlabs/domain/model/ReadMeta;", "<init>", "(Lio/elevenlabs/domain/model/ReadMeta;)V", "getRead", "()Lio/elevenlabs/domain/model/ReadMeta;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final /* data */ class GlobalRead implements SearchSection {
        private final ReadMeta read;

        public GlobalRead(ReadMeta readMeta) {
            readMeta.getClass();
            this.read = readMeta;
        }

        public static /* synthetic */ GlobalRead copy$default(GlobalRead globalRead, ReadMeta readMeta, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                readMeta = globalRead.read;
            }
            return globalRead.copy(readMeta);
        }

        /* renamed from: component1, reason: from getter */
        public final ReadMeta getRead() {
            return this.read;
        }

        public final GlobalRead copy(ReadMeta read) {
            read.getClass();
            return new GlobalRead(read);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if ((other instanceof GlobalRead) && m.c(this.read, ((GlobalRead) other).read)) {
                return true;
            }
            return false;
        }

        public final ReadMeta getRead() {
            return this.read;
        }

        public int hashCode() {
            return this.read.hashCode();
        }

        public String toString() {
            return "GlobalRead(read=" + this.read + Separators.RPAREN;
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0083\u0004J\n\u0010\u0014\u001a\u00020\u0015HÖ\u0081\u0004J\n\u0010\u0016\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lio/elevenlabs/domain/model/SearchSection$SearchList;", "Lio/elevenlabs/domain/model/SearchSection;", "title", "", "searches", "", "Lio/elevenlabs/domain/model/SearchResult;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getTitle", "()Ljava/lang/String;", "getSearches", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final /* data */ class SearchList implements SearchSection {
        private final List<SearchResult> searches;
        private final String title;

        /* JADX WARN: Multi-variable type inference failed */
        public SearchList(String str, List<? extends SearchResult> list) {
            str.getClass();
            list.getClass();
            this.title = str;
            this.searches = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ SearchList copy$default(SearchList searchList, String str, List list, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = searchList.title;
            }
            if ((i10 & 2) != 0) {
                list = searchList.searches;
            }
            return searchList.copy(str, list);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public final List<SearchResult> component2() {
            return this.searches;
        }

        public final SearchList copy(String title, List<? extends SearchResult> searches) {
            title.getClass();
            searches.getClass();
            return new SearchList(title, searches);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SearchList)) {
                return false;
            }
            SearchList searchList = (SearchList) other;
            if (m.c(this.title, searchList.title) && m.c(this.searches, searchList.searches)) {
                return true;
            }
            return false;
        }

        public final List<SearchResult> getSearches() {
            return this.searches;
        }

        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            return this.searches.hashCode() + (this.title.hashCode() * 31);
        }

        public String toString() {
            return i.j("SearchList(title=", this.title, ", searches=", Separators.RPAREN, this.searches);
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003JA\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0083\u0004J\n\u0010\u001a\u001a\u00020\u001bHÖ\u0081\u0004J\n\u0010\u001c\u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001d"}, d2 = {"Lio/elevenlabs/domain/model/SearchSection$GenericItem;", "Lio/elevenlabs/domain/model/SearchSection;", "image", "", "title", "subtitle", ParameterNames.TEXT, "deeplink", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getImage", "()Ljava/lang/String;", "getTitle", "getSubtitle", "getText", "getDeeplink", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final /* data */ class GenericItem implements SearchSection {
        private final String deeplink;
        private final String image;
        private final String subtitle;
        private final String text;
        private final String title;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ GenericItem(String str, String str2, String str3, String str4, String str5, int i10, f fVar) {
            this(str, str2, str3, r6, r7);
            String str6;
            String str7;
            str = (i10 & 1) != 0 ? null : str;
            str3 = (i10 & 4) != 0 ? null : str3;
            if ((i10 & 8) != 0) {
                str6 = str5;
                str7 = null;
            } else {
                str6 = str5;
                str7 = str4;
            }
        }

        public static /* synthetic */ GenericItem copy$default(GenericItem genericItem, String str, String str2, String str3, String str4, String str5, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = genericItem.image;
            }
            if ((i10 & 2) != 0) {
                str2 = genericItem.title;
            }
            if ((i10 & 4) != 0) {
                str3 = genericItem.subtitle;
            }
            if ((i10 & 8) != 0) {
                str4 = genericItem.text;
            }
            if ((i10 & 16) != 0) {
                str5 = genericItem.deeplink;
            }
            String str6 = str5;
            String str7 = str3;
            return genericItem.copy(str, str2, str7, str4, str6);
        }

        /* renamed from: component1, reason: from getter */
        public final String getImage() {
            return this.image;
        }

        /* renamed from: component2, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component3, reason: from getter */
        public final String getSubtitle() {
            return this.subtitle;
        }

        /* renamed from: component4, reason: from getter */
        public final String getText() {
            return this.text;
        }

        /* renamed from: component5, reason: from getter */
        public final String getDeeplink() {
            return this.deeplink;
        }

        public final GenericItem copy(String image, String title, String subtitle, String text, String deeplink) {
            title.getClass();
            deeplink.getClass();
            return new GenericItem(image, title, subtitle, text, deeplink);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof GenericItem)) {
                return false;
            }
            GenericItem genericItem = (GenericItem) other;
            if (m.c(this.image, genericItem.image) && m.c(this.title, genericItem.title) && m.c(this.subtitle, genericItem.subtitle) && m.c(this.text, genericItem.text) && m.c(this.deeplink, genericItem.deeplink)) {
                return true;
            }
            return false;
        }

        public final String getDeeplink() {
            return this.deeplink;
        }

        public final String getImage() {
            return this.image;
        }

        public final String getSubtitle() {
            return this.subtitle;
        }

        public final String getText() {
            return this.text;
        }

        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2;
            String str = this.image;
            int i10 = 0;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int c5 = c.c(hashCode * 31, 31, this.title);
            String str2 = this.subtitle;
            if (str2 == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str2.hashCode();
            }
            int i11 = (c5 + hashCode2) * 31;
            String str3 = this.text;
            if (str3 != null) {
                i10 = str3.hashCode();
            }
            return this.deeplink.hashCode() + ((i11 + i10) * 31);
        }

        public String toString() {
            String str = this.image;
            String str2 = this.title;
            String str3 = this.subtitle;
            String str4 = this.text;
            String str5 = this.deeplink;
            StringBuilder s10 = defpackage.f.s("GenericItem(image=", str, ", title=", str2, ", subtitle=");
            defpackage.f.x(s10, str3, ", text=", str4, ", deeplink=");
            return defpackage.f.l(str5, Separators.RPAREN, s10);
        }

        public GenericItem(String str, String str2, String str3, String str4, String str5) {
            str2.getClass();
            str5.getClass();
            this.image = str;
            this.title = str2;
            this.subtitle = str3;
            this.text = str4;
            this.deeplink = str5;
        }
    }
}
