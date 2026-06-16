package io.elevenlabs.data.model;

import android.gov.nist.core.Separators;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import defpackage.f;
import io.livekit.android.rpc.RpcError;
import j0.c;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import livekit.LivekitInternal$NodeStats;
import qr.g;
import tr.b;
import ur.c1;
import ur.t0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0087\b\u0018\u0000 C2\u00020\u0001:\u0002DCBO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rBu\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0014J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0014J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0014J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0014J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0014J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0014J\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0014Jj\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0014J\u0010\u0010 \u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%J'\u0010.\u001a\u00020+2\u0006\u0010&\u001a\u00020\u00002\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)H\u0001¢\u0006\u0004\b,\u0010-R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010/\u0012\u0004\b1\u00102\u001a\u0004\b0\u0010\u0014R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010/\u0012\u0004\b4\u00102\u001a\u0004\b3\u0010\u0014R \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010/\u0012\u0004\b6\u00102\u001a\u0004\b5\u0010\u0014R \u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010/\u0012\u0004\b8\u00102\u001a\u0004\b7\u0010\u0014R \u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010/\u0012\u0004\b:\u00102\u001a\u0004\b9\u0010\u0014R \u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010/\u0012\u0004\b<\u00102\u001a\u0004\b;\u0010\u0014R \u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010/\u0012\u0004\b>\u00102\u001a\u0004\b=\u0010\u0014R \u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010/\u0012\u0004\b@\u00102\u001a\u0004\b?\u0010\u0014R \u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010/\u0012\u0004\bB\u00102\u001a\u0004\bA\u0010\u0014¨\u0006E"}, d2 = {"Lio/elevenlabs/data/model/BookPreviewIntroModel;", "", "", "backgroundVideoLightUrl", "backgroundVideoDarkUrl", "backgroundImageLightUrl", "backgroundImageDarkUrl", "coverImageUrl", "previewUrl", DiagnosticsEntry.NAME_KEY, "author", "metadata", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lur/c1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lur/c1;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/elevenlabs/data/model/BookPreviewIntroModel;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "Ltr/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lsn/z;", "write$Self$data_release", "(Lio/elevenlabs/data/model/BookPreviewIntroModel;Ltr/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getBackgroundVideoLightUrl", "getBackgroundVideoLightUrl$annotations", "()V", "getBackgroundVideoDarkUrl", "getBackgroundVideoDarkUrl$annotations", "getBackgroundImageLightUrl", "getBackgroundImageLightUrl$annotations", "getBackgroundImageDarkUrl", "getBackgroundImageDarkUrl$annotations", "getCoverImageUrl", "getCoverImageUrl$annotations", "getPreviewUrl", "getPreviewUrl$annotations", "getName", "getName$annotations", "getAuthor", "getAuthor$annotations", "getMetadata", "getMetadata$annotations", "Companion", "$serializer", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
@g
/* loaded from: classes3.dex */
public final /* data */ class BookPreviewIntroModel {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String author;
    private final String backgroundImageDarkUrl;
    private final String backgroundImageLightUrl;
    private final String backgroundVideoDarkUrl;
    private final String backgroundVideoLightUrl;
    private final String coverImageUrl;
    private final String metadata;
    private final String name;
    private final String previewUrl;

    public /* synthetic */ BookPreviewIntroModel(int i10, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, c1 c1Var) {
        if (511 == (i10 & 511)) {
            this.backgroundVideoLightUrl = str;
            this.backgroundVideoDarkUrl = str2;
            this.backgroundImageLightUrl = str3;
            this.backgroundImageDarkUrl = str4;
            this.coverImageUrl = str5;
            this.previewUrl = str6;
            this.name = str7;
            this.author = str8;
            this.metadata = str9;
            return;
        }
        t0.j(i10, 511, BookPreviewIntroModel$$serializer.INSTANCE.getDescriptor());
        throw null;
    }

    public static /* synthetic */ BookPreviewIntroModel copy$default(BookPreviewIntroModel bookPreviewIntroModel, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = bookPreviewIntroModel.backgroundVideoLightUrl;
        }
        if ((i10 & 2) != 0) {
            str2 = bookPreviewIntroModel.backgroundVideoDarkUrl;
        }
        if ((i10 & 4) != 0) {
            str3 = bookPreviewIntroModel.backgroundImageLightUrl;
        }
        if ((i10 & 8) != 0) {
            str4 = bookPreviewIntroModel.backgroundImageDarkUrl;
        }
        if ((i10 & 16) != 0) {
            str5 = bookPreviewIntroModel.coverImageUrl;
        }
        if ((i10 & 32) != 0) {
            str6 = bookPreviewIntroModel.previewUrl;
        }
        if ((i10 & 64) != 0) {
            str7 = bookPreviewIntroModel.name;
        }
        if ((i10 & 128) != 0) {
            str8 = bookPreviewIntroModel.author;
        }
        if ((i10 & RpcError.MAX_MESSAGE_BYTES) != 0) {
            str9 = bookPreviewIntroModel.metadata;
        }
        String str10 = str8;
        String str11 = str9;
        String str12 = str6;
        String str13 = str7;
        String str14 = str5;
        String str15 = str3;
        return bookPreviewIntroModel.copy(str, str2, str15, str4, str14, str12, str13, str10, str11);
    }

    public static final /* synthetic */ void write$Self$data_release(BookPreviewIntroModel self, b output, SerialDescriptor serialDesc) {
        output.V(serialDesc, 0, self.backgroundVideoLightUrl);
        output.V(serialDesc, 1, self.backgroundVideoDarkUrl);
        output.V(serialDesc, 2, self.backgroundImageLightUrl);
        output.V(serialDesc, 3, self.backgroundImageDarkUrl);
        output.V(serialDesc, 4, self.coverImageUrl);
        output.V(serialDesc, 5, self.previewUrl);
        output.V(serialDesc, 6, self.name);
        output.V(serialDesc, 7, self.author);
        output.V(serialDesc, 8, self.metadata);
    }

    /* renamed from: component1, reason: from getter */
    public final String getBackgroundVideoLightUrl() {
        return this.backgroundVideoLightUrl;
    }

    /* renamed from: component2, reason: from getter */
    public final String getBackgroundVideoDarkUrl() {
        return this.backgroundVideoDarkUrl;
    }

    /* renamed from: component3, reason: from getter */
    public final String getBackgroundImageLightUrl() {
        return this.backgroundImageLightUrl;
    }

    /* renamed from: component4, reason: from getter */
    public final String getBackgroundImageDarkUrl() {
        return this.backgroundImageDarkUrl;
    }

    /* renamed from: component5, reason: from getter */
    public final String getCoverImageUrl() {
        return this.coverImageUrl;
    }

    /* renamed from: component6, reason: from getter */
    public final String getPreviewUrl() {
        return this.previewUrl;
    }

    /* renamed from: component7, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component8, reason: from getter */
    public final String getAuthor() {
        return this.author;
    }

    /* renamed from: component9, reason: from getter */
    public final String getMetadata() {
        return this.metadata;
    }

    public final BookPreviewIntroModel copy(String backgroundVideoLightUrl, String backgroundVideoDarkUrl, String backgroundImageLightUrl, String backgroundImageDarkUrl, String coverImageUrl, String previewUrl, String name, String author, String metadata) {
        c.v(backgroundVideoLightUrl, backgroundVideoDarkUrl, backgroundImageLightUrl, backgroundImageDarkUrl, coverImageUrl);
        previewUrl.getClass();
        name.getClass();
        author.getClass();
        metadata.getClass();
        return new BookPreviewIntroModel(backgroundVideoLightUrl, backgroundVideoDarkUrl, backgroundImageLightUrl, backgroundImageDarkUrl, coverImageUrl, previewUrl, name, author, metadata);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BookPreviewIntroModel)) {
            return false;
        }
        BookPreviewIntroModel bookPreviewIntroModel = (BookPreviewIntroModel) other;
        if (m.c(this.backgroundVideoLightUrl, bookPreviewIntroModel.backgroundVideoLightUrl) && m.c(this.backgroundVideoDarkUrl, bookPreviewIntroModel.backgroundVideoDarkUrl) && m.c(this.backgroundImageLightUrl, bookPreviewIntroModel.backgroundImageLightUrl) && m.c(this.backgroundImageDarkUrl, bookPreviewIntroModel.backgroundImageDarkUrl) && m.c(this.coverImageUrl, bookPreviewIntroModel.coverImageUrl) && m.c(this.previewUrl, bookPreviewIntroModel.previewUrl) && m.c(this.name, bookPreviewIntroModel.name) && m.c(this.author, bookPreviewIntroModel.author) && m.c(this.metadata, bookPreviewIntroModel.metadata)) {
            return true;
        }
        return false;
    }

    public final String getAuthor() {
        return this.author;
    }

    public final String getBackgroundImageDarkUrl() {
        return this.backgroundImageDarkUrl;
    }

    public final String getBackgroundImageLightUrl() {
        return this.backgroundImageLightUrl;
    }

    public final String getBackgroundVideoDarkUrl() {
        return this.backgroundVideoDarkUrl;
    }

    public final String getBackgroundVideoLightUrl() {
        return this.backgroundVideoLightUrl;
    }

    public final String getCoverImageUrl() {
        return this.coverImageUrl;
    }

    public final String getMetadata() {
        return this.metadata;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPreviewUrl() {
        return this.previewUrl;
    }

    public int hashCode() {
        return this.metadata.hashCode() + c.c(c.c(c.c(c.c(c.c(c.c(c.c(this.backgroundVideoLightUrl.hashCode() * 31, 31, this.backgroundVideoDarkUrl), 31, this.backgroundImageLightUrl), 31, this.backgroundImageDarkUrl), 31, this.coverImageUrl), 31, this.previewUrl), 31, this.name), 31, this.author);
    }

    public String toString() {
        String str = this.backgroundVideoLightUrl;
        String str2 = this.backgroundVideoDarkUrl;
        String str3 = this.backgroundImageLightUrl;
        String str4 = this.backgroundImageDarkUrl;
        String str5 = this.coverImageUrl;
        String str6 = this.previewUrl;
        String str7 = this.name;
        String str8 = this.author;
        String str9 = this.metadata;
        StringBuilder s10 = f.s("BookPreviewIntroModel(backgroundVideoLightUrl=", str, ", backgroundVideoDarkUrl=", str2, ", backgroundImageLightUrl=");
        f.x(s10, str3, ", backgroundImageDarkUrl=", str4, ", coverImageUrl=");
        f.x(s10, str5, ", previewUrl=", str6, ", name=");
        f.x(s10, str7, ", author=", str8, ", metadata=");
        return f.l(str9, Separators.RPAREN, s10);
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/model/BookPreviewIntroModel$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/model/BookPreviewIntroModel;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
            this();
        }

        public final KSerializer serializer() {
            return BookPreviewIntroModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public static /* synthetic */ void getAuthor$annotations() {
    }

    public static /* synthetic */ void getBackgroundImageDarkUrl$annotations() {
    }

    public static /* synthetic */ void getBackgroundImageLightUrl$annotations() {
    }

    public static /* synthetic */ void getBackgroundVideoDarkUrl$annotations() {
    }

    public static /* synthetic */ void getBackgroundVideoLightUrl$annotations() {
    }

    public static /* synthetic */ void getCoverImageUrl$annotations() {
    }

    public static /* synthetic */ void getMetadata$annotations() {
    }

    public static /* synthetic */ void getName$annotations() {
    }

    public static /* synthetic */ void getPreviewUrl$annotations() {
    }

    public BookPreviewIntroModel(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        c.v(str, str2, str3, str4, str5);
        c.u(str6, str7, str8, str9);
        this.backgroundVideoLightUrl = str;
        this.backgroundVideoDarkUrl = str2;
        this.backgroundImageLightUrl = str3;
        this.backgroundImageDarkUrl = str4;
        this.coverImageUrl = str5;
        this.previewUrl = str6;
        this.name = str7;
        this.author = str8;
        this.metadata = str9;
    }
}
