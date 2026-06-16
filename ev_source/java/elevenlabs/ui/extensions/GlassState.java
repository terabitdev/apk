package io.elevenlabs.ui.extensions;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import vl.n;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lio/elevenlabs/ui/extensions/GlassState;", "", "Lvl/n;", "hazeState", "<init>", "(Lvl/n;)V", "Lvl/n;", "getHazeState$ui_release", "()Lvl/n;", "ui_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class GlassState {
    public static final int $stable = 0;
    private final n hazeState;

    public GlassState(n nVar) {
        nVar.getClass();
        this.hazeState = nVar;
    }

    /* renamed from: getHazeState$ui_release, reason: from getter */
    public final n getHazeState() {
        return this.hazeState;
    }
}
