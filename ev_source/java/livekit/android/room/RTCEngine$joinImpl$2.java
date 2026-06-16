package io.livekit.android.room;

import com.google.protobuf.c6;
import fr.d0;
import fr.g0;
import ho.p;
import io.livekit.android.ConnectOptions;
import io.livekit.android.RoomOptions;
import io.livekit.android.room.RTCEngine;
import kotlin.Metadata;
import livekit.LivekitRtc$JoinResponse;
import sn.z;
import wn.c;
import xn.a;
import yn.e;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@e(c = "io.livekit.android.room.RTCEngine$joinImpl$2", f = "RTCEngine.kt", l = {242, 251}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Llivekit/LivekitRtc$JoinResponse;", "<anonymous>", "(Lfr/d0;)Llivekit/LivekitRtc$JoinResponse;"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class RTCEngine$joinImpl$2 extends i implements p {
    final /* synthetic */ ConnectOptions $options;
    final /* synthetic */ RoomOptions $roomOptions;
    final /* synthetic */ String $token;
    final /* synthetic */ String $url;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ RTCEngine this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RTCEngine$joinImpl$2(RTCEngine rTCEngine, String str, String str2, ConnectOptions connectOptions, RoomOptions roomOptions, c<? super RTCEngine$joinImpl$2> cVar) {
        super(2, cVar);
        this.this$0 = rTCEngine;
        this.$url = str;
        this.$token = str2;
        this.$options = connectOptions;
        this.$roomOptions = roomOptions;
    }

    @Override // yn.a
    public final c<z> create(Object obj, c<?> cVar) {
        RTCEngine$joinImpl$2 rTCEngine$joinImpl$2 = new RTCEngine$joinImpl$2(this.this$0, this.$url, this.$token, this.$options, this.$roomOptions, cVar);
        rTCEngine$joinImpl$2.L$0 = obj;
        return rTCEngine$joinImpl$2;
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, c<? super LivekitRtc$JoinResponse> cVar) {
        return ((RTCEngine$joinImpl$2) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0056, code lost:
    
        if (r11 == r3) goto L24;
     */
    @Override // yn.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        d0 d0Var;
        RTCEngine$joinImpl$2 rTCEngine$joinImpl$2;
        Object configure;
        LivekitRtc$JoinResponse livekitRtc$JoinResponse;
        boolean z6;
        int i10 = this.label;
        a aVar = a.f37986a;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    livekitRtc$JoinResponse = (LivekitRtc$JoinResponse) this.L$0;
                    sn.a.g(obj);
                    rTCEngine$joinImpl$2 = this;
                    z6 = rTCEngine$joinImpl$2.this$0.isSubscriberPrimary;
                    if (z6 || livekitRtc$JoinResponse.getFastPublish()) {
                        rTCEngine$joinImpl$2.this$0.negotiatePublisher$livekit_android_sdk_release();
                    }
                    rTCEngine$joinImpl$2.this$0.getClient().onReadyForResponses();
                    return livekitRtc$JoinResponse;
                }
                c6.x("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            d0Var = (d0) this.L$0;
            sn.a.g(obj);
            rTCEngine$joinImpl$2 = this;
        } else {
            sn.a.g(obj);
            d0Var = (d0) this.L$0;
            if (this.this$0.getConnectionState() == ConnectionState.DISCONNECTED) {
                this.this$0.setConnectionState(ConnectionState.CONNECTING);
            }
            SignalClient client = this.this$0.getClient();
            String str = this.$url;
            String str2 = this.$token;
            ConnectOptions connectOptions = this.$options;
            RoomOptions roomOptions = this.$roomOptions;
            this.L$0 = d0Var;
            this.label = 1;
            rTCEngine$joinImpl$2 = this;
            obj = client.join(str, str2, connectOptions, roomOptions, rTCEngine$joinImpl$2);
        }
        LivekitRtc$JoinResponse livekitRtc$JoinResponse2 = (LivekitRtc$JoinResponse) obj;
        g0.o(d0Var);
        RTCEngine.Listener listener = rTCEngine$joinImpl$2.this$0.getListener();
        if (listener != null) {
            listener.onJoinResponse(livekitRtc$JoinResponse2);
        }
        rTCEngine$joinImpl$2.this$0.isClosed = false;
        RTCEngine.Listener listener2 = rTCEngine$joinImpl$2.this$0.getListener();
        if (listener2 != null) {
            listener2.onSignalConnected(false);
        }
        rTCEngine$joinImpl$2.this$0.isSubscriberPrimary = livekitRtc$JoinResponse2.getSubscriberPrimary();
        RTCEngine rTCEngine = rTCEngine$joinImpl$2.this$0;
        ConnectOptions connectOptions2 = rTCEngine$joinImpl$2.$options;
        rTCEngine$joinImpl$2.L$0 = livekitRtc$JoinResponse2;
        rTCEngine$joinImpl$2.label = 2;
        configure = rTCEngine.configure(livekitRtc$JoinResponse2, connectOptions2, this);
        if (configure != aVar) {
            livekitRtc$JoinResponse = livekitRtc$JoinResponse2;
            z6 = rTCEngine$joinImpl$2.this$0.isSubscriberPrimary;
            if (z6) {
            }
            rTCEngine$joinImpl$2.this$0.negotiatePublisher$livekit_android_sdk_release();
            rTCEngine$joinImpl$2.this$0.getClient().onReadyForResponses();
            return livekitRtc$JoinResponse;
        }
        return aVar;
    }
}
