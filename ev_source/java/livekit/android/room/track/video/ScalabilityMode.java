package io.livekit.android.room.track.video;

import com.google.protobuf.c6;
import defpackage.f;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;
import tn.c0;
import wq.i;
import wq.l;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0017"}, d2 = {"Lio/livekit/android/room/track/video/ScalabilityMode;", "", "spatial", "", "temporal", "suffix", "", "(IILjava/lang/String;)V", "getSpatial", "()I", "getSuffix", "()Ljava/lang/String;", "getTemporal", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "Companion", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final /* data */ class ScalabilityMode {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final l REGEX = new l("L(\\d)T(\\d)(h|_KEY|_KEY_SHIFT)?");
    private final int spatial;
    private final String suffix;
    private final int temporal;

    public ScalabilityMode(int i10, int i11, String str) {
        str.getClass();
        this.spatial = i10;
        this.temporal = i11;
        this.suffix = str;
    }

    public static /* synthetic */ ScalabilityMode copy$default(ScalabilityMode scalabilityMode, int i10, int i11, String str, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = scalabilityMode.spatial;
        }
        if ((i12 & 2) != 0) {
            i11 = scalabilityMode.temporal;
        }
        if ((i12 & 4) != 0) {
            str = scalabilityMode.suffix;
        }
        return scalabilityMode.copy(i10, i11, str);
    }

    /* renamed from: component1, reason: from getter */
    public final int getSpatial() {
        return this.spatial;
    }

    /* renamed from: component2, reason: from getter */
    public final int getTemporal() {
        return this.temporal;
    }

    /* renamed from: component3, reason: from getter */
    public final String getSuffix() {
        return this.suffix;
    }

    public final ScalabilityMode copy(int spatial, int temporal, String suffix) {
        suffix.getClass();
        return new ScalabilityMode(spatial, temporal, suffix);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ScalabilityMode)) {
            return false;
        }
        ScalabilityMode scalabilityMode = (ScalabilityMode) other;
        if (this.spatial == scalabilityMode.spatial && this.temporal == scalabilityMode.temporal && m.c(this.suffix, scalabilityMode.suffix)) {
            return true;
        }
        return false;
    }

    public final int getSpatial() {
        return this.spatial;
    }

    public final String getSuffix() {
        return this.suffix;
    }

    public final int getTemporal() {
        return this.temporal;
    }

    public int hashCode() {
        return this.suffix.hashCode() + j0.c.b(this.temporal, Integer.hashCode(this.spatial) * 31, 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ScalabilityMode(spatial=");
        sb.append(this.spatial);
        sb.append(", temporal=");
        sb.append(this.temporal);
        sb.append(", suffix=");
        return f.m(sb, this.suffix, ')');
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lio/livekit/android/room/track/video/ScalabilityMode$Companion;", "", "<init>", "()V", "", "mode", "Lio/livekit/android/room/track/video/ScalabilityMode;", "parseFromString", "(Ljava/lang/String;)Lio/livekit/android/room/track/video/ScalabilityMode;", "Lwq/l;", "REGEX", "Lwq/l;", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
            this();
        }

        public final ScalabilityMode parseFromString(String mode) {
            mode.getClass();
            i d10 = ScalabilityMode.REGEX.d(mode);
            if (d10 != null) {
                String str = (String) ((c0) d10.a()).get(1);
                String str2 = (String) ((c0) d10.a()).get(2);
                return new ScalabilityMode(Integer.parseInt(str), Integer.parseInt(str2), (String) ((c0) d10.a()).get(3));
            }
            c6.t("can't parse scalability mode: ".concat(mode));
            return null;
        }

        private Companion() {
        }
    }
}
