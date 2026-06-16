package io.elevenlabs.data.model.response;

import android.gov.nist.core.Separators;
import defpackage.f;
import ib.i;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import livekit.LivekitInternal$NodeStats;
import qr.g;
import ur.c1;
import ur.t0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0002\b\u0010\b\u0087\b\u0018\u0000 12\u00020\u0001:\u000221B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tBA\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0019J8\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0019J\u0010\u0010!\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020\u00052\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b%\u0010&R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010'\u0012\u0004\b)\u0010*\u001a\u0004\b(\u0010\u0019R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010'\u0012\u0004\b,\u0010*\u001a\u0004\b+\u0010\u0019R \u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010-\u0012\u0004\b.\u0010*\u001a\u0004\b\u0006\u0010\u001cR \u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010'\u0012\u0004\b0\u0010*\u001a\u0004\b/\u0010\u0019¨\u00063"}, d2 = {"Lio/elevenlabs/data/model/response/AuthorActionsSection;", "Lio/elevenlabs/data/model/response/AuthorProfileSection;", "", "authorId", "authorName", "", "isFollowing", "shareLink", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "", "seen0", "Lur/c1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lur/c1;)V", "self", "Ltr/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lsn/z;", "write$Self$data_release", "(Lio/elevenlabs/data/model/response/AuthorActionsSection;Ltr/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Z", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)Lio/elevenlabs/data/model/response/AuthorActionsSection;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAuthorId", "getAuthorId$annotations", "()V", "getAuthorName", "getAuthorName$annotations", "Z", "isFollowing$annotations", "getShareLink", "getShareLink$annotations", "Companion", "$serializer", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
@g
/* loaded from: classes3.dex */
public final /* data */ class AuthorActionsSection implements AuthorProfileSection {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String authorId;
    private final String authorName;
    private final boolean isFollowing;
    private final String shareLink;

    public /* synthetic */ AuthorActionsSection(int i10, String str, String str2, boolean z6, String str3, c1 c1Var) {
        if (15 == (i10 & 15)) {
            this.authorId = str;
            this.authorName = str2;
            this.isFollowing = z6;
            this.shareLink = str3;
            return;
        }
        t0.j(i10, 15, AuthorActionsSection$$serializer.INSTANCE.getDescriptor());
        throw null;
    }

    public static /* synthetic */ AuthorActionsSection copy$default(AuthorActionsSection authorActionsSection, String str, String str2, boolean z6, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = authorActionsSection.authorId;
        }
        if ((i10 & 2) != 0) {
            str2 = authorActionsSection.authorName;
        }
        if ((i10 & 4) != 0) {
            z6 = authorActionsSection.isFollowing;
        }
        if ((i10 & 8) != 0) {
            str3 = authorActionsSection.shareLink;
        }
        return authorActionsSection.copy(str, str2, z6, str3);
    }

    public static final /* synthetic */ void write$Self$data_release(AuthorActionsSection self, tr.b output, SerialDescriptor serialDesc) {
        output.V(serialDesc, 0, self.authorId);
        output.V(serialDesc, 1, self.authorName);
        output.T(serialDesc, 2, self.isFollowing);
        output.V(serialDesc, 3, self.shareLink);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAuthorId() {
        return this.authorId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAuthorName() {
        return this.authorName;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsFollowing() {
        return this.isFollowing;
    }

    /* renamed from: component4, reason: from getter */
    public final String getShareLink() {
        return this.shareLink;
    }

    public final AuthorActionsSection copy(String authorId, String authorName, boolean isFollowing, String shareLink) {
        authorId.getClass();
        authorName.getClass();
        shareLink.getClass();
        return new AuthorActionsSection(authorId, authorName, isFollowing, shareLink);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AuthorActionsSection)) {
            return false;
        }
        AuthorActionsSection authorActionsSection = (AuthorActionsSection) other;
        if (m.c(this.authorId, authorActionsSection.authorId) && m.c(this.authorName, authorActionsSection.authorName) && this.isFollowing == authorActionsSection.isFollowing && m.c(this.shareLink, authorActionsSection.shareLink)) {
            return true;
        }
        return false;
    }

    public final String getAuthorId() {
        return this.authorId;
    }

    public final String getAuthorName() {
        return this.authorName;
    }

    public final String getShareLink() {
        return this.shareLink;
    }

    public int hashCode() {
        return this.shareLink.hashCode() + com.google.android.gms.internal.play_billing.b.f(j0.c.c(this.authorId.hashCode() * 31, 31, this.authorName), 31, this.isFollowing);
    }

    public final boolean isFollowing() {
        return this.isFollowing;
    }

    public String toString() {
        String str = this.authorId;
        String str2 = this.authorName;
        boolean z6 = this.isFollowing;
        String str3 = this.shareLink;
        StringBuilder s10 = f.s("AuthorActionsSection(authorId=", str, ", authorName=", str2, ", isFollowing=");
        s10.append(z6);
        s10.append(", shareLink=");
        s10.append(str3);
        s10.append(Separators.RPAREN);
        return s10.toString();
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/model/response/AuthorActionsSection$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/model/response/AuthorActionsSection;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
            this();
        }

        public final KSerializer serializer() {
            return AuthorActionsSection$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public static /* synthetic */ void getAuthorId$annotations() {
    }

    public static /* synthetic */ void getAuthorName$annotations() {
    }

    public static /* synthetic */ void getShareLink$annotations() {
    }

    public static /* synthetic */ void isFollowing$annotations() {
    }

    public AuthorActionsSection(String str, String str2, boolean z6, String str3) {
        i.s(str, str2, str3);
        this.authorId = str;
        this.authorName = str2;
        this.isFollowing = z6;
        this.shareLink = str3;
    }
}
