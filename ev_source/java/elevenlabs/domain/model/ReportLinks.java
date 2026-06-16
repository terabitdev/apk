package io.elevenlabs.domain.model;

import android.gov.nist.core.Separators;
import ib.i;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0014\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lio/elevenlabs/domain/model/ReportLinks;", "", "links", "", "Lio/elevenlabs/domain/model/Link;", "<init>", "(Ljava/util/List;)V", "getLinks", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final /* data */ class ReportLinks {
    private final List<Link> links;

    public ReportLinks(List<Link> list) {
        list.getClass();
        this.links = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ReportLinks copy$default(ReportLinks reportLinks, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = reportLinks.links;
        }
        return reportLinks.copy(list);
    }

    public final List<Link> component1() {
        return this.links;
    }

    public final ReportLinks copy(List<Link> links) {
        links.getClass();
        return new ReportLinks(links);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if ((other instanceof ReportLinks) && m.c(this.links, ((ReportLinks) other).links)) {
            return true;
        }
        return false;
    }

    public final List<Link> getLinks() {
        return this.links;
    }

    public int hashCode() {
        return this.links.hashCode();
    }

    public String toString() {
        return i.k("ReportLinks(links=", Separators.RPAREN, this.links);
    }
}
