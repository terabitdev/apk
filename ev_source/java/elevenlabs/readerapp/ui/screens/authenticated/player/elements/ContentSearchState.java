package io.elevenlabs.readerapp.ui.screens.authenticated.player.elements;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\b\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\bHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\bHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014JN\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\b2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\bHÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u000eJ\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001d\u001a\u00020\u00062\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b\u0007\u0010\u0012R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010$\u001a\u0004\b%\u0010\u0014R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\b8\u0006¢\u0006\f\n\u0004\b\n\u0010$\u001a\u0004\b&\u0010\u0014¨\u0006'"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/elements/ContentSearchState;", "", "", "query", "Lwq/l;", "pattern", "", "isLoading", "", "htmlElements", "results", "<init>", "(Ljava/lang/String;Lwq/l;ZLjava/util/List;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "()Lwq/l;", "component3", "()Z", "component4", "()Ljava/util/List;", "component5", "copy", "(Ljava/lang/String;Lwq/l;ZLjava/util/List;Ljava/util/List;)Lio/elevenlabs/readerapp/ui/screens/authenticated/player/elements/ContentSearchState;", "toString", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getQuery", "Lwq/l;", "getPattern", "Z", "Ljava/util/List;", "getHtmlElements", "getResults", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final /* data */ class ContentSearchState {
    public static final int $stable = 8;
    private final List<String> htmlElements;
    private final boolean isLoading;
    private final wq.l pattern;
    private final String query;
    private final List<String> results;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ ContentSearchState(String str, wq.l lVar, boolean z6, List list, List list2, int i10, kotlin.jvm.internal.f fVar) {
        this(str, lVar, z6, list, r7);
        List list3;
        str = (i10 & 1) != 0 ? "" : str;
        lVar = (i10 & 2) != 0 ? new wq.l("") : lVar;
        z6 = (i10 & 4) != 0 ? false : z6;
        int i11 = i10 & 8;
        tn.t tVar = tn.t.f33547a;
        list = i11 != 0 ? tVar : list;
        if ((i10 & 16) != 0) {
            list3 = tVar;
        } else {
            list3 = list2;
        }
    }

    public static /* synthetic */ ContentSearchState copy$default(ContentSearchState contentSearchState, String str, wq.l lVar, boolean z6, List list, List list2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = contentSearchState.query;
        }
        if ((i10 & 2) != 0) {
            lVar = contentSearchState.pattern;
        }
        if ((i10 & 4) != 0) {
            z6 = contentSearchState.isLoading;
        }
        if ((i10 & 8) != 0) {
            list = contentSearchState.htmlElements;
        }
        if ((i10 & 16) != 0) {
            list2 = contentSearchState.results;
        }
        List list3 = list2;
        boolean z10 = z6;
        return contentSearchState.copy(str, lVar, z10, list, list3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getQuery() {
        return this.query;
    }

    /* renamed from: component2, reason: from getter */
    public final wq.l getPattern() {
        return this.pattern;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    public final List<String> component4() {
        return this.htmlElements;
    }

    public final List<String> component5() {
        return this.results;
    }

    public final ContentSearchState copy(String query, wq.l pattern, boolean isLoading, List<String> htmlElements, List<String> results) {
        query.getClass();
        pattern.getClass();
        htmlElements.getClass();
        results.getClass();
        return new ContentSearchState(query, pattern, isLoading, htmlElements, results);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ContentSearchState)) {
            return false;
        }
        ContentSearchState contentSearchState = (ContentSearchState) other;
        if (kotlin.jvm.internal.m.c(this.query, contentSearchState.query) && kotlin.jvm.internal.m.c(this.pattern, contentSearchState.pattern) && this.isLoading == contentSearchState.isLoading && kotlin.jvm.internal.m.c(this.htmlElements, contentSearchState.htmlElements) && kotlin.jvm.internal.m.c(this.results, contentSearchState.results)) {
            return true;
        }
        return false;
    }

    public final List<String> getHtmlElements() {
        return this.htmlElements;
    }

    public final wq.l getPattern() {
        return this.pattern;
    }

    public final String getQuery() {
        return this.query;
    }

    public final List<String> getResults() {
        return this.results;
    }

    public int hashCode() {
        return this.results.hashCode() + p.n.d(com.google.android.gms.internal.play_billing.b.f((this.pattern.hashCode() + (this.query.hashCode() * 31)) * 31, 31, this.isLoading), 31, this.htmlElements);
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public String toString() {
        String str = this.query;
        wq.l lVar = this.pattern;
        boolean z6 = this.isLoading;
        List<String> list = this.htmlElements;
        List<String> list2 = this.results;
        StringBuilder sb = new StringBuilder("ContentSearchState(query=");
        sb.append(str);
        sb.append(", pattern=");
        sb.append(lVar);
        sb.append(", isLoading=");
        sb.append(z6);
        sb.append(", htmlElements=");
        sb.append(list);
        sb.append(", results=");
        return z.h.e(sb, list2, Separators.RPAREN);
    }

    public ContentSearchState(String str, wq.l lVar, boolean z6, List<String> list, List<String> list2) {
        str.getClass();
        lVar.getClass();
        list.getClass();
        list2.getClass();
        this.query = str;
        this.pattern = lVar;
        this.isLoading = z6;
        this.htmlElements = list;
        this.results = list2;
    }

    public ContentSearchState() {
        this(null, null, false, null, null, 31, null);
    }
}
