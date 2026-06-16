package io.livekit.android.room;

import android.content.Context;
import fr.z;
import ho.l;
import io.livekit.android.audio.AudioHandler;
import io.livekit.android.audio.AudioProcessingController;
import io.livekit.android.audio.AudioRecordPrewarmer;
import io.livekit.android.audio.CommunicationWorkaround;
import io.livekit.android.e2ee.E2EEManager;
import io.livekit.android.memory.CloseableManager;
import io.livekit.android.room.RegionUrlProvider;
import io.livekit.android.room.datastream.incoming.IncomingDataStreamManager;
import io.livekit.android.room.participant.LocalParticipant;
import io.livekit.android.room.participant.RemoteParticipant;
import io.livekit.android.room.provisions.LKObjects;
import io.livekit.android.room.util.ConnectionWarmer;
import livekit.org.webrtc.EglBase;
import livekit.org.webrtc.audio.AudioDeviceModule;
import rn.a;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* renamed from: io.livekit.android.room.Room_Factory, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0063Room_Factory {
    private final a audioDeviceModuleProvider;
    private final a audioHandlerProvider;
    private final a audioProcessingControllerProvider;
    private final a audioRecordPrewarmerProvider;
    private final a closeableManagerProvider;
    private final a communicationWorkaroundProvider;
    private final a connectionWarmerProvider;
    private final a defaultDispatcherProvider;
    private final a defaultsManagerProvider;
    private final a e2EEManagerFactoryProvider;
    private final a eglBaseProvider;
    private final a engineProvider;
    private final a incomingDataStreamManagerProvider;
    private final a ioDispatcherProvider;
    private final a lkObjectsProvider;
    private final a localParticipantFactoryProvider;
    private final a networkCallbackManagerFactoryProvider;
    private final a regionUrlProviderFactoryProvider;
    private final a remoteParticipantFactoryProvider;

    public C0063Room_Factory(a aVar, a aVar2, a aVar3, a aVar4, a aVar5, a aVar6, a aVar7, a aVar8, a aVar9, a aVar10, a aVar11, a aVar12, a aVar13, a aVar14, a aVar15, a aVar16, a aVar17, a aVar18, a aVar19) {
        this.engineProvider = aVar;
        this.eglBaseProvider = aVar2;
        this.localParticipantFactoryProvider = aVar3;
        this.defaultsManagerProvider = aVar4;
        this.defaultDispatcherProvider = aVar5;
        this.ioDispatcherProvider = aVar6;
        this.audioHandlerProvider = aVar7;
        this.closeableManagerProvider = aVar8;
        this.e2EEManagerFactoryProvider = aVar9;
        this.communicationWorkaroundProvider = aVar10;
        this.audioProcessingControllerProvider = aVar11;
        this.lkObjectsProvider = aVar12;
        this.networkCallbackManagerFactoryProvider = aVar13;
        this.audioDeviceModuleProvider = aVar14;
        this.regionUrlProviderFactoryProvider = aVar15;
        this.connectionWarmerProvider = aVar16;
        this.audioRecordPrewarmerProvider = aVar17;
        this.incomingDataStreamManagerProvider = aVar18;
        this.remoteParticipantFactoryProvider = aVar19;
    }

    public static C0063Room_Factory create(a aVar, a aVar2, a aVar3, a aVar4, a aVar5, a aVar6, a aVar7, a aVar8, a aVar9, a aVar10, a aVar11, a aVar12, a aVar13, a aVar14, a aVar15, a aVar16, a aVar17, a aVar18, a aVar19) {
        return new C0063Room_Factory(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10, aVar11, aVar12, aVar13, aVar14, aVar15, aVar16, aVar17, aVar18, aVar19);
    }

    public static Room newInstance(Context context, RTCEngine rTCEngine, EglBase eglBase, LocalParticipant.Factory factory, DefaultsManager defaultsManager, z zVar, z zVar2, AudioHandler audioHandler, CloseableManager closeableManager, E2EEManager.Factory factory2, CommunicationWorkaround communicationWorkaround, AudioProcessingController audioProcessingController, LKObjects lKObjects, l lVar, AudioDeviceModule audioDeviceModule, RegionUrlProvider.Factory factory3, ConnectionWarmer connectionWarmer, AudioRecordPrewarmer audioRecordPrewarmer, IncomingDataStreamManager incomingDataStreamManager, RemoteParticipant.Factory factory4) {
        return new Room(context, rTCEngine, eglBase, factory, defaultsManager, zVar, zVar2, audioHandler, closeableManager, factory2, communicationWorkaround, audioProcessingController, lKObjects, lVar, audioDeviceModule, factory3, connectionWarmer, audioRecordPrewarmer, incomingDataStreamManager, factory4);
    }

    public Room get(Context context) {
        return newInstance(context, (RTCEngine) this.engineProvider.get(), (EglBase) this.eglBaseProvider.get(), (LocalParticipant.Factory) this.localParticipantFactoryProvider.get(), (DefaultsManager) this.defaultsManagerProvider.get(), (z) this.defaultDispatcherProvider.get(), (z) this.ioDispatcherProvider.get(), (AudioHandler) this.audioHandlerProvider.get(), (CloseableManager) this.closeableManagerProvider.get(), (E2EEManager.Factory) this.e2EEManagerFactoryProvider.get(), (CommunicationWorkaround) this.communicationWorkaroundProvider.get(), (AudioProcessingController) this.audioProcessingControllerProvider.get(), (LKObjects) this.lkObjectsProvider.get(), (l) this.networkCallbackManagerFactoryProvider.get(), (AudioDeviceModule) this.audioDeviceModuleProvider.get(), (RegionUrlProvider.Factory) this.regionUrlProviderFactoryProvider.get(), (ConnectionWarmer) this.connectionWarmerProvider.get(), (AudioRecordPrewarmer) this.audioRecordPrewarmerProvider.get(), (IncomingDataStreamManager) this.incomingDataStreamManagerProvider.get(), (RemoteParticipant.Factory) this.remoteParticipantFactoryProvider.get());
    }
}
