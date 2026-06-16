package io.livekit.android.room.participant;

import io.livekit.android.room.participant.LocalParticipant;
import rn.a;
import ul.d;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final class LocalParticipant_Factory_Impl implements LocalParticipant.Factory {
    private final C0064LocalParticipant_Factory delegateFactory;

    public LocalParticipant_Factory_Impl(C0064LocalParticipant_Factory c0064LocalParticipant_Factory) {
        this.delegateFactory = c0064LocalParticipant_Factory;
    }

    public static a create(C0064LocalParticipant_Factory c0064LocalParticipant_Factory) {
        return d.a(new LocalParticipant_Factory_Impl(c0064LocalParticipant_Factory));
    }

    @Override // io.livekit.android.room.participant.LocalParticipant.Factory
    public LocalParticipant create(boolean z6) {
        return this.delegateFactory.get(z6);
    }
}
