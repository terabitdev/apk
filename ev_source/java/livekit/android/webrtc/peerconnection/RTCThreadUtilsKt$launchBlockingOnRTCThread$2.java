package io.livekit.android.webrtc.peerconnection;

import android.gov.nist.javax.sip.parser.TokenNames;
import com.google.protobuf.c6;
import fr.d0;
import fr.g0;
import fr.k0;
import ho.p;
import kotlin.Metadata;
import sn.a;
import sn.z;
import wn.c;
import yn.e;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@e(c = "io.livekit.android.webrtc.peerconnection.RTCThreadUtilsKt$launchBlockingOnRTCThread$2", f = "RTCThreadUtils.kt", l = {124, 132}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {TokenNames.T, "Lfr/d0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class RTCThreadUtilsKt$launchBlockingOnRTCThread$2 extends i implements p {
    final /* synthetic */ p $action;
    final /* synthetic */ RTCThreadToken $token;
    private /* synthetic */ Object L$0;
    int label;

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @e(c = "io.livekit.android.webrtc.peerconnection.RTCThreadUtilsKt$launchBlockingOnRTCThread$2$1", f = "RTCThreadUtils.kt", l = {130}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {TokenNames.T, "Lfr/d0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: io.livekit.android.webrtc.peerconnection.RTCThreadUtilsKt$launchBlockingOnRTCThread$2$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends i implements p {
        final /* synthetic */ p $action;
        final /* synthetic */ RTCThreadToken $token;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(RTCThreadToken rTCThreadToken, p pVar, c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$token = rTCThreadToken;
            this.$action = pVar;
        }

        @Override // yn.a
        public final c<z> create(Object obj, c<?> cVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$token, this.$action, cVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // ho.p
        public final Object invoke(d0 d0Var, c<? super T> cVar) {
            return ((AnonymousClass1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
        }

        @Override // yn.a
        public final Object invokeSuspend(Object obj) {
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 == 1) {
                    a.g(obj);
                    return obj;
                }
                c6.x("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            a.g(obj);
            d0 d0Var = (d0) this.L$0;
            if (this.$token.isDisposed()) {
                return null;
            }
            p pVar = this.$action;
            this.label = 1;
            Object invoke = pVar.invoke(d0Var, this);
            xn.a aVar = xn.a.f37986a;
            if (invoke == aVar) {
                return aVar;
            }
            return invoke;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RTCThreadUtilsKt$launchBlockingOnRTCThread$2(RTCThreadToken rTCThreadToken, p pVar, c<? super RTCThreadUtilsKt$launchBlockingOnRTCThread$2> cVar) {
        super(2, cVar);
        this.$token = rTCThreadToken;
        this.$action = pVar;
    }

    @Override // yn.a
    public final c<z> create(Object obj, c<?> cVar) {
        RTCThreadUtilsKt$launchBlockingOnRTCThread$2 rTCThreadUtilsKt$launchBlockingOnRTCThread$2 = new RTCThreadUtilsKt$launchBlockingOnRTCThread$2(this.$token, this.$action, cVar);
        rTCThreadUtilsKt$launchBlockingOnRTCThread$2.L$0 = obj;
        return rTCThreadUtilsKt$launchBlockingOnRTCThread$2;
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, c<? super T> cVar) {
        return ((RTCThreadUtilsKt$launchBlockingOnRTCThread$2) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        fr.z zVar;
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    a.g(obj);
                    return obj;
                }
                c6.x("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            a.g(obj);
            return obj;
        }
        a.g(obj);
        d0 d0Var = (d0) this.L$0;
        if (this.$token.isDisposed()) {
            return null;
        }
        boolean u6 = ib.i.u(RTCThreadUtilsKt.RTC_EXECUTOR_THREADNAME_PREFIX, false);
        xn.a aVar = xn.a.f37986a;
        if (!u6) {
            zVar = RTCThreadUtilsKt.rtcDispatcher;
            k0 g10 = g0.g(d0Var, zVar, new AnonymousClass1(this.$token, this.$action, null), 2);
            this.label = 2;
            Object s10 = g10.s(this);
            if (s10 != aVar) {
                return s10;
            }
        } else {
            p pVar = this.$action;
            this.label = 1;
            Object invoke = pVar.invoke(d0Var, this);
            if (invoke != aVar) {
                return invoke;
            }
        }
        return aVar;
    }
}
