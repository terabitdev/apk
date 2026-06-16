package io.livekit.android.room;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import rd.c1;
import zn.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0014"}, d2 = {"Lio/livekit/android/room/ProtocolVersion;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "v1", "v2", "v3", "v4", "v5", "v6", "v7", "v8", "v9", "v10", "v11", "v12", "v13", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ProtocolVersion {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ ProtocolVersion[] $VALUES;
    private final int value;

    /* renamed from: v1, reason: collision with root package name */
    public static final ProtocolVersion f17800v1 = new ProtocolVersion("v1", 0, 1);

    /* renamed from: v2, reason: collision with root package name */
    public static final ProtocolVersion f17801v2 = new ProtocolVersion("v2", 1, 2);

    /* renamed from: v3, reason: collision with root package name */
    public static final ProtocolVersion f17802v3 = new ProtocolVersion("v3", 2, 3);

    /* renamed from: v4, reason: collision with root package name */
    public static final ProtocolVersion f17803v4 = new ProtocolVersion("v4", 3, 4);

    /* renamed from: v5, reason: collision with root package name */
    public static final ProtocolVersion f17804v5 = new ProtocolVersion("v5", 4, 5);

    /* renamed from: v6, reason: collision with root package name */
    public static final ProtocolVersion f17805v6 = new ProtocolVersion("v6", 5, 6);

    /* renamed from: v7, reason: collision with root package name */
    public static final ProtocolVersion f17806v7 = new ProtocolVersion("v7", 6, 7);

    /* renamed from: v8, reason: collision with root package name */
    public static final ProtocolVersion f17807v8 = new ProtocolVersion("v8", 7, 8);
    public static final ProtocolVersion v9 = new ProtocolVersion("v9", 8, 9);
    public static final ProtocolVersion v10 = new ProtocolVersion("v10", 9, 10);
    public static final ProtocolVersion v11 = new ProtocolVersion("v11", 10, 11);
    public static final ProtocolVersion v12 = new ProtocolVersion("v12", 11, 12);
    public static final ProtocolVersion v13 = new ProtocolVersion("v13", 12, 13);

    private static final /* synthetic */ ProtocolVersion[] $values() {
        return new ProtocolVersion[]{f17800v1, f17801v2, f17802v3, f17803v4, f17804v5, f17805v6, f17806v7, f17807v8, v9, v10, v11, v12, v13};
    }

    static {
        ProtocolVersion[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c1.q($values);
    }

    private ProtocolVersion(String str, int i10, int i11) {
        this.value = i11;
    }

    public static a getEntries() {
        return $ENTRIES;
    }

    public static ProtocolVersion valueOf(String str) {
        return (ProtocolVersion) Enum.valueOf(ProtocolVersion.class, str);
    }

    public static ProtocolVersion[] values() {
        return (ProtocolVersion[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }
}
