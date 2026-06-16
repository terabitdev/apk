package io.elevenlabs.network;

import android.util.Log;
import com.google.protobuf.c6;
import fr.d0;
import fr.g0;
import ho.l;
import ho.p;
import io.elevenlabs.ConversationConfig;
import io.livekit.android.room.Room;
import io.livekit.android.room.participant.RemoteParticipant;
import ir.j1;
import kotlin.Metadata;
import sn.a;
import sn.z;
import t2.u;
import tn.o;
import wn.c;
import yn.e;
import yn.f;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@e(c = "io.elevenlabs.network.WebRTCConnection$startAudioLevelMonitoring$1", f = "WebRTCConnection.kt", l = {366}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes3.dex */
public final class WebRTCConnection$startAudioLevelMonitoring$1 extends i implements p {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ WebRTCConnection this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebRTCConnection$startAudioLevelMonitoring$1(WebRTCConnection webRTCConnection, c<? super WebRTCConnection$startAudioLevelMonitoring$1> cVar) {
        super(2, cVar);
        this.this$0 = webRTCConnection;
    }

    @Override // yn.a
    public final c<z> create(Object obj, c<?> cVar) {
        WebRTCConnection$startAudioLevelMonitoring$1 webRTCConnection$startAudioLevelMonitoring$1 = new WebRTCConnection$startAudioLevelMonitoring$1(this.this$0, cVar);
        webRTCConnection$startAudioLevelMonitoring$1.L$0 = obj;
        return webRTCConnection$startAudioLevelMonitoring$1;
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, c<? super z> cVar) {
        return ((WebRTCConnection$startAudioLevelMonitoring$1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        d0 d0Var;
        Room room;
        j1 j1Var;
        j1 j1Var2;
        ConversationConfig conversationConfig;
        l onAudioLevelChanged;
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                d0Var = (d0) this.L$0;
                a.g(obj);
            } else {
                c6.x("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            a.g(obj);
            d0Var = (d0) this.L$0;
        }
        while (g0.y(d0Var)) {
            try {
                room = this.this$0.room;
                RemoteParticipant remoteParticipant = (RemoteParticipant) o.x0(room.getRemoteParticipants().values());
                if (remoteParticipant == null) {
                    j1Var = this.this$0._audioLevel;
                    j1Var.setValue(new Float(u.P));
                } else {
                    float audioLevel = remoteParticipant.getAudioLevel();
                    j1Var2 = this.this$0._audioLevel;
                    j1Var2.setValue(new Float(audioLevel));
                    try {
                        conversationConfig = this.this$0.latestConfig;
                        if (conversationConfig != null && (onAudioLevelChanged = conversationConfig.getOnAudioLevelChanged()) != null) {
                            onAudioLevelChanged.invoke(new Float(audioLevel));
                        }
                    } catch (Throwable th) {
                        f.b(Log.d("WebRTCConnection", "onAudioLevelChanged callback threw: " + th.getMessage()));
                    }
                }
            } catch (Exception e10) {
                f.b(Log.d("WebRTCConnection", "Error reading audio level: " + e10.getMessage()));
            }
            this.L$0 = d0Var;
            this.label = 1;
            Object m10 = g0.m(50L, this);
            xn.a aVar = xn.a.f37986a;
            if (m10 == aVar) {
                return aVar;
            }
        }
        return z.f31622a;
    }
}
