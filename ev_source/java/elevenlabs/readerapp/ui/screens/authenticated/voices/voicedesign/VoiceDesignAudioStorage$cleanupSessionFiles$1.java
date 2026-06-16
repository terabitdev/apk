package io.elevenlabs.readerapp.ui.screens.authenticated.voices.voicedesign;

import com.google.protobuf.c6;
import fr.d0;
import ho.p;
import io.elevenlabs.domain.Logger;
import java.io.File;
import kotlin.Metadata;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.voices.voicedesign.VoiceDesignAudioStorage$cleanupSessionFiles$1", f = "VoiceDesignAudioStorage.kt", l = {}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class VoiceDesignAudioStorage$cleanupSessionFiles$1 extends yn.i implements p {
    final /* synthetic */ String $sessionId;
    int label;
    final /* synthetic */ VoiceDesignAudioStorage this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceDesignAudioStorage$cleanupSessionFiles$1(VoiceDesignAudioStorage voiceDesignAudioStorage, String str, wn.c<? super VoiceDesignAudioStorage$cleanupSessionFiles$1> cVar) {
        super(2, cVar);
        this.this$0 = voiceDesignAudioStorage;
        this.$sessionId = str;
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        return new VoiceDesignAudioStorage$cleanupSessionFiles$1(this.this$0, this.$sessionId, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, wn.c<? super z> cVar) {
        return ((VoiceDesignAudioStorage$cleanupSessionFiles$1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        File sessionDirectory;
        Logger logger;
        Logger logger2;
        if (this.label == 0) {
            sn.a.g(obj);
            sessionDirectory = this.this$0.getSessionDirectory(this.$sessionId);
            if (sessionDirectory.exists()) {
                boolean h02 = eo.k.h0(sessionDirectory);
                VoiceDesignAudioStorage voiceDesignAudioStorage = this.this$0;
                if (h02) {
                    logger2 = voiceDesignAudioStorage.logger;
                    ib.i.r("Cleaned up session files for session ", this.$sessionId, logger2, VoiceDesignAudioStorage.TAG);
                } else {
                    logger = voiceDesignAudioStorage.logger;
                    Logger.logWarning$default(logger, VoiceDesignAudioStorage.TAG, defpackage.f.i("Failed to clean up session files for session ", this.$sessionId), null, 4, null);
                }
            }
            return z.f31622a;
        }
        c6.x("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
