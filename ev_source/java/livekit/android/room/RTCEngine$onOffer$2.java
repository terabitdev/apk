package io.livekit.android.room;

import com.google.protobuf.c6;
import defpackage.f;
import et.d;
import fr.d0;
import ho.p;
import io.livekit.android.util.Either;
import io.livekit.android.util.EitherKt;
import io.livekit.android.util.LKLog;
import io.livekit.android.util.LoggingLevel;
import kotlin.Metadata;
import livekit.org.webrtc.SessionDescription;
import sn.z;
import wn.c;
import xn.a;
import yn.e;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@e(c = "io.livekit.android.room.RTCEngine$onOffer$2", f = "RTCEngine.kt", l = {1016, 1031, 1045}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class RTCEngine$onOffer$2 extends i implements p {
    final /* synthetic */ SessionDescription $sessionDescription;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ RTCEngine this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RTCEngine$onOffer$2(RTCEngine rTCEngine, SessionDescription sessionDescription, c<? super RTCEngine$onOffer$2> cVar) {
        super(2, cVar);
        this.this$0 = rTCEngine;
        this.$sessionDescription = sessionDescription;
    }

    @Override // yn.a
    public final c<z> create(Object obj, c<?> cVar) {
        RTCEngine$onOffer$2 rTCEngine$onOffer$2 = new RTCEngine$onOffer$2(this.this$0, this.$sessionDescription, cVar);
        rTCEngine$onOffer$2.L$0 = obj;
        return rTCEngine$onOffer$2;
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, c<? super z> cVar) {
        return ((RTCEngine$onOffer$2) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00df, code lost:
    
        if (r10 == r7) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00e1, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00a8, code lost:
    
        if (r10 == r7) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0048, code lost:
    
        if (r10 == r7) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0089  */
    @Override // yn.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        PeerConnectionTransport peerConnectionTransport;
        Either either;
        Either nullSafe;
        boolean z6;
        PeerConnectionTransport peerConnectionTransport2;
        Either either2;
        Either nullSafe2;
        SessionDescription sessionDescription;
        boolean z10;
        PeerConnectionTransport peerConnectionTransport3;
        Either either3;
        Either nullSafe3;
        boolean z11;
        int i10 = this.label;
        z zVar = z.f31622a;
        a aVar = a.f37986a;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        sessionDescription = (SessionDescription) this.L$0;
                        sn.a.g(obj);
                        either3 = (Either) obj;
                        nullSafe3 = EitherKt.nullSafe(either3);
                        if (!(nullSafe3 instanceof Either.Left) || !(nullSafe3 instanceof Either.Right)) {
                            z11 = this.this$0.isClosed;
                            if (!z11) {
                                this.this$0.getClient().sendAnswer(sessionDescription);
                                return zVar;
                            }
                        } else {
                            LKLog.Companion companion = LKLog.INSTANCE;
                            if (LoggingLevel.ERROR.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && d.d() > 0) {
                                d.b(null, "error setting local description for answer: " + ((String) ((Either.Right) nullSafe3).getValue()), new Object[0]);
                                return zVar;
                            }
                        }
                        return zVar;
                    }
                    c6.x("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                sn.a.g(obj);
                either2 = (Either) obj;
                nullSafe2 = EitherKt.nullSafe(either2);
                if (!(nullSafe2 instanceof Either.Left)) {
                    sessionDescription = (SessionDescription) ((Either.Left) nullSafe2).getValue();
                    z10 = this.this$0.isClosed;
                    if (!z10) {
                        peerConnectionTransport3 = this.this$0.subscriber;
                        if (peerConnectionTransport3 != null) {
                            RTCEngine$onOffer$2$2$outcome$1 rTCEngine$onOffer$2$2$outcome$1 = new RTCEngine$onOffer$2$2$outcome$1(sessionDescription, null);
                            this.L$0 = sessionDescription;
                            this.label = 3;
                            obj = peerConnectionTransport3.withPeerConnection(rTCEngine$onOffer$2$2$outcome$1, this);
                        } else {
                            either3 = null;
                            nullSafe3 = EitherKt.nullSafe(either3);
                            if (!(nullSafe3 instanceof Either.Left)) {
                            }
                            z11 = this.this$0.isClosed;
                            if (!z11) {
                            }
                        }
                    }
                } else if (nullSafe2 instanceof Either.Right) {
                    LKLog.Companion companion2 = LKLog.INSTANCE;
                    if (LoggingLevel.ERROR.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && d.d() > 0) {
                        d.b(null, "error creating answer: " + ((String) ((Either.Right) nullSafe2).getValue()), new Object[0]);
                    }
                } else {
                    c6.p();
                    return null;
                }
                return zVar;
            }
            sn.a.g(obj);
        } else {
            sn.a.g(obj);
            d0 d0Var = (d0) this.L$0;
            RTCEngine rTCEngine = this.this$0;
            SessionDescription sessionDescription2 = this.$sessionDescription;
            peerConnectionTransport = rTCEngine.subscriber;
            if (peerConnectionTransport != null) {
                this.L$0 = d0Var;
                this.label = 1;
                obj = peerConnectionTransport.setRemoteDescription(sessionDescription2, this);
            } else {
                either = null;
                nullSafe = EitherKt.nullSafe(either);
                if (nullSafe instanceof Either.Right) {
                    z6 = this.this$0.isClosed;
                    if (!z6) {
                        peerConnectionTransport2 = this.this$0.subscriber;
                        if (peerConnectionTransport2 != null) {
                            RTCEngine$onOffer$2$answer$1$outcome$1 rTCEngine$onOffer$2$answer$1$outcome$1 = new RTCEngine$onOffer$2$answer$1$outcome$1(null);
                            this.L$0 = null;
                            this.label = 2;
                            obj = peerConnectionTransport2.withPeerConnection(rTCEngine$onOffer$2$answer$1$outcome$1, this);
                        } else {
                            either2 = null;
                            nullSafe2 = EitherKt.nullSafe(either2);
                            if (!(nullSafe2 instanceof Either.Left)) {
                            }
                        }
                    }
                } else {
                    LKLog.Companion companion3 = LKLog.INSTANCE;
                    if (LoggingLevel.ERROR.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && d.d() > 0) {
                        d.b(null, f.m(new StringBuilder("error setting remote description for answer: "), (String) ((Either.Right) nullSafe).getValue(), ' '), new Object[0]);
                        return zVar;
                    }
                }
                return zVar;
            }
        }
        either = (Either) obj;
        nullSafe = EitherKt.nullSafe(either);
        if (nullSafe instanceof Either.Right) {
        }
        return zVar;
    }
}
