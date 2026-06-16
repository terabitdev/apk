package io.elevenlabs.network;

import android.util.Log;
import com.google.protobuf.c6;
import fr.d0;
import ho.p;
import io.livekit.android.room.Room;
import io.livekit.android.room.participant.LocalParticipant;
import kotlin.Metadata;
import sn.a;
import sn.l;
import sn.m;
import sn.z;
import wn.c;
import yn.e;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@e(c = "io.elevenlabs.network.WebRTCConnection$sendMessage$1", f = "WebRTCConnection.kt", l = {159}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes3.dex */
public final class WebRTCConnection$sendMessage$1 extends i implements p {
    final /* synthetic */ byte[] $payload;
    int label;
    final /* synthetic */ WebRTCConnection this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebRTCConnection$sendMessage$1(WebRTCConnection webRTCConnection, byte[] bArr, c<? super WebRTCConnection$sendMessage$1> cVar) {
        super(2, cVar);
        this.this$0 = webRTCConnection;
        this.$payload = bArr;
    }

    @Override // yn.a
    public final c<z> create(Object obj, c<?> cVar) {
        return new WebRTCConnection$sendMessage$1(this.this$0, this.$payload, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, c<? super z> cVar) {
        return ((WebRTCConnection$sendMessage$1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        Room room;
        Object m2585publishDatayxL6bBk$default;
        String str;
        int i10 = this.label;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    a.g(obj);
                    m2585publishDatayxL6bBk$default = ((m) obj).f31603a;
                } else {
                    c6.x("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            } else {
                a.g(obj);
                room = this.this$0.room;
                LocalParticipant localParticipant = room.getLocalParticipant();
                byte[] bArr = this.$payload;
                this.label = 1;
                m2585publishDatayxL6bBk$default = LocalParticipant.m2585publishDatayxL6bBk$default(localParticipant, bArr, null, null, null, this, 14, null);
                xn.a aVar = xn.a.f37986a;
                if (m2585publishDatayxL6bBk$default == aVar) {
                    return aVar;
                }
            }
            if (m2585publishDatayxL6bBk$default instanceof l) {
                Throwable a10 = m.a(m2585publishDatayxL6bBk$default);
                if (a10 != null) {
                    str = a10.getMessage();
                } else {
                    str = null;
                }
                Log.d("WebRTCConnection", "publishData failed - " + str);
            }
        } catch (Exception e10) {
            android.gov.nist.javax.sip.header.a.y("publishData error - ", e10.getMessage(), "WebRTCConnection");
        }
        return z.f31622a;
    }
}
