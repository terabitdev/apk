package io.livekit.android.dagger;

import android.content.Context;
import android.media.AudioAttributes;
import android.os.Build;
import defpackage.f;
import et.d;
import ho.l;
import ib.i;
import io.livekit.android.audio.AudioBufferCallbackDispatcher;
import io.livekit.android.audio.AudioProcessingController;
import io.livekit.android.audio.AudioProcessorOptions;
import io.livekit.android.audio.AudioRecordPrewarmer;
import io.livekit.android.audio.AudioRecordSamplesDispatcher;
import io.livekit.android.audio.CommunicationWorkaround;
import io.livekit.android.audio.JavaAudioRecordPrewarmer;
import io.livekit.android.audio.NoAudioRecordPrewarmer;
import io.livekit.android.e2ee.DataPacketCryptorManager;
import io.livekit.android.e2ee.DataPacketCryptorManagerImpl;
import io.livekit.android.memory.CloseableManager;
import io.livekit.android.util.LKLog;
import io.livekit.android.util.LoggingLevel;
import io.livekit.android.webrtc.CustomAudioProcessingFactory;
import io.livekit.android.webrtc.CustomVideoDecoderFactory;
import io.livekit.android.webrtc.CustomVideoEncoderFactory;
import io.livekit.android.webrtc.PeerConnectionFactoryManager;
import io.livekit.android.webrtc.peerconnection.RTCThreadToken;
import io.livekit.android.webrtc.peerconnection.RTCThreadTokenImpl;
import io.livekit.android.webrtc.peerconnection.RTCThreadUtilsKt;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import livekit.org.webrtc.AudioProcessingFactory;
import livekit.org.webrtc.EglBase;
import livekit.org.webrtc.Logging;
import livekit.org.webrtc.PeerConnectionFactory;
import livekit.org.webrtc.SoftwareVideoDecoderFactory;
import livekit.org.webrtc.SoftwareVideoEncoderFactory;
import livekit.org.webrtc.VideoDecoderFactory;
import livekit.org.webrtc.VideoEncoderFactory;
import livekit.org.webrtc.audio.AudioDeviceModule;
import livekit.org.webrtc.audio.JavaAudioDeviceModule;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000Ü\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\r\u0010\u000eJg\u0010\u001d\u001a\u00020\u000f2\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0016\b\u0001\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00112\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\b\b\u0001\u0010\u001b\u001a\u00020\t2\b\b\u0001\u0010\u001c\u001a\u00020\fH\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020\u000fH\u0007¢\u0006\u0004\b!\u0010\"J#\u0010&\u001a\u00020#2\n\b\u0001\u0010$\u001a\u0004\u0018\u00010#2\u0006\u0010%\u001a\u00020\u0017H\u0007¢\u0006\u0004\b&\u0010'J\u0017\u0010)\u001a\u00020(2\u0006\u0010&\u001a\u00020#H\u0007¢\u0006\u0004\b)\u0010*J7\u00100\u001a\u00020.2\b\b\u0001\u0010+\u001a\u00020\u00062\b\b\u0001\u0010-\u001a\u00020,2\u0006\u0010)\u001a\u00020(2\n\b\u0001\u0010/\u001a\u0004\u0018\u00010.H\u0007¢\u0006\u0004\b0\u00101J%\u00105\u001a\u0002042\b\b\u0001\u0010+\u001a\u00020\u00062\n\b\u0001\u00103\u001a\u0004\u0018\u000102H\u0007¢\u0006\u0004\b5\u00106J\u0017\u00108\u001a\u0002072\u0006\u00105\u001a\u000204H\u0007¢\u0006\u0004\b8\u00109J\u0017\u0010;\u001a\u00020:2\u0006\u00105\u001a\u000204H\u0007¢\u0006\u0004\b;\u0010<J7\u0010?\u001a\u00020=2\b\b\u0001\u0010+\u001a\u00020\u00062\b\b\u0001\u0010-\u001a\u00020,2\u0006\u0010)\u001a\u00020(2\n\b\u0001\u0010>\u001a\u0004\u0018\u00010=H\u0007¢\u0006\u0004\b?\u0010@JM\u0010D\u001a\u00020C2\b\b\u0001\u0010+\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u000f2\u0006\u00100\u001a\u00020.2\u0006\u0010?\u001a\u00020=2\n\b\u0001\u0010B\u001a\u0004\u0018\u00010A2\u0006\u0010%\u001a\u00020\u00172\u0006\u0010;\u001a\u00020:H\u0007¢\u0006\u0004\bD\u0010EJ\u000f\u0010G\u001a\u00020FH\u0007¢\u0006\u0004\bG\u0010HJ\u0017\u0010J\u001a\u00020I2\u0006\u0010D\u001a\u00020CH\u0007¢\u0006\u0004\bJ\u0010KJ\u0017\u0010M\u001a\u00020L2\u0006\u0010D\u001a\u00020CH\u0007¢\u0006\u0004\bM\u0010NJ'\u0010R\u001a\u0012\u0012\u0004\u0012\u00020O\u0012\u0004\u0012\u00020P0\u0011j\u0002`Q2\u0006\u0010J\u001a\u00020IH\u0007¢\u0006\u0004\bR\u0010SJ\u000f\u0010-\u001a\u00020,H\u0007¢\u0006\u0004\b-\u0010TJ\u0017\u0010W\u001a\n V*\u0004\u0018\u00010U0UH\u0007¢\u0006\u0004\bW\u0010XR\u0016\u0010Y\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010Z¨\u0006["}, d2 = {"Lio/livekit/android/dagger/RTCModule;", "", "<init>", "()V", "Landroid/content/Context;", "appContext", "Lio/livekit/android/dagger/LibWebrtcInitialization;", "libWebrtcInitialization", "(Landroid/content/Context;)Lio/livekit/android/dagger/LibWebrtcInitialization;", "Lio/livekit/android/audio/AudioRecordSamplesDispatcher;", "localAudioSamplesDispatcher", "()Lio/livekit/android/audio/AudioRecordSamplesDispatcher;", "Lio/livekit/android/audio/AudioBufferCallbackDispatcher;", "localAudioBufferCallbackDispatcher", "()Lio/livekit/android/audio/AudioBufferCallbackDispatcher;", "Llivekit/org/webrtc/audio/AudioDeviceModule;", "audioDeviceModuleOverride", "Lkotlin/Function1;", "Llivekit/org/webrtc/audio/JavaAudioDeviceModule$Builder;", "Lsn/z;", "moduleCustomizer", "Landroid/media/AudioAttributes;", "audioOutputAttributes", "Lio/livekit/android/memory/CloseableManager;", "closeableManager", "Lio/livekit/android/audio/CommunicationWorkaround;", "communicationWorkaround", "audioRecordSamplesDispatcher", "audioBufferCallbackDispatcher", "audioModule", "(Llivekit/org/webrtc/audio/AudioDeviceModule;Lho/l;Landroid/media/AudioAttributes;Landroid/content/Context;Lio/livekit/android/memory/CloseableManager;Lio/livekit/android/audio/CommunicationWorkaround;Lio/livekit/android/audio/AudioRecordSamplesDispatcher;Lio/livekit/android/audio/AudioBufferCallbackDispatcher;)Llivekit/org/webrtc/audio/AudioDeviceModule;", "audioDeviceModule", "Lio/livekit/android/audio/AudioRecordPrewarmer;", "audioPrewarmer", "(Llivekit/org/webrtc/audio/AudioDeviceModule;)Lio/livekit/android/audio/AudioRecordPrewarmer;", "Llivekit/org/webrtc/EglBase;", "eglBaseOverride", "memoryManager", "eglBase", "(Llivekit/org/webrtc/EglBase;Lio/livekit/android/memory/CloseableManager;)Llivekit/org/webrtc/EglBase;", "Llivekit/org/webrtc/EglBase$Context;", "eglContext", "(Llivekit/org/webrtc/EglBase;)Llivekit/org/webrtc/EglBase$Context;", "webrtcInitialization", "", "videoHwAccel", "Llivekit/org/webrtc/VideoEncoderFactory;", "videoEncoderFactoryOverride", "videoEncoderFactory", "(Lio/livekit/android/dagger/LibWebrtcInitialization;ZLlivekit/org/webrtc/EglBase$Context;Llivekit/org/webrtc/VideoEncoderFactory;)Llivekit/org/webrtc/VideoEncoderFactory;", "Lio/livekit/android/audio/AudioProcessorOptions;", "audioProcessorOptions", "Lio/livekit/android/webrtc/CustomAudioProcessingFactory;", "customAudioProcessingFactory", "(Lio/livekit/android/dagger/LibWebrtcInitialization;Lio/livekit/android/audio/AudioProcessorOptions;)Lio/livekit/android/webrtc/CustomAudioProcessingFactory;", "Lio/livekit/android/audio/AudioProcessingController;", "audioProcessingController", "(Lio/livekit/android/webrtc/CustomAudioProcessingFactory;)Lio/livekit/android/audio/AudioProcessingController;", "Llivekit/org/webrtc/AudioProcessingFactory;", "audioProcessingFactory", "(Lio/livekit/android/webrtc/CustomAudioProcessingFactory;)Llivekit/org/webrtc/AudioProcessingFactory;", "Llivekit/org/webrtc/VideoDecoderFactory;", "videoDecoderFactoryOverride", "videoDecoderFactory", "(Lio/livekit/android/dagger/LibWebrtcInitialization;ZLlivekit/org/webrtc/EglBase$Context;Llivekit/org/webrtc/VideoDecoderFactory;)Llivekit/org/webrtc/VideoDecoderFactory;", "Llivekit/org/webrtc/PeerConnectionFactory$Options;", "peerConnectionFactoryOptions", "Lio/livekit/android/webrtc/PeerConnectionFactoryManager;", "peerConnectionFactoryManager", "(Lio/livekit/android/dagger/LibWebrtcInitialization;Llivekit/org/webrtc/audio/AudioDeviceModule;Llivekit/org/webrtc/VideoEncoderFactory;Llivekit/org/webrtc/VideoDecoderFactory;Llivekit/org/webrtc/PeerConnectionFactory$Options;Lio/livekit/android/memory/CloseableManager;Llivekit/org/webrtc/AudioProcessingFactory;)Lio/livekit/android/webrtc/PeerConnectionFactoryManager;", "Lio/livekit/android/e2ee/DataPacketCryptorManager$Factory;", "dataPacketCryptorManagerFactory", "()Lio/livekit/android/e2ee/DataPacketCryptorManager$Factory;", "Llivekit/org/webrtc/PeerConnectionFactory;", "peerConnectionFactory", "(Lio/livekit/android/webrtc/PeerConnectionFactoryManager;)Llivekit/org/webrtc/PeerConnectionFactory;", "Lio/livekit/android/webrtc/peerconnection/RTCThreadToken;", "rtcThreadToken", "(Lio/livekit/android/webrtc/PeerConnectionFactoryManager;)Lio/livekit/android/webrtc/peerconnection/RTCThreadToken;", "Llivekit/org/webrtc/MediaStreamTrack$MediaType;", "Llivekit/org/webrtc/RtpCapabilities;", "Lio/livekit/android/dagger/CapabilitiesGetter;", "senderCapabilitiesGetter", "(Llivekit/org/webrtc/PeerConnectionFactory;)Lho/l;", "()Z", "Lb/i;", "kotlin.jvm.PlatformType", "sdpFactory", "()Lb/i;", "hasInitializedWebrtc", "Z", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class RTCModule {
    public static final RTCModule INSTANCE = new RTCModule();
    private static boolean hasInitializedWebrtc;

    private RTCModule() {
    }

    public final AudioDeviceModule audioModule(AudioDeviceModule audioDeviceModuleOverride, l moduleCustomizer, AudioAttributes audioOutputAttributes, Context appContext, CloseableManager closeableManager, final CommunicationWorkaround communicationWorkaround, AudioRecordSamplesDispatcher audioRecordSamplesDispatcher, AudioBufferCallbackDispatcher audioBufferCallbackDispatcher) {
        boolean z6;
        audioOutputAttributes.getClass();
        appContext.getClass();
        closeableManager.getClass();
        communicationWorkaround.getClass();
        audioRecordSamplesDispatcher.getClass();
        audioBufferCallbackDispatcher.getClass();
        if (audioDeviceModuleOverride != null) {
            return audioDeviceModuleOverride;
        }
        JavaAudioDeviceModule.AudioRecordErrorCallback audioRecordErrorCallback = new JavaAudioDeviceModule.AudioRecordErrorCallback() { // from class: io.livekit.android.dagger.RTCModule$audioModule$audioRecordErrorCallback$1
            @Override // livekit.org.webrtc.audio.JavaAudioDeviceModule.AudioRecordErrorCallback
            public void onWebRtcAudioRecordError(String errorMessage) {
                LKLog.Companion companion = LKLog.INSTANCE;
                if (LoggingLevel.ERROR.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && d.d() > 0) {
                    d.b(null, f.i("onWebRtcAudioRecordError: ", errorMessage), new Object[0]);
                }
            }

            @Override // livekit.org.webrtc.audio.JavaAudioDeviceModule.AudioRecordErrorCallback
            public void onWebRtcAudioRecordInitError(String errorMessage) {
                LKLog.Companion companion = LKLog.INSTANCE;
                if (LoggingLevel.ERROR.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && d.d() > 0) {
                    d.b(null, f.i("onWebRtcAudioRecordInitError: ", errorMessage), new Object[0]);
                }
            }

            @Override // livekit.org.webrtc.audio.JavaAudioDeviceModule.AudioRecordErrorCallback
            public void onWebRtcAudioRecordStartError(JavaAudioDeviceModule.AudioRecordStartErrorCode errorCode, String errorMessage) {
                LKLog.Companion companion = LKLog.INSTANCE;
                if (LoggingLevel.ERROR.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && d.d() > 0) {
                    d.b(null, "onWebRtcAudioRecordStartError: " + errorCode + ". " + errorMessage, new Object[0]);
                }
            }
        };
        JavaAudioDeviceModule.AudioTrackErrorCallback audioTrackErrorCallback = new JavaAudioDeviceModule.AudioTrackErrorCallback() { // from class: io.livekit.android.dagger.RTCModule$audioModule$audioTrackErrorCallback$1
            @Override // livekit.org.webrtc.audio.JavaAudioDeviceModule.AudioTrackErrorCallback
            public void onWebRtcAudioTrackError(String errorMessage) {
                LKLog.Companion companion = LKLog.INSTANCE;
                if (LoggingLevel.ERROR.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && d.d() > 0) {
                    d.b(null, f.i("onWebRtcAudioTrackError: ", errorMessage), new Object[0]);
                }
            }

            @Override // livekit.org.webrtc.audio.JavaAudioDeviceModule.AudioTrackErrorCallback
            public void onWebRtcAudioTrackInitError(String errorMessage) {
                LKLog.Companion companion = LKLog.INSTANCE;
                if (LoggingLevel.ERROR.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && d.d() > 0) {
                    d.b(null, f.i("onWebRtcAudioTrackInitError: ", errorMessage), new Object[0]);
                }
            }

            @Override // livekit.org.webrtc.audio.JavaAudioDeviceModule.AudioTrackErrorCallback
            public void onWebRtcAudioTrackStartError(JavaAudioDeviceModule.AudioTrackStartErrorCode errorCode, String errorMessage) {
                LKLog.Companion companion = LKLog.INSTANCE;
                if (LoggingLevel.ERROR.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && d.d() > 0) {
                    d.b(null, "onWebRtcAudioTrackStartError: " + errorCode + ". " + errorMessage, new Object[0]);
                }
            }
        };
        JavaAudioDeviceModule.AudioRecordStateCallback audioRecordStateCallback = new JavaAudioDeviceModule.AudioRecordStateCallback() { // from class: io.livekit.android.dagger.RTCModule$audioModule$audioRecordStateCallback$1
            @Override // livekit.org.webrtc.audio.JavaAudioDeviceModule.AudioRecordStateCallback
            public void onWebRtcAudioRecordStart() {
                LKLog.Companion companion = LKLog.INSTANCE;
                if (LoggingLevel.VERBOSE.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && d.d() > 0) {
                    d.e(null, "Audio recording starts", new Object[0]);
                }
            }

            @Override // livekit.org.webrtc.audio.JavaAudioDeviceModule.AudioRecordStateCallback
            public void onWebRtcAudioRecordStop() {
                LKLog.Companion companion = LKLog.INSTANCE;
                if (LoggingLevel.VERBOSE.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && d.d() > 0) {
                    d.e(null, "Audio recording stops", new Object[0]);
                }
            }
        };
        JavaAudioDeviceModule.AudioTrackStateCallback audioTrackStateCallback = new JavaAudioDeviceModule.AudioTrackStateCallback() { // from class: io.livekit.android.dagger.RTCModule$audioModule$audioTrackStateCallback$1
            @Override // livekit.org.webrtc.audio.JavaAudioDeviceModule.AudioTrackStateCallback
            public void onWebRtcAudioTrackStart() {
                LKLog.Companion companion = LKLog.INSTANCE;
                if (LoggingLevel.VERBOSE.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && d.d() > 0) {
                    d.e(null, "Audio playout starts", new Object[0]);
                }
                CommunicationWorkaround.this.onStartPlayout();
            }

            @Override // livekit.org.webrtc.audio.JavaAudioDeviceModule.AudioTrackStateCallback
            public void onWebRtcAudioTrackStop() {
                LKLog.Companion companion = LKLog.INSTANCE;
                if (LoggingLevel.VERBOSE.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && d.d() > 0) {
                    d.e(null, "Audio playout stops", new Object[0]);
                }
                CommunicationWorkaround.this.onStopPlayout();
            }
        };
        if (Build.VERSION.SDK_INT >= 29) {
            z6 = true;
        } else {
            z6 = false;
        }
        JavaAudioDeviceModule.Builder audioBufferCallback = JavaAudioDeviceModule.builder(appContext).setUseHardwareAcousticEchoCanceler(z6).setUseHardwareNoiseSuppressor(z6).setAudioRecordErrorCallback(audioRecordErrorCallback).setAudioTrackErrorCallback(audioTrackErrorCallback).setAudioRecordStateCallback(audioRecordStateCallback).setAudioTrackStateCallback(audioTrackStateCallback).setSamplesReadyCallback(audioRecordSamplesDispatcher).setAudioSource(7).setAudioAttributes(audioOutputAttributes).setAudioBufferCallback(audioBufferCallbackDispatcher);
        if (moduleCustomizer != null) {
            audioBufferCallback.getClass();
            moduleCustomizer.invoke(audioBufferCallback);
        }
        JavaAudioDeviceModule createAudioDeviceModule = audioBufferCallback.createAudioDeviceModule();
        closeableManager.registerClosable(new a(createAudioDeviceModule, 1));
        createAudioDeviceModule.getClass();
        return createAudioDeviceModule;
    }

    public final AudioRecordPrewarmer audioPrewarmer(AudioDeviceModule audioDeviceModule) {
        audioDeviceModule.getClass();
        if (audioDeviceModule instanceof JavaAudioDeviceModule) {
            return new JavaAudioRecordPrewarmer((JavaAudioDeviceModule) audioDeviceModule);
        }
        return new NoAudioRecordPrewarmer();
    }

    public final AudioProcessingController audioProcessingController(CustomAudioProcessingFactory customAudioProcessingFactory) {
        customAudioProcessingFactory.getClass();
        return customAudioProcessingFactory;
    }

    public final AudioProcessingFactory audioProcessingFactory(CustomAudioProcessingFactory customAudioProcessingFactory) {
        customAudioProcessingFactory.getClass();
        return customAudioProcessingFactory.getAudioProcessingFactory();
    }

    public final CustomAudioProcessingFactory customAudioProcessingFactory(LibWebrtcInitialization webrtcInitialization, AudioProcessorOptions audioProcessorOptions) {
        webrtcInitialization.getClass();
        if (audioProcessorOptions == null) {
            audioProcessorOptions = new AudioProcessorOptions(null, false, null, false, 15, null);
        }
        return new CustomAudioProcessingFactory(audioProcessorOptions);
    }

    public final DataPacketCryptorManager.Factory dataPacketCryptorManagerFactory() {
        return DataPacketCryptorManagerImpl.Factory.INSTANCE;
    }

    public final EglBase eglBase(EglBase eglBaseOverride, CloseableManager memoryManager) {
        memoryManager.getClass();
        if (eglBaseOverride == null) {
            EglBase create = EglBase.create();
            memoryManager.registerClosable(new a(create, 2));
            create.getClass();
            return create;
        }
        return eglBaseOverride;
    }

    public final EglBase.Context eglContext(EglBase eglBase) {
        eglBase.getClass();
        EglBase.Context eglBaseContext = eglBase.getEglBaseContext();
        eglBaseContext.getClass();
        return eglBaseContext;
    }

    public final LibWebrtcInitialization libWebrtcInitialization(final Context appContext) {
        appContext.getClass();
        if (!hasInitializedWebrtc) {
            final LibWebrtcInitializationThreadToken libWebrtcInitializationThreadToken = LibWebrtcInitializationThreadToken.INSTANCE;
            if (!libWebrtcInitializationThreadToken.isDisposed()) {
                if (i.u(RTCThreadUtilsKt.RTC_EXECUTOR_THREADNAME_PREFIX, false)) {
                    if (!hasInitializedWebrtc) {
                        hasInitializedWebrtc = true;
                        PeerConnectionFactory.initialize(PeerConnectionFactory.InitializationOptions.builder(appContext).setNativeLibraryName("lkjingle_peerconnection_so").setInjectableLogger(RTCModule$libWebrtcInitialization$1$1.INSTANCE, Logging.Severity.LS_VERBOSE).createInitializationOptions());
                    }
                } else {
                    RTCThreadUtilsKt.executor.submit(new Callable() { // from class: io.livekit.android.dagger.RTCModule$libWebrtcInitialization$$inlined$executeBlockingOnRTCThread$1
                        @Override // java.util.concurrent.Callable
                        public final z call() {
                            if (RTCThreadToken.this.isDisposed()) {
                                return null;
                            }
                            if (!RTCModule.hasInitializedWebrtc) {
                                RTCModule.hasInitializedWebrtc = true;
                                PeerConnectionFactory.initialize(PeerConnectionFactory.InitializationOptions.builder(appContext).setNativeLibraryName("lkjingle_peerconnection_so").setInjectableLogger(RTCModule$libWebrtcInitialization$1$1.INSTANCE, Logging.Severity.LS_VERBOSE).createInitializationOptions());
                            }
                            return z.f31622a;
                        }
                    }).get();
                }
            }
        }
        return LibWebrtcInitialization.INSTANCE;
    }

    public final AudioBufferCallbackDispatcher localAudioBufferCallbackDispatcher() {
        return new AudioBufferCallbackDispatcher();
    }

    public final AudioRecordSamplesDispatcher localAudioSamplesDispatcher() {
        return new AudioRecordSamplesDispatcher();
    }

    public final PeerConnectionFactory peerConnectionFactory(PeerConnectionFactoryManager peerConnectionFactoryManager) {
        peerConnectionFactoryManager.getClass();
        return peerConnectionFactoryManager.getPeerConnectionFactory();
    }

    public final PeerConnectionFactoryManager peerConnectionFactoryManager(LibWebrtcInitialization webrtcInitialization, final AudioDeviceModule audioDeviceModule, final VideoEncoderFactory videoEncoderFactory, final VideoDecoderFactory videoDecoderFactory, final PeerConnectionFactory.Options peerConnectionFactoryOptions, final CloseableManager memoryManager, final AudioProcessingFactory audioProcessingFactory) {
        Object obj;
        webrtcInitialization.getClass();
        audioDeviceModule.getClass();
        videoEncoderFactory.getClass();
        videoDecoderFactory.getClass();
        memoryManager.getClass();
        audioProcessingFactory.getClass();
        final LibWebrtcInitializationThreadToken libWebrtcInitializationThreadToken = LibWebrtcInitializationThreadToken.INSTANCE;
        if (libWebrtcInitializationThreadToken.isDisposed()) {
            obj = null;
        } else if (i.u(RTCThreadUtilsKt.RTC_EXECUTOR_THREADNAME_PREFIX, false)) {
            PeerConnectionFactory.Builder videoDecoderFactory2 = PeerConnectionFactory.builder().setAudioDeviceModule(audioDeviceModule).setAudioProcessingFactory(audioProcessingFactory).setVideoEncoderFactory(videoEncoderFactory).setVideoDecoderFactory(videoDecoderFactory);
            if (peerConnectionFactoryOptions != null) {
                videoDecoderFactory2.setOptions(peerConnectionFactoryOptions);
            }
            PeerConnectionFactory createPeerConnectionFactory = videoDecoderFactory2.createPeerConnectionFactory();
            createPeerConnectionFactory.getClass();
            PeerConnectionFactoryManager peerConnectionFactoryManager = new PeerConnectionFactoryManager(createPeerConnectionFactory);
            memoryManager.registerClosable(new RTCModule$peerConnectionFactoryManager$1$1$1(peerConnectionFactoryManager));
            obj = peerConnectionFactoryManager;
        } else {
            obj = RTCThreadUtilsKt.executor.submit(new Callable() { // from class: io.livekit.android.dagger.RTCModule$peerConnectionFactoryManager$$inlined$executeBlockingOnRTCThread$1
                @Override // java.util.concurrent.Callable
                public final PeerConnectionFactoryManager call() {
                    if (RTCThreadToken.this.isDisposed()) {
                        return null;
                    }
                    PeerConnectionFactory.Builder videoDecoderFactory3 = PeerConnectionFactory.builder().setAudioDeviceModule(audioDeviceModule).setAudioProcessingFactory(audioProcessingFactory).setVideoEncoderFactory(videoEncoderFactory).setVideoDecoderFactory(videoDecoderFactory);
                    PeerConnectionFactory.Options options = peerConnectionFactoryOptions;
                    if (options != null) {
                        videoDecoderFactory3.setOptions(options);
                    }
                    PeerConnectionFactory createPeerConnectionFactory2 = videoDecoderFactory3.createPeerConnectionFactory();
                    createPeerConnectionFactory2.getClass();
                    PeerConnectionFactoryManager peerConnectionFactoryManager2 = new PeerConnectionFactoryManager(createPeerConnectionFactory2);
                    memoryManager.registerClosable(new RTCModule$peerConnectionFactoryManager$1$1$1(peerConnectionFactoryManager2));
                    return peerConnectionFactoryManager2;
                }
            }).get();
        }
        obj.getClass();
        return (PeerConnectionFactoryManager) obj;
    }

    public final RTCThreadToken rtcThreadToken(PeerConnectionFactoryManager peerConnectionFactoryManager) {
        peerConnectionFactoryManager.getClass();
        return new RTCThreadTokenImpl(peerConnectionFactoryManager);
    }

    public final b.i sdpFactory() {
        return b.i.f4089a;
    }

    public final l senderCapabilitiesGetter(PeerConnectionFactory peerConnectionFactory) {
        peerConnectionFactory.getClass();
        return new RTCModule$senderCapabilitiesGetter$1(peerConnectionFactory);
    }

    public final VideoDecoderFactory videoDecoderFactory(LibWebrtcInitialization webrtcInitialization, boolean videoHwAccel, EglBase.Context eglContext, VideoDecoderFactory videoDecoderFactoryOverride) {
        webrtcInitialization.getClass();
        eglContext.getClass();
        if (videoDecoderFactoryOverride == null) {
            if (videoHwAccel) {
                return new CustomVideoDecoderFactory(eglContext, false, null, 6, null);
            }
            return new SoftwareVideoDecoderFactory();
        }
        return videoDecoderFactoryOverride;
    }

    public final VideoEncoderFactory videoEncoderFactory(LibWebrtcInitialization webrtcInitialization, boolean videoHwAccel, EglBase.Context eglContext, VideoEncoderFactory videoEncoderFactoryOverride) {
        webrtcInitialization.getClass();
        eglContext.getClass();
        if (videoEncoderFactoryOverride == null) {
            if (videoHwAccel) {
                return new CustomVideoEncoderFactory(eglContext, true, false, false, null, 24, null);
            }
            return new SoftwareVideoEncoderFactory();
        }
        return videoEncoderFactoryOverride;
    }

    public final boolean videoHwAccel() {
        return true;
    }
}
