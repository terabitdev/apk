package io.livekit.android.room.participant;

import fr.z;
import io.livekit.android.room.SignalClient;
import io.livekit.android.room.track.RemoteAudioTrack;
import io.livekit.android.room.track.RemoteVideoTrack;
import livekit.LivekitModels$ParticipantInfo;
import rn.a;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* renamed from: io.livekit.android.room.participant.RemoteParticipant_Factory, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0065RemoteParticipant_Factory {
    private final a audioTrackFactoryProvider;
    private final a defaultDispatcherProvider;
    private final a ioDispatcherProvider;
    private final a signalClientProvider;
    private final a videoTrackFactoryProvider;

    public C0065RemoteParticipant_Factory(a aVar, a aVar2, a aVar3, a aVar4, a aVar5) {
        this.signalClientProvider = aVar;
        this.ioDispatcherProvider = aVar2;
        this.defaultDispatcherProvider = aVar3;
        this.audioTrackFactoryProvider = aVar4;
        this.videoTrackFactoryProvider = aVar5;
    }

    public static C0065RemoteParticipant_Factory create(a aVar, a aVar2, a aVar3, a aVar4, a aVar5) {
        return new C0065RemoteParticipant_Factory(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static RemoteParticipant newInstance(LivekitModels$ParticipantInfo livekitModels$ParticipantInfo, SignalClient signalClient, z zVar, z zVar2, RemoteAudioTrack.Factory factory, RemoteVideoTrack.Factory factory2) {
        return new RemoteParticipant(livekitModels$ParticipantInfo, signalClient, zVar, zVar2, factory, factory2);
    }

    public RemoteParticipant get(LivekitModels$ParticipantInfo livekitModels$ParticipantInfo) {
        return newInstance(livekitModels$ParticipantInfo, (SignalClient) this.signalClientProvider.get(), (z) this.ioDispatcherProvider.get(), (z) this.defaultDispatcherProvider.get(), (RemoteAudioTrack.Factory) this.audioTrackFactoryProvider.get(), (RemoteVideoTrack.Factory) this.videoTrackFactoryProvider.get());
    }
}
