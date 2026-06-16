package io.elevenlabs.data.model.response;

import android.gov.nist.core.Separators;
import defpackage.f;
import io.elevenlabs.data.model.SizeableHeaderImage;
import io.elevenlabs.data.model.SizeableHeaderImage$$serializer;
import io.elevenlabs.data.model.Tag;
import io.elevenlabs.data.model.Tag$$serializer;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import livekit.LivekitInternal$NodeStats;
import qr.g;
import sn.h;
import sn.i;
import ur.c1;
import ur.g1;
import ur.t0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0087\b\u0018\u0000 G2\u00020\u0001:\u0002HGBi\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000e\u0010\u000fBq\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000e\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0018J\u0018\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0018J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0018J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0018Jt\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\"\u0010\u0018J\u0010\u0010#\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b(\u0010)J'\u00102\u001a\u00020/2\u0006\u0010*\u001a\u00020\u00002\u0006\u0010,\u001a\u00020+2\u0006\u0010.\u001a\u00020-H\u0001¢\u0006\u0004\b0\u00101R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u00103\u0012\u0004\b5\u00106\u001a\u0004\b4\u0010\u0016R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u00107\u0012\u0004\b9\u00106\u001a\u0004\b8\u0010\u0018R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u00107\u0012\u0004\b;\u00106\u001a\u0004\b:\u0010\u0018R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u00107\u0012\u0004\b=\u00106\u001a\u0004\b<\u0010\u0018R(\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010>\u0012\u0004\b@\u00106\u001a\u0004\b?\u0010\u001cR\"\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u00107\u0012\u0004\bB\u00106\u001a\u0004\bA\u0010\u0018R\"\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u00107\u0012\u0004\bD\u00106\u001a\u0004\bC\u0010\u0018R\"\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u00107\u0012\u0004\bF\u00106\u001a\u0004\bE\u0010\u0018¨\u0006I"}, d2 = {"Lio/elevenlabs/data/model/response/MediaHeader;", "Lio/elevenlabs/data/model/response/ReadDetailsSection;", "Lio/elevenlabs/data/model/SizeableHeaderImage;", "image", "", "title", "author", "authorId", "", "Lio/elevenlabs/data/model/Tag;", "tags", "subtitle", "description", "metaLabel", "<init>", "(Lio/elevenlabs/data/model/SizeableHeaderImage;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lur/c1;", "serializationConstructorMarker", "(ILio/elevenlabs/data/model/SizeableHeaderImage;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lur/c1;)V", "component1", "()Lio/elevenlabs/data/model/SizeableHeaderImage;", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "()Ljava/util/List;", "component6", "component7", "component8", "copy", "(Lio/elevenlabs/data/model/SizeableHeaderImage;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/elevenlabs/data/model/response/MediaHeader;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "Ltr/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lsn/z;", "write$Self$data_release", "(Lio/elevenlabs/data/model/response/MediaHeader;Ltr/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Lio/elevenlabs/data/model/SizeableHeaderImage;", "getImage", "getImage$annotations", "()V", "Ljava/lang/String;", "getTitle", "getTitle$annotations", "getAuthor", "getAuthor$annotations", "getAuthorId", "getAuthorId$annotations", "Ljava/util/List;", "getTags", "getTags$annotations", "getSubtitle", "getSubtitle$annotations", "getDescription", "getDescription$annotations", "getMetaLabel", "getMetaLabel$annotations", "Companion", "$serializer", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
@g
/* loaded from: classes3.dex */
public final /* data */ class MediaHeader implements ReadDetailsSection {
    private final String author;
    private final String authorId;
    private final String description;
    private final SizeableHeaderImage image;
    private final String metaLabel;
    private final String subtitle;
    private final List<Tag> tags;
    private final String title;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final h[] $childSerializers = {null, null, null, null, sn.a.d(i.f31597b, new b(29)), null, null, null};

    public /* synthetic */ MediaHeader(int i10, SizeableHeaderImage sizeableHeaderImage, String str, String str2, String str3, List list, String str4, String str5, String str6, c1 c1Var) {
        if (2 == (i10 & 2)) {
            if ((i10 & 1) == 0) {
                this.image = null;
            } else {
                this.image = sizeableHeaderImage;
            }
            this.title = str;
            if ((i10 & 4) == 0) {
                this.author = null;
            } else {
                this.author = str2;
            }
            if ((i10 & 8) == 0) {
                this.authorId = null;
            } else {
                this.authorId = str3;
            }
            if ((i10 & 16) == 0) {
                this.tags = null;
            } else {
                this.tags = list;
            }
            if ((i10 & 32) == 0) {
                this.subtitle = null;
            } else {
                this.subtitle = str4;
            }
            if ((i10 & 64) == 0) {
                this.description = null;
            } else {
                this.description = str5;
            }
            if ((i10 & 128) == 0) {
                this.metaLabel = null;
                return;
            } else {
                this.metaLabel = str6;
                return;
            }
        }
        t0.j(i10, 2, MediaHeader$$serializer.INSTANCE.getDescriptor());
        throw null;
    }

    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new ur.d(Tag$$serializer.INSTANCE, 0);
    }

    public static /* synthetic */ MediaHeader copy$default(MediaHeader mediaHeader, SizeableHeaderImage sizeableHeaderImage, String str, String str2, String str3, List list, String str4, String str5, String str6, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            sizeableHeaderImage = mediaHeader.image;
        }
        if ((i10 & 2) != 0) {
            str = mediaHeader.title;
        }
        if ((i10 & 4) != 0) {
            str2 = mediaHeader.author;
        }
        if ((i10 & 8) != 0) {
            str3 = mediaHeader.authorId;
        }
        if ((i10 & 16) != 0) {
            list = mediaHeader.tags;
        }
        if ((i10 & 32) != 0) {
            str4 = mediaHeader.subtitle;
        }
        if ((i10 & 64) != 0) {
            str5 = mediaHeader.description;
        }
        if ((i10 & 128) != 0) {
            str6 = mediaHeader.metaLabel;
        }
        String str7 = str5;
        String str8 = str6;
        List list2 = list;
        String str9 = str4;
        return mediaHeader.copy(sizeableHeaderImage, str, str2, str3, list2, str9, str7, str8);
    }

    public static final /* synthetic */ void write$Self$data_release(MediaHeader self, tr.b output, SerialDescriptor serialDesc) {
        h[] hVarArr = $childSerializers;
        if (output.C(serialDesc) || self.image != null) {
            output.o(serialDesc, 0, SizeableHeaderImage$$serializer.INSTANCE, self.image);
        }
        output.V(serialDesc, 1, self.title);
        if (output.C(serialDesc) || self.author != null) {
            output.o(serialDesc, 2, g1.f34588a, self.author);
        }
        if (output.C(serialDesc) || self.authorId != null) {
            output.o(serialDesc, 3, g1.f34588a, self.authorId);
        }
        if (output.C(serialDesc) || self.tags != null) {
            output.o(serialDesc, 4, (KSerializer) hVarArr[4].getValue(), self.tags);
        }
        if (output.C(serialDesc) || self.subtitle != null) {
            output.o(serialDesc, 5, g1.f34588a, self.subtitle);
        }
        if (output.C(serialDesc) || self.description != null) {
            output.o(serialDesc, 6, g1.f34588a, self.description);
        }
        if (output.C(serialDesc) || self.metaLabel != null) {
            output.o(serialDesc, 7, g1.f34588a, self.metaLabel);
        }
    }

    /* renamed from: component1, reason: from getter */
    public final SizeableHeaderImage getImage() {
        return this.image;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final String getAuthor() {
        return this.author;
    }

    /* renamed from: component4, reason: from getter */
    public final String getAuthorId() {
        return this.authorId;
    }

    public final List<Tag> component5() {
        return this.tags;
    }

    /* renamed from: component6, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component7, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: component8, reason: from getter */
    public final String getMetaLabel() {
        return this.metaLabel;
    }

    public final MediaHeader copy(SizeableHeaderImage image, String title, String author, String authorId, List<Tag> tags, String subtitle, String description, String metaLabel) {
        title.getClass();
        return new MediaHeader(image, title, author, authorId, tags, subtitle, description, metaLabel);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MediaHeader)) {
            return false;
        }
        MediaHeader mediaHeader = (MediaHeader) other;
        if (m.c(this.image, mediaHeader.image) && m.c(this.title, mediaHeader.title) && m.c(this.author, mediaHeader.author) && m.c(this.authorId, mediaHeader.authorId) && m.c(this.tags, mediaHeader.tags) && m.c(this.subtitle, mediaHeader.subtitle) && m.c(this.description, mediaHeader.description) && m.c(this.metaLabel, mediaHeader.metaLabel)) {
            return true;
        }
        return false;
    }

    public final String getAuthor() {
        return this.author;
    }

    public final String getAuthorId() {
        return this.authorId;
    }

    public final String getDescription() {
        return this.description;
    }

    public final SizeableHeaderImage getImage() {
        return this.image;
    }

    public final String getMetaLabel() {
        return this.metaLabel;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final List<Tag> getTags() {
        return this.tags;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        SizeableHeaderImage sizeableHeaderImage = this.image;
        int i10 = 0;
        if (sizeableHeaderImage == null) {
            hashCode = 0;
        } else {
            hashCode = sizeableHeaderImage.hashCode();
        }
        int c5 = j0.c.c(hashCode * 31, 31, this.title);
        String str = this.author;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i11 = (c5 + hashCode2) * 31;
        String str2 = this.authorId;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int i12 = (i11 + hashCode3) * 31;
        List<Tag> list = this.tags;
        if (list == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = list.hashCode();
        }
        int i13 = (i12 + hashCode4) * 31;
        String str3 = this.subtitle;
        if (str3 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str3.hashCode();
        }
        int i14 = (i13 + hashCode5) * 31;
        String str4 = this.description;
        if (str4 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str4.hashCode();
        }
        int i15 = (i14 + hashCode6) * 31;
        String str5 = this.metaLabel;
        if (str5 != null) {
            i10 = str5.hashCode();
        }
        return i15 + i10;
    }

    public String toString() {
        SizeableHeaderImage sizeableHeaderImage = this.image;
        String str = this.title;
        String str2 = this.author;
        String str3 = this.authorId;
        List<Tag> list = this.tags;
        String str4 = this.subtitle;
        String str5 = this.description;
        String str6 = this.metaLabel;
        StringBuilder sb = new StringBuilder("MediaHeader(image=");
        sb.append(sizeableHeaderImage);
        sb.append(", title=");
        sb.append(str);
        sb.append(", author=");
        f.x(sb, str2, ", authorId=", str3, ", tags=");
        sb.append(list);
        sb.append(", subtitle=");
        sb.append(str4);
        sb.append(", description=");
        return f.n(sb, str5, ", metaLabel=", str6, Separators.RPAREN);
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/model/response/MediaHeader$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/model/response/MediaHeader;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
            this();
        }

        public final KSerializer serializer() {
            return MediaHeader$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public static /* synthetic */ void getAuthor$annotations() {
    }

    public static /* synthetic */ void getAuthorId$annotations() {
    }

    public static /* synthetic */ void getDescription$annotations() {
    }

    public static /* synthetic */ void getImage$annotations() {
    }

    public static /* synthetic */ void getMetaLabel$annotations() {
    }

    public static /* synthetic */ void getSubtitle$annotations() {
    }

    public static /* synthetic */ void getTags$annotations() {
    }

    public static /* synthetic */ void getTitle$annotations() {
    }

    public MediaHeader(SizeableHeaderImage sizeableHeaderImage, String str, String str2, String str3, List<Tag> list, String str4, String str5, String str6) {
        str.getClass();
        this.image = sizeableHeaderImage;
        this.title = str;
        this.author = str2;
        this.authorId = str3;
        this.tags = list;
        this.subtitle = str4;
        this.description = str5;
        this.metaLabel = str6;
    }

    public /* synthetic */ MediaHeader(SizeableHeaderImage sizeableHeaderImage, String str, String str2, String str3, List list, String str4, String str5, String str6, int i10, kotlin.jvm.internal.f fVar) {
        this((i10 & 1) != 0 ? null : sizeableHeaderImage, str, (i10 & 4) != 0 ? null : str2, (i10 & 8) != 0 ? null : str3, (i10 & 16) != 0 ? null : list, (i10 & 32) != 0 ? null : str4, (i10 & 64) != 0 ? null : str5, (i10 & 128) != 0 ? null : str6);
    }
}
