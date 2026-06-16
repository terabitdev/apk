package io.elevenlabs.data.model.response;

import android.gov.nist.core.Separators;
import io.elevenlabs.data.model.XiBackendRoutesReaderAuthorProfilesSubpageOverview;
import io.elevenlabs.data.model.XiBackendRoutesReaderAuthorProfilesSubpageOverview$$serializer;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import livekit.LivekitInternal$NodeStats;
import p.n;
import qr.g;
import sn.h;
import sn.i;
import ur.c1;
import ur.t0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0087\b\u0018\u0000 02\u00020\u0001:\u000210B-\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nBC\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ:\u0010\u001e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010&\u001a\u00020\u00072\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'R&\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010(\u0012\u0004\b*\u0010+\u001a\u0004\b)\u0010\u001aR&\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010(\u0012\u0004\b-\u0010+\u001a\u0004\b,\u0010\u001aR \u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010.\u0012\u0004\b/\u0010+\u001a\u0004\b\b\u0010\u001d¨\u00062"}, d2 = {"Lio/elevenlabs/data/model/response/AuthorProfileResponse;", "", "", "Lio/elevenlabs/data/model/response/AuthorProfileSection;", "sections", "Lio/elevenlabs/data/model/XiBackendRoutesReaderAuthorProfilesSubpageOverview;", "subpages", "", "isFollowing", "<init>", "(Ljava/util/List;Ljava/util/List;Z)V", "", "seen0", "Lur/c1;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/util/List;ZLur/c1;)V", "self", "Ltr/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lsn/z;", "write$Self$data_release", "(Lio/elevenlabs/data/model/response/AuthorProfileResponse;Ltr/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/util/List;", "component2", "component3", "()Z", "copy", "(Ljava/util/List;Ljava/util/List;Z)Lio/elevenlabs/data/model/response/AuthorProfileResponse;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getSections", "getSections$annotations", "()V", "getSubpages", "getSubpages$annotations", "Z", "isFollowing$annotations", "Companion", "$serializer", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
@g
/* loaded from: classes3.dex */
public final /* data */ class AuthorProfileResponse {
    private static final h[] $childSerializers;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final boolean isFollowing;
    private final List<AuthorProfileSection> sections;
    private final List<XiBackendRoutesReaderAuthorProfilesSubpageOverview> subpages;

    static {
        io.elevenlabs.data.model.a aVar = new io.elevenlabs.data.model.a(9);
        i iVar = i.f31597b;
        $childSerializers = new h[]{sn.a.d(iVar, aVar), sn.a.d(iVar, new io.elevenlabs.data.model.a(10)), null};
    }

    public /* synthetic */ AuthorProfileResponse(int i10, List list, List list2, boolean z6, c1 c1Var) {
        if (3 == (i10 & 3)) {
            this.sections = list;
            this.subpages = list2;
            if ((i10 & 4) == 0) {
                this.isFollowing = false;
                return;
            } else {
                this.isFollowing = z6;
                return;
            }
        }
        t0.j(i10, 3, AuthorProfileResponse$$serializer.INSTANCE.getDescriptor());
        throw null;
    }

    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new AuthorProfileSectionsListSerializer();
    }

    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new ur.d(XiBackendRoutesReaderAuthorProfilesSubpageOverview$$serializer.INSTANCE, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AuthorProfileResponse copy$default(AuthorProfileResponse authorProfileResponse, List list, List list2, boolean z6, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = authorProfileResponse.sections;
        }
        if ((i10 & 2) != 0) {
            list2 = authorProfileResponse.subpages;
        }
        if ((i10 & 4) != 0) {
            z6 = authorProfileResponse.isFollowing;
        }
        return authorProfileResponse.copy(list, list2, z6);
    }

    public static final /* synthetic */ void write$Self$data_release(AuthorProfileResponse self, tr.b output, SerialDescriptor serialDesc) {
        h[] hVarArr = $childSerializers;
        output.g(serialDesc, 0, (KSerializer) hVarArr[0].getValue(), self.sections);
        output.g(serialDesc, 1, (KSerializer) hVarArr[1].getValue(), self.subpages);
        if (output.C(serialDesc) || self.isFollowing) {
            output.T(serialDesc, 2, self.isFollowing);
        }
    }

    public final List<AuthorProfileSection> component1() {
        return this.sections;
    }

    public final List<XiBackendRoutesReaderAuthorProfilesSubpageOverview> component2() {
        return this.subpages;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsFollowing() {
        return this.isFollowing;
    }

    public final AuthorProfileResponse copy(List<? extends AuthorProfileSection> sections, List<XiBackendRoutesReaderAuthorProfilesSubpageOverview> subpages, boolean isFollowing) {
        sections.getClass();
        subpages.getClass();
        return new AuthorProfileResponse(sections, subpages, isFollowing);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AuthorProfileResponse)) {
            return false;
        }
        AuthorProfileResponse authorProfileResponse = (AuthorProfileResponse) other;
        if (m.c(this.sections, authorProfileResponse.sections) && m.c(this.subpages, authorProfileResponse.subpages) && this.isFollowing == authorProfileResponse.isFollowing) {
            return true;
        }
        return false;
    }

    public final List<AuthorProfileSection> getSections() {
        return this.sections;
    }

    public final List<XiBackendRoutesReaderAuthorProfilesSubpageOverview> getSubpages() {
        return this.subpages;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isFollowing) + n.d(this.sections.hashCode() * 31, 31, this.subpages);
    }

    public final boolean isFollowing() {
        return this.isFollowing;
    }

    public String toString() {
        List<AuthorProfileSection> list = this.sections;
        List<XiBackendRoutesReaderAuthorProfilesSubpageOverview> list2 = this.subpages;
        boolean z6 = this.isFollowing;
        StringBuilder sb = new StringBuilder("AuthorProfileResponse(sections=");
        sb.append(list);
        sb.append(", subpages=");
        sb.append(list2);
        sb.append(", isFollowing=");
        return n.j(Separators.RPAREN, sb, z6);
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/model/response/AuthorProfileResponse$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/model/response/AuthorProfileResponse;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final KSerializer serializer() {
            return AuthorProfileResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @g(with = AuthorProfileSectionsListSerializer.class)
    public static /* synthetic */ void getSections$annotations() {
    }

    public static /* synthetic */ void getSubpages$annotations() {
    }

    public static /* synthetic */ void isFollowing$annotations() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AuthorProfileResponse(List<? extends AuthorProfileSection> list, List<XiBackendRoutesReaderAuthorProfilesSubpageOverview> list2, boolean z6) {
        list.getClass();
        list2.getClass();
        this.sections = list;
        this.subpages = list2;
        this.isFollowing = z6;
    }

    public /* synthetic */ AuthorProfileResponse(List list, List list2, boolean z6, int i10, f fVar) {
        this(list, list2, (i10 & 4) != 0 ? false : z6);
    }
}
