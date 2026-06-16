package io.livekit.android.audio;

import android.gov.nist.javax.sip.parser.TokenNames;
import com.google.protobuf.c6;
import et.d;
import fr.d0;
import fr.g0;
import ho.l;
import ho.p;
import ig.f;
import io.livekit.android.room.ConnectionState;
import io.livekit.android.room.RTCEngine;
import io.livekit.android.room.Room;
import io.livekit.android.room.participant.Participant;
import io.livekit.android.room.track.LocalAudioTrack;
import io.livekit.android.util.FlowDelegateKt;
import io.livekit.android.util.LKLog;
import io.livekit.android.util.LoggingLevel;
import ir.r;
import ir.w;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;
import tn.o;
import yn.e;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@e(c = "io.livekit.android.audio.PreconnectAudioBufferKt$withPreconnectAudio$2$3$handleSendIfNeeded$2", f = "PreconnectAudioBuffer.kt", l = {238}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {TokenNames.T, "Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class PreconnectAudioBufferKt$withPreconnectAudio$2$3$handleSendIfNeeded$2 extends i implements p {
    final /* synthetic */ LocalAudioTrack $audioTrack;
    final /* synthetic */ l $onError;
    final /* synthetic */ Participant $participant;
    final /* synthetic */ PreconnectAudioBuffer $preconnectAudioBuffer;
    final /* synthetic */ Set<Participant.Identity> $sentIdentities;
    final /* synthetic */ Room $this_withPreconnectAudio;
    final /* synthetic */ String $topic;
    private /* synthetic */ Object L$0;
    int label;

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @e(c = "io.livekit.android.audio.PreconnectAudioBufferKt$withPreconnectAudio$2$3$handleSendIfNeeded$2$2", f = "PreconnectAudioBuffer.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "", TokenNames.T, "it", "Lio/livekit/android/room/ConnectionState;"}, k = 3, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* renamed from: io.livekit.android.audio.PreconnectAudioBufferKt$withPreconnectAudio$2$3$handleSendIfNeeded$2$2, reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass2 extends i implements p {
        /* synthetic */ Object L$0;
        int label;

        public AnonymousClass2(wn.c<? super AnonymousClass2> cVar) {
            super(2, cVar);
        }

        @Override // yn.a
        public final wn.c<z> create(Object obj, wn.c<?> cVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(cVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // ho.p
        public final Object invoke(ConnectionState connectionState, wn.c<? super Boolean> cVar) {
            return ((AnonymousClass2) create(connectionState, cVar)).invokeSuspend(z.f31622a);
        }

        @Override // yn.a
        public final Object invokeSuspend(Object obj) {
            boolean z6;
            if (this.label == 0) {
                sn.a.g(obj);
                if (((ConnectionState) this.L$0) != ConnectionState.CONNECTED) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                return Boolean.valueOf(z6);
            }
            c6.x("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @e(c = "io.livekit.android.audio.PreconnectAudioBufferKt$withPreconnectAudio$2$3$handleSendIfNeeded$2$3", f = "PreconnectAudioBuffer.kt", l = {249}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {TokenNames.T, "Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: io.livekit.android.audio.PreconnectAudioBufferKt$withPreconnectAudio$2$3$handleSendIfNeeded$2$3, reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass3 extends i implements p {
        final /* synthetic */ LocalAudioTrack $audioTrack;
        final /* synthetic */ String $identity;
        final /* synthetic */ l $onError;
        final /* synthetic */ PreconnectAudioBuffer $preconnectAudioBuffer;
        final /* synthetic */ Set<Participant.Identity> $sentIdentities;
        final /* synthetic */ Room $this_withPreconnectAudio;
        final /* synthetic */ String $topic;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(PreconnectAudioBuffer preconnectAudioBuffer, Room room, LocalAudioTrack localAudioTrack, String str, String str2, Set<Participant.Identity> set, l lVar, wn.c<? super AnonymousClass3> cVar) {
            super(2, cVar);
            this.$preconnectAudioBuffer = preconnectAudioBuffer;
            this.$this_withPreconnectAudio = room;
            this.$audioTrack = localAudioTrack;
            this.$identity = str;
            this.$topic = str2;
            this.$sentIdentities = set;
            this.$onError = lVar;
        }

        @Override // yn.a
        public final wn.c<z> create(Object obj, wn.c<?> cVar) {
            return new AnonymousClass3(this.$preconnectAudioBuffer, this.$this_withPreconnectAudio, this.$audioTrack, this.$identity, this.$topic, this.$sentIdentities, this.$onError, cVar);
        }

        @Override // ho.p
        public final Object invoke(d0 d0Var, wn.c<? super z> cVar) {
            return ((AnonymousClass3) create(d0Var, cVar)).invokeSuspend(z.f31622a);
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x0078  */
        @Override // yn.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Exception exc;
            AnonymousClass3 anonymousClass3;
            l lVar;
            Participant.Identity identity;
            int i10 = this.label;
            Participant.Identity identity2 = null;
            try {
                if (i10 != 0) {
                    if (i10 == 1) {
                        sn.a.g(obj);
                        anonymousClass3 = this;
                    } else {
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    sn.a.g(obj);
                    try {
                        PreconnectAudioBuffer preconnectAudioBuffer = this.$preconnectAudioBuffer;
                        Room room = this.$this_withPreconnectAudio;
                        String sid = this.$audioTrack.getSid();
                        String str = this.$identity;
                        if (str != null) {
                            identity = Participant.Identity.m2604boximpl(str);
                        } else {
                            identity = null;
                        }
                        List<Participant.Identity> H = f.H(identity);
                        String str2 = this.$topic;
                        this.label = 1;
                        anonymousClass3 = this;
                        try {
                            Object sendAudioData = preconnectAudioBuffer.sendAudioData(room, sid, H, str2, anonymousClass3);
                            xn.a aVar = xn.a.f37986a;
                            if (sendAudioData == aVar) {
                                return aVar;
                            }
                        } catch (Exception e10) {
                            e = e10;
                            exc = e;
                            LKLog.Companion companion = LKLog.INSTANCE;
                            if (LoggingLevel.WARN.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && d.d() > 0) {
                                d.f(exc, "Error occurred while sending the audio preconnect data.", new Object[0]);
                            }
                            lVar = anonymousClass3.$onError;
                            if (lVar != null) {
                                lVar.invoke(exc);
                            }
                            return z.f31622a;
                        }
                    } catch (Exception e11) {
                        e = e11;
                        anonymousClass3 = this;
                        exc = e;
                        LKLog.Companion companion2 = LKLog.INSTANCE;
                        if (LoggingLevel.WARN.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0) {
                            d.f(exc, "Error occurred while sending the audio preconnect data.", new Object[0]);
                        }
                        lVar = anonymousClass3.$onError;
                        if (lVar != null) {
                        }
                        return z.f31622a;
                    }
                }
                Set<Participant.Identity> set = anonymousClass3.$sentIdentities;
                String str3 = anonymousClass3.$identity;
                if (str3 != null) {
                    identity2 = Participant.Identity.m2604boximpl(str3);
                }
                set.add(identity2);
            } catch (Exception e12) {
                exc = e12;
                anonymousClass3 = this;
            }
            return z.f31622a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreconnectAudioBufferKt$withPreconnectAudio$2$3$handleSendIfNeeded$2(Room room, Participant participant, Set<Participant.Identity> set, LocalAudioTrack localAudioTrack, PreconnectAudioBuffer preconnectAudioBuffer, String str, l lVar, wn.c<? super PreconnectAudioBufferKt$withPreconnectAudio$2$3$handleSendIfNeeded$2> cVar) {
        super(2, cVar);
        this.$this_withPreconnectAudio = room;
        this.$participant = participant;
        this.$sentIdentities = set;
        this.$audioTrack = localAudioTrack;
        this.$preconnectAudioBuffer = preconnectAudioBuffer;
        this.$topic = str;
        this.$onError = lVar;
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        PreconnectAudioBufferKt$withPreconnectAudio$2$3$handleSendIfNeeded$2 preconnectAudioBufferKt$withPreconnectAudio$2$3$handleSendIfNeeded$2 = new PreconnectAudioBufferKt$withPreconnectAudio$2$3$handleSendIfNeeded$2(this.$this_withPreconnectAudio, this.$participant, this.$sentIdentities, this.$audioTrack, this.$preconnectAudioBuffer, this.$topic, this.$onError, cVar);
        preconnectAudioBufferKt$withPreconnectAudio$2$3$handleSendIfNeeded$2.L$0 = obj;
        return preconnectAudioBufferKt$withPreconnectAudio$2$3$handleSendIfNeeded$2;
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, wn.c<? super z> cVar) {
        return ((PreconnectAudioBufferKt$withPreconnectAudio$2$3$handleSendIfNeeded$2) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        d0 d0Var;
        Participant.Identity identity;
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                d0Var = (d0) this.L$0;
                sn.a.g(obj);
            } else {
                c6.x("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            sn.a.g(obj);
            d0Var = (d0) this.L$0;
            w wVar = new w(FlowDelegateKt.getFlow(new kotlin.jvm.internal.p(this.$this_withPreconnectAudio.getEngine()) { // from class: io.livekit.android.audio.PreconnectAudioBufferKt$withPreconnectAudio$2$3$handleSendIfNeeded$2.1
                @Override // kotlin.jvm.internal.p, oo.r
                public Object get() {
                    return ((RTCEngine) this.receiver).getConnectionState();
                }

                public void set(Object obj2) {
                    ((RTCEngine) this.receiver).setConnectionState((ConnectionState) obj2);
                }
            }), new AnonymousClass2(null), 4);
            this.L$0 = d0Var;
            this.label = 1;
            Object k4 = r.k(wVar, this);
            xn.a aVar = xn.a.f37986a;
            if (k4 == aVar) {
                return aVar;
            }
        }
        Participant.Kind kind = this.$participant.getKind();
        Participant.State state = this.$participant.getState();
        String m2596getIdentity4WamZwg = this.$participant.m2596getIdentity4WamZwg();
        Set<Participant.Identity> set = this.$sentIdentities;
        if (m2596getIdentity4WamZwg != null) {
            identity = Participant.Identity.m2604boximpl(m2596getIdentity4WamZwg);
        } else {
            identity = null;
        }
        boolean m02 = o.m0(set, identity);
        z zVar = z.f31622a;
        if (!m02 && kind == Participant.Kind.AGENT && state == Participant.State.ACTIVE && m2596getIdentity4WamZwg != null) {
            PreconnectAudioBufferKt$withPreconnectAudio$2.invokeSuspend$stopRecording(this.$this_withPreconnectAudio, this.$audioTrack, this.$preconnectAudioBuffer);
            g0.D(d0Var, null, null, new AnonymousClass3(this.$preconnectAudioBuffer, this.$this_withPreconnectAudio, this.$audioTrack, m2596getIdentity4WamZwg, this.$topic, this.$sentIdentities, this.$onError, null), 3);
        }
        return zVar;
    }
}
