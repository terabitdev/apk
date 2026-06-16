package io.elevenlabs.domain.model;

import android.gov.nist.core.Separators;
import ib.i;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0014\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lio/elevenlabs/domain/model/UsageSectionsPage;", "", "sections", "", "Lio/elevenlabs/domain/model/UsageSection;", "<init>", "(Ljava/util/List;)V", "getSections", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final /* data */ class UsageSectionsPage {
    private final List<UsageSection> sections;

    /* JADX WARN: Multi-variable type inference failed */
    public UsageSectionsPage(List<? extends UsageSection> list) {
        list.getClass();
        this.sections = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UsageSectionsPage copy$default(UsageSectionsPage usageSectionsPage, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = usageSectionsPage.sections;
        }
        return usageSectionsPage.copy(list);
    }

    public final List<UsageSection> component1() {
        return this.sections;
    }

    public final UsageSectionsPage copy(List<? extends UsageSection> sections) {
        sections.getClass();
        return new UsageSectionsPage(sections);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if ((other instanceof UsageSectionsPage) && m.c(this.sections, ((UsageSectionsPage) other).sections)) {
            return true;
        }
        return false;
    }

    public final List<UsageSection> getSections() {
        return this.sections;
    }

    public int hashCode() {
        return this.sections.hashCode();
    }

    public String toString() {
        return i.k("UsageSectionsPage(sections=", Separators.RPAREN, this.sections);
    }
}
