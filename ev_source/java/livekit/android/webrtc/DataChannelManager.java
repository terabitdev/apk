package io.livekit.android.webrtc;

import android.gov.nist.javax.sip.parser.TokenNames;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.protobuf.c6;
import io.livekit.android.coroutines.FlowExtKt;
import io.livekit.android.util.FlowDelegateKt;
import io.livekit.android.util.MutableStateFlowDelegate;
import io.livekit.android.webrtc.peerconnection.RTCThreadToken;
import io.livekit.android.webrtc.peerconnection.RTCThreadUtilsKt;
import ir.i;
import ir.j;
import ir.r;
import ir.w;
import ir.z1;
import kotlin.Metadata;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.p;
import kotlin.jvm.internal.q;
import livekit.LivekitInternal$NodeStats;
import livekit.org.webrtc.DataChannel;
import oo.u;
import p.n;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001:\u00015B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\n\u001a\u00020\tH\u0086@¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u000b¢\u0006\u0004\b\u0017\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0004\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR+\u0010'\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001f8G@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R+\u0010,\u001a\u00020\t2\u0006\u0010 \u001a\u00020\t8G@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b(\u0010\"\u001a\u0004\b)\u0010*\"\u0004\b+\u0010\u0010R;\u00104\u001a\n .*\u0004\u0018\u00010-0-2\u000e\u0010 \u001a\n .*\u0004\u0018\u00010-0-8G@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b/\u0010\"\u001a\u0004\b0\u00101\"\u0004\b2\u00103¨\u00066"}, d2 = {"Lio/livekit/android/webrtc/DataChannelManager;", "Llivekit/org/webrtc/DataChannel$Observer;", "Llivekit/org/webrtc/DataChannel;", "dataChannel", "dataMessageListener", "Lio/livekit/android/webrtc/peerconnection/RTCThreadToken;", "rtcThreadToken", "<init>", "(Llivekit/org/webrtc/DataChannel;Llivekit/org/webrtc/DataChannel$Observer;Lio/livekit/android/webrtc/peerconnection/RTCThreadToken;)V", "", "amount", "Lsn/z;", "waitForBufferedAmountLow", "(JLwn/c;)Ljava/lang/Object;", "previousAmount", "onBufferedAmountChange", "(J)V", "onStateChange", "()V", "Llivekit/org/webrtc/DataChannel$Buffer;", "buffer", "onMessage", "(Llivekit/org/webrtc/DataChannel$Buffer;)V", "dispose", "Llivekit/org/webrtc/DataChannel;", "getDataChannel", "()Llivekit/org/webrtc/DataChannel;", "Llivekit/org/webrtc/DataChannel$Observer;", "Lio/livekit/android/webrtc/peerconnection/RTCThreadToken;", "getRtcThreadToken", "()Lio/livekit/android/webrtc/peerconnection/RTCThreadToken;", "", "<set-?>", "disposed$delegate", "Lio/livekit/android/util/MutableStateFlowDelegate;", "getDisposed", "()Z", "setDisposed", "(Z)V", "disposed", "bufferedAmount$delegate", "getBufferedAmount", "()J", "setBufferedAmount", "bufferedAmount", "Llivekit/org/webrtc/DataChannel$State;", "kotlin.jvm.PlatformType", "state$delegate", "getState", "()Llivekit/org/webrtc/DataChannel$State;", "setState", "(Llivekit/org/webrtc/DataChannel$State;)V", RemoteConfigConstants.ResponseFieldKey.STATE, "Listener", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class DataChannelManager implements DataChannel.Observer {
    static final /* synthetic */ u[] $$delegatedProperties;

    /* renamed from: bufferedAmount$delegate, reason: from kotlin metadata */
    private final MutableStateFlowDelegate bufferedAmount;
    private final DataChannel dataChannel;
    private final DataChannel.Observer dataMessageListener;

    /* renamed from: disposed$delegate, reason: from kotlin metadata */
    private final MutableStateFlowDelegate disposed;
    private final RTCThreadToken rtcThreadToken;

    /* renamed from: state$delegate, reason: from kotlin metadata */
    private final MutableStateFlowDelegate state;

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J'\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H&¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\f\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH&¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lio/livekit/android/webrtc/DataChannelManager$Listener;", "", "Llivekit/org/webrtc/DataChannel;", "dataChannel", "", "newAmount", "previousAmount", "Lsn/z;", "onBufferedAmountChange", "(Llivekit/org/webrtc/DataChannel;JJ)V", "Llivekit/org/webrtc/DataChannel$State;", RemoteConfigConstants.ResponseFieldKey.STATE, "onStateChange", "(Llivekit/org/webrtc/DataChannel;Llivekit/org/webrtc/DataChannel$State;)V", "Llivekit/org/webrtc/DataChannel$Buffer;", "buffer", "onMessage", "(Llivekit/org/webrtc/DataChannel;Llivekit/org/webrtc/DataChannel$Buffer;)V", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public interface Listener {
        void onBufferedAmountChange(DataChannel dataChannel, long newAmount, long previousAmount);

        void onMessage(DataChannel dataChannel, DataChannel.Buffer buffer);

        void onStateChange(DataChannel dataChannel, DataChannel.State state);
    }

    static {
        q qVar = new q(DataChannelManager.class, "disposed", "getDisposed()Z", 0);
        f0 f0Var = e0.f20562a;
        $$delegatedProperties = new u[]{f0Var.e(qVar), n.l(DataChannelManager.class, "bufferedAmount", "getBufferedAmount()J", 0, f0Var), n.l(DataChannelManager.class, RemoteConfigConstants.ResponseFieldKey.STATE, "getState()Llivekit/org/webrtc/DataChannel$State;", 0, f0Var)};
    }

    public DataChannelManager(DataChannel dataChannel, DataChannel.Observer observer, RTCThreadToken rTCThreadToken) {
        dataChannel.getClass();
        observer.getClass();
        rTCThreadToken.getClass();
        this.dataChannel = dataChannel;
        this.dataMessageListener = observer;
        this.rtcThreadToken = rTCThreadToken;
        this.disposed = FlowDelegateKt.flowDelegate$default(Boolean.FALSE, null, 2, null);
        this.bufferedAmount = FlowDelegateKt.flowDelegate$default(0L, null, 2, null);
        this.state = FlowDelegateKt.flowDelegate$default(dataChannel.state(), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setBufferedAmount(long j4) {
        this.bufferedAmount.setValue(this, $$delegatedProperties[1], Long.valueOf(j4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setDisposed(boolean z6) {
        this.disposed.setValue(this, $$delegatedProperties[0], Boolean.valueOf(z6));
    }

    private final void setState(DataChannel.State state) {
        this.state.setValue(this, $$delegatedProperties[2], state);
    }

    public static /* synthetic */ Object waitForBufferedAmountLow$default(DataChannelManager dataChannelManager, long j4, wn.c cVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j4 = 15360;
        }
        return dataChannelManager.waitForBufferedAmountLow(j4, cVar);
    }

    public final void dispose() {
        synchronized (this) {
            if (getDisposed()) {
                return;
            }
            setDisposed(true);
            setBufferedAmount(0L);
            RTCThreadUtilsKt.executeOnRTCThread(this.rtcThreadToken, new DataChannelManager$dispose$2(this));
        }
    }

    public final long getBufferedAmount() {
        return ((Number) this.bufferedAmount.getValue(this, $$delegatedProperties[1])).longValue();
    }

    public final DataChannel getDataChannel() {
        return this.dataChannel;
    }

    public final boolean getDisposed() {
        return ((Boolean) this.disposed.getValue(this, $$delegatedProperties[0])).booleanValue();
    }

    public final RTCThreadToken getRtcThreadToken() {
        return this.rtcThreadToken;
    }

    public final DataChannel.State getState() {
        return (DataChannel.State) this.state.getValue(this, $$delegatedProperties[2]);
    }

    @Override // livekit.org.webrtc.DataChannel.Observer
    public void onBufferedAmountChange(long previousAmount) {
        setBufferedAmount(this.dataChannel.bufferedAmount());
    }

    @Override // livekit.org.webrtc.DataChannel.Observer
    public void onMessage(DataChannel.Buffer buffer) {
        buffer.getClass();
        this.dataMessageListener.onMessage(buffer);
    }

    @Override // livekit.org.webrtc.DataChannel.Observer
    public void onStateChange() {
        setState(this.dataChannel.state());
    }

    public final Object waitForBufferedAmountLow(long j4, wn.c<? super z> cVar) {
        final z1 flow = FlowDelegateKt.getFlow(new p(this) { // from class: io.livekit.android.webrtc.DataChannelManager$waitForBufferedAmountLow$signal$1
            @Override // kotlin.jvm.internal.p, oo.r
            public Object get() {
                return Boolean.valueOf(((DataChannelManager) this.receiver).getDisposed());
            }

            public void set(Object obj) {
                ((DataChannelManager) this.receiver).setDisposed(((Boolean) obj).booleanValue());
            }
        });
        Object k4 = r.k(new w(FlowExtKt.cancelOnSignal(FlowDelegateKt.getFlow(new p(this) { // from class: io.livekit.android.webrtc.DataChannelManager$waitForBufferedAmountLow$2
            @Override // kotlin.jvm.internal.p, oo.r
            public Object get() {
                return Long.valueOf(((DataChannelManager) this.receiver).getBufferedAmount());
            }

            public void set(Object obj) {
                ((DataChannelManager) this.receiver).setBufferedAmount(((Number) obj).longValue());
            }
        }), new i() { // from class: io.livekit.android.webrtc.DataChannelManager$waitForBufferedAmountLow$$inlined$map$1

            /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {TokenNames.T, TokenNames.R, "value", "Lsn/z;", "emit", "(Ljava/lang/Object;Lwn/c;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            /* renamed from: io.livekit.android.webrtc.DataChannelManager$waitForBufferedAmountLow$$inlined$map$1$2, reason: invalid class name */
            /* loaded from: classes4.dex */
            public static final class AnonymousClass2<T> implements j {
                final /* synthetic */ j $this_unsafeFlow;

                /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
                @yn.e(c = "io.livekit.android.webrtc.DataChannelManager$waitForBufferedAmountLow$$inlined$map$1$2", f = "DataChannelManager.kt", l = {223}, m = "emit")
                @Metadata(k = 3, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                /* renamed from: io.livekit.android.webrtc.DataChannelManager$waitForBufferedAmountLow$$inlined$map$1$2$1, reason: invalid class name */
                /* loaded from: classes4.dex */
                public static final class AnonymousClass1 extends yn.c {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(wn.c cVar) {
                        super(cVar);
                    }

                    @Override // yn.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(j jVar) {
                    this.$this_unsafeFlow = jVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
                @Override // ir.j
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, wn.c cVar) {
                    AnonymousClass1 anonymousClass1;
                    int i10;
                    z zVar;
                    if (cVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) cVar;
                        int i11 = anonymousClass1.label;
                        if ((i11 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i11 - Integer.MIN_VALUE;
                            Object obj2 = anonymousClass1.result;
                            i10 = anonymousClass1.label;
                            z zVar2 = z.f31622a;
                            if (i10 == 0) {
                                if (i10 == 1) {
                                    sn.a.g(obj2);
                                } else {
                                    c6.x("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                            } else {
                                sn.a.g(obj2);
                                j jVar = this.$this_unsafeFlow;
                                if (((Boolean) obj).booleanValue()) {
                                    zVar = zVar2;
                                } else {
                                    zVar = null;
                                }
                                anonymousClass1.label = 1;
                                Object emit = jVar.emit(zVar, anonymousClass1);
                                xn.a aVar = xn.a.f37986a;
                                if (emit == aVar) {
                                    return aVar;
                                }
                            }
                            return zVar2;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(cVar);
                    Object obj22 = anonymousClass1.result;
                    i10 = anonymousClass1.label;
                    z zVar22 = z.f31622a;
                    if (i10 == 0) {
                    }
                    return zVar22;
                }
            }

            @Override // ir.i
            public Object collect(j jVar, wn.c cVar2) {
                Object collect = i.this.collect(new AnonymousClass2(jVar), cVar2);
                if (collect == xn.a.f37986a) {
                    return collect;
                }
                return z.f31622a;
            }
        }), new DataChannelManager$waitForBufferedAmountLow$3(j4, null), 4), cVar);
        if (k4 == xn.a.f37986a) {
            return k4;
        }
        return z.f31622a;
    }
}
