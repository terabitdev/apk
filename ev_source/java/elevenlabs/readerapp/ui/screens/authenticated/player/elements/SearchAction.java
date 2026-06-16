package io.elevenlabs.readerapp.ui.screens.authenticated.player.elements;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ4\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000bJ\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u000f¨\u0006 "}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/elements/SearchAction;", "", "", "query", "Lwq/l;", "pattern", "", "elements", "<init>", "(Ljava/lang/String;Lwq/l;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "()Lwq/l;", "component3", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Lwq/l;Ljava/util/List;)Lio/elevenlabs/readerapp/ui/screens/authenticated/player/elements/SearchAction;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getQuery", "Lwq/l;", "getPattern", "Ljava/util/List;", "getElements", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final /* data */ class SearchAction {
    public static final int $stable = 8;
    private final List<String> elements;
    private final wq.l pattern;
    private final String query;

    public SearchAction(String str, wq.l lVar, List<String> list) {
        str.getClass();
        lVar.getClass();
        list.getClass();
        this.query = str;
        this.pattern = lVar;
        this.elements = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SearchAction copy$default(SearchAction searchAction, String str, wq.l lVar, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = searchAction.query;
        }
        if ((i10 & 2) != 0) {
            lVar = searchAction.pattern;
        }
        if ((i10 & 4) != 0) {
            list = searchAction.elements;
        }
        return searchAction.copy(str, lVar, list);
    }

    /* renamed from: component1, reason: from getter */
    public final String getQuery() {
        return this.query;
    }

    /* renamed from: component2, reason: from getter */
    public final wq.l getPattern() {
        return this.pattern;
    }

    public final List<String> component3() {
        return this.elements;
    }

    public final SearchAction copy(String query, wq.l pattern, List<String> elements) {
        query.getClass();
        pattern.getClass();
        elements.getClass();
        return new SearchAction(query, pattern, elements);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchAction)) {
            return false;
        }
        SearchAction searchAction = (SearchAction) other;
        if (kotlin.jvm.internal.m.c(this.query, searchAction.query) && kotlin.jvm.internal.m.c(this.pattern, searchAction.pattern) && kotlin.jvm.internal.m.c(this.elements, searchAction.elements)) {
            return true;
        }
        return false;
    }

    public final List<String> getElements() {
        return this.elements;
    }

    public final wq.l getPattern() {
        return this.pattern;
    }

    public final String getQuery() {
        return this.query;
    }

    public int hashCode() {
        return this.elements.hashCode() + ((this.pattern.hashCode() + (this.query.hashCode() * 31)) * 31);
    }

    public String toString() {
        String str = this.query;
        wq.l lVar = this.pattern;
        List<String> list = this.elements;
        StringBuilder sb = new StringBuilder("SearchAction(query=");
        sb.append(str);
        sb.append(", pattern=");
        sb.append(lVar);
        sb.append(", elements=");
        return z.h.e(sb, list, Separators.RPAREN);
    }
}
