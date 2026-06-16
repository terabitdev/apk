package io.elevenlabs.readerapp.ui.screens.authenticated.voices.voicedesign;

import com.google.protobuf.c6;
import fr.d0;
import ho.p;
import java.io.File;
import java.io.FileOutputStream;
import kotlin.Metadata;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.voices.voicedesign.VoiceDesignAudioStorage$savePreviewAudio$2", f = "VoiceDesignAudioStorage.kt", l = {}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class VoiceDesignAudioStorage$savePreviewAudio$2 extends yn.i implements p {
    final /* synthetic */ byte[] $audioBytes;
    final /* synthetic */ File $audioFile;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceDesignAudioStorage$savePreviewAudio$2(File file, byte[] bArr, wn.c<? super VoiceDesignAudioStorage$savePreviewAudio$2> cVar) {
        super(2, cVar);
        this.$audioFile = file;
        this.$audioBytes = bArr;
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        return new VoiceDesignAudioStorage$savePreviewAudio$2(this.$audioFile, this.$audioBytes, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, wn.c<? super z> cVar) {
        return ((VoiceDesignAudioStorage$savePreviewAudio$2) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            sn.a.g(obj);
            FileOutputStream fileOutputStream = new FileOutputStream(this.$audioFile);
            try {
                fileOutputStream.write(this.$audioBytes);
                fileOutputStream.close();
                return z.f31622a;
            } finally {
            }
        } else {
            c6.x("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }
}
