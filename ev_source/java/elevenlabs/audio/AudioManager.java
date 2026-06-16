package io.elevenlabs.audio;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;
import wn.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0006\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0007\u0010\u0004J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH¦@¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\bH&¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH&¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000eH&¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\bH&¢\u0006\u0004\b\u0014\u0010\rJ\u000f\u0010\u0015\u001a\u00020\bH&¢\u0006\u0004\b\u0015\u0010\rJ\u000f\u0010\u0016\u001a\u00020\bH&¢\u0006\u0004\b\u0016\u0010\rJ\u0019\u0010\u0019\u001a\u00020\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H&¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0002H&¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lio/elevenlabs/audio/AudioManager;", "", "Lsn/z;", "startRecording", "(Lwn/c;)Ljava/lang/Object;", "stopRecording", "startPlayback", "stopPlayback", "", "muted", "setMicMuted", "(ZLwn/c;)Ljava/lang/Object;", "isMuted", "()Z", "", "volume", "setVolume", "(F)V", "getVolume", "()F", "hasAudioPermission", "isRecording", "isPlaying", "Lio/elevenlabs/audio/AudioStateListener;", "listener", "setAudioStateListener", "(Lio/elevenlabs/audio/AudioStateListener;)V", "cleanup", "()V", "elevenlabs-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public interface AudioManager {
    void cleanup();

    float getVolume();

    boolean hasAudioPermission();

    boolean isMuted();

    boolean isPlaying();

    boolean isRecording();

    void setAudioStateListener(AudioStateListener listener);

    Object setMicMuted(boolean z6, c<? super z> cVar);

    void setVolume(float volume);

    Object startPlayback(c<? super z> cVar);

    Object startRecording(c<? super z> cVar);

    Object stopPlayback(c<? super z> cVar);

    Object stopRecording(c<? super z> cVar);
}
