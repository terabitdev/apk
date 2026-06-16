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
import sn.a;
import sn.z;
import wn.c;
import yn.e;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@e(c = "io.livekit.android.room.RTCEngine$onAnswer$2", f = "RTCEngine.kt", l = {999}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class RTCEngine$onAnswer$2 extends i implements p {
    final /* synthetic */ SessionDescription $sessionDescription;
    int label;
    final /* synthetic */ RTCEngine this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RTCEngine$onAnswer$2(RTCEngine rTCEngine, SessionDescription sessionDescription, c<? super RTCEngine$onAnswer$2> cVar) {
        super(2, cVar);
        this.this$0 = rTCEngine;
        this.$sessionDescription = sessionDescription;
    }

    @Override // yn.a
    public final c<z> create(Object obj, c<?> cVar) {
        return new RTCEngine$onAnswer$2(this.this$0, this.$sessionDescription, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, c<? super z> cVar) {
        return ((RTCEngine$onAnswer$2) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        Either either;
        Either nullSafe;
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
            LKLog.Companion companion = LKLog.INSTANCE;
            SessionDescription sessionDescription = this.$sessionDescription;
            if (LoggingLevel.INFO.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && d.d() > 0) {
                d.c(null, sessionDescription.toString(), new Object[0]);
            }
            PeerConnectionTransport publisher = this.this$0.getPublisher();
            if (publisher != null) {
                SessionDescription sessionDescription2 = this.$sessionDescription;
                this.label = 1;
                obj = publisher.setRemoteDescription(sessionDescription2, this);
                xn.a aVar = xn.a.f37986a;
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                either = null;
                nullSafe = EitherKt.nullSafe(either);
                if (!(nullSafe instanceof Either.Left) && (nullSafe instanceof Either.Right)) {
                    LKLog.Companion companion2 = LKLog.INSTANCE;
                    if (LoggingLevel.ERROR.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && d.d() > 0) {
                        d.b(null, f.m(new StringBuilder("error setting remote description for answer: "), (String) ((Either.Right) nullSafe).getValue(), ' '), new Object[0]);
                    }
                }
                return z.f31622a;
            }
        }
        either = (Either) obj;
        nullSafe = EitherKt.nullSafe(either);
        if (!(nullSafe instanceof Either.Left)) {
            LKLog.Companion companion22 = LKLog.INSTANCE;
            if (LoggingLevel.ERROR.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0) {
                d.b(null, f.m(new StringBuilder("error setting remote description for answer: "), (String) ((Either.Right) nullSafe).getValue(), ' '), new Object[0]);
            }
        }
        return z.f31622a;
    }
}
