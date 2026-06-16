package io.livekit.android.room;

import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import livekit.LivekitInternal$NodeStats;
import qr.g;
import sn.c;
import tr.b;
import ur.c1;
import ur.t0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+*B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB7\b\u0011\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ(\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011HÁ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ.\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0018J\u0010\u0010\u001f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b'\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b)\u0010\u001b¨\u0006,"}, d2 = {"Lio/livekit/android/room/RegionInfo;", "", "", "region", "url", "", "distance", "<init>", "(Ljava/lang/String;Ljava/lang/String;J)V", "", "seen1", "Lur/c1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;JLur/c1;)V", "self", "Ltr/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lsn/z;", "write$Self$livekit_android_sdk_release", "(Lio/livekit/android/room/RegionInfo;Ltr/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()J", "copy", "(Ljava/lang/String;Ljava/lang/String;J)Lio/livekit/android/room/RegionInfo;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getRegion", "getUrl", "J", "getDistance", "Companion", "$serializer", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
@g
/* loaded from: classes4.dex */
public final /* data */ class RegionInfo {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final long distance;
    private final String region;
    private final String url;

    @c
    public /* synthetic */ RegionInfo(int i10, String str, String str2, long j4, c1 c1Var) {
        if (7 == (i10 & 7)) {
            this.region = str;
            this.url = str2;
            this.distance = j4;
            return;
        }
        t0.j(i10, 7, RegionInfo$$serializer.INSTANCE.getDescriptor());
        throw null;
    }

    public static /* synthetic */ RegionInfo copy$default(RegionInfo regionInfo, String str, String str2, long j4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = regionInfo.region;
        }
        if ((i10 & 2) != 0) {
            str2 = regionInfo.url;
        }
        if ((i10 & 4) != 0) {
            j4 = regionInfo.distance;
        }
        return regionInfo.copy(str, str2, j4);
    }

    public static final /* synthetic */ void write$Self$livekit_android_sdk_release(RegionInfo self, b output, SerialDescriptor serialDesc) {
        output.V(serialDesc, 0, self.region);
        output.V(serialDesc, 1, self.url);
        output.h0(serialDesc, 2, self.distance);
    }

    /* renamed from: component1, reason: from getter */
    public final String getRegion() {
        return this.region;
    }

    /* renamed from: component2, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* renamed from: component3, reason: from getter */
    public final long getDistance() {
        return this.distance;
    }

    public final RegionInfo copy(String region, String url, long distance) {
        region.getClass();
        url.getClass();
        return new RegionInfo(region, url, distance);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RegionInfo)) {
            return false;
        }
        RegionInfo regionInfo = (RegionInfo) other;
        if (m.c(this.region, regionInfo.region) && m.c(this.url, regionInfo.url) && this.distance == regionInfo.distance) {
            return true;
        }
        return false;
    }

    public final long getDistance() {
        return this.distance;
    }

    public final String getRegion() {
        return this.region;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return Long.hashCode(this.distance) + j0.c.c(this.region.hashCode() * 31, 31, this.url);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("RegionInfo(region=");
        sb.append(this.region);
        sb.append(", url=");
        sb.append(this.url);
        sb.append(", distance=");
        return com.google.android.gms.internal.play_billing.b.m(sb, this.distance, ')');
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lio/livekit/android/room/RegionInfo$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/livekit/android/room/RegionInfo;", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final KSerializer serializer() {
            return RegionInfo$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public RegionInfo(String str, String str2, long j4) {
        str.getClass();
        str2.getClass();
        this.region = str;
        this.url = str2;
        this.distance = j4;
    }
}
