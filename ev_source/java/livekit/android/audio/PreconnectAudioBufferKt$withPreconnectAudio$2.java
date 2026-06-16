package io.livekit.android.audio;

import android.gov.nist.javax.sip.parser.TokenNames;
import com.google.protobuf.c6;
import et.d;
import fr.d0;
import fr.g0;
import ho.l;
import ho.p;
import io.livekit.android.audio.PreconnectAudioBufferKt$withPreconnectAudio$2;
import io.livekit.android.events.EventListenable;
import io.livekit.android.events.RoomEvent;
import io.livekit.android.room.Room;
import io.livekit.android.room.participant.Participant;
import io.livekit.android.room.track.LocalAudioTrack;
import io.livekit.android.util.LKLog;
import io.livekit.android.util.LoggingLevel;
import ir.j;
import ir.n1;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import sn.z;
import yn.e;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@e(c = "io.livekit.android.audio.PreconnectAudioBufferKt$withPreconnectAudio$2", f = "PreconnectAudioBuffer.kt", l = {293}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {TokenNames.T, "Lfr/d0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class PreconnectAudioBufferKt$withPreconnectAudio$2 extends i implements p {
    final /* synthetic */ l $onError;
    final /* synthetic */ l $operation;
    final /* synthetic */ Room $this_withPreconnectAudio;
    final /* synthetic */ long $timeout;
    final /* synthetic */ String $topic;
    private /* synthetic */ Object L$0;
    int label;

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @e(c = "io.livekit.android.audio.PreconnectAudioBufferKt$withPreconnectAudio$2$2", f = "PreconnectAudioBuffer.kt", l = {228}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {TokenNames.T, "Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: io.livekit.android.audio.PreconnectAudioBufferKt$withPreconnectAudio$2$2, reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass2 extends i implements p {
        final /* synthetic */ PreconnectAudioBuffer $preconnectAudioBuffer;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(PreconnectAudioBuffer preconnectAudioBuffer, wn.c<? super AnonymousClass2> cVar) {
            super(2, cVar);
            this.$preconnectAudioBuffer = preconnectAudioBuffer;
        }

        @Override // yn.a
        public final wn.c<z> create(Object obj, wn.c<?> cVar) {
            return new AnonymousClass2(this.$preconnectAudioBuffer, cVar);
        }

        @Override // ho.p
        public final Object invoke(d0 d0Var, wn.c<? super z> cVar) {
            return ((AnonymousClass2) create(d0Var, cVar)).invokeSuspend(z.f31622a);
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
                long m2515getTIMEOUTUwyO8pc = PreconnectAudioBuffer.INSTANCE.m2515getTIMEOUTUwyO8pc();
                this.label = 1;
                Object n2 = g0.n(m2515getTIMEOUTUwyO8pc, this);
                xn.a aVar = xn.a.f37986a;
                if (n2 == aVar) {
                    return aVar;
                }
            }
            this.$preconnectAudioBuffer.clear();
            return z.f31622a;
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @e(c = "io.livekit.android.audio.PreconnectAudioBufferKt$withPreconnectAudio$2$3", f = "PreconnectAudioBuffer.kt", l = {302}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {TokenNames.T, "Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: io.livekit.android.audio.PreconnectAudioBufferKt$withPreconnectAudio$2$3, reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass3 extends i implements p {
        final /* synthetic */ LocalAudioTrack $audioTrack;
        final /* synthetic */ l $onError;
        final /* synthetic */ PreconnectAudioBuffer $preconnectAudioBuffer;
        final /* synthetic */ Set<Participant.Identity> $sentIdentities;
        final /* synthetic */ Room $this_withPreconnectAudio;
        final /* synthetic */ String $topic;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(Room room, LocalAudioTrack localAudioTrack, PreconnectAudioBuffer preconnectAudioBuffer, Set<Participant.Identity> set, String str, l lVar, wn.c<? super AnonymousClass3> cVar) {
            super(2, cVar);
            this.$this_withPreconnectAudio = room;
            this.$audioTrack = localAudioTrack;
            this.$preconnectAudioBuffer = preconnectAudioBuffer;
            this.$sentIdentities = set;
            this.$topic = str;
            this.$onError = lVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object invokeSuspend$handleSendIfNeeded(Room room, Set<Participant.Identity> set, LocalAudioTrack localAudioTrack, PreconnectAudioBuffer preconnectAudioBuffer, String str, l lVar, Participant participant, wn.c<? super z> cVar) {
            Object l4 = g0.l(new PreconnectAudioBufferKt$withPreconnectAudio$2$3$handleSendIfNeeded$2(room, participant, set, localAudioTrack, preconnectAudioBuffer, str, lVar, null), cVar);
            if (l4 == xn.a.f37986a) {
                return l4;
            }
            return z.f31622a;
        }

        @Override // yn.a
        public final wn.c<z> create(Object obj, wn.c<?> cVar) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$this_withPreconnectAudio, this.$audioTrack, this.$preconnectAudioBuffer, this.$sentIdentities, this.$topic, this.$onError, cVar);
            anonymousClass3.L$0 = obj;
            return anonymousClass3;
        }

        @Override // ho.p
        public final Object invoke(d0 d0Var, wn.c<? super z> cVar) {
            return ((AnonymousClass3) create(d0Var, cVar)).invokeSuspend(z.f31622a);
        }

        @Override // yn.a
        public final Object invokeSuspend(Object obj) {
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 != 1) {
                    c6.x("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                sn.a.g(obj);
            } else {
                sn.a.g(obj);
                final d0 d0Var = (d0) this.L$0;
                EventListenable<RoomEvent> events = this.$this_withPreconnectAudio.getEvents();
                final Room room = this.$this_withPreconnectAudio;
                final LocalAudioTrack localAudioTrack = this.$audioTrack;
                final PreconnectAudioBuffer preconnectAudioBuffer = this.$preconnectAudioBuffer;
                final Set<Participant.Identity> set = this.$sentIdentities;
                final String str = this.$topic;
                final l lVar = this.$onError;
                n1 events2 = events.getEvents();
                j jVar = new j() { // from class: io.livekit.android.audio.PreconnectAudioBufferKt$withPreconnectAudio$2$3$invokeSuspend$$inlined$collect$1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // ir.j
                    public final Object emit(T t10, wn.c<? super z> cVar) {
                        Object invokeSuspend$handleSendIfNeeded;
                        Object invokeSuspend$handleSendIfNeeded2;
                        RoomEvent roomEvent = (RoomEvent) t10;
                        if (roomEvent instanceof RoomEvent.LocalTrackSubscribed) {
                            LKLog.Companion companion = LKLog.INSTANCE;
                            if (LoggingLevel.INFO.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && d.d() > 0) {
                                d.c(null, "Local audio track has been subscribed to, stopping preconnect audio recording.", new Object[0]);
                            }
                            PreconnectAudioBufferKt$withPreconnectAudio$2.invokeSuspend$stopRecording(room, localAudioTrack, preconnectAudioBuffer);
                        } else {
                            boolean z6 = roomEvent instanceof RoomEvent.ParticipantConnected;
                            xn.a aVar = xn.a.f37986a;
                            if (z6) {
                                invokeSuspend$handleSendIfNeeded2 = PreconnectAudioBufferKt$withPreconnectAudio$2.AnonymousClass3.invokeSuspend$handleSendIfNeeded(room, set, localAudioTrack, preconnectAudioBuffer, str, lVar, ((RoomEvent.ParticipantConnected) roomEvent).getParticipant(), cVar);
                                if (invokeSuspend$handleSendIfNeeded2 == aVar) {
                                    return invokeSuspend$handleSendIfNeeded2;
                                }
                            } else if (roomEvent instanceof RoomEvent.ParticipantStateChanged) {
                                invokeSuspend$handleSendIfNeeded = PreconnectAudioBufferKt$withPreconnectAudio$2.AnonymousClass3.invokeSuspend$handleSendIfNeeded(room, set, localAudioTrack, preconnectAudioBuffer, str, lVar, ((RoomEvent.ParticipantStateChanged) roomEvent).getParticipant(), cVar);
                                if (invokeSuspend$handleSendIfNeeded == aVar) {
                                    return invokeSuspend$handleSendIfNeeded;
                                }
                            } else if (roomEvent instanceof RoomEvent.Disconnected) {
                                g0.i(d0.this, null);
                            }
                        }
                        return z.f31622a;
                    }
                };
                this.label = 1;
                Object collect = events2.collect(jVar, this);
                xn.a aVar = xn.a.f37986a;
                if (collect == aVar) {
                    return aVar;
                }
            }
            c6.u();
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreconnectAudioBufferKt$withPreconnectAudio$2(Room room, long j4, l lVar, String str, l lVar2, wn.c<? super PreconnectAudioBufferKt$withPreconnectAudio$2> cVar) {
        super(2, cVar);
        this.$this_withPreconnectAudio = room;
        this.$timeout = j4;
        this.$operation = lVar;
        this.$topic = str;
        this.$onError = lVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$stopRecording(Room room, LocalAudioTrack localAudioTrack, PreconnectAudioBuffer preconnectAudioBuffer) {
        if (!room.isPrerecording$livekit_android_sdk_release()) {
            return;
        }
        LKLog.Companion companion = LKLog.INSTANCE;
        if (LoggingLevel.VERBOSE.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && d.d() > 0) {
            d.e(null, "Stopping preconnect audio buffer", new Object[0]);
        }
        localAudioTrack.removeSink(preconnectAudioBuffer);
        preconnectAudioBuffer.stopRecording();
        room.setPrerecording$livekit_android_sdk_release(false);
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        PreconnectAudioBufferKt$withPreconnectAudio$2 preconnectAudioBufferKt$withPreconnectAudio$2 = new PreconnectAudioBufferKt$withPreconnectAudio$2(this.$this_withPreconnectAudio, this.$timeout, this.$operation, this.$topic, this.$onError, cVar);
        preconnectAudioBufferKt$withPreconnectAudio$2.L$0 = obj;
        return preconnectAudioBufferKt$withPreconnectAudio$2;
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, wn.c<? super T> cVar) {
        return ((PreconnectAudioBufferKt$withPreconnectAudio$2) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        d0 d0Var;
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                d0Var = (d0) this.L$0;
                try {
                    sn.a.g(obj);
                    return obj;
                } catch (Exception e10) {
                    e = e10;
                }
            } else {
                c6.x("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            sn.a.g(obj);
            d0 d0Var2 = (d0) this.L$0;
            this.$this_withPreconnectAudio.setPrerecording$livekit_android_sdk_release(true);
            LocalAudioTrack orCreateDefaultAudioTrack = this.$this_withPreconnectAudio.getLocalParticipant().getOrCreateDefaultAudioTrack();
            PreconnectAudioBuffer preconnectAudioBuffer = new PreconnectAudioBuffer(this.$timeout, null);
            LKLog.Companion companion = LKLog.INSTANCE;
            if (LoggingLevel.VERBOSE.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && d.d() > 0) {
                d.e(null, "Starting preconnect audio buffer", new Object[0]);
            }
            preconnectAudioBuffer.startRecording();
            orCreateDefaultAudioTrack.addSink(preconnectAudioBuffer);
            orCreateDefaultAudioTrack.prewarm();
            g0.D(d0Var2, null, null, new AnonymousClass2(preconnectAudioBuffer, null), 3);
            g0.D(d0Var2, null, null, new AnonymousClass3(this.$this_withPreconnectAudio, orCreateDefaultAudioTrack, preconnectAudioBuffer, new LinkedHashSet(), this.$topic, this.$onError, null), 3);
            try {
                l lVar = this.$operation;
                this.L$0 = d0Var2;
                this.label = 1;
                Object invoke = lVar.invoke(this);
                xn.a aVar = xn.a.f37986a;
                if (invoke == aVar) {
                    return aVar;
                }
                return invoke;
            } catch (Exception e11) {
                e = e11;
                d0Var = d0Var2;
            }
        }
        Exception exc = e;
        g0.i(d0Var, null);
        throw exc;
    }
}
