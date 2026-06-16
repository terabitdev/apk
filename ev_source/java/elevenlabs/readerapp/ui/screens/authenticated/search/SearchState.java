package io.elevenlabs.readerapp.ui.screens.authenticated.search;

import android.gov.nist.core.Separators;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import io.elevenlabs.domain.model.MediaItemState;
import io.elevenlabs.domain.model.ReadMeta;
import io.elevenlabs.domain.model.SearchSection;
import io.livekit.android.rpc.RpcError;
import java.util.Date;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;
import p.n;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b+\b\u0087\b\u0018\u00002\u00020\u0001Bµ\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0007\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\t\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0018\u0012\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\t¢\u0006\u0004\b\u001b\u0010\u001cJ\t\u00101\u001a\u00020\u0003HÆ\u0003J\t\u00102\u001a\u00020\u0005HÆ\u0003J\t\u00103\u001a\u00020\u0007HÆ\u0003J\u000f\u00104\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J\t\u00105\u001a\u00020\u0007HÆ\u0003J\t\u00106\u001a\u00020\rHÆ\u0003J\t\u00107\u001a\u00020\u0007HÆ\u0003J\u000f\u00108\u001a\b\u0012\u0004\u0012\u00020\u00100\tHÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010:\u001a\u00020\u0007HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010<\u001a\u00020\u0005HÆ\u0003J\u000f\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00050\u0016HÆ\u0003J\t\u0010>\u001a\u00020\u0018HÆ\u0003J\u000f\u0010?\u001a\b\u0012\u0004\u0012\u00020\u001a0\tHÆ\u0003J»\u0001\u0010@\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u00072\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\t2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0012\u001a\u00020\u00072\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0014\u001a\u00020\u00052\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00182\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\tHÆ\u0001J\u0014\u0010A\u001a\u00020\u00072\b\u0010B\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010C\u001a\u00020\rHÖ\u0081\u0004J\n\u0010D\u001a\u00020\u0005HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010!R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\u000b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b$\u0010!R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\u000e\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010!R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\t¢\u0006\b\n\u0000\u001a\u0004\b'\u0010#R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b(\u0010 R\u0011\u0010\u0012\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b)\u0010!R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b*\u0010 R\u0011\u0010\u0014\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b+\u0010 R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u0016¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0011\u0010\u0017\u001a\u00020\u0018¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\t¢\u0006\b\n\u0000\u001a\u0004\b0\u0010#¨\u0006E"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/search/SearchState;", "", "corpus", "Lio/elevenlabs/readerapp/ui/screens/authenticated/search/SearchCorpus;", "query", "", "isLibraryLoading", "", "libraryResults", "", "Lio/elevenlabs/domain/model/ReadMeta;", "libraryHasMore", "libraryLimit", "", "isExploreLoading", "exploreResults", "Lio/elevenlabs/domain/model/SearchSection;", "exploreCursor", "exploreHasMore", "exploreSearchId", "exploreError", "exploreReadsInLibrary", "", "now", "Ljava/util/Date;", "playerQueue", "Lio/elevenlabs/domain/model/MediaItemState;", "<init>", "(Lio/elevenlabs/readerapp/ui/screens/authenticated/search/SearchCorpus;Ljava/lang/String;ZLjava/util/List;ZIZLjava/util/List;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/util/Set;Ljava/util/Date;Ljava/util/List;)V", "getCorpus", "()Lio/elevenlabs/readerapp/ui/screens/authenticated/search/SearchCorpus;", "getQuery", "()Ljava/lang/String;", "()Z", "getLibraryResults", "()Ljava/util/List;", "getLibraryHasMore", "getLibraryLimit", "()I", "getExploreResults", "getExploreCursor", "getExploreHasMore", "getExploreSearchId", "getExploreError", "getExploreReadsInLibrary", "()Ljava/util/Set;", "getNow", "()Ljava/util/Date;", "getPlayerQueue", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "copy", "equals", "other", "hashCode", "toString", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final /* data */ class SearchState {
    public static final int $stable = 8;
    private final SearchCorpus corpus;
    private final String exploreCursor;
    private final String exploreError;
    private final boolean exploreHasMore;
    private final Set<String> exploreReadsInLibrary;
    private final List<SearchSection> exploreResults;
    private final String exploreSearchId;
    private final boolean isExploreLoading;
    private final boolean isLibraryLoading;
    private final boolean libraryHasMore;
    private final int libraryLimit;
    private final List<ReadMeta> libraryResults;
    private final Date now;
    private final List<MediaItemState> playerQueue;
    private final String query;

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ SearchState(io.elevenlabs.readerapp.ui.screens.authenticated.search.SearchCorpus r20, java.lang.String r21, boolean r22, java.util.List r23, boolean r24, int r25, boolean r26, java.util.List r27, java.lang.String r28, boolean r29, java.lang.String r30, java.lang.String r31, java.util.Set r32, java.util.Date r33, java.util.List r34, int r35, kotlin.jvm.internal.f r36) {
        /*
            r19 = this;
            r0 = r35
            r1 = r0 & 2
            java.lang.String r2 = ""
            if (r1 == 0) goto La
            r5 = r2
            goto Lc
        La:
            r5 = r21
        Lc:
            r1 = r0 & 4
            r3 = 1
            if (r1 == 0) goto L13
            r6 = r3
            goto L15
        L13:
            r6 = r22
        L15:
            r1 = r0 & 8
            tn.t r4 = tn.t.f33547a
            if (r1 == 0) goto L1d
            r7 = r4
            goto L1f
        L1d:
            r7 = r23
        L1f:
            r1 = r0 & 16
            if (r1 == 0) goto L25
            r8 = r3
            goto L27
        L25:
            r8 = r24
        L27:
            r1 = r0 & 32
            if (r1 == 0) goto L2f
            r1 = 10
            r9 = r1
            goto L31
        L2f:
            r9 = r25
        L31:
            r1 = r0 & 64
            if (r1 == 0) goto L37
            r10 = r3
            goto L39
        L37:
            r10 = r26
        L39:
            r1 = r0 & 128(0x80, float:1.8E-43)
            if (r1 == 0) goto L3f
            r11 = r4
            goto L41
        L3f:
            r11 = r27
        L41:
            r1 = r0 & 256(0x100, float:3.59E-43)
            r12 = 0
            if (r1 == 0) goto L48
            r1 = r12
            goto L4a
        L48:
            r1 = r28
        L4a:
            r13 = r0 & 512(0x200, float:7.17E-43)
            if (r13 == 0) goto L50
            r13 = r3
            goto L52
        L50:
            r13 = r29
        L52:
            r3 = r0 & 1024(0x400, float:1.435E-42)
            if (r3 == 0) goto L58
            r14 = r12
            goto L5a
        L58:
            r14 = r30
        L5a:
            r3 = r0 & 2048(0x800, float:2.87E-42)
            if (r3 == 0) goto L60
            r15 = r2
            goto L62
        L60:
            r15 = r31
        L62:
            r2 = r0 & 4096(0x1000, float:5.74E-42)
            if (r2 == 0) goto L6b
            tn.v r2 = tn.v.f33549a
            r16 = r2
            goto L6d
        L6b:
            r16 = r32
        L6d:
            r0 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r0 == 0) goto L7b
            r18 = r4
            r3 = r19
            r17 = r33
            r12 = r1
            r4 = r20
            goto L84
        L7b:
            r18 = r34
            r3 = r19
            r4 = r20
            r17 = r33
            r12 = r1
        L84:
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.elevenlabs.readerapp.ui.screens.authenticated.search.SearchState.<init>(io.elevenlabs.readerapp.ui.screens.authenticated.search.SearchCorpus, java.lang.String, boolean, java.util.List, boolean, int, boolean, java.util.List, java.lang.String, boolean, java.lang.String, java.lang.String, java.util.Set, java.util.Date, java.util.List, int, kotlin.jvm.internal.f):void");
    }

    public static /* synthetic */ SearchState copy$default(SearchState searchState, SearchCorpus searchCorpus, String str, boolean z6, List list, boolean z10, int i10, boolean z11, List list2, String str2, boolean z12, String str3, String str4, Set set, Date date, List list3, int i11, Object obj) {
        SearchCorpus searchCorpus2;
        String str5;
        boolean z13;
        List list4;
        boolean z14;
        int i12;
        boolean z15;
        List list5;
        String str6;
        boolean z16;
        String str7;
        String str8;
        Set set2;
        Date date2;
        List list6;
        if ((i11 & 1) != 0) {
            searchCorpus2 = searchState.corpus;
        } else {
            searchCorpus2 = searchCorpus;
        }
        if ((i11 & 2) != 0) {
            str5 = searchState.query;
        } else {
            str5 = str;
        }
        if ((i11 & 4) != 0) {
            z13 = searchState.isLibraryLoading;
        } else {
            z13 = z6;
        }
        if ((i11 & 8) != 0) {
            list4 = searchState.libraryResults;
        } else {
            list4 = list;
        }
        if ((i11 & 16) != 0) {
            z14 = searchState.libraryHasMore;
        } else {
            z14 = z10;
        }
        if ((i11 & 32) != 0) {
            i12 = searchState.libraryLimit;
        } else {
            i12 = i10;
        }
        if ((i11 & 64) != 0) {
            z15 = searchState.isExploreLoading;
        } else {
            z15 = z11;
        }
        if ((i11 & 128) != 0) {
            list5 = searchState.exploreResults;
        } else {
            list5 = list2;
        }
        if ((i11 & RpcError.MAX_MESSAGE_BYTES) != 0) {
            str6 = searchState.exploreCursor;
        } else {
            str6 = str2;
        }
        if ((i11 & 512) != 0) {
            z16 = searchState.exploreHasMore;
        } else {
            z16 = z12;
        }
        if ((i11 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
            str7 = searchState.exploreSearchId;
        } else {
            str7 = str3;
        }
        if ((i11 & 2048) != 0) {
            str8 = searchState.exploreError;
        } else {
            str8 = str4;
        }
        if ((i11 & 4096) != 0) {
            set2 = searchState.exploreReadsInLibrary;
        } else {
            set2 = set;
        }
        if ((i11 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0) {
            date2 = searchState.now;
        } else {
            date2 = date;
        }
        if ((i11 & 16384) != 0) {
            list6 = searchState.playerQueue;
        } else {
            list6 = list3;
        }
        return searchState.copy(searchCorpus2, str5, z13, list4, z14, i12, z15, list5, str6, z16, str7, str8, set2, date2, list6);
    }

    /* renamed from: component1, reason: from getter */
    public final SearchCorpus getCorpus() {
        return this.corpus;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getExploreHasMore() {
        return this.exploreHasMore;
    }

    /* renamed from: component11, reason: from getter */
    public final String getExploreSearchId() {
        return this.exploreSearchId;
    }

    /* renamed from: component12, reason: from getter */
    public final String getExploreError() {
        return this.exploreError;
    }

    public final Set<String> component13() {
        return this.exploreReadsInLibrary;
    }

    /* renamed from: component14, reason: from getter */
    public final Date getNow() {
        return this.now;
    }

    public final List<MediaItemState> component15() {
        return this.playerQueue;
    }

    /* renamed from: component2, reason: from getter */
    public final String getQuery() {
        return this.query;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsLibraryLoading() {
        return this.isLibraryLoading;
    }

    public final List<ReadMeta> component4() {
        return this.libraryResults;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getLibraryHasMore() {
        return this.libraryHasMore;
    }

    /* renamed from: component6, reason: from getter */
    public final int getLibraryLimit() {
        return this.libraryLimit;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getIsExploreLoading() {
        return this.isExploreLoading;
    }

    public final List<SearchSection> component8() {
        return this.exploreResults;
    }

    /* renamed from: component9, reason: from getter */
    public final String getExploreCursor() {
        return this.exploreCursor;
    }

    public final SearchState copy(SearchCorpus corpus, String query, boolean isLibraryLoading, List<ReadMeta> libraryResults, boolean libraryHasMore, int libraryLimit, boolean isExploreLoading, List<? extends SearchSection> exploreResults, String exploreCursor, boolean exploreHasMore, String exploreSearchId, String exploreError, Set<String> exploreReadsInLibrary, Date now, List<MediaItemState> playerQueue) {
        corpus.getClass();
        query.getClass();
        libraryResults.getClass();
        exploreResults.getClass();
        exploreError.getClass();
        exploreReadsInLibrary.getClass();
        now.getClass();
        playerQueue.getClass();
        return new SearchState(corpus, query, isLibraryLoading, libraryResults, libraryHasMore, libraryLimit, isExploreLoading, exploreResults, exploreCursor, exploreHasMore, exploreSearchId, exploreError, exploreReadsInLibrary, now, playerQueue);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchState)) {
            return false;
        }
        SearchState searchState = (SearchState) other;
        if (this.corpus == searchState.corpus && m.c(this.query, searchState.query) && this.isLibraryLoading == searchState.isLibraryLoading && m.c(this.libraryResults, searchState.libraryResults) && this.libraryHasMore == searchState.libraryHasMore && this.libraryLimit == searchState.libraryLimit && this.isExploreLoading == searchState.isExploreLoading && m.c(this.exploreResults, searchState.exploreResults) && m.c(this.exploreCursor, searchState.exploreCursor) && this.exploreHasMore == searchState.exploreHasMore && m.c(this.exploreSearchId, searchState.exploreSearchId) && m.c(this.exploreError, searchState.exploreError) && m.c(this.exploreReadsInLibrary, searchState.exploreReadsInLibrary) && m.c(this.now, searchState.now) && m.c(this.playerQueue, searchState.playerQueue)) {
            return true;
        }
        return false;
    }

    public final SearchCorpus getCorpus() {
        return this.corpus;
    }

    public final String getExploreCursor() {
        return this.exploreCursor;
    }

    public final String getExploreError() {
        return this.exploreError;
    }

    public final boolean getExploreHasMore() {
        return this.exploreHasMore;
    }

    public final Set<String> getExploreReadsInLibrary() {
        return this.exploreReadsInLibrary;
    }

    public final List<SearchSection> getExploreResults() {
        return this.exploreResults;
    }

    public final String getExploreSearchId() {
        return this.exploreSearchId;
    }

    public final boolean getLibraryHasMore() {
        return this.libraryHasMore;
    }

    public final int getLibraryLimit() {
        return this.libraryLimit;
    }

    public final List<ReadMeta> getLibraryResults() {
        return this.libraryResults;
    }

    public final Date getNow() {
        return this.now;
    }

    public final List<MediaItemState> getPlayerQueue() {
        return this.playerQueue;
    }

    public final String getQuery() {
        return this.query;
    }

    public int hashCode() {
        int hashCode;
        int d10 = n.d(com.google.android.gms.internal.play_billing.b.f(j0.c.b(this.libraryLimit, com.google.android.gms.internal.play_billing.b.f(n.d(com.google.android.gms.internal.play_billing.b.f(j0.c.c(this.corpus.hashCode() * 31, 31, this.query), 31, this.isLibraryLoading), 31, this.libraryResults), 31, this.libraryHasMore), 31), 31, this.isExploreLoading), 31, this.exploreResults);
        String str = this.exploreCursor;
        int i10 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int f10 = com.google.android.gms.internal.play_billing.b.f((d10 + hashCode) * 31, 31, this.exploreHasMore);
        String str2 = this.exploreSearchId;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return this.playerQueue.hashCode() + ((this.now.hashCode() + ((this.exploreReadsInLibrary.hashCode() + j0.c.c((f10 + i10) * 31, 31, this.exploreError)) * 31)) * 31);
    }

    public final boolean isExploreLoading() {
        return this.isExploreLoading;
    }

    public final boolean isLibraryLoading() {
        return this.isLibraryLoading;
    }

    public String toString() {
        SearchCorpus searchCorpus = this.corpus;
        String str = this.query;
        boolean z6 = this.isLibraryLoading;
        List<ReadMeta> list = this.libraryResults;
        boolean z10 = this.libraryHasMore;
        int i10 = this.libraryLimit;
        boolean z11 = this.isExploreLoading;
        List<SearchSection> list2 = this.exploreResults;
        String str2 = this.exploreCursor;
        boolean z12 = this.exploreHasMore;
        String str3 = this.exploreSearchId;
        String str4 = this.exploreError;
        Set<String> set = this.exploreReadsInLibrary;
        Date date = this.now;
        List<MediaItemState> list3 = this.playerQueue;
        StringBuilder sb = new StringBuilder("SearchState(corpus=");
        sb.append(searchCorpus);
        sb.append(", query=");
        sb.append(str);
        sb.append(", isLibraryLoading=");
        sb.append(z6);
        sb.append(", libraryResults=");
        sb.append(list);
        sb.append(", libraryHasMore=");
        sb.append(z10);
        sb.append(", libraryLimit=");
        sb.append(i10);
        sb.append(", isExploreLoading=");
        sb.append(z11);
        sb.append(", exploreResults=");
        sb.append(list2);
        sb.append(", exploreCursor=");
        defpackage.f.y(sb, str2, ", exploreHasMore=", z12, ", exploreSearchId=");
        defpackage.f.x(sb, str3, ", exploreError=", str4, ", exploreReadsInLibrary=");
        sb.append(set);
        sb.append(", now=");
        sb.append(date);
        sb.append(", playerQueue=");
        return z.h.e(sb, list3, Separators.RPAREN);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SearchState(SearchCorpus searchCorpus, String str, boolean z6, List<ReadMeta> list, boolean z10, int i10, boolean z11, List<? extends SearchSection> list2, String str2, boolean z12, String str3, String str4, Set<String> set, Date date, List<MediaItemState> list3) {
        searchCorpus.getClass();
        str.getClass();
        list.getClass();
        list2.getClass();
        str4.getClass();
        set.getClass();
        date.getClass();
        list3.getClass();
        this.corpus = searchCorpus;
        this.query = str;
        this.isLibraryLoading = z6;
        this.libraryResults = list;
        this.libraryHasMore = z10;
        this.libraryLimit = i10;
        this.isExploreLoading = z11;
        this.exploreResults = list2;
        this.exploreCursor = str2;
        this.exploreHasMore = z12;
        this.exploreSearchId = str3;
        this.exploreError = str4;
        this.exploreReadsInLibrary = set;
        this.now = date;
        this.playerQueue = list3;
    }
}
