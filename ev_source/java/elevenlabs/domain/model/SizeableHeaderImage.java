package io.elevenlabs.domain.model;

import android.gov.nist.core.Separators;
import com.google.android.gms.internal.play_billing.b;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 !2\u00020\u0001:\u0001!B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0012JB\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u001aJ\u0014\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001e\u001a\u00020\u001fHÖ\u0081\u0004J\n\u0010 \u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0015\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012¨\u0006\""}, d2 = {"Lio/elevenlabs/domain/model/SizeableHeaderImage;", "", "imageUrl", "", "aspectRatio", "", "screenWidthRatio", "maxWidth", "cornerRadius", "<init>", "(Ljava/lang/String;FFFLjava/lang/Float;)V", "getImageUrl", "()Ljava/lang/String;", "getAspectRatio", "()F", "getScreenWidthRatio", "getMaxWidth", "getCornerRadius", "()Ljava/lang/Float;", "Ljava/lang/Float;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;FFFLjava/lang/Float;)Lio/elevenlabs/domain/model/SizeableHeaderImage;", "equals", "", "other", "hashCode", "", "toString", "Companion", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final /* data */ class SizeableHeaderImage {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final float aspectRatio;
    private final Float cornerRadius;
    private final String imageUrl;
    private final float maxWidth;
    private final float screenWidthRatio;

    public /* synthetic */ SizeableHeaderImage(String str, float f10, float f11, float f12, Float f13, int i10, f fVar) {
        this(str, f10, f11, (i10 & 8) != 0 ? Float.MAX_VALUE : f12, (i10 & 16) != 0 ? null : f13);
    }

    public static /* synthetic */ SizeableHeaderImage copy$default(SizeableHeaderImage sizeableHeaderImage, String str, float f10, float f11, float f12, Float f13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = sizeableHeaderImage.imageUrl;
        }
        if ((i10 & 2) != 0) {
            f10 = sizeableHeaderImage.aspectRatio;
        }
        if ((i10 & 4) != 0) {
            f11 = sizeableHeaderImage.screenWidthRatio;
        }
        if ((i10 & 8) != 0) {
            f12 = sizeableHeaderImage.maxWidth;
        }
        if ((i10 & 16) != 0) {
            f13 = sizeableHeaderImage.cornerRadius;
        }
        Float f14 = f13;
        float f15 = f11;
        return sizeableHeaderImage.copy(str, f10, f15, f12, f14);
    }

    /* renamed from: component1, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* renamed from: component2, reason: from getter */
    public final float getAspectRatio() {
        return this.aspectRatio;
    }

    /* renamed from: component3, reason: from getter */
    public final float getScreenWidthRatio() {
        return this.screenWidthRatio;
    }

    /* renamed from: component4, reason: from getter */
    public final float getMaxWidth() {
        return this.maxWidth;
    }

    /* renamed from: component5, reason: from getter */
    public final Float getCornerRadius() {
        return this.cornerRadius;
    }

    public final SizeableHeaderImage copy(String imageUrl, float aspectRatio, float screenWidthRatio, float maxWidth, Float cornerRadius) {
        imageUrl.getClass();
        return new SizeableHeaderImage(imageUrl, aspectRatio, screenWidthRatio, maxWidth, cornerRadius);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SizeableHeaderImage)) {
            return false;
        }
        SizeableHeaderImage sizeableHeaderImage = (SizeableHeaderImage) other;
        if (m.c(this.imageUrl, sizeableHeaderImage.imageUrl) && Float.compare(this.aspectRatio, sizeableHeaderImage.aspectRatio) == 0 && Float.compare(this.screenWidthRatio, sizeableHeaderImage.screenWidthRatio) == 0 && Float.compare(this.maxWidth, sizeableHeaderImage.maxWidth) == 0 && m.c(this.cornerRadius, sizeableHeaderImage.cornerRadius)) {
            return true;
        }
        return false;
    }

    public final float getAspectRatio() {
        return this.aspectRatio;
    }

    public final Float getCornerRadius() {
        return this.cornerRadius;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final float getMaxWidth() {
        return this.maxWidth;
    }

    public final float getScreenWidthRatio() {
        return this.screenWidthRatio;
    }

    public int hashCode() {
        int hashCode;
        int c5 = b.c(this.maxWidth, b.c(this.screenWidthRatio, b.c(this.aspectRatio, this.imageUrl.hashCode() * 31, 31), 31), 31);
        Float f10 = this.cornerRadius;
        if (f10 == null) {
            hashCode = 0;
        } else {
            hashCode = f10.hashCode();
        }
        return c5 + hashCode;
    }

    public String toString() {
        return "SizeableHeaderImage(imageUrl=" + this.imageUrl + ", aspectRatio=" + this.aspectRatio + ", screenWidthRatio=" + this.screenWidthRatio + ", maxWidth=" + this.maxWidth + ", cornerRadius=" + this.cornerRadius + Separators.RPAREN;
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t¨\u0006\n"}, d2 = {"Lio/elevenlabs/domain/model/SizeableHeaderImage$Companion;", "", "<init>", "()V", "create", "Lio/elevenlabs/domain/model/SizeableHeaderImage;", "imageUrl", "", "isBookType", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final SizeableHeaderImage create(String imageUrl, boolean isBookType) {
            float f10;
            float f11;
            float f12;
            float f13;
            imageUrl.getClass();
            if (isBookType) {
                f10 = 0.6666667f;
            } else {
                f10 = 1.0f;
            }
            float f14 = f10;
            if (isBookType) {
                f11 = 0.4f;
            } else {
                f11 = 0.6f;
            }
            float f15 = f11;
            if (isBookType) {
                f12 = 220.0f;
            } else {
                f12 = 300.0f;
            }
            float f16 = f12;
            if (isBookType) {
                f13 = 8.0f;
            } else {
                f13 = 12.0f;
            }
            return new SizeableHeaderImage(imageUrl, f14, f15, f16, Float.valueOf(f13));
        }

        private Companion() {
        }
    }

    public SizeableHeaderImage(String str, float f10, float f11, float f12, Float f13) {
        str.getClass();
        this.imageUrl = str;
        this.aspectRatio = f10;
        this.screenWidthRatio = f11;
        this.maxWidth = f12;
        this.cornerRadius = f13;
    }
}
