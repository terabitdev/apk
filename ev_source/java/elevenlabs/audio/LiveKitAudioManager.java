package io.elevenlabs.audio;

import ae.l;
import android.content.Context;
import android.util.Log;
import com.google.protobuf.c6;
import fr.d0;
import fr.g0;
import fr.r0;
import io.livekit.android.room.Room;
import io.livekit.android.room.participant.LocalParticipant;
import io.livekit.android.room.participant.RemoteParticipant;
import io.livekit.android.room.track.LocalAudioTrack;
import io.livekit.android.room.track.RemoteAudioTrack;
import io.livekit.android.room.track.Track;
import ir.b2;
import ir.j1;
import ir.r;
import ir.z1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kr.o;
import livekit.LivekitInternal$NodeStats;
import mr.e;
import sn.k;
import sn.z;
import t2.u;
import wn.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\bH\u0096@¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\bH\u0096@¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000e\u001a\u00020\bH\u0096@¢\u0006\u0004\b\u000e\u0010\fJ\u0010\u0010\u000f\u001a\u00020\bH\u0096@¢\u0006\u0004\b\u000f\u0010\fJ\u0018\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0096@¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001c\u0010\u0015J\u000f\u0010\u001d\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001d\u0010\u0015J\u000f\u0010\u001e\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001e\u0010\u0015J\u0019\u0010!\u001a\u00020\b2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\bH\u0016¢\u0006\u0004\b#\u0010\nJ\u0015\u0010&\u001a\u00020\b2\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'J\u0015\u0010(\u001a\u00020\b2\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b(\u0010'R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010)R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010*R\u0018\u0010,\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u001c\u0010/\u001a\b\u0012\u0004\u0012\u00020$0.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u001a\u00102\u001a\b\u0012\u0004\u0012\u00020\u0010018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u001a\u00104\u001a\b\u0012\u0004\u0012\u00020\u0010018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00103R\u001a\u00105\u001a\b\u0012\u0004\u0012\u00020\u0010018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00103R\u001a\u00106\u001a\b\u0012\u0004\u0012\u00020\u0016018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00103R\u0018\u00107\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010:\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u001d\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00100<8\u0006¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u001d\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00100<8\u0006¢\u0006\f\n\u0004\bA\u0010>\u001a\u0004\bB\u0010@R\u001d\u0010C\u001a\b\u0012\u0004\u0012\u00020\u00100<8\u0006¢\u0006\f\n\u0004\bC\u0010>\u001a\u0004\bD\u0010@R\u001d\u0010E\u001a\b\u0012\u0004\u0012\u00020\u00160<8\u0006¢\u0006\f\n\u0004\bE\u0010>\u001a\u0004\bF\u0010@¨\u0006G"}, d2 = {"Lio/elevenlabs/audio/LiveKitAudioManager;", "Lio/elevenlabs/audio/AudioManager;", "Landroid/content/Context;", "context", "Lio/livekit/android/room/Room;", "room", "<init>", "(Landroid/content/Context;Lio/livekit/android/room/Room;)V", "Lsn/z;", "unsubscribeFromRemoteAudioTracks", "()V", "startRecording", "(Lwn/c;)Ljava/lang/Object;", "stopRecording", "startPlayback", "stopPlayback", "", "muted", "setMicMuted", "(ZLwn/c;)Ljava/lang/Object;", "isMuted", "()Z", "", "volume", "setVolume", "(F)V", "getVolume", "()F", "hasAudioPermission", "isRecording", "isPlaying", "Lio/elevenlabs/audio/AudioStateListener;", "listener", "setAudioStateListener", "(Lio/elevenlabs/audio/AudioStateListener;)V", "cleanup", "Lio/livekit/android/room/track/RemoteAudioTrack;", "track", "addRemoteAudioTrack", "(Lio/livekit/android/room/track/RemoteAudioTrack;)V", "removeRemoteAudioTrack", "Landroid/content/Context;", "Lio/livekit/android/room/Room;", "Lio/livekit/android/room/track/LocalAudioTrack;", "localAudioTrack", "Lio/livekit/android/room/track/LocalAudioTrack;", "", "remoteAudioTracks", "Ljava/util/List;", "Lir/j1;", "_isRecording", "Lir/j1;", "_isPlaying", "_isMuted", "_volume", "audioStateListener", "Lio/elevenlabs/audio/AudioStateListener;", "Lfr/d0;", "scope", "Lfr/d0;", "Lir/z1;", "recordingState", "Lir/z1;", "getRecordingState", "()Lir/z1;", "playbackState", "getPlaybackState", "muteState", "getMuteState", "volumeState", "getVolumeState", "elevenlabs-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class LiveKitAudioManager implements AudioManager {
    private final j1 _isMuted;
    private final j1 _isPlaying;
    private final j1 _isRecording;
    private final j1 _volume;
    private AudioStateListener audioStateListener;
    private final Context context;
    private LocalAudioTrack localAudioTrack;
    private final z1 muteState;
    private final z1 playbackState;
    private final z1 recordingState;
    private List<RemoteAudioTrack> remoteAudioTracks;
    private final Room room;
    private final d0 scope;
    private final z1 volumeState;

    public LiveKitAudioManager(Context context, Room room) {
        context.getClass();
        room.getClass();
        this.context = context;
        this.room = room;
        this.remoteAudioTracks = new ArrayList();
        Boolean bool = Boolean.FALSE;
        b2 c5 = r.c(bool);
        this._isRecording = c5;
        b2 c10 = r.c(bool);
        this._isPlaying = c10;
        b2 c11 = r.c(bool);
        this._isMuted = c11;
        b2 c12 = r.c(Float.valueOf(1.0f));
        this._volume = c12;
        e eVar = r0.f9888a;
        this.scope = g0.c(o.f20734a.plus(g0.f()));
        AudioUtils.INSTANCE.configureAudioSession(context);
        this.recordingState = c5;
        this.playbackState = c10;
        this.muteState = c11;
        this.volumeState = c12;
    }

    private final void unsubscribeFromRemoteAudioTracks() {
        this.remoteAudioTracks.clear();
    }

    public final void addRemoteAudioTrack(RemoteAudioTrack track) {
        track.getClass();
        if (!this.remoteAudioTracks.contains(track)) {
            this.remoteAudioTracks.add(track);
        }
    }

    @Override // io.elevenlabs.audio.AudioManager
    public void cleanup() {
        g0.D(this.scope, null, null, new LiveKitAudioManager$cleanup$1(this, null), 3);
        g0.i(this.scope, null);
    }

    public final z1 getMuteState() {
        return this.muteState;
    }

    public final z1 getPlaybackState() {
        return this.playbackState;
    }

    public final z1 getRecordingState() {
        return this.recordingState;
    }

    @Override // io.elevenlabs.audio.AudioManager
    public float getVolume() {
        return ((Number) this._volume.getValue()).floatValue();
    }

    public final z1 getVolumeState() {
        return this.volumeState;
    }

    @Override // io.elevenlabs.audio.AudioManager
    public boolean hasAudioPermission() {
        return AudioUtils.INSTANCE.hasAudioPermission(this.context);
    }

    @Override // io.elevenlabs.audio.AudioManager
    public boolean isMuted() {
        return ((Boolean) this._isMuted.getValue()).booleanValue();
    }

    @Override // io.elevenlabs.audio.AudioManager
    public boolean isPlaying() {
        return ((Boolean) this._isPlaying.getValue()).booleanValue();
    }

    @Override // io.elevenlabs.audio.AudioManager
    public boolean isRecording() {
        return ((Boolean) this._isRecording.getValue()).booleanValue();
    }

    public final void removeRemoteAudioTrack(RemoteAudioTrack track) {
        track.getClass();
        this.remoteAudioTracks.remove(track);
    }

    @Override // io.elevenlabs.audio.AudioManager
    public void setAudioStateListener(AudioStateListener listener) {
        this.audioStateListener = listener;
    }

    @Override // io.elevenlabs.audio.AudioManager
    public Object setMicMuted(boolean z6, c<? super z> cVar) {
        try {
            AudioUtils.INSTANCE.setMicrophoneMuted(this.context, z6);
            this._isMuted.setValue(Boolean.valueOf(z6));
            AudioStateListener audioStateListener = this.audioStateListener;
            if (audioStateListener != null) {
                audioStateListener.onMuteStateChanged(z6);
            }
        } catch (Exception e10) {
            AudioStateListener audioStateListener2 = this.audioStateListener;
            if (audioStateListener2 != null) {
                audioStateListener2.onAudioError("Failed to set mute state", e10);
            }
        }
        return z.f31622a;
    }

    @Override // io.elevenlabs.audio.AudioManager
    public void setVolume(float volume) {
        float l4 = l.l(volume, u.P, 1.0f);
        try {
            Iterator<T> it = this.room.getRemoteParticipants().values().iterator();
            while (it.hasNext()) {
                Iterator<T> it2 = ((RemoteParticipant) it.next()).getAudioTrackPublications().iterator();
                while (it2.hasNext()) {
                    Track track = (Track) ((k) it2.next()).f31601b;
                    if (track instanceof RemoteAudioTrack) {
                        ((RemoteAudioTrack) track).setVolume(l4);
                    }
                }
            }
            this._volume.setValue(Float.valueOf(l4));
            AudioStateListener audioStateListener = this.audioStateListener;
            if (audioStateListener != null) {
                audioStateListener.onVolumeChanged(l4);
            }
        } catch (Exception e10) {
            AudioStateListener audioStateListener2 = this.audioStateListener;
            if (audioStateListener2 != null) {
                audioStateListener2.onAudioError("Failed to set volume", e10);
            }
        }
    }

    @Override // io.elevenlabs.audio.AudioManager
    public Object startPlayback(c<? super z> cVar) {
        if (!((Boolean) this._isPlaying.getValue()).booleanValue()) {
            try {
                this._isPlaying.setValue(Boolean.TRUE);
                AudioStateListener audioStateListener = this.audioStateListener;
                if (audioStateListener != null) {
                    audioStateListener.onPlaybackStateChanged(true);
                }
                return z.f31622a;
            } catch (Exception e10) {
                AudioStateListener audioStateListener2 = this.audioStateListener;
                if (audioStateListener2 != null) {
                    audioStateListener2.onAudioError("Failed to start playback", e10);
                }
                throw e10;
            }
        }
        c6.x("Already playing");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00aa A[Catch: Exception -> 0x002e, TRY_LEAVE, TryCatch #0 {Exception -> 0x002e, blocks: (B:11:0x0029, B:12:0x009f, B:14:0x00aa), top: B:10:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // io.elevenlabs.audio.AudioManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object startRecording(c<? super z> cVar) {
        LiveKitAudioManager$startRecording$1 liveKitAudioManager$startRecording$1;
        int i10;
        LiveKitAudioManager liveKitAudioManager;
        String m2548toStringimpl;
        AudioStateListener audioStateListener;
        AudioStateListener audioStateListener2;
        if (cVar instanceof LiveKitAudioManager$startRecording$1) {
            liveKitAudioManager$startRecording$1 = (LiveKitAudioManager$startRecording$1) cVar;
            int i11 = liveKitAudioManager$startRecording$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                liveKitAudioManager$startRecording$1.label = i11 - Integer.MIN_VALUE;
                Object obj = liveKitAudioManager$startRecording$1.result;
                i10 = liveKitAudioManager$startRecording$1.label;
                if (i10 == 0) {
                    if (i10 == 1) {
                        liveKitAudioManager = (LiveKitAudioManager) liveKitAudioManager$startRecording$1.L$0;
                        try {
                            sn.a.g(obj);
                        } catch (Exception e10) {
                            e = e10;
                            audioStateListener = liveKitAudioManager.audioStateListener;
                            if (audioStateListener != null) {
                                audioStateListener.onAudioError("Failed to start recording", e);
                            }
                            android.gov.nist.javax.sip.header.a.s("Failed to start recording - ", e.getMessage(), "LiveKitAudioManager");
                            throw e;
                        }
                    } else {
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    sn.a.g(obj);
                    if (!((Boolean) this._isRecording.getValue()).booleanValue()) {
                        boolean hasAudioPermission = hasAudioPermission();
                        Log.d("LiveKitAudioManager", "Checking audio permission - hasPermission: " + hasAudioPermission + ", context: " + this.context);
                        if (hasAudioPermission) {
                            try {
                                String m2537getSidCC6JpwI = this.room.m2537getSidCC6JpwI();
                                if (m2537getSidCC6JpwI == null) {
                                    m2548toStringimpl = "null";
                                } else {
                                    m2548toStringimpl = Room.Sid.m2548toStringimpl(m2537getSidCC6JpwI);
                                }
                                Log.d("LiveKitAudioManager", "Enabling microphone for roomSid=" + m2548toStringimpl);
                                LocalParticipant localParticipant = this.room.getLocalParticipant();
                                liveKitAudioManager$startRecording$1.L$0 = this;
                                liveKitAudioManager$startRecording$1.label = 1;
                                Object microphoneEnabled = localParticipant.setMicrophoneEnabled(true, liveKitAudioManager$startRecording$1);
                                xn.a aVar = xn.a.f37986a;
                                if (microphoneEnabled == aVar) {
                                    return aVar;
                                }
                                liveKitAudioManager = this;
                            } catch (Exception e11) {
                                e = e11;
                                liveKitAudioManager = this;
                                audioStateListener = liveKitAudioManager.audioStateListener;
                                if (audioStateListener != null) {
                                }
                                android.gov.nist.javax.sip.header.a.s("Failed to start recording - ", e.getMessage(), "LiveKitAudioManager");
                                throw e;
                            }
                        } else {
                            throw new SecurityException("Audio permission not granted");
                        }
                    } else {
                        c6.x("Already recording");
                        return null;
                    }
                }
                liveKitAudioManager._isRecording.setValue(Boolean.TRUE);
                audioStateListener2 = liveKitAudioManager.audioStateListener;
                if (audioStateListener2 != null) {
                    audioStateListener2.onRecordingStateChanged(true);
                }
                return z.f31622a;
            }
        }
        liveKitAudioManager$startRecording$1 = new LiveKitAudioManager$startRecording$1(this, cVar);
        Object obj2 = liveKitAudioManager$startRecording$1.result;
        i10 = liveKitAudioManager$startRecording$1.label;
        if (i10 == 0) {
        }
        liveKitAudioManager._isRecording.setValue(Boolean.TRUE);
        audioStateListener2 = liveKitAudioManager.audioStateListener;
        if (audioStateListener2 != null) {
        }
        return z.f31622a;
    }

    @Override // io.elevenlabs.audio.AudioManager
    public Object stopPlayback(c<? super z> cVar) {
        boolean booleanValue = ((Boolean) this._isPlaying.getValue()).booleanValue();
        z zVar = z.f31622a;
        if (!booleanValue) {
            return zVar;
        }
        try {
            unsubscribeFromRemoteAudioTracks();
            this._isPlaying.setValue(Boolean.FALSE);
            AudioStateListener audioStateListener = this.audioStateListener;
            if (audioStateListener != null) {
                audioStateListener.onPlaybackStateChanged(false);
            }
        } catch (Exception e10) {
            AudioStateListener audioStateListener2 = this.audioStateListener;
            if (audioStateListener2 != null) {
                audioStateListener2.onAudioError("Failed to stop playback", e10);
            }
        }
        return zVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x008e A[Catch: Exception -> 0x0030, TRY_LEAVE, TryCatch #0 {Exception -> 0x0030, blocks: (B:11:0x002c, B:13:0x0081, B:15:0x008e), top: B:10:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // io.elevenlabs.audio.AudioManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object stopRecording(c<? super z> cVar) {
        LiveKitAudioManager$stopRecording$1 liveKitAudioManager$stopRecording$1;
        int i10;
        LiveKitAudioManager liveKitAudioManager;
        String m2548toStringimpl;
        AudioStateListener audioStateListener;
        AudioStateListener audioStateListener2;
        if (cVar instanceof LiveKitAudioManager$stopRecording$1) {
            liveKitAudioManager$stopRecording$1 = (LiveKitAudioManager$stopRecording$1) cVar;
            int i11 = liveKitAudioManager$stopRecording$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                liveKitAudioManager$stopRecording$1.label = i11 - Integer.MIN_VALUE;
                Object obj = liveKitAudioManager$stopRecording$1.result;
                i10 = liveKitAudioManager$stopRecording$1.label;
                z zVar = z.f31622a;
                if (i10 == 0) {
                    if (i10 == 1) {
                        liveKitAudioManager = (LiveKitAudioManager) liveKitAudioManager$stopRecording$1.L$0;
                        try {
                            sn.a.g(obj);
                        } catch (Exception e10) {
                            e = e10;
                            audioStateListener = liveKitAudioManager.audioStateListener;
                            if (audioStateListener != null) {
                                audioStateListener.onAudioError("Failed to stop recording", e);
                            }
                            android.gov.nist.javax.sip.header.a.s("Failed to stop recording - ", e.getMessage(), "LiveKitAudioManager");
                            return zVar;
                        }
                    } else {
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    sn.a.g(obj);
                    if (!((Boolean) this._isRecording.getValue()).booleanValue()) {
                        return zVar;
                    }
                    try {
                        String m2537getSidCC6JpwI = this.room.m2537getSidCC6JpwI();
                        if (m2537getSidCC6JpwI == null) {
                            m2548toStringimpl = "null";
                        } else {
                            m2548toStringimpl = Room.Sid.m2548toStringimpl(m2537getSidCC6JpwI);
                        }
                        Log.d("LiveKitAudioManager", "Disabling microphone for roomSid=" + m2548toStringimpl);
                        LocalParticipant localParticipant = this.room.getLocalParticipant();
                        liveKitAudioManager$stopRecording$1.L$0 = this;
                        liveKitAudioManager$stopRecording$1.label = 1;
                        Object microphoneEnabled = localParticipant.setMicrophoneEnabled(false, liveKitAudioManager$stopRecording$1);
                        xn.a aVar = xn.a.f37986a;
                        if (microphoneEnabled == aVar) {
                            return aVar;
                        }
                        liveKitAudioManager = this;
                    } catch (Exception e11) {
                        e = e11;
                        liveKitAudioManager = this;
                        audioStateListener = liveKitAudioManager.audioStateListener;
                        if (audioStateListener != null) {
                        }
                        android.gov.nist.javax.sip.header.a.s("Failed to stop recording - ", e.getMessage(), "LiveKitAudioManager");
                        return zVar;
                    }
                }
                liveKitAudioManager.localAudioTrack = null;
                liveKitAudioManager._isRecording.setValue(Boolean.FALSE);
                audioStateListener2 = liveKitAudioManager.audioStateListener;
                if (audioStateListener2 != null) {
                    audioStateListener2.onRecordingStateChanged(false);
                }
                return zVar;
            }
        }
        liveKitAudioManager$stopRecording$1 = new LiveKitAudioManager$stopRecording$1(this, cVar);
        Object obj2 = liveKitAudioManager$stopRecording$1.result;
        i10 = liveKitAudioManager$stopRecording$1.label;
        z zVar2 = z.f31622a;
        if (i10 == 0) {
        }
        liveKitAudioManager.localAudioTrack = null;
        liveKitAudioManager._isRecording.setValue(Boolean.FALSE);
        audioStateListener2 = liveKitAudioManager.audioStateListener;
        if (audioStateListener2 != null) {
        }
        return zVar2;
    }
}
