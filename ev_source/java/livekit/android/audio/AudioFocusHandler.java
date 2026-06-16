package io.livekit.android.audio;

import android.content.Context;
import android.gov.nist.javax.sip.parser.TokenNames;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import vf.d;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0017\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\u000b\u001a\u00020\nH\u0017¢\u0006\u0004\b\u000b\u0010\fR\"\u0010\u000e\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u0014\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\u0013R\"\u0010\u0017\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u000f\u001a\u0004\b\u0018\u0010\u0011\"\u0004\b\u0019\u0010\u0013R\"\u0010\u001a\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u000f\u001a\u0004\b\u001b\u0010\u0011\"\u0004\b\u001c\u0010\u0013R\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0018\u0010 \u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010#\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R$\u0010%\u001a\u0004\u0018\u00010\"8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010$\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lio/livekit/android/audio/AudioFocusHandler;", "Lio/livekit/android/audio/AudioHandler;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lsn/z;", "start", "()V", "stop", "Landroid/media/AudioFocusRequest;", "createAudioRequest", "()Landroid/media/AudioFocusRequest;", "", "focusMode", TokenNames.I, "getFocusMode", "()I", "setFocusMode", "(I)V", "audioStreamType", "getAudioStreamType", "setAudioStreamType", "audioAttributeUsageType", "getAudioAttributeUsageType", "setAudioAttributeUsageType", "audioAttributeContentType", "getAudioAttributeContentType", "setAudioAttributeContentType", "Landroid/media/AudioManager;", "audioManager", "Landroid/media/AudioManager;", "audioRequest", "Landroid/media/AudioFocusRequest;", "Landroid/media/AudioManager$OnAudioFocusChangeListener;", "audioFocusListener", "Landroid/media/AudioManager$OnAudioFocusChangeListener;", "onAudioFocusChangeListener", "getOnAudioFocusChangeListener", "()Landroid/media/AudioManager$OnAudioFocusChangeListener;", "setOnAudioFocusChangeListener", "(Landroid/media/AudioManager$OnAudioFocusChangeListener;)V", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public class AudioFocusHandler implements AudioHandler {
    private int audioAttributeContentType;
    private int audioAttributeUsageType;
    private AudioManager.OnAudioFocusChangeListener audioFocusListener;
    private final AudioManager audioManager;
    private AudioFocusRequest audioRequest;
    private int audioStreamType;
    private int focusMode;
    private AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener;

    public AudioFocusHandler(Context context) {
        context.getClass();
        this.focusMode = 1;
        this.audioStreamType = 3;
        this.audioAttributeUsageType = 1;
        this.audioAttributeContentType = 1;
        Object systemService = context.getSystemService("audio");
        systemService.getClass();
        this.audioManager = (AudioManager) systemService;
        this.audioFocusListener = new io.elevenlabs.audio.a(this, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void audioFocusListener$lambda$0(AudioFocusHandler audioFocusHandler, int i10) {
        audioFocusHandler.getClass();
        AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = audioFocusHandler.onAudioFocusChangeListener;
        if (onAudioFocusChangeListener != null) {
            onAudioFocusChangeListener.onAudioFocusChange(i10);
        }
    }

    public AudioFocusRequest createAudioRequest() {
        AudioFocusRequest.Builder onAudioFocusChangeListener;
        AudioFocusRequest.Builder audioAttributes;
        AudioFocusRequest build;
        a.j();
        onAudioFocusChangeListener = d.l(this.focusMode).setOnAudioFocusChangeListener(this.audioFocusListener);
        audioAttributes = onAudioFocusChangeListener.setAudioAttributes(new AudioAttributes.Builder().setUsage(this.audioAttributeUsageType).setContentType(this.audioAttributeContentType).build());
        build = audioAttributes.build();
        build.getClass();
        return build;
    }

    public final int getAudioAttributeContentType() {
        return this.audioAttributeContentType;
    }

    public final int getAudioAttributeUsageType() {
        return this.audioAttributeUsageType;
    }

    public final int getAudioStreamType() {
        return this.audioStreamType;
    }

    public final int getFocusMode() {
        return this.focusMode;
    }

    public final AudioManager.OnAudioFocusChangeListener getOnAudioFocusChangeListener() {
        return this.onAudioFocusChangeListener;
    }

    public final void setAudioAttributeContentType(int i10) {
        this.audioAttributeContentType = i10;
    }

    public final void setAudioAttributeUsageType(int i10) {
        this.audioAttributeUsageType = i10;
    }

    public final void setAudioStreamType(int i10) {
        this.audioStreamType = i10;
    }

    public final void setFocusMode(int i10) {
        this.focusMode = i10;
    }

    public final void setOnAudioFocusChangeListener(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener) {
        this.onAudioFocusChangeListener = onAudioFocusChangeListener;
    }

    @Override // io.livekit.android.audio.AudioHandler
    public void start() {
        if (Build.VERSION.SDK_INT >= 26) {
            AudioFocusRequest createAudioRequest = createAudioRequest();
            this.audioRequest = createAudioRequest;
            if (createAudioRequest != null) {
                this.audioManager.requestAudioFocus(createAudioRequest);
                return;
            }
            return;
        }
        this.audioManager.requestAudioFocus(this.audioFocusListener, this.audioStreamType, this.focusMode);
    }

    @Override // io.livekit.android.audio.AudioHandler
    public void stop() {
        if (Build.VERSION.SDK_INT >= 26) {
            AudioFocusRequest audioFocusRequest = this.audioRequest;
            if (audioFocusRequest != null) {
                this.audioManager.abandonAudioFocusRequest(audioFocusRequest);
            }
            this.audioRequest = null;
            return;
        }
        this.audioManager.abandonAudioFocus(this.onAudioFocusChangeListener);
    }
}
