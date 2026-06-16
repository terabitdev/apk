package io.elevenlabs.player;

import io.elevenlabs.domain.services.player.AssistantTriggerEvent;
import ir.i;
import ir.i1;
import ir.k1;
import ir.q1;
import ir.r;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lio/elevenlabs/player/AssistantTriggerEmitter;", "", "<init>", "()V", "Lio/elevenlabs/domain/services/player/AssistantTriggerEvent;", "event", "Lsn/z;", "emit", "(Lio/elevenlabs/domain/services/player/AssistantTriggerEvent;)V", "Lir/i1;", "_triggerFlow", "Lir/i1;", "Lir/i;", "triggerFlow", "Lir/i;", "getTriggerFlow", "()Lir/i;", "player_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class AssistantTriggerEmitter {
    private final i1 _triggerFlow;
    private final i triggerFlow;

    public AssistantTriggerEmitter() {
        q1 b10 = r.b(0, 1, null, 5);
        this._triggerFlow = b10;
        this.triggerFlow = new k1(b10);
    }

    public final void emit(AssistantTriggerEvent event) {
        event.getClass();
        this._triggerFlow.tryEmit(event);
    }

    public final i getTriggerFlow() {
        return this.triggerFlow;
    }
}
