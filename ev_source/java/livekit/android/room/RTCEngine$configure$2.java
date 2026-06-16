package io.livekit.android.room;

import com.google.protobuf.c6;
import fr.d0;
import fr.g0;
import ho.p;
import io.livekit.android.ConnectOptions;
import io.livekit.android.room.PeerConnectionTransport;
import io.livekit.android.util.Either;
import kotlin.Metadata;
import livekit.LivekitRtc$JoinResponse;
import livekit.org.webrtc.DataChannel;
import livekit.org.webrtc.PeerConnection;
import or.a;
import sn.z;
import wn.c;
import yn.e;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@e(c = "io.livekit.android.room.RTCEngine$configure$2", f = "RTCEngine.kt", l = {1550, 282, 288, 330, 354}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class RTCEngine$configure$2 extends i implements p {
    final /* synthetic */ ConnectOptions $connectOptions;
    final /* synthetic */ LivekitRtc$JoinResponse $joinResponse;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    final /* synthetic */ RTCEngine this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RTCEngine$configure$2(RTCEngine rTCEngine, LivekitRtc$JoinResponse livekitRtc$JoinResponse, ConnectOptions connectOptions, c<? super RTCEngine$configure$2> cVar) {
        super(2, cVar);
        this.this$0 = rTCEngine;
        this.$joinResponse = livekitRtc$JoinResponse;
        this.$connectOptions = connectOptions;
    }

    @Override // yn.a
    public final c<z> create(Object obj, c<?> cVar) {
        RTCEngine$configure$2 rTCEngine$configure$2 = new RTCEngine$configure$2(this.this$0, this.$joinResponse, this.$connectOptions, cVar);
        rTCEngine$configure$2.L$0 = obj;
        return rTCEngine$configure$2;
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, c<? super z> cVar) {
        return ((RTCEngine$configure$2) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x01f9 A[Catch: all -> 0x0044, TRY_LEAVE, TryCatch #1 {all -> 0x0044, blocks: (B:24:0x003f, B:25:0x01dd, B:26:0x01e3, B:28:0x01f9), top: B:23:0x003f }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x018a A[Catch: all -> 0x0061, TryCatch #0 {all -> 0x0061, blocks: (B:38:0x005c, B:40:0x0170, B:42:0x018a, B:43:0x01b1, B:45:0x01c1, B:50:0x01aa), top: B:37:0x005c }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01c1 A[Catch: all -> 0x0061, TRY_LEAVE, TryCatch #0 {all -> 0x0061, blocks: (B:38:0x005c, B:40:0x0170, B:42:0x018a, B:43:0x01b1, B:45:0x01c1, B:50:0x01aa), top: B:37:0x005c }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01aa A[Catch: all -> 0x0061, TryCatch #0 {all -> 0x0061, blocks: (B:38:0x005c, B:40:0x0170, B:42:0x018a, B:43:0x01b1, B:45:0x01c1, B:50:0x01aa), top: B:37:0x005c }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x014d A[Catch: all -> 0x007e, TRY_LEAVE, TryCatch #3 {all -> 0x007e, blocks: (B:55:0x0079, B:57:0x0134, B:59:0x014d), top: B:54:0x0079 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x016c  */
    @Override // yn.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        d0 d0Var;
        a aVar;
        RTCEngine rTCEngine;
        LivekitRtc$JoinResponse livekitRtc$JoinResponse;
        ConnectOptions connectOptions;
        RTCEngine rTCEngine2;
        PeerConnectionTransport peerConnectionTransport;
        a aVar2;
        String str;
        PeerConnection.RTCConfiguration makeRTCConfig;
        a aVar3;
        PeerConnection.RTCConfiguration rTCConfiguration;
        RTCEngine rTCEngine3;
        d0 d0Var2;
        PeerConnectionTransport peerConnectionTransport2;
        PeerConnectionTransport.Factory factory;
        PublisherTransportObserver publisherTransportObserver;
        PublisherTransportObserver publisherTransportObserver2;
        PeerConnectionTransport peerConnectionTransport3;
        a aVar4;
        d0 d0Var3;
        PeerConnection.RTCConfiguration rTCConfiguration2;
        RTCEngine rTCEngine4;
        LivekitRtc$JoinResponse livekitRtc$JoinResponse2;
        RTCEngine rTCEngine5;
        d0 d0Var4;
        PeerConnectionTransport.Factory factory2;
        SubscriberTransportObserver subscriberTransportObserver;
        PublisherTransportObserver publisherTransportObserver3;
        PeerConnectionTransport publisher;
        a aVar5;
        DataChannel dataChannel;
        RTCEngine rTCEngine6;
        SubscriberTransportObserver subscriberTransportObserver2;
        SubscriberTransportObserver subscriberTransportObserver3;
        PublisherTransportObserver publisherTransportObserver4;
        PeerConnectionTransport publisher2;
        DataChannel dataChannel2;
        RTCEngine rTCEngine7;
        int i10 = this.label;
        z zVar = z.f31622a;
        xn.a aVar6 = xn.a.f37986a;
        try {
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            if (i10 != 4) {
                                if (i10 == 5) {
                                    rTCEngine7 = (RTCEngine) this.L$1;
                                    aVar2 = (a) this.L$0;
                                    try {
                                        sn.a.g(obj);
                                        dataChannel2 = (DataChannel) obj;
                                        rTCEngine6 = rTCEngine7;
                                        rTCEngine6.lossyDataChannel = dataChannel2;
                                        aVar2.n(null);
                                        return zVar;
                                    } catch (Throwable th) {
                                        th = th;
                                        aVar2.n(null);
                                        throw th;
                                    }
                                }
                                c6.x("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            rTCEngine4 = (RTCEngine) this.L$3;
                            aVar5 = (a) this.L$2;
                            rTCEngine6 = (RTCEngine) this.L$1;
                            d0Var3 = (d0) this.L$0;
                            try {
                                sn.a.g(obj);
                                dataChannel = (DataChannel) obj;
                                rTCEngine4.reliableDataChannel = dataChannel;
                                g0.o(d0Var3);
                                DataChannel.Init init = new DataChannel.Init();
                                init.ordered = false;
                                init.maxRetransmits = 0;
                                publisher2 = rTCEngine6.getPublisher();
                                if (publisher2 != null) {
                                    RTCEngine$configure$2$2$4 rTCEngine$configure$2$2$4 = new RTCEngine$configure$2$2$4(init, rTCEngine6, null);
                                    this.L$0 = aVar5;
                                    this.L$1 = rTCEngine6;
                                    this.L$2 = null;
                                    this.L$3 = null;
                                    this.L$4 = null;
                                    this.L$5 = null;
                                    this.label = 5;
                                    obj = publisher2.withPeerConnection(rTCEngine$configure$2$2$4, this);
                                    if (obj != aVar6) {
                                        aVar2 = aVar5;
                                        rTCEngine7 = rTCEngine6;
                                        dataChannel2 = (DataChannel) obj;
                                        rTCEngine6 = rTCEngine7;
                                        rTCEngine6.lossyDataChannel = dataChannel2;
                                        aVar2.n(null);
                                        return zVar;
                                    }
                                    return aVar6;
                                }
                                aVar2 = aVar5;
                                dataChannel2 = null;
                                rTCEngine6.lossyDataChannel = dataChannel2;
                                aVar2.n(null);
                                return zVar;
                            } catch (Throwable th2) {
                                th = th2;
                                aVar2 = aVar5;
                                aVar2.n(null);
                                throw th;
                            }
                        }
                        rTCConfiguration = (PeerConnection.RTCConfiguration) this.L$4;
                        aVar4 = (a) this.L$3;
                        livekitRtc$JoinResponse2 = (LivekitRtc$JoinResponse) this.L$2;
                        rTCEngine5 = (RTCEngine) this.L$1;
                        d0Var4 = (d0) this.L$0;
                        try {
                            sn.a.g(obj);
                            rTCConfiguration2 = rTCConfiguration;
                            rTCEngine4 = rTCEngine5;
                            livekitRtc$JoinResponse = livekitRtc$JoinResponse2;
                            d0Var3 = d0Var4;
                            factory2 = rTCEngine4.pctFactory;
                            subscriberTransportObserver = rTCEngine4.subscriberObserver;
                            rTCEngine4.subscriber = factory2.create(rTCConfiguration2, subscriberTransportObserver, null);
                            RTCEngine$configure$2$2$connectionStateListener$1 rTCEngine$configure$2$2$connectionStateListener$1 = new RTCEngine$configure$2$2$connectionStateListener$1(rTCEngine4);
                            if (livekitRtc$JoinResponse.getSubscriberPrimary()) {
                                subscriberTransportObserver2 = rTCEngine4.subscriberObserver;
                                subscriberTransportObserver2.setDataChannelListener(new RTCEngine$configure$2$2$1(rTCEngine4));
                                subscriberTransportObserver3 = rTCEngine4.subscriberObserver;
                                subscriberTransportObserver3.setConnectionChangeListener(rTCEngine$configure$2$2$connectionStateListener$1);
                                publisherTransportObserver4 = rTCEngine4.publisherObserver;
                                publisherTransportObserver4.setConnectionChangeListener(new RTCEngine$configure$2$2$2(rTCEngine4));
                            } else {
                                publisherTransportObserver3 = rTCEngine4.publisherObserver;
                                publisherTransportObserver3.setConnectionChangeListener(rTCEngine$configure$2$2$connectionStateListener$1);
                            }
                            g0.o(d0Var3);
                            DataChannel.Init init2 = new DataChannel.Init();
                            init2.ordered = true;
                            publisher = rTCEngine4.getPublisher();
                            if (publisher != null) {
                                RTCEngine$configure$2$2$3 rTCEngine$configure$2$2$3 = new RTCEngine$configure$2$2$3(init2, rTCEngine4, null);
                                this.L$0 = d0Var3;
                                this.L$1 = rTCEngine4;
                                this.L$2 = aVar4;
                                this.L$3 = rTCEngine4;
                                this.L$4 = null;
                                this.L$5 = null;
                                this.label = 4;
                                obj = publisher.withPeerConnection(rTCEngine$configure$2$2$3, this);
                                if (obj != aVar6) {
                                    aVar5 = aVar4;
                                    rTCEngine6 = rTCEngine4;
                                    dataChannel = (DataChannel) obj;
                                    rTCEngine4.reliableDataChannel = dataChannel;
                                    g0.o(d0Var3);
                                    DataChannel.Init init3 = new DataChannel.Init();
                                    init3.ordered = false;
                                    init3.maxRetransmits = 0;
                                    publisher2 = rTCEngine6.getPublisher();
                                    if (publisher2 != null) {
                                    }
                                }
                                return aVar6;
                            }
                            aVar5 = aVar4;
                            dataChannel = null;
                            rTCEngine6 = rTCEngine4;
                            rTCEngine4.reliableDataChannel = dataChannel;
                            g0.o(d0Var3);
                            DataChannel.Init init32 = new DataChannel.Init();
                            init32.ordered = false;
                            init32.maxRetransmits = 0;
                            publisher2 = rTCEngine6.getPublisher();
                            if (publisher2 != null) {
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            aVar2 = aVar4;
                            aVar2.n(null);
                            throw th;
                        }
                    } else {
                        rTCConfiguration = (PeerConnection.RTCConfiguration) this.L$4;
                        aVar3 = (a) this.L$3;
                        livekitRtc$JoinResponse = (LivekitRtc$JoinResponse) this.L$2;
                        rTCEngine3 = (RTCEngine) this.L$1;
                        d0Var2 = (d0) this.L$0;
                        try {
                            sn.a.g(obj);
                            d0Var = d0Var2;
                            factory = rTCEngine3.pctFactory;
                            publisherTransportObserver = rTCEngine3.publisherObserver;
                            publisherTransportObserver2 = rTCEngine3.publisherObserver;
                            rTCEngine3.setPublisher$livekit_android_sdk_release(factory.create(rTCConfiguration, publisherTransportObserver, publisherTransportObserver2));
                            peerConnectionTransport3 = rTCEngine3.subscriber;
                            if (peerConnectionTransport3 != null) {
                                this.L$0 = d0Var;
                                this.L$1 = rTCEngine3;
                                this.L$2 = livekitRtc$JoinResponse;
                                this.L$3 = aVar3;
                                this.L$4 = rTCConfiguration;
                                this.L$5 = null;
                                this.label = 3;
                                if (peerConnectionTransport3.close(this) != aVar6) {
                                    aVar4 = aVar3;
                                    livekitRtc$JoinResponse2 = livekitRtc$JoinResponse;
                                    rTCEngine5 = rTCEngine3;
                                    d0Var4 = d0Var;
                                    rTCConfiguration2 = rTCConfiguration;
                                    rTCEngine4 = rTCEngine5;
                                    livekitRtc$JoinResponse = livekitRtc$JoinResponse2;
                                    d0Var3 = d0Var4;
                                    factory2 = rTCEngine4.pctFactory;
                                    subscriberTransportObserver = rTCEngine4.subscriberObserver;
                                    rTCEngine4.subscriber = factory2.create(rTCConfiguration2, subscriberTransportObserver, null);
                                    RTCEngine$configure$2$2$connectionStateListener$1 rTCEngine$configure$2$2$connectionStateListener$12 = new RTCEngine$configure$2$2$connectionStateListener$1(rTCEngine4);
                                    if (livekitRtc$JoinResponse.getSubscriberPrimary()) {
                                    }
                                    g0.o(d0Var3);
                                    DataChannel.Init init22 = new DataChannel.Init();
                                    init22.ordered = true;
                                    publisher = rTCEngine4.getPublisher();
                                    if (publisher != null) {
                                    }
                                }
                                return aVar6;
                            }
                            aVar4 = aVar3;
                            d0Var3 = d0Var;
                            rTCConfiguration2 = rTCConfiguration;
                            rTCEngine4 = rTCEngine3;
                            factory2 = rTCEngine4.pctFactory;
                            subscriberTransportObserver = rTCEngine4.subscriberObserver;
                            rTCEngine4.subscriber = factory2.create(rTCConfiguration2, subscriberTransportObserver, null);
                            RTCEngine$configure$2$2$connectionStateListener$1 rTCEngine$configure$2$2$connectionStateListener$122 = new RTCEngine$configure$2$2$connectionStateListener$1(rTCEngine4);
                            if (livekitRtc$JoinResponse.getSubscriberPrimary()) {
                            }
                            g0.o(d0Var3);
                            DataChannel.Init init222 = new DataChannel.Init();
                            init222.ordered = true;
                            publisher = rTCEngine4.getPublisher();
                            if (publisher != null) {
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            aVar2 = aVar3;
                            aVar2.n(null);
                            throw th;
                        }
                    }
                } else {
                    aVar = (a) this.L$5;
                    ConnectOptions connectOptions2 = (ConnectOptions) this.L$4;
                    LivekitRtc$JoinResponse livekitRtc$JoinResponse3 = (LivekitRtc$JoinResponse) this.L$3;
                    rTCEngine2 = (RTCEngine) this.L$2;
                    rTCEngine = (RTCEngine) this.L$1;
                    d0 d0Var5 = (d0) this.L$0;
                    sn.a.g(obj);
                    connectOptions = connectOptions2;
                    livekitRtc$JoinResponse = livekitRtc$JoinResponse3;
                    d0Var = d0Var5;
                }
            } else {
                sn.a.g(obj);
                d0Var = (d0) this.L$0;
                aVar = this.this$0.configurationLock;
                rTCEngine = this.this$0;
                livekitRtc$JoinResponse = this.$joinResponse;
                connectOptions = this.$connectOptions;
                g0.o(d0Var);
                if (rTCEngine.getPublisher() != null) {
                    peerConnectionTransport = rTCEngine.subscriber;
                    if (peerConnectionTransport != null) {
                        return zVar;
                    }
                }
                this.L$0 = d0Var;
                this.L$1 = rTCEngine;
                this.L$2 = rTCEngine;
                this.L$3 = livekitRtc$JoinResponse;
                this.L$4 = connectOptions;
                this.L$5 = aVar;
                this.label = 1;
                if (aVar.a(this) != aVar6) {
                    rTCEngine2 = rTCEngine;
                }
                return aVar6;
            }
            g0.o(d0Var);
            if (rTCEngine.getPublisher() != null) {
                peerConnectionTransport2 = rTCEngine.subscriber;
                if (peerConnectionTransport2 != null) {
                    aVar.n(null);
                    return zVar;
                }
            }
            if (livekitRtc$JoinResponse.hasParticipant()) {
                str = livekitRtc$JoinResponse.getParticipant().getSid();
            } else {
                str = null;
            }
            rTCEngine2.participantSid = str;
            makeRTCConfig = rTCEngine2.makeRTCConfig(new Either.Left(livekitRtc$JoinResponse), connectOptions);
            PeerConnectionTransport publisher3 = rTCEngine2.getPublisher();
            if (publisher3 != null) {
                this.L$0 = d0Var;
                this.L$1 = rTCEngine2;
                this.L$2 = livekitRtc$JoinResponse;
                this.L$3 = aVar;
                this.L$4 = makeRTCConfig;
                this.L$5 = null;
                this.label = 2;
                if (publisher3.close(this) != aVar6) {
                    aVar3 = aVar;
                    rTCConfiguration = makeRTCConfig;
                    rTCEngine3 = rTCEngine2;
                    d0Var2 = d0Var;
                    d0Var = d0Var2;
                    factory = rTCEngine3.pctFactory;
                    publisherTransportObserver = rTCEngine3.publisherObserver;
                    publisherTransportObserver2 = rTCEngine3.publisherObserver;
                    rTCEngine3.setPublisher$livekit_android_sdk_release(factory.create(rTCConfiguration, publisherTransportObserver, publisherTransportObserver2));
                    peerConnectionTransport3 = rTCEngine3.subscriber;
                    if (peerConnectionTransport3 != null) {
                    }
                }
                return aVar6;
            }
            aVar3 = aVar;
            rTCConfiguration = makeRTCConfig;
            rTCEngine3 = rTCEngine2;
            factory = rTCEngine3.pctFactory;
            publisherTransportObserver = rTCEngine3.publisherObserver;
            publisherTransportObserver2 = rTCEngine3.publisherObserver;
            rTCEngine3.setPublisher$livekit_android_sdk_release(factory.create(rTCConfiguration, publisherTransportObserver, publisherTransportObserver2));
            peerConnectionTransport3 = rTCEngine3.subscriber;
            if (peerConnectionTransport3 != null) {
            }
        } catch (Throwable th5) {
            th = th5;
            aVar2 = aVar;
            aVar2.n(null);
            throw th;
        }
    }
}
