package io.elevenlabs.domain.model;

import android.gov.nist.core.Separators;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import j0.c;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;
import p.n;
import tn.u;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\u0015\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\tHÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J[\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010!\u001a\u00020\"HÖ\u0081\u0004J\n\u0010#\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001d\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000f¨\u0006$"}, d2 = {"Lio/elevenlabs/domain/model/AuthorProfilePage;", "", "id", "", DiagnosticsEntry.NAME_KEY, "sections", "", "Lio/elevenlabs/domain/model/AuthorProfileSection;", "availableSorts", "", "defaultSort", "itemCountLabel", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getName", "getSections", "()Ljava/util/List;", "getAvailableSorts", "()Ljava/util/Map;", "getDefaultSort", "getItemCountLabel", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final /* data */ class AuthorProfilePage {
    private final Map<String, String> availableSorts;
    private final String defaultSort;
    private final String id;
    private final String itemCountLabel;
    private final String name;
    private final List<AuthorProfileSection> sections;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ AuthorProfilePage(String str, String str2, List list, Map map, String str3, String str4, int i10, f fVar) {
        this(str, str2, list, r4, r5, r6);
        String str5;
        String str6;
        Map map2 = (i10 & 8) != 0 ? u.f33548a : map;
        if ((i10 & 16) != 0) {
            str5 = null;
        } else {
            str5 = str3;
        }
        if ((i10 & 32) != 0) {
            str6 = null;
        } else {
            str6 = str4;
        }
    }

    public static /* synthetic */ AuthorProfilePage copy$default(AuthorProfilePage authorProfilePage, String str, String str2, List list, Map map, String str3, String str4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = authorProfilePage.id;
        }
        if ((i10 & 2) != 0) {
            str2 = authorProfilePage.name;
        }
        if ((i10 & 4) != 0) {
            list = authorProfilePage.sections;
        }
        if ((i10 & 8) != 0) {
            map = authorProfilePage.availableSorts;
        }
        if ((i10 & 16) != 0) {
            str3 = authorProfilePage.defaultSort;
        }
        if ((i10 & 32) != 0) {
            str4 = authorProfilePage.itemCountLabel;
        }
        String str5 = str3;
        String str6 = str4;
        return authorProfilePage.copy(str, str2, list, map, str5, str6);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public final List<AuthorProfileSection> component3() {
        return this.sections;
    }

    public final Map<String, String> component4() {
        return this.availableSorts;
    }

    /* renamed from: component5, reason: from getter */
    public final String getDefaultSort() {
        return this.defaultSort;
    }

    /* renamed from: component6, reason: from getter */
    public final String getItemCountLabel() {
        return this.itemCountLabel;
    }

    public final AuthorProfilePage copy(String id2, String name, List<? extends AuthorProfileSection> sections, Map<String, String> availableSorts, String defaultSort, String itemCountLabel) {
        id2.getClass();
        name.getClass();
        sections.getClass();
        availableSorts.getClass();
        return new AuthorProfilePage(id2, name, sections, availableSorts, defaultSort, itemCountLabel);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AuthorProfilePage)) {
            return false;
        }
        AuthorProfilePage authorProfilePage = (AuthorProfilePage) other;
        if (m.c(this.id, authorProfilePage.id) && m.c(this.name, authorProfilePage.name) && m.c(this.sections, authorProfilePage.sections) && m.c(this.availableSorts, authorProfilePage.availableSorts) && m.c(this.defaultSort, authorProfilePage.defaultSort) && m.c(this.itemCountLabel, authorProfilePage.itemCountLabel)) {
            return true;
        }
        return false;
    }

    public final Map<String, String> getAvailableSorts() {
        return this.availableSorts;
    }

    public final String getDefaultSort() {
        return this.defaultSort;
    }

    public final String getId() {
        return this.id;
    }

    public final String getItemCountLabel() {
        return this.itemCountLabel;
    }

    public final String getName() {
        return this.name;
    }

    public final List<AuthorProfileSection> getSections() {
        return this.sections;
    }

    public int hashCode() {
        int hashCode;
        int a10 = defpackage.f.a(this.availableSorts, n.d(c.c(this.id.hashCode() * 31, 31, this.name), 31, this.sections), 31);
        String str = this.defaultSort;
        int i10 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (a10 + hashCode) * 31;
        String str2 = this.itemCountLabel;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return i11 + i10;
    }

    public String toString() {
        String str = this.id;
        String str2 = this.name;
        List<AuthorProfileSection> list = this.sections;
        Map<String, String> map = this.availableSorts;
        String str3 = this.defaultSort;
        String str4 = this.itemCountLabel;
        StringBuilder s10 = defpackage.f.s("AuthorProfilePage(id=", str, ", name=", str2, ", sections=");
        s10.append(list);
        s10.append(", availableSorts=");
        s10.append(map);
        s10.append(", defaultSort=");
        return defpackage.f.n(s10, str3, ", itemCountLabel=", str4, Separators.RPAREN);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AuthorProfilePage(String str, String str2, List<? extends AuthorProfileSection> list, Map<String, String> map, String str3, String str4) {
        str.getClass();
        str2.getClass();
        list.getClass();
        map.getClass();
        this.id = str;
        this.name = str2;
        this.sections = list;
        this.availableSorts = map;
        this.defaultSort = str3;
        this.itemCountLabel = str4;
    }
}
