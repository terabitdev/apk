package io.livekit.android.room;

import android.gov.nist.javax.sdp.SessionDescriptionImpl;
import android.gov.nist.javax.sdp.parser.SDPAnnounceParser;
import b.f;
import com.google.protobuf.c6;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import et.d;
import ho.p;
import io.livekit.android.room.util.CoroutineSdpObserverKt;
import io.livekit.android.room.util.MediaConstraintKeys;
import io.livekit.android.room.util.MediaConstraintKeysKt;
import io.livekit.android.util.Either;
import io.livekit.android.util.LKLog;
import io.livekit.android.util.LoggingLevel;
import java.text.ParseException;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.d0;
import kotlin.jvm.internal.m;
import livekit.org.webrtc.MediaConstraints;
import livekit.org.webrtc.PeerConnection;
import livekit.org.webrtc.SessionDescription;
import sn.z;
import wn.c;
import xn.a;
import yn.e;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@e(c = "io.livekit.android.room.PeerConnectionTransport$createAndSendOffer$2", f = "PeerConnectionTransport.kt", l = {167, 175, RCHTTPStatusCodes.CREATED}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class PeerConnectionTransport$createAndSendOffer$2 extends i implements p {
    final /* synthetic */ MediaConstraints $constraints;
    final /* synthetic */ d0 $finalSdp;
    Object L$0;
    int label;
    final /* synthetic */ PeerConnectionTransport this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PeerConnectionTransport$createAndSendOffer$2(MediaConstraints mediaConstraints, PeerConnectionTransport peerConnectionTransport, d0 d0Var, c<? super PeerConnectionTransport$createAndSendOffer$2> cVar) {
        super(2, cVar);
        this.$constraints = mediaConstraints;
        this.this$0 = peerConnectionTransport;
        this.$finalSdp = d0Var;
    }

    @Override // yn.a
    public final c<z> create(Object obj, c<?> cVar) {
        return new PeerConnectionTransport$createAndSendOffer$2(this.$constraints, this.this$0, this.$finalSdp, cVar);
    }

    @Override // ho.p
    public final Object invoke(fr.d0 d0Var, c<? super z> cVar) {
        return ((PeerConnectionTransport$createAndSendOffer$2) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x012f, code lost:
    
        if (r0 == r8) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0131, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00a3, code lost:
    
        if (r0 == r8) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x008b, code lost:
    
        if (io.livekit.android.room.util.CoroutineSdpObserverKt.setRemoteDescription(r0, r9, r11) == r8) goto L53;
     */
    @Override // yn.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object createOffer;
        b.i iVar;
        d0 d0Var;
        Object mungedSdp$default;
        Map map;
        int i10 = this.label;
        z zVar = z.f31622a;
        a aVar = a.f37986a;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        d0 d0Var2 = (d0) this.L$0;
                        sn.a.g(obj);
                        d0Var = d0Var2;
                        mungedSdp$default = obj;
                        d0Var.f20559a = mungedSdp$default;
                        return zVar;
                    }
                    c6.x("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                sn.a.g(obj);
                createOffer = obj;
                Either either = (Either) createOffer;
                if (either instanceof Either.Left) {
                    SessionDescription sessionDescription = (SessionDescription) ((Either.Left) either).getValue();
                    if (!this.this$0.isClosed()) {
                        iVar = this.this$0.sdpFactory;
                        String str = sessionDescription.description;
                        iVar.getClass();
                        try {
                            SessionDescriptionImpl parse = new SDPAnnounceParser(str).parse();
                            Iterator it = parse.getMediaDescriptions(true).iterator();
                            while (it.hasNext()) {
                                Object next = it.next();
                                if (next instanceof f) {
                                    f fVar = (f) next;
                                    if (!m.c(fVar.getMedia().getMediaType(), "audio") && m.c(fVar.getMedia().getMediaType(), "video")) {
                                        PeerConnectionTransportKt.ensureVideoDDExtensionForSVC(fVar);
                                        map = this.this$0.trackBitrates;
                                        PeerConnectionTransportKt.ensureCodecBitrates(fVar, map);
                                    }
                                }
                            }
                            d0Var = this.$finalSdp;
                            PeerConnectionTransport peerConnectionTransport = this.this$0;
                            String sessionDescriptionImpl = parse.toString();
                            this.L$0 = d0Var;
                            this.label = 3;
                            mungedSdp$default = PeerConnectionTransport.setMungedSdp$default(peerConnectionTransport, sessionDescription, sessionDescriptionImpl, false, this, 4, null);
                        } catch (ParseException e10) {
                            e10.printStackTrace();
                            throw new Exception("Could not parse message");
                        }
                    }
                } else if (either instanceof Either.Right) {
                    LKLog.Companion companion = LKLog.INSTANCE;
                    if (LoggingLevel.DEBUG.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && d.d() > 0) {
                        d.a(null, "error creating offer: " + ((String) ((Either.Right) either).getValue()), new Object[0]);
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
            boolean c5 = m.c(MediaConstraintKeysKt.findConstraint(this.$constraints, MediaConstraintKeys.ICE_RESTART), MediaConstraintKeys.TRUE);
            if (c5) {
                LKLog.Companion companion2 = LKLog.INSTANCE;
                if (LoggingLevel.DEBUG.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && d.d() > 0) {
                    d.a(null, "restarting ice", new Object[0]);
                }
                this.this$0.restartingIce = true;
            }
            if (this.this$0.getPeerConnection().signalingState() == PeerConnection.SignalingState.HAVE_LOCAL_OFFER) {
                SessionDescription remoteDescription = this.this$0.getPeerConnection().getRemoteDescription();
                if (!c5 || remoteDescription == null) {
                    this.this$0.renegotiate = true;
                    return zVar;
                }
                PeerConnection peerConnection = this.this$0.getPeerConnection();
                this.label = 1;
            }
        }
        PeerConnection peerConnection2 = this.this$0.getPeerConnection();
        MediaConstraints mediaConstraints = this.$constraints;
        this.label = 2;
        createOffer = CoroutineSdpObserverKt.createOffer(peerConnection2, mediaConstraints, this);
    }
}
