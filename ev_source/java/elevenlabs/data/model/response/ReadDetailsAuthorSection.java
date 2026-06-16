package io.elevenlabs.data.model.response;

import android.gov.nist.core.Separators;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import defpackage.f;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import livekit.LivekitInternal$NodeStats;
import qr.g;
import ur.c1;
import ur.g1;
import ur.t0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 22\u00020\u0001:\u000232B;\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tBM\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0019J\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0019JH\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0019J\u0010\u0010!\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b&\u0010'R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010(\u0012\u0004\b*\u0010+\u001a\u0004\b)\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010(\u001a\u0004\b,\u0010\u0019R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010(\u0012\u0004\b.\u0010+\u001a\u0004\b-\u0010\u0019R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b/\u0010\u0019R \u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010(\u0012\u0004\b1\u0010+\u001a\u0004\b0\u0010\u0019¨\u00064"}, d2 = {"Lio/elevenlabs/data/model/response/ReadDetailsAuthorSection;", "Lio/elevenlabs/data/model/response/ReadDetailsSection;", "", "avatarUrl", DiagnosticsEntry.NAME_KEY, "penName", "bio", "authorId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lur/c1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lur/c1;)V", "self", "Ltr/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lsn/z;", "write$Self$data_release", "(Lio/elevenlabs/data/model/response/ReadDetailsAuthorSection;Ltr/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/elevenlabs/data/model/response/ReadDetailsAuthorSection;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAvatarUrl", "getAvatarUrl$annotations", "()V", "getName", "getPenName", "getPenName$annotations", "getBio", "getAuthorId", "getAuthorId$annotations", "Companion", "$serializer", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
@g
/* loaded from: classes3.dex */
public final /* data */ class ReadDetailsAuthorSection implements ReadDetailsSection {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String authorId;
    private final String avatarUrl;
    private final String bio;
    private final String name;
    private final String penName;

    public /* synthetic */ ReadDetailsAuthorSection(int i10, String str, String str2, String str3, String str4, String str5, c1 c1Var) {
        if (18 == (i10 & 18)) {
            if ((i10 & 1) == 0) {
                this.avatarUrl = null;
            } else {
                this.avatarUrl = str;
            }
            this.name = str2;
            if ((i10 & 4) == 0) {
                this.penName = null;
            } else {
                this.penName = str3;
            }
            if ((i10 & 8) == 0) {
                this.bio = null;
            } else {
                this.bio = str4;
            }
            this.authorId = str5;
            return;
        }
        t0.j(i10, 18, ReadDetailsAuthorSection$$serializer.INSTANCE.getDescriptor());
        throw null;
    }

    public static /* synthetic */ ReadDetailsAuthorSection copy$default(ReadDetailsAuthorSection readDetailsAuthorSection, String str, String str2, String str3, String str4, String str5, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = readDetailsAuthorSection.avatarUrl;
        }
        if ((i10 & 2) != 0) {
            str2 = readDetailsAuthorSection.name;
        }
        if ((i10 & 4) != 0) {
            str3 = readDetailsAuthorSection.penName;
        }
        if ((i10 & 8) != 0) {
            str4 = readDetailsAuthorSection.bio;
        }
        if ((i10 & 16) != 0) {
            str5 = readDetailsAuthorSection.authorId;
        }
        String str6 = str5;
        String str7 = str3;
        return readDetailsAuthorSection.copy(str, str2, str7, str4, str6);
    }

    public static final /* synthetic */ void write$Self$data_release(ReadDetailsAuthorSection self, tr.b output, SerialDescriptor serialDesc) {
        if (output.C(serialDesc) || self.avatarUrl != null) {
            output.o(serialDesc, 0, g1.f34588a, self.avatarUrl);
        }
        output.V(serialDesc, 1, self.name);
        if (output.C(serialDesc) || self.penName != null) {
            output.o(serialDesc, 2, g1.f34588a, self.penName);
        }
        if (output.C(serialDesc) || self.bio != null) {
            output.o(serialDesc, 3, g1.f34588a, self.bio);
        }
        output.V(serialDesc, 4, self.authorId);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component3, reason: from getter */
    public final String getPenName() {
        return this.penName;
    }

    /* renamed from: component4, reason: from getter */
    public final String getBio() {
        return this.bio;
    }

    /* renamed from: component5, reason: from getter */
    public final String getAuthorId() {
        return this.authorId;
    }

    public final ReadDetailsAuthorSection copy(String avatarUrl, String name, String penName, String bio, String authorId) {
        name.getClass();
        authorId.getClass();
        return new ReadDetailsAuthorSection(avatarUrl, name, penName, bio, authorId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReadDetailsAuthorSection)) {
            return false;
        }
        ReadDetailsAuthorSection readDetailsAuthorSection = (ReadDetailsAuthorSection) other;
        if (m.c(this.avatarUrl, readDetailsAuthorSection.avatarUrl) && m.c(this.name, readDetailsAuthorSection.name) && m.c(this.penName, readDetailsAuthorSection.penName) && m.c(this.bio, readDetailsAuthorSection.bio) && m.c(this.authorId, readDetailsAuthorSection.authorId)) {
            return true;
        }
        return false;
    }

    public final String getAuthorId() {
        return this.authorId;
    }

    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    public final String getBio() {
        return this.bio;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPenName() {
        return this.penName;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        String str = this.avatarUrl;
        int i10 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int c5 = j0.c.c(hashCode * 31, 31, this.name);
        String str2 = this.penName;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i11 = (c5 + hashCode2) * 31;
        String str3 = this.bio;
        if (str3 != null) {
            i10 = str3.hashCode();
        }
        return this.authorId.hashCode() + ((i11 + i10) * 31);
    }

    public String toString() {
        String str = this.avatarUrl;
        String str2 = this.name;
        String str3 = this.penName;
        String str4 = this.bio;
        String str5 = this.authorId;
        StringBuilder s10 = f.s("ReadDetailsAuthorSection(avatarUrl=", str, ", name=", str2, ", penName=");
        f.x(s10, str3, ", bio=", str4, ", authorId=");
        return f.l(str5, Separators.RPAREN, s10);
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/model/response/ReadDetailsAuthorSection$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/model/response/ReadDetailsAuthorSection;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
            this();
        }

        public final KSerializer serializer() {
            return ReadDetailsAuthorSection$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public static /* synthetic */ void getAuthorId$annotations() {
    }

    public static /* synthetic */ void getAvatarUrl$annotations() {
    }

    public static /* synthetic */ void getPenName$annotations() {
    }

    public ReadDetailsAuthorSection(String str, String str2, String str3, String str4, String str5) {
        str2.getClass();
        str5.getClass();
        this.avatarUrl = str;
        this.name = str2;
        this.penName = str3;
        this.bio = str4;
        this.authorId = str5;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ ReadDetailsAuthorSection(String str, String str2, String str3, String str4, String str5, int i10, kotlin.jvm.internal.f fVar) {
        this(str, str2, str3, r6, r7);
        String str6;
        String str7;
        str = (i10 & 1) != 0 ? null : str;
        str3 = (i10 & 4) != 0 ? null : str3;
        if ((i10 & 8) != 0) {
            str6 = str5;
            str7 = null;
        } else {
            str6 = str5;
            str7 = str4;
        }
    }
}
