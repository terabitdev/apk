package io.livekit.android.room;

import android.os.SystemClock;
import com.google.protobuf.c6;
import et.d;
import fr.g0;
import fr.k1;
import ho.p;
import io.livekit.android.ConnectOptions;
import io.livekit.android.RoomOptions;
import io.livekit.android.events.DisconnectReason;
import io.livekit.android.room.RTCEngine;
import io.livekit.android.room.util.PeerConnectionStateObservableKt;
import io.livekit.android.util.Either;
import io.livekit.android.util.LKLog;
import io.livekit.android.util.LoggingLevel;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.d0;
import livekit.LivekitInternal$NodeStats;
import livekit.LivekitRtc$ReconnectResponse;
import livekit.org.webrtc.PeerConnection;
import sn.a;
import sn.m;
import sn.z;
import tn.n;
import wn.c;
import yn.e;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@e(c = "io.livekit.android.room.RTCEngine$reconnect$job$1", f = "RTCEngine.kt", l = {523, 531, 545, 567, 582, 626, 638, 641, 646}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class RTCEngine$reconnect$job$1 extends i implements p {
    final /* synthetic */ boolean $forceFullReconnect;
    final /* synthetic */ String $token;
    final /* synthetic */ d0 $url;
    int I$0;
    int I$1;
    int I$2;
    int I$3;
    long J$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ RTCEngine this$0;

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @e(c = "io.livekit.android.room.RTCEngine$reconnect$job$1$10", f = "RTCEngine.kt", l = {617}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: io.livekit.android.room.RTCEngine$reconnect$job$1$10, reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass10 extends i implements p {
        int label;
        final /* synthetic */ RTCEngine this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass10(RTCEngine rTCEngine, c<? super AnonymousClass10> cVar) {
            super(2, cVar);
            this.this$0 = rTCEngine;
        }

        @Override // yn.a
        public final c<z> create(Object obj, c<?> cVar) {
            return new AnonymousClass10(this.this$0, cVar);
        }

        @Override // ho.p
        public final Object invoke(fr.d0 d0Var, c<? super z> cVar) {
            return ((AnonymousClass10) create(d0Var, cVar)).invokeSuspend(z.f31622a);
        }

        @Override // yn.a
        public final Object invokeSuspend(Object obj) {
            PublisherTransportObserver publisherTransportObserver;
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 == 1) {
                    a.g(obj);
                } else {
                    c6.x("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            } else {
                a.g(obj);
                publisherTransportObserver = this.this$0.publisherObserver;
                this.label = 1;
                Object waitUntilConnected = PeerConnectionStateObservableKt.waitUntilConnected(publisherTransportObserver, this);
                xn.a aVar = xn.a.f37986a;
                if (waitUntilConnected == aVar) {
                    return aVar;
                }
            }
            return z.f31622a;
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @e(c = "io.livekit.android.room.RTCEngine$reconnect$job$1$11", f = "RTCEngine.kt", l = {628}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: io.livekit.android.room.RTCEngine$reconnect$job$1$11, reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass11 extends i implements p {
        final /* synthetic */ d0 $publisherWaitJob;
        final /* synthetic */ k1 $subscriberWaitJob;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass11(d0 d0Var, k1 k1Var, c<? super AnonymousClass11> cVar) {
            super(2, cVar);
            this.$publisherWaitJob = d0Var;
            this.$subscriberWaitJob = k1Var;
        }

        @Override // yn.a
        public final c<z> create(Object obj, c<?> cVar) {
            return new AnonymousClass11(this.$publisherWaitJob, this.$subscriberWaitJob, cVar);
        }

        @Override // ho.p
        public final Object invoke(fr.d0 d0Var, c<? super z> cVar) {
            return ((AnonymousClass11) create(d0Var, cVar)).invokeSuspend(z.f31622a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // yn.a
        public final Object invokeSuspend(Object obj) {
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 == 1) {
                    a.g(obj);
                } else {
                    c6.x("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            } else {
                a.g(obj);
                List F0 = n.F0(new k1[]{this.$publisherWaitJob.f20559a, this.$subscriberWaitJob});
                this.label = 1;
                Object A = g0.A(F0, this);
                xn.a aVar = xn.a.f37986a;
                if (A == aVar) {
                    return aVar;
                }
            }
            return z.f31622a;
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ReconnectType.values().length];
            try {
                iArr[ReconnectType.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ReconnectType.FORCE_SOFT_RECONNECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ReconnectType.FORCE_FULL_RECONNECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RTCEngine$reconnect$job$1(d0 d0Var, RTCEngine rTCEngine, boolean z6, String str, c<? super RTCEngine$reconnect$job$1> cVar) {
        super(2, cVar);
        this.$url = d0Var;
        this.this$0 = rTCEngine;
        this.$forceFullReconnect = z6;
        this.$token = str;
    }

    @Override // yn.a
    public final c<z> create(Object obj, c<?> cVar) {
        RTCEngine$reconnect$job$1 rTCEngine$reconnect$job$1 = new RTCEngine$reconnect$job$1(this.$url, this.this$0, this.$forceFullReconnect, this.$token, cVar);
        rTCEngine$reconnect$job$1.L$0 = obj;
        return rTCEngine$reconnect$job$1;
    }

    @Override // ho.p
    public final Object invoke(fr.d0 d0Var, c<? super z> cVar) {
        return ((RTCEngine$reconnect$job$1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:88|(1:92)|(1:161)(3:94|(1:96)|97)|98|99|100|(2:153|154)|102|(2:104|105)|106|107|108|109|(4:111|112|113|(0)(0))) */
    /* JADX WARN: Can't wrap try/catch for region: R(8:(3:163|(1:165)|166)|167|(1:171)|172|(1:174)|175|176|(14:178|179|180|(5:182|(1:184)|185|(1:187)|188)(1:202)|189|190|(1:194)|195|(1:197)|198|(1:200)|201|113|(2:115|(1:119))(4:120|(1:122)(1:142)|123|(3:125|126|(5:133|(9:135|(2:137|(1:139)(1:141))|(1:231)|10|(1:12)|13|(3:(1:16)(1:21)|17|18)|7|8)|27|28|(5:30|31|32|33|(0)))(2:128|(1:132)))))) */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x04dd, code lost:
    
        if (r6 == r13) goto L230;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x02df, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x02e0, code lost:
    
        r1 = r7;
        r2 = r8;
        r7 = r11;
        r4 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x02e5, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x02e6, code lost:
    
        r12 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x053a, code lost:
    
        if (r1.onPostReconnect(r10, r32) == r13) goto L230;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x0552, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x0553, code lost:
    
        r16 = r6;
        r6 = null;
        r1 = r7;
        r2 = r8;
        r7 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x020d, code lost:
    
        if (r32.$forceFullReconnect == false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x0508, code lost:
    
        if (r1.m2528x959ac91f(r2, r32) == r13) goto L230;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x04ec, code lost:
    
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x04ec, code lost:
    
        if (r6 != false) goto L215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0160, code lost:
    
        if (fr.g0.T(r32) == r13) goto L230;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000e. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0430  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x048f  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0513  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x04ae  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0527  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0388 A[Catch: Exception -> 0x03a7, TryCatch #4 {Exception -> 0x03a7, blocks: (B:180:0x0382, B:182:0x0388, B:184:0x03a3, B:185:0x03ad, B:187:0x03b5, B:188:0x03b8, B:189:0x03c3), top: B:179:0x0382 }] */
    /* JADX WARN: Removed duplicated region for block: B:197:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x056a  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0599  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0233  */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v13, types: [wn.h, wn.c, fr.e0] */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r9v18, types: [kotlin.jvm.internal.d0, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:134:0x04b6 -> B:27:0x04ef). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:140:0x04dd -> B:23:0x04e0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:151:0x0304 -> B:31:0x0308). Please report as a decompilation issue!!! */
    @Override // yn.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        fr.d0 d0Var;
        long elapsedRealtime;
        int i10;
        int i11;
        int i12;
        d0 d0Var2;
        Object obj2;
        int i13;
        long j4;
        int i14;
        int i15;
        fr.d0 d0Var3;
        String str;
        int i16;
        fr.d0 d0Var4;
        int i17;
        long j10;
        int i18;
        int i19;
        String str2;
        Throwable th;
        ConnectOptions connectOptions;
        int i20;
        Object obj3;
        int i21;
        int i22;
        fr.d0 d0Var5;
        Integer num;
        String str3;
        RTCEngine.Listener listener;
        String str4;
        int i23;
        Either either;
        Integer num2;
        RTCEngine.Listener listener2;
        boolean z6;
        PeerConnection.RTCConfiguration makeRTCConfig;
        PeerConnectionTransport peerConnectionTransport;
        boolean z10;
        boolean z11;
        boolean z12;
        Object isConnected;
        boolean z13;
        boolean z14;
        int i24;
        ?? r15;
        int i25;
        ConnectOptions connectOptions2;
        ConnectOptions connectOptions3;
        PeerConnectionTransport peerConnectionTransport2;
        String str5;
        int i26;
        RoomOptions roomOptions;
        boolean z15;
        Object obj4;
        String str6;
        RegionUrlProvider regionUrlProvider;
        RTCEngine.Listener listener3;
        boolean z16;
        int i27 = this.label;
        String str7 = "Error during reconnection.";
        int i28 = 2;
        String str8 = "RTCEngine closed, aborting reconnection";
        int i29 = 1;
        int i30 = 0;
        Throwable th2 = null;
        xn.a aVar = xn.a.f37986a;
        switch (i27) {
            case 0:
                a.g(obj);
                d0Var = (fr.d0) this.L$0;
                elapsedRealtime = SystemClock.elapsedRealtime();
                i10 = 0;
                i11 = 0;
                i12 = 0;
                if (i10 < 10) {
                    if (i10 != 0) {
                        d0Var2 = this.$url;
                        RegionUrlProvider regionUrlProvider2 = this.this$0.getRegionUrlProvider();
                        if (regionUrlProvider2 != null) {
                            this.L$0 = d0Var;
                            this.L$1 = d0Var2;
                            this.I$0 = i12;
                            this.I$1 = i11;
                            this.J$0 = elapsedRealtime;
                            this.I$2 = i10;
                            this.label = i29;
                            obj2 = regionUrlProvider2.getNextBestRegionUrl(this);
                            if (obj2 == aVar) {
                                return aVar;
                            }
                            str6 = (String) obj2;
                            if (str6 != null) {
                                d0Var2.f20559a = str6;
                            }
                        }
                        str6 = (String) this.$url.f20559a;
                        d0Var2.f20559a = str6;
                    }
                    i13 = i10;
                    j4 = elapsedRealtime;
                    i14 = i11;
                    i15 = i12;
                    d0Var3 = d0Var;
                    g0.o(d0Var3);
                    if (i13 != 0) {
                        this.L$0 = d0Var3;
                        this.L$1 = th2;
                        this.I$0 = i15;
                        this.I$1 = i14;
                        this.J$0 = j4;
                        this.I$2 = i13;
                        this.label = i28;
                        break;
                    }
                    z15 = this.this$0.isClosed;
                    if (z15) {
                        LKLog.Companion companion = LKLog.INSTANCE;
                        if (LoggingLevel.VERBOSE.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && d.d() > 0) {
                            d.e(th2, str8, new Object[i30]);
                        }
                    } else {
                        str = str8;
                        long j11 = i13;
                        long j12 = (j11 * j11 * 500) + 100;
                        if (j12 > 5000) {
                            j12 = 5000;
                        }
                        LKLog.Companion companion2 = LKLog.INSTANCE;
                        if (LoggingLevel.INFO.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && d.d() > 0) {
                            obj4 = null;
                            d.c(null, "Reconnecting to signal, attempt " + (i13 + 1), new Object[0]);
                        } else {
                            obj4 = null;
                        }
                        this.L$0 = d0Var3;
                        this.L$1 = obj4;
                        this.I$0 = i15;
                        this.I$1 = i14;
                        this.J$0 = j4;
                        this.I$2 = i13;
                        this.label = 3;
                        if (g0.m(j12, this) != aVar) {
                            j10 = j4;
                            i16 = i15;
                            d0Var4 = d0Var3;
                            i17 = i13;
                            i11 = i14;
                            i25 = WhenMappings.$EnumSwitchMapping$0[this.this$0.getReconnectType().ordinal()];
                            if (i25 != 1) {
                                if (i25 != 2) {
                                    if (i25 != 3) {
                                        c6.p();
                                        return null;
                                    }
                                    i20 = 1;
                                }
                                i20 = 0;
                            } else {
                                if (i17 == 0) {
                                    break;
                                }
                                i20 = 1;
                            }
                            connectOptions2 = this.this$0.connectOptions;
                            if (connectOptions2 != null) {
                                connectOptions3 = new ConnectOptions(false, null, null, false, false, null, 63, null);
                            } else {
                                connectOptions3 = connectOptions2;
                            }
                            if (i20 != 0) {
                                LKLog.Companion companion3 = LKLog.INSTANCE;
                                if (LoggingLevel.VERBOSE.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && d.d() > 0) {
                                    d.e(null, "Attempting full reconnect.", new Object[0]);
                                }
                                if (i11 == 0) {
                                    RTCEngine.Listener listener4 = this.this$0.getListener();
                                    if (listener4 != null) {
                                        listener4.onEngineReconnecting();
                                    }
                                    i26 = 1;
                                } else {
                                    i26 = i11;
                                }
                                this.this$0.setConnectionState(ConnectionState.RECONNECTING);
                                this.this$0.closeResources("Full Reconnecting");
                                RTCEngine.Listener listener5 = this.this$0.getListener();
                                if (listener5 != null) {
                                    try {
                                    } catch (Exception e10) {
                                        e = e10;
                                        i11 = i26;
                                        i19 = i17;
                                        elapsedRealtime = j10;
                                        i12 = i16;
                                        d0Var = d0Var4;
                                        LKLog.Companion companion4 = LKLog.INSTANCE;
                                        if (LoggingLevel.WARN.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0) {
                                        }
                                        str4 = str7;
                                        th = null;
                                        i23 = 0;
                                        i10 = i19 + 1;
                                        th2 = th;
                                        str8 = str;
                                        str7 = str4;
                                        i29 = 1;
                                        i30 = i23;
                                        i28 = 2;
                                        if (i10 < 10) {
                                        }
                                        this.this$0.close("Failed reconnecting");
                                        listener = this.this$0.getListener();
                                        if (listener != null) {
                                        }
                                        return z.f31622a;
                                    }
                                    listener5.onFullReconnecting();
                                }
                                RTCEngine rTCEngine = this.this$0;
                                Object obj5 = this.$url.f20559a;
                                obj5.getClass();
                                String str9 = (String) obj5;
                                String str10 = this.$token;
                                roomOptions = this.this$0.lastRoomOptions;
                                if (roomOptions == null) {
                                    roomOptions = new RoomOptions(false, false, null, null, null, null, null, null, null, 511, null);
                                }
                                this.L$0 = d0Var4;
                                this.I$0 = i16;
                                this.I$1 = i26;
                                this.J$0 = j10;
                                this.I$2 = i17;
                                this.I$3 = i20;
                                this.label = 4;
                                RoomOptions roomOptions2 = roomOptions;
                                int i31 = i26;
                                if (rTCEngine.joinImpl(str9, str10, connectOptions3, roomOptions2, this) != aVar) {
                                    i19 = i17;
                                    elapsedRealtime = j10;
                                    i12 = i16;
                                    i11 = i31;
                                    i18 = i20;
                                    d0Var = d0Var4;
                                    num2 = null;
                                    g0.o(d0Var);
                                    z13 = this.this$0.isClosed;
                                    if (!z13) {
                                    }
                                }
                            } else {
                                if (i16 == 0) {
                                    RTCEngine.Listener listener6 = this.this$0.getListener();
                                    if (listener6 != null) {
                                        listener6.onEngineResuming();
                                    }
                                    i16 = 1;
                                }
                                this.this$0.setConnectionState(ConnectionState.RESUMING);
                                LKLog.Companion companion5 = LKLog.INSTANCE;
                                if (LoggingLevel.VERBOSE.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && d.d() > 0) {
                                    d.e(null, "Attempting soft reconnect.", new Object[0]);
                                }
                                peerConnectionTransport2 = this.this$0.subscriber;
                                if (peerConnectionTransport2 != null) {
                                    peerConnectionTransport2.prepareForIceRestart();
                                }
                                SignalClient client = this.this$0.getClient();
                                Object obj6 = this.$url.f20559a;
                                obj6.getClass();
                                String str11 = this.$token;
                                str5 = this.this$0.participantSid;
                                this.L$0 = d0Var4;
                                this.L$1 = connectOptions3;
                                this.I$0 = i16;
                                this.I$1 = i11;
                                this.J$0 = j10;
                                this.I$2 = i17;
                                this.I$3 = i20;
                                ConnectOptions connectOptions4 = connectOptions3;
                                this.label = 5;
                                obj3 = client.reconnect((String) obj6, str11, str5, this);
                                if (obj3 != aVar) {
                                    i19 = i17;
                                    elapsedRealtime = j10;
                                    i12 = i16;
                                    connectOptions = connectOptions4;
                                    try {
                                    } catch (Exception e11) {
                                        e = e11;
                                        str2 = str7;
                                        th = null;
                                        LKLog.Companion companion6 = LKLog.INSTANCE;
                                        if (LoggingLevel.WARN.compareTo(LKLog.INSTANCE.getLoggingLevel()) < 0 && d.d() > 0) {
                                            i23 = 0;
                                            str4 = str2;
                                            d.f(e, str4, new Object[0]);
                                            d0Var = d0Var4;
                                        } else {
                                            str4 = str2;
                                            i23 = 0;
                                            d0Var = d0Var4;
                                        }
                                        i10 = i19 + 1;
                                        th2 = th;
                                        str8 = str;
                                        str7 = str4;
                                        i29 = 1;
                                        i30 = i23;
                                        i28 = 2;
                                        if (i10 < 10) {
                                        }
                                        this.this$0.close("Failed reconnecting");
                                        listener = this.this$0.getListener();
                                        if (listener != null) {
                                        }
                                        return z.f31622a;
                                    }
                                    either = (Either) obj3;
                                    if (!(either instanceof Either.Left)) {
                                        LivekitRtc$ReconnectResponse livekitRtc$ReconnectResponse = (LivekitRtc$ReconnectResponse) ((Either.Left) either).getValue();
                                        makeRTCConfig = this.this$0.makeRTCConfig(new Either.Right(livekitRtc$ReconnectResponse), connectOptions);
                                        peerConnectionTransport = this.this$0.subscriber;
                                        if (peerConnectionTransport != null) {
                                            peerConnectionTransport.updateRTCConfig(makeRTCConfig);
                                        }
                                        PeerConnectionTransport publisher = this.this$0.getPublisher();
                                        if (publisher != null) {
                                            publisher.updateRTCConfig(makeRTCConfig);
                                        }
                                        num2 = new Integer(livekitRtc$ReconnectResponse.getLastMessageSeq());
                                    } else {
                                        num2 = null;
                                    }
                                    this.this$0.getClient().onReadyForResponses();
                                    LKLog.Companion companion7 = LKLog.INSTANCE;
                                    if (LoggingLevel.VERBOSE.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && d.d() > 0) {
                                        d.e(null, "ws reconnected, restarting ICE", new Object[0]);
                                    }
                                    listener2 = this.this$0.getListener();
                                    if (listener2 != null) {
                                        listener2.onSignalConnected(true);
                                    }
                                    z6 = this.this$0.hasPublished;
                                    if (z6) {
                                        this.this$0.negotiatePublisher$livekit_android_sdk_release();
                                    }
                                    i18 = i20;
                                    d0Var = d0Var4;
                                    g0.o(d0Var);
                                    z13 = this.this$0.isClosed;
                                    if (!z13) {
                                        LKLog.Companion companion8 = LKLog.INSTANCE;
                                        if (LoggingLevel.VERBOSE.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && d.d() > 0) {
                                            d.e(null, str, new Object[0]);
                                        }
                                    } else {
                                        ?? obj7 = new Object();
                                        z14 = this.this$0.hasPublished;
                                        if (z14) {
                                            r15 = 0;
                                            i24 = 3;
                                            obj7.f20559a = g0.D(d0Var, null, null, new AnonymousClass10(this.this$0, null), 3);
                                        } else {
                                            i24 = 3;
                                            r15 = 0;
                                        }
                                        str3 = str7;
                                        AnonymousClass11 anonymousClass11 = new AnonymousClass11(obj7, g0.D(d0Var, r15, r15, new RTCEngine$reconnect$job$1$subscriberWaitJob$1(this.this$0, r15), i24), r15);
                                        this.L$0 = d0Var;
                                        this.L$1 = num2;
                                        this.I$0 = i12;
                                        this.I$1 = i11;
                                        this.J$0 = elapsedRealtime;
                                        this.I$2 = i19;
                                        this.I$3 = i18;
                                        this.label = 6;
                                        int i32 = i18;
                                        int i33 = i19;
                                        if (g0.S(20000L, anonymousClass11, this) != aVar) {
                                            fr.d0 d0Var6 = d0Var;
                                            i22 = i12;
                                            d0Var5 = d0Var6;
                                            i21 = i32;
                                            num = num2;
                                            i19 = i33;
                                            g0.o(d0Var5);
                                            z10 = this.this$0.isClosed;
                                            if (z10) {
                                                LKLog.Companion companion9 = LKLog.INSTANCE;
                                                if (LoggingLevel.VERBOSE.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && d.d() > 0) {
                                                    d.e(null, str, new Object[0]);
                                                }
                                            } else {
                                                if (this.this$0.getConnectionState() == ConnectionState.CONNECTED) {
                                                    z11 = this.this$0.hasPublished;
                                                    if (z11) {
                                                        PeerConnectionTransport publisher2 = this.this$0.getPublisher();
                                                        if (publisher2 != null) {
                                                            this.L$0 = d0Var5;
                                                            this.L$1 = num;
                                                            this.I$0 = i22;
                                                            this.I$1 = i11;
                                                            this.J$0 = elapsedRealtime;
                                                            this.I$2 = i19;
                                                            this.I$3 = i21;
                                                            this.label = 7;
                                                            isConnected = publisher2.isConnected(this);
                                                            break;
                                                        } else {
                                                            z12 = false;
                                                            break;
                                                        }
                                                    }
                                                    if (num != null) {
                                                        RTCEngine rTCEngine2 = this.this$0;
                                                        int intValue = num.intValue();
                                                        this.L$0 = null;
                                                        this.L$1 = null;
                                                        this.I$0 = i21;
                                                        this.label = 8;
                                                        break;
                                                    }
                                                    regionUrlProvider = this.this$0.getRegionUrlProvider();
                                                    if (regionUrlProvider != null) {
                                                        regionUrlProvider.clearAttemptedRegions();
                                                    }
                                                    this.this$0.getClient().onPCConnected();
                                                    listener3 = this.this$0.getListener();
                                                    if (listener3 != null) {
                                                        if (i21 != 0) {
                                                            z16 = true;
                                                        } else {
                                                            z16 = false;
                                                        }
                                                        this.L$0 = null;
                                                        this.L$1 = null;
                                                        this.label = 9;
                                                        break;
                                                    }
                                                    return z.f31622a;
                                                }
                                                th = null;
                                                if (SystemClock.elapsedRealtime() - elapsedRealtime <= 60000) {
                                                    int i34 = i22;
                                                    d0Var = d0Var5;
                                                    i12 = i34;
                                                    str4 = str3;
                                                    i23 = 0;
                                                    i10 = i19 + 1;
                                                    th2 = th;
                                                    str8 = str;
                                                    str7 = str4;
                                                    i29 = 1;
                                                    i30 = i23;
                                                    i28 = 2;
                                                    if (i10 < 10) {
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        return aVar;
                    }
                }
                this.this$0.close("Failed reconnecting");
                listener = this.this$0.getListener();
                if (listener != null) {
                    listener.onEngineDisconnected(DisconnectReason.UNKNOWN_REASON);
                }
                return z.f31622a;
            case 1:
                i10 = this.I$2;
                elapsedRealtime = this.J$0;
                i11 = this.I$1;
                i12 = this.I$0;
                d0Var2 = (d0) this.L$1;
                d0Var = (fr.d0) this.L$0;
                try {
                    a.g(obj);
                    obj2 = obj;
                } catch (Exception e12) {
                    LKLog.Companion companion10 = LKLog.INSTANCE;
                    if (LoggingLevel.DEBUG.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && d.d() > 0) {
                        d.a(e12, "Exception while getting next best region url while reconnecting.", new Object[i30]);
                    }
                }
                str6 = (String) obj2;
                if (str6 != null) {
                }
                str6 = (String) this.$url.f20559a;
                d0Var2.f20559a = str6;
                i13 = i10;
                j4 = elapsedRealtime;
                i14 = i11;
                i15 = i12;
                d0Var3 = d0Var;
                g0.o(d0Var3);
                if (i13 != 0) {
                }
                z15 = this.this$0.isClosed;
                if (z15) {
                }
                break;
            case 2:
                i13 = this.I$2;
                j4 = this.J$0;
                i14 = this.I$1;
                i15 = this.I$0;
                d0Var3 = (fr.d0) this.L$0;
                a.g(obj);
                z15 = this.this$0.isClosed;
                if (z15) {
                }
                break;
            case 3:
                int i35 = this.I$2;
                long j13 = this.J$0;
                i14 = this.I$1;
                int i36 = this.I$0;
                fr.d0 d0Var7 = (fr.d0) this.L$0;
                a.g(obj);
                str = "RTCEngine closed, aborting reconnection";
                i16 = i36;
                d0Var4 = d0Var7;
                i17 = i35;
                j10 = j13;
                i11 = i14;
                i25 = WhenMappings.$EnumSwitchMapping$0[this.this$0.getReconnectType().ordinal()];
                if (i25 != 1) {
                }
                connectOptions2 = this.this$0.connectOptions;
                if (connectOptions2 != null) {
                }
                if (i20 != 0) {
                }
                return aVar;
            case 4:
                i18 = this.I$3;
                i19 = this.I$2;
                elapsedRealtime = this.J$0;
                i11 = this.I$1;
                i12 = this.I$0;
                d0Var = (fr.d0) this.L$0;
                try {
                    a.g(obj);
                    str = "RTCEngine closed, aborting reconnection";
                } catch (Exception e13) {
                    e = e13;
                    str = "RTCEngine closed, aborting reconnection";
                    LKLog.Companion companion42 = LKLog.INSTANCE;
                    if (LoggingLevel.WARN.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0) {
                        d.f(e, str7, new Object[0]);
                        break;
                    }
                    str4 = str7;
                    th = null;
                    i23 = 0;
                    i10 = i19 + 1;
                    th2 = th;
                    str8 = str;
                    str7 = str4;
                    i29 = 1;
                    i30 = i23;
                    i28 = 2;
                    if (i10 < 10) {
                    }
                    this.this$0.close("Failed reconnecting");
                    listener = this.this$0.getListener();
                    if (listener != null) {
                    }
                    return z.f31622a;
                }
                num2 = null;
                g0.o(d0Var);
                z13 = this.this$0.isClosed;
                if (!z13) {
                }
                break;
            case 5:
                int i37 = this.I$3;
                i19 = this.I$2;
                elapsedRealtime = this.J$0;
                i11 = this.I$1;
                i12 = this.I$0;
                ConnectOptions connectOptions5 = (ConnectOptions) this.L$1;
                d0Var4 = (fr.d0) this.L$0;
                try {
                    a.g(obj);
                    str = "RTCEngine closed, aborting reconnection";
                    connectOptions = connectOptions5;
                    i20 = i37;
                    obj3 = obj;
                } catch (Exception e14) {
                    e = e14;
                    str2 = "Error during reconnection.";
                    str = "RTCEngine closed, aborting reconnection";
                    th = null;
                    LKLog.Companion companion62 = LKLog.INSTANCE;
                    if (LoggingLevel.WARN.compareTo(LKLog.INSTANCE.getLoggingLevel()) < 0) {
                        break;
                    }
                    str4 = str2;
                    i23 = 0;
                    d0Var = d0Var4;
                    i10 = i19 + 1;
                    th2 = th;
                    str8 = str;
                    str7 = str4;
                    i29 = 1;
                    i30 = i23;
                    i28 = 2;
                    if (i10 < 10) {
                    }
                    this.this$0.close("Failed reconnecting");
                    listener = this.this$0.getListener();
                    if (listener != null) {
                    }
                    return z.f31622a;
                }
                either = (Either) obj3;
                if (!(either instanceof Either.Left)) {
                }
                this.this$0.getClient().onReadyForResponses();
                LKLog.Companion companion72 = LKLog.INSTANCE;
                if (LoggingLevel.VERBOSE.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0) {
                    d.e(null, "ws reconnected, restarting ICE", new Object[0]);
                    break;
                }
                listener2 = this.this$0.getListener();
                if (listener2 != null) {
                }
                z6 = this.this$0.hasPublished;
                if (z6) {
                }
                i18 = i20;
                d0Var = d0Var4;
                g0.o(d0Var);
                z13 = this.this$0.isClosed;
                if (!z13) {
                }
                break;
            case 6:
                i21 = this.I$3;
                i19 = this.I$2;
                elapsedRealtime = this.J$0;
                i11 = this.I$1;
                int i38 = this.I$0;
                Integer num3 = (Integer) this.L$1;
                fr.d0 d0Var8 = (fr.d0) this.L$0;
                a.g(obj);
                i22 = i38;
                d0Var5 = d0Var8;
                num = num3;
                str3 = "Error during reconnection.";
                str = "RTCEngine closed, aborting reconnection";
                g0.o(d0Var5);
                z10 = this.this$0.isClosed;
                if (z10) {
                }
                break;
            case 7:
                i21 = this.I$3;
                i19 = this.I$2;
                elapsedRealtime = this.J$0;
                i11 = this.I$1;
                i22 = this.I$0;
                num = (Integer) this.L$1;
                d0Var5 = (fr.d0) this.L$0;
                a.g(obj);
                str3 = "Error during reconnection.";
                str = "RTCEngine closed, aborting reconnection";
                isConnected = obj;
                if (((Boolean) isConnected).booleanValue()) {
                    z12 = true;
                    break;
                }
                z12 = false;
                break;
            case 8:
                i21 = this.I$0;
                a.g(obj);
                ((m) obj).getClass();
                regionUrlProvider = this.this$0.getRegionUrlProvider();
                if (regionUrlProvider != null) {
                }
                this.this$0.getClient().onPCConnected();
                listener3 = this.this$0.getListener();
                if (listener3 != null) {
                }
                return z.f31622a;
            case 9:
                a.g(obj);
                return z.f31622a;
            default:
                c6.x("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
