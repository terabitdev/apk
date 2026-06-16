package io.livekit.android.room.participant;

import io.livekit.android.room.participant.RemoteParticipant;
import livekit.LivekitModels$ParticipantInfo;
import rn.a;
import ul.d;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final class RemoteParticipant_Factory_Impl implements RemoteParticipant.Factory {
    private final C0065RemoteParticipant_Factory delegateFactory;

    public RemoteParticipant_Factory_Impl(C0065RemoteParticipant_Factory c0065RemoteParticipant_Factory) {
        this.delegateFactory = c0065RemoteParticipant_Factory;
    }

    public static a create(C0065RemoteParticipant_Factory c0065RemoteParticipant_Factory) {
        return d.a(new RemoteParticipant_Factory_Impl(c0065RemoteParticipant_Factory));
    }

    @Override // io.livekit.android.room.participant.RemoteParticipant.Factory
    public RemoteParticipant create(LivekitModels$ParticipantInfo livekitModels$ParticipantInfo) {
        return this.delegateFactory.get(livekitModels$ParticipantInfo);
    }
}
