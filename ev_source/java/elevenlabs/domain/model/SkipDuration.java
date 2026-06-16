package io.elevenlabs.domain.model;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import rd.c1;
import zn.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lio/elevenlabs/domain/model/SkipDuration;", "", "seconds", "", "<init>", "(Ljava/lang/String;II)V", "getSeconds", "()I", "SECONDS_15", "SECONDS_30", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class SkipDuration {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ SkipDuration[] $VALUES;
    public static final SkipDuration SECONDS_15 = new SkipDuration("SECONDS_15", 0, 15);
    public static final SkipDuration SECONDS_30 = new SkipDuration("SECONDS_30", 1, 30);
    private final int seconds;

    private static final /* synthetic */ SkipDuration[] $values() {
        return new SkipDuration[]{SECONDS_15, SECONDS_30};
    }

    static {
        SkipDuration[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c1.q($values);
    }

    private SkipDuration(String str, int i10, int i11) {
        this.seconds = i11;
    }

    public static a getEntries() {
        return $ENTRIES;
    }

    public static SkipDuration valueOf(String str) {
        return (SkipDuration) Enum.valueOf(SkipDuration.class, str);
    }

    public static SkipDuration[] values() {
        return (SkipDuration[]) $VALUES.clone();
    }

    public final int getSeconds() {
        return this.seconds;
    }
}
