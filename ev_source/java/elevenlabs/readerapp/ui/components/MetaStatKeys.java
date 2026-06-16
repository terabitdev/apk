package io.elevenlabs.readerapp.ui.components;

import java.util.Set;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\t\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\bR\u000e\u0010\r\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lio/elevenlabs/readerapp/ui/components/MetaStatKeys;", "", "<init>", "()V", "LISTENS", "", "", "getLISTENS", "()Ljava/util/Set;", "DURATION", "getDURATION", "RATING", "getRATING", "KEY_LENGTH", "KEY_RATING", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class MetaStatKeys {
    public static final MetaStatKeys INSTANCE = new MetaStatKeys();
    private static final Set<String> LISTENS = tn.n.f1(new String[]{"listens", "plays", "play count", "listeners"});
    public static final String KEY_LENGTH = "length";
    private static final Set<String> DURATION = tn.n.f1(new String[]{KEY_LENGTH, "duration", "time"});
    public static final String KEY_RATING = "rating";
    private static final Set<String> RATING = kd.a.T(KEY_RATING);
    public static final int $stable = 8;

    private MetaStatKeys() {
    }

    public final Set<String> getDURATION() {
        return DURATION;
    }

    public final Set<String> getLISTENS() {
        return LISTENS;
    }

    public final Set<String> getRATING() {
        return RATING;
    }
}
