package io.elevenlabs.audio;

import ae.l;
import android.gov.nist.javax.sip.parser.TokenNames;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;
import t2.u;
import wn.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0004H\u0096@¢\u0006\u0004\b\u0007\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0004H\u0096@¢\u0006\u0004\b\b\u0010\u0006J\u0010\u0010\t\u001a\u00020\u0004H\u0096@¢\u0006\u0004\b\t\u0010\u0006J\u0018\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0096@¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0016\u0010\u000fJ\u000f\u0010\u0017\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0017\u0010\u000fJ\u000f\u0010\u0018\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0018\u0010\u000fJ\u0019\u0010\u001b\u001a\u00020\u00042\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001d\u0010\u0003R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001eR\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u001f¨\u0006 "}, d2 = {"Lio/elevenlabs/audio/NoOpAudioManager;", "Lio/elevenlabs/audio/AudioManager;", "<init>", "()V", "Lsn/z;", "startRecording", "(Lwn/c;)Ljava/lang/Object;", "stopRecording", "startPlayback", "stopPlayback", "", "muted", "setMicMuted", "(ZLwn/c;)Ljava/lang/Object;", "isMuted", "()Z", "", "volume", "setVolume", "(F)V", "getVolume", "()F", "hasAudioPermission", "isRecording", "isPlaying", "Lio/elevenlabs/audio/AudioStateListener;", "listener", "setAudioStateListener", "(Lio/elevenlabs/audio/AudioStateListener;)V", "cleanup", "Lio/elevenlabs/audio/AudioStateListener;", TokenNames.F, "elevenlabs-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class NoOpAudioManager implements AudioManager {
    private AudioStateListener listener;
    private float volume = 1.0f;

    @Override // io.elevenlabs.audio.AudioManager
    public float getVolume() {
        return this.volume;
    }

    @Override // io.elevenlabs.audio.AudioManager
    public boolean hasAudioPermission() {
        return true;
    }

    @Override // io.elevenlabs.audio.AudioManager
    public boolean isMuted() {
        return false;
    }

    @Override // io.elevenlabs.audio.AudioManager
    public boolean isPlaying() {
        return false;
    }

    @Override // io.elevenlabs.audio.AudioManager
    public boolean isRecording() {
        return false;
    }

    @Override // io.elevenlabs.audio.AudioManager
    public void setAudioStateListener(AudioStateListener listener) {
        this.listener = listener;
    }

    @Override // io.elevenlabs.audio.AudioManager
    public Object setMicMuted(boolean z6, c<? super z> cVar) {
        return z.f31622a;
    }

    @Override // io.elevenlabs.audio.AudioManager
    public void setVolume(float volume) {
        this.volume = l.l(volume, u.P, 1.0f);
    }

    @Override // io.elevenlabs.audio.AudioManager
    public Object startPlayback(c<? super z> cVar) {
        return z.f31622a;
    }

    @Override // io.elevenlabs.audio.AudioManager
    public Object startRecording(c<? super z> cVar) {
        return z.f31622a;
    }

    @Override // io.elevenlabs.audio.AudioManager
    public Object stopPlayback(c<? super z> cVar) {
        return z.f31622a;
    }

    @Override // io.elevenlabs.audio.AudioManager
    public Object stopRecording(c<? super z> cVar) {
        return z.f31622a;
    }

    @Override // io.elevenlabs.audio.AudioManager
    public void cleanup() {
    }
}
