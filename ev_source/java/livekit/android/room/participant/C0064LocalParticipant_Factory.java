package io.livekit.android.room.participant;

import android.content.Context;
import fr.z;
import ho.l;
import io.livekit.android.room.DefaultsManager;
import io.livekit.android.room.RTCEngine;
import io.livekit.android.room.datastream.outgoing.OutgoingDataStreamManager;
import io.livekit.android.room.track.LocalAudioTrack;
import io.livekit.android.room.track.LocalScreencastVideoTrack;
import io.livekit.android.room.track.LocalVideoTrack;
import livekit.org.webrtc.EglBase;
import livekit.org.webrtc.PeerConnectionFactory;
import rn.a;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* renamed from: io.livekit.android.room.participant.LocalParticipant_Factory, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0064LocalParticipant_Factory {
    private final a audioTrackFactoryProvider;
    private final a capabilitiesGetterProvider;
    private final a contextProvider;
    private final a coroutineDispatcherProvider;
    private final a defaultsManagerProvider;
    private final a eglBaseProvider;
    private final a engineProvider;
    private final a outgoingDataStreamManagerProvider;
    private final a peerConnectionFactoryProvider;
    private final a screencastVideoTrackFactoryProvider;
    private final a videoTrackFactoryProvider;

    public C0064LocalParticipant_Factory(a aVar, a aVar2, a aVar3, a aVar4, a aVar5, a aVar6, a aVar7, a aVar8, a aVar9, a aVar10, a aVar11) {
        this.engineProvider = aVar;
        this.peerConnectionFactoryProvider = aVar2;
        this.contextProvider = aVar3;
        this.eglBaseProvider = aVar4;
        this.screencastVideoTrackFactoryProvider = aVar5;
        this.videoTrackFactoryProvider = aVar6;
        this.audioTrackFactoryProvider = aVar7;
        this.defaultsManagerProvider = aVar8;
        this.coroutineDispatcherProvider = aVar9;
        this.capabilitiesGetterProvider = aVar10;
        this.outgoingDataStreamManagerProvider = aVar11;
    }

    public static C0064LocalParticipant_Factory create(a aVar, a aVar2, a aVar3, a aVar4, a aVar5, a aVar6, a aVar7, a aVar8, a aVar9, a aVar10, a aVar11) {
        return new C0064LocalParticipant_Factory(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10, aVar11);
    }

    public static LocalParticipant newInstance(boolean z6, RTCEngine rTCEngine, PeerConnectionFactory peerConnectionFactory, Context context, EglBase eglBase, LocalScreencastVideoTrack.Factory factory, LocalVideoTrack.Factory factory2, LocalAudioTrack.Factory factory3, DefaultsManager defaultsManager, z zVar, l lVar, OutgoingDataStreamManager outgoingDataStreamManager) {
        return new LocalParticipant(z6, rTCEngine, peerConnectionFactory, context, eglBase, factory, factory2, factory3, defaultsManager, zVar, lVar, outgoingDataStreamManager);
    }

    public LocalParticipant get(boolean z6) {
        return newInstance(z6, (RTCEngine) this.engineProvider.get(), (PeerConnectionFactory) this.peerConnectionFactoryProvider.get(), (Context) this.contextProvider.get(), (EglBase) this.eglBaseProvider.get(), (LocalScreencastVideoTrack.Factory) this.screencastVideoTrackFactoryProvider.get(), (LocalVideoTrack.Factory) this.videoTrackFactoryProvider.get(), (LocalAudioTrack.Factory) this.audioTrackFactoryProvider.get(), (DefaultsManager) this.defaultsManagerProvider.get(), (z) this.coroutineDispatcherProvider.get(), (l) this.capabilitiesGetterProvider.get(), (OutgoingDataStreamManager) this.outgoingDataStreamManagerProvider.get());
    }
}
