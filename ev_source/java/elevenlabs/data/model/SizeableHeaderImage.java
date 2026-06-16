package io.elevenlabs.data.model;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import livekit.LivekitInternal$NodeStats;
import qr.g;
import sn.h;
import sn.i;
import tr.b;
import ur.c1;
import ur.t0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u0000 62\u00020\u0001:\u000276B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\nBM\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001cJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001cJF\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u001aJ\u0010\u0010#\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010)\u0012\u0004\b+\u0010,\u001a\u0004\b*\u0010\u001aR \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010-\u0012\u0004\b/\u0010,\u001a\u0004\b.\u0010\u001cR \u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010-\u0012\u0004\b1\u0010,\u001a\u0004\b0\u0010\u001cR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010-\u0012\u0004\b3\u0010,\u001a\u0004\b2\u0010\u001cR\"\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010-\u0012\u0004\b5\u0010,\u001a\u0004\b4\u0010\u001c¨\u00068"}, d2 = {"Lio/elevenlabs/data/model/SizeableHeaderImage;", "", "", "imageUrl", "Lio/elevenlabs/data/model/BigDecimalJson;", "aspectRatio", "screenWidthRatio", "maxWidth", "cornerRadius", "<init>", "(Ljava/lang/String;Lio/elevenlabs/data/model/BigDecimalJson;Lio/elevenlabs/data/model/BigDecimalJson;Lio/elevenlabs/data/model/BigDecimalJson;Lio/elevenlabs/data/model/BigDecimalJson;)V", "", "seen0", "Lur/c1;", "serializationConstructorMarker", "(ILjava/lang/String;Lio/elevenlabs/data/model/BigDecimalJson;Lio/elevenlabs/data/model/BigDecimalJson;Lio/elevenlabs/data/model/BigDecimalJson;Lio/elevenlabs/data/model/BigDecimalJson;Lur/c1;)V", "self", "Ltr/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lsn/z;", "write$Self$data_release", "(Lio/elevenlabs/data/model/SizeableHeaderImage;Ltr/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lio/elevenlabs/data/model/BigDecimalJson;", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Lio/elevenlabs/data/model/BigDecimalJson;Lio/elevenlabs/data/model/BigDecimalJson;Lio/elevenlabs/data/model/BigDecimalJson;Lio/elevenlabs/data/model/BigDecimalJson;)Lio/elevenlabs/data/model/SizeableHeaderImage;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getImageUrl", "getImageUrl$annotations", "()V", "Lio/elevenlabs/data/model/BigDecimalJson;", "getAspectRatio", "getAspectRatio$annotations", "getScreenWidthRatio", "getScreenWidthRatio$annotations", "getMaxWidth", "getMaxWidth$annotations", "getCornerRadius", "getCornerRadius$annotations", "Companion", "$serializer", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
@g
/* loaded from: classes3.dex */
public final /* data */ class SizeableHeaderImage {
    private static final h[] $childSerializers;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final BigDecimalJson aspectRatio;
    private final BigDecimalJson cornerRadius;
    private final String imageUrl;
    private final BigDecimalJson maxWidth;
    private final BigDecimalJson screenWidthRatio;

    static {
        io.elevenlabs.data.database.entities.reads.a aVar = new io.elevenlabs.data.database.entities.reads.a(23);
        i iVar = i.f31597b;
        $childSerializers = new h[]{null, sn.a.d(iVar, aVar), sn.a.d(iVar, new io.elevenlabs.data.database.entities.reads.a(24)), sn.a.d(iVar, new io.elevenlabs.data.database.entities.reads.a(25)), sn.a.d(iVar, new io.elevenlabs.data.database.entities.reads.a(26))};
    }

    public /* synthetic */ SizeableHeaderImage(int i10, String str, BigDecimalJson bigDecimalJson, BigDecimalJson bigDecimalJson2, BigDecimalJson bigDecimalJson3, BigDecimalJson bigDecimalJson4, c1 c1Var) {
        if (7 == (i10 & 7)) {
            this.imageUrl = str;
            this.aspectRatio = bigDecimalJson;
            this.screenWidthRatio = bigDecimalJson2;
            if ((i10 & 8) == 0) {
                this.maxWidth = null;
            } else {
                this.maxWidth = bigDecimalJson3;
            }
            if ((i10 & 16) == 0) {
                this.cornerRadius = null;
                return;
            } else {
                this.cornerRadius = bigDecimalJson4;
                return;
            }
        }
        t0.j(i10, 7, SizeableHeaderImage$$serializer.INSTANCE.getDescriptor());
        throw null;
    }

    public static final KSerializer _childSerializers$_anonymous_() {
        return new qr.a(e0.f20562a.b(BigDecimalJson.class), BigDecimalJson.INSTANCE.serializer(), new KSerializer[0]);
    }

    public static final KSerializer _childSerializers$_anonymous_$0() {
        return new qr.a(e0.f20562a.b(BigDecimalJson.class), BigDecimalJson.INSTANCE.serializer(), new KSerializer[0]);
    }

    public static final KSerializer _childSerializers$_anonymous_$1() {
        return new qr.a(e0.f20562a.b(BigDecimalJson.class), rd.c1.w(BigDecimalJson.INSTANCE.serializer()), new KSerializer[0]);
    }

    public static final KSerializer _childSerializers$_anonymous_$2() {
        return new qr.a(e0.f20562a.b(BigDecimalJson.class), rd.c1.w(BigDecimalJson.INSTANCE.serializer()), new KSerializer[0]);
    }

    public static /* synthetic */ SizeableHeaderImage copy$default(SizeableHeaderImage sizeableHeaderImage, String str, BigDecimalJson bigDecimalJson, BigDecimalJson bigDecimalJson2, BigDecimalJson bigDecimalJson3, BigDecimalJson bigDecimalJson4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = sizeableHeaderImage.imageUrl;
        }
        if ((i10 & 2) != 0) {
            bigDecimalJson = sizeableHeaderImage.aspectRatio;
        }
        if ((i10 & 4) != 0) {
            bigDecimalJson2 = sizeableHeaderImage.screenWidthRatio;
        }
        if ((i10 & 8) != 0) {
            bigDecimalJson3 = sizeableHeaderImage.maxWidth;
        }
        if ((i10 & 16) != 0) {
            bigDecimalJson4 = sizeableHeaderImage.cornerRadius;
        }
        BigDecimalJson bigDecimalJson5 = bigDecimalJson4;
        BigDecimalJson bigDecimalJson6 = bigDecimalJson2;
        return sizeableHeaderImage.copy(str, bigDecimalJson, bigDecimalJson6, bigDecimalJson3, bigDecimalJson5);
    }

    public static final /* synthetic */ void write$Self$data_release(SizeableHeaderImage self, b output, SerialDescriptor serialDesc) {
        h[] hVarArr = $childSerializers;
        output.V(serialDesc, 0, self.imageUrl);
        output.g(serialDesc, 1, (KSerializer) hVarArr[1].getValue(), self.aspectRatio);
        output.g(serialDesc, 2, (KSerializer) hVarArr[2].getValue(), self.screenWidthRatio);
        if (output.C(serialDesc) || self.maxWidth != null) {
            output.o(serialDesc, 3, (KSerializer) hVarArr[3].getValue(), self.maxWidth);
        }
        if (output.C(serialDesc) || self.cornerRadius != null) {
            output.o(serialDesc, 4, (KSerializer) hVarArr[4].getValue(), self.cornerRadius);
        }
    }

    /* renamed from: component1, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* renamed from: component2, reason: from getter */
    public final BigDecimalJson getAspectRatio() {
        return this.aspectRatio;
    }

    /* renamed from: component3, reason: from getter */
    public final BigDecimalJson getScreenWidthRatio() {
        return this.screenWidthRatio;
    }

    /* renamed from: component4, reason: from getter */
    public final BigDecimalJson getMaxWidth() {
        return this.maxWidth;
    }

    /* renamed from: component5, reason: from getter */
    public final BigDecimalJson getCornerRadius() {
        return this.cornerRadius;
    }

    public final SizeableHeaderImage copy(String imageUrl, BigDecimalJson aspectRatio, BigDecimalJson screenWidthRatio, BigDecimalJson maxWidth, BigDecimalJson cornerRadius) {
        imageUrl.getClass();
        aspectRatio.getClass();
        screenWidthRatio.getClass();
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
        if (m.c(this.imageUrl, sizeableHeaderImage.imageUrl) && m.c(this.aspectRatio, sizeableHeaderImage.aspectRatio) && m.c(this.screenWidthRatio, sizeableHeaderImage.screenWidthRatio) && m.c(this.maxWidth, sizeableHeaderImage.maxWidth) && m.c(this.cornerRadius, sizeableHeaderImage.cornerRadius)) {
            return true;
        }
        return false;
    }

    public final BigDecimalJson getAspectRatio() {
        return this.aspectRatio;
    }

    public final BigDecimalJson getCornerRadius() {
        return this.cornerRadius;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final BigDecimalJson getMaxWidth() {
        return this.maxWidth;
    }

    public final BigDecimalJson getScreenWidthRatio() {
        return this.screenWidthRatio;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = (this.screenWidthRatio.hashCode() + ((this.aspectRatio.hashCode() + (this.imageUrl.hashCode() * 31)) * 31)) * 31;
        BigDecimalJson bigDecimalJson = this.maxWidth;
        int i10 = 0;
        if (bigDecimalJson == null) {
            hashCode = 0;
        } else {
            hashCode = bigDecimalJson.hashCode();
        }
        int i11 = (hashCode2 + hashCode) * 31;
        BigDecimalJson bigDecimalJson2 = this.cornerRadius;
        if (bigDecimalJson2 != null) {
            i10 = bigDecimalJson2.hashCode();
        }
        return i11 + i10;
    }

    public String toString() {
        return "SizeableHeaderImage(imageUrl=" + this.imageUrl + ", aspectRatio=" + this.aspectRatio + ", screenWidthRatio=" + this.screenWidthRatio + ", maxWidth=" + this.maxWidth + ", cornerRadius=" + this.cornerRadius + Separators.RPAREN;
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/model/SizeableHeaderImage$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/model/SizeableHeaderImage;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final KSerializer serializer() {
            return SizeableHeaderImage$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public static /* synthetic */ void getAspectRatio$annotations() {
    }

    public static /* synthetic */ void getCornerRadius$annotations() {
    }

    public static /* synthetic */ void getImageUrl$annotations() {
    }

    public static /* synthetic */ void getMaxWidth$annotations() {
    }

    public static /* synthetic */ void getScreenWidthRatio$annotations() {
    }

    public SizeableHeaderImage(String str, BigDecimalJson bigDecimalJson, BigDecimalJson bigDecimalJson2, BigDecimalJson bigDecimalJson3, BigDecimalJson bigDecimalJson4) {
        str.getClass();
        bigDecimalJson.getClass();
        bigDecimalJson2.getClass();
        this.imageUrl = str;
        this.aspectRatio = bigDecimalJson;
        this.screenWidthRatio = bigDecimalJson2;
        this.maxWidth = bigDecimalJson3;
        this.cornerRadius = bigDecimalJson4;
    }

    public /* synthetic */ SizeableHeaderImage(String str, BigDecimalJson bigDecimalJson, BigDecimalJson bigDecimalJson2, BigDecimalJson bigDecimalJson3, BigDecimalJson bigDecimalJson4, int i10, f fVar) {
        this(str, bigDecimalJson, bigDecimalJson2, (i10 & 8) != 0 ? null : bigDecimalJson3, (i10 & 16) != 0 ? null : bigDecimalJson4);
    }
}
