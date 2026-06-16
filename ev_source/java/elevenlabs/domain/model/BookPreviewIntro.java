package io.elevenlabs.domain.model;

import android.gov.nist.core.Separators;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import defpackage.f;
import io.livekit.android.rpc.RpcError;
import j0.c;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003Jc\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010%\u001a\u00020&HÖ\u0081\u0004J\n\u0010'\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000f¨\u0006("}, d2 = {"Lio/elevenlabs/domain/model/BookPreviewIntro;", "", "backgroundVideoLightUrl", "", "backgroundVideoDarkUrl", "backgroundImageLightUrl", "backgroundImageDarkUrl", "coverImageUrl", "previewUrl", DiagnosticsEntry.NAME_KEY, "author", "metadata", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBackgroundVideoLightUrl", "()Ljava/lang/String;", "getBackgroundVideoDarkUrl", "getBackgroundImageLightUrl", "getBackgroundImageDarkUrl", "getCoverImageUrl", "getPreviewUrl", "getName", "getAuthor", "getMetadata", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final /* data */ class BookPreviewIntro {
    private final String author;
    private final String backgroundImageDarkUrl;
    private final String backgroundImageLightUrl;
    private final String backgroundVideoDarkUrl;
    private final String backgroundVideoLightUrl;
    private final String coverImageUrl;
    private final String metadata;
    private final String name;
    private final String previewUrl;

    public BookPreviewIntro(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
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

    public static /* synthetic */ BookPreviewIntro copy$default(BookPreviewIntro bookPreviewIntro, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = bookPreviewIntro.backgroundVideoLightUrl;
        }
        if ((i10 & 2) != 0) {
            str2 = bookPreviewIntro.backgroundVideoDarkUrl;
        }
        if ((i10 & 4) != 0) {
            str3 = bookPreviewIntro.backgroundImageLightUrl;
        }
        if ((i10 & 8) != 0) {
            str4 = bookPreviewIntro.backgroundImageDarkUrl;
        }
        if ((i10 & 16) != 0) {
            str5 = bookPreviewIntro.coverImageUrl;
        }
        if ((i10 & 32) != 0) {
            str6 = bookPreviewIntro.previewUrl;
        }
        if ((i10 & 64) != 0) {
            str7 = bookPreviewIntro.name;
        }
        if ((i10 & 128) != 0) {
            str8 = bookPreviewIntro.author;
        }
        if ((i10 & RpcError.MAX_MESSAGE_BYTES) != 0) {
            str9 = bookPreviewIntro.metadata;
        }
        String str10 = str8;
        String str11 = str9;
        String str12 = str6;
        String str13 = str7;
        String str14 = str5;
        String str15 = str3;
        return bookPreviewIntro.copy(str, str2, str15, str4, str14, str12, str13, str10, str11);
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

    public final BookPreviewIntro copy(String backgroundVideoLightUrl, String backgroundVideoDarkUrl, String backgroundImageLightUrl, String backgroundImageDarkUrl, String coverImageUrl, String previewUrl, String name, String author, String metadata) {
        c.v(backgroundVideoLightUrl, backgroundVideoDarkUrl, backgroundImageLightUrl, backgroundImageDarkUrl, coverImageUrl);
        previewUrl.getClass();
        name.getClass();
        author.getClass();
        metadata.getClass();
        return new BookPreviewIntro(backgroundVideoLightUrl, backgroundVideoDarkUrl, backgroundImageLightUrl, backgroundImageDarkUrl, coverImageUrl, previewUrl, name, author, metadata);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BookPreviewIntro)) {
            return false;
        }
        BookPreviewIntro bookPreviewIntro = (BookPreviewIntro) other;
        if (m.c(this.backgroundVideoLightUrl, bookPreviewIntro.backgroundVideoLightUrl) && m.c(this.backgroundVideoDarkUrl, bookPreviewIntro.backgroundVideoDarkUrl) && m.c(this.backgroundImageLightUrl, bookPreviewIntro.backgroundImageLightUrl) && m.c(this.backgroundImageDarkUrl, bookPreviewIntro.backgroundImageDarkUrl) && m.c(this.coverImageUrl, bookPreviewIntro.coverImageUrl) && m.c(this.previewUrl, bookPreviewIntro.previewUrl) && m.c(this.name, bookPreviewIntro.name) && m.c(this.author, bookPreviewIntro.author) && m.c(this.metadata, bookPreviewIntro.metadata)) {
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
        StringBuilder s10 = f.s("BookPreviewIntro(backgroundVideoLightUrl=", str, ", backgroundVideoDarkUrl=", str2, ", backgroundImageLightUrl=");
        f.x(s10, str3, ", backgroundImageDarkUrl=", str4, ", coverImageUrl=");
        f.x(s10, str5, ", previewUrl=", str6, ", name=");
        f.x(s10, str7, ", author=", str8, ", metadata=");
        return f.l(str9, Separators.RPAREN, s10);
    }
}
