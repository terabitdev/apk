package io.livekit.android.audio;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import com.google.protobuf.c6;
import defpackage.f;
import et.d;
import fr.d0;
import fr.g0;
import fr.z;
import ho.p;
import ho.q;
import io.livekit.android.util.CloseableCoroutineScope;
import io.livekit.android.util.LKLog;
import io.livekit.android.util.LoggingLevel;
import ir.d1;
import ir.j1;
import ir.r;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.k;
import yn.e;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 %2\u00020\u0001:\u0001%B\u0013\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0016\u0010\u0010J\u000f\u0010\u0017\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0017\u0010\u0010J\u000f\u0010\u0018\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0018\u0010\u0010J\u000f\u0010\u0019\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0019\u0010\u0010J\u000f\u0010\u001a\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001a\u0010\u0010R\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001fR\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001fR\u0018\u0010 \u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006&"}, d2 = {"Lio/livekit/android/audio/CommunicationWorkaroundImpl;", "Lio/livekit/android/audio/CommunicationWorkaround;", "Lfr/z;", "dispatcher", "<init>", "(Lfr/z;)V", "", "started", "playoutStopped", "Lsn/z;", "onStateChanged", "(ZZ)V", "Landroid/media/AudioTrack;", "buildAudioTrack", "()Landroid/media/AudioTrack;", "playAudioTrackIfNeeded", "()V", "pauseAudioTrackIfNeeded", "", "audioFormat", "getBytesPerSample", "(I)I", "start", "stop", "onStartPlayout", "onStopPlayout", "dispose", "Lio/livekit/android/util/CloseableCoroutineScope;", "coroutineScope", "Lio/livekit/android/util/CloseableCoroutineScope;", "Lir/j1;", "Lir/j1;", "audioTrack", "Landroid/media/AudioTrack;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isAudioTrackStarted", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Companion", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class CommunicationWorkaroundImpl implements CommunicationWorkaround {
    private static final int AUDIO_FORMAT = 2;
    private static final int AUDIO_FRAME_PER_BUFFER = 160;
    private static final int SAMPLE_RATE = 16000;
    private AudioTrack audioTrack;
    private final CloseableCoroutineScope coroutineScope;
    private final AtomicBoolean isAudioTrackStarted;
    private final j1 playoutStopped;
    private final j1 started;

    public CommunicationWorkaroundImpl(z zVar) {
        zVar.getClass();
        CloseableCoroutineScope closeableCoroutineScope = new CloseableCoroutineScope(zVar);
        this.coroutineScope = closeableCoroutineScope;
        this.started = r.c(Boolean.FALSE);
        this.playoutStopped = r.c(Boolean.TRUE);
        this.isAudioTrackStarted = new AtomicBoolean(false);
        g0.D(closeableCoroutineScope, null, null, new AnonymousClass1(null), 3);
    }

    private final AudioTrack buildAudioTrack() {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(getBytesPerSample(2) * AUDIO_FRAME_PER_BUFFER);
        AudioTrack build = new AudioTrack.Builder().setAudioFormat(new AudioFormat.Builder().setEncoding(2).setSampleRate(SAMPLE_RATE).setChannelMask(4).build()).setAudioAttributes(new AudioAttributes.Builder().setUsage(2).setContentType(1).build()).setBufferSizeInBytes(allocateDirect.capacity()).setTransferMode(0).setSessionId(0).build();
        build.getClass();
        build.write(allocateDirect, allocateDirect.remaining(), 0);
        build.setLoopPoints(0, 159, -1);
        return build;
    }

    private final int getBytesPerSample(int audioFormat) {
        if (audioFormat != 0) {
            int i10 = 1;
            if (audioFormat != 1 && audioFormat != 2) {
                if (audioFormat != 3) {
                    i10 = 4;
                    if (audioFormat != 4) {
                        if (audioFormat != 13) {
                            c6.t(f.e(audioFormat, "Bad audio format "));
                            return 0;
                        }
                    }
                }
                return i10;
            }
            return 2;
        }
        c6.t(f.e(audioFormat, "Bad audio format "));
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onStateChanged(boolean started, boolean playoutStopped) {
        if (started && playoutStopped) {
            playAudioTrackIfNeeded();
        } else {
            pauseAudioTrackIfNeeded();
        }
    }

    private final void pauseAudioTrackIfNeeded() {
        AudioTrack audioTrack;
        if (this.isAudioTrackStarted.compareAndSet(true, false) && (audioTrack = this.audioTrack) != null) {
            synchronized (audioTrack) {
                try {
                    if (audioTrack.getState() == 1) {
                        audioTrack.pause();
                    } else {
                        LKLog.Companion companion = LKLog.INSTANCE;
                        if (LoggingLevel.DEBUG.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && d.d() > 0) {
                            d.a(null, "Attempted to stop communication workaround but track was not initialized.", new Object[0]);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    private final void playAudioTrackIfNeeded() {
        if (!this.isAudioTrackStarted.compareAndSet(false, true)) {
            return;
        }
        AudioTrack audioTrack = this.audioTrack;
        if (audioTrack == null) {
            audioTrack = buildAudioTrack();
            this.audioTrack = audioTrack;
        }
        synchronized (audioTrack) {
            try {
                if (audioTrack.getState() == 1) {
                    audioTrack.play();
                } else {
                    LKLog.Companion companion = LKLog.INSTANCE;
                    if (LoggingLevel.INFO.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && d.d() > 0) {
                        d.c(null, "Attempted to start communication workaround but track was not initialized.", new Object[0]);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.livekit.android.audio.CommunicationWorkaround
    public void dispose() {
        this.coroutineScope.close();
        stop();
        AudioTrack audioTrack = this.audioTrack;
        if (audioTrack != null) {
            synchronized (audioTrack) {
                audioTrack.release();
            }
        }
    }

    @Override // io.livekit.android.audio.CommunicationWorkaround
    public void onStartPlayout() {
        this.playoutStopped.setValue(Boolean.FALSE);
    }

    @Override // io.livekit.android.audio.CommunicationWorkaround
    public void onStopPlayout() {
        this.playoutStopped.setValue(Boolean.TRUE);
    }

    @Override // io.livekit.android.audio.CommunicationWorkaround
    public void start() {
        this.started.setValue(Boolean.TRUE);
    }

    @Override // io.livekit.android.audio.CommunicationWorkaround
    public void stop() {
        this.started.setValue(Boolean.FALSE);
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @e(c = "io.livekit.android.audio.CommunicationWorkaroundImpl$1", f = "CommunicationWorkaround.kt", l = {102}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: io.livekit.android.audio.CommunicationWorkaroundImpl$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends i implements p {
        int label;

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @e(c = "io.livekit.android.audio.CommunicationWorkaroundImpl$1$2", f = "CommunicationWorkaround.kt", l = {}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lsn/k;", "", "<name for destructuring parameter 0>", "Lsn/z;", "<anonymous>", "(Lsn/k;)V"}, k = 3, mv = {1, 9, 0})
        /* renamed from: io.livekit.android.audio.CommunicationWorkaroundImpl$1$2, reason: invalid class name */
        /* loaded from: classes4.dex */
        public static final class AnonymousClass2 extends i implements p {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ CommunicationWorkaroundImpl this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(CommunicationWorkaroundImpl communicationWorkaroundImpl, wn.c<? super AnonymousClass2> cVar) {
                super(2, cVar);
                this.this$0 = communicationWorkaroundImpl;
            }

            @Override // yn.a
            public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, cVar);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // ho.p
            public final Object invoke(k kVar, wn.c<? super sn.z> cVar) {
                return ((AnonymousClass2) create(kVar, cVar)).invokeSuspend(sn.z.f31622a);
            }

            @Override // yn.a
            public final Object invokeSuspend(Object obj) {
                if (this.label == 0) {
                    sn.a.g(obj);
                    k kVar = (k) this.L$0;
                    this.this$0.onStateChanged(((Boolean) kVar.f31600a).booleanValue(), ((Boolean) kVar.f31601b).booleanValue());
                    return sn.z.f31622a;
                }
                c6.x("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }

        public AnonymousClass1(wn.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
        }

        @Override // yn.a
        public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
            return new AnonymousClass1(cVar);
        }

        @Override // ho.p
        public final Object invoke(d0 d0Var, wn.c<? super sn.z> cVar) {
            return ((AnonymousClass1) create(d0Var, cVar)).invokeSuspend(sn.z.f31622a);
        }

        @Override // yn.a
        public final Object invokeSuspend(Object obj) {
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 == 1) {
                    sn.a.g(obj);
                } else {
                    c6.x("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            } else {
                sn.a.g(obj);
                ir.i o6 = r.o(new d1(CommunicationWorkaroundImpl.this.started, CommunicationWorkaroundImpl.this.playoutStopped, new C00501(null), 1));
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(CommunicationWorkaroundImpl.this, null);
                this.label = 1;
                Object l4 = r.l(o6, anonymousClass2, this);
                xn.a aVar = xn.a.f37986a;
                if (l4 == aVar) {
                    return aVar;
                }
            }
            return sn.z.f31622a;
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @e(c = "io.livekit.android.audio.CommunicationWorkaroundImpl$1$1", f = "CommunicationWorkaround.kt", l = {}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "a", "b", "Lsn/k;", "<anonymous>", "(ZZ)Lsn/k;"}, k = 3, mv = {1, 9, 0})
        /* renamed from: io.livekit.android.audio.CommunicationWorkaroundImpl$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C00501 extends i implements q {
            /* synthetic */ boolean Z$0;
            /* synthetic */ boolean Z$1;
            int label;

            public C00501(wn.c<? super C00501> cVar) {
                super(3, cVar);
            }

            @Override // ho.q
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return invoke(((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue(), (wn.c<? super k>) obj3);
            }

            @Override // yn.a
            public final Object invokeSuspend(Object obj) {
                if (this.label == 0) {
                    sn.a.g(obj);
                    return new k(Boolean.valueOf(this.Z$0), Boolean.valueOf(this.Z$1));
                }
                c6.x("call to 'resume' before 'invoke' with coroutine");
                return null;
            }

            public final Object invoke(boolean z6, boolean z10, wn.c<? super k> cVar) {
                C00501 c00501 = new C00501(cVar);
                c00501.Z$0 = z6;
                c00501.Z$1 = z10;
                return c00501.invokeSuspend(sn.z.f31622a);
            }
        }
    }
}
