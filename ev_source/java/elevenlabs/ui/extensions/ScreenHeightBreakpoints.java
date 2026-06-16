package io.elevenlabs.ui.extensions;

import android.gov.nist.javax.sip.parser.TokenNames;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\b¨\u0006\u000b"}, d2 = {"Lio/elevenlabs/ui/extensions/ScreenHeightBreakpoints;", "", "<init>", "()V", "Lh5/f;", "Compact", TokenNames.F, "getCompact-D9Ej5fM", "()F", "Medium", "getMedium-D9Ej5fM", "ui_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ScreenHeightBreakpoints {
    public static final int $stable = 0;
    public static final ScreenHeightBreakpoints INSTANCE = new ScreenHeightBreakpoints();
    private static final float Compact = 640;
    private static final float Medium = 800;

    private ScreenHeightBreakpoints() {
    }

    /* renamed from: getCompact-D9Ej5fM, reason: not valid java name */
    public final float m1983getCompactD9Ej5fM() {
        return Compact;
    }

    /* renamed from: getMedium-D9Ej5fM, reason: not valid java name */
    public final float m1984getMediumD9Ej5fM() {
        return Medium;
    }
}
