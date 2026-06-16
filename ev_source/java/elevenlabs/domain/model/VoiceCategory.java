package io.elevenlabs.domain.model;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import rd.c1;
import zn.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lio/elevenlabs/domain/model/VoiceCategory;", "", "<init>", "(Ljava/lang/String;I)V", "Premade", "Famous", "User", "Community", "Generated", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class VoiceCategory {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ VoiceCategory[] $VALUES;
    public static final VoiceCategory Premade = new VoiceCategory("Premade", 0);
    public static final VoiceCategory Famous = new VoiceCategory("Famous", 1);
    public static final VoiceCategory User = new VoiceCategory("User", 2);
    public static final VoiceCategory Community = new VoiceCategory("Community", 3);
    public static final VoiceCategory Generated = new VoiceCategory("Generated", 4);

    private static final /* synthetic */ VoiceCategory[] $values() {
        return new VoiceCategory[]{Premade, Famous, User, Community, Generated};
    }

    static {
        VoiceCategory[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c1.q($values);
    }

    private VoiceCategory(String str, int i10) {
    }

    public static a getEntries() {
        return $ENTRIES;
    }

    public static VoiceCategory valueOf(String str) {
        return (VoiceCategory) Enum.valueOf(VoiceCategory.class, str);
    }

    public static VoiceCategory[] values() {
        return (VoiceCategory[]) $VALUES.clone();
    }
}
