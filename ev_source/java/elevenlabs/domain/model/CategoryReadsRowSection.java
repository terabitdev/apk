package io.elevenlabs.domain.model;

import android.gov.nist.core.Separators;
import defpackage.f;
import j0.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;
import z.h;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J-\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001J\u0014\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0016\u001a\u00020\u0017HÖ\u0081\u0004J\n\u0010\u0018\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lio/elevenlabs/domain/model/CategoryReadsRowSection;", "", "title", "", "deeplink", "reads", "", "Lio/elevenlabs/domain/model/BasicReadMeta;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getTitle", "()Ljava/lang/String;", "getDeeplink", "getReads", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final /* data */ class CategoryReadsRowSection {
    private final String deeplink;
    private final List<BasicReadMeta> reads;
    private final String title;

    public CategoryReadsRowSection(String str, String str2, List<BasicReadMeta> list) {
        c.w(str, str2, list);
        this.title = str;
        this.deeplink = str2;
        this.reads = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CategoryReadsRowSection copy$default(CategoryReadsRowSection categoryReadsRowSection, String str, String str2, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = categoryReadsRowSection.title;
        }
        if ((i10 & 2) != 0) {
            str2 = categoryReadsRowSection.deeplink;
        }
        if ((i10 & 4) != 0) {
            list = categoryReadsRowSection.reads;
        }
        return categoryReadsRowSection.copy(str, str2, list);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDeeplink() {
        return this.deeplink;
    }

    public final List<BasicReadMeta> component3() {
        return this.reads;
    }

    public final CategoryReadsRowSection copy(String title, String deeplink, List<BasicReadMeta> reads) {
        title.getClass();
        deeplink.getClass();
        reads.getClass();
        return new CategoryReadsRowSection(title, deeplink, reads);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CategoryReadsRowSection)) {
            return false;
        }
        CategoryReadsRowSection categoryReadsRowSection = (CategoryReadsRowSection) other;
        if (m.c(this.title, categoryReadsRowSection.title) && m.c(this.deeplink, categoryReadsRowSection.deeplink) && m.c(this.reads, categoryReadsRowSection.reads)) {
            return true;
        }
        return false;
    }

    public final String getDeeplink() {
        return this.deeplink;
    }

    public final List<BasicReadMeta> getReads() {
        return this.reads;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.reads.hashCode() + c.c(this.title.hashCode() * 31, 31, this.deeplink);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.deeplink;
        return h.e(f.s("CategoryReadsRowSection(title=", str, ", deeplink=", str2, ", reads="), this.reads, Separators.RPAREN);
    }
}
