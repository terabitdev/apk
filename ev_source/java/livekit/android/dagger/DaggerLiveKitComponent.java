package io.livekit.android.dagger;

import android.content.Context;
import io.livekit.android.audio.AudioSwitchHandler_Factory;
import io.livekit.android.audio.CommunicationWorkaroundImpl_Factory;
import io.livekit.android.dagger.LiveKitComponent;
import io.livekit.android.e2ee.C0060E2EEManager_Factory;
import io.livekit.android.e2ee.E2EEManager_Factory_Impl;
import io.livekit.android.room.C0061PeerConnectionTransport_Factory;
import io.livekit.android.room.C0062RegionUrlProvider_Factory;
import io.livekit.android.room.C0063Room_Factory;
import io.livekit.android.room.DefaultsManager_Factory;
import io.livekit.android.room.PeerConnectionTransport_Factory_Impl;
import io.livekit.android.room.RTCEngine_Factory;
import io.livekit.android.room.RegionUrlProvider_Factory_Impl;
import io.livekit.android.room.Room;
import io.livekit.android.room.Room_Factory_Impl;
import io.livekit.android.room.SignalClient_Factory;
import io.livekit.android.room.datastream.incoming.IncomingDataStreamManagerImpl_Factory;
import io.livekit.android.room.datastream.outgoing.OutgoingDataStreamManagerImpl_Factory;
import io.livekit.android.room.participant.C0064LocalParticipant_Factory;
import io.livekit.android.room.participant.C0065RemoteParticipant_Factory;
import io.livekit.android.room.participant.LocalParticipant_Factory_Impl;
import io.livekit.android.room.participant.RemoteParticipant_Factory_Impl;
import io.livekit.android.room.provisions.LKObjects_Factory;
import io.livekit.android.room.track.C0066LocalAudioTrack_Factory;
import io.livekit.android.room.track.C0067LocalScreencastVideoTrack_Factory;
import io.livekit.android.room.track.C0068LocalVideoTrack_Factory;
import io.livekit.android.room.track.C0069RemoteAudioTrack_Factory;
import io.livekit.android.room.track.C0070RemoteVideoTrack_Factory;
import io.livekit.android.room.track.LocalAudioTrack_Factory_Impl;
import io.livekit.android.room.track.LocalScreencastVideoTrack_Factory_Impl;
import io.livekit.android.room.track.LocalVideoTrack_Factory_Impl;
import io.livekit.android.room.track.RemoteAudioTrack_Factory_Impl;
import io.livekit.android.room.track.RemoteVideoTrack_Factory_Impl;
import io.livekit.android.room.util.OkHttpConnectionWarmer_Factory;
import livekit.org.webrtc.EglBase;
import livekit.org.webrtc.PeerConnectionFactory;
import ul.b;
import ul.d;
import ul.f;
import ul.g;
import ul.h;
import w7.n;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final class DaggerLiveKitComponent {

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    /* loaded from: classes4.dex */
    public static final class Factory implements LiveKitComponent.Factory {
        private Factory() {
        }

        @Override // io.livekit.android.dagger.LiveKitComponent.Factory
        public LiveKitComponent create(Context context, OverridesModule overridesModule) {
            context.getClass();
            overridesModule.getClass();
            return new LiveKitComponentImpl(overridesModule, context);
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    /* loaded from: classes4.dex */
    public static final class LiveKitComponentImpl implements LiveKitComponent {
        private rn.a appContextProvider;
        private rn.a audioDeviceModuleProvider;
        private rn.a audioHandlerProvider;
        private rn.a audioHandlerProvider2;
        private rn.a audioModuleProvider;
        private rn.a audioOutputAttributesProvider;
        private rn.a audioOutputTypeProvider;
        private rn.a audioOutputTypeProvider2;
        private rn.a audioPrewarmerProvider;
        private rn.a audioProcessingControllerProvider;
        private rn.a audioProcessingFactoryProvider;
        private rn.a audioProcessorOptionsProvider;
        private rn.a audioSwitchHandlerProvider;
        private rn.a closeableManagerProvider;
        private rn.a communicationWorkaroundImplProvider;
        private rn.a communicationWorkaroundProvider;
        private rn.a connectionWarmerProvider;
        private rn.a connectivityManagerProvider;
        private rn.a customAudioProcessingFactoryProvider;
        private rn.a defaultsManagerProvider;
        private rn.a disableCommunicationWorkAroundProvider;
        private C0060E2EEManager_Factory e2EEManagerProvider;
        private rn.a eglBaseProvider;
        private rn.a eglBaseProvider2;
        private rn.a eglContextProvider;
        private rn.a factoryProvider;
        private rn.a factoryProvider10;
        private rn.a factoryProvider11;
        private rn.a factoryProvider2;
        private rn.a factoryProvider3;
        private rn.a factoryProvider4;
        private rn.a factoryProvider5;
        private rn.a factoryProvider6;
        private rn.a factoryProvider7;
        private rn.a factoryProvider8;
        private rn.a factoryProvider9;
        private rn.a javaAudioDeviceModuleCustomizerProvider;
        private rn.a kotlinSerializationJsonProvider;
        private rn.a lKObjectsProvider;
        private rn.a libWebrtcInitializationProvider;
        private final LiveKitComponentImpl liveKitComponentImpl;
        private rn.a localAudioBufferCallbackDispatcherProvider;
        private rn.a localAudioSamplesDispatcherProvider;
        private C0066LocalAudioTrack_Factory localAudioTrackProvider;
        private C0064LocalParticipant_Factory localParticipantProvider;
        private C0067LocalScreencastVideoTrack_Factory localScreencastVideoTrackProvider;
        private C0068LocalVideoTrack_Factory localVideoTrackProvider;
        private rn.a networkCallbackManagerFactoryProvider;
        private rn.a networkCallbackRegistrarProvider;
        private rn.a networkInfoProvider;
        private rn.a okHttpClientProvider;
        private rn.a okHttpClientProvider2;
        private rn.a okHttpConnectionWarmerProvider;
        private rn.a outgoingDataStreamManagerImplProvider;
        private rn.a peerConnectionFactoryManagerProvider;
        private rn.a peerConnectionFactoryOptionsProvider;
        private rn.a peerConnectionFactoryProvider;
        private C0061PeerConnectionTransport_Factory peerConnectionTransportProvider;
        private rn.a rTCEngineProvider;
        private C0062RegionUrlProvider_Factory regionUrlProvider;
        private C0069RemoteAudioTrack_Factory remoteAudioTrackProvider;
        private C0065RemoteParticipant_Factory remoteParticipantProvider;
        private C0070RemoteVideoTrack_Factory remoteVideoTrackProvider;
        private C0063Room_Factory roomProvider;
        private rn.a rtcThreadTokenProvider;
        private rn.a senderCapabilitiesGetterProvider;
        private rn.a signalClientProvider;
        private rn.a videoDecoderFactoryProvider;
        private rn.a videoDecoderFactoryProvider2;
        private rn.a videoEncoderFactoryProvider;
        private rn.a videoEncoderFactoryProvider2;
        private rn.a websocketFactoryProvider;

        private LiveKitComponentImpl(OverridesModule overridesModule, Context context) {
            this.liveKitComponentImpl = this;
            initialize(overridesModule, context);
        }

        /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, rn.a] */
        private void initialize(OverridesModule overridesModule, Context context) {
            f gVar;
            OverridesModule_OkHttpClientFactory create = OverridesModule_OkHttpClientFactory.create(overridesModule);
            this.okHttpClientProvider = create;
            f b10 = b.b(WebModule_OkHttpClientFactory.create(create));
            this.okHttpClientProvider2 = b10;
            this.websocketFactoryProvider = WebModule_WebsocketFactoryFactory.create(b10);
            JsonFormatModule_KotlinSerializationJsonFactory create2 = JsonFormatModule_KotlinSerializationJsonFactory.create();
            create2.getClass();
            this.kotlinSerializationJsonProvider = h.a(create2);
            d a10 = d.a(context);
            this.appContextProvider = a10;
            WebModule_NetworkInfoFactory create3 = WebModule_NetworkInfoFactory.create(a10);
            create3.getClass();
            this.networkInfoProvider = h.a(create3);
            this.signalClientProvider = b.b(SignalClient_Factory.create(this.websocketFactoryProvider, this.kotlinSerializationJsonProvider, this.okHttpClientProvider2, CoroutinesModule_IoDispatcherFactory.create(), this.networkInfoProvider));
            this.libWebrtcInitializationProvider = b.b(RTCModule_LibWebrtcInitializationFactory.create(this.appContextProvider));
            this.audioDeviceModuleProvider = OverridesModule_AudioDeviceModuleFactory.create(overridesModule);
            this.javaAudioDeviceModuleCustomizerProvider = OverridesModule_JavaAudioDeviceModuleCustomizerFactory.create(overridesModule);
            OverridesModule_AudioOutputTypeFactory create4 = OverridesModule_AudioOutputTypeFactory.create(overridesModule);
            this.audioOutputTypeProvider = create4;
            AudioHandlerModule_AudioOutputTypeFactory create5 = AudioHandlerModule_AudioOutputTypeFactory.create(create4);
            this.audioOutputTypeProvider2 = create5;
            this.audioOutputAttributesProvider = AudioHandlerModule_AudioOutputAttributesFactory.create(create5);
            this.closeableManagerProvider = b.b(MemoryModule_CloseableManagerFactory.create());
            this.disableCommunicationWorkAroundProvider = OverridesModule_DisableCommunicationWorkAroundFactory.create(overridesModule);
            f b11 = b.b(CommunicationWorkaroundImpl_Factory.create(CoroutinesModule_IoDispatcherFactory.create()));
            this.communicationWorkaroundImplProvider = b11;
            this.communicationWorkaroundProvider = b.b(AudioHandlerModule_CommunicationWorkaroundFactory.create(this.disableCommunicationWorkAroundProvider, this.audioOutputTypeProvider2, this.closeableManagerProvider, b11));
            this.localAudioSamplesDispatcherProvider = b.b(RTCModule_LocalAudioSamplesDispatcherFactory.create());
            f b12 = b.b(RTCModule_LocalAudioBufferCallbackDispatcherFactory.create());
            this.localAudioBufferCallbackDispatcherProvider = b12;
            this.audioModuleProvider = b.b(RTCModule_AudioModuleFactory.create(this.audioDeviceModuleProvider, this.javaAudioDeviceModuleCustomizerProvider, this.audioOutputAttributesProvider, this.appContextProvider, this.closeableManagerProvider, this.communicationWorkaroundProvider, this.localAudioSamplesDispatcherProvider, b12));
            OverridesModule_EglBaseFactory create6 = OverridesModule_EglBaseFactory.create(overridesModule);
            this.eglBaseProvider = create6;
            f b13 = b.b(RTCModule_EglBaseFactory.create(create6, this.closeableManagerProvider));
            this.eglBaseProvider2 = b13;
            this.eglContextProvider = RTCModule_EglContextFactory.create(b13);
            this.videoEncoderFactoryProvider = OverridesModule_VideoEncoderFactoryFactory.create(overridesModule);
            this.videoEncoderFactoryProvider2 = RTCModule_VideoEncoderFactoryFactory.create(this.libWebrtcInitializationProvider, RTCModule_VideoHwAccelFactory.create(), this.eglContextProvider, this.videoEncoderFactoryProvider);
            this.videoDecoderFactoryProvider = OverridesModule_VideoDecoderFactoryFactory.create(overridesModule);
            this.videoDecoderFactoryProvider2 = RTCModule_VideoDecoderFactoryFactory.create(this.libWebrtcInitializationProvider, RTCModule_VideoHwAccelFactory.create(), this.eglContextProvider, this.videoDecoderFactoryProvider);
            this.peerConnectionFactoryOptionsProvider = OverridesModule_PeerConnectionFactoryOptionsFactory.create(overridesModule);
            OverridesModule_AudioProcessorOptionsFactory create7 = OverridesModule_AudioProcessorOptionsFactory.create(overridesModule);
            this.audioProcessorOptionsProvider = create7;
            f b14 = b.b(RTCModule_CustomAudioProcessingFactoryFactory.create(this.libWebrtcInitializationProvider, create7));
            this.customAudioProcessingFactoryProvider = b14;
            RTCModule_AudioProcessingFactoryFactory create8 = RTCModule_AudioProcessingFactoryFactory.create(b14);
            this.audioProcessingFactoryProvider = create8;
            f b15 = b.b(RTCModule_PeerConnectionFactoryManagerFactory.create(this.libWebrtcInitializationProvider, this.audioModuleProvider, this.videoEncoderFactoryProvider2, this.videoDecoderFactoryProvider2, this.peerConnectionFactoryOptionsProvider, this.closeableManagerProvider, create8));
            this.peerConnectionFactoryManagerProvider = b15;
            this.peerConnectionFactoryProvider = b.b(RTCModule_PeerConnectionFactoryFactory.create(b15));
            RTCModule_RtcThreadTokenFactory create9 = RTCModule_RtcThreadTokenFactory.create(this.peerConnectionFactoryManagerProvider);
            create9.getClass();
            this.rtcThreadTokenProvider = h.a(create9);
            C0061PeerConnectionTransport_Factory create10 = C0061PeerConnectionTransport_Factory.create(CoroutinesModule_IoDispatcherFactory.create(), this.peerConnectionFactoryProvider, RTCModule_SdpFactoryFactory.create(), this.rtcThreadTokenProvider);
            this.peerConnectionTransportProvider = create10;
            rn.a create11 = PeerConnectionTransport_Factory_Impl.create(create10);
            this.factoryProvider = create11;
            this.rTCEngineProvider = b.b(RTCEngine_Factory.create(this.signalClientProvider, create11, CoroutinesModule_IoDispatcherFactory.create(), this.rtcThreadTokenProvider, RTCModule_DataPacketCryptorManagerFactoryFactory.create()));
            f b16 = b.b(DefaultsManager_Factory.create());
            this.defaultsManagerProvider = b16;
            ?? obj = new Object();
            this.factoryProvider2 = obj;
            C0068LocalVideoTrack_Factory create12 = C0068LocalVideoTrack_Factory.create(this.peerConnectionFactoryProvider, this.appContextProvider, this.eglBaseProvider2, b16, obj, this.rtcThreadTokenProvider);
            this.localVideoTrackProvider = create12;
            rn.a aVar = this.factoryProvider2;
            rn.a create13 = LocalVideoTrack_Factory_Impl.create(create12);
            ul.a aVar2 = (ul.a) aVar;
            create13.getClass();
            if (create13 instanceof f) {
                gVar = (f) create13;
            } else {
                gVar = new g(create13);
            }
            if (aVar2.f34375a == null) {
                aVar2.f34375a = gVar;
                C0067LocalScreencastVideoTrack_Factory create14 = C0067LocalScreencastVideoTrack_Factory.create(this.peerConnectionFactoryProvider, this.appContextProvider, this.eglBaseProvider2, this.defaultsManagerProvider, this.factoryProvider2, this.rtcThreadTokenProvider);
                this.localScreencastVideoTrackProvider = create14;
                this.factoryProvider3 = LocalScreencastVideoTrack_Factory_Impl.create(create14);
                this.audioProcessingControllerProvider = RTCModule_AudioProcessingControllerFactory.create(this.customAudioProcessingFactoryProvider);
                this.audioPrewarmerProvider = RTCModule_AudioPrewarmerFactory.create(this.audioModuleProvider);
                C0066LocalAudioTrack_Factory create15 = C0066LocalAudioTrack_Factory.create(this.audioProcessingControllerProvider, CoroutinesModule_DefaultDispatcherFactory.create(), this.localAudioSamplesDispatcherProvider, this.localAudioBufferCallbackDispatcherProvider, this.audioPrewarmerProvider, this.rtcThreadTokenProvider);
                this.localAudioTrackProvider = create15;
                this.factoryProvider4 = LocalAudioTrack_Factory_Impl.create(create15);
                this.senderCapabilitiesGetterProvider = RTCModule_SenderCapabilitiesGetterFactory.create(this.peerConnectionFactoryProvider);
                this.outgoingDataStreamManagerImplProvider = OutgoingDataStreamManagerImpl_Factory.create(this.rTCEngineProvider);
                C0064LocalParticipant_Factory create16 = C0064LocalParticipant_Factory.create(this.rTCEngineProvider, this.peerConnectionFactoryProvider, this.appContextProvider, this.eglBaseProvider2, this.factoryProvider3, this.factoryProvider2, this.factoryProvider4, this.defaultsManagerProvider, CoroutinesModule_DefaultDispatcherFactory.create(), this.senderCapabilitiesGetterProvider, this.outgoingDataStreamManagerImplProvider);
                this.localParticipantProvider = create16;
                this.factoryProvider5 = LocalParticipant_Factory_Impl.create(create16);
                this.audioSwitchHandlerProvider = b.b(AudioSwitchHandler_Factory.create(this.appContextProvider));
                OverridesModule_AudioHandlerFactory create17 = OverridesModule_AudioHandlerFactory.create(overridesModule);
                this.audioHandlerProvider = create17;
                this.audioHandlerProvider2 = b.b(AudioHandlerModule_AudioHandlerFactory.create(this.audioSwitchHandlerProvider, create17, this.audioOutputTypeProvider2));
                C0060E2EEManager_Factory create18 = C0060E2EEManager_Factory.create(this.peerConnectionFactoryProvider, RTCModule_DataPacketCryptorManagerFactoryFactory.create());
                this.e2EEManagerProvider = create18;
                this.factoryProvider6 = E2EEManager_Factory_Impl.create(create18);
                this.lKObjectsProvider = LKObjects_Factory.create(this.eglBaseProvider2, this.audioModuleProvider);
                WebModule_ConnectivityManagerFactory create19 = WebModule_ConnectivityManagerFactory.create(this.appContextProvider);
                this.connectivityManagerProvider = create19;
                WebModule_NetworkCallbackRegistrarFactory create20 = WebModule_NetworkCallbackRegistrarFactory.create(create19);
                this.networkCallbackRegistrarProvider = create20;
                WebModule_NetworkCallbackManagerFactoryFactory create21 = WebModule_NetworkCallbackManagerFactoryFactory.create(this.closeableManagerProvider, create20);
                create21.getClass();
                this.networkCallbackManagerFactoryProvider = h.a(create21);
                C0062RegionUrlProvider_Factory create22 = C0062RegionUrlProvider_Factory.create(this.okHttpClientProvider2, this.kotlinSerializationJsonProvider);
                this.regionUrlProvider = create22;
                this.factoryProvider7 = RegionUrlProvider_Factory_Impl.create(create22);
                OkHttpConnectionWarmer_Factory create23 = OkHttpConnectionWarmer_Factory.create(this.okHttpClientProvider2);
                this.okHttpConnectionWarmerProvider = create23;
                this.connectionWarmerProvider = WebModule_ConnectionWarmerFactory.create(create23);
                C0069RemoteAudioTrack_Factory create24 = C0069RemoteAudioTrack_Factory.create(this.rtcThreadTokenProvider);
                this.remoteAudioTrackProvider = create24;
                this.factoryProvider8 = RemoteAudioTrack_Factory_Impl.create(create24);
                C0070RemoteVideoTrack_Factory create25 = C0070RemoteVideoTrack_Factory.create(CoroutinesModule_DefaultDispatcherFactory.create(), this.rtcThreadTokenProvider);
                this.remoteVideoTrackProvider = create25;
                this.factoryProvider9 = RemoteVideoTrack_Factory_Impl.create(create25);
                C0065RemoteParticipant_Factory create26 = C0065RemoteParticipant_Factory.create(this.signalClientProvider, CoroutinesModule_IoDispatcherFactory.create(), CoroutinesModule_DefaultDispatcherFactory.create(), this.factoryProvider8, this.factoryProvider9);
                this.remoteParticipantProvider = create26;
                this.factoryProvider10 = RemoteParticipant_Factory_Impl.create(create26);
                C0063Room_Factory create27 = C0063Room_Factory.create(this.rTCEngineProvider, this.eglBaseProvider2, this.factoryProvider5, this.defaultsManagerProvider, CoroutinesModule_DefaultDispatcherFactory.create(), CoroutinesModule_IoDispatcherFactory.create(), this.audioHandlerProvider2, this.closeableManagerProvider, this.factoryProvider6, this.communicationWorkaroundProvider, this.audioProcessingControllerProvider, this.lKObjectsProvider, this.networkCallbackManagerFactoryProvider, this.audioModuleProvider, this.factoryProvider7, this.connectionWarmerProvider, this.audioPrewarmerProvider, IncomingDataStreamManagerImpl_Factory.create(), this.factoryProvider10);
                this.roomProvider = create27;
                this.factoryProvider11 = Room_Factory_Impl.create(create27);
                return;
            }
            n.a();
        }

        @Override // io.livekit.android.dagger.LiveKitComponent
        public EglBase eglBase() {
            return (EglBase) this.eglBaseProvider2.get();
        }

        @Override // io.livekit.android.dagger.LiveKitComponent
        public PeerConnectionFactory peerConnectionFactory() {
            return (PeerConnectionFactory) this.peerConnectionFactoryProvider.get();
        }

        @Override // io.livekit.android.dagger.LiveKitComponent
        public Room.Factory roomFactory() {
            return (Room.Factory) this.factoryProvider11.get();
        }
    }

    private DaggerLiveKitComponent() {
    }

    public static LiveKitComponent.Factory factory() {
        return new Factory();
    }
}
