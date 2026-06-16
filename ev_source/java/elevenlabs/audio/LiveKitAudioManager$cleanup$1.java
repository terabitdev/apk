package io.elevenlabs.audio;

import android.content.Context;
import com.google.protobuf.c6;
import fr.d0;
import ho.p;
import kotlin.Metadata;
import sn.z;
import wn.c;
import yn.e;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@e(c = "io.elevenlabs.audio.LiveKitAudioManager$cleanup$1", f = "LiveKitAudioManager.kt", l = {170, 171}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes3.dex */
public final class LiveKitAudioManager$cleanup$1 extends i implements p {
    int label;
    final /* synthetic */ LiveKitAudioManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveKitAudioManager$cleanup$1(LiveKitAudioManager liveKitAudioManager, c<? super LiveKitAudioManager$cleanup$1> cVar) {
        super(2, cVar);
        this.this$0 = liveKitAudioManager;
    }

    @Override // yn.a
    public final c<z> create(Object obj, c<?> cVar) {
        return new LiveKitAudioManager$cleanup$1(this.this$0, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, c<? super z> cVar) {
        return ((LiveKitAudioManager$cleanup$1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0033, code lost:
    
        if (r5.stopPlayback(r4) == r3) goto L20;
     */
    @Override // yn.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Context context;
        int i10 = this.label;
        xn.a aVar = xn.a.f37986a;
        try {
        } catch (Exception e10) {
            android.gov.nist.javax.sip.header.a.s("Error during audio cleanup: ", e10.getMessage(), "LiveKitAudioManager");
        }
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    sn.a.g(obj);
                    AudioUtils audioUtils = AudioUtils.INSTANCE;
                    context = this.this$0.context;
                    audioUtils.resetAudioSession(context);
                    return z.f31622a;
                }
                c6.x("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            sn.a.g(obj);
        } else {
            sn.a.g(obj);
            LiveKitAudioManager liveKitAudioManager = this.this$0;
            this.label = 1;
            if (liveKitAudioManager.stopRecording(this) == aVar) {
                return aVar;
            }
        }
        LiveKitAudioManager liveKitAudioManager2 = this.this$0;
        this.label = 2;
    }
}
