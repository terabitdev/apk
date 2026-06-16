package io.elevenlabs.data.model.response;

import android.gov.nist.core.Separators;
import defpackage.f;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import livekit.LivekitInternal$NodeStats;
import p.n;
import qr.g;
import sn.h;
import sn.i;
import ur.c1;
import ur.g1;
import ur.t0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b$\b\u0087\b\u0018\u0000 92\u00020\u0001:\u0002:9B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fBQ\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\bHÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001cJJ\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010\u001cJ\u0010\u0010&\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010)\u001a\u00020\b2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010+\u0012\u0004\b-\u0010.\u001a\u0004\b,\u0010\u001cR \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010+\u0012\u0004\b0\u0010.\u001a\u0004\b/\u0010\u001cR&\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u00101\u0012\u0004\b3\u0010.\u001a\u0004\b2\u0010\u001fR \u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u00104\u0012\u0004\b6\u0010.\u001a\u0004\b5\u0010!R\"\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010+\u0012\u0004\b8\u0010.\u001a\u0004\b7\u0010\u001c¨\u0006;"}, d2 = {"Lio/elevenlabs/data/model/response/AuthorSubpageResponse;", "", "", "id", "title", "", "Lio/elevenlabs/data/model/response/AuthorProfileSection;", "sections", "", "hasMore", "nextCursor", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZLjava/lang/String;)V", "", "seen0", "Lur/c1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;ZLjava/lang/String;Lur/c1;)V", "self", "Ltr/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lsn/z;", "write$Self$data_release", "(Lio/elevenlabs/data/model/response/AuthorSubpageResponse;Ltr/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/List;", "component4", "()Z", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZLjava/lang/String;)Lio/elevenlabs/data/model/response/AuthorSubpageResponse;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getId$annotations", "()V", "getTitle", "getTitle$annotations", "Ljava/util/List;", "getSections", "getSections$annotations", "Z", "getHasMore", "getHasMore$annotations", "getNextCursor", "getNextCursor$annotations", "Companion", "$serializer", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
@g
/* loaded from: classes3.dex */
public final /* data */ class AuthorSubpageResponse {
    private final boolean hasMore;
    private final String id;
    private final String nextCursor;
    private final List<AuthorProfileSection> sections;
    private final String title;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final h[] $childSerializers = {null, null, sn.a.d(i.f31597b, new io.elevenlabs.data.model.a(11)), null, null};

    public /* synthetic */ AuthorSubpageResponse(int i10, String str, String str2, List list, boolean z6, String str3, c1 c1Var) {
        if (15 == (i10 & 15)) {
            this.id = str;
            this.title = str2;
            this.sections = list;
            this.hasMore = z6;
            if ((i10 & 16) == 0) {
                this.nextCursor = null;
                return;
            } else {
                this.nextCursor = str3;
                return;
            }
        }
        t0.j(i10, 15, AuthorSubpageResponse$$serializer.INSTANCE.getDescriptor());
        throw null;
    }

    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new AuthorProfileSectionsListSerializer();
    }

    public static /* synthetic */ AuthorSubpageResponse copy$default(AuthorSubpageResponse authorSubpageResponse, String str, String str2, List list, boolean z6, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = authorSubpageResponse.id;
        }
        if ((i10 & 2) != 0) {
            str2 = authorSubpageResponse.title;
        }
        if ((i10 & 4) != 0) {
            list = authorSubpageResponse.sections;
        }
        if ((i10 & 8) != 0) {
            z6 = authorSubpageResponse.hasMore;
        }
        if ((i10 & 16) != 0) {
            str3 = authorSubpageResponse.nextCursor;
        }
        String str4 = str3;
        List list2 = list;
        return authorSubpageResponse.copy(str, str2, list2, z6, str4);
    }

    public static final /* synthetic */ void write$Self$data_release(AuthorSubpageResponse self, tr.b output, SerialDescriptor serialDesc) {
        h[] hVarArr = $childSerializers;
        output.V(serialDesc, 0, self.id);
        output.V(serialDesc, 1, self.title);
        output.g(serialDesc, 2, (KSerializer) hVarArr[2].getValue(), self.sections);
        output.T(serialDesc, 3, self.hasMore);
        if (output.C(serialDesc) || self.nextCursor != null) {
            output.o(serialDesc, 4, g1.f34588a, self.nextCursor);
        }
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final List<AuthorProfileSection> component3() {
        return this.sections;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getHasMore() {
        return this.hasMore;
    }

    /* renamed from: component5, reason: from getter */
    public final String getNextCursor() {
        return this.nextCursor;
    }

    public final AuthorSubpageResponse copy(String id2, String title, List<? extends AuthorProfileSection> sections, boolean hasMore, String nextCursor) {
        id2.getClass();
        title.getClass();
        sections.getClass();
        return new AuthorSubpageResponse(id2, title, sections, hasMore, nextCursor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AuthorSubpageResponse)) {
            return false;
        }
        AuthorSubpageResponse authorSubpageResponse = (AuthorSubpageResponse) other;
        if (m.c(this.id, authorSubpageResponse.id) && m.c(this.title, authorSubpageResponse.title) && m.c(this.sections, authorSubpageResponse.sections) && this.hasMore == authorSubpageResponse.hasMore && m.c(this.nextCursor, authorSubpageResponse.nextCursor)) {
            return true;
        }
        return false;
    }

    public final boolean getHasMore() {
        return this.hasMore;
    }

    public final String getId() {
        return this.id;
    }

    public final String getNextCursor() {
        return this.nextCursor;
    }

    public final List<AuthorProfileSection> getSections() {
        return this.sections;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode;
        int f10 = com.google.android.gms.internal.play_billing.b.f(n.d(j0.c.c(this.id.hashCode() * 31, 31, this.title), 31, this.sections), 31, this.hasMore);
        String str = this.nextCursor;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return f10 + hashCode;
    }

    public String toString() {
        String str = this.id;
        String str2 = this.title;
        List<AuthorProfileSection> list = this.sections;
        boolean z6 = this.hasMore;
        String str3 = this.nextCursor;
        StringBuilder s10 = f.s("AuthorSubpageResponse(id=", str, ", title=", str2, ", sections=");
        s10.append(list);
        s10.append(", hasMore=");
        s10.append(z6);
        s10.append(", nextCursor=");
        return f.l(str3, Separators.RPAREN, s10);
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/model/response/AuthorSubpageResponse$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/model/response/AuthorSubpageResponse;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
            this();
        }

        public final KSerializer serializer() {
            return AuthorSubpageResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public static /* synthetic */ void getHasMore$annotations() {
    }

    public static /* synthetic */ void getId$annotations() {
    }

    public static /* synthetic */ void getNextCursor$annotations() {
    }

    @g(with = AuthorProfileSectionsListSerializer.class)
    public static /* synthetic */ void getSections$annotations() {
    }

    public static /* synthetic */ void getTitle$annotations() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AuthorSubpageResponse(String str, String str2, List<? extends AuthorProfileSection> list, boolean z6, String str3) {
        j0.c.w(str, str2, list);
        this.id = str;
        this.title = str2;
        this.sections = list;
        this.hasMore = z6;
        this.nextCursor = str3;
    }

    public /* synthetic */ AuthorSubpageResponse(String str, String str2, List list, boolean z6, String str3, int i10, kotlin.jvm.internal.f fVar) {
        this(str, str2, list, z6, (i10 & 16) != 0 ? null : str3);
    }
}
