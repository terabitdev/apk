package io.elevenlabs.audio;

import android.content.Context;
import android.gov.nist.core.Separators;
import android.media.AudioAttributes;
import android.media.AudioDeviceInfo;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import android.util.Log;
import f2.p;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\bJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\bJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\bJ\u000f\u0010\u0011\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\bJ\u000f\u0010\u0012\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\bJ\u0017\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0013H\u0003¢\u0006\u0004\b\u0019\u0010\u0016J\u000f\u0010\u001a\u001a\u00020\u0013H\u0003¢\u0006\u0004\b\u001a\u0010\u0018J\r\u0010\u001b\u001a\u00020\u0006¢\u0006\u0004\b\u001b\u0010\bJ\r\u0010\u001c\u001a\u00020\u0006¢\u0006\u0004\b\u001c\u0010\bJ\r\u0010\u001d\u001a\u00020\u0006¢\u0006\u0004\b\u001d\u0010\bJ\r\u0010\u001e\u001a\u00020\u0006¢\u0006\u0004\b\u001e\u0010\bJ\r\u0010\u001f\u001a\u00020\u0013¢\u0006\u0004\b\u001f\u0010\u0018J\r\u0010 \u001a\u00020\u000b¢\u0006\u0004\b \u0010!J\u0015\u0010\"\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\"\u0010\u0016J\r\u0010#\u001a\u00020\u0013¢\u0006\u0004\b#\u0010\u0018J\u0015\u0010%\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u0013¢\u0006\u0004\b%\u0010\u0016J\r\u0010&\u001a\u00020\u0013¢\u0006\u0004\b&\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010'R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0018\u0010,\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u0010\u001f\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010.R\u0014\u00100\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101¨\u00062"}, d2 = {"Lio/elevenlabs/audio/AudioSessionManager;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lsn/z;", "requestAudioFocus", "()V", "requestAudioFocusV26", "requestAudioFocusLegacy", "", "focusChange", "handleAudioFocusChange", "(I)V", "onAudioFocusGained", "onAudioFocusLost", "onAudioFocusLostTransient", "onAudioFocusLostCanDuck", "", "enabled", "setSpeakerphoneEnabledCompat", "(Z)V", "isSpeakerphoneEnabledCompat", "()Z", "setSpeakerphoneModern", "getSpeakerphoneStateModern", "configureForVoiceCall", "configureForMedia", "abandonAudioFocus", "resetAudioSession", "hasAudioFocus", "getCurrentAudioMode", "()I", "setSpeakerPhoneEnabled", "isSpeakerPhoneEnabled", "muted", "setMicrophoneMuted", "isMicrophoneMuted", "Landroid/content/Context;", "Landroid/media/AudioManager;", "audioManager", "Landroid/media/AudioManager;", "Landroid/media/AudioFocusRequest;", "audioFocusRequest", "Landroid/media/AudioFocusRequest;", "Z", "Landroid/media/AudioManager$OnAudioFocusChangeListener;", "audioFocusChangeListener", "Landroid/media/AudioManager$OnAudioFocusChangeListener;", "elevenlabs-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class AudioSessionManager {
    private final AudioManager.OnAudioFocusChangeListener audioFocusChangeListener;
    private AudioFocusRequest audioFocusRequest;
    private final android.media.AudioManager audioManager;
    private final Context context;
    private boolean hasAudioFocus;

    public AudioSessionManager(Context context) {
        context.getClass();
        this.context = context;
        Object systemService = context.getSystemService("audio");
        systemService.getClass();
        this.audioManager = (android.media.AudioManager) systemService;
        this.audioFocusChangeListener = new a(this, 0);
    }

    public static /* synthetic */ void a(AudioSessionManager audioSessionManager, int i10) {
        audioSessionManager.handleAudioFocusChange(i10);
    }

    private final boolean getSpeakerphoneStateModern() {
        AudioDeviceInfo communicationDevice;
        communicationDevice = this.audioManager.getCommunicationDevice();
        if (communicationDevice != null && communicationDevice.getType() == 2) {
            return true;
        }
        return false;
    }

    public final void handleAudioFocusChange(int focusChange) {
        if (focusChange != -3) {
            if (focusChange != -2) {
                if (focusChange != -1) {
                    if (focusChange != 1) {
                        return;
                    }
                    this.hasAudioFocus = true;
                    onAudioFocusGained();
                    return;
                }
                this.hasAudioFocus = false;
                onAudioFocusLost();
                return;
            }
            this.hasAudioFocus = false;
            onAudioFocusLostTransient();
            return;
        }
        onAudioFocusLostCanDuck();
    }

    private final boolean isSpeakerphoneEnabledCompat() {
        if (Build.VERSION.SDK_INT >= 31) {
            return getSpeakerphoneStateModern();
        }
        return this.audioManager.isSpeakerphoneOn();
    }

    private final void onAudioFocusGained() {
        Log.d("AudioSessionManager", "Audio focus gained - resuming audio");
    }

    private final void onAudioFocusLost() {
        Log.d("AudioSessionManager", "Audio focus lost - stopping audio");
    }

    private final void onAudioFocusLostCanDuck() {
        Log.d("AudioSessionManager", "Audio focus lost - ducking volume");
    }

    private final void onAudioFocusLostTransient() {
        Log.d("AudioSessionManager", "Audio focus lost temporarily - pausing audio");
    }

    private final void requestAudioFocus() {
        if (Build.VERSION.SDK_INT >= 26) {
            requestAudioFocusV26();
        } else {
            requestAudioFocusLegacy();
        }
    }

    private final void requestAudioFocusLegacy() {
        boolean z6 = false;
        if (this.audioManager.requestAudioFocus(this.audioFocusChangeListener, 0, 1) == 1) {
            z6 = true;
        }
        this.hasAudioFocus = z6;
    }

    private final void requestAudioFocusV26() {
        AudioFocusRequest.Builder audioAttributes;
        AudioFocusRequest.Builder acceptsDelayedFocusGain;
        AudioFocusRequest.Builder onAudioFocusChangeListener;
        AudioFocusRequest build;
        int requestAudioFocus;
        boolean z6 = true;
        audioAttributes = p.j().setAudioAttributes(new AudioAttributes.Builder().setUsage(2).setContentType(1).build());
        acceptsDelayedFocusGain = audioAttributes.setAcceptsDelayedFocusGain(true);
        onAudioFocusChangeListener = acceptsDelayedFocusGain.setOnAudioFocusChangeListener(this.audioFocusChangeListener);
        build = onAudioFocusChangeListener.build();
        this.audioFocusRequest = build;
        android.media.AudioManager audioManager = this.audioManager;
        build.getClass();
        requestAudioFocus = audioManager.requestAudioFocus(build);
        if (requestAudioFocus != 1) {
            z6 = false;
        }
        this.hasAudioFocus = z6;
    }

    private final void setSpeakerphoneEnabledCompat(boolean enabled) {
        if (Build.VERSION.SDK_INT >= 31) {
            setSpeakerphoneModern(enabled);
        } else {
            this.audioManager.setSpeakerphoneOn(enabled);
        }
    }

    private final void setSpeakerphoneModern(boolean enabled) {
        List availableCommunicationDevices;
        Object obj;
        android.media.AudioManager audioManager = this.audioManager;
        if (enabled) {
            availableCommunicationDevices = audioManager.getAvailableCommunicationDevices();
            availableCommunicationDevices.getClass();
            Iterator it = availableCommunicationDevices.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (((AudioDeviceInfo) obj).getType() == 2) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) obj;
            if (audioDeviceInfo != null) {
                this.audioManager.setCommunicationDevice(audioDeviceInfo);
                return;
            } else {
                Log.w("AudioSessionManager", "Built-in speaker device not found, falling back to deprecated API");
                this.audioManager.setSpeakerphoneOn(true);
                return;
            }
        }
        audioManager.clearCommunicationDevice();
    }

    public final void abandonAudioFocus() {
        if (Build.VERSION.SDK_INT >= 26) {
            AudioFocusRequest audioFocusRequest = this.audioFocusRequest;
            if (audioFocusRequest != null) {
                this.audioManager.abandonAudioFocusRequest(audioFocusRequest);
            }
        } else {
            this.audioManager.abandonAudioFocus(this.audioFocusChangeListener);
        }
        this.hasAudioFocus = false;
    }

    public final void configureForMedia() {
        try {
            this.audioManager.setMode(0);
            requestAudioFocus();
        } catch (Exception e10) {
            android.gov.nist.javax.sip.header.a.s("Failed to configure audio session for media: ", e10.getMessage(), "AudioSessionManager");
        }
    }

    public final void configureForVoiceCall() {
        try {
            this.audioManager.setMode(3);
            requestAudioFocus();
            setSpeakerphoneEnabledCompat(true);
            int streamVolume = this.audioManager.getStreamVolume(0);
            int streamMaxVolume = this.audioManager.getStreamMaxVolume(0);
            Log.d("AudioSessionManager", "MODE_IN_COMMUNICATION, speakerphoneOn=" + isSpeakerphoneEnabledCompat() + ", voiceVol=" + streamVolume + Separators.SLASH + streamMaxVolume);
        } catch (Exception e10) {
            android.gov.nist.javax.sip.header.a.s("Failed to configure audio session: ", e10.getMessage(), "AudioSessionManager");
        }
    }

    public final int getCurrentAudioMode() {
        return this.audioManager.getMode();
    }

    /* renamed from: hasAudioFocus, reason: from getter */
    public final boolean getHasAudioFocus() {
        return this.hasAudioFocus;
    }

    public final boolean isMicrophoneMuted() {
        return this.audioManager.isMicrophoneMute();
    }

    public final boolean isSpeakerPhoneEnabled() {
        return isSpeakerphoneEnabledCompat();
    }

    public final void resetAudioSession() {
        try {
            abandonAudioFocus();
            this.audioManager.setMode(0);
            setSpeakerphoneEnabledCompat(false);
        } catch (Exception e10) {
            android.gov.nist.javax.sip.header.a.s("Failed to reset audio session: ", e10.getMessage(), "AudioSessionManager");
        }
    }

    public final void setMicrophoneMuted(boolean muted) {
        this.audioManager.setMicrophoneMute(muted);
    }

    public final void setSpeakerPhoneEnabled(boolean enabled) {
        setSpeakerphoneEnabledCompat(enabled);
    }
}
