package io.elevenlabs.domain.model;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;
import z.h;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004J\n\u0010\u0012\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lio/elevenlabs/domain/model/ReadDetailsTitleDescriptionSection;", "", "title", "", "description", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getDescription", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final /* data */ class ReadDetailsTitleDescriptionSection {
    private final String description;
    private final String title;

    public ReadDetailsTitleDescriptionSection(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.title = str;
        this.description = str2;
    }

    public static /* synthetic */ ReadDetailsTitleDescriptionSection copy$default(ReadDetailsTitleDescriptionSection readDetailsTitleDescriptionSection, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = readDetailsTitleDescriptionSection.title;
        }
        if ((i10 & 2) != 0) {
            str2 = readDetailsTitleDescriptionSection.description;
        }
        return readDetailsTitleDescriptionSection.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    public final ReadDetailsTitleDescriptionSection copy(String title, String description) {
        title.getClass();
        description.getClass();
        return new ReadDetailsTitleDescriptionSection(title, description);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReadDetailsTitleDescriptionSection)) {
            return false;
        }
        ReadDetailsTitleDescriptionSection readDetailsTitleDescriptionSection = (ReadDetailsTitleDescriptionSection) other;
        if (m.c(this.title, readDetailsTitleDescriptionSection.title) && m.c(this.description, readDetailsTitleDescriptionSection.description)) {
            return true;
        }
        return false;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.description.hashCode() + (this.title.hashCode() * 31);
    }

    public String toString() {
        return h.c("ReadDetailsTitleDescriptionSection(title=", this.title, ", description=", this.description, Separators.RPAREN);
    }
}
